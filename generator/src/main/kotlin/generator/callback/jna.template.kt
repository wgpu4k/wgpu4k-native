package generator.callback

import builder.templateBuilder
import domain.NativeModel
import domain.toCallbackKotlinType

fun NativeModel.Callback.toJnaCallback() = templateBuilder {
    val jvmArgs = members
        .map { (name, type) -> "$name: ${type.toCallbackJvmType()}" }
        .joinToString(", ")

    appendBlock("actual fun interface ${name} : Callback") {
        val args = members
            .map { (name, type) -> "$name: ${type.toCallbackKotlinType()}" }
            .joinToString(", ")
        appendLine("actual fun invoke($args)")

        appendBlock("interface Function : com.sun.jna.Callback") {
            appendLine("fun apply($jvmArgs)")
        }

        appendBlock("actual companion object") {
            appendBlock("actual fun allocate(allocator: MemoryAllocator, callback: $name): CallbackHolder<$name>") {

                appendBlock("val callbackFunction = object : Function") {
                    appendBlock("override fun apply($jvmArgs)") {
                        val argsCall = members
                            .map { (name, type) -> type.toArgCall(name) }
                            .joinToString(", ")
                        appendLine("callback.invoke($argsCall)")
                    }
                }

                appendLine("return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)")
            }
        }
    }
    newLine()
}

private fun NativeModel.Type.toArgCall(name: String): String = when (this) {
    NativeModel.Primitive.Bool,
    is NativeModel.Reference.Enumeration,
    NativeModel.Primitive.UInt32 -> "$name.toUInt()"
    NativeModel.Primitive.Float32,
    NativeModel.Primitive.Float64,
    NativeModel.Primitive.Int32,
    NativeModel.Primitive.Int64 -> name
    NativeModel.Primitive.UInt16 ->  "$name.toUShort()"
    NativeModel.Primitive.UInt64 ->  "$name.toULong()"

    NativeModel.Reference.OpaquePointer -> "$name ?: com.sun.jna.Pointer(0)"

    is NativeModel.Reference.StructureField -> "$name.let { ${this.name}.ByValue(it) }"
    is NativeModel.Array -> "$name?.let(::ArrayHolder)"
    is NativeModel.Reference.Callback -> "$name?.let(::CallbackHolder)"
    is NativeModel.Reference -> "$name?.let { ${this.name}(it) }"
    NativeModel.Void -> error("unsupported type here")
}


private fun NativeModel.Type.toCallbackJvmType(): String = when (this) {
    NativeModel.Primitive.Float32 -> "Float"
    NativeModel.Primitive.Float64 -> "Double"
    NativeModel.Primitive.UInt16 -> "Short"
    NativeModel.Primitive.UInt64,
    NativeModel.Primitive.Int64 -> "Long"

    NativeModel.Primitive.Bool,
    NativeModel.Primitive.Int32,
    NativeModel.Primitive.UInt32,
    is NativeModel.Reference.Enumeration -> "Int"

    is NativeModel.Reference.StructureField -> "io.ygdrasil.wgpu.android.${this.name}.ByValue"
    is NativeModel.Array,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure -> "com.sun.jna.Pointer?"

    NativeModel.Void -> error("unsupported type here")
}
