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

expect interface WGPURequestDeviceCallback : Callback {
	fun invoke(status: WGPURequestDeviceStatus, device: WGPUDevice?, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPURequestDeviceCallback): CallbackHolder<WGPURequestDeviceCallback>
	}
}

expect interface WGPUMapAsyncCallback : Callback {
	fun invoke(status: WGPUBufferMapAsyncStatus, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUMapAsyncCallback): CallbackHolder<WGPUMapAsyncCallback>
	}
}

expect interface WGPUCreateComputePipelineAsyncCallback : Callback {
	fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPUComputePipeline?, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUCreateComputePipelineAsyncCallback): CallbackHolder<WGPUCreateComputePipelineAsyncCallback>
	}
}

expect interface WGPUCreateRenderPipelineAsyncCallback : Callback {
	fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPURenderPipeline?, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>
	}
}

expect interface WGPURequestAdapterCallback : Callback {
	fun invoke(status: WGPURequestAdapterStatus, adapter: WGPUAdapter?, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPURequestAdapterCallback): CallbackHolder<WGPURequestAdapterCallback>
	}
}

expect interface WGPUOnSubmittedWorkDoneCallback : Callback {
	fun invoke(status: WGPUQueueWorkDoneStatus, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUOnSubmittedWorkDoneCallback): CallbackHolder<WGPUOnSubmittedWorkDoneCallback>
	}
}

expect interface WGPUGetCompilationInfoCallback : Callback {
	fun invoke(status: WGPUCompilationInfoRequestStatus, compilationInfo: WGPUCompilationInfo?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUGetCompilationInfoCallback): CallbackHolder<WGPUGetCompilationInfoCallback>
	}
}

