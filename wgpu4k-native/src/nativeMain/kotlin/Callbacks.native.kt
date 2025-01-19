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

actual fun interface WGPUAdapterRequestDeviceCallback : Callback {
	actual fun invoke(status: WGPURequestDeviceStatus, device: WGPUDevice?, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUAdapterRequestDeviceCallback): CallbackHolder<WGPUAdapterRequestDeviceCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, device: COpaquePointer?, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUAdapterRequestDeviceCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUAdapterRequestDeviceCallback")
				callback.invoke(status, device?.let(::NativeAddress)?.let(::WGPUDevice), message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUBufferMapAsyncCallback : Callback {
	actual fun invoke(status: WGPUBufferMapAsyncStatus, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUBufferMapAsyncCallback): CallbackHolder<WGPUBufferMapAsyncCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUBufferMapAsyncCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUBufferMapAsyncCallback")
				callback.invoke(status, userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUDeviceCreateComputePipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPUComputePipeline?, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceCreateComputePipelineAsyncCallback): CallbackHolder<WGPUDeviceCreateComputePipelineAsyncCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, pipeline: COpaquePointer?, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUDeviceCreateComputePipelineAsyncCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUDeviceCreateComputePipelineAsyncCallback")
				callback.invoke(status, pipeline?.let(::NativeAddress)?.let(::WGPUComputePipeline), message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUDeviceCreateRenderPipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPURenderPipeline?, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUDeviceCreateRenderPipelineAsyncCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, pipeline: COpaquePointer?, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUDeviceCreateRenderPipelineAsyncCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUDeviceCreateRenderPipelineAsyncCallback")
				callback.invoke(status, pipeline?.let(::NativeAddress)?.let(::WGPURenderPipeline), message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUInstanceRequestAdapterCallback : Callback {
	actual fun invoke(status: WGPURequestAdapterStatus, adapter: WGPUAdapter?, message: CString?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUInstanceRequestAdapterCallback): CallbackHolder<WGPUInstanceRequestAdapterCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, adapter: COpaquePointer?, message: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUInstanceRequestAdapterCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUInstanceRequestAdapterCallback")
				callback.invoke(status, adapter?.let(::NativeAddress)?.let(::WGPUAdapter), message?.let(::NativeAddress)?.let(::CString), userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUQueueOnSubmittedWorkDoneCallback : Callback {
	actual fun invoke(status: WGPUQueueWorkDoneStatus, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUQueueOnSubmittedWorkDoneCallback): CallbackHolder<WGPUQueueOnSubmittedWorkDoneCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUQueueOnSubmittedWorkDoneCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUQueueOnSubmittedWorkDoneCallback")
				callback.invoke(status, userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

actual fun interface WGPUShaderModuleGetCompilationInfoCallback : Callback {
	actual fun invoke(status: WGPUCompilationInfoRequestStatus, compilationInfo: WGPUCompilationInfo?, userdata: NativeAddress?)
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUShaderModuleGetCompilationInfoCallback): CallbackHolder<WGPUShaderModuleGetCompilationInfoCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, compilationInfo: COpaquePointer?, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUShaderModuleGetCompilationInfoCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUShaderModuleGetCompilationInfoCallback")
				callback.invoke(status, compilationInfo?.let(::NativeAddress)?.let { WGPUCompilationInfo(it) }, userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

