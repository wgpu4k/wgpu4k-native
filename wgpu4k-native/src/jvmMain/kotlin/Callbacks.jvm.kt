// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.Callback
import ffi.CString
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress

actual interface WGPUDeviceLostCallback : Callback {
	actual fun invoke(reason: WGPUDeviceLostReason, message: CString?, userdata: NativeAddress?)
	interface Function {
		fun apply(reason: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceLostCallback): CallbackHolder<WGPUDeviceLostCallback> {
			val function = object : Function {
				override fun apply(reason: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(reason.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { CString(it) }, userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
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
	actual fun invoke(type: WGPUErrorType, message: CString?, userdata: NativeAddress?)
	interface Function {
		fun apply(type: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUErrorCallback): CallbackHolder<WGPUErrorCallback> {
			val function = object : Function {
				override fun apply(type: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(type.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { CString(it) }, userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
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
	actual fun invoke(level: WGPULogLevel, message: CString?, userdata: NativeAddress?)
	interface Function {
		fun apply(level: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPULogCallback): CallbackHolder<WGPULogCallback> {
			val function = object : Function {
				override fun apply(level: Int, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(level.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { CString(it) }, userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

actual interface WGPURequestDeviceCallback : Callback {
	actual fun invoke(status: WGPURequestDeviceStatus, device: WGPUDevice?, message: CString?, userdata: NativeAddress?)
	interface Function {
		fun apply(status: Int, device: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestDeviceCallback): CallbackHolder<WGPURequestDeviceCallback> {
			val function = object : Function {
				override fun apply(status: Int, device: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), device.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUDevice(it) }, message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { CString(it) }, userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
			ffi.C_POINTER,
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

actual interface WGPUMapAsyncCallback : Callback {
	actual fun invoke(status: WGPUBufferMapAsyncStatus, userdata: NativeAddress?)
	interface Function {
		fun apply(status: Int, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUMapAsyncCallback): CallbackHolder<WGPUMapAsyncCallback> {
			val function = object : Function {
				override fun apply(status: Int, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

actual interface WGPUCreateComputePipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPUComputePipeline?, message: CString?, userdata: NativeAddress?)
	interface Function {
		fun apply(status: Int, pipeline: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateComputePipelineAsyncCallback): CallbackHolder<WGPUCreateComputePipelineAsyncCallback> {
			val function = object : Function {
				override fun apply(status: Int, pipeline: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), pipeline.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUComputePipeline(it) }, message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { CString(it) }, userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
			ffi.C_POINTER,
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

actual interface WGPUCreateRenderPipelineAsyncCallback : Callback {
	actual fun invoke(status: WGPUCreatePipelineAsyncStatus, pipeline: WGPURenderPipeline?, message: CString?, userdata: NativeAddress?)
	interface Function {
		fun apply(status: Int, pipeline: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUCreateRenderPipelineAsyncCallback> {
			val function = object : Function {
				override fun apply(status: Int, pipeline: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), pipeline.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPURenderPipeline(it) }, message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { CString(it) }, userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
			ffi.C_POINTER,
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

actual interface WGPURequestAdapterCallback : Callback {
	actual fun invoke(status: WGPURequestAdapterStatus, adapter: WGPUAdapter?, message: CString?, userdata: NativeAddress?)
	interface Function {
		fun apply(status: Int, adapter: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestAdapterCallback): CallbackHolder<WGPURequestAdapterCallback> {
			val function = object : Function {
				override fun apply(status: Int, adapter: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), adapter.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUAdapter(it) }, message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { CString(it) }, userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
			ffi.C_POINTER,
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

actual interface WGPUOnSubmittedWorkDoneCallback : Callback {
	actual fun invoke(status: WGPUQueueWorkDoneStatus, userdata: NativeAddress?)
	interface Function {
		fun apply(status: Int, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUOnSubmittedWorkDoneCallback): CallbackHolder<WGPUOnSubmittedWorkDoneCallback> {
			val function = object : Function {
				override fun apply(status: Int, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

actual interface WGPUGetCompilationInfoCallback : Callback {
	actual fun invoke(status: WGPUCompilationInfoRequestStatus, compilationInfo: WGPUCompilationInfo?, userdata: NativeAddress?)
	interface Function {
		fun apply(status: Int, compilationInfo: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment)
	}
	actual companion object {
		actual fun allocate(allocator: MemoryAllocator, callback: WGPUGetCompilationInfoCallback): CallbackHolder<WGPUGetCompilationInfoCallback> {
			val function = object : Function {
				override fun apply(status: Int, compilationInfo: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), compilationInfo.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUCompilationInfo(it) }, userdata.let(::NativeAddress))
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
			ffi.C_POINTER,
			ffi.C_POINTER,
		)
		private val handler: java.lang.invoke.MethodHandle = ffi.upcallHandle(
			Function::class.java,
			"apply",
			descriptor
		)
	}
}

