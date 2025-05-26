package generator.function

import builder.Builder
import builder.templateBuilder
import domain.NativeModel
import domain.toFunctionKotlinType

internal fun List<NativeModel.Function>.toJvmFunctions() = templateBuilder {
    forEach { function -> toJvmFunction(function) }
}

internal fun List<NativeModel.Function>.toJvmFunctionsInterface() = templateBuilder {
    appendBlock("object Functions") {
        forEach { function -> toJvmFunctionInterface(function) }
    }
}


private fun Builder.toJvmFunction(function: NativeModel.Function) {
    val name = function.name
    val returnType = function.returnType.first
    val returnTypeAsString = returnType.toFunctionKotlinType() + returnType.optionalReturnType()
    val args = function.args
        .map { (name, type) -> "${name}: ${type.toFunctionKotlinType()}${type.optional()}" }
        .joinToString(", ")
    val argsCall = function.args
        .map { (name, type) -> type.toJvmArgCall(name) }
        .joinToString(", ")
    appendLine("actual fun $name($args): $returnTypeAsString")
    appendLine("\t = Functions.$name($argsCall)")

    when (returnType) {
        is NativeModel.Reference.Enumeration -> null
        is NativeModel.Reference.StructureField -> ".let(::NativeAddress).let(${returnType.name}::invoke)"
        is NativeModel.Reference.OpaquePointer -> "?.let(::NativeAddress)"
        is NativeModel.Reference -> {
            "?.let(::NativeAddress)?.let(::${returnType.name})"
        }
        is NativeModel.Primitive.Bool -> ".toBoolean()"
        else -> null
    }?.let { appendLine("\t\t$it") }

    newLine()
}


private fun Builder.toJvmFunctionInterface(function: NativeModel.Function) {
    val name = function.name
    val returnType = function.returnType.first
    val returnTypeAsString = returnType.toKotlinNativeType()
    val args = function.args
        .map { (name, type) -> "${name}: ${type.toKotlinNativeType()}" }
        .joinToString(", ")
    appendBlock("fun $name($args): $returnTypeAsString") {
        val handlerCallArgs = function.args
            .map { (name, type) -> "$name${type.toJavaExtraConverter()}" }
            .joinToString(", ")
        appendLine("return (${name}Handler.invokeExact($handlerCallArgs) as ${returnType.toJvmNativeType()})${returnType.toKotlinExtraConverter()}")
    }


    appendLine("private val ${name}HandlerDescription = ${function.generateDescriptor()}")
    appendLine("private val ${name}HandlerAddress = findOrThrow(\"$name\")")
    appendLine("private val ${name}Handler = Linker.nativeLinker().downcallHandle(${name}HandlerAddress, ${name}HandlerDescription)")
    newLine()
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

private fun NativeModel.Type.toJvmArgCall(name: String) = when(this) {
    is NativeModel.Primitive.Bool -> "$name.toUInt()"
    is NativeModel.Reference.OpaquePointer -> "$name.adapt() ?: java.lang.foreign.MemorySegment.NULL"
    is NativeModel.Reference.Enumeration -> name
    is NativeModel.Array,
    is NativeModel.Reference -> "$name?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL"
    else -> name
}
