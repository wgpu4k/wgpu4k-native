// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.NativeAddress
import ffi.CallbackHolder
import ffi.CString
import ffi.ArrayHolder
import ffi.C_LONG
import ffi.C_POINTER
import ffi.C_SHORT
import ffi.C_INT
import ffi.C_FLOAT
import ffi.C_DOUBLE
import ffi.CStructure
import ffi.MemoryAllocator
import ffi.toAddress
import java.lang.foreign.AddressLayout
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemoryLayout.Companion.structLayout

actual interface WGPURequestAdapterOptions {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByReference = io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByReference(com.sun.jna.Pointer.NULL)) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var compatibleSurface: WGPUSurface?
			get() = handle.compatibleSurface?.let{ WGPUSurface(it) }
			set(newValue) { handle.compatibleSurface = newValue?.handler }

		override var powerPreference: WGPUPowerPreference
			get() = handle.powerPreference.toUInt()
			set(newValue) { handle.powerPreference = newValue.toInt() }

		override var backendType: WGPUBackendType
			get() = handle.backendType.toUInt()
			set(newValue) { handle.backendType = newValue.toInt() }

		override var forceFallbackAdapter: Boolean
			get() = handle.forceFallbackAdapter.toBoolean()
			set(newValue) { handle.forceFallbackAdapter = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue = io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue(com.sun.jna.Pointer.NULL)) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var compatibleSurface: WGPUSurface?
			get() = handle.compatibleSurface?.let{ WGPUSurface(it) }
			set(newValue) { handle.compatibleSurface = newValue?.handler }

		override var powerPreference: WGPUPowerPreference
			get() = handle.powerPreference.toUInt()
			set(newValue) { handle.powerPreference = newValue.toInt() }

		override var backendType: WGPUBackendType
			get() = handle.backendType.toUInt()
			set(newValue) { handle.backendType = newValue.toInt() }

		override var forceFallbackAdapter: Boolean
			get() = handle.forceFallbackAdapter.toBoolean()
			set(newValue) { handle.forceFallbackAdapter = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var compatibleSurface: WGPUSurface?
	actual var powerPreference: WGPUPowerPreference
	actual var backendType: WGPUBackendType
	actual var forceFallbackAdapter: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURequestAdapterOptions {
			return io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterOptions {
			return WGPURequestAdapterOptions.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURequestAdapterOptions) -> Unit): ArrayHolder<WGPURequestAdapterOptions> {
			val array = io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue)
					.also { provider(index.toUInt(), WGPURequestAdapterOptions.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUAdapterInfo {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByReference = io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByReference(com.sun.jna.Pointer.NULL)) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var vendor: CString?
			get() = handle.vendor?.let(::CString)
			set(newValue) { handle.vendor = newValue?.handler }

		override var architecture: CString?
			get() = handle.architecture?.let(::CString)
			set(newValue) { handle.architecture = newValue?.handler }

		override var device: CString?
			get() = handle.device?.let(::CString)
			set(newValue) { handle.device = newValue?.handler }

		override var description: CString?
			get() = handle.description?.let(::CString)
			set(newValue) { handle.description = newValue?.handler }

		override var backendType: WGPUBackendType
			get() = handle.backendType.toUInt()
			set(newValue) { handle.backendType = newValue.toInt() }

		override var adapterType: WGPUAdapterType
			get() = handle.adapterType.toUInt()
			set(newValue) { handle.adapterType = newValue.toInt() }

		override var vendorID: UInt
			get() = handle.vendorID.toUInt()
			set(newValue) { handle.vendorID = newValue.toInt() }

		override var deviceID: UInt
			get() = handle.deviceID.toUInt()
			set(newValue) { handle.deviceID = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue = io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue(com.sun.jna.Pointer.NULL)) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var vendor: CString?
			get() = handle.vendor?.let(::CString)
			set(newValue) { handle.vendor = newValue?.handler }

		override var architecture: CString?
			get() = handle.architecture?.let(::CString)
			set(newValue) { handle.architecture = newValue?.handler }

		override var device: CString?
			get() = handle.device?.let(::CString)
			set(newValue) { handle.device = newValue?.handler }

		override var description: CString?
			get() = handle.description?.let(::CString)
			set(newValue) { handle.description = newValue?.handler }

		override var backendType: WGPUBackendType
			get() = handle.backendType.toUInt()
			set(newValue) { handle.backendType = newValue.toInt() }

		override var adapterType: WGPUAdapterType
			get() = handle.adapterType.toUInt()
			set(newValue) { handle.adapterType = newValue.toInt() }

		override var vendorID: UInt
			get() = handle.vendorID.toUInt()
			set(newValue) { handle.vendorID = newValue.toInt() }

		override var deviceID: UInt
			get() = handle.deviceID.toUInt()
			set(newValue) { handle.deviceID = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUAdapterInfo {
			return WGPUAdapterInfo.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUAdapterInfo) -> Unit): ArrayHolder<WGPUAdapterInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue)
					.also { provider(index.toUInt(), WGPUAdapterInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUQueueDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUQueueDescriptor {
			return io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUQueueDescriptor {
			return WGPUQueueDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUQueueDescriptor) -> Unit): ArrayHolder<WGPUQueueDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUQueueDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUUncapturedErrorCallbackInfo {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByReference(com.sun.jna.Pointer.NULL)) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var callback: CallbackHolder<WGPUErrorCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) { handle.callback = newValue?.callback }

		override var userdata: NativeAddress?
			get() = handle.userdata
			set(newValue) { handle.userdata = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue(com.sun.jna.Pointer.NULL)) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var callback: CallbackHolder<WGPUErrorCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) { handle.callback = newValue?.callback }

		override var userdata: NativeAddress?
			get() = handle.userdata
			set(newValue) { handle.userdata = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var callback: CallbackHolder<WGPUErrorCallback>?
	actual var userdata: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUUncapturedErrorCallbackInfo {
			return io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUUncapturedErrorCallbackInfo {
			return WGPUUncapturedErrorCallbackInfo.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUUncapturedErrorCallbackInfo) -> Unit): ArrayHolder<WGPUUncapturedErrorCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPUUncapturedErrorCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUDeviceDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var requiredFeatureCount: ULong
			get() = handle.requiredFeatureCount.toULong()
			set(newValue) { handle.requiredFeatureCount = newValue.toLong() }

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handle.requiredFeatures?.let(::ArrayHolder)
			set(newValue) { handle.requiredFeatures = newValue?.handler }

		override var requiredLimits: WGPURequiredLimits?
			get() = handle.requiredLimits?.let{ WGPURequiredLimits.ByReference(it) }
			set(newValue) { handle.requiredLimits = (newValue as? WGPURequiredLimits.ByReference)?.handle }

		override val defaultQueue: WGPUQueueDescriptor
			get() = handle.defaultQueue.let{ WGPUQueueDescriptor.ByValue(it) }

		override var deviceLostCallback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handle.deviceLostCallback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) { handle.deviceLostCallback = newValue?.callback }

		override var deviceLostUserdata: NativeAddress?
			get() = handle.deviceLostUserdata
			set(newValue) { handle.deviceLostUserdata = newValue }

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handle.uncapturedErrorCallbackInfo.let{ WGPUUncapturedErrorCallbackInfo.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var requiredFeatureCount: ULong
			get() = handle.requiredFeatureCount.toULong()
			set(newValue) { handle.requiredFeatureCount = newValue.toLong() }

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handle.requiredFeatures?.let(::ArrayHolder)
			set(newValue) { handle.requiredFeatures = newValue?.handler }

		override var requiredLimits: WGPURequiredLimits?
			get() = handle.requiredLimits?.let{ WGPURequiredLimits.ByReference(it) }
			set(newValue) { handle.requiredLimits = (newValue as? WGPURequiredLimits.ByReference)?.handle }

		override val defaultQueue: WGPUQueueDescriptor
			get() = handle.defaultQueue.let{ WGPUQueueDescriptor.ByValue(it) }

		override var deviceLostCallback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handle.deviceLostCallback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) { handle.deviceLostCallback = newValue?.callback }

		override var deviceLostUserdata: NativeAddress?
			get() = handle.deviceLostUserdata
			set(newValue) { handle.deviceLostUserdata = newValue }

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handle.uncapturedErrorCallbackInfo.let{ WGPUUncapturedErrorCallbackInfo.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUDeviceDescriptor {
			return WGPUDeviceDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUDeviceDescriptor) -> Unit): ArrayHolder<WGPUDeviceDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUDeviceDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUBindGroupEntry {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByReference(com.sun.jna.Pointer.NULL)) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var binding: UInt
			get() = handle.binding.toUInt()
			set(newValue) { handle.binding = newValue.toInt() }

		override var buffer: WGPUBuffer?
			get() = handle.buffer?.let{ WGPUBuffer(it) }
			set(newValue) { handle.buffer = newValue?.handler }

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) { handle.offset = newValue.toLong() }

		override var size: ULong
			get() = handle.size.toULong()
			set(newValue) { handle.size = newValue.toLong() }

		override var sampler: WGPUSampler?
			get() = handle.sampler?.let{ WGPUSampler(it) }
			set(newValue) { handle.sampler = newValue?.handler }

		override var textureView: WGPUTextureView?
			get() = handle.textureView?.let{ WGPUTextureView(it) }
			set(newValue) { handle.textureView = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue(com.sun.jna.Pointer.NULL)) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var binding: UInt
			get() = handle.binding.toUInt()
			set(newValue) { handle.binding = newValue.toInt() }

		override var buffer: WGPUBuffer?
			get() = handle.buffer?.let{ WGPUBuffer(it) }
			set(newValue) { handle.buffer = newValue?.handler }

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) { handle.offset = newValue.toLong() }

		override var size: ULong
			get() = handle.size.toULong()
			set(newValue) { handle.size = newValue.toLong() }

		override var sampler: WGPUSampler?
			get() = handle.sampler?.let{ WGPUSampler(it) }
			set(newValue) { handle.sampler = newValue?.handler }

		override var textureView: WGPUTextureView?
			get() = handle.textureView?.let{ WGPUTextureView(it) }
			set(newValue) { handle.textureView = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupEntry {
			return WGPUBindGroupEntry.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupEntry) -> Unit): ArrayHolder<WGPUBindGroupEntry> {
			val array = io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue)
					.also { provider(index.toUInt(), WGPUBindGroupEntry.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUBindGroupDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var layout: WGPUBindGroupLayout?
			get() = handle.layout?.let{ WGPUBindGroupLayout(it) }
			set(newValue) { handle.layout = newValue?.handler }

		override var entryCount: ULong
			get() = handle.entryCount.toULong()
			set(newValue) { handle.entryCount = newValue.toLong() }

		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = handle.entries?.let(::ArrayHolder)
			set(newValue) { handle.entries = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var layout: WGPUBindGroupLayout?
			get() = handle.layout?.let{ WGPUBindGroupLayout(it) }
			set(newValue) { handle.layout = newValue?.handler }

		override var entryCount: ULong
			get() = handle.entryCount.toULong()
			set(newValue) { handle.entryCount = newValue.toLong() }

		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = handle.entries?.let(::ArrayHolder)
			set(newValue) { handle.entries = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var layout: WGPUBindGroupLayout?
	actual var entryCount: ULong
	actual var entries: ArrayHolder<WGPUBindGroupEntry>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupDescriptor {
			return io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupDescriptor {
			return WGPUBindGroupDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupDescriptor) -> Unit): ArrayHolder<WGPUBindGroupDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUBindGroupDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUBufferBindingLayout {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByReference(com.sun.jna.Pointer.NULL)) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var type: WGPUBufferBindingType
			get() = handle.type.toUInt()
			set(newValue) { handle.type = newValue.toInt() }

		override var hasDynamicOffset: Boolean
			get() = handle.hasDynamicOffset.toBoolean()
			set(newValue) { handle.hasDynamicOffset = newValue.toInt() }

		override var minBindingSize: ULong
			get() = handle.minBindingSize.toULong()
			set(newValue) { handle.minBindingSize = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue = io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue(com.sun.jna.Pointer.NULL)) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var type: WGPUBufferBindingType
			get() = handle.type.toUInt()
			set(newValue) { handle.type = newValue.toInt() }

		override var hasDynamicOffset: Boolean
			get() = handle.hasDynamicOffset.toBoolean()
			set(newValue) { handle.hasDynamicOffset = newValue.toInt() }

		override var minBindingSize: ULong
			get() = handle.minBindingSize.toULong()
			set(newValue) { handle.minBindingSize = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var type: WGPUBufferBindingType
	actual var hasDynamicOffset: Boolean
	actual var minBindingSize: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBufferBindingLayout {
			return io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBufferBindingLayout {
			return WGPUBufferBindingLayout.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBufferBindingLayout) -> Unit): ArrayHolder<WGPUBufferBindingLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue)
					.also { provider(index.toUInt(), WGPUBufferBindingLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSamplerBindingLayout {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var type: WGPUSamplerBindingType
			get() = handle.type.toUInt()
			set(newValue) { handle.type = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue = io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var type: WGPUSamplerBindingType
			get() = handle.type.toUInt()
			set(newValue) { handle.type = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var type: WGPUSamplerBindingType
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSamplerBindingLayout {
			return io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSamplerBindingLayout {
			return WGPUSamplerBindingLayout.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSamplerBindingLayout) -> Unit): ArrayHolder<WGPUSamplerBindingLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue)
					.also { provider(index.toUInt(), WGPUSamplerBindingLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUTextureBindingLayout {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByReference(com.sun.jna.Pointer.NULL)) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var sampleType: WGPUTextureSampleType
			get() = handle.sampleType.toUInt()
			set(newValue) { handle.sampleType = newValue.toInt() }

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.viewDimension.toUInt()
			set(newValue) { handle.viewDimension = newValue.toInt() }

		override var multisampled: Boolean
			get() = handle.multisampled.toBoolean()
			set(newValue) { handle.multisampled = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue = io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue(com.sun.jna.Pointer.NULL)) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var sampleType: WGPUTextureSampleType
			get() = handle.sampleType.toUInt()
			set(newValue) { handle.sampleType = newValue.toInt() }

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.viewDimension.toUInt()
			set(newValue) { handle.viewDimension = newValue.toInt() }

		override var multisampled: Boolean
			get() = handle.multisampled.toBoolean()
			set(newValue) { handle.multisampled = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var sampleType: WGPUTextureSampleType
	actual var viewDimension: WGPUTextureViewDimension
	actual var multisampled: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureBindingLayout {
			return io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureBindingLayout {
			return WGPUTextureBindingLayout.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureBindingLayout) -> Unit): ArrayHolder<WGPUTextureBindingLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue)
					.also { provider(index.toUInt(), WGPUTextureBindingLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceCapabilities {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var usages: UInt
			get() = handle.usages.toUInt()
			set(newValue) { handle.usages = newValue.toInt() }

		override var formatCount: ULong
			get() = handle.formatCount.toULong()
			set(newValue) { handle.formatCount = newValue.toLong() }

		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.formats?.let(::ArrayHolder)
			set(newValue) { handle.formats = newValue?.handler }

		override var presentModeCount: ULong
			get() = handle.presentModeCount.toULong()
			set(newValue) { handle.presentModeCount = newValue.toLong() }

		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = handle.presentModes?.let(::ArrayHolder)
			set(newValue) { handle.presentModes = newValue?.handler }

		override var alphaModeCount: ULong
			get() = handle.alphaModeCount.toULong()
			set(newValue) { handle.alphaModeCount = newValue.toLong() }

		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = handle.alphaModes?.let(::ArrayHolder)
			set(newValue) { handle.alphaModes = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var usages: UInt
			get() = handle.usages.toUInt()
			set(newValue) { handle.usages = newValue.toInt() }

		override var formatCount: ULong
			get() = handle.formatCount.toULong()
			set(newValue) { handle.formatCount = newValue.toLong() }

		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.formats?.let(::ArrayHolder)
			set(newValue) { handle.formats = newValue?.handler }

		override var presentModeCount: ULong
			get() = handle.presentModeCount.toULong()
			set(newValue) { handle.presentModeCount = newValue.toLong() }

		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = handle.presentModes?.let(::ArrayHolder)
			set(newValue) { handle.presentModes = newValue?.handler }

		override var alphaModeCount: ULong
			get() = handle.alphaModeCount.toULong()
			set(newValue) { handle.alphaModeCount = newValue.toLong() }

		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = handle.alphaModes?.let(::ArrayHolder)
			set(newValue) { handle.alphaModes = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceCapabilities {
			return WGPUSurfaceCapabilities.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceCapabilities) -> Unit): ArrayHolder<WGPUSurfaceCapabilities> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceCapabilities.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceConfiguration {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var device: WGPUDevice?
			get() = handle.device?.let{ WGPUDevice(it) }
			set(newValue) { handle.device = newValue?.handler }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var usage: UInt
			get() = handle.usage.toUInt()
			set(newValue) { handle.usage = newValue.toInt() }

		override var viewFormatCount: ULong
			get() = handle.viewFormatCount.toULong()
			set(newValue) { handle.viewFormatCount = newValue.toLong() }

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.viewFormats?.let(::ArrayHolder)
			set(newValue) { handle.viewFormats = newValue?.handler }

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handle.alphaMode.toUInt()
			set(newValue) { handle.alphaMode = newValue.toInt() }

		override var width: UInt
			get() = handle.width.toUInt()
			set(newValue) { handle.width = newValue.toInt() }

		override var height: UInt
			get() = handle.height.toUInt()
			set(newValue) { handle.height = newValue.toInt() }

		override var presentMode: WGPUPresentMode
			get() = handle.presentMode.toUInt()
			set(newValue) { handle.presentMode = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var device: WGPUDevice?
			get() = handle.device?.let{ WGPUDevice(it) }
			set(newValue) { handle.device = newValue?.handler }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var usage: UInt
			get() = handle.usage.toUInt()
			set(newValue) { handle.usage = newValue.toInt() }

		override var viewFormatCount: ULong
			get() = handle.viewFormatCount.toULong()
			set(newValue) { handle.viewFormatCount = newValue.toLong() }

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.viewFormats?.let(::ArrayHolder)
			set(newValue) { handle.viewFormats = newValue?.handler }

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handle.alphaMode.toUInt()
			set(newValue) { handle.alphaMode = newValue.toInt() }

		override var width: UInt
			get() = handle.width.toUInt()
			set(newValue) { handle.width = newValue.toInt() }

		override var height: UInt
			get() = handle.height.toUInt()
			set(newValue) { handle.height = newValue.toInt() }

		override var presentMode: WGPUPresentMode
			get() = handle.presentMode.toUInt()
			set(newValue) { handle.presentMode = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceConfiguration {
			return WGPUSurfaceConfiguration.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceConfiguration) -> Unit): ArrayHolder<WGPUSurfaceConfiguration> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceConfiguration.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUStorageTextureBindingLayout {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByReference(com.sun.jna.Pointer.NULL)) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var access: WGPUStorageTextureAccess
			get() = handle.access.toUInt()
			set(newValue) { handle.access = newValue.toInt() }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.viewDimension.toUInt()
			set(newValue) { handle.viewDimension = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue = io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue(com.sun.jna.Pointer.NULL)) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var access: WGPUStorageTextureAccess
			get() = handle.access.toUInt()
			set(newValue) { handle.access = newValue.toInt() }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.viewDimension.toUInt()
			set(newValue) { handle.viewDimension = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var access: WGPUStorageTextureAccess
	actual var format: WGPUTextureFormat
	actual var viewDimension: WGPUTextureViewDimension
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUStorageTextureBindingLayout {
			return io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUStorageTextureBindingLayout {
			return WGPUStorageTextureBindingLayout.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUStorageTextureBindingLayout) -> Unit): ArrayHolder<WGPUStorageTextureBindingLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue)
					.also { provider(index.toUInt(), WGPUStorageTextureBindingLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUBindGroupLayoutEntry {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByReference(com.sun.jna.Pointer.NULL)) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var binding: UInt
			get() = handle.binding.toUInt()
			set(newValue) { handle.binding = newValue.toInt() }

		override var visibility: UInt
			get() = handle.visibility.toUInt()
			set(newValue) { handle.visibility = newValue.toInt() }

		override val buffer: WGPUBufferBindingLayout
			get() = handle.buffer.let{ WGPUBufferBindingLayout.ByValue(it) }

		override val sampler: WGPUSamplerBindingLayout
			get() = handle.sampler.let{ WGPUSamplerBindingLayout.ByValue(it) }

		override val texture: WGPUTextureBindingLayout
			get() = handle.texture.let{ WGPUTextureBindingLayout.ByValue(it) }

		override val storageTexture: WGPUStorageTextureBindingLayout
			get() = handle.storageTexture.let{ WGPUStorageTextureBindingLayout.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue(com.sun.jna.Pointer.NULL)) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var binding: UInt
			get() = handle.binding.toUInt()
			set(newValue) { handle.binding = newValue.toInt() }

		override var visibility: UInt
			get() = handle.visibility.toUInt()
			set(newValue) { handle.visibility = newValue.toInt() }

		override val buffer: WGPUBufferBindingLayout
			get() = handle.buffer.let{ WGPUBufferBindingLayout.ByValue(it) }

		override val sampler: WGPUSamplerBindingLayout
			get() = handle.sampler.let{ WGPUSamplerBindingLayout.ByValue(it) }

		override val texture: WGPUTextureBindingLayout
			get() = handle.texture.let{ WGPUTextureBindingLayout.ByValue(it) }

		override val storageTexture: WGPUStorageTextureBindingLayout
			get() = handle.storageTexture.let{ WGPUStorageTextureBindingLayout.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutEntry {
			return WGPUBindGroupLayoutEntry.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupLayoutEntry) -> Unit): ArrayHolder<WGPUBindGroupLayoutEntry> {
			val array = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue)
					.also { provider(index.toUInt(), WGPUBindGroupLayoutEntry.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUBindGroupLayoutDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var entryCount: ULong
			get() = handle.entryCount.toULong()
			set(newValue) { handle.entryCount = newValue.toLong() }

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = handle.entries?.let(::ArrayHolder)
			set(newValue) { handle.entries = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var entryCount: ULong
			get() = handle.entryCount.toULong()
			set(newValue) { handle.entryCount = newValue.toLong() }

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = handle.entries?.let(::ArrayHolder)
			set(newValue) { handle.entries = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var entryCount: ULong
	actual var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutDescriptor {
			return io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutDescriptor {
			return WGPUBindGroupLayoutDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupLayoutDescriptor) -> Unit): ArrayHolder<WGPUBindGroupLayoutDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUBindGroupLayoutDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUBlendComponent {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUBlendComponent.ByReference = io.ygdrasil.wgpu.android.WGPUBlendComponent.ByReference(com.sun.jna.Pointer.NULL)) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = handle.operation.toUInt()
			set(newValue) { handle.operation = newValue.toInt() }

		override var srcFactor: WGPUBlendFactor
			get() = handle.srcFactor.toUInt()
			set(newValue) { handle.srcFactor = newValue.toInt() }

		override var dstFactor: WGPUBlendFactor
			get() = handle.dstFactor.toUInt()
			set(newValue) { handle.dstFactor = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue = io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue(com.sun.jna.Pointer.NULL)) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = handle.operation.toUInt()
			set(newValue) { handle.operation = newValue.toInt() }

		override var srcFactor: WGPUBlendFactor
			get() = handle.srcFactor.toUInt()
			set(newValue) { handle.srcFactor = newValue.toInt() }

		override var dstFactor: WGPUBlendFactor
			get() = handle.dstFactor.toUInt()
			set(newValue) { handle.dstFactor = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var operation: WGPUBlendOperation
	actual var srcFactor: WGPUBlendFactor
	actual var dstFactor: WGPUBlendFactor
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBlendComponent {
			return io.ygdrasil.wgpu.android.WGPUBlendComponent.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBlendComponent {
			return WGPUBlendComponent.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBlendComponent) -> Unit): ArrayHolder<WGPUBlendComponent> {
			val array = io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue)
					.also { provider(index.toUInt(), WGPUBlendComponent.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUBufferDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var usage: UInt
			get() = handle.usage.toUInt()
			set(newValue) { handle.usage = newValue.toInt() }

		override var size: ULong
			get() = handle.size.toULong()
			set(newValue) { handle.size = newValue.toLong() }

		override var mappedAtCreation: Boolean
			get() = handle.mappedAtCreation.toBoolean()
			set(newValue) { handle.mappedAtCreation = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var usage: UInt
			get() = handle.usage.toUInt()
			set(newValue) { handle.usage = newValue.toInt() }

		override var size: ULong
			get() = handle.size.toULong()
			set(newValue) { handle.size = newValue.toLong() }

		override var mappedAtCreation: Boolean
			get() = handle.mappedAtCreation.toBoolean()
			set(newValue) { handle.mappedAtCreation = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var usage: UInt
	actual var size: ULong
	actual var mappedAtCreation: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBufferDescriptor {
			return io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBufferDescriptor {
			return WGPUBufferDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBufferDescriptor) -> Unit): ArrayHolder<WGPUBufferDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUBufferDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUColor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUColor.ByReference = io.ygdrasil.wgpu.android.WGPUColor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUColor {
		override var r: Double
			get() = handle.r
			set(newValue) { handle.r = newValue }

		override var g: Double
			get() = handle.g
			set(newValue) { handle.g = newValue }

		override var b: Double
			get() = handle.b
			set(newValue) { handle.b = newValue }

		override var a: Double
			get() = handle.a
			set(newValue) { handle.a = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUColor.ByValue = io.ygdrasil.wgpu.android.WGPUColor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUColor {
		override var r: Double
			get() = handle.r
			set(newValue) { handle.r = newValue }

		override var g: Double
			get() = handle.g
			set(newValue) { handle.g = newValue }

		override var b: Double
			get() = handle.b
			set(newValue) { handle.b = newValue }

		override var a: Double
			get() = handle.a
			set(newValue) { handle.a = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUColor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var r: Double
	actual var g: Double
	actual var b: Double
	actual var a: Double
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUColor {
			return io.ygdrasil.wgpu.android.WGPUColor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUColor {
			return WGPUColor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUColor) -> Unit): ArrayHolder<WGPUColor> {
			val array = io.ygdrasil.wgpu.android.WGPUColor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUColor.ByValue)
					.also { provider(index.toUInt(), WGPUColor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUConstantEntry {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUConstantEntry.ByReference = io.ygdrasil.wgpu.android.WGPUConstantEntry.ByReference(com.sun.jna.Pointer.NULL)) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var key: CString?
			get() = handle.key?.let(::CString)
			set(newValue) { handle.key = newValue?.handler }

		override var value: Double
			get() = handle.value
			set(newValue) { handle.value = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue = io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue(com.sun.jna.Pointer.NULL)) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var key: CString?
			get() = handle.key?.let(::CString)
			set(newValue) { handle.key = newValue?.handler }

		override var value: Double
			get() = handle.value
			set(newValue) { handle.value = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var key: CString?
	actual var value: Double
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUConstantEntry {
			return io.ygdrasil.wgpu.android.WGPUConstantEntry.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUConstantEntry {
			return WGPUConstantEntry.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUConstantEntry) -> Unit): ArrayHolder<WGPUConstantEntry> {
			val array = io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue)
					.also { provider(index.toUInt(), WGPUConstantEntry.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUCommandBufferDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCommandBufferDescriptor {
			return io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCommandBufferDescriptor {
			return WGPUCommandBufferDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCommandBufferDescriptor) -> Unit): ArrayHolder<WGPUCommandBufferDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUCommandBufferDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUCommandEncoderDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCommandEncoderDescriptor {
			return io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCommandEncoderDescriptor {
			return WGPUCommandEncoderDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCommandEncoderDescriptor) -> Unit): ArrayHolder<WGPUCommandEncoderDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUCommandEncoderDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUCompilationInfo {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByReference = io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByReference(com.sun.jna.Pointer.NULL)) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var messageCount: ULong
			get() = handle.messageCount.toULong()
			set(newValue) { handle.messageCount = newValue.toLong() }

		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = handle.messages?.let(::ArrayHolder)
			set(newValue) { handle.messages = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue = io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue(com.sun.jna.Pointer.NULL)) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var messageCount: ULong
			get() = handle.messageCount.toULong()
			set(newValue) { handle.messageCount = newValue.toLong() }

		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = handle.messages?.let(::ArrayHolder)
			set(newValue) { handle.messages = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var messageCount: ULong
	actual var messages: ArrayHolder<WGPUCompilationMessage>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCompilationInfo {
			return io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfo {
			return WGPUCompilationInfo.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCompilationInfo) -> Unit): ArrayHolder<WGPUCompilationInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue)
					.also { provider(index.toUInt(), WGPUCompilationInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUCompilationMessage {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByReference = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByReference(com.sun.jna.Pointer.NULL)) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var message: CString?
			get() = handle.message?.let(::CString)
			set(newValue) { handle.message = newValue?.handler }

		override var type: WGPUCompilationMessageType
			get() = handle.type.toUInt()
			set(newValue) { handle.type = newValue.toInt() }

		override var lineNum: ULong
			get() = handle.lineNum.toULong()
			set(newValue) { handle.lineNum = newValue.toLong() }

		override var linePos: ULong
			get() = handle.linePos.toULong()
			set(newValue) { handle.linePos = newValue.toLong() }

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) { handle.offset = newValue.toLong() }

		override var length: ULong
			get() = handle.length.toULong()
			set(newValue) { handle.length = newValue.toLong() }

		override var utf16LinePos: ULong
			get() = handle.utf16LinePos.toULong()
			set(newValue) { handle.utf16LinePos = newValue.toLong() }

		override var utf16Offset: ULong
			get() = handle.utf16Offset.toULong()
			set(newValue) { handle.utf16Offset = newValue.toLong() }

		override var utf16Length: ULong
			get() = handle.utf16Length.toULong()
			set(newValue) { handle.utf16Length = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue(com.sun.jna.Pointer.NULL)) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var message: CString?
			get() = handle.message?.let(::CString)
			set(newValue) { handle.message = newValue?.handler }

		override var type: WGPUCompilationMessageType
			get() = handle.type.toUInt()
			set(newValue) { handle.type = newValue.toInt() }

		override var lineNum: ULong
			get() = handle.lineNum.toULong()
			set(newValue) { handle.lineNum = newValue.toLong() }

		override var linePos: ULong
			get() = handle.linePos.toULong()
			set(newValue) { handle.linePos = newValue.toLong() }

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) { handle.offset = newValue.toLong() }

		override var length: ULong
			get() = handle.length.toULong()
			set(newValue) { handle.length = newValue.toLong() }

		override var utf16LinePos: ULong
			get() = handle.utf16LinePos.toULong()
			set(newValue) { handle.utf16LinePos = newValue.toLong() }

		override var utf16Offset: ULong
			get() = handle.utf16Offset.toULong()
			set(newValue) { handle.utf16Offset = newValue.toLong() }

		override var utf16Length: ULong
			get() = handle.utf16Length.toULong()
			set(newValue) { handle.utf16Length = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCompilationMessage {
			return WGPUCompilationMessage.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCompilationMessage) -> Unit): ArrayHolder<WGPUCompilationMessage> {
			val array = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue)
					.also { provider(index.toUInt(), WGPUCompilationMessage.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUComputePassDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = handle.timestampWrites?.let{ WGPUComputePassTimestampWrites.ByReference(it) }
			set(newValue) { handle.timestampWrites = (newValue as? WGPUComputePassTimestampWrites.ByReference)?.handle }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = handle.timestampWrites?.let{ WGPUComputePassTimestampWrites.ByReference(it) }
			set(newValue) { handle.timestampWrites = (newValue as? WGPUComputePassTimestampWrites.ByReference)?.handle }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var timestampWrites: WGPUComputePassTimestampWrites?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUComputePassDescriptor {
			return io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUComputePassDescriptor {
			return WGPUComputePassDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUComputePassDescriptor) -> Unit): ArrayHolder<WGPUComputePassDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUComputePassDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUComputePassTimestampWrites {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByReference = io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByReference(com.sun.jna.Pointer.NULL)) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.querySet?.let{ WGPUQuerySet(it) }
			set(newValue) { handle.querySet = newValue?.handler }

		override var beginningOfPassWriteIndex: UInt
			get() = handle.beginningOfPassWriteIndex.toUInt()
			set(newValue) { handle.beginningOfPassWriteIndex = newValue.toInt() }

		override var endOfPassWriteIndex: UInt
			get() = handle.endOfPassWriteIndex.toUInt()
			set(newValue) { handle.endOfPassWriteIndex = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue = io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue(com.sun.jna.Pointer.NULL)) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.querySet?.let{ WGPUQuerySet(it) }
			set(newValue) { handle.querySet = newValue?.handler }

		override var beginningOfPassWriteIndex: UInt
			get() = handle.beginningOfPassWriteIndex.toUInt()
			set(newValue) { handle.beginningOfPassWriteIndex = newValue.toInt() }

		override var endOfPassWriteIndex: UInt
			get() = handle.endOfPassWriteIndex.toUInt()
			set(newValue) { handle.endOfPassWriteIndex = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var querySet: WGPUQuerySet?
	actual var beginningOfPassWriteIndex: UInt
	actual var endOfPassWriteIndex: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUComputePassTimestampWrites {
			return io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUComputePassTimestampWrites {
			return WGPUComputePassTimestampWrites.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUComputePassTimestampWrites) -> Unit): ArrayHolder<WGPUComputePassTimestampWrites> {
			val array = io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue)
					.also { provider(index.toUInt(), WGPUComputePassTimestampWrites.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUProgrammableStageDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) { handle.module = newValue?.handler }

		override var entryPoint: CString?
			get() = handle.entryPoint?.let(::CString)
			set(newValue) { handle.entryPoint = newValue?.handler }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) { handle.constantCount = newValue.toLong() }

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) { handle.constants = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) { handle.module = newValue?.handler }

		override var entryPoint: CString?
			get() = handle.entryPoint?.let(::CString)
			set(newValue) { handle.entryPoint = newValue?.handler }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) { handle.constantCount = newValue.toLong() }

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) { handle.constants = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var module: WGPUShaderModule?
	actual var entryPoint: CString?
	actual var constantCount: ULong
	actual var constants: ArrayHolder<WGPUConstantEntry>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUProgrammableStageDescriptor {
			return io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUProgrammableStageDescriptor {
			return WGPUProgrammableStageDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUProgrammableStageDescriptor) -> Unit): ArrayHolder<WGPUProgrammableStageDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUProgrammableStageDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUComputePipelineDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) { handle.layout = newValue?.handler }

		override val compute: WGPUProgrammableStageDescriptor
			get() = handle.compute.let{ WGPUProgrammableStageDescriptor.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) { handle.layout = newValue?.handler }

		override val compute: WGPUProgrammableStageDescriptor
			get() = handle.compute.let{ WGPUProgrammableStageDescriptor.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var layout: WGPUPipelineLayout?
	actual val compute: WGPUProgrammableStageDescriptor
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUComputePipelineDescriptor {
			return io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUComputePipelineDescriptor {
			return WGPUComputePipelineDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUComputePipelineDescriptor) -> Unit): ArrayHolder<WGPUComputePipelineDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUComputePipelineDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPULimits {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPULimits.ByReference = io.ygdrasil.wgpu.android.WGPULimits.ByReference(com.sun.jna.Pointer.NULL)) : WGPULimits {
		override var maxTextureDimension1D: UInt
			get() = handle.maxTextureDimension1D.toUInt()
			set(newValue) { handle.maxTextureDimension1D = newValue.toInt() }

		override var maxTextureDimension2D: UInt
			get() = handle.maxTextureDimension2D.toUInt()
			set(newValue) { handle.maxTextureDimension2D = newValue.toInt() }

		override var maxTextureDimension3D: UInt
			get() = handle.maxTextureDimension3D.toUInt()
			set(newValue) { handle.maxTextureDimension3D = newValue.toInt() }

		override var maxTextureArrayLayers: UInt
			get() = handle.maxTextureArrayLayers.toUInt()
			set(newValue) { handle.maxTextureArrayLayers = newValue.toInt() }

		override var maxBindGroups: UInt
			get() = handle.maxBindGroups.toUInt()
			set(newValue) { handle.maxBindGroups = newValue.toInt() }

		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = handle.maxBindGroupsPlusVertexBuffers.toUInt()
			set(newValue) { handle.maxBindGroupsPlusVertexBuffers = newValue.toInt() }

		override var maxBindingsPerBindGroup: UInt
			get() = handle.maxBindingsPerBindGroup.toUInt()
			set(newValue) { handle.maxBindingsPerBindGroup = newValue.toInt() }

		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = handle.maxDynamicUniformBuffersPerPipelineLayout.toUInt()
			set(newValue) { handle.maxDynamicUniformBuffersPerPipelineLayout = newValue.toInt() }

		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = handle.maxDynamicStorageBuffersPerPipelineLayout.toUInt()
			set(newValue) { handle.maxDynamicStorageBuffersPerPipelineLayout = newValue.toInt() }

		override var maxSampledTexturesPerShaderStage: UInt
			get() = handle.maxSampledTexturesPerShaderStage.toUInt()
			set(newValue) { handle.maxSampledTexturesPerShaderStage = newValue.toInt() }

		override var maxSamplersPerShaderStage: UInt
			get() = handle.maxSamplersPerShaderStage.toUInt()
			set(newValue) { handle.maxSamplersPerShaderStage = newValue.toInt() }

		override var maxStorageBuffersPerShaderStage: UInt
			get() = handle.maxStorageBuffersPerShaderStage.toUInt()
			set(newValue) { handle.maxStorageBuffersPerShaderStage = newValue.toInt() }

		override var maxStorageTexturesPerShaderStage: UInt
			get() = handle.maxStorageTexturesPerShaderStage.toUInt()
			set(newValue) { handle.maxStorageTexturesPerShaderStage = newValue.toInt() }

		override var maxUniformBuffersPerShaderStage: UInt
			get() = handle.maxUniformBuffersPerShaderStage.toUInt()
			set(newValue) { handle.maxUniformBuffersPerShaderStage = newValue.toInt() }

		override var maxUniformBufferBindingSize: ULong
			get() = handle.maxUniformBufferBindingSize.toULong()
			set(newValue) { handle.maxUniformBufferBindingSize = newValue.toLong() }

		override var maxStorageBufferBindingSize: ULong
			get() = handle.maxStorageBufferBindingSize.toULong()
			set(newValue) { handle.maxStorageBufferBindingSize = newValue.toLong() }

		override var minUniformBufferOffsetAlignment: UInt
			get() = handle.minUniformBufferOffsetAlignment.toUInt()
			set(newValue) { handle.minUniformBufferOffsetAlignment = newValue.toInt() }

		override var minStorageBufferOffsetAlignment: UInt
			get() = handle.minStorageBufferOffsetAlignment.toUInt()
			set(newValue) { handle.minStorageBufferOffsetAlignment = newValue.toInt() }

		override var maxVertexBuffers: UInt
			get() = handle.maxVertexBuffers.toUInt()
			set(newValue) { handle.maxVertexBuffers = newValue.toInt() }

		override var maxBufferSize: ULong
			get() = handle.maxBufferSize.toULong()
			set(newValue) { handle.maxBufferSize = newValue.toLong() }

		override var maxVertexAttributes: UInt
			get() = handle.maxVertexAttributes.toUInt()
			set(newValue) { handle.maxVertexAttributes = newValue.toInt() }

		override var maxVertexBufferArrayStride: UInt
			get() = handle.maxVertexBufferArrayStride.toUInt()
			set(newValue) { handle.maxVertexBufferArrayStride = newValue.toInt() }

		override var maxInterStageShaderComponents: UInt
			get() = handle.maxInterStageShaderComponents.toUInt()
			set(newValue) { handle.maxInterStageShaderComponents = newValue.toInt() }

		override var maxInterStageShaderVariables: UInt
			get() = handle.maxInterStageShaderVariables.toUInt()
			set(newValue) { handle.maxInterStageShaderVariables = newValue.toInt() }

		override var maxColorAttachments: UInt
			get() = handle.maxColorAttachments.toUInt()
			set(newValue) { handle.maxColorAttachments = newValue.toInt() }

		override var maxColorAttachmentBytesPerSample: UInt
			get() = handle.maxColorAttachmentBytesPerSample.toUInt()
			set(newValue) { handle.maxColorAttachmentBytesPerSample = newValue.toInt() }

		override var maxComputeWorkgroupStorageSize: UInt
			get() = handle.maxComputeWorkgroupStorageSize.toUInt()
			set(newValue) { handle.maxComputeWorkgroupStorageSize = newValue.toInt() }

		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = handle.maxComputeInvocationsPerWorkgroup.toUInt()
			set(newValue) { handle.maxComputeInvocationsPerWorkgroup = newValue.toInt() }

		override var maxComputeWorkgroupSizeX: UInt
			get() = handle.maxComputeWorkgroupSizeX.toUInt()
			set(newValue) { handle.maxComputeWorkgroupSizeX = newValue.toInt() }

		override var maxComputeWorkgroupSizeY: UInt
			get() = handle.maxComputeWorkgroupSizeY.toUInt()
			set(newValue) { handle.maxComputeWorkgroupSizeY = newValue.toInt() }

		override var maxComputeWorkgroupSizeZ: UInt
			get() = handle.maxComputeWorkgroupSizeZ.toUInt()
			set(newValue) { handle.maxComputeWorkgroupSizeZ = newValue.toInt() }

		override var maxComputeWorkgroupsPerDimension: UInt
			get() = handle.maxComputeWorkgroupsPerDimension.toUInt()
			set(newValue) { handle.maxComputeWorkgroupsPerDimension = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPULimits.ByValue = io.ygdrasil.wgpu.android.WGPULimits.ByValue(com.sun.jna.Pointer.NULL)) : WGPULimits {
		override var maxTextureDimension1D: UInt
			get() = handle.maxTextureDimension1D.toUInt()
			set(newValue) { handle.maxTextureDimension1D = newValue.toInt() }

		override var maxTextureDimension2D: UInt
			get() = handle.maxTextureDimension2D.toUInt()
			set(newValue) { handle.maxTextureDimension2D = newValue.toInt() }

		override var maxTextureDimension3D: UInt
			get() = handle.maxTextureDimension3D.toUInt()
			set(newValue) { handle.maxTextureDimension3D = newValue.toInt() }

		override var maxTextureArrayLayers: UInt
			get() = handle.maxTextureArrayLayers.toUInt()
			set(newValue) { handle.maxTextureArrayLayers = newValue.toInt() }

		override var maxBindGroups: UInt
			get() = handle.maxBindGroups.toUInt()
			set(newValue) { handle.maxBindGroups = newValue.toInt() }

		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = handle.maxBindGroupsPlusVertexBuffers.toUInt()
			set(newValue) { handle.maxBindGroupsPlusVertexBuffers = newValue.toInt() }

		override var maxBindingsPerBindGroup: UInt
			get() = handle.maxBindingsPerBindGroup.toUInt()
			set(newValue) { handle.maxBindingsPerBindGroup = newValue.toInt() }

		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = handle.maxDynamicUniformBuffersPerPipelineLayout.toUInt()
			set(newValue) { handle.maxDynamicUniformBuffersPerPipelineLayout = newValue.toInt() }

		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = handle.maxDynamicStorageBuffersPerPipelineLayout.toUInt()
			set(newValue) { handle.maxDynamicStorageBuffersPerPipelineLayout = newValue.toInt() }

		override var maxSampledTexturesPerShaderStage: UInt
			get() = handle.maxSampledTexturesPerShaderStage.toUInt()
			set(newValue) { handle.maxSampledTexturesPerShaderStage = newValue.toInt() }

		override var maxSamplersPerShaderStage: UInt
			get() = handle.maxSamplersPerShaderStage.toUInt()
			set(newValue) { handle.maxSamplersPerShaderStage = newValue.toInt() }

		override var maxStorageBuffersPerShaderStage: UInt
			get() = handle.maxStorageBuffersPerShaderStage.toUInt()
			set(newValue) { handle.maxStorageBuffersPerShaderStage = newValue.toInt() }

		override var maxStorageTexturesPerShaderStage: UInt
			get() = handle.maxStorageTexturesPerShaderStage.toUInt()
			set(newValue) { handle.maxStorageTexturesPerShaderStage = newValue.toInt() }

		override var maxUniformBuffersPerShaderStage: UInt
			get() = handle.maxUniformBuffersPerShaderStage.toUInt()
			set(newValue) { handle.maxUniformBuffersPerShaderStage = newValue.toInt() }

		override var maxUniformBufferBindingSize: ULong
			get() = handle.maxUniformBufferBindingSize.toULong()
			set(newValue) { handle.maxUniformBufferBindingSize = newValue.toLong() }

		override var maxStorageBufferBindingSize: ULong
			get() = handle.maxStorageBufferBindingSize.toULong()
			set(newValue) { handle.maxStorageBufferBindingSize = newValue.toLong() }

		override var minUniformBufferOffsetAlignment: UInt
			get() = handle.minUniformBufferOffsetAlignment.toUInt()
			set(newValue) { handle.minUniformBufferOffsetAlignment = newValue.toInt() }

		override var minStorageBufferOffsetAlignment: UInt
			get() = handle.minStorageBufferOffsetAlignment.toUInt()
			set(newValue) { handle.minStorageBufferOffsetAlignment = newValue.toInt() }

		override var maxVertexBuffers: UInt
			get() = handle.maxVertexBuffers.toUInt()
			set(newValue) { handle.maxVertexBuffers = newValue.toInt() }

		override var maxBufferSize: ULong
			get() = handle.maxBufferSize.toULong()
			set(newValue) { handle.maxBufferSize = newValue.toLong() }

		override var maxVertexAttributes: UInt
			get() = handle.maxVertexAttributes.toUInt()
			set(newValue) { handle.maxVertexAttributes = newValue.toInt() }

		override var maxVertexBufferArrayStride: UInt
			get() = handle.maxVertexBufferArrayStride.toUInt()
			set(newValue) { handle.maxVertexBufferArrayStride = newValue.toInt() }

		override var maxInterStageShaderComponents: UInt
			get() = handle.maxInterStageShaderComponents.toUInt()
			set(newValue) { handle.maxInterStageShaderComponents = newValue.toInt() }

		override var maxInterStageShaderVariables: UInt
			get() = handle.maxInterStageShaderVariables.toUInt()
			set(newValue) { handle.maxInterStageShaderVariables = newValue.toInt() }

		override var maxColorAttachments: UInt
			get() = handle.maxColorAttachments.toUInt()
			set(newValue) { handle.maxColorAttachments = newValue.toInt() }

		override var maxColorAttachmentBytesPerSample: UInt
			get() = handle.maxColorAttachmentBytesPerSample.toUInt()
			set(newValue) { handle.maxColorAttachmentBytesPerSample = newValue.toInt() }

		override var maxComputeWorkgroupStorageSize: UInt
			get() = handle.maxComputeWorkgroupStorageSize.toUInt()
			set(newValue) { handle.maxComputeWorkgroupStorageSize = newValue.toInt() }

		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = handle.maxComputeInvocationsPerWorkgroup.toUInt()
			set(newValue) { handle.maxComputeInvocationsPerWorkgroup = newValue.toInt() }

		override var maxComputeWorkgroupSizeX: UInt
			get() = handle.maxComputeWorkgroupSizeX.toUInt()
			set(newValue) { handle.maxComputeWorkgroupSizeX = newValue.toInt() }

		override var maxComputeWorkgroupSizeY: UInt
			get() = handle.maxComputeWorkgroupSizeY.toUInt()
			set(newValue) { handle.maxComputeWorkgroupSizeY = newValue.toInt() }

		override var maxComputeWorkgroupSizeZ: UInt
			get() = handle.maxComputeWorkgroupSizeZ.toUInt()
			set(newValue) { handle.maxComputeWorkgroupSizeZ = newValue.toInt() }

		override var maxComputeWorkgroupsPerDimension: UInt
			get() = handle.maxComputeWorkgroupsPerDimension.toUInt()
			set(newValue) { handle.maxComputeWorkgroupsPerDimension = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPULimits.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPULimits.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPULimits {
			return WGPULimits.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPULimits) -> Unit): ArrayHolder<WGPULimits> {
			val array = io.ygdrasil.wgpu.android.WGPULimits.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPULimits.ByValue)
					.also { provider(index.toUInt(), WGPULimits.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPURequiredLimits {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURequiredLimits.ByReference = io.ygdrasil.wgpu.android.WGPURequiredLimits.ByReference(com.sun.jna.Pointer.NULL)) : WGPURequiredLimits {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override val limits: WGPULimits
			get() = handle.limits.let{ WGPULimits.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURequiredLimits.ByValue = io.ygdrasil.wgpu.android.WGPURequiredLimits.ByValue(com.sun.jna.Pointer.NULL)) : WGPURequiredLimits {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override val limits: WGPULimits
			get() = handle.limits.let{ WGPULimits.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURequiredLimits.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual val limits: WGPULimits
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURequiredLimits {
			return io.ygdrasil.wgpu.android.WGPURequiredLimits.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURequiredLimits {
			return WGPURequiredLimits.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURequiredLimits) -> Unit): ArrayHolder<WGPURequiredLimits> {
			val array = io.ygdrasil.wgpu.android.WGPURequiredLimits.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURequiredLimits.ByValue)
					.also { provider(index.toUInt(), WGPURequiredLimits.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSupportedLimits {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSupportedLimits.ByReference = io.ygdrasil.wgpu.android.WGPUSupportedLimits.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSupportedLimits {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override val limits: WGPULimits
			get() = handle.limits.let{ WGPULimits.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSupportedLimits.ByValue = io.ygdrasil.wgpu.android.WGPUSupportedLimits.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSupportedLimits {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override val limits: WGPULimits
			get() = handle.limits.let{ WGPULimits.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSupportedLimits.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual val limits: WGPULimits
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSupportedLimits {
			return io.ygdrasil.wgpu.android.WGPUSupportedLimits.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSupportedLimits {
			return WGPUSupportedLimits.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSupportedLimits) -> Unit): ArrayHolder<WGPUSupportedLimits> {
			val array = io.ygdrasil.wgpu.android.WGPUSupportedLimits.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSupportedLimits.ByValue)
					.also { provider(index.toUInt(), WGPUSupportedLimits.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUExtent3D {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUExtent3D.ByReference = io.ygdrasil.wgpu.android.WGPUExtent3D.ByReference(com.sun.jna.Pointer.NULL)) : WGPUExtent3D {
		override var width: UInt
			get() = handle.width.toUInt()
			set(newValue) { handle.width = newValue.toInt() }

		override var height: UInt
			get() = handle.height.toUInt()
			set(newValue) { handle.height = newValue.toInt() }

		override var depthOrArrayLayers: UInt
			get() = handle.depthOrArrayLayers.toUInt()
			set(newValue) { handle.depthOrArrayLayers = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue = io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue(com.sun.jna.Pointer.NULL)) : WGPUExtent3D {
		override var width: UInt
			get() = handle.width.toUInt()
			set(newValue) { handle.width = newValue.toInt() }

		override var height: UInt
			get() = handle.height.toUInt()
			set(newValue) { handle.height = newValue.toInt() }

		override var depthOrArrayLayers: UInt
			get() = handle.depthOrArrayLayers.toUInt()
			set(newValue) { handle.depthOrArrayLayers = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var width: UInt
	actual var height: UInt
	actual var depthOrArrayLayers: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUExtent3D {
			return io.ygdrasil.wgpu.android.WGPUExtent3D.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUExtent3D {
			return WGPUExtent3D.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUExtent3D) -> Unit): ArrayHolder<WGPUExtent3D> {
			val array = io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue)
					.also { provider(index.toUInt(), WGPUExtent3D.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUTextureDataLayout {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUTextureDataLayout.ByReference = io.ygdrasil.wgpu.android.WGPUTextureDataLayout.ByReference(com.sun.jna.Pointer.NULL)) : WGPUTextureDataLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) { handle.offset = newValue.toLong() }

		override var bytesPerRow: UInt
			get() = handle.bytesPerRow.toUInt()
			set(newValue) { handle.bytesPerRow = newValue.toInt() }

		override var rowsPerImage: UInt
			get() = handle.rowsPerImage.toUInt()
			set(newValue) { handle.rowsPerImage = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUTextureDataLayout.ByValue = io.ygdrasil.wgpu.android.WGPUTextureDataLayout.ByValue(com.sun.jna.Pointer.NULL)) : WGPUTextureDataLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) { handle.offset = newValue.toLong() }

		override var bytesPerRow: UInt
			get() = handle.bytesPerRow.toUInt()
			set(newValue) { handle.bytesPerRow = newValue.toInt() }

		override var rowsPerImage: UInt
			get() = handle.rowsPerImage.toUInt()
			set(newValue) { handle.rowsPerImage = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTextureDataLayout.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var offset: ULong
	actual var bytesPerRow: UInt
	actual var rowsPerImage: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureDataLayout {
			return io.ygdrasil.wgpu.android.WGPUTextureDataLayout.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureDataLayout {
			return WGPUTextureDataLayout.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureDataLayout) -> Unit): ArrayHolder<WGPUTextureDataLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUTextureDataLayout.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTextureDataLayout.ByValue)
					.also { provider(index.toUInt(), WGPUTextureDataLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUImageCopyBuffer {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUImageCopyBuffer.ByReference = io.ygdrasil.wgpu.android.WGPUImageCopyBuffer.ByReference(com.sun.jna.Pointer.NULL)) : WGPUImageCopyBuffer {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override val layout: WGPUTextureDataLayout
			get() = handle.layout.let{ WGPUTextureDataLayout.ByValue(it) }

		override var buffer: WGPUBuffer?
			get() = handle.buffer?.let{ WGPUBuffer(it) }
			set(newValue) { handle.buffer = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUImageCopyBuffer.ByValue = io.ygdrasil.wgpu.android.WGPUImageCopyBuffer.ByValue(com.sun.jna.Pointer.NULL)) : WGPUImageCopyBuffer {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override val layout: WGPUTextureDataLayout
			get() = handle.layout.let{ WGPUTextureDataLayout.ByValue(it) }

		override var buffer: WGPUBuffer?
			get() = handle.buffer?.let{ WGPUBuffer(it) }
			set(newValue) { handle.buffer = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUImageCopyBuffer.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual val layout: WGPUTextureDataLayout
	actual var buffer: WGPUBuffer?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUImageCopyBuffer {
			return io.ygdrasil.wgpu.android.WGPUImageCopyBuffer.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUImageCopyBuffer {
			return WGPUImageCopyBuffer.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUImageCopyBuffer) -> Unit): ArrayHolder<WGPUImageCopyBuffer> {
			val array = io.ygdrasil.wgpu.android.WGPUImageCopyBuffer.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUImageCopyBuffer.ByValue)
					.also { provider(index.toUInt(), WGPUImageCopyBuffer.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUOrigin3D {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUOrigin3D.ByReference = io.ygdrasil.wgpu.android.WGPUOrigin3D.ByReference(com.sun.jna.Pointer.NULL)) : WGPUOrigin3D {
		override var x: UInt
			get() = handle.x.toUInt()
			set(newValue) { handle.x = newValue.toInt() }

		override var y: UInt
			get() = handle.y.toUInt()
			set(newValue) { handle.y = newValue.toInt() }

		override var z: UInt
			get() = handle.z.toUInt()
			set(newValue) { handle.z = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue = io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue(com.sun.jna.Pointer.NULL)) : WGPUOrigin3D {
		override var x: UInt
			get() = handle.x.toUInt()
			set(newValue) { handle.x = newValue.toInt() }

		override var y: UInt
			get() = handle.y.toUInt()
			set(newValue) { handle.y = newValue.toInt() }

		override var z: UInt
			get() = handle.z.toUInt()
			set(newValue) { handle.z = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var x: UInt
	actual var y: UInt
	actual var z: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUOrigin3D {
			return io.ygdrasil.wgpu.android.WGPUOrigin3D.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUOrigin3D {
			return WGPUOrigin3D.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUOrigin3D) -> Unit): ArrayHolder<WGPUOrigin3D> {
			val array = io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue)
					.also { provider(index.toUInt(), WGPUOrigin3D.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUImageCopyTexture {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUImageCopyTexture.ByReference = io.ygdrasil.wgpu.android.WGPUImageCopyTexture.ByReference(com.sun.jna.Pointer.NULL)) : WGPUImageCopyTexture {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var texture: WGPUTexture?
			get() = handle.texture?.let{ WGPUTexture(it) }
			set(newValue) { handle.texture = newValue?.handler }

		override var mipLevel: UInt
			get() = handle.mipLevel.toUInt()
			set(newValue) { handle.mipLevel = newValue.toInt() }

		override val origin: WGPUOrigin3D
			get() = handle.origin.let{ WGPUOrigin3D.ByValue(it) }

		override var aspect: WGPUTextureAspect
			get() = handle.aspect.toUInt()
			set(newValue) { handle.aspect = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUImageCopyTexture.ByValue = io.ygdrasil.wgpu.android.WGPUImageCopyTexture.ByValue(com.sun.jna.Pointer.NULL)) : WGPUImageCopyTexture {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var texture: WGPUTexture?
			get() = handle.texture?.let{ WGPUTexture(it) }
			set(newValue) { handle.texture = newValue?.handler }

		override var mipLevel: UInt
			get() = handle.mipLevel.toUInt()
			set(newValue) { handle.mipLevel = newValue.toInt() }

		override val origin: WGPUOrigin3D
			get() = handle.origin.let{ WGPUOrigin3D.ByValue(it) }

		override var aspect: WGPUTextureAspect
			get() = handle.aspect.toUInt()
			set(newValue) { handle.aspect = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUImageCopyTexture.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var texture: WGPUTexture?
	actual var mipLevel: UInt
	actual val origin: WGPUOrigin3D
	actual var aspect: WGPUTextureAspect
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUImageCopyTexture {
			return io.ygdrasil.wgpu.android.WGPUImageCopyTexture.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUImageCopyTexture {
			return WGPUImageCopyTexture.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUImageCopyTexture) -> Unit): ArrayHolder<WGPUImageCopyTexture> {
			val array = io.ygdrasil.wgpu.android.WGPUImageCopyTexture.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUImageCopyTexture.ByValue)
					.also { provider(index.toUInt(), WGPUImageCopyTexture.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUInstanceDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUInstanceDescriptor {
			return io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUInstanceDescriptor {
			return WGPUInstanceDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUInstanceDescriptor) -> Unit): ArrayHolder<WGPUInstanceDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUInstanceDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUVertexAttribute {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByReference = io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByReference(com.sun.jna.Pointer.NULL)) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) { handle.offset = newValue.toLong() }

		override var shaderLocation: UInt
			get() = handle.shaderLocation.toUInt()
			set(newValue) { handle.shaderLocation = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue = io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue(com.sun.jna.Pointer.NULL)) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) { handle.offset = newValue.toLong() }

		override var shaderLocation: UInt
			get() = handle.shaderLocation.toUInt()
			set(newValue) { handle.shaderLocation = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var format: WGPUVertexFormat
	actual var offset: ULong
	actual var shaderLocation: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUVertexAttribute {
			return io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUVertexAttribute {
			return WGPUVertexAttribute.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUVertexAttribute) -> Unit): ArrayHolder<WGPUVertexAttribute> {
			val array = io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue)
					.also { provider(index.toUInt(), WGPUVertexAttribute.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUVertexBufferLayout {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByReference = io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByReference(com.sun.jna.Pointer.NULL)) : WGPUVertexBufferLayout {
		override var arrayStride: ULong
			get() = handle.arrayStride.toULong()
			set(newValue) { handle.arrayStride = newValue.toLong() }

		override var stepMode: WGPUVertexStepMode
			get() = handle.stepMode.toUInt()
			set(newValue) { handle.stepMode = newValue.toInt() }

		override var attributeCount: ULong
			get() = handle.attributeCount.toULong()
			set(newValue) { handle.attributeCount = newValue.toLong() }

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = handle.attributes?.let(::ArrayHolder)
			set(newValue) { handle.attributes = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue = io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue(com.sun.jna.Pointer.NULL)) : WGPUVertexBufferLayout {
		override var arrayStride: ULong
			get() = handle.arrayStride.toULong()
			set(newValue) { handle.arrayStride = newValue.toLong() }

		override var stepMode: WGPUVertexStepMode
			get() = handle.stepMode.toUInt()
			set(newValue) { handle.stepMode = newValue.toInt() }

		override var attributeCount: ULong
			get() = handle.attributeCount.toULong()
			set(newValue) { handle.attributeCount = newValue.toLong() }

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = handle.attributes?.let(::ArrayHolder)
			set(newValue) { handle.attributes = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var arrayStride: ULong
	actual var stepMode: WGPUVertexStepMode
	actual var attributeCount: ULong
	actual var attributes: ArrayHolder<WGPUVertexAttribute>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUVertexBufferLayout {
			return io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUVertexBufferLayout {
			return WGPUVertexBufferLayout.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUVertexBufferLayout) -> Unit): ArrayHolder<WGPUVertexBufferLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue)
					.also { provider(index.toUInt(), WGPUVertexBufferLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUPipelineLayoutDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var bindGroupLayoutCount: ULong
			get() = handle.bindGroupLayoutCount.toULong()
			set(newValue) { handle.bindGroupLayoutCount = newValue.toLong() }

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = handle.bindGroupLayouts?.let(::ArrayHolder)
			set(newValue) { handle.bindGroupLayouts = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var bindGroupLayoutCount: ULong
			get() = handle.bindGroupLayoutCount.toULong()
			set(newValue) { handle.bindGroupLayoutCount = newValue.toLong() }

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = handle.bindGroupLayouts?.let(::ArrayHolder)
			set(newValue) { handle.bindGroupLayouts = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var bindGroupLayoutCount: ULong
	actual var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPipelineLayoutDescriptor {
			return io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPipelineLayoutDescriptor {
			return WGPUPipelineLayoutDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPipelineLayoutDescriptor) -> Unit): ArrayHolder<WGPUPipelineLayoutDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUPipelineLayoutDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUQuerySetDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var type: WGPUQueryType
			get() = handle.type.toUInt()
			set(newValue) { handle.type = newValue.toInt() }

		override var count: UInt
			get() = handle.count.toUInt()
			set(newValue) { handle.count = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var type: WGPUQueryType
			get() = handle.type.toUInt()
			set(newValue) { handle.type = newValue.toInt() }

		override var count: UInt
			get() = handle.count.toUInt()
			set(newValue) { handle.count = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var type: WGPUQueryType
	actual var count: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUQuerySetDescriptor {
			return io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUQuerySetDescriptor {
			return WGPUQuerySetDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUQuerySetDescriptor) -> Unit): ArrayHolder<WGPUQuerySetDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUQuerySetDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPURenderBundleDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderBundleDescriptor {
			return io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleDescriptor {
			return WGPURenderBundleDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderBundleDescriptor) -> Unit): ArrayHolder<WGPURenderBundleDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPURenderBundleDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPURenderBundleEncoderDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var colorFormatCount: ULong
			get() = handle.colorFormatCount.toULong()
			set(newValue) { handle.colorFormatCount = newValue.toLong() }

		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.colorFormats?.let(::ArrayHolder)
			set(newValue) { handle.colorFormats = newValue?.handler }

		override var depthStencilFormat: WGPUTextureFormat
			get() = handle.depthStencilFormat.toUInt()
			set(newValue) { handle.depthStencilFormat = newValue.toInt() }

		override var sampleCount: UInt
			get() = handle.sampleCount.toUInt()
			set(newValue) { handle.sampleCount = newValue.toInt() }

		override var depthReadOnly: Boolean
			get() = handle.depthReadOnly.toBoolean()
			set(newValue) { handle.depthReadOnly = newValue.toInt() }

		override var stencilReadOnly: Boolean
			get() = handle.stencilReadOnly.toBoolean()
			set(newValue) { handle.stencilReadOnly = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var colorFormatCount: ULong
			get() = handle.colorFormatCount.toULong()
			set(newValue) { handle.colorFormatCount = newValue.toLong() }

		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.colorFormats?.let(::ArrayHolder)
			set(newValue) { handle.colorFormats = newValue?.handler }

		override var depthStencilFormat: WGPUTextureFormat
			get() = handle.depthStencilFormat.toUInt()
			set(newValue) { handle.depthStencilFormat = newValue.toInt() }

		override var sampleCount: UInt
			get() = handle.sampleCount.toUInt()
			set(newValue) { handle.sampleCount = newValue.toInt() }

		override var depthReadOnly: Boolean
			get() = handle.depthReadOnly.toBoolean()
			set(newValue) { handle.depthReadOnly = newValue.toInt() }

		override var stencilReadOnly: Boolean
			get() = handle.stencilReadOnly.toBoolean()
			set(newValue) { handle.stencilReadOnly = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleEncoderDescriptor {
			return WGPURenderBundleEncoderDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderBundleEncoderDescriptor) -> Unit): ArrayHolder<WGPURenderBundleEncoderDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPURenderBundleEncoderDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPURenderPassColorAttachment {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByReference(com.sun.jna.Pointer.NULL)) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var view: WGPUTextureView?
			get() = handle.view?.let{ WGPUTextureView(it) }
			set(newValue) { handle.view = newValue?.handler }

		override var depthSlice: UInt
			get() = handle.depthSlice.toUInt()
			set(newValue) { handle.depthSlice = newValue.toInt() }

		override var resolveTarget: WGPUTextureView?
			get() = handle.resolveTarget?.let{ WGPUTextureView(it) }
			set(newValue) { handle.resolveTarget = newValue?.handler }

		override var loadOp: WGPULoadOp
			get() = handle.loadOp.toUInt()
			set(newValue) { handle.loadOp = newValue.toInt() }

		override var storeOp: WGPUStoreOp
			get() = handle.storeOp.toUInt()
			set(newValue) { handle.storeOp = newValue.toInt() }

		override val clearValue: WGPUColor
			get() = handle.clearValue.let{ WGPUColor.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue(com.sun.jna.Pointer.NULL)) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var view: WGPUTextureView?
			get() = handle.view?.let{ WGPUTextureView(it) }
			set(newValue) { handle.view = newValue?.handler }

		override var depthSlice: UInt
			get() = handle.depthSlice.toUInt()
			set(newValue) { handle.depthSlice = newValue.toInt() }

		override var resolveTarget: WGPUTextureView?
			get() = handle.resolveTarget?.let{ WGPUTextureView(it) }
			set(newValue) { handle.resolveTarget = newValue?.handler }

		override var loadOp: WGPULoadOp
			get() = handle.loadOp.toUInt()
			set(newValue) { handle.loadOp = newValue.toInt() }

		override var storeOp: WGPUStoreOp
			get() = handle.storeOp.toUInt()
			set(newValue) { handle.storeOp = newValue.toInt() }

		override val clearValue: WGPUColor
			get() = handle.clearValue.let{ WGPUColor.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassColorAttachment {
			return WGPURenderPassColorAttachment.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassColorAttachment) -> Unit): ArrayHolder<WGPURenderPassColorAttachment> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassColorAttachment.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPURenderPassDepthStencilAttachment {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByReference(com.sun.jna.Pointer.NULL)) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = handle.view?.let{ WGPUTextureView(it) }
			set(newValue) { handle.view = newValue?.handler }

		override var depthLoadOp: WGPULoadOp
			get() = handle.depthLoadOp.toUInt()
			set(newValue) { handle.depthLoadOp = newValue.toInt() }

		override var depthStoreOp: WGPUStoreOp
			get() = handle.depthStoreOp.toUInt()
			set(newValue) { handle.depthStoreOp = newValue.toInt() }

		override var depthClearValue: Float
			get() = handle.depthClearValue
			set(newValue) { handle.depthClearValue = newValue }

		override var depthReadOnly: Boolean
			get() = handle.depthReadOnly.toBoolean()
			set(newValue) { handle.depthReadOnly = newValue.toInt() }

		override var stencilLoadOp: WGPULoadOp
			get() = handle.stencilLoadOp.toUInt()
			set(newValue) { handle.stencilLoadOp = newValue.toInt() }

		override var stencilStoreOp: WGPUStoreOp
			get() = handle.stencilStoreOp.toUInt()
			set(newValue) { handle.stencilStoreOp = newValue.toInt() }

		override var stencilClearValue: UInt
			get() = handle.stencilClearValue.toUInt()
			set(newValue) { handle.stencilClearValue = newValue.toInt() }

		override var stencilReadOnly: Boolean
			get() = handle.stencilReadOnly.toBoolean()
			set(newValue) { handle.stencilReadOnly = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue(com.sun.jna.Pointer.NULL)) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = handle.view?.let{ WGPUTextureView(it) }
			set(newValue) { handle.view = newValue?.handler }

		override var depthLoadOp: WGPULoadOp
			get() = handle.depthLoadOp.toUInt()
			set(newValue) { handle.depthLoadOp = newValue.toInt() }

		override var depthStoreOp: WGPUStoreOp
			get() = handle.depthStoreOp.toUInt()
			set(newValue) { handle.depthStoreOp = newValue.toInt() }

		override var depthClearValue: Float
			get() = handle.depthClearValue
			set(newValue) { handle.depthClearValue = newValue }

		override var depthReadOnly: Boolean
			get() = handle.depthReadOnly.toBoolean()
			set(newValue) { handle.depthReadOnly = newValue.toInt() }

		override var stencilLoadOp: WGPULoadOp
			get() = handle.stencilLoadOp.toUInt()
			set(newValue) { handle.stencilLoadOp = newValue.toInt() }

		override var stencilStoreOp: WGPUStoreOp
			get() = handle.stencilStoreOp.toUInt()
			set(newValue) { handle.stencilStoreOp = newValue.toInt() }

		override var stencilClearValue: UInt
			get() = handle.stencilClearValue.toUInt()
			set(newValue) { handle.stencilClearValue = newValue.toInt() }

		override var stencilReadOnly: Boolean
			get() = handle.stencilReadOnly.toBoolean()
			set(newValue) { handle.stencilReadOnly = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDepthStencilAttachment {
			return WGPURenderPassDepthStencilAttachment.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassDepthStencilAttachment) -> Unit): ArrayHolder<WGPURenderPassDepthStencilAttachment> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassDepthStencilAttachment.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPURenderPassDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var colorAttachmentCount: ULong
			get() = handle.colorAttachmentCount.toULong()
			set(newValue) { handle.colorAttachmentCount = newValue.toLong() }

		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = handle.colorAttachments?.let(::ArrayHolder)
			set(newValue) { handle.colorAttachments = newValue?.handler }

		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = handle.depthStencilAttachment?.let{ WGPURenderPassDepthStencilAttachment.ByReference(it) }
			set(newValue) { handle.depthStencilAttachment = (newValue as? WGPURenderPassDepthStencilAttachment.ByReference)?.handle }

		override var occlusionQuerySet: WGPUQuerySet?
			get() = handle.occlusionQuerySet?.let{ WGPUQuerySet(it) }
			set(newValue) { handle.occlusionQuerySet = newValue?.handler }

		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = handle.timestampWrites?.let{ WGPURenderPassTimestampWrites.ByReference(it) }
			set(newValue) { handle.timestampWrites = (newValue as? WGPURenderPassTimestampWrites.ByReference)?.handle }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var colorAttachmentCount: ULong
			get() = handle.colorAttachmentCount.toULong()
			set(newValue) { handle.colorAttachmentCount = newValue.toLong() }

		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = handle.colorAttachments?.let(::ArrayHolder)
			set(newValue) { handle.colorAttachments = newValue?.handler }

		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = handle.depthStencilAttachment?.let{ WGPURenderPassDepthStencilAttachment.ByReference(it) }
			set(newValue) { handle.depthStencilAttachment = (newValue as? WGPURenderPassDepthStencilAttachment.ByReference)?.handle }

		override var occlusionQuerySet: WGPUQuerySet?
			get() = handle.occlusionQuerySet?.let{ WGPUQuerySet(it) }
			set(newValue) { handle.occlusionQuerySet = newValue?.handler }

		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = handle.timestampWrites?.let{ WGPURenderPassTimestampWrites.ByReference(it) }
			set(newValue) { handle.timestampWrites = (newValue as? WGPURenderPassTimestampWrites.ByReference)?.handle }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptor {
			return WGPURenderPassDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassDescriptor) -> Unit): ArrayHolder<WGPURenderPassDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUChainedStruct {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference(com.sun.jna.Pointer.NULL)) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = handle.next?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) { handle.next = (newValue as? WGPUChainedStruct.ByReference)?.handle }

		override var sType: WGPUSType
			get() = handle.sType.toUInt()
			set(newValue) { handle.sType = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue(com.sun.jna.Pointer.NULL)) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = handle.next?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) { handle.next = (newValue as? WGPUChainedStruct.ByReference)?.handle }

		override var sType: WGPUSType
			get() = handle.sType.toUInt()
			set(newValue) { handle.sType = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var next: WGPUChainedStruct?
	actual var sType: WGPUSType
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUChainedStruct {
			return io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUChainedStruct {
			return WGPUChainedStruct.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUChainedStruct) -> Unit): ArrayHolder<WGPUChainedStruct> {
			val array = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue)
					.also { provider(index.toUInt(), WGPUChainedStruct.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPURenderPassDescriptorMaxDrawCount {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURenderPassDescriptorMaxDrawCount.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassDescriptorMaxDrawCount.ByReference(com.sun.jna.Pointer.NULL)) : WGPURenderPassDescriptorMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var maxDrawCount: ULong
			get() = handle.maxDrawCount.toULong()
			set(newValue) { handle.maxDrawCount = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURenderPassDescriptorMaxDrawCount.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassDescriptorMaxDrawCount.ByValue(com.sun.jna.Pointer.NULL)) : WGPURenderPassDescriptorMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var maxDrawCount: ULong
			get() = handle.maxDrawCount.toULong()
			set(newValue) { handle.maxDrawCount = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassDescriptorMaxDrawCount.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var maxDrawCount: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassDescriptorMaxDrawCount {
			return io.ygdrasil.wgpu.android.WGPURenderPassDescriptorMaxDrawCount.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptorMaxDrawCount {
			return WGPURenderPassDescriptorMaxDrawCount.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassDescriptorMaxDrawCount) -> Unit): ArrayHolder<WGPURenderPassDescriptorMaxDrawCount> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassDescriptorMaxDrawCount.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassDescriptorMaxDrawCount.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassDescriptorMaxDrawCount.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPURenderPassTimestampWrites {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByReference(com.sun.jna.Pointer.NULL)) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.querySet?.let{ WGPUQuerySet(it) }
			set(newValue) { handle.querySet = newValue?.handler }

		override var beginningOfPassWriteIndex: UInt
			get() = handle.beginningOfPassWriteIndex.toUInt()
			set(newValue) { handle.beginningOfPassWriteIndex = newValue.toInt() }

		override var endOfPassWriteIndex: UInt
			get() = handle.endOfPassWriteIndex.toUInt()
			set(newValue) { handle.endOfPassWriteIndex = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue(com.sun.jna.Pointer.NULL)) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.querySet?.let{ WGPUQuerySet(it) }
			set(newValue) { handle.querySet = newValue?.handler }

		override var beginningOfPassWriteIndex: UInt
			get() = handle.beginningOfPassWriteIndex.toUInt()
			set(newValue) { handle.beginningOfPassWriteIndex = newValue.toInt() }

		override var endOfPassWriteIndex: UInt
			get() = handle.endOfPassWriteIndex.toUInt()
			set(newValue) { handle.endOfPassWriteIndex = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var querySet: WGPUQuerySet?
	actual var beginningOfPassWriteIndex: UInt
	actual var endOfPassWriteIndex: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassTimestampWrites {
			return io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassTimestampWrites {
			return WGPURenderPassTimestampWrites.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassTimestampWrites) -> Unit): ArrayHolder<WGPURenderPassTimestampWrites> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassTimestampWrites.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUVertexState {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUVertexState.ByReference = io.ygdrasil.wgpu.android.WGPUVertexState.ByReference(com.sun.jna.Pointer.NULL)) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) { handle.module = newValue?.handler }

		override var entryPoint: CString?
			get() = handle.entryPoint?.let(::CString)
			set(newValue) { handle.entryPoint = newValue?.handler }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) { handle.constantCount = newValue.toLong() }

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) { handle.constants = newValue?.handler }

		override var bufferCount: ULong
			get() = handle.bufferCount.toULong()
			set(newValue) { handle.bufferCount = newValue.toLong() }

		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = handle.buffers?.let(::ArrayHolder)
			set(newValue) { handle.buffers = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUVertexState.ByValue = io.ygdrasil.wgpu.android.WGPUVertexState.ByValue(com.sun.jna.Pointer.NULL)) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) { handle.module = newValue?.handler }

		override var entryPoint: CString?
			get() = handle.entryPoint?.let(::CString)
			set(newValue) { handle.entryPoint = newValue?.handler }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) { handle.constantCount = newValue.toLong() }

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) { handle.constants = newValue?.handler }

		override var bufferCount: ULong
			get() = handle.bufferCount.toULong()
			set(newValue) { handle.bufferCount = newValue.toLong() }

		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = handle.buffers?.let(::ArrayHolder)
			set(newValue) { handle.buffers = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUVertexState.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUVertexState.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUVertexState {
			return WGPUVertexState.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUVertexState) -> Unit): ArrayHolder<WGPUVertexState> {
			val array = io.ygdrasil.wgpu.android.WGPUVertexState.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUVertexState.ByValue)
					.also { provider(index.toUInt(), WGPUVertexState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUPrimitiveState {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByReference = io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByReference(com.sun.jna.Pointer.NULL)) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var topology: WGPUPrimitiveTopology
			get() = handle.topology.toUInt()
			set(newValue) { handle.topology = newValue.toInt() }

		override var stripIndexFormat: WGPUIndexFormat
			get() = handle.stripIndexFormat.toUInt()
			set(newValue) { handle.stripIndexFormat = newValue.toInt() }

		override var frontFace: WGPUFrontFace
			get() = handle.frontFace.toUInt()
			set(newValue) { handle.frontFace = newValue.toInt() }

		override var cullMode: WGPUCullMode
			get() = handle.cullMode.toUInt()
			set(newValue) { handle.cullMode = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue = io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue(com.sun.jna.Pointer.NULL)) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var topology: WGPUPrimitiveTopology
			get() = handle.topology.toUInt()
			set(newValue) { handle.topology = newValue.toInt() }

		override var stripIndexFormat: WGPUIndexFormat
			get() = handle.stripIndexFormat.toUInt()
			set(newValue) { handle.stripIndexFormat = newValue.toInt() }

		override var frontFace: WGPUFrontFace
			get() = handle.frontFace.toUInt()
			set(newValue) { handle.frontFace = newValue.toInt() }

		override var cullMode: WGPUCullMode
			get() = handle.cullMode.toUInt()
			set(newValue) { handle.cullMode = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var topology: WGPUPrimitiveTopology
	actual var stripIndexFormat: WGPUIndexFormat
	actual var frontFace: WGPUFrontFace
	actual var cullMode: WGPUCullMode
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPrimitiveState {
			return io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPrimitiveState {
			return WGPUPrimitiveState.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPrimitiveState) -> Unit): ArrayHolder<WGPUPrimitiveState> {
			val array = io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue)
					.also { provider(index.toUInt(), WGPUPrimitiveState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUPrimitiveDepthClipControl {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUPrimitiveDepthClipControl.ByReference = io.ygdrasil.wgpu.android.WGPUPrimitiveDepthClipControl.ByReference(com.sun.jna.Pointer.NULL)) : WGPUPrimitiveDepthClipControl {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var unclippedDepth: Boolean
			get() = handle.unclippedDepth.toBoolean()
			set(newValue) { handle.unclippedDepth = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUPrimitiveDepthClipControl.ByValue = io.ygdrasil.wgpu.android.WGPUPrimitiveDepthClipControl.ByValue(com.sun.jna.Pointer.NULL)) : WGPUPrimitiveDepthClipControl {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var unclippedDepth: Boolean
			get() = handle.unclippedDepth.toBoolean()
			set(newValue) { handle.unclippedDepth = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUPrimitiveDepthClipControl.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var unclippedDepth: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPrimitiveDepthClipControl {
			return io.ygdrasil.wgpu.android.WGPUPrimitiveDepthClipControl.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPrimitiveDepthClipControl {
			return WGPUPrimitiveDepthClipControl.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPrimitiveDepthClipControl) -> Unit): ArrayHolder<WGPUPrimitiveDepthClipControl> {
			val array = io.ygdrasil.wgpu.android.WGPUPrimitiveDepthClipControl.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUPrimitiveDepthClipControl.ByValue)
					.also { provider(index.toUInt(), WGPUPrimitiveDepthClipControl.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUStencilFaceState {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByReference = io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByReference(com.sun.jna.Pointer.NULL)) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = handle.compare.toUInt()
			set(newValue) { handle.compare = newValue.toInt() }

		override var failOp: WGPUStencilOperation
			get() = handle.failOp.toUInt()
			set(newValue) { handle.failOp = newValue.toInt() }

		override var depthFailOp: WGPUStencilOperation
			get() = handle.depthFailOp.toUInt()
			set(newValue) { handle.depthFailOp = newValue.toInt() }

		override var passOp: WGPUStencilOperation
			get() = handle.passOp.toUInt()
			set(newValue) { handle.passOp = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue = io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue(com.sun.jna.Pointer.NULL)) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = handle.compare.toUInt()
			set(newValue) { handle.compare = newValue.toInt() }

		override var failOp: WGPUStencilOperation
			get() = handle.failOp.toUInt()
			set(newValue) { handle.failOp = newValue.toInt() }

		override var depthFailOp: WGPUStencilOperation
			get() = handle.depthFailOp.toUInt()
			set(newValue) { handle.depthFailOp = newValue.toInt() }

		override var passOp: WGPUStencilOperation
			get() = handle.passOp.toUInt()
			set(newValue) { handle.passOp = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var compare: WGPUCompareFunction
	actual var failOp: WGPUStencilOperation
	actual var depthFailOp: WGPUStencilOperation
	actual var passOp: WGPUStencilOperation
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUStencilFaceState {
			return io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUStencilFaceState {
			return WGPUStencilFaceState.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUStencilFaceState) -> Unit): ArrayHolder<WGPUStencilFaceState> {
			val array = io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue)
					.also { provider(index.toUInt(), WGPUStencilFaceState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUDepthStencilState {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByReference = io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByReference(com.sun.jna.Pointer.NULL)) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var depthWriteEnabled: Boolean
			get() = handle.depthWriteEnabled.toBoolean()
			set(newValue) { handle.depthWriteEnabled = newValue.toInt() }

		override var depthCompare: WGPUCompareFunction
			get() = handle.depthCompare.toUInt()
			set(newValue) { handle.depthCompare = newValue.toInt() }

		override val stencilFront: WGPUStencilFaceState
			get() = handle.stencilFront.let{ WGPUStencilFaceState.ByValue(it) }

		override val stencilBack: WGPUStencilFaceState
			get() = handle.stencilBack.let{ WGPUStencilFaceState.ByValue(it) }

		override var stencilReadMask: UInt
			get() = handle.stencilReadMask.toUInt()
			set(newValue) { handle.stencilReadMask = newValue.toInt() }

		override var stencilWriteMask: UInt
			get() = handle.stencilWriteMask.toUInt()
			set(newValue) { handle.stencilWriteMask = newValue.toInt() }

		override var depthBias: Int
			get() = handle.depthBias
			set(newValue) { handle.depthBias = newValue }

		override var depthBiasSlopeScale: Float
			get() = handle.depthBiasSlopeScale
			set(newValue) { handle.depthBiasSlopeScale = newValue }

		override var depthBiasClamp: Float
			get() = handle.depthBiasClamp
			set(newValue) { handle.depthBiasClamp = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue = io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue(com.sun.jna.Pointer.NULL)) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var depthWriteEnabled: Boolean
			get() = handle.depthWriteEnabled.toBoolean()
			set(newValue) { handle.depthWriteEnabled = newValue.toInt() }

		override var depthCompare: WGPUCompareFunction
			get() = handle.depthCompare.toUInt()
			set(newValue) { handle.depthCompare = newValue.toInt() }

		override val stencilFront: WGPUStencilFaceState
			get() = handle.stencilFront.let{ WGPUStencilFaceState.ByValue(it) }

		override val stencilBack: WGPUStencilFaceState
			get() = handle.stencilBack.let{ WGPUStencilFaceState.ByValue(it) }

		override var stencilReadMask: UInt
			get() = handle.stencilReadMask.toUInt()
			set(newValue) { handle.stencilReadMask = newValue.toInt() }

		override var stencilWriteMask: UInt
			get() = handle.stencilWriteMask.toUInt()
			set(newValue) { handle.stencilWriteMask = newValue.toInt() }

		override var depthBias: Int
			get() = handle.depthBias
			set(newValue) { handle.depthBias = newValue }

		override var depthBiasSlopeScale: Float
			get() = handle.depthBiasSlopeScale
			set(newValue) { handle.depthBiasSlopeScale = newValue }

		override var depthBiasClamp: Float
			get() = handle.depthBiasClamp
			set(newValue) { handle.depthBiasClamp = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUDepthStencilState {
			return WGPUDepthStencilState.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUDepthStencilState) -> Unit): ArrayHolder<WGPUDepthStencilState> {
			val array = io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue)
					.also { provider(index.toUInt(), WGPUDepthStencilState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUMultisampleState {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUMultisampleState.ByReference = io.ygdrasil.wgpu.android.WGPUMultisampleState.ByReference(com.sun.jna.Pointer.NULL)) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var count: UInt
			get() = handle.count.toUInt()
			set(newValue) { handle.count = newValue.toInt() }

		override var mask: UInt
			get() = handle.mask.toUInt()
			set(newValue) { handle.mask = newValue.toInt() }

		override var alphaToCoverageEnabled: Boolean
			get() = handle.alphaToCoverageEnabled.toBoolean()
			set(newValue) { handle.alphaToCoverageEnabled = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue = io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue(com.sun.jna.Pointer.NULL)) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var count: UInt
			get() = handle.count.toUInt()
			set(newValue) { handle.count = newValue.toInt() }

		override var mask: UInt
			get() = handle.mask.toUInt()
			set(newValue) { handle.mask = newValue.toInt() }

		override var alphaToCoverageEnabled: Boolean
			get() = handle.alphaToCoverageEnabled.toBoolean()
			set(newValue) { handle.alphaToCoverageEnabled = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var count: UInt
	actual var mask: UInt
	actual var alphaToCoverageEnabled: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUMultisampleState {
			return io.ygdrasil.wgpu.android.WGPUMultisampleState.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUMultisampleState {
			return WGPUMultisampleState.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUMultisampleState) -> Unit): ArrayHolder<WGPUMultisampleState> {
			val array = io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue)
					.also { provider(index.toUInt(), WGPUMultisampleState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUFragmentState {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUFragmentState.ByReference = io.ygdrasil.wgpu.android.WGPUFragmentState.ByReference(com.sun.jna.Pointer.NULL)) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) { handle.module = newValue?.handler }

		override var entryPoint: CString?
			get() = handle.entryPoint?.let(::CString)
			set(newValue) { handle.entryPoint = newValue?.handler }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) { handle.constantCount = newValue.toLong() }

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) { handle.constants = newValue?.handler }

		override var targetCount: ULong
			get() = handle.targetCount.toULong()
			set(newValue) { handle.targetCount = newValue.toLong() }

		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = handle.targets?.let(::ArrayHolder)
			set(newValue) { handle.targets = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue = io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue(com.sun.jna.Pointer.NULL)) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) { handle.module = newValue?.handler }

		override var entryPoint: CString?
			get() = handle.entryPoint?.let(::CString)
			set(newValue) { handle.entryPoint = newValue?.handler }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) { handle.constantCount = newValue.toLong() }

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) { handle.constants = newValue?.handler }

		override var targetCount: ULong
			get() = handle.targetCount.toULong()
			set(newValue) { handle.targetCount = newValue.toLong() }

		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = handle.targets?.let(::ArrayHolder)
			set(newValue) { handle.targets = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUFragmentState.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUFragmentState {
			return WGPUFragmentState.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUFragmentState) -> Unit): ArrayHolder<WGPUFragmentState> {
			val array = io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue)
					.also { provider(index.toUInt(), WGPUFragmentState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUColorTargetState {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUColorTargetState.ByReference = io.ygdrasil.wgpu.android.WGPUColorTargetState.ByReference(com.sun.jna.Pointer.NULL)) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var blend: WGPUBlendState?
			get() = handle.blend?.let{ WGPUBlendState.ByReference(it) }
			set(newValue) { handle.blend = (newValue as? WGPUBlendState.ByReference)?.handle }

		override var writeMask: UInt
			get() = handle.writeMask.toUInt()
			set(newValue) { handle.writeMask = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue = io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue(com.sun.jna.Pointer.NULL)) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var blend: WGPUBlendState?
			get() = handle.blend?.let{ WGPUBlendState.ByReference(it) }
			set(newValue) { handle.blend = (newValue as? WGPUBlendState.ByReference)?.handle }

		override var writeMask: UInt
			get() = handle.writeMask.toUInt()
			set(newValue) { handle.writeMask = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var format: WGPUTextureFormat
	actual var blend: WGPUBlendState?
	actual var writeMask: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUColorTargetState {
			return io.ygdrasil.wgpu.android.WGPUColorTargetState.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUColorTargetState {
			return WGPUColorTargetState.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUColorTargetState) -> Unit): ArrayHolder<WGPUColorTargetState> {
			val array = io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue)
					.also { provider(index.toUInt(), WGPUColorTargetState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUBlendState {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUBlendState.ByReference = io.ygdrasil.wgpu.android.WGPUBlendState.ByReference(com.sun.jna.Pointer.NULL)) : WGPUBlendState {
		override val color: WGPUBlendComponent
			get() = handle.color.let{ WGPUBlendComponent.ByValue(it) }

		override val alpha: WGPUBlendComponent
			get() = handle.alpha.let{ WGPUBlendComponent.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUBlendState.ByValue = io.ygdrasil.wgpu.android.WGPUBlendState.ByValue(com.sun.jna.Pointer.NULL)) : WGPUBlendState {
		override val color: WGPUBlendComponent
			get() = handle.color.let{ WGPUBlendComponent.ByValue(it) }

		override val alpha: WGPUBlendComponent
			get() = handle.alpha.let{ WGPUBlendComponent.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBlendState.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val color: WGPUBlendComponent
	actual val alpha: WGPUBlendComponent
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBlendState {
			return io.ygdrasil.wgpu.android.WGPUBlendState.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBlendState {
			return WGPUBlendState.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBlendState) -> Unit): ArrayHolder<WGPUBlendState> {
			val array = io.ygdrasil.wgpu.android.WGPUBlendState.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBlendState.ByValue)
					.also { provider(index.toUInt(), WGPUBlendState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPURenderPipelineDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) { handle.layout = newValue?.handler }

		override val vertex: WGPUVertexState
			get() = handle.vertex.let{ WGPUVertexState.ByValue(it) }

		override val primitive: WGPUPrimitiveState
			get() = handle.primitive.let{ WGPUPrimitiveState.ByValue(it) }

		override var depthStencil: WGPUDepthStencilState?
			get() = handle.depthStencil?.let{ WGPUDepthStencilState.ByReference(it) }
			set(newValue) { handle.depthStencil = (newValue as? WGPUDepthStencilState.ByReference)?.handle }

		override val multisample: WGPUMultisampleState
			get() = handle.multisample.let{ WGPUMultisampleState.ByValue(it) }

		override var fragment: WGPUFragmentState?
			get() = handle.fragment?.let{ WGPUFragmentState.ByReference(it) }
			set(newValue) { handle.fragment = (newValue as? WGPUFragmentState.ByReference)?.handle }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) { handle.layout = newValue?.handler }

		override val vertex: WGPUVertexState
			get() = handle.vertex.let{ WGPUVertexState.ByValue(it) }

		override val primitive: WGPUPrimitiveState
			get() = handle.primitive.let{ WGPUPrimitiveState.ByValue(it) }

		override var depthStencil: WGPUDepthStencilState?
			get() = handle.depthStencil?.let{ WGPUDepthStencilState.ByReference(it) }
			set(newValue) { handle.depthStencil = (newValue as? WGPUDepthStencilState.ByReference)?.handle }

		override val multisample: WGPUMultisampleState
			get() = handle.multisample.let{ WGPUMultisampleState.ByValue(it) }

		override var fragment: WGPUFragmentState?
			get() = handle.fragment?.let{ WGPUFragmentState.ByReference(it) }
			set(newValue) { handle.fragment = (newValue as? WGPUFragmentState.ByReference)?.handle }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPipelineDescriptor {
			return WGPURenderPipelineDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPipelineDescriptor) -> Unit): ArrayHolder<WGPURenderPipelineDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPURenderPipelineDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSamplerDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var addressModeU: WGPUAddressMode
			get() = handle.addressModeU.toUInt()
			set(newValue) { handle.addressModeU = newValue.toInt() }

		override var addressModeV: WGPUAddressMode
			get() = handle.addressModeV.toUInt()
			set(newValue) { handle.addressModeV = newValue.toInt() }

		override var addressModeW: WGPUAddressMode
			get() = handle.addressModeW.toUInt()
			set(newValue) { handle.addressModeW = newValue.toInt() }

		override var magFilter: WGPUFilterMode
			get() = handle.magFilter.toUInt()
			set(newValue) { handle.magFilter = newValue.toInt() }

		override var minFilter: WGPUFilterMode
			get() = handle.minFilter.toUInt()
			set(newValue) { handle.minFilter = newValue.toInt() }

		override var mipmapFilter: WGPUMipmapFilterMode
			get() = handle.mipmapFilter.toUInt()
			set(newValue) { handle.mipmapFilter = newValue.toInt() }

		override var lodMinClamp: Float
			get() = handle.lodMinClamp
			set(newValue) { handle.lodMinClamp = newValue }

		override var lodMaxClamp: Float
			get() = handle.lodMaxClamp
			set(newValue) { handle.lodMaxClamp = newValue }

		override var compare: WGPUCompareFunction
			get() = handle.compare.toUInt()
			set(newValue) { handle.compare = newValue.toInt() }

		override var maxAnisotropy: UShort
			get() = handle.maxAnisotropy.toUShort()
			set(newValue) { handle.maxAnisotropy = newValue.toShort() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var addressModeU: WGPUAddressMode
			get() = handle.addressModeU.toUInt()
			set(newValue) { handle.addressModeU = newValue.toInt() }

		override var addressModeV: WGPUAddressMode
			get() = handle.addressModeV.toUInt()
			set(newValue) { handle.addressModeV = newValue.toInt() }

		override var addressModeW: WGPUAddressMode
			get() = handle.addressModeW.toUInt()
			set(newValue) { handle.addressModeW = newValue.toInt() }

		override var magFilter: WGPUFilterMode
			get() = handle.magFilter.toUInt()
			set(newValue) { handle.magFilter = newValue.toInt() }

		override var minFilter: WGPUFilterMode
			get() = handle.minFilter.toUInt()
			set(newValue) { handle.minFilter = newValue.toInt() }

		override var mipmapFilter: WGPUMipmapFilterMode
			get() = handle.mipmapFilter.toUInt()
			set(newValue) { handle.mipmapFilter = newValue.toInt() }

		override var lodMinClamp: Float
			get() = handle.lodMinClamp
			set(newValue) { handle.lodMinClamp = newValue }

		override var lodMaxClamp: Float
			get() = handle.lodMaxClamp
			set(newValue) { handle.lodMaxClamp = newValue }

		override var compare: WGPUCompareFunction
			get() = handle.compare.toUInt()
			set(newValue) { handle.compare = newValue.toInt() }

		override var maxAnisotropy: UShort
			get() = handle.maxAnisotropy.toUShort()
			set(newValue) { handle.maxAnisotropy = newValue.toShort() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSamplerDescriptor {
			return WGPUSamplerDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSamplerDescriptor) -> Unit): ArrayHolder<WGPUSamplerDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUSamplerDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUShaderModuleDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var hintCount: ULong
			get() = handle.hintCount.toULong()
			set(newValue) { handle.hintCount = newValue.toLong() }

		override var hints: ArrayHolder<WGPUShaderModuleCompilationHint>?
			get() = handle.hints?.let(::ArrayHolder)
			set(newValue) { handle.hints = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var hintCount: ULong
			get() = handle.hintCount.toULong()
			set(newValue) { handle.hintCount = newValue.toLong() }

		override var hints: ArrayHolder<WGPUShaderModuleCompilationHint>?
			get() = handle.hints?.let(::ArrayHolder)
			set(newValue) { handle.hints = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var hintCount: ULong
	actual var hints: ArrayHolder<WGPUShaderModuleCompilationHint>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleDescriptor {
			return io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleDescriptor {
			return WGPUShaderModuleDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUShaderModuleDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUShaderModuleCompilationHint {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUShaderModuleCompilationHint.ByReference = io.ygdrasil.wgpu.android.WGPUShaderModuleCompilationHint.ByReference(com.sun.jna.Pointer.NULL)) : WGPUShaderModuleCompilationHint {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var entryPoint: CString?
			get() = handle.entryPoint?.let(::CString)
			set(newValue) { handle.entryPoint = newValue?.handler }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) { handle.layout = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUShaderModuleCompilationHint.ByValue = io.ygdrasil.wgpu.android.WGPUShaderModuleCompilationHint.ByValue(com.sun.jna.Pointer.NULL)) : WGPUShaderModuleCompilationHint {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var entryPoint: CString?
			get() = handle.entryPoint?.let(::CString)
			set(newValue) { handle.entryPoint = newValue?.handler }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) { handle.layout = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUShaderModuleCompilationHint.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var entryPoint: CString?
	actual var layout: WGPUPipelineLayout?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleCompilationHint {
			return io.ygdrasil.wgpu.android.WGPUShaderModuleCompilationHint.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleCompilationHint {
			return WGPUShaderModuleCompilationHint.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleCompilationHint) -> Unit): ArrayHolder<WGPUShaderModuleCompilationHint> {
			val array = io.ygdrasil.wgpu.android.WGPUShaderModuleCompilationHint.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUShaderModuleCompilationHint.ByValue)
					.also { provider(index.toUInt(), WGPUShaderModuleCompilationHint.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUShaderModuleSPIRVDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUShaderModuleSPIRVDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUShaderModuleSPIRVDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUShaderModuleSPIRVDescriptor {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var codeSize: UInt
			get() = handle.codeSize.toUInt()
			set(newValue) { handle.codeSize = newValue.toInt() }

		override var code: NativeAddress?
			get() = handle.code
			set(newValue) { handle.code = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUShaderModuleSPIRVDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUShaderModuleSPIRVDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUShaderModuleSPIRVDescriptor {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var codeSize: UInt
			get() = handle.codeSize.toUInt()
			set(newValue) { handle.codeSize = newValue.toInt() }

		override var code: NativeAddress?
			get() = handle.code
			set(newValue) { handle.code = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUShaderModuleSPIRVDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var codeSize: UInt
	actual var code: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleSPIRVDescriptor {
			return io.ygdrasil.wgpu.android.WGPUShaderModuleSPIRVDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleSPIRVDescriptor {
			return WGPUShaderModuleSPIRVDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleSPIRVDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleSPIRVDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUShaderModuleSPIRVDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUShaderModuleSPIRVDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUShaderModuleSPIRVDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUShaderModuleWGSLDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUShaderModuleWGSLDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUShaderModuleWGSLDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUShaderModuleWGSLDescriptor {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var code: CString?
			get() = handle.code?.let(::CString)
			set(newValue) { handle.code = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUShaderModuleWGSLDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUShaderModuleWGSLDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUShaderModuleWGSLDescriptor {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var code: CString?
			get() = handle.code?.let(::CString)
			set(newValue) { handle.code = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUShaderModuleWGSLDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var code: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleWGSLDescriptor {
			return io.ygdrasil.wgpu.android.WGPUShaderModuleWGSLDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleWGSLDescriptor {
			return WGPUShaderModuleWGSLDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleWGSLDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleWGSLDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUShaderModuleWGSLDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUShaderModuleWGSLDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUShaderModuleWGSLDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptor {
			return io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptor {
			return WGPUSurfaceDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptor) -> Unit): ArrayHolder<WGPUSurfaceDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceDescriptorFromAndroidNativeWindow {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromAndroidNativeWindow.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromAndroidNativeWindow.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var window: NativeAddress?
			get() = handle.window
			set(newValue) { handle.window = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromAndroidNativeWindow.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromAndroidNativeWindow.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var window: NativeAddress?
			get() = handle.window
			set(newValue) { handle.window = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromAndroidNativeWindow.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var window: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromAndroidNativeWindow {
			return io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromAndroidNativeWindow.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromAndroidNativeWindow {
			return WGPUSurfaceDescriptorFromAndroidNativeWindow.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromAndroidNativeWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromAndroidNativeWindow> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromAndroidNativeWindow.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromAndroidNativeWindow.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceDescriptorFromAndroidNativeWindow.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceDescriptorFromCanvasHTMLSelector {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromCanvasHTMLSelector {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var selector: CString?
			get() = handle.selector?.let(::CString)
			set(newValue) { handle.selector = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromCanvasHTMLSelector {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var selector: CString?
			get() = handle.selector?.let(::CString)
			set(newValue) { handle.selector = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var selector: CString?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromCanvasHTMLSelector {
			return io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromCanvasHTMLSelector {
			return WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromCanvasHTMLSelector) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromCanvasHTMLSelector> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceDescriptorFromCanvasHTMLSelector.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceDescriptorFromMetalLayer {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromMetalLayer.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromMetalLayer.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var layer: NativeAddress?
			get() = handle.layer
			set(newValue) { handle.layer = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromMetalLayer.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromMetalLayer.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var layer: NativeAddress?
			get() = handle.layer
			set(newValue) { handle.layer = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromMetalLayer.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var layer: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromMetalLayer {
			return io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromMetalLayer.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromMetalLayer {
			return WGPUSurfaceDescriptorFromMetalLayer.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromMetalLayer) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromMetalLayer> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromMetalLayer.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromMetalLayer.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceDescriptorFromMetalLayer.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceDescriptorFromWindowsHWND {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWindowsHWND.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWindowsHWND.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var hinstance: NativeAddress?
			get() = handle.hinstance
			set(newValue) { handle.hinstance = newValue }

		override var hwnd: NativeAddress?
			get() = handle.hwnd
			set(newValue) { handle.hwnd = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWindowsHWND.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWindowsHWND.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var hinstance: NativeAddress?
			get() = handle.hinstance
			set(newValue) { handle.hinstance = newValue }

		override var hwnd: NativeAddress?
			get() = handle.hwnd
			set(newValue) { handle.hwnd = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWindowsHWND.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var hinstance: NativeAddress?
	actual var hwnd: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromWindowsHWND {
			return io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWindowsHWND.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromWindowsHWND {
			return WGPUSurfaceDescriptorFromWindowsHWND.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromWindowsHWND) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromWindowsHWND> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWindowsHWND.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWindowsHWND.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceDescriptorFromWindowsHWND.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceDescriptorFromXcbWindow {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXcbWindow.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXcbWindow.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromXcbWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var connection: NativeAddress?
			get() = handle.connection
			set(newValue) { handle.connection = newValue }

		override var window: UInt
			get() = handle.window.toUInt()
			set(newValue) { handle.window = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXcbWindow.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXcbWindow.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromXcbWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var connection: NativeAddress?
			get() = handle.connection
			set(newValue) { handle.connection = newValue }

		override var window: UInt
			get() = handle.window.toUInt()
			set(newValue) { handle.window = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXcbWindow.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var connection: NativeAddress?
	actual var window: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromXcbWindow {
			return io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXcbWindow.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromXcbWindow {
			return WGPUSurfaceDescriptorFromXcbWindow.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromXcbWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromXcbWindow> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXcbWindow.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXcbWindow.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceDescriptorFromXcbWindow.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceDescriptorFromXlibWindow {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXlibWindow.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXlibWindow.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var display: NativeAddress?
			get() = handle.display
			set(newValue) { handle.display = newValue }

		override var window: ULong
			get() = handle.window.toULong()
			set(newValue) { handle.window = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXlibWindow.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXlibWindow.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var display: NativeAddress?
			get() = handle.display
			set(newValue) { handle.display = newValue }

		override var window: ULong
			get() = handle.window.toULong()
			set(newValue) { handle.window = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXlibWindow.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var display: NativeAddress?
	actual var window: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromXlibWindow {
			return io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXlibWindow.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromXlibWindow {
			return WGPUSurfaceDescriptorFromXlibWindow.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromXlibWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromXlibWindow> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXlibWindow.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromXlibWindow.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceDescriptorFromXlibWindow.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceDescriptorFromWaylandSurface {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWaylandSurface.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWaylandSurface.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var display: NativeAddress?
			get() = handle.display
			set(newValue) { handle.display = newValue }

		override var surface: NativeAddress?
			get() = handle.surface
			set(newValue) { handle.surface = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWaylandSurface.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWaylandSurface.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceDescriptorFromWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var display: NativeAddress?
			get() = handle.display
			set(newValue) { handle.display = newValue }

		override var surface: NativeAddress?
			get() = handle.surface
			set(newValue) { handle.surface = newValue }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWaylandSurface.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual val chain: WGPUChainedStruct
	actual var display: NativeAddress?
	actual var surface: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromWaylandSurface {
			return io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWaylandSurface.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromWaylandSurface {
			return WGPUSurfaceDescriptorFromWaylandSurface.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromWaylandSurface) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromWaylandSurface> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWaylandSurface.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceDescriptorFromWaylandSurface.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceDescriptorFromWaylandSurface.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUSurfaceTexture {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByReference(com.sun.jna.Pointer.NULL)) : WGPUSurfaceTexture {
		override var texture: WGPUTexture?
			get() = handle.texture?.let{ WGPUTexture(it) }
			set(newValue) { handle.texture = newValue?.handler }

		override var suboptimal: Boolean
			get() = handle.suboptimal.toBoolean()
			set(newValue) { handle.suboptimal = newValue.toInt() }

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handle.status.toUInt()
			set(newValue) { handle.status = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue(com.sun.jna.Pointer.NULL)) : WGPUSurfaceTexture {
		override var texture: WGPUTexture?
			get() = handle.texture?.let{ WGPUTexture(it) }
			set(newValue) { handle.texture = newValue?.handler }

		override var suboptimal: Boolean
			get() = handle.suboptimal.toBoolean()
			set(newValue) { handle.suboptimal = newValue.toInt() }

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handle.status.toUInt()
			set(newValue) { handle.status = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var texture: WGPUTexture?
	actual var suboptimal: Boolean
	actual var status: WGPUSurfaceGetCurrentTextureStatus
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceTexture {
			return io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceTexture {
			return WGPUSurfaceTexture.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceTexture) -> Unit): ArrayHolder<WGPUSurfaceTexture> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceTexture.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUTextureDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var usage: UInt
			get() = handle.usage.toUInt()
			set(newValue) { handle.usage = newValue.toInt() }

		override var dimension: WGPUTextureDimension
			get() = handle.dimension.toUInt()
			set(newValue) { handle.dimension = newValue.toInt() }

		override val size: WGPUExtent3D
			get() = handle.size.let{ WGPUExtent3D.ByValue(it) }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var mipLevelCount: UInt
			get() = handle.mipLevelCount.toUInt()
			set(newValue) { handle.mipLevelCount = newValue.toInt() }

		override var sampleCount: UInt
			get() = handle.sampleCount.toUInt()
			set(newValue) { handle.sampleCount = newValue.toInt() }

		override var viewFormatCount: ULong
			get() = handle.viewFormatCount.toULong()
			set(newValue) { handle.viewFormatCount = newValue.toLong() }

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.viewFormats?.let(::ArrayHolder)
			set(newValue) { handle.viewFormats = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var usage: UInt
			get() = handle.usage.toUInt()
			set(newValue) { handle.usage = newValue.toInt() }

		override var dimension: WGPUTextureDimension
			get() = handle.dimension.toUInt()
			set(newValue) { handle.dimension = newValue.toInt() }

		override val size: WGPUExtent3D
			get() = handle.size.let{ WGPUExtent3D.ByValue(it) }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var mipLevelCount: UInt
			get() = handle.mipLevelCount.toUInt()
			set(newValue) { handle.mipLevelCount = newValue.toInt() }

		override var sampleCount: UInt
			get() = handle.sampleCount.toUInt()
			set(newValue) { handle.sampleCount = newValue.toInt() }

		override var viewFormatCount: ULong
			get() = handle.viewFormatCount.toULong()
			set(newValue) { handle.viewFormatCount = newValue.toLong() }

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.viewFormats?.let(::ArrayHolder)
			set(newValue) { handle.viewFormats = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureDescriptor {
			return WGPUTextureDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureDescriptor) -> Unit): ArrayHolder<WGPUTextureDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUTextureDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUTextureViewDescriptor {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var dimension: WGPUTextureViewDimension
			get() = handle.dimension.toUInt()
			set(newValue) { handle.dimension = newValue.toInt() }

		override var baseMipLevel: UInt
			get() = handle.baseMipLevel.toUInt()
			set(newValue) { handle.baseMipLevel = newValue.toInt() }

		override var mipLevelCount: UInt
			get() = handle.mipLevelCount.toUInt()
			set(newValue) { handle.mipLevelCount = newValue.toInt() }

		override var baseArrayLayer: UInt
			get() = handle.baseArrayLayer.toUInt()
			set(newValue) { handle.baseArrayLayer = newValue.toInt() }

		override var arrayLayerCount: UInt
			get() = handle.arrayLayerCount.toUInt()
			set(newValue) { handle.arrayLayerCount = newValue.toInt() }

		override var aspect: WGPUTextureAspect
			get() = handle.aspect.toUInt()
			set(newValue) { handle.aspect = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) { handle.nextInChain = newValue }

		override var label: CString?
			get() = handle.label?.let(::CString)
			set(newValue) { handle.label = newValue?.handler }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) { handle.format = newValue.toInt() }

		override var dimension: WGPUTextureViewDimension
			get() = handle.dimension.toUInt()
			set(newValue) { handle.dimension = newValue.toInt() }

		override var baseMipLevel: UInt
			get() = handle.baseMipLevel.toUInt()
			set(newValue) { handle.baseMipLevel = newValue.toInt() }

		override var mipLevelCount: UInt
			get() = handle.mipLevelCount.toUInt()
			set(newValue) { handle.mipLevelCount = newValue.toInt() }

		override var baseArrayLayer: UInt
			get() = handle.baseArrayLayer.toUInt()
			set(newValue) { handle.baseArrayLayer = newValue.toInt() }

		override var arrayLayerCount: UInt
			get() = handle.arrayLayerCount.toUInt()
			set(newValue) { handle.arrayLayerCount = newValue.toInt() }

		override var aspect: WGPUTextureAspect
			get() = handle.aspect.toUInt()
			set(newValue) { handle.aspect = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureViewDescriptor {
			return WGPUTextureViewDescriptor.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureViewDescriptor) -> Unit): ArrayHolder<WGPUTextureViewDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUTextureViewDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUWrappedSubmissionIndex {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUWrappedSubmissionIndex.ByReference = io.ygdrasil.wgpu.android.WGPUWrappedSubmissionIndex.ByReference(com.sun.jna.Pointer.NULL)) : WGPUWrappedSubmissionIndex {
		override var queue: WGPUQueue?
			get() = handle.queue?.let{ WGPUQueue(it) }
			set(newValue) { handle.queue = newValue?.handler }

		override var submissionIndex: ULong
			get() = handle.submissionIndex.toULong()
			set(newValue) { handle.submissionIndex = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUWrappedSubmissionIndex.ByValue = io.ygdrasil.wgpu.android.WGPUWrappedSubmissionIndex.ByValue(com.sun.jna.Pointer.NULL)) : WGPUWrappedSubmissionIndex {
		override var queue: WGPUQueue?
			get() = handle.queue?.let{ WGPUQueue(it) }
			set(newValue) { handle.queue = newValue?.handler }

		override var submissionIndex: ULong
			get() = handle.submissionIndex.toULong()
			set(newValue) { handle.submissionIndex = newValue.toLong() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUWrappedSubmissionIndex.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var queue: WGPUQueue?
	actual var submissionIndex: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUWrappedSubmissionIndex {
			return io.ygdrasil.wgpu.android.WGPUWrappedSubmissionIndex.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUWrappedSubmissionIndex {
			return WGPUWrappedSubmissionIndex.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUWrappedSubmissionIndex) -> Unit): ArrayHolder<WGPUWrappedSubmissionIndex> {
			val array = io.ygdrasil.wgpu.android.WGPUWrappedSubmissionIndex.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUWrappedSubmissionIndex.ByValue)
					.also { provider(index.toUInt(), WGPUWrappedSubmissionIndex.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUInstanceExtras {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByReference = io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByReference(com.sun.jna.Pointer.NULL)) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var backends: UInt
			get() = handle.backends.toUInt()
			set(newValue) { handle.backends = newValue.toInt() }

		override var flags: UInt
			get() = handle.flags.toUInt()
			set(newValue) { handle.flags = newValue.toInt() }

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handle.dx12ShaderCompiler.toUInt()
			set(newValue) { handle.dx12ShaderCompiler = newValue.toInt() }

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handle.gles3MinorVersion.toUInt()
			set(newValue) { handle.gles3MinorVersion = newValue.toInt() }

		override var dxilPath: CString?
			get() = handle.dxilPath?.let(::CString)
			set(newValue) { handle.dxilPath = newValue?.handler }

		override var dxcPath: CString?
			get() = handle.dxcPath?.let(::CString)
			set(newValue) { handle.dxcPath = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue = io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue(com.sun.jna.Pointer.NULL)) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var backends: UInt
			get() = handle.backends.toUInt()
			set(newValue) { handle.backends = newValue.toInt() }

		override var flags: UInt
			get() = handle.flags.toUInt()
			set(newValue) { handle.flags = newValue.toInt() }

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handle.dx12ShaderCompiler.toUInt()
			set(newValue) { handle.dx12ShaderCompiler = newValue.toInt() }

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handle.gles3MinorVersion.toUInt()
			set(newValue) { handle.gles3MinorVersion = newValue.toInt() }

		override var dxilPath: CString?
			get() = handle.dxilPath?.let(::CString)
			set(newValue) { handle.dxilPath = newValue?.handler }

		override var dxcPath: CString?
			get() = handle.dxcPath?.let(::CString)
			set(newValue) { handle.dxcPath = newValue?.handler }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

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
			return io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUInstanceExtras {
			return WGPUInstanceExtras.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUInstanceExtras) -> Unit): ArrayHolder<WGPUInstanceExtras> {
			val array = io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue)
					.also { provider(index.toUInt(), WGPUInstanceExtras.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

actual interface WGPUChainedStructOut {

	class ByReference(val handle: io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByReference = io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByReference(com.sun.jna.Pointer.NULL)) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = handle.next?.let{ WGPUChainedStructOut.ByReference(it) }
			set(newValue) { handle.next = (newValue as? WGPUChainedStructOut.ByReference)?.handle }

		override var sType: WGPUSType
			get() = handle.sType.toUInt()
			set(newValue) { handle.sType = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	class ByValue(val handle: io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue = io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue(com.sun.jna.Pointer.NULL)) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = handle.next?.let{ WGPUChainedStructOut.ByReference(it) }
			set(newValue) { handle.next = (newValue as? WGPUChainedStructOut.ByReference)?.handle }

		override var sType: WGPUSType
			get() = handle.sType.toUInt()
			set(newValue) { handle.sType = newValue.toInt() }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	fun toCValue() = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue(handle) }
	fun toReference() = (this as ByReference).handle

	actual var next: WGPUChainedStructOut?
	actual var sType: WGPUSType
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUChainedStructOut {
			return io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByReference(address)
				.also { it.read() }
				.let(::ByReference)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUChainedStructOut {
			return WGPUChainedStructOut.ByReference()
				.also { allocator.register(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUChainedStructOut) -> Unit): ArrayHolder<WGPUChainedStructOut> {
			val array = io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue().toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue)
					.also { provider(index.toUInt(), WGPUChainedStructOut.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) com.sun.jna.Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

