// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.Callback
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.MemorySegment
import java.lang.invoke.MethodHandle
import kotlin.Int

public actual fun interface WGPUBufferMapCallback : Callback {
	public actual fun invoke(
		status: WGPUMapAsyncStatus,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			status: Int,
			message: MemorySegment,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_INT,
					WGPUStringView.LAYOUT,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUBufferMapCallback): CallbackHolder<WGPUBufferMapCallback> {
			val function = object : Function {
				override fun apply(status: Int, message: java.lang.foreign.MemorySegment, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPUCompilationInfoCallback : Callback {
	public actual fun invoke(
		status: WGPUCompilationInfoRequestStatus,
		compilationInfo: WGPUCompilationInfo?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			status: Int,
			compilationInfo: MemorySegment,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_INT,
					ffi.C_POINTER,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUCompilationInfoCallback): CallbackHolder<WGPUCompilationInfoCallback> {
			val function = object : Function {
				override fun apply(status: Int, compilationInfo: java.lang.foreign.MemorySegment, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), compilationInfo.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUCompilationInfo(it) }, userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPUCreateComputePipelineAsyncCallback : Callback {
	public actual fun invoke(
		status: WGPUCreatePipelineAsyncStatus,
		pipeline: WGPUComputePipeline?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			status: Int,
			pipeline: MemorySegment,
			message: MemorySegment,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_INT,
					ffi.C_POINTER,
					WGPUStringView.LAYOUT,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateComputePipelineAsyncCallback): CallbackHolder<WGPUCreateComputePipelineAsyncCallback> {
			val function = object : Function {
				override fun apply(status: Int, pipeline: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), pipeline.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUComputePipeline(it) }, message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPUCreateRenderPipelineAsyncCallback : Callback {
	public actual fun invoke(
		status: WGPUCreatePipelineAsyncStatus,
		pipeline: WGPURenderPipeline?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			status: Int,
			pipeline: MemorySegment,
			message: MemorySegment,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_INT,
					ffi.C_POINTER,
					WGPUStringView.LAYOUT,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUCreateRenderPipelineAsyncCallback): CallbackHolder<WGPUCreateRenderPipelineAsyncCallback> {
			val function = object : Function {
				override fun apply(status: Int, pipeline: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), pipeline.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPURenderPipeline(it) }, message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPUDeviceLostCallback : Callback {
	public actual fun invoke(
		device: WGPUDevice?,
		reason: WGPUDeviceLostReason,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			device: MemorySegment,
			reason: Int,
			message: MemorySegment,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_POINTER,
					ffi.C_INT,
					WGPUStringView.LAYOUT,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUDeviceLostCallback): CallbackHolder<WGPUDeviceLostCallback> {
			val function = object : Function {
				override fun apply(device: java.lang.foreign.MemorySegment, reason: Int, message: java.lang.foreign.MemorySegment, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(device.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUDevice(it) }, reason.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPUPopErrorScopeCallback : Callback {
	public actual fun invoke(
		status: WGPUPopErrorScopeStatus,
		type: WGPUErrorType,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			status: Int,
			type: Int,
			message: MemorySegment,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_INT,
					ffi.C_INT,
					WGPUStringView.LAYOUT,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUPopErrorScopeCallback): CallbackHolder<WGPUPopErrorScopeCallback> {
			val function = object : Function {
				override fun apply(status: Int, type: Int, message: java.lang.foreign.MemorySegment, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), type.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPUQueueWorkDoneCallback : Callback {
	public actual fun invoke(
		status: WGPUQueueWorkDoneStatus,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			status: Int,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_INT,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUQueueWorkDoneCallback): CallbackHolder<WGPUQueueWorkDoneCallback> {
			val function = object : Function {
				override fun apply(status: Int, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPURequestAdapterCallback : Callback {
	public actual fun invoke(
		status: WGPURequestAdapterStatus,
		adapter: WGPUAdapter?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			status: Int,
			adapter: MemorySegment,
			message: MemorySegment,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_INT,
					ffi.C_POINTER,
					WGPUStringView.LAYOUT,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestAdapterCallback): CallbackHolder<WGPURequestAdapterCallback> {
			val function = object : Function {
				override fun apply(status: Int, adapter: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), adapter.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUAdapter(it) }, message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPURequestDeviceCallback : Callback {
	public actual fun invoke(
		status: WGPURequestDeviceStatus,
		device: WGPUDevice?,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			status: Int,
			device: MemorySegment,
			message: MemorySegment,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_INT,
					ffi.C_POINTER,
					WGPUStringView.LAYOUT,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPURequestDeviceCallback): CallbackHolder<WGPURequestDeviceCallback> {
			val function = object : Function {
				override fun apply(status: Int, device: java.lang.foreign.MemorySegment, message: java.lang.foreign.MemorySegment, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(status.toUInt(), device.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUDevice(it) }, message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPUUncapturedErrorCallback : Callback {
	public actual fun invoke(
		device: WGPUDevice?,
		type: WGPUErrorType,
		message: WGPUStringView?,
		userdata1: NativeAddress?,
		userdata2: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			device: MemorySegment,
			type: Int,
			message: MemorySegment,
			userdata1: MemorySegment,
			userdata2: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_POINTER,
					ffi.C_INT,
					WGPUStringView.LAYOUT,
					ffi.C_POINTER,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPUUncapturedErrorCallback): CallbackHolder<WGPUUncapturedErrorCallback> {
			val function = object : Function {
				override fun apply(device: java.lang.foreign.MemorySegment, type: Int, message: java.lang.foreign.MemorySegment, userdata1: java.lang.foreign.MemorySegment, userdata2: java.lang.foreign.MemorySegment) {
					callback.invoke(device.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUDevice(it) }, type.toUInt(), message.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { WGPUStringView(it) }, userdata1.let(::NativeAddress), userdata2.let(::NativeAddress))
				}
			}
			return java.lang.foreign.Linker.nativeLinker().upcallStub(
				handler.bindTo(function),
				descriptor,
				allocator.arena
			).let(::NativeAddress)
				.let(::CallbackHolder)
		}
	}
}

public actual fun interface WGPULogCallback : Callback {
	public actual fun invoke(
		level: WGPULogLevel,
		message: WGPUStringView?,
		userdata: NativeAddress?,
	) {
	}

	public interface Function {
		public fun apply(
			level: Int,
			message: MemorySegment,
			userdata: MemorySegment,
		) {
		}
	}

	public actual companion object {
		private val descriptor: FunctionDescriptor = FunctionDescriptor.ofVoid(
					ffi.C_INT,
					WGPUStringView.LAYOUT,
					ffi.C_POINTER,
				)

		private val handler: MethodHandle = ffi.upcallHandle(
					Function::class.java,
					"apply",
					descriptor
				)

		public actual fun allocate(allocator: MemoryAllocator, callback: WGPULogCallback): CallbackHolder<WGPULogCallback> {
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
	}
}
