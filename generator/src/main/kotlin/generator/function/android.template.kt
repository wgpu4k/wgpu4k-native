package generator.function

import builder.templateBuilder
import domain.NativeModel
import domain.toFunctionKotlinType


fun List<NativeModel.Function>.toAndroidFunctions() = templateBuilder {
    forEach { function ->
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
        appendLine("\t = io.ygdrasil.wgpu.android.Functions.$name($argsCall)")

        when (returnType) {
            is NativeModel.Reference.Enumeration,
            is NativeModel.Reference.OpaquePointer -> null
            is NativeModel.Reference.StructureField -> ".let(${returnType.name}::ByValue)"
            is NativeModel.Reference -> {
                "?.let(::${returnType.name})"
            }
            is NativeModel.Primitive.Bool -> ".toBoolean()"
            else -> null
        }?.let { appendLine("\t$it") }

        newLine()
    }
}


private fun NativeModel.Type.toJvmArgCall(name: String) = when(this) {
    is NativeModel.Primitive.Bool -> "$name.toUInt()"
    is NativeModel.Reference.StructureField -> when (isOptional) {
        true -> "$name?.toCValue()"
        else -> "${name}.toCValue()"
    }
    is NativeModel.Reference.Structure -> "${name}?.toReference()"
    is NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Enumeration -> name
    is NativeModel.Reference.Callback -> "$name?.callback"
    is NativeModel.Array,
    is NativeModel.Reference -> "$name?.handler"
    else -> name
}

internal fun NativeModel.Type.optionalReturnType(): String = when (this) {
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    is NativeModel.Array -> "?"
    else -> ""
}

internal fun NativeModel.Type.optional(): String = when (this) {
    NativeModel.Void,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    is NativeModel.Array -> "?"
    is NativeModel.Reference.StructureField -> when (isOptional) {
        true -> "?"
        else -> ""
    }
    else -> ""
}