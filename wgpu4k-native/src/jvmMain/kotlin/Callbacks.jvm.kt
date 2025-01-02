// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.Callback
import ffi.CString
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress

actual interface WGPUDeviceLostCallback : Callback {
	actual fun invoke(reason: WGPUDeviceLostReason, message: WGPUStringView?, userdata: NativeAddress?)
	interface Function {
		fun apply(reason: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceLostCallback): CallbackHolder<WGPUDeviceLostCallback> {
			val function = object : Function {
				override fun apply(reason: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(reason.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
		private val descriptor: java.lang.foreign.FunctionDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(
			ffi.C_INT,
			WGPUStringView.LAYOUT,
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

actual interface WGPUErrorCallback : Callback {
	actual fun invoke(type: WGPUErrorType, message: WGPUStringView?, userdata: NativeAddress?)
	interface Function {
		fun apply(type: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUErrorCallback): CallbackHolder<WGPUErrorCallback> {
			val function = object : Function {
				override fun apply(type: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(type.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
		private val descriptor: java.lang.foreign.FunctionDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(
			ffi.C_INT,
			WGPUStringView.LAYOUT,
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

actual interface WGPULogCallback : Callback {
	actual fun invoke(level: WGPULogLevel, message: WGPUStringView?, userdata: NativeAddress?)
	interface Function {
		fun apply(level: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPULogCallback): CallbackHolder<WGPULogCallback> {
			val function = object : Function {
				override fun apply(level: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(level.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
		private val descriptor: java.lang.foreign.FunctionDescriptor = java.lang.foreign.FunctionDescriptor.ofVoid(
			ffi.C_INT,
			WGPUStringView.LAYOUT,
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

