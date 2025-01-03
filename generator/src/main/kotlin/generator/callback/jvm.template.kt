package generator.callback

import builder.templateBuilder
import domain.NativeModel
import domain.toCallbackKotlinType
import domain.typeToJvmLayout

fun NativeModel.Callback.toJvmCallback() = templateBuilder {

    val jvmArgs = members
        .map { (name, type) -> "$name: ${type.toCallbackJvmType()}" }
        .joinToString(", ")

    appendBlock("actual fun interface ${name} : Callback") {
        val args = members
            .map { (name, type) -> "$name: ${type.toCallbackKotlinType()}" }
            .joinToString(", ")
        appendLine("actual fun invoke($args)")

        appendBlock("interface Function") {
            appendLine("fun apply($jvmArgs)")
        }

        appendBlock("actual companion object") {
            appendBlock("actual fun allocate(allocator: MemoryAllocator, callback: $name): CallbackHolder<$name>") {

                appendBlock("val function = object : Function") {
                    appendBlock("override fun apply($jvmArgs)") {
                        val argsCall = members
                            .map { (name, type) -> type.toArgCall(name) }
                            .joinToString(", ")
                        appendLine("callback.invoke($argsCall)")
                    }
                }

                appendLine("return java.lang.foreign.Linker.nativeLinker().upcallStub(")
                appendLine("\thandler.bindTo(function),")
                appendLine("\tdescriptor,")
                appendLine("\tallocator.arena")
                appendLine(").let(::NativeAddress)")
                appendLine("\t.let(::CallbackHolder)")

            }

            appendLine("private val descriptor: java.lang.foreign.FunctionDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(")
            members.forEach { (_, type) ->
                appendLine("\t${typeToJvmLayout(type)},")
            }
            appendLine(")")

            appendLine("private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(")
            appendLine("\tFunction::class.java,")
            appendLine("\t\"apply\",")
            appendLine("\tdescriptor")
            appendLine(")")
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

    NativeModel.Reference.OpaquePointer -> "$name.let(::NativeAddress)"

    is NativeModel.Array -> "$name.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let(::NativeAddress)?.let(::ArrayHolder)"
    is NativeModel.Reference.Callback -> "$name.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let(::NativeAddress)?.let(::CallbackHolder)"
    // Need to allocate a new MemorySegment, else on some OS, the session scope is close to early and cannot be used.
    is NativeModel.Reference -> "$name.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { ${this.name}(it) }"
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

    is NativeModel.Array,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    is NativeModel.Reference.StructureField -> "java.lang.foreign.MemorySegment"

    NativeModel.Void -> error("unsupported type here")
}
