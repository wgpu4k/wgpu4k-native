// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.ArrayHolder
import ffi.CString
import ffi.CStructure
import ffi.C_DOUBLE
import ffi.C_FLOAT
import ffi.C_INT
import ffi.C_LONG
import ffi.C_POINTER
import ffi.C_SHORT
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress
import java.lang.foreign.GroupLayout
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemoryLayout.PathElement.groupElement
import java.lang.foreign.MemoryLayout.structLayout
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit
import kotlin.jvm.JvmInline

public actual interface WGPUStringView : CStructure {
	public actual var `data`: CString?

	public actual var length: ULong

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUStringView {
		override var `data`: CString?
			get() = get(dataLayout, dataOffset).let(::CString)
			set(newValue) {
				set(dataLayout, dataOffset, newValue?.handler)
			}

		override var length: ULong
			get() = getULong(lengthOffset)
			set(newValue) {
				set(lengthOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("data"),
					ffi.C_LONG.withName("length"),
				).withName("WGPUStringView")

		public val dataOffset: Long = 0L

		public val dataLayout: MemoryLayout = ffi.C_POINTER

		public val lengthOffset: Long = 8L

		public val lengthLayout: MemoryLayout = ffi.C_LONG

		public actual operator fun invoke(address: NativeAddress): WGPUStringView = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUStringView = allocator.allocate(16L)
			.let { WGPUStringView(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStringView) -> Unit,
		): ArrayHolder<WGPUStringView> = allocator.allocate(16 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 16L)
						.let(::NativeAddress)
						.let { WGPUStringView(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUAdapterInfo : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val vendor: WGPUStringView

	public actual val architecture: WGPUStringView

	public actual val device: WGPUStringView

	public actual val description: WGPUStringView

	public actual var backendType: WGPUBackendType

	public actual var adapterType: WGPUAdapterType

	public actual var vendorID: UInt

	public actual var deviceID: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val vendor: WGPUStringView
			get() = handler.handler.asSlice(vendorOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override val architecture: WGPUStringView
			get() = handler.handler.asSlice(architectureOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override val device: WGPUStringView
			get() = handler.handler.asSlice(deviceOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override val description: WGPUStringView
			get() = handler.handler.asSlice(descriptionOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var backendType: WGPUBackendType
			get() = getUInt(backendTypeOffset)
			set(newValue) {
				set(backendTypeOffset, newValue)
			}

		override var adapterType: WGPUAdapterType
			get() = getUInt(adapterTypeOffset)
			set(newValue) {
				set(adapterTypeOffset, newValue)
			}

		override var vendorID: UInt
			get() = getUInt(vendorIDOffset)
			set(newValue) {
				set(vendorIDOffset, newValue)
			}

		override var deviceID: UInt
			get() = getUInt(deviceIDOffset)
			set(newValue) {
				set(deviceIDOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("vendor"),
					WGPUStringView.LAYOUT.withName("architecture"),
					WGPUStringView.LAYOUT.withName("device"),
					WGPUStringView.LAYOUT.withName("description"),
					ffi.C_INT.withName("backendType"),
					ffi.C_INT.withName("adapterType"),
					ffi.C_INT.withName("vendorID"),
					ffi.C_INT.withName("deviceID"),
				).withName("WGPUAdapterInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val vendorOffset: Long = 8L

		public val vendorLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val architectureOffset: Long = 24L

		public val architectureLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val deviceOffset: Long = 40L

		public val deviceLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val descriptionOffset: Long = 56L

		public val descriptionLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val backendTypeOffset: Long = 72L

		public val backendTypeLayout: MemoryLayout = ffi.C_INT

		public val adapterTypeOffset: Long = 76L

		public val adapterTypeLayout: MemoryLayout = ffi.C_INT

		public val vendorIDOffset: Long = 80L

		public val vendorIDLayout: MemoryLayout = ffi.C_INT

		public val deviceIDOffset: Long = 84L

		public val deviceIDLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUAdapterInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUAdapterInfo = allocator.allocate(88L)
			.let { WGPUAdapterInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUAdapterInfo) -> Unit,
		): ArrayHolder<WGPUAdapterInfo> = allocator.allocate(88 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 88L)
						.let(::NativeAddress)
						.let { WGPUAdapterInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUBindGroupDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var layout: WGPUBindGroupLayout?

	public actual var entryCount: ULong

	public actual var entries: ArrayHolder<WGPUBindGroupEntry>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var layout: WGPUBindGroupLayout?
			get() = get(layoutLayout, layoutOffset).let { WGPUBindGroupLayout(it) }
			set(newValue) {
				set(layoutLayout, layoutOffset, newValue?.handler)
			}

		override var entryCount: ULong
			get() = getULong(entryCountOffset)
			set(newValue) {
				set(entryCountOffset, newValue)
			}

		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = get(entriesLayout, entriesOffset).let(::ArrayHolder)
			set(newValue) {
				set(entriesLayout, entriesOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_POINTER.withName("layout"),
					ffi.C_LONG.withName("entryCount"),
					ffi.C_POINTER.withName("entries"),
				).withName("WGPUBindGroupDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val layoutOffset: Long = 24L

		public val layoutLayout: MemoryLayout = ffi.C_POINTER

		public val entryCountOffset: Long = 32L

		public val entryCountLayout: MemoryLayout = ffi.C_LONG

		public val entriesOffset: Long = 40L

		public val entriesLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupDescriptor = allocator.allocate(48L)
			.let { WGPUBindGroupDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupDescriptor) -> Unit,
		): ArrayHolder<WGPUBindGroupDescriptor> = allocator.allocate(48 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 48L)
						.let(::NativeAddress)
						.let { WGPUBindGroupDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUBindGroupEntry : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var binding: UInt

	public actual var buffer: WGPUBuffer?

	public actual var offset: ULong

	public actual var size: ULong

	public actual var sampler: WGPUSampler?

	public actual var textureView: WGPUTextureView?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var binding: UInt
			get() = getUInt(bindingOffset)
			set(newValue) {
				set(bindingOffset, newValue)
			}

		override var buffer: WGPUBuffer?
			get() = get(bufferLayout, bufferOffset).let { WGPUBuffer(it) }
			set(newValue) {
				set(bufferLayout, bufferOffset, newValue?.handler)
			}

		override var offset: ULong
			get() = getULong(offsetOffset)
			set(newValue) {
				set(offsetOffset, newValue)
			}

		override var size: ULong
			get() = getULong(sizeOffset)
			set(newValue) {
				set(sizeOffset, newValue)
			}

		override var sampler: WGPUSampler?
			get() = get(samplerLayout, samplerOffset).let { WGPUSampler(it) }
			set(newValue) {
				set(samplerLayout, samplerOffset, newValue?.handler)
			}

		override var textureView: WGPUTextureView?
			get() = get(textureViewLayout, textureViewOffset).let { WGPUTextureView(it) }
			set(newValue) {
				set(textureViewLayout, textureViewOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("binding"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("buffer"),
					ffi.C_LONG.withName("offset"),
					ffi.C_LONG.withName("size"),
					ffi.C_POINTER.withName("sampler"),
					ffi.C_POINTER.withName("textureView"),
				).withName("WGPUBindGroupEntry")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val bindingOffset: Long = 8L

		public val bindingLayout: MemoryLayout = ffi.C_INT

		public val bufferOffset: Long = 16L

		public val bufferLayout: MemoryLayout = ffi.C_POINTER

		public val offsetOffset: Long = 24L

		public val offsetLayout: MemoryLayout = ffi.C_LONG

		public val sizeOffset: Long = 32L

		public val sizeLayout: MemoryLayout = ffi.C_LONG

		public val samplerOffset: Long = 40L

		public val samplerLayout: MemoryLayout = ffi.C_POINTER

		public val textureViewOffset: Long = 48L

		public val textureViewLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupEntry = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupEntry = allocator.allocate(56L)
			.let { WGPUBindGroupEntry(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupEntry) -> Unit,
		): ArrayHolder<WGPUBindGroupEntry> = allocator.allocate(56 * size.toLong())
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
}

public actual interface WGPUBindGroupLayoutDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var entryCount: ULong

	public actual var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var entryCount: ULong
			get() = getULong(entryCountOffset)
			set(newValue) {
				set(entryCountOffset, newValue)
			}

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = get(entriesLayout, entriesOffset).let(::ArrayHolder)
			set(newValue) {
				set(entriesLayout, entriesOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_LONG.withName("entryCount"),
					ffi.C_POINTER.withName("entries"),
				).withName("WGPUBindGroupLayoutDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val entryCountOffset: Long = 24L

		public val entryCountLayout: MemoryLayout = ffi.C_LONG

		public val entriesOffset: Long = 32L

		public val entriesLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutDescriptor = allocator.allocate(40L)
			.let { WGPUBindGroupLayoutDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupLayoutDescriptor) -> Unit,
		): ArrayHolder<WGPUBindGroupLayoutDescriptor> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPUBindGroupLayoutDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUBufferBindingLayout : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var type: WGPUBufferBindingType

	public actual var hasDynamicOffset: Boolean

	public actual var minBindingSize: ULong

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var type: WGPUBufferBindingType
			get() = getUInt(typeOffset)
			set(newValue) {
				set(typeOffset, newValue)
			}

		override var hasDynamicOffset: Boolean
			get() = getInt(hasDynamicOffsetOffset).toBoolean()
			set(newValue) {
				set(hasDynamicOffsetOffset, newValue)
			}

		override var minBindingSize: ULong
			get() = getULong(minBindingSizeOffset)
			set(newValue) {
				set(minBindingSizeOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("type"),
					ffi.C_INT.withName("hasDynamicOffset"),
					ffi.C_LONG.withName("minBindingSize"),
				).withName("WGPUBufferBindingLayout")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val typeOffset: Long = 8L

		public val typeLayout: MemoryLayout = ffi.C_INT

		public val hasDynamicOffsetOffset: Long = 12L

		public val hasDynamicOffsetLayout: MemoryLayout = ffi.C_INT

		public val minBindingSizeOffset: Long = 16L

		public val minBindingSizeLayout: MemoryLayout = ffi.C_LONG

		public actual operator fun invoke(address: NativeAddress): WGPUBufferBindingLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBufferBindingLayout = allocator.allocate(24L)
			.let { WGPUBufferBindingLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferBindingLayout) -> Unit,
		): ArrayHolder<WGPUBufferBindingLayout> = allocator.allocate(24 * size.toLong())
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
}

public actual interface WGPUSamplerBindingLayout : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var type: WGPUSamplerBindingType

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var type: WGPUSamplerBindingType
			get() = getUInt(typeOffset)
			set(newValue) {
				set(typeOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("type"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUSamplerBindingLayout")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val typeOffset: Long = 8L

		public val typeLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUSamplerBindingLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSamplerBindingLayout = allocator.allocate(16L)
			.let { WGPUSamplerBindingLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSamplerBindingLayout) -> Unit,
		): ArrayHolder<WGPUSamplerBindingLayout> = allocator.allocate(16 * size.toLong())
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
}

public actual interface WGPUTextureBindingLayout : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var sampleType: WGPUTextureSampleType

	public actual var viewDimension: WGPUTextureViewDimension

	public actual var multisampled: Boolean

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var sampleType: WGPUTextureSampleType
			get() = getUInt(sampleTypeOffset)
			set(newValue) {
				set(sampleTypeOffset, newValue)
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = getUInt(viewDimensionOffset)
			set(newValue) {
				set(viewDimensionOffset, newValue)
			}

		override var multisampled: Boolean
			get() = getInt(multisampledOffset).toBoolean()
			set(newValue) {
				set(multisampledOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("sampleType"),
					ffi.C_INT.withName("viewDimension"),
					ffi.C_INT.withName("multisampled"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUTextureBindingLayout")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val sampleTypeOffset: Long = 8L

		public val sampleTypeLayout: MemoryLayout = ffi.C_INT

		public val viewDimensionOffset: Long = 12L

		public val viewDimensionLayout: MemoryLayout = ffi.C_INT

		public val multisampledOffset: Long = 16L

		public val multisampledLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUTextureBindingLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTextureBindingLayout = allocator.allocate(24L)
			.let { WGPUTextureBindingLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureBindingLayout) -> Unit,
		): ArrayHolder<WGPUTextureBindingLayout> = allocator.allocate(24 * size.toLong())
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
}

public actual interface WGPUStorageTextureBindingLayout : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var access: WGPUStorageTextureAccess

	public actual var format: WGPUTextureFormat

	public actual var viewDimension: WGPUTextureViewDimension

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var access: WGPUStorageTextureAccess
			get() = getUInt(accessOffset)
			set(newValue) {
				set(accessOffset, newValue)
			}

		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) {
				set(formatOffset, newValue)
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = getUInt(viewDimensionOffset)
			set(newValue) {
				set(viewDimensionOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("access"),
					ffi.C_INT.withName("format"),
					ffi.C_INT.withName("viewDimension"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUStorageTextureBindingLayout")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val accessOffset: Long = 8L

		public val accessLayout: MemoryLayout = ffi.C_INT

		public val formatOffset: Long = 12L

		public val formatLayout: MemoryLayout = ffi.C_INT

		public val viewDimensionOffset: Long = 16L

		public val viewDimensionLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUStorageTextureBindingLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUStorageTextureBindingLayout = allocator.allocate(24L)
			.let { WGPUStorageTextureBindingLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStorageTextureBindingLayout) -> Unit,
		): ArrayHolder<WGPUStorageTextureBindingLayout> = allocator.allocate(24 * size.toLong())
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
}

public actual interface WGPUBindGroupLayoutEntry : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var binding: UInt

	public actual var visibility: ULong

	public actual val buffer: WGPUBufferBindingLayout

	public actual val sampler: WGPUSamplerBindingLayout

	public actual val texture: WGPUTextureBindingLayout

	public actual val storageTexture: WGPUStorageTextureBindingLayout

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var binding: UInt
			get() = getUInt(bindingOffset)
			set(newValue) {
				set(bindingOffset, newValue)
			}

		override var visibility: ULong
			get() = getULong(visibilityOffset)
			set(newValue) {
				set(visibilityOffset, newValue)
			}

		override val buffer: WGPUBufferBindingLayout
			get() = handler.handler.asSlice(bufferOffset, 24L).let(::NativeAddress).let { WGPUBufferBindingLayout(it) }

		override val sampler: WGPUSamplerBindingLayout
			get() = handler.handler.asSlice(samplerOffset, 16L).let(::NativeAddress).let { WGPUSamplerBindingLayout(it) }

		override val texture: WGPUTextureBindingLayout
			get() = handler.handler.asSlice(textureOffset, 24L).let(::NativeAddress).let { WGPUTextureBindingLayout(it) }

		override val storageTexture: WGPUStorageTextureBindingLayout
			get() = handler.handler.asSlice(storageTextureOffset, 24L).let(::NativeAddress).let { WGPUStorageTextureBindingLayout(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("binding"),
					MemoryLayout.paddingLayout(4),
					ffi.C_LONG.withName("visibility"),
					WGPUBufferBindingLayout.LAYOUT.withName("buffer"),
					WGPUSamplerBindingLayout.LAYOUT.withName("sampler"),
					WGPUTextureBindingLayout.LAYOUT.withName("texture"),
					WGPUStorageTextureBindingLayout.LAYOUT.withName("storageTexture"),
				).withName("WGPUBindGroupLayoutEntry")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val bindingOffset: Long = 8L

		public val bindingLayout: MemoryLayout = ffi.C_INT

		public val visibilityOffset: Long = 16L

		public val visibilityLayout: MemoryLayout = ffi.C_LONG

		public val bufferOffset: Long = 24L

		public val bufferLayout: MemoryLayout = WGPUBufferBindingLayout.LAYOUT

		public val samplerOffset: Long = 48L

		public val samplerLayout: MemoryLayout = WGPUSamplerBindingLayout.LAYOUT

		public val textureOffset: Long = 64L

		public val textureLayout: MemoryLayout = WGPUTextureBindingLayout.LAYOUT

		public val storageTextureOffset: Long = 88L

		public val storageTextureLayout: MemoryLayout = WGPUStorageTextureBindingLayout.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutEntry = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutEntry = allocator.allocate(112L)
			.let { WGPUBindGroupLayoutEntry(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupLayoutEntry) -> Unit,
		): ArrayHolder<WGPUBindGroupLayoutEntry> = allocator.allocate(112 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 112L)
						.let(::NativeAddress)
						.let { WGPUBindGroupLayoutEntry(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUBlendComponent : CStructure {
	public actual var operation: WGPUBlendOperation

	public actual var srcFactor: WGPUBlendFactor

	public actual var dstFactor: WGPUBlendFactor

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = getUInt(operationOffset)
			set(newValue) {
				set(operationOffset, newValue)
			}

		override var srcFactor: WGPUBlendFactor
			get() = getUInt(srcFactorOffset)
			set(newValue) {
				set(srcFactorOffset, newValue)
			}

		override var dstFactor: WGPUBlendFactor
			get() = getUInt(dstFactorOffset)
			set(newValue) {
				set(dstFactorOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_INT.withName("operation"),
					ffi.C_INT.withName("srcFactor"),
					ffi.C_INT.withName("dstFactor"),
				).withName("WGPUBlendComponent")

		public val operationOffset: Long = 0L

		public val operationLayout: MemoryLayout = ffi.C_INT

		public val srcFactorOffset: Long = 4L

		public val srcFactorLayout: MemoryLayout = ffi.C_INT

		public val dstFactorOffset: Long = 8L

		public val dstFactorLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUBlendComponent = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBlendComponent = allocator.allocate(12L)
			.let { WGPUBlendComponent(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBlendComponent) -> Unit,
		): ArrayHolder<WGPUBlendComponent> = allocator.allocate(12 * size.toLong())
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
}

public actual interface WGPUBlendState : CStructure {
	public actual val color: WGPUBlendComponent

	public actual val alpha: WGPUBlendComponent

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBlendState {
		override val color: WGPUBlendComponent
			get() = handler.handler.asSlice(colorOffset, 12L).let(::NativeAddress).let { WGPUBlendComponent(it) }

		override val alpha: WGPUBlendComponent
			get() = handler.handler.asSlice(alphaOffset, 12L).let(::NativeAddress).let { WGPUBlendComponent(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUBlendComponent.LAYOUT.withName("color"),
					WGPUBlendComponent.LAYOUT.withName("alpha"),
				).withName("WGPUBlendState")

		public val colorOffset: Long = 0L

		public val colorLayout: MemoryLayout = WGPUBlendComponent.LAYOUT

		public val alphaOffset: Long = 12L

		public val alphaLayout: MemoryLayout = WGPUBlendComponent.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUBlendState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBlendState = allocator.allocate(24L)
			.let { WGPUBlendState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBlendState) -> Unit,
		): ArrayHolder<WGPUBlendState> = allocator.allocate(24 * size.toLong())
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
}

public actual interface WGPUBufferDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var usage: ULong

	public actual var size: ULong

	public actual var mappedAtCreation: Boolean

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var usage: ULong
			get() = getULong(usageOffset)
			set(newValue) {
				set(usageOffset, newValue)
			}

		override var size: ULong
			get() = getULong(sizeOffset)
			set(newValue) {
				set(sizeOffset, newValue)
			}

		override var mappedAtCreation: Boolean
			get() = getInt(mappedAtCreationOffset).toBoolean()
			set(newValue) {
				set(mappedAtCreationOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_LONG.withName("usage"),
					ffi.C_LONG.withName("size"),
					ffi.C_INT.withName("mappedAtCreation"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUBufferDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val usageOffset: Long = 24L

		public val usageLayout: MemoryLayout = ffi.C_LONG

		public val sizeOffset: Long = 32L

		public val sizeLayout: MemoryLayout = ffi.C_LONG

		public val mappedAtCreationOffset: Long = 40L

		public val mappedAtCreationLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUBufferDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBufferDescriptor = allocator.allocate(48L)
			.let { WGPUBufferDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferDescriptor) -> Unit,
		): ArrayHolder<WGPUBufferDescriptor> = allocator.allocate(48 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 48L)
						.let(::NativeAddress)
						.let { WGPUBufferDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUColor : CStructure {
	public actual var r: Double

	public actual var g: Double

	public actual var b: Double

	public actual var a: Double

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUColor {
		override var r: Double
			get() = getDouble(rOffset)
			set(newValue) {
				set(rOffset, newValue)
			}

		override var g: Double
			get() = getDouble(gOffset)
			set(newValue) {
				set(gOffset, newValue)
			}

		override var b: Double
			get() = getDouble(bOffset)
			set(newValue) {
				set(bOffset, newValue)
			}

		override var a: Double
			get() = getDouble(aOffset)
			set(newValue) {
				set(aOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_DOUBLE.withName("r"),
					ffi.C_DOUBLE.withName("g"),
					ffi.C_DOUBLE.withName("b"),
					ffi.C_DOUBLE.withName("a"),
				).withName("WGPUColor")

		public val rOffset: Long = 0L

		public val rLayout: MemoryLayout = ffi.C_DOUBLE

		public val gOffset: Long = 8L

		public val gLayout: MemoryLayout = ffi.C_DOUBLE

		public val bOffset: Long = 16L

		public val bLayout: MemoryLayout = ffi.C_DOUBLE

		public val aOffset: Long = 24L

		public val aLayout: MemoryLayout = ffi.C_DOUBLE

		public actual operator fun invoke(address: NativeAddress): WGPUColor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUColor = allocator.allocate(32L)
			.let { WGPUColor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUColor) -> Unit,
		): ArrayHolder<WGPUColor> = allocator.allocate(32 * size.toLong())
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
}

public actual interface WGPUColorTargetState : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var format: WGPUTextureFormat

	public actual var blend: WGPUBlendState?

	public actual var writeMask: ULong

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) {
				set(formatOffset, newValue)
			}

		override var blend: WGPUBlendState?
			get() = get(blendLayout, blendOffset).let { WGPUBlendState(it) }
			set(newValue) {
				set(blendLayout, blendOffset, newValue?.handler)
			}

		override var writeMask: ULong
			get() = getULong(writeMaskOffset)
			set(newValue) {
				set(writeMaskOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("format"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("blend"),
					ffi.C_LONG.withName("writeMask"),
				).withName("WGPUColorTargetState")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val formatOffset: Long = 8L

		public val formatLayout: MemoryLayout = ffi.C_INT

		public val blendOffset: Long = 16L

		public val blendLayout: MemoryLayout = ffi.C_POINTER

		public val writeMaskOffset: Long = 24L

		public val writeMaskLayout: MemoryLayout = ffi.C_LONG

		public actual operator fun invoke(address: NativeAddress): WGPUColorTargetState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUColorTargetState = allocator.allocate(32L)
			.let { WGPUColorTargetState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUColorTargetState) -> Unit,
		): ArrayHolder<WGPUColorTargetState> = allocator.allocate(32 * size.toLong())
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
}

public actual interface WGPUCommandBufferDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
				).withName("WGPUCommandBufferDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUCommandBufferDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCommandBufferDescriptor = allocator.allocate(24L)
			.let { WGPUCommandBufferDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCommandBufferDescriptor) -> Unit,
		): ArrayHolder<WGPUCommandBufferDescriptor> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUCommandBufferDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUCommandEncoderDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
				).withName("WGPUCommandEncoderDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUCommandEncoderDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCommandEncoderDescriptor = allocator.allocate(24L)
			.let { WGPUCommandEncoderDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCommandEncoderDescriptor) -> Unit,
		): ArrayHolder<WGPUCommandEncoderDescriptor> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUCommandEncoderDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUCompilationInfo : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var messageCount: ULong

	public actual var messages: ArrayHolder<WGPUCompilationMessage>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var messageCount: ULong
			get() = getULong(messageCountOffset)
			set(newValue) {
				set(messageCountOffset, newValue)
			}

		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = get(messagesLayout, messagesOffset).let(::ArrayHolder)
			set(newValue) {
				set(messagesLayout, messagesOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_LONG.withName("messageCount"),
					ffi.C_POINTER.withName("messages"),
				).withName("WGPUCompilationInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val messageCountOffset: Long = 8L

		public val messageCountLayout: MemoryLayout = ffi.C_LONG

		public val messagesOffset: Long = 16L

		public val messagesLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUCompilationInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfo = allocator.allocate(24L)
			.let { WGPUCompilationInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationInfo) -> Unit,
		): ArrayHolder<WGPUCompilationInfo> = allocator.allocate(24 * size.toLong())
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
}

public actual interface WGPUCompilationMessage : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val message: WGPUStringView

	public actual var type: WGPUCompilationMessageType

	public actual var lineNum: ULong

	public actual var linePos: ULong

	public actual var offset: ULong

	public actual var length: ULong

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val message: WGPUStringView
			get() = handler.handler.asSlice(messageOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var type: WGPUCompilationMessageType
			get() = getUInt(typeOffset)
			set(newValue) {
				set(typeOffset, newValue)
			}

		override var lineNum: ULong
			get() = getULong(lineNumOffset)
			set(newValue) {
				set(lineNumOffset, newValue)
			}

		override var linePos: ULong
			get() = getULong(linePosOffset)
			set(newValue) {
				set(linePosOffset, newValue)
			}

		override var offset: ULong
			get() = getULong(offsetOffset)
			set(newValue) {
				set(offsetOffset, newValue)
			}

		override var length: ULong
			get() = getULong(lengthOffset)
			set(newValue) {
				set(lengthOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("message"),
					ffi.C_INT.withName("type"),
					MemoryLayout.paddingLayout(4),
					ffi.C_LONG.withName("lineNum"),
					ffi.C_LONG.withName("linePos"),
					ffi.C_LONG.withName("offset"),
					ffi.C_LONG.withName("length"),
				).withName("WGPUCompilationMessage")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val messageOffset: Long = 8L

		public val messageLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val typeOffset: Long = 24L

		public val typeLayout: MemoryLayout = ffi.C_INT

		public val lineNumOffset: Long = 32L

		public val lineNumLayout: MemoryLayout = ffi.C_LONG

		public val linePosOffset: Long = 40L

		public val linePosLayout: MemoryLayout = ffi.C_LONG

		public val offsetOffset: Long = 48L

		public val offsetLayout: MemoryLayout = ffi.C_LONG

		public val lengthOffset: Long = 56L

		public val lengthLayout: MemoryLayout = ffi.C_LONG

		public actual operator fun invoke(address: NativeAddress): WGPUCompilationMessage = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCompilationMessage = allocator.allocate(64L)
			.let { WGPUCompilationMessage(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationMessage) -> Unit,
		): ArrayHolder<WGPUCompilationMessage> = allocator.allocate(64 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 64L)
						.let(::NativeAddress)
						.let { WGPUCompilationMessage(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUComputePassDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var timestampWrites: WGPUComputePassTimestampWrites?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = get(timestampWritesLayout, timestampWritesOffset).let { WGPUComputePassTimestampWrites(it) }
			set(newValue) {
				set(timestampWritesLayout, timestampWritesOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_POINTER.withName("timestampWrites"),
				).withName("WGPUComputePassDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val timestampWritesOffset: Long = 24L

		public val timestampWritesLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUComputePassDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUComputePassDescriptor = allocator.allocate(32L)
			.let { WGPUComputePassDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePassDescriptor) -> Unit,
		): ArrayHolder<WGPUComputePassDescriptor> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUComputePassDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUComputePassTimestampWrites : CStructure {
	public actual var querySet: WGPUQuerySet?

	public actual var beginningOfPassWriteIndex: UInt

	public actual var endOfPassWriteIndex: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = get(querySetLayout, querySetOffset).let { WGPUQuerySet(it) }
			set(newValue) {
				set(querySetLayout, querySetOffset, newValue?.handler)
			}

		override var beginningOfPassWriteIndex: UInt
			get() = getUInt(beginningOfPassWriteIndexOffset)
			set(newValue) {
				set(beginningOfPassWriteIndexOffset, newValue)
			}

		override var endOfPassWriteIndex: UInt
			get() = getUInt(endOfPassWriteIndexOffset)
			set(newValue) {
				set(endOfPassWriteIndexOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("querySet"),
					ffi.C_INT.withName("beginningOfPassWriteIndex"),
					ffi.C_INT.withName("endOfPassWriteIndex"),
				).withName("WGPUComputePassTimestampWrites")

		public val querySetOffset: Long = 0L

		public val querySetLayout: MemoryLayout = ffi.C_POINTER

		public val beginningOfPassWriteIndexOffset: Long = 8L

		public val beginningOfPassWriteIndexLayout: MemoryLayout = ffi.C_INT

		public val endOfPassWriteIndexOffset: Long = 12L

		public val endOfPassWriteIndexLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUComputePassTimestampWrites = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUComputePassTimestampWrites = allocator.allocate(16L)
			.let { WGPUComputePassTimestampWrites(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePassTimestampWrites) -> Unit,
		): ArrayHolder<WGPUComputePassTimestampWrites> = allocator.allocate(16 * size.toLong())
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
}

public actual interface WGPUProgrammableStageDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var module: WGPUShaderModule?

	public actual val entryPoint: WGPUStringView

	public actual var constantCount: ULong

	public actual var constants: ArrayHolder<WGPUConstantEntry>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var module: WGPUShaderModule?
			get() = get(moduleLayout, moduleOffset).let { WGPUShaderModule(it) }
			set(newValue) {
				set(moduleLayout, moduleOffset, newValue?.handler)
			}

		override val entryPoint: WGPUStringView
			get() = handler.handler.asSlice(entryPointOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var constantCount: ULong
			get() = getULong(constantCountOffset)
			set(newValue) {
				set(constantCountOffset, newValue)
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = get(constantsLayout, constantsOffset).let(::ArrayHolder)
			set(newValue) {
				set(constantsLayout, constantsOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_POINTER.withName("module"),
					WGPUStringView.LAYOUT.withName("entryPoint"),
					ffi.C_LONG.withName("constantCount"),
					ffi.C_POINTER.withName("constants"),
				).withName("WGPUProgrammableStageDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val moduleOffset: Long = 8L

		public val moduleLayout: MemoryLayout = ffi.C_POINTER

		public val entryPointOffset: Long = 16L

		public val entryPointLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val constantCountOffset: Long = 32L

		public val constantCountLayout: MemoryLayout = ffi.C_LONG

		public val constantsOffset: Long = 40L

		public val constantsLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUProgrammableStageDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUProgrammableStageDescriptor = allocator.allocate(48L)
			.let { WGPUProgrammableStageDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUProgrammableStageDescriptor) -> Unit,
		): ArrayHolder<WGPUProgrammableStageDescriptor> = allocator.allocate(48 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 48L)
						.let(::NativeAddress)
						.let { WGPUProgrammableStageDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUComputePipelineDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var layout: WGPUPipelineLayout?

	public actual val compute: WGPUProgrammableStageDescriptor

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var layout: WGPUPipelineLayout?
			get() = get(layoutLayout, layoutOffset).let { WGPUPipelineLayout(it) }
			set(newValue) {
				set(layoutLayout, layoutOffset, newValue?.handler)
			}

		override val compute: WGPUProgrammableStageDescriptor
			get() = handler.handler.asSlice(computeOffset, 48L).let(::NativeAddress).let { WGPUProgrammableStageDescriptor(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_POINTER.withName("layout"),
					WGPUProgrammableStageDescriptor.LAYOUT.withName("compute"),
				).withName("WGPUComputePipelineDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val layoutOffset: Long = 24L

		public val layoutLayout: MemoryLayout = ffi.C_POINTER

		public val computeOffset: Long = 32L

		public val computeLayout: MemoryLayout = WGPUProgrammableStageDescriptor.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUComputePipelineDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUComputePipelineDescriptor = allocator.allocate(80L)
			.let { WGPUComputePipelineDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePipelineDescriptor) -> Unit,
		): ArrayHolder<WGPUComputePipelineDescriptor> = allocator.allocate(80 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 80L)
						.let(::NativeAddress)
						.let { WGPUComputePipelineDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUConstantEntry : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val key: WGPUStringView

	public actual var `value`: Double

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val key: WGPUStringView
			get() = handler.handler.asSlice(keyOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var `value`: Double
			get() = getDouble(valueOffset)
			set(newValue) {
				set(valueOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("key"),
					ffi.C_DOUBLE.withName("value"),
				).withName("WGPUConstantEntry")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val keyOffset: Long = 8L

		public val keyLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val valueOffset: Long = 24L

		public val valueLayout: MemoryLayout = ffi.C_DOUBLE

		public actual operator fun invoke(address: NativeAddress): WGPUConstantEntry = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUConstantEntry = allocator.allocate(32L)
			.let { WGPUConstantEntry(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUConstantEntry) -> Unit,
		): ArrayHolder<WGPUConstantEntry> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUConstantEntry(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUStencilFaceState : CStructure {
	public actual var compare: WGPUCompareFunction

	public actual var failOp: WGPUStencilOperation

	public actual var depthFailOp: WGPUStencilOperation

	public actual var passOp: WGPUStencilOperation

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = getUInt(compareOffset)
			set(newValue) {
				set(compareOffset, newValue)
			}

		override var failOp: WGPUStencilOperation
			get() = getUInt(failOpOffset)
			set(newValue) {
				set(failOpOffset, newValue)
			}

		override var depthFailOp: WGPUStencilOperation
			get() = getUInt(depthFailOpOffset)
			set(newValue) {
				set(depthFailOpOffset, newValue)
			}

		override var passOp: WGPUStencilOperation
			get() = getUInt(passOpOffset)
			set(newValue) {
				set(passOpOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_INT.withName("compare"),
					ffi.C_INT.withName("failOp"),
					ffi.C_INT.withName("depthFailOp"),
					ffi.C_INT.withName("passOp"),
				).withName("WGPUStencilFaceState")

		public val compareOffset: Long = 0L

		public val compareLayout: MemoryLayout = ffi.C_INT

		public val failOpOffset: Long = 4L

		public val failOpLayout: MemoryLayout = ffi.C_INT

		public val depthFailOpOffset: Long = 8L

		public val depthFailOpLayout: MemoryLayout = ffi.C_INT

		public val passOpOffset: Long = 12L

		public val passOpLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUStencilFaceState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUStencilFaceState = allocator.allocate(16L)
			.let { WGPUStencilFaceState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStencilFaceState) -> Unit,
		): ArrayHolder<WGPUStencilFaceState> = allocator.allocate(16 * size.toLong())
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
}

public actual interface WGPUDepthStencilState : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var format: WGPUTextureFormat

	public actual var depthWriteEnabled: WGPUOptionalBool

	public actual var depthCompare: WGPUCompareFunction

	public actual val stencilFront: WGPUStencilFaceState

	public actual val stencilBack: WGPUStencilFaceState

	public actual var stencilReadMask: UInt

	public actual var stencilWriteMask: UInt

	public actual var depthBias: Int

	public actual var depthBiasSlopeScale: Float

	public actual var depthBiasClamp: Float

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) {
				set(formatOffset, newValue)
			}

		override var depthWriteEnabled: WGPUOptionalBool
			get() = getUInt(depthWriteEnabledOffset)
			set(newValue) {
				set(depthWriteEnabledOffset, newValue)
			}

		override var depthCompare: WGPUCompareFunction
			get() = getUInt(depthCompareOffset)
			set(newValue) {
				set(depthCompareOffset, newValue)
			}

		override val stencilFront: WGPUStencilFaceState
			get() = handler.handler.asSlice(stencilFrontOffset, 16L).let(::NativeAddress).let { WGPUStencilFaceState(it) }

		override val stencilBack: WGPUStencilFaceState
			get() = handler.handler.asSlice(stencilBackOffset, 16L).let(::NativeAddress).let { WGPUStencilFaceState(it) }

		override var stencilReadMask: UInt
			get() = getUInt(stencilReadMaskOffset)
			set(newValue) {
				set(stencilReadMaskOffset, newValue)
			}

		override var stencilWriteMask: UInt
			get() = getUInt(stencilWriteMaskOffset)
			set(newValue) {
				set(stencilWriteMaskOffset, newValue)
			}

		override var depthBias: Int
			get() = getInt(depthBiasOffset)
			set(newValue) {
				set(depthBiasOffset, newValue)
			}

		override var depthBiasSlopeScale: Float
			get() = getFloat(depthBiasSlopeScaleOffset)
			set(newValue) {
				set(depthBiasSlopeScaleOffset, newValue)
			}

		override var depthBiasClamp: Float
			get() = getFloat(depthBiasClampOffset)
			set(newValue) {
				set(depthBiasClampOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
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

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val formatOffset: Long = 8L

		public val formatLayout: MemoryLayout = ffi.C_INT

		public val depthWriteEnabledOffset: Long = 12L

		public val depthWriteEnabledLayout: MemoryLayout = ffi.C_INT

		public val depthCompareOffset: Long = 16L

		public val depthCompareLayout: MemoryLayout = ffi.C_INT

		public val stencilFrontOffset: Long = 20L

		public val stencilFrontLayout: MemoryLayout = WGPUStencilFaceState.LAYOUT

		public val stencilBackOffset: Long = 36L

		public val stencilBackLayout: MemoryLayout = WGPUStencilFaceState.LAYOUT

		public val stencilReadMaskOffset: Long = 52L

		public val stencilReadMaskLayout: MemoryLayout = ffi.C_INT

		public val stencilWriteMaskOffset: Long = 56L

		public val stencilWriteMaskLayout: MemoryLayout = ffi.C_INT

		public val depthBiasOffset: Long = 60L

		public val depthBiasLayout: MemoryLayout = ffi.C_INT

		public val depthBiasSlopeScaleOffset: Long = 64L

		public val depthBiasSlopeScaleLayout: MemoryLayout = ffi.C_FLOAT

		public val depthBiasClampOffset: Long = 68L

		public val depthBiasClampLayout: MemoryLayout = ffi.C_FLOAT

		public actual operator fun invoke(address: NativeAddress): WGPUDepthStencilState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUDepthStencilState = allocator.allocate(72L)
			.let { WGPUDepthStencilState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDepthStencilState) -> Unit,
		): ArrayHolder<WGPUDepthStencilState> = allocator.allocate(72 * size.toLong())
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
}

public actual interface WGPUQueueDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
				).withName("WGPUQueueDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUQueueDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUQueueDescriptor = allocator.allocate(24L)
			.let { WGPUQueueDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQueueDescriptor) -> Unit,
		): ArrayHolder<WGPUQueueDescriptor> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUQueueDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUDeviceLostCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUDeviceLostCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUDeviceLostCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var mode: WGPUCallbackMode
			get() = getUInt(modeOffset)
			set(newValue) {
				set(modeOffset, newValue)
			}

		override var callback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("mode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPUDeviceLostCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val modeOffset: Long = 8L

		public val modeLayout: MemoryLayout = ffi.C_INT

		public val callbackOffset: Long = 16L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 24L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 32L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUDeviceLostCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUDeviceLostCallbackInfo = allocator.allocate(40L)
			.let { WGPUDeviceLostCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDeviceLostCallbackInfo) -> Unit,
		): ArrayHolder<WGPUDeviceLostCallbackInfo> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPUDeviceLostCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUUncapturedErrorCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var callback: CallbackHolder<WGPUUncapturedErrorCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var callback: CallbackHolder<WGPUUncapturedErrorCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPUUncapturedErrorCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val callbackOffset: Long = 8L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 16L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 24L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUUncapturedErrorCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUUncapturedErrorCallbackInfo = allocator.allocate(32L)
			.let { WGPUUncapturedErrorCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUUncapturedErrorCallbackInfo) -> Unit,
		): ArrayHolder<WGPUUncapturedErrorCallbackInfo> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUUncapturedErrorCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUDeviceDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var requiredFeatureCount: ULong

	public actual var requiredFeatures: ArrayHolder<WGPUFeatureName>?

	public actual var requiredLimits: WGPULimits?

	public actual val defaultQueue: WGPUQueueDescriptor

	public actual val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo

	public actual val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var requiredFeatureCount: ULong
			get() = getULong(requiredFeatureCountOffset)
			set(newValue) {
				set(requiredFeatureCountOffset, newValue)
			}

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = get(requiredFeaturesLayout, requiredFeaturesOffset).let(::ArrayHolder)
			set(newValue) {
				set(requiredFeaturesLayout, requiredFeaturesOffset, newValue?.handler)
			}

		override var requiredLimits: WGPULimits?
			get() = get(requiredLimitsLayout, requiredLimitsOffset).let { WGPULimits(it) }
			set(newValue) {
				set(requiredLimitsLayout, requiredLimitsOffset, newValue?.handler)
			}

		override val defaultQueue: WGPUQueueDescriptor
			get() = handler.handler.asSlice(defaultQueueOffset, 24L).let(::NativeAddress).let { WGPUQueueDescriptor(it) }

		override val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo
			get() = handler.handler.asSlice(deviceLostCallbackInfoOffset, 40L).let(::NativeAddress).let { WGPUDeviceLostCallbackInfo(it) }

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handler.handler.asSlice(uncapturedErrorCallbackInfoOffset, 32L).let(::NativeAddress).let { WGPUUncapturedErrorCallbackInfo(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_LONG.withName("requiredFeatureCount"),
					ffi.C_POINTER.withName("requiredFeatures"),
					ffi.C_POINTER.withName("requiredLimits"),
					WGPUQueueDescriptor.LAYOUT.withName("defaultQueue"),
					WGPUDeviceLostCallbackInfo.LAYOUT.withName("deviceLostCallbackInfo"),
					WGPUUncapturedErrorCallbackInfo.LAYOUT.withName("uncapturedErrorCallbackInfo"),
				).withName("WGPUDeviceDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val requiredFeatureCountOffset: Long = 24L

		public val requiredFeatureCountLayout: MemoryLayout = ffi.C_LONG

		public val requiredFeaturesOffset: Long = 32L

		public val requiredFeaturesLayout: MemoryLayout = ffi.C_POINTER

		public val requiredLimitsOffset: Long = 40L

		public val requiredLimitsLayout: MemoryLayout = ffi.C_POINTER

		public val defaultQueueOffset: Long = 48L

		public val defaultQueueLayout: MemoryLayout = WGPUQueueDescriptor.LAYOUT

		public val deviceLostCallbackInfoOffset: Long = 72L

		public val deviceLostCallbackInfoLayout: MemoryLayout = WGPUDeviceLostCallbackInfo.LAYOUT

		public val uncapturedErrorCallbackInfoOffset: Long = 112L

		public val uncapturedErrorCallbackInfoLayout: MemoryLayout =
				WGPUUncapturedErrorCallbackInfo.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUDeviceDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUDeviceDescriptor = allocator.allocate(144L)
			.let { WGPUDeviceDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDeviceDescriptor) -> Unit,
		): ArrayHolder<WGPUDeviceDescriptor> = allocator.allocate(144 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 144L)
						.let(::NativeAddress)
						.let { WGPUDeviceDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUExtent3D : CStructure {
	public actual var width: UInt

	public actual var height: UInt

	public actual var depthOrArrayLayers: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUExtent3D {
		override var width: UInt
			get() = getUInt(widthOffset)
			set(newValue) {
				set(widthOffset, newValue)
			}

		override var height: UInt
			get() = getUInt(heightOffset)
			set(newValue) {
				set(heightOffset, newValue)
			}

		override var depthOrArrayLayers: UInt
			get() = getUInt(depthOrArrayLayersOffset)
			set(newValue) {
				set(depthOrArrayLayersOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_INT.withName("width"),
					ffi.C_INT.withName("height"),
					ffi.C_INT.withName("depthOrArrayLayers"),
				).withName("WGPUExtent3D")

		public val widthOffset: Long = 0L

		public val widthLayout: MemoryLayout = ffi.C_INT

		public val heightOffset: Long = 4L

		public val heightLayout: MemoryLayout = ffi.C_INT

		public val depthOrArrayLayersOffset: Long = 8L

		public val depthOrArrayLayersLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUExtent3D = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUExtent3D = allocator.allocate(12L)
			.let { WGPUExtent3D(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUExtent3D) -> Unit,
		): ArrayHolder<WGPUExtent3D> = allocator.allocate(12 * size.toLong())
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
}

public actual interface WGPUFragmentState : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var module: WGPUShaderModule?

	public actual val entryPoint: WGPUStringView

	public actual var constantCount: ULong

	public actual var constants: ArrayHolder<WGPUConstantEntry>?

	public actual var targetCount: ULong

	public actual var targets: ArrayHolder<WGPUColorTargetState>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var module: WGPUShaderModule?
			get() = get(moduleLayout, moduleOffset).let { WGPUShaderModule(it) }
			set(newValue) {
				set(moduleLayout, moduleOffset, newValue?.handler)
			}

		override val entryPoint: WGPUStringView
			get() = handler.handler.asSlice(entryPointOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var constantCount: ULong
			get() = getULong(constantCountOffset)
			set(newValue) {
				set(constantCountOffset, newValue)
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = get(constantsLayout, constantsOffset).let(::ArrayHolder)
			set(newValue) {
				set(constantsLayout, constantsOffset, newValue?.handler)
			}

		override var targetCount: ULong
			get() = getULong(targetCountOffset)
			set(newValue) {
				set(targetCountOffset, newValue)
			}

		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = get(targetsLayout, targetsOffset).let(::ArrayHolder)
			set(newValue) {
				set(targetsLayout, targetsOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_POINTER.withName("module"),
					WGPUStringView.LAYOUT.withName("entryPoint"),
					ffi.C_LONG.withName("constantCount"),
					ffi.C_POINTER.withName("constants"),
					ffi.C_LONG.withName("targetCount"),
					ffi.C_POINTER.withName("targets"),
				).withName("WGPUFragmentState")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val moduleOffset: Long = 8L

		public val moduleLayout: MemoryLayout = ffi.C_POINTER

		public val entryPointOffset: Long = 16L

		public val entryPointLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val constantCountOffset: Long = 32L

		public val constantCountLayout: MemoryLayout = ffi.C_LONG

		public val constantsOffset: Long = 40L

		public val constantsLayout: MemoryLayout = ffi.C_POINTER

		public val targetCountOffset: Long = 48L

		public val targetCountLayout: MemoryLayout = ffi.C_LONG

		public val targetsOffset: Long = 56L

		public val targetsLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUFragmentState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUFragmentState = allocator.allocate(64L)
			.let { WGPUFragmentState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFragmentState) -> Unit,
		): ArrayHolder<WGPUFragmentState> = allocator.allocate(64 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 64L)
						.let(::NativeAddress)
						.let { WGPUFragmentState(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUFuture : CStructure {
	public actual var id: ULong

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUFuture {
		override var id: ULong
			get() = getULong(idOffset)
			set(newValue) {
				set(idOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_LONG.withName("id"),
				).withName("WGPUFuture")

		public val idOffset: Long = 0L

		public val idLayout: MemoryLayout = ffi.C_LONG

		public actual operator fun invoke(address: NativeAddress): WGPUFuture = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUFuture = allocator.allocate(8L)
			.let { WGPUFuture(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFuture) -> Unit,
		): ArrayHolder<WGPUFuture> = allocator.allocate(8 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 8L)
						.let(::NativeAddress)
						.let { WGPUFuture(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUFutureWaitInfo : CStructure {
	public actual val future: WGPUFuture

	public actual var completed: Boolean

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUFutureWaitInfo {
		override val future: WGPUFuture
			get() = handler.handler.asSlice(futureOffset, 8L).let(::NativeAddress).let { WGPUFuture(it) }

		override var completed: Boolean
			get() = getInt(completedOffset).toBoolean()
			set(newValue) {
				set(completedOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUFuture.LAYOUT.withName("future"),
					ffi.C_INT.withName("completed"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUFutureWaitInfo")

		public val futureOffset: Long = 0L

		public val futureLayout: MemoryLayout = WGPUFuture.LAYOUT

		public val completedOffset: Long = 8L

		public val completedLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUFutureWaitInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUFutureWaitInfo = allocator.allocate(16L)
			.let { WGPUFutureWaitInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFutureWaitInfo) -> Unit,
		): ArrayHolder<WGPUFutureWaitInfo> = allocator.allocate(16 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 16L)
						.let(::NativeAddress)
						.let { WGPUFutureWaitInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUInstanceCapabilities : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var timedWaitAnyEnable: Boolean

	public actual var timedWaitAnyMaxCount: ULong

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUInstanceCapabilities {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var timedWaitAnyEnable: Boolean
			get() = getInt(timedWaitAnyEnableOffset).toBoolean()
			set(newValue) {
				set(timedWaitAnyEnableOffset, newValue)
			}

		override var timedWaitAnyMaxCount: ULong
			get() = getULong(timedWaitAnyMaxCountOffset)
			set(newValue) {
				set(timedWaitAnyMaxCountOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("timedWaitAnyEnable"),
					MemoryLayout.paddingLayout(4),
					ffi.C_LONG.withName("timedWaitAnyMaxCount"),
				).withName("WGPUInstanceCapabilities")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val timedWaitAnyEnableOffset: Long = 8L

		public val timedWaitAnyEnableLayout: MemoryLayout = ffi.C_INT

		public val timedWaitAnyMaxCountOffset: Long = 16L

		public val timedWaitAnyMaxCountLayout: MemoryLayout = ffi.C_LONG

		public actual operator fun invoke(address: NativeAddress): WGPUInstanceCapabilities = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUInstanceCapabilities = allocator.allocate(24L)
			.let { WGPUInstanceCapabilities(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceCapabilities) -> Unit,
		): ArrayHolder<WGPUInstanceCapabilities> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUInstanceCapabilities(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUInstanceDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val features: WGPUInstanceCapabilities

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val features: WGPUInstanceCapabilities
			get() = handler.handler.asSlice(featuresOffset, 24L).let(::NativeAddress).let { WGPUInstanceCapabilities(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUInstanceCapabilities.LAYOUT.withName("features"),
				).withName("WGPUInstanceDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val featuresOffset: Long = 8L

		public val featuresLayout: MemoryLayout = WGPUInstanceCapabilities.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUInstanceDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUInstanceDescriptor = allocator.allocate(32L)
			.let { WGPUInstanceDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceDescriptor) -> Unit,
		): ArrayHolder<WGPUInstanceDescriptor> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUInstanceDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPULimits : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var maxTextureDimension1D: UInt

	public actual var maxTextureDimension2D: UInt

	public actual var maxTextureDimension3D: UInt

	public actual var maxTextureArrayLayers: UInt

	public actual var maxBindGroups: UInt

	public actual var maxBindGroupsPlusVertexBuffers: UInt

	public actual var maxBindingsPerBindGroup: UInt

	public actual var maxDynamicUniformBuffersPerPipelineLayout: UInt

	public actual var maxDynamicStorageBuffersPerPipelineLayout: UInt

	public actual var maxSampledTexturesPerShaderStage: UInt

	public actual var maxSamplersPerShaderStage: UInt

	public actual var maxStorageBuffersPerShaderStage: UInt

	public actual var maxStorageTexturesPerShaderStage: UInt

	public actual var maxUniformBuffersPerShaderStage: UInt

	public actual var maxUniformBufferBindingSize: ULong

	public actual var maxStorageBufferBindingSize: ULong

	public actual var minUniformBufferOffsetAlignment: UInt

	public actual var minStorageBufferOffsetAlignment: UInt

	public actual var maxVertexBuffers: UInt

	public actual var maxBufferSize: ULong

	public actual var maxVertexAttributes: UInt

	public actual var maxVertexBufferArrayStride: UInt

	public actual var maxInterStageShaderVariables: UInt

	public actual var maxColorAttachments: UInt

	public actual var maxColorAttachmentBytesPerSample: UInt

	public actual var maxComputeWorkgroupStorageSize: UInt

	public actual var maxComputeInvocationsPerWorkgroup: UInt

	public actual var maxComputeWorkgroupSizeX: UInt

	public actual var maxComputeWorkgroupSizeY: UInt

	public actual var maxComputeWorkgroupSizeZ: UInt

	public actual var maxComputeWorkgroupsPerDimension: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPULimits {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var maxTextureDimension1D: UInt
			get() = getUInt(maxTextureDimension1DOffset)
			set(newValue) {
				set(maxTextureDimension1DOffset, newValue)
			}

		override var maxTextureDimension2D: UInt
			get() = getUInt(maxTextureDimension2DOffset)
			set(newValue) {
				set(maxTextureDimension2DOffset, newValue)
			}

		override var maxTextureDimension3D: UInt
			get() = getUInt(maxTextureDimension3DOffset)
			set(newValue) {
				set(maxTextureDimension3DOffset, newValue)
			}

		override var maxTextureArrayLayers: UInt
			get() = getUInt(maxTextureArrayLayersOffset)
			set(newValue) {
				set(maxTextureArrayLayersOffset, newValue)
			}

		override var maxBindGroups: UInt
			get() = getUInt(maxBindGroupsOffset)
			set(newValue) {
				set(maxBindGroupsOffset, newValue)
			}

		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = getUInt(maxBindGroupsPlusVertexBuffersOffset)
			set(newValue) {
				set(maxBindGroupsPlusVertexBuffersOffset, newValue)
			}

		override var maxBindingsPerBindGroup: UInt
			get() = getUInt(maxBindingsPerBindGroupOffset)
			set(newValue) {
				set(maxBindingsPerBindGroupOffset, newValue)
			}

		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = getUInt(maxDynamicUniformBuffersPerPipelineLayoutOffset)
			set(newValue) {
				set(maxDynamicUniformBuffersPerPipelineLayoutOffset, newValue)
			}

		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = getUInt(maxDynamicStorageBuffersPerPipelineLayoutOffset)
			set(newValue) {
				set(maxDynamicStorageBuffersPerPipelineLayoutOffset, newValue)
			}

		override var maxSampledTexturesPerShaderStage: UInt
			get() = getUInt(maxSampledTexturesPerShaderStageOffset)
			set(newValue) {
				set(maxSampledTexturesPerShaderStageOffset, newValue)
			}

		override var maxSamplersPerShaderStage: UInt
			get() = getUInt(maxSamplersPerShaderStageOffset)
			set(newValue) {
				set(maxSamplersPerShaderStageOffset, newValue)
			}

		override var maxStorageBuffersPerShaderStage: UInt
			get() = getUInt(maxStorageBuffersPerShaderStageOffset)
			set(newValue) {
				set(maxStorageBuffersPerShaderStageOffset, newValue)
			}

		override var maxStorageTexturesPerShaderStage: UInt
			get() = getUInt(maxStorageTexturesPerShaderStageOffset)
			set(newValue) {
				set(maxStorageTexturesPerShaderStageOffset, newValue)
			}

		override var maxUniformBuffersPerShaderStage: UInt
			get() = getUInt(maxUniformBuffersPerShaderStageOffset)
			set(newValue) {
				set(maxUniformBuffersPerShaderStageOffset, newValue)
			}

		override var maxUniformBufferBindingSize: ULong
			get() = getULong(maxUniformBufferBindingSizeOffset)
			set(newValue) {
				set(maxUniformBufferBindingSizeOffset, newValue)
			}

		override var maxStorageBufferBindingSize: ULong
			get() = getULong(maxStorageBufferBindingSizeOffset)
			set(newValue) {
				set(maxStorageBufferBindingSizeOffset, newValue)
			}

		override var minUniformBufferOffsetAlignment: UInt
			get() = getUInt(minUniformBufferOffsetAlignmentOffset)
			set(newValue) {
				set(minUniformBufferOffsetAlignmentOffset, newValue)
			}

		override var minStorageBufferOffsetAlignment: UInt
			get() = getUInt(minStorageBufferOffsetAlignmentOffset)
			set(newValue) {
				set(minStorageBufferOffsetAlignmentOffset, newValue)
			}

		override var maxVertexBuffers: UInt
			get() = getUInt(maxVertexBuffersOffset)
			set(newValue) {
				set(maxVertexBuffersOffset, newValue)
			}

		override var maxBufferSize: ULong
			get() = getULong(maxBufferSizeOffset)
			set(newValue) {
				set(maxBufferSizeOffset, newValue)
			}

		override var maxVertexAttributes: UInt
			get() = getUInt(maxVertexAttributesOffset)
			set(newValue) {
				set(maxVertexAttributesOffset, newValue)
			}

		override var maxVertexBufferArrayStride: UInt
			get() = getUInt(maxVertexBufferArrayStrideOffset)
			set(newValue) {
				set(maxVertexBufferArrayStrideOffset, newValue)
			}

		override var maxInterStageShaderVariables: UInt
			get() = getUInt(maxInterStageShaderVariablesOffset)
			set(newValue) {
				set(maxInterStageShaderVariablesOffset, newValue)
			}

		override var maxColorAttachments: UInt
			get() = getUInt(maxColorAttachmentsOffset)
			set(newValue) {
				set(maxColorAttachmentsOffset, newValue)
			}

		override var maxColorAttachmentBytesPerSample: UInt
			get() = getUInt(maxColorAttachmentBytesPerSampleOffset)
			set(newValue) {
				set(maxColorAttachmentBytesPerSampleOffset, newValue)
			}

		override var maxComputeWorkgroupStorageSize: UInt
			get() = getUInt(maxComputeWorkgroupStorageSizeOffset)
			set(newValue) {
				set(maxComputeWorkgroupStorageSizeOffset, newValue)
			}

		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = getUInt(maxComputeInvocationsPerWorkgroupOffset)
			set(newValue) {
				set(maxComputeInvocationsPerWorkgroupOffset, newValue)
			}

		override var maxComputeWorkgroupSizeX: UInt
			get() = getUInt(maxComputeWorkgroupSizeXOffset)
			set(newValue) {
				set(maxComputeWorkgroupSizeXOffset, newValue)
			}

		override var maxComputeWorkgroupSizeY: UInt
			get() = getUInt(maxComputeWorkgroupSizeYOffset)
			set(newValue) {
				set(maxComputeWorkgroupSizeYOffset, newValue)
			}

		override var maxComputeWorkgroupSizeZ: UInt
			get() = getUInt(maxComputeWorkgroupSizeZOffset)
			set(newValue) {
				set(maxComputeWorkgroupSizeZOffset, newValue)
			}

		override var maxComputeWorkgroupsPerDimension: UInt
			get() = getUInt(maxComputeWorkgroupsPerDimensionOffset)
			set(newValue) {
				set(maxComputeWorkgroupsPerDimensionOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
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
					ffi.C_INT.withName("maxInterStageShaderVariables"),
					ffi.C_INT.withName("maxColorAttachments"),
					ffi.C_INT.withName("maxColorAttachmentBytesPerSample"),
					ffi.C_INT.withName("maxComputeWorkgroupStorageSize"),
					ffi.C_INT.withName("maxComputeInvocationsPerWorkgroup"),
					ffi.C_INT.withName("maxComputeWorkgroupSizeX"),
					ffi.C_INT.withName("maxComputeWorkgroupSizeY"),
					ffi.C_INT.withName("maxComputeWorkgroupSizeZ"),
					ffi.C_INT.withName("maxComputeWorkgroupsPerDimension"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPULimits")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val maxTextureDimension1DOffset: Long = 8L

		public val maxTextureDimension1DLayout: MemoryLayout = ffi.C_INT

		public val maxTextureDimension2DOffset: Long = 12L

		public val maxTextureDimension2DLayout: MemoryLayout = ffi.C_INT

		public val maxTextureDimension3DOffset: Long = 16L

		public val maxTextureDimension3DLayout: MemoryLayout = ffi.C_INT

		public val maxTextureArrayLayersOffset: Long = 20L

		public val maxTextureArrayLayersLayout: MemoryLayout = ffi.C_INT

		public val maxBindGroupsOffset: Long = 24L

		public val maxBindGroupsLayout: MemoryLayout = ffi.C_INT

		public val maxBindGroupsPlusVertexBuffersOffset: Long = 28L

		public val maxBindGroupsPlusVertexBuffersLayout: MemoryLayout = ffi.C_INT

		public val maxBindingsPerBindGroupOffset: Long = 32L

		public val maxBindingsPerBindGroupLayout: MemoryLayout = ffi.C_INT

		public val maxDynamicUniformBuffersPerPipelineLayoutOffset: Long = 36L

		public val maxDynamicUniformBuffersPerPipelineLayoutLayout: MemoryLayout = ffi.C_INT

		public val maxDynamicStorageBuffersPerPipelineLayoutOffset: Long = 40L

		public val maxDynamicStorageBuffersPerPipelineLayoutLayout: MemoryLayout = ffi.C_INT

		public val maxSampledTexturesPerShaderStageOffset: Long = 44L

		public val maxSampledTexturesPerShaderStageLayout: MemoryLayout = ffi.C_INT

		public val maxSamplersPerShaderStageOffset: Long = 48L

		public val maxSamplersPerShaderStageLayout: MemoryLayout = ffi.C_INT

		public val maxStorageBuffersPerShaderStageOffset: Long = 52L

		public val maxStorageBuffersPerShaderStageLayout: MemoryLayout = ffi.C_INT

		public val maxStorageTexturesPerShaderStageOffset: Long = 56L

		public val maxStorageTexturesPerShaderStageLayout: MemoryLayout = ffi.C_INT

		public val maxUniformBuffersPerShaderStageOffset: Long = 60L

		public val maxUniformBuffersPerShaderStageLayout: MemoryLayout = ffi.C_INT

		public val maxUniformBufferBindingSizeOffset: Long = 64L

		public val maxUniformBufferBindingSizeLayout: MemoryLayout = ffi.C_LONG

		public val maxStorageBufferBindingSizeOffset: Long = 72L

		public val maxStorageBufferBindingSizeLayout: MemoryLayout = ffi.C_LONG

		public val minUniformBufferOffsetAlignmentOffset: Long = 80L

		public val minUniformBufferOffsetAlignmentLayout: MemoryLayout = ffi.C_INT

		public val minStorageBufferOffsetAlignmentOffset: Long = 84L

		public val minStorageBufferOffsetAlignmentLayout: MemoryLayout = ffi.C_INT

		public val maxVertexBuffersOffset: Long = 88L

		public val maxVertexBuffersLayout: MemoryLayout = ffi.C_INT

		public val maxBufferSizeOffset: Long = 96L

		public val maxBufferSizeLayout: MemoryLayout = ffi.C_LONG

		public val maxVertexAttributesOffset: Long = 104L

		public val maxVertexAttributesLayout: MemoryLayout = ffi.C_INT

		public val maxVertexBufferArrayStrideOffset: Long = 108L

		public val maxVertexBufferArrayStrideLayout: MemoryLayout = ffi.C_INT

		public val maxInterStageShaderVariablesOffset: Long = 112L

		public val maxInterStageShaderVariablesLayout: MemoryLayout = ffi.C_INT

		public val maxColorAttachmentsOffset: Long = 116L

		public val maxColorAttachmentsLayout: MemoryLayout = ffi.C_INT

		public val maxColorAttachmentBytesPerSampleOffset: Long = 120L

		public val maxColorAttachmentBytesPerSampleLayout: MemoryLayout = ffi.C_INT

		public val maxComputeWorkgroupStorageSizeOffset: Long = 124L

		public val maxComputeWorkgroupStorageSizeLayout: MemoryLayout = ffi.C_INT

		public val maxComputeInvocationsPerWorkgroupOffset: Long = 128L

		public val maxComputeInvocationsPerWorkgroupLayout: MemoryLayout = ffi.C_INT

		public val maxComputeWorkgroupSizeXOffset: Long = 132L

		public val maxComputeWorkgroupSizeXLayout: MemoryLayout = ffi.C_INT

		public val maxComputeWorkgroupSizeYOffset: Long = 136L

		public val maxComputeWorkgroupSizeYLayout: MemoryLayout = ffi.C_INT

		public val maxComputeWorkgroupSizeZOffset: Long = 140L

		public val maxComputeWorkgroupSizeZLayout: MemoryLayout = ffi.C_INT

		public val maxComputeWorkgroupsPerDimensionOffset: Long = 144L

		public val maxComputeWorkgroupsPerDimensionLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPULimits = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPULimits = allocator.allocate(152L)
			.let { WGPULimits(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPULimits) -> Unit,
		): ArrayHolder<WGPULimits> = allocator.allocate(152 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 152L)
						.let(::NativeAddress)
						.let { WGPULimits(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUMultisampleState : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var count: UInt

	public actual var mask: UInt

	public actual var alphaToCoverageEnabled: Boolean

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var count: UInt
			get() = getUInt(countOffset)
			set(newValue) {
				set(countOffset, newValue)
			}

		override var mask: UInt
			get() = getUInt(maskOffset)
			set(newValue) {
				set(maskOffset, newValue)
			}

		override var alphaToCoverageEnabled: Boolean
			get() = getInt(alphaToCoverageEnabledOffset).toBoolean()
			set(newValue) {
				set(alphaToCoverageEnabledOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("count"),
					ffi.C_INT.withName("mask"),
					ffi.C_INT.withName("alphaToCoverageEnabled"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUMultisampleState")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val countOffset: Long = 8L

		public val countLayout: MemoryLayout = ffi.C_INT

		public val maskOffset: Long = 12L

		public val maskLayout: MemoryLayout = ffi.C_INT

		public val alphaToCoverageEnabledOffset: Long = 16L

		public val alphaToCoverageEnabledLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUMultisampleState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUMultisampleState = allocator.allocate(24L)
			.let { WGPUMultisampleState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUMultisampleState) -> Unit,
		): ArrayHolder<WGPUMultisampleState> = allocator.allocate(24 * size.toLong())
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
}

public actual interface WGPUOrigin3D : CStructure {
	public actual var x: UInt

	public actual var y: UInt

	public actual var z: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUOrigin3D {
		override var x: UInt
			get() = getUInt(xOffset)
			set(newValue) {
				set(xOffset, newValue)
			}

		override var y: UInt
			get() = getUInt(yOffset)
			set(newValue) {
				set(yOffset, newValue)
			}

		override var z: UInt
			get() = getUInt(zOffset)
			set(newValue) {
				set(zOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_INT.withName("x"),
					ffi.C_INT.withName("y"),
					ffi.C_INT.withName("z"),
				).withName("WGPUOrigin3D")

		public val xOffset: Long = 0L

		public val xLayout: MemoryLayout = ffi.C_INT

		public val yOffset: Long = 4L

		public val yLayout: MemoryLayout = ffi.C_INT

		public val zOffset: Long = 8L

		public val zLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUOrigin3D = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUOrigin3D = allocator.allocate(12L)
			.let { WGPUOrigin3D(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUOrigin3D) -> Unit,
		): ArrayHolder<WGPUOrigin3D> = allocator.allocate(12 * size.toLong())
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
}

public actual interface WGPUPipelineLayoutDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var bindGroupLayoutCount: ULong

	public actual var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var bindGroupLayoutCount: ULong
			get() = getULong(bindGroupLayoutCountOffset)
			set(newValue) {
				set(bindGroupLayoutCountOffset, newValue)
			}

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = get(bindGroupLayoutsLayout, bindGroupLayoutsOffset).let(::ArrayHolder)
			set(newValue) {
				set(bindGroupLayoutsLayout, bindGroupLayoutsOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_LONG.withName("bindGroupLayoutCount"),
					ffi.C_POINTER.withName("bindGroupLayouts"),
				).withName("WGPUPipelineLayoutDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val bindGroupLayoutCountOffset: Long = 24L

		public val bindGroupLayoutCountLayout: MemoryLayout = ffi.C_LONG

		public val bindGroupLayoutsOffset: Long = 32L

		public val bindGroupLayoutsLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUPipelineLayoutDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUPipelineLayoutDescriptor = allocator.allocate(40L)
			.let { WGPUPipelineLayoutDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPipelineLayoutDescriptor) -> Unit,
		): ArrayHolder<WGPUPipelineLayoutDescriptor> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPUPipelineLayoutDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUPrimitiveState : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var topology: WGPUPrimitiveTopology

	public actual var stripIndexFormat: WGPUIndexFormat

	public actual var frontFace: WGPUFrontFace

	public actual var cullMode: WGPUCullMode

	public actual var unclippedDepth: Boolean

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var topology: WGPUPrimitiveTopology
			get() = getUInt(topologyOffset)
			set(newValue) {
				set(topologyOffset, newValue)
			}

		override var stripIndexFormat: WGPUIndexFormat
			get() = getUInt(stripIndexFormatOffset)
			set(newValue) {
				set(stripIndexFormatOffset, newValue)
			}

		override var frontFace: WGPUFrontFace
			get() = getUInt(frontFaceOffset)
			set(newValue) {
				set(frontFaceOffset, newValue)
			}

		override var cullMode: WGPUCullMode
			get() = getUInt(cullModeOffset)
			set(newValue) {
				set(cullModeOffset, newValue)
			}

		override var unclippedDepth: Boolean
			get() = getInt(unclippedDepthOffset).toBoolean()
			set(newValue) {
				set(unclippedDepthOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("topology"),
					ffi.C_INT.withName("stripIndexFormat"),
					ffi.C_INT.withName("frontFace"),
					ffi.C_INT.withName("cullMode"),
					ffi.C_INT.withName("unclippedDepth"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUPrimitiveState")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val topologyOffset: Long = 8L

		public val topologyLayout: MemoryLayout = ffi.C_INT

		public val stripIndexFormatOffset: Long = 12L

		public val stripIndexFormatLayout: MemoryLayout = ffi.C_INT

		public val frontFaceOffset: Long = 16L

		public val frontFaceLayout: MemoryLayout = ffi.C_INT

		public val cullModeOffset: Long = 20L

		public val cullModeLayout: MemoryLayout = ffi.C_INT

		public val unclippedDepthOffset: Long = 24L

		public val unclippedDepthLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUPrimitiveState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUPrimitiveState = allocator.allocate(32L)
			.let { WGPUPrimitiveState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPrimitiveState) -> Unit,
		): ArrayHolder<WGPUPrimitiveState> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUPrimitiveState(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUQuerySetDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var type: WGPUQueryType

	public actual var count: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var type: WGPUQueryType
			get() = getUInt(typeOffset)
			set(newValue) {
				set(typeOffset, newValue)
			}

		override var count: UInt
			get() = getUInt(countOffset)
			set(newValue) {
				set(countOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_INT.withName("type"),
					ffi.C_INT.withName("count"),
				).withName("WGPUQuerySetDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val typeOffset: Long = 24L

		public val typeLayout: MemoryLayout = ffi.C_INT

		public val countOffset: Long = 28L

		public val countLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUQuerySetDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUQuerySetDescriptor = allocator.allocate(32L)
			.let { WGPUQuerySetDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQuerySetDescriptor) -> Unit,
		): ArrayHolder<WGPUQuerySetDescriptor> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUQuerySetDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPURenderBundleDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
				).withName("WGPURenderBundleDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPURenderBundleDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleDescriptor = allocator.allocate(24L)
			.let { WGPURenderBundleDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderBundleDescriptor) -> Unit,
		): ArrayHolder<WGPURenderBundleDescriptor> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPURenderBundleDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPURenderBundleEncoderDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var colorFormatCount: ULong

	public actual var colorFormats: ArrayHolder<WGPUTextureFormat>?

	public actual var depthStencilFormat: WGPUTextureFormat

	public actual var sampleCount: UInt

	public actual var depthReadOnly: Boolean

	public actual var stencilReadOnly: Boolean

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var colorFormatCount: ULong
			get() = getULong(colorFormatCountOffset)
			set(newValue) {
				set(colorFormatCountOffset, newValue)
			}

		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = get(colorFormatsLayout, colorFormatsOffset).let(::ArrayHolder)
			set(newValue) {
				set(colorFormatsLayout, colorFormatsOffset, newValue?.handler)
			}

		override var depthStencilFormat: WGPUTextureFormat
			get() = getUInt(depthStencilFormatOffset)
			set(newValue) {
				set(depthStencilFormatOffset, newValue)
			}

		override var sampleCount: UInt
			get() = getUInt(sampleCountOffset)
			set(newValue) {
				set(sampleCountOffset, newValue)
			}

		override var depthReadOnly: Boolean
			get() = getInt(depthReadOnlyOffset).toBoolean()
			set(newValue) {
				set(depthReadOnlyOffset, newValue)
			}

		override var stencilReadOnly: Boolean
			get() = getInt(stencilReadOnlyOffset).toBoolean()
			set(newValue) {
				set(stencilReadOnlyOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_LONG.withName("colorFormatCount"),
					ffi.C_POINTER.withName("colorFormats"),
					ffi.C_INT.withName("depthStencilFormat"),
					ffi.C_INT.withName("sampleCount"),
					ffi.C_INT.withName("depthReadOnly"),
					ffi.C_INT.withName("stencilReadOnly"),
				).withName("WGPURenderBundleEncoderDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val colorFormatCountOffset: Long = 24L

		public val colorFormatCountLayout: MemoryLayout = ffi.C_LONG

		public val colorFormatsOffset: Long = 32L

		public val colorFormatsLayout: MemoryLayout = ffi.C_POINTER

		public val depthStencilFormatOffset: Long = 40L

		public val depthStencilFormatLayout: MemoryLayout = ffi.C_INT

		public val sampleCountOffset: Long = 44L

		public val sampleCountLayout: MemoryLayout = ffi.C_INT

		public val depthReadOnlyOffset: Long = 48L

		public val depthReadOnlyLayout: MemoryLayout = ffi.C_INT

		public val stencilReadOnlyOffset: Long = 52L

		public val stencilReadOnlyLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPURenderBundleEncoderDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleEncoderDescriptor = allocator.allocate(56L)
			.let { WGPURenderBundleEncoderDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderBundleEncoderDescriptor) -> Unit,
		): ArrayHolder<WGPURenderBundleEncoderDescriptor> = allocator.allocate(56 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 56L)
						.let(::NativeAddress)
						.let { WGPURenderBundleEncoderDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPURenderPassColorAttachment : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var view: WGPUTextureView?

	public actual var depthSlice: UInt

	public actual var resolveTarget: WGPUTextureView?

	public actual var loadOp: WGPULoadOp

	public actual var storeOp: WGPUStoreOp

	public actual val clearValue: WGPUColor

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var view: WGPUTextureView?
			get() = get(viewLayout, viewOffset).let { WGPUTextureView(it) }
			set(newValue) {
				set(viewLayout, viewOffset, newValue?.handler)
			}

		override var depthSlice: UInt
			get() = getUInt(depthSliceOffset)
			set(newValue) {
				set(depthSliceOffset, newValue)
			}

		override var resolveTarget: WGPUTextureView?
			get() = get(resolveTargetLayout, resolveTargetOffset).let { WGPUTextureView(it) }
			set(newValue) {
				set(resolveTargetLayout, resolveTargetOffset, newValue?.handler)
			}

		override var loadOp: WGPULoadOp
			get() = getUInt(loadOpOffset)
			set(newValue) {
				set(loadOpOffset, newValue)
			}

		override var storeOp: WGPUStoreOp
			get() = getUInt(storeOpOffset)
			set(newValue) {
				set(storeOpOffset, newValue)
			}

		override val clearValue: WGPUColor
			get() = handler.handler.asSlice(clearValueOffset, 32L).let(::NativeAddress).let { WGPUColor(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_POINTER.withName("view"),
					ffi.C_INT.withName("depthSlice"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("resolveTarget"),
					ffi.C_INT.withName("loadOp"),
					ffi.C_INT.withName("storeOp"),
					WGPUColor.LAYOUT.withName("clearValue"),
				).withName("WGPURenderPassColorAttachment")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val viewOffset: Long = 8L

		public val viewLayout: MemoryLayout = ffi.C_POINTER

		public val depthSliceOffset: Long = 16L

		public val depthSliceLayout: MemoryLayout = ffi.C_INT

		public val resolveTargetOffset: Long = 24L

		public val resolveTargetLayout: MemoryLayout = ffi.C_POINTER

		public val loadOpOffset: Long = 32L

		public val loadOpLayout: MemoryLayout = ffi.C_INT

		public val storeOpOffset: Long = 36L

		public val storeOpLayout: MemoryLayout = ffi.C_INT

		public val clearValueOffset: Long = 40L

		public val clearValueLayout: MemoryLayout = WGPUColor.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPURenderPassColorAttachment = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassColorAttachment = allocator.allocate(72L)
			.let { WGPURenderPassColorAttachment(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassColorAttachment) -> Unit,
		): ArrayHolder<WGPURenderPassColorAttachment> = allocator.allocate(72 * size.toLong())
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
}

public actual interface WGPURenderPassDepthStencilAttachment : CStructure {
	public actual var view: WGPUTextureView?

	public actual var depthLoadOp: WGPULoadOp

	public actual var depthStoreOp: WGPUStoreOp

	public actual var depthClearValue: Float

	public actual var depthReadOnly: Boolean

	public actual var stencilLoadOp: WGPULoadOp

	public actual var stencilStoreOp: WGPUStoreOp

	public actual var stencilClearValue: UInt

	public actual var stencilReadOnly: Boolean

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = get(viewLayout, viewOffset).let { WGPUTextureView(it) }
			set(newValue) {
				set(viewLayout, viewOffset, newValue?.handler)
			}

		override var depthLoadOp: WGPULoadOp
			get() = getUInt(depthLoadOpOffset)
			set(newValue) {
				set(depthLoadOpOffset, newValue)
			}

		override var depthStoreOp: WGPUStoreOp
			get() = getUInt(depthStoreOpOffset)
			set(newValue) {
				set(depthStoreOpOffset, newValue)
			}

		override var depthClearValue: Float
			get() = getFloat(depthClearValueOffset)
			set(newValue) {
				set(depthClearValueOffset, newValue)
			}

		override var depthReadOnly: Boolean
			get() = getInt(depthReadOnlyOffset).toBoolean()
			set(newValue) {
				set(depthReadOnlyOffset, newValue)
			}

		override var stencilLoadOp: WGPULoadOp
			get() = getUInt(stencilLoadOpOffset)
			set(newValue) {
				set(stencilLoadOpOffset, newValue)
			}

		override var stencilStoreOp: WGPUStoreOp
			get() = getUInt(stencilStoreOpOffset)
			set(newValue) {
				set(stencilStoreOpOffset, newValue)
			}

		override var stencilClearValue: UInt
			get() = getUInt(stencilClearValueOffset)
			set(newValue) {
				set(stencilClearValueOffset, newValue)
			}

		override var stencilReadOnly: Boolean
			get() = getInt(stencilReadOnlyOffset).toBoolean()
			set(newValue) {
				set(stencilReadOnlyOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
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

		public val viewOffset: Long = 0L

		public val viewLayout: MemoryLayout = ffi.C_POINTER

		public val depthLoadOpOffset: Long = 8L

		public val depthLoadOpLayout: MemoryLayout = ffi.C_INT

		public val depthStoreOpOffset: Long = 12L

		public val depthStoreOpLayout: MemoryLayout = ffi.C_INT

		public val depthClearValueOffset: Long = 16L

		public val depthClearValueLayout: MemoryLayout = ffi.C_FLOAT

		public val depthReadOnlyOffset: Long = 20L

		public val depthReadOnlyLayout: MemoryLayout = ffi.C_INT

		public val stencilLoadOpOffset: Long = 24L

		public val stencilLoadOpLayout: MemoryLayout = ffi.C_INT

		public val stencilStoreOpOffset: Long = 28L

		public val stencilStoreOpLayout: MemoryLayout = ffi.C_INT

		public val stencilClearValueOffset: Long = 32L

		public val stencilClearValueLayout: MemoryLayout = ffi.C_INT

		public val stencilReadOnlyOffset: Long = 36L

		public val stencilReadOnlyLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPURenderPassDepthStencilAttachment = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDepthStencilAttachment = allocator.allocate(40L)
			.let { WGPURenderPassDepthStencilAttachment(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassDepthStencilAttachment) -> Unit,
		): ArrayHolder<WGPURenderPassDepthStencilAttachment> = allocator.allocate(40 * size.toLong())
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
}

public actual interface WGPURenderPassDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var colorAttachmentCount: ULong

	public actual var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?

	public actual var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?

	public actual var occlusionQuerySet: WGPUQuerySet?

	public actual var timestampWrites: WGPURenderPassTimestampWrites?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var colorAttachmentCount: ULong
			get() = getULong(colorAttachmentCountOffset)
			set(newValue) {
				set(colorAttachmentCountOffset, newValue)
			}

		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = get(colorAttachmentsLayout, colorAttachmentsOffset).let(::ArrayHolder)
			set(newValue) {
				set(colorAttachmentsLayout, colorAttachmentsOffset, newValue?.handler)
			}

		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = get(depthStencilAttachmentLayout, depthStencilAttachmentOffset).let { WGPURenderPassDepthStencilAttachment(it) }
			set(newValue) {
				set(depthStencilAttachmentLayout, depthStencilAttachmentOffset, newValue?.handler)
			}

		override var occlusionQuerySet: WGPUQuerySet?
			get() = get(occlusionQuerySetLayout, occlusionQuerySetOffset).let { WGPUQuerySet(it) }
			set(newValue) {
				set(occlusionQuerySetLayout, occlusionQuerySetOffset, newValue?.handler)
			}

		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = get(timestampWritesLayout, timestampWritesOffset).let { WGPURenderPassTimestampWrites(it) }
			set(newValue) {
				set(timestampWritesLayout, timestampWritesOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_LONG.withName("colorAttachmentCount"),
					ffi.C_POINTER.withName("colorAttachments"),
					ffi.C_POINTER.withName("depthStencilAttachment"),
					ffi.C_POINTER.withName("occlusionQuerySet"),
					ffi.C_POINTER.withName("timestampWrites"),
				).withName("WGPURenderPassDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val colorAttachmentCountOffset: Long = 24L

		public val colorAttachmentCountLayout: MemoryLayout = ffi.C_LONG

		public val colorAttachmentsOffset: Long = 32L

		public val colorAttachmentsLayout: MemoryLayout = ffi.C_POINTER

		public val depthStencilAttachmentOffset: Long = 40L

		public val depthStencilAttachmentLayout: MemoryLayout = ffi.C_POINTER

		public val occlusionQuerySetOffset: Long = 48L

		public val occlusionQuerySetLayout: MemoryLayout = ffi.C_POINTER

		public val timestampWritesOffset: Long = 56L

		public val timestampWritesLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPURenderPassDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptor = allocator.allocate(64L)
			.let { WGPURenderPassDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassDescriptor) -> Unit,
		): ArrayHolder<WGPURenderPassDescriptor> = allocator.allocate(64 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 64L)
						.let(::NativeAddress)
						.let { WGPURenderPassDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUChainedStruct : CStructure {
	public actual var next: WGPUChainedStruct?

	public actual var sType: WGPUSType

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = get(nextLayout, nextOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextLayout, nextOffset, newValue?.handler)
			}

		override var sType: WGPUSType
			get() = getUInt(sTypeOffset)
			set(newValue) {
				set(sTypeOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("next"),
					ffi.C_INT.withName("sType"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUChainedStruct")

		public val nextOffset: Long = 0L

		public val nextLayout: MemoryLayout = ffi.C_POINTER

		public val sTypeOffset: Long = 8L

		public val sTypeLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUChainedStruct = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUChainedStruct = allocator.allocate(16L)
			.let { WGPUChainedStruct(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUChainedStruct) -> Unit,
		): ArrayHolder<WGPUChainedStruct> = allocator.allocate(16 * size.toLong())
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
}

public actual interface WGPURenderPassMaxDrawCount : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual var maxDrawCount: ULong

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var maxDrawCount: ULong
			get() = getULong(maxDrawCountOffset)
			set(newValue) {
				set(maxDrawCountOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					ffi.C_LONG.withName("maxDrawCount"),
				).withName("WGPURenderPassMaxDrawCount")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val maxDrawCountOffset: Long = 16L

		public val maxDrawCountLayout: MemoryLayout = ffi.C_LONG

		public actual operator fun invoke(address: NativeAddress): WGPURenderPassMaxDrawCount = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassMaxDrawCount = allocator.allocate(24L)
			.let { WGPURenderPassMaxDrawCount(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassMaxDrawCount) -> Unit,
		): ArrayHolder<WGPURenderPassMaxDrawCount> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPURenderPassMaxDrawCount(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPURenderPassTimestampWrites : CStructure {
	public actual var querySet: WGPUQuerySet?

	public actual var beginningOfPassWriteIndex: UInt

	public actual var endOfPassWriteIndex: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = get(querySetLayout, querySetOffset).let { WGPUQuerySet(it) }
			set(newValue) {
				set(querySetLayout, querySetOffset, newValue?.handler)
			}

		override var beginningOfPassWriteIndex: UInt
			get() = getUInt(beginningOfPassWriteIndexOffset)
			set(newValue) {
				set(beginningOfPassWriteIndexOffset, newValue)
			}

		override var endOfPassWriteIndex: UInt
			get() = getUInt(endOfPassWriteIndexOffset)
			set(newValue) {
				set(endOfPassWriteIndexOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("querySet"),
					ffi.C_INT.withName("beginningOfPassWriteIndex"),
					ffi.C_INT.withName("endOfPassWriteIndex"),
				).withName("WGPURenderPassTimestampWrites")

		public val querySetOffset: Long = 0L

		public val querySetLayout: MemoryLayout = ffi.C_POINTER

		public val beginningOfPassWriteIndexOffset: Long = 8L

		public val beginningOfPassWriteIndexLayout: MemoryLayout = ffi.C_INT

		public val endOfPassWriteIndexOffset: Long = 12L

		public val endOfPassWriteIndexLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPURenderPassTimestampWrites = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassTimestampWrites = allocator.allocate(16L)
			.let { WGPURenderPassTimestampWrites(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassTimestampWrites) -> Unit,
		): ArrayHolder<WGPURenderPassTimestampWrites> = allocator.allocate(16 * size.toLong())
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
}

public actual interface WGPUVertexState : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var module: WGPUShaderModule?

	public actual val entryPoint: WGPUStringView

	public actual var constantCount: ULong

	public actual var constants: ArrayHolder<WGPUConstantEntry>?

	public actual var bufferCount: ULong

	public actual var buffers: ArrayHolder<WGPUVertexBufferLayout>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var module: WGPUShaderModule?
			get() = get(moduleLayout, moduleOffset).let { WGPUShaderModule(it) }
			set(newValue) {
				set(moduleLayout, moduleOffset, newValue?.handler)
			}

		override val entryPoint: WGPUStringView
			get() = handler.handler.asSlice(entryPointOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var constantCount: ULong
			get() = getULong(constantCountOffset)
			set(newValue) {
				set(constantCountOffset, newValue)
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = get(constantsLayout, constantsOffset).let(::ArrayHolder)
			set(newValue) {
				set(constantsLayout, constantsOffset, newValue?.handler)
			}

		override var bufferCount: ULong
			get() = getULong(bufferCountOffset)
			set(newValue) {
				set(bufferCountOffset, newValue)
			}

		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = get(buffersLayout, buffersOffset).let(::ArrayHolder)
			set(newValue) {
				set(buffersLayout, buffersOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_POINTER.withName("module"),
					WGPUStringView.LAYOUT.withName("entryPoint"),
					ffi.C_LONG.withName("constantCount"),
					ffi.C_POINTER.withName("constants"),
					ffi.C_LONG.withName("bufferCount"),
					ffi.C_POINTER.withName("buffers"),
				).withName("WGPUVertexState")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val moduleOffset: Long = 8L

		public val moduleLayout: MemoryLayout = ffi.C_POINTER

		public val entryPointOffset: Long = 16L

		public val entryPointLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val constantCountOffset: Long = 32L

		public val constantCountLayout: MemoryLayout = ffi.C_LONG

		public val constantsOffset: Long = 40L

		public val constantsLayout: MemoryLayout = ffi.C_POINTER

		public val bufferCountOffset: Long = 48L

		public val bufferCountLayout: MemoryLayout = ffi.C_LONG

		public val buffersOffset: Long = 56L

		public val buffersLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUVertexState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUVertexState = allocator.allocate(64L)
			.let { WGPUVertexState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexState) -> Unit,
		): ArrayHolder<WGPUVertexState> = allocator.allocate(64 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 64L)
						.let(::NativeAddress)
						.let { WGPUVertexState(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPURenderPipelineDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var layout: WGPUPipelineLayout?

	public actual val vertex: WGPUVertexState

	public actual val primitive: WGPUPrimitiveState

	public actual var depthStencil: WGPUDepthStencilState?

	public actual val multisample: WGPUMultisampleState

	public actual var fragment: WGPUFragmentState?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var layout: WGPUPipelineLayout?
			get() = get(layoutLayout, layoutOffset).let { WGPUPipelineLayout(it) }
			set(newValue) {
				set(layoutLayout, layoutOffset, newValue?.handler)
			}

		override val vertex: WGPUVertexState
			get() = handler.handler.asSlice(vertexOffset, 64L).let(::NativeAddress).let { WGPUVertexState(it) }

		override val primitive: WGPUPrimitiveState
			get() = handler.handler.asSlice(primitiveOffset, 32L).let(::NativeAddress).let { WGPUPrimitiveState(it) }

		override var depthStencil: WGPUDepthStencilState?
			get() = get(depthStencilLayout, depthStencilOffset).let { WGPUDepthStencilState(it) }
			set(newValue) {
				set(depthStencilLayout, depthStencilOffset, newValue?.handler)
			}

		override val multisample: WGPUMultisampleState
			get() = handler.handler.asSlice(multisampleOffset, 24L).let(::NativeAddress).let { WGPUMultisampleState(it) }

		override var fragment: WGPUFragmentState?
			get() = get(fragmentLayout, fragmentOffset).let { WGPUFragmentState(it) }
			set(newValue) {
				set(fragmentLayout, fragmentOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_POINTER.withName("layout"),
					WGPUVertexState.LAYOUT.withName("vertex"),
					WGPUPrimitiveState.LAYOUT.withName("primitive"),
					ffi.C_POINTER.withName("depthStencil"),
					WGPUMultisampleState.LAYOUT.withName("multisample"),
					ffi.C_POINTER.withName("fragment"),
				).withName("WGPURenderPipelineDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val layoutOffset: Long = 24L

		public val layoutLayout: MemoryLayout = ffi.C_POINTER

		public val vertexOffset: Long = 32L

		public val vertexLayout: MemoryLayout = WGPUVertexState.LAYOUT

		public val primitiveOffset: Long = 96L

		public val primitiveLayout: MemoryLayout = WGPUPrimitiveState.LAYOUT

		public val depthStencilOffset: Long = 128L

		public val depthStencilLayout: MemoryLayout = ffi.C_POINTER

		public val multisampleOffset: Long = 136L

		public val multisampleLayout: MemoryLayout = WGPUMultisampleState.LAYOUT

		public val fragmentOffset: Long = 160L

		public val fragmentLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPURenderPipelineDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPipelineDescriptor = allocator.allocate(168L)
			.let { WGPURenderPipelineDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPipelineDescriptor) -> Unit,
		): ArrayHolder<WGPURenderPipelineDescriptor> = allocator.allocate(168 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 168L)
						.let(::NativeAddress)
						.let { WGPURenderPipelineDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPURequestAdapterOptions : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var featureLevel: WGPUFeatureLevel

	public actual var powerPreference: WGPUPowerPreference

	public actual var forceFallbackAdapter: Boolean

	public actual var backendType: WGPUBackendType

	public actual var compatibleSurface: WGPUSurface?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var featureLevel: WGPUFeatureLevel
			get() = getUInt(featureLevelOffset)
			set(newValue) {
				set(featureLevelOffset, newValue)
			}

		override var powerPreference: WGPUPowerPreference
			get() = getUInt(powerPreferenceOffset)
			set(newValue) {
				set(powerPreferenceOffset, newValue)
			}

		override var forceFallbackAdapter: Boolean
			get() = getInt(forceFallbackAdapterOffset).toBoolean()
			set(newValue) {
				set(forceFallbackAdapterOffset, newValue)
			}

		override var backendType: WGPUBackendType
			get() = getUInt(backendTypeOffset)
			set(newValue) {
				set(backendTypeOffset, newValue)
			}

		override var compatibleSurface: WGPUSurface?
			get() = get(compatibleSurfaceLayout, compatibleSurfaceOffset).let { WGPUSurface(it) }
			set(newValue) {
				set(compatibleSurfaceLayout, compatibleSurfaceOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("featureLevel"),
					ffi.C_INT.withName("powerPreference"),
					ffi.C_INT.withName("forceFallbackAdapter"),
					ffi.C_INT.withName("backendType"),
					ffi.C_POINTER.withName("compatibleSurface"),
				).withName("WGPURequestAdapterOptions")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val featureLevelOffset: Long = 8L

		public val featureLevelLayout: MemoryLayout = ffi.C_INT

		public val powerPreferenceOffset: Long = 12L

		public val powerPreferenceLayout: MemoryLayout = ffi.C_INT

		public val forceFallbackAdapterOffset: Long = 16L

		public val forceFallbackAdapterLayout: MemoryLayout = ffi.C_INT

		public val backendTypeOffset: Long = 20L

		public val backendTypeLayout: MemoryLayout = ffi.C_INT

		public val compatibleSurfaceOffset: Long = 24L

		public val compatibleSurfaceLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPURequestAdapterOptions = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterOptions = allocator.allocate(32L)
			.let { WGPURequestAdapterOptions(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestAdapterOptions) -> Unit,
		): ArrayHolder<WGPURequestAdapterOptions> = allocator.allocate(32 * size.toLong())
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
}

public actual interface WGPUSamplerDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var addressModeU: WGPUAddressMode

	public actual var addressModeV: WGPUAddressMode

	public actual var addressModeW: WGPUAddressMode

	public actual var magFilter: WGPUFilterMode

	public actual var minFilter: WGPUFilterMode

	public actual var mipmapFilter: WGPUMipmapFilterMode

	public actual var lodMinClamp: Float

	public actual var lodMaxClamp: Float

	public actual var compare: WGPUCompareFunction

	public actual var maxAnisotropy: UShort

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var addressModeU: WGPUAddressMode
			get() = getUInt(addressModeUOffset)
			set(newValue) {
				set(addressModeUOffset, newValue)
			}

		override var addressModeV: WGPUAddressMode
			get() = getUInt(addressModeVOffset)
			set(newValue) {
				set(addressModeVOffset, newValue)
			}

		override var addressModeW: WGPUAddressMode
			get() = getUInt(addressModeWOffset)
			set(newValue) {
				set(addressModeWOffset, newValue)
			}

		override var magFilter: WGPUFilterMode
			get() = getUInt(magFilterOffset)
			set(newValue) {
				set(magFilterOffset, newValue)
			}

		override var minFilter: WGPUFilterMode
			get() = getUInt(minFilterOffset)
			set(newValue) {
				set(minFilterOffset, newValue)
			}

		override var mipmapFilter: WGPUMipmapFilterMode
			get() = getUInt(mipmapFilterOffset)
			set(newValue) {
				set(mipmapFilterOffset, newValue)
			}

		override var lodMinClamp: Float
			get() = getFloat(lodMinClampOffset)
			set(newValue) {
				set(lodMinClampOffset, newValue)
			}

		override var lodMaxClamp: Float
			get() = getFloat(lodMaxClampOffset)
			set(newValue) {
				set(lodMaxClampOffset, newValue)
			}

		override var compare: WGPUCompareFunction
			get() = getUInt(compareOffset)
			set(newValue) {
				set(compareOffset, newValue)
			}

		override var maxAnisotropy: UShort
			get() = getUShort(maxAnisotropyOffset)
			set(newValue) {
				set(maxAnisotropyOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
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

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val addressModeUOffset: Long = 24L

		public val addressModeULayout: MemoryLayout = ffi.C_INT

		public val addressModeVOffset: Long = 28L

		public val addressModeVLayout: MemoryLayout = ffi.C_INT

		public val addressModeWOffset: Long = 32L

		public val addressModeWLayout: MemoryLayout = ffi.C_INT

		public val magFilterOffset: Long = 36L

		public val magFilterLayout: MemoryLayout = ffi.C_INT

		public val minFilterOffset: Long = 40L

		public val minFilterLayout: MemoryLayout = ffi.C_INT

		public val mipmapFilterOffset: Long = 44L

		public val mipmapFilterLayout: MemoryLayout = ffi.C_INT

		public val lodMinClampOffset: Long = 48L

		public val lodMinClampLayout: MemoryLayout = ffi.C_FLOAT

		public val lodMaxClampOffset: Long = 52L

		public val lodMaxClampLayout: MemoryLayout = ffi.C_FLOAT

		public val compareOffset: Long = 56L

		public val compareLayout: MemoryLayout = ffi.C_INT

		public val maxAnisotropyOffset: Long = 60L

		public val maxAnisotropyLayout: MemoryLayout = ffi.C_SHORT

		public actual operator fun invoke(address: NativeAddress): WGPUSamplerDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSamplerDescriptor = allocator.allocate(68L)
			.let { WGPUSamplerDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSamplerDescriptor) -> Unit,
		): ArrayHolder<WGPUSamplerDescriptor> = allocator.allocate(68 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 68L)
						.let(::NativeAddress)
						.let { WGPUSamplerDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUShaderModuleDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
				).withName("WGPUShaderModuleDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUShaderModuleDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleDescriptor = allocator.allocate(24L)
			.let { WGPUShaderModuleDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderModuleDescriptor) -> Unit,
		): ArrayHolder<WGPUShaderModuleDescriptor> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUShaderModuleDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUShaderSourceSPIRV : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual var codeSize: UInt

	public actual var code: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUShaderSourceSPIRV {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var codeSize: UInt
			get() = getUInt(codeSizeOffset)
			set(newValue) {
				set(codeSizeOffset, newValue)
			}

		override var code: NativeAddress?
			get() = get(codeLayout, codeOffset)
			set(newValue) {
				set(codeLayout, codeOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					ffi.C_INT.withName("codeSize"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("code"),
				).withName("WGPUShaderSourceSPIRV")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val codeSizeOffset: Long = 16L

		public val codeSizeLayout: MemoryLayout = ffi.C_INT

		public val codeOffset: Long = 24L

		public val codeLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUShaderSourceSPIRV = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUShaderSourceSPIRV = allocator.allocate(32L)
			.let { WGPUShaderSourceSPIRV(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderSourceSPIRV) -> Unit,
		): ArrayHolder<WGPUShaderSourceSPIRV> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUShaderSourceSPIRV(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUShaderSourceWGSL : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual val code: WGPUStringView

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUShaderSourceWGSL {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override val code: WGPUStringView
			get() = handler.handler.asSlice(codeOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					WGPUStringView.LAYOUT.withName("code"),
				).withName("WGPUShaderSourceWGSL")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val codeOffset: Long = 16L

		public val codeLayout: MemoryLayout = WGPUStringView.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUShaderSourceWGSL = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUShaderSourceWGSL = allocator.allocate(32L)
			.let { WGPUShaderSourceWGSL(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderSourceWGSL) -> Unit,
		): ArrayHolder<WGPUShaderSourceWGSL> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUShaderSourceWGSL(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSupportedFeatures : CStructure {
	public actual var featureCount: ULong

	public actual var features: ArrayHolder<WGPUFeatureName>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSupportedFeatures {
		override var featureCount: ULong
			get() = getULong(featureCountOffset)
			set(newValue) {
				set(featureCountOffset, newValue)
			}

		override var features: ArrayHolder<WGPUFeatureName>?
			get() = get(featuresLayout, featuresOffset).let(::ArrayHolder)
			set(newValue) {
				set(featuresLayout, featuresOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_LONG.withName("featureCount"),
					ffi.C_POINTER.withName("features"),
				).withName("WGPUSupportedFeatures")

		public val featureCountOffset: Long = 0L

		public val featureCountLayout: MemoryLayout = ffi.C_LONG

		public val featuresOffset: Long = 8L

		public val featuresLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUSupportedFeatures = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSupportedFeatures = allocator.allocate(16L)
			.let { WGPUSupportedFeatures(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSupportedFeatures) -> Unit,
		): ArrayHolder<WGPUSupportedFeatures> = allocator.allocate(16 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 16L)
						.let(::NativeAddress)
						.let { WGPUSupportedFeatures(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSupportedWGSLLanguageFeatures : CStructure {
	public actual var featureCount: ULong

	public actual var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSupportedWGSLLanguageFeatures {
		override var featureCount: ULong
			get() = getULong(featureCountOffset)
			set(newValue) {
				set(featureCountOffset, newValue)
			}

		override var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?
			get() = get(featuresLayout, featuresOffset).let(::ArrayHolder)
			set(newValue) {
				set(featuresLayout, featuresOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_LONG.withName("featureCount"),
					ffi.C_POINTER.withName("features"),
				).withName("WGPUSupportedWGSLLanguageFeatures")

		public val featureCountOffset: Long = 0L

		public val featureCountLayout: MemoryLayout = ffi.C_LONG

		public val featuresOffset: Long = 8L

		public val featuresLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUSupportedWGSLLanguageFeatures = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSupportedWGSLLanguageFeatures = allocator.allocate(16L)
			.let { WGPUSupportedWGSLLanguageFeatures(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSupportedWGSLLanguageFeatures) -> Unit,
		): ArrayHolder<WGPUSupportedWGSLLanguageFeatures> = allocator.allocate(16 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 16L)
						.let(::NativeAddress)
						.let { WGPUSupportedWGSLLanguageFeatures(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSurfaceCapabilities : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var usages: ULong

	public actual var formatCount: ULong

	public actual var formats: ArrayHolder<WGPUTextureFormat>?

	public actual var presentModeCount: ULong

	public actual var presentModes: ArrayHolder<WGPUPresentMode>?

	public actual var alphaModeCount: ULong

	public actual var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var usages: ULong
			get() = getULong(usagesOffset)
			set(newValue) {
				set(usagesOffset, newValue)
			}

		override var formatCount: ULong
			get() = getULong(formatCountOffset)
			set(newValue) {
				set(formatCountOffset, newValue)
			}

		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = get(formatsLayout, formatsOffset).let(::ArrayHolder)
			set(newValue) {
				set(formatsLayout, formatsOffset, newValue?.handler)
			}

		override var presentModeCount: ULong
			get() = getULong(presentModeCountOffset)
			set(newValue) {
				set(presentModeCountOffset, newValue)
			}

		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = get(presentModesLayout, presentModesOffset).let(::ArrayHolder)
			set(newValue) {
				set(presentModesLayout, presentModesOffset, newValue?.handler)
			}

		override var alphaModeCount: ULong
			get() = getULong(alphaModeCountOffset)
			set(newValue) {
				set(alphaModeCountOffset, newValue)
			}

		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = get(alphaModesLayout, alphaModesOffset).let(::ArrayHolder)
			set(newValue) {
				set(alphaModesLayout, alphaModesOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_LONG.withName("usages"),
					ffi.C_LONG.withName("formatCount"),
					ffi.C_POINTER.withName("formats"),
					ffi.C_LONG.withName("presentModeCount"),
					ffi.C_POINTER.withName("presentModes"),
					ffi.C_LONG.withName("alphaModeCount"),
					ffi.C_POINTER.withName("alphaModes"),
				).withName("WGPUSurfaceCapabilities")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val usagesOffset: Long = 8L

		public val usagesLayout: MemoryLayout = ffi.C_LONG

		public val formatCountOffset: Long = 16L

		public val formatCountLayout: MemoryLayout = ffi.C_LONG

		public val formatsOffset: Long = 24L

		public val formatsLayout: MemoryLayout = ffi.C_POINTER

		public val presentModeCountOffset: Long = 32L

		public val presentModeCountLayout: MemoryLayout = ffi.C_LONG

		public val presentModesOffset: Long = 40L

		public val presentModesLayout: MemoryLayout = ffi.C_POINTER

		public val alphaModeCountOffset: Long = 48L

		public val alphaModeCountLayout: MemoryLayout = ffi.C_LONG

		public val alphaModesOffset: Long = 56L

		public val alphaModesLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceCapabilities = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceCapabilities = allocator.allocate(64L)
			.let { WGPUSurfaceCapabilities(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceCapabilities) -> Unit,
		): ArrayHolder<WGPUSurfaceCapabilities> = allocator.allocate(64 * size.toLong())
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
}

public actual interface WGPUSurfaceConfiguration : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var device: WGPUDevice?

	public actual var format: WGPUTextureFormat

	public actual var usage: ULong

	public actual var width: UInt

	public actual var height: UInt

	public actual var viewFormatCount: ULong

	public actual var viewFormats: ArrayHolder<WGPUTextureFormat>?

	public actual var alphaMode: WGPUCompositeAlphaMode

	public actual var presentMode: WGPUPresentMode

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var device: WGPUDevice?
			get() = get(deviceLayout, deviceOffset).let { WGPUDevice(it) }
			set(newValue) {
				set(deviceLayout, deviceOffset, newValue?.handler)
			}

		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) {
				set(formatOffset, newValue)
			}

		override var usage: ULong
			get() = getULong(usageOffset)
			set(newValue) {
				set(usageOffset, newValue)
			}

		override var width: UInt
			get() = getUInt(widthOffset)
			set(newValue) {
				set(widthOffset, newValue)
			}

		override var height: UInt
			get() = getUInt(heightOffset)
			set(newValue) {
				set(heightOffset, newValue)
			}

		override var viewFormatCount: ULong
			get() = getULong(viewFormatCountOffset)
			set(newValue) {
				set(viewFormatCountOffset, newValue)
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = get(viewFormatsLayout, viewFormatsOffset).let(::ArrayHolder)
			set(newValue) {
				set(viewFormatsLayout, viewFormatsOffset, newValue?.handler)
			}

		override var alphaMode: WGPUCompositeAlphaMode
			get() = getUInt(alphaModeOffset)
			set(newValue) {
				set(alphaModeOffset, newValue)
			}

		override var presentMode: WGPUPresentMode
			get() = getUInt(presentModeOffset)
			set(newValue) {
				set(presentModeOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_POINTER.withName("device"),
					ffi.C_INT.withName("format"),
					MemoryLayout.paddingLayout(4),
					ffi.C_LONG.withName("usage"),
					ffi.C_INT.withName("width"),
					ffi.C_INT.withName("height"),
					ffi.C_LONG.withName("viewFormatCount"),
					ffi.C_POINTER.withName("viewFormats"),
					ffi.C_INT.withName("alphaMode"),
					ffi.C_INT.withName("presentMode"),
				).withName("WGPUSurfaceConfiguration")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val deviceOffset: Long = 8L

		public val deviceLayout: MemoryLayout = ffi.C_POINTER

		public val formatOffset: Long = 16L

		public val formatLayout: MemoryLayout = ffi.C_INT

		public val usageOffset: Long = 24L

		public val usageLayout: MemoryLayout = ffi.C_LONG

		public val widthOffset: Long = 32L

		public val widthLayout: MemoryLayout = ffi.C_INT

		public val heightOffset: Long = 36L

		public val heightLayout: MemoryLayout = ffi.C_INT

		public val viewFormatCountOffset: Long = 40L

		public val viewFormatCountLayout: MemoryLayout = ffi.C_LONG

		public val viewFormatsOffset: Long = 48L

		public val viewFormatsLayout: MemoryLayout = ffi.C_POINTER

		public val alphaModeOffset: Long = 56L

		public val alphaModeLayout: MemoryLayout = ffi.C_INT

		public val presentModeOffset: Long = 60L

		public val presentModeLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceConfiguration = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceConfiguration = allocator.allocate(64L)
			.let { WGPUSurfaceConfiguration(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceConfiguration) -> Unit,
		): ArrayHolder<WGPUSurfaceConfiguration> = allocator.allocate(64 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 64L)
						.let(::NativeAddress)
						.let { WGPUSurfaceConfiguration(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSurfaceDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
				).withName("WGPUSurfaceDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptor = allocator.allocate(24L)
			.let { WGPUSurfaceDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceDescriptor) -> Unit,
		): ArrayHolder<WGPUSurfaceDescriptor> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUSurfaceDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSurfaceSourceAndroidNativeWindow : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual var window: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var window: NativeAddress?
			get() = get(windowLayout, windowOffset)
			set(newValue) {
				set(windowLayout, windowOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					ffi.C_POINTER.withName("window"),
				).withName("WGPUSurfaceSourceAndroidNativeWindow")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val windowOffset: Long = 16L

		public val windowLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceAndroidNativeWindow = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceAndroidNativeWindow = allocator.allocate(24L)
			.let { WGPUSurfaceSourceAndroidNativeWindow(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceAndroidNativeWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceAndroidNativeWindow> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUSurfaceSourceAndroidNativeWindow(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSurfaceSourceMetalLayer : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual var layer: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var layer: NativeAddress?
			get() = get(layerLayout, layerOffset)
			set(newValue) {
				set(layerLayout, layerOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					ffi.C_POINTER.withName("layer"),
				).withName("WGPUSurfaceSourceMetalLayer")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val layerOffset: Long = 16L

		public val layerLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceMetalLayer = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceMetalLayer = allocator.allocate(24L)
			.let { WGPUSurfaceSourceMetalLayer(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceMetalLayer) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceMetalLayer> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUSurfaceSourceMetalLayer(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSurfaceSourceWaylandSurface : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual var display: NativeAddress?

	public actual var surface: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var display: NativeAddress?
			get() = get(displayLayout, displayOffset)
			set(newValue) {
				set(displayLayout, displayOffset, newValue)
			}

		override var surface: NativeAddress?
			get() = get(surfaceLayout, surfaceOffset)
			set(newValue) {
				set(surfaceLayout, surfaceOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					ffi.C_POINTER.withName("display"),
					ffi.C_POINTER.withName("surface"),
				).withName("WGPUSurfaceSourceWaylandSurface")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val displayOffset: Long = 16L

		public val displayLayout: MemoryLayout = ffi.C_POINTER

		public val surfaceOffset: Long = 24L

		public val surfaceLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWaylandSurface = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWaylandSurface = allocator.allocate(32L)
			.let { WGPUSurfaceSourceWaylandSurface(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceWaylandSurface) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceWaylandSurface> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUSurfaceSourceWaylandSurface(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSurfaceSourceWindowsHWND : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual var hinstance: NativeAddress?

	public actual var hwnd: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var hinstance: NativeAddress?
			get() = get(hinstanceLayout, hinstanceOffset)
			set(newValue) {
				set(hinstanceLayout, hinstanceOffset, newValue)
			}

		override var hwnd: NativeAddress?
			get() = get(hwndLayout, hwndOffset)
			set(newValue) {
				set(hwndLayout, hwndOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					ffi.C_POINTER.withName("hinstance"),
					ffi.C_POINTER.withName("hwnd"),
				).withName("WGPUSurfaceSourceWindowsHWND")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val hinstanceOffset: Long = 16L

		public val hinstanceLayout: MemoryLayout = ffi.C_POINTER

		public val hwndOffset: Long = 24L

		public val hwndLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWindowsHWND = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWindowsHWND = allocator.allocate(32L)
			.let { WGPUSurfaceSourceWindowsHWND(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceWindowsHWND) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceWindowsHWND> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUSurfaceSourceWindowsHWND(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSurfaceSourceXCBWindow : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual var connection: NativeAddress?

	public actual var window: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceXCBWindow {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var connection: NativeAddress?
			get() = get(connectionLayout, connectionOffset)
			set(newValue) {
				set(connectionLayout, connectionOffset, newValue)
			}

		override var window: UInt
			get() = getUInt(windowOffset)
			set(newValue) {
				set(windowOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					ffi.C_POINTER.withName("connection"),
					ffi.C_INT.withName("window"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUSurfaceSourceXCBWindow")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val connectionOffset: Long = 16L

		public val connectionLayout: MemoryLayout = ffi.C_POINTER

		public val windowOffset: Long = 24L

		public val windowLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXCBWindow = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXCBWindow = allocator.allocate(32L)
			.let { WGPUSurfaceSourceXCBWindow(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceXCBWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceXCBWindow> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUSurfaceSourceXCBWindow(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSurfaceSourceXlibWindow : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual var display: NativeAddress?

	public actual var window: ULong

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var display: NativeAddress?
			get() = get(displayLayout, displayOffset)
			set(newValue) {
				set(displayLayout, displayOffset, newValue)
			}

		override var window: ULong
			get() = getULong(windowOffset)
			set(newValue) {
				set(windowOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					ffi.C_POINTER.withName("display"),
					ffi.C_LONG.withName("window"),
				).withName("WGPUSurfaceSourceXlibWindow")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val displayOffset: Long = 16L

		public val displayLayout: MemoryLayout = ffi.C_POINTER

		public val windowOffset: Long = 24L

		public val windowLayout: MemoryLayout = ffi.C_LONG

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXlibWindow = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXlibWindow = allocator.allocate(32L)
			.let { WGPUSurfaceSourceXlibWindow(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceXlibWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceXlibWindow> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUSurfaceSourceXlibWindow(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUSurfaceTexture : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual var texture: WGPUTexture?

	public actual var status: WGPUSurfaceGetCurrentTextureStatus

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceTexture {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override var texture: WGPUTexture?
			get() = get(textureLayout, textureOffset).let { WGPUTexture(it) }
			set(newValue) {
				set(textureLayout, textureOffset, newValue?.handler)
			}

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = getUInt(statusOffset)
			set(newValue) {
				set(statusOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_POINTER.withName("texture"),
					ffi.C_INT.withName("status"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUSurfaceTexture")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val textureOffset: Long = 8L

		public val textureLayout: MemoryLayout = ffi.C_POINTER

		public val statusOffset: Long = 16L

		public val statusLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceTexture = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceTexture = allocator.allocate(24L)
			.let { WGPUSurfaceTexture(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceTexture) -> Unit,
		): ArrayHolder<WGPUSurfaceTexture> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUSurfaceTexture(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUTexelCopyBufferLayout : CStructure {
	public actual var offset: ULong

	public actual var bytesPerRow: UInt

	public actual var rowsPerImage: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTexelCopyBufferLayout {
		override var offset: ULong
			get() = getULong(offsetOffset)
			set(newValue) {
				set(offsetOffset, newValue)
			}

		override var bytesPerRow: UInt
			get() = getUInt(bytesPerRowOffset)
			set(newValue) {
				set(bytesPerRowOffset, newValue)
			}

		override var rowsPerImage: UInt
			get() = getUInt(rowsPerImageOffset)
			set(newValue) {
				set(rowsPerImageOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_LONG.withName("offset"),
					ffi.C_INT.withName("bytesPerRow"),
					ffi.C_INT.withName("rowsPerImage"),
				).withName("WGPUTexelCopyBufferLayout")

		public val offsetOffset: Long = 0L

		public val offsetLayout: MemoryLayout = ffi.C_LONG

		public val bytesPerRowOffset: Long = 8L

		public val bytesPerRowLayout: MemoryLayout = ffi.C_INT

		public val rowsPerImageOffset: Long = 12L

		public val rowsPerImageLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferLayout = allocator.allocate(16L)
			.let { WGPUTexelCopyBufferLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyBufferLayout) -> Unit,
		): ArrayHolder<WGPUTexelCopyBufferLayout> = allocator.allocate(16 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 16L)
						.let(::NativeAddress)
						.let { WGPUTexelCopyBufferLayout(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUTexelCopyBufferInfo : CStructure {
	public actual val layout: WGPUTexelCopyBufferLayout

	public actual var buffer: WGPUBuffer?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTexelCopyBufferInfo {
		override val layout: WGPUTexelCopyBufferLayout
			get() = handler.handler.asSlice(layoutOffset, 16L).let(::NativeAddress).let { WGPUTexelCopyBufferLayout(it) }

		override var buffer: WGPUBuffer?
			get() = get(bufferLayout, bufferOffset).let { WGPUBuffer(it) }
			set(newValue) {
				set(bufferLayout, bufferOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUTexelCopyBufferLayout.LAYOUT.withName("layout"),
					ffi.C_POINTER.withName("buffer"),
				).withName("WGPUTexelCopyBufferInfo")

		public val layoutOffset: Long = 0L

		public val layoutLayout: MemoryLayout = WGPUTexelCopyBufferLayout.LAYOUT

		public val bufferOffset: Long = 16L

		public val bufferLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferInfo = allocator.allocate(24L)
			.let { WGPUTexelCopyBufferInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyBufferInfo) -> Unit,
		): ArrayHolder<WGPUTexelCopyBufferInfo> = allocator.allocate(24 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 24L)
						.let(::NativeAddress)
						.let { WGPUTexelCopyBufferInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUTexelCopyTextureInfo : CStructure {
	public actual var texture: WGPUTexture?

	public actual var mipLevel: UInt

	public actual val origin: WGPUOrigin3D

	public actual var aspect: WGPUTextureAspect

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTexelCopyTextureInfo {
		override var texture: WGPUTexture?
			get() = get(textureLayout, textureOffset).let { WGPUTexture(it) }
			set(newValue) {
				set(textureLayout, textureOffset, newValue?.handler)
			}

		override var mipLevel: UInt
			get() = getUInt(mipLevelOffset)
			set(newValue) {
				set(mipLevelOffset, newValue)
			}

		override val origin: WGPUOrigin3D
			get() = handler.handler.asSlice(originOffset, 12L).let(::NativeAddress).let { WGPUOrigin3D(it) }

		override var aspect: WGPUTextureAspect
			get() = getUInt(aspectOffset)
			set(newValue) {
				set(aspectOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("texture"),
					ffi.C_INT.withName("mipLevel"),
					WGPUOrigin3D.LAYOUT.withName("origin"),
					ffi.C_INT.withName("aspect"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUTexelCopyTextureInfo")

		public val textureOffset: Long = 0L

		public val textureLayout: MemoryLayout = ffi.C_POINTER

		public val mipLevelOffset: Long = 8L

		public val mipLevelLayout: MemoryLayout = ffi.C_INT

		public val originOffset: Long = 12L

		public val originLayout: MemoryLayout = WGPUOrigin3D.LAYOUT

		public val aspectOffset: Long = 24L

		public val aspectLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUTexelCopyTextureInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyTextureInfo = allocator.allocate(32L)
			.let { WGPUTexelCopyTextureInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyTextureInfo) -> Unit,
		): ArrayHolder<WGPUTexelCopyTextureInfo> = allocator.allocate(32 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 32L)
						.let(::NativeAddress)
						.let { WGPUTexelCopyTextureInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUTextureDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var usage: ULong

	public actual var dimension: WGPUTextureDimension

	public actual val size: WGPUExtent3D

	public actual var format: WGPUTextureFormat

	public actual var mipLevelCount: UInt

	public actual var sampleCount: UInt

	public actual var viewFormatCount: ULong

	public actual var viewFormats: ArrayHolder<WGPUTextureFormat>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var usage: ULong
			get() = getULong(usageOffset)
			set(newValue) {
				set(usageOffset, newValue)
			}

		override var dimension: WGPUTextureDimension
			get() = getUInt(dimensionOffset)
			set(newValue) {
				set(dimensionOffset, newValue)
			}

		override val size: WGPUExtent3D
			get() = handler.handler.asSlice(sizeOffset, 12L).let(::NativeAddress).let { WGPUExtent3D(it) }

		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) {
				set(formatOffset, newValue)
			}

		override var mipLevelCount: UInt
			get() = getUInt(mipLevelCountOffset)
			set(newValue) {
				set(mipLevelCountOffset, newValue)
			}

		override var sampleCount: UInt
			get() = getUInt(sampleCountOffset)
			set(newValue) {
				set(sampleCountOffset, newValue)
			}

		override var viewFormatCount: ULong
			get() = getULong(viewFormatCountOffset)
			set(newValue) {
				set(viewFormatCountOffset, newValue)
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = get(viewFormatsLayout, viewFormatsOffset).let(::ArrayHolder)
			set(newValue) {
				set(viewFormatsLayout, viewFormatsOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_LONG.withName("usage"),
					ffi.C_INT.withName("dimension"),
					WGPUExtent3D.LAYOUT.withName("size"),
					ffi.C_INT.withName("format"),
					ffi.C_INT.withName("mipLevelCount"),
					ffi.C_INT.withName("sampleCount"),
					MemoryLayout.paddingLayout(4),
					ffi.C_LONG.withName("viewFormatCount"),
					ffi.C_POINTER.withName("viewFormats"),
				).withName("WGPUTextureDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val usageOffset: Long = 24L

		public val usageLayout: MemoryLayout = ffi.C_LONG

		public val dimensionOffset: Long = 32L

		public val dimensionLayout: MemoryLayout = ffi.C_INT

		public val sizeOffset: Long = 36L

		public val sizeLayout: MemoryLayout = WGPUExtent3D.LAYOUT

		public val formatOffset: Long = 48L

		public val formatLayout: MemoryLayout = ffi.C_INT

		public val mipLevelCountOffset: Long = 52L

		public val mipLevelCountLayout: MemoryLayout = ffi.C_INT

		public val sampleCountOffset: Long = 56L

		public val sampleCountLayout: MemoryLayout = ffi.C_INT

		public val viewFormatCountOffset: Long = 64L

		public val viewFormatCountLayout: MemoryLayout = ffi.C_LONG

		public val viewFormatsOffset: Long = 72L

		public val viewFormatsLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUTextureDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTextureDescriptor = allocator.allocate(80L)
			.let { WGPUTextureDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureDescriptor) -> Unit,
		): ArrayHolder<WGPUTextureDescriptor> = allocator.allocate(80 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 80L)
						.let(::NativeAddress)
						.let { WGPUTextureDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUTextureViewDescriptor : CStructure {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var format: WGPUTextureFormat

	public actual var dimension: WGPUTextureViewDimension

	public actual var baseMipLevel: UInt

	public actual var mipLevelCount: UInt

	public actual var baseArrayLayer: UInt

	public actual var arrayLayerCount: UInt

	public actual var aspect: WGPUTextureAspect

	public actual var usage: ULong

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = get(nextInChainLayout, nextInChainOffset)
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue)
			}

		override val label: WGPUStringView
			get() = handler.handler.asSlice(labelOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var format: WGPUTextureFormat
			get() = getUInt(formatOffset)
			set(newValue) {
				set(formatOffset, newValue)
			}

		override var dimension: WGPUTextureViewDimension
			get() = getUInt(dimensionOffset)
			set(newValue) {
				set(dimensionOffset, newValue)
			}

		override var baseMipLevel: UInt
			get() = getUInt(baseMipLevelOffset)
			set(newValue) {
				set(baseMipLevelOffset, newValue)
			}

		override var mipLevelCount: UInt
			get() = getUInt(mipLevelCountOffset)
			set(newValue) {
				set(mipLevelCountOffset, newValue)
			}

		override var baseArrayLayer: UInt
			get() = getUInt(baseArrayLayerOffset)
			set(newValue) {
				set(baseArrayLayerOffset, newValue)
			}

		override var arrayLayerCount: UInt
			get() = getUInt(arrayLayerCountOffset)
			set(newValue) {
				set(arrayLayerCountOffset, newValue)
			}

		override var aspect: WGPUTextureAspect
			get() = getUInt(aspectOffset)
			set(newValue) {
				set(aspectOffset, newValue)
			}

		override var usage: ULong
			get() = getULong(usageOffset)
			set(newValue) {
				set(usageOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					WGPUStringView.LAYOUT.withName("label"),
					ffi.C_INT.withName("format"),
					ffi.C_INT.withName("dimension"),
					ffi.C_INT.withName("baseMipLevel"),
					ffi.C_INT.withName("mipLevelCount"),
					ffi.C_INT.withName("baseArrayLayer"),
					ffi.C_INT.withName("arrayLayerCount"),
					ffi.C_INT.withName("aspect"),
					MemoryLayout.paddingLayout(4),
					ffi.C_LONG.withName("usage"),
				).withName("WGPUTextureViewDescriptor")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val labelOffset: Long = 8L

		public val labelLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val formatOffset: Long = 24L

		public val formatLayout: MemoryLayout = ffi.C_INT

		public val dimensionOffset: Long = 28L

		public val dimensionLayout: MemoryLayout = ffi.C_INT

		public val baseMipLevelOffset: Long = 32L

		public val baseMipLevelLayout: MemoryLayout = ffi.C_INT

		public val mipLevelCountOffset: Long = 36L

		public val mipLevelCountLayout: MemoryLayout = ffi.C_INT

		public val baseArrayLayerOffset: Long = 40L

		public val baseArrayLayerLayout: MemoryLayout = ffi.C_INT

		public val arrayLayerCountOffset: Long = 44L

		public val arrayLayerCountLayout: MemoryLayout = ffi.C_INT

		public val aspectOffset: Long = 48L

		public val aspectLayout: MemoryLayout = ffi.C_INT

		public val usageOffset: Long = 56L

		public val usageLayout: MemoryLayout = ffi.C_LONG

		public actual operator fun invoke(address: NativeAddress): WGPUTextureViewDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTextureViewDescriptor = allocator.allocate(64L)
			.let { WGPUTextureViewDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureViewDescriptor) -> Unit,
		): ArrayHolder<WGPUTextureViewDescriptor> = allocator.allocate(64 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 64L)
						.let(::NativeAddress)
						.let { WGPUTextureViewDescriptor(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUVertexAttribute : CStructure {
	public actual var format: WGPUVertexFormat

	public actual var offset: ULong

	public actual var shaderLocation: UInt

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = getUInt(formatOffset)
			set(newValue) {
				set(formatOffset, newValue)
			}

		override var offset: ULong
			get() = getULong(offsetOffset)
			set(newValue) {
				set(offsetOffset, newValue)
			}

		override var shaderLocation: UInt
			get() = getUInt(shaderLocationOffset)
			set(newValue) {
				set(shaderLocationOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_INT.withName("format"),
					MemoryLayout.paddingLayout(4),
					ffi.C_LONG.withName("offset"),
					ffi.C_INT.withName("shaderLocation"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUVertexAttribute")

		public val formatOffset: Long = 0L

		public val formatLayout: MemoryLayout = ffi.C_INT

		public val offsetOffset: Long = 8L

		public val offsetLayout: MemoryLayout = ffi.C_LONG

		public val shaderLocationOffset: Long = 16L

		public val shaderLocationLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUVertexAttribute = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUVertexAttribute = allocator.allocate(24L)
			.let { WGPUVertexAttribute(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexAttribute) -> Unit,
		): ArrayHolder<WGPUVertexAttribute> = allocator.allocate(24 * size.toLong())
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
}

public actual interface WGPUVertexBufferLayout : CStructure {
	public actual var stepMode: WGPUVertexStepMode

	public actual var arrayStride: ULong

	public actual var attributeCount: ULong

	public actual var attributes: ArrayHolder<WGPUVertexAttribute>?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUVertexBufferLayout {
		override var stepMode: WGPUVertexStepMode
			get() = getUInt(stepModeOffset)
			set(newValue) {
				set(stepModeOffset, newValue)
			}

		override var arrayStride: ULong
			get() = getULong(arrayStrideOffset)
			set(newValue) {
				set(arrayStrideOffset, newValue)
			}

		override var attributeCount: ULong
			get() = getULong(attributeCountOffset)
			set(newValue) {
				set(attributeCountOffset, newValue)
			}

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = get(attributesLayout, attributesOffset).let(::ArrayHolder)
			set(newValue) {
				set(attributesLayout, attributesOffset, newValue?.handler)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_INT.withName("stepMode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_LONG.withName("arrayStride"),
					ffi.C_LONG.withName("attributeCount"),
					ffi.C_POINTER.withName("attributes"),
				).withName("WGPUVertexBufferLayout")

		public val stepModeOffset: Long = 0L

		public val stepModeLayout: MemoryLayout = ffi.C_INT

		public val arrayStrideOffset: Long = 8L

		public val arrayStrideLayout: MemoryLayout = ffi.C_LONG

		public val attributeCountOffset: Long = 16L

		public val attributeCountLayout: MemoryLayout = ffi.C_LONG

		public val attributesOffset: Long = 24L

		public val attributesLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUVertexBufferLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUVertexBufferLayout = allocator.allocate(32L)
			.let { WGPUVertexBufferLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexBufferLayout) -> Unit,
		): ArrayHolder<WGPUVertexBufferLayout> = allocator.allocate(32 * size.toLong())
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
}

public actual interface WGPUInstanceExtras : CStructure {
	public actual val chain: WGPUChainedStruct

	public actual var backends: ULong

	public actual var flags: ULong

	public actual var dx12ShaderCompiler: WGPUDx12Compiler

	public actual var gles3MinorVersion: WGPUGles3MinorVersion

	public actual var glFenceBehaviour: WGPUGLFenceBehaviour

	public actual val dxcPath: WGPUStringView

	public actual var dxcMaxShaderModel: WGPUDxcMaxShaderModel

	public actual var budgetForDeviceCreation: NativeAddress?

	public actual var budgetForDeviceLoss: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handler.handler.asSlice(chainOffset, 16L).let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var backends: ULong
			get() = getULong(backendsOffset)
			set(newValue) {
				set(backendsOffset, newValue)
			}

		override var flags: ULong
			get() = getULong(flagsOffset)
			set(newValue) {
				set(flagsOffset, newValue)
			}

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = getUInt(dx12ShaderCompilerOffset)
			set(newValue) {
				set(dx12ShaderCompilerOffset, newValue)
			}

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = getUInt(gles3MinorVersionOffset)
			set(newValue) {
				set(gles3MinorVersionOffset, newValue)
			}

		override var glFenceBehaviour: WGPUGLFenceBehaviour
			get() = getUInt(glFenceBehaviourOffset)
			set(newValue) {
				set(glFenceBehaviourOffset, newValue)
			}

		override val dxcPath: WGPUStringView
			get() = handler.handler.asSlice(dxcPathOffset, 16L).let(::NativeAddress).let { WGPUStringView(it) }

		override var dxcMaxShaderModel: WGPUDxcMaxShaderModel
			get() = getUInt(dxcMaxShaderModelOffset)
			set(newValue) {
				set(dxcMaxShaderModelOffset, newValue)
			}

		override var budgetForDeviceCreation: NativeAddress?
			get() = get(budgetForDeviceCreationLayout, budgetForDeviceCreationOffset)
			set(newValue) {
				set(budgetForDeviceCreationLayout, budgetForDeviceCreationOffset, newValue)
			}

		override var budgetForDeviceLoss: NativeAddress?
			get() = get(budgetForDeviceLossLayout, budgetForDeviceLossOffset)
			set(newValue) {
				set(budgetForDeviceLossLayout, budgetForDeviceLossOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					WGPUChainedStruct.LAYOUT.withName("chain"),
					ffi.C_LONG.withName("backends"),
					ffi.C_LONG.withName("flags"),
					ffi.C_INT.withName("dx12ShaderCompiler"),
					ffi.C_INT.withName("gles3MinorVersion"),
					ffi.C_INT.withName("glFenceBehaviour"),
					MemoryLayout.paddingLayout(4),
					WGPUStringView.LAYOUT.withName("dxcPath"),
					ffi.C_INT.withName("dxcMaxShaderModel"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("budgetForDeviceCreation"),
					ffi.C_POINTER.withName("budgetForDeviceLoss"),
				).withName("WGPUInstanceExtras")

		public val chainOffset: Long = 0L

		public val chainLayout: MemoryLayout = WGPUChainedStruct.LAYOUT

		public val backendsOffset: Long = 16L

		public val backendsLayout: MemoryLayout = ffi.C_LONG

		public val flagsOffset: Long = 24L

		public val flagsLayout: MemoryLayout = ffi.C_LONG

		public val dx12ShaderCompilerOffset: Long = 32L

		public val dx12ShaderCompilerLayout: MemoryLayout = ffi.C_INT

		public val gles3MinorVersionOffset: Long = 36L

		public val gles3MinorVersionLayout: MemoryLayout = ffi.C_INT

		public val glFenceBehaviourOffset: Long = 40L

		public val glFenceBehaviourLayout: MemoryLayout = ffi.C_INT

		public val dxcPathOffset: Long = 48L

		public val dxcPathLayout: MemoryLayout = WGPUStringView.LAYOUT

		public val dxcMaxShaderModelOffset: Long = 64L

		public val dxcMaxShaderModelLayout: MemoryLayout = ffi.C_INT

		public val budgetForDeviceCreationOffset: Long = 72L

		public val budgetForDeviceCreationLayout: MemoryLayout = ffi.C_POINTER

		public val budgetForDeviceLossOffset: Long = 80L

		public val budgetForDeviceLossLayout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUInstanceExtras = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUInstanceExtras = allocator.allocate(88L)
			.let { WGPUInstanceExtras(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceExtras) -> Unit,
		): ArrayHolder<WGPUInstanceExtras> = allocator.allocate(88 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 88L)
						.let(::NativeAddress)
						.let { WGPUInstanceExtras(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUChainedStructOut : CStructure {
	public actual var next: WGPUChainedStructOut?

	public actual var sType: WGPUSType

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = get(nextLayout, nextOffset).let { WGPUChainedStructOut(it) }
			set(newValue) {
				set(nextLayout, nextOffset, newValue?.handler)
			}

		override var sType: WGPUSType
			get() = getUInt(sTypeOffset)
			set(newValue) {
				set(sTypeOffset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("next"),
					ffi.C_INT.withName("sType"),
					MemoryLayout.paddingLayout(4)
				).withName("WGPUChainedStructOut")

		public val nextOffset: Long = 0L

		public val nextLayout: MemoryLayout = ffi.C_POINTER

		public val sTypeOffset: Long = 8L

		public val sTypeLayout: MemoryLayout = ffi.C_INT

		public actual operator fun invoke(address: NativeAddress): WGPUChainedStructOut = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUChainedStructOut = allocator.allocate(16L)
			.let { WGPUChainedStructOut(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUChainedStructOut) -> Unit,
		): ArrayHolder<WGPUChainedStructOut> = allocator.allocate(16 * size.toLong())
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
}

public actual interface WGPUBufferMapCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUBufferMapCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBufferMapCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var mode: WGPUCallbackMode
			get() = getUInt(modeOffset)
			set(newValue) {
				set(modeOffset, newValue)
			}

		override var callback: CallbackHolder<WGPUBufferMapCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("mode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPUBufferMapCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val modeOffset: Long = 8L

		public val modeLayout: MemoryLayout = ffi.C_INT

		public val callbackOffset: Long = 16L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 24L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 32L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUBufferMapCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBufferMapCallbackInfo = allocator.allocate(40L)
			.let { WGPUBufferMapCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferMapCallbackInfo) -> Unit,
		): ArrayHolder<WGPUBufferMapCallbackInfo> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPUBufferMapCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUCompilationInfoCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUCompilationInfoCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCompilationInfoCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var mode: WGPUCallbackMode
			get() = getUInt(modeOffset)
			set(newValue) {
				set(modeOffset, newValue)
			}

		override var callback: CallbackHolder<WGPUCompilationInfoCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("mode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPUCompilationInfoCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val modeOffset: Long = 8L

		public val modeLayout: MemoryLayout = ffi.C_INT

		public val callbackOffset: Long = 16L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 24L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 32L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUCompilationInfoCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfoCallbackInfo = allocator.allocate(40L)
			.let { WGPUCompilationInfoCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationInfoCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCompilationInfoCallbackInfo> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPUCompilationInfoCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUCreateComputePipelineAsyncCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCreateComputePipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var mode: WGPUCallbackMode
			get() = getUInt(modeOffset)
			set(newValue) {
				set(modeOffset, newValue)
			}

		override var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("mode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPUCreateComputePipelineAsyncCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val modeOffset: Long = 8L

		public val modeLayout: MemoryLayout = ffi.C_INT

		public val callbackOffset: Long = 16L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 24L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 32L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUCreateComputePipelineAsyncCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCreateComputePipelineAsyncCallbackInfo = allocator.allocate(40L)
			.let { WGPUCreateComputePipelineAsyncCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCreateComputePipelineAsyncCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCreateComputePipelineAsyncCallbackInfo> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPUCreateComputePipelineAsyncCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUCreateRenderPipelineAsyncCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCreateRenderPipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var mode: WGPUCallbackMode
			get() = getUInt(modeOffset)
			set(newValue) {
				set(modeOffset, newValue)
			}

		override var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("mode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPUCreateRenderPipelineAsyncCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val modeOffset: Long = 8L

		public val modeLayout: MemoryLayout = ffi.C_INT

		public val callbackOffset: Long = 16L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 24L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 32L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUCreateRenderPipelineAsyncCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCreateRenderPipelineAsyncCallbackInfo = allocator.allocate(40L)
			.let { WGPUCreateRenderPipelineAsyncCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCreateRenderPipelineAsyncCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCreateRenderPipelineAsyncCallbackInfo> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPUCreateRenderPipelineAsyncCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUPopErrorScopeCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUPopErrorScopeCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUPopErrorScopeCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var mode: WGPUCallbackMode
			get() = getUInt(modeOffset)
			set(newValue) {
				set(modeOffset, newValue)
			}

		override var callback: CallbackHolder<WGPUPopErrorScopeCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("mode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPUPopErrorScopeCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val modeOffset: Long = 8L

		public val modeLayout: MemoryLayout = ffi.C_INT

		public val callbackOffset: Long = 16L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 24L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 32L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUPopErrorScopeCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUPopErrorScopeCallbackInfo = allocator.allocate(40L)
			.let { WGPUPopErrorScopeCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPopErrorScopeCallbackInfo) -> Unit,
		): ArrayHolder<WGPUPopErrorScopeCallbackInfo> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPUPopErrorScopeCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPUQueueWorkDoneCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUQueueWorkDoneCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var mode: WGPUCallbackMode
			get() = getUInt(modeOffset)
			set(newValue) {
				set(modeOffset, newValue)
			}

		override var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("mode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPUQueueWorkDoneCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val modeOffset: Long = 8L

		public val modeLayout: MemoryLayout = ffi.C_INT

		public val callbackOffset: Long = 16L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 24L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 32L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPUQueueWorkDoneCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUQueueWorkDoneCallbackInfo = allocator.allocate(40L)
			.let { WGPUQueueWorkDoneCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQueueWorkDoneCallbackInfo) -> Unit,
		): ArrayHolder<WGPUQueueWorkDoneCallbackInfo> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPUQueueWorkDoneCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPURequestAdapterCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPURequestAdapterCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURequestAdapterCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var mode: WGPUCallbackMode
			get() = getUInt(modeOffset)
			set(newValue) {
				set(modeOffset, newValue)
			}

		override var callback: CallbackHolder<WGPURequestAdapterCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("mode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPURequestAdapterCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val modeOffset: Long = 8L

		public val modeLayout: MemoryLayout = ffi.C_INT

		public val callbackOffset: Long = 16L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 24L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 32L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPURequestAdapterCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterCallbackInfo = allocator.allocate(40L)
			.let { WGPURequestAdapterCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestAdapterCallbackInfo) -> Unit,
		): ArrayHolder<WGPURequestAdapterCallbackInfo> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPURequestAdapterCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}

public actual interface WGPURequestDeviceCallbackInfo : CStructure {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPURequestDeviceCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURequestDeviceCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = get(nextInChainLayout, nextInChainOffset).let { WGPUChainedStruct(it) }
			set(newValue) {
				set(nextInChainLayout, nextInChainOffset, newValue?.handler)
			}

		override var mode: WGPUCallbackMode
			get() = getUInt(modeOffset)
			set(newValue) {
				set(modeOffset, newValue)
			}

		override var callback: CallbackHolder<WGPURequestDeviceCallback>?
			get() = get(callbackLayout, callbackOffset).let(::CallbackHolder)
			set(newValue) {
				set(callbackLayout, callbackOffset, newValue?.handler)
			}

		override var userdata1: NativeAddress?
			get() = get(userdata1Layout, userdata1Offset)
			set(newValue) {
				set(userdata1Layout, userdata1Offset, newValue)
			}

		override var userdata2: NativeAddress?
			get() = get(userdata2Layout, userdata2Offset)
			set(newValue) {
				set(userdata2Layout, userdata2Offset, newValue)
			}
	}

	public actual companion object {
		internal val LAYOUT: GroupLayout = structLayout(
					ffi.C_POINTER.withName("nextInChain"),
					ffi.C_INT.withName("mode"),
					MemoryLayout.paddingLayout(4),
					ffi.C_POINTER.withName("callback"),
					ffi.C_POINTER.withName("userdata1"),
					ffi.C_POINTER.withName("userdata2"),
				).withName("WGPURequestDeviceCallbackInfo")

		public val nextInChainOffset: Long = 0L

		public val nextInChainLayout: MemoryLayout = ffi.C_POINTER

		public val modeOffset: Long = 8L

		public val modeLayout: MemoryLayout = ffi.C_INT

		public val callbackOffset: Long = 16L

		public val callbackLayout: MemoryLayout = ffi.C_POINTER

		public val userdata1Offset: Long = 24L

		public val userdata1Layout: MemoryLayout = ffi.C_POINTER

		public val userdata2Offset: Long = 32L

		public val userdata2Layout: MemoryLayout = ffi.C_POINTER

		public actual operator fun invoke(address: NativeAddress): WGPURequestDeviceCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURequestDeviceCallbackInfo = allocator.allocate(40L)
			.let { WGPURequestDeviceCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestDeviceCallbackInfo) -> Unit,
		): ArrayHolder<WGPURequestDeviceCallbackInfo> = allocator.allocate(40 * size.toLong())
			.also {
				(0u until size).forEach { index ->
					it.handler.asSlice(index.toLong() * 40L)
						.let(::NativeAddress)
						.let { WGPURequestDeviceCallbackInfo(it) }
						.let { provider(index, it) }
				}
			}
			.let(::ArrayHolder)
	}
}
