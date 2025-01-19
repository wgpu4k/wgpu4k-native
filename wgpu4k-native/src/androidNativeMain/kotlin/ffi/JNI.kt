@file:OptIn(ExperimentalForeignApi::class)

package ffi

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CValue
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.NativePlacement
import kotlinx.cinterop.addressOf
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.useContents
import kotlinx.cinterop.usePinned
import kotlinx.cinterop.alloc
import kotlinx.cinterop.toKStringFromUtf8
import platform.android.JNIEnvVar
import platform.android.jclass
import platform.android.jmethodID
import platform.android.jobject
import platform.android.jstring
import platform.android.jvalue

internal fun CPointer<JNIEnvVar>.deleteGlobalRef(thiz: jobject) {
    val method = pointed.pointed?.DeleteGlobalRef ?: error("JNI is not Oracle standard")
    method.invoke(this, thiz)
}

internal fun CPointer<JNIEnvVar>.newGlobalRefOrThrow(thiz: jobject): jobject {
    return newGlobalRef(thiz) ?: error("fail to create global ref of jobject $thiz")
}

internal fun CPointer<JNIEnvVar>.newGlobalRef(thiz: jobject): jobject? {
    val method = pointed.pointed?.NewGlobalRef ?: error("JNI is not Oracle standard")
    return method.invoke(this, thiz)
}

internal fun CPointer<JNIEnvVar>.getObjectClass(thiz: jobject): jclass? {
    val method = pointed.pointed?.GetObjectClass ?: error("JNI is not Oracle standard")
    return method.invoke(this, thiz)
}

internal fun CPointer<JNIEnvVar>.getObjectClassOrThrow(thiz: jobject): jclass {
    return getObjectClass(thiz) ?: error("fail to get class of jobject $thiz")
}

internal fun CPointer<JNIEnvVar>.getMethodId(clazz: jclass, name: String, signature: String): jmethodID? {
    val method = pointed.pointed?.GetMethodID ?: error("JNI is not Oracle standard")
    return name.encodeToByteArray().usePinned { pinnedName ->
        signature.encodeToByteArray().usePinned { pinnedSig ->
            method.invoke(this, clazz, pinnedName.addressOf(0),
                pinnedSig.addressOf(0))
        }
    }
}

internal fun CPointer<JNIEnvVar>.getMethodIdOrThrow(clazz: jclass, name: String, signature: String): jmethodID {
    return getMethodId(clazz, name, signature) ?: error("fail to get method id of $name with signature $signature")
}

internal fun CPointer<JNIEnvVar>.callVoidMethod(jobj: jobject,
                                       methodId: jmethodID,
                                       vararg args: jvalue
) {
    val method = pointed.pointed?.CallVoidMethodA ?: error("JNI is not Oracle standard")
    return memScoped {
        val ptr = args.toCArray(this)
        method.invoke(this@callVoidMethod, jobj, methodId, ptr)
    }
}

internal fun Array<out CValue<jvalue>>.toCArray(memScope: NativePlacement): CArrayPointer<jvalue> {
    val arr = this
    return memScope.allocArray(size) { index ->
        d = arr[index].useContents { d }
    }
}

internal fun Array<out jvalue>.toCArray(memScope: NativePlacement): CArrayPointer<jvalue> {
    val arr = this
    println("Array being copied: ${arr.joinToString(", ") { it.d.toString() }}")
    return memScope.allocArray(size) { index ->
        println("Array after copy: ${arr.joinToString(", ") { it.d.toString() }}")
        println("Copying data over: ${arr[index].d}")
        d = arr[index].d //it's a union, so setting the longest field sets all fields.
    }
}

internal fun Byte.jvalue(scope: NativePlacement): jvalue {
    return scope.alloc<jvalue>().also { it.b = this }
}

internal fun Short.jvalue(scope: NativePlacement): jvalue {
    return scope.alloc<jvalue>().also { it.s = this }
}

internal fun Char.jvalue(scope: NativePlacement): jvalue {
    return scope.alloc<jvalue>().also { it.c = code.toUShort() }
}

internal fun Int.jvalue(scope: NativePlacement): jvalue {
    return scope.alloc<jvalue>().also { it.i = this }
}

internal fun UInt.jvalue(scope: NativePlacement): jvalue {
    return scope.alloc<jvalue>().also { it.i = this.toInt() }
}

internal fun Long.jvalue(scope: NativePlacement): jvalue {
    return scope.alloc<jvalue>().also { it.j = this }
}

internal fun jobject?.jvalue(scope: NativePlacement): jvalue {
    return scope.alloc<jvalue>().also { it.l = this }
}

internal fun Float.jvalue(scope: NativePlacement): jvalue {
    return scope.alloc<jvalue>().also { it.f = this }
}

internal fun Double.jvalue(scope: NativePlacement): jvalue {
    return scope.alloc<jvalue>().also { it.d = this }
}

internal fun CPointer<JNIEnvVar>.getString(string: jstring): String {
    val chars = getStringUTFChars(string)
    return chars?.toKStringFromUtf8() ?: error("Unable to create a String from the given jstring")
}

internal fun CPointer<JNIEnvVar>.getStringUTFChars(string: jstring): CPointer<ByteVar>? {
    val method = pointed.pointed?.GetStringUTFChars ?: error("JNI is not Oracle standard")
    return method.invoke(this, string, null)
}