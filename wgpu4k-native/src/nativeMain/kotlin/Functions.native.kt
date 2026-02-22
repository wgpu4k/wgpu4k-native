// This file has been generated DO NOT EDIT !!!
@file:OptIn(ExperimentalForeignApi::class)

package io.ygdrasil.wgpu

import ffi.ArrayHolder
import ffi.CString
import ffi.CallbackHolder
import ffi.NativeAddress
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.OptIn
import kotlin.UInt
import kotlin.ULong
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toCPointer

public actual fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor?): WGPUInstance? = webgpu.native.wgpuCreateInstance(descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUInstance)

public actual fun wgpuGetInstanceCapabilities(capabilities: WGPUInstanceCapabilities?): WGPUStatus = webgpu.native.wgpuGetInstanceCapabilities(capabilities?.handler?.reinterpret())

public actual fun wgpuDevicePoll(
	device: WGPUDevice?,
	wait: Boolean,
	wrappedSubmissionIndex: NativeAddress?,
): Boolean = webgpu.native.wgpuDevicePoll(device?.handler?.reinterpret(), wait.toUInt(), wrappedSubmissionIndex?.pointer)
	.toBoolean()

public actual fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?) {
	webgpu.native.wgpuSetLogCallback(callback?.handler?.reinterpret(), userdata?.pointer)
}

public actual fun wgpuSetLogLevel(level: WGPULogLevel) {
	webgpu.native.wgpuSetLogLevel(level)
}

public actual fun wgpuAdapterRelease(handler: WGPUAdapter?) {
	webgpu.native.wgpuAdapterRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPULimits?): WGPUStatus = webgpu.native.wgpuAdapterGetLimits(handler?.handler?.reinterpret(), limits?.handler?.reinterpret())

public actual fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean = webgpu.native.wgpuAdapterHasFeature(handler?.handler?.reinterpret(), feature)
	.toBoolean()

public actual fun wgpuAdapterGetFeatures(handler: WGPUAdapter?, features: WGPUSupportedFeatures?) {
	webgpu.native.wgpuAdapterGetFeatures(handler?.handler?.reinterpret(), features?.handler?.reinterpret())
}

public actual fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): WGPUStatus = webgpu.native.wgpuAdapterGetInfo(handler?.handler?.reinterpret(), info?.handler?.reinterpret())

public actual fun wgpuAdapterRequestDevice(
	handler: WGPUAdapter?,
	descriptor: WGPUDeviceDescriptor?,
	callbackInfo: WGPURequestDeviceCallbackInfo,
) {
	webgpu.native.wgpuAdapterRequestDevice(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret(), callbackInfo.toCValue())
}

public actual fun wgpuBindGroupRelease(handler: WGPUBindGroup?) {
	webgpu.native.wgpuBindGroupRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: WGPUStringView) {
	webgpu.native.wgpuBindGroupSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?) {
	webgpu.native.wgpuBindGroupLayoutRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: WGPUStringView) {
	webgpu.native.wgpuBindGroupLayoutSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuBufferRelease(handler: WGPUBuffer?) {
	webgpu.native.wgpuBufferRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuBufferMapAsync(
	handler: WGPUBuffer?,
	mode: ULong,
	offset: ULong,
	size: ULong,
	callbackInfo: WGPUBufferMapCallbackInfo,
) {
	webgpu.native.wgpuBufferMapAsync(handler?.handler?.reinterpret(), mode, offset, size, callbackInfo.toCValue())
}

public actual fun wgpuBufferGetMappedRange(
	handler: WGPUBuffer?,
	offset: ULong,
	size: ULong,
): NativeAddress? = webgpu.native.wgpuBufferGetMappedRange(handler?.handler?.reinterpret(), offset, size)
	?.let(::NativeAddress)

public actual fun wgpuBufferGetConstMappedRange(
	handler: WGPUBuffer?,
	offset: ULong,
	size: ULong,
): NativeAddress? = webgpu.native.wgpuBufferGetConstMappedRange(handler?.handler?.reinterpret(), offset, size)
	?.let(::NativeAddress)

public actual fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: WGPUStringView) {
	webgpu.native.wgpuBufferSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuBufferGetUsage(handler: WGPUBuffer?): ULong = webgpu.native.wgpuBufferGetUsage(handler?.handler?.reinterpret())

public actual fun wgpuBufferGetSize(handler: WGPUBuffer?): ULong = webgpu.native.wgpuBufferGetSize(handler?.handler?.reinterpret())

public actual fun wgpuBufferGetMapState(handler: WGPUBuffer?): WGPUBufferMapState = webgpu.native.wgpuBufferGetMapState(handler?.handler?.reinterpret())

public actual fun wgpuBufferUnmap(handler: WGPUBuffer?) {
	webgpu.native.wgpuBufferUnmap(handler?.handler?.reinterpret())
}

public actual fun wgpuBufferDestroy(handler: WGPUBuffer?) {
	webgpu.native.wgpuBufferDestroy(handler?.handler?.reinterpret())
}

public actual fun wgpuCommandBufferRelease(handler: WGPUCommandBuffer?) {
	webgpu.native.wgpuCommandBufferRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: WGPUStringView) {
	webgpu.native.wgpuCommandBufferSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuCommandEncoderRelease(handler: WGPUCommandEncoder?) {
	webgpu.native.wgpuCommandEncoderRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuCommandEncoderFinish(handler: WGPUCommandEncoder?, descriptor: WGPUCommandBufferDescriptor?): WGPUCommandBuffer? = webgpu.native.wgpuCommandEncoderFinish(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUCommandBuffer)

public actual fun wgpuCommandEncoderBeginComputePass(handler: WGPUCommandEncoder?, descriptor: WGPUComputePassDescriptor?): WGPUComputePassEncoder? = webgpu.native.wgpuCommandEncoderBeginComputePass(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUComputePassEncoder)

public actual fun wgpuCommandEncoderBeginRenderPass(handler: WGPUCommandEncoder?, descriptor: WGPURenderPassDescriptor?): WGPURenderPassEncoder? = webgpu.native.wgpuCommandEncoderBeginRenderPass(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPURenderPassEncoder)

public actual fun wgpuCommandEncoderCopyBufferToBuffer(
	handler: WGPUCommandEncoder?,
	source: WGPUBuffer?,
	sourceOffset: ULong,
	destination: WGPUBuffer?,
	destinationOffset: ULong,
	size: ULong,
) {
	webgpu.native.wgpuCommandEncoderCopyBufferToBuffer(handler?.handler?.reinterpret(), source?.handler?.reinterpret(), sourceOffset, destination?.handler?.reinterpret(), destinationOffset, size)
}

public actual fun wgpuCommandEncoderCopyBufferToTexture(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyBufferInfo?,
	destination: WGPUTexelCopyTextureInfo?,
	copySize: WGPUExtent3D?,
) {
	webgpu.native.wgpuCommandEncoderCopyBufferToTexture(handler?.handler?.reinterpret(), source?.handler?.reinterpret(), destination?.handler?.reinterpret(), copySize?.handler?.reinterpret())
}

public actual fun wgpuCommandEncoderCopyTextureToBuffer(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyTextureInfo?,
	destination: WGPUTexelCopyBufferInfo?,
	copySize: WGPUExtent3D?,
) {
	webgpu.native.wgpuCommandEncoderCopyTextureToBuffer(handler?.handler?.reinterpret(), source?.handler?.reinterpret(), destination?.handler?.reinterpret(), copySize?.handler?.reinterpret())
}

public actual fun wgpuCommandEncoderCopyTextureToTexture(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyTextureInfo?,
	destination: WGPUTexelCopyTextureInfo?,
	copySize: WGPUExtent3D?,
) {
	webgpu.native.wgpuCommandEncoderCopyTextureToTexture(handler?.handler?.reinterpret(), source?.handler?.reinterpret(), destination?.handler?.reinterpret(), copySize?.handler?.reinterpret())
}

public actual fun wgpuCommandEncoderClearBuffer(
	handler: WGPUCommandEncoder?,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
) {
	webgpu.native.wgpuCommandEncoderClearBuffer(handler?.handler?.reinterpret(), buffer?.handler?.reinterpret(), offset, size)
}

public actual fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: WGPUStringView) {
	webgpu.native.wgpuCommandEncoderInsertDebugMarker(handler?.handler?.reinterpret(), markerLabel.toCValue())
}

public actual fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?) {
	webgpu.native.wgpuCommandEncoderPopDebugGroup(handler?.handler?.reinterpret())
}

public actual fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: WGPUStringView) {
	webgpu.native.wgpuCommandEncoderPushDebugGroup(handler?.handler?.reinterpret(), groupLabel.toCValue())
}

public actual fun wgpuCommandEncoderResolveQuerySet(
	handler: WGPUCommandEncoder?,
	querySet: WGPUQuerySet?,
	firstQuery: UInt,
	queryCount: UInt,
	destination: WGPUBuffer?,
	destinationOffset: ULong,
) {
	webgpu.native.wgpuCommandEncoderResolveQuerySet(handler?.handler?.reinterpret(), querySet?.handler?.reinterpret(), firstQuery, queryCount, destination?.handler?.reinterpret(), destinationOffset)
}

public actual fun wgpuCommandEncoderWriteTimestamp(
	handler: WGPUCommandEncoder?,
	querySet: WGPUQuerySet?,
	queryIndex: UInt,
) {
	webgpu.native.wgpuCommandEncoderWriteTimestamp(handler?.handler?.reinterpret(), querySet?.handler?.reinterpret(), queryIndex)
}

public actual fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: WGPUStringView) {
	webgpu.native.wgpuCommandEncoderSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?) {
	webgpu.native.wgpuComputePassEncoderRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: WGPUStringView) {
	webgpu.native.wgpuComputePassEncoderInsertDebugMarker(handler?.handler?.reinterpret(), markerLabel.toCValue())
}

public actual fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?) {
	webgpu.native.wgpuComputePassEncoderPopDebugGroup(handler?.handler?.reinterpret())
}

public actual fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: WGPUStringView) {
	webgpu.native.wgpuComputePassEncoderPushDebugGroup(handler?.handler?.reinterpret(), groupLabel.toCValue())
}

public actual fun wgpuComputePassEncoderSetPipeline(handler: WGPUComputePassEncoder?, pipeline: WGPUComputePipeline?) {
	webgpu.native.wgpuComputePassEncoderSetPipeline(handler?.handler?.reinterpret(), pipeline?.handler?.reinterpret())
}

public actual fun wgpuComputePassEncoderSetBindGroup(
	handler: WGPUComputePassEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
) {
	webgpu.native.wgpuComputePassEncoderSetBindGroup(handler?.handler?.reinterpret(), groupIndex, group?.handler?.reinterpret(), dynamicOffsetCount, dynamicOffsets?.handler?.reinterpret())
}

public actual fun wgpuComputePassEncoderDispatchWorkgroups(
	handler: WGPUComputePassEncoder?,
	workgroupCountX: UInt,
	workgroupCountY: UInt,
	workgroupCountZ: UInt,
) {
	webgpu.native.wgpuComputePassEncoderDispatchWorkgroups(handler?.handler?.reinterpret(), workgroupCountX, workgroupCountY, workgroupCountZ)
}

public actual fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(
	handler: WGPUComputePassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
	webgpu.native.wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

public actual fun wgpuComputePassEncoderEnd(handler: WGPUComputePassEncoder?) {
	webgpu.native.wgpuComputePassEncoderEnd(handler?.handler?.reinterpret())
}

public actual fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: WGPUStringView) {
	webgpu.native.wgpuComputePassEncoderSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?) {
	webgpu.native.wgpuComputePipelineRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout? = webgpu.native.wgpuComputePipelineGetBindGroupLayout(handler?.handler?.reinterpret(), groupIndex)
	?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)

public actual fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: WGPUStringView) {
	webgpu.native.wgpuComputePipelineSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuDeviceRelease(handler: WGPUDevice?) {
	webgpu.native.wgpuDeviceRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuDeviceCreateBindGroup(handler: WGPUDevice?, descriptor: WGPUBindGroupDescriptor?): WGPUBindGroup? = webgpu.native.wgpuDeviceCreateBindGroup(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUBindGroup)

public actual fun wgpuDeviceCreateBindGroupLayout(handler: WGPUDevice?, descriptor: WGPUBindGroupLayoutDescriptor?): WGPUBindGroupLayout? = webgpu.native.wgpuDeviceCreateBindGroupLayout(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)

public actual fun wgpuDeviceCreateBuffer(handler: WGPUDevice?, descriptor: WGPUBufferDescriptor?): WGPUBuffer? = webgpu.native.wgpuDeviceCreateBuffer(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUBuffer)

public actual fun wgpuDeviceCreateCommandEncoder(handler: WGPUDevice?, descriptor: WGPUCommandEncoderDescriptor?): WGPUCommandEncoder? = webgpu.native.wgpuDeviceCreateCommandEncoder(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUCommandEncoder)

public actual fun wgpuDeviceCreateComputePipeline(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?): WGPUComputePipeline? = webgpu.native.wgpuDeviceCreateComputePipeline(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUComputePipeline)

public actual fun wgpuDeviceCreateComputePipelineAsync(
	handler: WGPUDevice?,
	descriptor: WGPUComputePipelineDescriptor?,
	callbackInfo: WGPUCreateComputePipelineAsyncCallbackInfo,
) {
	webgpu.native.wgpuDeviceCreateComputePipelineAsync(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret(), callbackInfo.toCValue())
}

public actual fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout? = webgpu.native.wgpuDeviceCreatePipelineLayout(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUPipelineLayout)

public actual fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet? = webgpu.native.wgpuDeviceCreateQuerySet(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUQuerySet)

public actual fun wgpuDeviceCreateRenderPipelineAsync(
	handler: WGPUDevice?,
	descriptor: WGPURenderPipelineDescriptor?,
	callbackInfo: WGPUCreateRenderPipelineAsyncCallbackInfo,
) {
	webgpu.native.wgpuDeviceCreateRenderPipelineAsync(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret(), callbackInfo.toCValue())
}

public actual fun wgpuDeviceCreateRenderBundleEncoder(handler: WGPUDevice?, descriptor: WGPURenderBundleEncoderDescriptor?): WGPURenderBundleEncoder? = webgpu.native.wgpuDeviceCreateRenderBundleEncoder(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPURenderBundleEncoder)

public actual fun wgpuDeviceCreateRenderPipeline(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?): WGPURenderPipeline? = webgpu.native.wgpuDeviceCreateRenderPipeline(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPURenderPipeline)

public actual fun wgpuDeviceCreateSampler(handler: WGPUDevice?, descriptor: WGPUSamplerDescriptor?): WGPUSampler? = webgpu.native.wgpuDeviceCreateSampler(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUSampler)

public actual fun wgpuDeviceCreateShaderModule(handler: WGPUDevice?, descriptor: WGPUShaderModuleDescriptor?): WGPUShaderModule? = webgpu.native.wgpuDeviceCreateShaderModule(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUShaderModule)

public actual fun wgpuDeviceCreateTexture(handler: WGPUDevice?, descriptor: WGPUTextureDescriptor?): WGPUTexture? = webgpu.native.wgpuDeviceCreateTexture(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUTexture)

public actual fun wgpuDeviceDestroy(handler: WGPUDevice?) {
	webgpu.native.wgpuDeviceDestroy(handler?.handler?.reinterpret())
}

public actual fun wgpuDeviceGetLostFuture(handler: WGPUDevice?): WGPUFuture = webgpu.native.wgpuDeviceGetLostFuture(handler?.handler?.reinterpret())
	.let(WGPUFuture::ByValue)

public actual fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPULimits?): WGPUStatus = webgpu.native.wgpuDeviceGetLimits(handler?.handler?.reinterpret(), limits?.handler?.reinterpret())

public actual fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean = webgpu.native.wgpuDeviceHasFeature(handler?.handler?.reinterpret(), feature)
	.toBoolean()

public actual fun wgpuDeviceGetFeatures(handler: WGPUDevice?, features: WGPUSupportedFeatures?) {
	webgpu.native.wgpuDeviceGetFeatures(handler?.handler?.reinterpret(), features?.handler?.reinterpret())
}

public actual fun wgpuDeviceGetAdapterInfo(handler: WGPUDevice?): WGPUAdapterInfo = webgpu.native.wgpuDeviceGetAdapterInfo(handler?.handler?.reinterpret())
	.let(WGPUAdapterInfo::ByValue)

public actual fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue? = webgpu.native.wgpuDeviceGetQueue(handler?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUQueue)

public actual fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter) {
	webgpu.native.wgpuDevicePushErrorScope(handler?.handler?.reinterpret(), filter)
}

public actual fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callbackInfo: WGPUPopErrorScopeCallbackInfo) {
	webgpu.native.wgpuDevicePopErrorScope(handler?.handler?.reinterpret(), callbackInfo.toCValue())
}

public actual fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: WGPUStringView) {
	webgpu.native.wgpuDeviceSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuInstanceRelease(handler: WGPUInstance?) {
	webgpu.native.wgpuInstanceRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface? = webgpu.native.wgpuInstanceCreateSurface(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUSurface)

public actual fun wgpuInstanceGetWGSLLanguageFeatures(handler: WGPUInstance?, features: WGPUSupportedWGSLLanguageFeatures?): WGPUStatus = webgpu.native.wgpuInstanceGetWGSLLanguageFeatures(handler?.handler?.reinterpret(), features?.handler?.reinterpret())

public actual fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLLanguageFeatureName): Boolean = webgpu.native.wgpuInstanceHasWGSLLanguageFeature(handler?.handler?.reinterpret(), feature)
	.toBoolean()

public actual fun wgpuInstanceProcessEvents(handler: WGPUInstance?) {
	webgpu.native.wgpuInstanceProcessEvents(handler?.handler?.reinterpret())
}

public actual fun wgpuInstanceRequestAdapter(
	handler: WGPUInstance?,
	options: WGPURequestAdapterOptions?,
	callbackInfo: WGPURequestAdapterCallbackInfo,
) {
	webgpu.native.wgpuInstanceRequestAdapter(handler?.handler?.reinterpret(), options?.handler?.reinterpret(), callbackInfo.toCValue())
}

public actual fun wgpuInstanceWaitAny(
	handler: WGPUInstance?,
	futureCount: ULong,
	futures: WGPUFutureWaitInfo?,
	timeoutNS: ULong,
): WGPUWaitStatus = webgpu.native.wgpuInstanceWaitAny(handler?.handler?.reinterpret(), futureCount, futures?.handler?.reinterpret(), timeoutNS)

public actual fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?) {
	webgpu.native.wgpuPipelineLayoutRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: WGPUStringView) {
	webgpu.native.wgpuPipelineLayoutSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuQuerySetRelease(handler: WGPUQuerySet?) {
	webgpu.native.wgpuQuerySetRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: WGPUStringView) {
	webgpu.native.wgpuQuerySetSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuQuerySetGetType(handler: WGPUQuerySet?): WGPUQueryType = webgpu.native.wgpuQuerySetGetType(handler?.handler?.reinterpret())

public actual fun wgpuQuerySetGetCount(handler: WGPUQuerySet?): UInt = webgpu.native.wgpuQuerySetGetCount(handler?.handler?.reinterpret())

public actual fun wgpuQuerySetDestroy(handler: WGPUQuerySet?) {
	webgpu.native.wgpuQuerySetDestroy(handler?.handler?.reinterpret())
}

public actual fun wgpuQueueRelease(handler: WGPUQueue?) {
	webgpu.native.wgpuQueueRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuQueueSubmit(
	handler: WGPUQueue?,
	commandCount: ULong,
	commands: ArrayHolder<WGPUCommandBuffer>?,
) {
	webgpu.native.wgpuQueueSubmit(handler?.handler?.reinterpret(), commandCount, commands?.handler?.reinterpret())
}

public actual fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callbackInfo: WGPUQueueWorkDoneCallbackInfo) {
	webgpu.native.wgpuQueueOnSubmittedWorkDone(handler?.handler?.reinterpret(), callbackInfo.toCValue())
}

public actual fun wgpuQueueWriteBuffer(
	handler: WGPUQueue?,
	buffer: WGPUBuffer?,
	bufferOffset: ULong,
	`data`: NativeAddress?,
	size: ULong,
) {
	webgpu.native.wgpuQueueWriteBuffer(handler?.handler?.reinterpret(), buffer?.handler?.reinterpret(), bufferOffset, data?.pointer, size)
}

public actual fun wgpuQueueWriteTexture(
	handler: WGPUQueue?,
	destination: WGPUTexelCopyTextureInfo?,
	`data`: NativeAddress?,
	dataSize: ULong,
	dataLayout: WGPUTexelCopyBufferLayout?,
	writeSize: WGPUExtent3D?,
) {
	webgpu.native.wgpuQueueWriteTexture(handler?.handler?.reinterpret(), destination?.handler?.reinterpret(), data?.pointer, dataSize, dataLayout?.handler?.reinterpret(), writeSize?.handler?.reinterpret())
}

public actual fun wgpuQueueSetLabel(handler: WGPUQueue?, label: WGPUStringView) {
	webgpu.native.wgpuQueueSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuRenderBundleRelease(handler: WGPURenderBundle?) {
	webgpu.native.wgpuRenderBundleRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: WGPUStringView) {
	webgpu.native.wgpuRenderBundleSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuRenderBundleEncoderRelease(handler: WGPURenderBundleEncoder?) {
	webgpu.native.wgpuRenderBundleEncoderRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuRenderBundleEncoderSetPipeline(handler: WGPURenderBundleEncoder?, pipeline: WGPURenderPipeline?) {
	webgpu.native.wgpuRenderBundleEncoderSetPipeline(handler?.handler?.reinterpret(), pipeline?.handler?.reinterpret())
}

public actual fun wgpuRenderBundleEncoderSetBindGroup(
	handler: WGPURenderBundleEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
) {
	webgpu.native.wgpuRenderBundleEncoderSetBindGroup(handler?.handler?.reinterpret(), groupIndex, group?.handler?.reinterpret(), dynamicOffsetCount, dynamicOffsets?.handler?.reinterpret())
}

public actual fun wgpuRenderBundleEncoderDraw(
	handler: WGPURenderBundleEncoder?,
	vertexCount: UInt,
	instanceCount: UInt,
	firstVertex: UInt,
	firstInstance: UInt,
) {
	webgpu.native.wgpuRenderBundleEncoderDraw(handler?.handler?.reinterpret(), vertexCount, instanceCount, firstVertex, firstInstance)
}

public actual fun wgpuRenderBundleEncoderDrawIndexed(
	handler: WGPURenderBundleEncoder?,
	indexCount: UInt,
	instanceCount: UInt,
	firstIndex: UInt,
	baseVertex: Int,
	firstInstance: UInt,
) {
	webgpu.native.wgpuRenderBundleEncoderDrawIndexed(handler?.handler?.reinterpret(), indexCount, instanceCount, firstIndex, baseVertex, firstInstance)
}

public actual fun wgpuRenderBundleEncoderDrawIndirect(
	handler: WGPURenderBundleEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
	webgpu.native.wgpuRenderBundleEncoderDrawIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

public actual fun wgpuRenderBundleEncoderDrawIndexedIndirect(
	handler: WGPURenderBundleEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
	webgpu.native.wgpuRenderBundleEncoderDrawIndexedIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

public actual fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: WGPUStringView) {
	webgpu.native.wgpuRenderBundleEncoderInsertDebugMarker(handler?.handler?.reinterpret(), markerLabel.toCValue())
}

public actual fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?) {
	webgpu.native.wgpuRenderBundleEncoderPopDebugGroup(handler?.handler?.reinterpret())
}

public actual fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: WGPUStringView) {
	webgpu.native.wgpuRenderBundleEncoderPushDebugGroup(handler?.handler?.reinterpret(), groupLabel.toCValue())
}

public actual fun wgpuRenderBundleEncoderSetVertexBuffer(
	handler: WGPURenderBundleEncoder?,
	slot: UInt,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
) {
	webgpu.native.wgpuRenderBundleEncoderSetVertexBuffer(handler?.handler?.reinterpret(), slot, buffer?.handler?.reinterpret(), offset, size)
}

public actual fun wgpuRenderBundleEncoderSetIndexBuffer(
	handler: WGPURenderBundleEncoder?,
	buffer: WGPUBuffer?,
	format: WGPUIndexFormat,
	offset: ULong,
	size: ULong,
) {
	webgpu.native.wgpuRenderBundleEncoderSetIndexBuffer(handler?.handler?.reinterpret(), buffer?.handler?.reinterpret(), format, offset, size)
}

public actual fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle? = webgpu.native.wgpuRenderBundleEncoderFinish(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPURenderBundle)

public actual fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: WGPUStringView) {
	webgpu.native.wgpuRenderBundleEncoderSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuRenderPassEncoderRelease(handler: WGPURenderPassEncoder?) {
	webgpu.native.wgpuRenderPassEncoderRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuRenderPassEncoderSetPipeline(handler: WGPURenderPassEncoder?, pipeline: WGPURenderPipeline?) {
	webgpu.native.wgpuRenderPassEncoderSetPipeline(handler?.handler?.reinterpret(), pipeline?.handler?.reinterpret())
}

public actual fun wgpuRenderPassEncoderSetBindGroup(
	handler: WGPURenderPassEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
) {
	webgpu.native.wgpuRenderPassEncoderSetBindGroup(handler?.handler?.reinterpret(), groupIndex, group?.handler?.reinterpret(), dynamicOffsetCount, dynamicOffsets?.handler?.reinterpret())
}

public actual fun wgpuRenderPassEncoderDraw(
	handler: WGPURenderPassEncoder?,
	vertexCount: UInt,
	instanceCount: UInt,
	firstVertex: UInt,
	firstInstance: UInt,
) {
	webgpu.native.wgpuRenderPassEncoderDraw(handler?.handler?.reinterpret(), vertexCount, instanceCount, firstVertex, firstInstance)
}

public actual fun wgpuRenderPassEncoderDrawIndexed(
	handler: WGPURenderPassEncoder?,
	indexCount: UInt,
	instanceCount: UInt,
	firstIndex: UInt,
	baseVertex: Int,
	firstInstance: UInt,
) {
	webgpu.native.wgpuRenderPassEncoderDrawIndexed(handler?.handler?.reinterpret(), indexCount, instanceCount, firstIndex, baseVertex, firstInstance)
}

public actual fun wgpuRenderPassEncoderDrawIndirect(
	handler: WGPURenderPassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
	webgpu.native.wgpuRenderPassEncoderDrawIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

public actual fun wgpuRenderPassEncoderDrawIndexedIndirect(
	handler: WGPURenderPassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
	webgpu.native.wgpuRenderPassEncoderDrawIndexedIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

public actual fun wgpuRenderPassEncoderExecuteBundles(
	handler: WGPURenderPassEncoder?,
	bundleCount: ULong,
	bundles: ArrayHolder<WGPURenderBundle>?,
) {
	webgpu.native.wgpuRenderPassEncoderExecuteBundles(handler?.handler?.reinterpret(), bundleCount, bundles?.handler?.reinterpret())
}

public actual fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: WGPUStringView) {
	webgpu.native.wgpuRenderPassEncoderInsertDebugMarker(handler?.handler?.reinterpret(), markerLabel.toCValue())
}

public actual fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?) {
	webgpu.native.wgpuRenderPassEncoderPopDebugGroup(handler?.handler?.reinterpret())
}

public actual fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: WGPUStringView) {
	webgpu.native.wgpuRenderPassEncoderPushDebugGroup(handler?.handler?.reinterpret(), groupLabel.toCValue())
}

public actual fun wgpuRenderPassEncoderSetStencilReference(handler: WGPURenderPassEncoder?, reference: UInt) {
	webgpu.native.wgpuRenderPassEncoderSetStencilReference(handler?.handler?.reinterpret(), reference)
}

public actual fun wgpuRenderPassEncoderSetBlendConstant(handler: WGPURenderPassEncoder?, color: WGPUColor?) {
	webgpu.native.wgpuRenderPassEncoderSetBlendConstant(handler?.handler?.reinterpret(), color?.handler?.reinterpret())
}

public actual fun wgpuRenderPassEncoderSetViewport(
	handler: WGPURenderPassEncoder?,
	x: Float,
	y: Float,
	width: Float,
	height: Float,
	minDepth: Float,
	maxDepth: Float,
) {
	webgpu.native.wgpuRenderPassEncoderSetViewport(handler?.handler?.reinterpret(), x, y, width, height, minDepth, maxDepth)
}

public actual fun wgpuRenderPassEncoderSetScissorRect(
	handler: WGPURenderPassEncoder?,
	x: UInt,
	y: UInt,
	width: UInt,
	height: UInt,
) {
	webgpu.native.wgpuRenderPassEncoderSetScissorRect(handler?.handler?.reinterpret(), x, y, width, height)
}

public actual fun wgpuRenderPassEncoderSetVertexBuffer(
	handler: WGPURenderPassEncoder?,
	slot: UInt,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
) {
	webgpu.native.wgpuRenderPassEncoderSetVertexBuffer(handler?.handler?.reinterpret(), slot, buffer?.handler?.reinterpret(), offset, size)
}

public actual fun wgpuRenderPassEncoderSetIndexBuffer(
	handler: WGPURenderPassEncoder?,
	buffer: WGPUBuffer?,
	format: WGPUIndexFormat,
	offset: ULong,
	size: ULong,
) {
	webgpu.native.wgpuRenderPassEncoderSetIndexBuffer(handler?.handler?.reinterpret(), buffer?.handler?.reinterpret(), format, offset, size)
}

public actual fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: WGPURenderPassEncoder?, queryIndex: UInt) {
	webgpu.native.wgpuRenderPassEncoderBeginOcclusionQuery(handler?.handler?.reinterpret(), queryIndex)
}

public actual fun wgpuRenderPassEncoderEndOcclusionQuery(handler: WGPURenderPassEncoder?) {
	webgpu.native.wgpuRenderPassEncoderEndOcclusionQuery(handler?.handler?.reinterpret())
}

public actual fun wgpuRenderPassEncoderEnd(handler: WGPURenderPassEncoder?) {
	webgpu.native.wgpuRenderPassEncoderEnd(handler?.handler?.reinterpret())
}

public actual fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: WGPUStringView) {
	webgpu.native.wgpuRenderPassEncoderSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?) {
	webgpu.native.wgpuRenderPipelineRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout? = webgpu.native.wgpuRenderPipelineGetBindGroupLayout(handler?.handler?.reinterpret(), groupIndex)
	?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)

public actual fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: WGPUStringView) {
	webgpu.native.wgpuRenderPipelineSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuSamplerRelease(handler: WGPUSampler?) {
	webgpu.native.wgpuSamplerRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: WGPUStringView) {
	webgpu.native.wgpuSamplerSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuShaderModuleRelease(handler: WGPUShaderModule?) {
	webgpu.native.wgpuShaderModuleRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callbackInfo: WGPUCompilationInfoCallbackInfo) {
	webgpu.native.wgpuShaderModuleGetCompilationInfo(handler?.handler?.reinterpret(), callbackInfo.toCValue())
}

public actual fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: WGPUStringView) {
	webgpu.native.wgpuShaderModuleSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuSurfaceRelease(handler: WGPUSurface?) {
	webgpu.native.wgpuSurfaceRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?) {
	webgpu.native.wgpuSurfaceConfigure(handler?.handler?.reinterpret(), config?.handler?.reinterpret())
}

public actual fun wgpuSurfaceGetCapabilities(
	handler: WGPUSurface?,
	adapter: WGPUAdapter?,
	capabilities: WGPUSurfaceCapabilities?,
): WGPUStatus = webgpu.native.wgpuSurfaceGetCapabilities(handler?.handler?.reinterpret(), adapter?.handler?.reinterpret(), capabilities?.handler?.reinterpret())

public actual fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?) {
	webgpu.native.wgpuSurfaceGetCurrentTexture(handler?.handler?.reinterpret(), surfaceTexture?.handler?.reinterpret())
}

public actual fun wgpuSurfacePresent(handler: WGPUSurface?): WGPUStatus = webgpu.native.wgpuSurfacePresent(handler?.handler?.reinterpret())

public actual fun wgpuSurfaceUnconfigure(handler: WGPUSurface?) {
	webgpu.native.wgpuSurfaceUnconfigure(handler?.handler?.reinterpret())
}

public actual fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: WGPUStringView) {
	webgpu.native.wgpuSurfaceSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuTextureRelease(handler: WGPUTexture?) {
	webgpu.native.wgpuTextureRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView? = webgpu.native.wgpuTextureCreateView(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
	?.let(::NativeAddress)?.let(::WGPUTextureView)

public actual fun wgpuTextureSetLabel(handler: WGPUTexture?, label: WGPUStringView) {
	webgpu.native.wgpuTextureSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

public actual fun wgpuTextureGetWidth(handler: WGPUTexture?): UInt = webgpu.native.wgpuTextureGetWidth(handler?.handler?.reinterpret())

public actual fun wgpuTextureGetHeight(handler: WGPUTexture?): UInt = webgpu.native.wgpuTextureGetHeight(handler?.handler?.reinterpret())

public actual fun wgpuTextureGetDepthOrArrayLayers(handler: WGPUTexture?): UInt = webgpu.native.wgpuTextureGetDepthOrArrayLayers(handler?.handler?.reinterpret())

public actual fun wgpuTextureGetMipLevelCount(handler: WGPUTexture?): UInt = webgpu.native.wgpuTextureGetMipLevelCount(handler?.handler?.reinterpret())

public actual fun wgpuTextureGetSampleCount(handler: WGPUTexture?): UInt = webgpu.native.wgpuTextureGetSampleCount(handler?.handler?.reinterpret())

public actual fun wgpuTextureGetDimension(handler: WGPUTexture?): WGPUTextureDimension = webgpu.native.wgpuTextureGetDimension(handler?.handler?.reinterpret())

public actual fun wgpuTextureGetFormat(handler: WGPUTexture?): WGPUTextureFormat = webgpu.native.wgpuTextureGetFormat(handler?.handler?.reinterpret())

public actual fun wgpuTextureGetUsage(handler: WGPUTexture?): ULong = webgpu.native.wgpuTextureGetUsage(handler?.handler?.reinterpret())

public actual fun wgpuTextureDestroy(handler: WGPUTexture?) {
	webgpu.native.wgpuTextureDestroy(handler?.handler?.reinterpret())
}

public actual fun wgpuTextureViewRelease(handler: WGPUTextureView?) {
	webgpu.native.wgpuTextureViewRelease(handler?.handler?.reinterpret())
}

public actual fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: WGPUStringView) {
	webgpu.native.wgpuTextureViewSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}
