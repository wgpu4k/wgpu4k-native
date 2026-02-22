// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import com.sun.jna.Pointer
import ffi.ArrayHolder
import ffi.CString
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress
import ffi.register
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit

public actual interface WGPUStringView {
	public actual var `data`: CString?

	public actual var length: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUStringView.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUStringView.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUStringView.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUStringView.ByReference = io.ygdrasil.wgpu.android.WGPUStringView.ByReference(Pointer.NULL),
	) : WGPUStringView {
		override var `data`: CString?
			get() = handle.data?.let(::CString)
			set(newValue) {
				handle.data = newValue?.handler
			}

		override var length: ULong
			get() = handle.length.toULong()
			set(newValue) {
				handle.length = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUStringView.ByValue = io.ygdrasil.wgpu.android.WGPUStringView.ByValue(Pointer.NULL),
	) : WGPUStringView {
		override var `data`: CString?
			get() = handle.data?.let(::CString)
			set(newValue) {
				handle.data = newValue?.handler
			}

		override var length: ULong
			get() = handle.length.toULong()
			set(newValue) {
				handle.length = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUStringView = io.ygdrasil.wgpu.android.WGPUStringView.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUStringView = WGPUStringView.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStringView) -> Unit,
		): ArrayHolder<WGPUStringView> {
			val array = io.ygdrasil.wgpu.android.WGPUStringView.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUStringView.ByValue)
					.also { provider(index.toUInt(), WGPUStringView.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUAdapterInfo {
	public actual var nextInChain: NativeAddress?

	public actual val vendor: WGPUStringView

	public actual val architecture: WGPUStringView

	public actual val device: WGPUStringView

	public actual val description: WGPUStringView

	public actual var backendType: WGPUBackendType

	public actual var adapterType: WGPUAdapterType

	public actual var vendorID: UInt

	public actual var deviceID: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByReference = io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByReference(Pointer.NULL),
	) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val vendor: WGPUStringView
			get() = handle.vendor.let{ WGPUStringView.ByValue(it) }

		override val architecture: WGPUStringView
			get() = handle.architecture.let{ WGPUStringView.ByValue(it) }

		override val device: WGPUStringView
			get() = handle.device.let{ WGPUStringView.ByValue(it) }

		override val description: WGPUStringView
			get() = handle.description.let{ WGPUStringView.ByValue(it) }

		override var backendType: WGPUBackendType
			get() = handle.backendType.toUInt()
			set(newValue) {
				handle.backendType = newValue.toInt()
			}

		override var adapterType: WGPUAdapterType
			get() = handle.adapterType.toUInt()
			set(newValue) {
				handle.adapterType = newValue.toInt()
			}

		override var vendorID: UInt
			get() = handle.vendorID.toUInt()
			set(newValue) {
				handle.vendorID = newValue.toInt()
			}

		override var deviceID: UInt
			get() = handle.deviceID.toUInt()
			set(newValue) {
				handle.deviceID = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue = io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue(Pointer.NULL),
	) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val vendor: WGPUStringView
			get() = handle.vendor.let{ WGPUStringView.ByValue(it) }

		override val architecture: WGPUStringView
			get() = handle.architecture.let{ WGPUStringView.ByValue(it) }

		override val device: WGPUStringView
			get() = handle.device.let{ WGPUStringView.ByValue(it) }

		override val description: WGPUStringView
			get() = handle.description.let{ WGPUStringView.ByValue(it) }

		override var backendType: WGPUBackendType
			get() = handle.backendType.toUInt()
			set(newValue) {
				handle.backendType = newValue.toInt()
			}

		override var adapterType: WGPUAdapterType
			get() = handle.adapterType.toUInt()
			set(newValue) {
				handle.adapterType = newValue.toInt()
			}

		override var vendorID: UInt
			get() = handle.vendorID.toUInt()
			set(newValue) {
				handle.vendorID = newValue.toInt()
			}

		override var deviceID: UInt
			get() = handle.deviceID.toUInt()
			set(newValue) {
				handle.deviceID = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUAdapterInfo = io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUAdapterInfo = WGPUAdapterInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUAdapterInfo) -> Unit,
		): ArrayHolder<WGPUAdapterInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue(allocator.allocate(88 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByValue)
					.also { provider(index.toUInt(), WGPUAdapterInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUBindGroupDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var layout: WGPUBindGroupLayout?

	public actual var entryCount: ULong

	public actual var entries: ArrayHolder<WGPUBindGroupEntry>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByReference(Pointer.NULL),
	) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var layout: WGPUBindGroupLayout?
			get() = handle.layout?.let{ WGPUBindGroupLayout(it) }
			set(newValue) {
				handle.layout = newValue?.handler
			}

		override var entryCount: ULong
			get() = handle.entryCount.toULong()
			set(newValue) {
				handle.entryCount = newValue.toLong()
			}

		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = handle.entries?.let(::ArrayHolder)
			set(newValue) {
				handle.entries = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue(Pointer.NULL),
	) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var layout: WGPUBindGroupLayout?
			get() = handle.layout?.let{ WGPUBindGroupLayout(it) }
			set(newValue) {
				handle.layout = newValue?.handler
			}

		override var entryCount: ULong
			get() = handle.entryCount.toULong()
			set(newValue) {
				handle.entryCount = newValue.toLong()
			}

		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = handle.entries?.let(::ArrayHolder)
			set(newValue) {
				handle.entries = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupDescriptor = io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupDescriptor = WGPUBindGroupDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupDescriptor) -> Unit,
		): ArrayHolder<WGPUBindGroupDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue(allocator.allocate(48 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUBindGroupDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUBindGroupEntry {
	public actual var nextInChain: NativeAddress?

	public actual var binding: UInt

	public actual var buffer: WGPUBuffer?

	public actual var offset: ULong

	public actual var size: ULong

	public actual var sampler: WGPUSampler?

	public actual var textureView: WGPUTextureView?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByReference(Pointer.NULL),
	) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var binding: UInt
			get() = handle.binding.toUInt()
			set(newValue) {
				handle.binding = newValue.toInt()
			}

		override var buffer: WGPUBuffer?
			get() = handle.buffer?.let{ WGPUBuffer(it) }
			set(newValue) {
				handle.buffer = newValue?.handler
			}

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) {
				handle.offset = newValue.toLong()
			}

		override var size: ULong
			get() = handle.size.toULong()
			set(newValue) {
				handle.size = newValue.toLong()
			}

		override var sampler: WGPUSampler?
			get() = handle.sampler?.let{ WGPUSampler(it) }
			set(newValue) {
				handle.sampler = newValue?.handler
			}

		override var textureView: WGPUTextureView?
			get() = handle.textureView?.let{ WGPUTextureView(it) }
			set(newValue) {
				handle.textureView = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue(Pointer.NULL),
	) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var binding: UInt
			get() = handle.binding.toUInt()
			set(newValue) {
				handle.binding = newValue.toInt()
			}

		override var buffer: WGPUBuffer?
			get() = handle.buffer?.let{ WGPUBuffer(it) }
			set(newValue) {
				handle.buffer = newValue?.handler
			}

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) {
				handle.offset = newValue.toLong()
			}

		override var size: ULong
			get() = handle.size.toULong()
			set(newValue) {
				handle.size = newValue.toLong()
			}

		override var sampler: WGPUSampler?
			get() = handle.sampler?.let{ WGPUSampler(it) }
			set(newValue) {
				handle.sampler = newValue?.handler
			}

		override var textureView: WGPUTextureView?
			get() = handle.textureView?.let{ WGPUTextureView(it) }
			set(newValue) {
				handle.textureView = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupEntry = io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupEntry = WGPUBindGroupEntry.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupEntry) -> Unit,
		): ArrayHolder<WGPUBindGroupEntry> {
			val array = io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue(allocator.allocate(56 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByValue)
					.also { provider(index.toUInt(), WGPUBindGroupEntry.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUBindGroupLayoutDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var entryCount: ULong

	public actual var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByReference(Pointer.NULL),
	) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var entryCount: ULong
			get() = handle.entryCount.toULong()
			set(newValue) {
				handle.entryCount = newValue.toLong()
			}

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = handle.entries?.let(::ArrayHolder)
			set(newValue) {
				handle.entries = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue(Pointer.NULL),
	) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var entryCount: ULong
			get() = handle.entryCount.toULong()
			set(newValue) {
				handle.entryCount = newValue.toLong()
			}

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = handle.entries?.let(::ArrayHolder)
			set(newValue) {
				handle.entries = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutDescriptor = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutDescriptor = WGPUBindGroupLayoutDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupLayoutDescriptor) -> Unit,
		): ArrayHolder<WGPUBindGroupLayoutDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUBindGroupLayoutDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUBufferBindingLayout {
	public actual var nextInChain: NativeAddress?

	public actual var type: WGPUBufferBindingType

	public actual var hasDynamicOffset: Boolean

	public actual var minBindingSize: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByReference(Pointer.NULL),
	) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var type: WGPUBufferBindingType
			get() = handle.type.toUInt()
			set(newValue) {
				handle.type = newValue.toInt()
			}

		override var hasDynamicOffset: Boolean
			get() = handle.hasDynamicOffset.toBoolean()
			set(newValue) {
				handle.hasDynamicOffset = newValue.toInt()
			}

		override var minBindingSize: ULong
			get() = handle.minBindingSize.toULong()
			set(newValue) {
				handle.minBindingSize = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue = io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue(Pointer.NULL),
	) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var type: WGPUBufferBindingType
			get() = handle.type.toUInt()
			set(newValue) {
				handle.type = newValue.toInt()
			}

		override var hasDynamicOffset: Boolean
			get() = handle.hasDynamicOffset.toBoolean()
			set(newValue) {
				handle.hasDynamicOffset = newValue.toInt()
			}

		override var minBindingSize: ULong
			get() = handle.minBindingSize.toULong()
			set(newValue) {
				handle.minBindingSize = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBufferBindingLayout = io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBufferBindingLayout = WGPUBufferBindingLayout.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferBindingLayout) -> Unit,
		): ArrayHolder<WGPUBufferBindingLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByValue)
					.also { provider(index.toUInt(), WGPUBufferBindingLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSamplerBindingLayout {
	public actual var nextInChain: NativeAddress?

	public actual var type: WGPUSamplerBindingType

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByReference(Pointer.NULL),
	) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var type: WGPUSamplerBindingType
			get() = handle.type.toUInt()
			set(newValue) {
				handle.type = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue = io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue(Pointer.NULL),
	) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var type: WGPUSamplerBindingType
			get() = handle.type.toUInt()
			set(newValue) {
				handle.type = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSamplerBindingLayout = io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSamplerBindingLayout = WGPUSamplerBindingLayout.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSamplerBindingLayout) -> Unit,
		): ArrayHolder<WGPUSamplerBindingLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSamplerBindingLayout.ByValue)
					.also { provider(index.toUInt(), WGPUSamplerBindingLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUTextureBindingLayout {
	public actual var nextInChain: NativeAddress?

	public actual var sampleType: WGPUTextureSampleType

	public actual var viewDimension: WGPUTextureViewDimension

	public actual var multisampled: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByReference(Pointer.NULL),
	) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var sampleType: WGPUTextureSampleType
			get() = handle.sampleType.toUInt()
			set(newValue) {
				handle.sampleType = newValue.toInt()
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.viewDimension.toUInt()
			set(newValue) {
				handle.viewDimension = newValue.toInt()
			}

		override var multisampled: Boolean
			get() = handle.multisampled.toBoolean()
			set(newValue) {
				handle.multisampled = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue = io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue(Pointer.NULL),
	) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var sampleType: WGPUTextureSampleType
			get() = handle.sampleType.toUInt()
			set(newValue) {
				handle.sampleType = newValue.toInt()
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.viewDimension.toUInt()
			set(newValue) {
				handle.viewDimension = newValue.toInt()
			}

		override var multisampled: Boolean
			get() = handle.multisampled.toBoolean()
			set(newValue) {
				handle.multisampled = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTextureBindingLayout = io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTextureBindingLayout = WGPUTextureBindingLayout.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureBindingLayout) -> Unit,
		): ArrayHolder<WGPUTextureBindingLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTextureBindingLayout.ByValue)
					.also { provider(index.toUInt(), WGPUTextureBindingLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUStorageTextureBindingLayout {
	public actual var nextInChain: NativeAddress?

	public actual var access: WGPUStorageTextureAccess

	public actual var format: WGPUTextureFormat

	public actual var viewDimension: WGPUTextureViewDimension

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByReference(Pointer.NULL),
	) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var access: WGPUStorageTextureAccess
			get() = handle.access.toUInt()
			set(newValue) {
				handle.access = newValue.toInt()
			}

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.viewDimension.toUInt()
			set(newValue) {
				handle.viewDimension = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue = io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue(Pointer.NULL),
	) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var access: WGPUStorageTextureAccess
			get() = handle.access.toUInt()
			set(newValue) {
				handle.access = newValue.toInt()
			}

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.viewDimension.toUInt()
			set(newValue) {
				handle.viewDimension = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUStorageTextureBindingLayout = io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUStorageTextureBindingLayout = WGPUStorageTextureBindingLayout.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStorageTextureBindingLayout) -> Unit,
		): ArrayHolder<WGPUStorageTextureBindingLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByValue)
					.also { provider(index.toUInt(), WGPUStorageTextureBindingLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUBindGroupLayoutEntry {
	public actual var nextInChain: NativeAddress?

	public actual var binding: UInt

	public actual var visibility: ULong

	public actual val buffer: WGPUBufferBindingLayout

	public actual val sampler: WGPUSamplerBindingLayout

	public actual val texture: WGPUTextureBindingLayout

	public actual val storageTexture: WGPUStorageTextureBindingLayout

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByReference(Pointer.NULL),
	) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var binding: UInt
			get() = handle.binding.toUInt()
			set(newValue) {
				handle.binding = newValue.toInt()
			}

		override var visibility: ULong
			get() = handle.visibility.toULong()
			set(newValue) {
				handle.visibility = newValue.toLong()
			}

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

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue(Pointer.NULL),
	) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var binding: UInt
			get() = handle.binding.toUInt()
			set(newValue) {
				handle.binding = newValue.toInt()
			}

		override var visibility: ULong
			get() = handle.visibility.toULong()
			set(newValue) {
				handle.visibility = newValue.toLong()
			}

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

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutEntry = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutEntry = WGPUBindGroupLayoutEntry.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupLayoutEntry) -> Unit,
		): ArrayHolder<WGPUBindGroupLayoutEntry> {
			val array = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue(allocator.allocate(112 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByValue)
					.also { provider(index.toUInt(), WGPUBindGroupLayoutEntry.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUBlendComponent {
	public actual var operation: WGPUBlendOperation

	public actual var srcFactor: WGPUBlendFactor

	public actual var dstFactor: WGPUBlendFactor

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUBlendComponent.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBlendComponent.ByReference = io.ygdrasil.wgpu.android.WGPUBlendComponent.ByReference(Pointer.NULL),
	) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = handle.operation.toUInt()
			set(newValue) {
				handle.operation = newValue.toInt()
			}

		override var srcFactor: WGPUBlendFactor
			get() = handle.srcFactor.toUInt()
			set(newValue) {
				handle.srcFactor = newValue.toInt()
			}

		override var dstFactor: WGPUBlendFactor
			get() = handle.dstFactor.toUInt()
			set(newValue) {
				handle.dstFactor = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue = io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue(Pointer.NULL),
	) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = handle.operation.toUInt()
			set(newValue) {
				handle.operation = newValue.toInt()
			}

		override var srcFactor: WGPUBlendFactor
			get() = handle.srcFactor.toUInt()
			set(newValue) {
				handle.srcFactor = newValue.toInt()
			}

		override var dstFactor: WGPUBlendFactor
			get() = handle.dstFactor.toUInt()
			set(newValue) {
				handle.dstFactor = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBlendComponent = io.ygdrasil.wgpu.android.WGPUBlendComponent.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBlendComponent = WGPUBlendComponent.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBlendComponent) -> Unit,
		): ArrayHolder<WGPUBlendComponent> {
			val array = io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue(allocator.allocate(12 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBlendComponent.ByValue)
					.also { provider(index.toUInt(), WGPUBlendComponent.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUBlendState {
	public actual val color: WGPUBlendComponent

	public actual val alpha: WGPUBlendComponent

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUBlendState.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBlendState.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUBlendState.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBlendState.ByReference = io.ygdrasil.wgpu.android.WGPUBlendState.ByReference(Pointer.NULL),
	) : WGPUBlendState {
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

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBlendState.ByValue = io.ygdrasil.wgpu.android.WGPUBlendState.ByValue(Pointer.NULL),
	) : WGPUBlendState {
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

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBlendState = io.ygdrasil.wgpu.android.WGPUBlendState.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBlendState = WGPUBlendState.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBlendState) -> Unit,
		): ArrayHolder<WGPUBlendState> {
			val array = io.ygdrasil.wgpu.android.WGPUBlendState.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBlendState.ByValue)
					.also { provider(index.toUInt(), WGPUBlendState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUBufferDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var usage: ULong

	public actual var size: ULong

	public actual var mappedAtCreation: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByReference(Pointer.NULL),
	) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var usage: ULong
			get() = handle.usage.toULong()
			set(newValue) {
				handle.usage = newValue.toLong()
			}

		override var size: ULong
			get() = handle.size.toULong()
			set(newValue) {
				handle.size = newValue.toLong()
			}

		override var mappedAtCreation: Boolean
			get() = handle.mappedAtCreation.toBoolean()
			set(newValue) {
				handle.mappedAtCreation = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue(Pointer.NULL),
	) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var usage: ULong
			get() = handle.usage.toULong()
			set(newValue) {
				handle.usage = newValue.toLong()
			}

		override var size: ULong
			get() = handle.size.toULong()
			set(newValue) {
				handle.size = newValue.toLong()
			}

		override var mappedAtCreation: Boolean
			get() = handle.mappedAtCreation.toBoolean()
			set(newValue) {
				handle.mappedAtCreation = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBufferDescriptor = io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBufferDescriptor = WGPUBufferDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferDescriptor) -> Unit,
		): ArrayHolder<WGPUBufferDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue(allocator.allocate(48 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUBufferDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUColor {
	public actual var r: Double

	public actual var g: Double

	public actual var b: Double

	public actual var a: Double

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUColor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUColor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUColor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUColor.ByReference = io.ygdrasil.wgpu.android.WGPUColor.ByReference(Pointer.NULL),
	) : WGPUColor {
		override var r: Double
			get() = handle.r
			set(newValue) {
				handle.r = newValue
			}

		override var g: Double
			get() = handle.g
			set(newValue) {
				handle.g = newValue
			}

		override var b: Double
			get() = handle.b
			set(newValue) {
				handle.b = newValue
			}

		override var a: Double
			get() = handle.a
			set(newValue) {
				handle.a = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUColor.ByValue = io.ygdrasil.wgpu.android.WGPUColor.ByValue(Pointer.NULL),
	) : WGPUColor {
		override var r: Double
			get() = handle.r
			set(newValue) {
				handle.r = newValue
			}

		override var g: Double
			get() = handle.g
			set(newValue) {
				handle.g = newValue
			}

		override var b: Double
			get() = handle.b
			set(newValue) {
				handle.b = newValue
			}

		override var a: Double
			get() = handle.a
			set(newValue) {
				handle.a = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUColor = io.ygdrasil.wgpu.android.WGPUColor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUColor = WGPUColor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUColor) -> Unit,
		): ArrayHolder<WGPUColor> {
			val array = io.ygdrasil.wgpu.android.WGPUColor.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUColor.ByValue)
					.also { provider(index.toUInt(), WGPUColor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUColorTargetState {
	public actual var nextInChain: NativeAddress?

	public actual var format: WGPUTextureFormat

	public actual var blend: WGPUBlendState?

	public actual var writeMask: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUColorTargetState.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUColorTargetState.ByReference = io.ygdrasil.wgpu.android.WGPUColorTargetState.ByReference(Pointer.NULL),
	) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var blend: WGPUBlendState?
			get() = handle.blend?.let{ WGPUBlendState.ByReference(it) }
			set(newValue) {
				handle.blend = (newValue as? WGPUBlendState.ByReference)?.handle
			}

		override var writeMask: ULong
			get() = handle.writeMask.toULong()
			set(newValue) {
				handle.writeMask = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue = io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue(Pointer.NULL),
	) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var blend: WGPUBlendState?
			get() = handle.blend?.let{ WGPUBlendState.ByReference(it) }
			set(newValue) {
				handle.blend = (newValue as? WGPUBlendState.ByReference)?.handle
			}

		override var writeMask: ULong
			get() = handle.writeMask.toULong()
			set(newValue) {
				handle.writeMask = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUColorTargetState = io.ygdrasil.wgpu.android.WGPUColorTargetState.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUColorTargetState = WGPUColorTargetState.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUColorTargetState) -> Unit,
		): ArrayHolder<WGPUColorTargetState> {
			val array = io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUColorTargetState.ByValue)
					.also { provider(index.toUInt(), WGPUColorTargetState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUCommandBufferDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByReference(Pointer.NULL),
	) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue(Pointer.NULL),
	) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCommandBufferDescriptor = io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCommandBufferDescriptor = WGPUCommandBufferDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCommandBufferDescriptor) -> Unit,
		): ArrayHolder<WGPUCommandBufferDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCommandBufferDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUCommandBufferDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUCommandEncoderDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByReference(Pointer.NULL),
	) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue(Pointer.NULL),
	) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCommandEncoderDescriptor = io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCommandEncoderDescriptor = WGPUCommandEncoderDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCommandEncoderDescriptor) -> Unit,
		): ArrayHolder<WGPUCommandEncoderDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCommandEncoderDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUCommandEncoderDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUCompilationInfo {
	public actual var nextInChain: NativeAddress?

	public actual var messageCount: ULong

	public actual var messages: ArrayHolder<WGPUCompilationMessage>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByReference = io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByReference(Pointer.NULL),
	) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var messageCount: ULong
			get() = handle.messageCount.toULong()
			set(newValue) {
				handle.messageCount = newValue.toLong()
			}

		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = handle.messages?.let(::ArrayHolder)
			set(newValue) {
				handle.messages = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue = io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue(Pointer.NULL),
	) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var messageCount: ULong
			get() = handle.messageCount.toULong()
			set(newValue) {
				handle.messageCount = newValue.toLong()
			}

		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = handle.messages?.let(::ArrayHolder)
			set(newValue) {
				handle.messages = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCompilationInfo = io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfo = WGPUCompilationInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationInfo) -> Unit,
		): ArrayHolder<WGPUCompilationInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByValue)
					.also { provider(index.toUInt(), WGPUCompilationInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUCompilationMessage {
	public actual var nextInChain: NativeAddress?

	public actual val message: WGPUStringView

	public actual var type: WGPUCompilationMessageType

	public actual var lineNum: ULong

	public actual var linePos: ULong

	public actual var offset: ULong

	public actual var length: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByReference = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByReference(Pointer.NULL),
	) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val message: WGPUStringView
			get() = handle.message.let{ WGPUStringView.ByValue(it) }

		override var type: WGPUCompilationMessageType
			get() = handle.type.toUInt()
			set(newValue) {
				handle.type = newValue.toInt()
			}

		override var lineNum: ULong
			get() = handle.lineNum.toULong()
			set(newValue) {
				handle.lineNum = newValue.toLong()
			}

		override var linePos: ULong
			get() = handle.linePos.toULong()
			set(newValue) {
				handle.linePos = newValue.toLong()
			}

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) {
				handle.offset = newValue.toLong()
			}

		override var length: ULong
			get() = handle.length.toULong()
			set(newValue) {
				handle.length = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue(Pointer.NULL),
	) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val message: WGPUStringView
			get() = handle.message.let{ WGPUStringView.ByValue(it) }

		override var type: WGPUCompilationMessageType
			get() = handle.type.toUInt()
			set(newValue) {
				handle.type = newValue.toInt()
			}

		override var lineNum: ULong
			get() = handle.lineNum.toULong()
			set(newValue) {
				handle.lineNum = newValue.toLong()
			}

		override var linePos: ULong
			get() = handle.linePos.toULong()
			set(newValue) {
				handle.linePos = newValue.toLong()
			}

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) {
				handle.offset = newValue.toLong()
			}

		override var length: ULong
			get() = handle.length.toULong()
			set(newValue) {
				handle.length = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCompilationMessage = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCompilationMessage = WGPUCompilationMessage.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationMessage) -> Unit,
		): ArrayHolder<WGPUCompilationMessage> {
			val array = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue(allocator.allocate(64 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue)
					.also { provider(index.toUInt(), WGPUCompilationMessage.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUComputePassDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var timestampWrites: WGPUComputePassTimestampWrites?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByReference(Pointer.NULL),
	) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = handle.timestampWrites?.let{ WGPUComputePassTimestampWrites.ByReference(it) }
			set(newValue) {
				handle.timestampWrites = (newValue as? WGPUComputePassTimestampWrites.ByReference)?.handle
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue(Pointer.NULL),
	) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = handle.timestampWrites?.let{ WGPUComputePassTimestampWrites.ByReference(it) }
			set(newValue) {
				handle.timestampWrites = (newValue as? WGPUComputePassTimestampWrites.ByReference)?.handle
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUComputePassDescriptor = io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUComputePassDescriptor = WGPUComputePassDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePassDescriptor) -> Unit,
		): ArrayHolder<WGPUComputePassDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUComputePassDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUComputePassDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUComputePassTimestampWrites {
	public actual var querySet: WGPUQuerySet?

	public actual var beginningOfPassWriteIndex: UInt

	public actual var endOfPassWriteIndex: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByReference = io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByReference(Pointer.NULL),
	) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.querySet?.let{ WGPUQuerySet(it) }
			set(newValue) {
				handle.querySet = newValue?.handler
			}

		override var beginningOfPassWriteIndex: UInt
			get() = handle.beginningOfPassWriteIndex.toUInt()
			set(newValue) {
				handle.beginningOfPassWriteIndex = newValue.toInt()
			}

		override var endOfPassWriteIndex: UInt
			get() = handle.endOfPassWriteIndex.toUInt()
			set(newValue) {
				handle.endOfPassWriteIndex = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue = io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue(Pointer.NULL),
	) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.querySet?.let{ WGPUQuerySet(it) }
			set(newValue) {
				handle.querySet = newValue?.handler
			}

		override var beginningOfPassWriteIndex: UInt
			get() = handle.beginningOfPassWriteIndex.toUInt()
			set(newValue) {
				handle.beginningOfPassWriteIndex = newValue.toInt()
			}

		override var endOfPassWriteIndex: UInt
			get() = handle.endOfPassWriteIndex.toUInt()
			set(newValue) {
				handle.endOfPassWriteIndex = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUComputePassTimestampWrites = io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUComputePassTimestampWrites = WGPUComputePassTimestampWrites.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePassTimestampWrites) -> Unit,
		): ArrayHolder<WGPUComputePassTimestampWrites> {
			val array = io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUComputePassTimestampWrites.ByValue)
					.also { provider(index.toUInt(), WGPUComputePassTimestampWrites.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUProgrammableStageDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual var module: WGPUShaderModule?

	public actual val entryPoint: WGPUStringView

	public actual var constantCount: ULong

	public actual var constants: ArrayHolder<WGPUConstantEntry>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByReference(Pointer.NULL),
	) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) {
				handle.module = newValue?.handler
			}

		override val entryPoint: WGPUStringView
			get() = handle.entryPoint.let{ WGPUStringView.ByValue(it) }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) {
				handle.constantCount = newValue.toLong()
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) {
				handle.constants = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue(Pointer.NULL),
	) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) {
				handle.module = newValue?.handler
			}

		override val entryPoint: WGPUStringView
			get() = handle.entryPoint.let{ WGPUStringView.ByValue(it) }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) {
				handle.constantCount = newValue.toLong()
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) {
				handle.constants = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUProgrammableStageDescriptor = io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUProgrammableStageDescriptor = WGPUProgrammableStageDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUProgrammableStageDescriptor) -> Unit,
		): ArrayHolder<WGPUProgrammableStageDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue(allocator.allocate(48 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUProgrammableStageDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUComputePipelineDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var layout: WGPUPipelineLayout?

	public actual val compute: WGPUProgrammableStageDescriptor

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByReference(Pointer.NULL),
	) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) {
				handle.layout = newValue?.handler
			}

		override val compute: WGPUProgrammableStageDescriptor
			get() = handle.compute.let{ WGPUProgrammableStageDescriptor.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue(Pointer.NULL),
	) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) {
				handle.layout = newValue?.handler
			}

		override val compute: WGPUProgrammableStageDescriptor
			get() = handle.compute.let{ WGPUProgrammableStageDescriptor.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUComputePipelineDescriptor = io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUComputePipelineDescriptor = WGPUComputePipelineDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePipelineDescriptor) -> Unit,
		): ArrayHolder<WGPUComputePipelineDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue(allocator.allocate(80 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUComputePipelineDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUConstantEntry {
	public actual var nextInChain: NativeAddress?

	public actual val key: WGPUStringView

	public actual var `value`: Double

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUConstantEntry.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUConstantEntry.ByReference = io.ygdrasil.wgpu.android.WGPUConstantEntry.ByReference(Pointer.NULL),
	) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val key: WGPUStringView
			get() = handle.key.let{ WGPUStringView.ByValue(it) }

		override var `value`: Double
			get() = handle.value
			set(newValue) {
				handle.value = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue = io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue(Pointer.NULL),
	) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val key: WGPUStringView
			get() = handle.key.let{ WGPUStringView.ByValue(it) }

		override var `value`: Double
			get() = handle.value
			set(newValue) {
				handle.value = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUConstantEntry = io.ygdrasil.wgpu.android.WGPUConstantEntry.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUConstantEntry = WGPUConstantEntry.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUConstantEntry) -> Unit,
		): ArrayHolder<WGPUConstantEntry> {
			val array = io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUConstantEntry.ByValue)
					.also { provider(index.toUInt(), WGPUConstantEntry.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUStencilFaceState {
	public actual var compare: WGPUCompareFunction

	public actual var failOp: WGPUStencilOperation

	public actual var depthFailOp: WGPUStencilOperation

	public actual var passOp: WGPUStencilOperation

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByReference = io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByReference(Pointer.NULL),
	) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = handle.compare.toUInt()
			set(newValue) {
				handle.compare = newValue.toInt()
			}

		override var failOp: WGPUStencilOperation
			get() = handle.failOp.toUInt()
			set(newValue) {
				handle.failOp = newValue.toInt()
			}

		override var depthFailOp: WGPUStencilOperation
			get() = handle.depthFailOp.toUInt()
			set(newValue) {
				handle.depthFailOp = newValue.toInt()
			}

		override var passOp: WGPUStencilOperation
			get() = handle.passOp.toUInt()
			set(newValue) {
				handle.passOp = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue = io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue(Pointer.NULL),
	) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = handle.compare.toUInt()
			set(newValue) {
				handle.compare = newValue.toInt()
			}

		override var failOp: WGPUStencilOperation
			get() = handle.failOp.toUInt()
			set(newValue) {
				handle.failOp = newValue.toInt()
			}

		override var depthFailOp: WGPUStencilOperation
			get() = handle.depthFailOp.toUInt()
			set(newValue) {
				handle.depthFailOp = newValue.toInt()
			}

		override var passOp: WGPUStencilOperation
			get() = handle.passOp.toUInt()
			set(newValue) {
				handle.passOp = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUStencilFaceState = io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUStencilFaceState = WGPUStencilFaceState.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStencilFaceState) -> Unit,
		): ArrayHolder<WGPUStencilFaceState> {
			val array = io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByValue)
					.also { provider(index.toUInt(), WGPUStencilFaceState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUDepthStencilState {
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

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByReference = io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByReference(Pointer.NULL),
	) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var depthWriteEnabled: WGPUOptionalBool
			get() = handle.depthWriteEnabled.toUInt()
			set(newValue) {
				handle.depthWriteEnabled = newValue.toInt()
			}

		override var depthCompare: WGPUCompareFunction
			get() = handle.depthCompare.toUInt()
			set(newValue) {
				handle.depthCompare = newValue.toInt()
			}

		override val stencilFront: WGPUStencilFaceState
			get() = handle.stencilFront.let{ WGPUStencilFaceState.ByValue(it) }

		override val stencilBack: WGPUStencilFaceState
			get() = handle.stencilBack.let{ WGPUStencilFaceState.ByValue(it) }

		override var stencilReadMask: UInt
			get() = handle.stencilReadMask.toUInt()
			set(newValue) {
				handle.stencilReadMask = newValue.toInt()
			}

		override var stencilWriteMask: UInt
			get() = handle.stencilWriteMask.toUInt()
			set(newValue) {
				handle.stencilWriteMask = newValue.toInt()
			}

		override var depthBias: Int
			get() = handle.depthBias
			set(newValue) {
				handle.depthBias = newValue
			}

		override var depthBiasSlopeScale: Float
			get() = handle.depthBiasSlopeScale
			set(newValue) {
				handle.depthBiasSlopeScale = newValue
			}

		override var depthBiasClamp: Float
			get() = handle.depthBiasClamp
			set(newValue) {
				handle.depthBiasClamp = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue = io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue(Pointer.NULL),
	) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var depthWriteEnabled: WGPUOptionalBool
			get() = handle.depthWriteEnabled.toUInt()
			set(newValue) {
				handle.depthWriteEnabled = newValue.toInt()
			}

		override var depthCompare: WGPUCompareFunction
			get() = handle.depthCompare.toUInt()
			set(newValue) {
				handle.depthCompare = newValue.toInt()
			}

		override val stencilFront: WGPUStencilFaceState
			get() = handle.stencilFront.let{ WGPUStencilFaceState.ByValue(it) }

		override val stencilBack: WGPUStencilFaceState
			get() = handle.stencilBack.let{ WGPUStencilFaceState.ByValue(it) }

		override var stencilReadMask: UInt
			get() = handle.stencilReadMask.toUInt()
			set(newValue) {
				handle.stencilReadMask = newValue.toInt()
			}

		override var stencilWriteMask: UInt
			get() = handle.stencilWriteMask.toUInt()
			set(newValue) {
				handle.stencilWriteMask = newValue.toInt()
			}

		override var depthBias: Int
			get() = handle.depthBias
			set(newValue) {
				handle.depthBias = newValue
			}

		override var depthBiasSlopeScale: Float
			get() = handle.depthBiasSlopeScale
			set(newValue) {
				handle.depthBiasSlopeScale = newValue
			}

		override var depthBiasClamp: Float
			get() = handle.depthBiasClamp
			set(newValue) {
				handle.depthBiasClamp = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUDepthStencilState = io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUDepthStencilState = WGPUDepthStencilState.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDepthStencilState) -> Unit,
		): ArrayHolder<WGPUDepthStencilState> {
			val array = io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue(allocator.allocate(72 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByValue)
					.also { provider(index.toUInt(), WGPUDepthStencilState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUQueueDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByReference(Pointer.NULL),
	) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue(Pointer.NULL),
	) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUQueueDescriptor = io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUQueueDescriptor = WGPUQueueDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQueueDescriptor) -> Unit,
		): ArrayHolder<WGPUQueueDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUQueueDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUQueueDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUDeviceLostCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUDeviceLostCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByReference(Pointer.NULL),
	) : WGPUDeviceLostCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByValue(Pointer.NULL),
	) : WGPUDeviceLostCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUDeviceLostCallbackInfo = io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUDeviceLostCallbackInfo = WGPUDeviceLostCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDeviceLostCallbackInfo) -> Unit,
		): ArrayHolder<WGPUDeviceLostCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUDeviceLostCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPUDeviceLostCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUUncapturedErrorCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var callback: CallbackHolder<WGPUUncapturedErrorCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByReference(Pointer.NULL),
	) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var callback: CallbackHolder<WGPUUncapturedErrorCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue(Pointer.NULL),
	) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var callback: CallbackHolder<WGPUUncapturedErrorCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUUncapturedErrorCallbackInfo = io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUUncapturedErrorCallbackInfo = WGPUUncapturedErrorCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUUncapturedErrorCallbackInfo) -> Unit,
		): ArrayHolder<WGPUUncapturedErrorCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPUUncapturedErrorCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUDeviceDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var requiredFeatureCount: ULong

	public actual var requiredFeatures: ArrayHolder<WGPUFeatureName>?

	public actual var requiredLimits: WGPULimits?

	public actual val defaultQueue: WGPUQueueDescriptor

	public actual val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo

	public actual val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByReference(Pointer.NULL),
	) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var requiredFeatureCount: ULong
			get() = handle.requiredFeatureCount.toULong()
			set(newValue) {
				handle.requiredFeatureCount = newValue.toLong()
			}

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handle.requiredFeatures?.let(::ArrayHolder)
			set(newValue) {
				handle.requiredFeatures = newValue?.handler
			}

		override var requiredLimits: WGPULimits?
			get() = handle.requiredLimits?.let{ WGPULimits.ByReference(it) }
			set(newValue) {
				handle.requiredLimits = (newValue as? WGPULimits.ByReference)?.handle
			}

		override val defaultQueue: WGPUQueueDescriptor
			get() = handle.defaultQueue.let{ WGPUQueueDescriptor.ByValue(it) }

		override val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo
			get() = handle.deviceLostCallbackInfo.let{ WGPUDeviceLostCallbackInfo.ByValue(it) }

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handle.uncapturedErrorCallbackInfo.let{ WGPUUncapturedErrorCallbackInfo.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue(Pointer.NULL),
	) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var requiredFeatureCount: ULong
			get() = handle.requiredFeatureCount.toULong()
			set(newValue) {
				handle.requiredFeatureCount = newValue.toLong()
			}

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handle.requiredFeatures?.let(::ArrayHolder)
			set(newValue) {
				handle.requiredFeatures = newValue?.handler
			}

		override var requiredLimits: WGPULimits?
			get() = handle.requiredLimits?.let{ WGPULimits.ByReference(it) }
			set(newValue) {
				handle.requiredLimits = (newValue as? WGPULimits.ByReference)?.handle
			}

		override val defaultQueue: WGPUQueueDescriptor
			get() = handle.defaultQueue.let{ WGPUQueueDescriptor.ByValue(it) }

		override val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo
			get() = handle.deviceLostCallbackInfo.let{ WGPUDeviceLostCallbackInfo.ByValue(it) }

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handle.uncapturedErrorCallbackInfo.let{ WGPUUncapturedErrorCallbackInfo.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUDeviceDescriptor = io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUDeviceDescriptor = WGPUDeviceDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDeviceDescriptor) -> Unit,
		): ArrayHolder<WGPUDeviceDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue(allocator.allocate(144 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUDeviceDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUDeviceDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUExtent3D {
	public actual var width: UInt

	public actual var height: UInt

	public actual var depthOrArrayLayers: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUExtent3D.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUExtent3D.ByReference = io.ygdrasil.wgpu.android.WGPUExtent3D.ByReference(Pointer.NULL),
	) : WGPUExtent3D {
		override var width: UInt
			get() = handle.width.toUInt()
			set(newValue) {
				handle.width = newValue.toInt()
			}

		override var height: UInt
			get() = handle.height.toUInt()
			set(newValue) {
				handle.height = newValue.toInt()
			}

		override var depthOrArrayLayers: UInt
			get() = handle.depthOrArrayLayers.toUInt()
			set(newValue) {
				handle.depthOrArrayLayers = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue = io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue(Pointer.NULL),
	) : WGPUExtent3D {
		override var width: UInt
			get() = handle.width.toUInt()
			set(newValue) {
				handle.width = newValue.toInt()
			}

		override var height: UInt
			get() = handle.height.toUInt()
			set(newValue) {
				handle.height = newValue.toInt()
			}

		override var depthOrArrayLayers: UInt
			get() = handle.depthOrArrayLayers.toUInt()
			set(newValue) {
				handle.depthOrArrayLayers = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUExtent3D = io.ygdrasil.wgpu.android.WGPUExtent3D.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUExtent3D = WGPUExtent3D.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUExtent3D) -> Unit,
		): ArrayHolder<WGPUExtent3D> {
			val array = io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue(allocator.allocate(12 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUExtent3D.ByValue)
					.also { provider(index.toUInt(), WGPUExtent3D.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUFragmentState {
	public actual var nextInChain: NativeAddress?

	public actual var module: WGPUShaderModule?

	public actual val entryPoint: WGPUStringView

	public actual var constantCount: ULong

	public actual var constants: ArrayHolder<WGPUConstantEntry>?

	public actual var targetCount: ULong

	public actual var targets: ArrayHolder<WGPUColorTargetState>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUFragmentState.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUFragmentState.ByReference = io.ygdrasil.wgpu.android.WGPUFragmentState.ByReference(Pointer.NULL),
	) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) {
				handle.module = newValue?.handler
			}

		override val entryPoint: WGPUStringView
			get() = handle.entryPoint.let{ WGPUStringView.ByValue(it) }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) {
				handle.constantCount = newValue.toLong()
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) {
				handle.constants = newValue?.handler
			}

		override var targetCount: ULong
			get() = handle.targetCount.toULong()
			set(newValue) {
				handle.targetCount = newValue.toLong()
			}

		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = handle.targets?.let(::ArrayHolder)
			set(newValue) {
				handle.targets = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue = io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue(Pointer.NULL),
	) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) {
				handle.module = newValue?.handler
			}

		override val entryPoint: WGPUStringView
			get() = handle.entryPoint.let{ WGPUStringView.ByValue(it) }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) {
				handle.constantCount = newValue.toLong()
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) {
				handle.constants = newValue?.handler
			}

		override var targetCount: ULong
			get() = handle.targetCount.toULong()
			set(newValue) {
				handle.targetCount = newValue.toLong()
			}

		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = handle.targets?.let(::ArrayHolder)
			set(newValue) {
				handle.targets = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUFragmentState = io.ygdrasil.wgpu.android.WGPUFragmentState.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUFragmentState = WGPUFragmentState.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFragmentState) -> Unit,
		): ArrayHolder<WGPUFragmentState> {
			val array = io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue(allocator.allocate(64 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUFragmentState.ByValue)
					.also { provider(index.toUInt(), WGPUFragmentState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUFuture {
	public actual var id: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUFuture.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUFuture.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUFuture.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUFuture.ByReference = io.ygdrasil.wgpu.android.WGPUFuture.ByReference(Pointer.NULL),
	) : WGPUFuture {
		override var id: ULong
			get() = handle.id.toULong()
			set(newValue) {
				handle.id = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUFuture.ByValue = io.ygdrasil.wgpu.android.WGPUFuture.ByValue(Pointer.NULL),
	) : WGPUFuture {
		override var id: ULong
			get() = handle.id.toULong()
			set(newValue) {
				handle.id = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUFuture = io.ygdrasil.wgpu.android.WGPUFuture.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUFuture = WGPUFuture.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFuture) -> Unit,
		): ArrayHolder<WGPUFuture> {
			val array = io.ygdrasil.wgpu.android.WGPUFuture.ByValue(allocator.allocate(8 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUFuture.ByValue)
					.also { provider(index.toUInt(), WGPUFuture.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUFutureWaitInfo {
	public actual val future: WGPUFuture

	public actual var completed: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByReference = io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByReference(Pointer.NULL),
	) : WGPUFutureWaitInfo {
		override val future: WGPUFuture
			get() = handle.future.let{ WGPUFuture.ByValue(it) }

		override var completed: Boolean
			get() = handle.completed.toBoolean()
			set(newValue) {
				handle.completed = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByValue = io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByValue(Pointer.NULL),
	) : WGPUFutureWaitInfo {
		override val future: WGPUFuture
			get() = handle.future.let{ WGPUFuture.ByValue(it) }

		override var completed: Boolean
			get() = handle.completed.toBoolean()
			set(newValue) {
				handle.completed = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUFutureWaitInfo = io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUFutureWaitInfo = WGPUFutureWaitInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFutureWaitInfo) -> Unit,
		): ArrayHolder<WGPUFutureWaitInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByValue)
					.also { provider(index.toUInt(), WGPUFutureWaitInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUInstanceCapabilities {
	public actual var nextInChain: NativeAddress?

	public actual var timedWaitAnyEnable: Boolean

	public actual var timedWaitAnyMaxCount: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByReference = io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByReference(Pointer.NULL),
	) : WGPUInstanceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var timedWaitAnyEnable: Boolean
			get() = handle.timedWaitAnyEnable.toBoolean()
			set(newValue) {
				handle.timedWaitAnyEnable = newValue.toInt()
			}

		override var timedWaitAnyMaxCount: ULong
			get() = handle.timedWaitAnyMaxCount.toULong()
			set(newValue) {
				handle.timedWaitAnyMaxCount = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByValue = io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByValue(Pointer.NULL),
	) : WGPUInstanceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var timedWaitAnyEnable: Boolean
			get() = handle.timedWaitAnyEnable.toBoolean()
			set(newValue) {
				handle.timedWaitAnyEnable = newValue.toInt()
			}

		override var timedWaitAnyMaxCount: ULong
			get() = handle.timedWaitAnyMaxCount.toULong()
			set(newValue) {
				handle.timedWaitAnyMaxCount = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUInstanceCapabilities = io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUInstanceCapabilities = WGPUInstanceCapabilities.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceCapabilities) -> Unit,
		): ArrayHolder<WGPUInstanceCapabilities> {
			val array = io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUInstanceCapabilities.ByValue)
					.also { provider(index.toUInt(), WGPUInstanceCapabilities.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUInstanceDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val features: WGPUInstanceCapabilities

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByReference(Pointer.NULL),
	) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val features: WGPUInstanceCapabilities
			get() = handle.features.let{ WGPUInstanceCapabilities.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue(Pointer.NULL),
	) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val features: WGPUInstanceCapabilities
			get() = handle.features.let{ WGPUInstanceCapabilities.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUInstanceDescriptor = io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUInstanceDescriptor = WGPUInstanceDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceDescriptor) -> Unit,
		): ArrayHolder<WGPUInstanceDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUInstanceDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPULimits {
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

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPULimits.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPULimits.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPULimits.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPULimits.ByReference = io.ygdrasil.wgpu.android.WGPULimits.ByReference(Pointer.NULL),
	) : WGPULimits {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var maxTextureDimension1D: UInt
			get() = handle.maxTextureDimension1D.toUInt()
			set(newValue) {
				handle.maxTextureDimension1D = newValue.toInt()
			}

		override var maxTextureDimension2D: UInt
			get() = handle.maxTextureDimension2D.toUInt()
			set(newValue) {
				handle.maxTextureDimension2D = newValue.toInt()
			}

		override var maxTextureDimension3D: UInt
			get() = handle.maxTextureDimension3D.toUInt()
			set(newValue) {
				handle.maxTextureDimension3D = newValue.toInt()
			}

		override var maxTextureArrayLayers: UInt
			get() = handle.maxTextureArrayLayers.toUInt()
			set(newValue) {
				handle.maxTextureArrayLayers = newValue.toInt()
			}

		override var maxBindGroups: UInt
			get() = handle.maxBindGroups.toUInt()
			set(newValue) {
				handle.maxBindGroups = newValue.toInt()
			}

		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = handle.maxBindGroupsPlusVertexBuffers.toUInt()
			set(newValue) {
				handle.maxBindGroupsPlusVertexBuffers = newValue.toInt()
			}

		override var maxBindingsPerBindGroup: UInt
			get() = handle.maxBindingsPerBindGroup.toUInt()
			set(newValue) {
				handle.maxBindingsPerBindGroup = newValue.toInt()
			}

		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = handle.maxDynamicUniformBuffersPerPipelineLayout.toUInt()
			set(newValue) {
				handle.maxDynamicUniformBuffersPerPipelineLayout = newValue.toInt()
			}

		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = handle.maxDynamicStorageBuffersPerPipelineLayout.toUInt()
			set(newValue) {
				handle.maxDynamicStorageBuffersPerPipelineLayout = newValue.toInt()
			}

		override var maxSampledTexturesPerShaderStage: UInt
			get() = handle.maxSampledTexturesPerShaderStage.toUInt()
			set(newValue) {
				handle.maxSampledTexturesPerShaderStage = newValue.toInt()
			}

		override var maxSamplersPerShaderStage: UInt
			get() = handle.maxSamplersPerShaderStage.toUInt()
			set(newValue) {
				handle.maxSamplersPerShaderStage = newValue.toInt()
			}

		override var maxStorageBuffersPerShaderStage: UInt
			get() = handle.maxStorageBuffersPerShaderStage.toUInt()
			set(newValue) {
				handle.maxStorageBuffersPerShaderStage = newValue.toInt()
			}

		override var maxStorageTexturesPerShaderStage: UInt
			get() = handle.maxStorageTexturesPerShaderStage.toUInt()
			set(newValue) {
				handle.maxStorageTexturesPerShaderStage = newValue.toInt()
			}

		override var maxUniformBuffersPerShaderStage: UInt
			get() = handle.maxUniformBuffersPerShaderStage.toUInt()
			set(newValue) {
				handle.maxUniformBuffersPerShaderStage = newValue.toInt()
			}

		override var maxUniformBufferBindingSize: ULong
			get() = handle.maxUniformBufferBindingSize.toULong()
			set(newValue) {
				handle.maxUniformBufferBindingSize = newValue.toLong()
			}

		override var maxStorageBufferBindingSize: ULong
			get() = handle.maxStorageBufferBindingSize.toULong()
			set(newValue) {
				handle.maxStorageBufferBindingSize = newValue.toLong()
			}

		override var minUniformBufferOffsetAlignment: UInt
			get() = handle.minUniformBufferOffsetAlignment.toUInt()
			set(newValue) {
				handle.minUniformBufferOffsetAlignment = newValue.toInt()
			}

		override var minStorageBufferOffsetAlignment: UInt
			get() = handle.minStorageBufferOffsetAlignment.toUInt()
			set(newValue) {
				handle.minStorageBufferOffsetAlignment = newValue.toInt()
			}

		override var maxVertexBuffers: UInt
			get() = handle.maxVertexBuffers.toUInt()
			set(newValue) {
				handle.maxVertexBuffers = newValue.toInt()
			}

		override var maxBufferSize: ULong
			get() = handle.maxBufferSize.toULong()
			set(newValue) {
				handle.maxBufferSize = newValue.toLong()
			}

		override var maxVertexAttributes: UInt
			get() = handle.maxVertexAttributes.toUInt()
			set(newValue) {
				handle.maxVertexAttributes = newValue.toInt()
			}

		override var maxVertexBufferArrayStride: UInt
			get() = handle.maxVertexBufferArrayStride.toUInt()
			set(newValue) {
				handle.maxVertexBufferArrayStride = newValue.toInt()
			}

		override var maxInterStageShaderVariables: UInt
			get() = handle.maxInterStageShaderVariables.toUInt()
			set(newValue) {
				handle.maxInterStageShaderVariables = newValue.toInt()
			}

		override var maxColorAttachments: UInt
			get() = handle.maxColorAttachments.toUInt()
			set(newValue) {
				handle.maxColorAttachments = newValue.toInt()
			}

		override var maxColorAttachmentBytesPerSample: UInt
			get() = handle.maxColorAttachmentBytesPerSample.toUInt()
			set(newValue) {
				handle.maxColorAttachmentBytesPerSample = newValue.toInt()
			}

		override var maxComputeWorkgroupStorageSize: UInt
			get() = handle.maxComputeWorkgroupStorageSize.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupStorageSize = newValue.toInt()
			}

		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = handle.maxComputeInvocationsPerWorkgroup.toUInt()
			set(newValue) {
				handle.maxComputeInvocationsPerWorkgroup = newValue.toInt()
			}

		override var maxComputeWorkgroupSizeX: UInt
			get() = handle.maxComputeWorkgroupSizeX.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupSizeX = newValue.toInt()
			}

		override var maxComputeWorkgroupSizeY: UInt
			get() = handle.maxComputeWorkgroupSizeY.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupSizeY = newValue.toInt()
			}

		override var maxComputeWorkgroupSizeZ: UInt
			get() = handle.maxComputeWorkgroupSizeZ.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupSizeZ = newValue.toInt()
			}

		override var maxComputeWorkgroupsPerDimension: UInt
			get() = handle.maxComputeWorkgroupsPerDimension.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupsPerDimension = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPULimits.ByValue = io.ygdrasil.wgpu.android.WGPULimits.ByValue(Pointer.NULL),
	) : WGPULimits {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var maxTextureDimension1D: UInt
			get() = handle.maxTextureDimension1D.toUInt()
			set(newValue) {
				handle.maxTextureDimension1D = newValue.toInt()
			}

		override var maxTextureDimension2D: UInt
			get() = handle.maxTextureDimension2D.toUInt()
			set(newValue) {
				handle.maxTextureDimension2D = newValue.toInt()
			}

		override var maxTextureDimension3D: UInt
			get() = handle.maxTextureDimension3D.toUInt()
			set(newValue) {
				handle.maxTextureDimension3D = newValue.toInt()
			}

		override var maxTextureArrayLayers: UInt
			get() = handle.maxTextureArrayLayers.toUInt()
			set(newValue) {
				handle.maxTextureArrayLayers = newValue.toInt()
			}

		override var maxBindGroups: UInt
			get() = handle.maxBindGroups.toUInt()
			set(newValue) {
				handle.maxBindGroups = newValue.toInt()
			}

		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = handle.maxBindGroupsPlusVertexBuffers.toUInt()
			set(newValue) {
				handle.maxBindGroupsPlusVertexBuffers = newValue.toInt()
			}

		override var maxBindingsPerBindGroup: UInt
			get() = handle.maxBindingsPerBindGroup.toUInt()
			set(newValue) {
				handle.maxBindingsPerBindGroup = newValue.toInt()
			}

		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = handle.maxDynamicUniformBuffersPerPipelineLayout.toUInt()
			set(newValue) {
				handle.maxDynamicUniformBuffersPerPipelineLayout = newValue.toInt()
			}

		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = handle.maxDynamicStorageBuffersPerPipelineLayout.toUInt()
			set(newValue) {
				handle.maxDynamicStorageBuffersPerPipelineLayout = newValue.toInt()
			}

		override var maxSampledTexturesPerShaderStage: UInt
			get() = handle.maxSampledTexturesPerShaderStage.toUInt()
			set(newValue) {
				handle.maxSampledTexturesPerShaderStage = newValue.toInt()
			}

		override var maxSamplersPerShaderStage: UInt
			get() = handle.maxSamplersPerShaderStage.toUInt()
			set(newValue) {
				handle.maxSamplersPerShaderStage = newValue.toInt()
			}

		override var maxStorageBuffersPerShaderStage: UInt
			get() = handle.maxStorageBuffersPerShaderStage.toUInt()
			set(newValue) {
				handle.maxStorageBuffersPerShaderStage = newValue.toInt()
			}

		override var maxStorageTexturesPerShaderStage: UInt
			get() = handle.maxStorageTexturesPerShaderStage.toUInt()
			set(newValue) {
				handle.maxStorageTexturesPerShaderStage = newValue.toInt()
			}

		override var maxUniformBuffersPerShaderStage: UInt
			get() = handle.maxUniformBuffersPerShaderStage.toUInt()
			set(newValue) {
				handle.maxUniformBuffersPerShaderStage = newValue.toInt()
			}

		override var maxUniformBufferBindingSize: ULong
			get() = handle.maxUniformBufferBindingSize.toULong()
			set(newValue) {
				handle.maxUniformBufferBindingSize = newValue.toLong()
			}

		override var maxStorageBufferBindingSize: ULong
			get() = handle.maxStorageBufferBindingSize.toULong()
			set(newValue) {
				handle.maxStorageBufferBindingSize = newValue.toLong()
			}

		override var minUniformBufferOffsetAlignment: UInt
			get() = handle.minUniformBufferOffsetAlignment.toUInt()
			set(newValue) {
				handle.minUniformBufferOffsetAlignment = newValue.toInt()
			}

		override var minStorageBufferOffsetAlignment: UInt
			get() = handle.minStorageBufferOffsetAlignment.toUInt()
			set(newValue) {
				handle.minStorageBufferOffsetAlignment = newValue.toInt()
			}

		override var maxVertexBuffers: UInt
			get() = handle.maxVertexBuffers.toUInt()
			set(newValue) {
				handle.maxVertexBuffers = newValue.toInt()
			}

		override var maxBufferSize: ULong
			get() = handle.maxBufferSize.toULong()
			set(newValue) {
				handle.maxBufferSize = newValue.toLong()
			}

		override var maxVertexAttributes: UInt
			get() = handle.maxVertexAttributes.toUInt()
			set(newValue) {
				handle.maxVertexAttributes = newValue.toInt()
			}

		override var maxVertexBufferArrayStride: UInt
			get() = handle.maxVertexBufferArrayStride.toUInt()
			set(newValue) {
				handle.maxVertexBufferArrayStride = newValue.toInt()
			}

		override var maxInterStageShaderVariables: UInt
			get() = handle.maxInterStageShaderVariables.toUInt()
			set(newValue) {
				handle.maxInterStageShaderVariables = newValue.toInt()
			}

		override var maxColorAttachments: UInt
			get() = handle.maxColorAttachments.toUInt()
			set(newValue) {
				handle.maxColorAttachments = newValue.toInt()
			}

		override var maxColorAttachmentBytesPerSample: UInt
			get() = handle.maxColorAttachmentBytesPerSample.toUInt()
			set(newValue) {
				handle.maxColorAttachmentBytesPerSample = newValue.toInt()
			}

		override var maxComputeWorkgroupStorageSize: UInt
			get() = handle.maxComputeWorkgroupStorageSize.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupStorageSize = newValue.toInt()
			}

		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = handle.maxComputeInvocationsPerWorkgroup.toUInt()
			set(newValue) {
				handle.maxComputeInvocationsPerWorkgroup = newValue.toInt()
			}

		override var maxComputeWorkgroupSizeX: UInt
			get() = handle.maxComputeWorkgroupSizeX.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupSizeX = newValue.toInt()
			}

		override var maxComputeWorkgroupSizeY: UInt
			get() = handle.maxComputeWorkgroupSizeY.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupSizeY = newValue.toInt()
			}

		override var maxComputeWorkgroupSizeZ: UInt
			get() = handle.maxComputeWorkgroupSizeZ.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupSizeZ = newValue.toInt()
			}

		override var maxComputeWorkgroupsPerDimension: UInt
			get() = handle.maxComputeWorkgroupsPerDimension.toUInt()
			set(newValue) {
				handle.maxComputeWorkgroupsPerDimension = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPULimits = io.ygdrasil.wgpu.android.WGPULimits.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPULimits = WGPULimits.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPULimits) -> Unit,
		): ArrayHolder<WGPULimits> {
			val array = io.ygdrasil.wgpu.android.WGPULimits.ByValue(allocator.allocate(152 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPULimits.ByValue)
					.also { provider(index.toUInt(), WGPULimits.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUMultisampleState {
	public actual var nextInChain: NativeAddress?

	public actual var count: UInt

	public actual var mask: UInt

	public actual var alphaToCoverageEnabled: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUMultisampleState.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUMultisampleState.ByReference = io.ygdrasil.wgpu.android.WGPUMultisampleState.ByReference(Pointer.NULL),
	) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var count: UInt
			get() = handle.count.toUInt()
			set(newValue) {
				handle.count = newValue.toInt()
			}

		override var mask: UInt
			get() = handle.mask.toUInt()
			set(newValue) {
				handle.mask = newValue.toInt()
			}

		override var alphaToCoverageEnabled: Boolean
			get() = handle.alphaToCoverageEnabled.toBoolean()
			set(newValue) {
				handle.alphaToCoverageEnabled = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue = io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue(Pointer.NULL),
	) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var count: UInt
			get() = handle.count.toUInt()
			set(newValue) {
				handle.count = newValue.toInt()
			}

		override var mask: UInt
			get() = handle.mask.toUInt()
			set(newValue) {
				handle.mask = newValue.toInt()
			}

		override var alphaToCoverageEnabled: Boolean
			get() = handle.alphaToCoverageEnabled.toBoolean()
			set(newValue) {
				handle.alphaToCoverageEnabled = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUMultisampleState = io.ygdrasil.wgpu.android.WGPUMultisampleState.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUMultisampleState = WGPUMultisampleState.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUMultisampleState) -> Unit,
		): ArrayHolder<WGPUMultisampleState> {
			val array = io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUMultisampleState.ByValue)
					.also { provider(index.toUInt(), WGPUMultisampleState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUOrigin3D {
	public actual var x: UInt

	public actual var y: UInt

	public actual var z: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUOrigin3D.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUOrigin3D.ByReference = io.ygdrasil.wgpu.android.WGPUOrigin3D.ByReference(Pointer.NULL),
	) : WGPUOrigin3D {
		override var x: UInt
			get() = handle.x.toUInt()
			set(newValue) {
				handle.x = newValue.toInt()
			}

		override var y: UInt
			get() = handle.y.toUInt()
			set(newValue) {
				handle.y = newValue.toInt()
			}

		override var z: UInt
			get() = handle.z.toUInt()
			set(newValue) {
				handle.z = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue = io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue(Pointer.NULL),
	) : WGPUOrigin3D {
		override var x: UInt
			get() = handle.x.toUInt()
			set(newValue) {
				handle.x = newValue.toInt()
			}

		override var y: UInt
			get() = handle.y.toUInt()
			set(newValue) {
				handle.y = newValue.toInt()
			}

		override var z: UInt
			get() = handle.z.toUInt()
			set(newValue) {
				handle.z = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUOrigin3D = io.ygdrasil.wgpu.android.WGPUOrigin3D.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUOrigin3D = WGPUOrigin3D.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUOrigin3D) -> Unit,
		): ArrayHolder<WGPUOrigin3D> {
			val array = io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue(allocator.allocate(12 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUOrigin3D.ByValue)
					.also { provider(index.toUInt(), WGPUOrigin3D.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUPipelineLayoutDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var bindGroupLayoutCount: ULong

	public actual var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByReference(Pointer.NULL),
	) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var bindGroupLayoutCount: ULong
			get() = handle.bindGroupLayoutCount.toULong()
			set(newValue) {
				handle.bindGroupLayoutCount = newValue.toLong()
			}

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = handle.bindGroupLayouts?.let(::ArrayHolder)
			set(newValue) {
				handle.bindGroupLayouts = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue(Pointer.NULL),
	) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var bindGroupLayoutCount: ULong
			get() = handle.bindGroupLayoutCount.toULong()
			set(newValue) {
				handle.bindGroupLayoutCount = newValue.toLong()
			}

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = handle.bindGroupLayouts?.let(::ArrayHolder)
			set(newValue) {
				handle.bindGroupLayouts = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUPipelineLayoutDescriptor = io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUPipelineLayoutDescriptor = WGPUPipelineLayoutDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPipelineLayoutDescriptor) -> Unit,
		): ArrayHolder<WGPUPipelineLayoutDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUPipelineLayoutDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUPrimitiveState {
	public actual var nextInChain: NativeAddress?

	public actual var topology: WGPUPrimitiveTopology

	public actual var stripIndexFormat: WGPUIndexFormat

	public actual var frontFace: WGPUFrontFace

	public actual var cullMode: WGPUCullMode

	public actual var unclippedDepth: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByReference = io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByReference(Pointer.NULL),
	) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var topology: WGPUPrimitiveTopology
			get() = handle.topology.toUInt()
			set(newValue) {
				handle.topology = newValue.toInt()
			}

		override var stripIndexFormat: WGPUIndexFormat
			get() = handle.stripIndexFormat.toUInt()
			set(newValue) {
				handle.stripIndexFormat = newValue.toInt()
			}

		override var frontFace: WGPUFrontFace
			get() = handle.frontFace.toUInt()
			set(newValue) {
				handle.frontFace = newValue.toInt()
			}

		override var cullMode: WGPUCullMode
			get() = handle.cullMode.toUInt()
			set(newValue) {
				handle.cullMode = newValue.toInt()
			}

		override var unclippedDepth: Boolean
			get() = handle.unclippedDepth.toBoolean()
			set(newValue) {
				handle.unclippedDepth = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue = io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue(Pointer.NULL),
	) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var topology: WGPUPrimitiveTopology
			get() = handle.topology.toUInt()
			set(newValue) {
				handle.topology = newValue.toInt()
			}

		override var stripIndexFormat: WGPUIndexFormat
			get() = handle.stripIndexFormat.toUInt()
			set(newValue) {
				handle.stripIndexFormat = newValue.toInt()
			}

		override var frontFace: WGPUFrontFace
			get() = handle.frontFace.toUInt()
			set(newValue) {
				handle.frontFace = newValue.toInt()
			}

		override var cullMode: WGPUCullMode
			get() = handle.cullMode.toUInt()
			set(newValue) {
				handle.cullMode = newValue.toInt()
			}

		override var unclippedDepth: Boolean
			get() = handle.unclippedDepth.toBoolean()
			set(newValue) {
				handle.unclippedDepth = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUPrimitiveState = io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUPrimitiveState = WGPUPrimitiveState.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPrimitiveState) -> Unit,
		): ArrayHolder<WGPUPrimitiveState> {
			val array = io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue)
					.also { provider(index.toUInt(), WGPUPrimitiveState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUQuerySetDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var type: WGPUQueryType

	public actual var count: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByReference(Pointer.NULL),
	) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var type: WGPUQueryType
			get() = handle.type.toUInt()
			set(newValue) {
				handle.type = newValue.toInt()
			}

		override var count: UInt
			get() = handle.count.toUInt()
			set(newValue) {
				handle.count = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue(Pointer.NULL),
	) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var type: WGPUQueryType
			get() = handle.type.toUInt()
			set(newValue) {
				handle.type = newValue.toInt()
			}

		override var count: UInt
			get() = handle.count.toUInt()
			set(newValue) {
				handle.count = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUQuerySetDescriptor = io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUQuerySetDescriptor = WGPUQuerySetDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQuerySetDescriptor) -> Unit,
		): ArrayHolder<WGPUQuerySetDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUQuerySetDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURenderBundleDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByReference(Pointer.NULL),
	) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue(Pointer.NULL),
	) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderBundleDescriptor = io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleDescriptor = WGPURenderBundleDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderBundleDescriptor) -> Unit,
		): ArrayHolder<WGPURenderBundleDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderBundleDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPURenderBundleDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURenderBundleEncoderDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var colorFormatCount: ULong

	public actual var colorFormats: ArrayHolder<WGPUTextureFormat>?

	public actual var depthStencilFormat: WGPUTextureFormat

	public actual var sampleCount: UInt

	public actual var depthReadOnly: Boolean

	public actual var stencilReadOnly: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByReference(Pointer.NULL),
	) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var colorFormatCount: ULong
			get() = handle.colorFormatCount.toULong()
			set(newValue) {
				handle.colorFormatCount = newValue.toLong()
			}

		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.colorFormats?.let(::ArrayHolder)
			set(newValue) {
				handle.colorFormats = newValue?.handler
			}

		override var depthStencilFormat: WGPUTextureFormat
			get() = handle.depthStencilFormat.toUInt()
			set(newValue) {
				handle.depthStencilFormat = newValue.toInt()
			}

		override var sampleCount: UInt
			get() = handle.sampleCount.toUInt()
			set(newValue) {
				handle.sampleCount = newValue.toInt()
			}

		override var depthReadOnly: Boolean
			get() = handle.depthReadOnly.toBoolean()
			set(newValue) {
				handle.depthReadOnly = newValue.toInt()
			}

		override var stencilReadOnly: Boolean
			get() = handle.stencilReadOnly.toBoolean()
			set(newValue) {
				handle.stencilReadOnly = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue(Pointer.NULL),
	) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var colorFormatCount: ULong
			get() = handle.colorFormatCount.toULong()
			set(newValue) {
				handle.colorFormatCount = newValue.toLong()
			}

		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.colorFormats?.let(::ArrayHolder)
			set(newValue) {
				handle.colorFormats = newValue?.handler
			}

		override var depthStencilFormat: WGPUTextureFormat
			get() = handle.depthStencilFormat.toUInt()
			set(newValue) {
				handle.depthStencilFormat = newValue.toInt()
			}

		override var sampleCount: UInt
			get() = handle.sampleCount.toUInt()
			set(newValue) {
				handle.sampleCount = newValue.toInt()
			}

		override var depthReadOnly: Boolean
			get() = handle.depthReadOnly.toBoolean()
			set(newValue) {
				handle.depthReadOnly = newValue.toInt()
			}

		override var stencilReadOnly: Boolean
			get() = handle.stencilReadOnly.toBoolean()
			set(newValue) {
				handle.stencilReadOnly = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderBundleEncoderDescriptor = io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleEncoderDescriptor = WGPURenderBundleEncoderDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderBundleEncoderDescriptor) -> Unit,
		): ArrayHolder<WGPURenderBundleEncoderDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue(allocator.allocate(56 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPURenderBundleEncoderDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURenderPassColorAttachment {
	public actual var nextInChain: NativeAddress?

	public actual var view: WGPUTextureView?

	public actual var depthSlice: UInt

	public actual var resolveTarget: WGPUTextureView?

	public actual var loadOp: WGPULoadOp

	public actual var storeOp: WGPUStoreOp

	public actual val clearValue: WGPUColor

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByReference(Pointer.NULL),
	) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var view: WGPUTextureView?
			get() = handle.view?.let{ WGPUTextureView(it) }
			set(newValue) {
				handle.view = newValue?.handler
			}

		override var depthSlice: UInt
			get() = handle.depthSlice.toUInt()
			set(newValue) {
				handle.depthSlice = newValue.toInt()
			}

		override var resolveTarget: WGPUTextureView?
			get() = handle.resolveTarget?.let{ WGPUTextureView(it) }
			set(newValue) {
				handle.resolveTarget = newValue?.handler
			}

		override var loadOp: WGPULoadOp
			get() = handle.loadOp.toUInt()
			set(newValue) {
				handle.loadOp = newValue.toInt()
			}

		override var storeOp: WGPUStoreOp
			get() = handle.storeOp.toUInt()
			set(newValue) {
				handle.storeOp = newValue.toInt()
			}

		override val clearValue: WGPUColor
			get() = handle.clearValue.let{ WGPUColor.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue(Pointer.NULL),
	) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var view: WGPUTextureView?
			get() = handle.view?.let{ WGPUTextureView(it) }
			set(newValue) {
				handle.view = newValue?.handler
			}

		override var depthSlice: UInt
			get() = handle.depthSlice.toUInt()
			set(newValue) {
				handle.depthSlice = newValue.toInt()
			}

		override var resolveTarget: WGPUTextureView?
			get() = handle.resolveTarget?.let{ WGPUTextureView(it) }
			set(newValue) {
				handle.resolveTarget = newValue?.handler
			}

		override var loadOp: WGPULoadOp
			get() = handle.loadOp.toUInt()
			set(newValue) {
				handle.loadOp = newValue.toInt()
			}

		override var storeOp: WGPUStoreOp
			get() = handle.storeOp.toUInt()
			set(newValue) {
				handle.storeOp = newValue.toInt()
			}

		override val clearValue: WGPUColor
			get() = handle.clearValue.let{ WGPUColor.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassColorAttachment = io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassColorAttachment = WGPURenderPassColorAttachment.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassColorAttachment) -> Unit,
		): ArrayHolder<WGPURenderPassColorAttachment> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue(allocator.allocate(72 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassColorAttachment.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURenderPassDepthStencilAttachment {
	public actual var view: WGPUTextureView?

	public actual var depthLoadOp: WGPULoadOp

	public actual var depthStoreOp: WGPUStoreOp

	public actual var depthClearValue: Float

	public actual var depthReadOnly: Boolean

	public actual var stencilLoadOp: WGPULoadOp

	public actual var stencilStoreOp: WGPUStoreOp

	public actual var stencilClearValue: UInt

	public actual var stencilReadOnly: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByReference(Pointer.NULL),
	) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = handle.view?.let{ WGPUTextureView(it) }
			set(newValue) {
				handle.view = newValue?.handler
			}

		override var depthLoadOp: WGPULoadOp
			get() = handle.depthLoadOp.toUInt()
			set(newValue) {
				handle.depthLoadOp = newValue.toInt()
			}

		override var depthStoreOp: WGPUStoreOp
			get() = handle.depthStoreOp.toUInt()
			set(newValue) {
				handle.depthStoreOp = newValue.toInt()
			}

		override var depthClearValue: Float
			get() = handle.depthClearValue
			set(newValue) {
				handle.depthClearValue = newValue
			}

		override var depthReadOnly: Boolean
			get() = handle.depthReadOnly.toBoolean()
			set(newValue) {
				handle.depthReadOnly = newValue.toInt()
			}

		override var stencilLoadOp: WGPULoadOp
			get() = handle.stencilLoadOp.toUInt()
			set(newValue) {
				handle.stencilLoadOp = newValue.toInt()
			}

		override var stencilStoreOp: WGPUStoreOp
			get() = handle.stencilStoreOp.toUInt()
			set(newValue) {
				handle.stencilStoreOp = newValue.toInt()
			}

		override var stencilClearValue: UInt
			get() = handle.stencilClearValue.toUInt()
			set(newValue) {
				handle.stencilClearValue = newValue.toInt()
			}

		override var stencilReadOnly: Boolean
			get() = handle.stencilReadOnly.toBoolean()
			set(newValue) {
				handle.stencilReadOnly = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue(Pointer.NULL),
	) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = handle.view?.let{ WGPUTextureView(it) }
			set(newValue) {
				handle.view = newValue?.handler
			}

		override var depthLoadOp: WGPULoadOp
			get() = handle.depthLoadOp.toUInt()
			set(newValue) {
				handle.depthLoadOp = newValue.toInt()
			}

		override var depthStoreOp: WGPUStoreOp
			get() = handle.depthStoreOp.toUInt()
			set(newValue) {
				handle.depthStoreOp = newValue.toInt()
			}

		override var depthClearValue: Float
			get() = handle.depthClearValue
			set(newValue) {
				handle.depthClearValue = newValue
			}

		override var depthReadOnly: Boolean
			get() = handle.depthReadOnly.toBoolean()
			set(newValue) {
				handle.depthReadOnly = newValue.toInt()
			}

		override var stencilLoadOp: WGPULoadOp
			get() = handle.stencilLoadOp.toUInt()
			set(newValue) {
				handle.stencilLoadOp = newValue.toInt()
			}

		override var stencilStoreOp: WGPUStoreOp
			get() = handle.stencilStoreOp.toUInt()
			set(newValue) {
				handle.stencilStoreOp = newValue.toInt()
			}

		override var stencilClearValue: UInt
			get() = handle.stencilClearValue.toUInt()
			set(newValue) {
				handle.stencilClearValue = newValue.toInt()
			}

		override var stencilReadOnly: Boolean
			get() = handle.stencilReadOnly.toBoolean()
			set(newValue) {
				handle.stencilReadOnly = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassDepthStencilAttachment = io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDepthStencilAttachment = WGPURenderPassDepthStencilAttachment.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassDepthStencilAttachment) -> Unit,
		): ArrayHolder<WGPURenderPassDepthStencilAttachment> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassDepthStencilAttachment.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURenderPassDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var colorAttachmentCount: ULong

	public actual var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?

	public actual var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?

	public actual var occlusionQuerySet: WGPUQuerySet?

	public actual var timestampWrites: WGPURenderPassTimestampWrites?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByReference(Pointer.NULL),
	) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var colorAttachmentCount: ULong
			get() = handle.colorAttachmentCount.toULong()
			set(newValue) {
				handle.colorAttachmentCount = newValue.toLong()
			}

		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = handle.colorAttachments?.let(::ArrayHolder)
			set(newValue) {
				handle.colorAttachments = newValue?.handler
			}

		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = handle.depthStencilAttachment?.let{ WGPURenderPassDepthStencilAttachment.ByReference(it) }
			set(newValue) {
				handle.depthStencilAttachment = (newValue as? WGPURenderPassDepthStencilAttachment.ByReference)?.handle
			}

		override var occlusionQuerySet: WGPUQuerySet?
			get() = handle.occlusionQuerySet?.let{ WGPUQuerySet(it) }
			set(newValue) {
				handle.occlusionQuerySet = newValue?.handler
			}

		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = handle.timestampWrites?.let{ WGPURenderPassTimestampWrites.ByReference(it) }
			set(newValue) {
				handle.timestampWrites = (newValue as? WGPURenderPassTimestampWrites.ByReference)?.handle
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue(Pointer.NULL),
	) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var colorAttachmentCount: ULong
			get() = handle.colorAttachmentCount.toULong()
			set(newValue) {
				handle.colorAttachmentCount = newValue.toLong()
			}

		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = handle.colorAttachments?.let(::ArrayHolder)
			set(newValue) {
				handle.colorAttachments = newValue?.handler
			}

		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = handle.depthStencilAttachment?.let{ WGPURenderPassDepthStencilAttachment.ByReference(it) }
			set(newValue) {
				handle.depthStencilAttachment = (newValue as? WGPURenderPassDepthStencilAttachment.ByReference)?.handle
			}

		override var occlusionQuerySet: WGPUQuerySet?
			get() = handle.occlusionQuerySet?.let{ WGPUQuerySet(it) }
			set(newValue) {
				handle.occlusionQuerySet = newValue?.handler
			}

		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = handle.timestampWrites?.let{ WGPURenderPassTimestampWrites.ByReference(it) }
			set(newValue) {
				handle.timestampWrites = (newValue as? WGPURenderPassTimestampWrites.ByReference)?.handle
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassDescriptor = io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptor = WGPURenderPassDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassDescriptor) -> Unit,
		): ArrayHolder<WGPURenderPassDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue(allocator.allocate(64 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUChainedStruct {
	public actual var next: WGPUChainedStruct?

	public actual var sType: WGPUSType

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference(Pointer.NULL),
	) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = handle.next?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.next = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var sType: WGPUSType
			get() = handle.sType.toUInt()
			set(newValue) {
				handle.sType = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue(Pointer.NULL),
	) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = handle.next?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.next = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var sType: WGPUSType
			get() = handle.sType.toUInt()
			set(newValue) {
				handle.sType = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUChainedStruct = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUChainedStruct = WGPUChainedStruct.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUChainedStruct) -> Unit,
		): ArrayHolder<WGPUChainedStruct> {
			val array = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue)
					.also { provider(index.toUInt(), WGPUChainedStruct.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURenderPassMaxDrawCount {
	public actual val chain: WGPUChainedStruct

	public actual var maxDrawCount: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByReference(Pointer.NULL),
	) : WGPURenderPassMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var maxDrawCount: ULong
			get() = handle.maxDrawCount.toULong()
			set(newValue) {
				handle.maxDrawCount = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByValue(Pointer.NULL),
	) : WGPURenderPassMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var maxDrawCount: ULong
			get() = handle.maxDrawCount.toULong()
			set(newValue) {
				handle.maxDrawCount = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassMaxDrawCount = io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassMaxDrawCount = WGPURenderPassMaxDrawCount.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassMaxDrawCount) -> Unit,
		): ArrayHolder<WGPURenderPassMaxDrawCount> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassMaxDrawCount.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassMaxDrawCount.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURenderPassTimestampWrites {
	public actual var querySet: WGPUQuerySet?

	public actual var beginningOfPassWriteIndex: UInt

	public actual var endOfPassWriteIndex: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByReference(Pointer.NULL),
	) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.querySet?.let{ WGPUQuerySet(it) }
			set(newValue) {
				handle.querySet = newValue?.handler
			}

		override var beginningOfPassWriteIndex: UInt
			get() = handle.beginningOfPassWriteIndex.toUInt()
			set(newValue) {
				handle.beginningOfPassWriteIndex = newValue.toInt()
			}

		override var endOfPassWriteIndex: UInt
			get() = handle.endOfPassWriteIndex.toUInt()
			set(newValue) {
				handle.endOfPassWriteIndex = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue = io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue(Pointer.NULL),
	) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.querySet?.let{ WGPUQuerySet(it) }
			set(newValue) {
				handle.querySet = newValue?.handler
			}

		override var beginningOfPassWriteIndex: UInt
			get() = handle.beginningOfPassWriteIndex.toUInt()
			set(newValue) {
				handle.beginningOfPassWriteIndex = newValue.toInt()
			}

		override var endOfPassWriteIndex: UInt
			get() = handle.endOfPassWriteIndex.toUInt()
			set(newValue) {
				handle.endOfPassWriteIndex = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassTimestampWrites = io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassTimestampWrites = WGPURenderPassTimestampWrites.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassTimestampWrites) -> Unit,
		): ArrayHolder<WGPURenderPassTimestampWrites> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPassTimestampWrites.ByValue)
					.also { provider(index.toUInt(), WGPURenderPassTimestampWrites.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUVertexState {
	public actual var nextInChain: NativeAddress?

	public actual var module: WGPUShaderModule?

	public actual val entryPoint: WGPUStringView

	public actual var constantCount: ULong

	public actual var constants: ArrayHolder<WGPUConstantEntry>?

	public actual var bufferCount: ULong

	public actual var buffers: ArrayHolder<WGPUVertexBufferLayout>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUVertexState.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUVertexState.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUVertexState.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUVertexState.ByReference = io.ygdrasil.wgpu.android.WGPUVertexState.ByReference(Pointer.NULL),
	) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) {
				handle.module = newValue?.handler
			}

		override val entryPoint: WGPUStringView
			get() = handle.entryPoint.let{ WGPUStringView.ByValue(it) }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) {
				handle.constantCount = newValue.toLong()
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) {
				handle.constants = newValue?.handler
			}

		override var bufferCount: ULong
			get() = handle.bufferCount.toULong()
			set(newValue) {
				handle.bufferCount = newValue.toLong()
			}

		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = handle.buffers?.let(::ArrayHolder)
			set(newValue) {
				handle.buffers = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUVertexState.ByValue = io.ygdrasil.wgpu.android.WGPUVertexState.ByValue(Pointer.NULL),
	) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var module: WGPUShaderModule?
			get() = handle.module?.let{ WGPUShaderModule(it) }
			set(newValue) {
				handle.module = newValue?.handler
			}

		override val entryPoint: WGPUStringView
			get() = handle.entryPoint.let{ WGPUStringView.ByValue(it) }

		override var constantCount: ULong
			get() = handle.constantCount.toULong()
			set(newValue) {
				handle.constantCount = newValue.toLong()
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.constants?.let(::ArrayHolder)
			set(newValue) {
				handle.constants = newValue?.handler
			}

		override var bufferCount: ULong
			get() = handle.bufferCount.toULong()
			set(newValue) {
				handle.bufferCount = newValue.toLong()
			}

		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = handle.buffers?.let(::ArrayHolder)
			set(newValue) {
				handle.buffers = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUVertexState = io.ygdrasil.wgpu.android.WGPUVertexState.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUVertexState = WGPUVertexState.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexState) -> Unit,
		): ArrayHolder<WGPUVertexState> {
			val array = io.ygdrasil.wgpu.android.WGPUVertexState.ByValue(allocator.allocate(64 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUVertexState.ByValue)
					.also { provider(index.toUInt(), WGPUVertexState.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURenderPipelineDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var layout: WGPUPipelineLayout?

	public actual val vertex: WGPUVertexState

	public actual val primitive: WGPUPrimitiveState

	public actual var depthStencil: WGPUDepthStencilState?

	public actual val multisample: WGPUMultisampleState

	public actual var fragment: WGPUFragmentState?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByReference(Pointer.NULL),
	) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) {
				handle.layout = newValue?.handler
			}

		override val vertex: WGPUVertexState
			get() = handle.vertex.let{ WGPUVertexState.ByValue(it) }

		override val primitive: WGPUPrimitiveState
			get() = handle.primitive.let{ WGPUPrimitiveState.ByValue(it) }

		override var depthStencil: WGPUDepthStencilState?
			get() = handle.depthStencil?.let{ WGPUDepthStencilState.ByReference(it) }
			set(newValue) {
				handle.depthStencil = (newValue as? WGPUDepthStencilState.ByReference)?.handle
			}

		override val multisample: WGPUMultisampleState
			get() = handle.multisample.let{ WGPUMultisampleState.ByValue(it) }

		override var fragment: WGPUFragmentState?
			get() = handle.fragment?.let{ WGPUFragmentState.ByReference(it) }
			set(newValue) {
				handle.fragment = (newValue as? WGPUFragmentState.ByReference)?.handle
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue(Pointer.NULL),
	) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var layout: WGPUPipelineLayout?
			get() = handle.layout?.let{ WGPUPipelineLayout(it) }
			set(newValue) {
				handle.layout = newValue?.handler
			}

		override val vertex: WGPUVertexState
			get() = handle.vertex.let{ WGPUVertexState.ByValue(it) }

		override val primitive: WGPUPrimitiveState
			get() = handle.primitive.let{ WGPUPrimitiveState.ByValue(it) }

		override var depthStencil: WGPUDepthStencilState?
			get() = handle.depthStencil?.let{ WGPUDepthStencilState.ByReference(it) }
			set(newValue) {
				handle.depthStencil = (newValue as? WGPUDepthStencilState.ByReference)?.handle
			}

		override val multisample: WGPUMultisampleState
			get() = handle.multisample.let{ WGPUMultisampleState.ByValue(it) }

		override var fragment: WGPUFragmentState?
			get() = handle.fragment?.let{ WGPUFragmentState.ByReference(it) }
			set(newValue) {
				handle.fragment = (newValue as? WGPUFragmentState.ByReference)?.handle
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPipelineDescriptor = io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPipelineDescriptor = WGPURenderPipelineDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPipelineDescriptor) -> Unit,
		): ArrayHolder<WGPURenderPipelineDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue(allocator.allocate(168 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPURenderPipelineDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURequestAdapterOptions {
	public actual var nextInChain: NativeAddress?

	public actual var featureLevel: WGPUFeatureLevel

	public actual var powerPreference: WGPUPowerPreference

	public actual var forceFallbackAdapter: Boolean

	public actual var backendType: WGPUBackendType

	public actual var compatibleSurface: WGPUSurface?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByReference = io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByReference(Pointer.NULL),
	) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var featureLevel: WGPUFeatureLevel
			get() = handle.featureLevel.toUInt()
			set(newValue) {
				handle.featureLevel = newValue.toInt()
			}

		override var powerPreference: WGPUPowerPreference
			get() = handle.powerPreference.toUInt()
			set(newValue) {
				handle.powerPreference = newValue.toInt()
			}

		override var forceFallbackAdapter: Boolean
			get() = handle.forceFallbackAdapter.toBoolean()
			set(newValue) {
				handle.forceFallbackAdapter = newValue.toInt()
			}

		override var backendType: WGPUBackendType
			get() = handle.backendType.toUInt()
			set(newValue) {
				handle.backendType = newValue.toInt()
			}

		override var compatibleSurface: WGPUSurface?
			get() = handle.compatibleSurface?.let{ WGPUSurface(it) }
			set(newValue) {
				handle.compatibleSurface = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue = io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue(Pointer.NULL),
	) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var featureLevel: WGPUFeatureLevel
			get() = handle.featureLevel.toUInt()
			set(newValue) {
				handle.featureLevel = newValue.toInt()
			}

		override var powerPreference: WGPUPowerPreference
			get() = handle.powerPreference.toUInt()
			set(newValue) {
				handle.powerPreference = newValue.toInt()
			}

		override var forceFallbackAdapter: Boolean
			get() = handle.forceFallbackAdapter.toBoolean()
			set(newValue) {
				handle.forceFallbackAdapter = newValue.toInt()
			}

		override var backendType: WGPUBackendType
			get() = handle.backendType.toUInt()
			set(newValue) {
				handle.backendType = newValue.toInt()
			}

		override var compatibleSurface: WGPUSurface?
			get() = handle.compatibleSurface?.let{ WGPUSurface(it) }
			set(newValue) {
				handle.compatibleSurface = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURequestAdapterOptions = io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterOptions = WGPURequestAdapterOptions.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestAdapterOptions) -> Unit,
		): ArrayHolder<WGPURequestAdapterOptions> {
			val array = io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURequestAdapterOptions.ByValue)
					.also { provider(index.toUInt(), WGPURequestAdapterOptions.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSamplerDescriptor {
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

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByReference(Pointer.NULL),
	) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var addressModeU: WGPUAddressMode
			get() = handle.addressModeU.toUInt()
			set(newValue) {
				handle.addressModeU = newValue.toInt()
			}

		override var addressModeV: WGPUAddressMode
			get() = handle.addressModeV.toUInt()
			set(newValue) {
				handle.addressModeV = newValue.toInt()
			}

		override var addressModeW: WGPUAddressMode
			get() = handle.addressModeW.toUInt()
			set(newValue) {
				handle.addressModeW = newValue.toInt()
			}

		override var magFilter: WGPUFilterMode
			get() = handle.magFilter.toUInt()
			set(newValue) {
				handle.magFilter = newValue.toInt()
			}

		override var minFilter: WGPUFilterMode
			get() = handle.minFilter.toUInt()
			set(newValue) {
				handle.minFilter = newValue.toInt()
			}

		override var mipmapFilter: WGPUMipmapFilterMode
			get() = handle.mipmapFilter.toUInt()
			set(newValue) {
				handle.mipmapFilter = newValue.toInt()
			}

		override var lodMinClamp: Float
			get() = handle.lodMinClamp
			set(newValue) {
				handle.lodMinClamp = newValue
			}

		override var lodMaxClamp: Float
			get() = handle.lodMaxClamp
			set(newValue) {
				handle.lodMaxClamp = newValue
			}

		override var compare: WGPUCompareFunction
			get() = handle.compare.toUInt()
			set(newValue) {
				handle.compare = newValue.toInt()
			}

		override var maxAnisotropy: UShort
			get() = handle.maxAnisotropy.toUShort()
			set(newValue) {
				handle.maxAnisotropy = newValue.toShort()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue(Pointer.NULL),
	) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var addressModeU: WGPUAddressMode
			get() = handle.addressModeU.toUInt()
			set(newValue) {
				handle.addressModeU = newValue.toInt()
			}

		override var addressModeV: WGPUAddressMode
			get() = handle.addressModeV.toUInt()
			set(newValue) {
				handle.addressModeV = newValue.toInt()
			}

		override var addressModeW: WGPUAddressMode
			get() = handle.addressModeW.toUInt()
			set(newValue) {
				handle.addressModeW = newValue.toInt()
			}

		override var magFilter: WGPUFilterMode
			get() = handle.magFilter.toUInt()
			set(newValue) {
				handle.magFilter = newValue.toInt()
			}

		override var minFilter: WGPUFilterMode
			get() = handle.minFilter.toUInt()
			set(newValue) {
				handle.minFilter = newValue.toInt()
			}

		override var mipmapFilter: WGPUMipmapFilterMode
			get() = handle.mipmapFilter.toUInt()
			set(newValue) {
				handle.mipmapFilter = newValue.toInt()
			}

		override var lodMinClamp: Float
			get() = handle.lodMinClamp
			set(newValue) {
				handle.lodMinClamp = newValue
			}

		override var lodMaxClamp: Float
			get() = handle.lodMaxClamp
			set(newValue) {
				handle.lodMaxClamp = newValue
			}

		override var compare: WGPUCompareFunction
			get() = handle.compare.toUInt()
			set(newValue) {
				handle.compare = newValue.toInt()
			}

		override var maxAnisotropy: UShort
			get() = handle.maxAnisotropy.toUShort()
			set(newValue) {
				handle.maxAnisotropy = newValue.toShort()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSamplerDescriptor = io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSamplerDescriptor = WGPUSamplerDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSamplerDescriptor) -> Unit,
		): ArrayHolder<WGPUSamplerDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue(allocator.allocate(68 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUSamplerDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUShaderModuleDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByReference(Pointer.NULL),
	) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue(Pointer.NULL),
	) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUShaderModuleDescriptor = io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleDescriptor = WGPUShaderModuleDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderModuleDescriptor) -> Unit,
		): ArrayHolder<WGPUShaderModuleDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUShaderModuleDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUShaderModuleDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUShaderSourceSPIRV {
	public actual val chain: WGPUChainedStruct

	public actual var codeSize: UInt

	public actual var code: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByReference = io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByReference(Pointer.NULL),
	) : WGPUShaderSourceSPIRV {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var codeSize: UInt
			get() = handle.codeSize.toUInt()
			set(newValue) {
				handle.codeSize = newValue.toInt()
			}

		override var code: NativeAddress?
			get() = handle.code
			set(newValue) {
				handle.code = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByValue = io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByValue(Pointer.NULL),
	) : WGPUShaderSourceSPIRV {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var codeSize: UInt
			get() = handle.codeSize.toUInt()
			set(newValue) {
				handle.codeSize = newValue.toInt()
			}

		override var code: NativeAddress?
			get() = handle.code
			set(newValue) {
				handle.code = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUShaderSourceSPIRV = io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUShaderSourceSPIRV = WGPUShaderSourceSPIRV.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderSourceSPIRV) -> Unit,
		): ArrayHolder<WGPUShaderSourceSPIRV> {
			val array = io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByValue)
					.also { provider(index.toUInt(), WGPUShaderSourceSPIRV.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUShaderSourceWGSL {
	public actual val chain: WGPUChainedStruct

	public actual val code: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByReference = io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByReference(Pointer.NULL),
	) : WGPUShaderSourceWGSL {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override val code: WGPUStringView
			get() = handle.code.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByValue = io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByValue(Pointer.NULL),
	) : WGPUShaderSourceWGSL {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override val code: WGPUStringView
			get() = handle.code.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUShaderSourceWGSL = io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUShaderSourceWGSL = WGPUShaderSourceWGSL.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderSourceWGSL) -> Unit,
		): ArrayHolder<WGPUShaderSourceWGSL> {
			val array = io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUShaderSourceWGSL.ByValue)
					.also { provider(index.toUInt(), WGPUShaderSourceWGSL.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSupportedFeatures {
	public actual var featureCount: ULong

	public actual var features: ArrayHolder<WGPUFeatureName>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByReference = io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByReference(Pointer.NULL),
	) : WGPUSupportedFeatures {
		override var featureCount: ULong
			get() = handle.featureCount.toULong()
			set(newValue) {
				handle.featureCount = newValue.toLong()
			}

		override var features: ArrayHolder<WGPUFeatureName>?
			get() = handle.features?.let(::ArrayHolder)
			set(newValue) {
				handle.features = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByValue = io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByValue(Pointer.NULL),
	) : WGPUSupportedFeatures {
		override var featureCount: ULong
			get() = handle.featureCount.toULong()
			set(newValue) {
				handle.featureCount = newValue.toLong()
			}

		override var features: ArrayHolder<WGPUFeatureName>?
			get() = handle.features?.let(::ArrayHolder)
			set(newValue) {
				handle.features = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSupportedFeatures = io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSupportedFeatures = WGPUSupportedFeatures.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSupportedFeatures) -> Unit,
		): ArrayHolder<WGPUSupportedFeatures> {
			val array = io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByValue)
					.also { provider(index.toUInt(), WGPUSupportedFeatures.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSupportedWGSLLanguageFeatures {
	public actual var featureCount: ULong

	public actual var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByReference = io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByReference(Pointer.NULL),
	) : WGPUSupportedWGSLLanguageFeatures {
		override var featureCount: ULong
			get() = handle.featureCount.toULong()
			set(newValue) {
				handle.featureCount = newValue.toLong()
			}

		override var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?
			get() = handle.features?.let(::ArrayHolder)
			set(newValue) {
				handle.features = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByValue = io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByValue(Pointer.NULL),
	) : WGPUSupportedWGSLLanguageFeatures {
		override var featureCount: ULong
			get() = handle.featureCount.toULong()
			set(newValue) {
				handle.featureCount = newValue.toLong()
			}

		override var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?
			get() = handle.features?.let(::ArrayHolder)
			set(newValue) {
				handle.features = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSupportedWGSLLanguageFeatures = io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSupportedWGSLLanguageFeatures = WGPUSupportedWGSLLanguageFeatures.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSupportedWGSLLanguageFeatures) -> Unit,
		): ArrayHolder<WGPUSupportedWGSLLanguageFeatures> {
			val array = io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSupportedWGSLLanguageFeatures.ByValue)
					.also { provider(index.toUInt(), WGPUSupportedWGSLLanguageFeatures.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceCapabilities {
	public actual var nextInChain: NativeAddress?

	public actual var usages: ULong

	public actual var formatCount: ULong

	public actual var formats: ArrayHolder<WGPUTextureFormat>?

	public actual var presentModeCount: ULong

	public actual var presentModes: ArrayHolder<WGPUPresentMode>?

	public actual var alphaModeCount: ULong

	public actual var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByReference(Pointer.NULL),
	) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var usages: ULong
			get() = handle.usages.toULong()
			set(newValue) {
				handle.usages = newValue.toLong()
			}

		override var formatCount: ULong
			get() = handle.formatCount.toULong()
			set(newValue) {
				handle.formatCount = newValue.toLong()
			}

		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.formats?.let(::ArrayHolder)
			set(newValue) {
				handle.formats = newValue?.handler
			}

		override var presentModeCount: ULong
			get() = handle.presentModeCount.toULong()
			set(newValue) {
				handle.presentModeCount = newValue.toLong()
			}

		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = handle.presentModes?.let(::ArrayHolder)
			set(newValue) {
				handle.presentModes = newValue?.handler
			}

		override var alphaModeCount: ULong
			get() = handle.alphaModeCount.toULong()
			set(newValue) {
				handle.alphaModeCount = newValue.toLong()
			}

		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = handle.alphaModes?.let(::ArrayHolder)
			set(newValue) {
				handle.alphaModes = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue(Pointer.NULL),
	) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var usages: ULong
			get() = handle.usages.toULong()
			set(newValue) {
				handle.usages = newValue.toLong()
			}

		override var formatCount: ULong
			get() = handle.formatCount.toULong()
			set(newValue) {
				handle.formatCount = newValue.toLong()
			}

		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.formats?.let(::ArrayHolder)
			set(newValue) {
				handle.formats = newValue?.handler
			}

		override var presentModeCount: ULong
			get() = handle.presentModeCount.toULong()
			set(newValue) {
				handle.presentModeCount = newValue.toLong()
			}

		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = handle.presentModes?.let(::ArrayHolder)
			set(newValue) {
				handle.presentModes = newValue?.handler
			}

		override var alphaModeCount: ULong
			get() = handle.alphaModeCount.toULong()
			set(newValue) {
				handle.alphaModeCount = newValue.toLong()
			}

		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = handle.alphaModes?.let(::ArrayHolder)
			set(newValue) {
				handle.alphaModes = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceCapabilities = io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceCapabilities = WGPUSurfaceCapabilities.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceCapabilities) -> Unit,
		): ArrayHolder<WGPUSurfaceCapabilities> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue(allocator.allocate(64 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceCapabilities.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceConfiguration {
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

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByReference(Pointer.NULL),
	) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var device: WGPUDevice?
			get() = handle.device?.let{ WGPUDevice(it) }
			set(newValue) {
				handle.device = newValue?.handler
			}

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var usage: ULong
			get() = handle.usage.toULong()
			set(newValue) {
				handle.usage = newValue.toLong()
			}

		override var width: UInt
			get() = handle.width.toUInt()
			set(newValue) {
				handle.width = newValue.toInt()
			}

		override var height: UInt
			get() = handle.height.toUInt()
			set(newValue) {
				handle.height = newValue.toInt()
			}

		override var viewFormatCount: ULong
			get() = handle.viewFormatCount.toULong()
			set(newValue) {
				handle.viewFormatCount = newValue.toLong()
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.viewFormats?.let(::ArrayHolder)
			set(newValue) {
				handle.viewFormats = newValue?.handler
			}

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handle.alphaMode.toUInt()
			set(newValue) {
				handle.alphaMode = newValue.toInt()
			}

		override var presentMode: WGPUPresentMode
			get() = handle.presentMode.toUInt()
			set(newValue) {
				handle.presentMode = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue(Pointer.NULL),
	) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var device: WGPUDevice?
			get() = handle.device?.let{ WGPUDevice(it) }
			set(newValue) {
				handle.device = newValue?.handler
			}

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var usage: ULong
			get() = handle.usage.toULong()
			set(newValue) {
				handle.usage = newValue.toLong()
			}

		override var width: UInt
			get() = handle.width.toUInt()
			set(newValue) {
				handle.width = newValue.toInt()
			}

		override var height: UInt
			get() = handle.height.toUInt()
			set(newValue) {
				handle.height = newValue.toInt()
			}

		override var viewFormatCount: ULong
			get() = handle.viewFormatCount.toULong()
			set(newValue) {
				handle.viewFormatCount = newValue.toLong()
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.viewFormats?.let(::ArrayHolder)
			set(newValue) {
				handle.viewFormats = newValue?.handler
			}

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handle.alphaMode.toUInt()
			set(newValue) {
				handle.alphaMode = newValue.toInt()
			}

		override var presentMode: WGPUPresentMode
			get() = handle.presentMode.toUInt()
			set(newValue) {
				handle.presentMode = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceConfiguration = io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceConfiguration = WGPUSurfaceConfiguration.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceConfiguration) -> Unit,
		): ArrayHolder<WGPUSurfaceConfiguration> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue(allocator.allocate(64 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceConfiguration.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceConfiguration.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByReference(Pointer.NULL),
	) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue(Pointer.NULL),
	) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptor = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptor = WGPUSurfaceDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceDescriptor) -> Unit,
		): ArrayHolder<WGPUSurfaceDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceSourceAndroidNativeWindow {
	public actual val chain: WGPUChainedStruct

	public actual var window: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByReference(Pointer.NULL),
	) : WGPUSurfaceSourceAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var window: NativeAddress?
			get() = handle.window
			set(newValue) {
				handle.window = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByValue(Pointer.NULL),
	) : WGPUSurfaceSourceAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var window: NativeAddress?
			get() = handle.window
			set(newValue) {
				handle.window = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceAndroidNativeWindow = io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceAndroidNativeWindow = WGPUSurfaceSourceAndroidNativeWindow.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceAndroidNativeWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceAndroidNativeWindow> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceSourceAndroidNativeWindow.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceSourceAndroidNativeWindow.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceSourceMetalLayer {
	public actual val chain: WGPUChainedStruct

	public actual var layer: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByReference(Pointer.NULL),
	) : WGPUSurfaceSourceMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var layer: NativeAddress?
			get() = handle.layer
			set(newValue) {
				handle.layer = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByValue(Pointer.NULL),
	) : WGPUSurfaceSourceMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var layer: NativeAddress?
			get() = handle.layer
			set(newValue) {
				handle.layer = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceMetalLayer = io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceMetalLayer = WGPUSurfaceSourceMetalLayer.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceMetalLayer) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceMetalLayer> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceSourceMetalLayer.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceSourceMetalLayer.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceSourceWaylandSurface {
	public actual val chain: WGPUChainedStruct

	public actual var display: NativeAddress?

	public actual var surface: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByReference(Pointer.NULL),
	) : WGPUSurfaceSourceWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var display: NativeAddress?
			get() = handle.display
			set(newValue) {
				handle.display = newValue
			}

		override var surface: NativeAddress?
			get() = handle.surface
			set(newValue) {
				handle.surface = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByValue(Pointer.NULL),
	) : WGPUSurfaceSourceWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var display: NativeAddress?
			get() = handle.display
			set(newValue) {
				handle.display = newValue
			}

		override var surface: NativeAddress?
			get() = handle.surface
			set(newValue) {
				handle.surface = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWaylandSurface = io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWaylandSurface = WGPUSurfaceSourceWaylandSurface.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceWaylandSurface) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceWaylandSurface> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceSourceWaylandSurface.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceSourceWaylandSurface.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceSourceWindowsHWND {
	public actual val chain: WGPUChainedStruct

	public actual var hinstance: NativeAddress?

	public actual var hwnd: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByReference(Pointer.NULL),
	) : WGPUSurfaceSourceWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var hinstance: NativeAddress?
			get() = handle.hinstance
			set(newValue) {
				handle.hinstance = newValue
			}

		override var hwnd: NativeAddress?
			get() = handle.hwnd
			set(newValue) {
				handle.hwnd = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByValue(Pointer.NULL),
	) : WGPUSurfaceSourceWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var hinstance: NativeAddress?
			get() = handle.hinstance
			set(newValue) {
				handle.hinstance = newValue
			}

		override var hwnd: NativeAddress?
			get() = handle.hwnd
			set(newValue) {
				handle.hwnd = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWindowsHWND = io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWindowsHWND = WGPUSurfaceSourceWindowsHWND.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceWindowsHWND) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceWindowsHWND> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceSourceWindowsHWND.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceSourceWindowsHWND.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceSourceXCBWindow {
	public actual val chain: WGPUChainedStruct

	public actual var connection: NativeAddress?

	public actual var window: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByReference(Pointer.NULL),
	) : WGPUSurfaceSourceXCBWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var connection: NativeAddress?
			get() = handle.connection
			set(newValue) {
				handle.connection = newValue
			}

		override var window: UInt
			get() = handle.window.toUInt()
			set(newValue) {
				handle.window = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByValue(Pointer.NULL),
	) : WGPUSurfaceSourceXCBWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var connection: NativeAddress?
			get() = handle.connection
			set(newValue) {
				handle.connection = newValue
			}

		override var window: UInt
			get() = handle.window.toUInt()
			set(newValue) {
				handle.window = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXCBWindow = io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXCBWindow = WGPUSurfaceSourceXCBWindow.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceXCBWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceXCBWindow> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceSourceXCBWindow.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceSourceXCBWindow.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceSourceXlibWindow {
	public actual val chain: WGPUChainedStruct

	public actual var display: NativeAddress?

	public actual var window: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByReference(Pointer.NULL),
	) : WGPUSurfaceSourceXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var display: NativeAddress?
			get() = handle.display
			set(newValue) {
				handle.display = newValue
			}

		override var window: ULong
			get() = handle.window.toULong()
			set(newValue) {
				handle.window = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByValue(Pointer.NULL),
	) : WGPUSurfaceSourceXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var display: NativeAddress?
			get() = handle.display
			set(newValue) {
				handle.display = newValue
			}

		override var window: ULong
			get() = handle.window.toULong()
			set(newValue) {
				handle.window = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXlibWindow = io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXlibWindow = WGPUSurfaceSourceXlibWindow.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceXlibWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceXlibWindow> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceSourceXlibWindow.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceSourceXlibWindow.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUSurfaceTexture {
	public actual var nextInChain: NativeAddress?

	public actual var texture: WGPUTexture?

	public actual var status: WGPUSurfaceGetCurrentTextureStatus

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByReference(Pointer.NULL),
	) : WGPUSurfaceTexture {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var texture: WGPUTexture?
			get() = handle.texture?.let{ WGPUTexture(it) }
			set(newValue) {
				handle.texture = newValue?.handler
			}

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handle.status.toUInt()
			set(newValue) {
				handle.status = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue(Pointer.NULL),
	) : WGPUSurfaceTexture {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override var texture: WGPUTexture?
			get() = handle.texture?.let{ WGPUTexture(it) }
			set(newValue) {
				handle.texture = newValue?.handler
			}

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handle.status.toUInt()
			set(newValue) {
				handle.status = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceTexture = io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceTexture = WGPUSurfaceTexture.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceTexture) -> Unit,
		): ArrayHolder<WGPUSurfaceTexture> {
			val array = io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUSurfaceTexture.ByValue)
					.also { provider(index.toUInt(), WGPUSurfaceTexture.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUTexelCopyBufferLayout {
	public actual var offset: ULong

	public actual var bytesPerRow: UInt

	public actual var rowsPerImage: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByReference = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByReference(Pointer.NULL),
	) : WGPUTexelCopyBufferLayout {
		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) {
				handle.offset = newValue.toLong()
			}

		override var bytesPerRow: UInt
			get() = handle.bytesPerRow.toUInt()
			set(newValue) {
				handle.bytesPerRow = newValue.toInt()
			}

		override var rowsPerImage: UInt
			get() = handle.rowsPerImage.toUInt()
			set(newValue) {
				handle.rowsPerImage = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByValue = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByValue(Pointer.NULL),
	) : WGPUTexelCopyBufferLayout {
		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) {
				handle.offset = newValue.toLong()
			}

		override var bytesPerRow: UInt
			get() = handle.bytesPerRow.toUInt()
			set(newValue) {
				handle.bytesPerRow = newValue.toInt()
			}

		override var rowsPerImage: UInt
			get() = handle.rowsPerImage.toUInt()
			set(newValue) {
				handle.rowsPerImage = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferLayout = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferLayout = WGPUTexelCopyBufferLayout.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyBufferLayout) -> Unit,
		): ArrayHolder<WGPUTexelCopyBufferLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByValue)
					.also { provider(index.toUInt(), WGPUTexelCopyBufferLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUTexelCopyBufferInfo {
	public actual val layout: WGPUTexelCopyBufferLayout

	public actual var buffer: WGPUBuffer?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByReference = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByReference(Pointer.NULL),
	) : WGPUTexelCopyBufferInfo {
		override val layout: WGPUTexelCopyBufferLayout
			get() = handle.layout.let{ WGPUTexelCopyBufferLayout.ByValue(it) }

		override var buffer: WGPUBuffer?
			get() = handle.buffer?.let{ WGPUBuffer(it) }
			set(newValue) {
				handle.buffer = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByValue = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByValue(Pointer.NULL),
	) : WGPUTexelCopyBufferInfo {
		override val layout: WGPUTexelCopyBufferLayout
			get() = handle.layout.let{ WGPUTexelCopyBufferLayout.ByValue(it) }

		override var buffer: WGPUBuffer?
			get() = handle.buffer?.let{ WGPUBuffer(it) }
			set(newValue) {
				handle.buffer = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferInfo = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferInfo = WGPUTexelCopyBufferInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyBufferInfo) -> Unit,
		): ArrayHolder<WGPUTexelCopyBufferInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByValue)
					.also { provider(index.toUInt(), WGPUTexelCopyBufferInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUTexelCopyTextureInfo {
	public actual var texture: WGPUTexture?

	public actual var mipLevel: UInt

	public actual val origin: WGPUOrigin3D

	public actual var aspect: WGPUTextureAspect

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByReference = io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByReference(Pointer.NULL),
	) : WGPUTexelCopyTextureInfo {
		override var texture: WGPUTexture?
			get() = handle.texture?.let{ WGPUTexture(it) }
			set(newValue) {
				handle.texture = newValue?.handler
			}

		override var mipLevel: UInt
			get() = handle.mipLevel.toUInt()
			set(newValue) {
				handle.mipLevel = newValue.toInt()
			}

		override val origin: WGPUOrigin3D
			get() = handle.origin.let{ WGPUOrigin3D.ByValue(it) }

		override var aspect: WGPUTextureAspect
			get() = handle.aspect.toUInt()
			set(newValue) {
				handle.aspect = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByValue = io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByValue(Pointer.NULL),
	) : WGPUTexelCopyTextureInfo {
		override var texture: WGPUTexture?
			get() = handle.texture?.let{ WGPUTexture(it) }
			set(newValue) {
				handle.texture = newValue?.handler
			}

		override var mipLevel: UInt
			get() = handle.mipLevel.toUInt()
			set(newValue) {
				handle.mipLevel = newValue.toInt()
			}

		override val origin: WGPUOrigin3D
			get() = handle.origin.let{ WGPUOrigin3D.ByValue(it) }

		override var aspect: WGPUTextureAspect
			get() = handle.aspect.toUInt()
			set(newValue) {
				handle.aspect = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTexelCopyTextureInfo = io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyTextureInfo = WGPUTexelCopyTextureInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyTextureInfo) -> Unit,
		): ArrayHolder<WGPUTexelCopyTextureInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByValue)
					.also { provider(index.toUInt(), WGPUTexelCopyTextureInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUTextureDescriptor {
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

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByReference(Pointer.NULL),
	) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var usage: ULong
			get() = handle.usage.toULong()
			set(newValue) {
				handle.usage = newValue.toLong()
			}

		override var dimension: WGPUTextureDimension
			get() = handle.dimension.toUInt()
			set(newValue) {
				handle.dimension = newValue.toInt()
			}

		override val size: WGPUExtent3D
			get() = handle.size.let{ WGPUExtent3D.ByValue(it) }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var mipLevelCount: UInt
			get() = handle.mipLevelCount.toUInt()
			set(newValue) {
				handle.mipLevelCount = newValue.toInt()
			}

		override var sampleCount: UInt
			get() = handle.sampleCount.toUInt()
			set(newValue) {
				handle.sampleCount = newValue.toInt()
			}

		override var viewFormatCount: ULong
			get() = handle.viewFormatCount.toULong()
			set(newValue) {
				handle.viewFormatCount = newValue.toLong()
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.viewFormats?.let(::ArrayHolder)
			set(newValue) {
				handle.viewFormats = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue(Pointer.NULL),
	) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var usage: ULong
			get() = handle.usage.toULong()
			set(newValue) {
				handle.usage = newValue.toLong()
			}

		override var dimension: WGPUTextureDimension
			get() = handle.dimension.toUInt()
			set(newValue) {
				handle.dimension = newValue.toInt()
			}

		override val size: WGPUExtent3D
			get() = handle.size.let{ WGPUExtent3D.ByValue(it) }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var mipLevelCount: UInt
			get() = handle.mipLevelCount.toUInt()
			set(newValue) {
				handle.mipLevelCount = newValue.toInt()
			}

		override var sampleCount: UInt
			get() = handle.sampleCount.toUInt()
			set(newValue) {
				handle.sampleCount = newValue.toInt()
			}

		override var viewFormatCount: ULong
			get() = handle.viewFormatCount.toULong()
			set(newValue) {
				handle.viewFormatCount = newValue.toLong()
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.viewFormats?.let(::ArrayHolder)
			set(newValue) {
				handle.viewFormats = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTextureDescriptor = io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTextureDescriptor = WGPUTextureDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureDescriptor) -> Unit,
		): ArrayHolder<WGPUTextureDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue(allocator.allocate(80 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUTextureDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUTextureViewDescriptor {
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

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByReference(Pointer.NULL),
	) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var dimension: WGPUTextureViewDimension
			get() = handle.dimension.toUInt()
			set(newValue) {
				handle.dimension = newValue.toInt()
			}

		override var baseMipLevel: UInt
			get() = handle.baseMipLevel.toUInt()
			set(newValue) {
				handle.baseMipLevel = newValue.toInt()
			}

		override var mipLevelCount: UInt
			get() = handle.mipLevelCount.toUInt()
			set(newValue) {
				handle.mipLevelCount = newValue.toInt()
			}

		override var baseArrayLayer: UInt
			get() = handle.baseArrayLayer.toUInt()
			set(newValue) {
				handle.baseArrayLayer = newValue.toInt()
			}

		override var arrayLayerCount: UInt
			get() = handle.arrayLayerCount.toUInt()
			set(newValue) {
				handle.arrayLayerCount = newValue.toInt()
			}

		override var aspect: WGPUTextureAspect
			get() = handle.aspect.toUInt()
			set(newValue) {
				handle.aspect = newValue.toInt()
			}

		override var usage: ULong
			get() = handle.usage.toULong()
			set(newValue) {
				handle.usage = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue(Pointer.NULL),
	) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.nextInChain
			set(newValue) {
				handle.nextInChain = newValue
			}

		override val label: WGPUStringView
			get() = handle.label.let{ WGPUStringView.ByValue(it) }

		override var format: WGPUTextureFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var dimension: WGPUTextureViewDimension
			get() = handle.dimension.toUInt()
			set(newValue) {
				handle.dimension = newValue.toInt()
			}

		override var baseMipLevel: UInt
			get() = handle.baseMipLevel.toUInt()
			set(newValue) {
				handle.baseMipLevel = newValue.toInt()
			}

		override var mipLevelCount: UInt
			get() = handle.mipLevelCount.toUInt()
			set(newValue) {
				handle.mipLevelCount = newValue.toInt()
			}

		override var baseArrayLayer: UInt
			get() = handle.baseArrayLayer.toUInt()
			set(newValue) {
				handle.baseArrayLayer = newValue.toInt()
			}

		override var arrayLayerCount: UInt
			get() = handle.arrayLayerCount.toUInt()
			set(newValue) {
				handle.arrayLayerCount = newValue.toInt()
			}

		override var aspect: WGPUTextureAspect
			get() = handle.aspect.toUInt()
			set(newValue) {
				handle.aspect = newValue.toInt()
			}

		override var usage: ULong
			get() = handle.usage.toULong()
			set(newValue) {
				handle.usage = newValue.toLong()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTextureViewDescriptor = io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTextureViewDescriptor = WGPUTextureViewDescriptor.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureViewDescriptor) -> Unit,
		): ArrayHolder<WGPUTextureViewDescriptor> {
			val array = io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue(allocator.allocate(64 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue)
					.also { provider(index.toUInt(), WGPUTextureViewDescriptor.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUVertexAttribute {
	public actual var format: WGPUVertexFormat

	public actual var offset: ULong

	public actual var shaderLocation: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByReference = io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByReference(Pointer.NULL),
	) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) {
				handle.offset = newValue.toLong()
			}

		override var shaderLocation: UInt
			get() = handle.shaderLocation.toUInt()
			set(newValue) {
				handle.shaderLocation = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue = io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue(Pointer.NULL),
	) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = handle.format.toUInt()
			set(newValue) {
				handle.format = newValue.toInt()
			}

		override var offset: ULong
			get() = handle.offset.toULong()
			set(newValue) {
				handle.offset = newValue.toLong()
			}

		override var shaderLocation: UInt
			get() = handle.shaderLocation.toUInt()
			set(newValue) {
				handle.shaderLocation = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUVertexAttribute = io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUVertexAttribute = WGPUVertexAttribute.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexAttribute) -> Unit,
		): ArrayHolder<WGPUVertexAttribute> {
			val array = io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue(allocator.allocate(24 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByValue)
					.also { provider(index.toUInt(), WGPUVertexAttribute.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUVertexBufferLayout {
	public actual var stepMode: WGPUVertexStepMode

	public actual var arrayStride: ULong

	public actual var attributeCount: ULong

	public actual var attributes: ArrayHolder<WGPUVertexAttribute>?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByReference = io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByReference(Pointer.NULL),
	) : WGPUVertexBufferLayout {
		override var stepMode: WGPUVertexStepMode
			get() = handle.stepMode.toUInt()
			set(newValue) {
				handle.stepMode = newValue.toInt()
			}

		override var arrayStride: ULong
			get() = handle.arrayStride.toULong()
			set(newValue) {
				handle.arrayStride = newValue.toLong()
			}

		override var attributeCount: ULong
			get() = handle.attributeCount.toULong()
			set(newValue) {
				handle.attributeCount = newValue.toLong()
			}

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = handle.attributes?.let(::ArrayHolder)
			set(newValue) {
				handle.attributes = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue = io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue(Pointer.NULL),
	) : WGPUVertexBufferLayout {
		override var stepMode: WGPUVertexStepMode
			get() = handle.stepMode.toUInt()
			set(newValue) {
				handle.stepMode = newValue.toInt()
			}

		override var arrayStride: ULong
			get() = handle.arrayStride.toULong()
			set(newValue) {
				handle.arrayStride = newValue.toLong()
			}

		override var attributeCount: ULong
			get() = handle.attributeCount.toULong()
			set(newValue) {
				handle.attributeCount = newValue.toLong()
			}

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = handle.attributes?.let(::ArrayHolder)
			set(newValue) {
				handle.attributes = newValue?.handler
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUVertexBufferLayout = io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUVertexBufferLayout = WGPUVertexBufferLayout.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexBufferLayout) -> Unit,
		): ArrayHolder<WGPUVertexBufferLayout> {
			val array = io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue(allocator.allocate(32 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUVertexBufferLayout.ByValue)
					.also { provider(index.toUInt(), WGPUVertexBufferLayout.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUInstanceExtras {
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

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByReference = io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByReference(Pointer.NULL),
	) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var backends: ULong
			get() = handle.backends.toULong()
			set(newValue) {
				handle.backends = newValue.toLong()
			}

		override var flags: ULong
			get() = handle.flags.toULong()
			set(newValue) {
				handle.flags = newValue.toLong()
			}

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handle.dx12ShaderCompiler.toUInt()
			set(newValue) {
				handle.dx12ShaderCompiler = newValue.toInt()
			}

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handle.gles3MinorVersion.toUInt()
			set(newValue) {
				handle.gles3MinorVersion = newValue.toInt()
			}

		override var glFenceBehaviour: WGPUGLFenceBehaviour
			get() = handle.glFenceBehaviour.toUInt()
			set(newValue) {
				handle.glFenceBehaviour = newValue.toInt()
			}

		override val dxcPath: WGPUStringView
			get() = handle.dxcPath.let{ WGPUStringView.ByValue(it) }

		override var dxcMaxShaderModel: WGPUDxcMaxShaderModel
			get() = handle.dxcMaxShaderModel.toUInt()
			set(newValue) {
				handle.dxcMaxShaderModel = newValue.toInt()
			}

		override var budgetForDeviceCreation: NativeAddress?
			get() = handle.budgetForDeviceCreation
			set(newValue) {
				handle.budgetForDeviceCreation = newValue
			}

		override var budgetForDeviceLoss: NativeAddress?
			get() = handle.budgetForDeviceLoss
			set(newValue) {
				handle.budgetForDeviceLoss = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue = io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue(Pointer.NULL),
	) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handle.chain.let{ WGPUChainedStruct.ByValue(it) }

		override var backends: ULong
			get() = handle.backends.toULong()
			set(newValue) {
				handle.backends = newValue.toLong()
			}

		override var flags: ULong
			get() = handle.flags.toULong()
			set(newValue) {
				handle.flags = newValue.toLong()
			}

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handle.dx12ShaderCompiler.toUInt()
			set(newValue) {
				handle.dx12ShaderCompiler = newValue.toInt()
			}

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handle.gles3MinorVersion.toUInt()
			set(newValue) {
				handle.gles3MinorVersion = newValue.toInt()
			}

		override var glFenceBehaviour: WGPUGLFenceBehaviour
			get() = handle.glFenceBehaviour.toUInt()
			set(newValue) {
				handle.glFenceBehaviour = newValue.toInt()
			}

		override val dxcPath: WGPUStringView
			get() = handle.dxcPath.let{ WGPUStringView.ByValue(it) }

		override var dxcMaxShaderModel: WGPUDxcMaxShaderModel
			get() = handle.dxcMaxShaderModel.toUInt()
			set(newValue) {
				handle.dxcMaxShaderModel = newValue.toInt()
			}

		override var budgetForDeviceCreation: NativeAddress?
			get() = handle.budgetForDeviceCreation
			set(newValue) {
				handle.budgetForDeviceCreation = newValue
			}

		override var budgetForDeviceLoss: NativeAddress?
			get() = handle.budgetForDeviceLoss
			set(newValue) {
				handle.budgetForDeviceLoss = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUInstanceExtras = io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUInstanceExtras = WGPUInstanceExtras.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceExtras) -> Unit,
		): ArrayHolder<WGPUInstanceExtras> {
			val array = io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue(allocator.allocate(88 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUInstanceExtras.ByValue)
					.also { provider(index.toUInt(), WGPUInstanceExtras.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUChainedStructOut {
	public actual var next: WGPUChainedStructOut?

	public actual var sType: WGPUSType

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByReference = io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByReference(Pointer.NULL),
	) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = handle.next?.let{ WGPUChainedStructOut.ByReference(it) }
			set(newValue) {
				handle.next = (newValue as? WGPUChainedStructOut.ByReference)?.handle
			}

		override var sType: WGPUSType
			get() = handle.sType.toUInt()
			set(newValue) {
				handle.sType = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue = io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue(Pointer.NULL),
	) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = handle.next?.let{ WGPUChainedStructOut.ByReference(it) }
			set(newValue) {
				handle.next = (newValue as? WGPUChainedStructOut.ByReference)?.handle
			}

		override var sType: WGPUSType
			get() = handle.sType.toUInt()
			set(newValue) {
				handle.sType = newValue.toInt()
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUChainedStructOut = io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUChainedStructOut = WGPUChainedStructOut.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUChainedStructOut) -> Unit,
		): ArrayHolder<WGPUChainedStructOut> {
			val array = io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue(allocator.allocate(16 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUChainedStructOut.ByValue)
					.also { provider(index.toUInt(), WGPUChainedStructOut.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUBufferMapCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUBufferMapCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByReference(Pointer.NULL),
	) : WGPUBufferMapCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUBufferMapCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByValue(Pointer.NULL),
	) : WGPUBufferMapCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUBufferMapCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBufferMapCallbackInfo = io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBufferMapCallbackInfo = WGPUBufferMapCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferMapCallbackInfo) -> Unit,
		): ArrayHolder<WGPUBufferMapCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUBufferMapCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPUBufferMapCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUCompilationInfoCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUCompilationInfoCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByReference(Pointer.NULL),
	) : WGPUCompilationInfoCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUCompilationInfoCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByValue(Pointer.NULL),
	) : WGPUCompilationInfoCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUCompilationInfoCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCompilationInfoCallbackInfo = io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfoCallbackInfo = WGPUCompilationInfoCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationInfoCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCompilationInfoCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCompilationInfoCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPUCompilationInfoCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUCreateComputePipelineAsyncCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByReference(Pointer.NULL),
	) : WGPUCreateComputePipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByValue(Pointer.NULL),
	) : WGPUCreateComputePipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCreateComputePipelineAsyncCallbackInfo = io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCreateComputePipelineAsyncCallbackInfo = WGPUCreateComputePipelineAsyncCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCreateComputePipelineAsyncCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCreateComputePipelineAsyncCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCreateComputePipelineAsyncCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPUCreateComputePipelineAsyncCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUCreateRenderPipelineAsyncCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByReference(Pointer.NULL),
	) : WGPUCreateRenderPipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByValue(Pointer.NULL),
	) : WGPUCreateRenderPipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCreateRenderPipelineAsyncCallbackInfo = io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCreateRenderPipelineAsyncCallbackInfo = WGPUCreateRenderPipelineAsyncCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCreateRenderPipelineAsyncCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCreateRenderPipelineAsyncCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUCreateRenderPipelineAsyncCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPUCreateRenderPipelineAsyncCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUPopErrorScopeCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUPopErrorScopeCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByReference(Pointer.NULL),
	) : WGPUPopErrorScopeCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUPopErrorScopeCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByValue(Pointer.NULL),
	) : WGPUPopErrorScopeCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUPopErrorScopeCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUPopErrorScopeCallbackInfo = io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUPopErrorScopeCallbackInfo = WGPUPopErrorScopeCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPopErrorScopeCallbackInfo) -> Unit,
		): ArrayHolder<WGPUPopErrorScopeCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPUPopErrorScopeCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPUQueueWorkDoneCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByReference(Pointer.NULL),
	) : WGPUQueueWorkDoneCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByValue(Pointer.NULL),
	) : WGPUQueueWorkDoneCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUQueueWorkDoneCallbackInfo = io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPUQueueWorkDoneCallbackInfo = WGPUQueueWorkDoneCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQueueWorkDoneCallbackInfo) -> Unit,
		): ArrayHolder<WGPUQueueWorkDoneCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPUQueueWorkDoneCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPUQueueWorkDoneCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURequestAdapterCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPURequestAdapterCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByReference(Pointer.NULL),
	) : WGPURequestAdapterCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPURequestAdapterCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByValue(Pointer.NULL),
	) : WGPURequestAdapterCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPURequestAdapterCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURequestAdapterCallbackInfo = io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterCallbackInfo = WGPURequestAdapterCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestAdapterCallbackInfo) -> Unit,
		): ArrayHolder<WGPURequestAdapterCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURequestAdapterCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPURequestAdapterCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}

public actual interface WGPURequestDeviceCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPURequestDeviceCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByValue = (this as ByReference).let{ io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByValue(handle) }

	public fun toReference(): io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByReference = (this as ByReference).handle

	public class ByReference(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByReference(Pointer.NULL),
	) : WGPURequestDeviceCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPURequestDeviceCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public class ByValue(
		public val handle:
				io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByValue(Pointer.NULL),
	) : WGPURequestDeviceCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.nextInChain?.let{ WGPUChainedStruct.ByReference(it) }
			set(newValue) {
				handle.nextInChain = (newValue as? WGPUChainedStruct.ByReference)?.handle
			}

		override var mode: WGPUCallbackMode
			get() = handle.mode.toUInt()
			set(newValue) {
				handle.mode = newValue.toInt()
			}

		override var callback: CallbackHolder<WGPURequestDeviceCallback>?
			get() = handle.callback?.let{ CallbackHolder(com.sun.jna.Pointer(0), it) }
			set(newValue) {
				handle.callback = newValue?.callback
			}

		override var userdata1: NativeAddress?
			get() = handle.userdata1
			set(newValue) {
				handle.userdata1 = newValue
			}

		override var userdata2: NativeAddress?
			get() = handle.userdata2
			set(newValue) {
				handle.userdata2 = newValue
			}

		override val handler: NativeAddress
			get() {
				handle.write()
				return handle.getPointer()
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURequestDeviceCallbackInfo = io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByReference(address)
			.also { it.read() }
			.let(::ByReference)

		public actual fun allocate(allocator: MemoryAllocator): WGPURequestDeviceCallbackInfo = WGPURequestDeviceCallbackInfo.ByReference()
			.also { allocator.register(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestDeviceCallbackInfo) -> Unit,
		): ArrayHolder<WGPURequestDeviceCallbackInfo> {
			val array = io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByValue(allocator.allocate(40 * size.toLong())).toArray(size.toInt())
			array.forEachIndexed { index, structure ->
				(structure as io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByValue)
					.also { provider(index.toUInt(), WGPURequestDeviceCallbackInfo.ByValue(it)) }
					.write()
			}
			val pointer = if (size == 0u) Pointer.NULL else array.first().pointer
			return ArrayHolder(pointer)
		}
	}
}
