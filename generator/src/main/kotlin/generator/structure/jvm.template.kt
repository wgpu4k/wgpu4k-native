package generator.structure

import builder.Builder
import builder.templateBuilder
import converter.variableType
import domain.NativeModel
import domain.toFunctionKotlinType
import domain.typeToJvmLayout

internal fun NativeModel.Structure.toJvmStructure() = templateBuilder {
    val structureName = name
    val structureSize = size ?: error("structure size should be know at this point")
    appendBlock("actual interface $structureName : CStructure") {

        toPanamaImplementation(this@toJvmStructure)
        newLine()
        members.forEach { (name, type, optional) ->
            appendLine("actual ${type.variableType()} $name: ${type.toFunctionKotlinType()}$optional")
        }
        newLine()
        appendBlock("actual companion object") {
            appendBlock("actual operator fun invoke(address: NativeAddress): $structureName") {
                appendLine("return ByReference(address)")
            }
            newLine()
            appendBlock("actual fun allocate(allocator: MemoryAllocator): $structureName") {
                appendLine("return allocator.allocate(${structureSize}L)")
                appendLine("\t.let { $structureName(it) }")
            }
            newLine()
            appendBlock("actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  $structureName) -> Unit): ArrayHolder<$structureName>") {
                appendLine("return allocator.allocate(${structureSize} * size.toLong())") {
                    appendBlock(".also") {
                        appendBlock("(0u until size).forEach", "index") {
                            appendLine("it.handler.asSlice(index.toLong() * ${structureSize}L)") {
                                appendLine(".let(::NativeAddress)")
                                appendLine(".let { $structureName(it) }")
                                appendLine(".let { provider(index, it) }")
                            }
                        }
                    }
                    appendLine(".let(::ArrayHolder)")
                }

            }

            newLine()
            // Generate layout
            appendLine("internal val LAYOUT = structLayout(")
            members.forEach { (name, type, _, _, _, padding) ->
                padding?.takeIf { it > 0 }
                    ?.let { "\tMemoryLayout.paddingLayout($it),"}
                    ?.let(::appendLine)
                typeToJvmLayout(type).let { "\t$it.withName(\"${name}\")," }
                    .let(::appendLine)
            }

            padding?.takeIf { it > 0 }
                ?.let { "\tMemoryLayout.paddingLayout($it)"}
                ?.let(::appendLine)
            appendLine(").withName(\"$structureName\")")
            newLine()

            // Write offset
            var offset = 0
            members.forEachIndexed { index, member ->
                offset += (member.padding ?: 0)
                appendLine("val ${member.name}Offset = ${offset}L")
                appendLine("val ${member.name}Layout = ${typeToJvmLayout(member.type)}")
                offset += (member.size ?: 0)
            }
        }
    }
}

private fun Builder.toPanamaImplementation(structure: NativeModel.Structure) {
    val structureName = structure.name
    newLine()
    appendLine("@JvmInline")
    appendBlock("value class ByReference(override val handler: NativeAddress) : $structureName") {
        structure.members.forEach { member ->
            val name = member.name
            val type = member.type
            val optional = member.option
            val variableType = type.variableType()
            appendLine("override $variableType $name: ${type.toFunctionKotlinType()}$optional")
            // Getter
            when (type) {
                NativeModel.Void,
                NativeModel.Reference.OpaquePointer,
                    -> "get(${name}Layout, ${name}Offset)"

                NativeModel.Reference.CString -> "get(${name}Layout, ${name}Offset).let(::CString)"
                is NativeModel.Array -> "get(${name}Layout, ${name}Offset).let(::ArrayHolder)"
                is NativeModel.Reference.Callback -> "get(${name}Layout, ${name}Offset).let(::CallbackHolder)"
                NativeModel.Primitive.Float32 -> "getFloat(${name}Offset)"
                NativeModel.Primitive.Float64 -> "getDouble(${name}Offset)"
                NativeModel.Primitive.Int64 -> "getLong(${name}Offset)"
                NativeModel.Primitive.UInt16 -> "getUShort(${name}Offset)"
                NativeModel.Primitive.UInt64 -> "getULong(${name}Offset)"
                NativeModel.Primitive.Bool -> "getInt(${name}Offset).toBoolean()"
                NativeModel.Primitive.Int32 -> "getInt(${name}Offset)"
                is NativeModel.Reference.Enumeration,
                NativeModel.Primitive.UInt32 -> "getUInt(${name}Offset)"
                is NativeModel.Reference.StructureField -> "handler.handler.asSlice(${name}Offset, ${member.size}L).let(::NativeAddress).let { ${type.name}(it) }"
                is NativeModel.Reference -> "get(${name}Layout, ${name}Offset).let { ${type.name}(it) }"
            }.let { appendLine("\tget() = $it") }

            // Setter
            when (type) {
                NativeModel.Void -> error("void is not allowed")
                is NativeModel.Reference.Enumeration,
                NativeModel.Primitive.Float32,
                NativeModel.Primitive.Float64,
                NativeModel.Primitive.Int64,
                NativeModel.Primitive.UInt16,
                NativeModel.Primitive.UInt64,
                NativeModel.Primitive.Bool,
                NativeModel.Primitive.Int32,
                NativeModel.Primitive.UInt32 -> "set(${name}Offset, newValue)"

                NativeModel.Reference.OpaquePointer -> "set(${name}Layout, ${name}Offset, newValue)"
                is NativeModel.Reference.Callback,
                NativeModel.Reference.CString,
                is NativeModel.Reference.Structure,
                is NativeModel.Array,
                is NativeModel.Reference.Pointer -> "set(${name}Layout, ${name}Offset, newValue?.handler)"

                is NativeModel.Reference.StructureField -> null
            }?.let { appendLine("\tset(newValue) = $it") }
        }
    }
}

