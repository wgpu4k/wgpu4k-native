package ffi

class MemorySegment(
    val handler: java.lang.foreign.MemorySegment
)

actual typealias NativeAddress = MemorySegment

internal fun NativeAddress?.adapt(): java.lang.foreign.MemorySegment? {
    return this?.handler
}