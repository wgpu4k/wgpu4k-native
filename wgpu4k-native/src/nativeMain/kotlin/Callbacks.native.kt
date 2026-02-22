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
import kotlin.OptIn
import kotlinx.cinterop.COpaque
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.LongVar
import kotlinx.cinterop.`value`
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret

public actual fun interface WGPUBufferMapCallback : Callback {
	public actual fun invoke(
		status: WGPUMapAsyncStatus,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUBufferMapCallback): CallbackHolder<WGPUBufferMapCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, message: kotlinx.cinterop.CValue<webgpu.native.WGPUStringView>, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUBufferMapCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUBufferMapCallback")
				callback.invoke(status, message.let { WGPUStringView.ByValue(it) }, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPUCompilationInfoCallback : Callback {
	public actual fun invoke(
		status: WGPUCompilationInfoRequestStatus,
		compilationInfo: WGPUCompilationInfo?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUCompilationInfoCallback): CallbackHolder<WGPUCompilationInfoCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, compilationInfo: COpaquePointer?, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUCompilationInfoCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUCompilationInfoCallback")
				callback.invoke(status, compilationInfo?.let(::NativeAddress)?.let { WGPUCompilationInfo(it) }, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPUCreateComputePipelineAsyncCallback : Callback {
	public actual fun invoke(
		status: WGPUCreatePipelineAsyncStatus,
		pipeline: WGPUComputePipeline?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateComputePipelineAsyncCallback): CallbackHolder<WGPUCreateComputePipelineAsyncCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, pipeline: COpaquePointer?, message: kotlinx.cinterop.CValue<webgpu.native.WGPUStringView>, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUCreateComputePipelineAsyncCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUCreateComputePipelineAsyncCallback")
				callback.invoke(status, pipeline?.let(::NativeAddress)?.let(::WGPUComputePipeline), message.let { WGPUStringView.ByValue(it) }, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPUCreateRenderPipelineAsyncCallback : Callback {
	public actual fun invoke(
		status: WGPUCreatePipelineAsyncStatus,
		pipeline: WGPURenderPipeline?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUCreateRenderPipelineAsyncCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, pipeline: COpaquePointer?, message: kotlinx.cinterop.CValue<webgpu.native.WGPUStringView>, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUCreateRenderPipelineAsyncCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUCreateRenderPipelineAsyncCallback")
				callback.invoke(status, pipeline?.let(::NativeAddress)?.let(::WGPURenderPipeline), message.let { WGPUStringView.ByValue(it) }, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPUDeviceLostCallback : Callback {
	public actual fun invoke(
		device: WGPUDevice?,
		reason: WGPUDeviceLostReason,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceLostCallback): CallbackHolder<WGPUDeviceLostCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { device: COpaquePointer?, reason: UInt, message: kotlinx.cinterop.CValue<webgpu.native.WGPUStringView>, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUDeviceLostCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUDeviceLostCallback")
				callback.invoke(device?.let(::NativeAddress)?.let(::WGPUDevice), reason, message.let { WGPUStringView.ByValue(it) }, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPUPopErrorScopeCallback : Callback {
	public actual fun invoke(
		status: WGPUPopErrorScopeStatus,
		type: WGPUErrorType,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUPopErrorScopeCallback): CallbackHolder<WGPUPopErrorScopeCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, type: UInt, message: kotlinx.cinterop.CValue<webgpu.native.WGPUStringView>, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUPopErrorScopeCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUPopErrorScopeCallback")
				callback.invoke(status, type, message.let { WGPUStringView.ByValue(it) }, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPUQueueWorkDoneCallback : Callback {
	public actual fun invoke(
		status: WGPUQueueWorkDoneStatus,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUQueueWorkDoneCallback): CallbackHolder<WGPUQueueWorkDoneCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUQueueWorkDoneCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUQueueWorkDoneCallback")
				callback.invoke(status, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPURequestAdapterCallback : Callback {
	public actual fun invoke(
		status: WGPURequestAdapterStatus,
		adapter: WGPUAdapter?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestAdapterCallback): CallbackHolder<WGPURequestAdapterCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, adapter: COpaquePointer?, message: kotlinx.cinterop.CValue<webgpu.native.WGPUStringView>, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPURequestAdapterCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPURequestAdapterCallback")
				callback.invoke(status, adapter?.let(::NativeAddress)?.let(::WGPUAdapter), message.let { WGPUStringView.ByValue(it) }, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPURequestDeviceCallback : Callback {
	public actual fun invoke(
		status: WGPURequestDeviceStatus,
		device: WGPUDevice?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestDeviceCallback): CallbackHolder<WGPURequestDeviceCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { status: UInt, device: COpaquePointer?, message: kotlinx.cinterop.CValue<webgpu.native.WGPUStringView>, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPURequestDeviceCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPURequestDeviceCallback")
				callback.invoke(status, device?.let(::NativeAddress)?.let(::WGPUDevice), message.let { WGPUStringView.ByValue(it) }, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPUUncapturedErrorCallback : Callback {
	public actual fun invoke(
		device: WGPUDevice?,
		type: WGPUErrorType,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUUncapturedErrorCallback): CallbackHolder<WGPUUncapturedErrorCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { device: COpaquePointer?, type: UInt, message: kotlinx.cinterop.CValue<webgpu.native.WGPUStringView>, userdata1: COpaquePointer?, userdata2: COpaquePointer? ->
				val address = userdata2?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPUUncapturedErrorCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPUUncapturedErrorCallback")
				callback.invoke(device?.let(::NativeAddress)?.let(::WGPUDevice), type, message.let { WGPUStringView.ByValue(it) }, userdata1?.let(::NativeAddress), userdata2?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}

public actual fun interface WGPULogCallback : Callback {
	public actual fun invoke(
		level: WGPULogLevel,
		message: WGPUStringView?,
		userdata: NativeAddress?,
	) {
	}

	public actual companion object {
		public actual fun allocate(allocator: MemoryAllocator, callback: WGPULogCallback): CallbackHolder<WGPULogCallback> {
			val actualCallback = kotlinx.cinterop.staticCFunction { level: UInt, message: kotlinx.cinterop.CValue<webgpu.native.WGPUStringView>, userdata: COpaquePointer? ->
				val address = userdata?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error("Missing callback address on last argument")
				val callback = findCallback<WGPULogCallback>(address.reinterpret<COpaque>())
					?: error("Callback not found with address $address and type WGPULogCallback")
				callback.invoke(level, message.let { WGPUStringView.ByValue(it) }, userdata?.let(::NativeAddress))
			}
			registerCallback(actualCallback, callback)
			return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)
		}
	}
}
