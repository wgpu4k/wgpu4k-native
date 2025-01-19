@file:OptIn(ExperimentalForeignApi::class)

package ffi

import kotlinx.cinterop.COpaque
import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toLong

class Pointer(val pointer: CPointer<COpaque>) {

    constructor(pointer: CPointer<*>) : this(pointer.reinterpret())
    constructor(pointer: Long) : this(pointer.toCPointer<COpaque>() ?: error("Invalid pointer"))

    fun <T : CPointed> reinterpret(): CPointer<T> {
        return pointer.reinterpret()
    }

    val rawValue: Long
        get() = pointer.toLong()

}

actual typealias NativeAddress = Pointer

