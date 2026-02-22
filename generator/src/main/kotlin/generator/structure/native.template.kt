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
import poet.ARRAY_HOLDER
import poet.CALLBACK_HOLDER
import poet.MEMORY_ALLOCATOR
import poet.NATIVE_ADDRESS
import poet.WGPU_PACKAGE
import poet.toCommonTypeName

internal fun List<NativeModel.Structure>.addNativeStructuresTo(fileSpec: FileSpec.Builder) {
	forEach { fileSpec.addType(it.toNativeTypeSpec()) }
	// Top-level adapt extension functions (outside any class)
	forEach { structure ->
		val adaptFunc = FunSpec.builder("adapt")
			.receiver(ClassName("webgpu.native", structure.name))
			.addParameter("structure", ClassName(WGPU_PACKAGE, structure.name))
			.addCode(structure.buildAdaptBody())
			.build()
		fileSpec.addFunction(adaptFunc)
	}
}

private fun NativeModel.Structure.toNativeTypeSpec(): TypeSpec {
	val structureName = name
	val selfClass = ClassName(WGPU_PACKAGE, structureName)
	val arrayHolderOfSelf = ARRAY_HOLDER.parameterizedBy(selfClass)
	val providerType = LambdaTypeName.get(parameters = arrayOf(U_INT, selfClass), returnType = UNIT)
	val nativeClass = ClassName("webgpu.native", structureName)

	val byValueSpec = buildNativeByValueTypeSpec(structureName)
	val byReferenceSpec = buildNativeByReferenceTypeSpec(structureName)

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
			append("return allocator.allocate(sizeOf<webgpu.native.$structureName>())\n")
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
			append("return allocator.allocate(sizeOf<webgpu.native.$structureName>() * size.toLong())\n")
			append("\t.also {\n")
			append("\t\t(0u until size).forEach { index ->\n")
			append("\t\t\t(it.rawValue + index.toLong() * sizeOf<webgpu.native.$structureName>())\n")
			append("\t\t\t\t.let(::NativeAddress)\n")
			append("\t\t\t\t.let { $structureName(it) }\n")
			append("\t\t\t\t.let { provider(index, it) }\n")
			append("\t\t}\n")
			append("\t}\n")
			append("\t.let(::ArrayHolder)\n")
		})
		.build()

	val toCValueFunc = FunSpec.builder("toCValue")
		.returns(ClassName("kotlinx.cinterop", "CValue").parameterizedBy(nativeClass))
		.addCode(buildToCValueBody(structureName))
		.build()

	val companion = TypeSpec.companionObjectBuilder()
		.addModifiers(KModifier.ACTUAL)
		.addFunction(invokeFunc)
		.addFunction(allocateFunc)
		.addFunction(allocateArrayFunc)
		.build()

	return TypeSpec.interfaceBuilder(structureName)
		.addModifiers(KModifier.ACTUAL)
		.addType(byValueSpec)
		.addType(byReferenceSpec)
		.apply {
			members.forEach { member ->
				val memberType = member.type.toCommonTypeName()
					.let { t -> if (member.option == "?") t.copy(nullable = true) else t }
				val isMutable = member.type !is NativeModel.Reference.StructureField
				addProperty(PropertySpec.builder(member.name, memberType).addModifiers(KModifier.ACTUAL).mutable(isMutable).build())
			}
			addProperty(PropertySpec.builder("handler", NATIVE_ADDRESS).addModifiers(KModifier.ACTUAL).build())
		}
		.addType(companion)
		.addFunction(toCValueFunc)
		.build()
}

private fun NativeModel.Structure.buildToCValueBody(structureName: String): String = buildString {
	append("return cValue<webgpu.native.$structureName> {\n")
	members.filter { it.type is NativeModel.Reference.StructureField }
		.forEach { (n, _, _) -> append("\t$n.adapt(this@$structureName.$n)\n") }
	members.filter { it.type !is NativeModel.Reference.StructureField }
		.forEach { (n, type, _) ->
			val adapter = when (type) {
				NativeModel.Reference.OpaquePointer -> "?.reinterpret()"
				is NativeModel.Reference.Pointer,
				is NativeModel.Reference.Structure,
				NativeModel.Reference.CString,
				is NativeModel.Reference.Callback,
				is NativeModel.Array -> "?.handler?.reinterpret()"
				NativeModel.Primitive.Bool -> ".toUInt()"
				else -> ""
			}
			append("\t$n = this@$structureName.$n$adapter\n")
		}
	append("}\n")
}

private fun NativeModel.Structure.buildAdaptBody(): String = buildString {
	members.filter { it.type is NativeModel.Reference.StructureField }
		.forEach { (n, _, _) -> append("$n.adapt(structure.$n)\n") }
	members.filter { it.type !is NativeModel.Reference.StructureField }
		.forEach { (n, type, _) ->
			val adapter = when (type) {
				NativeModel.Reference.OpaquePointer -> "?.reinterpret()"
				is NativeModel.Reference.Pointer,
				is NativeModel.Reference.Structure,
				NativeModel.Reference.CString,
				is NativeModel.Reference.Callback,
				is NativeModel.Array -> "?.handler?.reinterpret()"
				NativeModel.Primitive.Bool -> ".toUInt()"
				else -> ""
			}
			append("$n = structure.$n$adapter\n")
		}
}

private fun NativeModel.Structure.buildNativeByValueTypeSpec(structureName: String): TypeSpec {
	val selfClass = ClassName(WGPU_PACKAGE, structureName)
	val cValueType = ClassName("kotlinx.cinterop", "CValue")
		.parameterizedBy(ClassName("webgpu.native", structureName))

	val ctor = FunSpec.constructorBuilder()
		.addParameter("handle", cValueType)
		.build()

	val props = members.map { member ->
		val memberType = member.type.toCommonTypeName()
			.let { t -> if (member.option == "?") t.copy(nullable = true) else t }
		val isMutable = member.type !is NativeModel.Reference.StructureField
		val getter = FunSpec.getterBuilder()
			.addCode(buildNativeByValueGetter(member, structureName))
			.build()
		val propBuilder = PropertySpec.builder(member.name, memberType)
			.addModifiers(KModifier.OVERRIDE)
			.mutable(isMutable)
			.getter(getter)
		if (isMutable) {
			val setter = FunSpec.setterBuilder()
				.addParameter("newValue", memberType)
				.addCode(buildNativeByValueSetter(member))
				.build()
			propBuilder.setter(setter)
		}
		propBuilder.build()
	}

	val handlerProp = PropertySpec.builder("handler", NATIVE_ADDRESS)
		.addModifiers(KModifier.OVERRIDE)
		.getter(FunSpec.getterBuilder().addCode("error(\"should not be call on CValue\")\n").build())
		.build()

	return TypeSpec.classBuilder("ByValue")
		.addModifiers(KModifier.VALUE)
		.addAnnotation(AnnotationSpec.builder(ClassName("kotlin.jvm", "JvmInline")).build())
		.primaryConstructor(ctor)
		.addSuperinterface(selfClass)
		.addProperty(
			PropertySpec.builder("handle", cValueType)
				.initializer("handle")
				.build()
		)
		.addProperties(props)
		.addProperty(handlerProp)
		.build()
}

private fun buildNativeByValueGetter(member: NativeModel.StructureField, structureName: String): String {
	val name = member.name
	val type = member.type
	val acc = "handle.useContents { "
	return when (type) {
		is NativeModel.Reference.OpaquePointer ->
			"return $acc${name}?.let(::NativeAddress) }"
		is NativeModel.Reference.Enumeration ->
			"return $acc${name} ?: error(\"pointer of $structureName is null\") }"
		NativeModel.Primitive.Bool ->
			"return $acc${name}.toBoolean() ?: error(\"pointer of $structureName is null\") }"
		is NativeModel.Primitive ->
			"return $acc${name} ?: error(\"pointer of $structureName is null\") }"
		NativeModel.Reference.CString ->
			"return $acc${name}?.toCString() }"
		is NativeModel.Reference.Pointer ->
			"return $acc${name}?.let(::NativeAddress)?.let { ${type.name}(it) } }"
		is NativeModel.Reference.StructureField ->
			"return $acc${name}.rawPtr.toLong().let(::NativeAddress).let { ${type.name}(it) } }"
		is NativeModel.Reference.Structure ->
			"return $acc${name}?.let(::NativeAddress)?.let { ${type.name}(it) } }"
		is NativeModel.Reference.Callback ->
			"return $acc${name}?.let(::NativeAddress)?.let { CallbackHolder<${type.name}>(it) } }"
		is NativeModel.Array ->
			"return $acc${name}?.let(::NativeAddress)?.let { ArrayHolder<${type.subType.toFunctionKotlinType()}>(it) } }"
		NativeModel.Void -> error("void not allowed")
	}
}

private fun buildNativeByValueSetter(member: NativeModel.StructureField): String {
	val name = member.name
	val type = member.type
	val acc = "handle.useContents { "
	return when (type) {
		NativeModel.Reference.OpaquePointer ->
			"$acc${name} = newValue?.reinterpret() }\n"
		is NativeModel.Reference.Enumeration ->
			"$acc${name} = newValue }\n"
		NativeModel.Reference.CString ->
			"$acc${name} = newValue?.handler?.reinterpret() }\n"
		NativeModel.Primitive.Bool ->
			"$acc${name} = newValue.toUInt() }\n"
		is NativeModel.Primitive ->
			"$acc${name} = newValue }\n"
		is NativeModel.Reference.Pointer ->
			"$acc${name} = newValue?.handler?.reinterpret() }\n"
		is NativeModel.Reference.Structure ->
			"$acc${name} = newValue?.handler?.reinterpret() }\n"
		is NativeModel.Reference.Callback ->
			"$acc${name} = newValue?.handler?.reinterpret() }\n"
		is NativeModel.Array ->
			"$acc${name} = newValue?.handler?.reinterpret() }\n"
		is NativeModel.Reference.StructureField -> ""
		NativeModel.Void -> error("void not allowed")
	}
}

private fun NativeModel.Structure.buildNativeByReferenceTypeSpec(structureName: String): TypeSpec {
	val selfClass = ClassName(WGPU_PACKAGE, structureName)

	val ctor = FunSpec.constructorBuilder()
		.addParameter("handler", NATIVE_ADDRESS)
		.build()

	val props = members.map { member ->
		val memberType = member.type.toCommonTypeName()
			.let { t -> if (member.option == "?") t.copy(nullable = true) else t }
		val isMutable = member.type !is NativeModel.Reference.StructureField
		val getter = FunSpec.getterBuilder()
			.addCode(buildNativeByRefGetter(member, structureName))
			.build()
		val propBuilder = PropertySpec.builder(member.name, memberType)
			.addModifiers(KModifier.OVERRIDE)
			.mutable(isMutable)
			.getter(getter)
		if (isMutable) {
			val setter = FunSpec.setterBuilder()
				.addParameter("newValue", memberType)
				.addCode(buildNativeByRefSetter(member, structureName))
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

private fun buildNativeByRefGetter(member: NativeModel.StructureField, structureName: String): String {
	val name = member.name
	val type = member.type
	val acc = "handler.reinterpret<webgpu.native.$structureName>().pointed"
	return when (type) {
		NativeModel.Reference.OpaquePointer ->
			"return $acc.${name}?.let(::NativeAddress)\n"
		is NativeModel.Reference.Enumeration ->
			"return $acc.${name} ?: error(\"pointer of $structureName is null\")\n"
		NativeModel.Primitive.Bool ->
			"return $acc.${name}.toBoolean() ?: error(\"pointer of $structureName is null\")\n"
		is NativeModel.Primitive ->
			"return $acc.${name} ?: error(\"pointer of $structureName is null\")\n"
		NativeModel.Reference.CString ->
			"return $acc.${name}?.toCString()\n"
		is NativeModel.Reference.Pointer ->
			"return $acc.${name}?.let(::NativeAddress)?.let { ${type.name}(it) }\n"
		is NativeModel.Reference.StructureField ->
			"return $acc.${name}.rawPtr.toLong().let(::NativeAddress).let { ${type.name}(it) }\n"
		is NativeModel.Reference.Structure ->
			"return $acc.${name}?.let(::NativeAddress)?.let { ${type.name}(it) }\n"
		is NativeModel.Reference.Callback ->
			"return $acc.${name}?.let(::NativeAddress)?.let { CallbackHolder<${type.name}>(it) }\n"
		is NativeModel.Array ->
			"return $acc.${name}?.let(::NativeAddress)?.let { ArrayHolder<${type.subType.toFunctionKotlinType()}>(it) }\n"
		NativeModel.Void -> error("void not allowed")
	}
}

private fun buildNativeByRefSetter(member: NativeModel.StructureField, structureName: String): String {
	val name = member.name
	val type = member.type
	val acc = "handler.reinterpret<webgpu.native.$structureName>().pointed"
	return when (type) {
		NativeModel.Reference.OpaquePointer ->
			"$acc.let { it.$name = newValue?.reinterpret() }\n"
		is NativeModel.Reference.Enumeration ->
			"$acc.let { it.$name = newValue }\n"
		NativeModel.Reference.CString ->
			"$acc.let { it.$name = newValue?.handler?.reinterpret() }\n"
		NativeModel.Primitive.Bool ->
			"$acc.let { it.$name = newValue.toUInt() }\n"
		is NativeModel.Primitive ->
			"$acc.let { it.$name = newValue }\n"
		is NativeModel.Reference.Pointer ->
			"$acc.let { it.$name = newValue?.handler?.reinterpret() }\n"
		is NativeModel.Reference.Structure ->
			"$acc.let { it.$name = newValue?.handler?.reinterpret() }\n"
		is NativeModel.Reference.Callback ->
			"$acc.let { it.$name = newValue?.handler?.reinterpret() }\n"
		is NativeModel.Array ->
			"$acc.let { it.$name = newValue?.handler?.reinterpret() }\n"
		is NativeModel.Reference.StructureField -> ""
		NativeModel.Void -> error("void not allowed")
	}
}
