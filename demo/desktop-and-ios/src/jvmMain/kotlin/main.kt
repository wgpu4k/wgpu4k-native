

import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Kernel32
import darwin.CAMetalLayer
import darwin.NSWindow
import ffi.LibraryLoader
import ffi.NativeAddress
import ffi.memoryScope
import io.ygdrasil.wgpu.HelloTriangleScene
import io.ygdrasil.wgpu.WGPUInstance
import io.ygdrasil.wgpu.WGPUSType_SurfaceDescriptorFromMetalLayer
import io.ygdrasil.wgpu.WGPUSType_SurfaceDescriptorFromWindowsHWND
import io.ygdrasil.wgpu.WGPUSType_SurfaceDescriptorFromXlibWindow
import io.ygdrasil.wgpu.WGPUSupportedLimits
import io.ygdrasil.wgpu.WGPUSurface
import io.ygdrasil.wgpu.WGPUSurfaceDescriptor
import io.ygdrasil.wgpu.WGPUSurfaceDescriptorFromMetalLayer
import io.ygdrasil.wgpu.WGPUSurfaceDescriptorFromWindowsHWND
import io.ygdrasil.wgpu.WGPUSurfaceDescriptorFromXlibWindow
import io.ygdrasil.wgpu.compatibleAlphaMode
import io.ygdrasil.wgpu.compatibleFormat
import io.ygdrasil.wgpu.configureLogs
import io.ygdrasil.wgpu.configureSurface
import io.ygdrasil.wgpu.getAdapter
import io.ygdrasil.wgpu.getDevice
import io.ygdrasil.wgpu.wgpuAdapterGetLimits
import io.ygdrasil.wgpu.wgpuCreateInstance
import io.ygdrasil.wgpu.wgpuInstanceCreateSurface
import org.lwjgl.glfw.GLFW.*
import org.lwjgl.glfw.GLFWNativeCocoa.glfwGetCocoaWindow
import org.lwjgl.glfw.GLFWNativeWin32.glfwGetWin32Window
import org.lwjgl.glfw.GLFWNativeX11.glfwGetX11Display
import org.lwjgl.glfw.GLFWNativeX11.glfwGetX11Window
import org.lwjgl.system.MemoryUtil.NULL
import org.rococoa.ID
import org.rococoa.Rococoa
import java.lang.foreign.MemorySegment

fun main() {
    val width = 640
    val height = 480
    val title = "GLFW+WebGPU"

    LibraryLoader.load()

    configureLogs()

    glfwInit()
    glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE)
    glfwWindowHint(GLFW_RESIZABLE, GLFW_FALSE)
    // Disable context creation, WGPU will manage that
    glfwWindowHint(GLFW_CLIENT_API, GLFW_NO_API)
    val windowHandler = glfwCreateWindow(width, height, title, NULL, NULL)

    val instance = wgpuCreateInstance(null) ?: error("fail to create instance")
    val surface = getSurface(instance, windowHandler)
    val adapter = getAdapter(surface, instance)

    memoryScope { scope ->
        val supportedLimits = WGPUSupportedLimits.allocate(scope)
        wgpuAdapterGetLimits(adapter, supportedLimits)
        println("Adapter limits: $supportedLimits")
    }

    val device = getDevice(adapter)
    val compatibleFormat = compatibleFormat(surface, adapter)
    val alphaMode = compatibleAlphaMode(surface, adapter)
    configureSurface(device, width, height, surface, compatibleFormat, alphaMode)

    val scene = HelloTriangleScene(device, compatibleFormat, surface)
    scene.initialize()

    glfwShowWindow(windowHandler)

    while (!glfwWindowShouldClose(windowHandler)) {
        scene.render()
        glfwPollEvents()
    }

    glfwDestroyWindow(windowHandler)
}

private fun getSurface(instance: WGPUInstance, window: Long): WGPUSurface = when (Platform.os) {
    Os.Linux -> {
        val display = glfwGetX11Display().toNativeAddress()
        val x11_window = glfwGetX11Window(window)
        getSurfaceFromX11Window(instance, display, x11_window) ?: error("fail to get surface on Linux")
    }
    Os.Window -> {
        val hwnd = glfwGetWin32Window(window).toNativeAddress()
        val hinstance = Kernel32.INSTANCE.GetModuleHandle(null).pointer.toNativeAddress()
        getSurfaceFromWindows(instance, hinstance, hwnd) ?: error("fail to get surface on Windows")
    }
    Os.MacOs -> {
        val nsWindowPtr = glfwGetCocoaWindow(window)
        val nswindow = Rococoa.wrap(ID.fromLong(nsWindowPtr), NSWindow::class.java)
        nswindow.contentView()?.setWantsLayer(true)
        val layer = CAMetalLayer.layer()
        nswindow.contentView()?.setLayer(layer.id().toLong().toPointer())
        getSurfaceFromMetalLayer(instance, layer.id().toLong().toNativeAddress())
    }
} ?: error("fail to get surface")


private fun getSurfaceFromMetalLayer(instance: WGPUInstance, metalLayer: NativeAddress): WGPUSurface? = memoryScope { scope ->

    val surfaceDescriptor = WGPUSurfaceDescriptor.allocate(scope).apply {
        nextInChain = WGPUSurfaceDescriptorFromMetalLayer.allocate(scope).apply {
            chain.sType = WGPUSType_SurfaceDescriptorFromMetalLayer
            layer = metalLayer
        }.handler
    }

    return wgpuInstanceCreateSurface(instance, surfaceDescriptor)
}

private fun getSurfaceFromX11Window(instance: WGPUInstance, display: NativeAddress, window: Long): WGPUSurface? = memoryScope { scope ->

    val surfaceDescriptor = WGPUSurfaceDescriptor.allocate(scope).apply {
        nextInChain = WGPUSurfaceDescriptorFromXlibWindow.allocate(scope).apply {
            chain.sType = WGPUSType_SurfaceDescriptorFromXlibWindow
            this.display = display
            this.window = window.toULong()
        }.handler
    }

    return wgpuInstanceCreateSurface(instance, surfaceDescriptor)
}

private fun getSurfaceFromWindows(instance: WGPUInstance, hinstance: NativeAddress, hwnd: NativeAddress): WGPUSurface? = memoryScope { scope ->

    val surfaceDescriptor = WGPUSurfaceDescriptor.allocate(scope).apply {
        nextInChain = WGPUSurfaceDescriptorFromWindowsHWND.allocate(scope).apply {
            chain.sType = WGPUSType_SurfaceDescriptorFromWindowsHWND
            this.hwnd = hwnd
            this.hinstance = hinstance
        }.handler
    }

    return wgpuInstanceCreateSurface(instance, surfaceDescriptor)
}

private fun Long.toPointer(): Pointer = Pointer(this)

fun Pointer.toNativeAddress() = let { MemorySegment.ofAddress(Pointer.nativeValue(this)) }
    .let { NativeAddress(it) }

fun Long.toNativeAddress() = let { MemorySegment.ofAddress(it) }
    .let { NativeAddress(it) }