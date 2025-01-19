@file:OptIn(ExperimentalForeignApi::class, ExperimentalNativeApi::class)

package ffi

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.rawValue
import platform.android.JNIEnvVar
import platform.android.jclass
import platform.android.jlong
import platform.android.jobject
import kotlin.experimental.ExperimentalNativeApi

internal val handleRequestDeviceCallbacks = mutableListOf<CallbackInfo>()

internal data class CallbackInfo(
    val jclass: jclass,
    val methodName: String,
    val env: CPointer<JNIEnvVar>,
    var callbackPointer: CPointer<*>? = null
)

internal fun findCallbackClassFromPointer(callbackPtr: Long): CallbackInfo {
    return handleRequestDeviceCallbacks.find { it.callbackPointer.rawValue.toLong() == callbackPtr } ?: error("fail to find callback from pointer $callbackPtr")
}

internal fun deleteCallback(callbackPtr: Long) {
    findCallbackClassFromPointer(callbackPtr)
        .also { handleRequestDeviceCallbacks.remove(it) }
}

@CName("Java_ffi_Callback_free")
fun freeCallback(env: CPointer<JNIEnvVar>, thiz: jobject, callback: jlong) {
    deleteCallback(callback)
}
