package domain

import convertToKotlinCallbackStructureName
import convertToKotlinClassName
import converter.toPrimitiveKotlinType


data class NativeModel(
    val pointers: List<Pointer>,
    val functions: List<Function>,
    val enumerations: List<Enumeration>,
    val structures: List<Structure>,
    val callbacks: List<Callback>,
) {

    class Enumeration(val name: String, val values: List<Pair<String, Int>>, val size: Int = 32)

    sealed interface Type
    sealed class Reference(val name: String) : Type {
        object OpaquePointer : Reference("NativeAddress")
        class Pointer(name: String) : Reference(name)
        class Callback(name: String) : Reference(name)
        class Structure(name: String) : Reference(name)
        class StructureField(name: String, val isOptional: Boolean) : Reference(name)
        class Enumeration(name: String) : Reference(name)
        object CString : Reference("CString")
    }

    class Array(val subType: Type, val isMutable: Boolean) : Type
    sealed interface Primitive : Type {
        object Bool : Primitive
        object UInt32 : Primitive
        object UInt16 : Primitive
        object Int32 : Primitive
        object UInt64 : Primitive
        object Int64 : Primitive
        object Float32 : Primitive
        object Float64 : Primitive
    }
    object Void : Type

    data class Pointer(val name: String)
    data class Function(val name: String, val returnType: Type, val args: List<Pair<String, Type>>)

    data class Structure(
        val name: String,
        val members: List<StructureField>,
        val size: Int? = null,
        val alignment: Int? = null,
        val padding: Int? = null,
    )

    data class StructureField(
        val name: String,
        val type: Type,
        val option: String,
        val alignment: Int? = type.getSize(),
        val size: Int? = type.getSize(),
        val padding: Int? = null
    )

    data class Callback(
        val name: String,
        val members: List<Pair<String, Type>>,
    )

}

internal fun NativeModel.Type.toFunctionKotlinType(): String = when (this) {
    is NativeModel.Reference.Callback -> "CallbackHolder<${name}>"
    is NativeModel.Reference -> name
    is NativeModel.Array -> "ArrayHolder<${subType.toFunctionKotlinType()}>"
    is NativeModel.Primitive -> this.toPrimitiveKotlinType()
    NativeModel.Void -> "Unit"
}

internal fun NativeModel.Type.toCallbackKotlinType(): String = when (this) {
    is NativeModel.Reference.Enumeration -> toFunctionKotlinType()
    is NativeModel.Reference -> "${toFunctionKotlinType()}?"
    else -> toFunctionKotlinType()
}


internal fun String?.toCType(isPointer: Boolean, isMutable: Boolean, isOptional: Boolean = false): NativeModel.Type {
    return when {
        this == null -> NativeModel.Void
        startsWith("struct.") -> when (isPointer) {
            true -> NativeModel.Reference.Structure(split(".").last().convertToKotlinClassName())
            else -> NativeModel.Reference.StructureField(split(".").last().convertToKotlinClassName(), isOptional)
        }
        startsWith("object.")
            -> NativeModel.Reference.Pointer(split(".").last().convertToKotlinClassName())
        startsWith("enum.") -> when (isPointer) {
            true -> NativeModel.Reference.OpaquePointer
            else -> NativeModel.Reference.Enumeration(split(".").last().convertToKotlinClassName())
        }
        startsWith("function_type.") -> NativeModel.Reference.Callback(split(".").last().convertToKotlinClassName())
        startsWith("callback.") -> NativeModel.Reference.StructureField(split(".").last().convertToKotlinCallbackStructureName(), false)
        startsWith("bitflag.") -> if (mappingVersion == Version.v22) NativeModel.Primitive.UInt32 else NativeModel.Primitive.UInt64
        equals("bool") -> NativeModel.Primitive.Bool
        equals("usize") -> when (isPointer) {
            true -> NativeModel.Reference.OpaquePointer
            else -> NativeModel.Primitive.UInt64
        }
        equals("uint64") -> when (isPointer) {
            true -> NativeModel.Reference.OpaquePointer
            else -> NativeModel.Primitive.UInt64
        }
        equals("uint32") ->  when (isPointer) {
            true -> NativeModel.Reference.OpaquePointer
            else -> NativeModel.Primitive.UInt32
        }
        equals("uint16") -> when (isPointer) {
            true -> NativeModel.Reference.OpaquePointer
            else -> NativeModel.Primitive.UInt16
        }
        equals("int32") -> when (isPointer) {
            true -> NativeModel.Reference.OpaquePointer
            else -> NativeModel.Primitive.Int32
        }
        equals("float32") -> when (isPointer) {
            true -> NativeModel.Reference.OpaquePointer
            else -> NativeModel.Primitive.Float32
        }
        equals("float64") -> when (isPointer) {
            true -> NativeModel.Reference.OpaquePointer
            else -> NativeModel.Primitive.Float64
        }
        equals("c_void") -> when (isPointer) {
            true -> NativeModel.Reference.OpaquePointer
            else -> NativeModel.Void
        }
        startsWith("array<") -> NativeModel.Array(substring(6, length - 1).toCType(false, false), isMutable)
        isString() -> NativeModel.Reference.CString//NativeModel.Reference.StructureField("WGPUStringView")
        else -> error("unknown type $this")
    }
}

private fun String.isString()
    = equals("string") || equals("nullable_string") || equals("out_string") || equals("string_with_default_empty")

fun NativeModel.Type.getSize(): Int? = when (this) {
    is NativeModel.Array,
    is NativeModel.Reference.Callback,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    NativeModel.Primitive.UInt64,
    NativeModel.Primitive.Float64,
    NativeModel.Reference.CString,
    NativeModel.Primitive.Int64 -> 8
    NativeModel.Primitive.UInt16 -> 2
    is NativeModel.Reference.Enumeration,
    NativeModel.Primitive.Int32,
    NativeModel.Primitive.Float32,
    NativeModel.Primitive.Bool,
    NativeModel.Primitive.UInt32 -> 4
    is NativeModel.Reference.StructureField -> null
    NativeModel.Void -> null
}