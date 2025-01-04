// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.Callback
import ffi.CString
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress

actual fun interface WGPUDeviceLostCallback : Callback {
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

actual fun interface WGPUErrorCallback : Callback {
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

actual fun interface WGPULogCallback : Callback {
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

actual fun interface WGPUAdapterRequestDeviceCallback : Callback {
	actual fun invoke(status: WGPURequestDeviceStatus, device: WGPUDevice?, message: CString?, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, device: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUAdapterRequestDeviceCallback): CallbackHolder<WGPUAdapterRequestDeviceCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, device: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), device?.let { WGPUDevice(it) }, message?.let { CString(it) }, userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual fun interface WGPUBufferMapAsyncCallback : Callback {
	actual fun invoke(status: WGPUBufferMapAsyncStatus, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUBufferMapAsyncCallback): CallbackHolder<WGPUBufferMapAsyncCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, userdata: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual fun interface WGPUDeviceCreateComputePipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPUComputePipeline?, message: CString?, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, pipeline: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceCreateComputePipelineAsyncCallback): CallbackHolder<WGPUDeviceCreateComputePipelineAsyncCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, pipeline: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), pipeline?.let { WGPUComputePipeline(it) }, message?.let { CString(it) }, userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual fun interface WGPUDeviceCreateRenderPipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPURenderPipeline?, message: CString?, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, pipeline: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUDeviceCreateRenderPipelineAsyncCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, pipeline: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), pipeline?.let { WGPURenderPipeline(it) }, message?.let { CString(it) }, userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual fun interface WGPUInstanceRequestAdapterCallback : Callback {
	actual fun invoke(status: WGPURequestAdapterStatus, adapter: WGPUAdapter?, message: CString?, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, adapter: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUInstanceRequestAdapterCallback): CallbackHolder<WGPUInstanceRequestAdapterCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, adapter: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), adapter?.let { WGPUAdapter(it) }, message?.let { CString(it) }, userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual fun interface WGPUQueueOnSubmittedWorkDoneCallback : Callback {
	actual fun invoke(status: WGPUQueueWorkDoneStatus, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUQueueOnSubmittedWorkDoneCallback): CallbackHolder<WGPUQueueOnSubmittedWorkDoneCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, userdata: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual fun interface WGPUShaderModuleGetCompilationInfoCallback : Callback {
	actual fun invoke(status: WGPUCompilationInfoRequestStatus, compilationInfo: WGPUCompilationInfo?, userdata: NativeAddress?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, compilationInfo: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUShaderModuleGetCompilationInfoCallback): CallbackHolder<WGPUShaderModuleGetCompilationInfoCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, compilationInfo: com.sun.jna.Pointer?, userdata: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), compilationInfo?.let { WGPUCompilationInfo(it) }, userdata ?: com.sun.jna.Pointer(0))
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

