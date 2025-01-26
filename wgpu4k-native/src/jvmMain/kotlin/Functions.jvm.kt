// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.CString
import ffi.NativeAddress
import ffi.ArrayHolder
import ffi.CallbackHolder
import ffi.adapt


actual fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor?): WGPUInstance?
	 = Functions.wgpuCreateInstance(descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUInstance)

actual fun wgpuGetInstanceCapabilities(capabilities: WGPUInstanceCapabilities?): WGPUStatus
	 = Functions.wgpuGetInstanceCapabilities(capabilities?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDevicePoll(device: WGPUDevice?, wait: Boolean, wrappedSubmissionIndex: NativeAddress?): Boolean
	 = Functions.wgpuDevicePoll(device?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, wait.toUInt(), wrappedSubmissionIndex.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		.toBoolean()

actual fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuSetLogCallback(callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSetLogLevel(level: WGPULogLevel): Unit
	 = Functions.wgpuSetLogLevel(level)

actual fun wgpuAdapterRelease(handler: WGPUAdapter?): Unit
	 = Functions.wgpuAdapterRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPULimits?): WGPUStatus
	 = Functions.wgpuAdapterGetLimits(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, limits?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean
	 = Functions.wgpuAdapterHasFeature(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, feature)
		.toBoolean()

actual fun wgpuAdapterGetFeatures(handler: WGPUAdapter?, features: WGPUSupportedFeatures?): Unit
	 = Functions.wgpuAdapterGetFeatures(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, features?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): WGPUStatus
	 = Functions.wgpuAdapterGetInfo(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, info?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuAdapterRequestDevice(handler: WGPUAdapter?, descriptor: WGPUDeviceDescriptor?, callbackInfo: WGPURequestDeviceCallbackInfo): Unit
	 = Functions.wgpuAdapterRequestDevice(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBindGroupRelease(handler: WGPUBindGroup?): Unit
	 = Functions.wgpuBindGroupRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: WGPUStringView): Unit
	 = Functions.wgpuBindGroupSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?): Unit
	 = Functions.wgpuBindGroupLayoutRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: WGPUStringView): Unit
	 = Functions.wgpuBindGroupLayoutSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferRelease(handler: WGPUBuffer?): Unit
	 = Functions.wgpuBufferRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferMapAsync(handler: WGPUBuffer?, mode: ULong, offset: ULong, size: ULong, callbackInfo: WGPUBufferMapCallbackInfo): Unit
	 = Functions.wgpuBufferMapAsync(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, mode, offset, size, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferGetMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
	 = Functions.wgpuBufferGetMappedRange(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)
		?.let(::NativeAddress)

actual fun wgpuBufferGetConstMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
	 = Functions.wgpuBufferGetConstMappedRange(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)
		?.let(::NativeAddress)

actual fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: WGPUStringView): Unit
	 = Functions.wgpuBufferSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferGetUsage(handler: WGPUBuffer?): ULong
	 = Functions.wgpuBufferGetUsage(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferGetSize(handler: WGPUBuffer?): ULong
	 = Functions.wgpuBufferGetSize(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferGetMapState(handler: WGPUBuffer?): WGPUBufferMapState
	 = Functions.wgpuBufferGetMapState(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferUnmap(handler: WGPUBuffer?): Unit
	 = Functions.wgpuBufferUnmap(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferDestroy(handler: WGPUBuffer?): Unit
	 = Functions.wgpuBufferDestroy(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandBufferRelease(handler: WGPUCommandBuffer?): Unit
	 = Functions.wgpuCommandBufferRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: WGPUStringView): Unit
	 = Functions.wgpuCommandBufferSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderRelease(handler: WGPUCommandEncoder?): Unit
	 = Functions.wgpuCommandEncoderRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderFinish(handler: WGPUCommandEncoder?, descriptor: WGPUCommandBufferDescriptor?): WGPUCommandBuffer?
	 = Functions.wgpuCommandEncoderFinish(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUCommandBuffer)

actual fun wgpuCommandEncoderBeginComputePass(handler: WGPUCommandEncoder?, descriptor: WGPUComputePassDescriptor?): WGPUComputePassEncoder?
	 = Functions.wgpuCommandEncoderBeginComputePass(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUComputePassEncoder)

actual fun wgpuCommandEncoderBeginRenderPass(handler: WGPUCommandEncoder?, descriptor: WGPURenderPassDescriptor?): WGPURenderPassEncoder?
	 = Functions.wgpuCommandEncoderBeginRenderPass(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPURenderPassEncoder)

actual fun wgpuCommandEncoderCopyBufferToBuffer(handler: WGPUCommandEncoder?, source: WGPUBuffer?, sourceOffset: ULong, destination: WGPUBuffer?, destinationOffset: ULong, size: ULong): Unit
	 = Functions.wgpuCommandEncoderCopyBufferToBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, sourceOffset, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destinationOffset, size)

actual fun wgpuCommandEncoderCopyBufferToTexture(handler: WGPUCommandEncoder?, source: WGPUTexelCopyBufferInfo?, destination: WGPUTexelCopyTextureInfo?, copySize: WGPUExtent3D?): Unit
	 = Functions.wgpuCommandEncoderCopyBufferToTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, copySize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderCopyTextureToBuffer(handler: WGPUCommandEncoder?, source: WGPUTexelCopyTextureInfo?, destination: WGPUTexelCopyBufferInfo?, copySize: WGPUExtent3D?): Unit
	 = Functions.wgpuCommandEncoderCopyTextureToBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, copySize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderCopyTextureToTexture(handler: WGPUCommandEncoder?, source: WGPUTexelCopyTextureInfo?, destination: WGPUTexelCopyTextureInfo?, copySize: WGPUExtent3D?): Unit
	 = Functions.wgpuCommandEncoderCopyTextureToTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, copySize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderClearBuffer(handler: WGPUCommandEncoder?, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
	 = Functions.wgpuCommandEncoderClearBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)

actual fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: WGPUStringView): Unit
	 = Functions.wgpuCommandEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?): Unit
	 = Functions.wgpuCommandEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: WGPUStringView): Unit
	 = Functions.wgpuCommandEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderResolveQuerySet(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, firstQuery: UInt, queryCount: UInt, destination: WGPUBuffer?, destinationOffset: ULong): Unit
	 = Functions.wgpuCommandEncoderResolveQuerySet(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, querySet?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, firstQuery, queryCount, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destinationOffset)

actual fun wgpuCommandEncoderWriteTimestamp(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, queryIndex: UInt): Unit
	 = Functions.wgpuCommandEncoderWriteTimestamp(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, querySet?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, queryIndex)

actual fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: WGPUStringView): Unit
	 = Functions.wgpuCommandEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?): Unit
	 = Functions.wgpuComputePassEncoderRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: WGPUStringView): Unit
	 = Functions.wgpuComputePassEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?): Unit
	 = Functions.wgpuComputePassEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: WGPUStringView): Unit
	 = Functions.wgpuComputePassEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderSetPipeline(handler: WGPUComputePassEncoder?, pipeline: WGPUComputePipeline?): Unit
	 = Functions.wgpuComputePassEncoderSetPipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, pipeline?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderSetBindGroup(handler: WGPUComputePassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
	 = Functions.wgpuComputePassEncoderSetBindGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex, group?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, dynamicOffsetCount, dynamicOffsets?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderDispatchWorkgroups(handler: WGPUComputePassEncoder?, workgroupCountX: UInt, workgroupCountY: UInt, workgroupCountZ: UInt): Unit
	 = Functions.wgpuComputePassEncoderDispatchWorkgroups(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, workgroupCountX, workgroupCountY, workgroupCountZ)

actual fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler: WGPUComputePassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = Functions.wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)

actual fun wgpuComputePassEncoderEnd(handler: WGPUComputePassEncoder?): Unit
	 = Functions.wgpuComputePassEncoderEnd(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: WGPUStringView): Unit
	 = Functions.wgpuComputePassEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?): Unit
	 = Functions.wgpuComputePipelineRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout?
	 = Functions.wgpuComputePipelineGetBindGroupLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex)
		?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)

actual fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: WGPUStringView): Unit
	 = Functions.wgpuComputePipelineSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceRelease(handler: WGPUDevice?): Unit
	 = Functions.wgpuDeviceRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceCreateBindGroup(handler: WGPUDevice?, descriptor: WGPUBindGroupDescriptor?): WGPUBindGroup?
	 = Functions.wgpuDeviceCreateBindGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUBindGroup)

actual fun wgpuDeviceCreateBindGroupLayout(handler: WGPUDevice?, descriptor: WGPUBindGroupLayoutDescriptor?): WGPUBindGroupLayout?
	 = Functions.wgpuDeviceCreateBindGroupLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)

actual fun wgpuDeviceCreateBuffer(handler: WGPUDevice?, descriptor: WGPUBufferDescriptor?): WGPUBuffer?
	 = Functions.wgpuDeviceCreateBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUBuffer)

actual fun wgpuDeviceCreateCommandEncoder(handler: WGPUDevice?, descriptor: WGPUCommandEncoderDescriptor?): WGPUCommandEncoder?
	 = Functions.wgpuDeviceCreateCommandEncoder(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUCommandEncoder)

actual fun wgpuDeviceCreateComputePipeline(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?): WGPUComputePipeline?
	 = Functions.wgpuDeviceCreateComputePipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUComputePipeline)

actual fun wgpuDeviceCreateComputePipelineAsync(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?, callbackInfo: WGPUCreateComputePipelineAsyncCallbackInfo): Unit
	 = Functions.wgpuDeviceCreateComputePipelineAsync(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout?
	 = Functions.wgpuDeviceCreatePipelineLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUPipelineLayout)

actual fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet?
	 = Functions.wgpuDeviceCreateQuerySet(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUQuerySet)

actual fun wgpuDeviceCreateRenderPipelineAsync(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?, callbackInfo: WGPUCreateRenderPipelineAsyncCallbackInfo): Unit
	 = Functions.wgpuDeviceCreateRenderPipelineAsync(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceCreateRenderBundleEncoder(handler: WGPUDevice?, descriptor: WGPURenderBundleEncoderDescriptor?): WGPURenderBundleEncoder?
	 = Functions.wgpuDeviceCreateRenderBundleEncoder(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPURenderBundleEncoder)

actual fun wgpuDeviceCreateRenderPipeline(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?): WGPURenderPipeline?
	 = Functions.wgpuDeviceCreateRenderPipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPURenderPipeline)

actual fun wgpuDeviceCreateSampler(handler: WGPUDevice?, descriptor: WGPUSamplerDescriptor?): WGPUSampler?
	 = Functions.wgpuDeviceCreateSampler(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUSampler)

actual fun wgpuDeviceCreateShaderModule(handler: WGPUDevice?, descriptor: WGPUShaderModuleDescriptor?): WGPUShaderModule?
	 = Functions.wgpuDeviceCreateShaderModule(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUShaderModule)

actual fun wgpuDeviceCreateTexture(handler: WGPUDevice?, descriptor: WGPUTextureDescriptor?): WGPUTexture?
	 = Functions.wgpuDeviceCreateTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUTexture)

actual fun wgpuDeviceDestroy(handler: WGPUDevice?): Unit
	 = Functions.wgpuDeviceDestroy(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceGetLostFuture(handler: WGPUDevice?): WGPUFuture
	 = Functions.wgpuDeviceGetLostFuture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		.let(::NativeAddress).let(WGPUFuture::invoke)

actual fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPULimits?): WGPUStatus
	 = Functions.wgpuDeviceGetLimits(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, limits?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean
	 = Functions.wgpuDeviceHasFeature(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, feature)
		.toBoolean()

actual fun wgpuDeviceGetFeatures(handler: WGPUDevice?, features: WGPUSupportedFeatures?): Unit
	 = Functions.wgpuDeviceGetFeatures(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, features?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceGetAdapterInfo(handler: WGPUDevice?): WGPUAdapterInfo
	 = Functions.wgpuDeviceGetAdapterInfo(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		.let(::NativeAddress).let(WGPUAdapterInfo::invoke)

actual fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue?
	 = Functions.wgpuDeviceGetQueue(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUQueue)

actual fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter): Unit
	 = Functions.wgpuDevicePushErrorScope(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, filter)

actual fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callbackInfo: WGPUPopErrorScopeCallbackInfo): Unit
	 = Functions.wgpuDevicePopErrorScope(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: WGPUStringView): Unit
	 = Functions.wgpuDeviceSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuInstanceRelease(handler: WGPUInstance?): Unit
	 = Functions.wgpuInstanceRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface?
	 = Functions.wgpuInstanceCreateSurface(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUSurface)

actual fun wgpuInstanceGetWGSLLanguageFeatures(handler: WGPUInstance?, features: WGPUSupportedWGSLLanguageFeatures?): WGPUStatus
	 = Functions.wgpuInstanceGetWGSLLanguageFeatures(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, features?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLLanguageFeatureName): Boolean
	 = Functions.wgpuInstanceHasWGSLLanguageFeature(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, feature)
		.toBoolean()

actual fun wgpuInstanceProcessEvents(handler: WGPUInstance?): Unit
	 = Functions.wgpuInstanceProcessEvents(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuInstanceRequestAdapter(handler: WGPUInstance?, options: WGPURequestAdapterOptions?, callbackInfo: WGPURequestAdapterCallbackInfo): Unit
	 = Functions.wgpuInstanceRequestAdapter(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, options?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuInstanceWaitAny(handler: WGPUInstance?, futureCount: ULong, futures: WGPUFutureWaitInfo?, timeoutNS: ULong): WGPUWaitStatus
	 = Functions.wgpuInstanceWaitAny(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, futureCount, futures?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, timeoutNS)

actual fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?): Unit
	 = Functions.wgpuPipelineLayoutRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: WGPUStringView): Unit
	 = Functions.wgpuPipelineLayoutSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQuerySetRelease(handler: WGPUQuerySet?): Unit
	 = Functions.wgpuQuerySetRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: WGPUStringView): Unit
	 = Functions.wgpuQuerySetSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQuerySetGetType(handler: WGPUQuerySet?): WGPUQueryType
	 = Functions.wgpuQuerySetGetType(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQuerySetGetCount(handler: WGPUQuerySet?): UInt
	 = Functions.wgpuQuerySetGetCount(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQuerySetDestroy(handler: WGPUQuerySet?): Unit
	 = Functions.wgpuQuerySetDestroy(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQueueRelease(handler: WGPUQueue?): Unit
	 = Functions.wgpuQueueRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQueueSubmit(handler: WGPUQueue?, commandCount: ULong, commands: ArrayHolder<WGPUCommandBuffer>?): Unit
	 = Functions.wgpuQueueSubmit(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, commandCount, commands?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callbackInfo: WGPUQueueWorkDoneCallbackInfo): Unit
	 = Functions.wgpuQueueOnSubmittedWorkDone(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQueueWriteBuffer(handler: WGPUQueue?, buffer: WGPUBuffer?, bufferOffset: ULong, data: NativeAddress?, size: ULong): Unit
	 = Functions.wgpuQueueWriteBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, bufferOffset, data.adapt() ?: java.lang.foreign.MemorySegment.NULL, size)

actual fun wgpuQueueWriteTexture(handler: WGPUQueue?, destination: WGPUTexelCopyTextureInfo?, data: NativeAddress?, dataSize: ULong, dataLayout: WGPUTexelCopyBufferLayout?, writeSize: WGPUExtent3D?): Unit
	 = Functions.wgpuQueueWriteTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, data.adapt() ?: java.lang.foreign.MemorySegment.NULL, dataSize, dataLayout?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, writeSize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQueueSetLabel(handler: WGPUQueue?, label: WGPUStringView): Unit
	 = Functions.wgpuQueueSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleRelease(handler: WGPURenderBundle?): Unit
	 = Functions.wgpuRenderBundleRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: WGPUStringView): Unit
	 = Functions.wgpuRenderBundleSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderRelease(handler: WGPURenderBundleEncoder?): Unit
	 = Functions.wgpuRenderBundleEncoderRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderSetPipeline(handler: WGPURenderBundleEncoder?, pipeline: WGPURenderPipeline?): Unit
	 = Functions.wgpuRenderBundleEncoderSetPipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, pipeline?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderSetBindGroup(handler: WGPURenderBundleEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
	 = Functions.wgpuRenderBundleEncoderSetBindGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex, group?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, dynamicOffsetCount, dynamicOffsets?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderDraw(handler: WGPURenderBundleEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
	 = Functions.wgpuRenderBundleEncoderDraw(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, vertexCount, instanceCount, firstVertex, firstInstance)

actual fun wgpuRenderBundleEncoderDrawIndexed(handler: WGPURenderBundleEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
	 = Functions.wgpuRenderBundleEncoderDrawIndexed(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indexCount, instanceCount, firstIndex, baseVertex, firstInstance)

actual fun wgpuRenderBundleEncoderDrawIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = Functions.wgpuRenderBundleEncoderDrawIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)

actual fun wgpuRenderBundleEncoderDrawIndexedIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = Functions.wgpuRenderBundleEncoderDrawIndexedIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)

actual fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: WGPUStringView): Unit
	 = Functions.wgpuRenderBundleEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?): Unit
	 = Functions.wgpuRenderBundleEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: WGPUStringView): Unit
	 = Functions.wgpuRenderBundleEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderSetVertexBuffer(handler: WGPURenderBundleEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
	 = Functions.wgpuRenderBundleEncoderSetVertexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, slot, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)

actual fun wgpuRenderBundleEncoderSetIndexBuffer(handler: WGPURenderBundleEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit
	 = Functions.wgpuRenderBundleEncoderSetIndexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, format, offset, size)

actual fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle?
	 = Functions.wgpuRenderBundleEncoderFinish(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPURenderBundle)

actual fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: WGPUStringView): Unit
	 = Functions.wgpuRenderBundleEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderRelease(handler: WGPURenderPassEncoder?): Unit
	 = Functions.wgpuRenderPassEncoderRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderSetPipeline(handler: WGPURenderPassEncoder?, pipeline: WGPURenderPipeline?): Unit
	 = Functions.wgpuRenderPassEncoderSetPipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, pipeline?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderSetBindGroup(handler: WGPURenderPassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
	 = Functions.wgpuRenderPassEncoderSetBindGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex, group?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, dynamicOffsetCount, dynamicOffsets?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderDraw(handler: WGPURenderPassEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
	 = Functions.wgpuRenderPassEncoderDraw(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, vertexCount, instanceCount, firstVertex, firstInstance)

actual fun wgpuRenderPassEncoderDrawIndexed(handler: WGPURenderPassEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
	 = Functions.wgpuRenderPassEncoderDrawIndexed(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indexCount, instanceCount, firstIndex, baseVertex, firstInstance)

actual fun wgpuRenderPassEncoderDrawIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = Functions.wgpuRenderPassEncoderDrawIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)

actual fun wgpuRenderPassEncoderDrawIndexedIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = Functions.wgpuRenderPassEncoderDrawIndexedIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)

actual fun wgpuRenderPassEncoderExecuteBundles(handler: WGPURenderPassEncoder?, bundleCount: ULong, bundles: ArrayHolder<WGPURenderBundle>?): Unit
	 = Functions.wgpuRenderPassEncoderExecuteBundles(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, bundleCount, bundles?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: WGPUStringView): Unit
	 = Functions.wgpuRenderPassEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?): Unit
	 = Functions.wgpuRenderPassEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: WGPUStringView): Unit
	 = Functions.wgpuRenderPassEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderSetStencilReference(handler: WGPURenderPassEncoder?, reference: UInt): Unit
	 = Functions.wgpuRenderPassEncoderSetStencilReference(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, reference)

actual fun wgpuRenderPassEncoderSetBlendConstant(handler: WGPURenderPassEncoder?, color: WGPUColor?): Unit
	 = Functions.wgpuRenderPassEncoderSetBlendConstant(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, color?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderSetViewport(handler: WGPURenderPassEncoder?, x: Float, y: Float, width: Float, height: Float, minDepth: Float, maxDepth: Float): Unit
	 = Functions.wgpuRenderPassEncoderSetViewport(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, x, y, width, height, minDepth, maxDepth)

actual fun wgpuRenderPassEncoderSetScissorRect(handler: WGPURenderPassEncoder?, x: UInt, y: UInt, width: UInt, height: UInt): Unit
	 = Functions.wgpuRenderPassEncoderSetScissorRect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, x, y, width, height)

actual fun wgpuRenderPassEncoderSetVertexBuffer(handler: WGPURenderPassEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
	 = Functions.wgpuRenderPassEncoderSetVertexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, slot, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)

actual fun wgpuRenderPassEncoderSetIndexBuffer(handler: WGPURenderPassEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit
	 = Functions.wgpuRenderPassEncoderSetIndexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, format, offset, size)

actual fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: WGPURenderPassEncoder?, queryIndex: UInt): Unit
	 = Functions.wgpuRenderPassEncoderBeginOcclusionQuery(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, queryIndex)

actual fun wgpuRenderPassEncoderEndOcclusionQuery(handler: WGPURenderPassEncoder?): Unit
	 = Functions.wgpuRenderPassEncoderEndOcclusionQuery(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderEnd(handler: WGPURenderPassEncoder?): Unit
	 = Functions.wgpuRenderPassEncoderEnd(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: WGPUStringView): Unit
	 = Functions.wgpuRenderPassEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?): Unit
	 = Functions.wgpuRenderPipelineRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout?
	 = Functions.wgpuRenderPipelineGetBindGroupLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex)
		?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)

actual fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: WGPUStringView): Unit
	 = Functions.wgpuRenderPipelineSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSamplerRelease(handler: WGPUSampler?): Unit
	 = Functions.wgpuSamplerRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: WGPUStringView): Unit
	 = Functions.wgpuSamplerSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuShaderModuleRelease(handler: WGPUShaderModule?): Unit
	 = Functions.wgpuShaderModuleRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callbackInfo: WGPUCompilationInfoCallbackInfo): Unit
	 = Functions.wgpuShaderModuleGetCompilationInfo(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: WGPUStringView): Unit
	 = Functions.wgpuShaderModuleSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceRelease(handler: WGPUSurface?): Unit
	 = Functions.wgpuSurfaceRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?): Unit
	 = Functions.wgpuSurfaceConfigure(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, config?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceGetCapabilities(handler: WGPUSurface?, adapter: WGPUAdapter?, capabilities: WGPUSurfaceCapabilities?): WGPUStatus
	 = Functions.wgpuSurfaceGetCapabilities(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, adapter?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, capabilities?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?): Unit
	 = Functions.wgpuSurfaceGetCurrentTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, surfaceTexture?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfacePresent(handler: WGPUSurface?): WGPUStatus
	 = Functions.wgpuSurfacePresent(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceUnconfigure(handler: WGPUSurface?): Unit
	 = Functions.wgpuSurfaceUnconfigure(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: WGPUStringView): Unit
	 = Functions.wgpuSurfaceSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureRelease(handler: WGPUTexture?): Unit
	 = Functions.wgpuTextureRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView?
	 = Functions.wgpuTextureCreateView(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUTextureView)

actual fun wgpuTextureSetLabel(handler: WGPUTexture?, label: WGPUStringView): Unit
	 = Functions.wgpuTextureSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureGetWidth(handler: WGPUTexture?): UInt
	 = Functions.wgpuTextureGetWidth(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureGetHeight(handler: WGPUTexture?): UInt
	 = Functions.wgpuTextureGetHeight(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureGetDepthOrArrayLayers(handler: WGPUTexture?): UInt
	 = Functions.wgpuTextureGetDepthOrArrayLayers(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureGetMipLevelCount(handler: WGPUTexture?): UInt
	 = Functions.wgpuTextureGetMipLevelCount(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureGetSampleCount(handler: WGPUTexture?): UInt
	 = Functions.wgpuTextureGetSampleCount(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureGetDimension(handler: WGPUTexture?): WGPUTextureDimension
	 = Functions.wgpuTextureGetDimension(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureGetFormat(handler: WGPUTexture?): WGPUTextureFormat
	 = Functions.wgpuTextureGetFormat(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureGetUsage(handler: WGPUTexture?): ULong
	 = Functions.wgpuTextureGetUsage(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureDestroy(handler: WGPUTexture?): Unit
	 = Functions.wgpuTextureDestroy(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureViewRelease(handler: WGPUTextureView?): Unit
	 = Functions.wgpuTextureViewRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: WGPUStringView): Unit
	 = Functions.wgpuTextureViewSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

