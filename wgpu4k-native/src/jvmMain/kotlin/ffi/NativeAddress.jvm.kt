package ffi

class JvmNativeAddress(
    val handler: java.lang.foreign.MemorySegment
)

actual typealias NativeAddress = JvmNativeAddress

internal fun NativeAddress?.adapt(): java.lang.foreign.MemorySegment? {
    return this?.handler
}