package ffi

actual class CallbackHolder<T : Callback>(actual val handler: NativeAddress, val callback: com.sun.jna.Callback? = null)