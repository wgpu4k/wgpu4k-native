package ffi

import java.lang.foreign.Arena
import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout

actual class MemoryAllocator : AutoCloseable {

    val arena = Arena.ofConfined()
    val allocator: SegmentAllocator
        get() = arena

    actual fun allocate(sizeInByte: Long): NativeAddress {
        return allocator.allocate(sizeInByte)
            .let(::NativeAddress)
    }

    actual override fun close() {
        arena.close()
    }

    actual fun bufferOf(value: Long): MemoryBuffer = allocator.allocate(ValueLayout.JAVA_LONG)
        .also { it.set(ValueLayout.JAVA_LONG, 0, value) }
        .let(::NativeAddress)
        .let { MemoryBuffer(it, Long.SIZE_BYTES.toULong()) }


    actual fun allocateFrom(value: String): CString = allocator
        .allocateFrom(value)
        .let(::NativeAddress)
        .let(::CString)

    actual fun bufferOfAddress(value: NativeAddress): MemoryBuffer = bufferOf(value.handler.address())

    actual fun allocateBuffer(size: ULong): MemoryBuffer = allocate(size.toLong())
        .let { MemoryBuffer(it, size) }

    actual fun bufferOfAddresses(value: List<NativeAddress>): MemoryBuffer {
        val size = (Long.SIZE_BYTES * value.size).toULong()
        return allocateBuffer(size)
            .also { buffer -> value.forEachIndexed { index, pointer ->
                buffer.writePointer(pointer, (Long.SIZE_BYTES * index).toULong())
            }}
    }
}