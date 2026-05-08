// This file has been manually created to handle union type for NativeDisplayHandle
// DO NOT EDIT - This file is manually maintained
package io.ygdrasil.wgpu

import ffi.NativeAddress
import ffi.MemoryAllocator
import ffi.ArrayHolder

actual interface WGPUNativeDisplayHandle {
    actual var type: WGPUNativeDisplayHandleType
    actual val xlib: WGPUXlibDisplayHandle?
    actual val xcb: WGPUXcbDisplayHandle?
    actual val wayland: WGPUWaylandDisplayHandle?
    actual fun setXlib(value: WGPUXlibDisplayHandle)
    actual fun setXcb(value: WGPUXcbDisplayHandle)
    actual fun setWayland(value: WGPUWaylandDisplayHandle)
    actual val handler: NativeAddress
    
    class ByReference(override val handler: NativeAddress) : WGPUNativeDisplayHandle {
        // Storage for union data
        private var _type: WGPUNativeDisplayHandleType = WGPUNativeDisplayHandleType_None
        private var _xlibDisplay: NativeAddress? = null
        private var _xlibScreen: Int = 0
        private var _xcbConnection: NativeAddress? = null
        private var _xcbScreen: Int = 0
        private var _waylandDisplay: NativeAddress? = null
        
        override var type: WGPUNativeDisplayHandleType
            get() = _type
            set(newValue) { _type = newValue }
        
        override val xlib: WGPUXlibDisplayHandle?
            get() = if (type == WGPUNativeDisplayHandleType_Xlib) {
                object : WGPUXlibDisplayHandle {
                    override var display: NativeAddress? = _xlibDisplay
                    override var screen: Int = _xlibScreen
                    override val handler: NativeAddress = this@ByReference.handler
                }
            } else null
        
        override val xcb: WGPUXcbDisplayHandle?
            get() = if (type == WGPUNativeDisplayHandleType_Xcb) {
                object : WGPUXcbDisplayHandle {
                    override var connection: NativeAddress? = _xcbConnection
                    override var screen: Int = _xcbScreen
                    override val handler: NativeAddress = this@ByReference.handler
                }
            } else null
        
        override val wayland: WGPUWaylandDisplayHandle?
            get() = if (type == WGPUNativeDisplayHandleType_Wayland) {
                object : WGPUWaylandDisplayHandle {
                    override var display: NativeAddress? = _waylandDisplay
                    override val handler: NativeAddress = this@ByReference.handler
                }
            } else null
        
        override fun setXlib(value: WGPUXlibDisplayHandle) {
            type = WGPUNativeDisplayHandleType_Xlib
            _xlibDisplay = value.display
            _xlibScreen = value.screen
        }
        
        override fun setXcb(value: WGPUXcbDisplayHandle) {
            type = WGPUNativeDisplayHandleType_Xcb
            _xcbConnection = value.connection
            _xcbScreen = value.screen
        }
        
        override fun setWayland(value: WGPUWaylandDisplayHandle) {
            type = WGPUNativeDisplayHandleType_Wayland
            _waylandDisplay = value.display
        }
    }
    
    actual companion object {
        actual operator fun invoke(address: NativeAddress): WGPUNativeDisplayHandle {
            return ByReference(address)
        }
        
        actual fun allocate(allocator: MemoryAllocator): WGPUNativeDisplayHandle {
            // Allocate max size of union members (Xlib, Xcb, Wayland)
            // Each is 16 bytes: 8 bytes pointer + 4 bytes int + 4 bytes padding
            return ByReference(allocator.allocate(16))
        }
        
        actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUNativeDisplayHandle) -> Unit): ArrayHolder<WGPUNativeDisplayHandle> {
            val elementSize = 16L // Size of largest union member
            return allocator.allocate(elementSize * size.toLong())
                .also {
                    (0u until size).forEach { index ->
                        it.handler.asSlice(index.toLong() * elementSize)
                            .let(::NativeAddress)
                            .let { ByReference(it) }
                            .let { provider(index, it) }
                    }
                }
                .let(::ArrayHolder)
        }
    }
}
