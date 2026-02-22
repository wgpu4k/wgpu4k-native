// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.ArrayHolder
import ffi.CString
import ffi.CallbackHolder
import ffi.MemoryAllocator
import ffi.NativeAddress
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit

public expect interface WGPUStringView {
	public var `data`: CString?

	public var length: ULong

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUStringView

		public fun allocate(allocator: MemoryAllocator): WGPUStringView

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStringView) -> Unit,
		): ArrayHolder<WGPUStringView>
	}
}

public expect interface WGPUAdapterInfo {
	public var nextInChain: NativeAddress?

	public val vendor: WGPUStringView

	public val architecture: WGPUStringView

	public val device: WGPUStringView

	public val description: WGPUStringView

	public var backendType: WGPUBackendType

	public var adapterType: WGPUAdapterType

	public var vendorID: UInt

	public var deviceID: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUAdapterInfo

		public fun allocate(allocator: MemoryAllocator): WGPUAdapterInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUAdapterInfo) -> Unit,
		): ArrayHolder<WGPUAdapterInfo>
	}
}

public expect interface WGPUBindGroupDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var layout: WGPUBindGroupLayout?

	public var entryCount: ULong

	public var entries: ArrayHolder<WGPUBindGroupEntry>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUBindGroupDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUBindGroupDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupDescriptor) -> Unit,
		): ArrayHolder<WGPUBindGroupDescriptor>
	}
}

public expect interface WGPUBindGroupEntry {
	public var nextInChain: NativeAddress?

	public var binding: UInt

	public var buffer: WGPUBuffer?

	public var offset: ULong

	public var size: ULong

	public var sampler: WGPUSampler?

	public var textureView: WGPUTextureView?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUBindGroupEntry

		public fun allocate(allocator: MemoryAllocator): WGPUBindGroupEntry

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupEntry) -> Unit,
		): ArrayHolder<WGPUBindGroupEntry>
	}
}

public expect interface WGPUBindGroupLayoutDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var entryCount: ULong

	public var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupLayoutDescriptor) -> Unit,
		): ArrayHolder<WGPUBindGroupLayoutDescriptor>
	}
}

public expect interface WGPUBufferBindingLayout {
	public var nextInChain: NativeAddress?

	public var type: WGPUBufferBindingType

	public var hasDynamicOffset: Boolean

	public var minBindingSize: ULong

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUBufferBindingLayout

		public fun allocate(allocator: MemoryAllocator): WGPUBufferBindingLayout

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferBindingLayout) -> Unit,
		): ArrayHolder<WGPUBufferBindingLayout>
	}
}

public expect interface WGPUSamplerBindingLayout {
	public var nextInChain: NativeAddress?

	public var type: WGPUSamplerBindingType

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSamplerBindingLayout

		public fun allocate(allocator: MemoryAllocator): WGPUSamplerBindingLayout

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSamplerBindingLayout) -> Unit,
		): ArrayHolder<WGPUSamplerBindingLayout>
	}
}

public expect interface WGPUTextureBindingLayout {
	public var nextInChain: NativeAddress?

	public var sampleType: WGPUTextureSampleType

	public var viewDimension: WGPUTextureViewDimension

	public var multisampled: Boolean

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUTextureBindingLayout

		public fun allocate(allocator: MemoryAllocator): WGPUTextureBindingLayout

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureBindingLayout) -> Unit,
		): ArrayHolder<WGPUTextureBindingLayout>
	}
}

public expect interface WGPUStorageTextureBindingLayout {
	public var nextInChain: NativeAddress?

	public var access: WGPUStorageTextureAccess

	public var format: WGPUTextureFormat

	public var viewDimension: WGPUTextureViewDimension

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUStorageTextureBindingLayout

		public fun allocate(allocator: MemoryAllocator): WGPUStorageTextureBindingLayout

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStorageTextureBindingLayout) -> Unit,
		): ArrayHolder<WGPUStorageTextureBindingLayout>
	}
}

public expect interface WGPUBindGroupLayoutEntry {
	public var nextInChain: NativeAddress?

	public var binding: UInt

	public var visibility: ULong

	public val buffer: WGPUBufferBindingLayout

	public val sampler: WGPUSamplerBindingLayout

	public val texture: WGPUTextureBindingLayout

	public val storageTexture: WGPUStorageTextureBindingLayout

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutEntry

		public fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutEntry

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBindGroupLayoutEntry) -> Unit,
		): ArrayHolder<WGPUBindGroupLayoutEntry>
	}
}

public expect interface WGPUBlendComponent {
	public var operation: WGPUBlendOperation

	public var srcFactor: WGPUBlendFactor

	public var dstFactor: WGPUBlendFactor

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUBlendComponent

		public fun allocate(allocator: MemoryAllocator): WGPUBlendComponent

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBlendComponent) -> Unit,
		): ArrayHolder<WGPUBlendComponent>
	}
}

public expect interface WGPUBlendState {
	public val color: WGPUBlendComponent

	public val alpha: WGPUBlendComponent

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUBlendState

		public fun allocate(allocator: MemoryAllocator): WGPUBlendState

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBlendState) -> Unit,
		): ArrayHolder<WGPUBlendState>
	}
}

public expect interface WGPUBufferDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var usage: ULong

	public var size: ULong

	public var mappedAtCreation: Boolean

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUBufferDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUBufferDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferDescriptor) -> Unit,
		): ArrayHolder<WGPUBufferDescriptor>
	}
}

public expect interface WGPUColor {
	public var r: Double

	public var g: Double

	public var b: Double

	public var a: Double

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUColor

		public fun allocate(allocator: MemoryAllocator): WGPUColor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUColor) -> Unit,
		): ArrayHolder<WGPUColor>
	}
}

public expect interface WGPUColorTargetState {
	public var nextInChain: NativeAddress?

	/**
	 * The texture format of the target. If @ref WGPUTextureFormat_Undefined,
	 * indicates a "hole" in the parent @ref WGPUFragmentState [targets] array:
	 * the pipeline does not output a value at this [location].
	 */
	public var format: WGPUTextureFormat

	public var blend: WGPUBlendState?

	public var writeMask: ULong

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUColorTargetState

		public fun allocate(allocator: MemoryAllocator): WGPUColorTargetState

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUColorTargetState) -> Unit,
		): ArrayHolder<WGPUColorTargetState>
	}
}

public expect interface WGPUCommandBufferDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUCommandBufferDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUCommandBufferDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCommandBufferDescriptor) -> Unit,
		): ArrayHolder<WGPUCommandBufferDescriptor>
	}
}

public expect interface WGPUCommandEncoderDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUCommandEncoderDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUCommandEncoderDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCommandEncoderDescriptor) -> Unit,
		): ArrayHolder<WGPUCommandEncoderDescriptor>
	}
}

public expect interface WGPUCompilationInfo {
	public var nextInChain: NativeAddress?

	public var messageCount: ULong

	public var messages: ArrayHolder<WGPUCompilationMessage>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUCompilationInfo

		public fun allocate(allocator: MemoryAllocator): WGPUCompilationInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationInfo) -> Unit,
		): ArrayHolder<WGPUCompilationInfo>
	}
}

public expect interface WGPUCompilationMessage {
	public var nextInChain: NativeAddress?

	/**
	 * A @ref LocalizableHumanReadableMessageString.
	 */
	public val message: WGPUStringView

	/**
	 * Severity level of the message.
	 */
	public var type: WGPUCompilationMessageType

	/**
	 * Line number where the message is attached, starting at 1.
	 */
	public var lineNum: ULong

	/**
	 * Offset in UTF-8 code units (bytes) from the beginning of the line, starting at 1.
	 */
	public var linePos: ULong

	/**
	 * Offset in UTF-8 code units (bytes) from the beginning of the shader code, starting at 0.
	 */
	public var offset: ULong

	/**
	 * Length in UTF-8 code units (bytes) of the span the message corresponds to.
	 */
	public var length: ULong

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUCompilationMessage

		public fun allocate(allocator: MemoryAllocator): WGPUCompilationMessage

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationMessage) -> Unit,
		): ArrayHolder<WGPUCompilationMessage>
	}
}

public expect interface WGPUComputePassDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var timestampWrites: WGPUComputePassTimestampWrites?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUComputePassDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUComputePassDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePassDescriptor) -> Unit,
		): ArrayHolder<WGPUComputePassDescriptor>
	}
}

public expect interface WGPUComputePassTimestampWrites {
	public var querySet: WGPUQuerySet?

	public var beginningOfPassWriteIndex: UInt

	public var endOfPassWriteIndex: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUComputePassTimestampWrites

		public fun allocate(allocator: MemoryAllocator): WGPUComputePassTimestampWrites

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePassTimestampWrites) -> Unit,
		): ArrayHolder<WGPUComputePassTimestampWrites>
	}
}

public expect interface WGPUProgrammableStageDescriptor {
	public var nextInChain: NativeAddress?

	public var module: WGPUShaderModule?

	public val entryPoint: WGPUStringView

	public var constantCount: ULong

	public var constants: ArrayHolder<WGPUConstantEntry>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUProgrammableStageDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUProgrammableStageDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUProgrammableStageDescriptor) -> Unit,
		): ArrayHolder<WGPUProgrammableStageDescriptor>
	}
}

public expect interface WGPUComputePipelineDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var layout: WGPUPipelineLayout?

	public val compute: WGPUProgrammableStageDescriptor

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUComputePipelineDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUComputePipelineDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUComputePipelineDescriptor) -> Unit,
		): ArrayHolder<WGPUComputePipelineDescriptor>
	}
}

public expect interface WGPUConstantEntry {
	public var nextInChain: NativeAddress?

	public val key: WGPUStringView

	public var `value`: Double

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUConstantEntry

		public fun allocate(allocator: MemoryAllocator): WGPUConstantEntry

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUConstantEntry) -> Unit,
		): ArrayHolder<WGPUConstantEntry>
	}
}

public expect interface WGPUStencilFaceState {
	public var compare: WGPUCompareFunction

	public var failOp: WGPUStencilOperation

	public var depthFailOp: WGPUStencilOperation

	public var passOp: WGPUStencilOperation

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUStencilFaceState

		public fun allocate(allocator: MemoryAllocator): WGPUStencilFaceState

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUStencilFaceState) -> Unit,
		): ArrayHolder<WGPUStencilFaceState>
	}
}

public expect interface WGPUDepthStencilState {
	public var nextInChain: NativeAddress?

	public var format: WGPUTextureFormat

	public var depthWriteEnabled: WGPUOptionalBool

	public var depthCompare: WGPUCompareFunction

	public val stencilFront: WGPUStencilFaceState

	public val stencilBack: WGPUStencilFaceState

	public var stencilReadMask: UInt

	public var stencilWriteMask: UInt

	public var depthBias: Int

	public var depthBiasSlopeScale: Float

	public var depthBiasClamp: Float

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUDepthStencilState

		public fun allocate(allocator: MemoryAllocator): WGPUDepthStencilState

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDepthStencilState) -> Unit,
		): ArrayHolder<WGPUDepthStencilState>
	}
}

public expect interface WGPUQueueDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUQueueDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUQueueDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQueueDescriptor) -> Unit,
		): ArrayHolder<WGPUQueueDescriptor>
	}
}

public expect interface WGPUDeviceLostCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var mode: WGPUCallbackMode

	public var callback: CallbackHolder<WGPUDeviceLostCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUDeviceLostCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPUDeviceLostCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDeviceLostCallbackInfo) -> Unit,
		): ArrayHolder<WGPUDeviceLostCallbackInfo>
	}
}

public expect interface WGPUUncapturedErrorCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var callback: CallbackHolder<WGPUUncapturedErrorCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUUncapturedErrorCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPUUncapturedErrorCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUUncapturedErrorCallbackInfo) -> Unit,
		): ArrayHolder<WGPUUncapturedErrorCallbackInfo>
	}
}

public expect interface WGPUDeviceDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var requiredFeatureCount: ULong

	public var requiredFeatures: ArrayHolder<WGPUFeatureName>?

	public var requiredLimits: WGPULimits?

	public val defaultQueue: WGPUQueueDescriptor

	public val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo

	public val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUDeviceDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUDeviceDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUDeviceDescriptor) -> Unit,
		): ArrayHolder<WGPUDeviceDescriptor>
	}
}

public expect interface WGPUExtent3D {
	public var width: UInt

	public var height: UInt

	public var depthOrArrayLayers: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUExtent3D

		public fun allocate(allocator: MemoryAllocator): WGPUExtent3D

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUExtent3D) -> Unit,
		): ArrayHolder<WGPUExtent3D>
	}
}

public expect interface WGPUFragmentState {
	public var nextInChain: NativeAddress?

	public var module: WGPUShaderModule?

	public val entryPoint: WGPUStringView

	public var constantCount: ULong

	public var constants: ArrayHolder<WGPUConstantEntry>?

	public var targetCount: ULong

	public var targets: ArrayHolder<WGPUColorTargetState>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUFragmentState

		public fun allocate(allocator: MemoryAllocator): WGPUFragmentState

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFragmentState) -> Unit,
		): ArrayHolder<WGPUFragmentState>
	}
}

/**
 * Opaque handle to an asynchronous operation. See @ref Asynchronous-Operations for more information.
 */
public expect interface WGPUFuture {
	/**
	 * Opaque id of the @ref WGPUFuture
	 */
	public var id: ULong

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUFuture

		public fun allocate(allocator: MemoryAllocator): WGPUFuture

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFuture) -> Unit,
		): ArrayHolder<WGPUFuture>
	}
}

/**
 * Struct holding a future to wait on, and a [completed] boolean flag.
 */
public expect interface WGPUFutureWaitInfo {
	/**
	 * The future to wait on.
	 */
	public val future: WGPUFuture

	/**
	 * Whether or not the future completed.
	 */
	public var completed: Boolean

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUFutureWaitInfo

		public fun allocate(allocator: MemoryAllocator): WGPUFutureWaitInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUFutureWaitInfo) -> Unit,
		): ArrayHolder<WGPUFutureWaitInfo>
	}
}

/**
 * Features enabled on the WGPUInstance
 */
public expect interface WGPUInstanceCapabilities {
	public var nextInChain: NativeAddress?

	/**
	 * Enable use of ::wgpuInstanceWaitAny with [timeoutNS > 0].
	 */
	public var timedWaitAnyEnable: Boolean

	/**
	 * The maximum number @ref WGPUFutureWaitInfo supported in a call to ::wgpuInstanceWaitAny with [timeoutNS > 0].
	 */
	public var timedWaitAnyMaxCount: ULong

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUInstanceCapabilities

		public fun allocate(allocator: MemoryAllocator): WGPUInstanceCapabilities

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceCapabilities) -> Unit,
		): ArrayHolder<WGPUInstanceCapabilities>
	}
}

public expect interface WGPUInstanceDescriptor {
	public var nextInChain: NativeAddress?

	/**
	 * Instance features to enable
	 */
	public val features: WGPUInstanceCapabilities

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUInstanceDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUInstanceDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceDescriptor) -> Unit,
		): ArrayHolder<WGPUInstanceDescriptor>
	}
}

public expect interface WGPULimits {
	public var nextInChain: NativeAddress?

	public var maxTextureDimension1D: UInt

	public var maxTextureDimension2D: UInt

	public var maxTextureDimension3D: UInt

	public var maxTextureArrayLayers: UInt

	public var maxBindGroups: UInt

	public var maxBindGroupsPlusVertexBuffers: UInt

	public var maxBindingsPerBindGroup: UInt

	public var maxDynamicUniformBuffersPerPipelineLayout: UInt

	public var maxDynamicStorageBuffersPerPipelineLayout: UInt

	public var maxSampledTexturesPerShaderStage: UInt

	public var maxSamplersPerShaderStage: UInt

	public var maxStorageBuffersPerShaderStage: UInt

	public var maxStorageTexturesPerShaderStage: UInt

	public var maxUniformBuffersPerShaderStage: UInt

	public var maxUniformBufferBindingSize: ULong

	public var maxStorageBufferBindingSize: ULong

	public var minUniformBufferOffsetAlignment: UInt

	public var minStorageBufferOffsetAlignment: UInt

	public var maxVertexBuffers: UInt

	public var maxBufferSize: ULong

	public var maxVertexAttributes: UInt

	public var maxVertexBufferArrayStride: UInt

	public var maxInterStageShaderVariables: UInt

	public var maxColorAttachments: UInt

	public var maxColorAttachmentBytesPerSample: UInt

	public var maxComputeWorkgroupStorageSize: UInt

	public var maxComputeInvocationsPerWorkgroup: UInt

	public var maxComputeWorkgroupSizeX: UInt

	public var maxComputeWorkgroupSizeY: UInt

	public var maxComputeWorkgroupSizeZ: UInt

	public var maxComputeWorkgroupsPerDimension: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPULimits

		public fun allocate(allocator: MemoryAllocator): WGPULimits

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPULimits) -> Unit,
		): ArrayHolder<WGPULimits>
	}
}

public expect interface WGPUMultisampleState {
	public var nextInChain: NativeAddress?

	public var count: UInt

	public var mask: UInt

	public var alphaToCoverageEnabled: Boolean

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUMultisampleState

		public fun allocate(allocator: MemoryAllocator): WGPUMultisampleState

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUMultisampleState) -> Unit,
		): ArrayHolder<WGPUMultisampleState>
	}
}

public expect interface WGPUOrigin3D {
	public var x: UInt

	public var y: UInt

	public var z: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUOrigin3D

		public fun allocate(allocator: MemoryAllocator): WGPUOrigin3D

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUOrigin3D) -> Unit,
		): ArrayHolder<WGPUOrigin3D>
	}
}

public expect interface WGPUPipelineLayoutDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var bindGroupLayoutCount: ULong

	public var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUPipelineLayoutDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUPipelineLayoutDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPipelineLayoutDescriptor) -> Unit,
		): ArrayHolder<WGPUPipelineLayoutDescriptor>
	}
}

public expect interface WGPUPrimitiveState {
	public var nextInChain: NativeAddress?

	public var topology: WGPUPrimitiveTopology

	public var stripIndexFormat: WGPUIndexFormat

	public var frontFace: WGPUFrontFace

	public var cullMode: WGPUCullMode

	public var unclippedDepth: Boolean

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUPrimitiveState

		public fun allocate(allocator: MemoryAllocator): WGPUPrimitiveState

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPrimitiveState) -> Unit,
		): ArrayHolder<WGPUPrimitiveState>
	}
}

public expect interface WGPUQuerySetDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var type: WGPUQueryType

	public var count: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUQuerySetDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUQuerySetDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQuerySetDescriptor) -> Unit,
		): ArrayHolder<WGPUQuerySetDescriptor>
	}
}

public expect interface WGPURenderBundleDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURenderBundleDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPURenderBundleDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderBundleDescriptor) -> Unit,
		): ArrayHolder<WGPURenderBundleDescriptor>
	}
}

public expect interface WGPURenderBundleEncoderDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var colorFormatCount: ULong

	public var colorFormats: ArrayHolder<WGPUTextureFormat>?

	public var depthStencilFormat: WGPUTextureFormat

	public var sampleCount: UInt

	public var depthReadOnly: Boolean

	public var stencilReadOnly: Boolean

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURenderBundleEncoderDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPURenderBundleEncoderDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderBundleEncoderDescriptor) -> Unit,
		): ArrayHolder<WGPURenderBundleEncoderDescriptor>
	}
}

public expect interface WGPURenderPassColorAttachment {
	public var nextInChain: NativeAddress?

	public var view: WGPUTextureView?

	public var depthSlice: UInt

	public var resolveTarget: WGPUTextureView?

	public var loadOp: WGPULoadOp

	public var storeOp: WGPUStoreOp

	public val clearValue: WGPUColor

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURenderPassColorAttachment

		public fun allocate(allocator: MemoryAllocator): WGPURenderPassColorAttachment

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassColorAttachment) -> Unit,
		): ArrayHolder<WGPURenderPassColorAttachment>
	}
}

public expect interface WGPURenderPassDepthStencilAttachment {
	public var view: WGPUTextureView?

	public var depthLoadOp: WGPULoadOp

	public var depthStoreOp: WGPUStoreOp

	public var depthClearValue: Float

	public var depthReadOnly: Boolean

	public var stencilLoadOp: WGPULoadOp

	public var stencilStoreOp: WGPUStoreOp

	public var stencilClearValue: UInt

	public var stencilReadOnly: Boolean

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURenderPassDepthStencilAttachment

		public fun allocate(allocator: MemoryAllocator): WGPURenderPassDepthStencilAttachment

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassDepthStencilAttachment) -> Unit,
		): ArrayHolder<WGPURenderPassDepthStencilAttachment>
	}
}

public expect interface WGPURenderPassDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var colorAttachmentCount: ULong

	public var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?

	public var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?

	public var occlusionQuerySet: WGPUQuerySet?

	public var timestampWrites: WGPURenderPassTimestampWrites?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURenderPassDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassDescriptor) -> Unit,
		): ArrayHolder<WGPURenderPassDescriptor>
	}
}

public expect interface WGPUChainedStruct {
	public var next: WGPUChainedStruct?

	public var sType: WGPUSType

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUChainedStruct

		public fun allocate(allocator: MemoryAllocator): WGPUChainedStruct

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUChainedStruct) -> Unit,
		): ArrayHolder<WGPUChainedStruct>
	}
}

public expect interface WGPURenderPassMaxDrawCount {
	public val chain: WGPUChainedStruct

	public var maxDrawCount: ULong

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURenderPassMaxDrawCount

		public fun allocate(allocator: MemoryAllocator): WGPURenderPassMaxDrawCount

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassMaxDrawCount) -> Unit,
		): ArrayHolder<WGPURenderPassMaxDrawCount>
	}
}

public expect interface WGPURenderPassTimestampWrites {
	public var querySet: WGPUQuerySet?

	public var beginningOfPassWriteIndex: UInt

	public var endOfPassWriteIndex: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURenderPassTimestampWrites

		public fun allocate(allocator: MemoryAllocator): WGPURenderPassTimestampWrites

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPassTimestampWrites) -> Unit,
		): ArrayHolder<WGPURenderPassTimestampWrites>
	}
}

public expect interface WGPUVertexState {
	public var nextInChain: NativeAddress?

	public var module: WGPUShaderModule?

	public val entryPoint: WGPUStringView

	public var constantCount: ULong

	public var constants: ArrayHolder<WGPUConstantEntry>?

	public var bufferCount: ULong

	public var buffers: ArrayHolder<WGPUVertexBufferLayout>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUVertexState

		public fun allocate(allocator: MemoryAllocator): WGPUVertexState

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexState) -> Unit,
		): ArrayHolder<WGPUVertexState>
	}
}

public expect interface WGPURenderPipelineDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var layout: WGPUPipelineLayout?

	public val vertex: WGPUVertexState

	public val primitive: WGPUPrimitiveState

	public var depthStencil: WGPUDepthStencilState?

	public val multisample: WGPUMultisampleState

	public var fragment: WGPUFragmentState?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURenderPipelineDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPURenderPipelineDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURenderPipelineDescriptor) -> Unit,
		): ArrayHolder<WGPURenderPipelineDescriptor>
	}
}

public expect interface WGPURequestAdapterOptions {
	public var nextInChain: NativeAddress?

	/**
	 * "Feature level" for the adapter request. If an adapter is returned, it must support the features and limits in the requested feature level.
	 *
	 * Implementations may ignore @ref WGPUFeatureLevel_Compatibility and provide @ref WGPUFeatureLevel_Core instead. @ref WGPUFeatureLevel_Core is the default in the JS API, but in C, this field is **required** (must not be undefined).
	 */
	public var featureLevel: WGPUFeatureLevel

	public var powerPreference: WGPUPowerPreference

	/**
	 * If true, requires the adapter to be a "fallback" adapter as defined by the JS spec.
	 * If this is not possible, the request returns null.
	 */
	public var forceFallbackAdapter: Boolean

	/**
	 * If set, requires the adapter to have a particular backend type.
	 * If this is not possible, the request returns null.
	 */
	public var backendType: WGPUBackendType

	/**
	 * If set, requires the adapter to be able to output to a particular surface.
	 * If this is not possible, the request returns null.
	 */
	public var compatibleSurface: WGPUSurface?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURequestAdapterOptions

		public fun allocate(allocator: MemoryAllocator): WGPURequestAdapterOptions

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestAdapterOptions) -> Unit,
		): ArrayHolder<WGPURequestAdapterOptions>
	}
}

public expect interface WGPUSamplerDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var addressModeU: WGPUAddressMode

	public var addressModeV: WGPUAddressMode

	public var addressModeW: WGPUAddressMode

	public var magFilter: WGPUFilterMode

	public var minFilter: WGPUFilterMode

	public var mipmapFilter: WGPUMipmapFilterMode

	public var lodMinClamp: Float

	public var lodMaxClamp: Float

	public var compare: WGPUCompareFunction

	public var maxAnisotropy: UShort

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSamplerDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUSamplerDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSamplerDescriptor) -> Unit,
		): ArrayHolder<WGPUSamplerDescriptor>
	}
}

public expect interface WGPUShaderModuleDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUShaderModuleDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUShaderModuleDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderModuleDescriptor) -> Unit,
		): ArrayHolder<WGPUShaderModuleDescriptor>
	}
}

public expect interface WGPUShaderSourceSPIRV {
	public val chain: WGPUChainedStruct

	public var codeSize: UInt

	public var code: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUShaderSourceSPIRV

		public fun allocate(allocator: MemoryAllocator): WGPUShaderSourceSPIRV

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderSourceSPIRV) -> Unit,
		): ArrayHolder<WGPUShaderSourceSPIRV>
	}
}

public expect interface WGPUShaderSourceWGSL {
	public val chain: WGPUChainedStruct

	public val code: WGPUStringView

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUShaderSourceWGSL

		public fun allocate(allocator: MemoryAllocator): WGPUShaderSourceWGSL

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUShaderSourceWGSL) -> Unit,
		): ArrayHolder<WGPUShaderSourceWGSL>
	}
}

public expect interface WGPUSupportedFeatures {
	public var featureCount: ULong

	public var features: ArrayHolder<WGPUFeatureName>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSupportedFeatures

		public fun allocate(allocator: MemoryAllocator): WGPUSupportedFeatures

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSupportedFeatures) -> Unit,
		): ArrayHolder<WGPUSupportedFeatures>
	}
}

public expect interface WGPUSupportedWGSLLanguageFeatures {
	public var featureCount: ULong

	public var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSupportedWGSLLanguageFeatures

		public fun allocate(allocator: MemoryAllocator): WGPUSupportedWGSLLanguageFeatures

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSupportedWGSLLanguageFeatures) -> Unit,
		): ArrayHolder<WGPUSupportedWGSLLanguageFeatures>
	}
}

/**
 * Filled by [wgpuSurfaceGetCapabilities] with what's supported for [wgpuSurfaceConfigure] for a pair of @ref WGPUSurface and @ref WGPUAdapter.
 */
public expect interface WGPUSurfaceCapabilities {
	public var nextInChain: NativeAddress?

	/**
	 * The bit set of supported @ref WGPUTextureUsage bits.
	 * Guaranteed to contain @ref WGPUTextureUsage_RenderAttachment.
	 */
	public var usages: ULong

	public var formatCount: ULong

	/**
	 * A list of supported @ref WGPUTextureFormat values, in order of preference.
	 */
	public var formats: ArrayHolder<WGPUTextureFormat>?

	public var presentModeCount: ULong

	/**
	 * A list of supported @ref WGPUPresentMode values.
	 * Guaranteed to contain @ref WGPUPresentMode_Fifo.
	 */
	public var presentModes: ArrayHolder<WGPUPresentMode>?

	public var alphaModeCount: ULong

	/**
	 * A list of supported @ref WGPUCompositeAlphaMode values.
	 * @ref WGPUCompositeAlphaMode_Auto will be an alias for the first element and will never be present in this array.
	 */
	public var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceCapabilities

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceCapabilities

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceCapabilities) -> Unit,
		): ArrayHolder<WGPUSurfaceCapabilities>
	}
}

/**
 * Options to [wgpuSurfaceConfigure] for defining how a @ref WGPUSurface will be rendered to and presented to the user.
 * See @ref Surface-Configuration for more details.
 */
public expect interface WGPUSurfaceConfiguration {
	public var nextInChain: NativeAddress?

	/**
	 * The @ref WGPUDevice to use to render to surface's textures.
	 */
	public var device: WGPUDevice?

	/**
	 * The @ref WGPUTextureFormat of the surface's textures.
	 */
	public var format: WGPUTextureFormat

	/**
	 * The @ref WGPUTextureUsage of the surface's textures.
	 */
	public var usage: ULong

	/**
	 * The width of the surface's textures.
	 */
	public var width: UInt

	/**
	 * The height of the surface's textures.
	 */
	public var height: UInt

	public var viewFormatCount: ULong

	/**
	 * The additional @ref WGPUTextureFormat for @ref WGPUTextureView format reinterpretation of the surface's textures.
	 */
	public var viewFormats: ArrayHolder<WGPUTextureFormat>?

	/**
	 * How the surface's frames will be composited on the screen.
	 */
	public var alphaMode: WGPUCompositeAlphaMode

	/**
	 * When and in which order the surface's frames will be shown on the screen. Defaults to @ref WGPUPresentMode_Fifo.
	 */
	public var presentMode: WGPUPresentMode

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceConfiguration

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceConfiguration

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceConfiguration) -> Unit,
		): ArrayHolder<WGPUSurfaceConfiguration>
	}
}

/**
 * The root descriptor for the creation of an @ref WGPUSurface with [wgpuInstanceCreateSurface].
 * It isn't sufficient by itself and must have one of the [WGPUSurfaceSource*] in its chain.
 * See @ref Surface-Creation for more details.
 */
public expect interface WGPUSurfaceDescriptor {
	public var nextInChain: NativeAddress?

	/**
	 * Label used to refer to the object.
	 */
	public val label: WGPUStringView

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceDescriptor) -> Unit,
		): ArrayHolder<WGPUSurfaceDescriptor>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping an Android [[ANativeWindow]](https://developer.android.com/ndk/reference/group/a-native-window).
 */
public expect interface WGPUSurfaceSourceAndroidNativeWindow {
	public val chain: WGPUChainedStruct

	/**
	 * The pointer to the [[ANativeWindow]](https://developer.android.com/ndk/reference/group/a-native-window) that will be wrapped by the @ref WGPUSurface.
	 */
	public var window: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceSourceAndroidNativeWindow

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceAndroidNativeWindow

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceAndroidNativeWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceAndroidNativeWindow>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping a [[CAMetalLayer]](https://developer.apple.com/documentation/quartzcore/cametallayer?language=objc).
 */
public expect interface WGPUSurfaceSourceMetalLayer {
	public val chain: WGPUChainedStruct

	/**
	 * The pointer to the [[CAMetalLayer]](https://developer.apple.com/documentation/quartzcore/cametallayer?language=objc) that will be wrapped by the @ref WGPUSurface.
	 */
	public var layer: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceSourceMetalLayer

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceMetalLayer

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceMetalLayer) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceMetalLayer>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping a [Wayland](https://wayland.freedesktop.org/) [[wl_surface]](https://wayland.freedesktop.org/docs/html/apa.html#protocol-spec-wl_surface).
 */
public expect interface WGPUSurfaceSourceWaylandSurface {
	public val chain: WGPUChainedStruct

	/**
	 * A [[wl_display]](https://wayland.freedesktop.org/docs/html/apa.html#protocol-spec-wl_display) for this Wayland instance.
	 */
	public var display: NativeAddress?

	/**
	 * A [[wl_surface]](https://wayland.freedesktop.org/docs/html/apa.html#protocol-spec-wl_surface) that will be wrapped by the @ref WGPUSurface
	 */
	public var surface: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWaylandSurface

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWaylandSurface

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceWaylandSurface) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceWaylandSurface>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping a Windows [[HWND]](https://learn.microsoft.com/en-us/windows/apps/develop/ui-input/retrieve-hwnd).
 */
public expect interface WGPUSurfaceSourceWindowsHWND {
	public val chain: WGPUChainedStruct

	/**
	 * The [[HINSTANCE]](https://learn.microsoft.com/en-us/windows/win32/learnwin32/winmain--the-application-entry-point) for this application.
	 * Most commonly [GetModuleHandle(nullptr)].
	 */
	public var hinstance: NativeAddress?

	/**
	 * The [[HWND]](https://learn.microsoft.com/en-us/windows/apps/develop/ui-input/retrieve-hwnd) that will be wrapped by the @ref WGPUSurface.
	 */
	public var hwnd: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWindowsHWND

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWindowsHWND

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceWindowsHWND) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceWindowsHWND>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping an [XCB](https://xcb.freedesktop.org/) [xcb_window_t].
 */
public expect interface WGPUSurfaceSourceXCBWindow {
	public val chain: WGPUChainedStruct

	/**
	 * The [xcb_connection_t] for the connection to the X server.
	 */
	public var connection: NativeAddress?

	/**
	 * The [xcb_window_t] for the window that will be wrapped by the @ref WGPUSurface.
	 */
	public var window: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXCBWindow

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXCBWindow

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceXCBWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceXCBWindow>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping an [Xlib](https://www.x.org/releases/current/doc/libX11/libX11/libX11.html) [Window].
 */
public expect interface WGPUSurfaceSourceXlibWindow {
	public val chain: WGPUChainedStruct

	/**
	 * A pointer to the [[Display]](https://www.x.org/releases/current/doc/libX11/libX11/libX11.html#Opening_the_Display) connected to the X server.
	 */
	public var display: NativeAddress?

	/**
	 * The [[Window]](https://www.x.org/releases/current/doc/libX11/libX11/libX11.html#Creating_Windows) that will be wrapped by the @ref WGPUSurface.
	 */
	public var window: ULong

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXlibWindow

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXlibWindow

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceSourceXlibWindow) -> Unit,
		): ArrayHolder<WGPUSurfaceSourceXlibWindow>
	}
}

/**
 * Queried each frame from a @ref WGPUSurface to get a @ref WGPUTexture to render to along with some metadata.
 * See @ref Surface-Presenting for more details.
 */
public expect interface WGPUSurfaceTexture {
	public var nextInChain: NativeAddress?

	/**
	 * The @ref WGPUTexture representing the frame that will be shown on the surface.
	 * It is @ref ReturnedWithOwnership from @ref wgpuSurfaceGetCurrentTexture.
	 */
	public var texture: WGPUTexture?

	/**
	 * Whether the call to [wgpuSurfaceGetCurrentTexture] succeeded and a hint as to why it might not have.
	 */
	public var status: WGPUSurfaceGetCurrentTextureStatus

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUSurfaceTexture

		public fun allocate(allocator: MemoryAllocator): WGPUSurfaceTexture

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUSurfaceTexture) -> Unit,
		): ArrayHolder<WGPUSurfaceTexture>
	}
}

public expect interface WGPUTexelCopyBufferLayout {
	public var offset: ULong

	public var bytesPerRow: UInt

	public var rowsPerImage: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferLayout

		public fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferLayout

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyBufferLayout) -> Unit,
		): ArrayHolder<WGPUTexelCopyBufferLayout>
	}
}

public expect interface WGPUTexelCopyBufferInfo {
	public val layout: WGPUTexelCopyBufferLayout

	public var buffer: WGPUBuffer?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferInfo

		public fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyBufferInfo) -> Unit,
		): ArrayHolder<WGPUTexelCopyBufferInfo>
	}
}

public expect interface WGPUTexelCopyTextureInfo {
	public var texture: WGPUTexture?

	public var mipLevel: UInt

	public val origin: WGPUOrigin3D

	public var aspect: WGPUTextureAspect

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUTexelCopyTextureInfo

		public fun allocate(allocator: MemoryAllocator): WGPUTexelCopyTextureInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTexelCopyTextureInfo) -> Unit,
		): ArrayHolder<WGPUTexelCopyTextureInfo>
	}
}

public expect interface WGPUTextureDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var usage: ULong

	public var dimension: WGPUTextureDimension

	public val size: WGPUExtent3D

	public var format: WGPUTextureFormat

	public var mipLevelCount: UInt

	public var sampleCount: UInt

	public var viewFormatCount: ULong

	public var viewFormats: ArrayHolder<WGPUTextureFormat>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUTextureDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUTextureDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureDescriptor) -> Unit,
		): ArrayHolder<WGPUTextureDescriptor>
	}
}

public expect interface WGPUTextureViewDescriptor {
	public var nextInChain: NativeAddress?

	public val label: WGPUStringView

	public var format: WGPUTextureFormat

	public var dimension: WGPUTextureViewDimension

	public var baseMipLevel: UInt

	public var mipLevelCount: UInt

	public var baseArrayLayer: UInt

	public var arrayLayerCount: UInt

	public var aspect: WGPUTextureAspect

	public var usage: ULong

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUTextureViewDescriptor

		public fun allocate(allocator: MemoryAllocator): WGPUTextureViewDescriptor

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUTextureViewDescriptor) -> Unit,
		): ArrayHolder<WGPUTextureViewDescriptor>
	}
}

public expect interface WGPUVertexAttribute {
	public var format: WGPUVertexFormat

	public var offset: ULong

	public var shaderLocation: UInt

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUVertexAttribute

		public fun allocate(allocator: MemoryAllocator): WGPUVertexAttribute

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexAttribute) -> Unit,
		): ArrayHolder<WGPUVertexAttribute>
	}
}

public expect interface WGPUVertexBufferLayout {
	/**
	 * The step mode for the vertex buffer. If @ref WGPUVertexStepMode_VertexBufferNotUsed,
	 * indicates a "hole" in the parent @ref WGPUVertexState [buffers] array:
	 * the pipeline does not use a vertex buffer at this [location].
	 */
	public var stepMode: WGPUVertexStepMode

	public var arrayStride: ULong

	public var attributeCount: ULong

	public var attributes: ArrayHolder<WGPUVertexAttribute>?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUVertexBufferLayout

		public fun allocate(allocator: MemoryAllocator): WGPUVertexBufferLayout

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUVertexBufferLayout) -> Unit,
		): ArrayHolder<WGPUVertexBufferLayout>
	}
}

public expect interface WGPUInstanceExtras {
	public val chain: WGPUChainedStruct

	public var backends: ULong

	public var flags: ULong

	public var dx12ShaderCompiler: WGPUDx12Compiler

	public var gles3MinorVersion: WGPUGles3MinorVersion

	public var glFenceBehaviour: WGPUGLFenceBehaviour

	public val dxcPath: WGPUStringView

	public var dxcMaxShaderModel: WGPUDxcMaxShaderModel

	public var budgetForDeviceCreation: NativeAddress?

	public var budgetForDeviceLoss: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUInstanceExtras

		public fun allocate(allocator: MemoryAllocator): WGPUInstanceExtras

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUInstanceExtras) -> Unit,
		): ArrayHolder<WGPUInstanceExtras>
	}
}

public expect interface WGPUChainedStructOut {
	public var next: WGPUChainedStructOut?

	public var sType: WGPUSType

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUChainedStructOut

		public fun allocate(allocator: MemoryAllocator): WGPUChainedStructOut

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUChainedStructOut) -> Unit,
		): ArrayHolder<WGPUChainedStructOut>
	}
}

public expect interface WGPUBufferMapCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var mode: WGPUCallbackMode

	public var callback: CallbackHolder<WGPUBufferMapCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUBufferMapCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPUBufferMapCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUBufferMapCallbackInfo) -> Unit,
		): ArrayHolder<WGPUBufferMapCallbackInfo>
	}
}

public expect interface WGPUCompilationInfoCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var mode: WGPUCallbackMode

	public var callback: CallbackHolder<WGPUCompilationInfoCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUCompilationInfoCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPUCompilationInfoCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCompilationInfoCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCompilationInfoCallbackInfo>
	}
}

public expect interface WGPUCreateComputePipelineAsyncCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var mode: WGPUCallbackMode

	public var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUCreateComputePipelineAsyncCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPUCreateComputePipelineAsyncCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCreateComputePipelineAsyncCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCreateComputePipelineAsyncCallbackInfo>
	}
}

public expect interface WGPUCreateRenderPipelineAsyncCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var mode: WGPUCallbackMode

	public var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUCreateRenderPipelineAsyncCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPUCreateRenderPipelineAsyncCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUCreateRenderPipelineAsyncCallbackInfo) -> Unit,
		): ArrayHolder<WGPUCreateRenderPipelineAsyncCallbackInfo>
	}
}

public expect interface WGPUPopErrorScopeCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var mode: WGPUCallbackMode

	public var callback: CallbackHolder<WGPUPopErrorScopeCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUPopErrorScopeCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPUPopErrorScopeCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUPopErrorScopeCallbackInfo) -> Unit,
		): ArrayHolder<WGPUPopErrorScopeCallbackInfo>
	}
}

public expect interface WGPUQueueWorkDoneCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var mode: WGPUCallbackMode

	public var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPUQueueWorkDoneCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPUQueueWorkDoneCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPUQueueWorkDoneCallbackInfo) -> Unit,
		): ArrayHolder<WGPUQueueWorkDoneCallbackInfo>
	}
}

public expect interface WGPURequestAdapterCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var mode: WGPUCallbackMode

	public var callback: CallbackHolder<WGPURequestAdapterCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURequestAdapterCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPURequestAdapterCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestAdapterCallbackInfo) -> Unit,
		): ArrayHolder<WGPURequestAdapterCallbackInfo>
	}
}

public expect interface WGPURequestDeviceCallbackInfo {
	public var nextInChain: WGPUChainedStruct?

	public var mode: WGPUCallbackMode

	public var callback: CallbackHolder<WGPURequestDeviceCallback>?

	public var userdata1: NativeAddress?

	public var userdata2: NativeAddress?

	public val handler: NativeAddress

	public companion object {
		public operator fun invoke(address: NativeAddress): WGPURequestDeviceCallbackInfo

		public fun allocate(allocator: MemoryAllocator): WGPURequestDeviceCallbackInfo

		public fun allocateArray(
			allocator: MemoryAllocator,
			size: UInt,
			provider: (UInt, WGPURequestDeviceCallbackInfo) -> Unit,
		): ArrayHolder<WGPURequestDeviceCallbackInfo>
	}
}
