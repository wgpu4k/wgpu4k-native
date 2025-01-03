// This file has been generated DO NOT EDIT !!!
@file:OptIn(ExperimentalForeignApi::class)

package io.ygdrasil.wgpu

import ffi.CString
import ffi.Callback
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress
import ffi.findCallback
import ffi.registerCallback
import ffi.globalMemory
import kotlinx.cinterop.COpaque
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.useContents
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.LongVar
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

actual fun interface WGPUDeviceLostCallback : Callback {
	actual fun invoke(reason: WGPUDeviceLostReason, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceLostCallback): CallbackHolder<WGPUDeviceLostCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { reason: UInt, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUDeviceLostCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUDeviceLostCallback")
				callback.invoke(reason, message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUErrorCallback : Callback {
	actual fun invoke(type: WGPUErrorType, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUErrorCallback): CallbackHolder<WGPUErrorCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { type: UInt, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUErrorCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUErrorCallback")
				callback.invoke(type, message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPULogCallback : Callback {
	actual fun invoke(level: WGPULogLevel, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPULogCallback): CallbackHolder<WGPULogCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { level: UInt, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPULogCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPULogCallback")
				callback.invoke(level, message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPURequestDeviceCallback : Callback {
	actual fun invoke(status: WGPURequestDeviceStatus, device: WGPUDevice?, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestDeviceCallback): CallbackHolder<WGPURequestDeviceCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, device: COpaquePointer?, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPURequestDeviceCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPURequestDeviceCallback")
				callback.invoke(status, device?.let(::NativeAddress)?.let(::WGPUDevice), message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUMapAsyncCallback : Callback {
	actual fun invoke(status: WGPUBufferMapAsyncStatus, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUMapAsyncCallback): CallbackHolder<WGPUMapAsyncCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUMapAsyncCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUMapAsyncCallback")
				callback.invoke(status, userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUCreateComputePipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPUComputePipeline?, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateComputePipelineAsyncCallback): CallbackHolder<WGPUCreateComputePipelineAsyncCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, pipeline: COpaquePointer?, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUCreateComputePipelineAsyncCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUCreateComputePipelineAsyncCallback")
				callback.invoke(status, pipeline?.let(::NativeAddress)?.let(::WGPUComputePipeline), message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUCreateRenderPipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPURenderPipeline?, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUCreateRenderPipelineAsyncCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, pipeline: COpaquePointer?, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUCreateRenderPipelineAsyncCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUCreateRenderPipelineAsyncCallback")
				callback.invoke(status, pipeline?.let(::NativeAddress)?.let(::WGPURenderPipeline), message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPURequestAdapterCallback : Callback {
	actual fun invoke(status: WGPURequestAdapterStatus, adapter: WGPUAdapter?, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestAdapterCallback): CallbackHolder<WGPURequestAdapterCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, adapter: COpaquePointer?, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPURequestAdapterCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPURequestAdapterCallback")
				callback.invoke(status, adapter?.let(::NativeAddress)?.let(::WGPUAdapter), message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUOnSubmittedWorkDoneCallback : Callback {
	actual fun invoke(status: WGPUQueueWorkDoneStatus, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUOnSubmittedWorkDoneCallback): CallbackHolder<WGPUOnSubmittedWorkDoneCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUOnSubmittedWorkDoneCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUOnSubmittedWorkDoneCallback")
				callback.invoke(status, userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUGetCompilationInfoCallback : Callback {
	actual fun invoke(status: WGPUCompilationInfoRequestStatus, compilationInfo: WGPUCompilationInfo?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUGetCompilationInfoCallback): CallbackHolder<WGPUGetCompilationInfoCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, compilationInfo: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUGetCompilationInfoCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUGetCompilationInfoCallback")
				callback.invoke(status, compilationInfo?.let(::NativeAddress)?.let { WGPUCompilationInfo(it) }, userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

