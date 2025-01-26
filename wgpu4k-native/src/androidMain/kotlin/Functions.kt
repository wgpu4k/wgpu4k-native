// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu.android


internal interface FunctionsInterface: com.sun.jna.Library {
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCreateInstance")
	fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuGetInstanceCapabilities")
	fun wgpuGetInstanceCapabilities(capabilities: WGPUInstanceCapabilities.ByReference?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDevicePoll")
	fun wgpuDevicePoll(device: com.sun.jna.Pointer?, wait: UInt, wrappedSubmissionIndex: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSetLogCallback")
	fun wgpuSetLogCallback(callback: com.sun.jna.Callback?, userdata: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSetLogLevel")
	fun wgpuSetLogLevel(level: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterRelease")
	fun wgpuAdapterRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterGetLimits")
	fun wgpuAdapterGetLimits(handler: com.sun.jna.Pointer?, limits: WGPULimits.ByReference?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterHasFeature")
	fun wgpuAdapterHasFeature(handler: com.sun.jna.Pointer?, feature: UInt): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterGetFeatures")
	fun wgpuAdapterGetFeatures(handler: com.sun.jna.Pointer?, features: WGPUSupportedFeatures.ByReference?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterGetInfo")
	fun wgpuAdapterGetInfo(handler: com.sun.jna.Pointer?, info: WGPUAdapterInfo.ByReference?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterRequestDevice")
	fun wgpuAdapterRequestDevice(handler: com.sun.jna.Pointer?, descriptor: WGPUDeviceDescriptor.ByReference?, callbackInfo: WGPURequestDeviceCallbackInfo.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBindGroupRelease")
	fun wgpuBindGroupRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBindGroupSetLabel")
	fun wgpuBindGroupSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBindGroupLayoutRelease")
	fun wgpuBindGroupLayoutRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBindGroupLayoutSetLabel")
	fun wgpuBindGroupLayoutSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferRelease")
	fun wgpuBufferRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferMapAsync")
	fun wgpuBufferMapAsync(handler: com.sun.jna.Pointer?, mode: ULong, offset: ULong, size: ULong, callbackInfo: WGPUBufferMapCallbackInfo.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetMappedRange")
	fun wgpuBufferGetMappedRange(handler: com.sun.jna.Pointer?, offset: ULong, size: ULong): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetConstMappedRange")
	fun wgpuBufferGetConstMappedRange(handler: com.sun.jna.Pointer?, offset: ULong, size: ULong): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferSetLabel")
	fun wgpuBufferSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetUsage")
	fun wgpuBufferGetUsage(handler: com.sun.jna.Pointer?): ULong
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetSize")
	fun wgpuBufferGetSize(handler: com.sun.jna.Pointer?): ULong
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetMapState")
	fun wgpuBufferGetMapState(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferUnmap")
	fun wgpuBufferUnmap(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferDestroy")
	fun wgpuBufferDestroy(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandBufferRelease")
	fun wgpuCommandBufferRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandBufferSetLabel")
	fun wgpuCommandBufferSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderRelease")
	fun wgpuCommandEncoderRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderFinish")
	fun wgpuCommandEncoderFinish(handler: com.sun.jna.Pointer?, descriptor: WGPUCommandBufferDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderBeginComputePass")
	fun wgpuCommandEncoderBeginComputePass(handler: com.sun.jna.Pointer?, descriptor: WGPUComputePassDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderBeginRenderPass")
	fun wgpuCommandEncoderBeginRenderPass(handler: com.sun.jna.Pointer?, descriptor: WGPURenderPassDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderCopyBufferToBuffer")
	fun wgpuCommandEncoderCopyBufferToBuffer(handler: com.sun.jna.Pointer?, source: com.sun.jna.Pointer?, sourceOffset: ULong, destination: com.sun.jna.Pointer?, destinationOffset: ULong, size: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderCopyBufferToTexture")
	fun wgpuCommandEncoderCopyBufferToTexture(handler: com.sun.jna.Pointer?, source: WGPUTexelCopyBufferInfo.ByReference?, destination: WGPUTexelCopyTextureInfo.ByReference?, copySize: WGPUExtent3D.ByReference?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderCopyTextureToBuffer")
	fun wgpuCommandEncoderCopyTextureToBuffer(handler: com.sun.jna.Pointer?, source: WGPUTexelCopyTextureInfo.ByReference?, destination: WGPUTexelCopyBufferInfo.ByReference?, copySize: WGPUExtent3D.ByReference?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderCopyTextureToTexture")
	fun wgpuCommandEncoderCopyTextureToTexture(handler: com.sun.jna.Pointer?, source: WGPUTexelCopyTextureInfo.ByReference?, destination: WGPUTexelCopyTextureInfo.ByReference?, copySize: WGPUExtent3D.ByReference?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderClearBuffer")
	fun wgpuCommandEncoderClearBuffer(handler: com.sun.jna.Pointer?, buffer: com.sun.jna.Pointer?, offset: ULong, size: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderInsertDebugMarker")
	fun wgpuCommandEncoderInsertDebugMarker(handler: com.sun.jna.Pointer?, markerLabel: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderPopDebugGroup")
	fun wgpuCommandEncoderPopDebugGroup(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderPushDebugGroup")
	fun wgpuCommandEncoderPushDebugGroup(handler: com.sun.jna.Pointer?, groupLabel: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderResolveQuerySet")
	fun wgpuCommandEncoderResolveQuerySet(handler: com.sun.jna.Pointer?, querySet: com.sun.jna.Pointer?, firstQuery: UInt, queryCount: UInt, destination: com.sun.jna.Pointer?, destinationOffset: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderWriteTimestamp")
	fun wgpuCommandEncoderWriteTimestamp(handler: com.sun.jna.Pointer?, querySet: com.sun.jna.Pointer?, queryIndex: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderSetLabel")
	fun wgpuCommandEncoderSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderRelease")
	fun wgpuComputePassEncoderRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderInsertDebugMarker")
	fun wgpuComputePassEncoderInsertDebugMarker(handler: com.sun.jna.Pointer?, markerLabel: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderPopDebugGroup")
	fun wgpuComputePassEncoderPopDebugGroup(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderPushDebugGroup")
	fun wgpuComputePassEncoderPushDebugGroup(handler: com.sun.jna.Pointer?, groupLabel: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderSetPipeline")
	fun wgpuComputePassEncoderSetPipeline(handler: com.sun.jna.Pointer?, pipeline: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderSetBindGroup")
	fun wgpuComputePassEncoderSetBindGroup(handler: com.sun.jna.Pointer?, groupIndex: UInt, group: com.sun.jna.Pointer?, dynamicOffsetCount: ULong, dynamicOffsets: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderDispatchWorkgroups")
	fun wgpuComputePassEncoderDispatchWorkgroups(handler: com.sun.jna.Pointer?, workgroupCountX: UInt, workgroupCountY: UInt, workgroupCountZ: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderDispatchWorkgroupsIndirect")
	fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler: com.sun.jna.Pointer?, indirectBuffer: com.sun.jna.Pointer?, indirectOffset: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderEnd")
	fun wgpuComputePassEncoderEnd(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderSetLabel")
	fun wgpuComputePassEncoderSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePipelineRelease")
	fun wgpuComputePipelineRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePipelineGetBindGroupLayout")
	fun wgpuComputePipelineGetBindGroupLayout(handler: com.sun.jna.Pointer?, groupIndex: UInt): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePipelineSetLabel")
	fun wgpuComputePipelineSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceRelease")
	fun wgpuDeviceRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateBindGroup")
	fun wgpuDeviceCreateBindGroup(handler: com.sun.jna.Pointer?, descriptor: WGPUBindGroupDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateBindGroupLayout")
	fun wgpuDeviceCreateBindGroupLayout(handler: com.sun.jna.Pointer?, descriptor: WGPUBindGroupLayoutDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateBuffer")
	fun wgpuDeviceCreateBuffer(handler: com.sun.jna.Pointer?, descriptor: WGPUBufferDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateCommandEncoder")
	fun wgpuDeviceCreateCommandEncoder(handler: com.sun.jna.Pointer?, descriptor: WGPUCommandEncoderDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateComputePipeline")
	fun wgpuDeviceCreateComputePipeline(handler: com.sun.jna.Pointer?, descriptor: WGPUComputePipelineDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateComputePipelineAsync")
	fun wgpuDeviceCreateComputePipelineAsync(handler: com.sun.jna.Pointer?, descriptor: WGPUComputePipelineDescriptor.ByReference?, callbackInfo: WGPUCreateComputePipelineAsyncCallbackInfo.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreatePipelineLayout")
	fun wgpuDeviceCreatePipelineLayout(handler: com.sun.jna.Pointer?, descriptor: WGPUPipelineLayoutDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateQuerySet")
	fun wgpuDeviceCreateQuerySet(handler: com.sun.jna.Pointer?, descriptor: WGPUQuerySetDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateRenderPipelineAsync")
	fun wgpuDeviceCreateRenderPipelineAsync(handler: com.sun.jna.Pointer?, descriptor: WGPURenderPipelineDescriptor.ByReference?, callbackInfo: WGPUCreateRenderPipelineAsyncCallbackInfo.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateRenderBundleEncoder")
	fun wgpuDeviceCreateRenderBundleEncoder(handler: com.sun.jna.Pointer?, descriptor: WGPURenderBundleEncoderDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateRenderPipeline")
	fun wgpuDeviceCreateRenderPipeline(handler: com.sun.jna.Pointer?, descriptor: WGPURenderPipelineDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateSampler")
	fun wgpuDeviceCreateSampler(handler: com.sun.jna.Pointer?, descriptor: WGPUSamplerDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateShaderModule")
	fun wgpuDeviceCreateShaderModule(handler: com.sun.jna.Pointer?, descriptor: WGPUShaderModuleDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateTexture")
	fun wgpuDeviceCreateTexture(handler: com.sun.jna.Pointer?, descriptor: WGPUTextureDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceDestroy")
	fun wgpuDeviceDestroy(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetLostFuture")
	fun wgpuDeviceGetLostFuture(handler: com.sun.jna.Pointer?): WGPUFuture.ByValue
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetLimits")
	fun wgpuDeviceGetLimits(handler: com.sun.jna.Pointer?, limits: WGPULimits.ByReference?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceHasFeature")
	fun wgpuDeviceHasFeature(handler: com.sun.jna.Pointer?, feature: UInt): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetFeatures")
	fun wgpuDeviceGetFeatures(handler: com.sun.jna.Pointer?, features: WGPUSupportedFeatures.ByReference?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetAdapterInfo")
	fun wgpuDeviceGetAdapterInfo(handler: com.sun.jna.Pointer?): WGPUAdapterInfo.ByValue
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetQueue")
	fun wgpuDeviceGetQueue(handler: com.sun.jna.Pointer?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDevicePushErrorScope")
	fun wgpuDevicePushErrorScope(handler: com.sun.jna.Pointer?, filter: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDevicePopErrorScope")
	fun wgpuDevicePopErrorScope(handler: com.sun.jna.Pointer?, callbackInfo: WGPUPopErrorScopeCallbackInfo.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceSetLabel")
	fun wgpuDeviceSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceRelease")
	fun wgpuInstanceRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceCreateSurface")
	fun wgpuInstanceCreateSurface(handler: com.sun.jna.Pointer?, descriptor: WGPUSurfaceDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceGetWGSLLanguageFeatures")
	fun wgpuInstanceGetWGSLLanguageFeatures(handler: com.sun.jna.Pointer?, features: WGPUSupportedWGSLLanguageFeatures.ByReference?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceHasWGSLLanguageFeature")
	fun wgpuInstanceHasWGSLLanguageFeature(handler: com.sun.jna.Pointer?, feature: UInt): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceProcessEvents")
	fun wgpuInstanceProcessEvents(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceRequestAdapter")
	fun wgpuInstanceRequestAdapter(handler: com.sun.jna.Pointer?, options: WGPURequestAdapterOptions.ByReference?, callbackInfo: WGPURequestAdapterCallbackInfo.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceWaitAny")
	fun wgpuInstanceWaitAny(handler: com.sun.jna.Pointer?, futureCount: ULong, futures: WGPUFutureWaitInfo.ByReference?, timeoutNS: ULong): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuPipelineLayoutRelease")
	fun wgpuPipelineLayoutRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuPipelineLayoutSetLabel")
	fun wgpuPipelineLayoutSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetRelease")
	fun wgpuQuerySetRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetSetLabel")
	fun wgpuQuerySetSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetGetType")
	fun wgpuQuerySetGetType(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetGetCount")
	fun wgpuQuerySetGetCount(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetDestroy")
	fun wgpuQuerySetDestroy(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueRelease")
	fun wgpuQueueRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueSubmit")
	fun wgpuQueueSubmit(handler: com.sun.jna.Pointer?, commandCount: ULong, commands: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueOnSubmittedWorkDone")
	fun wgpuQueueOnSubmittedWorkDone(handler: com.sun.jna.Pointer?, callbackInfo: WGPUQueueWorkDoneCallbackInfo.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueWriteBuffer")
	fun wgpuQueueWriteBuffer(handler: com.sun.jna.Pointer?, buffer: com.sun.jna.Pointer?, bufferOffset: ULong, data: com.sun.jna.Pointer?, size: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueWriteTexture")
	fun wgpuQueueWriteTexture(handler: com.sun.jna.Pointer?, destination: WGPUTexelCopyTextureInfo.ByReference?, data: com.sun.jna.Pointer?, dataSize: ULong, dataLayout: WGPUTexelCopyBufferLayout.ByReference?, writeSize: WGPUExtent3D.ByReference?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueSetLabel")
	fun wgpuQueueSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleRelease")
	fun wgpuRenderBundleRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleSetLabel")
	fun wgpuRenderBundleSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderRelease")
	fun wgpuRenderBundleEncoderRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetPipeline")
	fun wgpuRenderBundleEncoderSetPipeline(handler: com.sun.jna.Pointer?, pipeline: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetBindGroup")
	fun wgpuRenderBundleEncoderSetBindGroup(handler: com.sun.jna.Pointer?, groupIndex: UInt, group: com.sun.jna.Pointer?, dynamicOffsetCount: ULong, dynamicOffsets: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderDraw")
	fun wgpuRenderBundleEncoderDraw(handler: com.sun.jna.Pointer?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderDrawIndexed")
	fun wgpuRenderBundleEncoderDrawIndexed(handler: com.sun.jna.Pointer?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderDrawIndirect")
	fun wgpuRenderBundleEncoderDrawIndirect(handler: com.sun.jna.Pointer?, indirectBuffer: com.sun.jna.Pointer?, indirectOffset: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderDrawIndexedIndirect")
	fun wgpuRenderBundleEncoderDrawIndexedIndirect(handler: com.sun.jna.Pointer?, indirectBuffer: com.sun.jna.Pointer?, indirectOffset: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderInsertDebugMarker")
	fun wgpuRenderBundleEncoderInsertDebugMarker(handler: com.sun.jna.Pointer?, markerLabel: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderPopDebugGroup")
	fun wgpuRenderBundleEncoderPopDebugGroup(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderPushDebugGroup")
	fun wgpuRenderBundleEncoderPushDebugGroup(handler: com.sun.jna.Pointer?, groupLabel: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetVertexBuffer")
	fun wgpuRenderBundleEncoderSetVertexBuffer(handler: com.sun.jna.Pointer?, slot: UInt, buffer: com.sun.jna.Pointer?, offset: ULong, size: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetIndexBuffer")
	fun wgpuRenderBundleEncoderSetIndexBuffer(handler: com.sun.jna.Pointer?, buffer: com.sun.jna.Pointer?, format: UInt, offset: ULong, size: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderFinish")
	fun wgpuRenderBundleEncoderFinish(handler: com.sun.jna.Pointer?, descriptor: WGPURenderBundleDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetLabel")
	fun wgpuRenderBundleEncoderSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderRelease")
	fun wgpuRenderPassEncoderRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetPipeline")
	fun wgpuRenderPassEncoderSetPipeline(handler: com.sun.jna.Pointer?, pipeline: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetBindGroup")
	fun wgpuRenderPassEncoderSetBindGroup(handler: com.sun.jna.Pointer?, groupIndex: UInt, group: com.sun.jna.Pointer?, dynamicOffsetCount: ULong, dynamicOffsets: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderDraw")
	fun wgpuRenderPassEncoderDraw(handler: com.sun.jna.Pointer?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderDrawIndexed")
	fun wgpuRenderPassEncoderDrawIndexed(handler: com.sun.jna.Pointer?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderDrawIndirect")
	fun wgpuRenderPassEncoderDrawIndirect(handler: com.sun.jna.Pointer?, indirectBuffer: com.sun.jna.Pointer?, indirectOffset: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderDrawIndexedIndirect")
	fun wgpuRenderPassEncoderDrawIndexedIndirect(handler: com.sun.jna.Pointer?, indirectBuffer: com.sun.jna.Pointer?, indirectOffset: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderExecuteBundles")
	fun wgpuRenderPassEncoderExecuteBundles(handler: com.sun.jna.Pointer?, bundleCount: ULong, bundles: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderInsertDebugMarker")
	fun wgpuRenderPassEncoderInsertDebugMarker(handler: com.sun.jna.Pointer?, markerLabel: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderPopDebugGroup")
	fun wgpuRenderPassEncoderPopDebugGroup(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderPushDebugGroup")
	fun wgpuRenderPassEncoderPushDebugGroup(handler: com.sun.jna.Pointer?, groupLabel: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetStencilReference")
	fun wgpuRenderPassEncoderSetStencilReference(handler: com.sun.jna.Pointer?, reference: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetBlendConstant")
	fun wgpuRenderPassEncoderSetBlendConstant(handler: com.sun.jna.Pointer?, color: WGPUColor.ByReference?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetViewport")
	fun wgpuRenderPassEncoderSetViewport(handler: com.sun.jna.Pointer?, x: Float, y: Float, width: Float, height: Float, minDepth: Float, maxDepth: Float): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetScissorRect")
	fun wgpuRenderPassEncoderSetScissorRect(handler: com.sun.jna.Pointer?, x: UInt, y: UInt, width: UInt, height: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetVertexBuffer")
	fun wgpuRenderPassEncoderSetVertexBuffer(handler: com.sun.jna.Pointer?, slot: UInt, buffer: com.sun.jna.Pointer?, offset: ULong, size: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetIndexBuffer")
	fun wgpuRenderPassEncoderSetIndexBuffer(handler: com.sun.jna.Pointer?, buffer: com.sun.jna.Pointer?, format: UInt, offset: ULong, size: ULong): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderBeginOcclusionQuery")
	fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: com.sun.jna.Pointer?, queryIndex: UInt): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderEndOcclusionQuery")
	fun wgpuRenderPassEncoderEndOcclusionQuery(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderEnd")
	fun wgpuRenderPassEncoderEnd(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetLabel")
	fun wgpuRenderPassEncoderSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPipelineRelease")
	fun wgpuRenderPipelineRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPipelineGetBindGroupLayout")
	fun wgpuRenderPipelineGetBindGroupLayout(handler: com.sun.jna.Pointer?, groupIndex: UInt): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPipelineSetLabel")
	fun wgpuRenderPipelineSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSamplerRelease")
	fun wgpuSamplerRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSamplerSetLabel")
	fun wgpuSamplerSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuShaderModuleRelease")
	fun wgpuShaderModuleRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuShaderModuleGetCompilationInfo")
	fun wgpuShaderModuleGetCompilationInfo(handler: com.sun.jna.Pointer?, callbackInfo: WGPUCompilationInfoCallbackInfo.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuShaderModuleSetLabel")
	fun wgpuShaderModuleSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceRelease")
	fun wgpuSurfaceRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceConfigure")
	fun wgpuSurfaceConfigure(handler: com.sun.jna.Pointer?, config: WGPUSurfaceConfiguration.ByReference?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceGetCapabilities")
	fun wgpuSurfaceGetCapabilities(handler: com.sun.jna.Pointer?, adapter: com.sun.jna.Pointer?, capabilities: WGPUSurfaceCapabilities.ByReference?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceGetCurrentTexture")
	fun wgpuSurfaceGetCurrentTexture(handler: com.sun.jna.Pointer?, surfaceTexture: WGPUSurfaceTexture.ByReference?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfacePresent")
	fun wgpuSurfacePresent(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceUnconfigure")
	fun wgpuSurfaceUnconfigure(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceSetLabel")
	fun wgpuSurfaceSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureRelease")
	fun wgpuTextureRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureCreateView")
	fun wgpuTextureCreateView(handler: com.sun.jna.Pointer?, descriptor: WGPUTextureViewDescriptor.ByReference?): com.sun.jna.Pointer?
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureSetLabel")
	fun wgpuTextureSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetWidth")
	fun wgpuTextureGetWidth(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetHeight")
	fun wgpuTextureGetHeight(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetDepthOrArrayLayers")
	fun wgpuTextureGetDepthOrArrayLayers(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetMipLevelCount")
	fun wgpuTextureGetMipLevelCount(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetSampleCount")
	fun wgpuTextureGetSampleCount(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetDimension")
	fun wgpuTextureGetDimension(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetFormat")
	fun wgpuTextureGetFormat(handler: com.sun.jna.Pointer?): UInt
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetUsage")
	fun wgpuTextureGetUsage(handler: com.sun.jna.Pointer?): ULong
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureDestroy")
	fun wgpuTextureDestroy(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureViewRelease")
	fun wgpuTextureViewRelease(handler: com.sun.jna.Pointer?): Unit
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureViewSetLabel")
	fun wgpuTextureViewSetLabel(handler: com.sun.jna.Pointer?, label: WGPUStringView.ByValue): Unit
}
internal val Functions = com.sun.jna.Native.load("wgpu4k", FunctionsInterface::class.java)
