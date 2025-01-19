package generator.callback

import builder.templateBuilder
import domain.NativeModel
import domain.toCallbackKotlinType

fun NativeModel.Callback.toCommonCallback() = templateBuilder {
    appendBlock("expect fun interface ${name} : Callback") {
        val args = members
            .map { (name, type) -> "$name: ${type.toCallbackKotlinType()}" }
            .joinToString(", ")
        appendLine("fun invoke($args)")

        appendBlock("companion object") {
            appendLine("fun allocate(allocator: MemoryAllocator, callback: $name): CallbackHolder<$name>")
        }
    }
    newLine()
}