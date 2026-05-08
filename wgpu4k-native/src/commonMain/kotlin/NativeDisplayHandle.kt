// This file has been manually created to handle union type for NativeDisplayHandle
// DO NOT EDIT - This file is manually maintained
package io.ygdrasil.wgpu

import ffi.NativeAddress
import ffi.MemoryAllocator
import ffi.ArrayHolder

/**
 * Manual implementation for WGPUNativeDisplayHandle with union data support.
 * The data field is a tagged union that can hold Xlib, XCB, or Wayland display handle.
 */
expect interface WGPUNativeDisplayHandle {
    
    /** The type of display handle stored in the union */
    var type: WGPUNativeDisplayHandleType
    
    /** Access Xlib display handle. Valid only when type == WGPUNativeDisplayHandleType_Xlib */
    val xlib: WGPUXlibDisplayHandle?
    
    /** Access XCB display handle. Valid only when type == WGPUNativeDisplayHandleType_Xcb */
    val xcb: WGPUXcbDisplayHandle?
    
    /** Access Wayland display handle. Valid only when type == WGPUNativeDisplayHandleType_Wayland */
    val wayland: WGPUWaylandDisplayHandle?
    
    /** Set Xlib display handle */
    fun setXlib(value: WGPUXlibDisplayHandle)
    
    /** Set XCB display handle */
    fun setXcb(value: WGPUXcbDisplayHandle)
    
    /** Set Wayland display handle */
    fun setWayland(value: WGPUWaylandDisplayHandle)
    
    /** Native address of this structure */
    val handler: NativeAddress
    
    companion object {
        /** Create from native address */
        operator fun invoke(address: NativeAddress): WGPUNativeDisplayHandle
        
        /** Allocate new instance */
        fun allocate(allocator: MemoryAllocator): WGPUNativeDisplayHandle
        
        /** Allocate array */
        fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUNativeDisplayHandle) -> Unit): ArrayHolder<WGPUNativeDisplayHandle>
    }
}
