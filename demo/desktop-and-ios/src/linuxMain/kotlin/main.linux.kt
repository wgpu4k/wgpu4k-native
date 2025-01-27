@file:OptIn(ExperimentalForeignApi::class)

package io.ygdrasil.wgpu

import cnames.structs.GLFWwindow
import ffi.memoryScope
import ffi.NativeAddress
import glfw.glfwGetX11Display
import glfw.glfwGetX11Window
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.reinterpret

actual fun getSurface(instance: WGPUInstance, window: CPointer<GLFWwindow>): WGPUSurface {

    val display = glfwGetX11Display(window) ?: error("fail to get X11 display")
    val x11_window = glfwGetX11Window(window).takeIf { it != 0uL } ?: error("fail to get X11 window")

    return getSurfaceFromX11Window(instance, display.let(::NativeAddress), x11_window) ?: error("fail to get surface on MacOs")
}

