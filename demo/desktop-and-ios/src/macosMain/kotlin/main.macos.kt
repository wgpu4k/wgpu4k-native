@file:OptIn(ExperimentalForeignApi::class)

import cnames.structs.GLFWwindow
import ffi.memoryScope
import ffi.NativeAddress
import glfw.glfwGetCocoaWindow
import kotlinx.cinterop.*
import platform.AppKit.NSWindow
import platform.QuartzCore.CAMetalLayer
import io.ygdrasil.wgpu.WGPUInstance
import io.ygdrasil.wgpu.WGPUSType_SurfaceDescriptorFromMetalLayer
import io.ygdrasil.wgpu.WGPUSurface
import io.ygdrasil.wgpu.WGPUSurfaceDescriptor
import io.ygdrasil.wgpu.WGPUSurfaceDescriptorFromMetalLayer
import io.ygdrasil.wgpu.wgpuInstanceCreateSurface

actual fun getSurface(instance: WGPUInstance, window: CPointer<GLFWwindow>): WGPUSurface {
    val nsWindow = interpretObjCPointer<NSWindow>(glfwGetCocoaWindow(window).rawValue)
    nsWindow.contentView()?.setWantsLayer(true)
    val layer = CAMetalLayer.layer()
    nsWindow.contentView()?.setLayer(layer)
    val layerPointer: COpaquePointer = interpretCPointer<COpaque>(layer.objcPtr())!!.reinterpret()
    return getSurfaceFromMetalLayer(instance, layerPointer) ?: error("fail to get surface on MacOs")
}

private fun getSurfaceFromMetalLayer(instance: WGPUInstance, metalLayer: COpaquePointer): WGPUSurface? = memoryScope { scope ->

    val surfaceDescriptor = WGPUSurfaceDescriptor.allocate(scope).apply {
        nextInChain = WGPUSurfaceDescriptorFromMetalLayer.allocate(scope).apply {
            chain.sType = WGPUSType_SurfaceDescriptorFromMetalLayer
            layer = metalLayer.let(::NativeAddress)
        }.handler
    }

    return wgpuInstanceCreateSurface(instance, surfaceDescriptor)
}