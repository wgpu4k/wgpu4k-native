// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.Callback
import ffi.CString
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress

expect interface WGPUDeviceLostCallback : Callback {
	fun invoke(reason: WGPUDeviceLostReason, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceLostCallback): CallbackHolder<WGPUDeviceLostCallback>
	}
}

expect interface WGPUErrorCallback : Callback {
	fun invoke(type: WGPUErrorType, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUErrorCallback): CallbackHolder<WGPUErrorCallback>
	}
}

expect interface WGPULogCallback : Callback {
	fun invoke(level: WGPULogLevel, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPULogCallback): CallbackHolder<WGPULogCallback>
	}
}

