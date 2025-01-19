package generator.structure

import builder.templateBuilder
import converter.toPrimitiveDefaultValue
import converter.toPrimitiveKotlinType
import domain.NativeModel


fun NativeModel.Structure.toJnaStructure() = templateBuilder {
    appendBlock("sealed class $name(pointer: com.sun.jna.Pointer? = null) : com.sun.jna.Structure(pointer)") {
        members.forEach { (name, type, _) ->
            appendLine("@JvmField var $name: ${type.toJnaType()}${type.toOptionalModifier()} = ${type.toDefaultValue()}")

        }

        appendLine("override fun getFieldOrder() = listOf(${members.map { (name, _, _) -> "\"$name\"" }.joinToString(", ")})")
        newLine()
        appendBlock("class ByReference(pointer: com.sun.jna.Pointer? = null) : ${name}(pointer), com.sun.jna.Structure.ByReference") {
            appendBlock("constructor(other: $name) : this(other.pointer)") {
                members.forEach { (name, _, _) ->
                    appendLine("this.$name = other.$name")
                }
            }
        }
        newLine()
        appendBlock("class ByValue(pointer: com.sun.jna.Pointer? = null) : ${name}(pointer), com.sun.jna.Structure.ByValue") {
            appendBlock("constructor(other: $name) : this(other.pointer)") {
                members.forEach { (name, _, _) ->
                    appendLine("this.$name = other.$name")
                }
            }
        }
    }
    newLine()
}

private fun NativeModel.Type.toDefaultValue(): String = when (this) {
    is NativeModel.Primitive.Bool -> "0"
    is NativeModel.Primitive.UInt64 -> "0L"
    is NativeModel.Reference.Enumeration,
    is NativeModel.Primitive.UInt32 -> "0"
    is NativeModel.Primitive.UInt16 -> "0"
    is NativeModel.Primitive -> toPrimitiveDefaultValue()
    is NativeModel.Reference.StructureField -> "${name}.ByValue()"
    //is CLibraryModel.Reference.Callback -> TODO()
    else -> "null"
}

private fun NativeModel.Type.toOptionalModifier(): String  = when (this) {
    is NativeModel.Primitive -> ""
    is NativeModel.Reference.StructureField -> ""
    is NativeModel.Reference.Enumeration -> ""
    //is CLibraryModel.Reference.Callback -> TODO()
    else -> "?"
}

private fun NativeModel.Type.toJnaType(): String  = when (this) {
    is NativeModel.Primitive.Bool -> "Int"
    is NativeModel.Primitive.UInt64 -> "Long"
    is NativeModel.Reference.Enumeration,
    is NativeModel.Primitive.UInt32 -> "Int"
    is NativeModel.Primitive.UInt16 -> "Short"
    is NativeModel.Primitive -> toPrimitiveKotlinType()
    is NativeModel.Reference.Structure -> "${name}.ByReference?"
    is NativeModel.Reference.StructureField -> "${name}.ByValue"
    is NativeModel.Reference.Callback -> "com.sun.jna.Callback"
    else -> "com.sun.jna.Pointer"
}
