@file:OptIn(ExperimentalForeignApi::class)

package ffi

import kotlinx.cinterop.ByteVarOf
import kotlinx.cinterop.COpaque
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.readBytes
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString

actual value class CString actual constructor(actual val handler: NativeAddress) {
    actual fun toKString(): String? = handler.reinterpret<ByteVarOf<Byte>>().toKString()

    actual fun toKString(size: ULong): String? {
        return handler.reinterpret<ByteVarOf<Byte>>()
                .readBytes(size.toInt())
                .toKString()
    }
}

fun CPointer<ByteVarOf<Byte>>.toCString() = CString(NativeAddress(this.reinterpret()))