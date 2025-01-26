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

actual interface WGPUStringView {
	value class ByValue(val handle: CValue<webgpu.native.WGPUStringView>) : WGPUStringView {
		override var data: CString?
			get() = handle.useContents { data?.toCString() }
			set(newValue) { handle.useContents { data = newValue?.handler?.reinterpret() } } 

		override var length: ULong
			get() = handle.useContents { length ?: error("pointer of WGPUStringView is null") }
			set(newValue) { handle.useContents { length = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUStringView {
		override var data: CString?
			get() = handler.reinterpret<webgpu.native.WGPUStringView>().pointed.data?.toCString()
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStringView>().pointed.let { it.data = newValue?.handler?.reinterpret() } } 

		override var length: ULong
			get() = handler.reinterpret<webgpu.native.WGPUStringView>().pointed.length ?: error("pointer of WGPUStringView is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUStringView>().pointed.let { it.length = newValue } } 

	}

	actual var data: CString?
	actual var length: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUStringView {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUStringView {
			return allocator.allocate(sizeOf<webgpu.native.WGPUStringView>())
				.let { WGPUStringView(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUStringView) -> Unit): ArrayHolder<WGPUStringView> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUStringView>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUStringView>())
							.let(::NativeAddress)
							.let { WGPUStringView(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUStringView> {
		return cValue<webgpu.native.WGPUStringView> {
			data = this@WGPUStringView.data?.handler?.reinterpret()
			length = this@WGPUStringView.length
		}
	}
}

fun webgpu.native.WGPUStringView.adapt(structure: WGPUStringView) {
	data = structure.data?.handler?.reinterpret()
	length = structure.length
}

actual interface WGPUAdapterInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUAdapterInfo>) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val vendor: WGPUStringView
			get() = handle.useContents { vendor.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val architecture: WGPUStringView
			get() = handle.useContents { architecture.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val device: WGPUStringView
			get() = handle.useContents { device.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val description: WGPUStringView
			get() = handle.useContents { description.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val vendor: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.vendor.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override val architecture: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.architecture.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override val device: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.device.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override val description: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.description.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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
	actual val vendor: WGPUStringView
	actual val architecture: WGPUStringView
	actual val device: WGPUStringView
	actual val description: WGPUStringView
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
			vendor.adapt(this@WGPUAdapterInfo.vendor)
			architecture.adapt(this@WGPUAdapterInfo.architecture)
			device.adapt(this@WGPUAdapterInfo.device)
			description.adapt(this@WGPUAdapterInfo.description)
			nextInChain = this@WGPUAdapterInfo.nextInChain?.reinterpret()
			backendType = this@WGPUAdapterInfo.backendType
			adapterType = this@WGPUAdapterInfo.adapterType
			vendorID = this@WGPUAdapterInfo.vendorID
			deviceID = this@WGPUAdapterInfo.deviceID
		}
	}
}

fun webgpu.native.WGPUAdapterInfo.adapt(structure: WGPUAdapterInfo) {
	vendor.adapt(structure.vendor)
	architecture.adapt(structure.architecture)
	device.adapt(structure.device)
	description.adapt(structure.description)
	nextInChain = structure.nextInChain?.reinterpret()
	backendType = structure.backendType
	adapterType = structure.adapterType
	vendorID = structure.vendorID
	deviceID = structure.deviceID
}

actual interface WGPUBindGroupDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBindGroupDescriptor>) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUBindGroupDescriptor.label)
			nextInChain = this@WGPUBindGroupDescriptor.nextInChain?.reinterpret()
			layout = this@WGPUBindGroupDescriptor.layout?.handler?.reinterpret()
			entryCount = this@WGPUBindGroupDescriptor.entryCount
			entries = this@WGPUBindGroupDescriptor.entries?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUBindGroupDescriptor.adapt(structure: WGPUBindGroupDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
	entryCount = structure.entryCount
	entries = structure.entries?.handler?.reinterpret()
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

actual interface WGPUBindGroupLayoutDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBindGroupLayoutDescriptor>) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var entryCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.entryCount ?: error("pointer of WGPUBindGroupLayoutDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.let { it.entryCount = newValue } } 

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.entries?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayoutEntry>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.let { it.entries = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUBindGroupLayoutDescriptor.label)
			nextInChain = this@WGPUBindGroupLayoutDescriptor.nextInChain?.reinterpret()
			entryCount = this@WGPUBindGroupLayoutDescriptor.entryCount
			entries = this@WGPUBindGroupLayoutDescriptor.entries?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUBindGroupLayoutDescriptor.adapt(structure: WGPUBindGroupLayoutDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
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

		override var visibility: ULong
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

		override var visibility: ULong
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
	actual var visibility: ULong
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

actual interface WGPUBufferDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBufferDescriptor>) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var usage: ULong
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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var usage: ULong
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
	actual val label: WGPUStringView
	actual var usage: ULong
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
			label.adapt(this@WGPUBufferDescriptor.label)
			nextInChain = this@WGPUBufferDescriptor.nextInChain?.reinterpret()
			usage = this@WGPUBufferDescriptor.usage
			size = this@WGPUBufferDescriptor.size
			mappedAtCreation = this@WGPUBufferDescriptor.mappedAtCreation.toUInt()
		}
	}
}

fun webgpu.native.WGPUBufferDescriptor.adapt(structure: WGPUBufferDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
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

		override var writeMask: ULong
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

		override var writeMask: ULong
			get() = handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.writeMask ?: error("pointer of WGPUColorTargetState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.let { it.writeMask = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var format: WGPUTextureFormat
	actual var blend: WGPUBlendState?
	actual var writeMask: ULong
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

actual interface WGPUCommandBufferDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUCommandBufferDescriptor>) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUCommandBufferDescriptor.label)
			nextInChain = this@WGPUCommandBufferDescriptor.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUCommandBufferDescriptor.adapt(structure: WGPUCommandBufferDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

actual interface WGPUCommandEncoderDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUCommandEncoderDescriptor>) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUCommandEncoderDescriptor.label)
			nextInChain = this@WGPUCommandEncoderDescriptor.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUCommandEncoderDescriptor.adapt(structure: WGPUCommandEncoderDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
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

		override val message: WGPUStringView
			get() = handle.useContents { message.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val message: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.message.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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

	}

	actual var nextInChain: NativeAddress?
	actual val message: WGPUStringView
	actual var type: WGPUCompilationMessageType
	actual var lineNum: ULong
	actual var linePos: ULong
	actual var offset: ULong
	actual var length: ULong
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
			message.adapt(this@WGPUCompilationMessage.message)
			nextInChain = this@WGPUCompilationMessage.nextInChain?.reinterpret()
			type = this@WGPUCompilationMessage.type
			lineNum = this@WGPUCompilationMessage.lineNum
			linePos = this@WGPUCompilationMessage.linePos
			offset = this@WGPUCompilationMessage.offset
			length = this@WGPUCompilationMessage.length
		}
	}
}

fun webgpu.native.WGPUCompilationMessage.adapt(structure: WGPUCompilationMessage) {
	message.adapt(structure.message)
	nextInChain = structure.nextInChain?.reinterpret()
	type = structure.type
	lineNum = structure.lineNum
	linePos = structure.linePos
	offset = structure.offset
	length = structure.length
}

actual interface WGPUComputePassDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUComputePassDescriptor>) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.timestampWrites?.let(::NativeAddress)?.let { WGPUComputePassTimestampWrites(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.let { it.timestampWrites = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUComputePassDescriptor.label)
			nextInChain = this@WGPUComputePassDescriptor.nextInChain?.reinterpret()
			timestampWrites = this@WGPUComputePassDescriptor.timestampWrites?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUComputePassDescriptor.adapt(structure: WGPUComputePassDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
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

		override val entryPoint: WGPUStringView
			get() = handle.useContents { entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val entryPoint: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var constantCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.constantCount ?: error("pointer of WGPUProgrammableStageDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.constantCount = newValue } } 

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.constants = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var module: WGPUShaderModule?
	actual val entryPoint: WGPUStringView
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
			entryPoint.adapt(this@WGPUProgrammableStageDescriptor.entryPoint)
			nextInChain = this@WGPUProgrammableStageDescriptor.nextInChain?.reinterpret()
			module = this@WGPUProgrammableStageDescriptor.module?.handler?.reinterpret()
			constantCount = this@WGPUProgrammableStageDescriptor.constantCount
			constants = this@WGPUProgrammableStageDescriptor.constants?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUProgrammableStageDescriptor.adapt(structure: WGPUProgrammableStageDescriptor) {
	entryPoint.adapt(structure.entryPoint)
	nextInChain = structure.nextInChain?.reinterpret()
	module = structure.module?.handler?.reinterpret()
	constantCount = structure.constantCount
	constants = structure.constants?.handler?.reinterpret()
}

actual interface WGPUComputePipelineDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUComputePipelineDescriptor>) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var layout: WGPUPipelineLayout?
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.let { it.layout = newValue?.handler?.reinterpret() } } 

		override val compute: WGPUProgrammableStageDescriptor
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.compute.rawPtr.toLong().let(::NativeAddress).let { WGPUProgrammableStageDescriptor(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUComputePipelineDescriptor.label)
			compute.adapt(this@WGPUComputePipelineDescriptor.compute)
			nextInChain = this@WGPUComputePipelineDescriptor.nextInChain?.reinterpret()
			layout = this@WGPUComputePipelineDescriptor.layout?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUComputePipelineDescriptor.adapt(structure: WGPUComputePipelineDescriptor) {
	label.adapt(structure.label)
	compute.adapt(structure.compute)
	nextInChain = structure.nextInChain?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
}

actual interface WGPUConstantEntry {
	value class ByValue(val handle: CValue<webgpu.native.WGPUConstantEntry>) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val key: WGPUStringView
			get() = handle.useContents { key.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val key: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.key.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var value: Double
			get() = handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.value ?: error("pointer of WGPUConstantEntry is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.let { it.value = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual val key: WGPUStringView
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
			key.adapt(this@WGPUConstantEntry.key)
			nextInChain = this@WGPUConstantEntry.nextInChain?.reinterpret()
			value = this@WGPUConstantEntry.value
		}
	}
}

fun webgpu.native.WGPUConstantEntry.adapt(structure: WGPUConstantEntry) {
	key.adapt(structure.key)
	nextInChain = structure.nextInChain?.reinterpret()
	value = structure.value
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

		override var depthWriteEnabled: WGPUOptionalBool
			get() = handle.useContents { depthWriteEnabled ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) { handle.useContents { depthWriteEnabled = newValue } } 

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

		override var depthWriteEnabled: WGPUOptionalBool
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthWriteEnabled ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthWriteEnabled = newValue } } 

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
	actual var depthWriteEnabled: WGPUOptionalBool
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
			depthWriteEnabled = this@WGPUDepthStencilState.depthWriteEnabled
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
	depthWriteEnabled = structure.depthWriteEnabled
	depthCompare = structure.depthCompare
	stencilReadMask = structure.stencilReadMask
	stencilWriteMask = structure.stencilWriteMask
	depthBias = structure.depthBias
	depthBiasSlopeScale = structure.depthBiasSlopeScale
	depthBiasClamp = structure.depthBiasClamp
}

actual interface WGPUQueueDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUQueueDescriptor>) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUQueueDescriptor.label)
			nextInChain = this@WGPUQueueDescriptor.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUQueueDescriptor.adapt(structure: WGPUQueueDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

actual interface WGPUDeviceLostCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUDeviceLostCallbackInfo>) : WGPUDeviceLostCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUDeviceLostCallbackInfo is null") }
			set(newValue) { handle.useContents { mode = newValue } } 

		override var callback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUDeviceLostCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUDeviceLostCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.mode ?: error("pointer of WGPUDeviceLostCallbackInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.mode = newValue } } 

		override var callback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUDeviceLostCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var mode: WGPUCallbackMode
	actual var callback: CallbackHolder<WGPUDeviceLostCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUDeviceLostCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUDeviceLostCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUDeviceLostCallbackInfo>())
				.let { WGPUDeviceLostCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUDeviceLostCallbackInfo) -> Unit): ArrayHolder<WGPUDeviceLostCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUDeviceLostCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUDeviceLostCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPUDeviceLostCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUDeviceLostCallbackInfo> {
		return cValue<webgpu.native.WGPUDeviceLostCallbackInfo> {
			nextInChain = this@WGPUDeviceLostCallbackInfo.nextInChain?.handler?.reinterpret()
			mode = this@WGPUDeviceLostCallbackInfo.mode
			callback = this@WGPUDeviceLostCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPUDeviceLostCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPUDeviceLostCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUDeviceLostCallbackInfo.adapt(structure: WGPUDeviceLostCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

actual interface WGPUUncapturedErrorCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUUncapturedErrorCallbackInfo>) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var callback: CallbackHolder<WGPUUncapturedErrorCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUUncapturedErrorCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var callback: CallbackHolder<WGPUUncapturedErrorCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUUncapturedErrorCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var callback: CallbackHolder<WGPUUncapturedErrorCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
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
			nextInChain = this@WGPUUncapturedErrorCallbackInfo.nextInChain?.handler?.reinterpret()
			callback = this@WGPUUncapturedErrorCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPUUncapturedErrorCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPUUncapturedErrorCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUUncapturedErrorCallbackInfo.adapt(structure: WGPUUncapturedErrorCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

actual interface WGPUDeviceDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUDeviceDescriptor>) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var requiredFeatureCount: ULong
			get() = handle.useContents { requiredFeatureCount ?: error("pointer of WGPUDeviceDescriptor is null") }
			set(newValue) { handle.useContents { requiredFeatureCount = newValue } } 

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handle.useContents { requiredFeatures?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) } }
			set(newValue) { handle.useContents { requiredFeatures = newValue?.handler?.reinterpret() } } 

		override var requiredLimits: WGPULimits?
			get() = handle.useContents { requiredLimits?.let(::NativeAddress)?.let { WGPULimits(it) } }
			set(newValue) { handle.useContents { requiredLimits = newValue?.handler?.reinterpret() } } 

		override val defaultQueue: WGPUQueueDescriptor
			get() = handle.useContents { defaultQueue.rawPtr.toLong().let(::NativeAddress).let { WGPUQueueDescriptor(it) } }

		override val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo
			get() = handle.useContents { deviceLostCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUDeviceLostCallbackInfo(it) } }

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handle.useContents { uncapturedErrorCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUUncapturedErrorCallbackInfo(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var requiredFeatureCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.requiredFeatureCount ?: error("pointer of WGPUDeviceDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.requiredFeatureCount = newValue } } 

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.requiredFeatures?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.requiredFeatures = newValue?.handler?.reinterpret() } } 

		override var requiredLimits: WGPULimits?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.requiredLimits?.let(::NativeAddress)?.let { WGPULimits(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.requiredLimits = newValue?.handler?.reinterpret() } } 

		override val defaultQueue: WGPUQueueDescriptor
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.defaultQueue.rawPtr.toLong().let(::NativeAddress).let { WGPUQueueDescriptor(it) }

		override val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.deviceLostCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUDeviceLostCallbackInfo(it) }

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.uncapturedErrorCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUUncapturedErrorCallbackInfo(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
	actual var requiredFeatureCount: ULong
	actual var requiredFeatures: ArrayHolder<WGPUFeatureName>?
	actual var requiredLimits: WGPULimits?
	actual val defaultQueue: WGPUQueueDescriptor
	actual val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo
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
			label.adapt(this@WGPUDeviceDescriptor.label)
			defaultQueue.adapt(this@WGPUDeviceDescriptor.defaultQueue)
			deviceLostCallbackInfo.adapt(this@WGPUDeviceDescriptor.deviceLostCallbackInfo)
			uncapturedErrorCallbackInfo.adapt(this@WGPUDeviceDescriptor.uncapturedErrorCallbackInfo)
			nextInChain = this@WGPUDeviceDescriptor.nextInChain?.reinterpret()
			requiredFeatureCount = this@WGPUDeviceDescriptor.requiredFeatureCount
			requiredFeatures = this@WGPUDeviceDescriptor.requiredFeatures?.handler?.reinterpret()
			requiredLimits = this@WGPUDeviceDescriptor.requiredLimits?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUDeviceDescriptor.adapt(structure: WGPUDeviceDescriptor) {
	label.adapt(structure.label)
	defaultQueue.adapt(structure.defaultQueue)
	deviceLostCallbackInfo.adapt(structure.deviceLostCallbackInfo)
	uncapturedErrorCallbackInfo.adapt(structure.uncapturedErrorCallbackInfo)
	nextInChain = structure.nextInChain?.reinterpret()
	requiredFeatureCount = structure.requiredFeatureCount
	requiredFeatures = structure.requiredFeatures?.handler?.reinterpret()
	requiredLimits = structure.requiredLimits?.handler?.reinterpret()
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

actual interface WGPUFragmentState {
	value class ByValue(val handle: CValue<webgpu.native.WGPUFragmentState>) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var module: WGPUShaderModule?
			get() = handle.useContents { module?.let(::NativeAddress)?.let { WGPUShaderModule(it) } }
			set(newValue) { handle.useContents { module = newValue?.handler?.reinterpret() } } 

		override val entryPoint: WGPUStringView
			get() = handle.useContents { entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val entryPoint: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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
	actual val entryPoint: WGPUStringView
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
			entryPoint.adapt(this@WGPUFragmentState.entryPoint)
			nextInChain = this@WGPUFragmentState.nextInChain?.reinterpret()
			module = this@WGPUFragmentState.module?.handler?.reinterpret()
			constantCount = this@WGPUFragmentState.constantCount
			constants = this@WGPUFragmentState.constants?.handler?.reinterpret()
			targetCount = this@WGPUFragmentState.targetCount
			targets = this@WGPUFragmentState.targets?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUFragmentState.adapt(structure: WGPUFragmentState) {
	entryPoint.adapt(structure.entryPoint)
	nextInChain = structure.nextInChain?.reinterpret()
	module = structure.module?.handler?.reinterpret()
	constantCount = structure.constantCount
	constants = structure.constants?.handler?.reinterpret()
	targetCount = structure.targetCount
	targets = structure.targets?.handler?.reinterpret()
}

actual interface WGPUFuture {
	value class ByValue(val handle: CValue<webgpu.native.WGPUFuture>) : WGPUFuture {
		override var id: ULong
			get() = handle.useContents { id ?: error("pointer of WGPUFuture is null") }
			set(newValue) { handle.useContents { id = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUFuture {
		override var id: ULong
			get() = handler.reinterpret<webgpu.native.WGPUFuture>().pointed.id ?: error("pointer of WGPUFuture is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUFuture>().pointed.let { it.id = newValue } } 

	}

	actual var id: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUFuture {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUFuture {
			return allocator.allocate(sizeOf<webgpu.native.WGPUFuture>())
				.let { WGPUFuture(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUFuture) -> Unit): ArrayHolder<WGPUFuture> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUFuture>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUFuture>())
							.let(::NativeAddress)
							.let { WGPUFuture(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUFuture> {
		return cValue<webgpu.native.WGPUFuture> {
			id = this@WGPUFuture.id
		}
	}
}

fun webgpu.native.WGPUFuture.adapt(structure: WGPUFuture) {
	id = structure.id
}

actual interface WGPUFutureWaitInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUFutureWaitInfo>) : WGPUFutureWaitInfo {
		override val future: WGPUFuture
			get() = handle.useContents { future.rawPtr.toLong().let(::NativeAddress).let { WGPUFuture(it) } }

		override var completed: Boolean
			get() = handle.useContents { completed.toBoolean() ?: error("pointer of WGPUFutureWaitInfo is null") }
			set(newValue) { handle.useContents { completed = newValue.toUInt() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUFutureWaitInfo {
		override val future: WGPUFuture
			get() = handler.reinterpret<webgpu.native.WGPUFutureWaitInfo>().pointed.future.rawPtr.toLong().let(::NativeAddress).let { WGPUFuture(it) }

		override var completed: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUFutureWaitInfo>().pointed.completed.toBoolean() ?: error("pointer of WGPUFutureWaitInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUFutureWaitInfo>().pointed.let { it.completed = newValue.toUInt() } } 

	}

	actual val future: WGPUFuture
	actual var completed: Boolean
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUFutureWaitInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUFutureWaitInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUFutureWaitInfo>())
				.let { WGPUFutureWaitInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUFutureWaitInfo) -> Unit): ArrayHolder<WGPUFutureWaitInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUFutureWaitInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUFutureWaitInfo>())
							.let(::NativeAddress)
							.let { WGPUFutureWaitInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUFutureWaitInfo> {
		return cValue<webgpu.native.WGPUFutureWaitInfo> {
			future.adapt(this@WGPUFutureWaitInfo.future)
			completed = this@WGPUFutureWaitInfo.completed.toUInt()
		}
	}
}

fun webgpu.native.WGPUFutureWaitInfo.adapt(structure: WGPUFutureWaitInfo) {
	future.adapt(structure.future)
	completed = structure.completed.toUInt()
}

actual interface WGPUInstanceCapabilities {
	value class ByValue(val handle: CValue<webgpu.native.WGPUInstanceCapabilities>) : WGPUInstanceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var timedWaitAnyEnable: Boolean
			get() = handle.useContents { timedWaitAnyEnable.toBoolean() ?: error("pointer of WGPUInstanceCapabilities is null") }
			set(newValue) { handle.useContents { timedWaitAnyEnable = newValue.toUInt() } } 

		override var timedWaitAnyMaxCount: ULong
			get() = handle.useContents { timedWaitAnyMaxCount ?: error("pointer of WGPUInstanceCapabilities is null") }
			set(newValue) { handle.useContents { timedWaitAnyMaxCount = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUInstanceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var timedWaitAnyEnable: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.timedWaitAnyEnable.toBoolean() ?: error("pointer of WGPUInstanceCapabilities is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.let { it.timedWaitAnyEnable = newValue.toUInt() } } 

		override var timedWaitAnyMaxCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.timedWaitAnyMaxCount ?: error("pointer of WGPUInstanceCapabilities is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.let { it.timedWaitAnyMaxCount = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var timedWaitAnyEnable: Boolean
	actual var timedWaitAnyMaxCount: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUInstanceCapabilities {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUInstanceCapabilities {
			return allocator.allocate(sizeOf<webgpu.native.WGPUInstanceCapabilities>())
				.let { WGPUInstanceCapabilities(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUInstanceCapabilities) -> Unit): ArrayHolder<WGPUInstanceCapabilities> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUInstanceCapabilities>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUInstanceCapabilities>())
							.let(::NativeAddress)
							.let { WGPUInstanceCapabilities(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUInstanceCapabilities> {
		return cValue<webgpu.native.WGPUInstanceCapabilities> {
			nextInChain = this@WGPUInstanceCapabilities.nextInChain?.reinterpret()
			timedWaitAnyEnable = this@WGPUInstanceCapabilities.timedWaitAnyEnable.toUInt()
			timedWaitAnyMaxCount = this@WGPUInstanceCapabilities.timedWaitAnyMaxCount
		}
	}
}

fun webgpu.native.WGPUInstanceCapabilities.adapt(structure: WGPUInstanceCapabilities) {
	nextInChain = structure.nextInChain?.reinterpret()
	timedWaitAnyEnable = structure.timedWaitAnyEnable.toUInt()
	timedWaitAnyMaxCount = structure.timedWaitAnyMaxCount
}

actual interface WGPUInstanceDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUInstanceDescriptor>) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val features: WGPUInstanceCapabilities
			get() = handle.useContents { features.rawPtr.toLong().let(::NativeAddress).let { WGPUInstanceCapabilities(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUInstanceDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val features: WGPUInstanceCapabilities
			get() = handler.reinterpret<webgpu.native.WGPUInstanceDescriptor>().pointed.features.rawPtr.toLong().let(::NativeAddress).let { WGPUInstanceCapabilities(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val features: WGPUInstanceCapabilities
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
			features.adapt(this@WGPUInstanceDescriptor.features)
			nextInChain = this@WGPUInstanceDescriptor.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUInstanceDescriptor.adapt(structure: WGPUInstanceDescriptor) {
	features.adapt(structure.features)
	nextInChain = structure.nextInChain?.reinterpret()
}

actual interface WGPULimits {
	value class ByValue(val handle: CValue<webgpu.native.WGPULimits>) : WGPULimits {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

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
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

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

	actual var nextInChain: NativeAddress?
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
			nextInChain = this@WGPULimits.nextInChain?.reinterpret()
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
	nextInChain = structure.nextInChain?.reinterpret()
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

actual interface WGPUPipelineLayoutDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUPipelineLayoutDescriptor>) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var bindGroupLayoutCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.bindGroupLayoutCount ?: error("pointer of WGPUPipelineLayoutDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.let { it.bindGroupLayoutCount = newValue } } 

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.bindGroupLayouts?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayout>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.let { it.bindGroupLayouts = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUPipelineLayoutDescriptor.label)
			nextInChain = this@WGPUPipelineLayoutDescriptor.nextInChain?.reinterpret()
			bindGroupLayoutCount = this@WGPUPipelineLayoutDescriptor.bindGroupLayoutCount
			bindGroupLayouts = this@WGPUPipelineLayoutDescriptor.bindGroupLayouts?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUPipelineLayoutDescriptor.adapt(structure: WGPUPipelineLayoutDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	bindGroupLayoutCount = structure.bindGroupLayoutCount
	bindGroupLayouts = structure.bindGroupLayouts?.handler?.reinterpret()
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

		override var unclippedDepth: Boolean
			get() = handle.useContents { unclippedDepth.toBoolean() ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) { handle.useContents { unclippedDepth = newValue.toUInt() } } 

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

		override var unclippedDepth: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.unclippedDepth.toBoolean() ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.unclippedDepth = newValue.toUInt() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var topology: WGPUPrimitiveTopology
	actual var stripIndexFormat: WGPUIndexFormat
	actual var frontFace: WGPUFrontFace
	actual var cullMode: WGPUCullMode
	actual var unclippedDepth: Boolean
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
			unclippedDepth = this@WGPUPrimitiveState.unclippedDepth.toUInt()
		}
	}
}

fun webgpu.native.WGPUPrimitiveState.adapt(structure: WGPUPrimitiveState) {
	nextInChain = structure.nextInChain?.reinterpret()
	topology = structure.topology
	stripIndexFormat = structure.stripIndexFormat
	frontFace = structure.frontFace
	cullMode = structure.cullMode
	unclippedDepth = structure.unclippedDepth.toUInt()
}

actual interface WGPUQuerySetDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUQuerySetDescriptor>) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var type: WGPUQueryType
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.type ?: error("pointer of WGPUQuerySetDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.let { it.type = newValue } } 

		override var count: UInt
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.count ?: error("pointer of WGPUQuerySetDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.let { it.count = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUQuerySetDescriptor.label)
			nextInChain = this@WGPUQuerySetDescriptor.nextInChain?.reinterpret()
			type = this@WGPUQuerySetDescriptor.type
			count = this@WGPUQuerySetDescriptor.count
		}
	}
}

fun webgpu.native.WGPUQuerySetDescriptor.adapt(structure: WGPUQuerySetDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	type = structure.type
	count = structure.count
}

actual interface WGPURenderBundleDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderBundleDescriptor>) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPURenderBundleDescriptor.label)
			nextInChain = this@WGPURenderBundleDescriptor.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURenderBundleDescriptor.adapt(structure: WGPURenderBundleDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

actual interface WGPURenderBundleEncoderDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderBundleEncoderDescriptor>) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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
	actual val label: WGPUStringView
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
			label.adapt(this@WGPURenderBundleEncoderDescriptor.label)
			nextInChain = this@WGPURenderBundleEncoderDescriptor.nextInChain?.reinterpret()
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
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
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

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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
	actual val label: WGPUStringView
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
			label.adapt(this@WGPURenderPassDescriptor.label)
			nextInChain = this@WGPURenderPassDescriptor.nextInChain?.reinterpret()
			colorAttachmentCount = this@WGPURenderPassDescriptor.colorAttachmentCount
			colorAttachments = this@WGPURenderPassDescriptor.colorAttachments?.handler?.reinterpret()
			depthStencilAttachment = this@WGPURenderPassDescriptor.depthStencilAttachment?.handler?.reinterpret()
			occlusionQuerySet = this@WGPURenderPassDescriptor.occlusionQuerySet?.handler?.reinterpret()
			timestampWrites = this@WGPURenderPassDescriptor.timestampWrites?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURenderPassDescriptor.adapt(structure: WGPURenderPassDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
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

actual interface WGPURenderPassMaxDrawCount {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderPassMaxDrawCount>) : WGPURenderPassMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var maxDrawCount: ULong
			get() = handle.useContents { maxDrawCount ?: error("pointer of WGPURenderPassMaxDrawCount is null") }
			set(newValue) { handle.useContents { maxDrawCount = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURenderPassMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPURenderPassMaxDrawCount>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var maxDrawCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPURenderPassMaxDrawCount>().pointed.maxDrawCount ?: error("pointer of WGPURenderPassMaxDrawCount is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURenderPassMaxDrawCount>().pointed.let { it.maxDrawCount = newValue } } 

	}

	actual val chain: WGPUChainedStruct
	actual var maxDrawCount: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURenderPassMaxDrawCount {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURenderPassMaxDrawCount {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassMaxDrawCount>())
				.let { WGPURenderPassMaxDrawCount(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURenderPassMaxDrawCount) -> Unit): ArrayHolder<WGPURenderPassMaxDrawCount> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURenderPassMaxDrawCount>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURenderPassMaxDrawCount>())
							.let(::NativeAddress)
							.let { WGPURenderPassMaxDrawCount(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURenderPassMaxDrawCount> {
		return cValue<webgpu.native.WGPURenderPassMaxDrawCount> {
			chain.adapt(this@WGPURenderPassMaxDrawCount.chain)
			maxDrawCount = this@WGPURenderPassMaxDrawCount.maxDrawCount
		}
	}
}

fun webgpu.native.WGPURenderPassMaxDrawCount.adapt(structure: WGPURenderPassMaxDrawCount) {
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

		override val entryPoint: WGPUStringView
			get() = handle.useContents { entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val entryPoint: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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
	actual val entryPoint: WGPUStringView
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
			entryPoint.adapt(this@WGPUVertexState.entryPoint)
			nextInChain = this@WGPUVertexState.nextInChain?.reinterpret()
			module = this@WGPUVertexState.module?.handler?.reinterpret()
			constantCount = this@WGPUVertexState.constantCount
			constants = this@WGPUVertexState.constants?.handler?.reinterpret()
			bufferCount = this@WGPUVertexState.bufferCount
			buffers = this@WGPUVertexState.buffers?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUVertexState.adapt(structure: WGPUVertexState) {
	entryPoint.adapt(structure.entryPoint)
	nextInChain = structure.nextInChain?.reinterpret()
	module = structure.module?.handler?.reinterpret()
	constantCount = structure.constantCount
	constants = structure.constants?.handler?.reinterpret()
	bufferCount = structure.bufferCount
	buffers = structure.buffers?.handler?.reinterpret()
}

actual interface WGPURenderPipelineDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPURenderPipelineDescriptor>) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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
	actual val label: WGPUStringView
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
			label.adapt(this@WGPURenderPipelineDescriptor.label)
			vertex.adapt(this@WGPURenderPipelineDescriptor.vertex)
			primitive.adapt(this@WGPURenderPipelineDescriptor.primitive)
			multisample.adapt(this@WGPURenderPipelineDescriptor.multisample)
			nextInChain = this@WGPURenderPipelineDescriptor.nextInChain?.reinterpret()
			layout = this@WGPURenderPipelineDescriptor.layout?.handler?.reinterpret()
			depthStencil = this@WGPURenderPipelineDescriptor.depthStencil?.handler?.reinterpret()
			fragment = this@WGPURenderPipelineDescriptor.fragment?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURenderPipelineDescriptor.adapt(structure: WGPURenderPipelineDescriptor) {
	label.adapt(structure.label)
	vertex.adapt(structure.vertex)
	primitive.adapt(structure.primitive)
	multisample.adapt(structure.multisample)
	nextInChain = structure.nextInChain?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
	depthStencil = structure.depthStencil?.handler?.reinterpret()
	fragment = structure.fragment?.handler?.reinterpret()
}

actual interface WGPURequestAdapterOptions {
	value class ByValue(val handle: CValue<webgpu.native.WGPURequestAdapterOptions>) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var featureLevel: WGPUFeatureLevel
			get() = handle.useContents { featureLevel ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) { handle.useContents { featureLevel = newValue } } 

		override var powerPreference: WGPUPowerPreference
			get() = handle.useContents { powerPreference ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) { handle.useContents { powerPreference = newValue } } 

		override var forceFallbackAdapter: Boolean
			get() = handle.useContents { forceFallbackAdapter.toBoolean() ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) { handle.useContents { forceFallbackAdapter = newValue.toUInt() } } 

		override var backendType: WGPUBackendType
			get() = handle.useContents { backendType ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) { handle.useContents { backendType = newValue } } 

		override var compatibleSurface: WGPUSurface?
			get() = handle.useContents { compatibleSurface?.let(::NativeAddress)?.let { WGPUSurface(it) } }
			set(newValue) { handle.useContents { compatibleSurface = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var featureLevel: WGPUFeatureLevel
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.featureLevel ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.featureLevel = newValue } } 

		override var powerPreference: WGPUPowerPreference
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.powerPreference ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.powerPreference = newValue } } 

		override var forceFallbackAdapter: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.forceFallbackAdapter.toBoolean() ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.forceFallbackAdapter = newValue.toUInt() } } 

		override var backendType: WGPUBackendType
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.backendType ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.backendType = newValue } } 

		override var compatibleSurface: WGPUSurface?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.compatibleSurface?.let(::NativeAddress)?.let { WGPUSurface(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.compatibleSurface = newValue?.handler?.reinterpret() } } 

	}

	actual var nextInChain: NativeAddress?
	actual var featureLevel: WGPUFeatureLevel
	actual var powerPreference: WGPUPowerPreference
	actual var forceFallbackAdapter: Boolean
	actual var backendType: WGPUBackendType
	actual var compatibleSurface: WGPUSurface?
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
			featureLevel = this@WGPURequestAdapterOptions.featureLevel
			powerPreference = this@WGPURequestAdapterOptions.powerPreference
			forceFallbackAdapter = this@WGPURequestAdapterOptions.forceFallbackAdapter.toUInt()
			backendType = this@WGPURequestAdapterOptions.backendType
			compatibleSurface = this@WGPURequestAdapterOptions.compatibleSurface?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURequestAdapterOptions.adapt(structure: WGPURequestAdapterOptions) {
	nextInChain = structure.nextInChain?.reinterpret()
	featureLevel = structure.featureLevel
	powerPreference = structure.powerPreference
	forceFallbackAdapter = structure.forceFallbackAdapter.toUInt()
	backendType = structure.backendType
	compatibleSurface = structure.compatibleSurface?.handler?.reinterpret()
}

actual interface WGPUSamplerDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSamplerDescriptor>) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUSamplerDescriptor.label)
			nextInChain = this@WGPUSamplerDescriptor.nextInChain?.reinterpret()
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
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
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

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUShaderModuleDescriptor.label)
			nextInChain = this@WGPUShaderModuleDescriptor.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUShaderModuleDescriptor.adapt(structure: WGPUShaderModuleDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

actual interface WGPUShaderSourceSPIRV {
	value class ByValue(val handle: CValue<webgpu.native.WGPUShaderSourceSPIRV>) : WGPUShaderSourceSPIRV {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var codeSize: UInt
			get() = handle.useContents { codeSize ?: error("pointer of WGPUShaderSourceSPIRV is null") }
			set(newValue) { handle.useContents { codeSize = newValue } } 

		override var code: NativeAddress?
			get() = handle.useContents { code?.let(::NativeAddress) }
			set(newValue) { handle.useContents { code = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUShaderSourceSPIRV {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var codeSize: UInt
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.codeSize ?: error("pointer of WGPUShaderSourceSPIRV is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.let { it.codeSize = newValue } } 

		override var code: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.code?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.let { it.code = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var codeSize: UInt
	actual var code: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderSourceSPIRV {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderSourceSPIRV {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderSourceSPIRV>())
				.let { WGPUShaderSourceSPIRV(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderSourceSPIRV) -> Unit): ArrayHolder<WGPUShaderSourceSPIRV> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderSourceSPIRV>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUShaderSourceSPIRV>())
							.let(::NativeAddress)
							.let { WGPUShaderSourceSPIRV(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUShaderSourceSPIRV> {
		return cValue<webgpu.native.WGPUShaderSourceSPIRV> {
			chain.adapt(this@WGPUShaderSourceSPIRV.chain)
			codeSize = this@WGPUShaderSourceSPIRV.codeSize
			code = this@WGPUShaderSourceSPIRV.code?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUShaderSourceSPIRV.adapt(structure: WGPUShaderSourceSPIRV) {
	chain.adapt(structure.chain)
	codeSize = structure.codeSize
	code = structure.code?.reinterpret()
}

actual interface WGPUShaderSourceWGSL {
	value class ByValue(val handle: CValue<webgpu.native.WGPUShaderSourceWGSL>) : WGPUShaderSourceWGSL {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override val code: WGPUStringView
			get() = handle.useContents { code.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUShaderSourceWGSL {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceWGSL>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override val code: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceWGSL>().pointed.code.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

	}

	actual val chain: WGPUChainedStruct
	actual val code: WGPUStringView
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUShaderSourceWGSL {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUShaderSourceWGSL {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderSourceWGSL>())
				.let { WGPUShaderSourceWGSL(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUShaderSourceWGSL) -> Unit): ArrayHolder<WGPUShaderSourceWGSL> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUShaderSourceWGSL>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUShaderSourceWGSL>())
							.let(::NativeAddress)
							.let { WGPUShaderSourceWGSL(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUShaderSourceWGSL> {
		return cValue<webgpu.native.WGPUShaderSourceWGSL> {
			chain.adapt(this@WGPUShaderSourceWGSL.chain)
			code.adapt(this@WGPUShaderSourceWGSL.code)
		}
	}
}

fun webgpu.native.WGPUShaderSourceWGSL.adapt(structure: WGPUShaderSourceWGSL) {
	chain.adapt(structure.chain)
	code.adapt(structure.code)
}

actual interface WGPUSupportedFeatures {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSupportedFeatures>) : WGPUSupportedFeatures {
		override var featureCount: ULong
			get() = handle.useContents { featureCount ?: error("pointer of WGPUSupportedFeatures is null") }
			set(newValue) { handle.useContents { featureCount = newValue } } 

		override var features: ArrayHolder<WGPUFeatureName>?
			get() = handle.useContents { features?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) } }
			set(newValue) { handle.useContents { features = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSupportedFeatures {
		override var featureCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSupportedFeatures>().pointed.featureCount ?: error("pointer of WGPUSupportedFeatures is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSupportedFeatures>().pointed.let { it.featureCount = newValue } } 

		override var features: ArrayHolder<WGPUFeatureName>?
			get() = handler.reinterpret<webgpu.native.WGPUSupportedFeatures>().pointed.features?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSupportedFeatures>().pointed.let { it.features = newValue?.handler?.reinterpret() } } 

	}

	actual var featureCount: ULong
	actual var features: ArrayHolder<WGPUFeatureName>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSupportedFeatures {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSupportedFeatures {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSupportedFeatures>())
				.let { WGPUSupportedFeatures(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSupportedFeatures) -> Unit): ArrayHolder<WGPUSupportedFeatures> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSupportedFeatures>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSupportedFeatures>())
							.let(::NativeAddress)
							.let { WGPUSupportedFeatures(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSupportedFeatures> {
		return cValue<webgpu.native.WGPUSupportedFeatures> {
			featureCount = this@WGPUSupportedFeatures.featureCount
			features = this@WGPUSupportedFeatures.features?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSupportedFeatures.adapt(structure: WGPUSupportedFeatures) {
	featureCount = structure.featureCount
	features = structure.features?.handler?.reinterpret()
}

actual interface WGPUSupportedWGSLLanguageFeatures {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSupportedWGSLLanguageFeatures>) : WGPUSupportedWGSLLanguageFeatures {
		override var featureCount: ULong
			get() = handle.useContents { featureCount ?: error("pointer of WGPUSupportedWGSLLanguageFeatures is null") }
			set(newValue) { handle.useContents { featureCount = newValue } } 

		override var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?
			get() = handle.useContents { features?.let(::NativeAddress)?.let { ArrayHolder<WGPUWGSLLanguageFeatureName>(it) } }
			set(newValue) { handle.useContents { features = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSupportedWGSLLanguageFeatures {
		override var featureCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSupportedWGSLLanguageFeatures>().pointed.featureCount ?: error("pointer of WGPUSupportedWGSLLanguageFeatures is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSupportedWGSLLanguageFeatures>().pointed.let { it.featureCount = newValue } } 

		override var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?
			get() = handler.reinterpret<webgpu.native.WGPUSupportedWGSLLanguageFeatures>().pointed.features?.let(::NativeAddress)?.let { ArrayHolder<WGPUWGSLLanguageFeatureName>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSupportedWGSLLanguageFeatures>().pointed.let { it.features = newValue?.handler?.reinterpret() } } 

	}

	actual var featureCount: ULong
	actual var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSupportedWGSLLanguageFeatures {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSupportedWGSLLanguageFeatures {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSupportedWGSLLanguageFeatures>())
				.let { WGPUSupportedWGSLLanguageFeatures(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSupportedWGSLLanguageFeatures) -> Unit): ArrayHolder<WGPUSupportedWGSLLanguageFeatures> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSupportedWGSLLanguageFeatures>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSupportedWGSLLanguageFeatures>())
							.let(::NativeAddress)
							.let { WGPUSupportedWGSLLanguageFeatures(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSupportedWGSLLanguageFeatures> {
		return cValue<webgpu.native.WGPUSupportedWGSLLanguageFeatures> {
			featureCount = this@WGPUSupportedWGSLLanguageFeatures.featureCount
			features = this@WGPUSupportedWGSLLanguageFeatures.features?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSupportedWGSLLanguageFeatures.adapt(structure: WGPUSupportedWGSLLanguageFeatures) {
	featureCount = structure.featureCount
	features = structure.features?.handler?.reinterpret()
}

actual interface WGPUSurfaceCapabilities {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceCapabilities>) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var usages: ULong
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

		override var usages: ULong
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
	actual var usages: ULong
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

		override var usage: ULong
			get() = handle.useContents { usage ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { usage = newValue } } 

		override var width: UInt
			get() = handle.useContents { width ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { width = newValue } } 

		override var height: UInt
			get() = handle.useContents { height ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { height = newValue } } 

		override var viewFormatCount: ULong
			get() = handle.useContents { viewFormatCount ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { viewFormatCount = newValue } } 

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.useContents { viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) } }
			set(newValue) { handle.useContents { viewFormats = newValue?.handler?.reinterpret() } } 

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handle.useContents { alphaMode ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) { handle.useContents { alphaMode = newValue } } 

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

		override var usage: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.usage ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.usage = newValue } } 

		override var width: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.width ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.width = newValue } } 

		override var height: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.height ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.height = newValue } } 

		override var viewFormatCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.viewFormatCount ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.viewFormatCount = newValue } } 

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.viewFormats = newValue?.handler?.reinterpret() } } 

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.alphaMode ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.alphaMode = newValue } } 

		override var presentMode: WGPUPresentMode
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.presentMode ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.presentMode = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var device: WGPUDevice?
	actual var format: WGPUTextureFormat
	actual var usage: ULong
	actual var width: UInt
	actual var height: UInt
	actual var viewFormatCount: ULong
	actual var viewFormats: ArrayHolder<WGPUTextureFormat>?
	actual var alphaMode: WGPUCompositeAlphaMode
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
			width = this@WGPUSurfaceConfiguration.width
			height = this@WGPUSurfaceConfiguration.height
			viewFormatCount = this@WGPUSurfaceConfiguration.viewFormatCount
			viewFormats = this@WGPUSurfaceConfiguration.viewFormats?.handler?.reinterpret()
			alphaMode = this@WGPUSurfaceConfiguration.alphaMode
			presentMode = this@WGPUSurfaceConfiguration.presentMode
		}
	}
}

fun webgpu.native.WGPUSurfaceConfiguration.adapt(structure: WGPUSurfaceConfiguration) {
	nextInChain = structure.nextInChain?.reinterpret()
	device = structure.device?.handler?.reinterpret()
	format = structure.format
	usage = structure.usage
	width = structure.width
	height = structure.height
	viewFormatCount = structure.viewFormatCount
	viewFormats = structure.viewFormats?.handler?.reinterpret()
	alphaMode = structure.alphaMode
	presentMode = structure.presentMode
}

actual interface WGPUSurfaceDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceDescriptor>) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
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
			label.adapt(this@WGPUSurfaceDescriptor.label)
			nextInChain = this@WGPUSurfaceDescriptor.nextInChain?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceDescriptor.adapt(structure: WGPUSurfaceDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

actual interface WGPUSurfaceSourceAndroidNativeWindow {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>) : WGPUSurfaceSourceAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var window: NativeAddress?
			get() = handle.useContents { window?.let(::NativeAddress) }
			set(newValue) { handle.useContents { window = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceSourceAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var window: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>().pointed.window?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>().pointed.let { it.window = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var window: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceAndroidNativeWindow {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceAndroidNativeWindow {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>())
				.let { WGPUSurfaceSourceAndroidNativeWindow(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceSourceAndroidNativeWindow) -> Unit): ArrayHolder<WGPUSurfaceSourceAndroidNativeWindow> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>())
							.let(::NativeAddress)
							.let { WGPUSurfaceSourceAndroidNativeWindow(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow> {
		return cValue<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow> {
			chain.adapt(this@WGPUSurfaceSourceAndroidNativeWindow.chain)
			window = this@WGPUSurfaceSourceAndroidNativeWindow.window?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceSourceAndroidNativeWindow.adapt(structure: WGPUSurfaceSourceAndroidNativeWindow) {
	chain.adapt(structure.chain)
	window = structure.window?.reinterpret()
}

actual interface WGPUSurfaceSourceMetalLayer {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceSourceMetalLayer>) : WGPUSurfaceSourceMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var layer: NativeAddress?
			get() = handle.useContents { layer?.let(::NativeAddress) }
			set(newValue) { handle.useContents { layer = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceSourceMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceMetalLayer>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var layer: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceMetalLayer>().pointed.layer?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceMetalLayer>().pointed.let { it.layer = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var layer: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceMetalLayer {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceMetalLayer {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceMetalLayer>())
				.let { WGPUSurfaceSourceMetalLayer(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceSourceMetalLayer) -> Unit): ArrayHolder<WGPUSurfaceSourceMetalLayer> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceMetalLayer>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceSourceMetalLayer>())
							.let(::NativeAddress)
							.let { WGPUSurfaceSourceMetalLayer(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceMetalLayer> {
		return cValue<webgpu.native.WGPUSurfaceSourceMetalLayer> {
			chain.adapt(this@WGPUSurfaceSourceMetalLayer.chain)
			layer = this@WGPUSurfaceSourceMetalLayer.layer?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceSourceMetalLayer.adapt(structure: WGPUSurfaceSourceMetalLayer) {
	chain.adapt(structure.chain)
	layer = structure.layer?.reinterpret()
}

actual interface WGPUSurfaceSourceWaylandSurface {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceSourceWaylandSurface>) : WGPUSurfaceSourceWaylandSurface {
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
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceSourceWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var display: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.display?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.let { it.display = newValue?.reinterpret() } } 

		override var surface: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.surface?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.let { it.surface = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var display: NativeAddress?
	actual var surface: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWaylandSurface {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWaylandSurface {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceWaylandSurface>())
				.let { WGPUSurfaceSourceWaylandSurface(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceSourceWaylandSurface) -> Unit): ArrayHolder<WGPUSurfaceSourceWaylandSurface> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceWaylandSurface>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceSourceWaylandSurface>())
							.let(::NativeAddress)
							.let { WGPUSurfaceSourceWaylandSurface(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceWaylandSurface> {
		return cValue<webgpu.native.WGPUSurfaceSourceWaylandSurface> {
			chain.adapt(this@WGPUSurfaceSourceWaylandSurface.chain)
			display = this@WGPUSurfaceSourceWaylandSurface.display?.reinterpret()
			surface = this@WGPUSurfaceSourceWaylandSurface.surface?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceSourceWaylandSurface.adapt(structure: WGPUSurfaceSourceWaylandSurface) {
	chain.adapt(structure.chain)
	display = structure.display?.reinterpret()
	surface = structure.surface?.reinterpret()
}

actual interface WGPUSurfaceSourceWindowsHWND {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceSourceWindowsHWND>) : WGPUSurfaceSourceWindowsHWND {
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
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceSourceWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var hinstance: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.hinstance?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.let { it.hinstance = newValue?.reinterpret() } } 

		override var hwnd: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.hwnd?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.let { it.hwnd = newValue?.reinterpret() } } 

	}

	actual val chain: WGPUChainedStruct
	actual var hinstance: NativeAddress?
	actual var hwnd: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWindowsHWND {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWindowsHWND {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceWindowsHWND>())
				.let { WGPUSurfaceSourceWindowsHWND(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceSourceWindowsHWND) -> Unit): ArrayHolder<WGPUSurfaceSourceWindowsHWND> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceWindowsHWND>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceSourceWindowsHWND>())
							.let(::NativeAddress)
							.let { WGPUSurfaceSourceWindowsHWND(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceWindowsHWND> {
		return cValue<webgpu.native.WGPUSurfaceSourceWindowsHWND> {
			chain.adapt(this@WGPUSurfaceSourceWindowsHWND.chain)
			hinstance = this@WGPUSurfaceSourceWindowsHWND.hinstance?.reinterpret()
			hwnd = this@WGPUSurfaceSourceWindowsHWND.hwnd?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUSurfaceSourceWindowsHWND.adapt(structure: WGPUSurfaceSourceWindowsHWND) {
	chain.adapt(structure.chain)
	hinstance = structure.hinstance?.reinterpret()
	hwnd = structure.hwnd?.reinterpret()
}

actual interface WGPUSurfaceSourceXCBWindow {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceSourceXCBWindow>) : WGPUSurfaceSourceXCBWindow {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var connection: NativeAddress?
			get() = handle.useContents { connection?.let(::NativeAddress) }
			set(newValue) { handle.useContents { connection = newValue?.reinterpret() } } 

		override var window: UInt
			get() = handle.useContents { window ?: error("pointer of WGPUSurfaceSourceXCBWindow is null") }
			set(newValue) { handle.useContents { window = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceSourceXCBWindow {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var connection: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.connection?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.let { it.connection = newValue?.reinterpret() } } 

		override var window: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.window ?: error("pointer of WGPUSurfaceSourceXCBWindow is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.let { it.window = newValue } } 

	}

	actual val chain: WGPUChainedStruct
	actual var connection: NativeAddress?
	actual var window: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXCBWindow {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXCBWindow {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceXCBWindow>())
				.let { WGPUSurfaceSourceXCBWindow(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceSourceXCBWindow) -> Unit): ArrayHolder<WGPUSurfaceSourceXCBWindow> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceXCBWindow>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceSourceXCBWindow>())
							.let(::NativeAddress)
							.let { WGPUSurfaceSourceXCBWindow(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceXCBWindow> {
		return cValue<webgpu.native.WGPUSurfaceSourceXCBWindow> {
			chain.adapt(this@WGPUSurfaceSourceXCBWindow.chain)
			connection = this@WGPUSurfaceSourceXCBWindow.connection?.reinterpret()
			window = this@WGPUSurfaceSourceXCBWindow.window
		}
	}
}

fun webgpu.native.WGPUSurfaceSourceXCBWindow.adapt(structure: WGPUSurfaceSourceXCBWindow) {
	chain.adapt(structure.chain)
	connection = structure.connection?.reinterpret()
	window = structure.window
}

actual interface WGPUSurfaceSourceXlibWindow {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceSourceXlibWindow>) : WGPUSurfaceSourceXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var display: NativeAddress?
			get() = handle.useContents { display?.let(::NativeAddress) }
			set(newValue) { handle.useContents { display = newValue?.reinterpret() } } 

		override var window: ULong
			get() = handle.useContents { window ?: error("pointer of WGPUSurfaceSourceXlibWindow is null") }
			set(newValue) { handle.useContents { window = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceSourceXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var display: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.display?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.let { it.display = newValue?.reinterpret() } } 

		override var window: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.window ?: error("pointer of WGPUSurfaceSourceXlibWindow is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.let { it.window = newValue } } 

	}

	actual val chain: WGPUChainedStruct
	actual var display: NativeAddress?
	actual var window: ULong
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXlibWindow {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXlibWindow {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceXlibWindow>())
				.let { WGPUSurfaceSourceXlibWindow(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUSurfaceSourceXlibWindow) -> Unit): ArrayHolder<WGPUSurfaceSourceXlibWindow> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceXlibWindow>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUSurfaceSourceXlibWindow>())
							.let(::NativeAddress)
							.let { WGPUSurfaceSourceXlibWindow(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceXlibWindow> {
		return cValue<webgpu.native.WGPUSurfaceSourceXlibWindow> {
			chain.adapt(this@WGPUSurfaceSourceXlibWindow.chain)
			display = this@WGPUSurfaceSourceXlibWindow.display?.reinterpret()
			window = this@WGPUSurfaceSourceXlibWindow.window
		}
	}
}

fun webgpu.native.WGPUSurfaceSourceXlibWindow.adapt(structure: WGPUSurfaceSourceXlibWindow) {
	chain.adapt(structure.chain)
	display = structure.display?.reinterpret()
	window = structure.window
}

actual interface WGPUSurfaceTexture {
	value class ByValue(val handle: CValue<webgpu.native.WGPUSurfaceTexture>) : WGPUSurfaceTexture {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override var texture: WGPUTexture?
			get() = handle.useContents { texture?.let(::NativeAddress)?.let { WGPUTexture(it) } }
			set(newValue) { handle.useContents { texture = newValue?.handler?.reinterpret() } } 

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handle.useContents { status ?: error("pointer of WGPUSurfaceTexture is null") }
			set(newValue) { handle.useContents { status = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUSurfaceTexture {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override var texture: WGPUTexture?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.texture?.let(::NativeAddress)?.let { WGPUTexture(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.let { it.texture = newValue?.handler?.reinterpret() } } 

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.status ?: error("pointer of WGPUSurfaceTexture is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.let { it.status = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual var texture: WGPUTexture?
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
			nextInChain = this@WGPUSurfaceTexture.nextInChain?.reinterpret()
			texture = this@WGPUSurfaceTexture.texture?.handler?.reinterpret()
			status = this@WGPUSurfaceTexture.status
		}
	}
}

fun webgpu.native.WGPUSurfaceTexture.adapt(structure: WGPUSurfaceTexture) {
	nextInChain = structure.nextInChain?.reinterpret()
	texture = structure.texture?.handler?.reinterpret()
	status = structure.status
}

actual interface WGPUTexelCopyBufferLayout {
	value class ByValue(val handle: CValue<webgpu.native.WGPUTexelCopyBufferLayout>) : WGPUTexelCopyBufferLayout {
		override var offset: ULong
			get() = handle.useContents { offset ?: error("pointer of WGPUTexelCopyBufferLayout is null") }
			set(newValue) { handle.useContents { offset = newValue } } 

		override var bytesPerRow: UInt
			get() = handle.useContents { bytesPerRow ?: error("pointer of WGPUTexelCopyBufferLayout is null") }
			set(newValue) { handle.useContents { bytesPerRow = newValue } } 

		override var rowsPerImage: UInt
			get() = handle.useContents { rowsPerImage ?: error("pointer of WGPUTexelCopyBufferLayout is null") }
			set(newValue) { handle.useContents { rowsPerImage = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUTexelCopyBufferLayout {
		override var offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.offset ?: error("pointer of WGPUTexelCopyBufferLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.let { it.offset = newValue } } 

		override var bytesPerRow: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.bytesPerRow ?: error("pointer of WGPUTexelCopyBufferLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.let { it.bytesPerRow = newValue } } 

		override var rowsPerImage: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.rowsPerImage ?: error("pointer of WGPUTexelCopyBufferLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.let { it.rowsPerImage = newValue } } 

	}

	actual var offset: ULong
	actual var bytesPerRow: UInt
	actual var rowsPerImage: UInt
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferLayout {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferLayout {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyBufferLayout>())
				.let { WGPUTexelCopyBufferLayout(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTexelCopyBufferLayout) -> Unit): ArrayHolder<WGPUTexelCopyBufferLayout> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyBufferLayout>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUTexelCopyBufferLayout>())
							.let(::NativeAddress)
							.let { WGPUTexelCopyBufferLayout(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUTexelCopyBufferLayout> {
		return cValue<webgpu.native.WGPUTexelCopyBufferLayout> {
			offset = this@WGPUTexelCopyBufferLayout.offset
			bytesPerRow = this@WGPUTexelCopyBufferLayout.bytesPerRow
			rowsPerImage = this@WGPUTexelCopyBufferLayout.rowsPerImage
		}
	}
}

fun webgpu.native.WGPUTexelCopyBufferLayout.adapt(structure: WGPUTexelCopyBufferLayout) {
	offset = structure.offset
	bytesPerRow = structure.bytesPerRow
	rowsPerImage = structure.rowsPerImage
}

actual interface WGPUTexelCopyBufferInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUTexelCopyBufferInfo>) : WGPUTexelCopyBufferInfo {
		override val layout: WGPUTexelCopyBufferLayout
			get() = handle.useContents { layout.rawPtr.toLong().let(::NativeAddress).let { WGPUTexelCopyBufferLayout(it) } }

		override var buffer: WGPUBuffer?
			get() = handle.useContents { buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) } }
			set(newValue) { handle.useContents { buffer = newValue?.handler?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUTexelCopyBufferInfo {
		override val layout: WGPUTexelCopyBufferLayout
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferInfo>().pointed.layout.rawPtr.toLong().let(::NativeAddress).let { WGPUTexelCopyBufferLayout(it) }

		override var buffer: WGPUBuffer?
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferInfo>().pointed.buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTexelCopyBufferInfo>().pointed.let { it.buffer = newValue?.handler?.reinterpret() } } 

	}

	actual val layout: WGPUTexelCopyBufferLayout
	actual var buffer: WGPUBuffer?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyBufferInfo>())
				.let { WGPUTexelCopyBufferInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTexelCopyBufferInfo) -> Unit): ArrayHolder<WGPUTexelCopyBufferInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyBufferInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUTexelCopyBufferInfo>())
							.let(::NativeAddress)
							.let { WGPUTexelCopyBufferInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUTexelCopyBufferInfo> {
		return cValue<webgpu.native.WGPUTexelCopyBufferInfo> {
			layout.adapt(this@WGPUTexelCopyBufferInfo.layout)
			buffer = this@WGPUTexelCopyBufferInfo.buffer?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUTexelCopyBufferInfo.adapt(structure: WGPUTexelCopyBufferInfo) {
	layout.adapt(structure.layout)
	buffer = structure.buffer?.handler?.reinterpret()
}

actual interface WGPUTexelCopyTextureInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUTexelCopyTextureInfo>) : WGPUTexelCopyTextureInfo {
		override var texture: WGPUTexture?
			get() = handle.useContents { texture?.let(::NativeAddress)?.let { WGPUTexture(it) } }
			set(newValue) { handle.useContents { texture = newValue?.handler?.reinterpret() } } 

		override var mipLevel: UInt
			get() = handle.useContents { mipLevel ?: error("pointer of WGPUTexelCopyTextureInfo is null") }
			set(newValue) { handle.useContents { mipLevel = newValue } } 

		override val origin: WGPUOrigin3D
			get() = handle.useContents { origin.rawPtr.toLong().let(::NativeAddress).let { WGPUOrigin3D(it) } }

		override var aspect: WGPUTextureAspect
			get() = handle.useContents { aspect ?: error("pointer of WGPUTexelCopyTextureInfo is null") }
			set(newValue) { handle.useContents { aspect = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUTexelCopyTextureInfo {
		override var texture: WGPUTexture?
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.texture?.let(::NativeAddress)?.let { WGPUTexture(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.let { it.texture = newValue?.handler?.reinterpret() } } 

		override var mipLevel: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.mipLevel ?: error("pointer of WGPUTexelCopyTextureInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.let { it.mipLevel = newValue } } 

		override val origin: WGPUOrigin3D
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.origin.rawPtr.toLong().let(::NativeAddress).let { WGPUOrigin3D(it) }

		override var aspect: WGPUTextureAspect
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.aspect ?: error("pointer of WGPUTexelCopyTextureInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.let { it.aspect = newValue } } 

	}

	actual var texture: WGPUTexture?
	actual var mipLevel: UInt
	actual val origin: WGPUOrigin3D
	actual var aspect: WGPUTextureAspect
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUTexelCopyTextureInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyTextureInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyTextureInfo>())
				.let { WGPUTexelCopyTextureInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUTexelCopyTextureInfo) -> Unit): ArrayHolder<WGPUTexelCopyTextureInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyTextureInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUTexelCopyTextureInfo>())
							.let(::NativeAddress)
							.let { WGPUTexelCopyTextureInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUTexelCopyTextureInfo> {
		return cValue<webgpu.native.WGPUTexelCopyTextureInfo> {
			origin.adapt(this@WGPUTexelCopyTextureInfo.origin)
			texture = this@WGPUTexelCopyTextureInfo.texture?.handler?.reinterpret()
			mipLevel = this@WGPUTexelCopyTextureInfo.mipLevel
			aspect = this@WGPUTexelCopyTextureInfo.aspect
		}
	}
}

fun webgpu.native.WGPUTexelCopyTextureInfo.adapt(structure: WGPUTexelCopyTextureInfo) {
	origin.adapt(structure.origin)
	texture = structure.texture?.handler?.reinterpret()
	mipLevel = structure.mipLevel
	aspect = structure.aspect
}

actual interface WGPUTextureDescriptor {
	value class ByValue(val handle: CValue<webgpu.native.WGPUTextureDescriptor>) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) { handle.useContents { nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var usage: ULong
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

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var usage: ULong
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
	actual val label: WGPUStringView
	actual var usage: ULong
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
			label.adapt(this@WGPUTextureDescriptor.label)
			size.adapt(this@WGPUTextureDescriptor.size)
			nextInChain = this@WGPUTextureDescriptor.nextInChain?.reinterpret()
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
	label.adapt(structure.label)
	size.adapt(structure.size)
	nextInChain = structure.nextInChain?.reinterpret()
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

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

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

		override var usage: ULong
			get() = handle.useContents { usage ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) { handle.useContents { usage = newValue } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() } } 

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

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

		override var usage: ULong
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.usage ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.usage = newValue } } 

	}

	actual var nextInChain: NativeAddress?
	actual val label: WGPUStringView
	actual var format: WGPUTextureFormat
	actual var dimension: WGPUTextureViewDimension
	actual var baseMipLevel: UInt
	actual var mipLevelCount: UInt
	actual var baseArrayLayer: UInt
	actual var arrayLayerCount: UInt
	actual var aspect: WGPUTextureAspect
	actual var usage: ULong
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
			label.adapt(this@WGPUTextureViewDescriptor.label)
			nextInChain = this@WGPUTextureViewDescriptor.nextInChain?.reinterpret()
			format = this@WGPUTextureViewDescriptor.format
			dimension = this@WGPUTextureViewDescriptor.dimension
			baseMipLevel = this@WGPUTextureViewDescriptor.baseMipLevel
			mipLevelCount = this@WGPUTextureViewDescriptor.mipLevelCount
			baseArrayLayer = this@WGPUTextureViewDescriptor.baseArrayLayer
			arrayLayerCount = this@WGPUTextureViewDescriptor.arrayLayerCount
			aspect = this@WGPUTextureViewDescriptor.aspect
			usage = this@WGPUTextureViewDescriptor.usage
		}
	}
}

fun webgpu.native.WGPUTextureViewDescriptor.adapt(structure: WGPUTextureViewDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	format = structure.format
	dimension = structure.dimension
	baseMipLevel = structure.baseMipLevel
	mipLevelCount = structure.mipLevelCount
	baseArrayLayer = structure.baseArrayLayer
	arrayLayerCount = structure.arrayLayerCount
	aspect = structure.aspect
	usage = structure.usage
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
		override var stepMode: WGPUVertexStepMode
			get() = handle.useContents { stepMode ?: error("pointer of WGPUVertexBufferLayout is null") }
			set(newValue) { handle.useContents { stepMode = newValue } } 

		override var arrayStride: ULong
			get() = handle.useContents { arrayStride ?: error("pointer of WGPUVertexBufferLayout is null") }
			set(newValue) { handle.useContents { arrayStride = newValue } } 

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
		override var stepMode: WGPUVertexStepMode
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.stepMode ?: error("pointer of WGPUVertexBufferLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.stepMode = newValue } } 

		override var arrayStride: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.arrayStride ?: error("pointer of WGPUVertexBufferLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.arrayStride = newValue } } 

		override var attributeCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.attributeCount ?: error("pointer of WGPUVertexBufferLayout is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.attributeCount = newValue } } 

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.attributes?.let(::NativeAddress)?.let { ArrayHolder<WGPUVertexAttribute>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.attributes = newValue?.handler?.reinterpret() } } 

	}

	actual var stepMode: WGPUVertexStepMode
	actual var arrayStride: ULong
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
			stepMode = this@WGPUVertexBufferLayout.stepMode
			arrayStride = this@WGPUVertexBufferLayout.arrayStride
			attributeCount = this@WGPUVertexBufferLayout.attributeCount
			attributes = this@WGPUVertexBufferLayout.attributes?.handler?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUVertexBufferLayout.adapt(structure: WGPUVertexBufferLayout) {
	stepMode = structure.stepMode
	arrayStride = structure.arrayStride
	attributeCount = structure.attributeCount
	attributes = structure.attributes?.handler?.reinterpret()
}

actual interface WGPUInstanceExtras {
	value class ByValue(val handle: CValue<webgpu.native.WGPUInstanceExtras>) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var backends: ULong
			get() = handle.useContents { backends ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) { handle.useContents { backends = newValue } } 

		override var flags: ULong
			get() = handle.useContents { flags ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) { handle.useContents { flags = newValue } } 

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handle.useContents { dx12ShaderCompiler ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) { handle.useContents { dx12ShaderCompiler = newValue } } 

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handle.useContents { gles3MinorVersion ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) { handle.useContents { gles3MinorVersion = newValue } } 

		override val dxilPath: WGPUStringView
			get() = handle.useContents { dxilPath.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val dxcPath: WGPUStringView
			get() = handle.useContents { dxcPath.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var backends: ULong
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.backends ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.backends = newValue } } 

		override var flags: ULong
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.flags ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.flags = newValue } } 

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.dx12ShaderCompiler ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.dx12ShaderCompiler = newValue } } 

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.gles3MinorVersion ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.gles3MinorVersion = newValue } } 

		override val dxilPath: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.dxilPath.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override val dxcPath: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.dxcPath.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

	}

	actual val chain: WGPUChainedStruct
	actual var backends: ULong
	actual var flags: ULong
	actual var dx12ShaderCompiler: WGPUDx12Compiler
	actual var gles3MinorVersion: WGPUGles3MinorVersion
	actual val dxilPath: WGPUStringView
	actual val dxcPath: WGPUStringView
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
			dxilPath.adapt(this@WGPUInstanceExtras.dxilPath)
			dxcPath.adapt(this@WGPUInstanceExtras.dxcPath)
			backends = this@WGPUInstanceExtras.backends
			flags = this@WGPUInstanceExtras.flags
			dx12ShaderCompiler = this@WGPUInstanceExtras.dx12ShaderCompiler
			gles3MinorVersion = this@WGPUInstanceExtras.gles3MinorVersion
		}
	}
}

fun webgpu.native.WGPUInstanceExtras.adapt(structure: WGPUInstanceExtras) {
	chain.adapt(structure.chain)
	dxilPath.adapt(structure.dxilPath)
	dxcPath.adapt(structure.dxcPath)
	backends = structure.backends
	flags = structure.flags
	dx12ShaderCompiler = structure.dx12ShaderCompiler
	gles3MinorVersion = structure.gles3MinorVersion
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

actual interface WGPUBufferMapCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUBufferMapCallbackInfo>) : WGPUBufferMapCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUBufferMapCallbackInfo is null") }
			set(newValue) { handle.useContents { mode = newValue } } 

		override var callback: CallbackHolder<WGPUBufferMapCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUBufferMapCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUBufferMapCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.mode ?: error("pointer of WGPUBufferMapCallbackInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.mode = newValue } } 

		override var callback: CallbackHolder<WGPUBufferMapCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUBufferMapCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var mode: WGPUCallbackMode
	actual var callback: CallbackHolder<WGPUBufferMapCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUBufferMapCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUBufferMapCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBufferMapCallbackInfo>())
				.let { WGPUBufferMapCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUBufferMapCallbackInfo) -> Unit): ArrayHolder<WGPUBufferMapCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUBufferMapCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUBufferMapCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPUBufferMapCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUBufferMapCallbackInfo> {
		return cValue<webgpu.native.WGPUBufferMapCallbackInfo> {
			nextInChain = this@WGPUBufferMapCallbackInfo.nextInChain?.handler?.reinterpret()
			mode = this@WGPUBufferMapCallbackInfo.mode
			callback = this@WGPUBufferMapCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPUBufferMapCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPUBufferMapCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUBufferMapCallbackInfo.adapt(structure: WGPUBufferMapCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

actual interface WGPUCompilationInfoCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUCompilationInfoCallbackInfo>) : WGPUCompilationInfoCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUCompilationInfoCallbackInfo is null") }
			set(newValue) { handle.useContents { mode = newValue } } 

		override var callback: CallbackHolder<WGPUCompilationInfoCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCompilationInfoCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCompilationInfoCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.mode ?: error("pointer of WGPUCompilationInfoCallbackInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.mode = newValue } } 

		override var callback: CallbackHolder<WGPUCompilationInfoCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCompilationInfoCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var mode: WGPUCallbackMode
	actual var callback: CallbackHolder<WGPUCompilationInfoCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCompilationInfoCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfoCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCompilationInfoCallbackInfo>())
				.let { WGPUCompilationInfoCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCompilationInfoCallbackInfo) -> Unit): ArrayHolder<WGPUCompilationInfoCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCompilationInfoCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUCompilationInfoCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPUCompilationInfoCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUCompilationInfoCallbackInfo> {
		return cValue<webgpu.native.WGPUCompilationInfoCallbackInfo> {
			nextInChain = this@WGPUCompilationInfoCallbackInfo.nextInChain?.handler?.reinterpret()
			mode = this@WGPUCompilationInfoCallbackInfo.mode
			callback = this@WGPUCompilationInfoCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPUCompilationInfoCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPUCompilationInfoCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUCompilationInfoCallbackInfo.adapt(structure: WGPUCompilationInfoCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

actual interface WGPUCreateComputePipelineAsyncCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>) : WGPUCreateComputePipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUCreateComputePipelineAsyncCallbackInfo is null") }
			set(newValue) { handle.useContents { mode = newValue } } 

		override var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCreateComputePipelineAsyncCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCreateComputePipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.mode ?: error("pointer of WGPUCreateComputePipelineAsyncCallbackInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.mode = newValue } } 

		override var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCreateComputePipelineAsyncCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var mode: WGPUCallbackMode
	actual var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCreateComputePipelineAsyncCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCreateComputePipelineAsyncCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>())
				.let { WGPUCreateComputePipelineAsyncCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCreateComputePipelineAsyncCallbackInfo) -> Unit): ArrayHolder<WGPUCreateComputePipelineAsyncCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPUCreateComputePipelineAsyncCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo> {
		return cValue<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo> {
			nextInChain = this@WGPUCreateComputePipelineAsyncCallbackInfo.nextInChain?.handler?.reinterpret()
			mode = this@WGPUCreateComputePipelineAsyncCallbackInfo.mode
			callback = this@WGPUCreateComputePipelineAsyncCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPUCreateComputePipelineAsyncCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPUCreateComputePipelineAsyncCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo.adapt(structure: WGPUCreateComputePipelineAsyncCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

actual interface WGPUCreateRenderPipelineAsyncCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>) : WGPUCreateRenderPipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUCreateRenderPipelineAsyncCallbackInfo is null") }
			set(newValue) { handle.useContents { mode = newValue } } 

		override var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUCreateRenderPipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.mode ?: error("pointer of WGPUCreateRenderPipelineAsyncCallbackInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.mode = newValue } } 

		override var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var mode: WGPUCallbackMode
	actual var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUCreateRenderPipelineAsyncCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUCreateRenderPipelineAsyncCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>())
				.let { WGPUCreateRenderPipelineAsyncCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUCreateRenderPipelineAsyncCallbackInfo) -> Unit): ArrayHolder<WGPUCreateRenderPipelineAsyncCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPUCreateRenderPipelineAsyncCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo> {
		return cValue<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo> {
			nextInChain = this@WGPUCreateRenderPipelineAsyncCallbackInfo.nextInChain?.handler?.reinterpret()
			mode = this@WGPUCreateRenderPipelineAsyncCallbackInfo.mode
			callback = this@WGPUCreateRenderPipelineAsyncCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPUCreateRenderPipelineAsyncCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPUCreateRenderPipelineAsyncCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo.adapt(structure: WGPUCreateRenderPipelineAsyncCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

actual interface WGPUPopErrorScopeCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUPopErrorScopeCallbackInfo>) : WGPUPopErrorScopeCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUPopErrorScopeCallbackInfo is null") }
			set(newValue) { handle.useContents { mode = newValue } } 

		override var callback: CallbackHolder<WGPUPopErrorScopeCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUPopErrorScopeCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUPopErrorScopeCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.mode ?: error("pointer of WGPUPopErrorScopeCallbackInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.mode = newValue } } 

		override var callback: CallbackHolder<WGPUPopErrorScopeCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUPopErrorScopeCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var mode: WGPUCallbackMode
	actual var callback: CallbackHolder<WGPUPopErrorScopeCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUPopErrorScopeCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUPopErrorScopeCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUPopErrorScopeCallbackInfo>())
				.let { WGPUPopErrorScopeCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUPopErrorScopeCallbackInfo) -> Unit): ArrayHolder<WGPUPopErrorScopeCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUPopErrorScopeCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUPopErrorScopeCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPUPopErrorScopeCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUPopErrorScopeCallbackInfo> {
		return cValue<webgpu.native.WGPUPopErrorScopeCallbackInfo> {
			nextInChain = this@WGPUPopErrorScopeCallbackInfo.nextInChain?.handler?.reinterpret()
			mode = this@WGPUPopErrorScopeCallbackInfo.mode
			callback = this@WGPUPopErrorScopeCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPUPopErrorScopeCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPUPopErrorScopeCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUPopErrorScopeCallbackInfo.adapt(structure: WGPUPopErrorScopeCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

actual interface WGPUQueueWorkDoneCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPUQueueWorkDoneCallbackInfo>) : WGPUQueueWorkDoneCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUQueueWorkDoneCallbackInfo is null") }
			set(newValue) { handle.useContents { mode = newValue } } 

		override var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUQueueWorkDoneCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPUQueueWorkDoneCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.mode ?: error("pointer of WGPUQueueWorkDoneCallbackInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.mode = newValue } } 

		override var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUQueueWorkDoneCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var mode: WGPUCallbackMode
	actual var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPUQueueWorkDoneCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPUQueueWorkDoneCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPUQueueWorkDoneCallbackInfo>())
				.let { WGPUQueueWorkDoneCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPUQueueWorkDoneCallbackInfo) -> Unit): ArrayHolder<WGPUQueueWorkDoneCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPUQueueWorkDoneCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPUQueueWorkDoneCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPUQueueWorkDoneCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPUQueueWorkDoneCallbackInfo> {
		return cValue<webgpu.native.WGPUQueueWorkDoneCallbackInfo> {
			nextInChain = this@WGPUQueueWorkDoneCallbackInfo.nextInChain?.handler?.reinterpret()
			mode = this@WGPUQueueWorkDoneCallbackInfo.mode
			callback = this@WGPUQueueWorkDoneCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPUQueueWorkDoneCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPUQueueWorkDoneCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPUQueueWorkDoneCallbackInfo.adapt(structure: WGPUQueueWorkDoneCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

actual interface WGPURequestAdapterCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPURequestAdapterCallbackInfo>) : WGPURequestAdapterCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPURequestAdapterCallbackInfo is null") }
			set(newValue) { handle.useContents { mode = newValue } } 

		override var callback: CallbackHolder<WGPURequestAdapterCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPURequestAdapterCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURequestAdapterCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.mode ?: error("pointer of WGPURequestAdapterCallbackInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.mode = newValue } } 

		override var callback: CallbackHolder<WGPURequestAdapterCallback>?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPURequestAdapterCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var mode: WGPUCallbackMode
	actual var callback: CallbackHolder<WGPURequestAdapterCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURequestAdapterCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPURequestAdapterCallbackInfo>())
				.let { WGPURequestAdapterCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURequestAdapterCallbackInfo) -> Unit): ArrayHolder<WGPURequestAdapterCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURequestAdapterCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURequestAdapterCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPURequestAdapterCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURequestAdapterCallbackInfo> {
		return cValue<webgpu.native.WGPURequestAdapterCallbackInfo> {
			nextInChain = this@WGPURequestAdapterCallbackInfo.nextInChain?.handler?.reinterpret()
			mode = this@WGPURequestAdapterCallbackInfo.mode
			callback = this@WGPURequestAdapterCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPURequestAdapterCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPURequestAdapterCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURequestAdapterCallbackInfo.adapt(structure: WGPURequestAdapterCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

actual interface WGPURequestDeviceCallbackInfo {
	value class ByValue(val handle: CValue<webgpu.native.WGPURequestDeviceCallbackInfo>) : WGPURequestDeviceCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) { handle.useContents { nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPURequestDeviceCallbackInfo is null") }
			set(newValue) { handle.useContents { mode = newValue } } 

		override var callback: CallbackHolder<WGPURequestDeviceCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPURequestDeviceCallback>(it) } }
			set(newValue) { handle.useContents { callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) { handle.useContents { userdata2 = newValue?.reinterpret() } } 

		override val handler: NativeAddress
			get() = error("should not be call on CValue")

	}
	value class ByReference(override val handler: NativeAddress) : WGPURequestDeviceCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() } } 

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.mode ?: error("pointer of WGPURequestDeviceCallbackInfo is null")
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.mode = newValue } } 

		override var callback: CallbackHolder<WGPURequestDeviceCallback>?
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPURequestDeviceCallback>(it) }
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() } } 

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() } } 

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) { handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() } } 

	}

	actual var nextInChain: WGPUChainedStruct?
	actual var mode: WGPUCallbackMode
	actual var callback: CallbackHolder<WGPURequestDeviceCallback>?
	actual var userdata1: NativeAddress?
	actual var userdata2: NativeAddress?
	actual val handler: NativeAddress

	actual companion object {
		actual operator fun invoke(address: NativeAddress): WGPURequestDeviceCallbackInfo {
			return ByReference(address)
		}

		actual fun allocate(allocator: MemoryAllocator): WGPURequestDeviceCallbackInfo {
			return allocator.allocate(sizeOf<webgpu.native.WGPURequestDeviceCallbackInfo>())
				.let { WGPURequestDeviceCallbackInfo(it) }
		}

		actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  WGPURequestDeviceCallbackInfo) -> Unit): ArrayHolder<WGPURequestDeviceCallbackInfo> {
			return allocator.allocate(sizeOf<webgpu.native.WGPURequestDeviceCallbackInfo>() * size.toLong())
				.also {
					(0u until size).forEach { index ->
						(it.rawValue + index.toLong() * sizeOf<webgpu.native.WGPURequestDeviceCallbackInfo>())
							.let(::NativeAddress)
							.let { WGPURequestDeviceCallbackInfo(it) }
							.let { provider(index, it) }
					}
				}
				.let(::ArrayHolder)
		}
	}
	fun toCValue(): CValue<webgpu.native.WGPURequestDeviceCallbackInfo> {
		return cValue<webgpu.native.WGPURequestDeviceCallbackInfo> {
			nextInChain = this@WGPURequestDeviceCallbackInfo.nextInChain?.handler?.reinterpret()
			mode = this@WGPURequestDeviceCallbackInfo.mode
			callback = this@WGPURequestDeviceCallbackInfo.callback?.handler?.reinterpret()
			userdata1 = this@WGPURequestDeviceCallbackInfo.userdata1?.reinterpret()
			userdata2 = this@WGPURequestDeviceCallbackInfo.userdata2?.reinterpret()
		}
	}
}

fun webgpu.native.WGPURequestDeviceCallbackInfo.adapt(structure: WGPURequestDeviceCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

