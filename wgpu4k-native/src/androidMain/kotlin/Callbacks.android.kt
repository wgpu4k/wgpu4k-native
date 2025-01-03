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

actual interface WGPURequestDeviceCallback : Callback {
	actual fun invoke(status: WGPURequestDeviceStatus, device: WGPUDevice?, message: CString?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, device: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestDeviceCallback): CallbackHolder<WGPURequestDeviceCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, device: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), device?.let { WGPUDevice(it) }, message?.let { CString(it) })
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual interface WGPUMapAsyncCallback : Callback {
	actual fun invoke(status: WGPUBufferMapAsyncStatus)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUMapAsyncCallback): CallbackHolder<WGPUMapAsyncCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int) {
					callback.invoke(status.toUInt())
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual interface WGPUCreateComputePipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPUComputePipeline?, message: CString?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, pipeline: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateComputePipelineAsyncCallback): CallbackHolder<WGPUCreateComputePipelineAsyncCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, pipeline: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), pipeline?.let { WGPUComputePipeline(it) }, message?.let { CString(it) })
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual interface WGPUCreateRenderPipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPURenderPipeline?, message: CString?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, pipeline: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUCreateRenderPipelineAsyncCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, pipeline: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), pipeline?.let { WGPURenderPipeline(it) }, message?.let { CString(it) })
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual interface WGPURequestAdapterCallback : Callback {
	actual fun invoke(status: WGPURequestAdapterStatus, adapter: WGPUAdapter?, message: CString?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, adapter: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestAdapterCallback): CallbackHolder<WGPURequestAdapterCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, adapter: com.sun.jna.Pointer?, message: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), adapter?.let { WGPUAdapter(it) }, message?.let { CString(it) })
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual interface WGPUOnSubmittedWorkDoneCallback : Callback {
	actual fun invoke(status: WGPUQueueWorkDoneStatus)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUOnSubmittedWorkDoneCallback): CallbackHolder<WGPUOnSubmittedWorkDoneCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int) {
					callback.invoke(status.toUInt())
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

actual interface WGPUGetCompilationInfoCallback : Callback {
	actual fun invoke(status: WGPUCompilationInfoRequestStatus, compilationInfo: WGPUCompilationInfo?)
	interface Function : com.sun.jna.Callback {
		fun apply(status: Int, compilationInfo: com.sun.jna.Pointer?)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUGetCompilationInfoCallback): CallbackHolder<WGPUGetCompilationInfoCallback> {
			val callbackFunction = object : Function {
				override fun apply(status: Int, compilationInfo: com.sun.jna.Pointer?) {
					callback.invoke(status.toUInt(), compilationInfo?.let { WGPUCompilationInfo(it) })
				}
			}
			return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)
		}
	}
}

