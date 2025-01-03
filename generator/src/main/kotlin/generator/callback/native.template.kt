package generator.callback

import builder.templateBuilder
import domain.NativeModel
import domain.toCallbackKotlinType
import domain.toFunctionKotlinType

fun NativeModel.Callback.toNativeCallback() = templateBuilder {
    val callbackName = name
    appendBlock("actual fun interface $callbackName : Callback") {
        val args = members
            .map { (name, type) -> "$name: ${type.toCallbackKotlinType()}" }
            .joinToString(", ")
        appendLine("actual fun invoke($args)")

        appendBlock("actual companion object") {
            appendBlock("actual fun allocate(allocator: MemoryAllocator, callback: $callbackName): CallbackHolder<$callbackName>") {
                val args = members
                    .map { (name, type) -> "$name: ${type.toNativeCallbackArg()}" }
                    .joinToString(", ")
                val argsCall = members
                    .map { (name, type) -> type.toNativeCallbackArgCall(name) }
                    .joinToString(", ")
                appendBlock("val actualCallback = kotlinx.cinterop.staticCFunction",  args) {
                    val lastArgName = members.last().first
                    appendLine("val address = $lastArgName?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error(\"Missing callback address on last argument\")")
                    appendLine("val callback = findCallback<$callbackName>(address.reinterpret<COpaque>())")
                    appendLine("\t?: error(\"Callback not found with address \$address and type $callbackName\")")
                    appendLine("callback.invoke($argsCall)")
                }

                appendLine("registerCallback(actualCallback, callback)")
                appendLine("return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)")
            }
        }
    }
    newLine()
}

private fun NativeModel.Type.toNativeCallbackArgCall(name: String): String = when (this) {
    is NativeModel.Reference.Enumeration,
    is NativeModel.Primitive -> name
    is NativeModel.Reference.StructureField -> "$name.let { ${this.name}.ByValue(it) }"
    is NativeModel.Reference.Pointer -> "$name?.let(::NativeAddress)?.let(::${this.name})"
    is NativeModel.Reference.Structure -> "$name?.let(::NativeAddress)?.let { ${this.name}(it) }"
    NativeModel.Reference.CString -> "$name?.let(::NativeAddress)?.let(::CString)"
    NativeModel.Void -> error("unsupported type")
    else -> "$name?.let(::NativeAddress)"
}

private fun NativeModel.Type.toNativeCallbackArg(): String = when (this) {
    is NativeModel.Primitive -> toFunctionKotlinType()
    is NativeModel.Reference.StructureField -> "kotlinx.cinterop.CValue<webgpu.native.$name>"
    is NativeModel.Reference.Enumeration -> "UInt"
    NativeModel.Void -> error("unsupported type")
    else -> "COpaquePointer?"
}