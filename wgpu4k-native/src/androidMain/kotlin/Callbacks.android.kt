// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.Callback
import ffi.CString
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress

actual interface WGPUDeviceLostCallback : Callback {
	actual fun invoke(reason: WGPUDeviceLostReason, message: CString?, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(reason: Int, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceLostCallback): CallbackHolder<WGPUDeviceLostCallback> {
			val callbackFunction = object : Function {
				override fun apply(reason: Int, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?) {
					callback.invoke(reason.toUInt(), message?.let { CString(it) }, userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual interface WGPUErrorCallback : Callback {
	actual fun invoke(type: WGPUErrorType, message: CString?, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(type: Int, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUErrorCallback): CallbackHolder<WGPUErrorCallback> {
			val callbackFunction = object : Function {
				override fun apply(type: Int, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?) {
					callback.invoke(type.toUInt(), message?.let { CString(it) }, userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual interface WGPULogCallback : Callback {
	actual fun invoke(level: WGPULogLevel, message: CString?, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(level: Int, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPULogCallback): CallbackHolder<WGPULogCallback> {
			val callbackFunction = object : Function {
				override fun apply(level: Int, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?) {
					callback.invoke(level.toUInt(), message?.let { CString(it) }, userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

