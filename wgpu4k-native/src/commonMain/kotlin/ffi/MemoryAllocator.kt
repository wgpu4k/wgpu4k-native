package ffi

import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

val globalMemory = MemoryAllocator()

expect class MemoryAllocator() : AutoCloseable {

    fun allocate(sizeInByte: Long): NativeAddress

    override fun close()

    fun bufferOf(value: Long): MemoryBuffer

    fun allocateFrom(value: String): CString
    fun bufferOfAddress(value: NativeAddress): MemoryBuffer
    fun bufferOfAddresses(value: List<NativeAddress>): MemoryBuffer
    fun allocateBuffer(size: ULong): MemoryBuffer
}

@OptIn(kotlin.contracts.ExperimentalContracts::class)
public inline fun <R> memoryScope(block: (allocator: MemoryAllocator) -> R): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }

    val memoryAllocator = MemoryAllocator()
    try {
        return block(memoryAllocator)
    } finally {
        memoryAllocator.close()
    }
}