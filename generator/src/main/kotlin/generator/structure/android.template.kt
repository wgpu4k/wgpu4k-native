package generator.structure

import builder.Builder
import builder.templateBuilder
import converter.variableType
import domain.NativeModel
import domain.toFunctionKotlinType

fun NativeModel.Structure.toAndroidStructure() = templateBuilder {
    val structureName = name
    val structureSize = size ?: error("structure size should be know at this point")
    appendBlock("actual interface $structureName") {
        toAndroidImplementation(this@toAndroidStructure, "ByReference")
        toAndroidImplementation(this@toAndroidStructure, "ByValue")

        newLine()
        appendLine("fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.${structureName}.ByValue(handle) }")
        appendLine("fun toReference() = (this as ByReference).handle")

        newLine()
        members.forEach { (name, type, optional) ->
            appendLine("actual ${type.variableType()} $name: ${type.toFunctionKotlinType()}$optional")
        }

        appendLine("actual val handler: NativeAddress")
        newLine()
        appendBlock("actual companion object") {
            appendBlock("actual operator fun invoke(address: NativeAddress): $structureName") {
                appendLine("return io.ygdrasil.wgpu.android.$structureName.ByReference(address)")
                appendLine("\t.also { it.read() }")
                appendLine("\t.let(::ByReference)")
            }
            newLine()
            appendBlock("actual fun allocate(allocator: MemoryAllocator): $structureName") {
                appendLine("return $structureName.ByReference()")
                appendLine("\t.also { allocator.register(it) }")
            }
            newLine()
            appendBlock("actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  $structureName) -> Unit): ArrayHolder<$structureName>") {
                appendLine("val array = io.ygdrasil.wgpu.android.$structureName.ByValue(allocator.allocate($structureSize * size.toLong())).toArray(size.toInt())")
                appendBlock("array.forEachIndexed", "index, structure") {
                    appendLine("(structure as io.ygdrasil.wgpu.android.$structureName.ByValue)") {
                        appendLine(".also { provider(index.toUInt(), $structureName.ByValue(it)) }")
                        appendLine(".write()")
                    }
                }
                appendLine("val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer")
                appendLine("return ArrayHolder(pointer)")
            }
        }

    }
    newLine()
}

private fun Builder.toAndroidImplementation(structure: NativeModel.Structure, name: String) {
    val structureName = structure.name
    newLine()
    appendBlock("class $name(val handle: io.ygdrasil.wgpu.android.$structureName.$name = io.ygdrasil.wgpu.android.$structureName.$name(com.sun.jna.Pointer.NULL)) : $structureName") {
        structure.members.forEach { (name, type, optional) ->

            appendLine("override ${type.variableType()} $name: ${type.toFunctionKotlinType()}$optional")
            // Getter
            when (type) {
                NativeModel.Void,
                NativeModel.Reference.OpaquePointer,
                    -> "handle.$name"

                NativeModel.Reference.CString -> "handle.$name?.let(::CString)"
                is NativeModel.Array -> "handle.$name?.let(::ArrayHolder)"
                is NativeModel.Reference.Callback -> "handle.$name?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }"
                NativeModel.Primitive.Float32,
                NativeModel.Primitive.Float64 -> "handle.$name"

                NativeModel.Primitive.Int64 -> "handle.$name"
                NativeModel.Primitive.Int32 -> "handle.$name"
                NativeModel.Primitive.Bool -> "handle.$name.toBoolean()"
                NativeModel.Primitive.UInt16 -> "handle.$name.toUShort()"
                NativeModel.Primitive.UInt64 -> "handle.$name.toULong()"
                is NativeModel.Reference.Enumeration,
                NativeModel.Primitive.UInt32 -> "handle.$name.toUInt()"

                is NativeModel.Reference.StructureField -> "handle.$name.let{ ${type.name}.ByValue(it) }"
                is NativeModel.Reference.Structure -> "handle.$name?.let{ ${type.name}.ByReference(it) }"
                is NativeModel.Reference -> "handle.$name?.let{ ${type.name}(it) }"
            }.let { appendLine("\tget() = $it") }

            // Setter
            when (type) {
                NativeModel.Void,
                NativeModel.Primitive.Float32,
                NativeModel.Primitive.Float64,
                NativeModel.Primitive.Int64,
                NativeModel.Primitive.Int32 -> "handle.$name = newValue"

                NativeModel.Primitive.UInt16 -> "handle.$name = newValue.toShort()"
                is NativeModel.Reference.Enumeration,
                NativeModel.Primitive.Bool,
                NativeModel.Primitive.UInt32 -> "handle.$name = newValue.toInt()"

                NativeModel.Primitive.UInt64 -> "handle.$name = newValue.toLong()"

                NativeModel.Reference.OpaquePointer -> "handle.$name = newValue"
                is NativeModel.Reference.Callback -> "handle.$name = newValue?.callback"
                NativeModel.Reference.CString,
                is NativeModel.Reference.Pointer,
                is NativeModel.Array -> "handle.$name = newValue?.handler"

                is NativeModel.Reference.Structure -> "handle.$name = (newValue as? ${type.name}.ByReference)?.handle"

                is NativeModel.Reference.StructureField -> null
            }?.let { appendLine("\tset(newValue) { $it }") }
            newLine()
        }

        appendLine("override val handler: NativeAddress")
        appendLine("\tget() {")
        appendLine("\t\thandle.write()")
        appendLine("\t\treturn handle.getPointer()")
        appendLine("\t}")

    }

}

