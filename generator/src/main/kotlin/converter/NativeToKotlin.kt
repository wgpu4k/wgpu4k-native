package converter

import domain.NativeModel

fun NativeModel.Type.variableType(): String = when(this) {
    is NativeModel.Reference.StructureField -> "val"
    else -> "var"
}

internal fun NativeModel.Primitive.toPrimitiveKotlinType(): String = when (this) {
    is NativeModel.Primitive.Int32 -> "Int"
    is NativeModel.Primitive.Int64 -> "Long"
    NativeModel.Primitive.Bool -> "Boolean"
    NativeModel.Primitive.UInt64 -> "ULong"
    NativeModel.Primitive.Float64 -> "Double"
    NativeModel.Primitive.Float32 -> "Float"
    NativeModel.Primitive.UInt32 -> "UInt"
    NativeModel.Primitive.UInt16 -> "UShort"
}

internal fun NativeModel.Primitive.toPrimitiveDefaultValue(): String = when (this) {
    is NativeModel.Primitive.Int32 -> "0"
    is NativeModel.Primitive.Int64 -> "0L"
    NativeModel.Primitive.Bool -> "0"
    NativeModel.Primitive.UInt64 -> "0uL"
    NativeModel.Primitive.Float64 -> "0.0"
    NativeModel.Primitive.Float32 -> "0f"
    NativeModel.Primitive.UInt32 -> "0u"
    NativeModel.Primitive.UInt16 -> "0u"
}
