package io.ygdrasil.wgpu

import ffi.ArrayHolder
import ffi.MemoryAllocator
import ffi.NativeAddress
import ffi.memoryScope

val allocator = MemoryAllocator()

fun configureLogs(logLevel: WGPULogLevel = WGPULogLevel_Trace) {
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


fun configureSurface(
    device: WGPUDevice,
    width: Int,
    height: Int,
    surface: WGPUSurface,
    renderingContextFormat: UInt,
    alphaMode: UInt,
    viewFormats: List<WGPUTextureFormat> = listOf()
) {
    memoryScope { scope ->
        val configuration = WGPUSurfaceConfiguration.allocate(scope).also {
            it.device = device
            it.format = renderingContextFormat
            it.usage = WGPUTextureUsage_RenderAttachment
            it.width = width.toUInt()
            it.height = height.toUInt()
            it.alphaMode = alphaMode
            if (viewFormats.isNotEmpty()) {
                it.viewFormatCount = viewFormats.size.toULong()
                it.viewFormats = scope.allocateBuffer(viewFormats.size.toULong() * UInt.SIZE_BYTES.toULong())
                    .also { buffer -> buffer.writeUInts(viewFormats.toUIntArray())}
                    .let { ArrayHolder(it.handler) }
            }
        }
        wgpuSurfaceConfigure(surface, configuration)
    }
}

fun getDevice(adapter: WGPUAdapter): WGPUDevice = memoryScope { scope ->
    var fetchedDevice: WGPUDevice? = null

    val callback = WGPURequestDeviceCallback.allocate(scope) { status, device, _, _, _ ->
        if (status != WGPURequestDeviceStatus_Success && device == null) error("fail to get device")
        fetchedDevice = device
    }

    val callbackInfo = WGPURequestDeviceCallbackInfo.allocate(scope).apply {
        this.callback = callback
        this.userdata2 = scope.bufferOfAddress(callback.handler).handler
    }

    wgpuAdapterRequestDevice(adapter, null, callbackInfo)

    fetchedDevice ?: error("fail to get device")
}

fun getAdapter(surface: WGPUSurface, instance: WGPUInstance, backendType: UInt = WGPUBackendType_Undefined) = memoryScope { scope ->
    val callbackInfo = WGPURequestAdapterCallbackInfo.allocate(scope)
    val options = WGPURequestAdapterOptions.allocate(scope).apply {
        compatibleSurface = surface
        this.backendType = backendType
    }

    var fetchedAdapter: WGPUAdapter? = null

    val callback = WGPURequestAdapterCallback.allocate(scope) { status, adapter, _, _, _ ->
        if (status != WGPURequestAdapterStatus_Success || adapter == null) error("fail to get adapter")
        fetchedAdapter = adapter
    }

    callbackInfo.callback = callback
    callbackInfo.userdata2 = scope.bufferOfAddress(callback.handler).handler

    wgpuInstanceRequestAdapter(instance, options, callbackInfo)

    fetchedAdapter ?: error("fail to get adapter")
}

fun getSurfaceFromMetalLayer(instance: WGPUInstance, metalLayer: NativeAddress): WGPUSurface? = memoryScope { scope ->

    val surfaceDescriptor = WGPUSurfaceDescriptor.allocate(scope).apply {
        nextInChain = WGPUSurfaceSourceMetalLayer.allocate(scope).apply {
            chain.sType = WGPUSType_SurfaceSourceMetalLayer
            layer = metalLayer
        }.handler
    }

    return wgpuInstanceCreateSurface(instance, surfaceDescriptor)
}

fun getSurfaceAndroidView(
    instance: WGPUInstance,
    surfaceHolder: NativeAddress
): WGPUSurface = memoryScope { scope ->

    val surfaceDescriptor = WGPUSurfaceDescriptor.allocate(scope).apply {
        nextInChain = WGPUSurfaceSourceAndroidNativeWindow.allocate(scope).apply {
            chain.sType = WGPUSType_SurfaceSourceAndroidNativeWindow
            window = surfaceHolder
        }.handler
    }

    wgpuInstanceCreateSurface(instance, surfaceDescriptor) ?: error("fail to create surface")
}


fun getSurfaceFromX11Window(instance: WGPUInstance, display: NativeAddress, window: ULong): WGPUSurface? = memoryScope { scope ->

    val surfaceDescriptor = WGPUSurfaceDescriptor.allocate(scope).apply {
        nextInChain = WGPUSurfaceSourceXlibWindow.allocate(scope).apply {
            chain.sType = WGPUSType_SurfaceSourceXlibWindow
            this.display = display
            this.window = window
        }.handler
    }

    return wgpuInstanceCreateSurface(instance, surfaceDescriptor)
}

fun getSurfaceFromWindows(instance: WGPUInstance, hinstance: NativeAddress, hwnd: NativeAddress): WGPUSurface? = memoryScope { scope ->

    val surfaceDescriptor = WGPUSurfaceDescriptor.allocate(scope).apply {
        nextInChain = WGPUSurfaceSourceWindowsHWND.allocate(scope).apply {
            chain.sType = WGPUSType_SurfaceSourceWindowsHWND
            this.hwnd = hwnd
            this.hinstance = hinstance
        }.handler
    }

    return wgpuInstanceCreateSurface(instance, surfaceDescriptor)
}