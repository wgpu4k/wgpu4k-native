@file:OptIn(ExperimentalForeignApi::class, ExperimentalNativeApi::class)

import ffi.MemoryAllocator
import ffi.NativeAddress
import ffi.Pointer
import io.ygdrasil.wgpu.HelloTriangleScene
import io.ygdrasil.wgpu.WGPULogCallback
import io.ygdrasil.wgpu.WGPULogLevel
import io.ygdrasil.wgpu.WGPULogLevel_Debug
import io.ygdrasil.wgpu.WGPULogLevel_Error
import io.ygdrasil.wgpu.WGPULogLevel_Info
import io.ygdrasil.wgpu.WGPULogLevel_Trace
import io.ygdrasil.wgpu.WGPULogLevel_Warn
import io.ygdrasil.wgpu.WGPUStringView
import io.ygdrasil.wgpu.configureSurface
import io.ygdrasil.wgpu.getAdapter
import io.ygdrasil.wgpu.getDevice
import io.ygdrasil.wgpu.getSurfaceAndroidView
import io.ygdrasil.wgpu.surfaceCapabilities
import io.ygdrasil.wgpu.wgpuCreateInstance
import io.ygdrasil.wgpu.wgpuSetLogCallback
import io.ygdrasil.wgpu.wgpuSetLogLevel
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import platform.android.ANDROID_LOG_INFO
import platform.android.ANativeActivity
import platform.android.ANativeWindow_getHeight
import platform.android.ANativeWindow_getWidth
import platform.android.__android_log_print
import kotlin.experimental.ExperimentalNativeApi

private const val LOG_TAG = "NativeActivity"

private fun logInfo(message: String) {
    __android_log_print(ANDROID_LOG_INFO.toInt(), LOG_TAG, message)
}

private val onNativeWindowCreatedCallback = staticCFunction<CPointer<ANativeActivity>?, COpaquePointer?, Unit> { activity, window ->
    logInfo("onNativeWindowCreated called")

    val window = window ?: error("window is null")
    val windowPtr = window.toNativeAddress()

    val instance = wgpuCreateInstance(null) ?: error("fail to create instance")
    val surface = getSurfaceAndroidView(instance, windowPtr)
    val adapter = getAdapter(surface, instance)
    val device = getDevice(adapter)
    val surfaceCapabilities = surfaceCapabilities(surface, adapter)
    val width = ANativeWindow_getWidth(window.reinterpret())
    val height = ANativeWindow_getHeight(window.reinterpret())
    configureSurface(device, width, height, surface, surfaceCapabilities.formats.first(), surfaceCapabilities.alphaModes.first(), listOf(surfaceCapabilities.formats.first()))
    val scene = HelloTriangleScene(device, surfaceCapabilities.formats.first(), surface).apply {
        initialize()
    }
    scene.render()
}

@CName("ANativeActivity_onCreate")
fun ANativeActivity_onCreate(
    activity: ANativeActivity?,
    savedState: COpaquePointer?,
    savedStateSize: Int
) {
    println("ANativeActivity_onCreate called")

    configureLogs()

    val activity = activity ?: error("activity is null")
    val callbacks = activity.callbacks ?: error("callbacks is null")

    callbacks.pointed.onNativeWindowCreated = onNativeWindowCreatedCallback.reinterpret()
}

private val allocator = MemoryAllocator()

private fun configureLogs(logLevel: WGPULogLevel = WGPULogLevel_Trace) {
    val callback = WGPULogCallback.allocate(allocator, object : WGPULogCallback {
        override fun invoke(level: WGPULogLevel, message: WGPUStringView?, userdata: NativeAddress?) {
            val kMessage = message?.data?.toKString(message.length)
            when (level) {
                WGPULogLevel_Error -> println("ERROR : $kMessage}")
                WGPULogLevel_Warn -> println("WARN : $kMessage")
                WGPULogLevel_Info -> println("INFO : $kMessage")
                WGPULogLevel_Debug -> println("DEBUG : $kMessage")
                WGPULogLevel_Trace -> println("TRACE : $kMessage")
            }
        }

    })
    wgpuSetLogLevel(logLevel)
    wgpuSetLogCallback(callback, allocator.bufferOfAddress(callback.handler).handler)
}

private fun COpaquePointer.toNativeAddress() = Pointer(reinterpret())