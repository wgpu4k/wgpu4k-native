// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.NativeAddress
import ffi.CallbackHolder
import ffi.CString
import ffi.ArrayHolder
import ffi.MemoryAllocator

expect interface WGPURequestAdapterOptions {
	var nextInChain: NativeAddress?
	var compatibleSurface: WGPUSurface?
	var powerPreference: WGPUPowerPreference
	var backendType: WGPUBackendType
	var forceFallbackAdapter: Boolean
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURequestAdapterOptions
		fun allocate(allocator: MemoryAllocator): WGPURequestAdapterOptions
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURequestAdapterOptions) -> Unit): ArrayHolder<WGPURequestAdapterOptions>
	}
}

expect interface WGPUAdapterInfo {
	var nextInChain: NativeAddress?
	var vendor: CString?
	var architecture: CString?
	var device: CString?
	var description: CString?
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

expect interface WGPUQueueDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUQueueDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUQueueDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUQueueDescriptor) -> Unit): ArrayHolder<WGPUQueueDescriptor>
	}
}

expect interface WGPUUncapturedErrorCallbackInfo {
	var nextInChain: NativeAddress?
	var callback: CallbackHolder<WGPUErrorCallback>?
	var userdata: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUUncapturedErrorCallbackInfo
		fun allocate(allocator: MemoryAllocator): WGPUUncapturedErrorCallbackInfo
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUUncapturedErrorCallbackInfo) -> Unit): ArrayHolder<WGPUUncapturedErrorCallbackInfo>
	}
}

expect interface WGPUDeviceDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
	var requiredFeatureCount: ULong
	var requiredFeatures: ArrayHolder<WGPUFeatureName>?
	var requiredLimits: WGPURequiredLimits?
	val defaultQueue: WGPUQueueDescriptor
	var deviceLostCallback: CallbackHolder<WGPUDeviceLostCallback>?
	var deviceLostUserdata: NativeAddress?
	val uncapturedErrorCallbackInfo: WGPUUncapturedErrorCallbackInfo
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUDeviceDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUDeviceDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUDeviceDescriptor) -> Unit): ArrayHolder<WGPUDeviceDescriptor>
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

expect interface WGPUBindGroupDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
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

expect interface WGPUSurfaceCapabilities {
	var nextInChain: NativeAddress?
	var usages: UInt
	var formatCount: ULong
	var formats: ArrayHolder<WGPUTextureFormat>?
	var presentModeCount: ULong
	var presentModes: ArrayHolder<WGPUPresentMode>?
	var alphaModeCount: ULong
	var alphaModes: ArrayHolder<WGPUCompositeAlphaMode>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceCapabilities
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceCapabilities
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceCapabilities) -> Unit): ArrayHolder<WGPUSurfaceCapabilities>
	}
}

expect interface WGPUSurfaceConfiguration {
	var nextInChain: NativeAddress?
	var device: WGPUDevice?
	var format: WGPUTextureFormat
	var usage: UInt
	var viewFormatCount: ULong
	var viewFormats: ArrayHolder<WGPUTextureFormat>?
	var alphaMode: WGPUCompositeAlphaMode
	var width: UInt
	var height: UInt
	var presentMode: WGPUPresentMode
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceConfiguration
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceConfiguration
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceConfiguration) -> Unit): ArrayHolder<WGPUSurfaceConfiguration>
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
	var visibility: UInt
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

expect interface WGPUBindGroupLayoutDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
	var entryCount: ULong
	var entries: ArrayHolder<WGPUBindGroupLayoutEntry>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUBindGroupLayoutDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUBindGroupLayoutDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUBindGroupLayoutDescriptor) -> Unit): ArrayHolder<WGPUBindGroupLayoutDescriptor>
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

expect interface WGPUBufferDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
	var usage: UInt
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

expect interface WGPUConstantEntry {
	var nextInChain: NativeAddress?
	var key: CString?
	var value: Double
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUConstantEntry
		fun allocate(allocator: MemoryAllocator): WGPUConstantEntry
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUConstantEntry) -> Unit): ArrayHolder<WGPUConstantEntry>
	}
}

expect interface WGPUCommandBufferDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUCommandBufferDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUCommandBufferDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUCommandBufferDescriptor) -> Unit): ArrayHolder<WGPUCommandBufferDescriptor>
	}
}

expect interface WGPUCommandEncoderDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
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
	var message: CString?
	var type: WGPUCompilationMessageType
	var lineNum: ULong
	var linePos: ULong
	var offset: ULong
	var length: ULong
	var utf16LinePos: ULong
	var utf16Offset: ULong
	var utf16Length: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUCompilationMessage
		fun allocate(allocator: MemoryAllocator): WGPUCompilationMessage
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUCompilationMessage) -> Unit): ArrayHolder<WGPUCompilationMessage>
	}
}

expect interface WGPUComputePassDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
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
	var entryPoint: CString?
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
	var label: CString?
	var layout: WGPUPipelineLayout?
	val compute: WGPUProgrammableStageDescriptor
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUComputePipelineDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUComputePipelineDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUComputePipelineDescriptor) -> Unit): ArrayHolder<WGPUComputePipelineDescriptor>
	}
}

expect interface WGPULimits {
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
	var maxInterStageShaderComponents: UInt
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

expect interface WGPURequiredLimits {
	var nextInChain: NativeAddress?
	val limits: WGPULimits
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURequiredLimits
		fun allocate(allocator: MemoryAllocator): WGPURequiredLimits
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURequiredLimits) -> Unit): ArrayHolder<WGPURequiredLimits>
	}
}

expect interface WGPUSupportedLimits {
	var nextInChain: NativeAddress?
	val limits: WGPULimits
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSupportedLimits
		fun allocate(allocator: MemoryAllocator): WGPUSupportedLimits
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSupportedLimits) -> Unit): ArrayHolder<WGPUSupportedLimits>
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

expect interface WGPUTextureDataLayout {
	var nextInChain: NativeAddress?
	var offset: ULong
	var bytesPerRow: UInt
	var rowsPerImage: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUTextureDataLayout
		fun allocate(allocator: MemoryAllocator): WGPUTextureDataLayout
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUTextureDataLayout) -> Unit): ArrayHolder<WGPUTextureDataLayout>
	}
}

expect interface WGPUImageCopyBuffer {
	var nextInChain: NativeAddress?
	val layout: WGPUTextureDataLayout
	var buffer: WGPUBuffer?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUImageCopyBuffer
		fun allocate(allocator: MemoryAllocator): WGPUImageCopyBuffer
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUImageCopyBuffer) -> Unit): ArrayHolder<WGPUImageCopyBuffer>
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

expect interface WGPUImageCopyTexture {
	var nextInChain: NativeAddress?
	var texture: WGPUTexture?
	var mipLevel: UInt
	val origin: WGPUOrigin3D
	var aspect: WGPUTextureAspect
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUImageCopyTexture
		fun allocate(allocator: MemoryAllocator): WGPUImageCopyTexture
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUImageCopyTexture) -> Unit): ArrayHolder<WGPUImageCopyTexture>
	}
}

expect interface WGPUInstanceDescriptor {
	var nextInChain: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUInstanceDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUInstanceDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUInstanceDescriptor) -> Unit): ArrayHolder<WGPUInstanceDescriptor>
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
	var arrayStride: ULong
	var stepMode: WGPUVertexStepMode
	var attributeCount: ULong
	var attributes: ArrayHolder<WGPUVertexAttribute>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUVertexBufferLayout
		fun allocate(allocator: MemoryAllocator): WGPUVertexBufferLayout
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUVertexBufferLayout) -> Unit): ArrayHolder<WGPUVertexBufferLayout>
	}
}

expect interface WGPUPipelineLayoutDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
	var bindGroupLayoutCount: ULong
	var bindGroupLayouts: ArrayHolder<WGPUBindGroupLayout>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUPipelineLayoutDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUPipelineLayoutDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUPipelineLayoutDescriptor) -> Unit): ArrayHolder<WGPUPipelineLayoutDescriptor>
	}
}

expect interface WGPUQuerySetDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
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
	var label: CString?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderBundleDescriptor
		fun allocate(allocator: MemoryAllocator): WGPURenderBundleDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderBundleDescriptor) -> Unit): ArrayHolder<WGPURenderBundleDescriptor>
	}
}

expect interface WGPURenderBundleEncoderDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
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
	var label: CString?
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

expect interface WGPURenderPassDescriptorMaxDrawCount {
	val chain: WGPUChainedStruct
	var maxDrawCount: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPURenderPassDescriptorMaxDrawCount
		fun allocate(allocator: MemoryAllocator): WGPURenderPassDescriptorMaxDrawCount
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPURenderPassDescriptorMaxDrawCount) -> Unit): ArrayHolder<WGPURenderPassDescriptorMaxDrawCount>
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
	var entryPoint: CString?
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

expect interface WGPUPrimitiveState {
	var nextInChain: NativeAddress?
	var topology: WGPUPrimitiveTopology
	var stripIndexFormat: WGPUIndexFormat
	var frontFace: WGPUFrontFace
	var cullMode: WGPUCullMode
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUPrimitiveState
		fun allocate(allocator: MemoryAllocator): WGPUPrimitiveState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUPrimitiveState) -> Unit): ArrayHolder<WGPUPrimitiveState>
	}
}

expect interface WGPUPrimitiveDepthClipControl {
	val chain: WGPUChainedStruct
	var unclippedDepth: Boolean
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUPrimitiveDepthClipControl
		fun allocate(allocator: MemoryAllocator): WGPUPrimitiveDepthClipControl
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUPrimitiveDepthClipControl) -> Unit): ArrayHolder<WGPUPrimitiveDepthClipControl>
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
	var depthWriteEnabled: Boolean
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

expect interface WGPUFragmentState {
	var nextInChain: NativeAddress?
	var module: WGPUShaderModule?
	var entryPoint: CString?
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

expect interface WGPUColorTargetState {
	var nextInChain: NativeAddress?
	var format: WGPUTextureFormat
	var blend: WGPUBlendState?
	var writeMask: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUColorTargetState
		fun allocate(allocator: MemoryAllocator): WGPUColorTargetState
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUColorTargetState) -> Unit): ArrayHolder<WGPUColorTargetState>
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

expect interface WGPURenderPipelineDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
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

expect interface WGPUSamplerDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
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
	var label: CString?
	var hintCount: ULong
	var hints: ArrayHolder<WGPUShaderModuleCompilationHint>?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUShaderModuleDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUShaderModuleDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUShaderModuleDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleDescriptor>
	}
}

expect interface WGPUShaderModuleCompilationHint {
	var nextInChain: NativeAddress?
	var entryPoint: CString?
	var layout: WGPUPipelineLayout?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUShaderModuleCompilationHint
		fun allocate(allocator: MemoryAllocator): WGPUShaderModuleCompilationHint
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUShaderModuleCompilationHint) -> Unit): ArrayHolder<WGPUShaderModuleCompilationHint>
	}
}

expect interface WGPUShaderModuleSPIRVDescriptor {
	val chain: WGPUChainedStruct
	var codeSize: UInt
	var code: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUShaderModuleSPIRVDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUShaderModuleSPIRVDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUShaderModuleSPIRVDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleSPIRVDescriptor>
	}
}

expect interface WGPUShaderModuleWGSLDescriptor {
	val chain: WGPUChainedStruct
	var code: CString?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUShaderModuleWGSLDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUShaderModuleWGSLDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUShaderModuleWGSLDescriptor) -> Unit): ArrayHolder<WGPUShaderModuleWGSLDescriptor>
	}
}

expect interface WGPUSurfaceDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceDescriptor) -> Unit): ArrayHolder<WGPUSurfaceDescriptor>
	}
}

expect interface WGPUSurfaceDescriptorFromAndroidNativeWindow {
	val chain: WGPUChainedStruct
	var window: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromAndroidNativeWindow
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromAndroidNativeWindow
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceDescriptorFromAndroidNativeWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromAndroidNativeWindow>
	}
}

expect interface WGPUSurfaceDescriptorFromCanvasHTMLSelector {
	val chain: WGPUChainedStruct
	var selector: CString?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromCanvasHTMLSelector
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromCanvasHTMLSelector
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceDescriptorFromCanvasHTMLSelector) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromCanvasHTMLSelector>
	}
}

expect interface WGPUSurfaceDescriptorFromMetalLayer {
	val chain: WGPUChainedStruct
	var layer: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromMetalLayer
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromMetalLayer
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceDescriptorFromMetalLayer) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromMetalLayer>
	}
}

expect interface WGPUSurfaceDescriptorFromWindowsHWND {
	val chain: WGPUChainedStruct
	var hinstance: NativeAddress?
	var hwnd: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromWindowsHWND
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromWindowsHWND
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceDescriptorFromWindowsHWND) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromWindowsHWND>
	}
}

expect interface WGPUSurfaceDescriptorFromXcbWindow {
	val chain: WGPUChainedStruct
	var connection: NativeAddress?
	var window: UInt
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromXcbWindow
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromXcbWindow
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceDescriptorFromXcbWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromXcbWindow>
	}
}

expect interface WGPUSurfaceDescriptorFromXlibWindow {
	val chain: WGPUChainedStruct
	var display: NativeAddress?
	var window: ULong
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromXlibWindow
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromXlibWindow
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceDescriptorFromXlibWindow) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromXlibWindow>
	}
}

expect interface WGPUSurfaceDescriptorFromWaylandSurface {
	val chain: WGPUChainedStruct
	var display: NativeAddress?
	var surface: NativeAddress?
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceDescriptorFromWaylandSurface
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceDescriptorFromWaylandSurface
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceDescriptorFromWaylandSurface) -> Unit): ArrayHolder<WGPUSurfaceDescriptorFromWaylandSurface>
	}
}

expect interface WGPUSurfaceTexture {
	var texture: WGPUTexture?
	var suboptimal: Boolean
	var status: WGPUSurfaceGetCurrentTextureStatus
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUSurfaceTexture
		fun allocate(allocator: MemoryAllocator): WGPUSurfaceTexture
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUSurfaceTexture) -> Unit): ArrayHolder<WGPUSurfaceTexture>
	}
}

expect interface WGPUTextureDescriptor {
	var nextInChain: NativeAddress?
	var label: CString?
	var usage: UInt
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
	var label: CString?
	var format: WGPUTextureFormat
	var dimension: WGPUTextureViewDimension
	var baseMipLevel: UInt
	var mipLevelCount: UInt
	var baseArrayLayer: UInt
	var arrayLayerCount: UInt
	var aspect: WGPUTextureAspect
	val handler: NativeAddress
	companion object {
		operator fun invoke(address: NativeAddress): WGPUTextureViewDescriptor
		fun allocate(allocator: MemoryAllocator): WGPUTextureViewDescriptor
		fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt, WGPUTextureViewDescriptor) -> Unit): ArrayHolder<WGPUTextureViewDescriptor>
	}
}

expect interface WGPUInstanceExtras {
	val chain: WGPUChainedStruct
	var backends: UInt
	var flags: UInt
	var dx12ShaderCompiler: WGPUDx12Compiler
	var gles3MinorVersion: WGPUGles3MinorVersion
	var dxilPath: CString?
	var dxcPath: CString?
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

