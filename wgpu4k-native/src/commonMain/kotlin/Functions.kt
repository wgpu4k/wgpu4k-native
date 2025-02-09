// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.CString
import ffi.NativeAddress
import ffi.CallbackHolder
import ffi.ArrayHolder


/**
 * Create a WGPUInstance
 */
expect fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor?): WGPUInstance?
/**
 * Query the supported instance capabilities.
 * @param capabilities The supported instance capabilities
 * @return Indicates if there was an @ref OutStructChainError.
 */
expect fun wgpuGetInstanceCapabilities(capabilities: WGPUInstanceCapabilities?): WGPUStatus
expect fun wgpuDevicePoll(device: WGPUDevice?, wait: Boolean, wrappedSubmissionIndex: NativeAddress?): Boolean
expect fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?): Unit
expect fun wgpuSetLogLevel(level: WGPULogLevel): Unit
expect fun wgpuAdapterRelease(handler: WGPUAdapter?): Unit
/**
 * 
 * @return Indicates if there was an @ref OutStructChainError.
 */
expect fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPULimits?): WGPUStatus
expect fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean
/**
 * Get the list of @ref WGPUFeatureName values supported by the adapter.
 */
expect fun wgpuAdapterGetFeatures(handler: WGPUAdapter?, features: WGPUSupportedFeatures?): Unit
/**
 * 
 * @return Indicates if there was an @ref OutStructChainError.
 */
expect fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): WGPUStatus
expect fun wgpuAdapterRequestDevice(handler: WGPUAdapter?, descriptor: WGPUDeviceDescriptor?, callbackInfo: WGPURequestDeviceCallbackInfo): Unit
expect fun wgpuBindGroupRelease(handler: WGPUBindGroup?): Unit
expect fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: WGPUStringView): Unit
expect fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?): Unit
expect fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: WGPUStringView): Unit
expect fun wgpuBufferRelease(handler: WGPUBuffer?): Unit
expect fun wgpuBufferMapAsync(handler: WGPUBuffer?, mode: ULong, offset: ULong, size: ULong, callbackInfo: WGPUBufferMapCallbackInfo): Unit
/**
 * 
 * @param offset Byte offset relative to the beginning of the buffer.
 * @param size Byte size of the range to get. The returned pointer is valid for exactly this many bytes.
 * @return Returns a mutable pointer to beginning of the mapped range.
 * Returns [NULL] with @ref ImplementationDefinedLogging if:
 * 
 * - There is any content-timeline error as defined in the WebGPU specification for [getMappedRange()] (alignments, overlaps, etc.)
 * - The buffer is not mapped with @ref WGPUMapMode_Write.
 */
expect fun wgpuBufferGetMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
/**
 * 
 * @param offset Byte offset relative to the beginning of the buffer.
 * @param size Byte size of the range to get. The returned pointer is valid for exactly this many bytes.
 * @return Returns a const pointer to beginning of the mapped range.
 * It must not be written; writing to this range causes undefined behavior.
 * Returns [NULL] with @ref ImplementationDefinedLogging if:
 * 
 * - There is any content-timeline error as defined in the WebGPU specification for [getMappedRange()] (alignments, overlaps, etc.)
 *   **except** for overlaps with other *const* ranges, which are allowed in C.
 *   (JS does not allow this because const ranges do not exist.)
 */
expect fun wgpuBufferGetConstMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress?
expect fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: WGPUStringView): Unit
expect fun wgpuBufferGetUsage(handler: WGPUBuffer?): ULong
expect fun wgpuBufferGetSize(handler: WGPUBuffer?): ULong
expect fun wgpuBufferGetMapState(handler: WGPUBuffer?): WGPUBufferMapState
expect fun wgpuBufferUnmap(handler: WGPUBuffer?): Unit
expect fun wgpuBufferDestroy(handler: WGPUBuffer?): Unit
expect fun wgpuCommandBufferRelease(handler: WGPUCommandBuffer?): Unit
expect fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: WGPUStringView): Unit
expect fun wgpuCommandEncoderRelease(handler: WGPUCommandEncoder?): Unit
expect fun wgpuCommandEncoderFinish(handler: WGPUCommandEncoder?, descriptor: WGPUCommandBufferDescriptor?): WGPUCommandBuffer?
expect fun wgpuCommandEncoderBeginComputePass(handler: WGPUCommandEncoder?, descriptor: WGPUComputePassDescriptor?): WGPUComputePassEncoder?
expect fun wgpuCommandEncoderBeginRenderPass(handler: WGPUCommandEncoder?, descriptor: WGPURenderPassDescriptor?): WGPURenderPassEncoder?
expect fun wgpuCommandEncoderCopyBufferToBuffer(handler: WGPUCommandEncoder?, source: WGPUBuffer?, sourceOffset: ULong, destination: WGPUBuffer?, destinationOffset: ULong, size: ULong): Unit
expect fun wgpuCommandEncoderCopyBufferToTexture(handler: WGPUCommandEncoder?, source: WGPUTexelCopyBufferInfo?, destination: WGPUTexelCopyTextureInfo?, copySize: WGPUExtent3D?): Unit
expect fun wgpuCommandEncoderCopyTextureToBuffer(handler: WGPUCommandEncoder?, source: WGPUTexelCopyTextureInfo?, destination: WGPUTexelCopyBufferInfo?, copySize: WGPUExtent3D?): Unit
expect fun wgpuCommandEncoderCopyTextureToTexture(handler: WGPUCommandEncoder?, source: WGPUTexelCopyTextureInfo?, destination: WGPUTexelCopyTextureInfo?, copySize: WGPUExtent3D?): Unit
expect fun wgpuCommandEncoderClearBuffer(handler: WGPUCommandEncoder?, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
expect fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: WGPUStringView): Unit
expect fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?): Unit
expect fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: WGPUStringView): Unit
expect fun wgpuCommandEncoderResolveQuerySet(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, firstQuery: UInt, queryCount: UInt, destination: WGPUBuffer?, destinationOffset: ULong): Unit
expect fun wgpuCommandEncoderWriteTimestamp(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, queryIndex: UInt): Unit
expect fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: WGPUStringView): Unit
expect fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?): Unit
expect fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: WGPUStringView): Unit
expect fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?): Unit
expect fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: WGPUStringView): Unit
expect fun wgpuComputePassEncoderSetPipeline(handler: WGPUComputePassEncoder?, pipeline: WGPUComputePipeline?): Unit
/**
 * 
 * @param dynamicOffsetCount number of elements in the array [dynamicOffsets]
 */
expect fun wgpuComputePassEncoderSetBindGroup(handler: WGPUComputePassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
expect fun wgpuComputePassEncoderDispatchWorkgroups(handler: WGPUComputePassEncoder?, workgroupCountX: UInt, workgroupCountY: UInt, workgroupCountZ: UInt): Unit
expect fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler: WGPUComputePassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
expect fun wgpuComputePassEncoderEnd(handler: WGPUComputePassEncoder?): Unit
expect fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: WGPUStringView): Unit
expect fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?): Unit
expect fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout?
expect fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: WGPUStringView): Unit
expect fun wgpuDeviceRelease(handler: WGPUDevice?): Unit
expect fun wgpuDeviceCreateBindGroup(handler: WGPUDevice?, descriptor: WGPUBindGroupDescriptor?): WGPUBindGroup?
expect fun wgpuDeviceCreateBindGroupLayout(handler: WGPUDevice?, descriptor: WGPUBindGroupLayoutDescriptor?): WGPUBindGroupLayout?
expect fun wgpuDeviceCreateBuffer(handler: WGPUDevice?, descriptor: WGPUBufferDescriptor?): WGPUBuffer?
expect fun wgpuDeviceCreateCommandEncoder(handler: WGPUDevice?, descriptor: WGPUCommandEncoderDescriptor?): WGPUCommandEncoder?
expect fun wgpuDeviceCreateComputePipeline(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?): WGPUComputePipeline?
expect fun wgpuDeviceCreateComputePipelineAsync(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?, callbackInfo: WGPUCreateComputePipelineAsyncCallbackInfo): Unit
expect fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout?
expect fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet?
expect fun wgpuDeviceCreateRenderPipelineAsync(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?, callbackInfo: WGPUCreateRenderPipelineAsyncCallbackInfo): Unit
expect fun wgpuDeviceCreateRenderBundleEncoder(handler: WGPUDevice?, descriptor: WGPURenderBundleEncoderDescriptor?): WGPURenderBundleEncoder?
expect fun wgpuDeviceCreateRenderPipeline(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?): WGPURenderPipeline?
expect fun wgpuDeviceCreateSampler(handler: WGPUDevice?, descriptor: WGPUSamplerDescriptor?): WGPUSampler?
expect fun wgpuDeviceCreateShaderModule(handler: WGPUDevice?, descriptor: WGPUShaderModuleDescriptor?): WGPUShaderModule?
expect fun wgpuDeviceCreateTexture(handler: WGPUDevice?, descriptor: WGPUTextureDescriptor?): WGPUTexture?
expect fun wgpuDeviceDestroy(handler: WGPUDevice?): Unit
/**
 * 
 * @return The @ref WGPUFuture for the device-lost event of the device.
 */
expect fun wgpuDeviceGetLostFuture(handler: WGPUDevice?): WGPUFuture
/**
 * 
 * @return Indicates if there was an @ref OutStructChainError.
 */
expect fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPULimits?): WGPUStatus
expect fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean
/**
 * Get the list of @ref WGPUFeatureName values supported by the device.
 */
expect fun wgpuDeviceGetFeatures(handler: WGPUDevice?, features: WGPUSupportedFeatures?): Unit
expect fun wgpuDeviceGetAdapterInfo(handler: WGPUDevice?): WGPUAdapterInfo
expect fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue?
expect fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter): Unit
expect fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callbackInfo: WGPUPopErrorScopeCallbackInfo): Unit
expect fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: WGPUStringView): Unit
expect fun wgpuInstanceRelease(handler: WGPUInstance?): Unit
/**
 * Creates a @ref WGPUSurface, see @ref Surface-Creation for more details.
 * @param descriptor The description of the @ref WGPUSurface to create.
 * @return A new @ref WGPUSurface for this descriptor (or an error @ref WGPUSurface).
 */
expect fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface?
/**
 * Get the list of @ref WGPUWGSLLanguageFeatureName values supported by the instance.
 */
expect fun wgpuInstanceGetWGSLLanguageFeatures(handler: WGPUInstance?, features: WGPUSupportedWGSLLanguageFeatures?): WGPUStatus
expect fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLLanguageFeatureName): Boolean
/**
 * Processes asynchronous events on this [WGPUInstance], calling any callbacks for asynchronous operations created with [WGPUCallbackMode_AllowProcessEvents].
 * 
 * See @ref Process-Events for more information.
 */
expect fun wgpuInstanceProcessEvents(handler: WGPUInstance?): Unit
expect fun wgpuInstanceRequestAdapter(handler: WGPUInstance?, options: WGPURequestAdapterOptions?, callbackInfo: WGPURequestAdapterCallbackInfo): Unit
/**
 * Wait for at least one WGPUFuture in [futures] to complete, and call callbacks of the respective completed asynchronous operations.
 * 
 * See @ref Wait-Any for more information.
 */
expect fun wgpuInstanceWaitAny(handler: WGPUInstance?, futureCount: ULong, futures: WGPUFutureWaitInfo?, timeoutNS: ULong): WGPUWaitStatus
expect fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?): Unit
expect fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: WGPUStringView): Unit
expect fun wgpuQuerySetRelease(handler: WGPUQuerySet?): Unit
expect fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: WGPUStringView): Unit
expect fun wgpuQuerySetGetType(handler: WGPUQuerySet?): WGPUQueryType
expect fun wgpuQuerySetGetCount(handler: WGPUQuerySet?): UInt
expect fun wgpuQuerySetDestroy(handler: WGPUQuerySet?): Unit
expect fun wgpuQueueRelease(handler: WGPUQueue?): Unit
/**
 * 
 * @param commandCount number of elements in the array [commands]
 */
expect fun wgpuQueueSubmit(handler: WGPUQueue?, commandCount: ULong, commands: ArrayHolder<WGPUCommandBuffer>?): Unit
expect fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callbackInfo: WGPUQueueWorkDoneCallbackInfo): Unit
/**
 * Produces a @ref DeviceError both content-timeline ([size] alignment) and device-timeline
 * errors defined by the WebGPU specification.
 */
expect fun wgpuQueueWriteBuffer(handler: WGPUQueue?, buffer: WGPUBuffer?, bufferOffset: ULong, data: NativeAddress?, size: ULong): Unit
expect fun wgpuQueueWriteTexture(handler: WGPUQueue?, destination: WGPUTexelCopyTextureInfo?, data: NativeAddress?, dataSize: ULong, dataLayout: WGPUTexelCopyBufferLayout?, writeSize: WGPUExtent3D?): Unit
expect fun wgpuQueueSetLabel(handler: WGPUQueue?, label: WGPUStringView): Unit
expect fun wgpuRenderBundleRelease(handler: WGPURenderBundle?): Unit
expect fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: WGPUStringView): Unit
expect fun wgpuRenderBundleEncoderRelease(handler: WGPURenderBundleEncoder?): Unit
expect fun wgpuRenderBundleEncoderSetPipeline(handler: WGPURenderBundleEncoder?, pipeline: WGPURenderPipeline?): Unit
/**
 * 
 * @param dynamicOffsetCount number of elements in the array [dynamicOffsets]
 */
expect fun wgpuRenderBundleEncoderSetBindGroup(handler: WGPURenderBundleEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
expect fun wgpuRenderBundleEncoderDraw(handler: WGPURenderBundleEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
expect fun wgpuRenderBundleEncoderDrawIndexed(handler: WGPURenderBundleEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
expect fun wgpuRenderBundleEncoderDrawIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
expect fun wgpuRenderBundleEncoderDrawIndexedIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
expect fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: WGPUStringView): Unit
expect fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?): Unit
expect fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: WGPUStringView): Unit
expect fun wgpuRenderBundleEncoderSetVertexBuffer(handler: WGPURenderBundleEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
expect fun wgpuRenderBundleEncoderSetIndexBuffer(handler: WGPURenderBundleEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit
expect fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle?
expect fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: WGPUStringView): Unit
expect fun wgpuRenderPassEncoderRelease(handler: WGPURenderPassEncoder?): Unit
expect fun wgpuRenderPassEncoderSetPipeline(handler: WGPURenderPassEncoder?, pipeline: WGPURenderPipeline?): Unit
/**
 * 
 * @param dynamicOffsetCount number of elements in the array [dynamicOffsets]
 */
expect fun wgpuRenderPassEncoderSetBindGroup(handler: WGPURenderPassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit
expect fun wgpuRenderPassEncoderDraw(handler: WGPURenderPassEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
expect fun wgpuRenderPassEncoderDrawIndexed(handler: WGPURenderPassEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
expect fun wgpuRenderPassEncoderDrawIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
expect fun wgpuRenderPassEncoderDrawIndexedIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit
/**
 * 
 * @param bundleCount number of elements in the array [bundles]
 */
expect fun wgpuRenderPassEncoderExecuteBundles(handler: WGPURenderPassEncoder?, bundleCount: ULong, bundles: ArrayHolder<WGPURenderBundle>?): Unit
expect fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: WGPUStringView): Unit
expect fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?): Unit
expect fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: WGPUStringView): Unit
expect fun wgpuRenderPassEncoderSetStencilReference(handler: WGPURenderPassEncoder?, reference: UInt): Unit
expect fun wgpuRenderPassEncoderSetBlendConstant(handler: WGPURenderPassEncoder?, color: WGPUColor?): Unit
expect fun wgpuRenderPassEncoderSetViewport(handler: WGPURenderPassEncoder?, x: Float, y: Float, width: Float, height: Float, minDepth: Float, maxDepth: Float): Unit
expect fun wgpuRenderPassEncoderSetScissorRect(handler: WGPURenderPassEncoder?, x: UInt, y: UInt, width: UInt, height: UInt): Unit
expect fun wgpuRenderPassEncoderSetVertexBuffer(handler: WGPURenderPassEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit
expect fun wgpuRenderPassEncoderSetIndexBuffer(handler: WGPURenderPassEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit
expect fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: WGPURenderPassEncoder?, queryIndex: UInt): Unit
expect fun wgpuRenderPassEncoderEndOcclusionQuery(handler: WGPURenderPassEncoder?): Unit
expect fun wgpuRenderPassEncoderEnd(handler: WGPURenderPassEncoder?): Unit
expect fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: WGPUStringView): Unit
expect fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?): Unit
expect fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout?
expect fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: WGPUStringView): Unit
expect fun wgpuSamplerRelease(handler: WGPUSampler?): Unit
expect fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: WGPUStringView): Unit
expect fun wgpuShaderModuleRelease(handler: WGPUShaderModule?): Unit
expect fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callbackInfo: WGPUCompilationInfoCallbackInfo): Unit
expect fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: WGPUStringView): Unit
expect fun wgpuSurfaceRelease(handler: WGPUSurface?): Unit
/**
 * Configures parameters for rendering to [surface].
 * Produces a @ref DeviceError for all content-timeline errors defined by the WebGPU specification.
 * 
 * See @ref Surface-Configuration for more details.
 * @param config The new configuration to use.
 */
expect fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?): Unit
/**
 * Provides information on how [adapter] is able to use [surface].
 * See @ref Surface-Capabilities for more details.
 * @param adapter The @ref WGPUAdapter to get capabilities for presenting to this @ref WGPUSurface.
 * @param capabilities The structure to fill capabilities in.
 * It may contain memory allocations so [wgpuSurfaceCapabilitiesFreeMembers] must be called to avoid memory leaks.
 * @return Indicates if there was an @ref OutStructChainError.
 */
expect fun wgpuSurfaceGetCapabilities(handler: WGPUSurface?, adapter: WGPUAdapter?, capabilities: WGPUSurfaceCapabilities?): WGPUStatus
/**
 * Returns the @ref WGPUTexture to render to [surface] this frame along with metadata on the frame.
 * Returns [NULL] and @ref WGPUSurfaceGetCurrentTextureStatus_Error if the surface is not configured.
 * 
 * See @ref Surface-Presenting for more details.
 * @param surfaceTexture The structure to fill the @ref WGPUTexture and metadata in.
 */
expect fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?): Unit
/**
 * Shows [surface]'s current texture to the user.
 * See @ref Surface-Presenting for more details.
 * @return Returns @ref WGPUStatus_Error if the surface doesn't have a current texture.
 */
expect fun wgpuSurfacePresent(handler: WGPUSurface?): WGPUStatus
/**
 * Removes the configuration for [surface].
 * See @ref Surface-Configuration for more details.
 */
expect fun wgpuSurfaceUnconfigure(handler: WGPUSurface?): Unit
/**
 * Modifies the label used to refer to [surface].
 * @param label The new label.
 */
expect fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: WGPUStringView): Unit
expect fun wgpuTextureRelease(handler: WGPUTexture?): Unit
expect fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView?
expect fun wgpuTextureSetLabel(handler: WGPUTexture?, label: WGPUStringView): Unit
expect fun wgpuTextureGetWidth(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetHeight(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetDepthOrArrayLayers(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetMipLevelCount(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetSampleCount(handler: WGPUTexture?): UInt
expect fun wgpuTextureGetDimension(handler: WGPUTexture?): WGPUTextureDimension
expect fun wgpuTextureGetFormat(handler: WGPUTexture?): WGPUTextureFormat
expect fun wgpuTextureGetUsage(handler: WGPUTexture?): ULong
expect fun wgpuTextureDestroy(handler: WGPUTexture?): Unit
expect fun wgpuTextureViewRelease(handler: WGPUTextureView?): Unit
expect fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: WGPUStringView): Unit
