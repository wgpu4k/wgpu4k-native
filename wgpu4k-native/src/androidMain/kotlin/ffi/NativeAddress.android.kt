package ffi

import com.sun.jna.Pointer

actual typealias NativeAddress = Pointer

internal fun NativeAddress?.adapt(): Long {
    return if (this == null) 0 else this.toAddress()
}