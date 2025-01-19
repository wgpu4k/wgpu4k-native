package ffi

import io.ygdrasil.wgpu.toInt
import java.lang.foreign.AddressLayout
import java.lang.foreign.StructLayout
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.*

interface CStructure {
    val handler: NativeAddress

    fun get(layout: ValueLayout, offset: Long)
            = handler.handler.get(layout as AddressLayout, offset).let(::NativeAddress)

    fun get(layout: StructLayout, offset: Long)
            = handler.handler.get(layout as AddressLayout, offset).let(::NativeAddress)

    fun getUInt(offset: Long): UInt
            = handler.handler.get(JAVA_INT, offset).toUInt()

    fun getInt(offset: Long): Int
            = handler.handler.get(JAVA_INT, offset)

    fun getULong(offset: Long): ULong
            = handler.handler.get(JAVA_LONG, offset).toULong()

    fun getUShort(offset: Long): UShort
            = handler.handler.get(JAVA_SHORT, offset).toUShort()

    fun getShort(offset: Long): Short
            = handler.handler.get(JAVA_SHORT, offset)

    fun getFloat(offset: Long): Float
            = handler.handler.get(JAVA_FLOAT, offset)

    fun getDouble(offset: Long): Double
            = handler.handler.get(JAVA_DOUBLE, offset)

    fun set(layout: ValueLayout, offset: Long, address: NativeAddress?)
            = handler.handler.set(layout as AddressLayout, offset, address?.handler)

    fun set(layout: StructLayout, offset: Long, address: NativeAddress?)
            = handler.handler.set(layout as AddressLayout, offset, address?.handler)

    fun set(offset: Long, value: UInt)
            = handler.handler.set(JAVA_INT, offset, value.toInt())

    fun set(offset: Long, value: Int)
            = handler.handler.set(JAVA_INT, offset, value)

    fun set(offset: Long, value: Boolean)
            = handler.handler.set(JAVA_INT, offset, value.toInt())

    fun set(offset: Long, value: ULong)
            = handler.handler.set(JAVA_LONG, offset, value.toLong())

    fun set(offset: Long, value: UShort)
            = handler.handler.set(JAVA_SHORT, offset, value.toShort())

    fun set(offset: Long, value: Short)
            = handler.handler.set(JAVA_SHORT, offset, value)

    fun set(offset: Long, value: Float)
            = handler.handler.set(JAVA_FLOAT, offset, value)

    fun set(offset: Long, value: Double)
            = handler.handler.set(JAVA_DOUBLE, offset, value)
}