@file:OptIn(ExperimentalForeignApi::class)

import cnames.structs.GLFWwindow
import glfw.glfwGetWin32Window
import kotlinx.cinterop.*
import platform.windows.GetModuleHandle
import ffi.NativeAddress
import ffi.memoryScope
import io.ygdrasil.wgpu.WGPUInstance
import io.ygdrasil.wgpu.WGPUSurface
import io.ygdrasil.wgpu.WGPUSurfaceDescriptor
import io.ygdrasil.wgpu.WGPUSType_SurfaceDescriptorFromWindowsHWND
import io.ygdrasil.wgpu.WGPUSurfaceDescriptorFromWindowsHWND
import io.ygdrasil.wgpu.wgpuInstanceCreateSurface

actual fun getSurface(instance: WGPUInstance, window: CPointer<GLFWwindow>): WGPUSurface {
    val hwnd = glfwGetWin32Window(window)  ?: error("fail to get hwnd")
    val hinstance: COpaquePointer = GetModuleHandle?.invoke(null)
        ?.let { interpretCPointer<COpaque>(it.rawValue) }
        ?.reinterpret() ?: error("fail to get hinstance")
    return getSurfaceFromWindows(instance, hinstance, hwnd) ?: error("fail to get surface on Windows")
}

fun getSurfaceFromWindows(instance: WGPUInstance, hinstance: COpaquePointer, hwnd: COpaquePointer): WGPUSurface? = memoryScope { scope ->

    val surfaceDescriptor = WGPUSurfaceDescriptor.allocate(scope).apply {
        nextInChain = WGPUSurfaceDescriptorFromWindowsHWND.allocate(scope).apply {
            chain.sType = WGPUSType_SurfaceDescriptorFromWindowsHWND
            this.hwnd = hwnd.let(::NativeAddress)
            this.hinstance = hinstance.let(::NativeAddress)
        }.handler
    }

    return wgpuInstanceCreateSurface(instance, surfaceDescriptor)
}