package generator.structure

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
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
import poet.ANDROID_WGPU_PACKAGE
import poet.ARRAY_HOLDER
import poet.JNA_PACKAGE
import poet.MEMORY_ALLOCATOR
import poet.NATIVE_ADDRESS
import poet.WGPU_PACKAGE
import poet.toCommonTypeName

fun List<NativeModel.Structure>.addAndroidStructuresTo(fileSpec: FileSpec.Builder) {
	forEach { fileSpec.addType(it.toAndroidTypeSpec()) }
}

private fun NativeModel.Structure.toAndroidTypeSpec(): TypeSpec {
	val structureName = name
	val structureSize = size ?: error("structure size should be known at this point")
	val selfClass = ClassName(WGPU_PACKAGE, structureName)
	val jnaByRefClass = ClassName(ANDROID_WGPU_PACKAGE, structureName, "ByReference")
	val jnaByValClass = ClassName(ANDROID_WGPU_PACKAGE, structureName, "ByValue")
	val arrayHolderOfSelf = ARRAY_HOLDER.parameterizedBy(selfClass)
	val jnaPointerClass = ClassName(JNA_PACKAGE, "Pointer")
	val providerType = LambdaTypeName.get(parameters = arrayOf(U_INT, selfClass), returnType = UNIT)

	val byReferenceSpec = buildAndroidImplTypeSpec("ByReference", jnaByRefClass, this)
	val byValueSpec = buildAndroidImplTypeSpec("ByValue", jnaByValClass, this)

	val toCValueFunc = FunSpec.builder("toCValue")
		.returns(jnaByValClass)
		.addCode(CodeBlock.of("return (this as ByReference).let{ %T(handle) }\n", jnaByValClass))
		.build()

	val toReferenceFunc = FunSpec.builder("toReference")
		.returns(jnaByRefClass)
		.addCode("return (this as ByReference).handle\n")
		.build()

	val invokeFunc = FunSpec.builder("invoke")
		.addModifiers(KModifier.ACTUAL, KModifier.OPERATOR)
		.addParameter("address", NATIVE_ADDRESS)
		.returns(selfClass)
		.addCode(
			CodeBlock.builder()
				.add("return %T(address)\n", jnaByRefClass)
				.add("\t.also { it.read() }\n")
				.add("\t.let(::ByReference)\n")
				.build()
		)
		.build()

	val allocateFunc = FunSpec.builder("allocate")
		.addModifiers(KModifier.ACTUAL)
		.addParameter("allocator", MEMORY_ALLOCATOR)
		.returns(selfClass)
		.addCode(
			"return $structureName.ByReference()\n\t.also { allocator.register(it) }\n"
		)
		.build()

	val allocateArrayFunc = FunSpec.builder("allocateArray")
		.addModifiers(KModifier.ACTUAL)
		.addParameter("allocator", MEMORY_ALLOCATOR)
		.addParameter("size", U_INT)
		.addParameter(ParameterSpec.builder("provider", providerType).build())
		.returns(arrayHolderOfSelf)
		.addCode(
			CodeBlock.builder()
				.add("val array = %T(allocator.allocate($structureSize * size.toLong())).toArray(size.toInt())\n", jnaByValClass)
				.add("array.forEachIndexed { index, structure ->\n")
				.add("\t(structure as %T)\n", jnaByValClass)
				.add("\t\t.also { provider(index.toUInt(), $structureName.ByValue(it)) }\n")
				.add("\t\t.write()\n")
				.add("}\n")
				.add("val pointer = if (size == 0u) %T.NULL else array.first().pointer\n", jnaPointerClass)
				.add("return ArrayHolder(pointer)\n")
				.build()
		)
		.build()

	val companion = TypeSpec.companionObjectBuilder()
		.addModifiers(KModifier.ACTUAL)
		.addFunction(invokeFunc)
		.addFunction(allocateFunc)
		.addFunction(allocateArrayFunc)
		.build()

	return TypeSpec.interfaceBuilder(structureName)
		.addModifiers(KModifier.ACTUAL)
		.addType(byReferenceSpec)
		.addType(byValueSpec)
		.addFunction(toCValueFunc)
		.addFunction(toReferenceFunc)
		.apply {
			members.forEach { member ->
				val memberType = member.type.toCommonTypeName()
					.let { t -> if (member.option == "?") t.copy(nullable = true) else t }
				val isMutable = member.type !is NativeModel.Reference.StructureField
				addProperty(
					PropertySpec.builder(member.name, memberType)
						.addModifiers(KModifier.ACTUAL)
						.mutable(isMutable)
						.build()
				)
			}
			addProperty(
				PropertySpec.builder("handler", NATIVE_ADDRESS)
					.addModifiers(KModifier.ACTUAL)
					.build()
			)
		}
		.addType(companion)
		.build()
}

private fun buildAndroidImplTypeSpec(
	implName: String,
	jnaClass: ClassName,
	structure: NativeModel.Structure
): TypeSpec {
	val structureName = structure.name
	val selfClass = ClassName(WGPU_PACKAGE, structureName)

	val handleParam = ParameterSpec.builder("handle", jnaClass)
		.defaultValue(CodeBlock.of("%T(%T.NULL)", jnaClass, ClassName("com.sun.jna", "Pointer")))
		.build()

	val handleProp = PropertySpec.builder("handle", jnaClass)
		.initializer("handle")
		.build()

	val props = structure.members.map { member ->
		val memberType = member.type.toCommonTypeName()
			.let { t -> if (member.option == "?") t.copy(nullable = true) else t }
		val isMutable = member.type !is NativeModel.Reference.StructureField
		val getter = FunSpec.getterBuilder().addCode(buildAndroidGetter(member.name, member.type)).build()
		val propBuilder = PropertySpec.builder(member.name, memberType)
			.addModifiers(KModifier.OVERRIDE)
			.mutable(isMutable)
			.getter(getter)
		if (isMutable) {
			val setterBody = buildAndroidSetter(member.name, member.type)
			if (setterBody.isNotBlank()) {
				propBuilder.setter(
					FunSpec.setterBuilder()
						.addParameter("newValue", memberType)
						.addCode(setterBody)
						.build()
				)
			}
		}
		propBuilder.build()
	}

	val handlerProp = PropertySpec.builder("handler", NATIVE_ADDRESS)
		.addModifiers(KModifier.OVERRIDE)
		.getter(
			FunSpec.getterBuilder()
				.addCode("handle.write()\nreturn handle.getPointer()\n")
				.build()
		)
		.build()

	return TypeSpec.classBuilder(implName)
		.primaryConstructor(
			FunSpec.constructorBuilder().addParameter(handleParam).build()
		)
		.addSuperinterface(selfClass)
		.addProperty(handleProp)
		.addProperties(props)
		.addProperty(handlerProp)
		.build()
}

private fun buildAndroidGetter(name: String, type: NativeModel.Type): String = when (type) {
	NativeModel.Void,
	NativeModel.Reference.OpaquePointer -> "return handle.$name\n"
	NativeModel.Reference.CString -> "return handle.$name?.let(::CString)\n"
	is NativeModel.Array -> "return handle.$name?.let(::ArrayHolder)\n"
	is NativeModel.Reference.Callback -> "return handle.$name?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }\n"
	NativeModel.Primitive.Float32,
	NativeModel.Primitive.Float64,
	NativeModel.Primitive.Int64,
	NativeModel.Primitive.Int32 -> "return handle.$name\n"
	NativeModel.Primitive.Bool -> "return handle.$name.toBoolean()\n"
	NativeModel.Primitive.UInt8 -> "return handle.$name.toUByte()\n"
	NativeModel.Primitive.UInt16 -> "return handle.$name.toUShort()\n"
	NativeModel.Primitive.UInt64 -> "return handle.$name.toULong()\n"
	is NativeModel.Reference.Enumeration,
	NativeModel.Primitive.UInt32 -> "return handle.$name.toUInt()\n"
	is NativeModel.Reference.StructureField -> "return handle.$name.let{ ${type.name}.ByValue(it) }\n"
	is NativeModel.Reference.Structure -> "return handle.$name?.let{ ${type.name}.ByReference(it) }\n"
	is NativeModel.Reference -> "return handle.$name?.let{ ${type.name}(it) }\n"
}

private fun buildAndroidSetter(name: String, type: NativeModel.Type): String = when (type) {
	NativeModel.Void,
	NativeModel.Primitive.Float32,
	NativeModel.Primitive.Float64,
	NativeModel.Primitive.Int64,
	NativeModel.Primitive.Int32 -> "handle.$name = newValue\n"
	NativeModel.Primitive.UInt8 -> "handle.$name = newValue.toByte()\n"
	NativeModel.Primitive.UInt16 -> "handle.$name = newValue.toShort()\n"
	is NativeModel.Reference.Enumeration,
	NativeModel.Primitive.Bool,
	NativeModel.Primitive.UInt32 -> "handle.$name = newValue.toInt()\n"
	NativeModel.Primitive.UInt64 -> "handle.$name = newValue.toLong()\n"
	NativeModel.Reference.OpaquePointer -> "handle.$name = newValue\n"
	is NativeModel.Reference.Callback -> "handle.$name = newValue?.callback\n"
	NativeModel.Reference.CString,
	is NativeModel.Reference.Pointer,
	is NativeModel.Array -> "handle.$name = newValue?.handler\n"
	is NativeModel.Reference.Structure -> "handle.$name = (newValue as? ${type.name}.ByReference)?.handle\n"
	is NativeModel.Reference.StructureField -> ""
}
