// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.Callback
import ffi.CString
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress

expect fun interface WGPUDeviceLostCallback : Callback {
	fun invoke(reason: WGPUDeviceLostReason, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceLostCallback): CallbackHolder<WGPUDeviceLostCallback>
	}
}

expect fun interface WGPUErrorCallback : Callback {
	fun invoke(type: WGPUErrorType, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUErrorCallback): CallbackHolder<WGPUErrorCallback>
	}
}

expect fun interface WGPULogCallback : Callback {
	fun invoke(level: WGPULogLevel, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPULogCallback): CallbackHolder<WGPULogCallback>
	}
}

expect fun interface WGPUAdapterRequestDeviceCallback : Callback {
	fun invoke(status: WGPURequestDeviceStatus, device: WGPUDevice?, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUAdapterRequestDeviceCallback): CallbackHolder<WGPUAdapterRequestDeviceCallback>
	}
}

expect fun interface WGPUBufferMapAsyncCallback : Callback {
	fun invoke(status: WGPUBufferMapAsyncStatus, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUBufferMapAsyncCallback): CallbackHolder<WGPUBufferMapAsyncCallback>
	}
}

expect fun interface WGPUDeviceCreateComputePipelineAsyncCallback : Callback {
	fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPUComputePipeline?, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceCreateComputePipelineAsyncCallback): CallbackHolder<WGPUDeviceCreateComputePipelineAsyncCallback>
	}
}

expect fun interface WGPUDeviceCreateRenderPipelineAsyncCallback : Callback {
	fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPURenderPipeline?, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUDeviceCreateRenderPipelineAsyncCallback>
	}
}

expect fun interface WGPUInstanceRequestAdapterCallback : Callback {
	fun invoke(status: WGPURequestAdapterStatus, adapter: WGPUAdapter?, message: CString?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUInstanceRequestAdapterCallback): CallbackHolder<WGPUInstanceRequestAdapterCallback>
	}
}

expect fun interface WGPUQueueOnSubmittedWorkDoneCallback : Callback {
	fun invoke(status: WGPUQueueWorkDoneStatus, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUQueueOnSubmittedWorkDoneCallback): CallbackHolder<WGPUQueueOnSubmittedWorkDoneCallback>
	}
}

expect fun interface WGPUShaderModuleGetCompilationInfoCallback : Callback {
	fun invoke(status: WGPUCompilationInfoRequestStatus, compilationInfo: WGPUCompilationInfo?, userdata: NativeAddress?)
	companion object {
		fun allocate(allocator: MemoryAllocator, callback: WGPUShaderModuleGetCompilationInfoCallback): CallbackHolder<WGPUShaderModuleGetCompilationInfoCallback>
	}
}

