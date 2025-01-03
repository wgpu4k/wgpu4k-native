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
import java.lang.foreign.AddressLayout
import java.lang.foreign.MemoryLayout
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryLayout.PathElement.groupElement
import java.lang.foreign.MemoryLayout.structLayout

actual interface WGPURequestAdapterOptions : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var compatibleSurface: WGPUSurface?
			get() = get(compatibleSurfaceLayout, compatibleSurfaceOffset).let { WGPUSurface(it) }
			set(newValue) = set(compatibleSurfaceLayout, compatibleSurfaceOffset, newValue?.handler)
		override var powerPreference: WGPUPowerPreference
			get() = getUInt(powerPreferenceOffset)
			set(newValue) = set(powerPreferenceOffset, newValue)
		override var backendType: WGPUBackendType
			get() = getUInt(backendTypeOffset)
			set(newValue) = set(backendTypeOffset, newValue)
		override var forceFallbackAdapter: Boolean
			get() = getInt(forceFallbackAdapterOffset).toBoolean()
			set(newValue) = set(forceFallbackAdapterOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var compatibleSurface: WGPUSurface?
	actual var powerPreference: WGPUPowerPreference
	actual var backendType: WGPUBackendType
	actual var forceFallbackAdapter: Boolean

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURequestAdapterOptions {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterOptions {
			return allocator.allocate(32L)
				.let { WGPURequestAdapterOptions(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURequestAdapterOptions) -> Unit): ArrayHolder<WGPURequestAdapterOptions> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPURequestAdapterOptions(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("compatibleSurface"),
			ffi.C_INT.withName("powerPreference"),
			ffi.C_INT.withName("backendType"),
			ffi.C_INT.withName("forceFallbackAdapter"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPURequestAdapterOptions")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val compatibleSurfaceOffset = 8L
		val compatibleSurfaceLayout = ffi.C_POINTER
		val powerPreferenceOffset = 16L
		val powerPreferenceLayout = ffi.C_INT
		val backendTypeOffset = 20L
		val backendTypeLayout = ffi.C_INT
		val forceFallbackAdapterOffset = 24L
		val forceFallbackAdapterLayout = ffi.C_INT
	}
}
actual interface WGPUAdapterInfo : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var vendor: CString?
			get() = get(vendorLayout, vendorOffset).let(::CString)
			set(newValue) = set(vendorLayout, vendorOffset, newValue?.handler)
		override var architecture: CString?
			get() = get(architectureLayout, architectureOffset).let(::CString)
			set(newValue) = set(architectureLayout, architectureOffset, newValue?.handler)
		override var device: CString?
			get() = get(deviceLayout, deviceOffset).let(::CString)
			set(newValue) = set(deviceLayout, deviceOffset, newValue?.handler)
		override var description: CString?
			get() = get(descriptionLayout, descriptionOffset).let(::CString)
			set(newValue) = set(descriptionLayout, descriptionOffset, newValue?.handler)
		override var backendType: WGPUBackendType
			get() = getUInt(backendTypeOffset)
			set(newValue) = set(backendTypeOffset, newValue)
		override var adapterType: WGPUAdapterType
			get() = getUInt(adapterTypeOffset)
			set(newValue) = set(adapterTypeOffset, newValue)
		override var vendorID: UInt
			get() = getUInt(vendorIDOffset)
			set(newValue) = set(vendorIDOffset, newValue)
		override var deviceID: UInt
			get() = getUInt(deviceIDOffset)
			set(newValue) = set(deviceIDOffset, newValue)
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUAdapterInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUAdapterInfo {
			return allocator.allocate(56L)
				.let { WGPUAdapterInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUAdapterInfo) -> Unit): ArrayHolder<WGPUAdapterInfo> {
			return allocator.allocate(56 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 56L)
							.let(::NativeAddress)
							.let { WGPUAdapterInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("vendor"),
			ffi.C_POINTER.withName("architecture"),
			ffi.C_POINTER.withName("device"),
			ffi.C_POINTER.withName("description"),
			ffi.C_INT.withName("backendType"),
			ffi.C_INT.withName("adapterType"),
			ffi.C_INT.withName("vendorID"),
			ffi.C_INT.withName("deviceID"),
		).withName("WGPUAdapterInfo")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val vendorOffset = 8L
		val vendorLayout = ffi.C_POINTER
		val architectureOffset = 16L
		val architectureLayout = ffi.C_POINTER
		val deviceOffset = 24L
		val deviceLayout = ffi.C_POINTER
		val descriptionOffset = 32L
		val descriptionLayout = ffi.C_POINTER
		val backendTypeOffset = 40L
		val backendTypeLayout = ffi.C_INT
		val adapterTypeOffset = 44L
		val adapterTypeLayout = ffi.C_INT
		val vendorIDOffset = 48L
		val vendorIDLayout = ffi.C_INT
		val deviceIDOffset = 52L
		val deviceIDLayout = ffi.C_INT
	}
}
actual interface WGPUQueueDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUQueueDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUQueueDescriptor {
			return allocator.allocate(16L)
				.let { WGPUQueueDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUQueueDescriptor) -> Unit): ArrayHolder<WGPUQueueDescriptor> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUQueueDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
		).withName("WGPUQueueDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
	}
}
actual interface WGPUUncapturedErrorCallbackInfo : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var callback: CallbackHolder<WGPUErrorCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) = set(callbackLayout, callbackOffset, newValue?.handler)
		override var userdata: NativeAddress?
			get() = get(userdataLayout, userdataOffset)
			set(newValue) = set(userdataLayout, userdataOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var callback: CallbackHolder<WGPUErrorCallback>?
	actual var userdata: NativeAddress?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUUncapturedErrorCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUUncapturedErrorCallbackInfo {
			return allocator.allocate(24L)
				.let { WGPUUncapturedErrorCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUUncapturedErrorCallbackInfo) -> Unit): ArrayHolder<WGPUUncapturedErrorCallbackInfo> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUUncapturedErrorCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("callback"),
			ffi.C_POINTER.withName("userdata"),
		).withName("WGPUUncapturedErrorCallbackInfo")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val callbackOffset = 8L
		val callbackLayout = ffi.C_POINTER
		val userdataOffset = 16L
		val userdataLayout = ffi.C_POINTER
	}
}
actual interface WGPUDeviceDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var requiredFeatureCount: ULong
			get() = getULong(requiredFeatureCountOffset)
			set(newValue) = set(requiredFeatureCountOffset, newValue)
		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = get(requiredFeaturesLayout, requiredFeaturesOffset).let(::ArrayHolder)
			set(newValue) = set(requiredFeaturesLayout, requiredFeaturesOffset, newValue?.handler)
		override var requiredLimits: WGPURequiredLimits?
			get() = get(requiredLimitsLayout, requiredLimitsOffset).let { WGPURequiredLimits(it) }
			set(newValue) = set(requiredLimitsLayout, requiredLimitsOffset, newValue?.handler)
		override val defaultQueue: WGPUQueueDescriptor
			get() = handler.handler.asSlice(defaultQueueOffset, 16L).let(::NativeAddress).let { WGPUQueueDescriptor(it) }
		override var deviceLostCallback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = get(deviceLostCallbackLayout, deviceLostCallbackOffset).let(::CallbackHolder)
			set(newValue) = set(deviceLostCallbackLayout, deviceLostCallbackOffset, newValue?.handler)
		override var deviceLostUserdata: NativeAddress?
			get() = get(deviceLostUserdataLayout, deviceLostUserdataOffset)
			set(newValue) = set(deviceLostUserdataLayout, deviceLostUserdataOffset, newValue)
		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handler.handler.asSlice(uncapturedErrorCallbackInfoOffset, 24L).let(::NativeAddress).let { WGPUUncapturedErrorCallbackInfo(it) }
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUDeviceDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUDeviceDescriptor {
			return allocator.allocate(96L)
				.let { WGPUDeviceDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUDeviceDescriptor) -> Unit): ArrayHolder<WGPUDeviceDescriptor> {
			return allocator.allocate(96 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 96L)
							.let(::NativeAddress)
							.let { WGPUDeviceDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_LONG.withName("requiredFeatureCount"),
			ffi.C_POINTER.withName("requiredFeatures"),
			ffi.C_POINTER.withName("requiredLimits"),
			WGPUQueueDescriptor.LAYOUT.withName("defaultQueue"),
			ffi.C_POINTER.withName("deviceLostCallback"),
			ffi.C_POINTER.withName("deviceLostUserdata"),
			WGPUUncapturedErrorCallbackInfo.LAYOUT.withName("uncapturedErrorCallbackInfo"),
		).withName("WGPUDeviceDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val requiredFeatureCountOffset = 16L
		val requiredFeatureCountLayout = ffi.C_LONG
		val requiredFeaturesOffset = 24L
		val requiredFeaturesLayout = ffi.C_POINTER
		val requiredLimitsOffset = 32L
		val requiredLimitsLayout = ffi.C_POINTER
		val defaultQueueOffset = 40L
		val defaultQueueLayout = WGPUQueueDescriptor.LAYOUT
		val deviceLostCallbackOffset = 56L
		val deviceLostCallbackLayout = ffi.C_POINTER
		val deviceLostUserdataOffset = 64L
		val deviceLostUserdataLayout = ffi.C_POINTER
		val uncapturedErrorCallbackInfoOffset = 72L
		val uncapturedErrorCallbackInfoLayout = WGPUUncapturedErrorCallbackInfo.LAYOUT
	}
}
actual interface WGPUBindGroupEntry : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var binding: UInt
			get() = getUInt(bindingOffset)
			set(newValue) = set(bindingOffset, newValue)
		override var buffer: WGPUBuffer?
			get() = get(bufferLayout, bufferOffset).let { WGPUBuffer(it) }
			set(newValue) = set(bufferLayout, bufferOffset, newValue?.handler)
		override var offset: ULong
			get() = getULong(offsetOffset)
			set(newValue) = set(offsetOffset, newValue)
		override var size: ULong
			get() = getULong(sizeOffset)
			set(newValue) = set(sizeOffset, newValue)
		override var sampler: WGPUSampler?
			get() = get(samplerLayout, samplerOffset).let { WGPUSampler(it) }
			set(newValue) = set(samplerLayout, samplerOffset, newValue?.handler)
		override var textureView: WGPUTextureView?
			get() = get(textureViewLayout, textureViewOffset).let { WGPUTextureView(it) }
			set(newValue) = set(textureViewLayout, textureViewOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var binding: UInt
	actual var buffer: WGPUBuffer?
	actual var offset: ULong
	actual var size: ULong
	actual var sampler: WGPUSampler?
	actual var textureView: WGPUTextureView?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupEntry {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupEntry {
			return allocator.allocate(56L)
				.let { WGPUBindGroupEntry(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupEntry) -> Unit): ArrayHolder<WGPUBindGroupEntry> {
			return allocator.allocate(56 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 56L)
							.let(::NativeAddress)
							.let { WGPUBindGroupEntry(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("binding"),
			MemoryLayout.paddingLayout(4),
			ffi.C_POINTER.withName("buffer"),
			ffi.C_LONG.withName("offset"),
			ffi.C_LONG.withName("size"),
			ffi.C_POINTER.withName("sampler"),
			ffi.C_POINTER.withName("textureView"),
		).withName("WGPUBindGroupEntry")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val bindingOffset = 8L
		val bindingLayout = ffi.C_INT
		val bufferOffset = 16L
		val bufferLayout = ffi.C_POINTER
		val offsetOffset = 24L
		val offsetLayout = ffi.C_LONG
		val sizeOffset = 32L
		val sizeLayout = ffi.C_LONG
		val samplerOffset = 40L
		val samplerLayout = ffi.C_POINTER
		val textureViewOffset = 48L
		val textureViewLayout = ffi.C_POINTER
	}
}
actual interface WGPUBindGroupDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var layout: WGPUBindGroupLayout?
			get() = get(layoutLayout, layoutOffset).let { WGPUBindGroupLayout(it) }
			set(newValue) = set(layoutLayout, layoutOffset, newValue?.handler)
		override var entryCount: ULong
			get() = getULong(entryCountOffset)
			set(newValue) = set(entryCountOffset, newValue)
		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = get(entriesLayout, entriesOffset).let(::ArrayHolder)
			set(newValue) = set(entriesLayout, entriesOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var layout: WGPUBindGroupLayout?
	actual var entryCount: ULong
	actual var entries: ArrayHolder<WGPUBindGroupEntry>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupDescriptor {
			return allocator.allocate(40L)
				.let { WGPUBindGroupDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupDescriptor) -> Unit): ArrayHolder<WGPUBindGroupDescriptor> {
			return allocator.allocate(40 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 40L)
							.let(::NativeAddress)
							.let { WGPUBindGroupDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_POINTER.withName("layout"),
			ffi.C_LONG.withName("entryCount"),
			ffi.C_POINTER.withName("entries"),
		).withName("WGPUBindGroupDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val layoutOffset = 16L
		val layoutLayout = ffi.C_POINTER
		val entryCountOffset = 24L
		val entryCountLayout = ffi.C_LONG
		val entriesOffset = 32L
		val entriesLayout = ffi.C_POINTER
	}
}
actual interface WGPUBufferBindingLayout : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var type: WGPUBufferBindingType
			get() = getUInt(typeOffset)
			set(newValue) = set(typeOffset, newValue)
		override var hasDynamicOffset: Boolean
			get() = getInt(hasDynamicOffsetOffset).toBoolean()
			set(newValue) = set(hasDynamicOffsetOffset, newValue)
		override var minBindingSize: ULong
			get() = getULong(minBindingSizeOffset)
			set(newValue) = set(minBindingSizeOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var type: WGPUBufferBindingType
	actual var hasDynamicOffset: Boolean
	actual var minBindingSize: ULong

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBufferBindingLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBufferBindingLayout {
			return allocator.allocate(24L)
				.let { WGPUBufferBindingLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBufferBindingLayout) -> Unit): ArrayHolder<WGPUBufferBindingLayout> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUBufferBindingLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("type"),
			ffi.C_INT.withName("hasDynamicOffset"),
			ffi.C_LONG.withName("minBindingSize"),
		).withName("WGPUBufferBindingLayout")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val typeOffset = 8L
		val typeLayout = ffi.C_INT
		val hasDynamicOffsetOffset = 12L
		val hasDynamicOffsetLayout = ffi.C_INT
		val minBindingSizeOffset = 16L
		val minBindingSizeLayout = ffi.C_LONG
	}
}
actual interface WGPUSamplerBindingLayout : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var type: WGPUSamplerBindingType
			get() = getUInt(typeOffset)
			set(newValue) = set(typeOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var type: WGPUSamplerBindingType

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSamplerBindingLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSamplerBindingLayout {
			return allocator.allocate(16L)
				.let { WGPUSamplerBindingLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSamplerBindingLayout) -> Unit): ArrayHolder<WGPUSamplerBindingLayout> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUSamplerBindingLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("type"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUSamplerBindingLayout")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val typeOffset = 8L
		val typeLayout = ffi.C_INT
	}
}
actual interface WGPUTextureBindingLayout : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var sampleType: WGPUTextureSampleType
			get() = getUInt(sampleTypeOffset)
			set(newValue) = set(sampleTypeOffset, newValue)
		override var viewDimension: WGPUTextureViewDimension
			get() = getUInt(viewDimensionOffset)
			set(newValue) = set(viewDimensionOffset, newValue)
		override var multisampled: Boolean
			get() = getInt(multisampledOffset).toBoolean()
			set(newValue) = set(multisampledOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var sampleType: WGPUTextureSampleType
	actual var viewDimension: WGPUTextureViewDimension
	actual var multisampled: Boolean

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureBindingLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureBindingLayout {
			return allocator.allocate(24L)
				.let { WGPUTextureBindingLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureBindingLayout) -> Unit): ArrayHolder<WGPUTextureBindingLayout> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUTextureBindingLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("sampleType"),
			ffi.C_INT.withName("viewDimension"),
			ffi.C_INT.withName("multisampled"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUTextureBindingLayout")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val sampleTypeOffset = 8L
		val sampleTypeLayout = ffi.C_INT
		val viewDimensionOffset = 12L
		val viewDimensionLayout = ffi.C_INT
		val multisampledOffset = 16L
		val multisampledLayout = ffi.C_INT
	}
}
actual interface WGPUSurfaceCapabilities : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var usages: UInt
			get() = getUInt(usagesOffset)
			set(newValue) = set(usagesOffset, newValue)
		override var formatCount: ULong
			get() = getULong(formatCountOffset)
			set(newValue) = set(formatCountOffset, newValue)
		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = get(formatsLayout, formatsOffset).let(::ArrayHolder)
			set(newValue) = set(formatsLayout, formatsOffset, newValue?.handler)
		override var presentModeCount: ULong
			get() = getULong(presentModeCountOffset)
			set(newValue) = set(presentModeCountOffset, newValue)
		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = get(presentModesLayout, presentModesOffset).let(::ArrayHolder)
			set(newValue) = set(presentModesLayout, presentModesOffset, newValue?.handler)
		override var alphaModeCount: ULong
			get() = getULong(alphaModeCountOffset)
			set(newValue) = set(alphaModeCountOffset, newValue)
		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = get(alphaModesLayout, alphaModesOffset).let(::ArrayHolder)
			set(newValue) = set(alphaModesLayout, alphaModesOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var usages: UInt
	actual var formatCount: ULong
	actual var formats: ArrayHolder<WGPUTextureFormat>?
	actual var presentModeCount: ULong
	actual var presentModes: ArrayHolder<WGPUPresentMode>?
	actual var alphaModeCount: ULong
	actual var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceCapabilities {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceCapabilities {
			return allocator.allocate(64L)
				.let { WGPUSurfaceCapabilities(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceCapabilities) -> Unit): ArrayHolder<WGPUSurfaceCapabilities> {
			return allocator.allocate(64 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 64L)
							.let(::NativeAddress)
							.let { WGPUSurfaceCapabilities(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("usages"),
			MemoryLayout.paddingLayout(4),
			ffi.C_LONG.withName("formatCount"),
			ffi.C_POINTER.withName("formats"),
			ffi.C_LONG.withName("presentModeCount"),
			ffi.C_POINTER.withName("presentModes"),
			ffi.C_LONG.withName("alphaModeCount"),
			ffi.C_POINTER.withName("alphaModes"),
		).withName("WGPUSurfaceCapabilities")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val usagesOffset = 8L
		val usagesLayout = ffi.C_INT
		val formatCountOffset = 16L
		val formatCountLayout = ffi.C_LONG
		val formatsOffset = 24L
		val formatsLayout = ffi.C_POINTER
		val presentModeCountOffset = 32L
		val presentModeCountLayout = ffi.C_LONG
		val presentModesOffset = 40L
		val presentModesLayout = ffi.C_POINTER
		val alphaModeCountOffset = 48L
		val alphaModeCountLayout = ffi.C_LONG
		val alphaModesOffset = 56L
		val alphaModesLayout = ffi.C_POINTER
	}
}
actual interface WGPUSurfaceConfiguration : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var device: WGPUDevice?
			get() = get(deviceLayout, deviceOffset).let { WGPUDevice(it) }
			set(newValue) = set(deviceLayout, deviceOffset, newValue?.handler)
		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) = set(formatOffset, newValue)
		override var usage: UInt
			get() = getUInt(usageOffset)
			set(newValue) = set(usageOffset, newValue)
		override var viewFormatCount: ULong
			get() = getULong(viewFormatCountOffset)
			set(newValue) = set(viewFormatCountOffset, newValue)
		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = get(viewFormatsLayout, viewFormatsOffset).let(::ArrayHolder)
			set(newValue) = set(viewFormatsLayout, viewFormatsOffset, newValue?.handler)
		override var alphaMode: WGPUCompositeAlphaMode
			get() = getUInt(alphaModeOffset)
			set(newValue) = set(alphaModeOffset, newValue)
		override var width: UInt
			get() = getUInt(widthOffset)
			set(newValue) = set(widthOffset, newValue)
		override var height: UInt
			get() = getUInt(heightOffset)
			set(newValue) = set(heightOffset, newValue)
		override var presentMode: WGPUPresentMode
			get() = getUInt(presentModeOffset)
			set(newValue) = set(presentModeOffset, newValue)
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceConfiguration {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceConfiguration {
			return allocator.allocate(56L)
				.let { WGPUSurfaceConfiguration(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceConfiguration) -> Unit): ArrayHolder<WGPUSurfaceConfiguration> {
			return allocator.allocate(56 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 56L)
							.let(::NativeAddress)
							.let { WGPUSurfaceConfiguration(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("device"),
			ffi.C_INT.withName("format"),
			ffi.C_INT.withName("usage"),
			ffi.C_LONG.withName("viewFormatCount"),
			ffi.C_POINTER.withName("viewFormats"),
			ffi.C_INT.withName("alphaMode"),
			ffi.C_INT.withName("width"),
			ffi.C_INT.withName("height"),
			ffi.C_INT.withName("presentMode"),
		).withName("WGPUSurfaceConfiguration")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val deviceOffset = 8L
		val deviceLayout = ffi.C_POINTER
		val formatOffset = 16L
		val formatLayout = ffi.C_INT
		val usageOffset = 20L
		val usageLayout = ffi.C_INT
		val viewFormatCountOffset = 24L
		val viewFormatCountLayout = ffi.C_LONG
		val viewFormatsOffset = 32L
		val viewFormatsLayout = ffi.C_POINTER
		val alphaModeOffset = 40L
		val alphaModeLayout = ffi.C_INT
		val widthOffset = 44L
		val widthLayout = ffi.C_INT
		val heightOffset = 48L
		val heightLayout = ffi.C_INT
		val presentModeOffset = 52L
		val presentModeLayout = ffi.C_INT
	}
}
actual interface WGPUStorageTextureBindingLayout : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var access: WGPUStorageTextureAccess
			get() = getUInt(accessOffset)
			set(newValue) = set(accessOffset, newValue)
		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) = set(formatOffset, newValue)
		override var viewDimension: WGPUTextureViewDimension
			get() = getUInt(viewDimensionOffset)
			set(newValue) = set(viewDimensionOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var access: WGPUStorageTextureAccess
	actual var format: WGPUTextureFormat
	actual var viewDimension: WGPUTextureViewDimension

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUStorageTextureBindingLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUStorageTextureBindingLayout {
			return allocator.allocate(24L)
				.let { WGPUStorageTextureBindingLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUStorageTextureBindingLayout) -> Unit): ArrayHolder<WGPUStorageTextureBindingLayout> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUStorageTextureBindingLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("access"),
			ffi.C_INT.withName("format"),
			ffi.C_INT.withName("viewDimension"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUStorageTextureBindingLayout")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val accessOffset = 8L
		val accessLayout = ffi.C_INT
		val formatOffset = 12L
		val formatLayout = ffi.C_INT
		val viewDimensionOffset = 16L
		val viewDimensionLayout = ffi.C_INT
	}
}
actual interface WGPUBindGroupLayoutEntry : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var binding: UInt
			get() = getUInt(bindingOffset)
			set(newValue) = set(bindingOffset, newValue)
		override var visibility: UInt
			get() = getUInt(visibilityOffset)
			set(newValue) = set(visibilityOffset, newValue)
		override val buffer: WGPUBufferBindingLayout
			get() = handler.handler.asSlice(bufferOffset, 24L).let(::NativeAddress).let { WGPUBufferBindingLayout(it) }
		override val sampler: WGPUSamplerBindingLayout
			get() = handler.handler.asSlice(samplerOffset, 16L).let(::NativeAddress).let { WGPUSamplerBindingLayout(it) }
		override val texture: WGPUTextureBindingLayout
			get() = handler.handler.asSlice(textureOffset, 24L).let(::NativeAddress).let { WGPUTextureBindingLayout(it) }
		override val storageTexture: WGPUStorageTextureBindingLayout
			get() = handler.handler.asSlice(storageTextureOffset, 24L).let(::NativeAddress).let { WGPUStorageTextureBindingLayout(it) }
	}

	actual var nextInChain: NativeAddress?
	actual var binding: UInt
	actual var visibility: UInt
	actual val buffer: WGPUBufferBindingLayout
	actual val sampler: WGPUSamplerBindingLayout
	actual val texture: WGPUTextureBindingLayout
	actual val storageTexture: WGPUStorageTextureBindingLayout

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutEntry {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutEntry {
			return allocator.allocate(104L)
				.let { WGPUBindGroupLayoutEntry(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupLayoutEntry) -> Unit): ArrayHolder<WGPUBindGroupLayoutEntry> {
			return allocator.allocate(104 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 104L)
							.let(::NativeAddress)
							.let { WGPUBindGroupLayoutEntry(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("binding"),
			ffi.C_INT.withName("visibility"),
			WGPUBufferBindingLayout.LAYOUT.withName("buffer"),
			WGPUSamplerBindingLayout.LAYOUT.withName("sampler"),
			WGPUTextureBindingLayout.LAYOUT.withName("texture"),
			WGPUStorageTextureBindingLayout.LAYOUT.withName("storageTexture"),
		).withName("WGPUBindGroupLayoutEntry")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val bindingOffset = 8L
		val bindingLayout = ffi.C_INT
		val visibilityOffset = 12L
		val visibilityLayout = ffi.C_INT
		val bufferOffset = 16L
		val bufferLayout = WGPUBufferBindingLayout.LAYOUT
		val samplerOffset = 40L
		val samplerLayout = WGPUSamplerBindingLayout.LAYOUT
		val textureOffset = 56L
		val textureLayout = WGPUTextureBindingLayout.LAYOUT
		val storageTextureOffset = 80L
		val storageTextureLayout = WGPUStorageTextureBindingLayout.LAYOUT
	}
}
actual interface WGPUBindGroupLayoutDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var entryCount: ULong
			get() = getULong(entryCountOffset)
			set(newValue) = set(entryCountOffset, newValue)
		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = get(entriesLayout, entriesOffset).let(::ArrayHolder)
			set(newValue) = set(entriesLayout, entriesOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var entryCount: ULong
	actual var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutDescriptor {
			return allocator.allocate(32L)
				.let { WGPUBindGroupLayoutDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBindGroupLayoutDescriptor) -> Unit): ArrayHolder<WGPUBindGroupLayoutDescriptor> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUBindGroupLayoutDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_LONG.withName("entryCount"),
			ffi.C_POINTER.withName("entries"),
		).withName("WGPUBindGroupLayoutDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val entryCountOffset = 16L
		val entryCountLayout = ffi.C_LONG
		val entriesOffset = 24L
		val entriesLayout = ffi.C_POINTER
	}
}
actual interface WGPUBlendComponent : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = getUInt(operationOffset)
			set(newValue) = set(operationOffset, newValue)
		override var srcFactor: WGPUBlendFactor
			get() = getUInt(srcFactorOffset)
			set(newValue) = set(srcFactorOffset, newValue)
		override var dstFactor: WGPUBlendFactor
			get() = getUInt(dstFactorOffset)
			set(newValue) = set(dstFactorOffset, newValue)
	}

	actual var operation: WGPUBlendOperation
	actual var srcFactor: WGPUBlendFactor
	actual var dstFactor: WGPUBlendFactor

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBlendComponent {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBlendComponent {
			return allocator.allocate(12L)
				.let { WGPUBlendComponent(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBlendComponent) -> Unit): ArrayHolder<WGPUBlendComponent> {
			return allocator.allocate(12 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 12L)
							.let(::NativeAddress)
							.let { WGPUBlendComponent(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_INT.withName("operation"),
			ffi.C_INT.withName("srcFactor"),
			ffi.C_INT.withName("dstFactor"),
		).withName("WGPUBlendComponent")

		val operationOffset = 0L
		val operationLayout = ffi.C_INT
		val srcFactorOffset = 4L
		val srcFactorLayout = ffi.C_INT
		val dstFactorOffset = 8L
		val dstFactorLayout = ffi.C_INT
	}
}
actual interface WGPUBufferDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var usage: UInt
			get() = getUInt(usageOffset)
			set(newValue) = set(usageOffset, newValue)
		override var size: ULong
			get() = getULong(sizeOffset)
			set(newValue) = set(sizeOffset, newValue)
		override var mappedAtCreation: Boolean
			get() = getInt(mappedAtCreationOffset).toBoolean()
			set(newValue) = set(mappedAtCreationOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var usage: UInt
	actual var size: ULong
	actual var mappedAtCreation: Boolean

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBufferDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBufferDescriptor {
			return allocator.allocate(40L)
				.let { WGPUBufferDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBufferDescriptor) -> Unit): ArrayHolder<WGPUBufferDescriptor> {
			return allocator.allocate(40 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 40L)
							.let(::NativeAddress)
							.let { WGPUBufferDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_INT.withName("usage"),
			MemoryLayout.paddingLayout(4),
			ffi.C_LONG.withName("size"),
			ffi.C_INT.withName("mappedAtCreation"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUBufferDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val usageOffset = 16L
		val usageLayout = ffi.C_INT
		val sizeOffset = 24L
		val sizeLayout = ffi.C_LONG
		val mappedAtCreationOffset = 32L
		val mappedAtCreationLayout = ffi.C_INT
	}
}
actual interface WGPUColor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUColor {
		override var r: Double
			get() = getDouble(rOffset)
			set(newValue) = set(rOffset, newValue)
		override var g: Double
			get() = getDouble(gOffset)
			set(newValue) = set(gOffset, newValue)
		override var b: Double
			get() = getDouble(bOffset)
			set(newValue) = set(bOffset, newValue)
		override var a: Double
			get() = getDouble(aOffset)
			set(newValue) = set(aOffset, newValue)
	}

	actual var r: Double
	actual var g: Double
	actual var b: Double
	actual var a: Double

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUColor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUColor {
			return allocator.allocate(32L)
				.let { WGPUColor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUColor) -> Unit): ArrayHolder<WGPUColor> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUColor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_DOUBLE.withName("r"),
			ffi.C_DOUBLE.withName("g"),
			ffi.C_DOUBLE.withName("b"),
			ffi.C_DOUBLE.withName("a"),
		).withName("WGPUColor")

		val rOffset = 0L
		val rLayout = ffi.C_DOUBLE
		val gOffset = 8L
		val gLayout = ffi.C_DOUBLE
		val bOffset = 16L
		val bLayout = ffi.C_DOUBLE
		val aOffset = 24L
		val aLayout = ffi.C_DOUBLE
	}
}
actual interface WGPUConstantEntry : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var key: CString?
			get() = get(keyLayout, keyOffset).let(::CString)
			set(newValue) = set(keyLayout, keyOffset, newValue?.handler)
		override var value: Double
			get() = getDouble(valueOffset)
			set(newValue) = set(valueOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var key: CString?
	actual var value: Double

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUConstantEntry {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUConstantEntry {
			return allocator.allocate(24L)
				.let { WGPUConstantEntry(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUConstantEntry) -> Unit): ArrayHolder<WGPUConstantEntry> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUConstantEntry(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("key"),
			ffi.C_DOUBLE.withName("value"),
		).withName("WGPUConstantEntry")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val keyOffset = 8L
		val keyLayout = ffi.C_POINTER
		val valueOffset = 16L
		val valueLayout = ffi.C_DOUBLE
	}
}
actual interface WGPUCommandBufferDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCommandBufferDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCommandBufferDescriptor {
			return allocator.allocate(16L)
				.let { WGPUCommandBufferDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCommandBufferDescriptor) -> Unit): ArrayHolder<WGPUCommandBufferDescriptor> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUCommandBufferDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
		).withName("WGPUCommandBufferDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
	}
}
actual interface WGPUCommandEncoderDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCommandEncoderDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCommandEncoderDescriptor {
			return allocator.allocate(16L)
				.let { WGPUCommandEncoderDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCommandEncoderDescriptor) -> Unit): ArrayHolder<WGPUCommandEncoderDescriptor> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUCommandEncoderDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
		).withName("WGPUCommandEncoderDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
	}
}
actual interface WGPUCompilationInfo : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var messageCount: ULong
			get() = getULong(messageCountOffset)
			set(newValue) = set(messageCountOffset, newValue)
		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = get(messagesLayout, messagesOffset).let(::ArrayHolder)
			set(newValue) = set(messagesLayout, messagesOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var messageCount: ULong
	actual var messages: ArrayHolder<WGPUCompilationMessage>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCompilationInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfo {
			return allocator.allocate(24L)
				.let { WGPUCompilationInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCompilationInfo) -> Unit): ArrayHolder<WGPUCompilationInfo> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUCompilationInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_LONG.withName("messageCount"),
			ffi.C_POINTER.withName("messages"),
		).withName("WGPUCompilationInfo")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val messageCountOffset = 8L
		val messageCountLayout = ffi.C_LONG
		val messagesOffset = 16L
		val messagesLayout = ffi.C_POINTER
	}
}
actual interface WGPUCompilationMessage : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var message: CString?
			get() = get(messageLayout, messageOffset).let(::CString)
			set(newValue) = set(messageLayout, messageOffset, newValue?.handler)
		override var type: WGPUCompilationMessageType
			get() = getUInt(typeOffset)
			set(newValue) = set(typeOffset, newValue)
		override var lineNum: ULong
			get() = getULong(lineNumOffset)
			set(newValue) = set(lineNumOffset, newValue)
		override var linePos: ULong
			get() = getULong(linePosOffset)
			set(newValue) = set(linePosOffset, newValue)
		override var offset: ULong
			get() = getULong(offsetOffset)
			set(newValue) = set(offsetOffset, newValue)
		override var length: ULong
			get() = getULong(lengthOffset)
			set(newValue) = set(lengthOffset, newValue)
		override var utf16LinePos: ULong
			get() = getULong(utf16LinePosOffset)
			set(newValue) = set(utf16LinePosOffset, newValue)
		override var utf16Offset: ULong
			get() = getULong(utf16OffsetOffset)
			set(newValue) = set(utf16OffsetOffset, newValue)
		override var utf16Length: ULong
			get() = getULong(utf16LengthOffset)
			set(newValue) = set(utf16LengthOffset, newValue)
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCompilationMessage {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCompilationMessage {
			return allocator.allocate(80L)
				.let { WGPUCompilationMessage(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCompilationMessage) -> Unit): ArrayHolder<WGPUCompilationMessage> {
			return allocator.allocate(80 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 80L)
							.let(::NativeAddress)
							.let { WGPUCompilationMessage(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("message"),
			ffi.C_INT.withName("type"),
			MemoryLayout.paddingLayout(4),
			ffi.C_LONG.withName("lineNum"),
			ffi.C_LONG.withName("linePos"),
			ffi.C_LONG.withName("offset"),
			ffi.C_LONG.withName("length"),
			ffi.C_LONG.withName("utf16LinePos"),
			ffi.C_LONG.withName("utf16Offset"),
			ffi.C_LONG.withName("utf16Length"),
		).withName("WGPUCompilationMessage")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val messageOffset = 8L
		val messageLayout = ffi.C_POINTER
		val typeOffset = 16L
		val typeLayout = ffi.C_INT
		val lineNumOffset = 24L
		val lineNumLayout = ffi.C_LONG
		val linePosOffset = 32L
		val linePosLayout = ffi.C_LONG
		val offsetOffset = 40L
		val offsetLayout = ffi.C_LONG
		val lengthOffset = 48L
		val lengthLayout = ffi.C_LONG
		val utf16LinePosOffset = 56L
		val utf16LinePosLayout = ffi.C_LONG
		val utf16OffsetOffset = 64L
		val utf16OffsetLayout = ffi.C_LONG
		val utf16LengthOffset = 72L
		val utf16LengthLayout = ffi.C_LONG
	}
}
actual interface WGPUComputePassDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = get(timestampWritesLayout, timestampWritesOffset).let { WGPUComputePassTimestampWrites(it) }
			set(newValue) = set(timestampWritesLayout, timestampWritesOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var timestampWrites: WGPUComputePassTimestampWrites?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUComputePassDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUComputePassDescriptor {
			return allocator.allocate(24L)
				.let { WGPUComputePassDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUComputePassDescriptor) -> Unit): ArrayHolder<WGPUComputePassDescriptor> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUComputePassDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_POINTER.withName("timestampWrites"),
		).withName("WGPUComputePassDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val timestampWritesOffset = 16L
		val timestampWritesLayout = ffi.C_POINTER
	}
}
actual interface WGPUComputePassTimestampWrites : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = get(querySetLayout, querySetOffset).let { WGPUQuerySet(it) }
			set(newValue) = set(querySetLayout, querySetOffset, newValue?.handler)
		override var beginningOfPassWriteIndex: UInt
			get() = getUInt(beginningOfPassWriteIndexOffset)
			set(newValue) = set(beginningOfPassWriteIndexOffset, newValue)
		override var endOfPassWriteIndex: UInt
			get() = getUInt(endOfPassWriteIndexOffset)
			set(newValue) = set(endOfPassWriteIndexOffset, newValue)
	}

	actual var querySet: WGPUQuerySet?
	actual var beginningOfPassWriteIndex: UInt
	actual var endOfPassWriteIndex: UInt

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUComputePassTimestampWrites {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUComputePassTimestampWrites {
			return allocator.allocate(16L)
				.let { WGPUComputePassTimestampWrites(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUComputePassTimestampWrites) -> Unit): ArrayHolder<WGPUComputePassTimestampWrites> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUComputePassTimestampWrites(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("querySet"),
			ffi.C_INT.withName("beginningOfPassWriteIndex"),
			ffi.C_INT.withName("endOfPassWriteIndex"),
		).withName("WGPUComputePassTimestampWrites")

		val querySetOffset = 0L
		val querySetLayout = ffi.C_POINTER
		val beginningOfPassWriteIndexOffset = 8L
		val beginningOfPassWriteIndexLayout = ffi.C_INT
		val endOfPassWriteIndexOffset = 12L
		val endOfPassWriteIndexLayout = ffi.C_INT
	}
}
actual interface WGPUProgrammableStageDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var module: WGPUShaderModule?
			get() = get(moduleLayout, moduleOffset).let { WGPUShaderModule(it) }
			set(newValue) = set(moduleLayout, moduleOffset, newValue?.handler)
		override var entryPoint: CString?
			get() = get(entryPointLayout, entryPointOffset).let(::CString)
			set(newValue) = set(entryPointLayout, entryPointOffset, newValue?.handler)
		override var constantCount: ULong
			get() = getULong(constantCountOffset)
			set(newValue) = set(constantCountOffset, newValue)
		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = get(constantsLayout, constantsOffset).let(::ArrayHolder)
			set(newValue) = set(constantsLayout, constantsOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var module: WGPUShaderModule?
	actual var entryPoint: CString?
	actual var constantCount: ULong
	actual var constants: ArrayHolder<WGPUConstantEntry>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUProgrammableStageDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUProgrammableStageDescriptor {
			return allocator.allocate(40L)
				.let { WGPUProgrammableStageDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUProgrammableStageDescriptor) -> Unit): ArrayHolder<WGPUProgrammableStageDescriptor> {
			return allocator.allocate(40 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 40L)
							.let(::NativeAddress)
							.let { WGPUProgrammableStageDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("module"),
			ffi.C_POINTER.withName("entryPoint"),
			ffi.C_LONG.withName("constantCount"),
			ffi.C_POINTER.withName("constants"),
		).withName("WGPUProgrammableStageDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val moduleOffset = 8L
		val moduleLayout = ffi.C_POINTER
		val entryPointOffset = 16L
		val entryPointLayout = ffi.C_POINTER
		val constantCountOffset = 24L
		val constantCountLayout = ffi.C_LONG
		val constantsOffset = 32L
		val constantsLayout = ffi.C_POINTER
	}
}
actual interface WGPUComputePipelineDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var layout: WGPUPipelineLayout?
			get() = get(layoutLayout, layoutOffset).let { WGPUPipelineLayout(it) }
			set(newValue) = set(layoutLayout, layoutOffset, newValue?.handler)
		override val compute: WGPUProgrammableStageDescriptor
			get() = handler.handler.asSlice(computeOffset, 40L).let(::NativeAddress).let { WGPUProgrammableStageDescriptor(it) }
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var layout: WGPUPipelineLayout?
	actual val compute: WGPUProgrammableStageDescriptor

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUComputePipelineDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUComputePipelineDescriptor {
			return allocator.allocate(64L)
				.let { WGPUComputePipelineDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUComputePipelineDescriptor) -> Unit): ArrayHolder<WGPUComputePipelineDescriptor> {
			return allocator.allocate(64 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 64L)
							.let(::NativeAddress)
							.let { WGPUComputePipelineDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_POINTER.withName("layout"),
			WGPUProgrammableStageDescriptor.LAYOUT.withName("compute"),
		).withName("WGPUComputePipelineDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val layoutOffset = 16L
		val layoutLayout = ffi.C_POINTER
		val computeOffset = 24L
		val computeLayout = WGPUProgrammableStageDescriptor.LAYOUT
	}
}
actual interface WGPULimits : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPULimits {
		override var maxTextureDimension1D: UInt
			get() = getUInt(maxTextureDimension1DOffset)
			set(newValue) = set(maxTextureDimension1DOffset, newValue)
		override var maxTextureDimension2D: UInt
			get() = getUInt(maxTextureDimension2DOffset)
			set(newValue) = set(maxTextureDimension2DOffset, newValue)
		override var maxTextureDimension3D: UInt
			get() = getUInt(maxTextureDimension3DOffset)
			set(newValue) = set(maxTextureDimension3DOffset, newValue)
		override var maxTextureArrayLayers: UInt
			get() = getUInt(maxTextureArrayLayersOffset)
			set(newValue) = set(maxTextureArrayLayersOffset, newValue)
		override var maxBindGroups: UInt
			get() = getUInt(maxBindGroupsOffset)
			set(newValue) = set(maxBindGroupsOffset, newValue)
		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = getUInt(maxBindGroupsPlusVertexBuffersOffset)
			set(newValue) = set(maxBindGroupsPlusVertexBuffersOffset, newValue)
		override var maxBindingsPerBindGroup: UInt
			get() = getUInt(maxBindingsPerBindGroupOffset)
			set(newValue) = set(maxBindingsPerBindGroupOffset, newValue)
		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = getUInt(maxDynamicUniformBuffersPerPipelineLayoutOffset)
			set(newValue) = set(maxDynamicUniformBuffersPerPipelineLayoutOffset, newValue)
		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = getUInt(maxDynamicStorageBuffersPerPipelineLayoutOffset)
			set(newValue) = set(maxDynamicStorageBuffersPerPipelineLayoutOffset, newValue)
		override var maxSampledTexturesPerShaderStage: UInt
			get() = getUInt(maxSampledTexturesPerShaderStageOffset)
			set(newValue) = set(maxSampledTexturesPerShaderStageOffset, newValue)
		override var maxSamplersPerShaderStage: UInt
			get() = getUInt(maxSamplersPerShaderStageOffset)
			set(newValue) = set(maxSamplersPerShaderStageOffset, newValue)
		override var maxStorageBuffersPerShaderStage: UInt
			get() = getUInt(maxStorageBuffersPerShaderStageOffset)
			set(newValue) = set(maxStorageBuffersPerShaderStageOffset, newValue)
		override var maxStorageTexturesPerShaderStage: UInt
			get() = getUInt(maxStorageTexturesPerShaderStageOffset)
			set(newValue) = set(maxStorageTexturesPerShaderStageOffset, newValue)
		override var maxUniformBuffersPerShaderStage: UInt
			get() = getUInt(maxUniformBuffersPerShaderStageOffset)
			set(newValue) = set(maxUniformBuffersPerShaderStageOffset, newValue)
		override var maxUniformBufferBindingSize: ULong
			get() = getULong(maxUniformBufferBindingSizeOffset)
			set(newValue) = set(maxUniformBufferBindingSizeOffset, newValue)
		override var maxStorageBufferBindingSize: ULong
			get() = getULong(maxStorageBufferBindingSizeOffset)
			set(newValue) = set(maxStorageBufferBindingSizeOffset, newValue)
		override var minUniformBufferOffsetAlignment: UInt
			get() = getUInt(minUniformBufferOffsetAlignmentOffset)
			set(newValue) = set(minUniformBufferOffsetAlignmentOffset, newValue)
		override var minStorageBufferOffsetAlignment: UInt
			get() = getUInt(minStorageBufferOffsetAlignmentOffset)
			set(newValue) = set(minStorageBufferOffsetAlignmentOffset, newValue)
		override var maxVertexBuffers: UInt
			get() = getUInt(maxVertexBuffersOffset)
			set(newValue) = set(maxVertexBuffersOffset, newValue)
		override var maxBufferSize: ULong
			get() = getULong(maxBufferSizeOffset)
			set(newValue) = set(maxBufferSizeOffset, newValue)
		override var maxVertexAttributes: UInt
			get() = getUInt(maxVertexAttributesOffset)
			set(newValue) = set(maxVertexAttributesOffset, newValue)
		override var maxVertexBufferArrayStride: UInt
			get() = getUInt(maxVertexBufferArrayStrideOffset)
			set(newValue) = set(maxVertexBufferArrayStrideOffset, newValue)
		override var maxInterStageShaderComponents: UInt
			get() = getUInt(maxInterStageShaderComponentsOffset)
			set(newValue) = set(maxInterStageShaderComponentsOffset, newValue)
		override var maxInterStageShaderVariables: UInt
			get() = getUInt(maxInterStageShaderVariablesOffset)
			set(newValue) = set(maxInterStageShaderVariablesOffset, newValue)
		override var maxColorAttachments: UInt
			get() = getUInt(maxColorAttachmentsOffset)
			set(newValue) = set(maxColorAttachmentsOffset, newValue)
		override var maxColorAttachmentBytesPerSample: UInt
			get() = getUInt(maxColorAttachmentBytesPerSampleOffset)
			set(newValue) = set(maxColorAttachmentBytesPerSampleOffset, newValue)
		override var maxComputeWorkgroupStorageSize: UInt
			get() = getUInt(maxComputeWorkgroupStorageSizeOffset)
			set(newValue) = set(maxComputeWorkgroupStorageSizeOffset, newValue)
		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = getUInt(maxComputeInvocationsPerWorkgroupOffset)
			set(newValue) = set(maxComputeInvocationsPerWorkgroupOffset, newValue)
		override var maxComputeWorkgroupSizeX: UInt
			get() = getUInt(maxComputeWorkgroupSizeXOffset)
			set(newValue) = set(maxComputeWorkgroupSizeXOffset, newValue)
		override var maxComputeWorkgroupSizeY: UInt
			get() = getUInt(maxComputeWorkgroupSizeYOffset)
			set(newValue) = set(maxComputeWorkgroupSizeYOffset, newValue)
		override var maxComputeWorkgroupSizeZ: UInt
			get() = getUInt(maxComputeWorkgroupSizeZOffset)
			set(newValue) = set(maxComputeWorkgroupSizeZOffset, newValue)
		override var maxComputeWorkgroupsPerDimension: UInt
			get() = getUInt(maxComputeWorkgroupsPerDimensionOffset)
			set(newValue) = set(maxComputeWorkgroupsPerDimensionOffset, newValue)
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPULimits {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPULimits {
			return allocator.allocate(144L)
				.let { WGPULimits(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPULimits) -> Unit): ArrayHolder<WGPULimits> {
			return allocator.allocate(144 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 144L)
							.let(::NativeAddress)
							.let { WGPULimits(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_INT.withName("maxTextureDimension1D"),
			ffi.C_INT.withName("maxTextureDimension2D"),
			ffi.C_INT.withName("maxTextureDimension3D"),
			ffi.C_INT.withName("maxTextureArrayLayers"),
			ffi.C_INT.withName("maxBindGroups"),
			ffi.C_INT.withName("maxBindGroupsPlusVertexBuffers"),
			ffi.C_INT.withName("maxBindingsPerBindGroup"),
			ffi.C_INT.withName("maxDynamicUniformBuffersPerPipelineLayout"),
			ffi.C_INT.withName("maxDynamicStorageBuffersPerPipelineLayout"),
			ffi.C_INT.withName("maxSampledTexturesPerShaderStage"),
			ffi.C_INT.withName("maxSamplersPerShaderStage"),
			ffi.C_INT.withName("maxStorageBuffersPerShaderStage"),
			ffi.C_INT.withName("maxStorageTexturesPerShaderStage"),
			ffi.C_INT.withName("maxUniformBuffersPerShaderStage"),
			ffi.C_LONG.withName("maxUniformBufferBindingSize"),
			ffi.C_LONG.withName("maxStorageBufferBindingSize"),
			ffi.C_INT.withName("minUniformBufferOffsetAlignment"),
			ffi.C_INT.withName("minStorageBufferOffsetAlignment"),
			ffi.C_INT.withName("maxVertexBuffers"),
			MemoryLayout.paddingLayout(4),
			ffi.C_LONG.withName("maxBufferSize"),
			ffi.C_INT.withName("maxVertexAttributes"),
			ffi.C_INT.withName("maxVertexBufferArrayStride"),
			ffi.C_INT.withName("maxInterStageShaderComponents"),
			ffi.C_INT.withName("maxInterStageShaderVariables"),
			ffi.C_INT.withName("maxColorAttachments"),
			ffi.C_INT.withName("maxColorAttachmentBytesPerSample"),
			ffi.C_INT.withName("maxComputeWorkgroupStorageSize"),
			ffi.C_INT.withName("maxComputeInvocationsPerWorkgroup"),
			ffi.C_INT.withName("maxComputeWorkgroupSizeX"),
			ffi.C_INT.withName("maxComputeWorkgroupSizeY"),
			ffi.C_INT.withName("maxComputeWorkgroupSizeZ"),
			ffi.C_INT.withName("maxComputeWorkgroupsPerDimension"),
		).withName("WGPULimits")

		val maxTextureDimension1DOffset = 0L
		val maxTextureDimension1DLayout = ffi.C_INT
		val maxTextureDimension2DOffset = 4L
		val maxTextureDimension2DLayout = ffi.C_INT
		val maxTextureDimension3DOffset = 8L
		val maxTextureDimension3DLayout = ffi.C_INT
		val maxTextureArrayLayersOffset = 12L
		val maxTextureArrayLayersLayout = ffi.C_INT
		val maxBindGroupsOffset = 16L
		val maxBindGroupsLayout = ffi.C_INT
		val maxBindGroupsPlusVertexBuffersOffset = 20L
		val maxBindGroupsPlusVertexBuffersLayout = ffi.C_INT
		val maxBindingsPerBindGroupOffset = 24L
		val maxBindingsPerBindGroupLayout = ffi.C_INT
		val maxDynamicUniformBuffersPerPipelineLayoutOffset = 28L
		val maxDynamicUniformBuffersPerPipelineLayoutLayout = ffi.C_INT
		val maxDynamicStorageBuffersPerPipelineLayoutOffset = 32L
		val maxDynamicStorageBuffersPerPipelineLayoutLayout = ffi.C_INT
		val maxSampledTexturesPerShaderStageOffset = 36L
		val maxSampledTexturesPerShaderStageLayout = ffi.C_INT
		val maxSamplersPerShaderStageOffset = 40L
		val maxSamplersPerShaderStageLayout = ffi.C_INT
		val maxStorageBuffersPerShaderStageOffset = 44L
		val maxStorageBuffersPerShaderStageLayout = ffi.C_INT
		val maxStorageTexturesPerShaderStageOffset = 48L
		val maxStorageTexturesPerShaderStageLayout = ffi.C_INT
		val maxUniformBuffersPerShaderStageOffset = 52L
		val maxUniformBuffersPerShaderStageLayout = ffi.C_INT
		val maxUniformBufferBindingSizeOffset = 56L
		val maxUniformBufferBindingSizeLayout = ffi.C_LONG
		val maxStorageBufferBindingSizeOffset = 64L
		val maxStorageBufferBindingSizeLayout = ffi.C_LONG
		val minUniformBufferOffsetAlignmentOffset = 72L
		val minUniformBufferOffsetAlignmentLayout = ffi.C_INT
		val minStorageBufferOffsetAlignmentOffset = 76L
		val minStorageBufferOffsetAlignmentLayout = ffi.C_INT
		val maxVertexBuffersOffset = 80L
		val maxVertexBuffersLayout = ffi.C_INT
		val maxBufferSizeOffset = 88L
		val maxBufferSizeLayout = ffi.C_LONG
		val maxVertexAttributesOffset = 96L
		val maxVertexAttributesLayout = ffi.C_INT
		val maxVertexBufferArrayStrideOffset = 100L
		val maxVertexBufferArrayStrideLayout = ffi.C_INT
		val maxInterStageShaderComponentsOffset = 104L
		val maxInterStageShaderComponentsLayout = ffi.C_INT
		val maxInterStageShaderVariablesOffset = 108L
		val maxInterStageShaderVariablesLayout = ffi.C_INT
		val maxColorAttachmentsOffset = 112L
		val maxColorAttachmentsLayout = ffi.C_INT
		val maxColorAttachmentBytesPerSampleOffset = 116L
		val maxColorAttachmentBytesPerSampleLayout = ffi.C_INT
		val maxComputeWorkgroupStorageSizeOffset = 120L
		val maxComputeWorkgroupStorageSizeLayout = ffi.C_INT
		val maxComputeInvocationsPerWorkgroupOffset = 124L
		val maxComputeInvocationsPerWorkgroupLayout = ffi.C_INT
		val maxComputeWorkgroupSizeXOffset = 128L
		val maxComputeWorkgroupSizeXLayout = ffi.C_INT
		val maxComputeWorkgroupSizeYOffset = 132L
		val maxComputeWorkgroupSizeYLayout = ffi.C_INT
		val maxComputeWorkgroupSizeZOffset = 136L
		val maxComputeWorkgroupSizeZLayout = ffi.C_INT
		val maxComputeWorkgroupsPerDimensionOffset = 140L
		val maxComputeWorkgroupsPerDimensionLayout = ffi.C_INT
	}
}
actual interface WGPURequiredLimits : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURequiredLimits {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override val limits: WGPULimits
			get() = handler.handler.asSlice(limitsOffset, 144L).let(::NativeAddress).let { WGPULimits(it) }
	}

	actual var nextInChain: NativeAddress?
	actual val limits: WGPULimits

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURequiredLimits {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURequiredLimits {
			return allocator.allocate(152L)
				.let { WGPURequiredLimits(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURequiredLimits) -> Unit): ArrayHolder<WGPURequiredLimits> {
			return allocator.allocate(152 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 152L)
							.let(::NativeAddress)
							.let { WGPURequiredLimits(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			WGPULimits.LAYOUT.withName("limits"),
		).withName("WGPURequiredLimits")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val limitsOffset = 8L
		val limitsLayout = WGPULimits.LAYOUT
	}
}
actual interface WGPUSupportedLimits : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSupportedLimits {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override val limits: WGPULimits
			get() = handler.handler.asSlice(limitsOffset, 144L).let(::NativeAddress).let { WGPULimits(it) }
	}

	actual var nextInChain: NativeAddress?
	actual val limits: WGPULimits

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSupportedLimits {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSupportedLimits {
			return allocator.allocate(152L)
				.let { WGPUSupportedLimits(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSupportedLimits) -> Unit): ArrayHolder<WGPUSupportedLimits> {
			return allocator.allocate(152 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 152L)
							.let(::NativeAddress)
							.let { WGPUSupportedLimits(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			WGPULimits.LAYOUT.withName("limits"),
		).withName("WGPUSupportedLimits")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val limitsOffset = 8L
		val limitsLayout = WGPULimits.LAYOUT
	}
}
actual interface WGPUExtent3D : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUExtent3D {
		override var width: UInt
			get() = getUInt(widthOffset)
			set(newValue) = set(widthOffset, newValue)
		override var height: UInt
			get() = getUInt(heightOffset)
			set(newValue) = set(heightOffset, newValue)
		override var depthOrArrayLayers: UInt
			get() = getUInt(depthOrArrayLayersOffset)
			set(newValue) = set(depthOrArrayLayersOffset, newValue)
	}

	actual var width: UInt
	actual var height: UInt
	actual var depthOrArrayLayers: UInt

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUExtent3D {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUExtent3D {
			return allocator.allocate(12L)
				.let { WGPUExtent3D(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUExtent3D) -> Unit): ArrayHolder<WGPUExtent3D> {
			return allocator.allocate(12 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 12L)
							.let(::NativeAddress)
							.let { WGPUExtent3D(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_INT.withName("width"),
			ffi.C_INT.withName("height"),
			ffi.C_INT.withName("depthOrArrayLayers"),
		).withName("WGPUExtent3D")

		val widthOffset = 0L
		val widthLayout = ffi.C_INT
		val heightOffset = 4L
		val heightLayout = ffi.C_INT
		val depthOrArrayLayersOffset = 8L
		val depthOrArrayLayersLayout = ffi.C_INT
	}
}
actual interface WGPUTextureDataLayout : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUTextureDataLayout {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var offset: ULong
			get() = getULong(offsetOffset)
			set(newValue) = set(offsetOffset, newValue)
		override var bytesPerRow: UInt
			get() = getUInt(bytesPerRowOffset)
			set(newValue) = set(bytesPerRowOffset, newValue)
		override var rowsPerImage: UInt
			get() = getUInt(rowsPerImageOffset)
			set(newValue) = set(rowsPerImageOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var offset: ULong
	actual var bytesPerRow: UInt
	actual var rowsPerImage: UInt

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureDataLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureDataLayout {
			return allocator.allocate(24L)
				.let { WGPUTextureDataLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureDataLayout) -> Unit): ArrayHolder<WGPUTextureDataLayout> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUTextureDataLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_LONG.withName("offset"),
			ffi.C_INT.withName("bytesPerRow"),
			ffi.C_INT.withName("rowsPerImage"),
		).withName("WGPUTextureDataLayout")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val offsetOffset = 8L
		val offsetLayout = ffi.C_LONG
		val bytesPerRowOffset = 16L
		val bytesPerRowLayout = ffi.C_INT
		val rowsPerImageOffset = 20L
		val rowsPerImageLayout = ffi.C_INT
	}
}
actual interface WGPUImageCopyBuffer : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUImageCopyBuffer {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override val layout: WGPUTextureDataLayout
			get() = handler.handler.asSlice(layoutOffset, 24L).let(::NativeAddress).let { WGPUTextureDataLayout(it) }
		override var buffer: WGPUBuffer?
			get() = get(bufferLayout, bufferOffset).let { WGPUBuffer(it) }
			set(newValue) = set(bufferLayout, bufferOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual val layout: WGPUTextureDataLayout
	actual var buffer: WGPUBuffer?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUImageCopyBuffer {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUImageCopyBuffer {
			return allocator.allocate(40L)
				.let { WGPUImageCopyBuffer(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUImageCopyBuffer) -> Unit): ArrayHolder<WGPUImageCopyBuffer> {
			return allocator.allocate(40 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 40L)
							.let(::NativeAddress)
							.let { WGPUImageCopyBuffer(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			WGPUTextureDataLayout.LAYOUT.withName("layout"),
			ffi.C_POINTER.withName("buffer"),
		).withName("WGPUImageCopyBuffer")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val layoutOffset = 8L
		val layoutLayout = WGPUTextureDataLayout.LAYOUT
		val bufferOffset = 32L
		val bufferLayout = ffi.C_POINTER
	}
}
actual interface WGPUOrigin3D : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUOrigin3D {
		override var x: UInt
			get() = getUInt(xOffset)
			set(newValue) = set(xOffset, newValue)
		override var y: UInt
			get() = getUInt(yOffset)
			set(newValue) = set(yOffset, newValue)
		override var z: UInt
			get() = getUInt(zOffset)
			set(newValue) = set(zOffset, newValue)
	}

	actual var x: UInt
	actual var y: UInt
	actual var z: UInt

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUOrigin3D {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUOrigin3D {
			return allocator.allocate(12L)
				.let { WGPUOrigin3D(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUOrigin3D) -> Unit): ArrayHolder<WGPUOrigin3D> {
			return allocator.allocate(12 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 12L)
							.let(::NativeAddress)
							.let { WGPUOrigin3D(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_INT.withName("x"),
			ffi.C_INT.withName("y"),
			ffi.C_INT.withName("z"),
		).withName("WGPUOrigin3D")

		val xOffset = 0L
		val xLayout = ffi.C_INT
		val yOffset = 4L
		val yLayout = ffi.C_INT
		val zOffset = 8L
		val zLayout = ffi.C_INT
	}
}
actual interface WGPUImageCopyTexture : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUImageCopyTexture {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var texture: WGPUTexture?
			get() = get(textureLayout, textureOffset).let { WGPUTexture(it) }
			set(newValue) = set(textureLayout, textureOffset, newValue?.handler)
		override var mipLevel: UInt
			get() = getUInt(mipLevelOffset)
			set(newValue) = set(mipLevelOffset, newValue)
		override val origin: WGPUOrigin3D
			get() = handler.handler.asSlice(originOffset, 12L).let(::NativeAddress).let { WGPUOrigin3D(it) }
		override var aspect: WGPUTextureAspect
			get() = getUInt(aspectOffset)
			set(newValue) = set(aspectOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var texture: WGPUTexture?
	actual var mipLevel: UInt
	actual val origin: WGPUOrigin3D
	actual var aspect: WGPUTextureAspect

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUImageCopyTexture {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUImageCopyTexture {
			return allocator.allocate(40L)
				.let { WGPUImageCopyTexture(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUImageCopyTexture) -> Unit): ArrayHolder<WGPUImageCopyTexture> {
			return allocator.allocate(40 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 40L)
							.let(::NativeAddress)
							.let { WGPUImageCopyTexture(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("texture"),
			ffi.C_INT.withName("mipLevel"),
			WGPUOrigin3D.LAYOUT.withName("origin"),
			ffi.C_INT.withName("aspect"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUImageCopyTexture")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val textureOffset = 8L
		val textureLayout = ffi.C_POINTER
		val mipLevelOffset = 16L
		val mipLevelLayout = ffi.C_INT
		val originOffset = 20L
		val originLayout = WGPUOrigin3D.LAYOUT
		val aspectOffset = 32L
		val aspectLayout = ffi.C_INT
	}
}
actual interface WGPUInstanceDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
	}

	actual var nextInChain: NativeAddress?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUInstanceDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUInstanceDescriptor {
			return allocator.allocate(8L)
				.let { WGPUInstanceDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUInstanceDescriptor) -> Unit): ArrayHolder<WGPUInstanceDescriptor> {
			return allocator.allocate(8 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 8L)
							.let(::NativeAddress)
							.let { WGPUInstanceDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
		).withName("WGPUInstanceDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
	}
}
actual interface WGPUVertexAttribute : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = getUInt(formatOffset)
			set(newValue) = set(formatOffset, newValue)
		override var offset: ULong
			get() = getULong(offsetOffset)
			set(newValue) = set(offsetOffset, newValue)
		override var shaderLocation: UInt
			get() = getUInt(shaderLocationOffset)
			set(newValue) = set(shaderLocationOffset, newValue)
	}

	actual var format: WGPUVertexFormat
	actual var offset: ULong
	actual var shaderLocation: UInt

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUVertexAttribute {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUVertexAttribute {
			return allocator.allocate(24L)
				.let { WGPUVertexAttribute(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUVertexAttribute) -> Unit): ArrayHolder<WGPUVertexAttribute> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUVertexAttribute(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_INT.withName("format"),
			MemoryLayout.paddingLayout(4),
			ffi.C_LONG.withName("offset"),
			ffi.C_INT.withName("shaderLocation"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUVertexAttribute")

		val formatOffset = 0L
		val formatLayout = ffi.C_INT
		val offsetOffset = 8L
		val offsetLayout = ffi.C_LONG
		val shaderLocationOffset = 16L
		val shaderLocationLayout = ffi.C_INT
	}
}
actual interface WGPUVertexBufferLayout : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUVertexBufferLayout {
		override var arrayStride: ULong
			get() = getULong(arrayStrideOffset)
			set(newValue) = set(arrayStrideOffset, newValue)
		override var stepMode: WGPUVertexStepMode
			get() = getUInt(stepModeOffset)
			set(newValue) = set(stepModeOffset, newValue)
		override var attributeCount: ULong
			get() = getULong(attributeCountOffset)
			set(newValue) = set(attributeCountOffset, newValue)
		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = get(attributesLayout, attributesOffset).let(::ArrayHolder)
			set(newValue) = set(attributesLayout, attributesOffset, newValue?.handler)
	}

	actual var arrayStride: ULong
	actual var stepMode: WGPUVertexStepMode
	actual var attributeCount: ULong
	actual var attributes: ArrayHolder<WGPUVertexAttribute>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUVertexBufferLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUVertexBufferLayout {
			return allocator.allocate(32L)
				.let { WGPUVertexBufferLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUVertexBufferLayout) -> Unit): ArrayHolder<WGPUVertexBufferLayout> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUVertexBufferLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_LONG.withName("arrayStride"),
			ffi.C_INT.withName("stepMode"),
			MemoryLayout.paddingLayout(4),
			ffi.C_LONG.withName("attributeCount"),
			ffi.C_POINTER.withName("attributes"),
		).withName("WGPUVertexBufferLayout")

		val arrayStrideOffset = 0L
		val arrayStrideLayout = ffi.C_LONG
		val stepModeOffset = 8L
		val stepModeLayout = ffi.C_INT
		val attributeCountOffset = 16L
		val attributeCountLayout = ffi.C_LONG
		val attributesOffset = 24L
		val attributesLayout = ffi.C_POINTER
	}
}
actual interface WGPUPipelineLayoutDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var bindGroupLayoutCount: ULong
			get() = getULong(bindGroupLayoutCountOffset)
			set(newValue) = set(bindGroupLayoutCountOffset, newValue)
		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = get(bindGroupLayoutsLayout, bindGroupLayoutsOffset).let(::ArrayHolder)
			set(newValue) = set(bindGroupLayoutsLayout, bindGroupLayoutsOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var bindGroupLayoutCount: ULong
	actual var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPipelineLayoutDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPipelineLayoutDescriptor {
			return allocator.allocate(32L)
				.let { WGPUPipelineLayoutDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPipelineLayoutDescriptor) -> Unit): ArrayHolder<WGPUPipelineLayoutDescriptor> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUPipelineLayoutDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_LONG.withName("bindGroupLayoutCount"),
			ffi.C_POINTER.withName("bindGroupLayouts"),
		).withName("WGPUPipelineLayoutDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val bindGroupLayoutCountOffset = 16L
		val bindGroupLayoutCountLayout = ffi.C_LONG
		val bindGroupLayoutsOffset = 24L
		val bindGroupLayoutsLayout = ffi.C_POINTER
	}
}
actual interface WGPUQuerySetDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var type: WGPUQueryType
			get() = getUInt(typeOffset)
			set(newValue) = set(typeOffset, newValue)
		override var count: UInt
			get() = getUInt(countOffset)
			set(newValue) = set(countOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var type: WGPUQueryType
	actual var count: UInt

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUQuerySetDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUQuerySetDescriptor {
			return allocator.allocate(24L)
				.let { WGPUQuerySetDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUQuerySetDescriptor) -> Unit): ArrayHolder<WGPUQuerySetDescriptor> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUQuerySetDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_INT.withName("type"),
			ffi.C_INT.withName("count"),
		).withName("WGPUQuerySetDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val typeOffset = 16L
		val typeLayout = ffi.C_INT
		val countOffset = 20L
		val countLayout = ffi.C_INT
	}
}
actual interface WGPURenderBundleDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderBundleDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleDescriptor {
			return allocator.allocate(16L)
				.let { WGPURenderBundleDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderBundleDescriptor) -> Unit): ArrayHolder<WGPURenderBundleDescriptor> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPURenderBundleDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
		).withName("WGPURenderBundleDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
	}
}
actual interface WGPURenderBundleEncoderDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var colorFormatCount: ULong
			get() = getULong(colorFormatCountOffset)
			set(newValue) = set(colorFormatCountOffset, newValue)
		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = get(colorFormatsLayout, colorFormatsOffset).let(::ArrayHolder)
			set(newValue) = set(colorFormatsLayout, colorFormatsOffset, newValue?.handler)
		override var depthStencilFormat: WGPUTextureFormat
			get() = getUInt(depthStencilFormatOffset)
			set(newValue) = set(depthStencilFormatOffset, newValue)
		override var sampleCount: UInt
			get() = getUInt(sampleCountOffset)
			set(newValue) = set(sampleCountOffset, newValue)
		override var depthReadOnly: Boolean
			get() = getInt(depthReadOnlyOffset).toBoolean()
			set(newValue) = set(depthReadOnlyOffset, newValue)
		override var stencilReadOnly: Boolean
			get() = getInt(stencilReadOnlyOffset).toBoolean()
			set(newValue) = set(stencilReadOnlyOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var colorFormatCount: ULong
	actual var colorFormats: ArrayHolder<WGPUTextureFormat>?
	actual var depthStencilFormat: WGPUTextureFormat
	actual var sampleCount: UInt
	actual var depthReadOnly: Boolean
	actual var stencilReadOnly: Boolean

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderBundleEncoderDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleEncoderDescriptor {
			return allocator.allocate(48L)
				.let { WGPURenderBundleEncoderDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderBundleEncoderDescriptor) -> Unit): ArrayHolder<WGPURenderBundleEncoderDescriptor> {
			return allocator.allocate(48 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 48L)
							.let(::NativeAddress)
							.let { WGPURenderBundleEncoderDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_LONG.withName("colorFormatCount"),
			ffi.C_POINTER.withName("colorFormats"),
			ffi.C_INT.withName("depthStencilFormat"),
			ffi.C_INT.withName("sampleCount"),
			ffi.C_INT.withName("depthReadOnly"),
			ffi.C_INT.withName("stencilReadOnly"),
		).withName("WGPURenderBundleEncoderDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val colorFormatCountOffset = 16L
		val colorFormatCountLayout = ffi.C_LONG
		val colorFormatsOffset = 24L
		val colorFormatsLayout = ffi.C_POINTER
		val depthStencilFormatOffset = 32L
		val depthStencilFormatLayout = ffi.C_INT
		val sampleCountOffset = 36L
		val sampleCountLayout = ffi.C_INT
		val depthReadOnlyOffset = 40L
		val depthReadOnlyLayout = ffi.C_INT
		val stencilReadOnlyOffset = 44L
		val stencilReadOnlyLayout = ffi.C_INT
	}
}
actual interface WGPURenderPassColorAttachment : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var view: WGPUTextureView?
			get() = get(viewLayout, viewOffset).let { WGPUTextureView(it) }
			set(newValue) = set(viewLayout, viewOffset, newValue?.handler)
		override var depthSlice: UInt
			get() = getUInt(depthSliceOffset)
			set(newValue) = set(depthSliceOffset, newValue)
		override var resolveTarget: WGPUTextureView?
			get() = get(resolveTargetLayout, resolveTargetOffset).let { WGPUTextureView(it) }
			set(newValue) = set(resolveTargetLayout, resolveTargetOffset, newValue?.handler)
		override var loadOp: WGPULoadOp
			get() = getUInt(loadOpOffset)
			set(newValue) = set(loadOpOffset, newValue)
		override var storeOp: WGPUStoreOp
			get() = getUInt(storeOpOffset)
			set(newValue) = set(storeOpOffset, newValue)
		override val clearValue: WGPUColor
			get() = handler.handler.asSlice(clearValueOffset, 32L).let(::NativeAddress).let { WGPUColor(it) }
	}

	actual var nextInChain: NativeAddress?
	actual var view: WGPUTextureView?
	actual var depthSlice: UInt
	actual var resolveTarget: WGPUTextureView?
	actual var loadOp: WGPULoadOp
	actual var storeOp: WGPUStoreOp
	actual val clearValue: WGPUColor

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassColorAttachment {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassColorAttachment {
			return allocator.allocate(72L)
				.let { WGPURenderPassColorAttachment(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassColorAttachment) -> Unit): ArrayHolder<WGPURenderPassColorAttachment> {
			return allocator.allocate(72 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 72L)
							.let(::NativeAddress)
							.let { WGPURenderPassColorAttachment(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("view"),
			ffi.C_INT.withName("depthSlice"),
			MemoryLayout.paddingLayout(4),
			ffi.C_POINTER.withName("resolveTarget"),
			ffi.C_INT.withName("loadOp"),
			ffi.C_INT.withName("storeOp"),
			WGPUColor.LAYOUT.withName("clearValue"),
		).withName("WGPURenderPassColorAttachment")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val viewOffset = 8L
		val viewLayout = ffi.C_POINTER
		val depthSliceOffset = 16L
		val depthSliceLayout = ffi.C_INT
		val resolveTargetOffset = 24L
		val resolveTargetLayout = ffi.C_POINTER
		val loadOpOffset = 32L
		val loadOpLayout = ffi.C_INT
		val storeOpOffset = 36L
		val storeOpLayout = ffi.C_INT
		val clearValueOffset = 40L
		val clearValueLayout = WGPUColor.LAYOUT
	}
}
actual interface WGPURenderPassDepthStencilAttachment : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = get(viewLayout, viewOffset).let { WGPUTextureView(it) }
			set(newValue) = set(viewLayout, viewOffset, newValue?.handler)
		override var depthLoadOp: WGPULoadOp
			get() = getUInt(depthLoadOpOffset)
			set(newValue) = set(depthLoadOpOffset, newValue)
		override var depthStoreOp: WGPUStoreOp
			get() = getUInt(depthStoreOpOffset)
			set(newValue) = set(depthStoreOpOffset, newValue)
		override var depthClearValue: Float
			get() = getFloat(depthClearValueOffset)
			set(newValue) = set(depthClearValueOffset, newValue)
		override var depthReadOnly: Boolean
			get() = getInt(depthReadOnlyOffset).toBoolean()
			set(newValue) = set(depthReadOnlyOffset, newValue)
		override var stencilLoadOp: WGPULoadOp
			get() = getUInt(stencilLoadOpOffset)
			set(newValue) = set(stencilLoadOpOffset, newValue)
		override var stencilStoreOp: WGPUStoreOp
			get() = getUInt(stencilStoreOpOffset)
			set(newValue) = set(stencilStoreOpOffset, newValue)
		override var stencilClearValue: UInt
			get() = getUInt(stencilClearValueOffset)
			set(newValue) = set(stencilClearValueOffset, newValue)
		override var stencilReadOnly: Boolean
			get() = getInt(stencilReadOnlyOffset).toBoolean()
			set(newValue) = set(stencilReadOnlyOffset, newValue)
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassDepthStencilAttachment {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDepthStencilAttachment {
			return allocator.allocate(40L)
				.let { WGPURenderPassDepthStencilAttachment(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassDepthStencilAttachment) -> Unit): ArrayHolder<WGPURenderPassDepthStencilAttachment> {
			return allocator.allocate(40 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 40L)
							.let(::NativeAddress)
							.let { WGPURenderPassDepthStencilAttachment(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("view"),
			ffi.C_INT.withName("depthLoadOp"),
			ffi.C_INT.withName("depthStoreOp"),
			ffi.C_FLOAT.withName("depthClearValue"),
			ffi.C_INT.withName("depthReadOnly"),
			ffi.C_INT.withName("stencilLoadOp"),
			ffi.C_INT.withName("stencilStoreOp"),
			ffi.C_INT.withName("stencilClearValue"),
			ffi.C_INT.withName("stencilReadOnly"),
		).withName("WGPURenderPassDepthStencilAttachment")

		val viewOffset = 0L
		val viewLayout = ffi.C_POINTER
		val depthLoadOpOffset = 8L
		val depthLoadOpLayout = ffi.C_INT
		val depthStoreOpOffset = 12L
		val depthStoreOpLayout = ffi.C_INT
		val depthClearValueOffset = 16L
		val depthClearValueLayout = ffi.C_FLOAT
		val depthReadOnlyOffset = 20L
		val depthReadOnlyLayout = ffi.C_INT
		val stencilLoadOpOffset = 24L
		val stencilLoadOpLayout = ffi.C_INT
		val stencilStoreOpOffset = 28L
		val stencilStoreOpLayout = ffi.C_INT
		val stencilClearValueOffset = 32L
		val stencilClearValueLayout = ffi.C_INT
		val stencilReadOnlyOffset = 36L
		val stencilReadOnlyLayout = ffi.C_INT
	}
}
actual interface WGPURenderPassDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var colorAttachmentCount: ULong
			get() = getULong(colorAttachmentCountOffset)
			set(newValue) = set(colorAttachmentCountOffset, newValue)
		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = get(colorAttachmentsLayout, colorAttachmentsOffset).let(::ArrayHolder)
			set(newValue) = set(colorAttachmentsLayout, colorAttachmentsOffset, newValue?.handler)
		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = get(depthStencilAttachmentLayout, depthStencilAttachmentOffset).let { WGPURenderPassDepthStencilAttachment(it) }
			set(newValue) = set(depthStencilAttachmentLayout, depthStencilAttachmentOffset, newValue?.handler)
		override var occlusionQuerySet: WGPUQuerySet?
			get() = get(occlusionQuerySetLayout, occlusionQuerySetOffset).let { WGPUQuerySet(it) }
			set(newValue) = set(occlusionQuerySetLayout, occlusionQuerySetOffset, newValue?.handler)
		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = get(timestampWritesLayout, timestampWritesOffset).let { WGPURenderPassTimestampWrites(it) }
			set(newValue) = set(timestampWritesLayout, timestampWritesOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var colorAttachmentCount: ULong
	actual var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
	actual var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
	actual var occlusionQuerySet: WGPUQuerySet?
	actual var timestampWrites: WGPURenderPassTimestampWrites?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptor {
			return allocator.allocate(56L)
				.let { WGPURenderPassDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassDescriptor) -> Unit): ArrayHolder<WGPURenderPassDescriptor> {
			return allocator.allocate(56 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 56L)
							.let(::NativeAddress)
							.let { WGPURenderPassDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_LONG.withName("colorAttachmentCount"),
			ffi.C_POINTER.withName("colorAttachments"),
			ffi.C_POINTER.withName("depthStencilAttachment"),
			ffi.C_POINTER.withName("occlusionQuerySet"),
			ffi.C_POINTER.withName("timestampWrites"),
		).withName("WGPURenderPassDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val colorAttachmentCountOffset = 16L
		val colorAttachmentCountLayout = ffi.C_LONG
		val colorAttachmentsOffset = 24L
		val colorAttachmentsLayout = ffi.C_POINTER
		val depthStencilAttachmentOffset = 32L
		val depthStencilAttachmentLayout = ffi.C_POINTER
		val occlusionQuerySetOffset = 40L
		val occlusionQuerySetLayout = ffi.C_POINTER
		val timestampWritesOffset = 48L
		val timestampWritesLayout = ffi.C_POINTER
	}
}
actual interface WGPUChainedStruct : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = get(nextLayout, nextOffset).let { WGPUChainedStruct(it) }
			set(newValue) = set(nextLayout, nextOffset, newValue?.handler)
		override var sType: WGPUSType
			get() = getUInt(sTypeOffset)
			set(newValue) = set(sTypeOffset, newValue)
	}

	actual var next: WGPUChainedStruct?
	actual var sType: WGPUSType

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUChainedStruct {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUChainedStruct {
			return allocator.allocate(16L)
				.let { WGPUChainedStruct(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUChainedStruct) -> Unit): ArrayHolder<WGPUChainedStruct> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUChainedStruct(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("next"),
			ffi.C_INT.withName("sType"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUChainedStruct")

		val nextOffset = 0L
		val nextLayout = ffi.C_POINTER
		val sTypeOffset = 8L
		val sTypeLayout = ffi.C_INT
	}
}
actual interface WGPURenderPassDescriptorMaxDrawCount : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassDescriptorMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var maxDrawCount: ULong
			get() = getULong(maxDrawCountOffset)
			set(newValue) = set(maxDrawCountOffset, newValue)
	}

	actual val chain: WGPUChainedStruct
	actual var maxDrawCount: ULong

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassDescriptorMaxDrawCount {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptorMaxDrawCount {
			return allocator.allocate(24L)
				.let { WGPURenderPassDescriptorMaxDrawCount(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassDescriptorMaxDrawCount) -> Unit): ArrayHolder<WGPURenderPassDescriptorMaxDrawCount> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPURenderPassDescriptorMaxDrawCount(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_LONG.withName("maxDrawCount"),
		).withName("WGPURenderPassDescriptorMaxDrawCount")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val maxDrawCountOffset = 16L
		val maxDrawCountLayout = ffi.C_LONG
	}
}
actual interface WGPURenderPassTimestampWrites : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = get(querySetLayout, querySetOffset).let { WGPUQuerySet(it) }
			set(newValue) = set(querySetLayout, querySetOffset, newValue?.handler)
		override var beginningOfPassWriteIndex: UInt
			get() = getUInt(beginningOfPassWriteIndexOffset)
			set(newValue) = set(beginningOfPassWriteIndexOffset, newValue)
		override var endOfPassWriteIndex: UInt
			get() = getUInt(endOfPassWriteIndexOffset)
			set(newValue) = set(endOfPassWriteIndexOffset, newValue)
	}

	actual var querySet: WGPUQuerySet?
	actual var beginningOfPassWriteIndex: UInt
	actual var endOfPassWriteIndex: UInt

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassTimestampWrites {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassTimestampWrites {
			return allocator.allocate(16L)
				.let { WGPURenderPassTimestampWrites(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassTimestampWrites) -> Unit): ArrayHolder<WGPURenderPassTimestampWrites> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPURenderPassTimestampWrites(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("querySet"),
			ffi.C_INT.withName("beginningOfPassWriteIndex"),
			ffi.C_INT.withName("endOfPassWriteIndex"),
		).withName("WGPURenderPassTimestampWrites")

		val querySetOffset = 0L
		val querySetLayout = ffi.C_POINTER
		val beginningOfPassWriteIndexOffset = 8L
		val beginningOfPassWriteIndexLayout = ffi.C_INT
		val endOfPassWriteIndexOffset = 12L
		val endOfPassWriteIndexLayout = ffi.C_INT
	}
}
actual interface WGPUVertexState : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var module: WGPUShaderModule?
			get() = get(moduleLayout, moduleOffset).let { WGPUShaderModule(it) }
			set(newValue) = set(moduleLayout, moduleOffset, newValue?.handler)
		override var entryPoint: CString?
			get() = get(entryPointLayout, entryPointOffset).let(::CString)
			set(newValue) = set(entryPointLayout, entryPointOffset, newValue?.handler)
		override var constantCount: ULong
			get() = getULong(constantCountOffset)
			set(newValue) = set(constantCountOffset, newValue)
		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = get(constantsLayout, constantsOffset).let(::ArrayHolder)
			set(newValue) = set(constantsLayout, constantsOffset, newValue?.handler)
		override var bufferCount: ULong
			get() = getULong(bufferCountOffset)
			set(newValue) = set(bufferCountOffset, newValue)
		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = get(buffersLayout, buffersOffset).let(::ArrayHolder)
			set(newValue) = set(buffersLayout, buffersOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var module: WGPUShaderModule?
	actual var entryPoint: CString?
	actual var constantCount: ULong
	actual var constants: ArrayHolder<WGPUConstantEntry>?
	actual var bufferCount: ULong
	actual var buffers: ArrayHolder<WGPUVertexBufferLayout>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUVertexState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUVertexState {
			return allocator.allocate(56L)
				.let { WGPUVertexState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUVertexState) -> Unit): ArrayHolder<WGPUVertexState> {
			return allocator.allocate(56 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 56L)
							.let(::NativeAddress)
							.let { WGPUVertexState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("module"),
			ffi.C_POINTER.withName("entryPoint"),
			ffi.C_LONG.withName("constantCount"),
			ffi.C_POINTER.withName("constants"),
			ffi.C_LONG.withName("bufferCount"),
			ffi.C_POINTER.withName("buffers"),
		).withName("WGPUVertexState")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val moduleOffset = 8L
		val moduleLayout = ffi.C_POINTER
		val entryPointOffset = 16L
		val entryPointLayout = ffi.C_POINTER
		val constantCountOffset = 24L
		val constantCountLayout = ffi.C_LONG
		val constantsOffset = 32L
		val constantsLayout = ffi.C_POINTER
		val bufferCountOffset = 40L
		val bufferCountLayout = ffi.C_LONG
		val buffersOffset = 48L
		val buffersLayout = ffi.C_POINTER
	}
}
actual interface WGPUPrimitiveState : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var topology: WGPUPrimitiveTopology
			get() = getUInt(topologyOffset)
			set(newValue) = set(topologyOffset, newValue)
		override var stripIndexFormat: WGPUIndexFormat
			get() = getUInt(stripIndexFormatOffset)
			set(newValue) = set(stripIndexFormatOffset, newValue)
		override var frontFace: WGPUFrontFace
			get() = getUInt(frontFaceOffset)
			set(newValue) = set(frontFaceOffset, newValue)
		override var cullMode: WGPUCullMode
			get() = getUInt(cullModeOffset)
			set(newValue) = set(cullModeOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var topology: WGPUPrimitiveTopology
	actual var stripIndexFormat: WGPUIndexFormat
	actual var frontFace: WGPUFrontFace
	actual var cullMode: WGPUCullMode

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPrimitiveState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPrimitiveState {
			return allocator.allocate(24L)
				.let { WGPUPrimitiveState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPrimitiveState) -> Unit): ArrayHolder<WGPUPrimitiveState> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUPrimitiveState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("topology"),
			ffi.C_INT.withName("stripIndexFormat"),
			ffi.C_INT.withName("frontFace"),
			ffi.C_INT.withName("cullMode"),
		).withName("WGPUPrimitiveState")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val topologyOffset = 8L
		val topologyLayout = ffi.C_INT
		val stripIndexFormatOffset = 12L
		val stripIndexFormatLayout = ffi.C_INT
		val frontFaceOffset = 16L
		val frontFaceLayout = ffi.C_INT
		val cullModeOffset = 20L
		val cullModeLayout = ffi.C_INT
	}
}
actual interface WGPUPrimitiveDepthClipControl : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUPrimitiveDepthClipControl {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var unclippedDepth: Boolean
			get() = getInt(unclippedDepthOffset).toBoolean()
			set(newValue) = set(unclippedDepthOffset, newValue)
	}

	actual val chain: WGPUChainedStruct
	actual var unclippedDepth: Boolean

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPrimitiveDepthClipControl {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPrimitiveDepthClipControl {
			return allocator.allocate(24L)
				.let { WGPUPrimitiveDepthClipControl(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPrimitiveDepthClipControl) -> Unit): ArrayHolder<WGPUPrimitiveDepthClipControl> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUPrimitiveDepthClipControl(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_INT.withName("unclippedDepth"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUPrimitiveDepthClipControl")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val unclippedDepthOffset = 16L
		val unclippedDepthLayout = ffi.C_INT
	}
}
actual interface WGPUStencilFaceState : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = getUInt(compareOffset)
			set(newValue) = set(compareOffset, newValue)
		override var failOp: WGPUStencilOperation
			get() = getUInt(failOpOffset)
			set(newValue) = set(failOpOffset, newValue)
		override var depthFailOp: WGPUStencilOperation
			get() = getUInt(depthFailOpOffset)
			set(newValue) = set(depthFailOpOffset, newValue)
		override var passOp: WGPUStencilOperation
			get() = getUInt(passOpOffset)
			set(newValue) = set(passOpOffset, newValue)
	}

	actual var compare: WGPUCompareFunction
	actual var failOp: WGPUStencilOperation
	actual var depthFailOp: WGPUStencilOperation
	actual var passOp: WGPUStencilOperation

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUStencilFaceState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUStencilFaceState {
			return allocator.allocate(16L)
				.let { WGPUStencilFaceState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUStencilFaceState) -> Unit): ArrayHolder<WGPUStencilFaceState> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUStencilFaceState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_INT.withName("compare"),
			ffi.C_INT.withName("failOp"),
			ffi.C_INT.withName("depthFailOp"),
			ffi.C_INT.withName("passOp"),
		).withName("WGPUStencilFaceState")

		val compareOffset = 0L
		val compareLayout = ffi.C_INT
		val failOpOffset = 4L
		val failOpLayout = ffi.C_INT
		val depthFailOpOffset = 8L
		val depthFailOpLayout = ffi.C_INT
		val passOpOffset = 12L
		val passOpLayout = ffi.C_INT
	}
}
actual interface WGPUDepthStencilState : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) = set(formatOffset, newValue)
		override var depthWriteEnabled: Boolean
			get() = getInt(depthWriteEnabledOffset).toBoolean()
			set(newValue) = set(depthWriteEnabledOffset, newValue)
		override var depthCompare: WGPUCompareFunction
			get() = getUInt(depthCompareOffset)
			set(newValue) = set(depthCompareOffset, newValue)
		override val stencilFront: WGPUStencilFaceState
			get() = handler.handler.asSlice(stencilFrontOffset, 16L).let(::NativeAddress).let { WGPUStencilFaceState(it) }
		override val stencilBack: WGPUStencilFaceState
			get() = handler.handler.asSlice(stencilBackOffset, 16L).let(::NativeAddress).let { WGPUStencilFaceState(it) }
		override var stencilReadMask: UInt
			get() = getUInt(stencilReadMaskOffset)
			set(newValue) = set(stencilReadMaskOffset, newValue)
		override var stencilWriteMask: UInt
			get() = getUInt(stencilWriteMaskOffset)
			set(newValue) = set(stencilWriteMaskOffset, newValue)
		override var depthBias: Int
			get() = getInt(depthBiasOffset)
			set(newValue) = set(depthBiasOffset, newValue)
		override var depthBiasSlopeScale: Float
			get() = getFloat(depthBiasSlopeScaleOffset)
			set(newValue) = set(depthBiasSlopeScaleOffset, newValue)
		override var depthBiasClamp: Float
			get() = getFloat(depthBiasClampOffset)
			set(newValue) = set(depthBiasClampOffset, newValue)
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUDepthStencilState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUDepthStencilState {
			return allocator.allocate(72L)
				.let { WGPUDepthStencilState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUDepthStencilState) -> Unit): ArrayHolder<WGPUDepthStencilState> {
			return allocator.allocate(72 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 72L)
							.let(::NativeAddress)
							.let { WGPUDepthStencilState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("format"),
			ffi.C_INT.withName("depthWriteEnabled"),
			ffi.C_INT.withName("depthCompare"),
			WGPUStencilFaceState.LAYOUT.withName("stencilFront"),
			WGPUStencilFaceState.LAYOUT.withName("stencilBack"),
			ffi.C_INT.withName("stencilReadMask"),
			ffi.C_INT.withName("stencilWriteMask"),
			ffi.C_INT.withName("depthBias"),
			ffi.C_FLOAT.withName("depthBiasSlopeScale"),
			ffi.C_FLOAT.withName("depthBiasClamp"),
		).withName("WGPUDepthStencilState")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val formatOffset = 8L
		val formatLayout = ffi.C_INT
		val depthWriteEnabledOffset = 12L
		val depthWriteEnabledLayout = ffi.C_INT
		val depthCompareOffset = 16L
		val depthCompareLayout = ffi.C_INT
		val stencilFrontOffset = 20L
		val stencilFrontLayout = WGPUStencilFaceState.LAYOUT
		val stencilBackOffset = 36L
		val stencilBackLayout = WGPUStencilFaceState.LAYOUT
		val stencilReadMaskOffset = 52L
		val stencilReadMaskLayout = ffi.C_INT
		val stencilWriteMaskOffset = 56L
		val stencilWriteMaskLayout = ffi.C_INT
		val depthBiasOffset = 60L
		val depthBiasLayout = ffi.C_INT
		val depthBiasSlopeScaleOffset = 64L
		val depthBiasSlopeScaleLayout = ffi.C_FLOAT
		val depthBiasClampOffset = 68L
		val depthBiasClampLayout = ffi.C_FLOAT
	}
}
actual interface WGPUMultisampleState : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var count: UInt
			get() = getUInt(countOffset)
			set(newValue) = set(countOffset, newValue)
		override var mask: UInt
			get() = getUInt(maskOffset)
			set(newValue) = set(maskOffset, newValue)
		override var alphaToCoverageEnabled: Boolean
			get() = getInt(alphaToCoverageEnabledOffset).toBoolean()
			set(newValue) = set(alphaToCoverageEnabledOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var count: UInt
	actual var mask: UInt
	actual var alphaToCoverageEnabled: Boolean

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUMultisampleState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUMultisampleState {
			return allocator.allocate(24L)
				.let { WGPUMultisampleState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUMultisampleState) -> Unit): ArrayHolder<WGPUMultisampleState> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUMultisampleState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("count"),
			ffi.C_INT.withName("mask"),
			ffi.C_INT.withName("alphaToCoverageEnabled"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUMultisampleState")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val countOffset = 8L
		val countLayout = ffi.C_INT
		val maskOffset = 12L
		val maskLayout = ffi.C_INT
		val alphaToCoverageEnabledOffset = 16L
		val alphaToCoverageEnabledLayout = ffi.C_INT
	}
}
actual interface WGPUFragmentState : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var module: WGPUShaderModule?
			get() = get(moduleLayout, moduleOffset).let { WGPUShaderModule(it) }
			set(newValue) = set(moduleLayout, moduleOffset, newValue?.handler)
		override var entryPoint: CString?
			get() = get(entryPointLayout, entryPointOffset).let(::CString)
			set(newValue) = set(entryPointLayout, entryPointOffset, newValue?.handler)
		override var constantCount: ULong
			get() = getULong(constantCountOffset)
			set(newValue) = set(constantCountOffset, newValue)
		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = get(constantsLayout, constantsOffset).let(::ArrayHolder)
			set(newValue) = set(constantsLayout, constantsOffset, newValue?.handler)
		override var targetCount: ULong
			get() = getULong(targetCountOffset)
			set(newValue) = set(targetCountOffset, newValue)
		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = get(targetsLayout, targetsOffset).let(::ArrayHolder)
			set(newValue) = set(targetsLayout, targetsOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var module: WGPUShaderModule?
	actual var entryPoint: CString?
	actual var constantCount: ULong
	actual var constants: ArrayHolder<WGPUConstantEntry>?
	actual var targetCount: ULong
	actual var targets: ArrayHolder<WGPUColorTargetState>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUFragmentState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUFragmentState {
			return allocator.allocate(56L)
				.let { WGPUFragmentState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUFragmentState) -> Unit): ArrayHolder<WGPUFragmentState> {
			return allocator.allocate(56 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 56L)
							.let(::NativeAddress)
							.let { WGPUFragmentState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("module"),
			ffi.C_POINTER.withName("entryPoint"),
			ffi.C_LONG.withName("constantCount"),
			ffi.C_POINTER.withName("constants"),
			ffi.C_LONG.withName("targetCount"),
			ffi.C_POINTER.withName("targets"),
		).withName("WGPUFragmentState")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val moduleOffset = 8L
		val moduleLayout = ffi.C_POINTER
		val entryPointOffset = 16L
		val entryPointLayout = ffi.C_POINTER
		val constantCountOffset = 24L
		val constantCountLayout = ffi.C_LONG
		val constantsOffset = 32L
		val constantsLayout = ffi.C_POINTER
		val targetCountOffset = 40L
		val targetCountLayout = ffi.C_LONG
		val targetsOffset = 48L
		val targetsLayout = ffi.C_POINTER
	}
}
actual interface WGPUColorTargetState : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) = set(formatOffset, newValue)
		override var blend: WGPUBlendState?
			get() = get(blendLayout, blendOffset).let { WGPUBlendState(it) }
			set(newValue) = set(blendLayout, blendOffset, newValue?.handler)
		override var writeMask: UInt
			get() = getUInt(writeMaskOffset)
			set(newValue) = set(writeMaskOffset, newValue)
	}

	actual var nextInChain: NativeAddress?
	actual var format: WGPUTextureFormat
	actual var blend: WGPUBlendState?
	actual var writeMask: UInt

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUColorTargetState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUColorTargetState {
			return allocator.allocate(32L)
				.let { WGPUColorTargetState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUColorTargetState) -> Unit): ArrayHolder<WGPUColorTargetState> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUColorTargetState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_INT.withName("format"),
			MemoryLayout.paddingLayout(4),
			ffi.C_POINTER.withName("blend"),
			ffi.C_INT.withName("writeMask"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUColorTargetState")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val formatOffset = 8L
		val formatLayout = ffi.C_INT
		val blendOffset = 16L
		val blendLayout = ffi.C_POINTER
		val writeMaskOffset = 24L
		val writeMaskLayout = ffi.C_INT
	}
}
actual interface WGPUBlendState : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUBlendState {
		override val color: WGPUBlendComponent
			get() = handler.handler.asSlice(colorOffset, 12L).let(::NativeAddress).let { WGPUBlendComponent(it) }
		override val alpha: WGPUBlendComponent
			get() = handler.handler.asSlice(alphaOffset, 12L).let(::NativeAddress).let { WGPUBlendComponent(it) }
	}

	actual val color: WGPUBlendComponent
	actual val alpha: WGPUBlendComponent

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBlendState {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBlendState {
			return allocator.allocate(24L)
				.let { WGPUBlendState(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBlendState) -> Unit): ArrayHolder<WGPUBlendState> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUBlendState(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUBlendComponent.LAYOUT.withName("color"),
			WGPUBlendComponent.LAYOUT.withName("alpha"),
		).withName("WGPUBlendState")

		val colorOffset = 0L
		val colorLayout = WGPUBlendComponent.LAYOUT
		val alphaOffset = 12L
		val alphaLayout = WGPUBlendComponent.LAYOUT
	}
}
actual interface WGPURenderPipelineDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var layout: WGPUPipelineLayout?
			get() = get(layoutLayout, layoutOffset).let { WGPUPipelineLayout(it) }
			set(newValue) = set(layoutLayout, layoutOffset, newValue?.handler)
		override val vertex: WGPUVertexState
			get() = handler.handler.asSlice(vertexOffset, 56L).let(::NativeAddress).let { WGPUVertexState(it) }
		override val primitive: WGPUPrimitiveState
			get() = handler.handler.asSlice(primitiveOffset, 24L).let(::NativeAddress).let { WGPUPrimitiveState(it) }
		override var depthStencil: WGPUDepthStencilState?
			get() = get(depthStencilLayout, depthStencilOffset).let { WGPUDepthStencilState(it) }
			set(newValue) = set(depthStencilLayout, depthStencilOffset, newValue?.handler)
		override val multisample: WGPUMultisampleState
			get() = handler.handler.asSlice(multisampleOffset, 24L).let(::NativeAddress).let { WGPUMultisampleState(it) }
		override var fragment: WGPUFragmentState?
			get() = get(fragmentLayout, fragmentOffset).let { WGPUFragmentState(it) }
			set(newValue) = set(fragmentLayout, fragmentOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var layout: WGPUPipelineLayout?
	actual val vertex: WGPUVertexState
	actual val primitive: WGPUPrimitiveState
	actual var depthStencil: WGPUDepthStencilState?
	actual val multisample: WGPUMultisampleState
	actual var fragment: WGPUFragmentState?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPipelineDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPipelineDescriptor {
			return allocator.allocate(144L)
				.let { WGPURenderPipelineDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPipelineDescriptor) -> Unit): ArrayHolder<WGPURenderPipelineDescriptor> {
			return allocator.allocate(144 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 144L)
							.let(::NativeAddress)
							.let { WGPURenderPipelineDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_POINTER.withName("layout"),
			WGPUVertexState.LAYOUT.withName("vertex"),
			WGPUPrimitiveState.LAYOUT.withName("primitive"),
			ffi.C_POINTER.withName("depthStencil"),
			WGPUMultisampleState.LAYOUT.withName("multisample"),
			ffi.C_POINTER.withName("fragment"),
		).withName("WGPURenderPipelineDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val layoutOffset = 16L
		val layoutLayout = ffi.C_POINTER
		val vertexOffset = 24L
		val vertexLayout = WGPUVertexState.LAYOUT
		val primitiveOffset = 80L
		val primitiveLayout = WGPUPrimitiveState.LAYOUT
		val depthStencilOffset = 104L
		val depthStencilLayout = ffi.C_POINTER
		val multisampleOffset = 112L
		val multisampleLayout = WGPUMultisampleState.LAYOUT
		val fragmentOffset = 136L
		val fragmentLayout = ffi.C_POINTER
	}
}
actual interface WGPUSamplerDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var addressModeU: WGPUAddressMode
			get() = getUInt(addressModeUOffset)
			set(newValue) = set(addressModeUOffset, newValue)
		override var addressModeV: WGPUAddressMode
			get() = getUInt(addressModeVOffset)
			set(newValue) = set(addressModeVOffset, newValue)
		override var addressModeW: WGPUAddressMode
			get() = getUInt(addressModeWOffset)
			set(newValue) = set(addressModeWOffset, newValue)
		override var magFilter: WGPUFilterMode
			get() = getUInt(magFilterOffset)
			set(newValue) = set(magFilterOffset, newValue)
		override var minFilter: WGPUFilterMode
			get() = getUInt(minFilterOffset)
			set(newValue) = set(minFilterOffset, newValue)
		override var mipmapFilter: WGPUMipmapFilterMode
			get() = getUInt(mipmapFilterOffset)
			set(newValue) = set(mipmapFilterOffset, newValue)
		override var lodMinClamp: Float
			get() = getFloat(lodMinClampOffset)
			set(newValue) = set(lodMinClampOffset, newValue)
		override var lodMaxClamp: Float
			get() = getFloat(lodMaxClampOffset)
			set(newValue) = set(lodMaxClampOffset, newValue)
		override var compare: WGPUCompareFunction
			get() = getUInt(compareOffset)
			set(newValue) = set(compareOffset, newValue)
		override var maxAnisotropy: UShort
			get() = getUShort(maxAnisotropyOffset)
			set(newValue) = set(maxAnisotropyOffset, newValue)
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSamplerDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSamplerDescriptor {
			return allocator.allocate(60L)
				.let { WGPUSamplerDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSamplerDescriptor) -> Unit): ArrayHolder<WGPUSamplerDescriptor> {
			return allocator.allocate(60 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 60L)
							.let(::NativeAddress)
							.let { WGPUSamplerDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_INT.withName("addressModeU"),
			ffi.C_INT.withName("addressModeV"),
			ffi.C_INT.withName("addressModeW"),
			ffi.C_INT.withName("magFilter"),
			ffi.C_INT.withName("minFilter"),
			ffi.C_INT.withName("mipmapFilter"),
			ffi.C_FLOAT.withName("lodMinClamp"),
			ffi.C_FLOAT.withName("lodMaxClamp"),
			ffi.C_INT.withName("compare"),
			ffi.C_SHORT.withName("maxAnisotropy"),
			MemoryLayout.paddingLayout(6)
		).withName("WGPUSamplerDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val addressModeUOffset = 16L
		val addressModeULayout = ffi.C_INT
		val addressModeVOffset = 20L
		val addressModeVLayout = ffi.C_INT
		val addressModeWOffset = 24L
		val addressModeWLayout = ffi.C_INT
		val magFilterOffset = 28L
		val magFilterLayout = ffi.C_INT
		val minFilterOffset = 32L
		val minFilterLayout = ffi.C_INT
		val mipmapFilterOffset = 36L
		val mipmapFilterLayout = ffi.C_INT
		val lodMinClampOffset = 40L
		val lodMinClampLayout = ffi.C_FLOAT
		val lodMaxClampOffset = 44L
		val lodMaxClampLayout = ffi.C_FLOAT
		val compareOffset = 48L
		val compareLayout = ffi.C_INT
		val maxAnisotropyOffset = 52L
		val maxAnisotropyLayout = ffi.C_SHORT
	}
}
actual interface WGPUShaderModuleDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var hintCount: ULong
			get() = getULong(hintCountOffset)
			set(newValue) = set(hintCountOffset, newValue)
		override var hints: ArrayHolder<WGPUShaderModuleCompilationHint>?
			get() = get(hintsLayout, hintsOffset).let(::ArrayHolder)
			set(newValue) = set(hintsLayout, hintsOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?
	actual var hintCount: ULong
	actual var hints: ArrayHolder<WGPUShaderModuleCompilationHint>?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleDescriptor {
			return allocator.allocate(32L)
				.let { WGPUShaderModuleDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleDescriptor> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUShaderModuleDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_LONG.withName("hintCount"),
			ffi.C_POINTER.withName("hints"),
		).withName("WGPUShaderModuleDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val hintCountOffset = 16L
		val hintCountLayout = ffi.C_LONG
		val hintsOffset = 24L
		val hintsLayout = ffi.C_POINTER
	}
}
actual interface WGPUShaderModuleCompilationHint : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUShaderModuleCompilationHint {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var entryPoint: CString?
			get() = get(entryPointLayout, entryPointOffset).let(::CString)
			set(newValue) = set(entryPointLayout, entryPointOffset, newValue?.handler)
		override var layout: WGPUPipelineLayout?
			get() = get(layoutLayout, layoutOffset).let { WGPUPipelineLayout(it) }
			set(newValue) = set(layoutLayout, layoutOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var entryPoint: CString?
	actual var layout: WGPUPipelineLayout?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleCompilationHint {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleCompilationHint {
			return allocator.allocate(24L)
				.let { WGPUShaderModuleCompilationHint(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleCompilationHint) -> Unit): ArrayHolder<WGPUShaderModuleCompilationHint> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUShaderModuleCompilationHint(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("entryPoint"),
			ffi.C_POINTER.withName("layout"),
		).withName("WGPUShaderModuleCompilationHint")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val entryPointOffset = 8L
		val entryPointLayout = ffi.C_POINTER
		val layoutOffset = 16L
		val layoutLayout = ffi.C_POINTER
	}
}
actual interface WGPUShaderModuleSPIRVDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUShaderModuleSPIRVDescriptor {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var codeSize: UInt
			get() = getUInt(codeSizeOffset)
			set(newValue) = set(codeSizeOffset, newValue)
		override var code: NativeAddress?
			get() = get(codeLayout, codeOffset)
			set(newValue) = set(codeLayout, codeOffset, newValue)
	}

	actual val chain: WGPUChainedStruct
	actual var codeSize: UInt
	actual var code: NativeAddress?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleSPIRVDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleSPIRVDescriptor {
			return allocator.allocate(32L)
				.let { WGPUShaderModuleSPIRVDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleSPIRVDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleSPIRVDescriptor> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUShaderModuleSPIRVDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_INT.withName("codeSize"),
			MemoryLayout.paddingLayout(4),
			ffi.C_POINTER.withName("code"),
		).withName("WGPUShaderModuleSPIRVDescriptor")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val codeSizeOffset = 16L
		val codeSizeLayout = ffi.C_INT
		val codeOffset = 24L
		val codeLayout = ffi.C_POINTER
	}
}
actual interface WGPUShaderModuleWGSLDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUShaderModuleWGSLDescriptor {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var code: CString?
			get() = get(codeLayout, codeOffset).let(::CString)
			set(newValue) = set(codeLayout, codeOffset, newValue?.handler)
	}

	actual val chain: WGPUChainedStruct
	actual var code: CString?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderModuleWGSLDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleWGSLDescriptor {
			return allocator.allocate(24L)
				.let { WGPUShaderModuleWGSLDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderModuleWGSLDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleWGSLDescriptor> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUShaderModuleWGSLDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_POINTER.withName("code"),
		).withName("WGPUShaderModuleWGSLDescriptor")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val codeOffset = 16L
		val codeLayout = ffi.C_POINTER
	}
}
actual interface WGPUSurfaceDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
	}

	actual var nextInChain: NativeAddress?
	actual var label: CString?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptor {
			return allocator.allocate(16L)
				.let { WGPUSurfaceDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptor) -> Unit): ArrayHolder<WGPUSurfaceDescriptor> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
		).withName("WGPUSurfaceDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
	}
}
actual interface WGPUSurfaceDescriptorFromAndroidNativeWindow : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var window: NativeAddress?
			get() = get(windowLayout, windowOffset)
			set(newValue) = set(windowLayout, windowOffset, newValue)
	}

	actual val chain: WGPUChainedStruct
	actual var window: NativeAddress?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromAndroidNativeWindow {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromAndroidNativeWindow {
			return allocator.allocate(24L)
				.let { WGPUSurfaceDescriptorFromAndroidNativeWindow(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromAndroidNativeWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromAndroidNativeWindow> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromAndroidNativeWindow(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_POINTER.withName("window"),
		).withName("WGPUSurfaceDescriptorFromAndroidNativeWindow")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val windowOffset = 16L
		val windowLayout = ffi.C_POINTER
	}
}
actual interface WGPUSurfaceDescriptorFromCanvasHTMLSelector : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromCanvasHTMLSelector {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var selector: CString?
			get() = get(selectorLayout, selectorOffset).let(::CString)
			set(newValue) = set(selectorLayout, selectorOffset, newValue?.handler)
	}

	actual val chain: WGPUChainedStruct
	actual var selector: CString?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromCanvasHTMLSelector {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromCanvasHTMLSelector {
			return allocator.allocate(24L)
				.let { WGPUSurfaceDescriptorFromCanvasHTMLSelector(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromCanvasHTMLSelector) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromCanvasHTMLSelector> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromCanvasHTMLSelector(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_POINTER.withName("selector"),
		).withName("WGPUSurfaceDescriptorFromCanvasHTMLSelector")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val selectorOffset = 16L
		val selectorLayout = ffi.C_POINTER
	}
}
actual interface WGPUSurfaceDescriptorFromMetalLayer : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var layer: NativeAddress?
			get() = get(layerLayout, layerOffset)
			set(newValue) = set(layerLayout, layerOffset, newValue)
	}

	actual val chain: WGPUChainedStruct
	actual var layer: NativeAddress?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromMetalLayer {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromMetalLayer {
			return allocator.allocate(24L)
				.let { WGPUSurfaceDescriptorFromMetalLayer(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromMetalLayer) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromMetalLayer> {
			return allocator.allocate(24 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 24L)
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromMetalLayer(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_POINTER.withName("layer"),
		).withName("WGPUSurfaceDescriptorFromMetalLayer")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val layerOffset = 16L
		val layerLayout = ffi.C_POINTER
	}
}
actual interface WGPUSurfaceDescriptorFromWindowsHWND : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var hinstance: NativeAddress?
			get() = get(hinstanceLayout, hinstanceOffset)
			set(newValue) = set(hinstanceLayout, hinstanceOffset, newValue)
		override var hwnd: NativeAddress?
			get() = get(hwndLayout, hwndOffset)
			set(newValue) = set(hwndLayout, hwndOffset, newValue)
	}

	actual val chain: WGPUChainedStruct
	actual var hinstance: NativeAddress?
	actual var hwnd: NativeAddress?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromWindowsHWND {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromWindowsHWND {
			return allocator.allocate(32L)
				.let { WGPUSurfaceDescriptorFromWindowsHWND(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromWindowsHWND) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromWindowsHWND> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromWindowsHWND(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_POINTER.withName("hinstance"),
			ffi.C_POINTER.withName("hwnd"),
		).withName("WGPUSurfaceDescriptorFromWindowsHWND")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val hinstanceOffset = 16L
		val hinstanceLayout = ffi.C_POINTER
		val hwndOffset = 24L
		val hwndLayout = ffi.C_POINTER
	}
}
actual interface WGPUSurfaceDescriptorFromXcbWindow : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromXcbWindow {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var connection: NativeAddress?
			get() = get(connectionLayout, connectionOffset)
			set(newValue) = set(connectionLayout, connectionOffset, newValue)
		override var window: UInt
			get() = getUInt(windowOffset)
			set(newValue) = set(windowOffset, newValue)
	}

	actual val chain: WGPUChainedStruct
	actual var connection: NativeAddress?
	actual var window: UInt

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromXcbWindow {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromXcbWindow {
			return allocator.allocate(32L)
				.let { WGPUSurfaceDescriptorFromXcbWindow(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromXcbWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromXcbWindow> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromXcbWindow(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_POINTER.withName("connection"),
			ffi.C_INT.withName("window"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUSurfaceDescriptorFromXcbWindow")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val connectionOffset = 16L
		val connectionLayout = ffi.C_POINTER
		val windowOffset = 24L
		val windowLayout = ffi.C_INT
	}
}
actual interface WGPUSurfaceDescriptorFromXlibWindow : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var display: NativeAddress?
			get() = get(displayLayout, displayOffset)
			set(newValue) = set(displayLayout, displayOffset, newValue)
		override var window: ULong
			get() = getULong(windowOffset)
			set(newValue) = set(windowOffset, newValue)
	}

	actual val chain: WGPUChainedStruct
	actual var display: NativeAddress?
	actual var window: ULong

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromXlibWindow {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromXlibWindow {
			return allocator.allocate(32L)
				.let { WGPUSurfaceDescriptorFromXlibWindow(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromXlibWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromXlibWindow> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromXlibWindow(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_POINTER.withName("display"),
			ffi.C_LONG.withName("window"),
		).withName("WGPUSurfaceDescriptorFromXlibWindow")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val displayOffset = 16L
		val displayLayout = ffi.C_POINTER
		val windowOffset = 24L
		val windowLayout = ffi.C_LONG
	}
}
actual interface WGPUSurfaceDescriptorFromWaylandSurface : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptorFromWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var display: NativeAddress?
			get() = get(displayLayout, displayOffset)
			set(newValue) = set(displayLayout, displayOffset, newValue)
		override var surface: NativeAddress?
			get() = get(surfaceLayout, surfaceOffset)
			set(newValue) = set(surfaceLayout, surfaceOffset, newValue)
	}

	actual val chain: WGPUChainedStruct
	actual var display: NativeAddress?
	actual var surface: NativeAddress?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromWaylandSurface {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromWaylandSurface {
			return allocator.allocate(32L)
				.let { WGPUSurfaceDescriptorFromWaylandSurface(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceDescriptorFromWaylandSurface) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromWaylandSurface> {
			return allocator.allocate(32 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 32L)
							.let(::NativeAddress)
							.let { WGPUSurfaceDescriptorFromWaylandSurface(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_POINTER.withName("display"),
			ffi.C_POINTER.withName("surface"),
		).withName("WGPUSurfaceDescriptorFromWaylandSurface")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val displayOffset = 16L
		val displayLayout = ffi.C_POINTER
		val surfaceOffset = 24L
		val surfaceLayout = ffi.C_POINTER
	}
}
actual interface WGPUSurfaceTexture : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceTexture {
		override var texture: WGPUTexture?
			get() = get(textureLayout, textureOffset).let { WGPUTexture(it) }
			set(newValue) = set(textureLayout, textureOffset, newValue?.handler)
		override var suboptimal: Boolean
			get() = getInt(suboptimalOffset).toBoolean()
			set(newValue) = set(suboptimalOffset, newValue)
		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = getUInt(statusOffset)
			set(newValue) = set(statusOffset, newValue)
	}

	actual var texture: WGPUTexture?
	actual var suboptimal: Boolean
	actual var status: WGPUSurfaceGetCurrentTextureStatus

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceTexture {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceTexture {
			return allocator.allocate(16L)
				.let { WGPUSurfaceTexture(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceTexture) -> Unit): ArrayHolder<WGPUSurfaceTexture> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUSurfaceTexture(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("texture"),
			ffi.C_INT.withName("suboptimal"),
			ffi.C_INT.withName("status"),
		).withName("WGPUSurfaceTexture")

		val textureOffset = 0L
		val textureLayout = ffi.C_POINTER
		val suboptimalOffset = 8L
		val suboptimalLayout = ffi.C_INT
		val statusOffset = 12L
		val statusLayout = ffi.C_INT
	}
}
actual interface WGPUTextureDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var usage: UInt
			get() = getUInt(usageOffset)
			set(newValue) = set(usageOffset, newValue)
		override var dimension: WGPUTextureDimension
			get() = getUInt(dimensionOffset)
			set(newValue) = set(dimensionOffset, newValue)
		override val size: WGPUExtent3D
			get() = handler.handler.asSlice(sizeOffset, 12L).let(::NativeAddress).let { WGPUExtent3D(it) }
		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) = set(formatOffset, newValue)
		override var mipLevelCount: UInt
			get() = getUInt(mipLevelCountOffset)
			set(newValue) = set(mipLevelCountOffset, newValue)
		override var sampleCount: UInt
			get() = getUInt(sampleCountOffset)
			set(newValue) = set(sampleCountOffset, newValue)
		override var viewFormatCount: ULong
			get() = getULong(viewFormatCountOffset)
			set(newValue) = set(viewFormatCountOffset, newValue)
		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = get(viewFormatsLayout, viewFormatsOffset).let(::ArrayHolder)
			set(newValue) = set(viewFormatsLayout, viewFormatsOffset, newValue?.handler)
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureDescriptor {
			return allocator.allocate(64L)
				.let { WGPUTextureDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureDescriptor) -> Unit): ArrayHolder<WGPUTextureDescriptor> {
			return allocator.allocate(64 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 64L)
							.let(::NativeAddress)
							.let { WGPUTextureDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_INT.withName("usage"),
			ffi.C_INT.withName("dimension"),
			WGPUExtent3D.LAYOUT.withName("size"),
			ffi.C_INT.withName("format"),
			ffi.C_INT.withName("mipLevelCount"),
			ffi.C_INT.withName("sampleCount"),
			ffi.C_LONG.withName("viewFormatCount"),
			ffi.C_POINTER.withName("viewFormats"),
		).withName("WGPUTextureDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val usageOffset = 16L
		val usageLayout = ffi.C_INT
		val dimensionOffset = 20L
		val dimensionLayout = ffi.C_INT
		val sizeOffset = 24L
		val sizeLayout = WGPUExtent3D.LAYOUT
		val formatOffset = 36L
		val formatLayout = ffi.C_INT
		val mipLevelCountOffset = 40L
		val mipLevelCountLayout = ffi.C_INT
		val sampleCountOffset = 44L
		val sampleCountLayout = ffi.C_INT
		val viewFormatCountOffset = 48L
		val viewFormatCountLayout = ffi.C_LONG
		val viewFormatsOffset = 56L
		val viewFormatsLayout = ffi.C_POINTER
	}
}
actual interface WGPUTextureViewDescriptor : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) = set(nextInChainLayout, nextInChainOffset, newValue)
		override var label: CString?
			get() = get(labelLayout, labelOffset).let(::CString)
			set(newValue) = set(labelLayout, labelOffset, newValue?.handler)
		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) = set(formatOffset, newValue)
		override var dimension: WGPUTextureViewDimension
			get() = getUInt(dimensionOffset)
			set(newValue) = set(dimensionOffset, newValue)
		override var baseMipLevel: UInt
			get() = getUInt(baseMipLevelOffset)
			set(newValue) = set(baseMipLevelOffset, newValue)
		override var mipLevelCount: UInt
			get() = getUInt(mipLevelCountOffset)
			set(newValue) = set(mipLevelCountOffset, newValue)
		override var baseArrayLayer: UInt
			get() = getUInt(baseArrayLayerOffset)
			set(newValue) = set(baseArrayLayerOffset, newValue)
		override var arrayLayerCount: UInt
			get() = getUInt(arrayLayerCountOffset)
			set(newValue) = set(arrayLayerCountOffset, newValue)
		override var aspect: WGPUTextureAspect
			get() = getUInt(aspectOffset)
			set(newValue) = set(aspectOffset, newValue)
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

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTextureViewDescriptor {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTextureViewDescriptor {
			return allocator.allocate(48L)
				.let { WGPUTextureViewDescriptor(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTextureViewDescriptor) -> Unit): ArrayHolder<WGPUTextureViewDescriptor> {
			return allocator.allocate(48 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 48L)
							.let(::NativeAddress)
							.let { WGPUTextureViewDescriptor(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("nextInChain"),
			ffi.C_POINTER.withName("label"),
			ffi.C_INT.withName("format"),
			ffi.C_INT.withName("dimension"),
			ffi.C_INT.withName("baseMipLevel"),
			ffi.C_INT.withName("mipLevelCount"),
			ffi.C_INT.withName("baseArrayLayer"),
			ffi.C_INT.withName("arrayLayerCount"),
			ffi.C_INT.withName("aspect"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUTextureViewDescriptor")

		val nextInChainOffset = 0L
		val nextInChainLayout = ffi.C_POINTER
		val labelOffset = 8L
		val labelLayout = ffi.C_POINTER
		val formatOffset = 16L
		val formatLayout = ffi.C_INT
		val dimensionOffset = 20L
		val dimensionLayout = ffi.C_INT
		val baseMipLevelOffset = 24L
		val baseMipLevelLayout = ffi.C_INT
		val mipLevelCountOffset = 28L
		val mipLevelCountLayout = ffi.C_INT
		val baseArrayLayerOffset = 32L
		val baseArrayLayerLayout = ffi.C_INT
		val arrayLayerCountOffset = 36L
		val arrayLayerCountLayout = ffi.C_INT
		val aspectOffset = 40L
		val aspectLayout = ffi.C_INT
	}
}
actual interface WGPUInstanceExtras : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }
		override var backends: UInt
			get() = getUInt(backendsOffset)
			set(newValue) = set(backendsOffset, newValue)
		override var flags: UInt
			get() = getUInt(flagsOffset)
			set(newValue) = set(flagsOffset, newValue)
		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = getUInt(dx12ShaderCompilerOffset)
			set(newValue) = set(dx12ShaderCompilerOffset, newValue)
		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = getUInt(gles3MinorVersionOffset)
			set(newValue) = set(gles3MinorVersionOffset, newValue)
		override var dxilPath: CString?
			get() = get(dxilPathLayout, dxilPathOffset).let(::CString)
			set(newValue) = set(dxilPathLayout, dxilPathOffset, newValue?.handler)
		override var dxcPath: CString?
			get() = get(dxcPathLayout, dxcPathOffset).let(::CString)
			set(newValue) = set(dxcPathLayout, dxcPathOffset, newValue?.handler)
	}

	actual val chain: WGPUChainedStruct
	actual var backends: UInt
	actual var flags: UInt
	actual var dx12ShaderCompiler: WGPUDx12Compiler
	actual var gles3MinorVersion: WGPUGles3MinorVersion
	actual var dxilPath: CString?
	actual var dxcPath: CString?

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUInstanceExtras {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUInstanceExtras {
			return allocator.allocate(48L)
				.let { WGPUInstanceExtras(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUInstanceExtras) -> Unit): ArrayHolder<WGPUInstanceExtras> {
			return allocator.allocate(48 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 48L)
							.let(::NativeAddress)
							.let { WGPUInstanceExtras(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			WGPUChainedStruct.LAYOUT.withName("chain"),
			ffi.C_INT.withName("backends"),
			ffi.C_INT.withName("flags"),
			ffi.C_INT.withName("dx12ShaderCompiler"),
			ffi.C_INT.withName("gles3MinorVersion"),
			ffi.C_POINTER.withName("dxilPath"),
			ffi.C_POINTER.withName("dxcPath"),
		).withName("WGPUInstanceExtras")

		val chainOffset = 0L
		val chainLayout = WGPUChainedStruct.LAYOUT
		val backendsOffset = 16L
		val backendsLayout = ffi.C_INT
		val flagsOffset = 20L
		val flagsLayout = ffi.C_INT
		val dx12ShaderCompilerOffset = 24L
		val dx12ShaderCompilerLayout = ffi.C_INT
		val gles3MinorVersionOffset = 28L
		val gles3MinorVersionLayout = ffi.C_INT
		val dxilPathOffset = 32L
		val dxilPathLayout = ffi.C_POINTER
		val dxcPathOffset = 40L
		val dxcPathLayout = ffi.C_POINTER
	}
}
actual interface WGPUChainedStructOut : CStructure {

	@JvmInline
	value class ByReference(override val handler: NativeAddress) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = get(nextLayout, nextOffset).let { WGPUChainedStructOut(it) }
			set(newValue) = set(nextLayout, nextOffset, newValue?.handler)
		override var sType: WGPUSType
			get() = getUInt(sTypeOffset)
			set(newValue) = set(sTypeOffset, newValue)
	}

	actual var next: WGPUChainedStructOut?
	actual var sType: WGPUSType

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUChainedStructOut {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUChainedStructOut {
			return allocator.allocate(16L)
				.let { WGPUChainedStructOut(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUChainedStructOut) -> Unit): ArrayHolder<WGPUChainedStructOut> {
			return allocator.allocate(16 * size.toLong())
				.also {
					(0u until size).forEach { index ->
						it.handler.asSlice(index.toLong() * 16L)
							.let(::NativeAddress)
							.let { WGPUChainedStructOut(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}

		internal val LAYOUT = structLayout(
			ffi.C_POINTER.withName("next"),
			ffi.C_INT.withName("sType"),
			MemoryLayout.paddingLayout(4)
		).withName("WGPUChainedStructOut")

		val nextOffset = 0L
		val nextLayout = ffi.C_POINTER
		val sTypeOffset = 8L
		val sTypeLayout = ffi.C_INT
	}
}
