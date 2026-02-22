package generator.structure

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.UNIT
import domain.NativeModel
import domain.toFunctionKotlinType
import domain.typeToJvmLayout
import poet.ARRAY_HOLDER
import poet.MEMORY_ALLOCATOR
import poet.NATIVE_ADDRESS
import poet.WGPU_PACKAGE
import poet.toCommonTypeName

internal fun List<NativeModel.Structure>.addJvmStructuresTo(fileSpec: FileSpec.Builder) {
	forEach { fileSpec.addType(it.toJvmTypeSpec()) }
}

private fun NativeModel.Structure.toJvmTypeSpec(): TypeSpec {
	val structureName = name
	val structureSize = size ?: error("structure size should be known at this point")
	val selfClass = ClassName(WGPU_PACKAGE, structureName)
	val arrayHolderOfSelf = ARRAY_HOLDER.parameterizedBy(selfClass)
	val providerType = LambdaTypeName.get(parameters = arrayOf(U_INT, selfClass), returnType = UNIT)
	val cStructureInterface = ClassName("ffi", "CStructure")

	val byReferenceSpec = buildJvmByReferenceTypeSpec(structureName)

	val invokeFunc = FunSpec.builder("invoke")
		.addModifiers(KModifier.ACTUAL, KModifier.OPERATOR)
		.addParameter("address", NATIVE_ADDRESS)
		.returns(selfClass)
		.addCode("return ByReference(address)\n")
		.build()

	val allocateFunc = FunSpec.builder("allocate")
		.addModifiers(KModifier.ACTUAL)
		.addParameter("allocator", MEMORY_ALLOCATOR)
		.returns(selfClass)
		.addCode(buildString {
			append("return allocator.allocate(${structureSize}L)\n")
			append("\t.let { $structureName(it) }\n")
		})
		.build()

	val allocateArrayFunc = FunSpec.builder("allocateArray")
		.addModifiers(KModifier.ACTUAL)
		.addParameter("allocator", MEMORY_ALLOCATOR)
		.addParameter("size", U_INT)
		.addParameter(ParameterSpec.builder("provider", providerType).build())
		.returns(arrayHolderOfSelf)
		.addCode(buildString {
			append("return allocator.allocate(${structureSize} * size.toLong())\n")
			append("\t.also {\n")
			append("\t\t(0u until size).forEach { index ->\n")
			append("\t\t\tit.handler.asSlice(index.toLong() * ${structureSize}L)\n")
			append("\t\t\t\t.let(::NativeAddress)\n")
			append("\t\t\t\t.let { $structureName(it) }\n")
			append("\t\t\t\t.let { provider(index, it) }\n")
			append("\t\t}\n")
			append("\t}\n")
			append("\t.let(::ArrayHolder)\n")
		})
		.build()

	// LAYOUT property
	val layoutBody = buildString {
		append("structLayout(\n")
		members.forEach { (memberName, memberType, _, _, _, _, padding) ->
			padding?.takeIf { it > 0 }?.let { append("\tMemoryLayout.paddingLayout($it),\n") }
			append("\t${typeToJvmLayout(memberType)}.withName(\"$memberName\"),\n")
		}
		this@toJvmTypeSpec.padding?.takeIf { it > 0 }?.let { append("\tMemoryLayout.paddingLayout($it)\n") }
		append(").withName(\"$structureName\")")
	}
	val layoutProp = PropertySpec.builder(
		"LAYOUT",
		ClassName("java.lang.foreign", "GroupLayout")
	)
		.addModifiers(KModifier.INTERNAL)
		.initializer(layoutBody)
		.build()

	// Offset + layout properties per member
	val offsetProps = buildList {
		var offset = 0
		members.forEach { member ->
			offset += (member.padding ?: 0)
			add(
				PropertySpec.builder("${member.name}Offset", Long::class)
					.initializer("${offset}L")
					.build()
			)
			add(
				PropertySpec.builder("${member.name}Layout", ClassName("java.lang.foreign", "MemoryLayout"))
					.initializer(typeToJvmLayout(member.type))
					.build()
			)
			offset += (member.size ?: 0)
		}
	}

	val companion = TypeSpec.companionObjectBuilder()
		.addModifiers(KModifier.ACTUAL)
		.addFunction(invokeFunc)
		.addFunction(allocateFunc)
		.addFunction(allocateArrayFunc)
		.addProperty(layoutProp)
		.addProperties(offsetProps)
		.build()

	return TypeSpec.interfaceBuilder(structureName)
		.addModifiers(KModifier.ACTUAL)
		.addSuperinterface(cStructureInterface)
		.addType(byReferenceSpec)
		.apply {
			members.forEach { member ->
				val memberType = member.type.toCommonTypeName()
					.let { t -> if (member.option == "?") t.copy(nullable = true) else t }
				val isMutable = member.type !is NativeModel.Reference.StructureField
				addProperty(PropertySpec.builder(member.name, memberType).addModifiers(KModifier.ACTUAL).mutable(isMutable).build())
			}
		}
		.addType(companion)
		.build()
}

private fun NativeModel.Structure.buildJvmByReferenceTypeSpec(structureName: String): TypeSpec {
	val selfClass = ClassName(WGPU_PACKAGE, structureName)

	val ctor = FunSpec.constructorBuilder()
		.addParameter("handler", NATIVE_ADDRESS)
		.build()

	val props = members.map { member ->
		val memberType = member.type.toCommonTypeName()
			.let { t -> if (member.option == "?") t.copy(nullable = true) else t }
		val isMutable = member.type !is NativeModel.Reference.StructureField
		val getter = FunSpec.getterBuilder()
			.addCode(buildJvmByRefGetter(member, structureName))
			.build()
		val propBuilder = PropertySpec.builder(member.name, memberType)
			.addModifiers(KModifier.OVERRIDE)
			.mutable(isMutable)
			.getter(getter)
		if (isMutable) {
			val setter = FunSpec.setterBuilder()
				.addParameter("newValue", memberType)
				.addCode(buildJvmByRefSetter(member, structureName))
				.build()
			propBuilder.setter(setter)
		}
		propBuilder.build()
	}

	val handlerProp = PropertySpec.builder("handler", NATIVE_ADDRESS)
		.addModifiers(KModifier.OVERRIDE)
		.initializer("handler")
		.build()

	return TypeSpec.classBuilder("ByReference")
		.addModifiers(KModifier.VALUE)
		.addAnnotation(AnnotationSpec.builder(ClassName("kotlin.jvm", "JvmInline")).build())
		.primaryConstructor(ctor)
		.addSuperinterface(selfClass)
		.addProperty(handlerProp)
		.addProperties(props)
		.build()
}

private fun buildJvmByRefGetter(member: NativeModel.StructureField, structureName: String): String {
	val name = member.name
	val type = member.type
	return when (type) {
		NativeModel.Void -> error("void is not allowed")
		NativeModel.Reference.OpaquePointer ->
			"return get(${name}Layout, ${name}Offset)\n"
		NativeModel.Reference.CString ->
			"return get(${name}Layout, ${name}Offset).let(::CString)\n"
		is NativeModel.Array ->
			"return get(${name}Layout, ${name}Offset).let(::ArrayHolder)\n"
		is NativeModel.Reference.Callback ->
			"return get(${name}Layout, ${name}Offset).let(::CallbackHolder)\n"
		NativeModel.Primitive.Float32 ->
			"return getFloat(${name}Offset)\n"
		NativeModel.Primitive.Float64 ->
			"return getDouble(${name}Offset)\n"
		NativeModel.Primitive.Int64 ->
			"return getLong(${name}Offset)\n"
		NativeModel.Primitive.UInt8 ->
			"return getUByte(${name}Offset)\n"
		NativeModel.Primitive.UInt16 ->
			"return getUShort(${name}Offset)\n"
		NativeModel.Primitive.UInt64 ->
			"return getULong(${name}Offset)\n"
		NativeModel.Primitive.Bool ->
			"return getInt(${name}Offset).toBoolean()\n"
		NativeModel.Primitive.Int32 ->
			"return getInt(${name}Offset)\n"
		is NativeModel.Reference.Enumeration,
		NativeModel.Primitive.UInt32 ->
			"return getUInt(${name}Offset)\n"
		is NativeModel.Reference.StructureField ->
			"return handler.handler.asSlice(${name}Offset, ${member.size}L).let(::NativeAddress).let { ${type.name}(it) }\n"
		is NativeModel.Reference ->
			"return get(${name}Layout, ${name}Offset).let { ${type.name}(it) }\n"
	}
}

private fun buildJvmByRefSetter(member: NativeModel.StructureField, structureName: String): String {
	val name = member.name
	val type = member.type
	return when (type) {
		NativeModel.Void -> error("void is not allowed")
		is NativeModel.Reference.Enumeration,
		NativeModel.Primitive.Float32,
		NativeModel.Primitive.Float64,
		NativeModel.Primitive.Int64,
		NativeModel.Primitive.UInt8,
		NativeModel.Primitive.UInt16,
		NativeModel.Primitive.UInt64,
		NativeModel.Primitive.Bool,
		NativeModel.Primitive.Int32,
		NativeModel.Primitive.UInt32 -> "set(${name}Offset, newValue)\n"
		NativeModel.Reference.OpaquePointer -> "set(${name}Layout, ${name}Offset, newValue)\n"
		is NativeModel.Reference.Callback,
		NativeModel.Reference.CString,
		is NativeModel.Reference.Structure,
		is NativeModel.Array,
		is NativeModel.Reference.Pointer -> "set(${name}Layout, ${name}Offset, newValue?.handler)\n"
		is NativeModel.Reference.StructureField -> ""
	}
}
