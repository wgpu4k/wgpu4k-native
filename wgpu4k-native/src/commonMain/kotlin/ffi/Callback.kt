package ffi

interface Callback

expect class CallbackHolder<T: Callback> {
    val handler: NativeAddress
}