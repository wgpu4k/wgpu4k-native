// This file has been generated DO NOT EDIT !!!
@file:OptIn(ExperimentalForeignApi::class)

package io.ygdrasil.wgpu

import ffi.ArrayHolder
import ffi.CString
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress
import ffi.toCString
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.OptIn
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit
import kotlin.jvm.JvmInline
import kotlinx.cinterop.CValue
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.cValue
import kotlinx.cinterop.pointed
import kotlinx.cinterop.sizeOf
import kotlinx.cinterop.toCPointer
import kotlinx.cinterop.toKString
import kotlinx.cinterop.toLong
import kotlinx.cinterop.useContents

public actual interface WGPUStringView {
	public actual var `data`: CString?

	public actual var length: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUStringView> = cValue<webgpu.native.WGPUStringView> {
		data = this@WGPUStringView.data?.handler?.reinterpret()
		length = this@WGPUStringView.length
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUStringView>,
	) : WGPUStringView {
		override var `data`: CString?
			get() = handle.useContents { data?.toCString() }
			set(newValue) {
				handle.useContents { data = newValue?.handler?.reinterpret() }
			}

		override var length: ULong
			get() = handle.useContents { length ?: error("pointer of WGPUStringView is null") }
			set(newValue) {
				handle.useContents { length = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUStringView {
		override var `data`: CString?
			get() = handler.reinterpret<webgpu.native.WGPUStringView>().pointed.data?.toCString()
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStringView>().pointed.let { it.data = newValue?.handler?.reinterpret() }
			}

		override var length: ULong
			get() = handler.reinterpret<webgpu.native.WGPUStringView>().pointed.length ?: error("pointer of WGPUStringView is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStringView>().pointed.let { it.length = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUStringView = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUStringView = allocator.allocate(sizeOf<webgpu.native.WGPUStringView>())
			.let { WGPUStringView(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStringView) -> Unit,
		): ArrayHolder<WGPUStringView> = allocator.allocate(sizeOf<webgpu.native.WGPUStringView>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPUAdapterInfo> = cValue<webgpu.native.WGPUAdapterInfo> {
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

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUAdapterInfo>,
	) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

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
			set(newValue) {
				handle.useContents { backendType = newValue }
			}

		override var adapterType: WGPUAdapterType
			get() = handle.useContents { adapterType ?: error("pointer of WGPUAdapterInfo is null") }
			set(newValue) {
				handle.useContents { adapterType = newValue }
			}

		override var vendorID: UInt
			get() = handle.useContents { vendorID ?: error("pointer of WGPUAdapterInfo is null") }
			set(newValue) {
				handle.useContents { vendorID = newValue }
			}

		override var deviceID: UInt
			get() = handle.useContents { deviceID ?: error("pointer of WGPUAdapterInfo is null") }
			set(newValue) {
				handle.useContents { deviceID = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUAdapterInfo {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

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
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.backendType = newValue }
			}

		override var adapterType: WGPUAdapterType
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.adapterType ?: error("pointer of WGPUAdapterInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.adapterType = newValue }
			}

		override var vendorID: UInt
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.vendorID ?: error("pointer of WGPUAdapterInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.vendorID = newValue }
			}

		override var deviceID: UInt
			get() = handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.deviceID ?: error("pointer of WGPUAdapterInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUAdapterInfo>().pointed.let { it.deviceID = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUAdapterInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUAdapterInfo = allocator.allocate(sizeOf<webgpu.native.WGPUAdapterInfo>())
			.let { WGPUAdapterInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUAdapterInfo) -> Unit,
		): ArrayHolder<WGPUAdapterInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUAdapterInfo>() * size.toLong())
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

public actual interface WGPUBindGroupDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var layout: WGPUBindGroupLayout?

	public actual var entryCount: ULong

	public actual var entries: ArrayHolder<WGPUBindGroupEntry>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUBindGroupDescriptor> = cValue<webgpu.native.WGPUBindGroupDescriptor> {
		label.adapt(this@WGPUBindGroupDescriptor.label)
		nextInChain = this@WGPUBindGroupDescriptor.nextInChain?.reinterpret()
		layout = this@WGPUBindGroupDescriptor.layout?.handler?.reinterpret()
		entryCount = this@WGPUBindGroupDescriptor.entryCount
		entries = this@WGPUBindGroupDescriptor.entries?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUBindGroupDescriptor>,
	) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var layout: WGPUBindGroupLayout?
			get() = handle.useContents { layout?.let(::NativeAddress)?.let { WGPUBindGroupLayout(it) } }
			set(newValue) {
				handle.useContents { layout = newValue?.handler?.reinterpret() }
			}

		override var entryCount: ULong
			get() = handle.useContents { entryCount ?: error("pointer of WGPUBindGroupDescriptor is null") }
			set(newValue) {
				handle.useContents { entryCount = newValue }
			}

		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = handle.useContents { entries?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupEntry>(it) } }
			set(newValue) {
				handle.useContents { entries = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBindGroupDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var layout: WGPUBindGroupLayout?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.layout?.let(::NativeAddress)?.let { WGPUBindGroupLayout(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.let { it.layout = newValue?.handler?.reinterpret() }
			}

		override var entryCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.entryCount ?: error("pointer of WGPUBindGroupDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.let { it.entryCount = newValue }
			}

		override var entries: ArrayHolder<WGPUBindGroupEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.entries?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupEntry>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupDescriptor>().pointed.let { it.entries = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupDescriptor>())
			.let { WGPUBindGroupDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupDescriptor) -> Unit,
		): ArrayHolder<WGPUBindGroupDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupDescriptor>() * size.toLong())
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

public actual interface WGPUBindGroupEntry {
	public actual var nextInChain: NativeAddress?

	public actual var binding: UInt

	public actual var buffer: WGPUBuffer?

	public actual var offset: ULong

	public actual var size: ULong

	public actual var sampler: WGPUSampler?

	public actual var textureView: WGPUTextureView?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUBindGroupEntry> = cValue<webgpu.native.WGPUBindGroupEntry> {
		nextInChain = this@WGPUBindGroupEntry.nextInChain?.reinterpret()
		binding = this@WGPUBindGroupEntry.binding
		buffer = this@WGPUBindGroupEntry.buffer?.handler?.reinterpret()
		offset = this@WGPUBindGroupEntry.offset
		size = this@WGPUBindGroupEntry.size
		sampler = this@WGPUBindGroupEntry.sampler?.handler?.reinterpret()
		textureView = this@WGPUBindGroupEntry.textureView?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUBindGroupEntry>,
	) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var binding: UInt
			get() = handle.useContents { binding ?: error("pointer of WGPUBindGroupEntry is null") }
			set(newValue) {
				handle.useContents { binding = newValue }
			}

		override var buffer: WGPUBuffer?
			get() = handle.useContents { buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) } }
			set(newValue) {
				handle.useContents { buffer = newValue?.handler?.reinterpret() }
			}

		override var offset: ULong
			get() = handle.useContents { offset ?: error("pointer of WGPUBindGroupEntry is null") }
			set(newValue) {
				handle.useContents { offset = newValue }
			}

		override var size: ULong
			get() = handle.useContents { size ?: error("pointer of WGPUBindGroupEntry is null") }
			set(newValue) {
				handle.useContents { size = newValue }
			}

		override var sampler: WGPUSampler?
			get() = handle.useContents { sampler?.let(::NativeAddress)?.let { WGPUSampler(it) } }
			set(newValue) {
				handle.useContents { sampler = newValue?.handler?.reinterpret() }
			}

		override var textureView: WGPUTextureView?
			get() = handle.useContents { textureView?.let(::NativeAddress)?.let { WGPUTextureView(it) } }
			set(newValue) {
				handle.useContents { textureView = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBindGroupEntry {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var binding: UInt
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.binding ?: error("pointer of WGPUBindGroupEntry is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.binding = newValue }
			}

		override var buffer: WGPUBuffer?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.buffer = newValue?.handler?.reinterpret() }
			}

		override var offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.offset ?: error("pointer of WGPUBindGroupEntry is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.offset = newValue }
			}

		override var size: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.size ?: error("pointer of WGPUBindGroupEntry is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.size = newValue }
			}

		override var sampler: WGPUSampler?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.sampler?.let(::NativeAddress)?.let { WGPUSampler(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.sampler = newValue?.handler?.reinterpret() }
			}

		override var textureView: WGPUTextureView?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.textureView?.let(::NativeAddress)?.let { WGPUTextureView(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupEntry>().pointed.let { it.textureView = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupEntry = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupEntry = allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupEntry>())
			.let { WGPUBindGroupEntry(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupEntry) -> Unit,
		): ArrayHolder<WGPUBindGroupEntry> = allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupEntry>() * size.toLong())
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

public actual interface WGPUBindGroupLayoutDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var entryCount: ULong

	public actual var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUBindGroupLayoutDescriptor> = cValue<webgpu.native.WGPUBindGroupLayoutDescriptor> {
		label.adapt(this@WGPUBindGroupLayoutDescriptor.label)
		nextInChain = this@WGPUBindGroupLayoutDescriptor.nextInChain?.reinterpret()
		entryCount = this@WGPUBindGroupLayoutDescriptor.entryCount
		entries = this@WGPUBindGroupLayoutDescriptor.entries?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUBindGroupLayoutDescriptor>,
	) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var entryCount: ULong
			get() = handle.useContents { entryCount ?: error("pointer of WGPUBindGroupLayoutDescriptor is null") }
			set(newValue) {
				handle.useContents { entryCount = newValue }
			}

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = handle.useContents { entries?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayoutEntry>(it) } }
			set(newValue) {
				handle.useContents { entries = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBindGroupLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var entryCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.entryCount ?: error("pointer of WGPUBindGroupLayoutDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.let { it.entryCount = newValue }
			}

		override var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.entries?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayoutEntry>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupLayoutDescriptor>().pointed.let { it.entries = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupLayoutDescriptor>())
			.let { WGPUBindGroupLayoutDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupLayoutDescriptor) -> Unit,
		): ArrayHolder<WGPUBindGroupLayoutDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupLayoutDescriptor>() * size.toLong())
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

public actual interface WGPUBufferBindingLayout {
	public actual var nextInChain: NativeAddress?

	public actual var type: WGPUBufferBindingType

	public actual var hasDynamicOffset: Boolean

	public actual var minBindingSize: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUBufferBindingLayout> = cValue<webgpu.native.WGPUBufferBindingLayout> {
		nextInChain = this@WGPUBufferBindingLayout.nextInChain?.reinterpret()
		type = this@WGPUBufferBindingLayout.type
		hasDynamicOffset = this@WGPUBufferBindingLayout.hasDynamicOffset.toUInt()
		minBindingSize = this@WGPUBufferBindingLayout.minBindingSize
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUBufferBindingLayout>,
	) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var type: WGPUBufferBindingType
			get() = handle.useContents { type ?: error("pointer of WGPUBufferBindingLayout is null") }
			set(newValue) {
				handle.useContents { type = newValue }
			}

		override var hasDynamicOffset: Boolean
			get() = handle.useContents { hasDynamicOffset.toBoolean() ?: error("pointer of WGPUBufferBindingLayout is null") }
			set(newValue) {
				handle.useContents { hasDynamicOffset = newValue.toUInt() }
			}

		override var minBindingSize: ULong
			get() = handle.useContents { minBindingSize ?: error("pointer of WGPUBufferBindingLayout is null") }
			set(newValue) {
				handle.useContents { minBindingSize = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBufferBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var type: WGPUBufferBindingType
			get() = handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.type ?: error("pointer of WGPUBufferBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.let { it.type = newValue }
			}

		override var hasDynamicOffset: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.hasDynamicOffset.toBoolean() ?: error("pointer of WGPUBufferBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.let { it.hasDynamicOffset = newValue.toUInt() }
			}

		override var minBindingSize: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.minBindingSize ?: error("pointer of WGPUBufferBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferBindingLayout>().pointed.let { it.minBindingSize = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBufferBindingLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBufferBindingLayout = allocator.allocate(sizeOf<webgpu.native.WGPUBufferBindingLayout>())
			.let { WGPUBufferBindingLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferBindingLayout) -> Unit,
		): ArrayHolder<WGPUBufferBindingLayout> = allocator.allocate(sizeOf<webgpu.native.WGPUBufferBindingLayout>() * size.toLong())
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

public actual interface WGPUSamplerBindingLayout {
	public actual var nextInChain: NativeAddress?

	public actual var type: WGPUSamplerBindingType

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSamplerBindingLayout> = cValue<webgpu.native.WGPUSamplerBindingLayout> {
		nextInChain = this@WGPUSamplerBindingLayout.nextInChain?.reinterpret()
		type = this@WGPUSamplerBindingLayout.type
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSamplerBindingLayout>,
	) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var type: WGPUSamplerBindingType
			get() = handle.useContents { type ?: error("pointer of WGPUSamplerBindingLayout is null") }
			set(newValue) {
				handle.useContents { type = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSamplerBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSamplerBindingLayout>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerBindingLayout>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var type: WGPUSamplerBindingType
			get() = handler.reinterpret<webgpu.native.WGPUSamplerBindingLayout>().pointed.type ?: error("pointer of WGPUSamplerBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerBindingLayout>().pointed.let { it.type = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSamplerBindingLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSamplerBindingLayout = allocator.allocate(sizeOf<webgpu.native.WGPUSamplerBindingLayout>())
			.let { WGPUSamplerBindingLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSamplerBindingLayout) -> Unit,
		): ArrayHolder<WGPUSamplerBindingLayout> = allocator.allocate(sizeOf<webgpu.native.WGPUSamplerBindingLayout>() * size.toLong())
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

public actual interface WGPUTextureBindingLayout {
	public actual var nextInChain: NativeAddress?

	public actual var sampleType: WGPUTextureSampleType

	public actual var viewDimension: WGPUTextureViewDimension

	public actual var multisampled: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUTextureBindingLayout> = cValue<webgpu.native.WGPUTextureBindingLayout> {
		nextInChain = this@WGPUTextureBindingLayout.nextInChain?.reinterpret()
		sampleType = this@WGPUTextureBindingLayout.sampleType
		viewDimension = this@WGPUTextureBindingLayout.viewDimension
		multisampled = this@WGPUTextureBindingLayout.multisampled.toUInt()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUTextureBindingLayout>,
	) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var sampleType: WGPUTextureSampleType
			get() = handle.useContents { sampleType ?: error("pointer of WGPUTextureBindingLayout is null") }
			set(newValue) {
				handle.useContents { sampleType = newValue }
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.useContents { viewDimension ?: error("pointer of WGPUTextureBindingLayout is null") }
			set(newValue) {
				handle.useContents { viewDimension = newValue }
			}

		override var multisampled: Boolean
			get() = handle.useContents { multisampled.toBoolean() ?: error("pointer of WGPUTextureBindingLayout is null") }
			set(newValue) {
				handle.useContents { multisampled = newValue.toUInt() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var sampleType: WGPUTextureSampleType
			get() = handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.sampleType ?: error("pointer of WGPUTextureBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.let { it.sampleType = newValue }
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.viewDimension ?: error("pointer of WGPUTextureBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.let { it.viewDimension = newValue }
			}

		override var multisampled: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.multisampled.toBoolean() ?: error("pointer of WGPUTextureBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureBindingLayout>().pointed.let { it.multisampled = newValue.toUInt() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTextureBindingLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTextureBindingLayout = allocator.allocate(sizeOf<webgpu.native.WGPUTextureBindingLayout>())
			.let { WGPUTextureBindingLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureBindingLayout) -> Unit,
		): ArrayHolder<WGPUTextureBindingLayout> = allocator.allocate(sizeOf<webgpu.native.WGPUTextureBindingLayout>() * size.toLong())
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

public actual interface WGPUStorageTextureBindingLayout {
	public actual var nextInChain: NativeAddress?

	public actual var access: WGPUStorageTextureAccess

	public actual var format: WGPUTextureFormat

	public actual var viewDimension: WGPUTextureViewDimension

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUStorageTextureBindingLayout> = cValue<webgpu.native.WGPUStorageTextureBindingLayout> {
		nextInChain = this@WGPUStorageTextureBindingLayout.nextInChain?.reinterpret()
		access = this@WGPUStorageTextureBindingLayout.access
		format = this@WGPUStorageTextureBindingLayout.format
		viewDimension = this@WGPUStorageTextureBindingLayout.viewDimension
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUStorageTextureBindingLayout>,
	) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var access: WGPUStorageTextureAccess
			get() = handle.useContents { access ?: error("pointer of WGPUStorageTextureBindingLayout is null") }
			set(newValue) {
				handle.useContents { access = newValue }
			}

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUStorageTextureBindingLayout is null") }
			set(newValue) {
				handle.useContents { format = newValue }
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = handle.useContents { viewDimension ?: error("pointer of WGPUStorageTextureBindingLayout is null") }
			set(newValue) {
				handle.useContents { viewDimension = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUStorageTextureBindingLayout {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var access: WGPUStorageTextureAccess
			get() = handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.access ?: error("pointer of WGPUStorageTextureBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.let { it.access = newValue }
			}

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.format ?: error("pointer of WGPUStorageTextureBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.let { it.format = newValue }
			}

		override var viewDimension: WGPUTextureViewDimension
			get() = handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.viewDimension ?: error("pointer of WGPUStorageTextureBindingLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStorageTextureBindingLayout>().pointed.let { it.viewDimension = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUStorageTextureBindingLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUStorageTextureBindingLayout = allocator.allocate(sizeOf<webgpu.native.WGPUStorageTextureBindingLayout>())
			.let { WGPUStorageTextureBindingLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStorageTextureBindingLayout) -> Unit,
		): ArrayHolder<WGPUStorageTextureBindingLayout> = allocator.allocate(sizeOf<webgpu.native.WGPUStorageTextureBindingLayout>() * size.toLong())
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

public actual interface WGPUBindGroupLayoutEntry {
	public actual var nextInChain: NativeAddress?

	public actual var binding: UInt

	public actual var visibility: ULong

	public actual val buffer: WGPUBufferBindingLayout

	public actual val sampler: WGPUSamplerBindingLayout

	public actual val texture: WGPUTextureBindingLayout

	public actual val storageTexture: WGPUStorageTextureBindingLayout

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUBindGroupLayoutEntry> = cValue<webgpu.native.WGPUBindGroupLayoutEntry> {
		buffer.adapt(this@WGPUBindGroupLayoutEntry.buffer)
		sampler.adapt(this@WGPUBindGroupLayoutEntry.sampler)
		texture.adapt(this@WGPUBindGroupLayoutEntry.texture)
		storageTexture.adapt(this@WGPUBindGroupLayoutEntry.storageTexture)
		nextInChain = this@WGPUBindGroupLayoutEntry.nextInChain?.reinterpret()
		binding = this@WGPUBindGroupLayoutEntry.binding
		visibility = this@WGPUBindGroupLayoutEntry.visibility
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUBindGroupLayoutEntry>,
	) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var binding: UInt
			get() = handle.useContents { binding ?: error("pointer of WGPUBindGroupLayoutEntry is null") }
			set(newValue) {
				handle.useContents { binding = newValue }
			}

		override var visibility: ULong
			get() = handle.useContents { visibility ?: error("pointer of WGPUBindGroupLayoutEntry is null") }
			set(newValue) {
				handle.useContents { visibility = newValue }
			}

		override val buffer: WGPUBufferBindingLayout
			get() = handle.useContents { buffer.rawPtr.toLong().let(::NativeAddress).let { WGPUBufferBindingLayout(it) } }

		override val sampler: WGPUSamplerBindingLayout
			get() = handle.useContents { sampler.rawPtr.toLong().let(::NativeAddress).let { WGPUSamplerBindingLayout(it) } }

		override val texture: WGPUTextureBindingLayout
			get() = handle.useContents { texture.rawPtr.toLong().let(::NativeAddress).let { WGPUTextureBindingLayout(it) } }

		override val storageTexture: WGPUStorageTextureBindingLayout
			get() = handle.useContents { storageTexture.rawPtr.toLong().let(::NativeAddress).let { WGPUStorageTextureBindingLayout(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBindGroupLayoutEntry {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var binding: UInt
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.binding ?: error("pointer of WGPUBindGroupLayoutEntry is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.let { it.binding = newValue }
			}

		override var visibility: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.visibility ?: error("pointer of WGPUBindGroupLayoutEntry is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.let { it.visibility = newValue }
			}

		override val buffer: WGPUBufferBindingLayout
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.buffer.rawPtr.toLong().let(::NativeAddress).let { WGPUBufferBindingLayout(it) }

		override val sampler: WGPUSamplerBindingLayout
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.sampler.rawPtr.toLong().let(::NativeAddress).let { WGPUSamplerBindingLayout(it) }

		override val texture: WGPUTextureBindingLayout
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.texture.rawPtr.toLong().let(::NativeAddress).let { WGPUTextureBindingLayout(it) }

		override val storageTexture: WGPUStorageTextureBindingLayout
			get() = handler.reinterpret<webgpu.native.WGPUBindGroupLayoutEntry>().pointed.storageTexture.rawPtr.toLong().let(::NativeAddress).let { WGPUStorageTextureBindingLayout(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutEntry = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutEntry = allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupLayoutEntry>())
			.let { WGPUBindGroupLayoutEntry(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupLayoutEntry) -> Unit,
		): ArrayHolder<WGPUBindGroupLayoutEntry> = allocator.allocate(sizeOf<webgpu.native.WGPUBindGroupLayoutEntry>() * size.toLong())
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

public actual interface WGPUBlendComponent {
	public actual var operation: WGPUBlendOperation

	public actual var srcFactor: WGPUBlendFactor

	public actual var dstFactor: WGPUBlendFactor

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUBlendComponent> = cValue<webgpu.native.WGPUBlendComponent> {
		operation = this@WGPUBlendComponent.operation
		srcFactor = this@WGPUBlendComponent.srcFactor
		dstFactor = this@WGPUBlendComponent.dstFactor
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUBlendComponent>,
	) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = handle.useContents { operation ?: error("pointer of WGPUBlendComponent is null") }
			set(newValue) {
				handle.useContents { operation = newValue }
			}

		override var srcFactor: WGPUBlendFactor
			get() = handle.useContents { srcFactor ?: error("pointer of WGPUBlendComponent is null") }
			set(newValue) {
				handle.useContents { srcFactor = newValue }
			}

		override var dstFactor: WGPUBlendFactor
			get() = handle.useContents { dstFactor ?: error("pointer of WGPUBlendComponent is null") }
			set(newValue) {
				handle.useContents { dstFactor = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBlendComponent {
		override var operation: WGPUBlendOperation
			get() = handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.operation ?: error("pointer of WGPUBlendComponent is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.let { it.operation = newValue }
			}

		override var srcFactor: WGPUBlendFactor
			get() = handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.srcFactor ?: error("pointer of WGPUBlendComponent is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.let { it.srcFactor = newValue }
			}

		override var dstFactor: WGPUBlendFactor
			get() = handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.dstFactor ?: error("pointer of WGPUBlendComponent is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBlendComponent>().pointed.let { it.dstFactor = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBlendComponent = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBlendComponent = allocator.allocate(sizeOf<webgpu.native.WGPUBlendComponent>())
			.let { WGPUBlendComponent(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBlendComponent) -> Unit,
		): ArrayHolder<WGPUBlendComponent> = allocator.allocate(sizeOf<webgpu.native.WGPUBlendComponent>() * size.toLong())
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

public actual interface WGPUBlendState {
	public actual val color: WGPUBlendComponent

	public actual val alpha: WGPUBlendComponent

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUBlendState> = cValue<webgpu.native.WGPUBlendState> {
		color.adapt(this@WGPUBlendState.color)
		alpha.adapt(this@WGPUBlendState.alpha)
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUBlendState>,
	) : WGPUBlendState {
		override val color: WGPUBlendComponent
			get() = handle.useContents { color.rawPtr.toLong().let(::NativeAddress).let { WGPUBlendComponent(it) } }

		override val alpha: WGPUBlendComponent
			get() = handle.useContents { alpha.rawPtr.toLong().let(::NativeAddress).let { WGPUBlendComponent(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBlendState {
		override val color: WGPUBlendComponent
			get() = handler.reinterpret<webgpu.native.WGPUBlendState>().pointed.color.rawPtr.toLong().let(::NativeAddress).let { WGPUBlendComponent(it) }

		override val alpha: WGPUBlendComponent
			get() = handler.reinterpret<webgpu.native.WGPUBlendState>().pointed.alpha.rawPtr.toLong().let(::NativeAddress).let { WGPUBlendComponent(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBlendState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBlendState = allocator.allocate(sizeOf<webgpu.native.WGPUBlendState>())
			.let { WGPUBlendState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBlendState) -> Unit,
		): ArrayHolder<WGPUBlendState> = allocator.allocate(sizeOf<webgpu.native.WGPUBlendState>() * size.toLong())
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

public actual interface WGPUBufferDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var usage: ULong

	public actual var size: ULong

	public actual var mappedAtCreation: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUBufferDescriptor> = cValue<webgpu.native.WGPUBufferDescriptor> {
		label.adapt(this@WGPUBufferDescriptor.label)
		nextInChain = this@WGPUBufferDescriptor.nextInChain?.reinterpret()
		usage = this@WGPUBufferDescriptor.usage
		size = this@WGPUBufferDescriptor.size
		mappedAtCreation = this@WGPUBufferDescriptor.mappedAtCreation.toUInt()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUBufferDescriptor>,
	) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var usage: ULong
			get() = handle.useContents { usage ?: error("pointer of WGPUBufferDescriptor is null") }
			set(newValue) {
				handle.useContents { usage = newValue }
			}

		override var size: ULong
			get() = handle.useContents { size ?: error("pointer of WGPUBufferDescriptor is null") }
			set(newValue) {
				handle.useContents { size = newValue }
			}

		override var mappedAtCreation: Boolean
			get() = handle.useContents { mappedAtCreation.toBoolean() ?: error("pointer of WGPUBufferDescriptor is null") }
			set(newValue) {
				handle.useContents { mappedAtCreation = newValue.toUInt() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var usage: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.usage ?: error("pointer of WGPUBufferDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.let { it.usage = newValue }
			}

		override var size: ULong
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.size ?: error("pointer of WGPUBufferDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.let { it.size = newValue }
			}

		override var mappedAtCreation: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.mappedAtCreation.toBoolean() ?: error("pointer of WGPUBufferDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferDescriptor>().pointed.let { it.mappedAtCreation = newValue.toUInt() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBufferDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBufferDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUBufferDescriptor>())
			.let { WGPUBufferDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferDescriptor) -> Unit,
		): ArrayHolder<WGPUBufferDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUBufferDescriptor>() * size.toLong())
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

public actual interface WGPUColor {
	public actual var r: Double

	public actual var g: Double

	public actual var b: Double

	public actual var a: Double

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUColor> = cValue<webgpu.native.WGPUColor> {
		r = this@WGPUColor.r
		g = this@WGPUColor.g
		b = this@WGPUColor.b
		a = this@WGPUColor.a
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUColor>,
	) : WGPUColor {
		override var r: Double
			get() = handle.useContents { r ?: error("pointer of WGPUColor is null") }
			set(newValue) {
				handle.useContents { r = newValue }
			}

		override var g: Double
			get() = handle.useContents { g ?: error("pointer of WGPUColor is null") }
			set(newValue) {
				handle.useContents { g = newValue }
			}

		override var b: Double
			get() = handle.useContents { b ?: error("pointer of WGPUColor is null") }
			set(newValue) {
				handle.useContents { b = newValue }
			}

		override var a: Double
			get() = handle.useContents { a ?: error("pointer of WGPUColor is null") }
			set(newValue) {
				handle.useContents { a = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUColor {
		override var r: Double
			get() = handler.reinterpret<webgpu.native.WGPUColor>().pointed.r ?: error("pointer of WGPUColor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUColor>().pointed.let { it.r = newValue }
			}

		override var g: Double
			get() = handler.reinterpret<webgpu.native.WGPUColor>().pointed.g ?: error("pointer of WGPUColor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUColor>().pointed.let { it.g = newValue }
			}

		override var b: Double
			get() = handler.reinterpret<webgpu.native.WGPUColor>().pointed.b ?: error("pointer of WGPUColor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUColor>().pointed.let { it.b = newValue }
			}

		override var a: Double
			get() = handler.reinterpret<webgpu.native.WGPUColor>().pointed.a ?: error("pointer of WGPUColor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUColor>().pointed.let { it.a = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUColor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUColor = allocator.allocate(sizeOf<webgpu.native.WGPUColor>())
			.let { WGPUColor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUColor) -> Unit,
		): ArrayHolder<WGPUColor> = allocator.allocate(sizeOf<webgpu.native.WGPUColor>() * size.toLong())
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

public actual interface WGPUColorTargetState {
	public actual var nextInChain: NativeAddress?

	public actual var format: WGPUTextureFormat

	public actual var blend: WGPUBlendState?

	public actual var writeMask: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUColorTargetState> = cValue<webgpu.native.WGPUColorTargetState> {
		nextInChain = this@WGPUColorTargetState.nextInChain?.reinterpret()
		format = this@WGPUColorTargetState.format
		blend = this@WGPUColorTargetState.blend?.handler?.reinterpret()
		writeMask = this@WGPUColorTargetState.writeMask
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUColorTargetState>,
	) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUColorTargetState is null") }
			set(newValue) {
				handle.useContents { format = newValue }
			}

		override var blend: WGPUBlendState?
			get() = handle.useContents { blend?.let(::NativeAddress)?.let { WGPUBlendState(it) } }
			set(newValue) {
				handle.useContents { blend = newValue?.handler?.reinterpret() }
			}

		override var writeMask: ULong
			get() = handle.useContents { writeMask ?: error("pointer of WGPUColorTargetState is null") }
			set(newValue) {
				handle.useContents { writeMask = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUColorTargetState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.format ?: error("pointer of WGPUColorTargetState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.let { it.format = newValue }
			}

		override var blend: WGPUBlendState?
			get() = handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.blend?.let(::NativeAddress)?.let { WGPUBlendState(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.let { it.blend = newValue?.handler?.reinterpret() }
			}

		override var writeMask: ULong
			get() = handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.writeMask ?: error("pointer of WGPUColorTargetState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUColorTargetState>().pointed.let { it.writeMask = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUColorTargetState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUColorTargetState = allocator.allocate(sizeOf<webgpu.native.WGPUColorTargetState>())
			.let { WGPUColorTargetState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUColorTargetState) -> Unit,
		): ArrayHolder<WGPUColorTargetState> = allocator.allocate(sizeOf<webgpu.native.WGPUColorTargetState>() * size.toLong())
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

public actual interface WGPUCommandBufferDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUCommandBufferDescriptor> = cValue<webgpu.native.WGPUCommandBufferDescriptor> {
		label.adapt(this@WGPUCommandBufferDescriptor.label)
		nextInChain = this@WGPUCommandBufferDescriptor.nextInChain?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUCommandBufferDescriptor>,
	) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCommandBufferDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUCommandBufferDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCommandBufferDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCommandBufferDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUCommandBufferDescriptor>())
			.let { WGPUCommandBufferDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCommandBufferDescriptor) -> Unit,
		): ArrayHolder<WGPUCommandBufferDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUCommandBufferDescriptor>() * size.toLong())
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

public actual interface WGPUCommandEncoderDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUCommandEncoderDescriptor> = cValue<webgpu.native.WGPUCommandEncoderDescriptor> {
		label.adapt(this@WGPUCommandEncoderDescriptor.label)
		nextInChain = this@WGPUCommandEncoderDescriptor.nextInChain?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUCommandEncoderDescriptor>,
	) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCommandEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUCommandEncoderDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCommandEncoderDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCommandEncoderDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUCommandEncoderDescriptor>())
			.let { WGPUCommandEncoderDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCommandEncoderDescriptor) -> Unit,
		): ArrayHolder<WGPUCommandEncoderDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUCommandEncoderDescriptor>() * size.toLong())
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

public actual interface WGPUCompilationInfo {
	public actual var nextInChain: NativeAddress?

	public actual var messageCount: ULong

	public actual var messages: ArrayHolder<WGPUCompilationMessage>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUCompilationInfo> = cValue<webgpu.native.WGPUCompilationInfo> {
		nextInChain = this@WGPUCompilationInfo.nextInChain?.reinterpret()
		messageCount = this@WGPUCompilationInfo.messageCount
		messages = this@WGPUCompilationInfo.messages?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUCompilationInfo>,
	) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var messageCount: ULong
			get() = handle.useContents { messageCount ?: error("pointer of WGPUCompilationInfo is null") }
			set(newValue) {
				handle.useContents { messageCount = newValue }
			}

		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = handle.useContents { messages?.let(::NativeAddress)?.let { ArrayHolder<WGPUCompilationMessage>(it) } }
			set(newValue) {
				handle.useContents { messages = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCompilationInfo {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var messageCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.messageCount ?: error("pointer of WGPUCompilationInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.let { it.messageCount = newValue }
			}

		override var messages: ArrayHolder<WGPUCompilationMessage>?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.messages?.let(::NativeAddress)?.let { ArrayHolder<WGPUCompilationMessage>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationInfo>().pointed.let { it.messages = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCompilationInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfo = allocator.allocate(sizeOf<webgpu.native.WGPUCompilationInfo>())
			.let { WGPUCompilationInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationInfo) -> Unit,
		): ArrayHolder<WGPUCompilationInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUCompilationInfo>() * size.toLong())
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

public actual interface WGPUCompilationMessage {
	public actual var nextInChain: NativeAddress?

	public actual val message: WGPUStringView

	public actual var type: WGPUCompilationMessageType

	public actual var lineNum: ULong

	public actual var linePos: ULong

	public actual var offset: ULong

	public actual var length: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUCompilationMessage> = cValue<webgpu.native.WGPUCompilationMessage> {
		message.adapt(this@WGPUCompilationMessage.message)
		nextInChain = this@WGPUCompilationMessage.nextInChain?.reinterpret()
		type = this@WGPUCompilationMessage.type
		lineNum = this@WGPUCompilationMessage.lineNum
		linePos = this@WGPUCompilationMessage.linePos
		offset = this@WGPUCompilationMessage.offset
		length = this@WGPUCompilationMessage.length
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUCompilationMessage>,
	) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val message: WGPUStringView
			get() = handle.useContents { message.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var type: WGPUCompilationMessageType
			get() = handle.useContents { type ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) {
				handle.useContents { type = newValue }
			}

		override var lineNum: ULong
			get() = handle.useContents { lineNum ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) {
				handle.useContents { lineNum = newValue }
			}

		override var linePos: ULong
			get() = handle.useContents { linePos ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) {
				handle.useContents { linePos = newValue }
			}

		override var offset: ULong
			get() = handle.useContents { offset ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) {
				handle.useContents { offset = newValue }
			}

		override var length: ULong
			get() = handle.useContents { length ?: error("pointer of WGPUCompilationMessage is null") }
			set(newValue) {
				handle.useContents { length = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCompilationMessage {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val message: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.message.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var type: WGPUCompilationMessageType
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.type ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.type = newValue }
			}

		override var lineNum: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.lineNum ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.lineNum = newValue }
			}

		override var linePos: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.linePos ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.linePos = newValue }
			}

		override var offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.offset ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.offset = newValue }
			}

		override var length: ULong
			get() = handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.length ?: error("pointer of WGPUCompilationMessage is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationMessage>().pointed.let { it.length = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCompilationMessage = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCompilationMessage = allocator.allocate(sizeOf<webgpu.native.WGPUCompilationMessage>())
			.let { WGPUCompilationMessage(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationMessage) -> Unit,
		): ArrayHolder<WGPUCompilationMessage> = allocator.allocate(sizeOf<webgpu.native.WGPUCompilationMessage>() * size.toLong())
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

public actual interface WGPUComputePassDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var timestampWrites: WGPUComputePassTimestampWrites?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUComputePassDescriptor> = cValue<webgpu.native.WGPUComputePassDescriptor> {
		label.adapt(this@WGPUComputePassDescriptor.label)
		nextInChain = this@WGPUComputePassDescriptor.nextInChain?.reinterpret()
		timestampWrites = this@WGPUComputePassDescriptor.timestampWrites?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUComputePassDescriptor>,
	) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = handle.useContents { timestampWrites?.let(::NativeAddress)?.let { WGPUComputePassTimestampWrites(it) } }
			set(newValue) {
				handle.useContents { timestampWrites = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUComputePassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var timestampWrites: WGPUComputePassTimestampWrites?
			get() = handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.timestampWrites?.let(::NativeAddress)?.let { WGPUComputePassTimestampWrites(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUComputePassDescriptor>().pointed.let { it.timestampWrites = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUComputePassDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUComputePassDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUComputePassDescriptor>())
			.let { WGPUComputePassDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePassDescriptor) -> Unit,
		): ArrayHolder<WGPUComputePassDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUComputePassDescriptor>() * size.toLong())
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

public actual interface WGPUComputePassTimestampWrites {
	public actual var querySet: WGPUQuerySet?

	public actual var beginningOfPassWriteIndex: UInt

	public actual var endOfPassWriteIndex: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUComputePassTimestampWrites> = cValue<webgpu.native.WGPUComputePassTimestampWrites> {
		querySet = this@WGPUComputePassTimestampWrites.querySet?.handler?.reinterpret()
		beginningOfPassWriteIndex = this@WGPUComputePassTimestampWrites.beginningOfPassWriteIndex
		endOfPassWriteIndex = this@WGPUComputePassTimestampWrites.endOfPassWriteIndex
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUComputePassTimestampWrites>,
	) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.useContents { querySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) } }
			set(newValue) {
				handle.useContents { querySet = newValue?.handler?.reinterpret() }
			}

		override var beginningOfPassWriteIndex: UInt
			get() = handle.useContents { beginningOfPassWriteIndex ?: error("pointer of WGPUComputePassTimestampWrites is null") }
			set(newValue) {
				handle.useContents { beginningOfPassWriteIndex = newValue }
			}

		override var endOfPassWriteIndex: UInt
			get() = handle.useContents { endOfPassWriteIndex ?: error("pointer of WGPUComputePassTimestampWrites is null") }
			set(newValue) {
				handle.useContents { endOfPassWriteIndex = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUComputePassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.querySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.let { it.querySet = newValue?.handler?.reinterpret() }
			}

		override var beginningOfPassWriteIndex: UInt
			get() = handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.beginningOfPassWriteIndex ?: error("pointer of WGPUComputePassTimestampWrites is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.let { it.beginningOfPassWriteIndex = newValue }
			}

		override var endOfPassWriteIndex: UInt
			get() = handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.endOfPassWriteIndex ?: error("pointer of WGPUComputePassTimestampWrites is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUComputePassTimestampWrites>().pointed.let { it.endOfPassWriteIndex = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUComputePassTimestampWrites = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUComputePassTimestampWrites = allocator.allocate(sizeOf<webgpu.native.WGPUComputePassTimestampWrites>())
			.let { WGPUComputePassTimestampWrites(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePassTimestampWrites) -> Unit,
		): ArrayHolder<WGPUComputePassTimestampWrites> = allocator.allocate(sizeOf<webgpu.native.WGPUComputePassTimestampWrites>() * size.toLong())
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

public actual interface WGPUProgrammableStageDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual var module: WGPUShaderModule?

	public actual val entryPoint: WGPUStringView

	public actual var constantCount: ULong

	public actual var constants: ArrayHolder<WGPUConstantEntry>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUProgrammableStageDescriptor> = cValue<webgpu.native.WGPUProgrammableStageDescriptor> {
		entryPoint.adapt(this@WGPUProgrammableStageDescriptor.entryPoint)
		nextInChain = this@WGPUProgrammableStageDescriptor.nextInChain?.reinterpret()
		module = this@WGPUProgrammableStageDescriptor.module?.handler?.reinterpret()
		constantCount = this@WGPUProgrammableStageDescriptor.constantCount
		constants = this@WGPUProgrammableStageDescriptor.constants?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUProgrammableStageDescriptor>,
	) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var module: WGPUShaderModule?
			get() = handle.useContents { module?.let(::NativeAddress)?.let { WGPUShaderModule(it) } }
			set(newValue) {
				handle.useContents { module = newValue?.handler?.reinterpret() }
			}

		override val entryPoint: WGPUStringView
			get() = handle.useContents { entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var constantCount: ULong
			get() = handle.useContents { constantCount ?: error("pointer of WGPUProgrammableStageDescriptor is null") }
			set(newValue) {
				handle.useContents { constantCount = newValue }
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.useContents { constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) } }
			set(newValue) {
				handle.useContents { constants = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUProgrammableStageDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var module: WGPUShaderModule?
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.module?.let(::NativeAddress)?.let { WGPUShaderModule(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.module = newValue?.handler?.reinterpret() }
			}

		override val entryPoint: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var constantCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.constantCount ?: error("pointer of WGPUProgrammableStageDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.constantCount = newValue }
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUProgrammableStageDescriptor>().pointed.let { it.constants = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUProgrammableStageDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUProgrammableStageDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUProgrammableStageDescriptor>())
			.let { WGPUProgrammableStageDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUProgrammableStageDescriptor) -> Unit,
		): ArrayHolder<WGPUProgrammableStageDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUProgrammableStageDescriptor>() * size.toLong())
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

public actual interface WGPUComputePipelineDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var layout: WGPUPipelineLayout?

	public actual val compute: WGPUProgrammableStageDescriptor

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUComputePipelineDescriptor> = cValue<webgpu.native.WGPUComputePipelineDescriptor> {
		label.adapt(this@WGPUComputePipelineDescriptor.label)
		compute.adapt(this@WGPUComputePipelineDescriptor.compute)
		nextInChain = this@WGPUComputePipelineDescriptor.nextInChain?.reinterpret()
		layout = this@WGPUComputePipelineDescriptor.layout?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUComputePipelineDescriptor>,
	) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var layout: WGPUPipelineLayout?
			get() = handle.useContents { layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) } }
			set(newValue) {
				handle.useContents { layout = newValue?.handler?.reinterpret() }
			}

		override val compute: WGPUProgrammableStageDescriptor
			get() = handle.useContents { compute.rawPtr.toLong().let(::NativeAddress).let { WGPUProgrammableStageDescriptor(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUComputePipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var layout: WGPUPipelineLayout?
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.let { it.layout = newValue?.handler?.reinterpret() }
			}

		override val compute: WGPUProgrammableStageDescriptor
			get() = handler.reinterpret<webgpu.native.WGPUComputePipelineDescriptor>().pointed.compute.rawPtr.toLong().let(::NativeAddress).let { WGPUProgrammableStageDescriptor(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUComputePipelineDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUComputePipelineDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUComputePipelineDescriptor>())
			.let { WGPUComputePipelineDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePipelineDescriptor) -> Unit,
		): ArrayHolder<WGPUComputePipelineDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUComputePipelineDescriptor>() * size.toLong())
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

public actual interface WGPUConstantEntry {
	public actual var nextInChain: NativeAddress?

	public actual val key: WGPUStringView

	public actual var `value`: Double

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUConstantEntry> = cValue<webgpu.native.WGPUConstantEntry> {
		key.adapt(this@WGPUConstantEntry.key)
		nextInChain = this@WGPUConstantEntry.nextInChain?.reinterpret()
		value = this@WGPUConstantEntry.value
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUConstantEntry>,
	) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val key: WGPUStringView
			get() = handle.useContents { key.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var `value`: Double
			get() = handle.useContents { value ?: error("pointer of WGPUConstantEntry is null") }
			set(newValue) {
				handle.useContents { value = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUConstantEntry {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val key: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.key.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var `value`: Double
			get() = handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.value ?: error("pointer of WGPUConstantEntry is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUConstantEntry>().pointed.let { it.value = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUConstantEntry = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUConstantEntry = allocator.allocate(sizeOf<webgpu.native.WGPUConstantEntry>())
			.let { WGPUConstantEntry(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUConstantEntry) -> Unit,
		): ArrayHolder<WGPUConstantEntry> = allocator.allocate(sizeOf<webgpu.native.WGPUConstantEntry>() * size.toLong())
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

public actual interface WGPUStencilFaceState {
	public actual var compare: WGPUCompareFunction

	public actual var failOp: WGPUStencilOperation

	public actual var depthFailOp: WGPUStencilOperation

	public actual var passOp: WGPUStencilOperation

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUStencilFaceState> = cValue<webgpu.native.WGPUStencilFaceState> {
		compare = this@WGPUStencilFaceState.compare
		failOp = this@WGPUStencilFaceState.failOp
		depthFailOp = this@WGPUStencilFaceState.depthFailOp
		passOp = this@WGPUStencilFaceState.passOp
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUStencilFaceState>,
	) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = handle.useContents { compare ?: error("pointer of WGPUStencilFaceState is null") }
			set(newValue) {
				handle.useContents { compare = newValue }
			}

		override var failOp: WGPUStencilOperation
			get() = handle.useContents { failOp ?: error("pointer of WGPUStencilFaceState is null") }
			set(newValue) {
				handle.useContents { failOp = newValue }
			}

		override var depthFailOp: WGPUStencilOperation
			get() = handle.useContents { depthFailOp ?: error("pointer of WGPUStencilFaceState is null") }
			set(newValue) {
				handle.useContents { depthFailOp = newValue }
			}

		override var passOp: WGPUStencilOperation
			get() = handle.useContents { passOp ?: error("pointer of WGPUStencilFaceState is null") }
			set(newValue) {
				handle.useContents { passOp = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUStencilFaceState {
		override var compare: WGPUCompareFunction
			get() = handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.compare ?: error("pointer of WGPUStencilFaceState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.let { it.compare = newValue }
			}

		override var failOp: WGPUStencilOperation
			get() = handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.failOp ?: error("pointer of WGPUStencilFaceState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.let { it.failOp = newValue }
			}

		override var depthFailOp: WGPUStencilOperation
			get() = handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.depthFailOp ?: error("pointer of WGPUStencilFaceState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.let { it.depthFailOp = newValue }
			}

		override var passOp: WGPUStencilOperation
			get() = handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.passOp ?: error("pointer of WGPUStencilFaceState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUStencilFaceState>().pointed.let { it.passOp = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUStencilFaceState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUStencilFaceState = allocator.allocate(sizeOf<webgpu.native.WGPUStencilFaceState>())
			.let { WGPUStencilFaceState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStencilFaceState) -> Unit,
		): ArrayHolder<WGPUStencilFaceState> = allocator.allocate(sizeOf<webgpu.native.WGPUStencilFaceState>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPUDepthStencilState> = cValue<webgpu.native.WGPUDepthStencilState> {
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

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUDepthStencilState>,
	) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) {
				handle.useContents { format = newValue }
			}

		override var depthWriteEnabled: WGPUOptionalBool
			get() = handle.useContents { depthWriteEnabled ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) {
				handle.useContents { depthWriteEnabled = newValue }
			}

		override var depthCompare: WGPUCompareFunction
			get() = handle.useContents { depthCompare ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) {
				handle.useContents { depthCompare = newValue }
			}

		override val stencilFront: WGPUStencilFaceState
			get() = handle.useContents { stencilFront.rawPtr.toLong().let(::NativeAddress).let { WGPUStencilFaceState(it) } }

		override val stencilBack: WGPUStencilFaceState
			get() = handle.useContents { stencilBack.rawPtr.toLong().let(::NativeAddress).let { WGPUStencilFaceState(it) } }

		override var stencilReadMask: UInt
			get() = handle.useContents { stencilReadMask ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) {
				handle.useContents { stencilReadMask = newValue }
			}

		override var stencilWriteMask: UInt
			get() = handle.useContents { stencilWriteMask ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) {
				handle.useContents { stencilWriteMask = newValue }
			}

		override var depthBias: Int
			get() = handle.useContents { depthBias ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) {
				handle.useContents { depthBias = newValue }
			}

		override var depthBiasSlopeScale: Float
			get() = handle.useContents { depthBiasSlopeScale ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) {
				handle.useContents { depthBiasSlopeScale = newValue }
			}

		override var depthBiasClamp: Float
			get() = handle.useContents { depthBiasClamp ?: error("pointer of WGPUDepthStencilState is null") }
			set(newValue) {
				handle.useContents { depthBiasClamp = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUDepthStencilState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.format ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.format = newValue }
			}

		override var depthWriteEnabled: WGPUOptionalBool
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthWriteEnabled ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthWriteEnabled = newValue }
			}

		override var depthCompare: WGPUCompareFunction
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthCompare ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthCompare = newValue }
			}

		override val stencilFront: WGPUStencilFaceState
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.stencilFront.rawPtr.toLong().let(::NativeAddress).let { WGPUStencilFaceState(it) }

		override val stencilBack: WGPUStencilFaceState
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.stencilBack.rawPtr.toLong().let(::NativeAddress).let { WGPUStencilFaceState(it) }

		override var stencilReadMask: UInt
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.stencilReadMask ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.stencilReadMask = newValue }
			}

		override var stencilWriteMask: UInt
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.stencilWriteMask ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.stencilWriteMask = newValue }
			}

		override var depthBias: Int
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthBias ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthBias = newValue }
			}

		override var depthBiasSlopeScale: Float
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthBiasSlopeScale ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthBiasSlopeScale = newValue }
			}

		override var depthBiasClamp: Float
			get() = handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.depthBiasClamp ?: error("pointer of WGPUDepthStencilState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDepthStencilState>().pointed.let { it.depthBiasClamp = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUDepthStencilState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUDepthStencilState = allocator.allocate(sizeOf<webgpu.native.WGPUDepthStencilState>())
			.let { WGPUDepthStencilState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDepthStencilState) -> Unit,
		): ArrayHolder<WGPUDepthStencilState> = allocator.allocate(sizeOf<webgpu.native.WGPUDepthStencilState>() * size.toLong())
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

public actual interface WGPUQueueDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUQueueDescriptor> = cValue<webgpu.native.WGPUQueueDescriptor> {
		label.adapt(this@WGPUQueueDescriptor.label)
		nextInChain = this@WGPUQueueDescriptor.nextInChain?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUQueueDescriptor>,
	) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUQueueDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUQueueDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUQueueDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUQueueDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUQueueDescriptor>())
			.let { WGPUQueueDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQueueDescriptor) -> Unit,
		): ArrayHolder<WGPUQueueDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUQueueDescriptor>() * size.toLong())
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

public actual interface WGPUDeviceLostCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUDeviceLostCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUDeviceLostCallbackInfo> = cValue<webgpu.native.WGPUDeviceLostCallbackInfo> {
		nextInChain = this@WGPUDeviceLostCallbackInfo.nextInChain?.handler?.reinterpret()
		mode = this@WGPUDeviceLostCallbackInfo.mode
		callback = this@WGPUDeviceLostCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPUDeviceLostCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPUDeviceLostCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUDeviceLostCallbackInfo>,
	) : WGPUDeviceLostCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUDeviceLostCallbackInfo is null") }
			set(newValue) {
				handle.useContents { mode = newValue }
			}

		override var callback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUDeviceLostCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUDeviceLostCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.mode ?: error("pointer of WGPUDeviceLostCallbackInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.mode = newValue }
			}

		override var callback: CallbackHolder<WGPUDeviceLostCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUDeviceLostCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDeviceLostCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUDeviceLostCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUDeviceLostCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPUDeviceLostCallbackInfo>())
			.let { WGPUDeviceLostCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDeviceLostCallbackInfo) -> Unit,
		): ArrayHolder<WGPUDeviceLostCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUDeviceLostCallbackInfo>() * size.toLong())
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

public actual interface WGPUUncapturedErrorCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var callback: CallbackHolder<WGPUUncapturedErrorCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUUncapturedErrorCallbackInfo> = cValue<webgpu.native.WGPUUncapturedErrorCallbackInfo> {
		nextInChain = this@WGPUUncapturedErrorCallbackInfo.nextInChain?.handler?.reinterpret()
		callback = this@WGPUUncapturedErrorCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPUUncapturedErrorCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPUUncapturedErrorCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUUncapturedErrorCallbackInfo>,
	) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var callback: CallbackHolder<WGPUUncapturedErrorCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUUncapturedErrorCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUUncapturedErrorCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var callback: CallbackHolder<WGPUUncapturedErrorCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUUncapturedErrorCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUUncapturedErrorCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUUncapturedErrorCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUUncapturedErrorCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPUUncapturedErrorCallbackInfo>())
			.let { WGPUUncapturedErrorCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUUncapturedErrorCallbackInfo) -> Unit,
		): ArrayHolder<WGPUUncapturedErrorCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUUncapturedErrorCallbackInfo>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPUDeviceDescriptor> = cValue<webgpu.native.WGPUDeviceDescriptor> {
		label.adapt(this@WGPUDeviceDescriptor.label)
		defaultQueue.adapt(this@WGPUDeviceDescriptor.defaultQueue)
		deviceLostCallbackInfo.adapt(this@WGPUDeviceDescriptor.deviceLostCallbackInfo)
		uncapturedErrorCallbackInfo.adapt(this@WGPUDeviceDescriptor.uncapturedErrorCallbackInfo)
		nextInChain = this@WGPUDeviceDescriptor.nextInChain?.reinterpret()
		requiredFeatureCount = this@WGPUDeviceDescriptor.requiredFeatureCount
		requiredFeatures = this@WGPUDeviceDescriptor.requiredFeatures?.handler?.reinterpret()
		requiredLimits = this@WGPUDeviceDescriptor.requiredLimits?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUDeviceDescriptor>,
	) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var requiredFeatureCount: ULong
			get() = handle.useContents { requiredFeatureCount ?: error("pointer of WGPUDeviceDescriptor is null") }
			set(newValue) {
				handle.useContents { requiredFeatureCount = newValue }
			}

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handle.useContents { requiredFeatures?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) } }
			set(newValue) {
				handle.useContents { requiredFeatures = newValue?.handler?.reinterpret() }
			}

		override var requiredLimits: WGPULimits?
			get() = handle.useContents { requiredLimits?.let(::NativeAddress)?.let { WGPULimits(it) } }
			set(newValue) {
				handle.useContents { requiredLimits = newValue?.handler?.reinterpret() }
			}

		override val defaultQueue: WGPUQueueDescriptor
			get() = handle.useContents { defaultQueue.rawPtr.toLong().let(::NativeAddress).let { WGPUQueueDescriptor(it) } }

		override val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo
			get() = handle.useContents { deviceLostCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUDeviceLostCallbackInfo(it) } }

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handle.useContents { uncapturedErrorCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUUncapturedErrorCallbackInfo(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUDeviceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var requiredFeatureCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.requiredFeatureCount ?: error("pointer of WGPUDeviceDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.requiredFeatureCount = newValue }
			}

		override var requiredFeatures: ArrayHolder<WGPUFeatureName>?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.requiredFeatures?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.requiredFeatures = newValue?.handler?.reinterpret() }
			}

		override var requiredLimits: WGPULimits?
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.requiredLimits?.let(::NativeAddress)?.let { WGPULimits(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.let { it.requiredLimits = newValue?.handler?.reinterpret() }
			}

		override val defaultQueue: WGPUQueueDescriptor
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.defaultQueue.rawPtr.toLong().let(::NativeAddress).let { WGPUQueueDescriptor(it) }

		override val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.deviceLostCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUDeviceLostCallbackInfo(it) }

		override val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
			get() = handler.reinterpret<webgpu.native.WGPUDeviceDescriptor>().pointed.uncapturedErrorCallbackInfo.rawPtr.toLong().let(::NativeAddress).let { WGPUUncapturedErrorCallbackInfo(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUDeviceDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUDeviceDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUDeviceDescriptor>())
			.let { WGPUDeviceDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDeviceDescriptor) -> Unit,
		): ArrayHolder<WGPUDeviceDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUDeviceDescriptor>() * size.toLong())
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

public actual interface WGPUExtent3D {
	public actual var width: UInt

	public actual var height: UInt

	public actual var depthOrArrayLayers: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUExtent3D> = cValue<webgpu.native.WGPUExtent3D> {
		width = this@WGPUExtent3D.width
		height = this@WGPUExtent3D.height
		depthOrArrayLayers = this@WGPUExtent3D.depthOrArrayLayers
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUExtent3D>,
	) : WGPUExtent3D {
		override var width: UInt
			get() = handle.useContents { width ?: error("pointer of WGPUExtent3D is null") }
			set(newValue) {
				handle.useContents { width = newValue }
			}

		override var height: UInt
			get() = handle.useContents { height ?: error("pointer of WGPUExtent3D is null") }
			set(newValue) {
				handle.useContents { height = newValue }
			}

		override var depthOrArrayLayers: UInt
			get() = handle.useContents { depthOrArrayLayers ?: error("pointer of WGPUExtent3D is null") }
			set(newValue) {
				handle.useContents { depthOrArrayLayers = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUExtent3D {
		override var width: UInt
			get() = handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.width ?: error("pointer of WGPUExtent3D is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.let { it.width = newValue }
			}

		override var height: UInt
			get() = handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.height ?: error("pointer of WGPUExtent3D is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.let { it.height = newValue }
			}

		override var depthOrArrayLayers: UInt
			get() = handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.depthOrArrayLayers ?: error("pointer of WGPUExtent3D is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUExtent3D>().pointed.let { it.depthOrArrayLayers = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUExtent3D = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUExtent3D = allocator.allocate(sizeOf<webgpu.native.WGPUExtent3D>())
			.let { WGPUExtent3D(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUExtent3D) -> Unit,
		): ArrayHolder<WGPUExtent3D> = allocator.allocate(sizeOf<webgpu.native.WGPUExtent3D>() * size.toLong())
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

public actual interface WGPUFragmentState {
	public actual var nextInChain: NativeAddress?

	public actual var module: WGPUShaderModule?

	public actual val entryPoint: WGPUStringView

	public actual var constantCount: ULong

	public actual var constants: ArrayHolder<WGPUConstantEntry>?

	public actual var targetCount: ULong

	public actual var targets: ArrayHolder<WGPUColorTargetState>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUFragmentState> = cValue<webgpu.native.WGPUFragmentState> {
		entryPoint.adapt(this@WGPUFragmentState.entryPoint)
		nextInChain = this@WGPUFragmentState.nextInChain?.reinterpret()
		module = this@WGPUFragmentState.module?.handler?.reinterpret()
		constantCount = this@WGPUFragmentState.constantCount
		constants = this@WGPUFragmentState.constants?.handler?.reinterpret()
		targetCount = this@WGPUFragmentState.targetCount
		targets = this@WGPUFragmentState.targets?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUFragmentState>,
	) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var module: WGPUShaderModule?
			get() = handle.useContents { module?.let(::NativeAddress)?.let { WGPUShaderModule(it) } }
			set(newValue) {
				handle.useContents { module = newValue?.handler?.reinterpret() }
			}

		override val entryPoint: WGPUStringView
			get() = handle.useContents { entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var constantCount: ULong
			get() = handle.useContents { constantCount ?: error("pointer of WGPUFragmentState is null") }
			set(newValue) {
				handle.useContents { constantCount = newValue }
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.useContents { constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) } }
			set(newValue) {
				handle.useContents { constants = newValue?.handler?.reinterpret() }
			}

		override var targetCount: ULong
			get() = handle.useContents { targetCount ?: error("pointer of WGPUFragmentState is null") }
			set(newValue) {
				handle.useContents { targetCount = newValue }
			}

		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = handle.useContents { targets?.let(::NativeAddress)?.let { ArrayHolder<WGPUColorTargetState>(it) } }
			set(newValue) {
				handle.useContents { targets = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUFragmentState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var module: WGPUShaderModule?
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.module?.let(::NativeAddress)?.let { WGPUShaderModule(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.module = newValue?.handler?.reinterpret() }
			}

		override val entryPoint: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var constantCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.constantCount ?: error("pointer of WGPUFragmentState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.constantCount = newValue }
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.constants = newValue?.handler?.reinterpret() }
			}

		override var targetCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.targetCount ?: error("pointer of WGPUFragmentState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.targetCount = newValue }
			}

		override var targets: ArrayHolder<WGPUColorTargetState>?
			get() = handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.targets?.let(::NativeAddress)?.let { ArrayHolder<WGPUColorTargetState>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUFragmentState>().pointed.let { it.targets = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUFragmentState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUFragmentState = allocator.allocate(sizeOf<webgpu.native.WGPUFragmentState>())
			.let { WGPUFragmentState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFragmentState) -> Unit,
		): ArrayHolder<WGPUFragmentState> = allocator.allocate(sizeOf<webgpu.native.WGPUFragmentState>() * size.toLong())
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

public actual interface WGPUFuture {
	public actual var id: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUFuture> = cValue<webgpu.native.WGPUFuture> {
		id = this@WGPUFuture.id
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUFuture>,
	) : WGPUFuture {
		override var id: ULong
			get() = handle.useContents { id ?: error("pointer of WGPUFuture is null") }
			set(newValue) {
				handle.useContents { id = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUFuture {
		override var id: ULong
			get() = handler.reinterpret<webgpu.native.WGPUFuture>().pointed.id ?: error("pointer of WGPUFuture is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUFuture>().pointed.let { it.id = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUFuture = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUFuture = allocator.allocate(sizeOf<webgpu.native.WGPUFuture>())
			.let { WGPUFuture(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFuture) -> Unit,
		): ArrayHolder<WGPUFuture> = allocator.allocate(sizeOf<webgpu.native.WGPUFuture>() * size.toLong())
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

public actual interface WGPUFutureWaitInfo {
	public actual val future: WGPUFuture

	public actual var completed: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUFutureWaitInfo> = cValue<webgpu.native.WGPUFutureWaitInfo> {
		future.adapt(this@WGPUFutureWaitInfo.future)
		completed = this@WGPUFutureWaitInfo.completed.toUInt()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUFutureWaitInfo>,
	) : WGPUFutureWaitInfo {
		override val future: WGPUFuture
			get() = handle.useContents { future.rawPtr.toLong().let(::NativeAddress).let { WGPUFuture(it) } }

		override var completed: Boolean
			get() = handle.useContents { completed.toBoolean() ?: error("pointer of WGPUFutureWaitInfo is null") }
			set(newValue) {
				handle.useContents { completed = newValue.toUInt() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUFutureWaitInfo {
		override val future: WGPUFuture
			get() = handler.reinterpret<webgpu.native.WGPUFutureWaitInfo>().pointed.future.rawPtr.toLong().let(::NativeAddress).let { WGPUFuture(it) }

		override var completed: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUFutureWaitInfo>().pointed.completed.toBoolean() ?: error("pointer of WGPUFutureWaitInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUFutureWaitInfo>().pointed.let { it.completed = newValue.toUInt() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUFutureWaitInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUFutureWaitInfo = allocator.allocate(sizeOf<webgpu.native.WGPUFutureWaitInfo>())
			.let { WGPUFutureWaitInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFutureWaitInfo) -> Unit,
		): ArrayHolder<WGPUFutureWaitInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUFutureWaitInfo>() * size.toLong())
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

public actual interface WGPUInstanceCapabilities {
	public actual var nextInChain: NativeAddress?

	public actual var timedWaitAnyEnable: Boolean

	public actual var timedWaitAnyMaxCount: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUInstanceCapabilities> = cValue<webgpu.native.WGPUInstanceCapabilities> {
		nextInChain = this@WGPUInstanceCapabilities.nextInChain?.reinterpret()
		timedWaitAnyEnable = this@WGPUInstanceCapabilities.timedWaitAnyEnable.toUInt()
		timedWaitAnyMaxCount = this@WGPUInstanceCapabilities.timedWaitAnyMaxCount
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUInstanceCapabilities>,
	) : WGPUInstanceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var timedWaitAnyEnable: Boolean
			get() = handle.useContents { timedWaitAnyEnable.toBoolean() ?: error("pointer of WGPUInstanceCapabilities is null") }
			set(newValue) {
				handle.useContents { timedWaitAnyEnable = newValue.toUInt() }
			}

		override var timedWaitAnyMaxCount: ULong
			get() = handle.useContents { timedWaitAnyMaxCount ?: error("pointer of WGPUInstanceCapabilities is null") }
			set(newValue) {
				handle.useContents { timedWaitAnyMaxCount = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUInstanceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var timedWaitAnyEnable: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.timedWaitAnyEnable.toBoolean() ?: error("pointer of WGPUInstanceCapabilities is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.let { it.timedWaitAnyEnable = newValue.toUInt() }
			}

		override var timedWaitAnyMaxCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.timedWaitAnyMaxCount ?: error("pointer of WGPUInstanceCapabilities is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceCapabilities>().pointed.let { it.timedWaitAnyMaxCount = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUInstanceCapabilities = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUInstanceCapabilities = allocator.allocate(sizeOf<webgpu.native.WGPUInstanceCapabilities>())
			.let { WGPUInstanceCapabilities(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceCapabilities) -> Unit,
		): ArrayHolder<WGPUInstanceCapabilities> = allocator.allocate(sizeOf<webgpu.native.WGPUInstanceCapabilities>() * size.toLong())
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

public actual interface WGPUInstanceDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val features: WGPUInstanceCapabilities

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUInstanceDescriptor> = cValue<webgpu.native.WGPUInstanceDescriptor> {
		features.adapt(this@WGPUInstanceDescriptor.features)
		nextInChain = this@WGPUInstanceDescriptor.nextInChain?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUInstanceDescriptor>,
	) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val features: WGPUInstanceCapabilities
			get() = handle.useContents { features.rawPtr.toLong().let(::NativeAddress).let { WGPUInstanceCapabilities(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUInstanceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUInstanceDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val features: WGPUInstanceCapabilities
			get() = handler.reinterpret<webgpu.native.WGPUInstanceDescriptor>().pointed.features.rawPtr.toLong().let(::NativeAddress).let { WGPUInstanceCapabilities(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUInstanceDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUInstanceDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUInstanceDescriptor>())
			.let { WGPUInstanceDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceDescriptor) -> Unit,
		): ArrayHolder<WGPUInstanceDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUInstanceDescriptor>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPULimits> = cValue<webgpu.native.WGPULimits> {
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

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPULimits>,
	) : WGPULimits {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var maxTextureDimension1D: UInt
			get() = handle.useContents { maxTextureDimension1D ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxTextureDimension1D = newValue }
			}

		override var maxTextureDimension2D: UInt
			get() = handle.useContents { maxTextureDimension2D ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxTextureDimension2D = newValue }
			}

		override var maxTextureDimension3D: UInt
			get() = handle.useContents { maxTextureDimension3D ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxTextureDimension3D = newValue }
			}

		override var maxTextureArrayLayers: UInt
			get() = handle.useContents { maxTextureArrayLayers ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxTextureArrayLayers = newValue }
			}

		override var maxBindGroups: UInt
			get() = handle.useContents { maxBindGroups ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxBindGroups = newValue }
			}

		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = handle.useContents { maxBindGroupsPlusVertexBuffers ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxBindGroupsPlusVertexBuffers = newValue }
			}

		override var maxBindingsPerBindGroup: UInt
			get() = handle.useContents { maxBindingsPerBindGroup ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxBindingsPerBindGroup = newValue }
			}

		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = handle.useContents { maxDynamicUniformBuffersPerPipelineLayout ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxDynamicUniformBuffersPerPipelineLayout = newValue }
			}

		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = handle.useContents { maxDynamicStorageBuffersPerPipelineLayout ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxDynamicStorageBuffersPerPipelineLayout = newValue }
			}

		override var maxSampledTexturesPerShaderStage: UInt
			get() = handle.useContents { maxSampledTexturesPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxSampledTexturesPerShaderStage = newValue }
			}

		override var maxSamplersPerShaderStage: UInt
			get() = handle.useContents { maxSamplersPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxSamplersPerShaderStage = newValue }
			}

		override var maxStorageBuffersPerShaderStage: UInt
			get() = handle.useContents { maxStorageBuffersPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxStorageBuffersPerShaderStage = newValue }
			}

		override var maxStorageTexturesPerShaderStage: UInt
			get() = handle.useContents { maxStorageTexturesPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxStorageTexturesPerShaderStage = newValue }
			}

		override var maxUniformBuffersPerShaderStage: UInt
			get() = handle.useContents { maxUniformBuffersPerShaderStage ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxUniformBuffersPerShaderStage = newValue }
			}

		override var maxUniformBufferBindingSize: ULong
			get() = handle.useContents { maxUniformBufferBindingSize ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxUniformBufferBindingSize = newValue }
			}

		override var maxStorageBufferBindingSize: ULong
			get() = handle.useContents { maxStorageBufferBindingSize ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxStorageBufferBindingSize = newValue }
			}

		override var minUniformBufferOffsetAlignment: UInt
			get() = handle.useContents { minUniformBufferOffsetAlignment ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { minUniformBufferOffsetAlignment = newValue }
			}

		override var minStorageBufferOffsetAlignment: UInt
			get() = handle.useContents { minStorageBufferOffsetAlignment ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { minStorageBufferOffsetAlignment = newValue }
			}

		override var maxVertexBuffers: UInt
			get() = handle.useContents { maxVertexBuffers ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxVertexBuffers = newValue }
			}

		override var maxBufferSize: ULong
			get() = handle.useContents { maxBufferSize ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxBufferSize = newValue }
			}

		override var maxVertexAttributes: UInt
			get() = handle.useContents { maxVertexAttributes ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxVertexAttributes = newValue }
			}

		override var maxVertexBufferArrayStride: UInt
			get() = handle.useContents { maxVertexBufferArrayStride ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxVertexBufferArrayStride = newValue }
			}

		override var maxInterStageShaderVariables: UInt
			get() = handle.useContents { maxInterStageShaderVariables ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxInterStageShaderVariables = newValue }
			}

		override var maxColorAttachments: UInt
			get() = handle.useContents { maxColorAttachments ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxColorAttachments = newValue }
			}

		override var maxColorAttachmentBytesPerSample: UInt
			get() = handle.useContents { maxColorAttachmentBytesPerSample ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxColorAttachmentBytesPerSample = newValue }
			}

		override var maxComputeWorkgroupStorageSize: UInt
			get() = handle.useContents { maxComputeWorkgroupStorageSize ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxComputeWorkgroupStorageSize = newValue }
			}

		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = handle.useContents { maxComputeInvocationsPerWorkgroup ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxComputeInvocationsPerWorkgroup = newValue }
			}

		override var maxComputeWorkgroupSizeX: UInt
			get() = handle.useContents { maxComputeWorkgroupSizeX ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxComputeWorkgroupSizeX = newValue }
			}

		override var maxComputeWorkgroupSizeY: UInt
			get() = handle.useContents { maxComputeWorkgroupSizeY ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxComputeWorkgroupSizeY = newValue }
			}

		override var maxComputeWorkgroupSizeZ: UInt
			get() = handle.useContents { maxComputeWorkgroupSizeZ ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxComputeWorkgroupSizeZ = newValue }
			}

		override var maxComputeWorkgroupsPerDimension: UInt
			get() = handle.useContents { maxComputeWorkgroupsPerDimension ?: error("pointer of WGPULimits is null") }
			set(newValue) {
				handle.useContents { maxComputeWorkgroupsPerDimension = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPULimits {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var maxTextureDimension1D: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxTextureDimension1D ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxTextureDimension1D = newValue }
			}

		override var maxTextureDimension2D: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxTextureDimension2D ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxTextureDimension2D = newValue }
			}

		override var maxTextureDimension3D: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxTextureDimension3D ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxTextureDimension3D = newValue }
			}

		override var maxTextureArrayLayers: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxTextureArrayLayers ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxTextureArrayLayers = newValue }
			}

		override var maxBindGroups: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxBindGroups ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxBindGroups = newValue }
			}

		override var maxBindGroupsPlusVertexBuffers: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxBindGroupsPlusVertexBuffers ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxBindGroupsPlusVertexBuffers = newValue }
			}

		override var maxBindingsPerBindGroup: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxBindingsPerBindGroup ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxBindingsPerBindGroup = newValue }
			}

		override var maxDynamicUniformBuffersPerPipelineLayout: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxDynamicUniformBuffersPerPipelineLayout ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxDynamicUniformBuffersPerPipelineLayout = newValue }
			}

		override var maxDynamicStorageBuffersPerPipelineLayout: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxDynamicStorageBuffersPerPipelineLayout ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxDynamicStorageBuffersPerPipelineLayout = newValue }
			}

		override var maxSampledTexturesPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxSampledTexturesPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxSampledTexturesPerShaderStage = newValue }
			}

		override var maxSamplersPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxSamplersPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxSamplersPerShaderStage = newValue }
			}

		override var maxStorageBuffersPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxStorageBuffersPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxStorageBuffersPerShaderStage = newValue }
			}

		override var maxStorageTexturesPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxStorageTexturesPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxStorageTexturesPerShaderStage = newValue }
			}

		override var maxUniformBuffersPerShaderStage: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxUniformBuffersPerShaderStage ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxUniformBuffersPerShaderStage = newValue }
			}

		override var maxUniformBufferBindingSize: ULong
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxUniformBufferBindingSize ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxUniformBufferBindingSize = newValue }
			}

		override var maxStorageBufferBindingSize: ULong
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxStorageBufferBindingSize ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxStorageBufferBindingSize = newValue }
			}

		override var minUniformBufferOffsetAlignment: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.minUniformBufferOffsetAlignment ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.minUniformBufferOffsetAlignment = newValue }
			}

		override var minStorageBufferOffsetAlignment: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.minStorageBufferOffsetAlignment ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.minStorageBufferOffsetAlignment = newValue }
			}

		override var maxVertexBuffers: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxVertexBuffers ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxVertexBuffers = newValue }
			}

		override var maxBufferSize: ULong
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxBufferSize ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxBufferSize = newValue }
			}

		override var maxVertexAttributes: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxVertexAttributes ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxVertexAttributes = newValue }
			}

		override var maxVertexBufferArrayStride: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxVertexBufferArrayStride ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxVertexBufferArrayStride = newValue }
			}

		override var maxInterStageShaderVariables: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxInterStageShaderVariables ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxInterStageShaderVariables = newValue }
			}

		override var maxColorAttachments: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxColorAttachments ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxColorAttachments = newValue }
			}

		override var maxColorAttachmentBytesPerSample: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxColorAttachmentBytesPerSample ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxColorAttachmentBytesPerSample = newValue }
			}

		override var maxComputeWorkgroupStorageSize: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupStorageSize ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupStorageSize = newValue }
			}

		override var maxComputeInvocationsPerWorkgroup: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeInvocationsPerWorkgroup ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeInvocationsPerWorkgroup = newValue }
			}

		override var maxComputeWorkgroupSizeX: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupSizeX ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupSizeX = newValue }
			}

		override var maxComputeWorkgroupSizeY: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupSizeY ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupSizeY = newValue }
			}

		override var maxComputeWorkgroupSizeZ: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupSizeZ ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupSizeZ = newValue }
			}

		override var maxComputeWorkgroupsPerDimension: UInt
			get() = handler.reinterpret<webgpu.native.WGPULimits>().pointed.maxComputeWorkgroupsPerDimension ?: error("pointer of WGPULimits is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPULimits>().pointed.let { it.maxComputeWorkgroupsPerDimension = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPULimits = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPULimits = allocator.allocate(sizeOf<webgpu.native.WGPULimits>())
			.let { WGPULimits(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPULimits) -> Unit,
		): ArrayHolder<WGPULimits> = allocator.allocate(sizeOf<webgpu.native.WGPULimits>() * size.toLong())
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

public actual interface WGPUMultisampleState {
	public actual var nextInChain: NativeAddress?

	public actual var count: UInt

	public actual var mask: UInt

	public actual var alphaToCoverageEnabled: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUMultisampleState> = cValue<webgpu.native.WGPUMultisampleState> {
		nextInChain = this@WGPUMultisampleState.nextInChain?.reinterpret()
		count = this@WGPUMultisampleState.count
		mask = this@WGPUMultisampleState.mask
		alphaToCoverageEnabled = this@WGPUMultisampleState.alphaToCoverageEnabled.toUInt()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUMultisampleState>,
	) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var count: UInt
			get() = handle.useContents { count ?: error("pointer of WGPUMultisampleState is null") }
			set(newValue) {
				handle.useContents { count = newValue }
			}

		override var mask: UInt
			get() = handle.useContents { mask ?: error("pointer of WGPUMultisampleState is null") }
			set(newValue) {
				handle.useContents { mask = newValue }
			}

		override var alphaToCoverageEnabled: Boolean
			get() = handle.useContents { alphaToCoverageEnabled.toBoolean() ?: error("pointer of WGPUMultisampleState is null") }
			set(newValue) {
				handle.useContents { alphaToCoverageEnabled = newValue.toUInt() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUMultisampleState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var count: UInt
			get() = handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.count ?: error("pointer of WGPUMultisampleState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.let { it.count = newValue }
			}

		override var mask: UInt
			get() = handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.mask ?: error("pointer of WGPUMultisampleState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.let { it.mask = newValue }
			}

		override var alphaToCoverageEnabled: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.alphaToCoverageEnabled.toBoolean() ?: error("pointer of WGPUMultisampleState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUMultisampleState>().pointed.let { it.alphaToCoverageEnabled = newValue.toUInt() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUMultisampleState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUMultisampleState = allocator.allocate(sizeOf<webgpu.native.WGPUMultisampleState>())
			.let { WGPUMultisampleState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUMultisampleState) -> Unit,
		): ArrayHolder<WGPUMultisampleState> = allocator.allocate(sizeOf<webgpu.native.WGPUMultisampleState>() * size.toLong())
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

public actual interface WGPUOrigin3D {
	public actual var x: UInt

	public actual var y: UInt

	public actual var z: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUOrigin3D> = cValue<webgpu.native.WGPUOrigin3D> {
		x = this@WGPUOrigin3D.x
		y = this@WGPUOrigin3D.y
		z = this@WGPUOrigin3D.z
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUOrigin3D>,
	) : WGPUOrigin3D {
		override var x: UInt
			get() = handle.useContents { x ?: error("pointer of WGPUOrigin3D is null") }
			set(newValue) {
				handle.useContents { x = newValue }
			}

		override var y: UInt
			get() = handle.useContents { y ?: error("pointer of WGPUOrigin3D is null") }
			set(newValue) {
				handle.useContents { y = newValue }
			}

		override var z: UInt
			get() = handle.useContents { z ?: error("pointer of WGPUOrigin3D is null") }
			set(newValue) {
				handle.useContents { z = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUOrigin3D {
		override var x: UInt
			get() = handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.x ?: error("pointer of WGPUOrigin3D is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.let { it.x = newValue }
			}

		override var y: UInt
			get() = handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.y ?: error("pointer of WGPUOrigin3D is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.let { it.y = newValue }
			}

		override var z: UInt
			get() = handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.z ?: error("pointer of WGPUOrigin3D is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUOrigin3D>().pointed.let { it.z = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUOrigin3D = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUOrigin3D = allocator.allocate(sizeOf<webgpu.native.WGPUOrigin3D>())
			.let { WGPUOrigin3D(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUOrigin3D) -> Unit,
		): ArrayHolder<WGPUOrigin3D> = allocator.allocate(sizeOf<webgpu.native.WGPUOrigin3D>() * size.toLong())
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

public actual interface WGPUPipelineLayoutDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var bindGroupLayoutCount: ULong

	public actual var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUPipelineLayoutDescriptor> = cValue<webgpu.native.WGPUPipelineLayoutDescriptor> {
		label.adapt(this@WGPUPipelineLayoutDescriptor.label)
		nextInChain = this@WGPUPipelineLayoutDescriptor.nextInChain?.reinterpret()
		bindGroupLayoutCount = this@WGPUPipelineLayoutDescriptor.bindGroupLayoutCount
		bindGroupLayouts = this@WGPUPipelineLayoutDescriptor.bindGroupLayouts?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUPipelineLayoutDescriptor>,
	) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var bindGroupLayoutCount: ULong
			get() = handle.useContents { bindGroupLayoutCount ?: error("pointer of WGPUPipelineLayoutDescriptor is null") }
			set(newValue) {
				handle.useContents { bindGroupLayoutCount = newValue }
			}

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = handle.useContents { bindGroupLayouts?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayout>(it) } }
			set(newValue) {
				handle.useContents { bindGroupLayouts = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUPipelineLayoutDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var bindGroupLayoutCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.bindGroupLayoutCount ?: error("pointer of WGPUPipelineLayoutDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.let { it.bindGroupLayoutCount = newValue }
			}

		override var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
			get() = handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.bindGroupLayouts?.let(::NativeAddress)?.let { ArrayHolder<WGPUBindGroupLayout>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPipelineLayoutDescriptor>().pointed.let { it.bindGroupLayouts = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUPipelineLayoutDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUPipelineLayoutDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUPipelineLayoutDescriptor>())
			.let { WGPUPipelineLayoutDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPipelineLayoutDescriptor) -> Unit,
		): ArrayHolder<WGPUPipelineLayoutDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUPipelineLayoutDescriptor>() * size.toLong())
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

public actual interface WGPUPrimitiveState {
	public actual var nextInChain: NativeAddress?

	public actual var topology: WGPUPrimitiveTopology

	public actual var stripIndexFormat: WGPUIndexFormat

	public actual var frontFace: WGPUFrontFace

	public actual var cullMode: WGPUCullMode

	public actual var unclippedDepth: Boolean

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUPrimitiveState> = cValue<webgpu.native.WGPUPrimitiveState> {
		nextInChain = this@WGPUPrimitiveState.nextInChain?.reinterpret()
		topology = this@WGPUPrimitiveState.topology
		stripIndexFormat = this@WGPUPrimitiveState.stripIndexFormat
		frontFace = this@WGPUPrimitiveState.frontFace
		cullMode = this@WGPUPrimitiveState.cullMode
		unclippedDepth = this@WGPUPrimitiveState.unclippedDepth.toUInt()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUPrimitiveState>,
	) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var topology: WGPUPrimitiveTopology
			get() = handle.useContents { topology ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) {
				handle.useContents { topology = newValue }
			}

		override var stripIndexFormat: WGPUIndexFormat
			get() = handle.useContents { stripIndexFormat ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) {
				handle.useContents { stripIndexFormat = newValue }
			}

		override var frontFace: WGPUFrontFace
			get() = handle.useContents { frontFace ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) {
				handle.useContents { frontFace = newValue }
			}

		override var cullMode: WGPUCullMode
			get() = handle.useContents { cullMode ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) {
				handle.useContents { cullMode = newValue }
			}

		override var unclippedDepth: Boolean
			get() = handle.useContents { unclippedDepth.toBoolean() ?: error("pointer of WGPUPrimitiveState is null") }
			set(newValue) {
				handle.useContents { unclippedDepth = newValue.toUInt() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUPrimitiveState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var topology: WGPUPrimitiveTopology
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.topology ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.topology = newValue }
			}

		override var stripIndexFormat: WGPUIndexFormat
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.stripIndexFormat ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.stripIndexFormat = newValue }
			}

		override var frontFace: WGPUFrontFace
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.frontFace ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.frontFace = newValue }
			}

		override var cullMode: WGPUCullMode
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.cullMode ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.cullMode = newValue }
			}

		override var unclippedDepth: Boolean
			get() = handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.unclippedDepth.toBoolean() ?: error("pointer of WGPUPrimitiveState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPrimitiveState>().pointed.let { it.unclippedDepth = newValue.toUInt() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUPrimitiveState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUPrimitiveState = allocator.allocate(sizeOf<webgpu.native.WGPUPrimitiveState>())
			.let { WGPUPrimitiveState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPrimitiveState) -> Unit,
		): ArrayHolder<WGPUPrimitiveState> = allocator.allocate(sizeOf<webgpu.native.WGPUPrimitiveState>() * size.toLong())
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

public actual interface WGPUQuerySetDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var type: WGPUQueryType

	public actual var count: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUQuerySetDescriptor> = cValue<webgpu.native.WGPUQuerySetDescriptor> {
		label.adapt(this@WGPUQuerySetDescriptor.label)
		nextInChain = this@WGPUQuerySetDescriptor.nextInChain?.reinterpret()
		type = this@WGPUQuerySetDescriptor.type
		count = this@WGPUQuerySetDescriptor.count
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUQuerySetDescriptor>,
	) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var type: WGPUQueryType
			get() = handle.useContents { type ?: error("pointer of WGPUQuerySetDescriptor is null") }
			set(newValue) {
				handle.useContents { type = newValue }
			}

		override var count: UInt
			get() = handle.useContents { count ?: error("pointer of WGPUQuerySetDescriptor is null") }
			set(newValue) {
				handle.useContents { count = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUQuerySetDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var type: WGPUQueryType
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.type ?: error("pointer of WGPUQuerySetDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.let { it.type = newValue }
			}

		override var count: UInt
			get() = handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.count ?: error("pointer of WGPUQuerySetDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUQuerySetDescriptor>().pointed.let { it.count = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUQuerySetDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUQuerySetDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUQuerySetDescriptor>())
			.let { WGPUQuerySetDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQuerySetDescriptor) -> Unit,
		): ArrayHolder<WGPUQuerySetDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUQuerySetDescriptor>() * size.toLong())
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

public actual interface WGPURenderBundleDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPURenderBundleDescriptor> = cValue<webgpu.native.WGPURenderBundleDescriptor> {
		label.adapt(this@WGPURenderBundleDescriptor.label)
		nextInChain = this@WGPURenderBundleDescriptor.nextInChain?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURenderBundleDescriptor>,
	) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderBundleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderBundleDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPURenderBundleDescriptor>())
			.let { WGPURenderBundleDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderBundleDescriptor) -> Unit,
		): ArrayHolder<WGPURenderBundleDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPURenderBundleDescriptor>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPURenderBundleEncoderDescriptor> = cValue<webgpu.native.WGPURenderBundleEncoderDescriptor> {
		label.adapt(this@WGPURenderBundleEncoderDescriptor.label)
		nextInChain = this@WGPURenderBundleEncoderDescriptor.nextInChain?.reinterpret()
		colorFormatCount = this@WGPURenderBundleEncoderDescriptor.colorFormatCount
		colorFormats = this@WGPURenderBundleEncoderDescriptor.colorFormats?.handler?.reinterpret()
		depthStencilFormat = this@WGPURenderBundleEncoderDescriptor.depthStencilFormat
		sampleCount = this@WGPURenderBundleEncoderDescriptor.sampleCount
		depthReadOnly = this@WGPURenderBundleEncoderDescriptor.depthReadOnly.toUInt()
		stencilReadOnly = this@WGPURenderBundleEncoderDescriptor.stencilReadOnly.toUInt()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURenderBundleEncoderDescriptor>,
	) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var colorFormatCount: ULong
			get() = handle.useContents { colorFormatCount ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) {
				handle.useContents { colorFormatCount = newValue }
			}

		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.useContents { colorFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) } }
			set(newValue) {
				handle.useContents { colorFormats = newValue?.handler?.reinterpret() }
			}

		override var depthStencilFormat: WGPUTextureFormat
			get() = handle.useContents { depthStencilFormat ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) {
				handle.useContents { depthStencilFormat = newValue }
			}

		override var sampleCount: UInt
			get() = handle.useContents { sampleCount ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) {
				handle.useContents { sampleCount = newValue }
			}

		override var depthReadOnly: Boolean
			get() = handle.useContents { depthReadOnly.toBoolean() ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) {
				handle.useContents { depthReadOnly = newValue.toUInt() }
			}

		override var stencilReadOnly: Boolean
			get() = handle.useContents { stencilReadOnly.toBoolean() ?: error("pointer of WGPURenderBundleEncoderDescriptor is null") }
			set(newValue) {
				handle.useContents { stencilReadOnly = newValue.toUInt() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderBundleEncoderDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var colorFormatCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.colorFormatCount ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.colorFormatCount = newValue }
			}

		override var colorFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.colorFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.colorFormats = newValue?.handler?.reinterpret() }
			}

		override var depthStencilFormat: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.depthStencilFormat ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.depthStencilFormat = newValue }
			}

		override var sampleCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.sampleCount ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.sampleCount = newValue }
			}

		override var depthReadOnly: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.depthReadOnly.toBoolean() ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.depthReadOnly = newValue.toUInt() }
			}

		override var stencilReadOnly: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.stencilReadOnly.toBoolean() ?: error("pointer of WGPURenderBundleEncoderDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderBundleEncoderDescriptor>().pointed.let { it.stencilReadOnly = newValue.toUInt() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderBundleEncoderDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderBundleEncoderDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPURenderBundleEncoderDescriptor>())
			.let { WGPURenderBundleEncoderDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderBundleEncoderDescriptor) -> Unit,
		): ArrayHolder<WGPURenderBundleEncoderDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPURenderBundleEncoderDescriptor>() * size.toLong())
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

public actual interface WGPURenderPassColorAttachment {
	public actual var nextInChain: NativeAddress?

	public actual var view: WGPUTextureView?

	public actual var depthSlice: UInt

	public actual var resolveTarget: WGPUTextureView?

	public actual var loadOp: WGPULoadOp

	public actual var storeOp: WGPUStoreOp

	public actual val clearValue: WGPUColor

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPURenderPassColorAttachment> = cValue<webgpu.native.WGPURenderPassColorAttachment> {
		clearValue.adapt(this@WGPURenderPassColorAttachment.clearValue)
		nextInChain = this@WGPURenderPassColorAttachment.nextInChain?.reinterpret()
		view = this@WGPURenderPassColorAttachment.view?.handler?.reinterpret()
		depthSlice = this@WGPURenderPassColorAttachment.depthSlice
		resolveTarget = this@WGPURenderPassColorAttachment.resolveTarget?.handler?.reinterpret()
		loadOp = this@WGPURenderPassColorAttachment.loadOp
		storeOp = this@WGPURenderPassColorAttachment.storeOp
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURenderPassColorAttachment>,
	) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var view: WGPUTextureView?
			get() = handle.useContents { view?.let(::NativeAddress)?.let { WGPUTextureView(it) } }
			set(newValue) {
				handle.useContents { view = newValue?.handler?.reinterpret() }
			}

		override var depthSlice: UInt
			get() = handle.useContents { depthSlice ?: error("pointer of WGPURenderPassColorAttachment is null") }
			set(newValue) {
				handle.useContents { depthSlice = newValue }
			}

		override var resolveTarget: WGPUTextureView?
			get() = handle.useContents { resolveTarget?.let(::NativeAddress)?.let { WGPUTextureView(it) } }
			set(newValue) {
				handle.useContents { resolveTarget = newValue?.handler?.reinterpret() }
			}

		override var loadOp: WGPULoadOp
			get() = handle.useContents { loadOp ?: error("pointer of WGPURenderPassColorAttachment is null") }
			set(newValue) {
				handle.useContents { loadOp = newValue }
			}

		override var storeOp: WGPUStoreOp
			get() = handle.useContents { storeOp ?: error("pointer of WGPURenderPassColorAttachment is null") }
			set(newValue) {
				handle.useContents { storeOp = newValue }
			}

		override val clearValue: WGPUColor
			get() = handle.useContents { clearValue.rawPtr.toLong().let(::NativeAddress).let { WGPUColor(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassColorAttachment {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var view: WGPUTextureView?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.view?.let(::NativeAddress)?.let { WGPUTextureView(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.view = newValue?.handler?.reinterpret() }
			}

		override var depthSlice: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.depthSlice ?: error("pointer of WGPURenderPassColorAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.depthSlice = newValue }
			}

		override var resolveTarget: WGPUTextureView?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.resolveTarget?.let(::NativeAddress)?.let { WGPUTextureView(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.resolveTarget = newValue?.handler?.reinterpret() }
			}

		override var loadOp: WGPULoadOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.loadOp ?: error("pointer of WGPURenderPassColorAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.loadOp = newValue }
			}

		override var storeOp: WGPUStoreOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.storeOp ?: error("pointer of WGPURenderPassColorAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.let { it.storeOp = newValue }
			}

		override val clearValue: WGPUColor
			get() = handler.reinterpret<webgpu.native.WGPURenderPassColorAttachment>().pointed.clearValue.rawPtr.toLong().let(::NativeAddress).let { WGPUColor(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassColorAttachment = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassColorAttachment = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassColorAttachment>())
			.let { WGPURenderPassColorAttachment(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassColorAttachment) -> Unit,
		): ArrayHolder<WGPURenderPassColorAttachment> = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassColorAttachment>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPURenderPassDepthStencilAttachment> = cValue<webgpu.native.WGPURenderPassDepthStencilAttachment> {
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

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURenderPassDepthStencilAttachment>,
	) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = handle.useContents { view?.let(::NativeAddress)?.let { WGPUTextureView(it) } }
			set(newValue) {
				handle.useContents { view = newValue?.handler?.reinterpret() }
			}

		override var depthLoadOp: WGPULoadOp
			get() = handle.useContents { depthLoadOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) {
				handle.useContents { depthLoadOp = newValue }
			}

		override var depthStoreOp: WGPUStoreOp
			get() = handle.useContents { depthStoreOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) {
				handle.useContents { depthStoreOp = newValue }
			}

		override var depthClearValue: Float
			get() = handle.useContents { depthClearValue ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) {
				handle.useContents { depthClearValue = newValue }
			}

		override var depthReadOnly: Boolean
			get() = handle.useContents { depthReadOnly.toBoolean() ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) {
				handle.useContents { depthReadOnly = newValue.toUInt() }
			}

		override var stencilLoadOp: WGPULoadOp
			get() = handle.useContents { stencilLoadOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) {
				handle.useContents { stencilLoadOp = newValue }
			}

		override var stencilStoreOp: WGPUStoreOp
			get() = handle.useContents { stencilStoreOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) {
				handle.useContents { stencilStoreOp = newValue }
			}

		override var stencilClearValue: UInt
			get() = handle.useContents { stencilClearValue ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) {
				handle.useContents { stencilClearValue = newValue }
			}

		override var stencilReadOnly: Boolean
			get() = handle.useContents { stencilReadOnly.toBoolean() ?: error("pointer of WGPURenderPassDepthStencilAttachment is null") }
			set(newValue) {
				handle.useContents { stencilReadOnly = newValue.toUInt() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassDepthStencilAttachment {
		override var view: WGPUTextureView?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.view?.let(::NativeAddress)?.let { WGPUTextureView(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.view = newValue?.handler?.reinterpret() }
			}

		override var depthLoadOp: WGPULoadOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.depthLoadOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.depthLoadOp = newValue }
			}

		override var depthStoreOp: WGPUStoreOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.depthStoreOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.depthStoreOp = newValue }
			}

		override var depthClearValue: Float
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.depthClearValue ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.depthClearValue = newValue }
			}

		override var depthReadOnly: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.depthReadOnly.toBoolean() ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.depthReadOnly = newValue.toUInt() }
			}

		override var stencilLoadOp: WGPULoadOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.stencilLoadOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.stencilLoadOp = newValue }
			}

		override var stencilStoreOp: WGPUStoreOp
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.stencilStoreOp ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.stencilStoreOp = newValue }
			}

		override var stencilClearValue: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.stencilClearValue ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.stencilClearValue = newValue }
			}

		override var stencilReadOnly: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.stencilReadOnly.toBoolean() ?: error("pointer of WGPURenderPassDepthStencilAttachment is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDepthStencilAttachment>().pointed.let { it.stencilReadOnly = newValue.toUInt() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassDepthStencilAttachment = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDepthStencilAttachment = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDepthStencilAttachment>())
			.let { WGPURenderPassDepthStencilAttachment(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassDepthStencilAttachment) -> Unit,
		): ArrayHolder<WGPURenderPassDepthStencilAttachment> = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDepthStencilAttachment>() * size.toLong())
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

public actual interface WGPURenderPassDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual var colorAttachmentCount: ULong

	public actual var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?

	public actual var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?

	public actual var occlusionQuerySet: WGPUQuerySet?

	public actual var timestampWrites: WGPURenderPassTimestampWrites?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPURenderPassDescriptor> = cValue<webgpu.native.WGPURenderPassDescriptor> {
		label.adapt(this@WGPURenderPassDescriptor.label)
		nextInChain = this@WGPURenderPassDescriptor.nextInChain?.reinterpret()
		colorAttachmentCount = this@WGPURenderPassDescriptor.colorAttachmentCount
		colorAttachments = this@WGPURenderPassDescriptor.colorAttachments?.handler?.reinterpret()
		depthStencilAttachment = this@WGPURenderPassDescriptor.depthStencilAttachment?.handler?.reinterpret()
		occlusionQuerySet = this@WGPURenderPassDescriptor.occlusionQuerySet?.handler?.reinterpret()
		timestampWrites = this@WGPURenderPassDescriptor.timestampWrites?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURenderPassDescriptor>,
	) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var colorAttachmentCount: ULong
			get() = handle.useContents { colorAttachmentCount ?: error("pointer of WGPURenderPassDescriptor is null") }
			set(newValue) {
				handle.useContents { colorAttachmentCount = newValue }
			}

		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = handle.useContents { colorAttachments?.let(::NativeAddress)?.let { ArrayHolder<WGPURenderPassColorAttachment>(it) } }
			set(newValue) {
				handle.useContents { colorAttachments = newValue?.handler?.reinterpret() }
			}

		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = handle.useContents { depthStencilAttachment?.let(::NativeAddress)?.let { WGPURenderPassDepthStencilAttachment(it) } }
			set(newValue) {
				handle.useContents { depthStencilAttachment = newValue?.handler?.reinterpret() }
			}

		override var occlusionQuerySet: WGPUQuerySet?
			get() = handle.useContents { occlusionQuerySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) } }
			set(newValue) {
				handle.useContents { occlusionQuerySet = newValue?.handler?.reinterpret() }
			}

		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = handle.useContents { timestampWrites?.let(::NativeAddress)?.let { WGPURenderPassTimestampWrites(it) } }
			set(newValue) {
				handle.useContents { timestampWrites = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var colorAttachmentCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.colorAttachmentCount ?: error("pointer of WGPURenderPassDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.colorAttachmentCount = newValue }
			}

		override var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.colorAttachments?.let(::NativeAddress)?.let { ArrayHolder<WGPURenderPassColorAttachment>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.colorAttachments = newValue?.handler?.reinterpret() }
			}

		override var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.depthStencilAttachment?.let(::NativeAddress)?.let { WGPURenderPassDepthStencilAttachment(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.depthStencilAttachment = newValue?.handler?.reinterpret() }
			}

		override var occlusionQuerySet: WGPUQuerySet?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.occlusionQuerySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.occlusionQuerySet = newValue?.handler?.reinterpret() }
			}

		override var timestampWrites: WGPURenderPassTimestampWrites?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.timestampWrites?.let(::NativeAddress)?.let { WGPURenderPassTimestampWrites(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassDescriptor>().pointed.let { it.timestampWrites = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDescriptor>())
			.let { WGPURenderPassDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassDescriptor) -> Unit,
		): ArrayHolder<WGPURenderPassDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassDescriptor>() * size.toLong())
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

public actual interface WGPUChainedStruct {
	public actual var next: WGPUChainedStruct?

	public actual var sType: WGPUSType

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUChainedStruct> = cValue<webgpu.native.WGPUChainedStruct> {
		next = this@WGPUChainedStruct.next?.handler?.reinterpret()
		sType = this@WGPUChainedStruct.sType
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUChainedStruct>,
	) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = handle.useContents { next?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { next = newValue?.handler?.reinterpret() }
			}

		override var sType: WGPUSType
			get() = handle.useContents { sType ?: error("pointer of WGPUChainedStruct is null") }
			set(newValue) {
				handle.useContents { sType = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUChainedStruct {
		override var next: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUChainedStruct>().pointed.next?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUChainedStruct>().pointed.let { it.next = newValue?.handler?.reinterpret() }
			}

		override var sType: WGPUSType
			get() = handler.reinterpret<webgpu.native.WGPUChainedStruct>().pointed.sType ?: error("pointer of WGPUChainedStruct is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUChainedStruct>().pointed.let { it.sType = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUChainedStruct = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUChainedStruct = allocator.allocate(sizeOf<webgpu.native.WGPUChainedStruct>())
			.let { WGPUChainedStruct(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUChainedStruct) -> Unit,
		): ArrayHolder<WGPUChainedStruct> = allocator.allocate(sizeOf<webgpu.native.WGPUChainedStruct>() * size.toLong())
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

public actual interface WGPURenderPassMaxDrawCount {
	public actual val chain: WGPUChainedStruct

	public actual var maxDrawCount: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPURenderPassMaxDrawCount> = cValue<webgpu.native.WGPURenderPassMaxDrawCount> {
		chain.adapt(this@WGPURenderPassMaxDrawCount.chain)
		maxDrawCount = this@WGPURenderPassMaxDrawCount.maxDrawCount
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURenderPassMaxDrawCount>,
	) : WGPURenderPassMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var maxDrawCount: ULong
			get() = handle.useContents { maxDrawCount ?: error("pointer of WGPURenderPassMaxDrawCount is null") }
			set(newValue) {
				handle.useContents { maxDrawCount = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassMaxDrawCount {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPURenderPassMaxDrawCount>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var maxDrawCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPURenderPassMaxDrawCount>().pointed.maxDrawCount ?: error("pointer of WGPURenderPassMaxDrawCount is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassMaxDrawCount>().pointed.let { it.maxDrawCount = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassMaxDrawCount = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassMaxDrawCount = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassMaxDrawCount>())
			.let { WGPURenderPassMaxDrawCount(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassMaxDrawCount) -> Unit,
		): ArrayHolder<WGPURenderPassMaxDrawCount> = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassMaxDrawCount>() * size.toLong())
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

public actual interface WGPURenderPassTimestampWrites {
	public actual var querySet: WGPUQuerySet?

	public actual var beginningOfPassWriteIndex: UInt

	public actual var endOfPassWriteIndex: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPURenderPassTimestampWrites> = cValue<webgpu.native.WGPURenderPassTimestampWrites> {
		querySet = this@WGPURenderPassTimestampWrites.querySet?.handler?.reinterpret()
		beginningOfPassWriteIndex = this@WGPURenderPassTimestampWrites.beginningOfPassWriteIndex
		endOfPassWriteIndex = this@WGPURenderPassTimestampWrites.endOfPassWriteIndex
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURenderPassTimestampWrites>,
	) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handle.useContents { querySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) } }
			set(newValue) {
				handle.useContents { querySet = newValue?.handler?.reinterpret() }
			}

		override var beginningOfPassWriteIndex: UInt
			get() = handle.useContents { beginningOfPassWriteIndex ?: error("pointer of WGPURenderPassTimestampWrites is null") }
			set(newValue) {
				handle.useContents { beginningOfPassWriteIndex = newValue }
			}

		override var endOfPassWriteIndex: UInt
			get() = handle.useContents { endOfPassWriteIndex ?: error("pointer of WGPURenderPassTimestampWrites is null") }
			set(newValue) {
				handle.useContents { endOfPassWriteIndex = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPassTimestampWrites {
		override var querySet: WGPUQuerySet?
			get() = handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.querySet?.let(::NativeAddress)?.let { WGPUQuerySet(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.let { it.querySet = newValue?.handler?.reinterpret() }
			}

		override var beginningOfPassWriteIndex: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.beginningOfPassWriteIndex ?: error("pointer of WGPURenderPassTimestampWrites is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.let { it.beginningOfPassWriteIndex = newValue }
			}

		override var endOfPassWriteIndex: UInt
			get() = handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.endOfPassWriteIndex ?: error("pointer of WGPURenderPassTimestampWrites is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPassTimestampWrites>().pointed.let { it.endOfPassWriteIndex = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPassTimestampWrites = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPassTimestampWrites = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassTimestampWrites>())
			.let { WGPURenderPassTimestampWrites(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassTimestampWrites) -> Unit,
		): ArrayHolder<WGPURenderPassTimestampWrites> = allocator.allocate(sizeOf<webgpu.native.WGPURenderPassTimestampWrites>() * size.toLong())
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

public actual interface WGPUVertexState {
	public actual var nextInChain: NativeAddress?

	public actual var module: WGPUShaderModule?

	public actual val entryPoint: WGPUStringView

	public actual var constantCount: ULong

	public actual var constants: ArrayHolder<WGPUConstantEntry>?

	public actual var bufferCount: ULong

	public actual var buffers: ArrayHolder<WGPUVertexBufferLayout>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUVertexState> = cValue<webgpu.native.WGPUVertexState> {
		entryPoint.adapt(this@WGPUVertexState.entryPoint)
		nextInChain = this@WGPUVertexState.nextInChain?.reinterpret()
		module = this@WGPUVertexState.module?.handler?.reinterpret()
		constantCount = this@WGPUVertexState.constantCount
		constants = this@WGPUVertexState.constants?.handler?.reinterpret()
		bufferCount = this@WGPUVertexState.bufferCount
		buffers = this@WGPUVertexState.buffers?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUVertexState>,
	) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var module: WGPUShaderModule?
			get() = handle.useContents { module?.let(::NativeAddress)?.let { WGPUShaderModule(it) } }
			set(newValue) {
				handle.useContents { module = newValue?.handler?.reinterpret() }
			}

		override val entryPoint: WGPUStringView
			get() = handle.useContents { entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var constantCount: ULong
			get() = handle.useContents { constantCount ?: error("pointer of WGPUVertexState is null") }
			set(newValue) {
				handle.useContents { constantCount = newValue }
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handle.useContents { constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) } }
			set(newValue) {
				handle.useContents { constants = newValue?.handler?.reinterpret() }
			}

		override var bufferCount: ULong
			get() = handle.useContents { bufferCount ?: error("pointer of WGPUVertexState is null") }
			set(newValue) {
				handle.useContents { bufferCount = newValue }
			}

		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = handle.useContents { buffers?.let(::NativeAddress)?.let { ArrayHolder<WGPUVertexBufferLayout>(it) } }
			set(newValue) {
				handle.useContents { buffers = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUVertexState {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var module: WGPUShaderModule?
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.module?.let(::NativeAddress)?.let { WGPUShaderModule(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.module = newValue?.handler?.reinterpret() }
			}

		override val entryPoint: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.entryPoint.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var constantCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.constantCount ?: error("pointer of WGPUVertexState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.constantCount = newValue }
			}

		override var constants: ArrayHolder<WGPUConstantEntry>?
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.constants?.let(::NativeAddress)?.let { ArrayHolder<WGPUConstantEntry>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.constants = newValue?.handler?.reinterpret() }
			}

		override var bufferCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.bufferCount ?: error("pointer of WGPUVertexState is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.bufferCount = newValue }
			}

		override var buffers: ArrayHolder<WGPUVertexBufferLayout>?
			get() = handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.buffers?.let(::NativeAddress)?.let { ArrayHolder<WGPUVertexBufferLayout>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexState>().pointed.let { it.buffers = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUVertexState = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUVertexState = allocator.allocate(sizeOf<webgpu.native.WGPUVertexState>())
			.let { WGPUVertexState(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexState) -> Unit,
		): ArrayHolder<WGPUVertexState> = allocator.allocate(sizeOf<webgpu.native.WGPUVertexState>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPURenderPipelineDescriptor> = cValue<webgpu.native.WGPURenderPipelineDescriptor> {
		label.adapt(this@WGPURenderPipelineDescriptor.label)
		vertex.adapt(this@WGPURenderPipelineDescriptor.vertex)
		primitive.adapt(this@WGPURenderPipelineDescriptor.primitive)
		multisample.adapt(this@WGPURenderPipelineDescriptor.multisample)
		nextInChain = this@WGPURenderPipelineDescriptor.nextInChain?.reinterpret()
		layout = this@WGPURenderPipelineDescriptor.layout?.handler?.reinterpret()
		depthStencil = this@WGPURenderPipelineDescriptor.depthStencil?.handler?.reinterpret()
		fragment = this@WGPURenderPipelineDescriptor.fragment?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURenderPipelineDescriptor>,
	) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var layout: WGPUPipelineLayout?
			get() = handle.useContents { layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) } }
			set(newValue) {
				handle.useContents { layout = newValue?.handler?.reinterpret() }
			}

		override val vertex: WGPUVertexState
			get() = handle.useContents { vertex.rawPtr.toLong().let(::NativeAddress).let { WGPUVertexState(it) } }

		override val primitive: WGPUPrimitiveState
			get() = handle.useContents { primitive.rawPtr.toLong().let(::NativeAddress).let { WGPUPrimitiveState(it) } }

		override var depthStencil: WGPUDepthStencilState?
			get() = handle.useContents { depthStencil?.let(::NativeAddress)?.let { WGPUDepthStencilState(it) } }
			set(newValue) {
				handle.useContents { depthStencil = newValue?.handler?.reinterpret() }
			}

		override val multisample: WGPUMultisampleState
			get() = handle.useContents { multisample.rawPtr.toLong().let(::NativeAddress).let { WGPUMultisampleState(it) } }

		override var fragment: WGPUFragmentState?
			get() = handle.useContents { fragment?.let(::NativeAddress)?.let { WGPUFragmentState(it) } }
			set(newValue) {
				handle.useContents { fragment = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURenderPipelineDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var layout: WGPUPipelineLayout?
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.layout?.let(::NativeAddress)?.let { WGPUPipelineLayout(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.let { it.layout = newValue?.handler?.reinterpret() }
			}

		override val vertex: WGPUVertexState
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.vertex.rawPtr.toLong().let(::NativeAddress).let { WGPUVertexState(it) }

		override val primitive: WGPUPrimitiveState
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.primitive.rawPtr.toLong().let(::NativeAddress).let { WGPUPrimitiveState(it) }

		override var depthStencil: WGPUDepthStencilState?
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.depthStencil?.let(::NativeAddress)?.let { WGPUDepthStencilState(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.let { it.depthStencil = newValue?.handler?.reinterpret() }
			}

		override val multisample: WGPUMultisampleState
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.multisample.rawPtr.toLong().let(::NativeAddress).let { WGPUMultisampleState(it) }

		override var fragment: WGPUFragmentState?
			get() = handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.fragment?.let(::NativeAddress)?.let { WGPUFragmentState(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURenderPipelineDescriptor>().pointed.let { it.fragment = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURenderPipelineDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURenderPipelineDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPURenderPipelineDescriptor>())
			.let { WGPURenderPipelineDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPipelineDescriptor) -> Unit,
		): ArrayHolder<WGPURenderPipelineDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPURenderPipelineDescriptor>() * size.toLong())
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

public actual interface WGPURequestAdapterOptions {
	public actual var nextInChain: NativeAddress?

	public actual var featureLevel: WGPUFeatureLevel

	public actual var powerPreference: WGPUPowerPreference

	public actual var forceFallbackAdapter: Boolean

	public actual var backendType: WGPUBackendType

	public actual var compatibleSurface: WGPUSurface?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPURequestAdapterOptions> = cValue<webgpu.native.WGPURequestAdapterOptions> {
		nextInChain = this@WGPURequestAdapterOptions.nextInChain?.reinterpret()
		featureLevel = this@WGPURequestAdapterOptions.featureLevel
		powerPreference = this@WGPURequestAdapterOptions.powerPreference
		forceFallbackAdapter = this@WGPURequestAdapterOptions.forceFallbackAdapter.toUInt()
		backendType = this@WGPURequestAdapterOptions.backendType
		compatibleSurface = this@WGPURequestAdapterOptions.compatibleSurface?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURequestAdapterOptions>,
	) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var featureLevel: WGPUFeatureLevel
			get() = handle.useContents { featureLevel ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) {
				handle.useContents { featureLevel = newValue }
			}

		override var powerPreference: WGPUPowerPreference
			get() = handle.useContents { powerPreference ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) {
				handle.useContents { powerPreference = newValue }
			}

		override var forceFallbackAdapter: Boolean
			get() = handle.useContents { forceFallbackAdapter.toBoolean() ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) {
				handle.useContents { forceFallbackAdapter = newValue.toUInt() }
			}

		override var backendType: WGPUBackendType
			get() = handle.useContents { backendType ?: error("pointer of WGPURequestAdapterOptions is null") }
			set(newValue) {
				handle.useContents { backendType = newValue }
			}

		override var compatibleSurface: WGPUSurface?
			get() = handle.useContents { compatibleSurface?.let(::NativeAddress)?.let { WGPUSurface(it) } }
			set(newValue) {
				handle.useContents { compatibleSurface = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURequestAdapterOptions {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var featureLevel: WGPUFeatureLevel
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.featureLevel ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.featureLevel = newValue }
			}

		override var powerPreference: WGPUPowerPreference
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.powerPreference ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.powerPreference = newValue }
			}

		override var forceFallbackAdapter: Boolean
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.forceFallbackAdapter.toBoolean() ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.forceFallbackAdapter = newValue.toUInt() }
			}

		override var backendType: WGPUBackendType
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.backendType ?: error("pointer of WGPURequestAdapterOptions is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.backendType = newValue }
			}

		override var compatibleSurface: WGPUSurface?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.compatibleSurface?.let(::NativeAddress)?.let { WGPUSurface(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterOptions>().pointed.let { it.compatibleSurface = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURequestAdapterOptions = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterOptions = allocator.allocate(sizeOf<webgpu.native.WGPURequestAdapterOptions>())
			.let { WGPURequestAdapterOptions(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestAdapterOptions) -> Unit,
		): ArrayHolder<WGPURequestAdapterOptions> = allocator.allocate(sizeOf<webgpu.native.WGPURequestAdapterOptions>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPUSamplerDescriptor> = cValue<webgpu.native.WGPUSamplerDescriptor> {
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

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSamplerDescriptor>,
	) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var addressModeU: WGPUAddressMode
			get() = handle.useContents { addressModeU ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { addressModeU = newValue }
			}

		override var addressModeV: WGPUAddressMode
			get() = handle.useContents { addressModeV ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { addressModeV = newValue }
			}

		override var addressModeW: WGPUAddressMode
			get() = handle.useContents { addressModeW ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { addressModeW = newValue }
			}

		override var magFilter: WGPUFilterMode
			get() = handle.useContents { magFilter ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { magFilter = newValue }
			}

		override var minFilter: WGPUFilterMode
			get() = handle.useContents { minFilter ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { minFilter = newValue }
			}

		override var mipmapFilter: WGPUMipmapFilterMode
			get() = handle.useContents { mipmapFilter ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { mipmapFilter = newValue }
			}

		override var lodMinClamp: Float
			get() = handle.useContents { lodMinClamp ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { lodMinClamp = newValue }
			}

		override var lodMaxClamp: Float
			get() = handle.useContents { lodMaxClamp ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { lodMaxClamp = newValue }
			}

		override var compare: WGPUCompareFunction
			get() = handle.useContents { compare ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { compare = newValue }
			}

		override var maxAnisotropy: UShort
			get() = handle.useContents { maxAnisotropy ?: error("pointer of WGPUSamplerDescriptor is null") }
			set(newValue) {
				handle.useContents { maxAnisotropy = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSamplerDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var addressModeU: WGPUAddressMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.addressModeU ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.addressModeU = newValue }
			}

		override var addressModeV: WGPUAddressMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.addressModeV ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.addressModeV = newValue }
			}

		override var addressModeW: WGPUAddressMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.addressModeW ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.addressModeW = newValue }
			}

		override var magFilter: WGPUFilterMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.magFilter ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.magFilter = newValue }
			}

		override var minFilter: WGPUFilterMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.minFilter ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.minFilter = newValue }
			}

		override var mipmapFilter: WGPUMipmapFilterMode
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.mipmapFilter ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.mipmapFilter = newValue }
			}

		override var lodMinClamp: Float
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.lodMinClamp ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.lodMinClamp = newValue }
			}

		override var lodMaxClamp: Float
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.lodMaxClamp ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.lodMaxClamp = newValue }
			}

		override var compare: WGPUCompareFunction
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.compare ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.compare = newValue }
			}

		override var maxAnisotropy: UShort
			get() = handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.maxAnisotropy ?: error("pointer of WGPUSamplerDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSamplerDescriptor>().pointed.let { it.maxAnisotropy = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSamplerDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSamplerDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUSamplerDescriptor>())
			.let { WGPUSamplerDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSamplerDescriptor) -> Unit,
		): ArrayHolder<WGPUSamplerDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUSamplerDescriptor>() * size.toLong())
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

public actual interface WGPUShaderModuleDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUShaderModuleDescriptor> = cValue<webgpu.native.WGPUShaderModuleDescriptor> {
		label.adapt(this@WGPUShaderModuleDescriptor.label)
		nextInChain = this@WGPUShaderModuleDescriptor.nextInChain?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUShaderModuleDescriptor>,
	) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUShaderModuleDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUShaderModuleDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUShaderModuleDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUShaderModuleDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleDescriptor>())
			.let { WGPUShaderModuleDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderModuleDescriptor) -> Unit,
		): ArrayHolder<WGPUShaderModuleDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUShaderModuleDescriptor>() * size.toLong())
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

public actual interface WGPUShaderSourceSPIRV {
	public actual val chain: WGPUChainedStruct

	public actual var codeSize: UInt

	public actual var code: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUShaderSourceSPIRV> = cValue<webgpu.native.WGPUShaderSourceSPIRV> {
		chain.adapt(this@WGPUShaderSourceSPIRV.chain)
		codeSize = this@WGPUShaderSourceSPIRV.codeSize
		code = this@WGPUShaderSourceSPIRV.code?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUShaderSourceSPIRV>,
	) : WGPUShaderSourceSPIRV {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var codeSize: UInt
			get() = handle.useContents { codeSize ?: error("pointer of WGPUShaderSourceSPIRV is null") }
			set(newValue) {
				handle.useContents { codeSize = newValue }
			}

		override var code: NativeAddress?
			get() = handle.useContents { code?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { code = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUShaderSourceSPIRV {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var codeSize: UInt
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.codeSize ?: error("pointer of WGPUShaderSourceSPIRV is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.let { it.codeSize = newValue }
			}

		override var code: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.code?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUShaderSourceSPIRV>().pointed.let { it.code = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUShaderSourceSPIRV = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUShaderSourceSPIRV = allocator.allocate(sizeOf<webgpu.native.WGPUShaderSourceSPIRV>())
			.let { WGPUShaderSourceSPIRV(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderSourceSPIRV) -> Unit,
		): ArrayHolder<WGPUShaderSourceSPIRV> = allocator.allocate(sizeOf<webgpu.native.WGPUShaderSourceSPIRV>() * size.toLong())
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

public actual interface WGPUShaderSourceWGSL {
	public actual val chain: WGPUChainedStruct

	public actual val code: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUShaderSourceWGSL> = cValue<webgpu.native.WGPUShaderSourceWGSL> {
		chain.adapt(this@WGPUShaderSourceWGSL.chain)
		code.adapt(this@WGPUShaderSourceWGSL.code)
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUShaderSourceWGSL>,
	) : WGPUShaderSourceWGSL {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override val code: WGPUStringView
			get() = handle.useContents { code.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUShaderSourceWGSL {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceWGSL>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override val code: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUShaderSourceWGSL>().pointed.code.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUShaderSourceWGSL = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUShaderSourceWGSL = allocator.allocate(sizeOf<webgpu.native.WGPUShaderSourceWGSL>())
			.let { WGPUShaderSourceWGSL(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderSourceWGSL) -> Unit,
		): ArrayHolder<WGPUShaderSourceWGSL> = allocator.allocate(sizeOf<webgpu.native.WGPUShaderSourceWGSL>() * size.toLong())
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

public actual interface WGPUSupportedFeatures {
	public actual var featureCount: ULong

	public actual var features: ArrayHolder<WGPUFeatureName>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSupportedFeatures> = cValue<webgpu.native.WGPUSupportedFeatures> {
		featureCount = this@WGPUSupportedFeatures.featureCount
		features = this@WGPUSupportedFeatures.features?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSupportedFeatures>,
	) : WGPUSupportedFeatures {
		override var featureCount: ULong
			get() = handle.useContents { featureCount ?: error("pointer of WGPUSupportedFeatures is null") }
			set(newValue) {
				handle.useContents { featureCount = newValue }
			}

		override var features: ArrayHolder<WGPUFeatureName>?
			get() = handle.useContents { features?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) } }
			set(newValue) {
				handle.useContents { features = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSupportedFeatures {
		override var featureCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSupportedFeatures>().pointed.featureCount ?: error("pointer of WGPUSupportedFeatures is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSupportedFeatures>().pointed.let { it.featureCount = newValue }
			}

		override var features: ArrayHolder<WGPUFeatureName>?
			get() = handler.reinterpret<webgpu.native.WGPUSupportedFeatures>().pointed.features?.let(::NativeAddress)?.let { ArrayHolder<WGPUFeatureName>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSupportedFeatures>().pointed.let { it.features = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSupportedFeatures = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSupportedFeatures = allocator.allocate(sizeOf<webgpu.native.WGPUSupportedFeatures>())
			.let { WGPUSupportedFeatures(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSupportedFeatures) -> Unit,
		): ArrayHolder<WGPUSupportedFeatures> = allocator.allocate(sizeOf<webgpu.native.WGPUSupportedFeatures>() * size.toLong())
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

public actual interface WGPUSupportedWGSLLanguageFeatures {
	public actual var featureCount: ULong

	public actual var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSupportedWGSLLanguageFeatures> = cValue<webgpu.native.WGPUSupportedWGSLLanguageFeatures> {
		featureCount = this@WGPUSupportedWGSLLanguageFeatures.featureCount
		features = this@WGPUSupportedWGSLLanguageFeatures.features?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSupportedWGSLLanguageFeatures>,
	) : WGPUSupportedWGSLLanguageFeatures {
		override var featureCount: ULong
			get() = handle.useContents { featureCount ?: error("pointer of WGPUSupportedWGSLLanguageFeatures is null") }
			set(newValue) {
				handle.useContents { featureCount = newValue }
			}

		override var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?
			get() = handle.useContents { features?.let(::NativeAddress)?.let { ArrayHolder<WGPUWGSLLanguageFeatureName>(it) } }
			set(newValue) {
				handle.useContents { features = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSupportedWGSLLanguageFeatures {
		override var featureCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSupportedWGSLLanguageFeatures>().pointed.featureCount ?: error("pointer of WGPUSupportedWGSLLanguageFeatures is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSupportedWGSLLanguageFeatures>().pointed.let { it.featureCount = newValue }
			}

		override var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?
			get() = handler.reinterpret<webgpu.native.WGPUSupportedWGSLLanguageFeatures>().pointed.features?.let(::NativeAddress)?.let { ArrayHolder<WGPUWGSLLanguageFeatureName>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSupportedWGSLLanguageFeatures>().pointed.let { it.features = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSupportedWGSLLanguageFeatures = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSupportedWGSLLanguageFeatures = allocator.allocate(sizeOf<webgpu.native.WGPUSupportedWGSLLanguageFeatures>())
			.let { WGPUSupportedWGSLLanguageFeatures(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSupportedWGSLLanguageFeatures) -> Unit,
		): ArrayHolder<WGPUSupportedWGSLLanguageFeatures> = allocator.allocate(sizeOf<webgpu.native.WGPUSupportedWGSLLanguageFeatures>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceCapabilities> = cValue<webgpu.native.WGPUSurfaceCapabilities> {
		nextInChain = this@WGPUSurfaceCapabilities.nextInChain?.reinterpret()
		usages = this@WGPUSurfaceCapabilities.usages
		formatCount = this@WGPUSurfaceCapabilities.formatCount
		formats = this@WGPUSurfaceCapabilities.formats?.handler?.reinterpret()
		presentModeCount = this@WGPUSurfaceCapabilities.presentModeCount
		presentModes = this@WGPUSurfaceCapabilities.presentModes?.handler?.reinterpret()
		alphaModeCount = this@WGPUSurfaceCapabilities.alphaModeCount
		alphaModes = this@WGPUSurfaceCapabilities.alphaModes?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceCapabilities>,
	) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var usages: ULong
			get() = handle.useContents { usages ?: error("pointer of WGPUSurfaceCapabilities is null") }
			set(newValue) {
				handle.useContents { usages = newValue }
			}

		override var formatCount: ULong
			get() = handle.useContents { formatCount ?: error("pointer of WGPUSurfaceCapabilities is null") }
			set(newValue) {
				handle.useContents { formatCount = newValue }
			}

		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.useContents { formats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) } }
			set(newValue) {
				handle.useContents { formats = newValue?.handler?.reinterpret() }
			}

		override var presentModeCount: ULong
			get() = handle.useContents { presentModeCount ?: error("pointer of WGPUSurfaceCapabilities is null") }
			set(newValue) {
				handle.useContents { presentModeCount = newValue }
			}

		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = handle.useContents { presentModes?.let(::NativeAddress)?.let { ArrayHolder<WGPUPresentMode>(it) } }
			set(newValue) {
				handle.useContents { presentModes = newValue?.handler?.reinterpret() }
			}

		override var alphaModeCount: ULong
			get() = handle.useContents { alphaModeCount ?: error("pointer of WGPUSurfaceCapabilities is null") }
			set(newValue) {
				handle.useContents { alphaModeCount = newValue }
			}

		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = handle.useContents { alphaModes?.let(::NativeAddress)?.let { ArrayHolder<WGPUCompositeAlphaMode>(it) } }
			set(newValue) {
				handle.useContents { alphaModes = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceCapabilities {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var usages: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.usages ?: error("pointer of WGPUSurfaceCapabilities is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.usages = newValue }
			}

		override var formatCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.formatCount ?: error("pointer of WGPUSurfaceCapabilities is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.formatCount = newValue }
			}

		override var formats: ArrayHolder<WGPUTextureFormat>?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.formats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.formats = newValue?.handler?.reinterpret() }
			}

		override var presentModeCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.presentModeCount ?: error("pointer of WGPUSurfaceCapabilities is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.presentModeCount = newValue }
			}

		override var presentModes: ArrayHolder<WGPUPresentMode>?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.presentModes?.let(::NativeAddress)?.let { ArrayHolder<WGPUPresentMode>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.presentModes = newValue?.handler?.reinterpret() }
			}

		override var alphaModeCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.alphaModeCount ?: error("pointer of WGPUSurfaceCapabilities is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.alphaModeCount = newValue }
			}

		override var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.alphaModes?.let(::NativeAddress)?.let { ArrayHolder<WGPUCompositeAlphaMode>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceCapabilities>().pointed.let { it.alphaModes = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceCapabilities = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceCapabilities = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceCapabilities>())
			.let { WGPUSurfaceCapabilities(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceCapabilities) -> Unit,
		): ArrayHolder<WGPUSurfaceCapabilities> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceCapabilities>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceConfiguration> = cValue<webgpu.native.WGPUSurfaceConfiguration> {
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

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceConfiguration>,
	) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var device: WGPUDevice?
			get() = handle.useContents { device?.let(::NativeAddress)?.let { WGPUDevice(it) } }
			set(newValue) {
				handle.useContents { device = newValue?.handler?.reinterpret() }
			}

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) {
				handle.useContents { format = newValue }
			}

		override var usage: ULong
			get() = handle.useContents { usage ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) {
				handle.useContents { usage = newValue }
			}

		override var width: UInt
			get() = handle.useContents { width ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) {
				handle.useContents { width = newValue }
			}

		override var height: UInt
			get() = handle.useContents { height ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) {
				handle.useContents { height = newValue }
			}

		override var viewFormatCount: ULong
			get() = handle.useContents { viewFormatCount ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) {
				handle.useContents { viewFormatCount = newValue }
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.useContents { viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) } }
			set(newValue) {
				handle.useContents { viewFormats = newValue?.handler?.reinterpret() }
			}

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handle.useContents { alphaMode ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) {
				handle.useContents { alphaMode = newValue }
			}

		override var presentMode: WGPUPresentMode
			get() = handle.useContents { presentMode ?: error("pointer of WGPUSurfaceConfiguration is null") }
			set(newValue) {
				handle.useContents { presentMode = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceConfiguration {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var device: WGPUDevice?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.device?.let(::NativeAddress)?.let { WGPUDevice(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.device = newValue?.handler?.reinterpret() }
			}

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.format ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.format = newValue }
			}

		override var usage: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.usage ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.usage = newValue }
			}

		override var width: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.width ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.width = newValue }
			}

		override var height: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.height ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.height = newValue }
			}

		override var viewFormatCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.viewFormatCount ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.viewFormatCount = newValue }
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.viewFormats = newValue?.handler?.reinterpret() }
			}

		override var alphaMode: WGPUCompositeAlphaMode
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.alphaMode ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.alphaMode = newValue }
			}

		override var presentMode: WGPUPresentMode
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.presentMode ?: error("pointer of WGPUSurfaceConfiguration is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceConfiguration>().pointed.let { it.presentMode = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceConfiguration = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceConfiguration = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceConfiguration>())
			.let { WGPUSurfaceConfiguration(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceConfiguration) -> Unit,
		): ArrayHolder<WGPUSurfaceConfiguration> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceConfiguration>() * size.toLong())
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

public actual interface WGPUSurfaceDescriptor {
	public actual var nextInChain: NativeAddress?

	public actual val label: WGPUStringView

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceDescriptor> = cValue<webgpu.native.WGPUSurfaceDescriptor> {
		label.adapt(this@WGPUSurfaceDescriptor.label)
		nextInChain = this@WGPUSurfaceDescriptor.nextInChain?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceDescriptor>,
	) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptor>())
			.let { WGPUSurfaceDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceDescriptor) -> Unit,
		): ArrayHolder<WGPUSurfaceDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceDescriptor>() * size.toLong())
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

public actual interface WGPUSurfaceSourceAndroidNativeWindow {
	public actual val chain: WGPUChainedStruct

	public actual var window: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow> = cValue<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow> {
		chain.adapt(this@WGPUSurfaceSourceAndroidNativeWindow.chain)
		window = this@WGPUSurfaceSourceAndroidNativeWindow.window?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>,
	) : WGPUSurfaceSourceAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var window: NativeAddress?
			get() = handle.useContents { window?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { window = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceAndroidNativeWindow {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var window: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>().pointed.window?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>().pointed.let { it.window = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceAndroidNativeWindow = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceAndroidNativeWindow = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>())
			.let { WGPUSurfaceSourceAndroidNativeWindow(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceAndroidNativeWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceAndroidNativeWindow> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceAndroidNativeWindow>() * size.toLong())
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

public actual interface WGPUSurfaceSourceMetalLayer {
	public actual val chain: WGPUChainedStruct

	public actual var layer: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceMetalLayer> = cValue<webgpu.native.WGPUSurfaceSourceMetalLayer> {
		chain.adapt(this@WGPUSurfaceSourceMetalLayer.chain)
		layer = this@WGPUSurfaceSourceMetalLayer.layer?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceSourceMetalLayer>,
	) : WGPUSurfaceSourceMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var layer: NativeAddress?
			get() = handle.useContents { layer?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { layer = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceMetalLayer {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceMetalLayer>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var layer: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceMetalLayer>().pointed.layer?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceMetalLayer>().pointed.let { it.layer = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceMetalLayer = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceMetalLayer = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceMetalLayer>())
			.let { WGPUSurfaceSourceMetalLayer(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceMetalLayer) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceMetalLayer> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceMetalLayer>() * size.toLong())
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

public actual interface WGPUSurfaceSourceWaylandSurface {
	public actual val chain: WGPUChainedStruct

	public actual var display: NativeAddress?

	public actual var surface: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceWaylandSurface> = cValue<webgpu.native.WGPUSurfaceSourceWaylandSurface> {
		chain.adapt(this@WGPUSurfaceSourceWaylandSurface.chain)
		display = this@WGPUSurfaceSourceWaylandSurface.display?.reinterpret()
		surface = this@WGPUSurfaceSourceWaylandSurface.surface?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceSourceWaylandSurface>,
	) : WGPUSurfaceSourceWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var display: NativeAddress?
			get() = handle.useContents { display?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { display = newValue?.reinterpret() }
			}

		override var surface: NativeAddress?
			get() = handle.useContents { surface?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { surface = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceWaylandSurface {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var display: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.display?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.let { it.display = newValue?.reinterpret() }
			}

		override var surface: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.surface?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceWaylandSurface>().pointed.let { it.surface = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWaylandSurface = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWaylandSurface = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceWaylandSurface>())
			.let { WGPUSurfaceSourceWaylandSurface(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceWaylandSurface) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceWaylandSurface> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceWaylandSurface>() * size.toLong())
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

public actual interface WGPUSurfaceSourceWindowsHWND {
	public actual val chain: WGPUChainedStruct

	public actual var hinstance: NativeAddress?

	public actual var hwnd: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceWindowsHWND> = cValue<webgpu.native.WGPUSurfaceSourceWindowsHWND> {
		chain.adapt(this@WGPUSurfaceSourceWindowsHWND.chain)
		hinstance = this@WGPUSurfaceSourceWindowsHWND.hinstance?.reinterpret()
		hwnd = this@WGPUSurfaceSourceWindowsHWND.hwnd?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceSourceWindowsHWND>,
	) : WGPUSurfaceSourceWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var hinstance: NativeAddress?
			get() = handle.useContents { hinstance?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { hinstance = newValue?.reinterpret() }
			}

		override var hwnd: NativeAddress?
			get() = handle.useContents { hwnd?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { hwnd = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceWindowsHWND {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var hinstance: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.hinstance?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.let { it.hinstance = newValue?.reinterpret() }
			}

		override var hwnd: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.hwnd?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceWindowsHWND>().pointed.let { it.hwnd = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWindowsHWND = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWindowsHWND = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceWindowsHWND>())
			.let { WGPUSurfaceSourceWindowsHWND(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceWindowsHWND) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceWindowsHWND> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceWindowsHWND>() * size.toLong())
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

public actual interface WGPUSurfaceSourceXCBWindow {
	public actual val chain: WGPUChainedStruct

	public actual var connection: NativeAddress?

	public actual var window: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceXCBWindow> = cValue<webgpu.native.WGPUSurfaceSourceXCBWindow> {
		chain.adapt(this@WGPUSurfaceSourceXCBWindow.chain)
		connection = this@WGPUSurfaceSourceXCBWindow.connection?.reinterpret()
		window = this@WGPUSurfaceSourceXCBWindow.window
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceSourceXCBWindow>,
	) : WGPUSurfaceSourceXCBWindow {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var connection: NativeAddress?
			get() = handle.useContents { connection?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { connection = newValue?.reinterpret() }
			}

		override var window: UInt
			get() = handle.useContents { window ?: error("pointer of WGPUSurfaceSourceXCBWindow is null") }
			set(newValue) {
				handle.useContents { window = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceXCBWindow {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var connection: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.connection?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.let { it.connection = newValue?.reinterpret() }
			}

		override var window: UInt
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.window ?: error("pointer of WGPUSurfaceSourceXCBWindow is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceXCBWindow>().pointed.let { it.window = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXCBWindow = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXCBWindow = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceXCBWindow>())
			.let { WGPUSurfaceSourceXCBWindow(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceXCBWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceXCBWindow> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceXCBWindow>() * size.toLong())
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

public actual interface WGPUSurfaceSourceXlibWindow {
	public actual val chain: WGPUChainedStruct

	public actual var display: NativeAddress?

	public actual var window: ULong

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceSourceXlibWindow> = cValue<webgpu.native.WGPUSurfaceSourceXlibWindow> {
		chain.adapt(this@WGPUSurfaceSourceXlibWindow.chain)
		display = this@WGPUSurfaceSourceXlibWindow.display?.reinterpret()
		window = this@WGPUSurfaceSourceXlibWindow.window
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceSourceXlibWindow>,
	) : WGPUSurfaceSourceXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var display: NativeAddress?
			get() = handle.useContents { display?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { display = newValue?.reinterpret() }
			}

		override var window: ULong
			get() = handle.useContents { window ?: error("pointer of WGPUSurfaceSourceXlibWindow is null") }
			set(newValue) {
				handle.useContents { window = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceSourceXlibWindow {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var display: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.display?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.let { it.display = newValue?.reinterpret() }
			}

		override var window: ULong
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.window ?: error("pointer of WGPUSurfaceSourceXlibWindow is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceSourceXlibWindow>().pointed.let { it.window = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXlibWindow = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXlibWindow = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceXlibWindow>())
			.let { WGPUSurfaceSourceXlibWindow(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceXlibWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceXlibWindow> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceSourceXlibWindow>() * size.toLong())
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

public actual interface WGPUSurfaceTexture {
	public actual var nextInChain: NativeAddress?

	public actual var texture: WGPUTexture?

	public actual var status: WGPUSurfaceGetCurrentTextureStatus

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUSurfaceTexture> = cValue<webgpu.native.WGPUSurfaceTexture> {
		nextInChain = this@WGPUSurfaceTexture.nextInChain?.reinterpret()
		texture = this@WGPUSurfaceTexture.texture?.handler?.reinterpret()
		status = this@WGPUSurfaceTexture.status
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUSurfaceTexture>,
	) : WGPUSurfaceTexture {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override var texture: WGPUTexture?
			get() = handle.useContents { texture?.let(::NativeAddress)?.let { WGPUTexture(it) } }
			set(newValue) {
				handle.useContents { texture = newValue?.handler?.reinterpret() }
			}

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handle.useContents { status ?: error("pointer of WGPUSurfaceTexture is null") }
			set(newValue) {
				handle.useContents { status = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUSurfaceTexture {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override var texture: WGPUTexture?
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.texture?.let(::NativeAddress)?.let { WGPUTexture(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.let { it.texture = newValue?.handler?.reinterpret() }
			}

		override var status: WGPUSurfaceGetCurrentTextureStatus
			get() = handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.status ?: error("pointer of WGPUSurfaceTexture is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUSurfaceTexture>().pointed.let { it.status = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUSurfaceTexture = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUSurfaceTexture = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceTexture>())
			.let { WGPUSurfaceTexture(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceTexture) -> Unit,
		): ArrayHolder<WGPUSurfaceTexture> = allocator.allocate(sizeOf<webgpu.native.WGPUSurfaceTexture>() * size.toLong())
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

public actual interface WGPUTexelCopyBufferLayout {
	public actual var offset: ULong

	public actual var bytesPerRow: UInt

	public actual var rowsPerImage: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUTexelCopyBufferLayout> = cValue<webgpu.native.WGPUTexelCopyBufferLayout> {
		offset = this@WGPUTexelCopyBufferLayout.offset
		bytesPerRow = this@WGPUTexelCopyBufferLayout.bytesPerRow
		rowsPerImage = this@WGPUTexelCopyBufferLayout.rowsPerImage
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUTexelCopyBufferLayout>,
	) : WGPUTexelCopyBufferLayout {
		override var offset: ULong
			get() = handle.useContents { offset ?: error("pointer of WGPUTexelCopyBufferLayout is null") }
			set(newValue) {
				handle.useContents { offset = newValue }
			}

		override var bytesPerRow: UInt
			get() = handle.useContents { bytesPerRow ?: error("pointer of WGPUTexelCopyBufferLayout is null") }
			set(newValue) {
				handle.useContents { bytesPerRow = newValue }
			}

		override var rowsPerImage: UInt
			get() = handle.useContents { rowsPerImage ?: error("pointer of WGPUTexelCopyBufferLayout is null") }
			set(newValue) {
				handle.useContents { rowsPerImage = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTexelCopyBufferLayout {
		override var offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.offset ?: error("pointer of WGPUTexelCopyBufferLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.let { it.offset = newValue }
			}

		override var bytesPerRow: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.bytesPerRow ?: error("pointer of WGPUTexelCopyBufferLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.let { it.bytesPerRow = newValue }
			}

		override var rowsPerImage: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.rowsPerImage ?: error("pointer of WGPUTexelCopyBufferLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTexelCopyBufferLayout>().pointed.let { it.rowsPerImage = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferLayout = allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyBufferLayout>())
			.let { WGPUTexelCopyBufferLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyBufferLayout) -> Unit,
		): ArrayHolder<WGPUTexelCopyBufferLayout> = allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyBufferLayout>() * size.toLong())
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

public actual interface WGPUTexelCopyBufferInfo {
	public actual val layout: WGPUTexelCopyBufferLayout

	public actual var buffer: WGPUBuffer?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUTexelCopyBufferInfo> = cValue<webgpu.native.WGPUTexelCopyBufferInfo> {
		layout.adapt(this@WGPUTexelCopyBufferInfo.layout)
		buffer = this@WGPUTexelCopyBufferInfo.buffer?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUTexelCopyBufferInfo>,
	) : WGPUTexelCopyBufferInfo {
		override val layout: WGPUTexelCopyBufferLayout
			get() = handle.useContents { layout.rawPtr.toLong().let(::NativeAddress).let { WGPUTexelCopyBufferLayout(it) } }

		override var buffer: WGPUBuffer?
			get() = handle.useContents { buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) } }
			set(newValue) {
				handle.useContents { buffer = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTexelCopyBufferInfo {
		override val layout: WGPUTexelCopyBufferLayout
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferInfo>().pointed.layout.rawPtr.toLong().let(::NativeAddress).let { WGPUTexelCopyBufferLayout(it) }

		override var buffer: WGPUBuffer?
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyBufferInfo>().pointed.buffer?.let(::NativeAddress)?.let { WGPUBuffer(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTexelCopyBufferInfo>().pointed.let { it.buffer = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferInfo = allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyBufferInfo>())
			.let { WGPUTexelCopyBufferInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyBufferInfo) -> Unit,
		): ArrayHolder<WGPUTexelCopyBufferInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyBufferInfo>() * size.toLong())
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

public actual interface WGPUTexelCopyTextureInfo {
	public actual var texture: WGPUTexture?

	public actual var mipLevel: UInt

	public actual val origin: WGPUOrigin3D

	public actual var aspect: WGPUTextureAspect

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUTexelCopyTextureInfo> = cValue<webgpu.native.WGPUTexelCopyTextureInfo> {
		origin.adapt(this@WGPUTexelCopyTextureInfo.origin)
		texture = this@WGPUTexelCopyTextureInfo.texture?.handler?.reinterpret()
		mipLevel = this@WGPUTexelCopyTextureInfo.mipLevel
		aspect = this@WGPUTexelCopyTextureInfo.aspect
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUTexelCopyTextureInfo>,
	) : WGPUTexelCopyTextureInfo {
		override var texture: WGPUTexture?
			get() = handle.useContents { texture?.let(::NativeAddress)?.let { WGPUTexture(it) } }
			set(newValue) {
				handle.useContents { texture = newValue?.handler?.reinterpret() }
			}

		override var mipLevel: UInt
			get() = handle.useContents { mipLevel ?: error("pointer of WGPUTexelCopyTextureInfo is null") }
			set(newValue) {
				handle.useContents { mipLevel = newValue }
			}

		override val origin: WGPUOrigin3D
			get() = handle.useContents { origin.rawPtr.toLong().let(::NativeAddress).let { WGPUOrigin3D(it) } }

		override var aspect: WGPUTextureAspect
			get() = handle.useContents { aspect ?: error("pointer of WGPUTexelCopyTextureInfo is null") }
			set(newValue) {
				handle.useContents { aspect = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTexelCopyTextureInfo {
		override var texture: WGPUTexture?
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.texture?.let(::NativeAddress)?.let { WGPUTexture(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.let { it.texture = newValue?.handler?.reinterpret() }
			}

		override var mipLevel: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.mipLevel ?: error("pointer of WGPUTexelCopyTextureInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.let { it.mipLevel = newValue }
			}

		override val origin: WGPUOrigin3D
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.origin.rawPtr.toLong().let(::NativeAddress).let { WGPUOrigin3D(it) }

		override var aspect: WGPUTextureAspect
			get() = handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.aspect ?: error("pointer of WGPUTexelCopyTextureInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTexelCopyTextureInfo>().pointed.let { it.aspect = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTexelCopyTextureInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTexelCopyTextureInfo = allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyTextureInfo>())
			.let { WGPUTexelCopyTextureInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyTextureInfo) -> Unit,
		): ArrayHolder<WGPUTexelCopyTextureInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUTexelCopyTextureInfo>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPUTextureDescriptor> = cValue<webgpu.native.WGPUTextureDescriptor> {
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

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUTextureDescriptor>,
	) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var usage: ULong
			get() = handle.useContents { usage ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) {
				handle.useContents { usage = newValue }
			}

		override var dimension: WGPUTextureDimension
			get() = handle.useContents { dimension ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) {
				handle.useContents { dimension = newValue }
			}

		override val size: WGPUExtent3D
			get() = handle.useContents { size.rawPtr.toLong().let(::NativeAddress).let { WGPUExtent3D(it) } }

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) {
				handle.useContents { format = newValue }
			}

		override var mipLevelCount: UInt
			get() = handle.useContents { mipLevelCount ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) {
				handle.useContents { mipLevelCount = newValue }
			}

		override var sampleCount: UInt
			get() = handle.useContents { sampleCount ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) {
				handle.useContents { sampleCount = newValue }
			}

		override var viewFormatCount: ULong
			get() = handle.useContents { viewFormatCount ?: error("pointer of WGPUTextureDescriptor is null") }
			set(newValue) {
				handle.useContents { viewFormatCount = newValue }
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handle.useContents { viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) } }
			set(newValue) {
				handle.useContents { viewFormats = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTextureDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var usage: ULong
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.usage ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.usage = newValue }
			}

		override var dimension: WGPUTextureDimension
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.dimension ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.dimension = newValue }
			}

		override val size: WGPUExtent3D
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.size.rawPtr.toLong().let(::NativeAddress).let { WGPUExtent3D(it) }

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.format ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.format = newValue }
			}

		override var mipLevelCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.mipLevelCount ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.mipLevelCount = newValue }
			}

		override var sampleCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.sampleCount ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.sampleCount = newValue }
			}

		override var viewFormatCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.viewFormatCount ?: error("pointer of WGPUTextureDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.viewFormatCount = newValue }
			}

		override var viewFormats: ArrayHolder<WGPUTextureFormat>?
			get() = handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.viewFormats?.let(::NativeAddress)?.let { ArrayHolder<WGPUTextureFormat>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureDescriptor>().pointed.let { it.viewFormats = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTextureDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTextureDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUTextureDescriptor>())
			.let { WGPUTextureDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureDescriptor) -> Unit,
		): ArrayHolder<WGPUTextureDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUTextureDescriptor>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPUTextureViewDescriptor> = cValue<webgpu.native.WGPUTextureViewDescriptor> {
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

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUTextureViewDescriptor>,
	) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = handle.useContents { nextInChain?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handle.useContents { label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var format: WGPUTextureFormat
			get() = handle.useContents { format ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) {
				handle.useContents { format = newValue }
			}

		override var dimension: WGPUTextureViewDimension
			get() = handle.useContents { dimension ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) {
				handle.useContents { dimension = newValue }
			}

		override var baseMipLevel: UInt
			get() = handle.useContents { baseMipLevel ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) {
				handle.useContents { baseMipLevel = newValue }
			}

		override var mipLevelCount: UInt
			get() = handle.useContents { mipLevelCount ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) {
				handle.useContents { mipLevelCount = newValue }
			}

		override var baseArrayLayer: UInt
			get() = handle.useContents { baseArrayLayer ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) {
				handle.useContents { baseArrayLayer = newValue }
			}

		override var arrayLayerCount: UInt
			get() = handle.useContents { arrayLayerCount ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) {
				handle.useContents { arrayLayerCount = newValue }
			}

		override var aspect: WGPUTextureAspect
			get() = handle.useContents { aspect ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) {
				handle.useContents { aspect = newValue }
			}

		override var usage: ULong
			get() = handle.useContents { usage ?: error("pointer of WGPUTextureViewDescriptor is null") }
			set(newValue) {
				handle.useContents { usage = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUTextureViewDescriptor {
		override var nextInChain: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.nextInChain?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.nextInChain = newValue?.reinterpret() }
			}

		override val label: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.label.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var format: WGPUTextureFormat
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.format ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.format = newValue }
			}

		override var dimension: WGPUTextureViewDimension
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.dimension ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.dimension = newValue }
			}

		override var baseMipLevel: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.baseMipLevel ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.baseMipLevel = newValue }
			}

		override var mipLevelCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.mipLevelCount ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.mipLevelCount = newValue }
			}

		override var baseArrayLayer: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.baseArrayLayer ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.baseArrayLayer = newValue }
			}

		override var arrayLayerCount: UInt
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.arrayLayerCount ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.arrayLayerCount = newValue }
			}

		override var aspect: WGPUTextureAspect
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.aspect ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.aspect = newValue }
			}

		override var usage: ULong
			get() = handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.usage ?: error("pointer of WGPUTextureViewDescriptor is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUTextureViewDescriptor>().pointed.let { it.usage = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUTextureViewDescriptor = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUTextureViewDescriptor = allocator.allocate(sizeOf<webgpu.native.WGPUTextureViewDescriptor>())
			.let { WGPUTextureViewDescriptor(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureViewDescriptor) -> Unit,
		): ArrayHolder<WGPUTextureViewDescriptor> = allocator.allocate(sizeOf<webgpu.native.WGPUTextureViewDescriptor>() * size.toLong())
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

public actual interface WGPUVertexAttribute {
	public actual var format: WGPUVertexFormat

	public actual var offset: ULong

	public actual var shaderLocation: UInt

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUVertexAttribute> = cValue<webgpu.native.WGPUVertexAttribute> {
		format = this@WGPUVertexAttribute.format
		offset = this@WGPUVertexAttribute.offset
		shaderLocation = this@WGPUVertexAttribute.shaderLocation
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUVertexAttribute>,
	) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = handle.useContents { format ?: error("pointer of WGPUVertexAttribute is null") }
			set(newValue) {
				handle.useContents { format = newValue }
			}

		override var offset: ULong
			get() = handle.useContents { offset ?: error("pointer of WGPUVertexAttribute is null") }
			set(newValue) {
				handle.useContents { offset = newValue }
			}

		override var shaderLocation: UInt
			get() = handle.useContents { shaderLocation ?: error("pointer of WGPUVertexAttribute is null") }
			set(newValue) {
				handle.useContents { shaderLocation = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUVertexAttribute {
		override var format: WGPUVertexFormat
			get() = handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.format ?: error("pointer of WGPUVertexAttribute is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.let { it.format = newValue }
			}

		override var offset: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.offset ?: error("pointer of WGPUVertexAttribute is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.let { it.offset = newValue }
			}

		override var shaderLocation: UInt
			get() = handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.shaderLocation ?: error("pointer of WGPUVertexAttribute is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexAttribute>().pointed.let { it.shaderLocation = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUVertexAttribute = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUVertexAttribute = allocator.allocate(sizeOf<webgpu.native.WGPUVertexAttribute>())
			.let { WGPUVertexAttribute(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexAttribute) -> Unit,
		): ArrayHolder<WGPUVertexAttribute> = allocator.allocate(sizeOf<webgpu.native.WGPUVertexAttribute>() * size.toLong())
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

public actual interface WGPUVertexBufferLayout {
	public actual var stepMode: WGPUVertexStepMode

	public actual var arrayStride: ULong

	public actual var attributeCount: ULong

	public actual var attributes: ArrayHolder<WGPUVertexAttribute>?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUVertexBufferLayout> = cValue<webgpu.native.WGPUVertexBufferLayout> {
		stepMode = this@WGPUVertexBufferLayout.stepMode
		arrayStride = this@WGPUVertexBufferLayout.arrayStride
		attributeCount = this@WGPUVertexBufferLayout.attributeCount
		attributes = this@WGPUVertexBufferLayout.attributes?.handler?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUVertexBufferLayout>,
	) : WGPUVertexBufferLayout {
		override var stepMode: WGPUVertexStepMode
			get() = handle.useContents { stepMode ?: error("pointer of WGPUVertexBufferLayout is null") }
			set(newValue) {
				handle.useContents { stepMode = newValue }
			}

		override var arrayStride: ULong
			get() = handle.useContents { arrayStride ?: error("pointer of WGPUVertexBufferLayout is null") }
			set(newValue) {
				handle.useContents { arrayStride = newValue }
			}

		override var attributeCount: ULong
			get() = handle.useContents { attributeCount ?: error("pointer of WGPUVertexBufferLayout is null") }
			set(newValue) {
				handle.useContents { attributeCount = newValue }
			}

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = handle.useContents { attributes?.let(::NativeAddress)?.let { ArrayHolder<WGPUVertexAttribute>(it) } }
			set(newValue) {
				handle.useContents { attributes = newValue?.handler?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUVertexBufferLayout {
		override var stepMode: WGPUVertexStepMode
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.stepMode ?: error("pointer of WGPUVertexBufferLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.stepMode = newValue }
			}

		override var arrayStride: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.arrayStride ?: error("pointer of WGPUVertexBufferLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.arrayStride = newValue }
			}

		override var attributeCount: ULong
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.attributeCount ?: error("pointer of WGPUVertexBufferLayout is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.attributeCount = newValue }
			}

		override var attributes: ArrayHolder<WGPUVertexAttribute>?
			get() = handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.attributes?.let(::NativeAddress)?.let { ArrayHolder<WGPUVertexAttribute>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUVertexBufferLayout>().pointed.let { it.attributes = newValue?.handler?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUVertexBufferLayout = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUVertexBufferLayout = allocator.allocate(sizeOf<webgpu.native.WGPUVertexBufferLayout>())
			.let { WGPUVertexBufferLayout(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexBufferLayout) -> Unit,
		): ArrayHolder<WGPUVertexBufferLayout> = allocator.allocate(sizeOf<webgpu.native.WGPUVertexBufferLayout>() * size.toLong())
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

	public fun toCValue(): CValue<webgpu.native.WGPUInstanceExtras> = cValue<webgpu.native.WGPUInstanceExtras> {
		chain.adapt(this@WGPUInstanceExtras.chain)
		dxcPath.adapt(this@WGPUInstanceExtras.dxcPath)
		backends = this@WGPUInstanceExtras.backends
		flags = this@WGPUInstanceExtras.flags
		dx12ShaderCompiler = this@WGPUInstanceExtras.dx12ShaderCompiler
		gles3MinorVersion = this@WGPUInstanceExtras.gles3MinorVersion
		glFenceBehaviour = this@WGPUInstanceExtras.glFenceBehaviour
		dxcMaxShaderModel = this@WGPUInstanceExtras.dxcMaxShaderModel
		budgetForDeviceCreation = this@WGPUInstanceExtras.budgetForDeviceCreation?.reinterpret()
		budgetForDeviceLoss = this@WGPUInstanceExtras.budgetForDeviceLoss?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUInstanceExtras>,
	) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handle.useContents { chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) } }

		override var backends: ULong
			get() = handle.useContents { backends ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) {
				handle.useContents { backends = newValue }
			}

		override var flags: ULong
			get() = handle.useContents { flags ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) {
				handle.useContents { flags = newValue }
			}

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handle.useContents { dx12ShaderCompiler ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) {
				handle.useContents { dx12ShaderCompiler = newValue }
			}

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handle.useContents { gles3MinorVersion ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) {
				handle.useContents { gles3MinorVersion = newValue }
			}

		override var glFenceBehaviour: WGPUGLFenceBehaviour
			get() = handle.useContents { glFenceBehaviour ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) {
				handle.useContents { glFenceBehaviour = newValue }
			}

		override val dxcPath: WGPUStringView
			get() = handle.useContents { dxcPath.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) } }

		override var dxcMaxShaderModel: WGPUDxcMaxShaderModel
			get() = handle.useContents { dxcMaxShaderModel ?: error("pointer of WGPUInstanceExtras is null") }
			set(newValue) {
				handle.useContents { dxcMaxShaderModel = newValue }
			}

		override var budgetForDeviceCreation: NativeAddress?
			get() = handle.useContents { budgetForDeviceCreation?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { budgetForDeviceCreation = newValue?.reinterpret() }
			}

		override var budgetForDeviceLoss: NativeAddress?
			get() = handle.useContents { budgetForDeviceLoss?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { budgetForDeviceLoss = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUInstanceExtras {
		override val chain: WGPUChainedStruct
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.chain.rawPtr.toLong().let(::NativeAddress).let { WGPUChainedStruct(it) }

		override var backends: ULong
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.backends ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.backends = newValue }
			}

		override var flags: ULong
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.flags ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.flags = newValue }
			}

		override var dx12ShaderCompiler: WGPUDx12Compiler
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.dx12ShaderCompiler ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.dx12ShaderCompiler = newValue }
			}

		override var gles3MinorVersion: WGPUGles3MinorVersion
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.gles3MinorVersion ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.gles3MinorVersion = newValue }
			}

		override var glFenceBehaviour: WGPUGLFenceBehaviour
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.glFenceBehaviour ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.glFenceBehaviour = newValue }
			}

		override val dxcPath: WGPUStringView
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.dxcPath.rawPtr.toLong().let(::NativeAddress).let { WGPUStringView(it) }

		override var dxcMaxShaderModel: WGPUDxcMaxShaderModel
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.dxcMaxShaderModel ?: error("pointer of WGPUInstanceExtras is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.dxcMaxShaderModel = newValue }
			}

		override var budgetForDeviceCreation: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.budgetForDeviceCreation?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.budgetForDeviceCreation = newValue?.reinterpret() }
			}

		override var budgetForDeviceLoss: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.budgetForDeviceLoss?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUInstanceExtras>().pointed.let { it.budgetForDeviceLoss = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUInstanceExtras = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUInstanceExtras = allocator.allocate(sizeOf<webgpu.native.WGPUInstanceExtras>())
			.let { WGPUInstanceExtras(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceExtras) -> Unit,
		): ArrayHolder<WGPUInstanceExtras> = allocator.allocate(sizeOf<webgpu.native.WGPUInstanceExtras>() * size.toLong())
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

public actual interface WGPUChainedStructOut {
	public actual var next: WGPUChainedStructOut?

	public actual var sType: WGPUSType

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUChainedStructOut> = cValue<webgpu.native.WGPUChainedStructOut> {
		next = this@WGPUChainedStructOut.next?.handler?.reinterpret()
		sType = this@WGPUChainedStructOut.sType
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUChainedStructOut>,
	) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = handle.useContents { next?.let(::NativeAddress)?.let { WGPUChainedStructOut(it) } }
			set(newValue) {
				handle.useContents { next = newValue?.handler?.reinterpret() }
			}

		override var sType: WGPUSType
			get() = handle.useContents { sType ?: error("pointer of WGPUChainedStructOut is null") }
			set(newValue) {
				handle.useContents { sType = newValue }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUChainedStructOut {
		override var next: WGPUChainedStructOut?
			get() = handler.reinterpret<webgpu.native.WGPUChainedStructOut>().pointed.next?.let(::NativeAddress)?.let { WGPUChainedStructOut(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUChainedStructOut>().pointed.let { it.next = newValue?.handler?.reinterpret() }
			}

		override var sType: WGPUSType
			get() = handler.reinterpret<webgpu.native.WGPUChainedStructOut>().pointed.sType ?: error("pointer of WGPUChainedStructOut is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUChainedStructOut>().pointed.let { it.sType = newValue }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUChainedStructOut = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUChainedStructOut = allocator.allocate(sizeOf<webgpu.native.WGPUChainedStructOut>())
			.let { WGPUChainedStructOut(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUChainedStructOut) -> Unit,
		): ArrayHolder<WGPUChainedStructOut> = allocator.allocate(sizeOf<webgpu.native.WGPUChainedStructOut>() * size.toLong())
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

public actual interface WGPUBufferMapCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUBufferMapCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUBufferMapCallbackInfo> = cValue<webgpu.native.WGPUBufferMapCallbackInfo> {
		nextInChain = this@WGPUBufferMapCallbackInfo.nextInChain?.handler?.reinterpret()
		mode = this@WGPUBufferMapCallbackInfo.mode
		callback = this@WGPUBufferMapCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPUBufferMapCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPUBufferMapCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUBufferMapCallbackInfo>,
	) : WGPUBufferMapCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUBufferMapCallbackInfo is null") }
			set(newValue) {
				handle.useContents { mode = newValue }
			}

		override var callback: CallbackHolder<WGPUBufferMapCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUBufferMapCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUBufferMapCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.mode ?: error("pointer of WGPUBufferMapCallbackInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.mode = newValue }
			}

		override var callback: CallbackHolder<WGPUBufferMapCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUBufferMapCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUBufferMapCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUBufferMapCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUBufferMapCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPUBufferMapCallbackInfo>())
			.let { WGPUBufferMapCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferMapCallbackInfo) -> Unit,
		): ArrayHolder<WGPUBufferMapCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUBufferMapCallbackInfo>() * size.toLong())
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

public actual interface WGPUCompilationInfoCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUCompilationInfoCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUCompilationInfoCallbackInfo> = cValue<webgpu.native.WGPUCompilationInfoCallbackInfo> {
		nextInChain = this@WGPUCompilationInfoCallbackInfo.nextInChain?.handler?.reinterpret()
		mode = this@WGPUCompilationInfoCallbackInfo.mode
		callback = this@WGPUCompilationInfoCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPUCompilationInfoCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPUCompilationInfoCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUCompilationInfoCallbackInfo>,
	) : WGPUCompilationInfoCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUCompilationInfoCallbackInfo is null") }
			set(newValue) {
				handle.useContents { mode = newValue }
			}

		override var callback: CallbackHolder<WGPUCompilationInfoCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCompilationInfoCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCompilationInfoCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.mode ?: error("pointer of WGPUCompilationInfoCallbackInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.mode = newValue }
			}

		override var callback: CallbackHolder<WGPUCompilationInfoCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCompilationInfoCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCompilationInfoCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCompilationInfoCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCompilationInfoCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPUCompilationInfoCallbackInfo>())
			.let { WGPUCompilationInfoCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationInfoCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCompilationInfoCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUCompilationInfoCallbackInfo>() * size.toLong())
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

public actual interface WGPUCreateComputePipelineAsyncCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo> = cValue<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo> {
		nextInChain = this@WGPUCreateComputePipelineAsyncCallbackInfo.nextInChain?.handler?.reinterpret()
		mode = this@WGPUCreateComputePipelineAsyncCallbackInfo.mode
		callback = this@WGPUCreateComputePipelineAsyncCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPUCreateComputePipelineAsyncCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPUCreateComputePipelineAsyncCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>,
	) : WGPUCreateComputePipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUCreateComputePipelineAsyncCallbackInfo is null") }
			set(newValue) {
				handle.useContents { mode = newValue }
			}

		override var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCreateComputePipelineAsyncCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCreateComputePipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.mode ?: error("pointer of WGPUCreateComputePipelineAsyncCallbackInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.mode = newValue }
			}

		override var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCreateComputePipelineAsyncCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCreateComputePipelineAsyncCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCreateComputePipelineAsyncCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>())
			.let { WGPUCreateComputePipelineAsyncCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCreateComputePipelineAsyncCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCreateComputePipelineAsyncCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo>() * size.toLong())
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

public actual interface WGPUCreateRenderPipelineAsyncCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo> = cValue<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo> {
		nextInChain = this@WGPUCreateRenderPipelineAsyncCallbackInfo.nextInChain?.handler?.reinterpret()
		mode = this@WGPUCreateRenderPipelineAsyncCallbackInfo.mode
		callback = this@WGPUCreateRenderPipelineAsyncCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPUCreateRenderPipelineAsyncCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPUCreateRenderPipelineAsyncCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>,
	) : WGPUCreateRenderPipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUCreateRenderPipelineAsyncCallbackInfo is null") }
			set(newValue) {
				handle.useContents { mode = newValue }
			}

		override var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUCreateRenderPipelineAsyncCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.mode ?: error("pointer of WGPUCreateRenderPipelineAsyncCallbackInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.mode = newValue }
			}

		override var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUCreateRenderPipelineAsyncCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUCreateRenderPipelineAsyncCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>())
			.let { WGPUCreateRenderPipelineAsyncCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCreateRenderPipelineAsyncCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCreateRenderPipelineAsyncCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo>() * size.toLong())
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

public actual interface WGPUPopErrorScopeCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUPopErrorScopeCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUPopErrorScopeCallbackInfo> = cValue<webgpu.native.WGPUPopErrorScopeCallbackInfo> {
		nextInChain = this@WGPUPopErrorScopeCallbackInfo.nextInChain?.handler?.reinterpret()
		mode = this@WGPUPopErrorScopeCallbackInfo.mode
		callback = this@WGPUPopErrorScopeCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPUPopErrorScopeCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPUPopErrorScopeCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUPopErrorScopeCallbackInfo>,
	) : WGPUPopErrorScopeCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUPopErrorScopeCallbackInfo is null") }
			set(newValue) {
				handle.useContents { mode = newValue }
			}

		override var callback: CallbackHolder<WGPUPopErrorScopeCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUPopErrorScopeCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUPopErrorScopeCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.mode ?: error("pointer of WGPUPopErrorScopeCallbackInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.mode = newValue }
			}

		override var callback: CallbackHolder<WGPUPopErrorScopeCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUPopErrorScopeCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUPopErrorScopeCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUPopErrorScopeCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUPopErrorScopeCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPUPopErrorScopeCallbackInfo>())
			.let { WGPUPopErrorScopeCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPopErrorScopeCallbackInfo) -> Unit,
		): ArrayHolder<WGPUPopErrorScopeCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUPopErrorScopeCallbackInfo>() * size.toLong())
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

public actual interface WGPUQueueWorkDoneCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPUQueueWorkDoneCallbackInfo> = cValue<webgpu.native.WGPUQueueWorkDoneCallbackInfo> {
		nextInChain = this@WGPUQueueWorkDoneCallbackInfo.nextInChain?.handler?.reinterpret()
		mode = this@WGPUQueueWorkDoneCallbackInfo.mode
		callback = this@WGPUQueueWorkDoneCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPUQueueWorkDoneCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPUQueueWorkDoneCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPUQueueWorkDoneCallbackInfo>,
	) : WGPUQueueWorkDoneCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPUQueueWorkDoneCallbackInfo is null") }
			set(newValue) {
				handle.useContents { mode = newValue }
			}

		override var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUQueueWorkDoneCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPUQueueWorkDoneCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.mode ?: error("pointer of WGPUQueueWorkDoneCallbackInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.mode = newValue }
			}

		override var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPUQueueWorkDoneCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPUQueueWorkDoneCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPUQueueWorkDoneCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPUQueueWorkDoneCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPUQueueWorkDoneCallbackInfo>())
			.let { WGPUQueueWorkDoneCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQueueWorkDoneCallbackInfo) -> Unit,
		): ArrayHolder<WGPUQueueWorkDoneCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPUQueueWorkDoneCallbackInfo>() * size.toLong())
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

public actual interface WGPURequestAdapterCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPURequestAdapterCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPURequestAdapterCallbackInfo> = cValue<webgpu.native.WGPURequestAdapterCallbackInfo> {
		nextInChain = this@WGPURequestAdapterCallbackInfo.nextInChain?.handler?.reinterpret()
		mode = this@WGPURequestAdapterCallbackInfo.mode
		callback = this@WGPURequestAdapterCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPURequestAdapterCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPURequestAdapterCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURequestAdapterCallbackInfo>,
	) : WGPURequestAdapterCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPURequestAdapterCallbackInfo is null") }
			set(newValue) {
				handle.useContents { mode = newValue }
			}

		override var callback: CallbackHolder<WGPURequestAdapterCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPURequestAdapterCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURequestAdapterCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.mode ?: error("pointer of WGPURequestAdapterCallbackInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.mode = newValue }
			}

		override var callback: CallbackHolder<WGPURequestAdapterCallback>?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPURequestAdapterCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestAdapterCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURequestAdapterCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURequestAdapterCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPURequestAdapterCallbackInfo>())
			.let { WGPURequestAdapterCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestAdapterCallbackInfo) -> Unit,
		): ArrayHolder<WGPURequestAdapterCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPURequestAdapterCallbackInfo>() * size.toLong())
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

public actual interface WGPURequestDeviceCallbackInfo {
	public actual var nextInChain: WGPUChainedStruct?

	public actual var mode: WGPUCallbackMode

	public actual var callback: CallbackHolder<WGPURequestDeviceCallback>?

	public actual var userdata1: NativeAddress?

	public actual var userdata2: NativeAddress?

	public actual val handler: NativeAddress

	public fun toCValue(): CValue<webgpu.native.WGPURequestDeviceCallbackInfo> = cValue<webgpu.native.WGPURequestDeviceCallbackInfo> {
		nextInChain = this@WGPURequestDeviceCallbackInfo.nextInChain?.handler?.reinterpret()
		mode = this@WGPURequestDeviceCallbackInfo.mode
		callback = this@WGPURequestDeviceCallbackInfo.callback?.handler?.reinterpret()
		userdata1 = this@WGPURequestDeviceCallbackInfo.userdata1?.reinterpret()
		userdata2 = this@WGPURequestDeviceCallbackInfo.userdata2?.reinterpret()
	}

	@JvmInline
	public value class ByValue(
		public val handle: CValue<webgpu.native.WGPURequestDeviceCallbackInfo>,
	) : WGPURequestDeviceCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handle.useContents { nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) } }
			set(newValue) {
				handle.useContents { nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handle.useContents { mode ?: error("pointer of WGPURequestDeviceCallbackInfo is null") }
			set(newValue) {
				handle.useContents { mode = newValue }
			}

		override var callback: CallbackHolder<WGPURequestDeviceCallback>?
			get() = handle.useContents { callback?.let(::NativeAddress)?.let { CallbackHolder<WGPURequestDeviceCallback>(it) } }
			set(newValue) {
				handle.useContents { callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handle.useContents { userdata1?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handle.useContents { userdata2?.let(::NativeAddress) }
			set(newValue) {
				handle.useContents { userdata2 = newValue?.reinterpret() }
			}

		override val handler: NativeAddress
			get() {
				error("should not be call on CValue")
			}
	}

	@JvmInline
	public value class ByReference(
		override val handler: NativeAddress,
	) : WGPURequestDeviceCallbackInfo {
		override var nextInChain: WGPUChainedStruct?
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.nextInChain?.let(::NativeAddress)?.let { WGPUChainedStruct(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.nextInChain = newValue?.handler?.reinterpret() }
			}

		override var mode: WGPUCallbackMode
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.mode ?: error("pointer of WGPURequestDeviceCallbackInfo is null")
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.mode = newValue }
			}

		override var callback: CallbackHolder<WGPURequestDeviceCallback>?
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.callback?.let(::NativeAddress)?.let { CallbackHolder<WGPURequestDeviceCallback>(it) }
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.callback = newValue?.handler?.reinterpret() }
			}

		override var userdata1: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.userdata1?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.userdata1 = newValue?.reinterpret() }
			}

		override var userdata2: NativeAddress?
			get() = handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.userdata2?.let(::NativeAddress)
			set(newValue) {
				handler.reinterpret<webgpu.native.WGPURequestDeviceCallbackInfo>().pointed.let { it.userdata2 = newValue?.reinterpret() }
			}
	}

	public actual companion object {
		public actual operator fun invoke(address: NativeAddress): WGPURequestDeviceCallbackInfo = ByReference(address)

		public actual fun allocate(allocator: MemoryAllocator): WGPURequestDeviceCallbackInfo = allocator.allocate(sizeOf<webgpu.native.WGPURequestDeviceCallbackInfo>())
			.let { WGPURequestDeviceCallbackInfo(it) }

		public actual fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestDeviceCallbackInfo) -> Unit,
		): ArrayHolder<WGPURequestDeviceCallbackInfo> = allocator.allocate(sizeOf<webgpu.native.WGPURequestDeviceCallbackInfo>() * size.toLong())
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

public fun webgpu.native.WGPUStringView.adapt(structure: WGPUStringView) {
	data = structure.data?.handler?.reinterpret()
	length = structure.length
}

public fun webgpu.native.WGPUAdapterInfo.adapt(structure: WGPUAdapterInfo) {
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

public fun webgpu.native.WGPUBindGroupDescriptor.adapt(structure: WGPUBindGroupDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
	entryCount = structure.entryCount
	entries = structure.entries?.handler?.reinterpret()
}

public fun webgpu.native.WGPUBindGroupEntry.adapt(structure: WGPUBindGroupEntry) {
	nextInChain = structure.nextInChain?.reinterpret()
	binding = structure.binding
	buffer = structure.buffer?.handler?.reinterpret()
	offset = structure.offset
	size = structure.size
	sampler = structure.sampler?.handler?.reinterpret()
	textureView = structure.textureView?.handler?.reinterpret()
}

public fun webgpu.native.WGPUBindGroupLayoutDescriptor.adapt(structure: WGPUBindGroupLayoutDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	entryCount = structure.entryCount
	entries = structure.entries?.handler?.reinterpret()
}

public fun webgpu.native.WGPUBufferBindingLayout.adapt(structure: WGPUBufferBindingLayout) {
	nextInChain = structure.nextInChain?.reinterpret()
	type = structure.type
	hasDynamicOffset = structure.hasDynamicOffset.toUInt()
	minBindingSize = structure.minBindingSize
}

public fun webgpu.native.WGPUSamplerBindingLayout.adapt(structure: WGPUSamplerBindingLayout) {
	nextInChain = structure.nextInChain?.reinterpret()
	type = structure.type
}

public fun webgpu.native.WGPUTextureBindingLayout.adapt(structure: WGPUTextureBindingLayout) {
	nextInChain = structure.nextInChain?.reinterpret()
	sampleType = structure.sampleType
	viewDimension = structure.viewDimension
	multisampled = structure.multisampled.toUInt()
}

public fun webgpu.native.WGPUStorageTextureBindingLayout.adapt(structure: WGPUStorageTextureBindingLayout) {
	nextInChain = structure.nextInChain?.reinterpret()
	access = structure.access
	format = structure.format
	viewDimension = structure.viewDimension
}

public fun webgpu.native.WGPUBindGroupLayoutEntry.adapt(structure: WGPUBindGroupLayoutEntry) {
	buffer.adapt(structure.buffer)
	sampler.adapt(structure.sampler)
	texture.adapt(structure.texture)
	storageTexture.adapt(structure.storageTexture)
	nextInChain = structure.nextInChain?.reinterpret()
	binding = structure.binding
	visibility = structure.visibility
}

public fun webgpu.native.WGPUBlendComponent.adapt(structure: WGPUBlendComponent) {
	operation = structure.operation
	srcFactor = structure.srcFactor
	dstFactor = structure.dstFactor
}

public fun webgpu.native.WGPUBlendState.adapt(structure: WGPUBlendState) {
	color.adapt(structure.color)
	alpha.adapt(structure.alpha)
}

public fun webgpu.native.WGPUBufferDescriptor.adapt(structure: WGPUBufferDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	usage = structure.usage
	size = structure.size
	mappedAtCreation = structure.mappedAtCreation.toUInt()
}

public fun webgpu.native.WGPUColor.adapt(structure: WGPUColor) {
	r = structure.r
	g = structure.g
	b = structure.b
	a = structure.a
}

public fun webgpu.native.WGPUColorTargetState.adapt(structure: WGPUColorTargetState) {
	nextInChain = structure.nextInChain?.reinterpret()
	format = structure.format
	blend = structure.blend?.handler?.reinterpret()
	writeMask = structure.writeMask
}

public fun webgpu.native.WGPUCommandBufferDescriptor.adapt(structure: WGPUCommandBufferDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

public fun webgpu.native.WGPUCommandEncoderDescriptor.adapt(structure: WGPUCommandEncoderDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

public fun webgpu.native.WGPUCompilationInfo.adapt(structure: WGPUCompilationInfo) {
	nextInChain = structure.nextInChain?.reinterpret()
	messageCount = structure.messageCount
	messages = structure.messages?.handler?.reinterpret()
}

public fun webgpu.native.WGPUCompilationMessage.adapt(structure: WGPUCompilationMessage) {
	message.adapt(structure.message)
	nextInChain = structure.nextInChain?.reinterpret()
	type = structure.type
	lineNum = structure.lineNum
	linePos = structure.linePos
	offset = structure.offset
	length = structure.length
}

public fun webgpu.native.WGPUComputePassDescriptor.adapt(structure: WGPUComputePassDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	timestampWrites = structure.timestampWrites?.handler?.reinterpret()
}

public fun webgpu.native.WGPUComputePassTimestampWrites.adapt(structure: WGPUComputePassTimestampWrites) {
	querySet = structure.querySet?.handler?.reinterpret()
	beginningOfPassWriteIndex = structure.beginningOfPassWriteIndex
	endOfPassWriteIndex = structure.endOfPassWriteIndex
}

public fun webgpu.native.WGPUProgrammableStageDescriptor.adapt(structure: WGPUProgrammableStageDescriptor) {
	entryPoint.adapt(structure.entryPoint)
	nextInChain = structure.nextInChain?.reinterpret()
	module = structure.module?.handler?.reinterpret()
	constantCount = structure.constantCount
	constants = structure.constants?.handler?.reinterpret()
}

public fun webgpu.native.WGPUComputePipelineDescriptor.adapt(structure: WGPUComputePipelineDescriptor) {
	label.adapt(structure.label)
	compute.adapt(structure.compute)
	nextInChain = structure.nextInChain?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
}

public fun webgpu.native.WGPUConstantEntry.adapt(structure: WGPUConstantEntry) {
	key.adapt(structure.key)
	nextInChain = structure.nextInChain?.reinterpret()
	value = structure.value
}

public fun webgpu.native.WGPUStencilFaceState.adapt(structure: WGPUStencilFaceState) {
	compare = structure.compare
	failOp = structure.failOp
	depthFailOp = structure.depthFailOp
	passOp = structure.passOp
}

public fun webgpu.native.WGPUDepthStencilState.adapt(structure: WGPUDepthStencilState) {
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

public fun webgpu.native.WGPUQueueDescriptor.adapt(structure: WGPUQueueDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

public fun webgpu.native.WGPUDeviceLostCallbackInfo.adapt(structure: WGPUDeviceLostCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

public fun webgpu.native.WGPUUncapturedErrorCallbackInfo.adapt(structure: WGPUUncapturedErrorCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

public fun webgpu.native.WGPUDeviceDescriptor.adapt(structure: WGPUDeviceDescriptor) {
	label.adapt(structure.label)
	defaultQueue.adapt(structure.defaultQueue)
	deviceLostCallbackInfo.adapt(structure.deviceLostCallbackInfo)
	uncapturedErrorCallbackInfo.adapt(structure.uncapturedErrorCallbackInfo)
	nextInChain = structure.nextInChain?.reinterpret()
	requiredFeatureCount = structure.requiredFeatureCount
	requiredFeatures = structure.requiredFeatures?.handler?.reinterpret()
	requiredLimits = structure.requiredLimits?.handler?.reinterpret()
}

public fun webgpu.native.WGPUExtent3D.adapt(structure: WGPUExtent3D) {
	width = structure.width
	height = structure.height
	depthOrArrayLayers = structure.depthOrArrayLayers
}

public fun webgpu.native.WGPUFragmentState.adapt(structure: WGPUFragmentState) {
	entryPoint.adapt(structure.entryPoint)
	nextInChain = structure.nextInChain?.reinterpret()
	module = structure.module?.handler?.reinterpret()
	constantCount = structure.constantCount
	constants = structure.constants?.handler?.reinterpret()
	targetCount = structure.targetCount
	targets = structure.targets?.handler?.reinterpret()
}

public fun webgpu.native.WGPUFuture.adapt(structure: WGPUFuture) {
	id = structure.id
}

public fun webgpu.native.WGPUFutureWaitInfo.adapt(structure: WGPUFutureWaitInfo) {
	future.adapt(structure.future)
	completed = structure.completed.toUInt()
}

public fun webgpu.native.WGPUInstanceCapabilities.adapt(structure: WGPUInstanceCapabilities) {
	nextInChain = structure.nextInChain?.reinterpret()
	timedWaitAnyEnable = structure.timedWaitAnyEnable.toUInt()
	timedWaitAnyMaxCount = structure.timedWaitAnyMaxCount
}

public fun webgpu.native.WGPUInstanceDescriptor.adapt(structure: WGPUInstanceDescriptor) {
	features.adapt(structure.features)
	nextInChain = structure.nextInChain?.reinterpret()
}

public fun webgpu.native.WGPULimits.adapt(structure: WGPULimits) {
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

public fun webgpu.native.WGPUMultisampleState.adapt(structure: WGPUMultisampleState) {
	nextInChain = structure.nextInChain?.reinterpret()
	count = structure.count
	mask = structure.mask
	alphaToCoverageEnabled = structure.alphaToCoverageEnabled.toUInt()
}

public fun webgpu.native.WGPUOrigin3D.adapt(structure: WGPUOrigin3D) {
	x = structure.x
	y = structure.y
	z = structure.z
}

public fun webgpu.native.WGPUPipelineLayoutDescriptor.adapt(structure: WGPUPipelineLayoutDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	bindGroupLayoutCount = structure.bindGroupLayoutCount
	bindGroupLayouts = structure.bindGroupLayouts?.handler?.reinterpret()
}

public fun webgpu.native.WGPUPrimitiveState.adapt(structure: WGPUPrimitiveState) {
	nextInChain = structure.nextInChain?.reinterpret()
	topology = structure.topology
	stripIndexFormat = structure.stripIndexFormat
	frontFace = structure.frontFace
	cullMode = structure.cullMode
	unclippedDepth = structure.unclippedDepth.toUInt()
}

public fun webgpu.native.WGPUQuerySetDescriptor.adapt(structure: WGPUQuerySetDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	type = structure.type
	count = structure.count
}

public fun webgpu.native.WGPURenderBundleDescriptor.adapt(structure: WGPURenderBundleDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

public fun webgpu.native.WGPURenderBundleEncoderDescriptor.adapt(structure: WGPURenderBundleEncoderDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	colorFormatCount = structure.colorFormatCount
	colorFormats = structure.colorFormats?.handler?.reinterpret()
	depthStencilFormat = structure.depthStencilFormat
	sampleCount = structure.sampleCount
	depthReadOnly = structure.depthReadOnly.toUInt()
	stencilReadOnly = structure.stencilReadOnly.toUInt()
}

public fun webgpu.native.WGPURenderPassColorAttachment.adapt(structure: WGPURenderPassColorAttachment) {
	clearValue.adapt(structure.clearValue)
	nextInChain = structure.nextInChain?.reinterpret()
	view = structure.view?.handler?.reinterpret()
	depthSlice = structure.depthSlice
	resolveTarget = structure.resolveTarget?.handler?.reinterpret()
	loadOp = structure.loadOp
	storeOp = structure.storeOp
}

public fun webgpu.native.WGPURenderPassDepthStencilAttachment.adapt(structure: WGPURenderPassDepthStencilAttachment) {
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

public fun webgpu.native.WGPURenderPassDescriptor.adapt(structure: WGPURenderPassDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
	colorAttachmentCount = structure.colorAttachmentCount
	colorAttachments = structure.colorAttachments?.handler?.reinterpret()
	depthStencilAttachment = structure.depthStencilAttachment?.handler?.reinterpret()
	occlusionQuerySet = structure.occlusionQuerySet?.handler?.reinterpret()
	timestampWrites = structure.timestampWrites?.handler?.reinterpret()
}

public fun webgpu.native.WGPUChainedStruct.adapt(structure: WGPUChainedStruct) {
	next = structure.next?.handler?.reinterpret()
	sType = structure.sType
}

public fun webgpu.native.WGPURenderPassMaxDrawCount.adapt(structure: WGPURenderPassMaxDrawCount) {
	chain.adapt(structure.chain)
	maxDrawCount = structure.maxDrawCount
}

public fun webgpu.native.WGPURenderPassTimestampWrites.adapt(structure: WGPURenderPassTimestampWrites) {
	querySet = structure.querySet?.handler?.reinterpret()
	beginningOfPassWriteIndex = structure.beginningOfPassWriteIndex
	endOfPassWriteIndex = structure.endOfPassWriteIndex
}

public fun webgpu.native.WGPUVertexState.adapt(structure: WGPUVertexState) {
	entryPoint.adapt(structure.entryPoint)
	nextInChain = structure.nextInChain?.reinterpret()
	module = structure.module?.handler?.reinterpret()
	constantCount = structure.constantCount
	constants = structure.constants?.handler?.reinterpret()
	bufferCount = structure.bufferCount
	buffers = structure.buffers?.handler?.reinterpret()
}

public fun webgpu.native.WGPURenderPipelineDescriptor.adapt(structure: WGPURenderPipelineDescriptor) {
	label.adapt(structure.label)
	vertex.adapt(structure.vertex)
	primitive.adapt(structure.primitive)
	multisample.adapt(structure.multisample)
	nextInChain = structure.nextInChain?.reinterpret()
	layout = structure.layout?.handler?.reinterpret()
	depthStencil = structure.depthStencil?.handler?.reinterpret()
	fragment = structure.fragment?.handler?.reinterpret()
}

public fun webgpu.native.WGPURequestAdapterOptions.adapt(structure: WGPURequestAdapterOptions) {
	nextInChain = structure.nextInChain?.reinterpret()
	featureLevel = structure.featureLevel
	powerPreference = structure.powerPreference
	forceFallbackAdapter = structure.forceFallbackAdapter.toUInt()
	backendType = structure.backendType
	compatibleSurface = structure.compatibleSurface?.handler?.reinterpret()
}

public fun webgpu.native.WGPUSamplerDescriptor.adapt(structure: WGPUSamplerDescriptor) {
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

public fun webgpu.native.WGPUShaderModuleDescriptor.adapt(structure: WGPUShaderModuleDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

public fun webgpu.native.WGPUShaderSourceSPIRV.adapt(structure: WGPUShaderSourceSPIRV) {
	chain.adapt(structure.chain)
	codeSize = structure.codeSize
	code = structure.code?.reinterpret()
}

public fun webgpu.native.WGPUShaderSourceWGSL.adapt(structure: WGPUShaderSourceWGSL) {
	chain.adapt(structure.chain)
	code.adapt(structure.code)
}

public fun webgpu.native.WGPUSupportedFeatures.adapt(structure: WGPUSupportedFeatures) {
	featureCount = structure.featureCount
	features = structure.features?.handler?.reinterpret()
}

public fun webgpu.native.WGPUSupportedWGSLLanguageFeatures.adapt(structure: WGPUSupportedWGSLLanguageFeatures) {
	featureCount = structure.featureCount
	features = structure.features?.handler?.reinterpret()
}

public fun webgpu.native.WGPUSurfaceCapabilities.adapt(structure: WGPUSurfaceCapabilities) {
	nextInChain = structure.nextInChain?.reinterpret()
	usages = structure.usages
	formatCount = structure.formatCount
	formats = structure.formats?.handler?.reinterpret()
	presentModeCount = structure.presentModeCount
	presentModes = structure.presentModes?.handler?.reinterpret()
	alphaModeCount = structure.alphaModeCount
	alphaModes = structure.alphaModes?.handler?.reinterpret()
}

public fun webgpu.native.WGPUSurfaceConfiguration.adapt(structure: WGPUSurfaceConfiguration) {
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

public fun webgpu.native.WGPUSurfaceDescriptor.adapt(structure: WGPUSurfaceDescriptor) {
	label.adapt(structure.label)
	nextInChain = structure.nextInChain?.reinterpret()
}

public fun webgpu.native.WGPUSurfaceSourceAndroidNativeWindow.adapt(structure: WGPUSurfaceSourceAndroidNativeWindow) {
	chain.adapt(structure.chain)
	window = structure.window?.reinterpret()
}

public fun webgpu.native.WGPUSurfaceSourceMetalLayer.adapt(structure: WGPUSurfaceSourceMetalLayer) {
	chain.adapt(structure.chain)
	layer = structure.layer?.reinterpret()
}

public fun webgpu.native.WGPUSurfaceSourceWaylandSurface.adapt(structure: WGPUSurfaceSourceWaylandSurface) {
	chain.adapt(structure.chain)
	display = structure.display?.reinterpret()
	surface = structure.surface?.reinterpret()
}

public fun webgpu.native.WGPUSurfaceSourceWindowsHWND.adapt(structure: WGPUSurfaceSourceWindowsHWND) {
	chain.adapt(structure.chain)
	hinstance = structure.hinstance?.reinterpret()
	hwnd = structure.hwnd?.reinterpret()
}

public fun webgpu.native.WGPUSurfaceSourceXCBWindow.adapt(structure: WGPUSurfaceSourceXCBWindow) {
	chain.adapt(structure.chain)
	connection = structure.connection?.reinterpret()
	window = structure.window
}

public fun webgpu.native.WGPUSurfaceSourceXlibWindow.adapt(structure: WGPUSurfaceSourceXlibWindow) {
	chain.adapt(structure.chain)
	display = structure.display?.reinterpret()
	window = structure.window
}

public fun webgpu.native.WGPUSurfaceTexture.adapt(structure: WGPUSurfaceTexture) {
	nextInChain = structure.nextInChain?.reinterpret()
	texture = structure.texture?.handler?.reinterpret()
	status = structure.status
}

public fun webgpu.native.WGPUTexelCopyBufferLayout.adapt(structure: WGPUTexelCopyBufferLayout) {
	offset = structure.offset
	bytesPerRow = structure.bytesPerRow
	rowsPerImage = structure.rowsPerImage
}

public fun webgpu.native.WGPUTexelCopyBufferInfo.adapt(structure: WGPUTexelCopyBufferInfo) {
	layout.adapt(structure.layout)
	buffer = structure.buffer?.handler?.reinterpret()
}

public fun webgpu.native.WGPUTexelCopyTextureInfo.adapt(structure: WGPUTexelCopyTextureInfo) {
	origin.adapt(structure.origin)
	texture = structure.texture?.handler?.reinterpret()
	mipLevel = structure.mipLevel
	aspect = structure.aspect
}

public fun webgpu.native.WGPUTextureDescriptor.adapt(structure: WGPUTextureDescriptor) {
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

public fun webgpu.native.WGPUTextureViewDescriptor.adapt(structure: WGPUTextureViewDescriptor) {
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

public fun webgpu.native.WGPUVertexAttribute.adapt(structure: WGPUVertexAttribute) {
	format = structure.format
	offset = structure.offset
	shaderLocation = structure.shaderLocation
}

public fun webgpu.native.WGPUVertexBufferLayout.adapt(structure: WGPUVertexBufferLayout) {
	stepMode = structure.stepMode
	arrayStride = structure.arrayStride
	attributeCount = structure.attributeCount
	attributes = structure.attributes?.handler?.reinterpret()
}

public fun webgpu.native.WGPUInstanceExtras.adapt(structure: WGPUInstanceExtras) {
	chain.adapt(structure.chain)
	dxcPath.adapt(structure.dxcPath)
	backends = structure.backends
	flags = structure.flags
	dx12ShaderCompiler = structure.dx12ShaderCompiler
	gles3MinorVersion = structure.gles3MinorVersion
	glFenceBehaviour = structure.glFenceBehaviour
	dxcMaxShaderModel = structure.dxcMaxShaderModel
	budgetForDeviceCreation = structure.budgetForDeviceCreation?.reinterpret()
	budgetForDeviceLoss = structure.budgetForDeviceLoss?.reinterpret()
}

public fun webgpu.native.WGPUChainedStructOut.adapt(structure: WGPUChainedStructOut) {
	next = structure.next?.handler?.reinterpret()
	sType = structure.sType
}

public fun webgpu.native.WGPUBufferMapCallbackInfo.adapt(structure: WGPUBufferMapCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

public fun webgpu.native.WGPUCompilationInfoCallbackInfo.adapt(structure: WGPUCompilationInfoCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

public fun webgpu.native.WGPUCreateComputePipelineAsyncCallbackInfo.adapt(structure: WGPUCreateComputePipelineAsyncCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

public fun webgpu.native.WGPUCreateRenderPipelineAsyncCallbackInfo.adapt(structure: WGPUCreateRenderPipelineAsyncCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

public fun webgpu.native.WGPUPopErrorScopeCallbackInfo.adapt(structure: WGPUPopErrorScopeCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

public fun webgpu.native.WGPUQueueWorkDoneCallbackInfo.adapt(structure: WGPUQueueWorkDoneCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

public fun webgpu.native.WGPURequestAdapterCallbackInfo.adapt(structure: WGPURequestAdapterCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}

public fun webgpu.native.WGPURequestDeviceCallbackInfo.adapt(structure: WGPURequestDeviceCallbackInfo) {
	nextInChain = structure.nextInChain?.handler?.reinterpret()
	mode = structure.mode
	callback = structure.callback?.handler?.reinterpret()
	userdata1 = structure.userdata1?.reinterpret()
	userdata2 = structure.userdata2?.reinterpret()
}
