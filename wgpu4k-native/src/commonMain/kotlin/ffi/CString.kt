package ffi

expect value class CString(val handler: NativeAddress) {
    fun toKString(): String?
    fun toKString(size: ULong): String?
}