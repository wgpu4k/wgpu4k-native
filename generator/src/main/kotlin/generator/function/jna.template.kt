package generator.function

import builder.templateBuilder
import domain.NativeModel

fun List<NativeModel.Function>.toJnaFunctionsInterface() = templateBuilder {

    appendBlock("internal interface FunctionsInterface: com.sun.jna.Library") {
        forEach { function ->
            val name = function.name
            val returnType = function.returnType.first
            val returnTypeAsString = returnType.toAndroidNativeType()
            val args = function.args
                .map { (name, type) -> "${name}: ${type.toAndroidNativeType()}" }
                .joinToString(", ")

            appendLine("@Suppress(\"INAPPLICABLE_JVM_NAME\")")
            appendLine("@JvmName(\"${name}\")")
            appendLine("fun $name($args): $returnTypeAsString")
        }
    }

    appendLine("internal val Functions = com.sun.jna.Native.load(\"wgpu4k\", FunctionsInterface::class.java)")
}

internal fun NativeModel.Type.toAndroidNativeType(): String = when (this) {
    is NativeModel.Primitive.Int32 -> "Int"
    is NativeModel.Primitive.Int64 -> "Long"
    is NativeModel.Void -> "Unit"
    NativeModel.Primitive.Bool -> "UInt"
    NativeModel.Primitive.UInt64 -> "ULong"
    NativeModel.Primitive.Float64 -> "Double"
    NativeModel.Primitive.Float32 -> "Float"
    is NativeModel.Reference.Enumeration,
    NativeModel.Primitive.UInt32 -> "UInt"
    NativeModel.Primitive.UInt16 -> "UShort"
    is NativeModel.Reference.StructureField -> when (isOptional) {
        true -> "${name}.ByValue?"
        else -> "${name}.ByValue"
    }
    is NativeModel.Reference.Structure -> "${name}.ByReference?"
    is NativeModel.Reference.Callback -> "com.sun.jna.Callback?"
    is NativeModel.Array,
    NativeModel.Reference.CString,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer -> "com.sun.jna.Pointer?"
}