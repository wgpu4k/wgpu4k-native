package poet

import com.squareup.kotlinpoet.BOOLEAN
import com.squareup.kotlinpoet.BYTE
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.DOUBLE
import com.squareup.kotlinpoet.FLOAT
import com.squareup.kotlinpoet.INT
import com.squareup.kotlinpoet.LONG
import com.squareup.kotlinpoet.SHORT
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.U_BYTE
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import com.squareup.kotlinpoet.U_SHORT
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import domain.NativeModel

// Package constants
const val FFI_PACKAGE = "ffi"
const val WGPU_PACKAGE = "io.ygdrasil.wgpu"
const val ANDROID_WGPU_PACKAGE = "io.ygdrasil.wgpu.android"
const val JNA_PACKAGE = "com.sun.jna"

// Reusable ClassName objects for common FFI types
val NATIVE_ADDRESS = ClassName(FFI_PACKAGE, "NativeAddress")
val CALLBACK_HOLDER = ClassName(FFI_PACKAGE, "CallbackHolder")
val ARRAY_HOLDER = ClassName(FFI_PACKAGE, "ArrayHolder")
val C_STRING_TYPE = ClassName(FFI_PACKAGE, "CString")
val MEMORY_ALLOCATOR = ClassName(FFI_PACKAGE, "MemoryAllocator")

// JNA types
val JNA_POINTER = ClassName(JNA_PACKAGE, "Pointer")
val JNA_CALLBACK = ClassName(JNA_PACKAGE, "Callback")

// ---- Common (expect/common) type mappings ----

/**
 * Returns the base [TypeName] for the common Kotlin platform (expect interfaces, common function
 * signatures). Nullability is NOT included — apply `.copy(nullable = true)` at use site.
 */
fun NativeModel.Type.toCommonTypeName(): TypeName = when (this) {
    NativeModel.Void -> UNIT
    NativeModel.Primitive.Bool -> BOOLEAN
    NativeModel.Primitive.UInt32 -> U_INT
    NativeModel.Primitive.UInt16 -> U_SHORT
    NativeModel.Primitive.UInt8 -> U_BYTE
    NativeModel.Primitive.Int32 -> INT
    NativeModel.Primitive.Int64 -> LONG
    NativeModel.Primitive.UInt64 -> U_LONG
    NativeModel.Primitive.Float32 -> FLOAT
    NativeModel.Primitive.Float64 -> DOUBLE
    NativeModel.Reference.OpaquePointer -> NATIVE_ADDRESS
    NativeModel.Reference.CString -> C_STRING_TYPE
    is NativeModel.Reference.Structure -> ClassName(WGPU_PACKAGE, name)
    is NativeModel.Reference.StructureField -> ClassName(WGPU_PACKAGE, name)
    is NativeModel.Reference.Pointer -> ClassName(WGPU_PACKAGE, name)
    is NativeModel.Reference.Enumeration -> ClassName(WGPU_PACKAGE, name)
    is NativeModel.Reference.Callback -> CALLBACK_HOLDER.parameterizedBy(ClassName(WGPU_PACKAGE, name))
    is NativeModel.Array -> ARRAY_HOLDER.parameterizedBy(subType.toCommonTypeName())
}

/**
 * Whether this type is nullable when used as a function/interface parameter (common platform).
 * Matches the existing `optional()` extension in android.template.kt.
 */
fun NativeModel.Type.isNullableParam(): Boolean = when (this) {
    NativeModel.Void,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    is NativeModel.Array -> true
    is NativeModel.Reference.StructureField -> isOptional
    else -> false
}

/**
 * Whether this type is nullable when used as a function return type (common platform).
 * Matches the existing `optionalReturnType()` extension in android.template.kt.
 */
fun NativeModel.Type.isNullableReturnType(): Boolean = when (this) {
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    is NativeModel.Array -> true
    else -> false
}

/**
 * Whether this type is nullable when used as a callback parameter (common platform).
 * Matches the existing `toCallbackKotlinType()` in NativeModel.kt.
 */
fun NativeModel.Type.isNullableCallbackParam(): Boolean = when (this) {
    is NativeModel.Reference.Enumeration -> false
    is NativeModel.Reference -> true
    else -> false
}

// ---- JNA (Android) type mappings ----

/**
 * Returns the base [TypeName] for the JNA (Android) platform. Nullability NOT included.
 * Matches `toJnaType()` in structure/jna.template.kt.
 */
fun NativeModel.Type.toJnaTypeName(): TypeName = when (this) {
    NativeModel.Primitive.Bool -> INT
    NativeModel.Primitive.UInt64 -> LONG
    NativeModel.Primitive.UInt16 -> SHORT
    NativeModel.Primitive.UInt8 -> BYTE
    is NativeModel.Reference.Enumeration,
    NativeModel.Primitive.UInt32 -> INT
    NativeModel.Primitive.Int32 -> INT
    NativeModel.Primitive.Int64 -> LONG
    NativeModel.Primitive.Float32 -> FLOAT
    NativeModel.Primitive.Float64 -> DOUBLE
    is NativeModel.Reference.Structure -> ClassName(ANDROID_WGPU_PACKAGE, name).nestedClass("ByReference")
    is NativeModel.Reference.StructureField -> ClassName(ANDROID_WGPU_PACKAGE, name).nestedClass("ByValue")
    is NativeModel.Reference.Callback -> JNA_CALLBACK
    else -> JNA_POINTER
}

/**
 * Whether this type should be nullable in a JNA struct field.
 * Matches `toOptionalModifier()` in structure/jna.template.kt.
 */
fun NativeModel.Type.isNullableInJna(): Boolean = when (this) {
    is NativeModel.Primitive -> false
    is NativeModel.Reference.StructureField -> false
    is NativeModel.Reference.Enumeration -> false
    else -> true
}

/**
 * Returns the JNA type for the Android function interface (`FunctionsInterface`).
 * Nullability IS included in the result.
 * Matches `toAndroidNativeType()` in function/jna.template.kt.
 */
fun NativeModel.Type.toJnaFunctionTypeName(): TypeName = when (this) {
    NativeModel.Primitive.Int32 -> INT
    NativeModel.Primitive.Int64 -> LONG
    NativeModel.Void -> UNIT
    NativeModel.Primitive.Bool -> U_INT
    NativeModel.Primitive.UInt64 -> U_LONG
    NativeModel.Primitive.Float64 -> DOUBLE
    NativeModel.Primitive.Float32 -> FLOAT
    is NativeModel.Reference.Enumeration,
    NativeModel.Primitive.UInt32 -> U_INT
    NativeModel.Primitive.UInt16 -> U_SHORT
    NativeModel.Primitive.UInt8 -> U_BYTE
    is NativeModel.Reference.StructureField -> ClassName(ANDROID_WGPU_PACKAGE, name).nestedClass("ByValue")
        .let { if (isOptional) it.copy(nullable = true) else it }
    is NativeModel.Reference.Structure -> ClassName(ANDROID_WGPU_PACKAGE, name).nestedClass("ByReference").copy(nullable = true)
    is NativeModel.Reference.Callback -> JNA_CALLBACK.copy(nullable = true)
    is NativeModel.Array,
    NativeModel.Reference.CString,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer -> JNA_POINTER.copy(nullable = true)
}

// ---- JVM (Panama) type mappings ----

val MEMORY_SEGMENT = ClassName("java.lang.foreign", "MemorySegment")

/**
 * Returns the JVM-internal (Panama) type name. Matches `toJvmNativeType()`.
 */
fun NativeModel.Type.toJvmNativeTypeName(): TypeName = when (this) {
    NativeModel.Primitive.Int32 -> INT
    NativeModel.Primitive.UInt64,
    NativeModel.Primitive.Int64 -> LONG
    NativeModel.Void -> UNIT
    NativeModel.Primitive.Float64 -> DOUBLE
    NativeModel.Primitive.Float32 -> FLOAT
    is NativeModel.Reference.Enumeration,
    NativeModel.Primitive.Bool,
    NativeModel.Primitive.UInt32 -> INT
    NativeModel.Primitive.UInt16 -> SHORT
    NativeModel.Primitive.UInt8 -> BYTE
    is NativeModel.Array,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    is NativeModel.Reference.StructureField -> MEMORY_SEGMENT
}

/**
 * Returns the Kotlin-visible JVM type name. Matches `toKotlinNativeType()`.
 */
fun NativeModel.Type.toKotlinNativeTypeName(): TypeName = when (this) {
    NativeModel.Primitive.UInt64 -> U_LONG
    is NativeModel.Reference.Enumeration,
    NativeModel.Primitive.Bool,
    NativeModel.Primitive.UInt32 -> U_INT
    NativeModel.Primitive.UInt16 -> U_SHORT
    else -> toJvmNativeTypeName()
}

// ---- Callback-specific type mappings ----

/**
 * Returns the JNA (Android) type for a callback's [Function] inner interface parameter.
 * Matches `toCallbackJvmType()` in callback/jna.template.kt.
 */
fun NativeModel.Type.toJnaCallbackTypeName(): TypeName = when (this) {
    NativeModel.Primitive.Float32 -> FLOAT
    NativeModel.Primitive.Float64 -> DOUBLE
    NativeModel.Primitive.UInt16 -> SHORT
    NativeModel.Primitive.UInt8 -> BYTE
    NativeModel.Primitive.UInt64,
    NativeModel.Primitive.Int64 -> LONG
    NativeModel.Primitive.Bool,
    NativeModel.Primitive.Int32,
    NativeModel.Primitive.UInt32,
    is NativeModel.Reference.Enumeration -> INT
    is NativeModel.Reference.StructureField -> ClassName(ANDROID_WGPU_PACKAGE, name).nestedClass("ByValue")
    is NativeModel.Array,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure -> JNA_POINTER.copy(nullable = true)
    NativeModel.Void -> error("unsupported type here")
}

/**
 * Returns the JVM (Panama) type for a callback's [Function] inner interface parameter.
 * Matches `toCallbackJvmType()` in callback/jvm.template.kt.
 */
fun NativeModel.Type.toJvmCallbackTypeName(): TypeName = when (this) {
    NativeModel.Primitive.Float32 -> FLOAT
    NativeModel.Primitive.Float64 -> DOUBLE
    NativeModel.Primitive.UInt8 -> BYTE
    NativeModel.Primitive.UInt16 -> SHORT
    NativeModel.Primitive.UInt64,
    NativeModel.Primitive.Int64 -> LONG
    NativeModel.Primitive.Bool,
    NativeModel.Primitive.Int32,
    NativeModel.Primitive.UInt32,
    is NativeModel.Reference.Enumeration -> INT
    is NativeModel.Array,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    is NativeModel.Reference.StructureField -> MEMORY_SEGMENT
    NativeModel.Void -> error("unsupported type here")
}
