package ffi

import java.lang.foreign.SegmentAllocator
import java.lang.foreign.ValueLayout

actual class MemoryAllocator : AutoCloseable {

    private val arena = JnaArena()
    private val callbacks = mutableListOf<com.sun.jna.Callback>()
    private val references = mutableListOf<Any>()

    val allocator: SegmentAllocator = SegmentAllocator(arena)

    actual fun allocate(sizeInByte: Long): NativeAddress {
        return allocator.allocate(sizeInByte)
    }

    actual override fun close() {
        arena.close()
        callbacks.clear()
        references.clear()
    }

    actual fun bufferOf(value: Long): MemoryBuffer = allocator.allocate(ValueLayout.JAVA_LONG)
        .also { it.set(ValueLayout.JAVA_LONG, 0, value) }
        .let { MemoryBuffer(it.pointer, it.size.toULong()) }


    actual fun allocateFrom(value: String): CString = allocator
        .allocateFrom(value)
        .let(::CString)

    actual fun bufferOfAddress(value: NativeAddress): MemoryBuffer = bufferOf(value.toAddress())

    fun registerCallback(function: com.sun.jna.Callback) {
        callbacks.add(function)
    }

    fun register(it: Any) {
        references.add(it)
    }

    actual fun allocateBuffer(size: ULong): MemoryBuffer {
        return allocate(size.toLong())
            .let { MemoryBuffer(it, size) }
    }

    actual fun bufferOfAddresses(value: List<NativeAddress>): MemoryBuffer {
        val size = (Long.SIZE_BYTES * value.size).toULong()
        return allocateBuffer(size)
            .also { buffer -> value.forEachIndexed { index, pointer ->
                buffer.writePointer(pointer, (Long.SIZE_BYTES * index).toULong())
            }}
    }
}