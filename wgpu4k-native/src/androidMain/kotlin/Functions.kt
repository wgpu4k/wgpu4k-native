// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu.android

import FunctionsInterface
import com.sun.jna.Callback
import com.sun.jna.Library
import com.sun.jna.Native
import com.sun.jna.Pointer
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.UInt
import kotlin.ULong
import kotlin.jvm.JvmName

internal interface FunctionsInterface : Library {
	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCreateInstance")
	public fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuGetInstanceCapabilities")
	public fun wgpuGetInstanceCapabilities(capabilities: WGPUInstanceCapabilities.ByReference?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDevicePoll")
	public fun wgpuDevicePoll(
		device: Pointer?,
		wait: UInt,
		wrappedSubmissionIndex: Pointer?,
	): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSetLogCallback")
	public fun wgpuSetLogCallback(callback: Callback?, userdata: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSetLogLevel")
	public fun wgpuSetLogLevel(level: UInt)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterRelease")
	public fun wgpuAdapterRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterGetLimits")
	public fun wgpuAdapterGetLimits(handler: Pointer?, limits: WGPULimits.ByReference?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterHasFeature")
	public fun wgpuAdapterHasFeature(handler: Pointer?, feature: UInt): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterGetFeatures")
	public fun wgpuAdapterGetFeatures(handler: Pointer?, features: WGPUSupportedFeatures.ByReference?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterGetInfo")
	public fun wgpuAdapterGetInfo(handler: Pointer?, info: WGPUAdapterInfo.ByReference?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuAdapterRequestDevice")
	public fun wgpuAdapterRequestDevice(
		handler: Pointer?,
		descriptor: WGPUDeviceDescriptor.ByReference?,
		callbackInfo: WGPURequestDeviceCallbackInfo.ByValue,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBindGroupRelease")
	public fun wgpuBindGroupRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBindGroupSetLabel")
	public fun wgpuBindGroupSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBindGroupLayoutRelease")
	public fun wgpuBindGroupLayoutRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBindGroupLayoutSetLabel")
	public fun wgpuBindGroupLayoutSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferRelease")
	public fun wgpuBufferRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferMapAsync")
	public fun wgpuBufferMapAsync(
		handler: Pointer?,
		mode: ULong,
		offset: ULong,
		size: ULong,
		callbackInfo: WGPUBufferMapCallbackInfo.ByValue,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetMappedRange")
	public fun wgpuBufferGetMappedRange(
		handler: Pointer?,
		offset: ULong,
		size: ULong,
	): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetConstMappedRange")
	public fun wgpuBufferGetConstMappedRange(
		handler: Pointer?,
		offset: ULong,
		size: ULong,
	): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferSetLabel")
	public fun wgpuBufferSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetUsage")
	public fun wgpuBufferGetUsage(handler: Pointer?): ULong

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetSize")
	public fun wgpuBufferGetSize(handler: Pointer?): ULong

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferGetMapState")
	public fun wgpuBufferGetMapState(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferUnmap")
	public fun wgpuBufferUnmap(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuBufferDestroy")
	public fun wgpuBufferDestroy(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandBufferRelease")
	public fun wgpuCommandBufferRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandBufferSetLabel")
	public fun wgpuCommandBufferSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderRelease")
	public fun wgpuCommandEncoderRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderFinish")
	public fun wgpuCommandEncoderFinish(handler: Pointer?, descriptor: WGPUCommandBufferDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderBeginComputePass")
	public fun wgpuCommandEncoderBeginComputePass(handler: Pointer?, descriptor: WGPUComputePassDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderBeginRenderPass")
	public fun wgpuCommandEncoderBeginRenderPass(handler: Pointer?, descriptor: WGPURenderPassDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderCopyBufferToBuffer")
	public fun wgpuCommandEncoderCopyBufferToBuffer(
		handler: Pointer?,
		source: Pointer?,
		sourceOffset: ULong,
		destination: Pointer?,
		destinationOffset: ULong,
		size: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderCopyBufferToTexture")
	public fun wgpuCommandEncoderCopyBufferToTexture(
		handler: Pointer?,
		source: WGPUTexelCopyBufferInfo.ByReference?,
		destination: WGPUTexelCopyTextureInfo.ByReference?,
		copySize: WGPUExtent3D.ByReference?,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderCopyTextureToBuffer")
	public fun wgpuCommandEncoderCopyTextureToBuffer(
		handler: Pointer?,
		source: WGPUTexelCopyTextureInfo.ByReference?,
		destination: WGPUTexelCopyBufferInfo.ByReference?,
		copySize: WGPUExtent3D.ByReference?,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderCopyTextureToTexture")
	public fun wgpuCommandEncoderCopyTextureToTexture(
		handler: Pointer?,
		source: WGPUTexelCopyTextureInfo.ByReference?,
		destination: WGPUTexelCopyTextureInfo.ByReference?,
		copySize: WGPUExtent3D.ByReference?,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderClearBuffer")
	public fun wgpuCommandEncoderClearBuffer(
		handler: Pointer?,
		buffer: Pointer?,
		offset: ULong,
		size: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderInsertDebugMarker")
	public fun wgpuCommandEncoderInsertDebugMarker(handler: Pointer?, markerLabel: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderPopDebugGroup")
	public fun wgpuCommandEncoderPopDebugGroup(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderPushDebugGroup")
	public fun wgpuCommandEncoderPushDebugGroup(handler: Pointer?, groupLabel: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderResolveQuerySet")
	public fun wgpuCommandEncoderResolveQuerySet(
		handler: Pointer?,
		querySet: Pointer?,
		firstQuery: UInt,
		queryCount: UInt,
		destination: Pointer?,
		destinationOffset: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderWriteTimestamp")
	public fun wgpuCommandEncoderWriteTimestamp(
		handler: Pointer?,
		querySet: Pointer?,
		queryIndex: UInt,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuCommandEncoderSetLabel")
	public fun wgpuCommandEncoderSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderRelease")
	public fun wgpuComputePassEncoderRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderInsertDebugMarker")
	public fun wgpuComputePassEncoderInsertDebugMarker(handler: Pointer?, markerLabel: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderPopDebugGroup")
	public fun wgpuComputePassEncoderPopDebugGroup(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderPushDebugGroup")
	public fun wgpuComputePassEncoderPushDebugGroup(handler: Pointer?, groupLabel: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderSetPipeline")
	public fun wgpuComputePassEncoderSetPipeline(handler: Pointer?, pipeline: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderSetBindGroup")
	public fun wgpuComputePassEncoderSetBindGroup(
		handler: Pointer?,
		groupIndex: UInt,
		group: Pointer?,
		dynamicOffsetCount: ULong,
		dynamicOffsets: Pointer?,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderDispatchWorkgroups")
	public fun wgpuComputePassEncoderDispatchWorkgroups(
		handler: Pointer?,
		workgroupCountX: UInt,
		workgroupCountY: UInt,
		workgroupCountZ: UInt,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderDispatchWorkgroupsIndirect")
	public fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(
		handler: Pointer?,
		indirectBuffer: Pointer?,
		indirectOffset: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderEnd")
	public fun wgpuComputePassEncoderEnd(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePassEncoderSetLabel")
	public fun wgpuComputePassEncoderSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePipelineRelease")
	public fun wgpuComputePipelineRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePipelineGetBindGroupLayout")
	public fun wgpuComputePipelineGetBindGroupLayout(handler: Pointer?, groupIndex: UInt): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuComputePipelineSetLabel")
	public fun wgpuComputePipelineSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceRelease")
	public fun wgpuDeviceRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateBindGroup")
	public fun wgpuDeviceCreateBindGroup(handler: Pointer?, descriptor: WGPUBindGroupDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateBindGroupLayout")
	public fun wgpuDeviceCreateBindGroupLayout(handler: Pointer?, descriptor: WGPUBindGroupLayoutDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateBuffer")
	public fun wgpuDeviceCreateBuffer(handler: Pointer?, descriptor: WGPUBufferDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateCommandEncoder")
	public fun wgpuDeviceCreateCommandEncoder(handler: Pointer?, descriptor: WGPUCommandEncoderDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateComputePipeline")
	public fun wgpuDeviceCreateComputePipeline(handler: Pointer?, descriptor: WGPUComputePipelineDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateComputePipelineAsync")
	public fun wgpuDeviceCreateComputePipelineAsync(
		handler: Pointer?,
		descriptor: WGPUComputePipelineDescriptor.ByReference?,
		callbackInfo: WGPUCreateComputePipelineAsyncCallbackInfo.ByValue,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreatePipelineLayout")
	public fun wgpuDeviceCreatePipelineLayout(handler: Pointer?, descriptor: WGPUPipelineLayoutDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateQuerySet")
	public fun wgpuDeviceCreateQuerySet(handler: Pointer?, descriptor: WGPUQuerySetDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateRenderPipelineAsync")
	public fun wgpuDeviceCreateRenderPipelineAsync(
		handler: Pointer?,
		descriptor: WGPURenderPipelineDescriptor.ByReference?,
		callbackInfo: WGPUCreateRenderPipelineAsyncCallbackInfo.ByValue,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateRenderBundleEncoder")
	public fun wgpuDeviceCreateRenderBundleEncoder(handler: Pointer?, descriptor: WGPURenderBundleEncoderDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateRenderPipeline")
	public fun wgpuDeviceCreateRenderPipeline(handler: Pointer?, descriptor: WGPURenderPipelineDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateSampler")
	public fun wgpuDeviceCreateSampler(handler: Pointer?, descriptor: WGPUSamplerDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateShaderModule")
	public fun wgpuDeviceCreateShaderModule(handler: Pointer?, descriptor: WGPUShaderModuleDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceCreateTexture")
	public fun wgpuDeviceCreateTexture(handler: Pointer?, descriptor: WGPUTextureDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceDestroy")
	public fun wgpuDeviceDestroy(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetLostFuture")
	public fun wgpuDeviceGetLostFuture(handler: Pointer?): WGPUFuture.ByValue

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetLimits")
	public fun wgpuDeviceGetLimits(handler: Pointer?, limits: WGPULimits.ByReference?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceHasFeature")
	public fun wgpuDeviceHasFeature(handler: Pointer?, feature: UInt): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetFeatures")
	public fun wgpuDeviceGetFeatures(handler: Pointer?, features: WGPUSupportedFeatures.ByReference?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetAdapterInfo")
	public fun wgpuDeviceGetAdapterInfo(handler: Pointer?): WGPUAdapterInfo.ByValue

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceGetQueue")
	public fun wgpuDeviceGetQueue(handler: Pointer?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDevicePushErrorScope")
	public fun wgpuDevicePushErrorScope(handler: Pointer?, filter: UInt)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDevicePopErrorScope")
	public fun wgpuDevicePopErrorScope(handler: Pointer?, callbackInfo: WGPUPopErrorScopeCallbackInfo.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuDeviceSetLabel")
	public fun wgpuDeviceSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceRelease")
	public fun wgpuInstanceRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceCreateSurface")
	public fun wgpuInstanceCreateSurface(handler: Pointer?, descriptor: WGPUSurfaceDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceGetWGSLLanguageFeatures")
	public fun wgpuInstanceGetWGSLLanguageFeatures(handler: Pointer?, features: WGPUSupportedWGSLLanguageFeatures.ByReference?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceHasWGSLLanguageFeature")
	public fun wgpuInstanceHasWGSLLanguageFeature(handler: Pointer?, feature: UInt): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceProcessEvents")
	public fun wgpuInstanceProcessEvents(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceRequestAdapter")
	public fun wgpuInstanceRequestAdapter(
		handler: Pointer?,
		options: WGPURequestAdapterOptions.ByReference?,
		callbackInfo: WGPURequestAdapterCallbackInfo.ByValue,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuInstanceWaitAny")
	public fun wgpuInstanceWaitAny(
		handler: Pointer?,
		futureCount: ULong,
		futures: WGPUFutureWaitInfo.ByReference?,
		timeoutNS: ULong,
	): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuPipelineLayoutRelease")
	public fun wgpuPipelineLayoutRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuPipelineLayoutSetLabel")
	public fun wgpuPipelineLayoutSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetRelease")
	public fun wgpuQuerySetRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetSetLabel")
	public fun wgpuQuerySetSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetGetType")
	public fun wgpuQuerySetGetType(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetGetCount")
	public fun wgpuQuerySetGetCount(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQuerySetDestroy")
	public fun wgpuQuerySetDestroy(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueRelease")
	public fun wgpuQueueRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueSubmit")
	public fun wgpuQueueSubmit(
		handler: Pointer?,
		commandCount: ULong,
		commands: Pointer?,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueOnSubmittedWorkDone")
	public fun wgpuQueueOnSubmittedWorkDone(handler: Pointer?, callbackInfo: WGPUQueueWorkDoneCallbackInfo.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueWriteBuffer")
	public fun wgpuQueueWriteBuffer(
		handler: Pointer?,
		buffer: Pointer?,
		bufferOffset: ULong,
		`data`: Pointer?,
		size: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueWriteTexture")
	public fun wgpuQueueWriteTexture(
		handler: Pointer?,
		destination: WGPUTexelCopyTextureInfo.ByReference?,
		`data`: Pointer?,
		dataSize: ULong,
		dataLayout: WGPUTexelCopyBufferLayout.ByReference?,
		writeSize: WGPUExtent3D.ByReference?,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuQueueSetLabel")
	public fun wgpuQueueSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleRelease")
	public fun wgpuRenderBundleRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleSetLabel")
	public fun wgpuRenderBundleSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderRelease")
	public fun wgpuRenderBundleEncoderRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetPipeline")
	public fun wgpuRenderBundleEncoderSetPipeline(handler: Pointer?, pipeline: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetBindGroup")
	public fun wgpuRenderBundleEncoderSetBindGroup(
		handler: Pointer?,
		groupIndex: UInt,
		group: Pointer?,
		dynamicOffsetCount: ULong,
		dynamicOffsets: Pointer?,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderDraw")
	public fun wgpuRenderBundleEncoderDraw(
		handler: Pointer?,
		vertexCount: UInt,
		instanceCount: UInt,
		firstVertex: UInt,
		firstInstance: UInt,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderDrawIndexed")
	public fun wgpuRenderBundleEncoderDrawIndexed(
		handler: Pointer?,
		indexCount: UInt,
		instanceCount: UInt,
		firstIndex: UInt,
		baseVertex: Int,
		firstInstance: UInt,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderDrawIndirect")
	public fun wgpuRenderBundleEncoderDrawIndirect(
		handler: Pointer?,
		indirectBuffer: Pointer?,
		indirectOffset: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderDrawIndexedIndirect")
	public fun wgpuRenderBundleEncoderDrawIndexedIndirect(
		handler: Pointer?,
		indirectBuffer: Pointer?,
		indirectOffset: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderInsertDebugMarker")
	public fun wgpuRenderBundleEncoderInsertDebugMarker(handler: Pointer?, markerLabel: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderPopDebugGroup")
	public fun wgpuRenderBundleEncoderPopDebugGroup(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderPushDebugGroup")
	public fun wgpuRenderBundleEncoderPushDebugGroup(handler: Pointer?, groupLabel: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetVertexBuffer")
	public fun wgpuRenderBundleEncoderSetVertexBuffer(
		handler: Pointer?,
		slot: UInt,
		buffer: Pointer?,
		offset: ULong,
		size: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetIndexBuffer")
	public fun wgpuRenderBundleEncoderSetIndexBuffer(
		handler: Pointer?,
		buffer: Pointer?,
		format: UInt,
		offset: ULong,
		size: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderFinish")
	public fun wgpuRenderBundleEncoderFinish(handler: Pointer?, descriptor: WGPURenderBundleDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderBundleEncoderSetLabel")
	public fun wgpuRenderBundleEncoderSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderRelease")
	public fun wgpuRenderPassEncoderRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetPipeline")
	public fun wgpuRenderPassEncoderSetPipeline(handler: Pointer?, pipeline: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetBindGroup")
	public fun wgpuRenderPassEncoderSetBindGroup(
		handler: Pointer?,
		groupIndex: UInt,
		group: Pointer?,
		dynamicOffsetCount: ULong,
		dynamicOffsets: Pointer?,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderDraw")
	public fun wgpuRenderPassEncoderDraw(
		handler: Pointer?,
		vertexCount: UInt,
		instanceCount: UInt,
		firstVertex: UInt,
		firstInstance: UInt,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderDrawIndexed")
	public fun wgpuRenderPassEncoderDrawIndexed(
		handler: Pointer?,
		indexCount: UInt,
		instanceCount: UInt,
		firstIndex: UInt,
		baseVertex: Int,
		firstInstance: UInt,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderDrawIndirect")
	public fun wgpuRenderPassEncoderDrawIndirect(
		handler: Pointer?,
		indirectBuffer: Pointer?,
		indirectOffset: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderDrawIndexedIndirect")
	public fun wgpuRenderPassEncoderDrawIndexedIndirect(
		handler: Pointer?,
		indirectBuffer: Pointer?,
		indirectOffset: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderExecuteBundles")
	public fun wgpuRenderPassEncoderExecuteBundles(
		handler: Pointer?,
		bundleCount: ULong,
		bundles: Pointer?,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderInsertDebugMarker")
	public fun wgpuRenderPassEncoderInsertDebugMarker(handler: Pointer?, markerLabel: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderPopDebugGroup")
	public fun wgpuRenderPassEncoderPopDebugGroup(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderPushDebugGroup")
	public fun wgpuRenderPassEncoderPushDebugGroup(handler: Pointer?, groupLabel: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetStencilReference")
	public fun wgpuRenderPassEncoderSetStencilReference(handler: Pointer?, reference: UInt)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetBlendConstant")
	public fun wgpuRenderPassEncoderSetBlendConstant(handler: Pointer?, color: WGPUColor.ByReference?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetViewport")
	public fun wgpuRenderPassEncoderSetViewport(
		handler: Pointer?,
		x: Float,
		y: Float,
		width: Float,
		height: Float,
		minDepth: Float,
		maxDepth: Float,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetScissorRect")
	public fun wgpuRenderPassEncoderSetScissorRect(
		handler: Pointer?,
		x: UInt,
		y: UInt,
		width: UInt,
		height: UInt,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetVertexBuffer")
	public fun wgpuRenderPassEncoderSetVertexBuffer(
		handler: Pointer?,
		slot: UInt,
		buffer: Pointer?,
		offset: ULong,
		size: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetIndexBuffer")
	public fun wgpuRenderPassEncoderSetIndexBuffer(
		handler: Pointer?,
		buffer: Pointer?,
		format: UInt,
		offset: ULong,
		size: ULong,
	)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderBeginOcclusionQuery")
	public fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: Pointer?, queryIndex: UInt)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderEndOcclusionQuery")
	public fun wgpuRenderPassEncoderEndOcclusionQuery(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderEnd")
	public fun wgpuRenderPassEncoderEnd(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPassEncoderSetLabel")
	public fun wgpuRenderPassEncoderSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPipelineRelease")
	public fun wgpuRenderPipelineRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPipelineGetBindGroupLayout")
	public fun wgpuRenderPipelineGetBindGroupLayout(handler: Pointer?, groupIndex: UInt): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuRenderPipelineSetLabel")
	public fun wgpuRenderPipelineSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSamplerRelease")
	public fun wgpuSamplerRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSamplerSetLabel")
	public fun wgpuSamplerSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuShaderModuleRelease")
	public fun wgpuShaderModuleRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuShaderModuleGetCompilationInfo")
	public fun wgpuShaderModuleGetCompilationInfo(handler: Pointer?, callbackInfo: WGPUCompilationInfoCallbackInfo.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuShaderModuleSetLabel")
	public fun wgpuShaderModuleSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceRelease")
	public fun wgpuSurfaceRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceConfigure")
	public fun wgpuSurfaceConfigure(handler: Pointer?, config: WGPUSurfaceConfiguration.ByReference?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceGetCapabilities")
	public fun wgpuSurfaceGetCapabilities(
		handler: Pointer?,
		adapter: Pointer?,
		capabilities: WGPUSurfaceCapabilities.ByReference?,
	): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceGetCurrentTexture")
	public fun wgpuSurfaceGetCurrentTexture(handler: Pointer?, surfaceTexture: WGPUSurfaceTexture.ByReference?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfacePresent")
	public fun wgpuSurfacePresent(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceUnconfigure")
	public fun wgpuSurfaceUnconfigure(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuSurfaceSetLabel")
	public fun wgpuSurfaceSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureRelease")
	public fun wgpuTextureRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureCreateView")
	public fun wgpuTextureCreateView(handler: Pointer?, descriptor: WGPUTextureViewDescriptor.ByReference?): Pointer?

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureSetLabel")
	public fun wgpuTextureSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetWidth")
	public fun wgpuTextureGetWidth(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetHeight")
	public fun wgpuTextureGetHeight(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetDepthOrArrayLayers")
	public fun wgpuTextureGetDepthOrArrayLayers(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetMipLevelCount")
	public fun wgpuTextureGetMipLevelCount(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetSampleCount")
	public fun wgpuTextureGetSampleCount(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetDimension")
	public fun wgpuTextureGetDimension(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetFormat")
	public fun wgpuTextureGetFormat(handler: Pointer?): UInt

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureGetUsage")
	public fun wgpuTextureGetUsage(handler: Pointer?): ULong

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureDestroy")
	public fun wgpuTextureDestroy(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureViewRelease")
	public fun wgpuTextureViewRelease(handler: Pointer?)

	@Suppress("INAPPLICABLE_JVM_NAME")
	@JvmName("wgpuTextureViewSetLabel")
	public fun wgpuTextureViewSetLabel(handler: Pointer?, label: WGPUStringView.ByValue)
}

internal val Functions: FunctionsInterface = Native.load("wgpu4k", FunctionsInterface::class.java)
