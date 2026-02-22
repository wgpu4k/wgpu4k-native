// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.CString
import ffi.Callback
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress

public expect fun interface WGPUBufferMapCallback : Callback {
	public fun invoke(
		status: WGPUMapAsyncStatus,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPUBufferMapCallback): CallbackHolder<WGPUBufferMapCallback>
	}
}

public expect fun interface WGPUCompilationInfoCallback : Callback {
	public fun invoke(
		status: WGPUCompilationInfoRequestStatus,
		compilationInfo: WGPUCompilationInfo?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPUCompilationInfoCallback): CallbackHolder<WGPUCompilationInfoCallback>
	}
}

public expect fun interface WGPUCreateComputePipelineAsyncCallback : Callback {
	public fun invoke(
		status: WGPUCreatePipelineAsyncStatus,
		pipeline: WGPUComputePipeline?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPUCreateComputePipelineAsyncCallback): CallbackHolder<WGPUCreateComputePipelineAsyncCallback>
	}
}

public expect fun interface WGPUCreateRenderPipelineAsyncCallback : Callback {
	public fun invoke(
		status: WGPUCreatePipelineAsyncStatus,
		pipeline: WGPURenderPipeline?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPUCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>
	}
}

public expect fun interface WGPUDeviceLostCallback : Callback {
	public fun invoke(
		device: WGPUDevice?,
		reason: WGPUDeviceLostReason,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceLostCallback): CallbackHolder<WGPUDeviceLostCallback>
	}
}

public expect fun interface WGPUPopErrorScopeCallback : Callback {
	public fun invoke(
		status: WGPUPopErrorScopeStatus,
		type: WGPUErrorType,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPUPopErrorScopeCallback): CallbackHolder<WGPUPopErrorScopeCallback>
	}
}

public expect fun interface WGPUQueueWorkDoneCallback : Callback {
	public fun invoke(
		status: WGPUQueueWorkDoneStatus,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPUQueueWorkDoneCallback): CallbackHolder<WGPUQueueWorkDoneCallback>
	}
}

public expect fun interface WGPURequestAdapterCallback : Callback {
	public fun invoke(
		status: WGPURequestAdapterStatus,
		adapter: WGPUAdapter?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPURequestAdapterCallback): CallbackHolder<WGPURequestAdapterCallback>
	}
}

public expect fun interface WGPURequestDeviceCallback : Callback {
	public fun invoke(
		status: WGPURequestDeviceStatus,
		device: WGPUDevice?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPURequestDeviceCallback): CallbackHolder<WGPURequestDeviceCallback>
	}
}

public expect fun interface WGPUUncapturedErrorCallback : Callback {
	public fun invoke(
		device: WGPUDevice?,
		type: WGPUErrorType,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPUUncapturedErrorCallback): CallbackHolder<WGPUUncapturedErrorCallback>
	}
}

public expect fun interface WGPULogCallback : Callback {
	public fun invoke(
		level: WGPULogLevel,
		message: WGPUStringView?,
		userdata: NativeAddress?,
	)

	public companion object {
		public fun allocate(allocator: MemoryAllocator, callback: WGPULogCallback): CallbackHolder<WGPULogCallback>
	}
}
