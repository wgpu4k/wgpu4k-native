@file:OptIn(ExperimentalForeignApi::class)

package ffi

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.COpaque
import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.FloatVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.LongVar
import kotlinx.cinterop.ShortVar
import kotlinx.cinterop.UByteVar
import kotlinx.cinterop.UIntVar
import kotlinx.cinterop.ULongVar
import kotlinx.cinterop.UShortVar
import kotlinx.cinterop.get
import kotlinx.cinterop.pointed
import kotlinx.cinterop.set
import kotlinx.cinterop.sizeOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.value

actual class MemoryBuffer actual constructor(actual val handler: NativeAddress, actual val size: ULong) {

    private fun <T : CPointed> getPointerAtOffset(offset: ULong): CPointer<T> {
        return (handler.pointer.rawValue.toLong() + offset.toLong()).toCPointer()
            ?: error("fail to get pointer at offset $offset")
    }

    actual fun writeByte(value: Byte, offset: ULong) {
        getPointerAtOffset<ByteVar>(offset).pointed.value = value
    }

    actual fun readByte(offset: ULong): Byte {
        return getPointerAtOffset<ByteVar>(offset).pointed.value
    }

    actual fun writeUByte(value: UByte, offset: ULong) {
        getPointerAtOffset<UByteVar>(offset).pointed.value = value
    }

    actual fun readUByte(offset: ULong): UByte {
        return getPointerAtOffset<UByteVar>(offset).pointed.value
    }

    actual fun writeShort(value: Short, offset: ULong) {
        getPointerAtOffset<ShortVar>(offset).pointed.value = value
    }

    actual fun readShort(offset: ULong): Short {
        return getPointerAtOffset<ShortVar>(offset).pointed.value
    }

    actual fun writeUShort(value: UShort, offset: ULong) {
        getPointerAtOffset<UShortVar>(offset).pointed.value = value
    }

    actual fun readUShort(offset: ULong): UShort {
        return getPointerAtOffset<UShortVar>(offset).pointed.value
    }

    actual fun writeInt(value: Int, offset: ULong) {
        getPointerAtOffset<IntVar>(offset).pointed.value = value
    }

    actual fun readInt(offset: ULong): Int {
        return getPointerAtOffset<IntVar>(offset).pointed.value
    }

    actual fun writeUInt(value: UInt, offset: ULong) {
        getPointerAtOffset<UIntVar>(offset).pointed.value = value
    }

    actual fun readUInt(offset: ULong): UInt {
        return getPointerAtOffset<UIntVar>(offset).pointed.value
    }

    actual fun writeLong(value: Long, offset: ULong) {
        getPointerAtOffset<LongVar>(offset).pointed.value = value
    }

    actual fun readLong(offset: ULong): Long {
        return getPointerAtOffset<LongVar>(offset).pointed.value
    }

    actual fun writeULong(value: ULong, offset: ULong) {
        getPointerAtOffset<ULongVar>(offset).pointed.value = value
    }

    actual fun readULong(offset: ULong): ULong {
        return getPointerAtOffset<ULongVar>(offset).pointed.value
    }

    actual fun writeFloat(value: Float, offset: ULong) {
        getPointerAtOffset<FloatVar>(offset).pointed.value = value
    }

    actual fun readFloat(offset: ULong): Float {
        return getPointerAtOffset<FloatVar>(offset).pointed.value
    }

    actual fun writeDouble(value: Double, offset: ULong) {
        getPointerAtOffset<DoubleVar>(offset).pointed.value = value
    }

    actual fun readDouble(offset: ULong): Double {
        return getPointerAtOffset<DoubleVar>(offset).pointed.value
    }

    actual fun writePointer(value: NativeAddress, offset: ULong) {
        getPointerAtOffset<LongVar>(offset).pointed.value = value.pointer.rawValue.toLong()
    }

    actual fun readPointer(offset: ULong): NativeAddress {
        return getPointerAtOffset<LongVar>(offset).pointed.value.toCPointer<COpaque>()?.let(::NativeAddress)
            ?: error("fail to read pointer at offset $offset")
    }

    actual fun writeBytes(
        array: ByteArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<ByteVar>())

        val buffer = getPointerAtOffset<ByteVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readBytes(
        array: ByteArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<ByteVar>())

        val buffer = getPointerAtOffset<ByteVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }

    actual fun writeUBytes(
        array: UByteArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<UByteVar>())

        val buffer = getPointerAtOffset<UByteVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readUBytes(
        array: UByteArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<UByteVar>())

        val buffer = getPointerAtOffset<UByteVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }

    actual fun writeShorts(
        array: ShortArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<ShortVar>())

        val buffer = getPointerAtOffset<ShortVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readShorts(
        array: ShortArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<ShortVar>())

        val buffer = getPointerAtOffset<ShortVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }

    actual fun writeUShorts(
        array: UShortArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<UShortVar>())

        val buffer = getPointerAtOffset<UShortVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readUShorts(
        array: UShortArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<UShortVar>())

        val buffer = getPointerAtOffset<UShortVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }


    actual fun writeInts(
        array: IntArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<IntVar>())

        val buffer = getPointerAtOffset<IntVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readInts(
        array: IntArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<IntVar>())

        val buffer = getPointerAtOffset<IntVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }

    actual fun writeUInts(
        array: UIntArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<UIntVar>())

        val buffer = getPointerAtOffset<UIntVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readUInts(
        array: UIntArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<UIntVar>())

        val buffer = getPointerAtOffset<UIntVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }

    actual fun writeLongs(
        array: LongArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<LongVar>())

        val buffer = getPointerAtOffset<LongVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readLongs(
        array: LongArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<LongVar>())

        val buffer = getPointerAtOffset<LongVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }

    actual fun writeULongs(
        array: ULongArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<ULongVar>())

        val buffer = getPointerAtOffset<ULongVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readULongs(
        array: ULongArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<ULongVar>())

        val buffer = getPointerAtOffset<ULongVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }

    actual fun writeFloats(
        array: FloatArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<FloatVar>())

        val buffer = getPointerAtOffset<FloatVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readFloats(
        array: FloatArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<FloatVar>())

        val buffer = getPointerAtOffset<FloatVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }

    actual fun writeDoubles(
        array: DoubleArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<DoubleVar>())

        val buffer = getPointerAtOffset<DoubleVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            buffer[index] = array[index + arrayIndex.toInt()]
        }
    }

    actual fun readDoubles(
        array: DoubleArray,
        arrayIndex: ULong,
        bufferOffset: ULong,
        size: ULong
    ) {
        boundCheck(bufferOffset, size, arrayIndex, array.size, sizeOf<DoubleVar>())

        val buffer = getPointerAtOffset<DoubleVar>(bufferOffset)
        (0 until size.toInt()).forEach { index ->
            array[index + arrayIndex.toInt()] = buffer[index]
        }
    }

    private fun boundCheck(
        bufferOffset: ULong,
        size: ULong,
        arrayIndex: ULong,
        arraySize: Int,
        elementSizeInByte: Long
    ) {
        val bufferEnd = bufferOffset.toLong() + size.toInt() * elementSizeInByte
        require(bufferEnd <= this.size.toLong()) { "Buffer overflow: trying to access $bufferEnd but buffer size is ${this.size}" }
        require(arrayIndex.toInt() + size.toInt() <= arraySize) { "Array overflow: trying to access ${(arrayIndex.toInt() + size.toInt())} but array size is ${arraySize}" }
    }
}