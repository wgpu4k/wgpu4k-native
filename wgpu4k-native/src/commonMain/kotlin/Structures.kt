// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.NativeAddress
import ffi.CallbackHolder
import ffi.CString
import ffi.ArrayHolder
import ffi.MemoryAllocator

expect interface WGPUStringView {
	var data: CString?
	var length: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUStringView
		fun allocate(allocator: MemoryAllocator): WGPUStringView
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUStringView) -> Unit): ArrayHolder<WGPUStringView>
	}
}

expect interface WGPUAdapterInfo {
	var nextInChain: NativeAddress?
	val vendor: WGPUStringView
	val architecture: WGPUStringView
	val device: WGPUStringView
	val description: WGPUStringView
	var backendType: WGPUBackendType
	var adapterType: WGPUAdapterType
	var vendorID: UInt
	var deviceID: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUAdapterInfo
		fun allocate(allocator: MemoryAllocator): WGPUAdapterInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUAdapterInfo) -> Unit): ArrayHolder<WGPUAdapterInfo>
	}
}

expect interface WGPUBindGroupDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var layout: WGPUBindGroupLayout?
	var entryCount: ULong
	var entries: ArrayHolder<WGPUBindGroupEntry>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBindGroupDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUBindGroupDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBindGroupDescriptor) -> Unit): ArrayHolder<WGPUBindGroupDescriptor>
	}
}

expect interface WGPUBindGroupEntry {
	var nextInChain: NativeAddress?
	var binding: UInt
	var buffer: WGPUBuffer?
	var offset: ULong
	var size: ULong
	var sampler: WGPUSampler?
	var textureView: WGPUTextureView?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBindGroupEntry
		fun allocate(allocator: MemoryAllocator): WGPUBindGroupEntry
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBindGroupEntry) -> Unit): ArrayHolder<WGPUBindGroupEntry>
	}
}

expect interface WGPUBindGroupLayoutDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var entryCount: ULong
	var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBindGroupLayoutDescriptor) -> Unit): ArrayHolder<WGPUBindGroupLayoutDescriptor>
	}
}

expect interface WGPUBufferBindingLayout {
	var nextInChain: NativeAddress?
	var type: WGPUBufferBindingType
	var hasDynamicOffset: Boolean
	var minBindingSize: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBufferBindingLayout
		fun allocate(allocator: MemoryAllocator): WGPUBufferBindingLayout
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBufferBindingLayout) -> Unit): ArrayHolder<WGPUBufferBindingLayout>
	}
}

expect interface WGPUSamplerBindingLayout {
	var nextInChain: NativeAddress?
	var type: WGPUSamplerBindingType
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSamplerBindingLayout
		fun allocate(allocator: MemoryAllocator): WGPUSamplerBindingLayout
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSamplerBindingLayout) -> Unit): ArrayHolder<WGPUSamplerBindingLayout>
	}
}

expect interface WGPUTextureBindingLayout {
	var nextInChain: NativeAddress?
	var sampleType: WGPUTextureSampleType
	var viewDimension: WGPUTextureViewDimension
	var multisampled: Boolean
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUTextureBindingLayout
		fun allocate(allocator: MemoryAllocator): WGPUTextureBindingLayout
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUTextureBindingLayout) -> Unit): ArrayHolder<WGPUTextureBindingLayout>
	}
}

expect interface WGPUStorageTextureBindingLayout {
	var nextInChain: NativeAddress?
	var access: WGPUStorageTextureAccess
	var format: WGPUTextureFormat
	var viewDimension: WGPUTextureViewDimension
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUStorageTextureBindingLayout
		fun allocate(allocator: MemoryAllocator): WGPUStorageTextureBindingLayout
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUStorageTextureBindingLayout) -> Unit): ArrayHolder<WGPUStorageTextureBindingLayout>
	}
}

expect interface WGPUBindGroupLayoutEntry {
	var nextInChain: NativeAddress?
	var binding: UInt
	var visibility: ULong
	val buffer: WGPUBufferBindingLayout
	val sampler: WGPUSamplerBindingLayout
	val texture: WGPUTextureBindingLayout
	val storageTexture: WGPUStorageTextureBindingLayout
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutEntry
		fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutEntry
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBindGroupLayoutEntry) -> Unit): ArrayHolder<WGPUBindGroupLayoutEntry>
	}
}

expect interface WGPUBlendComponent {
	var operation: WGPUBlendOperation
	var srcFactor: WGPUBlendFactor
	var dstFactor: WGPUBlendFactor
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBlendComponent
		fun allocate(allocator: MemoryAllocator): WGPUBlendComponent
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBlendComponent) -> Unit): ArrayHolder<WGPUBlendComponent>
	}
}

expect interface WGPUBlendState {
	val color: WGPUBlendComponent
	val alpha: WGPUBlendComponent
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBlendState
		fun allocate(allocator: MemoryAllocator): WGPUBlendState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBlendState) -> Unit): ArrayHolder<WGPUBlendState>
	}
}

expect interface WGPUBufferDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var usage: ULong
	var size: ULong
	var mappedAtCreation: Boolean
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBufferDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUBufferDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBufferDescriptor) -> Unit): ArrayHolder<WGPUBufferDescriptor>
	}
}

expect interface WGPUColor {
	var r: Double
	var g: Double
	var b: Double
	var a: Double
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUColor
		fun allocate(allocator: MemoryAllocator): WGPUColor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUColor) -> Unit): ArrayHolder<WGPUColor>
	}
}

expect interface WGPUColorTargetState {
	var nextInChain: NativeAddress?
	/**
	 * The texture format of the target. If @ref WGPUTextureFormat_Undefined,
	 * indicates a "hole" in the parent @ref WGPUFragmentState [targets] array:
	 * the pipeline does not output a value at this [location].
	 */
	var format: WGPUTextureFormat
	var blend: WGPUBlendState?
	var writeMask: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUColorTargetState
		fun allocate(allocator: MemoryAllocator): WGPUColorTargetState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUColorTargetState) -> Unit): ArrayHolder<WGPUColorTargetState>
	}
}

expect interface WGPUCommandBufferDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUCommandBufferDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUCommandBufferDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUCommandBufferDescriptor) -> Unit): ArrayHolder<WGPUCommandBufferDescriptor>
	}
}

expect interface WGPUCommandEncoderDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUCommandEncoderDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUCommandEncoderDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUCommandEncoderDescriptor) -> Unit): ArrayHolder<WGPUCommandEncoderDescriptor>
	}
}

expect interface WGPUCompilationInfo {
	var nextInChain: NativeAddress?
	var messageCount: ULong
	var messages: ArrayHolder<WGPUCompilationMessage>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUCompilationInfo
		fun allocate(allocator: MemoryAllocator): WGPUCompilationInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUCompilationInfo) -> Unit): ArrayHolder<WGPUCompilationInfo>
	}
}

expect interface WGPUCompilationMessage {
	var nextInChain: NativeAddress?
	/**
	 * A @ref LocalizableHumanReadableMessageString.
	 */
	val message: WGPUStringView
	/**
	 * Severity level of the message.
	 */
	var type: WGPUCompilationMessageType
	/**
	 * Line number where the message is attached, starting at 1.
	 */
	var lineNum: ULong
	/**
	 * Offset in UTF-8 code units (bytes) from the beginning of the line, starting at 1.
	 */
	var linePos: ULong
	/**
	 * Offset in UTF-8 code units (bytes) from the beginning of the shader code, starting at 0.
	 */
	var offset: ULong
	/**
	 * Length in UTF-8 code units (bytes) of the span the message corresponds to.
	 */
	var length: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUCompilationMessage
		fun allocate(allocator: MemoryAllocator): WGPUCompilationMessage
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUCompilationMessage) -> Unit): ArrayHolder<WGPUCompilationMessage>
	}
}

expect interface WGPUComputePassDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var timestampWrites: WGPUComputePassTimestampWrites?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUComputePassDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUComputePassDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUComputePassDescriptor) -> Unit): ArrayHolder<WGPUComputePassDescriptor>
	}
}

expect interface WGPUComputePassTimestampWrites {
	var querySet: WGPUQuerySet?
	var beginningOfPassWriteIndex: UInt
	var endOfPassWriteIndex: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUComputePassTimestampWrites
		fun allocate(allocator: MemoryAllocator): WGPUComputePassTimestampWrites
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUComputePassTimestampWrites) -> Unit): ArrayHolder<WGPUComputePassTimestampWrites>
	}
}

expect interface WGPUProgrammableStageDescriptor {
	var nextInChain: NativeAddress?
	var module: WGPUShaderModule?
	val entryPoint: WGPUStringView
	var constantCount: ULong
	var constants: ArrayHolder<WGPUConstantEntry>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUProgrammableStageDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUProgrammableStageDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUProgrammableStageDescriptor) -> Unit): ArrayHolder<WGPUProgrammableStageDescriptor>
	}
}

expect interface WGPUComputePipelineDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var layout: WGPUPipelineLayout?
	val compute: WGPUProgrammableStageDescriptor
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUComputePipelineDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUComputePipelineDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUComputePipelineDescriptor) -> Unit): ArrayHolder<WGPUComputePipelineDescriptor>
	}
}

expect interface WGPUConstantEntry {
	var nextInChain: NativeAddress?
	val key: WGPUStringView
	var value: Double
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUConstantEntry
		fun allocate(allocator: MemoryAllocator): WGPUConstantEntry
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUConstantEntry) -> Unit): ArrayHolder<WGPUConstantEntry>
	}
}

expect interface WGPUStencilFaceState {
	var compare: WGPUCompareFunction
	var failOp: WGPUStencilOperation
	var depthFailOp: WGPUStencilOperation
	var passOp: WGPUStencilOperation
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUStencilFaceState
		fun allocate(allocator: MemoryAllocator): WGPUStencilFaceState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUStencilFaceState) -> Unit): ArrayHolder<WGPUStencilFaceState>
	}
}

expect interface WGPUDepthStencilState {
	var nextInChain: NativeAddress?
	var format: WGPUTextureFormat
	var depthWriteEnabled: WGPUOptionalBool
	var depthCompare: WGPUCompareFunction
	val stencilFront: WGPUStencilFaceState
	val stencilBack: WGPUStencilFaceState
	var stencilReadMask: UInt
	var stencilWriteMask: UInt
	var depthBias: Int
	var depthBiasSlopeScale: Float
	var depthBiasClamp: Float
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUDepthStencilState
		fun allocate(allocator: MemoryAllocator): WGPUDepthStencilState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUDepthStencilState) -> Unit): ArrayHolder<WGPUDepthStencilState>
	}
}

expect interface WGPUQueueDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUQueueDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUQueueDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUQueueDescriptor) -> Unit): ArrayHolder<WGPUQueueDescriptor>
	}
}

expect interface WGPUDeviceLostCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var mode: WGPUCallbackMode
	var callback: CallbackHolder<WGPUDeviceLostCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUDeviceLostCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPUDeviceLostCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUDeviceLostCallbackInfo) -> Unit): ArrayHolder<WGPUDeviceLostCallbackInfo>
	}
}

expect interface WGPUUncapturedErrorCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var callback: CallbackHolder<WGPUUncapturedErrorCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUUncapturedErrorCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPUUncapturedErrorCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUUncapturedErrorCallbackInfo) -> Unit): ArrayHolder<WGPUUncapturedErrorCallbackInfo>
	}
}

expect interface WGPUDeviceDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var requiredFeatureCount: ULong
	var requiredFeatures: ArrayHolder<WGPUFeatureName>?
	var requiredLimits: WGPULimits?
	val defaultQueue: WGPUQueueDescriptor
	val deviceLostCallbackInfo: WGPUDeviceLostCallbackInfo
	val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUDeviceDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUDeviceDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUDeviceDescriptor) -> Unit): ArrayHolder<WGPUDeviceDescriptor>
	}
}

expect interface WGPUExtent3D {
	var width: UInt
	var height: UInt
	var depthOrArrayLayers: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUExtent3D
		fun allocate(allocator: MemoryAllocator): WGPUExtent3D
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUExtent3D) -> Unit): ArrayHolder<WGPUExtent3D>
	}
}

expect interface WGPUFragmentState {
	var nextInChain: NativeAddress?
	var module: WGPUShaderModule?
	val entryPoint: WGPUStringView
	var constantCount: ULong
	var constants: ArrayHolder<WGPUConstantEntry>?
	var targetCount: ULong
	var targets: ArrayHolder<WGPUColorTargetState>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUFragmentState
		fun allocate(allocator: MemoryAllocator): WGPUFragmentState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUFragmentState) -> Unit): ArrayHolder<WGPUFragmentState>
	}
}

/**
 * Opaque handle to an asynchronous operation. See @ref Asynchronous-Operations for more information.
 */
expect interface WGPUFuture {
	/**
	 * Opaque id of the @ref WGPUFuture
	 */
	var id: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUFuture
		fun allocate(allocator: MemoryAllocator): WGPUFuture
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUFuture) -> Unit): ArrayHolder<WGPUFuture>
	}
}

/**
 * Struct holding a future to wait on, and a [completed] boolean flag.
 */
expect interface WGPUFutureWaitInfo {
	/**
	 * The future to wait on.
	 */
	val future: WGPUFuture
	/**
	 * Whether or not the future completed.
	 */
	var completed: Boolean
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUFutureWaitInfo
		fun allocate(allocator: MemoryAllocator): WGPUFutureWaitInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUFutureWaitInfo) -> Unit): ArrayHolder<WGPUFutureWaitInfo>
	}
}

/**
 * Features enabled on the WGPUInstance
 */
expect interface WGPUInstanceCapabilities {
	var nextInChain: NativeAddress?
	/**
	 * Enable use of ::wgpuInstanceWaitAny with [timeoutNS > 0].
	 */
	var timedWaitAnyEnable: Boolean
	/**
	 * The maximum number @ref WGPUFutureWaitInfo supported in a call to ::wgpuInstanceWaitAny with [timeoutNS > 0].
	 */
	var timedWaitAnyMaxCount: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUInstanceCapabilities
		fun allocate(allocator: MemoryAllocator): WGPUInstanceCapabilities
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUInstanceCapabilities) -> Unit): ArrayHolder<WGPUInstanceCapabilities>
	}
}

expect interface WGPUInstanceDescriptor {
	var nextInChain: NativeAddress?
	/**
	 * Instance features to enable
	 */
	val features: WGPUInstanceCapabilities
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUInstanceDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUInstanceDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUInstanceDescriptor) -> Unit): ArrayHolder<WGPUInstanceDescriptor>
	}
}

expect interface WGPULimits {
	var nextInChain: NativeAddress?
	var maxTextureDimension1D: UInt
	var maxTextureDimension2D: UInt
	var maxTextureDimension3D: UInt
	var maxTextureArrayLayers: UInt
	var maxBindGroups: UInt
	var maxBindGroupsPlusVertexBuffers: UInt
	var maxBindingsPerBindGroup: UInt
	var maxDynamicUniformBuffersPerPipelineLayout: UInt
	var maxDynamicStorageBuffersPerPipelineLayout: UInt
	var maxSampledTexturesPerShaderStage: UInt
	var maxSamplersPerShaderStage: UInt
	var maxStorageBuffersPerShaderStage: UInt
	var maxStorageTexturesPerShaderStage: UInt
	var maxUniformBuffersPerShaderStage: UInt
	var maxUniformBufferBindingSize: ULong
	var maxStorageBufferBindingSize: ULong
	var minUniformBufferOffsetAlignment: UInt
	var minStorageBufferOffsetAlignment: UInt
	var maxVertexBuffers: UInt
	var maxBufferSize: ULong
	var maxVertexAttributes: UInt
	var maxVertexBufferArrayStride: UInt
	var maxInterStageShaderVariables: UInt
	var maxColorAttachments: UInt
	var maxColorAttachmentBytesPerSample: UInt
	var maxComputeWorkgroupStorageSize: UInt
	var maxComputeInvocationsPerWorkgroup: UInt
	var maxComputeWorkgroupSizeX: UInt
	var maxComputeWorkgroupSizeY: UInt
	var maxComputeWorkgroupSizeZ: UInt
	var maxComputeWorkgroupsPerDimension: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPULimits
		fun allocate(allocator: MemoryAllocator): WGPULimits
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPULimits) -> Unit): ArrayHolder<WGPULimits>
	}
}

expect interface WGPUMultisampleState {
	var nextInChain: NativeAddress?
	var count: UInt
	var mask: UInt
	var alphaToCoverageEnabled: Boolean
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUMultisampleState
		fun allocate(allocator: MemoryAllocator): WGPUMultisampleState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUMultisampleState) -> Unit): ArrayHolder<WGPUMultisampleState>
	}
}

expect interface WGPUOrigin3D {
	var x: UInt
	var y: UInt
	var z: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUOrigin3D
		fun allocate(allocator: MemoryAllocator): WGPUOrigin3D
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUOrigin3D) -> Unit): ArrayHolder<WGPUOrigin3D>
	}
}

expect interface WGPUPipelineLayoutDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var bindGroupLayoutCount: ULong
	var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUPipelineLayoutDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUPipelineLayoutDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUPipelineLayoutDescriptor) -> Unit): ArrayHolder<WGPUPipelineLayoutDescriptor>
	}
}

expect interface WGPUPrimitiveState {
	var nextInChain: NativeAddress?
	var topology: WGPUPrimitiveTopology
	var stripIndexFormat: WGPUIndexFormat
	var frontFace: WGPUFrontFace
	var cullMode: WGPUCullMode
	var unclippedDepth: Boolean
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUPrimitiveState
		fun allocate(allocator: MemoryAllocator): WGPUPrimitiveState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUPrimitiveState) -> Unit): ArrayHolder<WGPUPrimitiveState>
	}
}

expect interface WGPUQuerySetDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var type: WGPUQueryType
	var count: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUQuerySetDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUQuerySetDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUQuerySetDescriptor) -> Unit): ArrayHolder<WGPUQuerySetDescriptor>
	}
}

expect interface WGPURenderBundleDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderBundleDescriptor
		fun allocate(allocator: MemoryAllocator): WGPURenderBundleDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderBundleDescriptor) -> Unit): ArrayHolder<WGPURenderBundleDescriptor>
	}
}

expect interface WGPURenderBundleEncoderDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var colorFormatCount: ULong
	var colorFormats: ArrayHolder<WGPUTextureFormat>?
	var depthStencilFormat: WGPUTextureFormat
	var sampleCount: UInt
	var depthReadOnly: Boolean
	var stencilReadOnly: Boolean
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderBundleEncoderDescriptor
		fun allocate(allocator: MemoryAllocator): WGPURenderBundleEncoderDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderBundleEncoderDescriptor) -> Unit): ArrayHolder<WGPURenderBundleEncoderDescriptor>
	}
}

expect interface WGPURenderPassColorAttachment {
	var nextInChain: NativeAddress?
	var view: WGPUTextureView?
	var depthSlice: UInt
	var resolveTarget: WGPUTextureView?
	var loadOp: WGPULoadOp
	var storeOp: WGPUStoreOp
	val clearValue: WGPUColor
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderPassColorAttachment
		fun allocate(allocator: MemoryAllocator): WGPURenderPassColorAttachment
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderPassColorAttachment) -> Unit): ArrayHolder<WGPURenderPassColorAttachment>
	}
}

expect interface WGPURenderPassDepthStencilAttachment {
	var view: WGPUTextureView?
	var depthLoadOp: WGPULoadOp
	var depthStoreOp: WGPUStoreOp
	var depthClearValue: Float
	var depthReadOnly: Boolean
	var stencilLoadOp: WGPULoadOp
	var stencilStoreOp: WGPUStoreOp
	var stencilClearValue: UInt
	var stencilReadOnly: Boolean
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderPassDepthStencilAttachment
		fun allocate(allocator: MemoryAllocator): WGPURenderPassDepthStencilAttachment
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderPassDepthStencilAttachment) -> Unit): ArrayHolder<WGPURenderPassDepthStencilAttachment>
	}
}

expect interface WGPURenderPassDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var colorAttachmentCount: ULong
	var colorAttachments: ArrayHolder<WGPURenderPassColorAttachment>?
	var depthStencilAttachment: WGPURenderPassDepthStencilAttachment?
	var occlusionQuerySet: WGPUQuerySet?
	var timestampWrites: WGPURenderPassTimestampWrites?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderPassDescriptor
		fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderPassDescriptor) -> Unit): ArrayHolder<WGPURenderPassDescriptor>
	}
}

expect interface WGPUChainedStruct {
	var next: WGPUChainedStruct?
	var sType: WGPUSType
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUChainedStruct
		fun allocate(allocator: MemoryAllocator): WGPUChainedStruct
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUChainedStruct) -> Unit): ArrayHolder<WGPUChainedStruct>
	}
}

expect interface WGPURenderPassMaxDrawCount {
	val chain: WGPUChainedStruct
	var maxDrawCount: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderPassMaxDrawCount
		fun allocate(allocator: MemoryAllocator): WGPURenderPassMaxDrawCount
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderPassMaxDrawCount) -> Unit): ArrayHolder<WGPURenderPassMaxDrawCount>
	}
}

expect interface WGPURenderPassTimestampWrites {
	var querySet: WGPUQuerySet?
	var beginningOfPassWriteIndex: UInt
	var endOfPassWriteIndex: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderPassTimestampWrites
		fun allocate(allocator: MemoryAllocator): WGPURenderPassTimestampWrites
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderPassTimestampWrites) -> Unit): ArrayHolder<WGPURenderPassTimestampWrites>
	}
}

expect interface WGPUVertexState {
	var nextInChain: NativeAddress?
	var module: WGPUShaderModule?
	val entryPoint: WGPUStringView
	var constantCount: ULong
	var constants: ArrayHolder<WGPUConstantEntry>?
	var bufferCount: ULong
	var buffers: ArrayHolder<WGPUVertexBufferLayout>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUVertexState
		fun allocate(allocator: MemoryAllocator): WGPUVertexState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUVertexState) -> Unit): ArrayHolder<WGPUVertexState>
	}
}

expect interface WGPURenderPipelineDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var layout: WGPUPipelineLayout?
	val vertex: WGPUVertexState
	val primitive: WGPUPrimitiveState
	var depthStencil: WGPUDepthStencilState?
	val multisample: WGPUMultisampleState
	var fragment: WGPUFragmentState?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderPipelineDescriptor
		fun allocate(allocator: MemoryAllocator): WGPURenderPipelineDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderPipelineDescriptor) -> Unit): ArrayHolder<WGPURenderPipelineDescriptor>
	}
}

expect interface WGPURequestAdapterOptions {
	var nextInChain: NativeAddress?
	/**
	 * "Feature level" for the adapter request. If an adapter is returned, it must support the features and limits in the requested feature level.
	 * 
	 * Implementations may ignore @ref WGPUFeatureLevel_Compatibility and provide @ref WGPUFeatureLevel_Core instead. @ref WGPUFeatureLevel_Core is the default in the JS API, but in C, this field is **required** (must not be undefined).
	 */
	var featureLevel: WGPUFeatureLevel
	var powerPreference: WGPUPowerPreference
	/**
	 * If true, requires the adapter to be a "fallback" adapter as defined by the JS spec.
	 * If this is not possible, the request returns null.
	 */
	var forceFallbackAdapter: Boolean
	/**
	 * If set, requires the adapter to have a particular backend type.
	 * If this is not possible, the request returns null.
	 */
	var backendType: WGPUBackendType
	/**
	 * If set, requires the adapter to be able to output to a particular surface.
	 * If this is not possible, the request returns null.
	 */
	var compatibleSurface: WGPUSurface?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURequestAdapterOptions
		fun allocate(allocator: MemoryAllocator): WGPURequestAdapterOptions
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURequestAdapterOptions) -> Unit): ArrayHolder<WGPURequestAdapterOptions>
	}
}

expect interface WGPUSamplerDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var addressModeU: WGPUAddressMode
	var addressModeV: WGPUAddressMode
	var addressModeW: WGPUAddressMode
	var magFilter: WGPUFilterMode
	var minFilter: WGPUFilterMode
	var mipmapFilter: WGPUMipmapFilterMode
	var lodMinClamp: Float
	var lodMaxClamp: Float
	var compare: WGPUCompareFunction
	var maxAnisotropy: UShort
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSamplerDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUSamplerDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSamplerDescriptor) -> Unit): ArrayHolder<WGPUSamplerDescriptor>
	}
}

expect interface WGPUShaderModuleDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUShaderModuleDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUShaderModuleDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUShaderModuleDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleDescriptor>
	}
}

expect interface WGPUShaderSourceSPIRV {
	val chain: WGPUChainedStruct
	var codeSize: UInt
	var code: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUShaderSourceSPIRV
		fun allocate(allocator: MemoryAllocator): WGPUShaderSourceSPIRV
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUShaderSourceSPIRV) -> Unit): ArrayHolder<WGPUShaderSourceSPIRV>
	}
}

expect interface WGPUShaderSourceWGSL {
	val chain: WGPUChainedStruct
	val code: WGPUStringView
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUShaderSourceWGSL
		fun allocate(allocator: MemoryAllocator): WGPUShaderSourceWGSL
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUShaderSourceWGSL) -> Unit): ArrayHolder<WGPUShaderSourceWGSL>
	}
}

expect interface WGPUSupportedFeatures {
	var featureCount: ULong
	var features: ArrayHolder<WGPUFeatureName>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSupportedFeatures
		fun allocate(allocator: MemoryAllocator): WGPUSupportedFeatures
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSupportedFeatures) -> Unit): ArrayHolder<WGPUSupportedFeatures>
	}
}

expect interface WGPUSupportedWGSLLanguageFeatures {
	var featureCount: ULong
	var features: ArrayHolder<WGPUWGSLLanguageFeatureName>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSupportedWGSLLanguageFeatures
		fun allocate(allocator: MemoryAllocator): WGPUSupportedWGSLLanguageFeatures
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSupportedWGSLLanguageFeatures) -> Unit): ArrayHolder<WGPUSupportedWGSLLanguageFeatures>
	}
}

/**
 * Filled by [wgpuSurfaceGetCapabilities] with what's supported for [wgpuSurfaceConfigure] for a pair of @ref WGPUSurface and @ref WGPUAdapter.
 */
expect interface WGPUSurfaceCapabilities {
	var nextInChain: NativeAddress?
	/**
	 * The bit set of supported @ref WGPUTextureUsage bits.
	 * Guaranteed to contain @ref WGPUTextureUsage_RenderAttachment.
	 */
	var usages: ULong
	var formatCount: ULong
	/**
	 * A list of supported @ref WGPUTextureFormat values, in order of preference.
	 */
	var formats: ArrayHolder<WGPUTextureFormat>?
	var presentModeCount: ULong
	/**
	 * A list of supported @ref WGPUPresentMode values.
	 * Guaranteed to contain @ref WGPUPresentMode_Fifo.
	 */
	var presentModes: ArrayHolder<WGPUPresentMode>?
	var alphaModeCount: ULong
	/**
	 * A list of supported @ref WGPUCompositeAlphaMode values.
	 * @ref WGPUCompositeAlphaMode_Auto will be an alias for the first element and will never be present in this array.
	 */
	var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceCapabilities
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceCapabilities
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceCapabilities) -> Unit): ArrayHolder<WGPUSurfaceCapabilities>
	}
}

/**
 * Options to [wgpuSurfaceConfigure] for defining how a @ref WGPUSurface will be rendered to and presented to the user.
 * See @ref Surface-Configuration for more details.
 */
expect interface WGPUSurfaceConfiguration {
	var nextInChain: NativeAddress?
	/**
	 * The @ref WGPUDevice to use to render to surface's textures.
	 */
	var device: WGPUDevice?
	/**
	 * The @ref WGPUTextureFormat of the surface's textures.
	 */
	var format: WGPUTextureFormat
	/**
	 * The @ref WGPUTextureUsage of the surface's textures.
	 */
	var usage: ULong
	/**
	 * The width of the surface's textures.
	 */
	var width: UInt
	/**
	 * The height of the surface's textures.
	 */
	var height: UInt
	var viewFormatCount: ULong
	/**
	 * The additional @ref WGPUTextureFormat for @ref WGPUTextureView format reinterpretation of the surface's textures.
	 */
	var viewFormats: ArrayHolder<WGPUTextureFormat>?
	/**
	 * How the surface's frames will be composited on the screen.
	 */
	var alphaMode: WGPUCompositeAlphaMode
	/**
	 * When and in which order the surface's frames will be shown on the screen. Defaults to @ref WGPUPresentMode_Fifo.
	 */
	var presentMode: WGPUPresentMode
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceConfiguration
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceConfiguration
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceConfiguration) -> Unit): ArrayHolder<WGPUSurfaceConfiguration>
	}
}

/**
 * The root descriptor for the creation of an @ref WGPUSurface with [wgpuInstanceCreateSurface].
 * It isn't sufficient by itself and must have one of the [WGPUSurfaceSource*] in its chain.
 * See @ref Surface-Creation for more details.
 */
expect interface WGPUSurfaceDescriptor {
	var nextInChain: NativeAddress?
	/**
	 * Label used to refer to the object.
	 */
	val label: WGPUStringView
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceDescriptor) -> Unit): ArrayHolder<WGPUSurfaceDescriptor>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping an Android [[ANativeWindow]](https://developer.android.com/ndk/reference/group/a-native-window).
 */
expect interface WGPUSurfaceSourceAndroidNativeWindow {
	val chain: WGPUChainedStruct
	/**
	 * The pointer to the [[ANativeWindow]](https://developer.android.com/ndk/reference/group/a-native-window) that will be wrapped by the @ref WGPUSurface.
	 */
	var window: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceSourceAndroidNativeWindow
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceAndroidNativeWindow
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceSourceAndroidNativeWindow) -> Unit): ArrayHolder<WGPUSurfaceSourceAndroidNativeWindow>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping a [[CAMetalLayer]](https://developer.apple.com/documentation/quartzcore/cametallayer?language=objc).
 */
expect interface WGPUSurfaceSourceMetalLayer {
	val chain: WGPUChainedStruct
	/**
	 * The pointer to the [[CAMetalLayer]](https://developer.apple.com/documentation/quartzcore/cametallayer?language=objc) that will be wrapped by the @ref WGPUSurface.
	 */
	var layer: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceSourceMetalLayer
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceMetalLayer
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceSourceMetalLayer) -> Unit): ArrayHolder<WGPUSurfaceSourceMetalLayer>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping a [Wayland](https://wayland.freedesktop.org/) [[wl_surface]](https://wayland.freedesktop.org/docs/html/apa.html#protocol-spec-wl_surface).
 */
expect interface WGPUSurfaceSourceWaylandSurface {
	val chain: WGPUChainedStruct
	/**
	 * A [[wl_display]](https://wayland.freedesktop.org/docs/html/apa.html#protocol-spec-wl_display) for this Wayland instance.
	 */
	var display: NativeAddress?
	/**
	 * A [[wl_surface]](https://wayland.freedesktop.org/docs/html/apa.html#protocol-spec-wl_surface) that will be wrapped by the @ref WGPUSurface
	 */
	var surface: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWaylandSurface
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWaylandSurface
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceSourceWaylandSurface) -> Unit): ArrayHolder<WGPUSurfaceSourceWaylandSurface>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping a Windows [[HWND]](https://learn.microsoft.com/en-us/windows/apps/develop/ui-input/retrieve-hwnd).
 */
expect interface WGPUSurfaceSourceWindowsHWND {
	val chain: WGPUChainedStruct
	/**
	 * The [[HINSTANCE]](https://learn.microsoft.com/en-us/windows/win32/learnwin32/winmain--the-application-entry-point) for this application.
	 * Most commonly [GetModuleHandle(nullptr)].
	 */
	var hinstance: NativeAddress?
	/**
	 * The [[HWND]](https://learn.microsoft.com/en-us/windows/apps/develop/ui-input/retrieve-hwnd) that will be wrapped by the @ref WGPUSurface.
	 */
	var hwnd: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceSourceWindowsHWND
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceWindowsHWND
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceSourceWindowsHWND) -> Unit): ArrayHolder<WGPUSurfaceSourceWindowsHWND>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping an [XCB](https://xcb.freedesktop.org/) [xcb_window_t].
 */
expect interface WGPUSurfaceSourceXCBWindow {
	val chain: WGPUChainedStruct
	/**
	 * The [xcb_connection_t] for the connection to the X server.
	 */
	var connection: NativeAddress?
	/**
	 * The [xcb_window_t] for the window that will be wrapped by the @ref WGPUSurface.
	 */
	var window: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXCBWindow
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXCBWindow
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceSourceXCBWindow) -> Unit): ArrayHolder<WGPUSurfaceSourceXCBWindow>
	}
}

/**
 * Chained in @ref WGPUSurfaceDescriptor to make an @ref WGPUSurface wrapping an [Xlib](https://www.x.org/releases/current/doc/libX11/libX11/libX11.html) [Window].
 */
expect interface WGPUSurfaceSourceXlibWindow {
	val chain: WGPUChainedStruct
	/**
	 * A pointer to the [[Display]](https://www.x.org/releases/current/doc/libX11/libX11/libX11.html#Opening_the_Display) connected to the X server.
	 */
	var display: NativeAddress?
	/**
	 * The [[Window]](https://www.x.org/releases/current/doc/libX11/libX11/libX11.html#Creating_Windows) that will be wrapped by the @ref WGPUSurface.
	 */
	var window: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceSourceXlibWindow
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceSourceXlibWindow
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceSourceXlibWindow) -> Unit): ArrayHolder<WGPUSurfaceSourceXlibWindow>
	}
}

/**
 * Queried each frame from a @ref WGPUSurface to get a @ref WGPUTexture to render to along with some metadata.
 * See @ref Surface-Presenting for more details.
 */
expect interface WGPUSurfaceTexture {
	var nextInChain: NativeAddress?
	/**
	 * The @ref WGPUTexture representing the frame that will be shown on the surface.
	 * It is @ref ReturnedWithOwnership from @ref wgpuSurfaceGetCurrentTexture.
	 */
	var texture: WGPUTexture?
	/**
	 * Whether the call to [wgpuSurfaceGetCurrentTexture] succeeded and a hint as to why it might not have.
	 */
	var status: WGPUSurfaceGetCurrentTextureStatus
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceTexture
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceTexture
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceTexture) -> Unit): ArrayHolder<WGPUSurfaceTexture>
	}
}

expect interface WGPUTexelCopyBufferLayout {
	var offset: ULong
	var bytesPerRow: UInt
	var rowsPerImage: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferLayout
		fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferLayout
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUTexelCopyBufferLayout) -> Unit): ArrayHolder<WGPUTexelCopyBufferLayout>
	}
}

expect interface WGPUTexelCopyBufferInfo {
	val layout: WGPUTexelCopyBufferLayout
	var buffer: WGPUBuffer?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUTexelCopyBufferInfo
		fun allocate(allocator: MemoryAllocator): WGPUTexelCopyBufferInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUTexelCopyBufferInfo) -> Unit): ArrayHolder<WGPUTexelCopyBufferInfo>
	}
}

expect interface WGPUTexelCopyTextureInfo {
	var texture: WGPUTexture?
	var mipLevel: UInt
	val origin: WGPUOrigin3D
	var aspect: WGPUTextureAspect
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUTexelCopyTextureInfo
		fun allocate(allocator: MemoryAllocator): WGPUTexelCopyTextureInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUTexelCopyTextureInfo) -> Unit): ArrayHolder<WGPUTexelCopyTextureInfo>
	}
}

expect interface WGPUTextureDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var usage: ULong
	var dimension: WGPUTextureDimension
	val size: WGPUExtent3D
	var format: WGPUTextureFormat
	var mipLevelCount: UInt
	var sampleCount: UInt
	var viewFormatCount: ULong
	var viewFormats: ArrayHolder<WGPUTextureFormat>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUTextureDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUTextureDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUTextureDescriptor) -> Unit): ArrayHolder<WGPUTextureDescriptor>
	}
}

expect interface WGPUTextureViewDescriptor {
	var nextInChain: NativeAddress?
	val label: WGPUStringView
	var format: WGPUTextureFormat
	var dimension: WGPUTextureViewDimension
	var baseMipLevel: UInt
	var mipLevelCount: UInt
	var baseArrayLayer: UInt
	var arrayLayerCount: UInt
	var aspect: WGPUTextureAspect
	var usage: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUTextureViewDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUTextureViewDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUTextureViewDescriptor) -> Unit): ArrayHolder<WGPUTextureViewDescriptor>
	}
}

expect interface WGPUVertexAttribute {
	var format: WGPUVertexFormat
	var offset: ULong
	var shaderLocation: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUVertexAttribute
		fun allocate(allocator: MemoryAllocator): WGPUVertexAttribute
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUVertexAttribute) -> Unit): ArrayHolder<WGPUVertexAttribute>
	}
}

expect interface WGPUVertexBufferLayout {
	/**
	 * The step mode for the vertex buffer. If @ref WGPUVertexStepMode_VertexBufferNotUsed,
	 * indicates a "hole" in the parent @ref WGPUVertexState [buffers] array:
	 * the pipeline does not use a vertex buffer at this [location].
	 */
	var stepMode: WGPUVertexStepMode
	var arrayStride: ULong
	var attributeCount: ULong
	var attributes: ArrayHolder<WGPUVertexAttribute>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUVertexBufferLayout
		fun allocate(allocator: MemoryAllocator): WGPUVertexBufferLayout
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUVertexBufferLayout) -> Unit): ArrayHolder<WGPUVertexBufferLayout>
	}
}

expect interface WGPUInstanceExtras {
	val chain: WGPUChainedStruct
	var backends: ULong
	var flags: ULong
	var dx12ShaderCompiler: WGPUDx12Compiler
	var gles3MinorVersion: WGPUGles3MinorVersion
	val dxilPath: WGPUStringView
	val dxcPath: WGPUStringView
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUInstanceExtras
		fun allocate(allocator: MemoryAllocator): WGPUInstanceExtras
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUInstanceExtras) -> Unit): ArrayHolder<WGPUInstanceExtras>
	}
}

expect interface WGPUChainedStructOut {
	var next: WGPUChainedStructOut?
	var sType: WGPUSType
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUChainedStructOut
		fun allocate(allocator: MemoryAllocator): WGPUChainedStructOut
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUChainedStructOut) -> Unit): ArrayHolder<WGPUChainedStructOut>
	}
}

expect interface WGPUBufferMapCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var mode: WGPUCallbackMode
	var callback: CallbackHolder<WGPUBufferMapCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBufferMapCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPUBufferMapCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBufferMapCallbackInfo) -> Unit): ArrayHolder<WGPUBufferMapCallbackInfo>
	}
}

expect interface WGPUCompilationInfoCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var mode: WGPUCallbackMode
	var callback: CallbackHolder<WGPUCompilationInfoCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUCompilationInfoCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPUCompilationInfoCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUCompilationInfoCallbackInfo) -> Unit): ArrayHolder<WGPUCompilationInfoCallbackInfo>
	}
}

expect interface WGPUCreateComputePipelineAsyncCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var mode: WGPUCallbackMode
	var callback: CallbackHolder<WGPUCreateComputePipelineAsyncCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUCreateComputePipelineAsyncCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPUCreateComputePipelineAsyncCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUCreateComputePipelineAsyncCallbackInfo) -> Unit): ArrayHolder<WGPUCreateComputePipelineAsyncCallbackInfo>
	}
}

expect interface WGPUCreateRenderPipelineAsyncCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var mode: WGPUCallbackMode
	var callback: CallbackHolder<WGPUCreateRenderPipelineAsyncCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUCreateRenderPipelineAsyncCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPUCreateRenderPipelineAsyncCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUCreateRenderPipelineAsyncCallbackInfo) -> Unit): ArrayHolder<WGPUCreateRenderPipelineAsyncCallbackInfo>
	}
}

expect interface WGPUPopErrorScopeCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var mode: WGPUCallbackMode
	var callback: CallbackHolder<WGPUPopErrorScopeCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUPopErrorScopeCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPUPopErrorScopeCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUPopErrorScopeCallbackInfo) -> Unit): ArrayHolder<WGPUPopErrorScopeCallbackInfo>
	}
}

expect interface WGPUQueueWorkDoneCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var mode: WGPUCallbackMode
	var callback: CallbackHolder<WGPUQueueWorkDoneCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUQueueWorkDoneCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPUQueueWorkDoneCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUQueueWorkDoneCallbackInfo) -> Unit): ArrayHolder<WGPUQueueWorkDoneCallbackInfo>
	}
}

expect interface WGPURequestAdapterCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var mode: WGPUCallbackMode
	var callback: CallbackHolder<WGPURequestAdapterCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURequestAdapterCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPURequestAdapterCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURequestAdapterCallbackInfo) -> Unit): ArrayHolder<WGPURequestAdapterCallbackInfo>
	}
}

expect interface WGPURequestDeviceCallbackInfo {
	var nextInChain: WGPUChainedStruct?
	var mode: WGPUCallbackMode
	var callback: CallbackHolder<WGPURequestDeviceCallback>?
	var userdata1: NativeAddress?
	var userdata2: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURequestDeviceCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPURequestDeviceCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURequestDeviceCallbackInfo) -> Unit): ArrayHolder<WGPURequestDeviceCallbackInfo>
	}
}

