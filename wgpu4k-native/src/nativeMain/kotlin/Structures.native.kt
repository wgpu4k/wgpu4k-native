// This file has been generated DO NOT EDIT !!!
@file:OptIn(ExperimentalForeignApi::class)
package io.ygdrasil.wgpu
    
import ffi.NativeAddress
import ffi.CallbackHolder
import ffi.CString
import ffi.toCString
import ffi.ArrayHolder
import ffi.MemoryAllocator
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.pointed
import kotlinx.cinterop.useContents
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import kotlinx.cinterop.sizeOf
import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue

actual interface WGPURequestAdapterOptions {
	value class ByValue(val handle: CValue<webgpu.native.WGPURequestAdapterOptions>) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var compatibleSurface: WGPUSurface?
			get() = handle.useContents { compatibleSurface?.let(::NativeAddress)?.let { WGPUSurface(it) } }
			set(newValue) { handle.useContents { compatibleSurface = newValue?.handler?.reinterpret() } } 

		override var powerPreference: WGPUPowerPreference
			get() = handle.useContents { powerPreference ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) { handle.useContents { powerPreference = newValue } } 

		override var backendType: WGPUBackendType
			get() = handle.useContents { backendType ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) { handle.useContents { backendType = newValue } } 

		override var forceFallbackAdapter: Boolean
			get() = handle.useContents { forceFallbackAdapter.toBoolean() ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) { handle.useContents { forceFallbackAdapter = newValue.toUInt() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var compatibleSurface: WGPUSurface?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.compatibleSurface?.let(::NativeAddress)?.let { WGPUSurface(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.compatibleSurface = newValue?.handler?.reinterpret() } } 

		override var powerPreference: WGPUPowerPreference
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.powerPreference ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.powerPreference = newValue } } 

		override var backendType: WGPUBackendType
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.backendType ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.backendType = newValue } } 

		override var forceFallbackAdapter: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.forceFallbackAdapter.toBoolean() ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.forceFallbackAdapter = newValue.toUInt() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var compatibleSurface: WGPUSurface?
	actual var powerPreference: WGPUPowerPreference
	actual var backendType: WGPUBackendType
	actual var forceFallbackAdapter: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURequestAdapterOptions {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterOptions {
			return allocator.allocate(sizeOf<webgpu.native.WGPURequestAdapterOptions>())
				.let { WGPURequestAdapterOptions(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURequestAdapterOptions) -> Unit): ArrayHolder<WGPURequestAdapterOptions> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURequestAdapterOptions>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURequestAdapterOptions>())
							.let(::NativeAddress)
							.let { WGPURequestAdapterOptions(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURequestAdapterOptions> {
		return cValue<webgpu.native.WGPURequestAdapterOptions> {
			nextInChain = this@WGPURequestAdapterOptions.nextInChain?.reinterpret()
			compatibleSurface = this@WGPURequestAdapterOptions.compatibleSurface?.handler?.reinterpret()
			powerPreference = this@WGPURequestAdapterOptions.powerPreference
			backendType = this@WGPURequestAdapterOptions.backendType
			forceFallbackAdapter = this@WGPURequestAdapterOptions.forceFallbackAdapter.toUInt()
		}
	}
}

fun webgpu.native.WGPURequestAdapterOptions.adapt(structure: WGPURequestAdapterOptions) {
	nextInChain = structure.nextInChain?.reinterpret()
	compatibleSurface = structure.compatibleSurface?.handler?.reinterpret()
	powerPreference = structure.powerPreference
	backendType = structure.backendType
	forceFallbackAdapter = structure.forceFallbackAdapter.toUInt()
}

actual interface WGPUAdapterInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUAdapterInfo>) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var vendor: CString?
			get() = handle.useContents { vendor?.toCString() }
			set(newValue) { handle.useContents { vendor = newValue?.handler?.reinterpret() } } 

		override var architecture: CString?
			get() = handle.useContents { architecture?.toCString() }
			set(newValue) { handle.useContents { architecture = newValue?.handler?.reinterpret() } } 

		override var device: CString?
			get() = handle.useContents { device?.toCString() }
			set(newValue) { handle.useContents { device = newValue?.handler?.reinterpret() } } 

		override var description: CString?
			get() = handle.useContents { description?.toCString() }
			set(newValue) { handle.useContents { description = newValue?.handler?.reinterpret() } } 

		override var backendType: WGPUBackendType
			get() = handle.useContents { backendType ?: error("pointer of WGPUAdapterInfo is null") }
			set(newValue) { handle.useContents { backendType = newValue } } 

		override var adapterType: WGPUAdapterType
			get() = handle.useContents { adapterType ?: error("pointer of WGPUAdapterInfo is null") }
			set(newValue) { handle.useContents { adapterType = newValue } } 

		override var vendorID: UInt
			get() = handle.useContents { vendorID ?: error("pointer of WGPUAdapterInfo is null") }
			set(newValue) { handle.useContents { vendorID = newValue } } 

		override var deviceID: UInt
			get() = handle.useContents { deviceID ?: error("pointer of WGPUAdapterInfo is null") }
			set(newValue) { handle.useContents { deviceID = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var vendor: CString?
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.vendor?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.vendor = newValue?.handler?.reinterpret() } } 

		override var architecture: CString?
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.architecture?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.architecture = newValue?.handler?.reinterpret() } } 

		override var device: CString?
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.device?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.device = newValue?.handler?.reinterpret() } } 

		override var description: CString?
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.description?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.description = newValue?.handler?.reinterpret() } } 

		override var backendType: WGPUBackendType
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.backendType ?: error("pointer of WGPUAdapterInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.backendType = newValue } } 

		override var adapterType: WGPUAdapterType
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.adapterType ?: error("pointer of WGPUAdapterInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.adapterType = newValue } } 

		override var vendorID: UInt
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.vendorID ?: error("pointer of WGPUAdapterInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.vendorID = newValue } } 

		override var deviceID: UInt
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.deviceID ?: error("pointer of WGPUAdapterInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.deviceID = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var vendor: CString?
	actual var architecture: CString?
	actual var device: CString?
	actual var description: CString?
	actual var backendType: WGPUBackendType
	actual var adapterType: WGPUAdapterType
	actual var vendorID: UInt
	actual var deviceID: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUAdapterInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUAdapterInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUAdapterInfo>())
				.let { WGPUAdapterInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUAdapterInfo) -> Unit): ArrayHolder<WGPUAdapterInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUAdapterInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUAdapterInfo>())
							.let(::NativeAddress)
							.let { WGPUAdapterInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUAdapterInfo> {
		return cValue<webgpu.native.WGPUAdapterInfo> {
			nextInChain = this@WGPUAdapterInfo.nextInChain?.reinterpret()
			vendor = this@WGPUAdapterInfo.vendor?.handler?.reinterpret()
			architecture = this@WGPUAdapterInfo.architecture?.handler?.reinterpret()
			device = this@WGPUAdapterInfo.device?.handler?.reinterpret()
			description = this@WGPUAdapterInfo.description?.handler?.reinterpret()
			backendType = this@WGPUAdapterInfo.backendType
			adapterType = this@WGPUAdapterInfo.adapterType
			vendorID = this@WGPUAdapterInfo.vendorID
			deviceID = this@WGPUAdapterInfo.deviceID
		}
	}
}

fun webgpu.native.WGPUAdapterInfo.adapt(structure: WGPUAdapterInfo) {
	nextInChain = structure.nextInChain?.reinterpret()
	vendor = structure.vendor?.handler?.reinterpret()
	architecture = structure.architecture?.handler?.reinterpret()
	device = structure.device?.handler?.reinterpret()
	description = structure.description?.handler?.reinterpret()
	backendType = structure.backendType
	adapterType = structure.adapterType
	vendorID = structure.vendorID
	deviceID = structure.deviceID
}

actual interface WGPUQueueDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUQueueDescriptor>) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUQueueDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUQueueDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUQueueDescriptor>())
				.let { WGPUQueueDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUQueueDescriptor) -> Unit): ArrayHolder<WGPUQueueDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUQueueDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUQueueDescriptor>())
							.let(::NativeAddress)
							.let { WGPUQueueDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUQueueDescriptor> {
		return cValue<webgpu.native.WGPUQueueDescriptor> {
			nextInChain = this@WGPUQueueDescriptor.nextInChain?.reinterpret()
			label = this@WGPUQueueDescriptor.label?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUQueueDescriptor.adapt(structure: WGPUQueueDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
}

actual interface WGPUUncapturedErrorCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUUncapturedErrorCallbackInfo>) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var callback: CallbackHolder<WGPUErrorCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUErrorCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata: NativeAddress?
			get() = handle.useContents { userdata?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var callback: CallbackHolder<WGPUErrorCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUErrorCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.userdata?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.userdata = newValue?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var callback: CallbackHolder<WGPUErrorCallback>?
	actual var userdata: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUUncapturedErrorCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUUncapturedErrorCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUUncapturedErrorCallbackInfo>())
				.let { WGPUUncapturedErrorCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUUncapturedErrorCallbackInfo) -> Unit): ArrayHolder<WGPUUncapturedErrorCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUUncapturedErrorCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUUncapturedErrorCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPUUncapturedErrorCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUUncapturedErrorCallbackInfo> {
		return cValue<webgpu.native.WGPUUncapturedErrorCallbackInfo> {
			nextInChain = this@WGPUUncapturedErrorCallbackInfo.nextInChain?.reinterpret()
			callback = this@WGPUUncapturedErrorCallbackInfo.callback?.handler?.reinterpret()
			userdata = this@WGPUUncapturedErrorCallbackInfo.userdata?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUUncapturedErrorCallbackInfo.adapt(structure: WGPUUncapturedErrorCallbackInfo) {
	nextInChain = structure.nextInChain?.reinterpret()
	callback = structure.callback?.handler?.reinterpret()
	userdata = structure.userdata?.reinterpret()
}

actual interface WGPUDeviceDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUDeviceDescriptor>) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var requiredFeatureCount: ULong
			get() = handle.useContents { requiredFeatureCount ?: error("pointer of WGPUDeviceDescriptor is null") }
			set(newValue) { handle.useContents { requiredFeatureCount = newValue } } 

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handle.useContents { requiredFeatures?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) } }
			set(newValue) { handle.useContents { requiredFeatures = newValue?.handler?.reinterpret() } } 

		override var requiredLimits: WGPURequiredLimits?
			get() = handle.useContents { requiredLimits?.let(::NativeAddress)?.let { WGPURequiredLimits(it) } }
			set(newValue) { handle.useContents { requiredLimits = newValue?.handler?.reinterpret() } } 

		override val defaultQueue: WGPUQueueDescriptor
			get() = handle.useContents { defaultQueue.rawPtr.toLong().let(::NativeAddress).let { WGPUQueueDescriptor(it) } }

		override var deviceLostCallback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handle.useContents { deviceLostCallback?.let(::NativeAddress)?.let { CallbackHolder<WGPUDeviceLostCallback>(it) } }
			set(newValue) { handle.useContents { deviceLostCallback = newValue?.handler?.reinterpret() } } 

		override var deviceLostUserdata: NativeAddress?
			get() = handle.useContents { deviceLostUserdata?.let(::NativeAddress) }
			set(newValue) { handle.useContents { deviceLostUserdata = newValue?.reinterpret() } } 

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handle.useContents { uncapturedErrorCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUUncapturedErrorCallbackInfo(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var requiredFeatureCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.requiredFeatureCount ?: error("pointer of WGPUDeviceDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.requiredFeatureCount = newValue } } 

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.requiredFeatures?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.requiredFeatures = newValue?.handler?.reinterpret() } } 

		override var requiredLimits: WGPURequiredLimits?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.requiredLimits?.let(::NativeAddress)?.let { WGPURequiredLimits(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.requiredLimits = newValue?.handler?.reinterpret() } } 

		override val defaultQueue: WGPUQueueDescriptor
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.defaultQueue.rawPtr.toLong().let(::NativeAddress).let { WGPUQueueDescriptor(it) }

		override var deviceLostCallback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.deviceLostCallback?.let(::NativeAddress)?.let { CallbackHolder<WGPUDeviceLostCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.deviceLostCallback = newValue?.handler?.reinterpret() } } 

		override var deviceLostUserdata: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.deviceLostUserdata?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.deviceLostUserdata = newValue?.reinterpret() } } 

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.uncapturedErrorCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUUncapturedErrorCallbackInfo(it) }

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var requiredFeatureCount: ULong
	actual var requiredFeatures: ArrayHolder<WGPUFeatureName>?
	actual var requiredLimits: WGPURequiredLimits?
	actual val defaultQueue: WGPUQueueDescriptor
	actual var deviceLostCallback: CallbackHolder<WGPUDeviceLostCallback>?
	actual var deviceLostUserdata: NativeAddress?
	actual val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUDeviceDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUDeviceDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUDeviceDescriptor>())
				.let { WGPUDeviceDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUDeviceDescriptor) -> Unit): ArrayHolder<WGPUDeviceDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUDeviceDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUDeviceDescriptor>())
							.let(::NativeAddress)
							.let { WGPUDeviceDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUDeviceDescriptor> {
		return cValue<webgpu.native.WGPUDeviceDescriptor> {
			defaultQueue.adapt(this@WGPUDeviceDescriptor.defaultQueue)
			uncapturedErrorCallbackInfo.adapt(this@WGPUDeviceDescriptor.uncapturedErrorCallbackInfo)
			nextInChain = this@WGPUDeviceDescriptor.nextInChain?.reinterpret()
			label = this@WGPUDeviceDescriptor.label?.handler?.reinterpret()
			requiredFeatureCount = this@WGPUDeviceDescriptor.requiredFeatureCount
			requiredFeatures = this@WGPUDeviceDescriptor.requiredFeatures?.handler?.reinterpret()
			requiredLimits = this@WGPUDeviceDescriptor.requiredLimits?.handler?.reinterpret()
			deviceLostCallback = this@WGPUDeviceDescriptor.deviceLostCallback?.handler?.reinterpret()
			deviceLostUserdata = this@WGPUDeviceDescriptor.deviceLostUserdata?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUDeviceDescriptor.adapt(structure: WGPUDeviceDescriptor) {
	defaultQueue.adapt(structure.defaultQueue)
	uncapturedErrorCallbackInfo.adapt(structure.uncapturedErrorCallbackInfo)
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	requiredFeatureCount = structure.requiredFeatureCount
	requiredFeatures = structure.requiredFeatures?.handler?.reinterpret()
	requiredLimits = structure.requiredLimits?.handler?.reinterpret()
	deviceLostCallback = structure.deviceLostCallback?.handler?.reinterpret()
	deviceLostUserdata = structure.deviceLostUserdata?.reinterpret()
}

actual interface WGPUBindGroupEntry {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBindGroupEntry>) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var binding: UInt
			get() = handle.useContents { binding ?: error("pointer of WGPUBindGroupEntry is null") }
			set(newValue) { handle.useContents { binding = newValue } } 

		override var buffer: WGPUBuffer?
			get() = handle.useContents { buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) } }
			set(newValue) { handle.useContents { buffer = newValue?.handler?.reinterpret() } } 

		override var offset: ULong
			get() = handle.useContents { offset ?: error("pointer of WGPUBindGroupEntry is null") }
			set(newValue) { handle.useContents { offset = newValue } } 

		override var size: ULong
			get() = handle.useContents { size ?: error("pointer of WGPUBindGroupEntry is null") }
			set(newValue) { handle.useContents { size = newValue } } 

		override var sampler: WGPUSampler?
			get() = handle.useContents { sampler?.let(::NativeAddress)?.let { WGPUSampler(it) } }
			set(newValue) { handle.useContents { sampler = newValue?.handler?.reinterpret() } } 

		override var textureView: WGPUTextureView?
			get() = handle.useContents { textureView?.let(::NativeAddress)?.let { WGPUTextureView(it) } }
			set(newValue) { handle.useContents { textureView = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var binding: UInt
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.binding ?: error("pointer of WGPUBindGroupEntry is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.binding = newValue } } 

		override var buffer: WGPUBuffer?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.buffer = newValue?.handler?.reinterpret() } } 

		override var offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.offset ?: error("pointer of WGPUBindGroupEntry is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.offset = newValue } } 

		override var size: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.size ?: error("pointer of WGPUBindGroupEntry is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.size = newValue } } 

		override var sampler: WGPUSampler?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.sampler?.let(::NativeAddress)?.let { WGPUSampler(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.sampler = newValue?.handler?.reinterpret() } } 

		override var textureView: WGPUTextureView?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.textureView?.let(::NativeAddress)?.let { WGPUTextureView(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.textureView = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var binding: UInt
	actual var buffer: WGPUBuffer?
	actual var offset: ULong
	actual var size: ULong
	actual var sampler: WGPUSampler?
	actual var textureView: WGPUTextureView?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupEntry {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupEntry {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupEntry>())
				.let { WGPUBindGroupEntry(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupEntry) -> Unit): ArrayHolder<WGPUBindGroupEntry> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupEntry>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUBindGroupEntry>())
							.let(::NativeAddress)
							.let { WGPUBindGroupEntry(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUBindGroupEntry> {
		return cValue<webgpu.native.WGPUBindGroupEntry> {
			nextInChain = this@WGPUBindGroupEntry.nextInChain?.reinterpret()
			binding = this@WGPUBindGroupEntry.binding
			buffer = this@WGPUBindGroupEntry.buffer?.handler?.reinterpret()
			offset = this@WGPUBindGroupEntry.offset
			size = this@WGPUBindGroupEntry.size
			sampler = this@WGPUBindGroupEntry.sampler?.handler?.reinterpret()
			textureView = this@WGPUBindGroupEntry.textureView?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUBindGroupEntry.adapt(structure: WGPUBindGroupEntry) {
	nextInChain = structure.nextInChain?.reinterpret()
	binding = structure.binding
	buffer = structure.buffer?.handler?.reinterpret()
	offset = structure.offset
	size = structure.size
	sampler = structure.sampler?.handler?.reinterpret()
	textureView = structure.textureView?.handler?.reinterpret()
}

actual interface WGPUBindGroupDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBindGroupDescriptor>) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var layout: WGPUBindGroupLayout?
			get() = handle.useContents { layout?.let(::NativeAddress)?.let { WGPUBindGroupLayout(it) } }
			set(newValue) { handle.useContents { layout = newValue?.handler?.reinterpret() } } 

		override var entryCount: ULong
			get() = handle.useContents { entryCount ?: error("pointer of WGPUBindGroupDescriptor is null") }
			set(newValue) { handle.useContents { entryCount = newValue } } 

		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = handle.useContents { entries?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupEntry>(it) } }
			set(newValue) { handle.useContents { entries = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var layout: WGPUBindGroupLayout?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.layout?.let(::NativeAddress)?.let { WGPUBindGroupLayout(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.let { it.layout = newValue?.handler?.reinterpret() } } 

		override var entryCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.entryCount ?: error("pointer of WGPUBindGroupDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.let { it.entryCount = newValue } } 

		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.entries?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupEntry>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.let { it.entries = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var layout: WGPUBindGroupLayout?
	actual var entryCount: ULong
	actual var entries: ArrayHolder<WGPUBindGroupEntry>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupDescriptor>())
				.let { WGPUBindGroupDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupDescriptor) -> Unit): ArrayHolder<WGPUBindGroupDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUBindGroupDescriptor>())
							.let(::NativeAddress)
							.let { WGPUBindGroupDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUBindGroupDescriptor> {
		return cValue<webgpu.native.WGPUBindGroupDescriptor> {
			nextInChain = this@WGPUBindGroupDescriptor.nextInChain?.reinterpret()
			label = this@WGPUBindGroupDescriptor.label?.handler?.reinterpret()
			layout = this@WGPUBindGroupDescriptor.layout?.handler?.reinterpret()
			entryCount = this@WGPUBindGroupDescriptor.entryCount
			entries = this@WGPUBindGroupDescriptor.entries?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUBindGroupDescriptor.adapt(structure: WGPUBindGroupDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
	entryCount = structure.entryCount
	entries = structure.entries?.handler?.reinterpret()
}

actual interface WGPUBufferBindingLayout {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBufferBindingLayout>) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var type: WGPUBufferBindingType
			get() = handle.useContents { type ?: error("pointer of WGPUBufferBindingLayout is null") }
			set(newValue) { handle.useContents { type = newValue } } 

		override var hasDynamicOffset: Boolean
			get() = handle.useContents { hasDynamicOffset.toBoolean() ?: error("pointer of WGPUBufferBindingLayout is null") }
			set(newValue) { handle.useContents { hasDynamicOffset = newValue.toUInt() } } 

		override var minBindingSize: ULong
			get() = handle.useContents { minBindingSize ?: error("pointer of WGPUBufferBindingLayout is null") }
			set(newValue) { handle.useContents { minBindingSize = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var type: WGPUBufferBindingType
			get() = handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.type ?: error("pointer of WGPUBufferBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.let { it.type = newValue } } 

		override var hasDynamicOffset: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.hasDynamicOffset.toBoolean() ?: error("pointer of WGPUBufferBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.let { it.hasDynamicOffset = newValue.toUInt() } } 

		override var minBindingSize: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.minBindingSize ?: error("pointer of WGPUBufferBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.let { it.minBindingSize = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var type: WGPUBufferBindingType
	actual var hasDynamicOffset: Boolean
	actual var minBindingSize: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBufferBindingLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBufferBindingLayout {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBufferBindingLayout>())
				.let { WGPUBufferBindingLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBufferBindingLayout) -> Unit): ArrayHolder<WGPUBufferBindingLayout> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBufferBindingLayout>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUBufferBindingLayout>())
							.let(::NativeAddress)
							.let { WGPUBufferBindingLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUBufferBindingLayout> {
		return cValue<webgpu.native.WGPUBufferBindingLayout> {
			nextInChain = this@WGPUBufferBindingLayout.nextInChain?.reinterpret()
			type = this@WGPUBufferBindingLayout.type
			hasDynamicOffset = this@WGPUBufferBindingLayout.hasDynamicOffset.toUInt()
			minBindingSize = this@WGPUBufferBindingLayout.minBindingSize
		}
	}
}

fun webgpu.native.WGPUBufferBindingLayout.adapt(structure: WGPUBufferBindingLayout) {
	nextInChain = structure.nextInChain?.reinterpret()
	type = structure.type
	hasDynamicOffset = structure.hasDynamicOffset.toUInt()
	minBindingSize = structure.minBindingSize
}

actual interface WGPUSamplerBindingLayout {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSamplerBindingLayout>) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var type: WGPUSamplerBindingType
			get() = handle.useContents { type ?: error("pointer of WGPUSamplerBindingLayout is null") }
			set(newValue) { handle.useContents { type = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSamplerBindingLayout>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerBindingLayout>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var type: WGPUSamplerBindingType
			get() = handler.reinterpret<webgpu.native.WGPUSamplerBindingLayout>().pointed.type ?: error("pointer of WGPUSamplerBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerBindingLayout>().pointed.let { it.type = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var type: WGPUSamplerBindingType
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSamplerBindingLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSamplerBindingLayout {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSamplerBindingLayout>())
				.let { WGPUSamplerBindingLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSamplerBindingLayout) -> Unit): ArrayHolder<WGPUSamplerBindingLayout> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSamplerBindingLayout>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSamplerBindingLayout>())
							.let(::NativeAddress)
							.let { WGPUSamplerBindingLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSamplerBindingLayout> {
		return cValue<webgpu.native.WGPUSamplerBindingLayout> {
			nextInChain = this@WGPUSamplerBindingLayout.nextInChain?.reinterpret()
			type = this@WGPUSamplerBindingLayout.type
		}
	}
}

fun webgpu.native.WGPUSamplerBindingLayout.adapt(structure: WGPUSamplerBindingLayout) {
	nextInChain = structure.nextInChain?.reinterpret()
	type = structure.type
}

actual interface WGPUTextureBindingLayout {
	value class ByValue(val handle: CValue<webgpu.native.WGPUTextureBindingLayout>) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var sampleType: WGPUTextureSampleType
			get() = handle.useContents { sampleType ?: error("pointer of WGPUTextureBindingLayout is null") }
			set(newValue) { handle.useContents { sampleType = newValue } } 

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.useContents { viewDimension ?: error("pointer of WGPUTextureBindingLayout is null") }
			set(newValue) { handle.useContents { viewDimension = newValue } } 

		override var multisampled: Boolean
			get() = handle.useContents { multisampled.toBoolean() ?: error("pointer of WGPUTextureBindingLayout is null") }
			set(newValue) { handle.useContents { multisampled = newValue.toUInt() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var sampleType: WGPUTextureSampleType
			get() = handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.sampleType ?: error("pointer of WGPUTextureBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.let { it.sampleType = newValue } } 

		override var viewDimension: WGPUTextureViewDimension
			get() = handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.viewDimension ?: error("pointer of WGPUTextureBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.let { it.viewDimension = newValue } } 

		override var multisampled: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.multisampled.toBoolean() ?: error("pointer of WGPUTextureBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.let { it.multisampled = newValue.toUInt() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var sampleType: WGPUTextureSampleType
	actual var viewDimension: WGPUTextureViewDimension
	actual var multisampled: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureBindingLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureBindingLayout {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTextureBindingLayout>())
				.let { WGPUTextureBindingLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureBindingLayout) -> Unit): ArrayHolder<WGPUTextureBindingLayout> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTextureBindingLayout>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUTextureBindingLayout>())
							.let(::NativeAddress)
							.let { WGPUTextureBindingLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUTextureBindingLayout> {
		return cValue<webgpu.native.WGPUTextureBindingLayout> {
			nextInChain = this@WGPUTextureBindingLayout.nextInChain?.reinterpret()
			sampleType = this@WGPUTextureBindingLayout.sampleType
			viewDimension = this@WGPUTextureBindingLayout.viewDimension
			multisampled = this@WGPUTextureBindingLayout.multisampled.toUInt()
		}
	}
}

fun webgpu.native.WGPUTextureBindingLayout.adapt(structure: WGPUTextureBindingLayout) {
	nextInChain = structure.nextInChain?.reinterpret()
	sampleType = structure.sampleType
	viewDimension = structure.viewDimension
	multisampled = structure.multisampled.toUInt()
}

actual interface WGPUSurfaceCapabilities {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceCapabilities>) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var usages: UInt
			get() = handle.useContents { usages ?: error("pointer of WGPUSurfaceCapabilities is null") }
			set(newValue) { handle.useContents { usages = newValue } } 

		override var formatCount: ULong
			get() = handle.useContents { formatCount ?: error("pointer of WGPUSurfaceCapabilities is null") }
			set(newValue) { handle.useContents { formatCount = newValue } } 

		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.useContents { formats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) } }
			set(newValue) { handle.useContents { formats = newValue?.handler?.reinterpret() } } 

		override var presentModeCount: ULong
			get() = handle.useContents { presentModeCount ?: error("pointer of WGPUSurfaceCapabilities is null") }
			set(newValue) { handle.useContents { presentModeCount = newValue } } 

		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = handle.useContents { presentModes?.let(::NativeAddress)?.let { ArrayHolder<WGPUPresentMode>(it) } }
			set(newValue) { handle.useContents { presentModes = newValue?.handler?.reinterpret() } } 

		override var alphaModeCount: ULong
			get() = handle.useContents { alphaModeCount ?: error("pointer of WGPUSurfaceCapabilities is null") }
			set(newValue) { handle.useContents { alphaModeCount = newValue } } 

		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = handle.useContents { alphaModes?.let(::NativeAddress)?.let { ArrayHolder<WGPUCompositeAlphaMode>(it) } }
			set(newValue) { handle.useContents { alphaModes = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var usages: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.usages ?: error("pointer of WGPUSurfaceCapabilities is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.usages = newValue } } 

		override var formatCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.formatCount ?: error("pointer of WGPUSurfaceCapabilities is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.formatCount = newValue } } 

		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.formats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.formats = newValue?.handler?.reinterpret() } } 

		override var presentModeCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.presentModeCount ?: error("pointer of WGPUSurfaceCapabilities is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.presentModeCount = newValue } } 

		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.presentModes?.let(::NativeAddress)?.let { ArrayHolder<WGPUPresentMode>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.presentModes = newValue?.handler?.reinterpret() } } 

		override var alphaModeCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.alphaModeCount ?: error("pointer of WGPUSurfaceCapabilities is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.alphaModeCount = newValue } } 

		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.alphaModes?.let(::NativeAddress)?.let { ArrayHolder<WGPUCompositeAlphaMode>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.alphaModes = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var usages: UInt
	actual var formatCount: ULong
	actual var formats: ArrayHolder<WGPUTextureFormat>?
	actual var presentModeCount: ULong
	actual var presentModes: ArrayHolder<WGPUPresentMode>?
	actual var alphaModeCount: ULong
	actual var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceCapabilities {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceCapabilities {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceCapabilities>())
				.let { WGPUSurfaceCapabilities(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceCapabilities) -> Unit): ArrayHolder<WGPUSurfaceCapabilities> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceCapabilities>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceCapabilities>())
							.let(::NativeAddress)
							.let { WGPUSurfaceCapabilities(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceCapabilities> {
		return cValue<webgpu.native.WGPUSurfaceCapabilities> {
			nextInChain = this@WGPUSurfaceCapabilities.nextInChain?.reinterpret()
			usages = this@WGPUSurfaceCapabilities.usages
			formatCount = this@WGPUSurfaceCapabilities.formatCount
			formats = this@WGPUSurfaceCapabilities.formats?.handler?.reinterpret()
			presentModeCount = this@WGPUSurfaceCapabilities.presentModeCount
			presentModes = this@WGPUSurfaceCapabilities.presentModes?.handler?.reinterpret()
			alphaModeCount = this@WGPUSurfaceCapabilities.alphaModeCount
			alphaModes = this@WGPUSurfaceCapabilities.alphaModes?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceCapabilities.adapt(structure: WGPUSurfaceCapabilities) {
	nextInChain = structure.nextInChain?.reinterpret()
	usages = structure.usages
	formatCount = structure.formatCount
	formats = structure.formats?.handler?.reinterpret()
	presentModeCount = structure.presentModeCount
	presentModes = structure.presentModes?.handler?.reinterpret()
	alphaModeCount = structure.alphaModeCount
	alphaModes = structure.alphaModes?.handler?.reinterpret()
}

actual interface WGPUSurfaceConfiguration {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceConfiguration>) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var device: WGPUDevice?
			get() = handle.useContents { device?.let(::NativeAddress)?.let { WGPUDevice(it) } }
			set(newValue) { handle.useContents { device = newValue?.handler?.reinterpret() } } 

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { format = newValue } } 

		override var usage: UInt
			get() = handle.useContents { usage ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { usage = newValue } } 

		override var viewFormatCount: ULong
			get() = handle.useContents { viewFormatCount ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { viewFormatCount = newValue } } 

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.useContents { viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) } }
			set(newValue) { handle.useContents { viewFormats = newValue?.handler?.reinterpret() } } 

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handle.useContents { alphaMode ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { alphaMode = newValue } } 

		override var width: UInt
			get() = handle.useContents { width ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { width = newValue } } 

		override var height: UInt
			get() = handle.useContents { height ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { height = newValue } } 

		override var presentMode: WGPUPresentMode
			get() = handle.useContents { presentMode ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { presentMode = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var device: WGPUDevice?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.device?.let(::NativeAddress)?.let { WGPUDevice(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.device = newValue?.handler?.reinterpret() } } 

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.format ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.format = newValue } } 

		override var usage: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.usage ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.usage = newValue } } 

		override var viewFormatCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.viewFormatCount ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.viewFormatCount = newValue } } 

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.viewFormats = newValue?.handler?.reinterpret() } } 

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.alphaMode ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.alphaMode = newValue } } 

		override var width: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.width ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.width = newValue } } 

		override var height: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.height ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.height = newValue } } 

		override var presentMode: WGPUPresentMode
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.presentMode ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.presentMode = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var device: WGPUDevice?
	actual var format: WGPUTextureFormat
	actual var usage: UInt
	actual var viewFormatCount: ULong
	actual var viewFormats: ArrayHolder<WGPUTextureFormat>?
	actual var alphaMode: WGPUCompositeAlphaMode
	actual var width: UInt
	actual var height: UInt
	actual var presentMode: WGPUPresentMode
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceConfiguration {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceConfiguration {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceConfiguration>())
				.let { WGPUSurfaceConfiguration(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceConfiguration) -> Unit): ArrayHolder<WGPUSurfaceConfiguration> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceConfiguration>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceConfiguration>())
							.let(::NativeAddress)
							.let { WGPUSurfaceConfiguration(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceConfiguration> {
		return cValue<webgpu.native.WGPUSurfaceConfiguration> {
			nextInChain = this@WGPUSurfaceConfiguration.nextInChain?.reinterpret()
			device = this@WGPUSurfaceConfiguration.device?.handler?.reinterpret()
			format = this@WGPUSurfaceConfiguration.format
			usage = this@WGPUSurfaceConfiguration.usage
			viewFormatCount = this@WGPUSurfaceConfiguration.viewFormatCount
			viewFormats = this@WGPUSurfaceConfiguration.viewFormats?.handler?.reinterpret()
			alphaMode = this@WGPUSurfaceConfiguration.alphaMode
			width = this@WGPUSurfaceConfiguration.width
			height = this@WGPUSurfaceConfiguration.height
			presentMode = this@WGPUSurfaceConfiguration.presentMode
		}
	}
}

fun webgpu.native.WGPUSurfaceConfiguration.adapt(structure: WGPUSurfaceConfiguration) {
	nextInChain = structure.nextInChain?.reinterpret()
	device = structure.device?.handler?.reinterpret()
	format = structure.format
	usage = structure.usage
	viewFormatCount = structure.viewFormatCount
	viewFormats = structure.viewFormats?.handler?.reinterpret()
	alphaMode = structure.alphaMode
	width = structure.width
	height = structure.height
	presentMode = structure.presentMode
}

actual interface WGPUStorageTextureBindingLayout {
	value class ByValue(val handle: CValue<webgpu.native.WGPUStorageTextureBindingLayout>) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var access: WGPUStorageTextureAccess
			get() = handle.useContents { access ?: error("pointer of WGPUStorageTextureBindingLayout is null") }
			set(newValue) { handle.useContents { access = newValue } } 

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUStorageTextureBindingLayout is null") }
			set(newValue) { handle.useContents { format = newValue } } 

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.useContents { viewDimension ?: error("pointer of WGPUStorageTextureBindingLayout is null") }
			set(newValue) { handle.useContents { viewDimension = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var access: WGPUStorageTextureAccess
			get() = handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.access ?: error("pointer of WGPUStorageTextureBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.let { it.access = newValue } } 

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.format ?: error("pointer of WGPUStorageTextureBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.let { it.format = newValue } } 

		override var viewDimension: WGPUTextureViewDimension
			get() = handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.viewDimension ?: error("pointer of WGPUStorageTextureBindingLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.let { it.viewDimension = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var access: WGPUStorageTextureAccess
	actual var format: WGPUTextureFormat
	actual var viewDimension: WGPUTextureViewDimension
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUStorageTextureBindingLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUStorageTextureBindingLayout {
			return allocator.allocate(sizeOf<webgpu.native.WGPUStorageTextureBindingLayout>())
				.let { WGPUStorageTextureBindingLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUStorageTextureBindingLayout) -> Unit): ArrayHolder<WGPUStorageTextureBindingLayout> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUStorageTextureBindingLayout>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUStorageTextureBindingLayout>())
							.let(::NativeAddress)
							.let { WGPUStorageTextureBindingLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUStorageTextureBindingLayout> {
		return cValue<webgpu.native.WGPUStorageTextureBindingLayout> {
			nextInChain = this@WGPUStorageTextureBindingLayout.nextInChain?.reinterpret()
			access = this@WGPUStorageTextureBindingLayout.access
			format = this@WGPUStorageTextureBindingLayout.format
			viewDimension = this@WGPUStorageTextureBindingLayout.viewDimension
		}
	}
}

fun webgpu.native.WGPUStorageTextureBindingLayout.adapt(structure: WGPUStorageTextureBindingLayout) {
	nextInChain = structure.nextInChain?.reinterpret()
	access = structure.access
	format = structure.format
	viewDimension = structure.viewDimension
}

actual interface WGPUBindGroupLayoutEntry {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBindGroupLayoutEntry>) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var binding: UInt
			get() = handle.useContents { binding ?: error("pointer of WGPUBindGroupLayoutEntry is null") }
			set(newValue) { handle.useContents { binding = newValue } } 

		override var visibility: UInt
			get() = handle.useContents { visibility ?: error("pointer of WGPUBindGroupLayoutEntry is null") }
			set(newValue) { handle.useContents { visibility = newValue } } 

		override val buffer: WGPUBufferBindingLayout
			get() = handle.useContents { buffer.rawPtr.toLong().let(::NativeAddress).let { WGPUBufferBindingLayout(it) } }

		override val sampler: WGPUSamplerBindingLayout
			get() = handle.useContents { sampler.rawPtr.toLong().let(::NativeAddress).let { WGPUSamplerBindingLayout(it) } }

		override val texture: WGPUTextureBindingLayout
			get() = handle.useContents { texture.rawPtr.toLong().let(::NativeAddress).let { WGPUTextureBindingLayout(it) } }

		override val storageTexture: WGPUStorageTextureBindingLayout
			get() = handle.useContents { storageTexture.rawPtr.toLong().let(::NativeAddress).let { WGPUStorageTextureBindingLayout(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var binding: UInt
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.binding ?: error("pointer of WGPUBindGroupLayoutEntry is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.let { it.binding = newValue } } 

		override var visibility: UInt
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.visibility ?: error("pointer of WGPUBindGroupLayoutEntry is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.let { it.visibility = newValue } } 

		override val buffer: WGPUBufferBindingLayout
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.buffer.rawPtr.toLong().let(::NativeAddress).let { WGPUBufferBindingLayout(it) }

		override val sampler: WGPUSamplerBindingLayout
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.sampler.rawPtr.toLong().let(::NativeAddress).let { WGPUSamplerBindingLayout(it) }

		override val texture: WGPUTextureBindingLayout
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.texture.rawPtr.toLong().let(::NativeAddress).let { WGPUTextureBindingLayout(it) }

		override val storageTexture: WGPUStorageTextureBindingLayout
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.storageTexture.rawPtr.toLong().let(::NativeAddress).let { WGPUStorageTextureBindingLayout(it) }

	}

	actual var nextInChain: NativeAddress?
	actual var binding: UInt
	actual var visibility: UInt
	actual val buffer: WGPUBufferBindingLayout
	actual val sampler: WGPUSamplerBindingLayout
	actual val texture: WGPUTextureBindingLayout
	actual val storageTexture: WGPUStorageTextureBindingLayout
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutEntry {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutEntry {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupLayoutEntry>())
				.let { WGPUBindGroupLayoutEntry(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupLayoutEntry) -> Unit): ArrayHolder<WGPUBindGroupLayoutEntry> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupLayoutEntry>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUBindGroupLayoutEntry>())
							.let(::NativeAddress)
							.let { WGPUBindGroupLayoutEntry(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUBindGroupLayoutEntry> {
		return cValue<webgpu.native.WGPUBindGroupLayoutEntry> {
			buffer.adapt(this@WGPUBindGroupLayoutEntry.buffer)
			sampler.adapt(this@WGPUBindGroupLayoutEntry.sampler)
			texture.adapt(this@WGPUBindGroupLayoutEntry.texture)
			storageTexture.adapt(this@WGPUBindGroupLayoutEntry.storageTexture)
			nextInChain = this@WGPUBindGroupLayoutEntry.nextInChain?.reinterpret()
			binding = this@WGPUBindGroupLayoutEntry.binding
			visibility = this@WGPUBindGroupLayoutEntry.visibility
		}
	}
}

fun webgpu.native.WGPUBindGroupLayoutEntry.adapt(structure: WGPUBindGroupLayoutEntry) {
	buffer.adapt(structure.buffer)
	sampler.adapt(structure.sampler)
	texture.adapt(structure.texture)
	storageTexture.adapt(structure.storageTexture)
	nextInChain = structure.nextInChain?.reinterpret()
	binding = structure.binding
	visibility = structure.visibility
}

actual interface WGPUBindGroupLayoutDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBindGroupLayoutDescriptor>) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var entryCount: ULong
			get() = handle.useContents { entryCount ?: error("pointer of WGPUBindGroupLayoutDescriptor is null") }
			set(newValue) { handle.useContents { entryCount = newValue } } 

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = handle.useContents { entries?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayoutEntry>(it) } }
			set(newValue) { handle.useContents { entries = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var entryCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.entryCount ?: error("pointer of WGPUBindGroupLayoutDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.let { it.entryCount = newValue } } 

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.entries?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayoutEntry>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.let { it.entries = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var entryCount: ULong
	actual var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupLayoutDescriptor>())
				.let { WGPUBindGroupLayoutDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupLayoutDescriptor) -> Unit): ArrayHolder<WGPUBindGroupLayoutDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupLayoutDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUBindGroupLayoutDescriptor>())
							.let(::NativeAddress)
							.let { WGPUBindGroupLayoutDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUBindGroupLayoutDescriptor> {
		return cValue<webgpu.native.WGPUBindGroupLayoutDescriptor> {
			nextInChain = this@WGPUBindGroupLayoutDescriptor.nextInChain?.reinterpret()
			label = this@WGPUBindGroupLayoutDescriptor.label?.handler?.reinterpret()
			entryCount = this@WGPUBindGroupLayoutDescriptor.entryCount
			entries = this@WGPUBindGroupLayoutDescriptor.entries?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUBindGroupLayoutDescriptor.adapt(structure: WGPUBindGroupLayoutDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	entryCount = structure.entryCount
	entries = structure.entries?.handler?.reinterpret()
}

actual interface WGPUBlendComponent {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBlendComponent>) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = handle.useContents { operation ?: error("pointer of WGPUBlendComponent is null") }
			set(newValue) { handle.useContents { operation = newValue } } 

		override var srcFactor: WGPUBlendFactor
			get() = handle.useContents { srcFactor ?: error("pointer of WGPUBlendComponent is null") }
			set(newValue) { handle.useContents { srcFactor = newValue } } 

		override var dstFactor: WGPUBlendFactor
			get() = handle.useContents { dstFactor ?: error("pointer of WGPUBlendComponent is null") }
			set(newValue) { handle.useContents { dstFactor = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.operation ?: error("pointer of WGPUBlendComponent is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.let { it.operation = newValue } } 

		override var srcFactor: WGPUBlendFactor
			get() = handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.srcFactor ?: error("pointer of WGPUBlendComponent is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.let { it.srcFactor = newValue } } 

		override var dstFactor: WGPUBlendFactor
			get() = handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.dstFactor ?: error("pointer of WGPUBlendComponent is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.let { it.dstFactor = newValue } } 

	}

	actual var operation: WGPUBlendOperation
	actual var srcFactor: WGPUBlendFactor
	actual var dstFactor: WGPUBlendFactor
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBlendComponent {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBlendComponent {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBlendComponent>())
				.let { WGPUBlendComponent(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBlendComponent) -> Unit): ArrayHolder<WGPUBlendComponent> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBlendComponent>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUBlendComponent>())
							.let(::NativeAddress)
							.let { WGPUBlendComponent(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUBlendComponent> {
		return cValue<webgpu.native.WGPUBlendComponent> {
			operation = this@WGPUBlendComponent.operation
			srcFactor = this@WGPUBlendComponent.srcFactor
			dstFactor = this@WGPUBlendComponent.dstFactor
		}
	}
}

fun webgpu.native.WGPUBlendComponent.adapt(structure: WGPUBlendComponent) {
	operation = structure.operation
	srcFactor = structure.srcFactor
	dstFactor = structure.dstFactor
}

actual interface WGPUBufferDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBufferDescriptor>) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var usage: UInt
			get() = handle.useContents { usage ?: error("pointer of WGPUBufferDescriptor is null") }
			set(newValue) { handle.useContents { usage = newValue } } 

		override var size: ULong
			get() = handle.useContents { size ?: error("pointer of WGPUBufferDescriptor is null") }
			set(newValue) { handle.useContents { size = newValue } } 

		override var mappedAtCreation: Boolean
			get() = handle.useContents { mappedAtCreation.toBoolean() ?: error("pointer of WGPUBufferDescriptor is null") }
			set(newValue) { handle.useContents { mappedAtCreation = newValue.toUInt() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var usage: UInt
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.usage ?: error("pointer of WGPUBufferDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.let { it.usage = newValue } } 

		override var size: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.size ?: error("pointer of WGPUBufferDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.let { it.size = newValue } } 

		override var mappedAtCreation: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.mappedAtCreation.toBoolean() ?: error("pointer of WGPUBufferDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.let { it.mappedAtCreation = newValue.toUInt() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var usage: UInt
	actual var size: ULong
	actual var mappedAtCreation: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBufferDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBufferDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBufferDescriptor>())
				.let { WGPUBufferDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBufferDescriptor) -> Unit): ArrayHolder<WGPUBufferDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBufferDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUBufferDescriptor>())
							.let(::NativeAddress)
							.let { WGPUBufferDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUBufferDescriptor> {
		return cValue<webgpu.native.WGPUBufferDescriptor> {
			nextInChain = this@WGPUBufferDescriptor.nextInChain?.reinterpret()
			label = this@WGPUBufferDescriptor.label?.handler?.reinterpret()
			usage = this@WGPUBufferDescriptor.usage
			size = this@WGPUBufferDescriptor.size
			mappedAtCreation = this@WGPUBufferDescriptor.mappedAtCreation.toUInt()
		}
	}
}

fun webgpu.native.WGPUBufferDescriptor.adapt(structure: WGPUBufferDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	usage = structure.usage
	size = structure.size
	mappedAtCreation = structure.mappedAtCreation.toUInt()
}

actual interface WGPUColor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUColor>) : WGPUColor {
		override var r: Double
			get() = handle.useContents { r ?: error("pointer of WGPUColor is null") }
			set(newValue) { handle.useContents { r = newValue } } 

		override var g: Double
			get() = handle.useContents { g ?: error("pointer of WGPUColor is null") }
			set(newValue) { handle.useContents { g = newValue } } 

		override var b: Double
			get() = handle.useContents { b ?: error("pointer of WGPUColor is null") }
			set(newValue) { handle.useContents { b = newValue } } 

		override var a: Double
			get() = handle.useContents { a ?: error("pointer of WGPUColor is null") }
			set(newValue) { handle.useContents { a = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUColor {
		override var r: Double
			get() = handler.reinterpret<webgpu.native.WGPUColor>().pointed.r ?: error("pointer of WGPUColor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUColor>().pointed.let { it.r = newValue } } 

		override var g: Double
			get() = handler.reinterpret<webgpu.native.WGPUColor>().pointed.g ?: error("pointer of WGPUColor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUColor>().pointed.let { it.g = newValue } } 

		override var b: Double
			get() = handler.reinterpret<webgpu.native.WGPUColor>().pointed.b ?: error("pointer of WGPUColor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUColor>().pointed.let { it.b = newValue } } 

		override var a: Double
			get() = handler.reinterpret<webgpu.native.WGPUColor>().pointed.a ?: error("pointer of WGPUColor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUColor>().pointed.let { it.a = newValue } } 

	}

	actual var r: Double
	actual var g: Double
	actual var b: Double
	actual var a: Double
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUColor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUColor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUColor>())
				.let { WGPUColor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUColor) -> Unit): ArrayHolder<WGPUColor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUColor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUColor>())
							.let(::NativeAddress)
							.let { WGPUColor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUColor> {
		return cValue<webgpu.native.WGPUColor> {
			r = this@WGPUColor.r
			g = this@WGPUColor.g
			b = this@WGPUColor.b
			a = this@WGPUColor.a
		}
	}
}

fun webgpu.native.WGPUColor.adapt(structure: WGPUColor) {
	r = structure.r
	g = structure.g
	b = structure.b
	a = structure.a
}

actual interface WGPUConstantEntry {
	value class ByValue(val handle: CValue<webgpu.native.WGPUConstantEntry>) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var key: CString?
			get() = handle.useContents { key?.toCString() }
			set(newValue) { handle.useContents { key = newValue?.handler?.reinterpret() } } 

		override var value: Double
			get() = handle.useContents { value ?: error("pointer of WGPUConstantEntry is null") }
			set(newValue) { handle.useContents { value = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var key: CString?
			get() = handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.key?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.let { it.key = newValue?.handler?.reinterpret() } } 

		override var value: Double
			get() = handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.value ?: error("pointer of WGPUConstantEntry is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.let { it.value = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var key: CString?
	actual var value: Double
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUConstantEntry {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUConstantEntry {
			return allocator.allocate(sizeOf<webgpu.native.WGPUConstantEntry>())
				.let { WGPUConstantEntry(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUConstantEntry) -> Unit): ArrayHolder<WGPUConstantEntry> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUConstantEntry>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUConstantEntry>())
							.let(::NativeAddress)
							.let { WGPUConstantEntry(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUConstantEntry> {
		return cValue<webgpu.native.WGPUConstantEntry> {
			nextInChain = this@WGPUConstantEntry.nextInChain?.reinterpret()
			key = this@WGPUConstantEntry.key?.handler?.reinterpret()
			value = this@WGPUConstantEntry.value
		}
	}
}

fun webgpu.native.WGPUConstantEntry.adapt(structure: WGPUConstantEntry) {
	nextInChain = structure.nextInChain?.reinterpret()
	key = structure.key?.handler?.reinterpret()
	value = structure.value
}

actual interface WGPUCommandBufferDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUCommandBufferDescriptor>) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCommandBufferDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCommandBufferDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCommandBufferDescriptor>())
				.let { WGPUCommandBufferDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCommandBufferDescriptor) -> Unit): ArrayHolder<WGPUCommandBufferDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCommandBufferDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUCommandBufferDescriptor>())
							.let(::NativeAddress)
							.let { WGPUCommandBufferDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUCommandBufferDescriptor> {
		return cValue<webgpu.native.WGPUCommandBufferDescriptor> {
			nextInChain = this@WGPUCommandBufferDescriptor.nextInChain?.reinterpret()
			label = this@WGPUCommandBufferDescriptor.label?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUCommandBufferDescriptor.adapt(structure: WGPUCommandBufferDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
}

actual interface WGPUCommandEncoderDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUCommandEncoderDescriptor>) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCommandEncoderDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCommandEncoderDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCommandEncoderDescriptor>())
				.let { WGPUCommandEncoderDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCommandEncoderDescriptor) -> Unit): ArrayHolder<WGPUCommandEncoderDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCommandEncoderDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUCommandEncoderDescriptor>())
							.let(::NativeAddress)
							.let { WGPUCommandEncoderDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUCommandEncoderDescriptor> {
		return cValue<webgpu.native.WGPUCommandEncoderDescriptor> {
			nextInChain = this@WGPUCommandEncoderDescriptor.nextInChain?.reinterpret()
			label = this@WGPUCommandEncoderDescriptor.label?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUCommandEncoderDescriptor.adapt(structure: WGPUCommandEncoderDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
}

actual interface WGPUCompilationInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUCompilationInfo>) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var messageCount: ULong
			get() = handle.useContents { messageCount ?: error("pointer of WGPUCompilationInfo is null") }
			set(newValue) { handle.useContents { messageCount = newValue } } 

		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = handle.useContents { messages?.let(::NativeAddress)?.let { ArrayHolder<WGPUCompilationMessage>(it) } }
			set(newValue) { handle.useContents { messages = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var messageCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.messageCount ?: error("pointer of WGPUCompilationInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.let { it.messageCount = newValue } } 

		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.messages?.let(::NativeAddress)?.let { ArrayHolder<WGPUCompilationMessage>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.let { it.messages = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var messageCount: ULong
	actual var messages: ArrayHolder<WGPUCompilationMessage>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCompilationInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCompilationInfo>())
				.let { WGPUCompilationInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCompilationInfo) -> Unit): ArrayHolder<WGPUCompilationInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCompilationInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUCompilationInfo>())
							.let(::NativeAddress)
							.let { WGPUCompilationInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUCompilationInfo> {
		return cValue<webgpu.native.WGPUCompilationInfo> {
			nextInChain = this@WGPUCompilationInfo.nextInChain?.reinterpret()
			messageCount = this@WGPUCompilationInfo.messageCount
			messages = this@WGPUCompilationInfo.messages?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUCompilationInfo.adapt(structure: WGPUCompilationInfo) {
	nextInChain = structure.nextInChain?.reinterpret()
	messageCount = structure.messageCount
	messages = structure.messages?.handler?.reinterpret()
}

actual interface WGPUCompilationMessage {
	value class ByValue(val handle: CValue<webgpu.native.WGPUCompilationMessage>) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var message: CString?
			get() = handle.useContents { message?.toCString() }
			set(newValue) { handle.useContents { message = newValue?.handler?.reinterpret() } } 

		override var type: WGPUCompilationMessageType
			get() = handle.useContents { type ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) { handle.useContents { type = newValue } } 

		override var lineNum: ULong
			get() = handle.useContents { lineNum ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) { handle.useContents { lineNum = newValue } } 

		override var linePos: ULong
			get() = handle.useContents { linePos ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) { handle.useContents { linePos = newValue } } 

		override var offset: ULong
			get() = handle.useContents { offset ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) { handle.useContents { offset = newValue } } 

		override var length: ULong
			get() = handle.useContents { length ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) { handle.useContents { length = newValue } } 

		override var utf16LinePos: ULong
			get() = handle.useContents { utf16LinePos ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) { handle.useContents { utf16LinePos = newValue } } 

		override var utf16Offset: ULong
			get() = handle.useContents { utf16Offset ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) { handle.useContents { utf16Offset = newValue } } 

		override var utf16Length: ULong
			get() = handle.useContents { utf16Length ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) { handle.useContents { utf16Length = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var message: CString?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.message?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.message = newValue?.handler?.reinterpret() } } 

		override var type: WGPUCompilationMessageType
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.type ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.type = newValue } } 

		override var lineNum: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.lineNum ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.lineNum = newValue } } 

		override var linePos: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.linePos ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.linePos = newValue } } 

		override var offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.offset ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.offset = newValue } } 

		override var length: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.length ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.length = newValue } } 

		override var utf16LinePos: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.utf16LinePos ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.utf16LinePos = newValue } } 

		override var utf16Offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.utf16Offset ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.utf16Offset = newValue } } 

		override var utf16Length: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.utf16Length ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.utf16Length = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var message: CString?
	actual var type: WGPUCompilationMessageType
	actual var lineNum: ULong
	actual var linePos: ULong
	actual var offset: ULong
	actual var length: ULong
	actual var utf16LinePos: ULong
	actual var utf16Offset: ULong
	actual var utf16Length: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCompilationMessage {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCompilationMessage {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCompilationMessage>())
				.let { WGPUCompilationMessage(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCompilationMessage) -> Unit): ArrayHolder<WGPUCompilationMessage> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCompilationMessage>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUCompilationMessage>())
							.let(::NativeAddress)
							.let { WGPUCompilationMessage(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUCompilationMessage> {
		return cValue<webgpu.native.WGPUCompilationMessage> {
			nextInChain = this@WGPUCompilationMessage.nextInChain?.reinterpret()
			message = this@WGPUCompilationMessage.message?.handler?.reinterpret()
			type = this@WGPUCompilationMessage.type
			lineNum = this@WGPUCompilationMessage.lineNum
			linePos = this@WGPUCompilationMessage.linePos
			offset = this@WGPUCompilationMessage.offset
			length = this@WGPUCompilationMessage.length
			utf16LinePos = this@WGPUCompilationMessage.utf16LinePos
			utf16Offset = this@WGPUCompilationMessage.utf16Offset
			utf16Length = this@WGPUCompilationMessage.utf16Length
		}
	}
}

fun webgpu.native.WGPUCompilationMessage.adapt(structure: WGPUCompilationMessage) {
	nextInChain = structure.nextInChain?.reinterpret()
	message = structure.message?.handler?.reinterpret()
	type = structure.type
	lineNum = structure.lineNum
	linePos = structure.linePos
	offset = structure.offset
	length = structure.length
	utf16LinePos = structure.utf16LinePos
	utf16Offset = structure.utf16Offset
	utf16Length = structure.utf16Length
}

actual interface WGPUComputePassDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUComputePassDescriptor>) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = handle.useContents { timestampWrites?.let(::NativeAddress)?.let { WGPUComputePassTimestampWrites(it) } }
			set(newValue) { handle.useContents { timestampWrites = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.timestampWrites?.let(::NativeAddress)?.let { WGPUComputePassTimestampWrites(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.let { it.timestampWrites = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var timestampWrites: WGPUComputePassTimestampWrites?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUComputePassDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUComputePassDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUComputePassDescriptor>())
				.let { WGPUComputePassDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUComputePassDescriptor) -> Unit): ArrayHolder<WGPUComputePassDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUComputePassDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUComputePassDescriptor>())
							.let(::NativeAddress)
							.let { WGPUComputePassDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUComputePassDescriptor> {
		return cValue<webgpu.native.WGPUComputePassDescriptor> {
			nextInChain = this@WGPUComputePassDescriptor.nextInChain?.reinterpret()
			label = this@WGPUComputePassDescriptor.label?.handler?.reinterpret()
			timestampWrites = this@WGPUComputePassDescriptor.timestampWrites?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUComputePassDescriptor.adapt(structure: WGPUComputePassDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	timestampWrites = structure.timestampWrites?.handler?.reinterpret()
}

actual interface WGPUComputePassTimestampWrites {
	value class ByValue(val handle: CValue<webgpu.native.WGPUComputePassTimestampWrites>) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.useContents { querySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) } }
			set(newValue) { handle.useContents { querySet = newValue?.handler?.reinterpret() } } 

		override var beginningOfPassWriteIndex: UInt
			get() = handle.useContents { beginningOfPassWriteIndex ?: error("pointer of WGPUComputePassTimestampWrites is null") }
			set(newValue) { handle.useContents { beginningOfPassWriteIndex = newValue } } 

		override var endOfPassWriteIndex: UInt
			get() = handle.useContents { endOfPassWriteIndex ?: error("pointer of WGPUComputePassTimestampWrites is null") }
			set(newValue) { handle.useContents { endOfPassWriteIndex = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.querySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.let { it.querySet = newValue?.handler?.reinterpret() } } 

		override var beginningOfPassWriteIndex: UInt
			get() = handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.beginningOfPassWriteIndex ?: error("pointer of WGPUComputePassTimestampWrites is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.let { it.beginningOfPassWriteIndex = newValue } } 

		override var endOfPassWriteIndex: UInt
			get() = handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.endOfPassWriteIndex ?: error("pointer of WGPUComputePassTimestampWrites is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.let { it.endOfPassWriteIndex = newValue } } 

	}

	actual var querySet: WGPUQuerySet?
	actual var beginningOfPassWriteIndex: UInt
	actual var endOfPassWriteIndex: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUComputePassTimestampWrites {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUComputePassTimestampWrites {
			return allocator.allocate(sizeOf<webgpu.native.WGPUComputePassTimestampWrites>())
				.let { WGPUComputePassTimestampWrites(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUComputePassTimestampWrites) -> Unit): ArrayHolder<WGPUComputePassTimestampWrites> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUComputePassTimestampWrites>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUComputePassTimestampWrites>())
							.let(::NativeAddress)
							.let { WGPUComputePassTimestampWrites(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUComputePassTimestampWrites> {
		return cValue<webgpu.native.WGPUComputePassTimestampWrites> {
			querySet = this@WGPUComputePassTimestampWrites.querySet?.handler?.reinterpret()
			beginningOfPassWriteIndex = this@WGPUComputePassTimestampWrites.beginningOfPassWriteIndex
			endOfPassWriteIndex = this@WGPUComputePassTimestampWrites.endOfPassWriteIndex
		}
	}
}

fun webgpu.native.WGPUComputePassTimestampWrites.adapt(structure: WGPUComputePassTimestampWrites) {
	querySet = structure.querySet?.handler?.reinterpret()
	beginningOfPassWriteIndex = structure.beginningOfPassWriteIndex
	endOfPassWriteIndex = structure.endOfPassWriteIndex
}

actual interface WGPUProgrammableStageDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUProgrammableStageDescriptor>) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var module: WGPUShaderModule?
			get() = handle.useContents { module?.let(::NativeAddress)?.let { WGPUShaderModule(it) } }
			set(newValue) { handle.useContents { module = newValue?.handler?.reinterpret() } } 

		override var entryPoint: CString?
			get() = handle.useContents { entryPoint?.toCString() }
			set(newValue) { handle.useContents { entryPoint = newValue?.handler?.reinterpret() } } 

		override var constantCount: ULong
			get() = handle.useContents { constantCount ?: error("pointer of WGPUProgrammableStageDescriptor is null") }
			set(newValue) { handle.useContents { constantCount = newValue } } 

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.useContents { constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) } }
			set(newValue) { handle.useContents { constants = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var module: WGPUShaderModule?
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.module?.let(::NativeAddress)?.let { WGPUShaderModule(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.module = newValue?.handler?.reinterpret() } } 

		override var entryPoint: CString?
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.entryPoint?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.entryPoint = newValue?.handler?.reinterpret() } } 

		override var constantCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.constantCount ?: error("pointer of WGPUProgrammableStageDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.constantCount = newValue } } 

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.constants = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var module: WGPUShaderModule?
	actual var entryPoint: CString?
	actual var constantCount: ULong
	actual var constants: ArrayHolder<WGPUConstantEntry>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUProgrammableStageDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUProgrammableStageDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUProgrammableStageDescriptor>())
				.let { WGPUProgrammableStageDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUProgrammableStageDescriptor) -> Unit): ArrayHolder<WGPUProgrammableStageDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUProgrammableStageDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUProgrammableStageDescriptor>())
							.let(::NativeAddress)
							.let { WGPUProgrammableStageDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUProgrammableStageDescriptor> {
		return cValue<webgpu.native.WGPUProgrammableStageDescriptor> {
			nextInChain = this@WGPUProgrammableStageDescriptor.nextInChain?.reinterpret()
			module = this@WGPUProgrammableStageDescriptor.module?.handler?.reinterpret()
			entryPoint = this@WGPUProgrammableStageDescriptor.entryPoint?.handler?.reinterpret()
			constantCount = this@WGPUProgrammableStageDescriptor.constantCount
			constants = this@WGPUProgrammableStageDescriptor.constants?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUProgrammableStageDescriptor.adapt(structure: WGPUProgrammableStageDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	module = structure.module?.handler?.reinterpret()
	entryPoint = structure.entryPoint?.handler?.reinterpret()
	constantCount = structure.constantCount
	constants = structure.constants?.handler?.reinterpret()
}

actual interface WGPUComputePipelineDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUComputePipelineDescriptor>) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var layout: WGPUPipelineLayout?
			get() = handle.useContents { layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) } }
			set(newValue) { handle.useContents { layout = newValue?.handler?.reinterpret() } } 

		override val compute: WGPUProgrammableStageDescriptor
			get() = handle.useContents { compute.rawPtr.toLong().let(::NativeAddress).let { WGPUProgrammableStageDescriptor(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var layout: WGPUPipelineLayout?
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.let { it.layout = newValue?.handler?.reinterpret() } } 

		override val compute: WGPUProgrammableStageDescriptor
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.compute.rawPtr.toLong().let(::NativeAddress).let { WGPUProgrammableStageDescriptor(it) }

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var layout: WGPUPipelineLayout?
	actual val compute: WGPUProgrammableStageDescriptor
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUComputePipelineDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUComputePipelineDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUComputePipelineDescriptor>())
				.let { WGPUComputePipelineDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUComputePipelineDescriptor) -> Unit): ArrayHolder<WGPUComputePipelineDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUComputePipelineDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUComputePipelineDescriptor>())
							.let(::NativeAddress)
							.let { WGPUComputePipelineDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUComputePipelineDescriptor> {
		return cValue<webgpu.native.WGPUComputePipelineDescriptor> {
			compute.adapt(this@WGPUComputePipelineDescriptor.compute)
			nextInChain = this@WGPUComputePipelineDescriptor.nextInChain?.reinterpret()
			label = this@WGPUComputePipelineDescriptor.label?.handler?.reinterpret()
			layout = this@WGPUComputePipelineDescriptor.layout?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUComputePipelineDescriptor.adapt(structure: WGPUComputePipelineDescriptor) {
	compute.adapt(structure.compute)
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
}

actual interface WGPULimits {
	value class ByValue(val handle: CValue<webgpu.native.WGPULimits>) : WGPULimits {
		override var maxTextureDimension1D: UInt
			get() = handle.useContents { maxTextureDimension1D ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxTextureDimension1D = newValue } } 

		override var maxTextureDimension2D: UInt
			get() = handle.useContents { maxTextureDimension2D ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxTextureDimension2D = newValue } } 

		override var maxTextureDimension3D: UInt
			get() = handle.useContents { maxTextureDimension3D ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxTextureDimension3D = newValue } } 

		override var maxTextureArrayLayers: UInt
			get() = handle.useContents { maxTextureArrayLayers ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxTextureArrayLayers = newValue } } 

		override var maxBindGroups: UInt
			get() = handle.useContents { maxBindGroups ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxBindGroups = newValue } } 

		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = handle.useContents { maxBindGroupsPlusVertexBuffers ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxBindGroupsPlusVertexBuffers = newValue } } 

		override var maxBindingsPerBindGroup: UInt
			get() = handle.useContents { maxBindingsPerBindGroup ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxBindingsPerBindGroup = newValue } } 

		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = handle.useContents { maxDynamicUniformBuffersPerPipelineLayout ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxDynamicUniformBuffersPerPipelineLayout = newValue } } 

		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = handle.useContents { maxDynamicStorageBuffersPerPipelineLayout ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxDynamicStorageBuffersPerPipelineLayout = newValue } } 

		override var maxSampledTexturesPerShaderStage: UInt
			get() = handle.useContents { maxSampledTexturesPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxSampledTexturesPerShaderStage = newValue } } 

		override var maxSamplersPerShaderStage: UInt
			get() = handle.useContents { maxSamplersPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxSamplersPerShaderStage = newValue } } 

		override var maxStorageBuffersPerShaderStage: UInt
			get() = handle.useContents { maxStorageBuffersPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxStorageBuffersPerShaderStage = newValue } } 

		override var maxStorageTexturesPerShaderStage: UInt
			get() = handle.useContents { maxStorageTexturesPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxStorageTexturesPerShaderStage = newValue } } 

		override var maxUniformBuffersPerShaderStage: UInt
			get() = handle.useContents { maxUniformBuffersPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxUniformBuffersPerShaderStage = newValue } } 

		override var maxUniformBufferBindingSize: ULong
			get() = handle.useContents { maxUniformBufferBindingSize ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxUniformBufferBindingSize = newValue } } 

		override var maxStorageBufferBindingSize: ULong
			get() = handle.useContents { maxStorageBufferBindingSize ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxStorageBufferBindingSize = newValue } } 

		override var minUniformBufferOffsetAlignment: UInt
			get() = handle.useContents { minUniformBufferOffsetAlignment ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { minUniformBufferOffsetAlignment = newValue } } 

		override var minStorageBufferOffsetAlignment: UInt
			get() = handle.useContents { minStorageBufferOffsetAlignment ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { minStorageBufferOffsetAlignment = newValue } } 

		override var maxVertexBuffers: UInt
			get() = handle.useContents { maxVertexBuffers ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxVertexBuffers = newValue } } 

		override var maxBufferSize: ULong
			get() = handle.useContents { maxBufferSize ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxBufferSize = newValue } } 

		override var maxVertexAttributes: UInt
			get() = handle.useContents { maxVertexAttributes ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxVertexAttributes = newValue } } 

		override var maxVertexBufferArrayStride: UInt
			get() = handle.useContents { maxVertexBufferArrayStride ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxVertexBufferArrayStride = newValue } } 

		override var maxInterStageShaderComponents: UInt
			get() = handle.useContents { maxInterStageShaderComponents ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxInterStageShaderComponents = newValue } } 

		override var maxInterStageShaderVariables: UInt
			get() = handle.useContents { maxInterStageShaderVariables ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxInterStageShaderVariables = newValue } } 

		override var maxColorAttachments: UInt
			get() = handle.useContents { maxColorAttachments ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxColorAttachments = newValue } } 

		override var maxColorAttachmentBytesPerSample: UInt
			get() = handle.useContents { maxColorAttachmentBytesPerSample ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxColorAttachmentBytesPerSample = newValue } } 

		override var maxComputeWorkgroupStorageSize: UInt
			get() = handle.useContents { maxComputeWorkgroupStorageSize ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxComputeWorkgroupStorageSize = newValue } } 

		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = handle.useContents { maxComputeInvocationsPerWorkgroup ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxComputeInvocationsPerWorkgroup = newValue } } 

		override var maxComputeWorkgroupSizeX: UInt
			get() = handle.useContents { maxComputeWorkgroupSizeX ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxComputeWorkgroupSizeX = newValue } } 

		override var maxComputeWorkgroupSizeY: UInt
			get() = handle.useContents { maxComputeWorkgroupSizeY ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxComputeWorkgroupSizeY = newValue } } 

		override var maxComputeWorkgroupSizeZ: UInt
			get() = handle.useContents { maxComputeWorkgroupSizeZ ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxComputeWorkgroupSizeZ = newValue } } 

		override var maxComputeWorkgroupsPerDimension: UInt
			get() = handle.useContents { maxComputeWorkgroupsPerDimension ?: error("pointer of WGPULimits is null") }
			set(newValue) { handle.useContents { maxComputeWorkgroupsPerDimension = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPULimits {
		override var maxTextureDimension1D: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxTextureDimension1D ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxTextureDimension1D = newValue } } 

		override var maxTextureDimension2D: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxTextureDimension2D ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxTextureDimension2D = newValue } } 

		override var maxTextureDimension3D: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxTextureDimension3D ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxTextureDimension3D = newValue } } 

		override var maxTextureArrayLayers: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxTextureArrayLayers ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxTextureArrayLayers = newValue } } 

		override var maxBindGroups: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxBindGroups ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxBindGroups = newValue } } 

		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxBindGroupsPlusVertexBuffers ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxBindGroupsPlusVertexBuffers = newValue } } 

		override var maxBindingsPerBindGroup: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxBindingsPerBindGroup ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxBindingsPerBindGroup = newValue } } 

		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxDynamicUniformBuffersPerPipelineLayout ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxDynamicUniformBuffersPerPipelineLayout = newValue } } 

		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxDynamicStorageBuffersPerPipelineLayout ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxDynamicStorageBuffersPerPipelineLayout = newValue } } 

		override var maxSampledTexturesPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxSampledTexturesPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxSampledTexturesPerShaderStage = newValue } } 

		override var maxSamplersPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxSamplersPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxSamplersPerShaderStage = newValue } } 

		override var maxStorageBuffersPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxStorageBuffersPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxStorageBuffersPerShaderStage = newValue } } 

		override var maxStorageTexturesPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxStorageTexturesPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxStorageTexturesPerShaderStage = newValue } } 

		override var maxUniformBuffersPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxUniformBuffersPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxUniformBuffersPerShaderStage = newValue } } 

		override var maxUniformBufferBindingSize: ULong
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxUniformBufferBindingSize ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxUniformBufferBindingSize = newValue } } 

		override var maxStorageBufferBindingSize: ULong
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxStorageBufferBindingSize ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxStorageBufferBindingSize = newValue } } 

		override var minUniformBufferOffsetAlignment: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.minUniformBufferOffsetAlignment ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.minUniformBufferOffsetAlignment = newValue } } 

		override var minStorageBufferOffsetAlignment: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.minStorageBufferOffsetAlignment ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.minStorageBufferOffsetAlignment = newValue } } 

		override var maxVertexBuffers: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxVertexBuffers ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxVertexBuffers = newValue } } 

		override var maxBufferSize: ULong
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxBufferSize ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxBufferSize = newValue } } 

		override var maxVertexAttributes: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxVertexAttributes ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxVertexAttributes = newValue } } 

		override var maxVertexBufferArrayStride: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxVertexBufferArrayStride ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxVertexBufferArrayStride = newValue } } 

		override var maxInterStageShaderComponents: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxInterStageShaderComponents ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxInterStageShaderComponents = newValue } } 

		override var maxInterStageShaderVariables: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxInterStageShaderVariables ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxInterStageShaderVariables = newValue } } 

		override var maxColorAttachments: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxColorAttachments ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxColorAttachments = newValue } } 

		override var maxColorAttachmentBytesPerSample: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxColorAttachmentBytesPerSample ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxColorAttachmentBytesPerSample = newValue } } 

		override var maxComputeWorkgroupStorageSize: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupStorageSize ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupStorageSize = newValue } } 

		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeInvocationsPerWorkgroup ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeInvocationsPerWorkgroup = newValue } } 

		override var maxComputeWorkgroupSizeX: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupSizeX ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupSizeX = newValue } } 

		override var maxComputeWorkgroupSizeY: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupSizeY ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupSizeY = newValue } } 

		override var maxComputeWorkgroupSizeZ: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupSizeZ ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupSizeZ = newValue } } 

		override var maxComputeWorkgroupsPerDimension: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupsPerDimension ?: error("pointer of WGPULimits is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupsPerDimension = newValue } } 

	}

	actual var maxTextureDimension1D: UInt
	actual var maxTextureDimension2D: UInt
	actual var maxTextureDimension3D: UInt
	actual var maxTextureArrayLayers: UInt
	actual var maxBindGroups: UInt
	actual var maxBindGroupsPlusVertexBuffers: UInt
	actual var maxBindingsPerBindGroup: UInt
	actual var maxDynamicUniformBuffersPerPipelineLayout: UInt
	actual var maxDynamicStorageBuffersPerPipelineLayout: UInt
	actual var maxSampledTexturesPerShaderStage: UInt
	actual var maxSamplersPerShaderStage: UInt
	actual var maxStorageBuffersPerShaderStage: UInt
	actual var maxStorageTexturesPerShaderStage: UInt
	actual var maxUniformBuffersPerShaderStage: UInt
	actual var maxUniformBufferBindingSize: ULong
	actual var maxStorageBufferBindingSize: ULong
	actual var minUniformBufferOffsetAlignment: UInt
	actual var minStorageBufferOffsetAlignment: UInt
	actual var maxVertexBuffers: UInt
	actual var maxBufferSize: ULong
	actual var maxVertexAttributes: UInt
	actual var maxVertexBufferArrayStride: UInt
	actual var maxInterStageShaderComponents: UInt
	actual var maxInterStageShaderVariables: UInt
	actual var maxColorAttachments: UInt
	actual var maxColorAttachmentBytesPerSample: UInt
	actual var maxComputeWorkgroupStorageSize: UInt
	actual var maxComputeInvocationsPerWorkgroup: UInt
	actual var maxComputeWorkgroupSizeX: UInt
	actual var maxComputeWorkgroupSizeY: UInt
	actual var maxComputeWorkgroupSizeZ: UInt
	actual var maxComputeWorkgroupsPerDimension: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPULimits {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPULimits {
			return allocator.allocate(sizeOf<webgpu.native.WGPULimits>())
				.let { WGPULimits(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPULimits) -> Unit): ArrayHolder<WGPULimits> {
			return allocator.allocate(sizeOf<webgpu.native.WGPULimits>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPULimits>())
							.let(::NativeAddress)
							.let { WGPULimits(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPULimits> {
		return cValue<webgpu.native.WGPULimits> {
			maxTextureDimension1D = this@WGPULimits.maxTextureDimension1D
			maxTextureDimension2D = this@WGPULimits.maxTextureDimension2D
			maxTextureDimension3D = this@WGPULimits.maxTextureDimension3D
			maxTextureArrayLayers = this@WGPULimits.maxTextureArrayLayers
			maxBindGroups = this@WGPULimits.maxBindGroups
			maxBindGroupsPlusVertexBuffers = this@WGPULimits.maxBindGroupsPlusVertexBuffers
			maxBindingsPerBindGroup = this@WGPULimits.maxBindingsPerBindGroup
			maxDynamicUniformBuffersPerPipelineLayout = this@WGPULimits.maxDynamicUniformBuffersPerPipelineLayout
			maxDynamicStorageBuffersPerPipelineLayout = this@WGPULimits.maxDynamicStorageBuffersPerPipelineLayout
			maxSampledTexturesPerShaderStage = this@WGPULimits.maxSampledTexturesPerShaderStage
			maxSamplersPerShaderStage = this@WGPULimits.maxSamplersPerShaderStage
			maxStorageBuffersPerShaderStage = this@WGPULimits.maxStorageBuffersPerShaderStage
			maxStorageTexturesPerShaderStage = this@WGPULimits.maxStorageTexturesPerShaderStage
			maxUniformBuffersPerShaderStage = this@WGPULimits.maxUniformBuffersPerShaderStage
			maxUniformBufferBindingSize = this@WGPULimits.maxUniformBufferBindingSize
			maxStorageBufferBindingSize = this@WGPULimits.maxStorageBufferBindingSize
			minUniformBufferOffsetAlignment = this@WGPULimits.minUniformBufferOffsetAlignment
			minStorageBufferOffsetAlignment = this@WGPULimits.minStorageBufferOffsetAlignment
			maxVertexBuffers = this@WGPULimits.maxVertexBuffers
			maxBufferSize = this@WGPULimits.maxBufferSize
			maxVertexAttributes = this@WGPULimits.maxVertexAttributes
			maxVertexBufferArrayStride = this@WGPULimits.maxVertexBufferArrayStride
			maxInterStageShaderComponents = this@WGPULimits.maxInterStageShaderComponents
			maxInterStageShaderVariables = this@WGPULimits.maxInterStageShaderVariables
			maxColorAttachments = this@WGPULimits.maxColorAttachments
			maxColorAttachmentBytesPerSample = this@WGPULimits.maxColorAttachmentBytesPerSample
			maxComputeWorkgroupStorageSize = this@WGPULimits.maxComputeWorkgroupStorageSize
			maxComputeInvocationsPerWorkgroup = this@WGPULimits.maxComputeInvocationsPerWorkgroup
			maxComputeWorkgroupSizeX = this@WGPULimits.maxComputeWorkgroupSizeX
			maxComputeWorkgroupSizeY = this@WGPULimits.maxComputeWorkgroupSizeY
			maxComputeWorkgroupSizeZ = this@WGPULimits.maxComputeWorkgroupSizeZ
			maxComputeWorkgroupsPerDimension = this@WGPULimits.maxComputeWorkgroupsPerDimension
		}
	}
}

fun webgpu.native.WGPULimits.adapt(structure: WGPULimits) {
	maxTextureDimension1D = structure.maxTextureDimension1D
	maxTextureDimension2D = structure.maxTextureDimension2D
	maxTextureDimension3D = structure.maxTextureDimension3D
	maxTextureArrayLayers = structure.maxTextureArrayLayers
	maxBindGroups = structure.maxBindGroups
	maxBindGroupsPlusVertexBuffers = structure.maxBindGroupsPlusVertexBuffers
	maxBindingsPerBindGroup = structure.maxBindingsPerBindGroup
	maxDynamicUniformBuffersPerPipelineLayout = structure.maxDynamicUniformBuffersPerPipelineLayout
	maxDynamicStorageBuffersPerPipelineLayout = structure.maxDynamicStorageBuffersPerPipelineLayout
	maxSampledTexturesPerShaderStage = structure.maxSampledTexturesPerShaderStage
	maxSamplersPerShaderStage = structure.maxSamplersPerShaderStage
	maxStorageBuffersPerShaderStage = structure.maxStorageBuffersPerShaderStage
	maxStorageTexturesPerShaderStage = structure.maxStorageTexturesPerShaderStage
	maxUniformBuffersPerShaderStage = structure.maxUniformBuffersPerShaderStage
	maxUniformBufferBindingSize = structure.maxUniformBufferBindingSize
	maxStorageBufferBindingSize = structure.maxStorageBufferBindingSize
	minUniformBufferOffsetAlignment = structure.minUniformBufferOffsetAlignment
	minStorageBufferOffsetAlignment = structure.minStorageBufferOffsetAlignment
	maxVertexBuffers = structure.maxVertexBuffers
	maxBufferSize = structure.maxBufferSize
	maxVertexAttributes = structure.maxVertexAttributes
	maxVertexBufferArrayStride = structure.maxVertexBufferArrayStride
	maxInterStageShaderComponents = structure.maxInterStageShaderComponents
	maxInterStageShaderVariables = structure.maxInterStageShaderVariables
	maxColorAttachments = structure.maxColorAttachments
	maxColorAttachmentBytesPerSample = structure.maxColorAttachmentBytesPerSample
	maxComputeWorkgroupStorageSize = structure.maxComputeWorkgroupStorageSize
	maxComputeInvocationsPerWorkgroup = structure.maxComputeInvocationsPerWorkgroup
	maxComputeWorkgroupSizeX = structure.maxComputeWorkgroupSizeX
	maxComputeWorkgroupSizeY = structure.maxComputeWorkgroupSizeY
	maxComputeWorkgroupSizeZ = structure.maxComputeWorkgroupSizeZ
	maxComputeWorkgroupsPerDimension = structure.maxComputeWorkgroupsPerDimension
}

actual interface WGPURequiredLimits {
	value class ByValue(val handle: CValue<webgpu.native.WGPURequiredLimits>) : WGPURequiredLimits {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val limits: WGPULimits
			get() = handle.useContents { limits.rawPtr.toLong().let(::NativeAddress).let { WGPULimits(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURequiredLimits {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequiredLimits>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequiredLimits>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val limits: WGPULimits
			get() = handler.reinterpret<webgpu.native.WGPURequiredLimits>().pointed.limits.rawPtr.toLong().let(::NativeAddress).let { WGPULimits(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val limits: WGPULimits
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURequiredLimits {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURequiredLimits {
			return allocator.allocate(sizeOf<webgpu.native.WGPURequiredLimits>())
				.let { WGPURequiredLimits(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURequiredLimits) -> Unit): ArrayHolder<WGPURequiredLimits> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURequiredLimits>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURequiredLimits>())
							.let(::NativeAddress)
							.let { WGPURequiredLimits(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURequiredLimits> {
		return cValue<webgpu.native.WGPURequiredLimits> {
			limits.adapt(this@WGPURequiredLimits.limits)
			nextInChain = this@WGPURequiredLimits.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURequiredLimits.adapt(structure: WGPURequiredLimits) {
	limits.adapt(structure.limits)
	nextInChain = structure.nextInChain?.reinterpret()
}

actual interface WGPUSupportedLimits {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSupportedLimits>) : WGPUSupportedLimits {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val limits: WGPULimits
			get() = handle.useContents { limits.rawPtr.toLong().let(::NativeAddress).let { WGPULimits(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSupportedLimits {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSupportedLimits>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSupportedLimits>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val limits: WGPULimits
			get() = handler.reinterpret<webgpu.native.WGPUSupportedLimits>().pointed.limits.rawPtr.toLong().let(::NativeAddress).let { WGPULimits(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val limits: WGPULimits
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSupportedLimits {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSupportedLimits {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSupportedLimits>())
				.let { WGPUSupportedLimits(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSupportedLimits) -> Unit): ArrayHolder<WGPUSupportedLimits> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSupportedLimits>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSupportedLimits>())
							.let(::NativeAddress)
							.let { WGPUSupportedLimits(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSupportedLimits> {
		return cValue<webgpu.native.WGPUSupportedLimits> {
			limits.adapt(this@WGPUSupportedLimits.limits)
			nextInChain = this@WGPUSupportedLimits.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSupportedLimits.adapt(structure: WGPUSupportedLimits) {
	limits.adapt(structure.limits)
	nextInChain = structure.nextInChain?.reinterpret()
}

actual interface WGPUExtent3D {
	value class ByValue(val handle: CValue<webgpu.native.WGPUExtent3D>) : WGPUExtent3D {
		override var width: UInt
			get() = handle.useContents { width ?: error("pointer of WGPUExtent3D is null") }
			set(newValue) { handle.useContents { width = newValue } } 

		override var height: UInt
			get() = handle.useContents { height ?: error("pointer of WGPUExtent3D is null") }
			set(newValue) { handle.useContents { height = newValue } } 

		override var depthOrArrayLayers: UInt
			get() = handle.useContents { depthOrArrayLayers ?: error("pointer of WGPUExtent3D is null") }
			set(newValue) { handle.useContents { depthOrArrayLayers = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUExtent3D {
		override var width: UInt
			get() = handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.width ?: error("pointer of WGPUExtent3D is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.let { it.width = newValue } } 

		override var height: UInt
			get() = handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.height ?: error("pointer of WGPUExtent3D is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.let { it.height = newValue } } 

		override var depthOrArrayLayers: UInt
			get() = handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.depthOrArrayLayers ?: error("pointer of WGPUExtent3D is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.let { it.depthOrArrayLayers = newValue } } 

	}

	actual var width: UInt
	actual var height: UInt
	actual var depthOrArrayLayers: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUExtent3D {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUExtent3D {
			return allocator.allocate(sizeOf<webgpu.native.WGPUExtent3D>())
				.let { WGPUExtent3D(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUExtent3D) -> Unit): ArrayHolder<WGPUExtent3D> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUExtent3D>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUExtent3D>())
							.let(::NativeAddress)
							.let { WGPUExtent3D(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUExtent3D> {
		return cValue<webgpu.native.WGPUExtent3D> {
			width = this@WGPUExtent3D.width
			height = this@WGPUExtent3D.height
			depthOrArrayLayers = this@WGPUExtent3D.depthOrArrayLayers
		}
	}
}

fun webgpu.native.WGPUExtent3D.adapt(structure: WGPUExtent3D) {
	width = structure.width
	height = structure.height
	depthOrArrayLayers = structure.depthOrArrayLayers
}

actual interface WGPUTextureDataLayout {
	value class ByValue(val handle: CValue<webgpu.native.WGPUTextureDataLayout>) : WGPUTextureDataLayout {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var offset: ULong
			get() = handle.useContents { offset ?: error("pointer of WGPUTextureDataLayout is null") }
			set(newValue) { handle.useContents { offset = newValue } } 

		override var bytesPerRow: UInt
			get() = handle.useContents { bytesPerRow ?: error("pointer of WGPUTextureDataLayout is null") }
			set(newValue) { handle.useContents { bytesPerRow = newValue } } 

		override var rowsPerImage: UInt
			get() = handle.useContents { rowsPerImage ?: error("pointer of WGPUTextureDataLayout is null") }
			set(newValue) { handle.useContents { rowsPerImage = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUTextureDataLayout {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUTextureDataLayout>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDataLayout>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUTextureDataLayout>().pointed.offset ?: error("pointer of WGPUTextureDataLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDataLayout>().pointed.let { it.offset = newValue } } 

		override var bytesPerRow: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureDataLayout>().pointed.bytesPerRow ?: error("pointer of WGPUTextureDataLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDataLayout>().pointed.let { it.bytesPerRow = newValue } } 

		override var rowsPerImage: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureDataLayout>().pointed.rowsPerImage ?: error("pointer of WGPUTextureDataLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDataLayout>().pointed.let { it.rowsPerImage = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var offset: ULong
	actual var bytesPerRow: UInt
	actual var rowsPerImage: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureDataLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureDataLayout {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTextureDataLayout>())
				.let { WGPUTextureDataLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureDataLayout) -> Unit): ArrayHolder<WGPUTextureDataLayout> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTextureDataLayout>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUTextureDataLayout>())
							.let(::NativeAddress)
							.let { WGPUTextureDataLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUTextureDataLayout> {
		return cValue<webgpu.native.WGPUTextureDataLayout> {
			nextInChain = this@WGPUTextureDataLayout.nextInChain?.reinterpret()
			offset = this@WGPUTextureDataLayout.offset
			bytesPerRow = this@WGPUTextureDataLayout.bytesPerRow
			rowsPerImage = this@WGPUTextureDataLayout.rowsPerImage
		}
	}
}

fun webgpu.native.WGPUTextureDataLayout.adapt(structure: WGPUTextureDataLayout) {
	nextInChain = structure.nextInChain?.reinterpret()
	offset = structure.offset
	bytesPerRow = structure.bytesPerRow
	rowsPerImage = structure.rowsPerImage
}

actual interface WGPUImageCopyBuffer {
	value class ByValue(val handle: CValue<webgpu.native.WGPUImageCopyBuffer>) : WGPUImageCopyBuffer {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val layout: WGPUTextureDataLayout
			get() = handle.useContents { layout.rawPtr.toLong().let(::NativeAddress).let { WGPUTextureDataLayout(it) } }

		override var buffer: WGPUBuffer?
			get() = handle.useContents { buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) } }
			set(newValue) { handle.useContents { buffer = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUImageCopyBuffer {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUImageCopyBuffer>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUImageCopyBuffer>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val layout: WGPUTextureDataLayout
			get() = handler.reinterpret<webgpu.native.WGPUImageCopyBuffer>().pointed.layout.rawPtr.toLong().let(::NativeAddress).let { WGPUTextureDataLayout(it) }

		override var buffer: WGPUBuffer?
			get() = handler.reinterpret<webgpu.native.WGPUImageCopyBuffer>().pointed.buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUImageCopyBuffer>().pointed.let { it.buffer = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual val layout: WGPUTextureDataLayout
	actual var buffer: WGPUBuffer?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUImageCopyBuffer {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUImageCopyBuffer {
			return allocator.allocate(sizeOf<webgpu.native.WGPUImageCopyBuffer>())
				.let { WGPUImageCopyBuffer(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUImageCopyBuffer) -> Unit): ArrayHolder<WGPUImageCopyBuffer> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUImageCopyBuffer>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUImageCopyBuffer>())
							.let(::NativeAddress)
							.let { WGPUImageCopyBuffer(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUImageCopyBuffer> {
		return cValue<webgpu.native.WGPUImageCopyBuffer> {
			layout.adapt(this@WGPUImageCopyBuffer.layout)
			nextInChain = this@WGPUImageCopyBuffer.nextInChain?.reinterpret()
			buffer = this@WGPUImageCopyBuffer.buffer?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUImageCopyBuffer.adapt(structure: WGPUImageCopyBuffer) {
	layout.adapt(structure.layout)
	nextInChain = structure.nextInChain?.reinterpret()
	buffer = structure.buffer?.handler?.reinterpret()
}

actual interface WGPUOrigin3D {
	value class ByValue(val handle: CValue<webgpu.native.WGPUOrigin3D>) : WGPUOrigin3D {
		override var x: UInt
			get() = handle.useContents { x ?: error("pointer of WGPUOrigin3D is null") }
			set(newValue) { handle.useContents { x = newValue } } 

		override var y: UInt
			get() = handle.useContents { y ?: error("pointer of WGPUOrigin3D is null") }
			set(newValue) { handle.useContents { y = newValue } } 

		override var z: UInt
			get() = handle.useContents { z ?: error("pointer of WGPUOrigin3D is null") }
			set(newValue) { handle.useContents { z = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUOrigin3D {
		override var x: UInt
			get() = handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.x ?: error("pointer of WGPUOrigin3D is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.let { it.x = newValue } } 

		override var y: UInt
			get() = handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.y ?: error("pointer of WGPUOrigin3D is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.let { it.y = newValue } } 

		override var z: UInt
			get() = handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.z ?: error("pointer of WGPUOrigin3D is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.let { it.z = newValue } } 

	}

	actual var x: UInt
	actual var y: UInt
	actual var z: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUOrigin3D {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUOrigin3D {
			return allocator.allocate(sizeOf<webgpu.native.WGPUOrigin3D>())
				.let { WGPUOrigin3D(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUOrigin3D) -> Unit): ArrayHolder<WGPUOrigin3D> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUOrigin3D>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUOrigin3D>())
							.let(::NativeAddress)
							.let { WGPUOrigin3D(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUOrigin3D> {
		return cValue<webgpu.native.WGPUOrigin3D> {
			x = this@WGPUOrigin3D.x
			y = this@WGPUOrigin3D.y
			z = this@WGPUOrigin3D.z
		}
	}
}

fun webgpu.native.WGPUOrigin3D.adapt(structure: WGPUOrigin3D) {
	x = structure.x
	y = structure.y
	z = structure.z
}

actual interface WGPUImageCopyTexture {
	value class ByValue(val handle: CValue<webgpu.native.WGPUImageCopyTexture>) : WGPUImageCopyTexture {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var texture: WGPUTexture?
			get() = handle.useContents { texture?.let(::NativeAddress)?.let { WGPUTexture(it) } }
			set(newValue) { handle.useContents { texture = newValue?.handler?.reinterpret() } } 

		override var mipLevel: UInt
			get() = handle.useContents { mipLevel ?: error("pointer of WGPUImageCopyTexture is null") }
			set(newValue) { handle.useContents { mipLevel = newValue } } 

		override val origin: WGPUOrigin3D
			get() = handle.useContents { origin.rawPtr.toLong().let(::NativeAddress).let { WGPUOrigin3D(it) } }

		override var aspect: WGPUTextureAspect
			get() = handle.useContents { aspect ?: error("pointer of WGPUImageCopyTexture is null") }
			set(newValue) { handle.useContents { aspect = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUImageCopyTexture {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUImageCopyTexture>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUImageCopyTexture>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var texture: WGPUTexture?
			get() = handler.reinterpret<webgpu.native.WGPUImageCopyTexture>().pointed.texture?.let(::NativeAddress)?.let { WGPUTexture(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUImageCopyTexture>().pointed.let { it.texture = newValue?.handler?.reinterpret() } } 

		override var mipLevel: UInt
			get() = handler.reinterpret<webgpu.native.WGPUImageCopyTexture>().pointed.mipLevel ?: error("pointer of WGPUImageCopyTexture is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUImageCopyTexture>().pointed.let { it.mipLevel = newValue } } 

		override val origin: WGPUOrigin3D
			get() = handler.reinterpret<webgpu.native.WGPUImageCopyTexture>().pointed.origin.rawPtr.toLong().let(::NativeAddress).let { WGPUOrigin3D(it) }

		override var aspect: WGPUTextureAspect
			get() = handler.reinterpret<webgpu.native.WGPUImageCopyTexture>().pointed.aspect ?: error("pointer of WGPUImageCopyTexture is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUImageCopyTexture>().pointed.let { it.aspect = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var texture: WGPUTexture?
	actual var mipLevel: UInt
	actual val origin: WGPUOrigin3D
	actual var aspect: WGPUTextureAspect
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUImageCopyTexture {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUImageCopyTexture {
			return allocator.allocate(sizeOf<webgpu.native.WGPUImageCopyTexture>())
				.let { WGPUImageCopyTexture(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUImageCopyTexture) -> Unit): ArrayHolder<WGPUImageCopyTexture> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUImageCopyTexture>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUImageCopyTexture>())
							.let(::NativeAddress)
							.let { WGPUImageCopyTexture(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUImageCopyTexture> {
		return cValue<webgpu.native.WGPUImageCopyTexture> {
			origin.adapt(this@WGPUImageCopyTexture.origin)
			nextInChain = this@WGPUImageCopyTexture.nextInChain?.reinterpret()
			texture = this@WGPUImageCopyTexture.texture?.handler?.reinterpret()
			mipLevel = this@WGPUImageCopyTexture.mipLevel
			aspect = this@WGPUImageCopyTexture.aspect
		}
	}
}

fun webgpu.native.WGPUImageCopyTexture.adapt(structure: WGPUImageCopyTexture) {
	origin.adapt(structure.origin)
	nextInChain = structure.nextInChain?.reinterpret()
	texture = structure.texture?.handler?.reinterpret()
	mipLevel = structure.mipLevel
	aspect = structure.aspect
}

actual interface WGPUInstanceDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUInstanceDescriptor>) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUInstanceDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUInstanceDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUInstanceDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUInstanceDescriptor>())
				.let { WGPUInstanceDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUInstanceDescriptor) -> Unit): ArrayHolder<WGPUInstanceDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUInstanceDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUInstanceDescriptor>())
							.let(::NativeAddress)
							.let { WGPUInstanceDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUInstanceDescriptor> {
		return cValue<webgpu.native.WGPUInstanceDescriptor> {
			nextInChain = this@WGPUInstanceDescriptor.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUInstanceDescriptor.adapt(structure: WGPUInstanceDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
}

actual interface WGPUVertexAttribute {
	value class ByValue(val handle: CValue<webgpu.native.WGPUVertexAttribute>) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = handle.useContents { format ?: error("pointer of WGPUVertexAttribute is null") }
			set(newValue) { handle.useContents { format = newValue } } 

		override var offset: ULong
			get() = handle.useContents { offset ?: error("pointer of WGPUVertexAttribute is null") }
			set(newValue) { handle.useContents { offset = newValue } } 

		override var shaderLocation: UInt
			get() = handle.useContents { shaderLocation ?: error("pointer of WGPUVertexAttribute is null") }
			set(newValue) { handle.useContents { shaderLocation = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.format ?: error("pointer of WGPUVertexAttribute is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.let { it.format = newValue } } 

		override var offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.offset ?: error("pointer of WGPUVertexAttribute is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.let { it.offset = newValue } } 

		override var shaderLocation: UInt
			get() = handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.shaderLocation ?: error("pointer of WGPUVertexAttribute is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.let { it.shaderLocation = newValue } } 

	}

	actual var format: WGPUVertexFormat
	actual var offset: ULong
	actual var shaderLocation: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUVertexAttribute {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUVertexAttribute {
			return allocator.allocate(sizeOf<webgpu.native.WGPUVertexAttribute>())
				.let { WGPUVertexAttribute(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUVertexAttribute) -> Unit): ArrayHolder<WGPUVertexAttribute> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUVertexAttribute>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUVertexAttribute>())
							.let(::NativeAddress)
							.let { WGPUVertexAttribute(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUVertexAttribute> {
		return cValue<webgpu.native.WGPUVertexAttribute> {
			format = this@WGPUVertexAttribute.format
			offset = this@WGPUVertexAttribute.offset
			shaderLocation = this@WGPUVertexAttribute.shaderLocation
		}
	}
}

fun webgpu.native.WGPUVertexAttribute.adapt(structure: WGPUVertexAttribute) {
	format = structure.format
	offset = structure.offset
	shaderLocation = structure.shaderLocation
}

actual interface WGPUVertexBufferLayout {
	value class ByValue(val handle: CValue<webgpu.native.WGPUVertexBufferLayout>) : WGPUVertexBufferLayout {
		override var arrayStride: ULong
			get() = handle.useContents { arrayStride ?: error("pointer of WGPUVertexBufferLayout is null") }
			set(newValue) { handle.useContents { arrayStride = newValue } } 

		override var stepMode: WGPUVertexStepMode
			get() = handle.useContents { stepMode ?: error("pointer of WGPUVertexBufferLayout is null") }
			set(newValue) { handle.useContents { stepMode = newValue } } 

		override var attributeCount: ULong
			get() = handle.useContents { attributeCount ?: error("pointer of WGPUVertexBufferLayout is null") }
			set(newValue) { handle.useContents { attributeCount = newValue } } 

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = handle.useContents { attributes?.let(::NativeAddress)?.let { ArrayHolder<WGPUVertexAttribute>(it) } }
			set(newValue) { handle.useContents { attributes = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUVertexBufferLayout {
		override var arrayStride: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.arrayStride ?: error("pointer of WGPUVertexBufferLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.arrayStride = newValue } } 

		override var stepMode: WGPUVertexStepMode
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.stepMode ?: error("pointer of WGPUVertexBufferLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.stepMode = newValue } } 

		override var attributeCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.attributeCount ?: error("pointer of WGPUVertexBufferLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.attributeCount = newValue } } 

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.attributes?.let(::NativeAddress)?.let { ArrayHolder<WGPUVertexAttribute>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.attributes = newValue?.handler?.reinterpret() } } 

	}

	actual var arrayStride: ULong
	actual var stepMode: WGPUVertexStepMode
	actual var attributeCount: ULong
	actual var attributes: ArrayHolder<WGPUVertexAttribute>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUVertexBufferLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUVertexBufferLayout {
			return allocator.allocate(sizeOf<webgpu.native.WGPUVertexBufferLayout>())
				.let { WGPUVertexBufferLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUVertexBufferLayout) -> Unit): ArrayHolder<WGPUVertexBufferLayout> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUVertexBufferLayout>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUVertexBufferLayout>())
							.let(::NativeAddress)
							.let { WGPUVertexBufferLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUVertexBufferLayout> {
		return cValue<webgpu.native.WGPUVertexBufferLayout> {
			arrayStride = this@WGPUVertexBufferLayout.arrayStride
			stepMode = this@WGPUVertexBufferLayout.stepMode
			attributeCount = this@WGPUVertexBufferLayout.attributeCount
			attributes = this@WGPUVertexBufferLayout.attributes?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUVertexBufferLayout.adapt(structure: WGPUVertexBufferLayout) {
	arrayStride = structure.arrayStride
	stepMode = structure.stepMode
	attributeCount = structure.attributeCount
	attributes = structure.attributes?.handler?.reinterpret()
}

actual interface WGPUPipelineLayoutDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUPipelineLayoutDescriptor>) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var bindGroupLayoutCount: ULong
			get() = handle.useContents { bindGroupLayoutCount ?: error("pointer of WGPUPipelineLayoutDescriptor is null") }
			set(newValue) { handle.useContents { bindGroupLayoutCount = newValue } } 

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = handle.useContents { bindGroupLayouts?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayout>(it) } }
			set(newValue) { handle.useContents { bindGroupLayouts = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var bindGroupLayoutCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.bindGroupLayoutCount ?: error("pointer of WGPUPipelineLayoutDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.let { it.bindGroupLayoutCount = newValue } } 

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.bindGroupLayouts?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayout>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.let { it.bindGroupLayouts = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var bindGroupLayoutCount: ULong
	actual var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPipelineLayoutDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPipelineLayoutDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUPipelineLayoutDescriptor>())
				.let { WGPUPipelineLayoutDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPipelineLayoutDescriptor) -> Unit): ArrayHolder<WGPUPipelineLayoutDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUPipelineLayoutDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUPipelineLayoutDescriptor>())
							.let(::NativeAddress)
							.let { WGPUPipelineLayoutDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUPipelineLayoutDescriptor> {
		return cValue<webgpu.native.WGPUPipelineLayoutDescriptor> {
			nextInChain = this@WGPUPipelineLayoutDescriptor.nextInChain?.reinterpret()
			label = this@WGPUPipelineLayoutDescriptor.label?.handler?.reinterpret()
			bindGroupLayoutCount = this@WGPUPipelineLayoutDescriptor.bindGroupLayoutCount
			bindGroupLayouts = this@WGPUPipelineLayoutDescriptor.bindGroupLayouts?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUPipelineLayoutDescriptor.adapt(structure: WGPUPipelineLayoutDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	bindGroupLayoutCount = structure.bindGroupLayoutCount
	bindGroupLayouts = structure.bindGroupLayouts?.handler?.reinterpret()
}

actual interface WGPUQuerySetDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUQuerySetDescriptor>) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var type: WGPUQueryType
			get() = handle.useContents { type ?: error("pointer of WGPUQuerySetDescriptor is null") }
			set(newValue) { handle.useContents { type = newValue } } 

		override var count: UInt
			get() = handle.useContents { count ?: error("pointer of WGPUQuerySetDescriptor is null") }
			set(newValue) { handle.useContents { count = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var type: WGPUQueryType
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.type ?: error("pointer of WGPUQuerySetDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.let { it.type = newValue } } 

		override var count: UInt
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.count ?: error("pointer of WGPUQuerySetDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.let { it.count = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var type: WGPUQueryType
	actual var count: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUQuerySetDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUQuerySetDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUQuerySetDescriptor>())
				.let { WGPUQuerySetDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUQuerySetDescriptor) -> Unit): ArrayHolder<WGPUQuerySetDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUQuerySetDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUQuerySetDescriptor>())
							.let(::NativeAddress)
							.let { WGPUQuerySetDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUQuerySetDescriptor> {
		return cValue<webgpu.native.WGPUQuerySetDescriptor> {
			nextInChain = this@WGPUQuerySetDescriptor.nextInChain?.reinterpret()
			label = this@WGPUQuerySetDescriptor.label?.handler?.reinterpret()
			type = this@WGPUQuerySetDescriptor.type
			count = this@WGPUQuerySetDescriptor.count
		}
	}
}

fun webgpu.native.WGPUQuerySetDescriptor.adapt(structure: WGPUQuerySetDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	type = structure.type
	count = structure.count
}

actual interface WGPURenderBundleDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderBundleDescriptor>) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderBundleDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderBundleDescriptor>())
				.let { WGPURenderBundleDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderBundleDescriptor) -> Unit): ArrayHolder<WGPURenderBundleDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderBundleDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURenderBundleDescriptor>())
							.let(::NativeAddress)
							.let { WGPURenderBundleDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURenderBundleDescriptor> {
		return cValue<webgpu.native.WGPURenderBundleDescriptor> {
			nextInChain = this@WGPURenderBundleDescriptor.nextInChain?.reinterpret()
			label = this@WGPURenderBundleDescriptor.label?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURenderBundleDescriptor.adapt(structure: WGPURenderBundleDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
}

actual interface WGPURenderBundleEncoderDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderBundleEncoderDescriptor>) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var colorFormatCount: ULong
			get() = handle.useContents { colorFormatCount ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) { handle.useContents { colorFormatCount = newValue } } 

		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.useContents { colorFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) } }
			set(newValue) { handle.useContents { colorFormats = newValue?.handler?.reinterpret() } } 

		override var depthStencilFormat: WGPUTextureFormat
			get() = handle.useContents { depthStencilFormat ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) { handle.useContents { depthStencilFormat = newValue } } 

		override var sampleCount: UInt
			get() = handle.useContents { sampleCount ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) { handle.useContents { sampleCount = newValue } } 

		override var depthReadOnly: Boolean
			get() = handle.useContents { depthReadOnly.toBoolean() ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) { handle.useContents { depthReadOnly = newValue.toUInt() } } 

		override var stencilReadOnly: Boolean
			get() = handle.useContents { stencilReadOnly.toBoolean() ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) { handle.useContents { stencilReadOnly = newValue.toUInt() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var colorFormatCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.colorFormatCount ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.colorFormatCount = newValue } } 

		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.colorFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.colorFormats = newValue?.handler?.reinterpret() } } 

		override var depthStencilFormat: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.depthStencilFormat ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.depthStencilFormat = newValue } } 

		override var sampleCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.sampleCount ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.sampleCount = newValue } } 

		override var depthReadOnly: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.depthReadOnly.toBoolean() ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.depthReadOnly = newValue.toUInt() } } 

		override var stencilReadOnly: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.stencilReadOnly.toBoolean() ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.stencilReadOnly = newValue.toUInt() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var colorFormatCount: ULong
	actual var colorFormats: ArrayHolder<WGPUTextureFormat>?
	actual var depthStencilFormat: WGPUTextureFormat
	actual var sampleCount: UInt
	actual var depthReadOnly: Boolean
	actual var stencilReadOnly: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderBundleEncoderDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleEncoderDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderBundleEncoderDescriptor>())
				.let { WGPURenderBundleEncoderDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderBundleEncoderDescriptor) -> Unit): ArrayHolder<WGPURenderBundleEncoderDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderBundleEncoderDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURenderBundleEncoderDescriptor>())
							.let(::NativeAddress)
							.let { WGPURenderBundleEncoderDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURenderBundleEncoderDescriptor> {
		return cValue<webgpu.native.WGPURenderBundleEncoderDescriptor> {
			nextInChain = this@WGPURenderBundleEncoderDescriptor.nextInChain?.reinterpret()
			label = this@WGPURenderBundleEncoderDescriptor.label?.handler?.reinterpret()
			colorFormatCount = this@WGPURenderBundleEncoderDescriptor.colorFormatCount
			colorFormats = this@WGPURenderBundleEncoderDescriptor.colorFormats?.handler?.reinterpret()
			depthStencilFormat = this@WGPURenderBundleEncoderDescriptor.depthStencilFormat
			sampleCount = this@WGPURenderBundleEncoderDescriptor.sampleCount
			depthReadOnly = this@WGPURenderBundleEncoderDescriptor.depthReadOnly.toUInt()
			stencilReadOnly = this@WGPURenderBundleEncoderDescriptor.stencilReadOnly.toUInt()
		}
	}
}

fun webgpu.native.WGPURenderBundleEncoderDescriptor.adapt(structure: WGPURenderBundleEncoderDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	colorFormatCount = structure.colorFormatCount
	colorFormats = structure.colorFormats?.handler?.reinterpret()
	depthStencilFormat = structure.depthStencilFormat
	sampleCount = structure.sampleCount
	depthReadOnly = structure.depthReadOnly.toUInt()
	stencilReadOnly = structure.stencilReadOnly.toUInt()
}

actual interface WGPURenderPassColorAttachment {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderPassColorAttachment>) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var view: WGPUTextureView?
			get() = handle.useContents { view?.let(::NativeAddress)?.let { WGPUTextureView(it) } }
			set(newValue) { handle.useContents { view = newValue?.handler?.reinterpret() } } 

		override var depthSlice: UInt
			get() = handle.useContents { depthSlice ?: error("pointer of WGPURenderPassColorAttachment is null") }
			set(newValue) { handle.useContents { depthSlice = newValue } } 

		override var resolveTarget: WGPUTextureView?
			get() = handle.useContents { resolveTarget?.let(::NativeAddress)?.let { WGPUTextureView(it) } }
			set(newValue) { handle.useContents { resolveTarget = newValue?.handler?.reinterpret() } } 

		override var loadOp: WGPULoadOp
			get() = handle.useContents { loadOp ?: error("pointer of WGPURenderPassColorAttachment is null") }
			set(newValue) { handle.useContents { loadOp = newValue } } 

		override var storeOp: WGPUStoreOp
			get() = handle.useContents { storeOp ?: error("pointer of WGPURenderPassColorAttachment is null") }
			set(newValue) { handle.useContents { storeOp = newValue } } 

		override val clearValue: WGPUColor
			get() = handle.useContents { clearValue.rawPtr.toLong().let(::NativeAddress).let { WGPUColor(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var view: WGPUTextureView?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.view?.let(::NativeAddress)?.let { WGPUTextureView(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.view = newValue?.handler?.reinterpret() } } 

		override var depthSlice: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.depthSlice ?: error("pointer of WGPURenderPassColorAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.depthSlice = newValue } } 

		override var resolveTarget: WGPUTextureView?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.resolveTarget?.let(::NativeAddress)?.let { WGPUTextureView(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.resolveTarget = newValue?.handler?.reinterpret() } } 

		override var loadOp: WGPULoadOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.loadOp ?: error("pointer of WGPURenderPassColorAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.loadOp = newValue } } 

		override var storeOp: WGPUStoreOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.storeOp ?: error("pointer of WGPURenderPassColorAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.storeOp = newValue } } 

		override val clearValue: WGPUColor
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.clearValue.rawPtr.toLong().let(::NativeAddress).let { WGPUColor(it) }

	}

	actual var nextInChain: NativeAddress?
	actual var view: WGPUTextureView?
	actual var depthSlice: UInt
	actual var resolveTarget: WGPUTextureView?
	actual var loadOp: WGPULoadOp
	actual var storeOp: WGPUStoreOp
	actual val clearValue: WGPUColor
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassColorAttachment {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassColorAttachment {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassColorAttachment>())
				.let { WGPURenderPassColorAttachment(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassColorAttachment) -> Unit): ArrayHolder<WGPURenderPassColorAttachment> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassColorAttachment>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURenderPassColorAttachment>())
							.let(::NativeAddress)
							.let { WGPURenderPassColorAttachment(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURenderPassColorAttachment> {
		return cValue<webgpu.native.WGPURenderPassColorAttachment> {
			clearValue.adapt(this@WGPURenderPassColorAttachment.clearValue)
			nextInChain = this@WGPURenderPassColorAttachment.nextInChain?.reinterpret()
			view = this@WGPURenderPassColorAttachment.view?.handler?.reinterpret()
			depthSlice = this@WGPURenderPassColorAttachment.depthSlice
			resolveTarget = this@WGPURenderPassColorAttachment.resolveTarget?.handler?.reinterpret()
			loadOp = this@WGPURenderPassColorAttachment.loadOp
			storeOp = this@WGPURenderPassColorAttachment.storeOp
		}
	}
}

fun webgpu.native.WGPURenderPassColorAttachment.adapt(structure: WGPURenderPassColorAttachment) {
	clearValue.adapt(structure.clearValue)
	nextInChain = structure.nextInChain?.reinterpret()
	view = structure.view?.handler?.reinterpret()
	depthSlice = structure.depthSlice
	resolveTarget = structure.resolveTarget?.handler?.reinterpret()
	loadOp = structure.loadOp
	storeOp = structure.storeOp
}

actual interface WGPURenderPassDepthStencilAttachment {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderPassDepthStencilAttachment>) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = handle.useContents { view?.let(::NativeAddress)?.let { WGPUTextureView(it) } }
			set(newValue) { handle.useContents { view = newValue?.handler?.reinterpret() } } 

		override var depthLoadOp: WGPULoadOp
			get() = handle.useContents { depthLoadOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) { handle.useContents { depthLoadOp = newValue } } 

		override var depthStoreOp: WGPUStoreOp
			get() = handle.useContents { depthStoreOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) { handle.useContents { depthStoreOp = newValue } } 

		override var depthClearValue: Float
			get() = handle.useContents { depthClearValue ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) { handle.useContents { depthClearValue = newValue } } 

		override var depthReadOnly: Boolean
			get() = handle.useContents { depthReadOnly.toBoolean() ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) { handle.useContents { depthReadOnly = newValue.toUInt() } } 

		override var stencilLoadOp: WGPULoadOp
			get() = handle.useContents { stencilLoadOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) { handle.useContents { stencilLoadOp = newValue } } 

		override var stencilStoreOp: WGPUStoreOp
			get() = handle.useContents { stencilStoreOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) { handle.useContents { stencilStoreOp = newValue } } 

		override var stencilClearValue: UInt
			get() = handle.useContents { stencilClearValue ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) { handle.useContents { stencilClearValue = newValue } } 

		override var stencilReadOnly: Boolean
			get() = handle.useContents { stencilReadOnly.toBoolean() ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) { handle.useContents { stencilReadOnly = newValue.toUInt() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.view?.let(::NativeAddress)?.let { WGPUTextureView(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.view = newValue?.handler?.reinterpret() } } 

		override var depthLoadOp: WGPULoadOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.depthLoadOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.depthLoadOp = newValue } } 

		override var depthStoreOp: WGPUStoreOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.depthStoreOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.depthStoreOp = newValue } } 

		override var depthClearValue: Float
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.depthClearValue ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.depthClearValue = newValue } } 

		override var depthReadOnly: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.depthReadOnly.toBoolean() ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.depthReadOnly = newValue.toUInt() } } 

		override var stencilLoadOp: WGPULoadOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.stencilLoadOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.stencilLoadOp = newValue } } 

		override var stencilStoreOp: WGPUStoreOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.stencilStoreOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.stencilStoreOp = newValue } } 

		override var stencilClearValue: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.stencilClearValue ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.stencilClearValue = newValue } } 

		override var stencilReadOnly: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.stencilReadOnly.toBoolean() ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.stencilReadOnly = newValue.toUInt() } } 

	}

	actual var view: WGPUTextureView?
	actual var depthLoadOp: WGPULoadOp
	actual var depthStoreOp: WGPUStoreOp
	actual var depthClearValue: Float
	actual var depthReadOnly: Boolean
	actual var stencilLoadOp: WGPULoadOp
	actual var stencilStoreOp: WGPUStoreOp
	actual var stencilClearValue: UInt
	actual var stencilReadOnly: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassDepthStencilAttachment {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDepthStencilAttachment {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDepthStencilAttachment>())
				.let { WGPURenderPassDepthStencilAttachment(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassDepthStencilAttachment) -> Unit): ArrayHolder<WGPURenderPassDepthStencilAttachment> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDepthStencilAttachment>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURenderPassDepthStencilAttachment>())
							.let(::NativeAddress)
							.let { WGPURenderPassDepthStencilAttachment(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURenderPassDepthStencilAttachment> {
		return cValue<webgpu.native.WGPURenderPassDepthStencilAttachment> {
			view = this@WGPURenderPassDepthStencilAttachment.view?.handler?.reinterpret()
			depthLoadOp = this@WGPURenderPassDepthStencilAttachment.depthLoadOp
			depthStoreOp = this@WGPURenderPassDepthStencilAttachment.depthStoreOp
			depthClearValue = this@WGPURenderPassDepthStencilAttachment.depthClearValue
			depthReadOnly = this@WGPURenderPassDepthStencilAttachment.depthReadOnly.toUInt()
			stencilLoadOp = this@WGPURenderPassDepthStencilAttachment.stencilLoadOp
			stencilStoreOp = this@WGPURenderPassDepthStencilAttachment.stencilStoreOp
			stencilClearValue = this@WGPURenderPassDepthStencilAttachment.stencilClearValue
			stencilReadOnly = this@WGPURenderPassDepthStencilAttachment.stencilReadOnly.toUInt()
		}
	}
}

fun webgpu.native.WGPURenderPassDepthStencilAttachment.adapt(structure: WGPURenderPassDepthStencilAttachment) {
	view = structure.view?.handler?.reinterpret()
	depthLoadOp = structure.depthLoadOp
	depthStoreOp = structure.depthStoreOp
	depthClearValue = structure.depthClearValue
	depthReadOnly = structure.depthReadOnly.toUInt()
	stencilLoadOp = structure.stencilLoadOp
	stencilStoreOp = structure.stencilStoreOp
	stencilClearValue = structure.stencilClearValue
	stencilReadOnly = structure.stencilReadOnly.toUInt()
}

actual interface WGPURenderPassDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderPassDescriptor>) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var colorAttachmentCount: ULong
			get() = handle.useContents { colorAttachmentCount ?: error("pointer of WGPURenderPassDescriptor is null") }
			set(newValue) { handle.useContents { colorAttachmentCount = newValue } } 

		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = handle.useContents { colorAttachments?.let(::NativeAddress)?.let { ArrayHolder<WGPURenderPassColorAttachment>(it) } }
			set(newValue) { handle.useContents { colorAttachments = newValue?.handler?.reinterpret() } } 

		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = handle.useContents { depthStencilAttachment?.let(::NativeAddress)?.let { WGPURenderPassDepthStencilAttachment(it) } }
			set(newValue) { handle.useContents { depthStencilAttachment = newValue?.handler?.reinterpret() } } 

		override var occlusionQuerySet: WGPUQuerySet?
			get() = handle.useContents { occlusionQuerySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) } }
			set(newValue) { handle.useContents { occlusionQuerySet = newValue?.handler?.reinterpret() } } 

		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = handle.useContents { timestampWrites?.let(::NativeAddress)?.let { WGPURenderPassTimestampWrites(it) } }
			set(newValue) { handle.useContents { timestampWrites = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var colorAttachmentCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.colorAttachmentCount ?: error("pointer of WGPURenderPassDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.colorAttachmentCount = newValue } } 

		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.colorAttachments?.let(::NativeAddress)?.let { ArrayHolder<WGPURenderPassColorAttachment>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.colorAttachments = newValue?.handler?.reinterpret() } } 

		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.depthStencilAttachment?.let(::NativeAddress)?.let { WGPURenderPassDepthStencilAttachment(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.depthStencilAttachment = newValue?.handler?.reinterpret() } } 

		override var occlusionQuerySet: WGPUQuerySet?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.occlusionQuerySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.occlusionQuerySet = newValue?.handler?.reinterpret() } } 

		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.timestampWrites?.let(::NativeAddress)?.let { WGPURenderPassTimestampWrites(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.timestampWrites = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var colorAttachmentCount: ULong
	actual var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
	actual var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
	actual var occlusionQuerySet: WGPUQuerySet?
	actual var timestampWrites: WGPURenderPassTimestampWrites?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDescriptor>())
				.let { WGPURenderPassDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassDescriptor) -> Unit): ArrayHolder<WGPURenderPassDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURenderPassDescriptor>())
							.let(::NativeAddress)
							.let { WGPURenderPassDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURenderPassDescriptor> {
		return cValue<webgpu.native.WGPURenderPassDescriptor> {
			nextInChain = this@WGPURenderPassDescriptor.nextInChain?.reinterpret()
			label = this@WGPURenderPassDescriptor.label?.handler?.reinterpret()
			colorAttachmentCount = this@WGPURenderPassDescriptor.colorAttachmentCount
			colorAttachments = this@WGPURenderPassDescriptor.colorAttachments?.handler?.reinterpret()
			depthStencilAttachment = this@WGPURenderPassDescriptor.depthStencilAttachment?.handler?.reinterpret()
			occlusionQuerySet = this@WGPURenderPassDescriptor.occlusionQuerySet?.handler?.reinterpret()
			timestampWrites = this@WGPURenderPassDescriptor.timestampWrites?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURenderPassDescriptor.adapt(structure: WGPURenderPassDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	colorAttachmentCount = structure.colorAttachmentCount
	colorAttachments = structure.colorAttachments?.handler?.reinterpret()
	depthStencilAttachment = structure.depthStencilAttachment?.handler?.reinterpret()
	occlusionQuerySet = structure.occlusionQuerySet?.handler?.reinterpret()
	timestampWrites = structure.timestampWrites?.handler?.reinterpret()
}

actual interface WGPUChainedStruct {
	value class ByValue(val handle: CValue<webgpu.native.WGPUChainedStruct>) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = handle.useContents { next?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { next = newValue?.handler?.reinterpret() } } 

		override var sType: WGPUSType
			get() = handle.useContents { sType ?: error("pointer of WGPUChainedStruct is null") }
			set(newValue) { handle.useContents { sType = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUChainedStruct>().pointed.next?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUChainedStruct>().pointed.let { it.next = newValue?.handler?.reinterpret() } } 

		override var sType: WGPUSType
			get() = handler.reinterpret<webgpu.native.WGPUChainedStruct>().pointed.sType ?: error("pointer of WGPUChainedStruct is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUChainedStruct>().pointed.let { it.sType = newValue } } 

	}

	actual var next: WGPUChainedStruct?
	actual var sType: WGPUSType
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUChainedStruct {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUChainedStruct {
			return allocator.allocate(sizeOf<webgpu.native.WGPUChainedStruct>())
				.let { WGPUChainedStruct(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUChainedStruct) -> Unit): ArrayHolder<WGPUChainedStruct> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUChainedStruct>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUChainedStruct>())
							.let(::NativeAddress)
							.let { WGPUChainedStruct(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUChainedStruct> {
		return cValue<webgpu.native.WGPUChainedStruct> {
			next = this@WGPUChainedStruct.next?.handler?.reinterpret()
			sType = this@WGPUChainedStruct.sType
		}
	}
}

fun webgpu.native.WGPUChainedStruct.adapt(structure: WGPUChainedStruct) {
	next = structure.next?.handler?.reinterpret()
	sType = structure.sType
}

actual interface WGPURenderPassDescriptorMaxDrawCount {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderPassDescriptorMaxDrawCount>) : WGPURenderPassDescriptorMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var maxDrawCount: ULong
			get() = handle.useContents { maxDrawCount ?: error("pointer of WGPURenderPassDescriptorMaxDrawCount is null") }
			set(newValue) { handle.useContents { maxDrawCount = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassDescriptorMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptorMaxDrawCount>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var maxDrawCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptorMaxDrawCount>().pointed.maxDrawCount ?: error("pointer of WGPURenderPassDescriptorMaxDrawCount is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassDescriptorMaxDrawCount>().pointed.let { it.maxDrawCount = newValue } } 

	}

	actual val chain: WGPUChainedStruct
	actual var maxDrawCount: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassDescriptorMaxDrawCount {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptorMaxDrawCount {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDescriptorMaxDrawCount>())
				.let { WGPURenderPassDescriptorMaxDrawCount(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassDescriptorMaxDrawCount) -> Unit): ArrayHolder<WGPURenderPassDescriptorMaxDrawCount> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDescriptorMaxDrawCount>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURenderPassDescriptorMaxDrawCount>())
							.let(::NativeAddress)
							.let { WGPURenderPassDescriptorMaxDrawCount(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURenderPassDescriptorMaxDrawCount> {
		return cValue<webgpu.native.WGPURenderPassDescriptorMaxDrawCount> {
			chain.adapt(this@WGPURenderPassDescriptorMaxDrawCount.chain)
			maxDrawCount = this@WGPURenderPassDescriptorMaxDrawCount.maxDrawCount
		}
	}
}

fun webgpu.native.WGPURenderPassDescriptorMaxDrawCount.adapt(structure: WGPURenderPassDescriptorMaxDrawCount) {
	chain.adapt(structure.chain)
	maxDrawCount = structure.maxDrawCount
}

actual interface WGPURenderPassTimestampWrites {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderPassTimestampWrites>) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.useContents { querySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) } }
			set(newValue) { handle.useContents { querySet = newValue?.handler?.reinterpret() } } 

		override var beginningOfPassWriteIndex: UInt
			get() = handle.useContents { beginningOfPassWriteIndex ?: error("pointer of WGPURenderPassTimestampWrites is null") }
			set(newValue) { handle.useContents { beginningOfPassWriteIndex = newValue } } 

		override var endOfPassWriteIndex: UInt
			get() = handle.useContents { endOfPassWriteIndex ?: error("pointer of WGPURenderPassTimestampWrites is null") }
			set(newValue) { handle.useContents { endOfPassWriteIndex = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.querySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.let { it.querySet = newValue?.handler?.reinterpret() } } 

		override var beginningOfPassWriteIndex: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.beginningOfPassWriteIndex ?: error("pointer of WGPURenderPassTimestampWrites is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.let { it.beginningOfPassWriteIndex = newValue } } 

		override var endOfPassWriteIndex: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.endOfPassWriteIndex ?: error("pointer of WGPURenderPassTimestampWrites is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.let { it.endOfPassWriteIndex = newValue } } 

	}

	actual var querySet: WGPUQuerySet?
	actual var beginningOfPassWriteIndex: UInt
	actual var endOfPassWriteIndex: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassTimestampWrites {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassTimestampWrites {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassTimestampWrites>())
				.let { WGPURenderPassTimestampWrites(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassTimestampWrites) -> Unit): ArrayHolder<WGPURenderPassTimestampWrites> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassTimestampWrites>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURenderPassTimestampWrites>())
							.let(::NativeAddress)
							.let { WGPURenderPassTimestampWrites(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURenderPassTimestampWrites> {
		return cValue<webgpu.native.WGPURenderPassTimestampWrites> {
			querySet = this@WGPURenderPassTimestampWrites.querySet?.handler?.reinterpret()
			beginningOfPassWriteIndex = this@WGPURenderPassTimestampWrites.beginningOfPassWriteIndex
			endOfPassWriteIndex = this@WGPURenderPassTimestampWrites.endOfPassWriteIndex
		}
	}
}

fun webgpu.native.WGPURenderPassTimestampWrites.adapt(structure: WGPURenderPassTimestampWrites) {
	querySet = structure.querySet?.handler?.reinterpret()
	beginningOfPassWriteIndex = structure.beginningOfPassWriteIndex
	endOfPassWriteIndex = structure.endOfPassWriteIndex
}

actual interface WGPUVertexState {
	value class ByValue(val handle: CValue<webgpu.native.WGPUVertexState>) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var module: WGPUShaderModule?
			get() = handle.useContents { module?.let(::NativeAddress)?.let { WGPUShaderModule(it) } }
			set(newValue) { handle.useContents { module = newValue?.handler?.reinterpret() } } 

		override var entryPoint: CString?
			get() = handle.useContents { entryPoint?.toCString() }
			set(newValue) { handle.useContents { entryPoint = newValue?.handler?.reinterpret() } } 

		override var constantCount: ULong
			get() = handle.useContents { constantCount ?: error("pointer of WGPUVertexState is null") }
			set(newValue) { handle.useContents { constantCount = newValue } } 

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.useContents { constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) } }
			set(newValue) { handle.useContents { constants = newValue?.handler?.reinterpret() } } 

		override var bufferCount: ULong
			get() = handle.useContents { bufferCount ?: error("pointer of WGPUVertexState is null") }
			set(newValue) { handle.useContents { bufferCount = newValue } } 

		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = handle.useContents { buffers?.let(::NativeAddress)?.let { ArrayHolder<WGPUVertexBufferLayout>(it) } }
			set(newValue) { handle.useContents { buffers = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var module: WGPUShaderModule?
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.module?.let(::NativeAddress)?.let { WGPUShaderModule(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.module = newValue?.handler?.reinterpret() } } 

		override var entryPoint: CString?
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.entryPoint?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.entryPoint = newValue?.handler?.reinterpret() } } 

		override var constantCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.constantCount ?: error("pointer of WGPUVertexState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.constantCount = newValue } } 

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.constants = newValue?.handler?.reinterpret() } } 

		override var bufferCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.bufferCount ?: error("pointer of WGPUVertexState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.bufferCount = newValue } } 

		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.buffers?.let(::NativeAddress)?.let { ArrayHolder<WGPUVertexBufferLayout>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.buffers = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var module: WGPUShaderModule?
	actual var entryPoint: CString?
	actual var constantCount: ULong
	actual var constants: ArrayHolder<WGPUConstantEntry>?
	actual var bufferCount: ULong
	actual var buffers: ArrayHolder<WGPUVertexBufferLayout>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUVertexState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUVertexState {
			return allocator.allocate(sizeOf<webgpu.native.WGPUVertexState>())
				.let { WGPUVertexState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUVertexState) -> Unit): ArrayHolder<WGPUVertexState> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUVertexState>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUVertexState>())
							.let(::NativeAddress)
							.let { WGPUVertexState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUVertexState> {
		return cValue<webgpu.native.WGPUVertexState> {
			nextInChain = this@WGPUVertexState.nextInChain?.reinterpret()
			module = this@WGPUVertexState.module?.handler?.reinterpret()
			entryPoint = this@WGPUVertexState.entryPoint?.handler?.reinterpret()
			constantCount = this@WGPUVertexState.constantCount
			constants = this@WGPUVertexState.constants?.handler?.reinterpret()
			bufferCount = this@WGPUVertexState.bufferCount
			buffers = this@WGPUVertexState.buffers?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUVertexState.adapt(structure: WGPUVertexState) {
	nextInChain = structure.nextInChain?.reinterpret()
	module = structure.module?.handler?.reinterpret()
	entryPoint = structure.entryPoint?.handler?.reinterpret()
	constantCount = structure.constantCount
	constants = structure.constants?.handler?.reinterpret()
	bufferCount = structure.bufferCount
	buffers = structure.buffers?.handler?.reinterpret()
}

actual interface WGPUPrimitiveState {
	value class ByValue(val handle: CValue<webgpu.native.WGPUPrimitiveState>) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var topology: WGPUPrimitiveTopology
			get() = handle.useContents { topology ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) { handle.useContents { topology = newValue } } 

		override var stripIndexFormat: WGPUIndexFormat
			get() = handle.useContents { stripIndexFormat ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) { handle.useContents { stripIndexFormat = newValue } } 

		override var frontFace: WGPUFrontFace
			get() = handle.useContents { frontFace ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) { handle.useContents { frontFace = newValue } } 

		override var cullMode: WGPUCullMode
			get() = handle.useContents { cullMode ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) { handle.useContents { cullMode = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var topology: WGPUPrimitiveTopology
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.topology ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.topology = newValue } } 

		override var stripIndexFormat: WGPUIndexFormat
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.stripIndexFormat ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.stripIndexFormat = newValue } } 

		override var frontFace: WGPUFrontFace
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.frontFace ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.frontFace = newValue } } 

		override var cullMode: WGPUCullMode
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.cullMode ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.cullMode = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var topology: WGPUPrimitiveTopology
	actual var stripIndexFormat: WGPUIndexFormat
	actual var frontFace: WGPUFrontFace
	actual var cullMode: WGPUCullMode
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPrimitiveState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPrimitiveState {
			return allocator.allocate(sizeOf<webgpu.native.WGPUPrimitiveState>())
				.let { WGPUPrimitiveState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPrimitiveState) -> Unit): ArrayHolder<WGPUPrimitiveState> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUPrimitiveState>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUPrimitiveState>())
							.let(::NativeAddress)
							.let { WGPUPrimitiveState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUPrimitiveState> {
		return cValue<webgpu.native.WGPUPrimitiveState> {
			nextInChain = this@WGPUPrimitiveState.nextInChain?.reinterpret()
			topology = this@WGPUPrimitiveState.topology
			stripIndexFormat = this@WGPUPrimitiveState.stripIndexFormat
			frontFace = this@WGPUPrimitiveState.frontFace
			cullMode = this@WGPUPrimitiveState.cullMode
		}
	}
}

fun webgpu.native.WGPUPrimitiveState.adapt(structure: WGPUPrimitiveState) {
	nextInChain = structure.nextInChain?.reinterpret()
	topology = structure.topology
	stripIndexFormat = structure.stripIndexFormat
	frontFace = structure.frontFace
	cullMode = structure.cullMode
}

actual interface WGPUPrimitiveDepthClipControl {
	value class ByValue(val handle: CValue<webgpu.native.WGPUPrimitiveDepthClipControl>) : WGPUPrimitiveDepthClipControl {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var unclippedDepth: Boolean
			get() = handle.useContents { unclippedDepth.toBoolean() ?: error("pointer of WGPUPrimitiveDepthClipControl is null") }
			set(newValue) { handle.useContents { unclippedDepth = newValue.toUInt() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUPrimitiveDepthClipControl {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveDepthClipControl>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var unclippedDepth: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveDepthClipControl>().pointed.unclippedDepth.toBoolean() ?: error("pointer of WGPUPrimitiveDepthClipControl is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPrimitiveDepthClipControl>().pointed.let { it.unclippedDepth = newValue.toUInt() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var unclippedDepth: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPrimitiveDepthClipControl {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPrimitiveDepthClipControl {
			return allocator.allocate(sizeOf<webgpu.native.WGPUPrimitiveDepthClipControl>())
				.let { WGPUPrimitiveDepthClipControl(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPrimitiveDepthClipControl) -> Unit): ArrayHolder<WGPUPrimitiveDepthClipControl> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUPrimitiveDepthClipControl>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUPrimitiveDepthClipControl>())
							.let(::NativeAddress)
							.let { WGPUPrimitiveDepthClipControl(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUPrimitiveDepthClipControl> {
		return cValue<webgpu.native.WGPUPrimitiveDepthClipControl> {
			chain.adapt(this@WGPUPrimitiveDepthClipControl.chain)
			unclippedDepth = this@WGPUPrimitiveDepthClipControl.unclippedDepth.toUInt()
		}
	}
}

fun webgpu.native.WGPUPrimitiveDepthClipControl.adapt(structure: WGPUPrimitiveDepthClipControl) {
	chain.adapt(structure.chain)
	unclippedDepth = structure.unclippedDepth.toUInt()
}

actual interface WGPUStencilFaceState {
	value class ByValue(val handle: CValue<webgpu.native.WGPUStencilFaceState>) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = handle.useContents { compare ?: error("pointer of WGPUStencilFaceState is null") }
			set(newValue) { handle.useContents { compare = newValue } } 

		override var failOp: WGPUStencilOperation
			get() = handle.useContents { failOp ?: error("pointer of WGPUStencilFaceState is null") }
			set(newValue) { handle.useContents { failOp = newValue } } 

		override var depthFailOp: WGPUStencilOperation
			get() = handle.useContents { depthFailOp ?: error("pointer of WGPUStencilFaceState is null") }
			set(newValue) { handle.useContents { depthFailOp = newValue } } 

		override var passOp: WGPUStencilOperation
			get() = handle.useContents { passOp ?: error("pointer of WGPUStencilFaceState is null") }
			set(newValue) { handle.useContents { passOp = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.compare ?: error("pointer of WGPUStencilFaceState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.let { it.compare = newValue } } 

		override var failOp: WGPUStencilOperation
			get() = handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.failOp ?: error("pointer of WGPUStencilFaceState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.let { it.failOp = newValue } } 

		override var depthFailOp: WGPUStencilOperation
			get() = handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.depthFailOp ?: error("pointer of WGPUStencilFaceState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.let { it.depthFailOp = newValue } } 

		override var passOp: WGPUStencilOperation
			get() = handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.passOp ?: error("pointer of WGPUStencilFaceState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.let { it.passOp = newValue } } 

	}

	actual var compare: WGPUCompareFunction
	actual var failOp: WGPUStencilOperation
	actual var depthFailOp: WGPUStencilOperation
	actual var passOp: WGPUStencilOperation
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUStencilFaceState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUStencilFaceState {
			return allocator.allocate(sizeOf<webgpu.native.WGPUStencilFaceState>())
				.let { WGPUStencilFaceState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUStencilFaceState) -> Unit): ArrayHolder<WGPUStencilFaceState> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUStencilFaceState>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUStencilFaceState>())
							.let(::NativeAddress)
							.let { WGPUStencilFaceState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUStencilFaceState> {
		return cValue<webgpu.native.WGPUStencilFaceState> {
			compare = this@WGPUStencilFaceState.compare
			failOp = this@WGPUStencilFaceState.failOp
			depthFailOp = this@WGPUStencilFaceState.depthFailOp
			passOp = this@WGPUStencilFaceState.passOp
		}
	}
}

fun webgpu.native.WGPUStencilFaceState.adapt(structure: WGPUStencilFaceState) {
	compare = structure.compare
	failOp = structure.failOp
	depthFailOp = structure.depthFailOp
	passOp = structure.passOp
}

actual interface WGPUDepthStencilState {
	value class ByValue(val handle: CValue<webgpu.native.WGPUDepthStencilState>) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) { handle.useContents { format = newValue } } 

		override var depthWriteEnabled: Boolean
			get() = handle.useContents { depthWriteEnabled.toBoolean() ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) { handle.useContents { depthWriteEnabled = newValue.toUInt() } } 

		override var depthCompare: WGPUCompareFunction
			get() = handle.useContents { depthCompare ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) { handle.useContents { depthCompare = newValue } } 

		override val stencilFront: WGPUStencilFaceState
			get() = handle.useContents { stencilFront.rawPtr.toLong().let(::NativeAddress).let { WGPUStencilFaceState(it) } }

		override val stencilBack: WGPUStencilFaceState
			get() = handle.useContents { stencilBack.rawPtr.toLong().let(::NativeAddress).let { WGPUStencilFaceState(it) } }

		override var stencilReadMask: UInt
			get() = handle.useContents { stencilReadMask ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) { handle.useContents { stencilReadMask = newValue } } 

		override var stencilWriteMask: UInt
			get() = handle.useContents { stencilWriteMask ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) { handle.useContents { stencilWriteMask = newValue } } 

		override var depthBias: Int
			get() = handle.useContents { depthBias ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) { handle.useContents { depthBias = newValue } } 

		override var depthBiasSlopeScale: Float
			get() = handle.useContents { depthBiasSlopeScale ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) { handle.useContents { depthBiasSlopeScale = newValue } } 

		override var depthBiasClamp: Float
			get() = handle.useContents { depthBiasClamp ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) { handle.useContents { depthBiasClamp = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.format ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.format = newValue } } 

		override var depthWriteEnabled: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthWriteEnabled.toBoolean() ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthWriteEnabled = newValue.toUInt() } } 

		override var depthCompare: WGPUCompareFunction
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthCompare ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthCompare = newValue } } 

		override val stencilFront: WGPUStencilFaceState
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.stencilFront.rawPtr.toLong().let(::NativeAddress).let { WGPUStencilFaceState(it) }

		override val stencilBack: WGPUStencilFaceState
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.stencilBack.rawPtr.toLong().let(::NativeAddress).let { WGPUStencilFaceState(it) }

		override var stencilReadMask: UInt
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.stencilReadMask ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.stencilReadMask = newValue } } 

		override var stencilWriteMask: UInt
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.stencilWriteMask ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.stencilWriteMask = newValue } } 

		override var depthBias: Int
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthBias ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthBias = newValue } } 

		override var depthBiasSlopeScale: Float
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthBiasSlopeScale ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthBiasSlopeScale = newValue } } 

		override var depthBiasClamp: Float
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthBiasClamp ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthBiasClamp = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var format: WGPUTextureFormat
	actual var depthWriteEnabled: Boolean
	actual var depthCompare: WGPUCompareFunction
	actual val stencilFront: WGPUStencilFaceState
	actual val stencilBack: WGPUStencilFaceState
	actual var stencilReadMask: UInt
	actual var stencilWriteMask: UInt
	actual var depthBias: Int
	actual var depthBiasSlopeScale: Float
	actual var depthBiasClamp: Float
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUDepthStencilState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUDepthStencilState {
			return allocator.allocate(sizeOf<webgpu.native.WGPUDepthStencilState>())
				.let { WGPUDepthStencilState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUDepthStencilState) -> Unit): ArrayHolder<WGPUDepthStencilState> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUDepthStencilState>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUDepthStencilState>())
							.let(::NativeAddress)
							.let { WGPUDepthStencilState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUDepthStencilState> {
		return cValue<webgpu.native.WGPUDepthStencilState> {
			stencilFront.adapt(this@WGPUDepthStencilState.stencilFront)
			stencilBack.adapt(this@WGPUDepthStencilState.stencilBack)
			nextInChain = this@WGPUDepthStencilState.nextInChain?.reinterpret()
			format = this@WGPUDepthStencilState.format
			depthWriteEnabled = this@WGPUDepthStencilState.depthWriteEnabled.toUInt()
			depthCompare = this@WGPUDepthStencilState.depthCompare
			stencilReadMask = this@WGPUDepthStencilState.stencilReadMask
			stencilWriteMask = this@WGPUDepthStencilState.stencilWriteMask
			depthBias = this@WGPUDepthStencilState.depthBias
			depthBiasSlopeScale = this@WGPUDepthStencilState.depthBiasSlopeScale
			depthBiasClamp = this@WGPUDepthStencilState.depthBiasClamp
		}
	}
}

fun webgpu.native.WGPUDepthStencilState.adapt(structure: WGPUDepthStencilState) {
	stencilFront.adapt(structure.stencilFront)
	stencilBack.adapt(structure.stencilBack)
	nextInChain = structure.nextInChain?.reinterpret()
	format = structure.format
	depthWriteEnabled = structure.depthWriteEnabled.toUInt()
	depthCompare = structure.depthCompare
	stencilReadMask = structure.stencilReadMask
	stencilWriteMask = structure.stencilWriteMask
	depthBias = structure.depthBias
	depthBiasSlopeScale = structure.depthBiasSlopeScale
	depthBiasClamp = structure.depthBiasClamp
}

actual interface WGPUMultisampleState {
	value class ByValue(val handle: CValue<webgpu.native.WGPUMultisampleState>) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var count: UInt
			get() = handle.useContents { count ?: error("pointer of WGPUMultisampleState is null") }
			set(newValue) { handle.useContents { count = newValue } } 

		override var mask: UInt
			get() = handle.useContents { mask ?: error("pointer of WGPUMultisampleState is null") }
			set(newValue) { handle.useContents { mask = newValue } } 

		override var alphaToCoverageEnabled: Boolean
			get() = handle.useContents { alphaToCoverageEnabled.toBoolean() ?: error("pointer of WGPUMultisampleState is null") }
			set(newValue) { handle.useContents { alphaToCoverageEnabled = newValue.toUInt() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var count: UInt
			get() = handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.count ?: error("pointer of WGPUMultisampleState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.let { it.count = newValue } } 

		override var mask: UInt
			get() = handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.mask ?: error("pointer of WGPUMultisampleState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.let { it.mask = newValue } } 

		override var alphaToCoverageEnabled: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.alphaToCoverageEnabled.toBoolean() ?: error("pointer of WGPUMultisampleState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.let { it.alphaToCoverageEnabled = newValue.toUInt() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var count: UInt
	actual var mask: UInt
	actual var alphaToCoverageEnabled: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUMultisampleState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUMultisampleState {
			return allocator.allocate(sizeOf<webgpu.native.WGPUMultisampleState>())
				.let { WGPUMultisampleState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUMultisampleState) -> Unit): ArrayHolder<WGPUMultisampleState> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUMultisampleState>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUMultisampleState>())
							.let(::NativeAddress)
							.let { WGPUMultisampleState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUMultisampleState> {
		return cValue<webgpu.native.WGPUMultisampleState> {
			nextInChain = this@WGPUMultisampleState.nextInChain?.reinterpret()
			count = this@WGPUMultisampleState.count
			mask = this@WGPUMultisampleState.mask
			alphaToCoverageEnabled = this@WGPUMultisampleState.alphaToCoverageEnabled.toUInt()
		}
	}
}

fun webgpu.native.WGPUMultisampleState.adapt(structure: WGPUMultisampleState) {
	nextInChain = structure.nextInChain?.reinterpret()
	count = structure.count
	mask = structure.mask
	alphaToCoverageEnabled = structure.alphaToCoverageEnabled.toUInt()
}

actual interface WGPUFragmentState {
	value class ByValue(val handle: CValue<webgpu.native.WGPUFragmentState>) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var module: WGPUShaderModule?
			get() = handle.useContents { module?.let(::NativeAddress)?.let { WGPUShaderModule(it) } }
			set(newValue) { handle.useContents { module = newValue?.handler?.reinterpret() } } 

		override var entryPoint: CString?
			get() = handle.useContents { entryPoint?.toCString() }
			set(newValue) { handle.useContents { entryPoint = newValue?.handler?.reinterpret() } } 

		override var constantCount: ULong
			get() = handle.useContents { constantCount ?: error("pointer of WGPUFragmentState is null") }
			set(newValue) { handle.useContents { constantCount = newValue } } 

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.useContents { constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) } }
			set(newValue) { handle.useContents { constants = newValue?.handler?.reinterpret() } } 

		override var targetCount: ULong
			get() = handle.useContents { targetCount ?: error("pointer of WGPUFragmentState is null") }
			set(newValue) { handle.useContents { targetCount = newValue } } 

		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = handle.useContents { targets?.let(::NativeAddress)?.let { ArrayHolder<WGPUColorTargetState>(it) } }
			set(newValue) { handle.useContents { targets = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var module: WGPUShaderModule?
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.module?.let(::NativeAddress)?.let { WGPUShaderModule(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.module = newValue?.handler?.reinterpret() } } 

		override var entryPoint: CString?
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.entryPoint?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.entryPoint = newValue?.handler?.reinterpret() } } 

		override var constantCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.constantCount ?: error("pointer of WGPUFragmentState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.constantCount = newValue } } 

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.constants = newValue?.handler?.reinterpret() } } 

		override var targetCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.targetCount ?: error("pointer of WGPUFragmentState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.targetCount = newValue } } 

		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.targets?.let(::NativeAddress)?.let { ArrayHolder<WGPUColorTargetState>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.targets = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var module: WGPUShaderModule?
	actual var entryPoint: CString?
	actual var constantCount: ULong
	actual var constants: ArrayHolder<WGPUConstantEntry>?
	actual var targetCount: ULong
	actual var targets: ArrayHolder<WGPUColorTargetState>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUFragmentState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUFragmentState {
			return allocator.allocate(sizeOf<webgpu.native.WGPUFragmentState>())
				.let { WGPUFragmentState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUFragmentState) -> Unit): ArrayHolder<WGPUFragmentState> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUFragmentState>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUFragmentState>())
							.let(::NativeAddress)
							.let { WGPUFragmentState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUFragmentState> {
		return cValue<webgpu.native.WGPUFragmentState> {
			nextInChain = this@WGPUFragmentState.nextInChain?.reinterpret()
			module = this@WGPUFragmentState.module?.handler?.reinterpret()
			entryPoint = this@WGPUFragmentState.entryPoint?.handler?.reinterpret()
			constantCount = this@WGPUFragmentState.constantCount
			constants = this@WGPUFragmentState.constants?.handler?.reinterpret()
			targetCount = this@WGPUFragmentState.targetCount
			targets = this@WGPUFragmentState.targets?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUFragmentState.adapt(structure: WGPUFragmentState) {
	nextInChain = structure.nextInChain?.reinterpret()
	module = structure.module?.handler?.reinterpret()
	entryPoint = structure.entryPoint?.handler?.reinterpret()
	constantCount = structure.constantCount
	constants = structure.constants?.handler?.reinterpret()
	targetCount = structure.targetCount
	targets = structure.targets?.handler?.reinterpret()
}

actual interface WGPUColorTargetState {
	value class ByValue(val handle: CValue<webgpu.native.WGPUColorTargetState>) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUColorTargetState is null") }
			set(newValue) { handle.useContents { format = newValue } } 

		override var blend: WGPUBlendState?
			get() = handle.useContents { blend?.let(::NativeAddress)?.let { WGPUBlendState(it) } }
			set(newValue) { handle.useContents { blend = newValue?.handler?.reinterpret() } } 

		override var writeMask: UInt
			get() = handle.useContents { writeMask ?: error("pointer of WGPUColorTargetState is null") }
			set(newValue) { handle.useContents { writeMask = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.format ?: error("pointer of WGPUColorTargetState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.let { it.format = newValue } } 

		override var blend: WGPUBlendState?
			get() = handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.blend?.let(::NativeAddress)?.let { WGPUBlendState(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.let { it.blend = newValue?.handler?.reinterpret() } } 

		override var writeMask: UInt
			get() = handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.writeMask ?: error("pointer of WGPUColorTargetState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.let { it.writeMask = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var format: WGPUTextureFormat
	actual var blend: WGPUBlendState?
	actual var writeMask: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUColorTargetState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUColorTargetState {
			return allocator.allocate(sizeOf<webgpu.native.WGPUColorTargetState>())
				.let { WGPUColorTargetState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUColorTargetState) -> Unit): ArrayHolder<WGPUColorTargetState> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUColorTargetState>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUColorTargetState>())
							.let(::NativeAddress)
							.let { WGPUColorTargetState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUColorTargetState> {
		return cValue<webgpu.native.WGPUColorTargetState> {
			nextInChain = this@WGPUColorTargetState.nextInChain?.reinterpret()
			format = this@WGPUColorTargetState.format
			blend = this@WGPUColorTargetState.blend?.handler?.reinterpret()
			writeMask = this@WGPUColorTargetState.writeMask
		}
	}
}

fun webgpu.native.WGPUColorTargetState.adapt(structure: WGPUColorTargetState) {
	nextInChain = structure.nextInChain?.reinterpret()
	format = structure.format
	blend = structure.blend?.handler?.reinterpret()
	writeMask = structure.writeMask
}

actual interface WGPUBlendState {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBlendState>) : WGPUBlendState {
		override val color: WGPUBlendComponent
			get() = handle.useContents { color.rawPtr.toLong().let(::NativeAddress).let { WGPUBlendComponent(it) } }

		override val alpha: WGPUBlendComponent
			get() = handle.useContents { alpha.rawPtr.toLong().let(::NativeAddress).let { WGPUBlendComponent(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUBlendState {
		override val color: WGPUBlendComponent
			get() = handler.reinterpret<webgpu.native.WGPUBlendState>().pointed.color.rawPtr.toLong().let(::NativeAddress).let { WGPUBlendComponent(it) }

		override val alpha: WGPUBlendComponent
			get() = handler.reinterpret<webgpu.native.WGPUBlendState>().pointed.alpha.rawPtr.toLong().let(::NativeAddress).let { WGPUBlendComponent(it) }

	}

	actual val color: WGPUBlendComponent
	actual val alpha: WGPUBlendComponent
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBlendState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBlendState {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBlendState>())
				.let { WGPUBlendState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBlendState) -> Unit): ArrayHolder<WGPUBlendState> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBlendState>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUBlendState>())
							.let(::NativeAddress)
							.let { WGPUBlendState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUBlendState> {
		return cValue<webgpu.native.WGPUBlendState> {
			color.adapt(this@WGPUBlendState.color)
			alpha.adapt(this@WGPUBlendState.alpha)
		}
	}
}

fun webgpu.native.WGPUBlendState.adapt(structure: WGPUBlendState) {
	color.adapt(structure.color)
	alpha.adapt(structure.alpha)
}

actual interface WGPURenderPipelineDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderPipelineDescriptor>) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var layout: WGPUPipelineLayout?
			get() = handle.useContents { layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) } }
			set(newValue) { handle.useContents { layout = newValue?.handler?.reinterpret() } } 

		override val vertex: WGPUVertexState
			get() = handle.useContents { vertex.rawPtr.toLong().let(::NativeAddress).let { WGPUVertexState(it) } }

		override val primitive: WGPUPrimitiveState
			get() = handle.useContents { primitive.rawPtr.toLong().let(::NativeAddress).let { WGPUPrimitiveState(it) } }

		override var depthStencil: WGPUDepthStencilState?
			get() = handle.useContents { depthStencil?.let(::NativeAddress)?.let { WGPUDepthStencilState(it) } }
			set(newValue) { handle.useContents { depthStencil = newValue?.handler?.reinterpret() } } 

		override val multisample: WGPUMultisampleState
			get() = handle.useContents { multisample.rawPtr.toLong().let(::NativeAddress).let { WGPUMultisampleState(it) } }

		override var fragment: WGPUFragmentState?
			get() = handle.useContents { fragment?.let(::NativeAddress)?.let { WGPUFragmentState(it) } }
			set(newValue) { handle.useContents { fragment = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var layout: WGPUPipelineLayout?
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.let { it.layout = newValue?.handler?.reinterpret() } } 

		override val vertex: WGPUVertexState
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.vertex.rawPtr.toLong().let(::NativeAddress).let { WGPUVertexState(it) }

		override val primitive: WGPUPrimitiveState
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.primitive.rawPtr.toLong().let(::NativeAddress).let { WGPUPrimitiveState(it) }

		override var depthStencil: WGPUDepthStencilState?
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.depthStencil?.let(::NativeAddress)?.let { WGPUDepthStencilState(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.let { it.depthStencil = newValue?.handler?.reinterpret() } } 

		override val multisample: WGPUMultisampleState
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.multisample.rawPtr.toLong().let(::NativeAddress).let { WGPUMultisampleState(it) }

		override var fragment: WGPUFragmentState?
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.fragment?.let(::NativeAddress)?.let { WGPUFragmentState(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.let { it.fragment = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var layout: WGPUPipelineLayout?
	actual val vertex: WGPUVertexState
	actual val primitive: WGPUPrimitiveState
	actual var depthStencil: WGPUDepthStencilState?
	actual val multisample: WGPUMultisampleState
	actual var fragment: WGPUFragmentState?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPipelineDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPipelineDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPipelineDescriptor>())
				.let { WGPURenderPipelineDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPipelineDescriptor) -> Unit): ArrayHolder<WGPURenderPipelineDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPipelineDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURenderPipelineDescriptor>())
							.let(::NativeAddress)
							.let { WGPURenderPipelineDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURenderPipelineDescriptor> {
		return cValue<webgpu.native.WGPURenderPipelineDescriptor> {
			vertex.adapt(this@WGPURenderPipelineDescriptor.vertex)
			primitive.adapt(this@WGPURenderPipelineDescriptor.primitive)
			multisample.adapt(this@WGPURenderPipelineDescriptor.multisample)
			nextInChain = this@WGPURenderPipelineDescriptor.nextInChain?.reinterpret()
			label = this@WGPURenderPipelineDescriptor.label?.handler?.reinterpret()
			layout = this@WGPURenderPipelineDescriptor.layout?.handler?.reinterpret()
			depthStencil = this@WGPURenderPipelineDescriptor.depthStencil?.handler?.reinterpret()
			fragment = this@WGPURenderPipelineDescriptor.fragment?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURenderPipelineDescriptor.adapt(structure: WGPURenderPipelineDescriptor) {
	vertex.adapt(structure.vertex)
	primitive.adapt(structure.primitive)
	multisample.adapt(structure.multisample)
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
	depthStencil = structure.depthStencil?.handler?.reinterpret()
	fragment = structure.fragment?.handler?.reinterpret()
}

actual interface WGPUSamplerDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSamplerDescriptor>) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var addressModeU: WGPUAddressMode
			get() = handle.useContents { addressModeU ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { addressModeU = newValue } } 

		override var addressModeV: WGPUAddressMode
			get() = handle.useContents { addressModeV ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { addressModeV = newValue } } 

		override var addressModeW: WGPUAddressMode
			get() = handle.useContents { addressModeW ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { addressModeW = newValue } } 

		override var magFilter: WGPUFilterMode
			get() = handle.useContents { magFilter ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { magFilter = newValue } } 

		override var minFilter: WGPUFilterMode
			get() = handle.useContents { minFilter ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { minFilter = newValue } } 

		override var mipmapFilter: WGPUMipmapFilterMode
			get() = handle.useContents { mipmapFilter ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { mipmapFilter = newValue } } 

		override var lodMinClamp: Float
			get() = handle.useContents { lodMinClamp ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { lodMinClamp = newValue } } 

		override var lodMaxClamp: Float
			get() = handle.useContents { lodMaxClamp ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { lodMaxClamp = newValue } } 

		override var compare: WGPUCompareFunction
			get() = handle.useContents { compare ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { compare = newValue } } 

		override var maxAnisotropy: UShort
			get() = handle.useContents { maxAnisotropy ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) { handle.useContents { maxAnisotropy = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var addressModeU: WGPUAddressMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.addressModeU ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.addressModeU = newValue } } 

		override var addressModeV: WGPUAddressMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.addressModeV ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.addressModeV = newValue } } 

		override var addressModeW: WGPUAddressMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.addressModeW ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.addressModeW = newValue } } 

		override var magFilter: WGPUFilterMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.magFilter ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.magFilter = newValue } } 

		override var minFilter: WGPUFilterMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.minFilter ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.minFilter = newValue } } 

		override var mipmapFilter: WGPUMipmapFilterMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.mipmapFilter ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.mipmapFilter = newValue } } 

		override var lodMinClamp: Float
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.lodMinClamp ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.lodMinClamp = newValue } } 

		override var lodMaxClamp: Float
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.lodMaxClamp ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.lodMaxClamp = newValue } } 

		override var compare: WGPUCompareFunction
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.compare ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.compare = newValue } } 

		override var maxAnisotropy: UShort
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.maxAnisotropy ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.maxAnisotropy = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var addressModeU: WGPUAddressMode
	actual var addressModeV: WGPUAddressMode
	actual var addressModeW: WGPUAddressMode
	actual var magFilter: WGPUFilterMode
	actual var minFilter: WGPUFilterMode
	actual var mipmapFilter: WGPUMipmapFilterMode
	actual var lodMinClamp: Float
	actual var lodMaxClamp: Float
	actual var compare: WGPUCompareFunction
	actual var maxAnisotropy: UShort
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSamplerDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSamplerDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSamplerDescriptor>())
				.let { WGPUSamplerDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSamplerDescriptor) -> Unit): ArrayHolder<WGPUSamplerDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSamplerDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSamplerDescriptor>())
							.let(::NativeAddress)
							.let { WGPUSamplerDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSamplerDescriptor> {
		return cValue<webgpu.native.WGPUSamplerDescriptor> {
			nextInChain = this@WGPUSamplerDescriptor.nextInChain?.reinterpret()
			label = this@WGPUSamplerDescriptor.label?.handler?.reinterpret()
			addressModeU = this@WGPUSamplerDescriptor.addressModeU
			addressModeV = this@WGPUSamplerDescriptor.addressModeV
			addressModeW = this@WGPUSamplerDescriptor.addressModeW
			magFilter = this@WGPUSamplerDescriptor.magFilter
			minFilter = this@WGPUSamplerDescriptor.minFilter
			mipmapFilter = this@WGPUSamplerDescriptor.mipmapFilter
			lodMinClamp = this@WGPUSamplerDescriptor.lodMinClamp
			lodMaxClamp = this@WGPUSamplerDescriptor.lodMaxClamp
			compare = this@WGPUSamplerDescriptor.compare
			maxAnisotropy = this@WGPUSamplerDescriptor.maxAnisotropy
		}
	}
}

fun webgpu.native.WGPUSamplerDescriptor.adapt(structure: WGPUSamplerDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	addressModeU = structure.addressModeU
	addressModeV = structure.addressModeV
	addressModeW = structure.addressModeW
	magFilter = structure.magFilter
	minFilter = structure.minFilter
	mipmapFilter = structure.mipmapFilter
	lodMinClamp = structure.lodMinClamp
	lodMaxClamp = structure.lodMaxClamp
	compare = structure.compare
	maxAnisotropy = structure.maxAnisotropy
}

actual interface WGPUShaderModuleDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUShaderModuleDescriptor>) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var hintCount: ULong
			get() = handle.useContents { hintCount ?: error("pointer of WGPUShaderModuleDescriptor is null") }
			set(newValue) { handle.useContents { hintCount = newValue } } 

		override var hints: ArrayHolder<WGPUShaderModuleCompilationHint>?
			get() = handle.useContents { hints?.let(::NativeAddress)?.let { ArrayHolder<WGPUShaderModuleCompilationHint>(it) } }
			set(newValue) { handle.useContents { hints = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var hintCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.hintCount ?: error("pointer of WGPUShaderModuleDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.let { it.hintCount = newValue } } 

		override var hints: ArrayHolder<WGPUShaderModuleCompilationHint>?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.hints?.let(::NativeAddress)?.let { ArrayHolder<WGPUShaderModuleCompilationHint>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.let { it.hints = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var hintCount: ULong
	actual var hints: ArrayHolder<WGPUShaderModuleCompilationHint>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleDescriptor>())
				.let { WGPUShaderModuleDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUShaderModuleDescriptor>())
							.let(::NativeAddress)
							.let { WGPUShaderModuleDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUShaderModuleDescriptor> {
		return cValue<webgpu.native.WGPUShaderModuleDescriptor> {
			nextInChain = this@WGPUShaderModuleDescriptor.nextInChain?.reinterpret()
			label = this@WGPUShaderModuleDescriptor.label?.handler?.reinterpret()
			hintCount = this@WGPUShaderModuleDescriptor.hintCount
			hints = this@WGPUShaderModuleDescriptor.hints?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUShaderModuleDescriptor.adapt(structure: WGPUShaderModuleDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	hintCount = structure.hintCount
	hints = structure.hints?.handler?.reinterpret()
}

actual interface WGPUShaderModuleCompilationHint {
	value class ByValue(val handle: CValue<webgpu.native.WGPUShaderModuleCompilationHint>) : WGPUShaderModuleCompilationHint {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var entryPoint: CString?
			get() = handle.useContents { entryPoint?.toCString() }
			set(newValue) { handle.useContents { entryPoint = newValue?.handler?.reinterpret() } } 

		override var layout: WGPUPipelineLayout?
			get() = handle.useContents { layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) } }
			set(newValue) { handle.useContents { layout = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUShaderModuleCompilationHint {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleCompilationHint>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleCompilationHint>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var entryPoint: CString?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleCompilationHint>().pointed.entryPoint?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleCompilationHint>().pointed.let { it.entryPoint = newValue?.handler?.reinterpret() } } 

		override var layout: WGPUPipelineLayout?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleCompilationHint>().pointed.layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleCompilationHint>().pointed.let { it.layout = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var entryPoint: CString?
	actual var layout: WGPUPipelineLayout?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleCompilationHint {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleCompilationHint {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleCompilationHint>())
				.let { WGPUShaderModuleCompilationHint(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleCompilationHint) -> Unit): ArrayHolder<WGPUShaderModuleCompilationHint> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleCompilationHint>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUShaderModuleCompilationHint>())
							.let(::NativeAddress)
							.let { WGPUShaderModuleCompilationHint(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUShaderModuleCompilationHint> {
		return cValue<webgpu.native.WGPUShaderModuleCompilationHint> {
			nextInChain = this@WGPUShaderModuleCompilationHint.nextInChain?.reinterpret()
			entryPoint = this@WGPUShaderModuleCompilationHint.entryPoint?.handler?.reinterpret()
			layout = this@WGPUShaderModuleCompilationHint.layout?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUShaderModuleCompilationHint.adapt(structure: WGPUShaderModuleCompilationHint) {
	nextInChain = structure.nextInChain?.reinterpret()
	entryPoint = structure.entryPoint?.handler?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
}

actual interface WGPUShaderModuleSPIRVDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUShaderModuleSPIRVDescriptor>) : WGPUShaderModuleSPIRVDescriptor {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var codeSize: UInt
			get() = handle.useContents { codeSize ?: error("pointer of WGPUShaderModuleSPIRVDescriptor is null") }
			set(newValue) { handle.useContents { codeSize = newValue } } 

		override var code: NativeAddress?
			get() = handle.useContents { code?.let(::NativeAddress) }
			set(newValue) { handle.useContents { code = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUShaderModuleSPIRVDescriptor {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleSPIRVDescriptor>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var codeSize: UInt
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleSPIRVDescriptor>().pointed.codeSize ?: error("pointer of WGPUShaderModuleSPIRVDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleSPIRVDescriptor>().pointed.let { it.codeSize = newValue } } 

		override var code: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleSPIRVDescriptor>().pointed.code?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleSPIRVDescriptor>().pointed.let { it.code = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var codeSize: UInt
	actual var code: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleSPIRVDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleSPIRVDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleSPIRVDescriptor>())
				.let { WGPUShaderModuleSPIRVDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleSPIRVDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleSPIRVDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleSPIRVDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUShaderModuleSPIRVDescriptor>())
							.let(::NativeAddress)
							.let { WGPUShaderModuleSPIRVDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUShaderModuleSPIRVDescriptor> {
		return cValue<webgpu.native.WGPUShaderModuleSPIRVDescriptor> {
			chain.adapt(this@WGPUShaderModuleSPIRVDescriptor.chain)
			codeSize = this@WGPUShaderModuleSPIRVDescriptor.codeSize
			code = this@WGPUShaderModuleSPIRVDescriptor.code?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUShaderModuleSPIRVDescriptor.adapt(structure: WGPUShaderModuleSPIRVDescriptor) {
	chain.adapt(structure.chain)
	codeSize = structure.codeSize
	code = structure.code?.reinterpret()
}

actual interface WGPUShaderModuleWGSLDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUShaderModuleWGSLDescriptor>) : WGPUShaderModuleWGSLDescriptor {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var code: CString?
			get() = handle.useContents { code?.toCString() }
			set(newValue) { handle.useContents { code = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUShaderModuleWGSLDescriptor {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleWGSLDescriptor>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var code: CString?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleWGSLDescriptor>().pointed.code?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleWGSLDescriptor>().pointed.let { it.code = newValue?.handler?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var code: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleWGSLDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleWGSLDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleWGSLDescriptor>())
				.let { WGPUShaderModuleWGSLDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleWGSLDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleWGSLDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleWGSLDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUShaderModuleWGSLDescriptor>())
							.let(::NativeAddress)
							.let { WGPUShaderModuleWGSLDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUShaderModuleWGSLDescriptor> {
		return cValue<webgpu.native.WGPUShaderModuleWGSLDescriptor> {
			chain.adapt(this@WGPUShaderModuleWGSLDescriptor.chain)
			code = this@WGPUShaderModuleWGSLDescriptor.code?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUShaderModuleWGSLDescriptor.adapt(structure: WGPUShaderModuleWGSLDescriptor) {
	chain.adapt(structure.chain)
	code = structure.code?.handler?.reinterpret()
}

actual interface WGPUSurfaceDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceDescriptor>) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptor>())
				.let { WGPUSurfaceDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptor) -> Unit): ArrayHolder<WGPUSurfaceDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceDescriptor>())
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceDescriptor> {
		return cValue<webgpu.native.WGPUSurfaceDescriptor> {
			nextInChain = this@WGPUSurfaceDescriptor.nextInChain?.reinterpret()
			label = this@WGPUSurfaceDescriptor.label?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceDescriptor.adapt(structure: WGPUSurfaceDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
}

actual interface WGPUSurfaceDescriptorFromAndroidNativeWindow {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow>) : WGPUSurfaceDescriptorFromAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var window: NativeAddress?
			get() = handle.useContents { window?.let(::NativeAddress) }
			set(newValue) { handle.useContents { window = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var window: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow>().pointed.window?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow>().pointed.let { it.window = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var window: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromAndroidNativeWindow {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromAndroidNativeWindow {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow>())
				.let { WGPUSurfaceDescriptorFromAndroidNativeWindow(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromAndroidNativeWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromAndroidNativeWindow> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow>())
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromAndroidNativeWindow(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow> {
		return cValue<webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow> {
			chain.adapt(this@WGPUSurfaceDescriptorFromAndroidNativeWindow.chain)
			window = this@WGPUSurfaceDescriptorFromAndroidNativeWindow.window?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceDescriptorFromAndroidNativeWindow.adapt(structure: WGPUSurfaceDescriptorFromAndroidNativeWindow) {
	chain.adapt(structure.chain)
	window = structure.window?.reinterpret()
}

actual interface WGPUSurfaceDescriptorFromCanvasHTMLSelector {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector>) : WGPUSurfaceDescriptorFromCanvasHTMLSelector {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var selector: CString?
			get() = handle.useContents { selector?.toCString() }
			set(newValue) { handle.useContents { selector = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromCanvasHTMLSelector {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var selector: CString?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector>().pointed.selector?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector>().pointed.let { it.selector = newValue?.handler?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var selector: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromCanvasHTMLSelector {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromCanvasHTMLSelector {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector>())
				.let { WGPUSurfaceDescriptorFromCanvasHTMLSelector(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromCanvasHTMLSelector) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromCanvasHTMLSelector> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector>())
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromCanvasHTMLSelector(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector> {
		return cValue<webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector> {
			chain.adapt(this@WGPUSurfaceDescriptorFromCanvasHTMLSelector.chain)
			selector = this@WGPUSurfaceDescriptorFromCanvasHTMLSelector.selector?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceDescriptorFromCanvasHTMLSelector.adapt(structure: WGPUSurfaceDescriptorFromCanvasHTMLSelector) {
	chain.adapt(structure.chain)
	selector = structure.selector?.handler?.reinterpret()
}

actual interface WGPUSurfaceDescriptorFromMetalLayer {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceDescriptorFromMetalLayer>) : WGPUSurfaceDescriptorFromMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var layer: NativeAddress?
			get() = handle.useContents { layer?.let(::NativeAddress) }
			set(newValue) { handle.useContents { layer = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromMetalLayer>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var layer: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromMetalLayer>().pointed.layer?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromMetalLayer>().pointed.let { it.layer = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var layer: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromMetalLayer {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromMetalLayer {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromMetalLayer>())
				.let { WGPUSurfaceDescriptorFromMetalLayer(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromMetalLayer) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromMetalLayer> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromMetalLayer>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceDescriptorFromMetalLayer>())
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromMetalLayer(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceDescriptorFromMetalLayer> {
		return cValue<webgpu.native.WGPUSurfaceDescriptorFromMetalLayer> {
			chain.adapt(this@WGPUSurfaceDescriptorFromMetalLayer.chain)
			layer = this@WGPUSurfaceDescriptorFromMetalLayer.layer?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceDescriptorFromMetalLayer.adapt(structure: WGPUSurfaceDescriptorFromMetalLayer) {
	chain.adapt(structure.chain)
	layer = structure.layer?.reinterpret()
}

actual interface WGPUSurfaceDescriptorFromWindowsHWND {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND>) : WGPUSurfaceDescriptorFromWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var hinstance: NativeAddress?
			get() = handle.useContents { hinstance?.let(::NativeAddress) }
			set(newValue) { handle.useContents { hinstance = newValue?.reinterpret() } } 

		override var hwnd: NativeAddress?
			get() = handle.useContents { hwnd?.let(::NativeAddress) }
			set(newValue) { handle.useContents { hwnd = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var hinstance: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND>().pointed.hinstance?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND>().pointed.let { it.hinstance = newValue?.reinterpret() } } 

		override var hwnd: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND>().pointed.hwnd?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND>().pointed.let { it.hwnd = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var hinstance: NativeAddress?
	actual var hwnd: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromWindowsHWND {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromWindowsHWND {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND>())
				.let { WGPUSurfaceDescriptorFromWindowsHWND(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromWindowsHWND) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromWindowsHWND> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND>())
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromWindowsHWND(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND> {
		return cValue<webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND> {
			chain.adapt(this@WGPUSurfaceDescriptorFromWindowsHWND.chain)
			hinstance = this@WGPUSurfaceDescriptorFromWindowsHWND.hinstance?.reinterpret()
			hwnd = this@WGPUSurfaceDescriptorFromWindowsHWND.hwnd?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceDescriptorFromWindowsHWND.adapt(structure: WGPUSurfaceDescriptorFromWindowsHWND) {
	chain.adapt(structure.chain)
	hinstance = structure.hinstance?.reinterpret()
	hwnd = structure.hwnd?.reinterpret()
}

actual interface WGPUSurfaceDescriptorFromXcbWindow {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow>) : WGPUSurfaceDescriptorFromXcbWindow {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var connection: NativeAddress?
			get() = handle.useContents { connection?.let(::NativeAddress) }
			set(newValue) { handle.useContents { connection = newValue?.reinterpret() } } 

		override var window: UInt
			get() = handle.useContents { window ?: error("pointer of WGPUSurfaceDescriptorFromXcbWindow is null") }
			set(newValue) { handle.useContents { window = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromXcbWindow {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var connection: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow>().pointed.connection?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow>().pointed.let { it.connection = newValue?.reinterpret() } } 

		override var window: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow>().pointed.window ?: error("pointer of WGPUSurfaceDescriptorFromXcbWindow is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow>().pointed.let { it.window = newValue } } 

	}

	actual val chain: WGPUChainedStruct
	actual var connection: NativeAddress?
	actual var window: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromXcbWindow {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromXcbWindow {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow>())
				.let { WGPUSurfaceDescriptorFromXcbWindow(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromXcbWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromXcbWindow> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow>())
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromXcbWindow(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow> {
		return cValue<webgpu.native.WGPUSurfaceDescriptorFromXcbWindow> {
			chain.adapt(this@WGPUSurfaceDescriptorFromXcbWindow.chain)
			connection = this@WGPUSurfaceDescriptorFromXcbWindow.connection?.reinterpret()
			window = this@WGPUSurfaceDescriptorFromXcbWindow.window
		}
	}
}

fun webgpu.native.WGPUSurfaceDescriptorFromXcbWindow.adapt(structure: WGPUSurfaceDescriptorFromXcbWindow) {
	chain.adapt(structure.chain)
	connection = structure.connection?.reinterpret()
	window = structure.window
}

actual interface WGPUSurfaceDescriptorFromXlibWindow {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow>) : WGPUSurfaceDescriptorFromXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var display: NativeAddress?
			get() = handle.useContents { display?.let(::NativeAddress) }
			set(newValue) { handle.useContents { display = newValue?.reinterpret() } } 

		override var window: ULong
			get() = handle.useContents { window ?: error("pointer of WGPUSurfaceDescriptorFromXlibWindow is null") }
			set(newValue) { handle.useContents { window = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var display: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow>().pointed.display?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow>().pointed.let { it.display = newValue?.reinterpret() } } 

		override var window: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow>().pointed.window ?: error("pointer of WGPUSurfaceDescriptorFromXlibWindow is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow>().pointed.let { it.window = newValue } } 

	}

	actual val chain: WGPUChainedStruct
	actual var display: NativeAddress?
	actual var window: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromXlibWindow {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromXlibWindow {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow>())
				.let { WGPUSurfaceDescriptorFromXlibWindow(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromXlibWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromXlibWindow> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow>())
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromXlibWindow(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow> {
		return cValue<webgpu.native.WGPUSurfaceDescriptorFromXlibWindow> {
			chain.adapt(this@WGPUSurfaceDescriptorFromXlibWindow.chain)
			display = this@WGPUSurfaceDescriptorFromXlibWindow.display?.reinterpret()
			window = this@WGPUSurfaceDescriptorFromXlibWindow.window
		}
	}
}

fun webgpu.native.WGPUSurfaceDescriptorFromXlibWindow.adapt(structure: WGPUSurfaceDescriptorFromXlibWindow) {
	chain.adapt(structure.chain)
	display = structure.display?.reinterpret()
	window = structure.window
}

actual interface WGPUSurfaceDescriptorFromWaylandSurface {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface>) : WGPUSurfaceDescriptorFromWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var display: NativeAddress?
			get() = handle.useContents { display?.let(::NativeAddress) }
			set(newValue) { handle.useContents { display = newValue?.reinterpret() } } 

		override var surface: NativeAddress?
			get() = handle.useContents { surface?.let(::NativeAddress) }
			set(newValue) { handle.useContents { surface = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var display: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface>().pointed.display?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface>().pointed.let { it.display = newValue?.reinterpret() } } 

		override var surface: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface>().pointed.surface?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface>().pointed.let { it.surface = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var display: NativeAddress?
	actual var surface: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromWaylandSurface {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromWaylandSurface {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface>())
				.let { WGPUSurfaceDescriptorFromWaylandSurface(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromWaylandSurface) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromWaylandSurface> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface>())
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromWaylandSurface(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface> {
		return cValue<webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface> {
			chain.adapt(this@WGPUSurfaceDescriptorFromWaylandSurface.chain)
			display = this@WGPUSurfaceDescriptorFromWaylandSurface.display?.reinterpret()
			surface = this@WGPUSurfaceDescriptorFromWaylandSurface.surface?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceDescriptorFromWaylandSurface.adapt(structure: WGPUSurfaceDescriptorFromWaylandSurface) {
	chain.adapt(structure.chain)
	display = structure.display?.reinterpret()
	surface = structure.surface?.reinterpret()
}

actual interface WGPUSurfaceTexture {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceTexture>) : WGPUSurfaceTexture {
		override var texture: WGPUTexture?
			get() = handle.useContents { texture?.let(::NativeAddress)?.let { WGPUTexture(it) } }
			set(newValue) { handle.useContents { texture = newValue?.handler?.reinterpret() } } 

		override var suboptimal: Boolean
			get() = handle.useContents { suboptimal.toBoolean() ?: error("pointer of WGPUSurfaceTexture is null") }
			set(newValue) { handle.useContents { suboptimal = newValue.toUInt() } } 

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handle.useContents { status ?: error("pointer of WGPUSurfaceTexture is null") }
			set(newValue) { handle.useContents { status = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceTexture {
		override var texture: WGPUTexture?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.texture?.let(::NativeAddress)?.let { WGPUTexture(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.let { it.texture = newValue?.handler?.reinterpret() } } 

		override var suboptimal: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.suboptimal.toBoolean() ?: error("pointer of WGPUSurfaceTexture is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.let { it.suboptimal = newValue.toUInt() } } 

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.status ?: error("pointer of WGPUSurfaceTexture is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.let { it.status = newValue } } 

	}

	actual var texture: WGPUTexture?
	actual var suboptimal: Boolean
	actual var status: WGPUSurfaceGetCurrentTextureStatus
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceTexture {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceTexture {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceTexture>())
				.let { WGPUSurfaceTexture(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceTexture) -> Unit): ArrayHolder<WGPUSurfaceTexture> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceTexture>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceTexture>())
							.let(::NativeAddress)
							.let { WGPUSurfaceTexture(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceTexture> {
		return cValue<webgpu.native.WGPUSurfaceTexture> {
			texture = this@WGPUSurfaceTexture.texture?.handler?.reinterpret()
			suboptimal = this@WGPUSurfaceTexture.suboptimal.toUInt()
			status = this@WGPUSurfaceTexture.status
		}
	}
}

fun webgpu.native.WGPUSurfaceTexture.adapt(structure: WGPUSurfaceTexture) {
	texture = structure.texture?.handler?.reinterpret()
	suboptimal = structure.suboptimal.toUInt()
	status = structure.status
}

actual interface WGPUTextureDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUTextureDescriptor>) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var usage: UInt
			get() = handle.useContents { usage ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) { handle.useContents { usage = newValue } } 

		override var dimension: WGPUTextureDimension
			get() = handle.useContents { dimension ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) { handle.useContents { dimension = newValue } } 

		override val size: WGPUExtent3D
			get() = handle.useContents { size.rawPtr.toLong().let(::NativeAddress).let { WGPUExtent3D(it) } }

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) { handle.useContents { format = newValue } } 

		override var mipLevelCount: UInt
			get() = handle.useContents { mipLevelCount ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) { handle.useContents { mipLevelCount = newValue } } 

		override var sampleCount: UInt
			get() = handle.useContents { sampleCount ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) { handle.useContents { sampleCount = newValue } } 

		override var viewFormatCount: ULong
			get() = handle.useContents { viewFormatCount ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) { handle.useContents { viewFormatCount = newValue } } 

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.useContents { viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) } }
			set(newValue) { handle.useContents { viewFormats = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var usage: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.usage ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.usage = newValue } } 

		override var dimension: WGPUTextureDimension
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.dimension ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.dimension = newValue } } 

		override val size: WGPUExtent3D
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.size.rawPtr.toLong().let(::NativeAddress).let { WGPUExtent3D(it) }

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.format ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.format = newValue } } 

		override var mipLevelCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.mipLevelCount ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.mipLevelCount = newValue } } 

		override var sampleCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.sampleCount ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.sampleCount = newValue } } 

		override var viewFormatCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.viewFormatCount ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.viewFormatCount = newValue } } 

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.viewFormats = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var usage: UInt
	actual var dimension: WGPUTextureDimension
	actual val size: WGPUExtent3D
	actual var format: WGPUTextureFormat
	actual var mipLevelCount: UInt
	actual var sampleCount: UInt
	actual var viewFormatCount: ULong
	actual var viewFormats: ArrayHolder<WGPUTextureFormat>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTextureDescriptor>())
				.let { WGPUTextureDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureDescriptor) -> Unit): ArrayHolder<WGPUTextureDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTextureDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUTextureDescriptor>())
							.let(::NativeAddress)
							.let { WGPUTextureDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUTextureDescriptor> {
		return cValue<webgpu.native.WGPUTextureDescriptor> {
			size.adapt(this@WGPUTextureDescriptor.size)
			nextInChain = this@WGPUTextureDescriptor.nextInChain?.reinterpret()
			label = this@WGPUTextureDescriptor.label?.handler?.reinterpret()
			usage = this@WGPUTextureDescriptor.usage
			dimension = this@WGPUTextureDescriptor.dimension
			format = this@WGPUTextureDescriptor.format
			mipLevelCount = this@WGPUTextureDescriptor.mipLevelCount
			sampleCount = this@WGPUTextureDescriptor.sampleCount
			viewFormatCount = this@WGPUTextureDescriptor.viewFormatCount
			viewFormats = this@WGPUTextureDescriptor.viewFormats?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUTextureDescriptor.adapt(structure: WGPUTextureDescriptor) {
	size.adapt(structure.size)
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	usage = structure.usage
	dimension = structure.dimension
	format = structure.format
	mipLevelCount = structure.mipLevelCount
	sampleCount = structure.sampleCount
	viewFormatCount = structure.viewFormatCount
	viewFormats = structure.viewFormats?.handler?.reinterpret()
}

actual interface WGPUTextureViewDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUTextureViewDescriptor>) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handle.useContents { label?.toCString() }
			set(newValue) { handle.useContents { label = newValue?.handler?.reinterpret() } } 

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) { handle.useContents { format = newValue } } 

		override var dimension: WGPUTextureViewDimension
			get() = handle.useContents { dimension ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) { handle.useContents { dimension = newValue } } 

		override var baseMipLevel: UInt
			get() = handle.useContents { baseMipLevel ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) { handle.useContents { baseMipLevel = newValue } } 

		override var mipLevelCount: UInt
			get() = handle.useContents { mipLevelCount ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) { handle.useContents { mipLevelCount = newValue } } 

		override var baseArrayLayer: UInt
			get() = handle.useContents { baseArrayLayer ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) { handle.useContents { baseArrayLayer = newValue } } 

		override var arrayLayerCount: UInt
			get() = handle.useContents { arrayLayerCount ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) { handle.useContents { arrayLayerCount = newValue } } 

		override var aspect: WGPUTextureAspect
			get() = handle.useContents { aspect ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) { handle.useContents { aspect = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var label: CString?
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.label?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.label = newValue?.handler?.reinterpret() } } 

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.format ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.format = newValue } } 

		override var dimension: WGPUTextureViewDimension
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.dimension ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.dimension = newValue } } 

		override var baseMipLevel: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.baseMipLevel ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.baseMipLevel = newValue } } 

		override var mipLevelCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.mipLevelCount ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.mipLevelCount = newValue } } 

		override var baseArrayLayer: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.baseArrayLayer ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.baseArrayLayer = newValue } } 

		override var arrayLayerCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.arrayLayerCount ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.arrayLayerCount = newValue } } 

		override var aspect: WGPUTextureAspect
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.aspect ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.aspect = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var format: WGPUTextureFormat
	actual var dimension: WGPUTextureViewDimension
	actual var baseMipLevel: UInt
	actual var mipLevelCount: UInt
	actual var baseArrayLayer: UInt
	actual var arrayLayerCount: UInt
	actual var aspect: WGPUTextureAspect
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureViewDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureViewDescriptor {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTextureViewDescriptor>())
				.let { WGPUTextureViewDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureViewDescriptor) -> Unit): ArrayHolder<WGPUTextureViewDescriptor> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTextureViewDescriptor>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUTextureViewDescriptor>())
							.let(::NativeAddress)
							.let { WGPUTextureViewDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUTextureViewDescriptor> {
		return cValue<webgpu.native.WGPUTextureViewDescriptor> {
			nextInChain = this@WGPUTextureViewDescriptor.nextInChain?.reinterpret()
			label = this@WGPUTextureViewDescriptor.label?.handler?.reinterpret()
			format = this@WGPUTextureViewDescriptor.format
			dimension = this@WGPUTextureViewDescriptor.dimension
			baseMipLevel = this@WGPUTextureViewDescriptor.baseMipLevel
			mipLevelCount = this@WGPUTextureViewDescriptor.mipLevelCount
			baseArrayLayer = this@WGPUTextureViewDescriptor.baseArrayLayer
			arrayLayerCount = this@WGPUTextureViewDescriptor.arrayLayerCount
			aspect = this@WGPUTextureViewDescriptor.aspect
		}
	}
}

fun webgpu.native.WGPUTextureViewDescriptor.adapt(structure: WGPUTextureViewDescriptor) {
	nextInChain = structure.nextInChain?.reinterpret()
	label = structure.label?.handler?.reinterpret()
	format = structure.format
	dimension = structure.dimension
	baseMipLevel = structure.baseMipLevel
	mipLevelCount = structure.mipLevelCount
	baseArrayLayer = structure.baseArrayLayer
	arrayLayerCount = structure.arrayLayerCount
	aspect = structure.aspect
}

actual interface WGPUWrappedSubmissionIndex {
	value class ByValue(val handle: CValue<webgpu.native.WGPUWrappedSubmissionIndex>) : WGPUWrappedSubmissionIndex {
		override var queue: WGPUQueue?
			get() = handle.useContents { queue?.let(::NativeAddress)?.let { WGPUQueue(it) } }
			set(newValue) { handle.useContents { queue = newValue?.handler?.reinterpret() } } 

		override var submissionIndex: ULong
			get() = handle.useContents { submissionIndex ?: error("pointer of WGPUWrappedSubmissionIndex is null") }
			set(newValue) { handle.useContents { submissionIndex = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUWrappedSubmissionIndex {
		override var queue: WGPUQueue?
			get() = handler.reinterpret<webgpu.native.WGPUWrappedSubmissionIndex>().pointed.queue?.let(::NativeAddress)?.let { WGPUQueue(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUWrappedSubmissionIndex>().pointed.let { it.queue = newValue?.handler?.reinterpret() } } 

		override var submissionIndex: ULong
			get() = handler.reinterpret<webgpu.native.WGPUWrappedSubmissionIndex>().pointed.submissionIndex ?: error("pointer of WGPUWrappedSubmissionIndex is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUWrappedSubmissionIndex>().pointed.let { it.submissionIndex = newValue } } 

	}

	actual var queue: WGPUQueue?
	actual var submissionIndex: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUWrappedSubmissionIndex {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUWrappedSubmissionIndex {
			return allocator.allocate(sizeOf<webgpu.native.WGPUWrappedSubmissionIndex>())
				.let { WGPUWrappedSubmissionIndex(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUWrappedSubmissionIndex) -> Unit): ArrayHolder<WGPUWrappedSubmissionIndex> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUWrappedSubmissionIndex>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUWrappedSubmissionIndex>())
							.let(::NativeAddress)
							.let { WGPUWrappedSubmissionIndex(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUWrappedSubmissionIndex> {
		return cValue<webgpu.native.WGPUWrappedSubmissionIndex> {
			queue = this@WGPUWrappedSubmissionIndex.queue?.handler?.reinterpret()
			submissionIndex = this@WGPUWrappedSubmissionIndex.submissionIndex
		}
	}
}

fun webgpu.native.WGPUWrappedSubmissionIndex.adapt(structure: WGPUWrappedSubmissionIndex) {
	queue = structure.queue?.handler?.reinterpret()
	submissionIndex = structure.submissionIndex
}

actual interface WGPUInstanceExtras {
	value class ByValue(val handle: CValue<webgpu.native.WGPUInstanceExtras>) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var backends: UInt
			get() = handle.useContents { backends ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) { handle.useContents { backends = newValue } } 

		override var flags: UInt
			get() = handle.useContents { flags ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) { handle.useContents { flags = newValue } } 

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handle.useContents { dx12ShaderCompiler ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) { handle.useContents { dx12ShaderCompiler = newValue } } 

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handle.useContents { gles3MinorVersion ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) { handle.useContents { gles3MinorVersion = newValue } } 

		override var dxilPath: CString?
			get() = handle.useContents { dxilPath?.toCString() }
			set(newValue) { handle.useContents { dxilPath = newValue?.handler?.reinterpret() } } 

		override var dxcPath: CString?
			get() = handle.useContents { dxcPath?.toCString() }
			set(newValue) { handle.useContents { dxcPath = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var backends: UInt
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.backends ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.backends = newValue } } 

		override var flags: UInt
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.flags ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.flags = newValue } } 

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.dx12ShaderCompiler ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.dx12ShaderCompiler = newValue } } 

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.gles3MinorVersion ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.gles3MinorVersion = newValue } } 

		override var dxilPath: CString?
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.dxilPath?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.dxilPath = newValue?.handler?.reinterpret() } } 

		override var dxcPath: CString?
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.dxcPath?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.dxcPath = newValue?.handler?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var backends: UInt
	actual var flags: UInt
	actual var dx12ShaderCompiler: WGPUDx12Compiler
	actual var gles3MinorVersion: WGPUGles3MinorVersion
	actual var dxilPath: CString?
	actual var dxcPath: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUInstanceExtras {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUInstanceExtras {
			return allocator.allocate(sizeOf<webgpu.native.WGPUInstanceExtras>())
				.let { WGPUInstanceExtras(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUInstanceExtras) -> Unit): ArrayHolder<WGPUInstanceExtras> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUInstanceExtras>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUInstanceExtras>())
							.let(::NativeAddress)
							.let { WGPUInstanceExtras(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUInstanceExtras> {
		return cValue<webgpu.native.WGPUInstanceExtras> {
			chain.adapt(this@WGPUInstanceExtras.chain)
			backends = this@WGPUInstanceExtras.backends
			flags = this@WGPUInstanceExtras.flags
			dx12ShaderCompiler = this@WGPUInstanceExtras.dx12ShaderCompiler
			gles3MinorVersion = this@WGPUInstanceExtras.gles3MinorVersion
			dxilPath = this@WGPUInstanceExtras.dxilPath?.handler?.reinterpret()
			dxcPath = this@WGPUInstanceExtras.dxcPath?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUInstanceExtras.adapt(structure: WGPUInstanceExtras) {
	chain.adapt(structure.chain)
	backends = structure.backends
	flags = structure.flags
	dx12ShaderCompiler = structure.dx12ShaderCompiler
	gles3MinorVersion = structure.gles3MinorVersion
	dxilPath = structure.dxilPath?.handler?.reinterpret()
	dxcPath = structure.dxcPath?.handler?.reinterpret()
}

actual interface WGPUChainedStructOut {
	value class ByValue(val handle: CValue<webgpu.native.WGPUChainedStructOut>) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = handle.useContents { next?.let(::NativeAddress)?.let { WGPUChainedStructOut(it) } }
			set(newValue) { handle.useContents { next = newValue?.handler?.reinterpret() } } 

		override var sType: WGPUSType
			get() = handle.useContents { sType ?: error("pointer of WGPUChainedStructOut is null") }
			set(newValue) { handle.useContents { sType = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = handler.reinterpret<webgpu.native.WGPUChainedStructOut>().pointed.next?.let(::NativeAddress)?.let { WGPUChainedStructOut(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUChainedStructOut>().pointed.let { it.next = newValue?.handler?.reinterpret() } } 

		override var sType: WGPUSType
			get() = handler.reinterpret<webgpu.native.WGPUChainedStructOut>().pointed.sType ?: error("pointer of WGPUChainedStructOut is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUChainedStructOut>().pointed.let { it.sType = newValue } } 

	}

	actual var next: WGPUChainedStructOut?
	actual var sType: WGPUSType
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUChainedStructOut {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUChainedStructOut {
			return allocator.allocate(sizeOf<webgpu.native.WGPUChainedStructOut>())
				.let { WGPUChainedStructOut(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUChainedStructOut) -> Unit): ArrayHolder<WGPUChainedStructOut> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUChainedStructOut>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUChainedStructOut>())
							.let(::NativeAddress)
							.let { WGPUChainedStructOut(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUChainedStructOut> {
		return cValue<webgpu.native.WGPUChainedStructOut> {
			next = this@WGPUChainedStructOut.next?.handler?.reinterpret()
			sType = this@WGPUChainedStructOut.sType
		}
	}
}

fun webgpu.native.WGPUChainedStructOut.adapt(structure: WGPUChainedStructOut) {
	next = structure.next?.handler?.reinterpret()
	sType = structure.sType
}

