// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.ArrayHolder
import ffi.CString
import ffi.CallbackHolder
import ffi.NativeAddress
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.UInt
import kotlin.ULong

/**
 * Create a WGPUInstance
 */
public expect fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor?): WGPUInstance?

/**
 * Query the supported instance capabilities.
 * @param capabilities The supported instance capabilities
 * @return Indicates if there was an @ref OutStructChainError.
 */
public expect fun wgpuGetInstanceCapabilities(capabilities: WGPUInstanceCapabilities?): WGPUStatus

public expect fun wgpuDevicePoll(
	device: WGPUDevice?,
	wait: Boolean,
	wrappedSubmissionIndex: NativeAddress?,
): Boolean

public expect fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?)

public expect fun wgpuSetLogLevel(level: WGPULogLevel)

public expect fun wgpuAdapterRelease(handler: WGPUAdapter?)

/**
 * @return Indicates if there was an @ref OutStructChainError.
 */
public expect fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPULimits?): WGPUStatus

public expect fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean

/**
 * Get the list of @ref WGPUFeatureName values supported by the adapter.
 */
public expect fun wgpuAdapterGetFeatures(handler: WGPUAdapter?, features: WGPUSupportedFeatures?)

/**
 * @return Indicates if there was an @ref OutStructChainError.
 */
public expect fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): WGPUStatus

public expect fun wgpuAdapterRequestDevice(
	handler: WGPUAdapter?,
	descriptor: WGPUDeviceDescriptor?,
	callbackInfo: WGPURequestDeviceCallbackInfo,
)

public expect fun wgpuBindGroupRelease(handler: WGPUBindGroup?)

public expect fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: WGPUStringView)

public expect fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?)

public expect fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: WGPUStringView)

public expect fun wgpuBufferRelease(handler: WGPUBuffer?)

public expect fun wgpuBufferMapAsync(
	handler: WGPUBuffer?,
	mode: ULong,
	offset: ULong,
	size: ULong,
	callbackInfo: WGPUBufferMapCallbackInfo,
)

/**
 * @param offset Byte offset relative to the beginning of the buffer.
 * @param size Byte size of the range to get. The returned pointer is valid for exactly this many bytes.
 * @return Returns a mutable pointer to beginning of the mapped range.
 * Returns [NULL] with @ref ImplementationDefinedLogging if:
 *
 * - There is any content-timeline error as defined in the WebGPU specification for [getMappedRange()] (alignments, overlaps, etc.)
 * - The buffer is not mapped with @ref WGPUMapMode_Write.
 */
public expect fun wgpuBufferGetMappedRange(
	handler: WGPUBuffer?,
	offset: ULong,
	size: ULong,
): NativeAddress?

/**
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
public expect fun wgpuBufferGetConstMappedRange(
	handler: WGPUBuffer?,
	offset: ULong,
	size: ULong,
): NativeAddress?

public expect fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: WGPUStringView)

public expect fun wgpuBufferGetUsage(handler: WGPUBuffer?): ULong

public expect fun wgpuBufferGetSize(handler: WGPUBuffer?): ULong

public expect fun wgpuBufferGetMapState(handler: WGPUBuffer?): WGPUBufferMapState

public expect fun wgpuBufferUnmap(handler: WGPUBuffer?)

public expect fun wgpuBufferDestroy(handler: WGPUBuffer?)

public expect fun wgpuCommandBufferRelease(handler: WGPUCommandBuffer?)

public expect fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: WGPUStringView)

public expect fun wgpuCommandEncoderRelease(handler: WGPUCommandEncoder?)

public expect fun wgpuCommandEncoderFinish(handler: WGPUCommandEncoder?, descriptor: WGPUCommandBufferDescriptor?): WGPUCommandBuffer?

public expect fun wgpuCommandEncoderBeginComputePass(handler: WGPUCommandEncoder?, descriptor: WGPUComputePassDescriptor?): WGPUComputePassEncoder?

public expect fun wgpuCommandEncoderBeginRenderPass(handler: WGPUCommandEncoder?, descriptor: WGPURenderPassDescriptor?): WGPURenderPassEncoder?

public expect fun wgpuCommandEncoderCopyBufferToBuffer(
	handler: WGPUCommandEncoder?,
	source: WGPUBuffer?,
	sourceOffset: ULong,
	destination: WGPUBuffer?,
	destinationOffset: ULong,
	size: ULong,
)

public expect fun wgpuCommandEncoderCopyBufferToTexture(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyBufferInfo?,
	destination: WGPUTexelCopyTextureInfo?,
	copySize: WGPUExtent3D?,
)

public expect fun wgpuCommandEncoderCopyTextureToBuffer(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyTextureInfo?,
	destination: WGPUTexelCopyBufferInfo?,
	copySize: WGPUExtent3D?,
)

public expect fun wgpuCommandEncoderCopyTextureToTexture(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyTextureInfo?,
	destination: WGPUTexelCopyTextureInfo?,
	copySize: WGPUExtent3D?,
)

public expect fun wgpuCommandEncoderClearBuffer(
	handler: WGPUCommandEncoder?,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
)

public expect fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: WGPUStringView)

public expect fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?)

public expect fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: WGPUStringView)

public expect fun wgpuCommandEncoderResolveQuerySet(
	handler: WGPUCommandEncoder?,
	querySet: WGPUQuerySet?,
	firstQuery: UInt,
	queryCount: UInt,
	destination: WGPUBuffer?,
	destinationOffset: ULong,
)

public expect fun wgpuCommandEncoderWriteTimestamp(
	handler: WGPUCommandEncoder?,
	querySet: WGPUQuerySet?,
	queryIndex: UInt,
)

public expect fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: WGPUStringView)

public expect fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?)

public expect fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: WGPUStringView)

public expect fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?)

public expect fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: WGPUStringView)

public expect fun wgpuComputePassEncoderSetPipeline(handler: WGPUComputePassEncoder?, pipeline: WGPUComputePipeline?)

/**
 * @param dynamicOffsetCount number of elements in the array [dynamicOffsets]
 */
public expect fun wgpuComputePassEncoderSetBindGroup(
	handler: WGPUComputePassEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
)

public expect fun wgpuComputePassEncoderDispatchWorkgroups(
	handler: WGPUComputePassEncoder?,
	workgroupCountX: UInt,
	workgroupCountY: UInt,
	workgroupCountZ: UInt,
)

public expect fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(
	handler: WGPUComputePassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
)

public expect fun wgpuComputePassEncoderEnd(handler: WGPUComputePassEncoder?)

public expect fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: WGPUStringView)

public expect fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?)

public expect fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout?

public expect fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: WGPUStringView)

public expect fun wgpuDeviceRelease(handler: WGPUDevice?)

public expect fun wgpuDeviceCreateBindGroup(handler: WGPUDevice?, descriptor: WGPUBindGroupDescriptor?): WGPUBindGroup?

public expect fun wgpuDeviceCreateBindGroupLayout(handler: WGPUDevice?, descriptor: WGPUBindGroupLayoutDescriptor?): WGPUBindGroupLayout?

public expect fun wgpuDeviceCreateBuffer(handler: WGPUDevice?, descriptor: WGPUBufferDescriptor?): WGPUBuffer?

public expect fun wgpuDeviceCreateCommandEncoder(handler: WGPUDevice?, descriptor: WGPUCommandEncoderDescriptor?): WGPUCommandEncoder?

public expect fun wgpuDeviceCreateComputePipeline(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?): WGPUComputePipeline?

public expect fun wgpuDeviceCreateComputePipelineAsync(
	handler: WGPUDevice?,
	descriptor: WGPUComputePipelineDescriptor?,
	callbackInfo: WGPUCreateComputePipelineAsyncCallbackInfo,
)

public expect fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout?

public expect fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet?

public expect fun wgpuDeviceCreateRenderPipelineAsync(
	handler: WGPUDevice?,
	descriptor: WGPURenderPipelineDescriptor?,
	callbackInfo: WGPUCreateRenderPipelineAsyncCallbackInfo,
)

public expect fun wgpuDeviceCreateRenderBundleEncoder(handler: WGPUDevice?, descriptor: WGPURenderBundleEncoderDescriptor?): WGPURenderBundleEncoder?

public expect fun wgpuDeviceCreateRenderPipeline(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?): WGPURenderPipeline?

public expect fun wgpuDeviceCreateSampler(handler: WGPUDevice?, descriptor: WGPUSamplerDescriptor?): WGPUSampler?

public expect fun wgpuDeviceCreateShaderModule(handler: WGPUDevice?, descriptor: WGPUShaderModuleDescriptor?): WGPUShaderModule?

public expect fun wgpuDeviceCreateTexture(handler: WGPUDevice?, descriptor: WGPUTextureDescriptor?): WGPUTexture?

public expect fun wgpuDeviceDestroy(handler: WGPUDevice?)

/**
 * @return The @ref WGPUFuture for the device-lost event of the device.
 */
public expect fun wgpuDeviceGetLostFuture(handler: WGPUDevice?): WGPUFuture

/**
 * @return Indicates if there was an @ref OutStructChainError.
 */
public expect fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPULimits?): WGPUStatus

public expect fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean

/**
 * Get the list of @ref WGPUFeatureName values supported by the device.
 */
public expect fun wgpuDeviceGetFeatures(handler: WGPUDevice?, features: WGPUSupportedFeatures?)

public expect fun wgpuDeviceGetAdapterInfo(handler: WGPUDevice?): WGPUAdapterInfo

public expect fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue?

public expect fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter)

public expect fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callbackInfo: WGPUPopErrorScopeCallbackInfo)

public expect fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: WGPUStringView)

public expect fun wgpuInstanceRelease(handler: WGPUInstance?)

/**
 * Creates a @ref WGPUSurface, see @ref Surface-Creation for more details.
 * @param descriptor The description of the @ref WGPUSurface to create.
 * @return A new @ref WGPUSurface for this descriptor (or an error @ref WGPUSurface).
 */
public expect fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface?

/**
 * Get the list of @ref WGPUWGSLLanguageFeatureName values supported by the instance.
 */
public expect fun wgpuInstanceGetWGSLLanguageFeatures(handler: WGPUInstance?, features: WGPUSupportedWGSLLanguageFeatures?): WGPUStatus

public expect fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLLanguageFeatureName): Boolean

/**
 * Processes asynchronous events on this [WGPUInstance], calling any callbacks for asynchronous operations created with [WGPUCallbackMode_AllowProcessEvents].
 *
 * See @ref Process-Events for more information.
 */
public expect fun wgpuInstanceProcessEvents(handler: WGPUInstance?)

public expect fun wgpuInstanceRequestAdapter(
	handler: WGPUInstance?,
	options: WGPURequestAdapterOptions?,
	callbackInfo: WGPURequestAdapterCallbackInfo,
)

/**
 * Wait for at least one WGPUFuture in [futures] to complete, and call callbacks of the respective completed asynchronous operations.
 *
 * See @ref Wait-Any for more information.
 */
public expect fun wgpuInstanceWaitAny(
	handler: WGPUInstance?,
	futureCount: ULong,
	futures: WGPUFutureWaitInfo?,
	timeoutNS: ULong,
): WGPUWaitStatus

public expect fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?)

public expect fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: WGPUStringView)

public expect fun wgpuQuerySetRelease(handler: WGPUQuerySet?)

public expect fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: WGPUStringView)

public expect fun wgpuQuerySetGetType(handler: WGPUQuerySet?): WGPUQueryType

public expect fun wgpuQuerySetGetCount(handler: WGPUQuerySet?): UInt

public expect fun wgpuQuerySetDestroy(handler: WGPUQuerySet?)

public expect fun wgpuQueueRelease(handler: WGPUQueue?)

/**
 * @param commandCount number of elements in the array [commands]
 */
public expect fun wgpuQueueSubmit(
	handler: WGPUQueue?,
	commandCount: ULong,
	commands: ArrayHolder<WGPUCommandBuffer>?,
)

public expect fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callbackInfo: WGPUQueueWorkDoneCallbackInfo)

/**
 * Produces a @ref DeviceError both content-timeline ([size] alignment) and device-timeline
 * errors defined by the WebGPU specification.
 */
public expect fun wgpuQueueWriteBuffer(
	handler: WGPUQueue?,
	buffer: WGPUBuffer?,
	bufferOffset: ULong,
	`data`: NativeAddress?,
	size: ULong,
)

public expect fun wgpuQueueWriteTexture(
	handler: WGPUQueue?,
	destination: WGPUTexelCopyTextureInfo?,
	`data`: NativeAddress?,
	dataSize: ULong,
	dataLayout: WGPUTexelCopyBufferLayout?,
	writeSize: WGPUExtent3D?,
)

public expect fun wgpuQueueSetLabel(handler: WGPUQueue?, label: WGPUStringView)

public expect fun wgpuRenderBundleRelease(handler: WGPURenderBundle?)

public expect fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: WGPUStringView)

public expect fun wgpuRenderBundleEncoderRelease(handler: WGPURenderBundleEncoder?)

public expect fun wgpuRenderBundleEncoderSetPipeline(handler: WGPURenderBundleEncoder?, pipeline: WGPURenderPipeline?)

/**
 * @param dynamicOffsetCount number of elements in the array [dynamicOffsets]
 */
public expect fun wgpuRenderBundleEncoderSetBindGroup(
	handler: WGPURenderBundleEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
)

public expect fun wgpuRenderBundleEncoderDraw(
	handler: WGPURenderBundleEncoder?,
	vertexCount: UInt,
	instanceCount: UInt,
	firstVertex: UInt,
	firstInstance: UInt,
)

public expect fun wgpuRenderBundleEncoderDrawIndexed(
	handler: WGPURenderBundleEncoder?,
	indexCount: UInt,
	instanceCount: UInt,
	firstIndex: UInt,
	baseVertex: Int,
	firstInstance: UInt,
)

public expect fun wgpuRenderBundleEncoderDrawIndirect(
	handler: WGPURenderBundleEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
)

public expect fun wgpuRenderBundleEncoderDrawIndexedIndirect(
	handler: WGPURenderBundleEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
)

public expect fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: WGPUStringView)

public expect fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?)

public expect fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: WGPUStringView)

public expect fun wgpuRenderBundleEncoderSetVertexBuffer(
	handler: WGPURenderBundleEncoder?,
	slot: UInt,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
)

public expect fun wgpuRenderBundleEncoderSetIndexBuffer(
	handler: WGPURenderBundleEncoder?,
	buffer: WGPUBuffer?,
	format: WGPUIndexFormat,
	offset: ULong,
	size: ULong,
)

public expect fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle?

public expect fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: WGPUStringView)

public expect fun wgpuRenderPassEncoderRelease(handler: WGPURenderPassEncoder?)

public expect fun wgpuRenderPassEncoderSetPipeline(handler: WGPURenderPassEncoder?, pipeline: WGPURenderPipeline?)

/**
 * @param dynamicOffsetCount number of elements in the array [dynamicOffsets]
 */
public expect fun wgpuRenderPassEncoderSetBindGroup(
	handler: WGPURenderPassEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
)

public expect fun wgpuRenderPassEncoderDraw(
	handler: WGPURenderPassEncoder?,
	vertexCount: UInt,
	instanceCount: UInt,
	firstVertex: UInt,
	firstInstance: UInt,
)

public expect fun wgpuRenderPassEncoderDrawIndexed(
	handler: WGPURenderPassEncoder?,
	indexCount: UInt,
	instanceCount: UInt,
	firstIndex: UInt,
	baseVertex: Int,
	firstInstance: UInt,
)

public expect fun wgpuRenderPassEncoderDrawIndirect(
	handler: WGPURenderPassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
)

public expect fun wgpuRenderPassEncoderDrawIndexedIndirect(
	handler: WGPURenderPassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
)

/**
 * @param bundleCount number of elements in the array [bundles]
 */
public expect fun wgpuRenderPassEncoderExecuteBundles(
	handler: WGPURenderPassEncoder?,
	bundleCount: ULong,
	bundles: ArrayHolder<WGPURenderBundle>?,
)

public expect fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: WGPUStringView)

public expect fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?)

public expect fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: WGPUStringView)

public expect fun wgpuRenderPassEncoderSetStencilReference(handler: WGPURenderPassEncoder?, reference: UInt)

public expect fun wgpuRenderPassEncoderSetBlendConstant(handler: WGPURenderPassEncoder?, color: WGPUColor?)

public expect fun wgpuRenderPassEncoderSetViewport(
	handler: WGPURenderPassEncoder?,
	x: Float,
	y: Float,
	width: Float,
	height: Float,
	minDepth: Float,
	maxDepth: Float,
)

public expect fun wgpuRenderPassEncoderSetScissorRect(
	handler: WGPURenderPassEncoder?,
	x: UInt,
	y: UInt,
	width: UInt,
	height: UInt,
)

public expect fun wgpuRenderPassEncoderSetVertexBuffer(
	handler: WGPURenderPassEncoder?,
	slot: UInt,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
)

public expect fun wgpuRenderPassEncoderSetIndexBuffer(
	handler: WGPURenderPassEncoder?,
	buffer: WGPUBuffer?,
	format: WGPUIndexFormat,
	offset: ULong,
	size: ULong,
)

public expect fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: WGPURenderPassEncoder?, queryIndex: UInt)

public expect fun wgpuRenderPassEncoderEndOcclusionQuery(handler: WGPURenderPassEncoder?)

public expect fun wgpuRenderPassEncoderEnd(handler: WGPURenderPassEncoder?)

public expect fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: WGPUStringView)

public expect fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?)

public expect fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout?

public expect fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: WGPUStringView)

public expect fun wgpuSamplerRelease(handler: WGPUSampler?)

public expect fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: WGPUStringView)

public expect fun wgpuShaderModuleRelease(handler: WGPUShaderModule?)

public expect fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callbackInfo: WGPUCompilationInfoCallbackInfo)

public expect fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: WGPUStringView)

public expect fun wgpuSurfaceRelease(handler: WGPUSurface?)

/**
 * Configures parameters for rendering to [surface].
 * Produces a @ref DeviceError for all content-timeline errors defined by the WebGPU specification.
 *
 * See @ref Surface-Configuration for more details.
 * @param config The new configuration to use.
 */
public expect fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?)

/**
 * Provides information on how [adapter] is able to use [surface].
 * See @ref Surface-Capabilities for more details.
 * @param adapter The @ref WGPUAdapter to get capabilities for presenting to this @ref WGPUSurface.
 * @param capabilities The structure to fill capabilities in.
 * It may contain memory allocations so [wgpuSurfaceCapabilitiesFreeMembers] must be called to avoid memory leaks.
 * @return Indicates if there was an @ref OutStructChainError.
 */
public expect fun wgpuSurfaceGetCapabilities(
	handler: WGPUSurface?,
	adapter: WGPUAdapter?,
	capabilities: WGPUSurfaceCapabilities?,
): WGPUStatus

/**
 * Returns the @ref WGPUTexture to render to [surface] this frame along with metadata on the frame.
 * Returns [NULL] and @ref WGPUSurfaceGetCurrentTextureStatus_Error if the surface is not configured.
 *
 * See @ref Surface-Presenting for more details.
 * @param surfaceTexture The structure to fill the @ref WGPUTexture and metadata in.
 */
public expect fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?)

/**
 * Shows [surface]'s current texture to the user.
 * See @ref Surface-Presenting for more details.
 * @return Returns @ref WGPUStatus_Error if the surface doesn't have a current texture.
 */
public expect fun wgpuSurfacePresent(handler: WGPUSurface?): WGPUStatus

/**
 * Removes the configuration for [surface].
 * See @ref Surface-Configuration for more details.
 */
public expect fun wgpuSurfaceUnconfigure(handler: WGPUSurface?)

/**
 * Modifies the label used to refer to [surface].
 * @param label The new label.
 */
public expect fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: WGPUStringView)

public expect fun wgpuTextureRelease(handler: WGPUTexture?)

public expect fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView?

public expect fun wgpuTextureSetLabel(handler: WGPUTexture?, label: WGPUStringView)

public expect fun wgpuTextureGetWidth(handler: WGPUTexture?): UInt

public expect fun wgpuTextureGetHeight(handler: WGPUTexture?): UInt

public expect fun wgpuTextureGetDepthOrArrayLayers(handler: WGPUTexture?): UInt

public expect fun wgpuTextureGetMipLevelCount(handler: WGPUTexture?): UInt

public expect fun wgpuTextureGetSampleCount(handler: WGPUTexture?): UInt

public expect fun wgpuTextureGetDimension(handler: WGPUTexture?): WGPUTextureDimension

public expect fun wgpuTextureGetFormat(handler: WGPUTexture?): WGPUTextureFormat

public expect fun wgpuTextureGetUsage(handler: WGPUTexture?): ULong

public expect fun wgpuTextureDestroy(handler: WGPUTexture?)

public expect fun wgpuTextureViewRelease(handler: WGPUTextureView?)

public expect fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: WGPUStringView)
