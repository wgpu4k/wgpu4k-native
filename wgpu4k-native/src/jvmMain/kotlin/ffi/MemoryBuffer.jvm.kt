@file:OptIn(ExperimentalUnsignedTypes::class)

package ffi

import java.lang.foreign.MemorySegment
import java.lang.foreign.ValueLayout

actual class MemoryBuffer actual constructor(handler: NativeAddress, actual val size: ULong) {

    actual val handler: NativeAddress = handler.handler.reinterpret(size.toLong()).let(::NativeAddress)
    val memorySegment: MemorySegment = this.handler.handler

    private fun writeArray(destinationOffset: ULong, source: MemorySegment, arrayIndex: ULong, size: ULong, elementSizeBytes: Int) {
        val sourceOffset = elementSizeBytes.toULong() * arrayIndex
        val bytesToCopy = elementSizeBytes.toULong() * size

        write(destinationOffset, sourceOffset, source, bytesToCopy)
    }

    private fun write(
        destinationOffset: ULong,
        sourceOffset: ULong,
        source: MemorySegment,
        bytesToCopy: ULong,
    ) {
        val sourceBytes = source.byteSize().toULong()
        val destinationBytes = memorySegment.byteSize().toULong()

        require(destinationBytes >= (destinationOffset + bytesToCopy)) { "Out of destination bounds" }
        require(sourceOffset + bytesToCopy <= sourceBytes) { "Out of source bounds" }

        memorySegment.asSlice(destinationOffset.toLong(), bytesToCopy.toLong())
            .copyFrom(source.asSlice(sourceOffset.toLong(), bytesToCopy.toLong()))
    }


    private fun readArray(sourceOffset: ULong, destination: MemorySegment, arrayIndex: ULong, size: ULong, elementSizeBytes: Int) {
        val destinationOffset = elementSizeBytes.toULong() * arrayIndex
        val bytesToCopy = elementSizeBytes.toULong() * size

        read(sourceOffset, destinationOffset, destination, bytesToCopy)
    }

    private fun read(sourceOffset: ULong, destinationOffset: ULong, destination: MemorySegment, bytesToCopy: ULong) {
        val destinationBytes = destination.byteSize().toULong()
        val sourceBytes = memorySegment.byteSize().toULong()

        require(destinationBytes >= (destinationOffset + bytesToCopy)) { "Out of destination bounds" }
        require(sourceOffset + bytesToCopy <= sourceBytes) { "Out of source bounds" }

        destination.asSlice(destinationOffset.toLong(), bytesToCopy.toLong())
            .copyFrom(memorySegment.asSlice(sourceOffset.toLong(), bytesToCopy.toLong()))
    }

    actual fun writeByte(value: Byte, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_BYTE, offset.toLong(), value)
    }

    actual fun readByte(offset: ULong): Byte {
        return memorySegment.get(ValueLayout.JAVA_BYTE, offset.toLong())
    }

    actual fun writeUByte(value: UByte, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_BYTE, offset.toLong(), value.toByte())
    }

    actual fun readUByte(offset: ULong): UByte {
        return memorySegment.get(ValueLayout.JAVA_BYTE, offset.toLong()).toUByte()
    }

    actual fun writeShort(value: Short, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_SHORT, offset.toLong(), value)
    }

    actual fun readShort(offset: ULong): Short {
        return memorySegment.get(ValueLayout.JAVA_SHORT, offset.toLong())
    }

    actual fun writeUShort(value: UShort, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_SHORT, offset.toLong(), value.toShort())
    }

    actual fun readUShort(offset: ULong): UShort {
        return memorySegment.get(ValueLayout.JAVA_SHORT, offset.toLong()).toUShort()
    }

    actual fun writeInt(value: Int, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_INT, offset.toLong(), value)
    }

    actual fun readInt(offset: ULong): Int {
        return memorySegment.get(ValueLayout.JAVA_INT, offset.toLong())
    }

    actual fun writeUInt(value: UInt, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_INT, offset.toLong(), value.toInt())
    }

    actual fun readUInt(offset: ULong): UInt {
        return memorySegment.get(ValueLayout.JAVA_INT, offset.toLong()).toUInt()
    }

    actual fun writeLong(value: Long, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_LONG, offset.toLong(), value)
    }

    actual fun readLong(offset: ULong): Long {
        return memorySegment.get(ValueLayout.JAVA_LONG, offset.toLong())
    }

    actual fun writeULong(value: ULong, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_LONG, offset.toLong(), value.toLong())
    }

    actual fun readULong(offset: ULong): ULong {
        return memorySegment.get(ValueLayout.JAVA_LONG, offset.toLong()).toULong()
    }

    actual fun writeFloat(value: Float, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_FLOAT, offset.toLong(), value)
    }

    actual fun readFloat(offset: ULong): Float {
        return memorySegment.get(ValueLayout.JAVA_FLOAT, offset.toLong())
    }

    actual fun writeDouble(value: Double, offset: ULong) {
        memorySegment.set(ValueLayout.JAVA_DOUBLE, offset.toLong(), value)
    }

    actual fun readDouble(offset: ULong): Double {
        return memorySegment.get(ValueLayout.JAVA_DOUBLE, offset.toLong())
    }

    actual fun writePointer(value: NativeAddress, offset: ULong) {
        memorySegment.set(ValueLayout.ADDRESS, offset.toLong(), value.handler)
    }

    actual fun readPointer(offset: ULong): NativeAddress {
        return NativeAddress(memorySegment.get(ValueLayout.ADDRESS, offset.toLong()))
    }

    actual fun writeBytes(
        array: ByteArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Byte.SIZE_BYTES)
    }

    actual fun readBytes(
        array: ByteArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Byte.SIZE_BYTES)
    }

    actual fun writeUBytes(
        array: UByteArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array.asByteArray()), arrayIndex, size, UByte.SIZE_BYTES)
    }

    actual fun readUBytes(
        array: UByteArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array.asByteArray()), arrayIndex, size, UByte.SIZE_BYTES)
    }

    actual fun writeShorts(
        array: ShortArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Short.SIZE_BYTES)
    }

    actual fun readShorts(
        array: ShortArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Short.SIZE_BYTES)
    }

    actual fun writeUShorts(
        array: UShortArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array.asShortArray()), arrayIndex, size, UShort.SIZE_BYTES)
    }

    actual fun readUShorts(
        array: UShortArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array.asShortArray()), arrayIndex, size, UShort.SIZE_BYTES)
    }

    actual fun writeInts(
        array: IntArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Int.SIZE_BYTES)
    }

    actual fun readInts(
        array: IntArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Int.SIZE_BYTES)
    }

    actual fun writeUInts(
        array: UIntArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array.asIntArray()), arrayIndex, size, UInt.SIZE_BYTES)
    }

    actual fun readUInts(
        array: UIntArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array.asIntArray()), arrayIndex, size, UInt.SIZE_BYTES)
    }

    actual fun writeLongs(
        array: LongArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Long.SIZE_BYTES)
    }

    actual fun readLongs(
        array: LongArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Long.SIZE_BYTES)
    }

    actual fun writeULongs(
        array: ULongArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array.asLongArray()), arrayIndex, size, ULong.SIZE_BYTES)
    }

    actual fun readULongs(
        array: ULongArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array.asLongArray()), arrayIndex, size, ULong.SIZE_BYTES)
    }

    actual fun writeFloats(
        array: FloatArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Float.SIZE_BYTES)
    }

    actual fun readFloats(
        array: FloatArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Float.SIZE_BYTES)
    }

    actual fun writeDoubles(
        array: DoubleArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        writeArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Double.SIZE_BYTES)
    }

    actual fun readDoubles(
        array: DoubleArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        readArray(bufferOffset, MemorySegment.ofArray(array), arrayIndex, size, Double.SIZE_BYTES)
    }


}