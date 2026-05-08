// This file has been manually created to handle union type for NativeDisplayHandle
// DO NOT EDIT - This file is manually maintained
package io.ygdrasil.wgpu

import ffi.NativeAddress
import ffi.MemoryAllocator
import ffi.ArrayHolder
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.sizeOf
import webgpu.native.WGPUNativeDisplayHandle as CWGPUNativeDisplayHandle
import webgpu.native.WGPUXlibDisplayHandle as CWGPUXlibDisplayHandle
import webgpu.native.WGPUXcbDisplayHandle as CWGPUXcbDisplayHandle
import webgpu.native.WGPUWaylandDisplayHandle as CWGPUWaylandDisplayHandle

@OptIn(ExperimentalForeignApi::class)
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
        private val cPointer: CPointer<CWGPUNativeDisplayHandle>
            get() = handler.reinterpret<CWGPUNativeDisplayHandle>()
        
        override var type: WGPUNativeDisplayHandleType
            get() = cPointer.pointed.type
            set(newValue) { cPointer.pointed.type = newValue }
        
        override val xlib: WGPUXlibDisplayHandle?
            get() = if (type == WGPUNativeDisplayHandleType_Xlib) {
                WGPUXlibDisplayHandle.ByReference(handler) 
            } else null
        
        override val xcb: WGPUXcbDisplayHandle?
            get() = if (type == WGPUNativeDisplayHandleType_Xcb) {
                WGPUXcbDisplayHandle.ByReference(handler) 
            } else null
        
        override val wayland: WGPUWaylandDisplayHandle?
            get() = if (type == WGPUNativeDisplayHandleType_Wayland) {
                WGPUWaylandDisplayHandle.ByReference(handler) 
            } else null
        
        override fun setXlib(value: WGPUXlibDisplayHandle) {
            type = WGPUNativeDisplayHandleType_Xlib
            val target = handler.reinterpret<CWGPUXlibDisplayHandle>().pointed
            val source = (value as WGPUXlibDisplayHandle.ByReference).handler.reinterpret<CWGPUXlibDisplayHandle>().pointed
            target.display = source.display
            target.screen = source.screen
        }
        
        override fun setXcb(value: WGPUXcbDisplayHandle) {
            type = WGPUNativeDisplayHandleType_Xcb
            val target = handler.reinterpret<CWGPUXcbDisplayHandle>().pointed
            val source = (value as WGPUXcbDisplayHandle.ByReference).handler.reinterpret<CWGPUXcbDisplayHandle>().pointed
            target.connection = source.connection
            target.screen = source.screen
        }
        
        override fun setWayland(value: WGPUWaylandDisplayHandle) {
            type = WGPUNativeDisplayHandleType_Wayland
            val target = handler.reinterpret<CWGPUWaylandDisplayHandle>().pointed
            val source = (value as WGPUWaylandDisplayHandle.ByReference).handler.reinterpret<CWGPUWaylandDisplayHandle>().pointed
            target.display = source.display
        }
    }
    
    actual companion object {
        actual operator fun invoke(address: NativeAddress): WGPUNativeDisplayHandle {
            return ByReference(address)
        }
        
        actual fun allocate(allocator: MemoryAllocator): WGPUNativeDisplayHandle {
            // Allocate max size of union members
            val maxSize = maxOf(
                sizeOf<CWGPUXlibDisplayHandle>(),
                sizeOf<CWGPUXcbDisplayHandle>(),
                sizeOf<CWGPUWaylandDisplayHandle>()
            )
            return ByReference(allocator.allocate(maxSize.toLong()))
        }
        
        actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUNativeDisplayHandle) -> Unit): ArrayHolder<WGPUNativeDisplayHandle> {
            val maxSize = maxOf(
                sizeOf<CWGPUXlibDisplayHandle>(),
                sizeOf<CWGPUXcbDisplayHandle>(),
                sizeOf<CWGPUWaylandDisplayHandle>()
            )
            return allocator.allocate(maxSize * size.toLong())
                .also {
                    (0u until size).forEach { index ->
                        (it.rawValue + index.toLong() * maxSize)
                            .let(::NativeAddress)
                            .let { invoke(it) }
                            .let { provider(index, it) }
                    }
                }
                .let(::ArrayHolder)
        }
    }
}
