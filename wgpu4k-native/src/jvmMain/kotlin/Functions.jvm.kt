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

actual fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuSetLogCallback(callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSetLogLevel(level: WGPULogLevel): Unit
	 = Functions.wgpuSetLogLevel(level)

actual fun wgpuAdapterRelease(handler: WGPUAdapter?): Unit
	 = Functions.wgpuAdapterRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPUSupportedLimits?): Boolean
	 = Functions.wgpuAdapterGetLimits(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, limits?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		.toBoolean()

actual fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean
	 = Functions.wgpuAdapterHasFeature(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, feature)
		.toBoolean()

actual fun wgpuAdapterEnumerateFeatures(handler: WGPUAdapter?, features: NativeAddress?): ULong
	 = Functions.wgpuAdapterEnumerateFeatures(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, features.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): Unit
	 = Functions.wgpuAdapterGetInfo(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, info?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuAdapterRequestDevice(handler: WGPUAdapter?, descriptor: WGPUDeviceDescriptor?, callback: CallbackHolder<WGPUAdapterRequestDeviceCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuAdapterRequestDevice(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBindGroupRelease(handler: WGPUBindGroup?): Unit
	 = Functions.wgpuBindGroupRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: CString?): Unit
	 = Functions.wgpuBindGroupSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?): Unit
	 = Functions.wgpuBindGroupLayoutRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: CString?): Unit
	 = Functions.wgpuBindGroupLayoutSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferRelease(handler: WGPUBuffer?): Unit
	 = Functions.wgpuBufferRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferMapAsync(handler: WGPUBuffer?, mode: UInt, offset: ULong, size: ULong, callback: CallbackHolder<WGPUBufferMapAsyncCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuBufferMapAsync(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, mode, offset, size, callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferGetMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
	 = Functions.wgpuBufferGetMappedRange(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)
		?.let(::NativeAddress)

actual fun wgpuBufferGetConstMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
	 = Functions.wgpuBufferGetConstMappedRange(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)
		?.let(::NativeAddress)

actual fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: CString?): Unit
	 = Functions.wgpuBufferSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuBufferGetUsage(handler: WGPUBuffer?): UInt
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

actual fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: CString?): Unit
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

actual fun wgpuCommandEncoderCopyBufferToTexture(handler: WGPUCommandEncoder?, source: WGPUImageCopyBuffer?, destination: WGPUImageCopyTexture?, copySize: WGPUExtent3D?): Unit
	 = Functions.wgpuCommandEncoderCopyBufferToTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, copySize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderCopyTextureToBuffer(handler: WGPUCommandEncoder?, source: WGPUImageCopyTexture?, destination: WGPUImageCopyBuffer?, copySize: WGPUExtent3D?): Unit
	 = Functions.wgpuCommandEncoderCopyTextureToBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, copySize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderCopyTextureToTexture(handler: WGPUCommandEncoder?, source: WGPUImageCopyTexture?, destination: WGPUImageCopyTexture?, copySize: WGPUExtent3D?): Unit
	 = Functions.wgpuCommandEncoderCopyTextureToTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, copySize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderClearBuffer(handler: WGPUCommandEncoder?, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
	 = Functions.wgpuCommandEncoderClearBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)

actual fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: CString?): Unit
	 = Functions.wgpuCommandEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?): Unit
	 = Functions.wgpuCommandEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: CString?): Unit
	 = Functions.wgpuCommandEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuCommandEncoderResolveQuerySet(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, firstQuery: UInt, queryCount: UInt, destination: WGPUBuffer?, destinationOffset: ULong): Unit
	 = Functions.wgpuCommandEncoderResolveQuerySet(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, querySet?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, firstQuery, queryCount, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destinationOffset)

actual fun wgpuCommandEncoderWriteTimestamp(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, queryIndex: UInt): Unit
	 = Functions.wgpuCommandEncoderWriteTimestamp(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, querySet?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, queryIndex)

actual fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: CString?): Unit
	 = Functions.wgpuCommandEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?): Unit
	 = Functions.wgpuComputePassEncoderRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: CString?): Unit
	 = Functions.wgpuComputePassEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?): Unit
	 = Functions.wgpuComputePassEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: CString?): Unit
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

actual fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: CString?): Unit
	 = Functions.wgpuComputePassEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?): Unit
	 = Functions.wgpuComputePipelineRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout?
	 = Functions.wgpuComputePipelineGetBindGroupLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex)
		?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)

actual fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: CString?): Unit
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

actual fun wgpuDeviceCreateComputePipelineAsync(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?, callback: CallbackHolder<WGPUDeviceCreateComputePipelineAsyncCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuDeviceCreateComputePipelineAsync(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout?
	 = Functions.wgpuDeviceCreatePipelineLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUPipelineLayout)

actual fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet?
	 = Functions.wgpuDeviceCreateQuerySet(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUQuerySet)

actual fun wgpuDeviceCreateRenderPipelineAsync(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?, callback: CallbackHolder<WGPUDeviceCreateRenderPipelineAsyncCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuDeviceCreateRenderPipelineAsync(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

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

actual fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPUSupportedLimits?): Boolean
	 = Functions.wgpuDeviceGetLimits(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, limits?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		.toBoolean()

actual fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean
	 = Functions.wgpuDeviceHasFeature(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, feature)
		.toBoolean()

actual fun wgpuDeviceEnumerateFeatures(handler: WGPUDevice?, features: NativeAddress?): ULong
	 = Functions.wgpuDeviceEnumerateFeatures(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, features.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue?
	 = Functions.wgpuDeviceGetQueue(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUQueue)

actual fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter): Unit
	 = Functions.wgpuDevicePushErrorScope(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, filter)

actual fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callback: CallbackHolder<WGPUErrorCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuDevicePopErrorScope(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: CString?): Unit
	 = Functions.wgpuDeviceSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuInstanceRelease(handler: WGPUInstance?): Unit
	 = Functions.wgpuInstanceRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface?
	 = Functions.wgpuInstanceCreateSurface(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUSurface)

actual fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLFeatureName): Boolean
	 = Functions.wgpuInstanceHasWGSLLanguageFeature(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, feature)
		.toBoolean()

actual fun wgpuInstanceProcessEvents(handler: WGPUInstance?): Unit
	 = Functions.wgpuInstanceProcessEvents(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuInstanceRequestAdapter(handler: WGPUInstance?, options: WGPURequestAdapterOptions?, callback: CallbackHolder<WGPUInstanceRequestAdapterCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuInstanceRequestAdapter(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, options?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?): Unit
	 = Functions.wgpuPipelineLayoutRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: CString?): Unit
	 = Functions.wgpuPipelineLayoutSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQuerySetRelease(handler: WGPUQuerySet?): Unit
	 = Functions.wgpuQuerySetRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: CString?): Unit
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

actual fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callback: CallbackHolder<WGPUQueueOnSubmittedWorkDoneCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuQueueOnSubmittedWorkDone(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQueueWriteBuffer(handler: WGPUQueue?, buffer: WGPUBuffer?, bufferOffset: ULong, data: NativeAddress?, size: ULong): Unit
	 = Functions.wgpuQueueWriteBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, bufferOffset, data.adapt() ?: java.lang.foreign.MemorySegment.NULL, size)

actual fun wgpuQueueWriteTexture(handler: WGPUQueue?, destination: WGPUImageCopyTexture?, data: NativeAddress?, dataSize: ULong, dataLayout: WGPUTextureDataLayout?, writeSize: WGPUExtent3D?): Unit
	 = Functions.wgpuQueueWriteTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, data.adapt() ?: java.lang.foreign.MemorySegment.NULL, dataSize, dataLayout?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, writeSize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuQueueSetLabel(handler: WGPUQueue?, label: CString?): Unit
	 = Functions.wgpuQueueSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleRelease(handler: WGPURenderBundle?): Unit
	 = Functions.wgpuRenderBundleRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: CString?): Unit
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

actual fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: CString?): Unit
	 = Functions.wgpuRenderBundleEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?): Unit
	 = Functions.wgpuRenderBundleEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: CString?): Unit
	 = Functions.wgpuRenderBundleEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderBundleEncoderSetVertexBuffer(handler: WGPURenderBundleEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
	 = Functions.wgpuRenderBundleEncoderSetVertexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, slot, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)

actual fun wgpuRenderBundleEncoderSetIndexBuffer(handler: WGPURenderBundleEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit
	 = Functions.wgpuRenderBundleEncoderSetIndexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, format, offset, size)

actual fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle?
	 = Functions.wgpuRenderBundleEncoderFinish(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPURenderBundle)

actual fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: CString?): Unit
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

actual fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: CString?): Unit
	 = Functions.wgpuRenderPassEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?): Unit
	 = Functions.wgpuRenderPassEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: CString?): Unit
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

actual fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: CString?): Unit
	 = Functions.wgpuRenderPassEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?): Unit
	 = Functions.wgpuRenderPipelineRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout?
	 = Functions.wgpuRenderPipelineGetBindGroupLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex)
		?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)

actual fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: CString?): Unit
	 = Functions.wgpuRenderPipelineSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSamplerRelease(handler: WGPUSampler?): Unit
	 = Functions.wgpuSamplerRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: CString?): Unit
	 = Functions.wgpuSamplerSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuShaderModuleRelease(handler: WGPUShaderModule?): Unit
	 = Functions.wgpuShaderModuleRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callback: CallbackHolder<WGPUShaderModuleGetCompilationInfoCallback>?, userdata: NativeAddress?): Unit
	 = Functions.wgpuShaderModuleGetCompilationInfo(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: CString?): Unit
	 = Functions.wgpuShaderModuleSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceRelease(handler: WGPUSurface?): Unit
	 = Functions.wgpuSurfaceRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?): Unit
	 = Functions.wgpuSurfaceConfigure(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, config?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceGetCapabilities(handler: WGPUSurface?, adapter: WGPUAdapter?, capabilities: WGPUSurfaceCapabilities?): Unit
	 = Functions.wgpuSurfaceGetCapabilities(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, adapter?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, capabilities?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?): Unit
	 = Functions.wgpuSurfaceGetCurrentTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, surfaceTexture?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfacePresent(handler: WGPUSurface?): Unit
	 = Functions.wgpuSurfacePresent(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceUnconfigure(handler: WGPUSurface?): Unit
	 = Functions.wgpuSurfaceUnconfigure(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: CString?): Unit
	 = Functions.wgpuSurfaceSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureRelease(handler: WGPUTexture?): Unit
	 = Functions.wgpuTextureRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView?
	 = Functions.wgpuTextureCreateView(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
		?.let(::NativeAddress)?.let(::WGPUTextureView)

actual fun wgpuTextureSetLabel(handler: WGPUTexture?, label: CString?): Unit
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

actual fun wgpuTextureGetUsage(handler: WGPUTexture?): UInt
	 = Functions.wgpuTextureGetUsage(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureDestroy(handler: WGPUTexture?): Unit
	 = Functions.wgpuTextureDestroy(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureViewRelease(handler: WGPUTextureView?): Unit
	 = Functions.wgpuTextureViewRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

actual fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: CString?): Unit
	 = Functions.wgpuTextureViewSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)

