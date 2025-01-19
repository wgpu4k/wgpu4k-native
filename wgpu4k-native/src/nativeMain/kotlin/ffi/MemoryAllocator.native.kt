@file:OptIn(ExperimentalForeignApi::class)

package ffi

import kotlinx.cinterop.Arena
import kotlinx.cinterop.COpaque
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.LongVar
import kotlinx.cinterop.NativePointed
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

actual class MemoryAllocator : AutoCloseable {

    val allocator = Arena()

    actual fun allocate(sizeInByte: Long): NativeAddress {
        return allocator.alloc(sizeInByte, 0)
            .toOpaqueNativeAddress()
    }

    actual override fun close() {
        allocator.clear()
    }

    actual fun bufferOf(value: Long): MemoryBuffer = allocator.alloc<LongVar>().also {
        it.value = value
    }.toOpaqueNativeAddress()
        .let { MemoryBuffer(it, Long.SIZE_BYTES.toULong()) }

    actual fun bufferOfAddress(value: NativeAddress): MemoryBuffer = bufferOf(value.rawValue)

    actual fun allocateFrom(value: String): CString {
        return value.cstr.getPointer(allocator)
            .reinterpret<COpaque>()
            .let(::NativeAddress)
            .let { CString(it) }
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

fun NativePointed.toOpaqueNativeAddress() = rawPtr
    .toLong()
    .let(::NativeAddress)