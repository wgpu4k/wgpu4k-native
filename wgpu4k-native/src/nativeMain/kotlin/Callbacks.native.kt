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

actual interface WGPUDeviceLostCallback : Callback {
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

actual interface WGPUErrorCallback : Callback {
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

actual interface WGPULogCallback : Callback {
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

