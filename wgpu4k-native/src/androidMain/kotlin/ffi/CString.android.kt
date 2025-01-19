package ffi

@JvmInline
actual value class CString actual constructor(actual val handler: NativeAddress) {
    actual fun toKString(): String? = handler.getString(0)
    actual fun toKString(size: ULong): String? {
        return ByteArray(size.toInt())
            .also { byte ->
                handler.read(0, byte, 0, byte.size)
            }.let { String(it) }
    }
}