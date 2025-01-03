package ffi

@JvmInline
actual value class CString actual constructor(actual val handler: NativeAddress) {
    actual fun toKString(): String? {
        return if (handler.handler.byteSize() == 0L) handler.handler.reinterpret(Long.MAX_VALUE).getString(0) else handler.handler.getString(0)
    }

    actual fun toKString(size: ULong): String? {
        return ByteArray(size.toInt())
            .also { byte ->
                handler.handler.reinterpret(size.toLong())
                    .asByteBuffer()
                    .get(byte)
            }.let { String(it) }
    }
}