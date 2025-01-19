@file:OptIn(ExperimentalForeignApi::class)

package ffi

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi

actual class CallbackHolder<T : Callback>(
    actual val handler: NativeAddress,
    val actualCallback: COpaquePointer? = null
)

private val callbackMap = mutableMapOf<CPointer<*>, Callback>()

internal fun registerCallback(address: CPointer<*>, callback: Callback) {
    callbackMap.set(address, callback)
}

internal inline fun <reified R : Callback> findCallback(address: CPointer<*>): R? {
    return callbackMap.get(address)?.let { it as? R }
}

internal fun removeCallback(address: CPointer<*>) {
    callbackMap.remove(address)
}
