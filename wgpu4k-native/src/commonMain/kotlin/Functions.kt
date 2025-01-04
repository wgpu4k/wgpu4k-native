// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.CString
import ffi.NativeAddress
import ffi.CallbackHolder
import ffi.ArrayHolder


expect fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor?): WGPUInstance?
expect fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuSetLogLevel(level: WGPULogLevel): Unit
expect fun wgpuAdapterRelease(handler: WGPUAdapter?): Unit
expect fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPUSupportedLimits?): Boolean
expect fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean
expect fun wgpuAdapterEnumerateFeatures(handler: WGPUAdapter?, features: NativeAddress?): ULong
expect fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): Unit
expect fun wgpuAdapterRequestDevice(handler: WGPUAdapter?, descriptor: WGPUDeviceDescriptor?, callback: CallbackHolder<WGPUAdapterRequestDeviceCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuBindGroupRelease(handler: WGPUBindGroup?): Unit
expect fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: CString?): Unit
expect fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?): Unit
expect fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: CString?): Unit
expect fun wgpuBufferRelease(handler: WGPUBuffer?): Unit
expect fun wgpuBufferMapAsync(handler: WGPUBuffer?, mode: UInt, offset: ULong, size: ULong, callback: CallbackHolder<WGPUBufferMapAsyncCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuBufferGetMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
expect fun wgpuBufferGetConstMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
expect fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: CString?): Unit
expect fun wgpuBufferGetUsage(handler: WGPUBuffer?): UInt
expect fun wgpuBufferGetSize(handler: WGPUBuffer?): ULong
expect fun wgpuBufferGetMapState(handler: WGPUBuffer?): WGPUBufferMapState
expect fun wgpuBufferUnmap(handler: WGPUBuffer?): Unit
expect fun wgpuBufferDestroy(handler: WGPUBuffer?): Unit
expect fun wgpuCommandBufferRelease(handler: WGPUCommandBuffer?): Unit
expect fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: CString?): Unit
expect fun wgpuCommandEncoderRelease(handler: WGPUCommandEncoder?): Unit
expect fun wgpuCommandEncoderFinish(handler: WGPUCommandEncoder?, descriptor: WGPUCommandBufferDescriptor?): WGPUCommandBuffer?
expect fun wgpuCommandEncoderBeginComputePass(handler: WGPUCommandEncoder?, descriptor: WGPUComputePassDescriptor?): WGPUComputePassEncoder?
expect fun wgpuCommandEncoderBeginRenderPass(handler: WGPUCommandEncoder?, descriptor: WGPURenderPassDescriptor?): WGPURenderPassEncoder?
expect fun wgpuCommandEncoderCopyBufferToBuffer(handler: WGPUCommandEncoder?, source: WGPUBuffer?, sourceOffset: ULong, destination: WGPUBuffer?, destinationOffset: ULong, size: ULong): Unit
expect fun wgpuCommandEncoderCopyBufferToTexture(handler: WGPUCommandEncoder?, source: WGPUImageCopyBuffer?, destination: WGPUImageCopyTexture?, copySize: WGPUExtent3D?): Unit
expect fun wgpuCommandEncoderCopyTextureToBuffer(handler: WGPUCommandEncoder?, source: WGPUImageCopyTexture?, destination: WGPUImageCopyBuffer?, copySize: WGPUExtent3D?): Unit
expect fun wgpuCommandEncoderCopyTextureToTexture(handler: WGPUCommandEncoder?, source: WGPUImageCopyTexture?, destination: WGPUImageCopyTexture?, copySize: WGPUExtent3D?): Unit
expect fun wgpuCommandEncoderClearBuffer(handler: WGPUCommandEncoder?, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
expect fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: CString?): Unit
expect fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?): Unit
expect fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: CString?): Unit
expect fun wgpuCommandEncoderResolveQuerySet(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, firstQuery: UInt, queryCount: UInt, destination: WGPUBuffer?, destinationOffset: ULong): Unit
expect fun wgpuCommandEncoderWriteTimestamp(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, queryIndex: UInt): Unit
expect fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: CString?): Unit
expect fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?): Unit
expect fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: CString?): Unit
expect fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?): Unit
expect fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: CString?): Unit
expect fun wgpuComputePassEncoderSetPipeline(handler: WGPUComputePassEncoder?, pipeline: WGPUComputePipeline?): Unit
expect fun wgpuComputePassEncoderSetBindGroup(handler: WGPUComputePassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
expect fun wgpuComputePassEncoderDispatchWorkgroups(handler: WGPUComputePassEncoder?, workgroupCountX: UInt, workgroupCountY: UInt, workgroupCountZ: UInt): Unit
expect fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler: WGPUComputePassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
expect fun wgpuComputePassEncoderEnd(handler: WGPUComputePassEncoder?): Unit
expect fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: CString?): Unit
expect fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?): Unit
expect fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout?
expect fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: CString?): Unit
expect fun wgpuDeviceRelease(handler: WGPUDevice?): Unit
expect fun wgpuDeviceCreateBindGroup(handler: WGPUDevice?, descriptor: WGPUBindGroupDescriptor?): WGPUBindGroup?
expect fun wgpuDeviceCreateBindGroupLayout(handler: WGPUDevice?, descriptor: WGPUBindGroupLayoutDescriptor?): WGPUBindGroupLayout?
expect fun wgpuDeviceCreateBuffer(handler: WGPUDevice?, descriptor: WGPUBufferDescriptor?): WGPUBuffer?
expect fun wgpuDeviceCreateCommandEncoder(handler: WGPUDevice?, descriptor: WGPUCommandEncoderDescriptor?): WGPUCommandEncoder?
expect fun wgpuDeviceCreateComputePipeline(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?): WGPUComputePipeline?
expect fun wgpuDeviceCreateComputePipelineAsync(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?, callback: CallbackHolder<WGPUDeviceCreateComputePipelineAsyncCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout?
expect fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet?
expect fun wgpuDeviceCreateRenderPipelineAsync(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?, callback: CallbackHolder<WGPUDeviceCreateRenderPipelineAsyncCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuDeviceCreateRenderBundleEncoder(handler: WGPUDevice?, descriptor: WGPURenderBundleEncoderDescriptor?): WGPURenderBundleEncoder?
expect fun wgpuDeviceCreateRenderPipeline(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?): WGPURenderPipeline?
expect fun wgpuDeviceCreateSampler(handler: WGPUDevice?, descriptor: WGPUSamplerDescriptor?): WGPUSampler?
expect fun wgpuDeviceCreateShaderModule(handler: WGPUDevice?, descriptor: WGPUShaderModuleDescriptor?): WGPUShaderModule?
expect fun wgpuDeviceCreateTexture(handler: WGPUDevice?, descriptor: WGPUTextureDescriptor?): WGPUTexture?
expect fun wgpuDeviceDestroy(handler: WGPUDevice?): Unit
expect fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPUSupportedLimits?): Boolean
expect fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean
expect fun wgpuDeviceEnumerateFeatures(handler: WGPUDevice?, features: NativeAddress?): ULong
expect fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue?
expect fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter): Unit
expect fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callback: CallbackHolder<WGPUErrorCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: CString?): Unit
expect fun wgpuInstanceRelease(handler: WGPUInstance?): Unit
expect fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface?
expect fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLFeatureName): Boolean
expect fun wgpuInstanceProcessEvents(handler: WGPUInstance?): Unit
expect fun wgpuInstanceRequestAdapter(handler: WGPUInstance?, options: WGPURequestAdapterOptions?, callback: CallbackHolder<WGPUInstanceRequestAdapterCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?): Unit
expect fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: CString?): Unit
expect fun wgpuQuerySetRelease(handler: WGPUQuerySet?): Unit
expect fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: CString?): Unit
expect fun wgpuQuerySetGetType(handler: WGPUQuerySet?): WGPUQueryType
expect fun wgpuQuerySetGetCount(handler: WGPUQuerySet?): UInt
expect fun wgpuQuerySetDestroy(handler: WGPUQuerySet?): Unit
expect fun wgpuQueueRelease(handler: WGPUQueue?): Unit
expect fun wgpuQueueSubmit(handler: WGPUQueue?, commandCount: ULong, commands: ArrayHolder<WGPUCommandBuffer>?): Unit
expect fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callback: CallbackHolder<WGPUQueueOnSubmittedWorkDoneCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuQueueWriteBuffer(handler: WGPUQueue?, buffer: WGPUBuffer?, bufferOffset: ULong, data: NativeAddress?, size: ULong): Unit
expect fun wgpuQueueWriteTexture(handler: WGPUQueue?, destination: WGPUImageCopyTexture?, data: NativeAddress?, dataSize: ULong, dataLayout: WGPUTextureDataLayout?, writeSize: WGPUExtent3D?): Unit
expect fun wgpuQueueSetLabel(handler: WGPUQueue?, label: CString?): Unit
expect fun wgpuRenderBundleRelease(handler: WGPURenderBundle?): Unit
expect fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: CString?): Unit
expect fun wgpuRenderBundleEncoderRelease(handler: WGPURenderBundleEncoder?): Unit
expect fun wgpuRenderBundleEncoderSetPipeline(handler: WGPURenderBundleEncoder?, pipeline: WGPURenderPipeline?): Unit
expect fun wgpuRenderBundleEncoderSetBindGroup(handler: WGPURenderBundleEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
expect fun wgpuRenderBundleEncoderDraw(handler: WGPURenderBundleEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
expect fun wgpuRenderBundleEncoderDrawIndexed(handler: WGPURenderBundleEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
expect fun wgpuRenderBundleEncoderDrawIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
expect fun wgpuRenderBundleEncoderDrawIndexedIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
expect fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: CString?): Unit
expect fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?): Unit
expect fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: CString?): Unit
expect fun wgpuRenderBundleEncoderSetVertexBuffer(handler: WGPURenderBundleEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
expect fun wgpuRenderBundleEncoderSetIndexBuffer(handler: WGPURenderBundleEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit
expect fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle?
expect fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: CString?): Unit
expect fun wgpuRenderPassEncoderRelease(handler: WGPURenderPassEncoder?): Unit
expect fun wgpuRenderPassEncoderSetPipeline(handler: WGPURenderPassEncoder?, pipeline: WGPURenderPipeline?): Unit
expect fun wgpuRenderPassEncoderSetBindGroup(handler: WGPURenderPassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
expect fun wgpuRenderPassEncoderDraw(handler: WGPURenderPassEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
expect fun wgpuRenderPassEncoderDrawIndexed(handler: WGPURenderPassEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
expect fun wgpuRenderPassEncoderDrawIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
expect fun wgpuRenderPassEncoderDrawIndexedIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
expect fun wgpuRenderPassEncoderExecuteBundles(handler: WGPURenderPassEncoder?, bundleCount: ULong, bundles: ArrayHolder<WGPURenderBundle>?): Unit
expect fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: CString?): Unit
expect fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?): Unit
expect fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: CString?): Unit
expect fun wgpuRenderPassEncoderSetStencilReference(handler: WGPURenderPassEncoder?, reference: UInt): Unit
expect fun wgpuRenderPassEncoderSetBlendConstant(handler: WGPURenderPassEncoder?, color: WGPUColor?): Unit
expect fun wgpuRenderPassEncoderSetViewport(handler: WGPURenderPassEncoder?, x: Float, y: Float, width: Float, height: Float, minDepth: Float, maxDepth: Float): Unit
expect fun wgpuRenderPassEncoderSetScissorRect(handler: WGPURenderPassEncoder?, x: UInt, y: UInt, width: UInt, height: UInt): Unit
expect fun wgpuRenderPassEncoderSetVertexBuffer(handler: WGPURenderPassEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
expect fun wgpuRenderPassEncoderSetIndexBuffer(handler: WGPURenderPassEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit
expect fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: WGPURenderPassEncoder?, queryIndex: UInt): Unit
expect fun wgpuRenderPassEncoderEndOcclusionQuery(handler: WGPURenderPassEncoder?): Unit
expect fun wgpuRenderPassEncoderEnd(handler: WGPURenderPassEncoder?): Unit
expect fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: CString?): Unit
expect fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?): Unit
expect fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout?
expect fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: CString?): Unit
expect fun wgpuSamplerRelease(handler: WGPUSampler?): Unit
expect fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: CString?): Unit
expect fun wgpuShaderModuleRelease(handler: WGPUShaderModule?): Unit
expect fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callback: CallbackHolder<WGPUShaderModuleGetCompilationInfoCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: CString?): Unit
expect fun wgpuSurfaceRelease(handler: WGPUSurface?): Unit
expect fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?): Unit
expect fun wgpuSurfaceGetCapabilities(handler: WGPUSurface?, adapter: WGPUAdapter?, capabilities: WGPUSurfaceCapabilities?): Unit
expect fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?): Unit
expect fun wgpuSurfacePresent(handler: WGPUSurface?): Unit
expect fun wgpuSurfaceUnconfigure(handler: WGPUSurface?): Unit
expect fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: CString?): Unit
expect fun wgpuTextureRelease(handler: WGPUTexture?): Unit
expect fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView?
expect fun wgpuTextureSetLabel(handler: WGPUTexture?, label: CString?): Unit
expect fun wgpuTextureGetWidth(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetHeight(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetDepthOrArrayLayers(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetMipLevelCount(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetSampleCount(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetDimension(handler: WGPUTexture?): WGPUTextureDimension
expect fun wgpuTextureGetFormat(handler: WGPUTexture?): WGPUTextureFormat
expect fun wgpuTextureGetUsage(handler: WGPUTexture?): UInt
expect fun wgpuTextureDestroy(handler: WGPUTexture?): Unit
expect fun wgpuTextureViewRelease(handler: WGPUTextureView?): Unit
expect fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: CString?): Unit
