package domain

internal fun typeToJvmLayout(type: NativeModel.Type) = when (type) {
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    NativeModel.Reference.CString,
    is NativeModel.Array,
    is NativeModel.Reference.Callback,
    NativeModel.Void,
    is NativeModel.Reference.Structure -> "ffi.C_POINTER"

    NativeModel.Primitive.UInt16 -> "ffi.C_SHORT"

    NativeModel.Primitive.Bool,
    NativeModel.Primitive.UInt32,
    NativeModel.Primitive.Int32 -> "ffi.C_INT"

    NativeModel.Primitive.UInt64,
    NativeModel.Primitive.Int64 -> "ffi.C_LONG"

    NativeModel.Primitive.Float32 -> "ffi.C_FLOAT"
    NativeModel.Primitive.Float64 -> "ffi.C_DOUBLE"

    is NativeModel.Reference.Enumeration -> "ffi.C_INT"
    is NativeModel.Reference.StructureField -> "${type.name}.LAYOUT"
}