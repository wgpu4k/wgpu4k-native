package generator.function

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import domain.NativeModel
import poet.isNullableParam
import poet.isNullableReturnType
import poet.toCommonTypeName
import poet.toKotlinNativeTypeName

internal fun List<NativeModel.Function>.addJvmFunctionsTo(fileSpec: FileSpec.Builder) {
	forEach { fileSpec.addFunction(it.toJvmFunSpec()) }
}

internal fun List<NativeModel.Function>.addJvmFunctionsInterfaceTo(fileSpec: FileSpec.Builder) {
	val functionsObject = TypeSpec.objectBuilder("Functions")
		.apply {
			forEach { function ->
				addFunction(function.toJvmFunctionInterfaceSpec())
				function.toJvmHandlerPropertySpecs().forEach(::addProperty)
			}
		}
		.build()
	fileSpec.addType(functionsObject)
}

private fun NativeModel.Function.toJvmFunSpec(): FunSpec {
	val returnType = returnType.first
	val returnTypeName = returnType.toCommonTypeName()
		.let { if (returnType.isNullableReturnType()) it.copy(nullable = true) else it }
	val argsCall = args.map { (name, type) -> type.toJvmArgCall(name) }.joinToString(", ")

	val chain = when (returnType) {
		is NativeModel.Reference.Enumeration -> null
		is NativeModel.Reference.StructureField -> "\t\t.let(::NativeAddress).let(${returnType.name}::invoke)"
		is NativeModel.Reference.OpaquePointer -> "\t\t?.let(::NativeAddress)"
		is NativeModel.Reference -> "\t\t?.let(::NativeAddress)?.let(::${returnType.name})"
		is NativeModel.Primitive.Bool -> "\t\t.toBoolean()"
		else -> null
	}

	val body = buildString {
		append("\t = Functions.$name($argsCall)\n")
		chain?.let { append("$it\n") }
	}

	return FunSpec.builder(name)
		.addModifiers(KModifier.ACTUAL)
		.apply {
			args.forEach { (argName, type, _) ->
				val paramType = type.toCommonTypeName()
					.let { if (type.isNullableParam()) it.copy(nullable = true) else it }
				addParameter(argName, paramType)
			}
		}
		.returns(returnTypeName)
		.addCode(body)
		.build()
}

private fun NativeModel.Function.toJvmFunctionInterfaceSpec(): FunSpec {
	val returnType = returnType.first
	val returnTypeName = returnType.toKotlinNativeTypeName()
	val handlerCallArgs = args.map { (name, type) -> "$name${type.toJavaExtraConverter()}" }.joinToString(", ")
	val body = "return (${name}Handler.invokeExact($handlerCallArgs) as ${returnType.toJvmNativeType()})${returnType.toKotlinExtraConverter()}\n"

	return FunSpec.builder(name)
		.apply {
			args.forEach { (argName, type, _) ->
				addParameter(argName, type.toKotlinNativeTypeName())
			}
		}
		.returns(returnTypeName)
		.addCode(body)
		.build()
}

private fun NativeModel.Function.toJvmHandlerPropertySpecs(): List<PropertySpec> {
	val descInitializer = generateDescriptor()
	return listOf(
		PropertySpec.builder("${name}HandlerDescription", ClassName("java.lang.foreign", "FunctionDescriptor"))
			.addModifiers(KModifier.PRIVATE)
			.initializer(descInitializer)
			.build(),
		PropertySpec.builder("${name}HandlerAddress", ClassName("java.lang.foreign", "MemorySegment"))
			.addModifiers(KModifier.PRIVATE)
			.initializer("findOrThrow(%S)", name)
			.build(),
		PropertySpec.builder("${name}Handler", ClassName("java.lang.invoke", "MethodHandle"))
			.addModifiers(KModifier.PRIVATE)
			.initializer("Linker.nativeLinker().downcallHandle(${name}HandlerAddress, ${name}HandlerDescription)")
			.build(),
	)
}

private fun NativeModel.Type.toKotlinExtraConverter(): String = when (this) {
	NativeModel.Primitive.UInt16 -> ".toUShort()"
	is NativeModel.Reference.Enumeration,
	NativeModel.Primitive.Bool,
	NativeModel.Primitive.UInt32 -> ".toUInt()"
	NativeModel.Primitive.UInt64 -> ".toULong()"
	else -> ""
}

private fun NativeModel.Type.toJavaExtraConverter(): String = when (this) {
	NativeModel.Primitive.UInt16 -> ".toShort()"
	is NativeModel.Reference.Enumeration,
	NativeModel.Primitive.Bool,
	NativeModel.Primitive.UInt32 -> ".toInt()"
	NativeModel.Primitive.UInt64 -> ".toLong()"
	else -> ""
}

private fun NativeModel.Function.generateDescriptor(): String {
	val returnType = returnType.first
	return when (returnType) {
		is NativeModel.Void -> "FunctionDescriptor.ofVoid("
		else -> "FunctionDescriptor.of(\n\t\t\t${returnType.toJvmDescriptorType()},"
	}.let { "$it\n" } + (args.map { (_, type) -> "\t\t\t${type.toJvmDescriptorType()}" }
		.joinToString(",\n", postfix = "\n\t\t)"))
}

internal fun NativeModel.Type.toJvmDescriptorType(): String = when (this) {
	NativeModel.Primitive.Bool,
	NativeModel.Primitive.UInt32,
	is NativeModel.Reference.Enumeration,
	is NativeModel.Primitive.Int32 -> "C_INT"
	is NativeModel.Primitive.Int64,
	NativeModel.Primitive.UInt64 -> "C_LONG"
	NativeModel.Primitive.Float64 -> "C_DOUBLE"
	NativeModel.Primitive.Float32 -> "C_FLOAT"
	NativeModel.Primitive.UInt16 -> "C_SHORT"
	NativeModel.Primitive.UInt8 -> "C_BYTE"
	is NativeModel.Void,
	is NativeModel.Array,
	NativeModel.Reference.CString,
	is NativeModel.Reference.Callback,
	NativeModel.Reference.OpaquePointer,
	is NativeModel.Reference.Pointer,
	is NativeModel.Reference.Structure -> "C_POINTER"
	is NativeModel.Reference.StructureField -> "${name}.LAYOUT"
}

internal fun NativeModel.Type.toJvmNativeType(): String = when (this) {
	is NativeModel.Primitive.Int32 -> "Int"
	NativeModel.Primitive.UInt64,
	is NativeModel.Primitive.Int64 -> "Long"
	is NativeModel.Void -> "Unit"
	NativeModel.Primitive.Float64 -> "Double"
	NativeModel.Primitive.Float32 -> "Float"
	is NativeModel.Reference.Enumeration,
	NativeModel.Primitive.Bool,
	NativeModel.Primitive.UInt32 -> "Int"
	NativeModel.Primitive.UInt16 -> "Short"
	NativeModel.Primitive.UInt8 -> "Byte"
	is NativeModel.Array,
	NativeModel.Reference.CString,
	is NativeModel.Reference.Callback,
	NativeModel.Reference.OpaquePointer,
	is NativeModel.Reference.Pointer,
	is NativeModel.Reference.Structure,
	is NativeModel.Reference.StructureField -> "java.lang.foreign.MemorySegment"
}

internal fun NativeModel.Type.toKotlinNativeType(): String = when (this) {
	NativeModel.Primitive.UInt64 -> "ULong"
	is NativeModel.Reference.Enumeration,
	NativeModel.Primitive.Bool,
	NativeModel.Primitive.UInt32 -> "UInt"
	NativeModel.Primitive.UInt16 -> "UShort"
	else -> toJvmNativeType()
}

private fun NativeModel.Type.toJvmArgCall(name: String) = when (this) {
	is NativeModel.Primitive.Bool -> "$name.toUInt()"
	is NativeModel.Reference.OpaquePointer -> "$name.adapt() ?: java.lang.foreign.MemorySegment.NULL"
	is NativeModel.Reference.Enumeration -> name
	is NativeModel.Array,
	is NativeModel.Reference -> "$name?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL"
	else -> name
}
