// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.CString
import ffi.NativeAddress
import ffi.CallbackHolder
import ffi.ArrayHolder
import ffi.adapt


actual fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor?): WGPUInstance?
	 = io.ygdrasil.wgpu.android.Functions.wgpuCreateInstance(descriptor?.toReference())
	?.let(::WGPUInstance)

actual fun wgpuDevicePoll(device: WGPUDevice?, wait: Boolean, wrappedSubmissionIndex: WGPUWrappedSubmissionIndex?): Boolean
	 = io.ygdrasil.wgpu.android.Functions.wgpuDevicePoll(device?.handler, wait.toUInt(), wrappedSubmissionIndex?.toCValue())
	.toBoolean()

actual fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSetLogCallback(callback?.callback, userdata)

actual fun wgpuSetLogLevel(level: WGPULogLevel): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSetLogLevel(level)

actual fun wgpuAdapterRelease(handler: WGPUAdapter?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterRelease(handler?.handler)

actual fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPUSupportedLimits?): Boolean
	 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterGetLimits(handler?.handler, limits?.toReference())
	.toBoolean()

actual fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean
	 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterHasFeature(handler?.handler, feature)
	.toBoolean()

actual fun wgpuAdapterEnumerateFeatures(handler: WGPUAdapter?, features: NativeAddress?): ULong
	 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterEnumerateFeatures(handler?.handler, features)

actual fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterGetInfo(handler?.handler, info?.toReference())

actual fun wgpuAdapterRequestDevice(handler: WGPUAdapter?, descriptor: WGPUDeviceDescriptor?, callback: CallbackHolder<WGPUAdapterRequestDeviceCallback>?, userdata: NativeAddress?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterRequestDevice(handler?.handler, descriptor?.toReference(), callback?.callback, userdata)

actual fun wgpuBindGroupRelease(handler: WGPUBindGroup?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuBindGroupRelease(handler?.handler)

actual fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuBindGroupSetLabel(handler?.handler, label?.handler)

actual fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuBindGroupLayoutRelease(handler?.handler)

actual fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuBindGroupLayoutSetLabel(handler?.handler, label?.handler)

actual fun wgpuBufferRelease(handler: WGPUBuffer?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferRelease(handler?.handler)

actual fun wgpuBufferMapAsync(handler: WGPUBuffer?, mode: UInt, offset: ULong, size: ULong, callback: CallbackHolder<WGPUBufferMapAsyncCallback>?, userdata: NativeAddress?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferMapAsync(handler?.handler, mode, offset, size, callback?.callback, userdata)

actual fun wgpuBufferGetMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetMappedRange(handler?.handler, offset, size)

actual fun wgpuBufferGetConstMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetConstMappedRange(handler?.handler, offset, size)

actual fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferSetLabel(handler?.handler, label?.handler)

actual fun wgpuBufferGetUsage(handler: WGPUBuffer?): UInt
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetUsage(handler?.handler)

actual fun wgpuBufferGetSize(handler: WGPUBuffer?): ULong
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetSize(handler?.handler)

actual fun wgpuBufferGetMapState(handler: WGPUBuffer?): WGPUBufferMapState
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetMapState(handler?.handler)

actual fun wgpuBufferUnmap(handler: WGPUBuffer?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferUnmap(handler?.handler)

actual fun wgpuBufferDestroy(handler: WGPUBuffer?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuBufferDestroy(handler?.handler)

actual fun wgpuCommandBufferRelease(handler: WGPUCommandBuffer?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandBufferRelease(handler?.handler)

actual fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandBufferSetLabel(handler?.handler, label?.handler)

actual fun wgpuCommandEncoderRelease(handler: WGPUCommandEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderRelease(handler?.handler)

actual fun wgpuCommandEncoderFinish(handler: WGPUCommandEncoder?, descriptor: WGPUCommandBufferDescriptor?): WGPUCommandBuffer?
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderFinish(handler?.handler, descriptor?.toReference())
	?.let(::WGPUCommandBuffer)

actual fun wgpuCommandEncoderBeginComputePass(handler: WGPUCommandEncoder?, descriptor: WGPUComputePassDescriptor?): WGPUComputePassEncoder?
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderBeginComputePass(handler?.handler, descriptor?.toReference())
	?.let(::WGPUComputePassEncoder)

actual fun wgpuCommandEncoderBeginRenderPass(handler: WGPUCommandEncoder?, descriptor: WGPURenderPassDescriptor?): WGPURenderPassEncoder?
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderBeginRenderPass(handler?.handler, descriptor?.toReference())
	?.let(::WGPURenderPassEncoder)

actual fun wgpuCommandEncoderCopyBufferToBuffer(handler: WGPUCommandEncoder?, source: WGPUBuffer?, sourceOffset: ULong, destination: WGPUBuffer?, destinationOffset: ULong, size: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderCopyBufferToBuffer(handler?.handler, source?.handler, sourceOffset, destination?.handler, destinationOffset, size)

actual fun wgpuCommandEncoderCopyBufferToTexture(handler: WGPUCommandEncoder?, source: WGPUImageCopyBuffer?, destination: WGPUImageCopyTexture?, copySize: WGPUExtent3D?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderCopyBufferToTexture(handler?.handler, source?.toReference(), destination?.toReference(), copySize?.toReference())

actual fun wgpuCommandEncoderCopyTextureToBuffer(handler: WGPUCommandEncoder?, source: WGPUImageCopyTexture?, destination: WGPUImageCopyBuffer?, copySize: WGPUExtent3D?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderCopyTextureToBuffer(handler?.handler, source?.toReference(), destination?.toReference(), copySize?.toReference())

actual fun wgpuCommandEncoderCopyTextureToTexture(handler: WGPUCommandEncoder?, source: WGPUImageCopyTexture?, destination: WGPUImageCopyTexture?, copySize: WGPUExtent3D?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderCopyTextureToTexture(handler?.handler, source?.toReference(), destination?.toReference(), copySize?.toReference())

actual fun wgpuCommandEncoderClearBuffer(handler: WGPUCommandEncoder?, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderClearBuffer(handler?.handler, buffer?.handler, offset, size)

actual fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderInsertDebugMarker(handler?.handler, markerLabel?.handler)

actual fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderPopDebugGroup(handler?.handler)

actual fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderPushDebugGroup(handler?.handler, groupLabel?.handler)

actual fun wgpuCommandEncoderResolveQuerySet(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, firstQuery: UInt, queryCount: UInt, destination: WGPUBuffer?, destinationOffset: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderResolveQuerySet(handler?.handler, querySet?.handler, firstQuery, queryCount, destination?.handler, destinationOffset)

actual fun wgpuCommandEncoderWriteTimestamp(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, queryIndex: UInt): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderWriteTimestamp(handler?.handler, querySet?.handler, queryIndex)

actual fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderSetLabel(handler?.handler, label?.handler)

actual fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderRelease(handler?.handler)

actual fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderInsertDebugMarker(handler?.handler, markerLabel?.handler)

actual fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderPopDebugGroup(handler?.handler)

actual fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderPushDebugGroup(handler?.handler, groupLabel?.handler)

actual fun wgpuComputePassEncoderSetPipeline(handler: WGPUComputePassEncoder?, pipeline: WGPUComputePipeline?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderSetPipeline(handler?.handler, pipeline?.handler)

actual fun wgpuComputePassEncoderSetBindGroup(handler: WGPUComputePassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderSetBindGroup(handler?.handler, groupIndex, group?.handler, dynamicOffsetCount, dynamicOffsets?.handler)

actual fun wgpuComputePassEncoderDispatchWorkgroups(handler: WGPUComputePassEncoder?, workgroupCountX: UInt, workgroupCountY: UInt, workgroupCountZ: UInt): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderDispatchWorkgroups(handler?.handler, workgroupCountX, workgroupCountY, workgroupCountZ)

actual fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler: WGPUComputePassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)

actual fun wgpuComputePassEncoderEnd(handler: WGPUComputePassEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderEnd(handler?.handler)

actual fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderSetLabel(handler?.handler, label?.handler)

actual fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePipelineRelease(handler?.handler)

actual fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout?
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePipelineGetBindGroupLayout(handler?.handler, groupIndex)
	?.let(::WGPUBindGroupLayout)

actual fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuComputePipelineSetLabel(handler?.handler, label?.handler)

actual fun wgpuDeviceRelease(handler: WGPUDevice?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceRelease(handler?.handler)

actual fun wgpuDeviceCreateBindGroup(handler: WGPUDevice?, descriptor: WGPUBindGroupDescriptor?): WGPUBindGroup?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateBindGroup(handler?.handler, descriptor?.toReference())
	?.let(::WGPUBindGroup)

actual fun wgpuDeviceCreateBindGroupLayout(handler: WGPUDevice?, descriptor: WGPUBindGroupLayoutDescriptor?): WGPUBindGroupLayout?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateBindGroupLayout(handler?.handler, descriptor?.toReference())
	?.let(::WGPUBindGroupLayout)

actual fun wgpuDeviceCreateBuffer(handler: WGPUDevice?, descriptor: WGPUBufferDescriptor?): WGPUBuffer?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateBuffer(handler?.handler, descriptor?.toReference())
	?.let(::WGPUBuffer)

actual fun wgpuDeviceCreateCommandEncoder(handler: WGPUDevice?, descriptor: WGPUCommandEncoderDescriptor?): WGPUCommandEncoder?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateCommandEncoder(handler?.handler, descriptor?.toReference())
	?.let(::WGPUCommandEncoder)

actual fun wgpuDeviceCreateComputePipeline(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?): WGPUComputePipeline?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateComputePipeline(handler?.handler, descriptor?.toReference())
	?.let(::WGPUComputePipeline)

actual fun wgpuDeviceCreateComputePipelineAsync(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?, callback: CallbackHolder<WGPUDeviceCreateComputePipelineAsyncCallback>?, userdata: NativeAddress?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateComputePipelineAsync(handler?.handler, descriptor?.toReference(), callback?.callback, userdata)

actual fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreatePipelineLayout(handler?.handler, descriptor?.toReference())
	?.let(::WGPUPipelineLayout)

actual fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateQuerySet(handler?.handler, descriptor?.toReference())
	?.let(::WGPUQuerySet)

actual fun wgpuDeviceCreateRenderPipelineAsync(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?, callback: CallbackHolder<WGPUDeviceCreateRenderPipelineAsyncCallback>?, userdata: NativeAddress?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateRenderPipelineAsync(handler?.handler, descriptor?.toReference(), callback?.callback, userdata)

actual fun wgpuDeviceCreateRenderBundleEncoder(handler: WGPUDevice?, descriptor: WGPURenderBundleEncoderDescriptor?): WGPURenderBundleEncoder?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateRenderBundleEncoder(handler?.handler, descriptor?.toReference())
	?.let(::WGPURenderBundleEncoder)

actual fun wgpuDeviceCreateRenderPipeline(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?): WGPURenderPipeline?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateRenderPipeline(handler?.handler, descriptor?.toReference())
	?.let(::WGPURenderPipeline)

actual fun wgpuDeviceCreateSampler(handler: WGPUDevice?, descriptor: WGPUSamplerDescriptor?): WGPUSampler?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateSampler(handler?.handler, descriptor?.toReference())
	?.let(::WGPUSampler)

actual fun wgpuDeviceCreateShaderModule(handler: WGPUDevice?, descriptor: WGPUShaderModuleDescriptor?): WGPUShaderModule?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateShaderModule(handler?.handler, descriptor?.toReference())
	?.let(::WGPUShaderModule)

actual fun wgpuDeviceCreateTexture(handler: WGPUDevice?, descriptor: WGPUTextureDescriptor?): WGPUTexture?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateTexture(handler?.handler, descriptor?.toReference())
	?.let(::WGPUTexture)

actual fun wgpuDeviceDestroy(handler: WGPUDevice?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceDestroy(handler?.handler)

actual fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPUSupportedLimits?): Boolean
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceGetLimits(handler?.handler, limits?.toReference())
	.toBoolean()

actual fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceHasFeature(handler?.handler, feature)
	.toBoolean()

actual fun wgpuDeviceEnumerateFeatures(handler: WGPUDevice?, features: NativeAddress?): ULong
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceEnumerateFeatures(handler?.handler, features)

actual fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue?
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceGetQueue(handler?.handler)
	?.let(::WGPUQueue)

actual fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuDevicePushErrorScope(handler?.handler, filter)

actual fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callback: CallbackHolder<WGPUErrorCallback>?, userdata: NativeAddress?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuDevicePopErrorScope(handler?.handler, callback?.callback, userdata)

actual fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceSetLabel(handler?.handler, label?.handler)

actual fun wgpuInstanceRelease(handler: WGPUInstance?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceRelease(handler?.handler)

actual fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface?
	 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceCreateSurface(handler?.handler, descriptor?.toReference())
	?.let(::WGPUSurface)

actual fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLFeatureName): Boolean
	 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceHasWGSLLanguageFeature(handler?.handler, feature)
	.toBoolean()

actual fun wgpuInstanceProcessEvents(handler: WGPUInstance?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceProcessEvents(handler?.handler)

actual fun wgpuInstanceRequestAdapter(handler: WGPUInstance?, options: WGPURequestAdapterOptions?, callback: CallbackHolder<WGPUInstanceRequestAdapterCallback>?, userdata: NativeAddress?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceRequestAdapter(handler?.handler, options?.toReference(), callback?.callback, userdata)

actual fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuPipelineLayoutRelease(handler?.handler)

actual fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuPipelineLayoutSetLabel(handler?.handler, label?.handler)

actual fun wgpuQuerySetRelease(handler: WGPUQuerySet?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetRelease(handler?.handler)

actual fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetSetLabel(handler?.handler, label?.handler)

actual fun wgpuQuerySetGetType(handler: WGPUQuerySet?): WGPUQueryType
	 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetGetType(handler?.handler)

actual fun wgpuQuerySetGetCount(handler: WGPUQuerySet?): UInt
	 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetGetCount(handler?.handler)

actual fun wgpuQuerySetDestroy(handler: WGPUQuerySet?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetDestroy(handler?.handler)

actual fun wgpuQueueRelease(handler: WGPUQueue?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuQueueRelease(handler?.handler)

actual fun wgpuQueueSubmit(handler: WGPUQueue?, commandCount: ULong, commands: ArrayHolder<WGPUCommandBuffer>?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuQueueSubmit(handler?.handler, commandCount, commands?.handler)

actual fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callback: CallbackHolder<WGPUQueueOnSubmittedWorkDoneCallback>?, userdata: NativeAddress?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuQueueOnSubmittedWorkDone(handler?.handler, callback?.callback, userdata)

actual fun wgpuQueueWriteBuffer(handler: WGPUQueue?, buffer: WGPUBuffer?, bufferOffset: ULong, data: NativeAddress?, size: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuQueueWriteBuffer(handler?.handler, buffer?.handler, bufferOffset, data, size)

actual fun wgpuQueueWriteTexture(handler: WGPUQueue?, destination: WGPUImageCopyTexture?, data: NativeAddress?, dataSize: ULong, dataLayout: WGPUTextureDataLayout?, writeSize: WGPUExtent3D?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuQueueWriteTexture(handler?.handler, destination?.toReference(), data, dataSize, dataLayout?.toReference(), writeSize?.toReference())

actual fun wgpuQueueSetLabel(handler: WGPUQueue?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuQueueSetLabel(handler?.handler, label?.handler)

actual fun wgpuRenderBundleRelease(handler: WGPURenderBundle?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleRelease(handler?.handler)

actual fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleSetLabel(handler?.handler, label?.handler)

actual fun wgpuRenderBundleEncoderRelease(handler: WGPURenderBundleEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderRelease(handler?.handler)

actual fun wgpuRenderBundleEncoderSetPipeline(handler: WGPURenderBundleEncoder?, pipeline: WGPURenderPipeline?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetPipeline(handler?.handler, pipeline?.handler)

actual fun wgpuRenderBundleEncoderSetBindGroup(handler: WGPURenderBundleEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetBindGroup(handler?.handler, groupIndex, group?.handler, dynamicOffsetCount, dynamicOffsets?.handler)

actual fun wgpuRenderBundleEncoderDraw(handler: WGPURenderBundleEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderDraw(handler?.handler, vertexCount, instanceCount, firstVertex, firstInstance)

actual fun wgpuRenderBundleEncoderDrawIndexed(handler: WGPURenderBundleEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderDrawIndexed(handler?.handler, indexCount, instanceCount, firstIndex, baseVertex, firstInstance)

actual fun wgpuRenderBundleEncoderDrawIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderDrawIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)

actual fun wgpuRenderBundleEncoderDrawIndexedIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderDrawIndexedIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)

actual fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderInsertDebugMarker(handler?.handler, markerLabel?.handler)

actual fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderPopDebugGroup(handler?.handler)

actual fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderPushDebugGroup(handler?.handler, groupLabel?.handler)

actual fun wgpuRenderBundleEncoderSetVertexBuffer(handler: WGPURenderBundleEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetVertexBuffer(handler?.handler, slot, buffer?.handler, offset, size)

actual fun wgpuRenderBundleEncoderSetIndexBuffer(handler: WGPURenderBundleEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetIndexBuffer(handler?.handler, buffer?.handler, format, offset, size)

actual fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle?
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderFinish(handler?.handler, descriptor?.toReference())
	?.let(::WGPURenderBundle)

actual fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetLabel(handler?.handler, label?.handler)

actual fun wgpuRenderPassEncoderRelease(handler: WGPURenderPassEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderRelease(handler?.handler)

actual fun wgpuRenderPassEncoderSetPipeline(handler: WGPURenderPassEncoder?, pipeline: WGPURenderPipeline?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetPipeline(handler?.handler, pipeline?.handler)

actual fun wgpuRenderPassEncoderSetBindGroup(handler: WGPURenderPassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetBindGroup(handler?.handler, groupIndex, group?.handler, dynamicOffsetCount, dynamicOffsets?.handler)

actual fun wgpuRenderPassEncoderDraw(handler: WGPURenderPassEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderDraw(handler?.handler, vertexCount, instanceCount, firstVertex, firstInstance)

actual fun wgpuRenderPassEncoderDrawIndexed(handler: WGPURenderPassEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderDrawIndexed(handler?.handler, indexCount, instanceCount, firstIndex, baseVertex, firstInstance)

actual fun wgpuRenderPassEncoderDrawIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderDrawIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)

actual fun wgpuRenderPassEncoderDrawIndexedIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderDrawIndexedIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)

actual fun wgpuRenderPassEncoderExecuteBundles(handler: WGPURenderPassEncoder?, bundleCount: ULong, bundles: ArrayHolder<WGPURenderBundle>?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderExecuteBundles(handler?.handler, bundleCount, bundles?.handler)

actual fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderInsertDebugMarker(handler?.handler, markerLabel?.handler)

actual fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderPopDebugGroup(handler?.handler)

actual fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderPushDebugGroup(handler?.handler, groupLabel?.handler)

actual fun wgpuRenderPassEncoderSetStencilReference(handler: WGPURenderPassEncoder?, reference: UInt): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetStencilReference(handler?.handler, reference)

actual fun wgpuRenderPassEncoderSetBlendConstant(handler: WGPURenderPassEncoder?, color: WGPUColor?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetBlendConstant(handler?.handler, color?.toReference())

actual fun wgpuRenderPassEncoderSetViewport(handler: WGPURenderPassEncoder?, x: Float, y: Float, width: Float, height: Float, minDepth: Float, maxDepth: Float): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetViewport(handler?.handler, x, y, width, height, minDepth, maxDepth)

actual fun wgpuRenderPassEncoderSetScissorRect(handler: WGPURenderPassEncoder?, x: UInt, y: UInt, width: UInt, height: UInt): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetScissorRect(handler?.handler, x, y, width, height)

actual fun wgpuRenderPassEncoderSetVertexBuffer(handler: WGPURenderPassEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetVertexBuffer(handler?.handler, slot, buffer?.handler, offset, size)

actual fun wgpuRenderPassEncoderSetIndexBuffer(handler: WGPURenderPassEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetIndexBuffer(handler?.handler, buffer?.handler, format, offset, size)

actual fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: WGPURenderPassEncoder?, queryIndex: UInt): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderBeginOcclusionQuery(handler?.handler, queryIndex)

actual fun wgpuRenderPassEncoderEndOcclusionQuery(handler: WGPURenderPassEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderEndOcclusionQuery(handler?.handler)

actual fun wgpuRenderPassEncoderEnd(handler: WGPURenderPassEncoder?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderEnd(handler?.handler)

actual fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetLabel(handler?.handler, label?.handler)

actual fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPipelineRelease(handler?.handler)

actual fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout?
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPipelineGetBindGroupLayout(handler?.handler, groupIndex)
	?.let(::WGPUBindGroupLayout)

actual fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPipelineSetLabel(handler?.handler, label?.handler)

actual fun wgpuSamplerRelease(handler: WGPUSampler?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSamplerRelease(handler?.handler)

actual fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSamplerSetLabel(handler?.handler, label?.handler)

actual fun wgpuShaderModuleRelease(handler: WGPUShaderModule?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuShaderModuleRelease(handler?.handler)

actual fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callback: CallbackHolder<WGPUShaderModuleGetCompilationInfoCallback>?, userdata: NativeAddress?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuShaderModuleGetCompilationInfo(handler?.handler, callback?.callback, userdata)

actual fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuShaderModuleSetLabel(handler?.handler, label?.handler)

actual fun wgpuSurfaceRelease(handler: WGPUSurface?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceRelease(handler?.handler)

actual fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceConfigure(handler?.handler, config?.toReference())

actual fun wgpuSurfaceGetCapabilities(handler: WGPUSurface?, adapter: WGPUAdapter?, capabilities: WGPUSurfaceCapabilities?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceGetCapabilities(handler?.handler, adapter?.handler, capabilities?.toReference())

actual fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceGetCurrentTexture(handler?.handler, surfaceTexture?.toReference())

actual fun wgpuSurfacePresent(handler: WGPUSurface?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSurfacePresent(handler?.handler)

actual fun wgpuSurfaceUnconfigure(handler: WGPUSurface?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceUnconfigure(handler?.handler)

actual fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceSetLabel(handler?.handler, label?.handler)

actual fun wgpuTextureRelease(handler: WGPUTexture?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureRelease(handler?.handler)

actual fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView?
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureCreateView(handler?.handler, descriptor?.toReference())
	?.let(::WGPUTextureView)

actual fun wgpuTextureSetLabel(handler: WGPUTexture?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureSetLabel(handler?.handler, label?.handler)

actual fun wgpuTextureGetWidth(handler: WGPUTexture?): UInt
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetWidth(handler?.handler)

actual fun wgpuTextureGetHeight(handler: WGPUTexture?): UInt
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetHeight(handler?.handler)

actual fun wgpuTextureGetDepthOrArrayLayers(handler: WGPUTexture?): UInt
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetDepthOrArrayLayers(handler?.handler)

actual fun wgpuTextureGetMipLevelCount(handler: WGPUTexture?): UInt
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetMipLevelCount(handler?.handler)

actual fun wgpuTextureGetSampleCount(handler: WGPUTexture?): UInt
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetSampleCount(handler?.handler)

actual fun wgpuTextureGetDimension(handler: WGPUTexture?): WGPUTextureDimension
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetDimension(handler?.handler)

actual fun wgpuTextureGetFormat(handler: WGPUTexture?): WGPUTextureFormat
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetFormat(handler?.handler)

actual fun wgpuTextureGetUsage(handler: WGPUTexture?): UInt
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetUsage(handler?.handler)

actual fun wgpuTextureDestroy(handler: WGPUTexture?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureDestroy(handler?.handler)

actual fun wgpuTextureViewRelease(handler: WGPUTextureView?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureViewRelease(handler?.handler)

actual fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: CString?): Unit
	 = io.ygdrasil.wgpu.android.Functions.wgpuTextureViewSetLabel(handler?.handler, label?.handler)

