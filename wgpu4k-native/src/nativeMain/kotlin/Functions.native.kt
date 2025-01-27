@file:OptIn(ExperimentalForeignApi::class)
// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.CString
import ffi.NativeAddress
import ffi.ArrayHolder
import ffi.CallbackHolder
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toCPointer


actual fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor?): WGPUInstance? {
	return webgpu.native.wgpuCreateInstance(descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUInstance)
}

actual fun wgpuGetInstanceCapabilities(capabilities: WGPUInstanceCapabilities?): WGPUStatus {
	return webgpu.native.wgpuGetInstanceCapabilities(capabilities?.handler?.reinterpret())
}

actual fun wgpuDevicePoll(device: WGPUDevice?, wait: Boolean, wrappedSubmissionIndex: NativeAddress?): Boolean {
	return webgpu.native.wgpuDevicePoll(device?.handler?.reinterpret(), wait.toUInt(), wrappedSubmissionIndex?.pointer?.reinterpret())
		.toBoolean()
}

actual fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?): Unit {
	webgpu.native.wgpuSetLogCallback(callback?.handler?.reinterpret(), userdata?.pointer)
}

actual fun wgpuSetLogLevel(level: WGPULogLevel): Unit {
	webgpu.native.wgpuSetLogLevel(level)
}

actual fun wgpuAdapterRelease(handler: WGPUAdapter?): Unit {
	webgpu.native.wgpuAdapterRelease(handler?.handler?.reinterpret())
}

actual fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPULimits?): WGPUStatus {
	return webgpu.native.wgpuAdapterGetLimits(handler?.handler?.reinterpret(), limits?.handler?.reinterpret())
}

actual fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean {
	return webgpu.native.wgpuAdapterHasFeature(handler?.handler?.reinterpret(), feature)
		.toBoolean()
}

actual fun wgpuAdapterGetFeatures(handler: WGPUAdapter?, features: WGPUSupportedFeatures?): Unit {
	webgpu.native.wgpuAdapterGetFeatures(handler?.handler?.reinterpret(), features?.handler?.reinterpret())
}

actual fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): WGPUStatus {
	return webgpu.native.wgpuAdapterGetInfo(handler?.handler?.reinterpret(), info?.handler?.reinterpret())
}

actual fun wgpuAdapterRequestDevice(handler: WGPUAdapter?, descriptor: WGPUDeviceDescriptor?, callbackInfo: WGPURequestDeviceCallbackInfo): Unit {
	webgpu.native.wgpuAdapterRequestDevice(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret(), callbackInfo.toCValue())
}

actual fun wgpuBindGroupRelease(handler: WGPUBindGroup?): Unit {
	webgpu.native.wgpuBindGroupRelease(handler?.handler?.reinterpret())
}

actual fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: WGPUStringView): Unit {
	webgpu.native.wgpuBindGroupSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?): Unit {
	webgpu.native.wgpuBindGroupLayoutRelease(handler?.handler?.reinterpret())
}

actual fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: WGPUStringView): Unit {
	webgpu.native.wgpuBindGroupLayoutSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuBufferRelease(handler: WGPUBuffer?): Unit {
	webgpu.native.wgpuBufferRelease(handler?.handler?.reinterpret())
}

actual fun wgpuBufferMapAsync(handler: WGPUBuffer?, mode: ULong, offset: ULong, size: ULong, callbackInfo: WGPUBufferMapCallbackInfo): Unit {
	webgpu.native.wgpuBufferMapAsync(handler?.handler?.reinterpret(), mode, offset, size, callbackInfo.toCValue())
}

actual fun wgpuBufferGetMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress? {
	return webgpu.native.wgpuBufferGetMappedRange(handler?.handler?.reinterpret(), offset, size)
		?.let(::NativeAddress)
}

actual fun wgpuBufferGetConstMappedRange(handler: WGPUBuffer?, offset: ULong, size: ULong): NativeAddress? {
	return webgpu.native.wgpuBufferGetConstMappedRange(handler?.handler?.reinterpret(), offset, size)
		?.let(::NativeAddress)
}

actual fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: WGPUStringView): Unit {
	webgpu.native.wgpuBufferSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuBufferGetUsage(handler: WGPUBuffer?): ULong {
	return webgpu.native.wgpuBufferGetUsage(handler?.handler?.reinterpret())
}

actual fun wgpuBufferGetSize(handler: WGPUBuffer?): ULong {
	return webgpu.native.wgpuBufferGetSize(handler?.handler?.reinterpret())
}

actual fun wgpuBufferGetMapState(handler: WGPUBuffer?): WGPUBufferMapState {
	return webgpu.native.wgpuBufferGetMapState(handler?.handler?.reinterpret())
}

actual fun wgpuBufferUnmap(handler: WGPUBuffer?): Unit {
	webgpu.native.wgpuBufferUnmap(handler?.handler?.reinterpret())
}

actual fun wgpuBufferDestroy(handler: WGPUBuffer?): Unit {
	webgpu.native.wgpuBufferDestroy(handler?.handler?.reinterpret())
}

actual fun wgpuCommandBufferRelease(handler: WGPUCommandBuffer?): Unit {
	webgpu.native.wgpuCommandBufferRelease(handler?.handler?.reinterpret())
}

actual fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: WGPUStringView): Unit {
	webgpu.native.wgpuCommandBufferSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuCommandEncoderRelease(handler: WGPUCommandEncoder?): Unit {
	webgpu.native.wgpuCommandEncoderRelease(handler?.handler?.reinterpret())
}

actual fun wgpuCommandEncoderFinish(handler: WGPUCommandEncoder?, descriptor: WGPUCommandBufferDescriptor?): WGPUCommandBuffer? {
	return webgpu.native.wgpuCommandEncoderFinish(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUCommandBuffer)
}

actual fun wgpuCommandEncoderBeginComputePass(handler: WGPUCommandEncoder?, descriptor: WGPUComputePassDescriptor?): WGPUComputePassEncoder? {
	return webgpu.native.wgpuCommandEncoderBeginComputePass(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUComputePassEncoder)
}

actual fun wgpuCommandEncoderBeginRenderPass(handler: WGPUCommandEncoder?, descriptor: WGPURenderPassDescriptor?): WGPURenderPassEncoder? {
	return webgpu.native.wgpuCommandEncoderBeginRenderPass(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPURenderPassEncoder)
}

actual fun wgpuCommandEncoderCopyBufferToBuffer(handler: WGPUCommandEncoder?, source: WGPUBuffer?, sourceOffset: ULong, destination: WGPUBuffer?, destinationOffset: ULong, size: ULong): Unit {
	webgpu.native.wgpuCommandEncoderCopyBufferToBuffer(handler?.handler?.reinterpret(), source?.handler?.reinterpret(), sourceOffset, destination?.handler?.reinterpret(), destinationOffset, size)
}

actual fun wgpuCommandEncoderCopyBufferToTexture(handler: WGPUCommandEncoder?, source: WGPUTexelCopyBufferInfo?, destination: WGPUTexelCopyTextureInfo?, copySize: WGPUExtent3D?): Unit {
	webgpu.native.wgpuCommandEncoderCopyBufferToTexture(handler?.handler?.reinterpret(), source?.handler?.reinterpret(), destination?.handler?.reinterpret(), copySize?.handler?.reinterpret())
}

actual fun wgpuCommandEncoderCopyTextureToBuffer(handler: WGPUCommandEncoder?, source: WGPUTexelCopyTextureInfo?, destination: WGPUTexelCopyBufferInfo?, copySize: WGPUExtent3D?): Unit {
	webgpu.native.wgpuCommandEncoderCopyTextureToBuffer(handler?.handler?.reinterpret(), source?.handler?.reinterpret(), destination?.handler?.reinterpret(), copySize?.handler?.reinterpret())
}

actual fun wgpuCommandEncoderCopyTextureToTexture(handler: WGPUCommandEncoder?, source: WGPUTexelCopyTextureInfo?, destination: WGPUTexelCopyTextureInfo?, copySize: WGPUExtent3D?): Unit {
	webgpu.native.wgpuCommandEncoderCopyTextureToTexture(handler?.handler?.reinterpret(), source?.handler?.reinterpret(), destination?.handler?.reinterpret(), copySize?.handler?.reinterpret())
}

actual fun wgpuCommandEncoderClearBuffer(handler: WGPUCommandEncoder?, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit {
	webgpu.native.wgpuCommandEncoderClearBuffer(handler?.handler?.reinterpret(), buffer?.handler?.reinterpret(), offset, size)
}

actual fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: WGPUStringView): Unit {
	webgpu.native.wgpuCommandEncoderInsertDebugMarker(handler?.handler?.reinterpret(), markerLabel.toCValue())
}

actual fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?): Unit {
	webgpu.native.wgpuCommandEncoderPopDebugGroup(handler?.handler?.reinterpret())
}

actual fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: WGPUStringView): Unit {
	webgpu.native.wgpuCommandEncoderPushDebugGroup(handler?.handler?.reinterpret(), groupLabel.toCValue())
}

actual fun wgpuCommandEncoderResolveQuerySet(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, firstQuery: UInt, queryCount: UInt, destination: WGPUBuffer?, destinationOffset: ULong): Unit {
	webgpu.native.wgpuCommandEncoderResolveQuerySet(handler?.handler?.reinterpret(), querySet?.handler?.reinterpret(), firstQuery, queryCount, destination?.handler?.reinterpret(), destinationOffset)
}

actual fun wgpuCommandEncoderWriteTimestamp(handler: WGPUCommandEncoder?, querySet: WGPUQuerySet?, queryIndex: UInt): Unit {
	webgpu.native.wgpuCommandEncoderWriteTimestamp(handler?.handler?.reinterpret(), querySet?.handler?.reinterpret(), queryIndex)
}

actual fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: WGPUStringView): Unit {
	webgpu.native.wgpuCommandEncoderSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?): Unit {
	webgpu.native.wgpuComputePassEncoderRelease(handler?.handler?.reinterpret())
}

actual fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: WGPUStringView): Unit {
	webgpu.native.wgpuComputePassEncoderInsertDebugMarker(handler?.handler?.reinterpret(), markerLabel.toCValue())
}

actual fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?): Unit {
	webgpu.native.wgpuComputePassEncoderPopDebugGroup(handler?.handler?.reinterpret())
}

actual fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: WGPUStringView): Unit {
	webgpu.native.wgpuComputePassEncoderPushDebugGroup(handler?.handler?.reinterpret(), groupLabel.toCValue())
}

actual fun wgpuComputePassEncoderSetPipeline(handler: WGPUComputePassEncoder?, pipeline: WGPUComputePipeline?): Unit {
	webgpu.native.wgpuComputePassEncoderSetPipeline(handler?.handler?.reinterpret(), pipeline?.handler?.reinterpret())
}

actual fun wgpuComputePassEncoderSetBindGroup(handler: WGPUComputePassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit {
	webgpu.native.wgpuComputePassEncoderSetBindGroup(handler?.handler?.reinterpret(), groupIndex, group?.handler?.reinterpret(), dynamicOffsetCount, dynamicOffsets?.handler?.reinterpret())
}

actual fun wgpuComputePassEncoderDispatchWorkgroups(handler: WGPUComputePassEncoder?, workgroupCountX: UInt, workgroupCountY: UInt, workgroupCountZ: UInt): Unit {
	webgpu.native.wgpuComputePassEncoderDispatchWorkgroups(handler?.handler?.reinterpret(), workgroupCountX, workgroupCountY, workgroupCountZ)
}

actual fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler: WGPUComputePassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit {
	webgpu.native.wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

actual fun wgpuComputePassEncoderEnd(handler: WGPUComputePassEncoder?): Unit {
	webgpu.native.wgpuComputePassEncoderEnd(handler?.handler?.reinterpret())
}

actual fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: WGPUStringView): Unit {
	webgpu.native.wgpuComputePassEncoderSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?): Unit {
	webgpu.native.wgpuComputePipelineRelease(handler?.handler?.reinterpret())
}

actual fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout? {
	return webgpu.native.wgpuComputePipelineGetBindGroupLayout(handler?.handler?.reinterpret(), groupIndex)
		?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)
}

actual fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: WGPUStringView): Unit {
	webgpu.native.wgpuComputePipelineSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuDeviceRelease(handler: WGPUDevice?): Unit {
	webgpu.native.wgpuDeviceRelease(handler?.handler?.reinterpret())
}

actual fun wgpuDeviceCreateBindGroup(handler: WGPUDevice?, descriptor: WGPUBindGroupDescriptor?): WGPUBindGroup? {
	return webgpu.native.wgpuDeviceCreateBindGroup(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUBindGroup)
}

actual fun wgpuDeviceCreateBindGroupLayout(handler: WGPUDevice?, descriptor: WGPUBindGroupLayoutDescriptor?): WGPUBindGroupLayout? {
	return webgpu.native.wgpuDeviceCreateBindGroupLayout(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)
}

actual fun wgpuDeviceCreateBuffer(handler: WGPUDevice?, descriptor: WGPUBufferDescriptor?): WGPUBuffer? {
	return webgpu.native.wgpuDeviceCreateBuffer(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUBuffer)
}

actual fun wgpuDeviceCreateCommandEncoder(handler: WGPUDevice?, descriptor: WGPUCommandEncoderDescriptor?): WGPUCommandEncoder? {
	return webgpu.native.wgpuDeviceCreateCommandEncoder(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUCommandEncoder)
}

actual fun wgpuDeviceCreateComputePipeline(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?): WGPUComputePipeline? {
	return webgpu.native.wgpuDeviceCreateComputePipeline(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUComputePipeline)
}

actual fun wgpuDeviceCreateComputePipelineAsync(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?, callbackInfo: WGPUCreateComputePipelineAsyncCallbackInfo): Unit {
	webgpu.native.wgpuDeviceCreateComputePipelineAsync(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret(), callbackInfo.toCValue())
}

actual fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout? {
	return webgpu.native.wgpuDeviceCreatePipelineLayout(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUPipelineLayout)
}

actual fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet? {
	return webgpu.native.wgpuDeviceCreateQuerySet(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUQuerySet)
}

actual fun wgpuDeviceCreateRenderPipelineAsync(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?, callbackInfo: WGPUCreateRenderPipelineAsyncCallbackInfo): Unit {
	webgpu.native.wgpuDeviceCreateRenderPipelineAsync(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret(), callbackInfo.toCValue())
}

actual fun wgpuDeviceCreateRenderBundleEncoder(handler: WGPUDevice?, descriptor: WGPURenderBundleEncoderDescriptor?): WGPURenderBundleEncoder? {
	return webgpu.native.wgpuDeviceCreateRenderBundleEncoder(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPURenderBundleEncoder)
}

actual fun wgpuDeviceCreateRenderPipeline(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?): WGPURenderPipeline? {
	return webgpu.native.wgpuDeviceCreateRenderPipeline(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPURenderPipeline)
}

actual fun wgpuDeviceCreateSampler(handler: WGPUDevice?, descriptor: WGPUSamplerDescriptor?): WGPUSampler? {
	return webgpu.native.wgpuDeviceCreateSampler(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUSampler)
}

actual fun wgpuDeviceCreateShaderModule(handler: WGPUDevice?, descriptor: WGPUShaderModuleDescriptor?): WGPUShaderModule? {
	return webgpu.native.wgpuDeviceCreateShaderModule(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUShaderModule)
}

actual fun wgpuDeviceCreateTexture(handler: WGPUDevice?, descriptor: WGPUTextureDescriptor?): WGPUTexture? {
	return webgpu.native.wgpuDeviceCreateTexture(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUTexture)
}

actual fun wgpuDeviceDestroy(handler: WGPUDevice?): Unit {
	webgpu.native.wgpuDeviceDestroy(handler?.handler?.reinterpret())
}

actual fun wgpuDeviceGetLostFuture(handler: WGPUDevice?): WGPUFuture {
	return webgpu.native.wgpuDeviceGetLostFuture(handler?.handler?.reinterpret())
		.let(WGPUFuture::ByValue)
}

actual fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPULimits?): WGPUStatus {
	return webgpu.native.wgpuDeviceGetLimits(handler?.handler?.reinterpret(), limits?.handler?.reinterpret())
}

actual fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean {
	return webgpu.native.wgpuDeviceHasFeature(handler?.handler?.reinterpret(), feature)
		.toBoolean()
}

actual fun wgpuDeviceGetFeatures(handler: WGPUDevice?, features: WGPUSupportedFeatures?): Unit {
	webgpu.native.wgpuDeviceGetFeatures(handler?.handler?.reinterpret(), features?.handler?.reinterpret())
}

actual fun wgpuDeviceGetAdapterInfo(handler: WGPUDevice?): WGPUAdapterInfo {
	return webgpu.native.wgpuDeviceGetAdapterInfo(handler?.handler?.reinterpret())
		.let(WGPUAdapterInfo::ByValue)
}

actual fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue? {
	return webgpu.native.wgpuDeviceGetQueue(handler?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUQueue)
}

actual fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter): Unit {
	webgpu.native.wgpuDevicePushErrorScope(handler?.handler?.reinterpret(), filter)
}

actual fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callbackInfo: WGPUPopErrorScopeCallbackInfo): Unit {
	webgpu.native.wgpuDevicePopErrorScope(handler?.handler?.reinterpret(), callbackInfo.toCValue())
}

actual fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: WGPUStringView): Unit {
	webgpu.native.wgpuDeviceSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuInstanceRelease(handler: WGPUInstance?): Unit {
	webgpu.native.wgpuInstanceRelease(handler?.handler?.reinterpret())
}

actual fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface? {
	return webgpu.native.wgpuInstanceCreateSurface(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUSurface)
}

actual fun wgpuInstanceGetWGSLLanguageFeatures(handler: WGPUInstance?, features: WGPUSupportedWGSLLanguageFeatures?): WGPUStatus {
	return webgpu.native.wgpuInstanceGetWGSLLanguageFeatures(handler?.handler?.reinterpret(), features?.handler?.reinterpret())
}

actual fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLLanguageFeatureName): Boolean {
	return webgpu.native.wgpuInstanceHasWGSLLanguageFeature(handler?.handler?.reinterpret(), feature)
		.toBoolean()
}

actual fun wgpuInstanceProcessEvents(handler: WGPUInstance?): Unit {
	webgpu.native.wgpuInstanceProcessEvents(handler?.handler?.reinterpret())
}

actual fun wgpuInstanceRequestAdapter(handler: WGPUInstance?, options: WGPURequestAdapterOptions?, callbackInfo: WGPURequestAdapterCallbackInfo): Unit {
	webgpu.native.wgpuInstanceRequestAdapter(handler?.handler?.reinterpret(), options?.handler?.reinterpret(), callbackInfo.toCValue())
}

actual fun wgpuInstanceWaitAny(handler: WGPUInstance?, futureCount: ULong, futures: WGPUFutureWaitInfo?, timeoutNS: ULong): WGPUWaitStatus {
	return webgpu.native.wgpuInstanceWaitAny(handler?.handler?.reinterpret(), futureCount, futures?.handler?.reinterpret(), timeoutNS)
}

actual fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?): Unit {
	webgpu.native.wgpuPipelineLayoutRelease(handler?.handler?.reinterpret())
}

actual fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: WGPUStringView): Unit {
	webgpu.native.wgpuPipelineLayoutSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuQuerySetRelease(handler: WGPUQuerySet?): Unit {
	webgpu.native.wgpuQuerySetRelease(handler?.handler?.reinterpret())
}

actual fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: WGPUStringView): Unit {
	webgpu.native.wgpuQuerySetSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuQuerySetGetType(handler: WGPUQuerySet?): WGPUQueryType {
	return webgpu.native.wgpuQuerySetGetType(handler?.handler?.reinterpret())
}

actual fun wgpuQuerySetGetCount(handler: WGPUQuerySet?): UInt {
	return webgpu.native.wgpuQuerySetGetCount(handler?.handler?.reinterpret())
}

actual fun wgpuQuerySetDestroy(handler: WGPUQuerySet?): Unit {
	webgpu.native.wgpuQuerySetDestroy(handler?.handler?.reinterpret())
}

actual fun wgpuQueueRelease(handler: WGPUQueue?): Unit {
	webgpu.native.wgpuQueueRelease(handler?.handler?.reinterpret())
}

actual fun wgpuQueueSubmit(handler: WGPUQueue?, commandCount: ULong, commands: ArrayHolder<WGPUCommandBuffer>?): Unit {
	webgpu.native.wgpuQueueSubmit(handler?.handler?.reinterpret(), commandCount, commands?.handler?.reinterpret())
}

actual fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callbackInfo: WGPUQueueWorkDoneCallbackInfo): Unit {
	webgpu.native.wgpuQueueOnSubmittedWorkDone(handler?.handler?.reinterpret(), callbackInfo.toCValue())
}

actual fun wgpuQueueWriteBuffer(handler: WGPUQueue?, buffer: WGPUBuffer?, bufferOffset: ULong, data: NativeAddress?, size: ULong): Unit {
	webgpu.native.wgpuQueueWriteBuffer(handler?.handler?.reinterpret(), buffer?.handler?.reinterpret(), bufferOffset, data?.pointer, size)
}

actual fun wgpuQueueWriteTexture(handler: WGPUQueue?, destination: WGPUTexelCopyTextureInfo?, data: NativeAddress?, dataSize: ULong, dataLayout: WGPUTexelCopyBufferLayout?, writeSize: WGPUExtent3D?): Unit {
	webgpu.native.wgpuQueueWriteTexture(handler?.handler?.reinterpret(), destination?.handler?.reinterpret(), data?.pointer, dataSize, dataLayout?.handler?.reinterpret(), writeSize?.handler?.reinterpret())
}

actual fun wgpuQueueSetLabel(handler: WGPUQueue?, label: WGPUStringView): Unit {
	webgpu.native.wgpuQueueSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuRenderBundleRelease(handler: WGPURenderBundle?): Unit {
	webgpu.native.wgpuRenderBundleRelease(handler?.handler?.reinterpret())
}

actual fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: WGPUStringView): Unit {
	webgpu.native.wgpuRenderBundleSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuRenderBundleEncoderRelease(handler: WGPURenderBundleEncoder?): Unit {
	webgpu.native.wgpuRenderBundleEncoderRelease(handler?.handler?.reinterpret())
}

actual fun wgpuRenderBundleEncoderSetPipeline(handler: WGPURenderBundleEncoder?, pipeline: WGPURenderPipeline?): Unit {
	webgpu.native.wgpuRenderBundleEncoderSetPipeline(handler?.handler?.reinterpret(), pipeline?.handler?.reinterpret())
}

actual fun wgpuRenderBundleEncoderSetBindGroup(handler: WGPURenderBundleEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit {
	webgpu.native.wgpuRenderBundleEncoderSetBindGroup(handler?.handler?.reinterpret(), groupIndex, group?.handler?.reinterpret(), dynamicOffsetCount, dynamicOffsets?.handler?.reinterpret())
}

actual fun wgpuRenderBundleEncoderDraw(handler: WGPURenderBundleEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit {
	webgpu.native.wgpuRenderBundleEncoderDraw(handler?.handler?.reinterpret(), vertexCount, instanceCount, firstVertex, firstInstance)
}

actual fun wgpuRenderBundleEncoderDrawIndexed(handler: WGPURenderBundleEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit {
	webgpu.native.wgpuRenderBundleEncoderDrawIndexed(handler?.handler?.reinterpret(), indexCount, instanceCount, firstIndex, baseVertex, firstInstance)
}

actual fun wgpuRenderBundleEncoderDrawIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit {
	webgpu.native.wgpuRenderBundleEncoderDrawIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

actual fun wgpuRenderBundleEncoderDrawIndexedIndirect(handler: WGPURenderBundleEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit {
	webgpu.native.wgpuRenderBundleEncoderDrawIndexedIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

actual fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: WGPUStringView): Unit {
	webgpu.native.wgpuRenderBundleEncoderInsertDebugMarker(handler?.handler?.reinterpret(), markerLabel.toCValue())
}

actual fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?): Unit {
	webgpu.native.wgpuRenderBundleEncoderPopDebugGroup(handler?.handler?.reinterpret())
}

actual fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: WGPUStringView): Unit {
	webgpu.native.wgpuRenderBundleEncoderPushDebugGroup(handler?.handler?.reinterpret(), groupLabel.toCValue())
}

actual fun wgpuRenderBundleEncoderSetVertexBuffer(handler: WGPURenderBundleEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit {
	webgpu.native.wgpuRenderBundleEncoderSetVertexBuffer(handler?.handler?.reinterpret(), slot, buffer?.handler?.reinterpret(), offset, size)
}

actual fun wgpuRenderBundleEncoderSetIndexBuffer(handler: WGPURenderBundleEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit {
	webgpu.native.wgpuRenderBundleEncoderSetIndexBuffer(handler?.handler?.reinterpret(), buffer?.handler?.reinterpret(), format, offset, size)
}

actual fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle? {
	return webgpu.native.wgpuRenderBundleEncoderFinish(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPURenderBundle)
}

actual fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: WGPUStringView): Unit {
	webgpu.native.wgpuRenderBundleEncoderSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuRenderPassEncoderRelease(handler: WGPURenderPassEncoder?): Unit {
	webgpu.native.wgpuRenderPassEncoderRelease(handler?.handler?.reinterpret())
}

actual fun wgpuRenderPassEncoderSetPipeline(handler: WGPURenderPassEncoder?, pipeline: WGPURenderPipeline?): Unit {
	webgpu.native.wgpuRenderPassEncoderSetPipeline(handler?.handler?.reinterpret(), pipeline?.handler?.reinterpret())
}

actual fun wgpuRenderPassEncoderSetBindGroup(handler: WGPURenderPassEncoder?, groupIndex: UInt, group: WGPUBindGroup?, dynamicOffsetCount: ULong, dynamicOffsets: ArrayHolder<UInt>?): Unit {
	webgpu.native.wgpuRenderPassEncoderSetBindGroup(handler?.handler?.reinterpret(), groupIndex, group?.handler?.reinterpret(), dynamicOffsetCount, dynamicOffsets?.handler?.reinterpret())
}

actual fun wgpuRenderPassEncoderDraw(handler: WGPURenderPassEncoder?, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit {
	webgpu.native.wgpuRenderPassEncoderDraw(handler?.handler?.reinterpret(), vertexCount, instanceCount, firstVertex, firstInstance)
}

actual fun wgpuRenderPassEncoderDrawIndexed(handler: WGPURenderPassEncoder?, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit {
	webgpu.native.wgpuRenderPassEncoderDrawIndexed(handler?.handler?.reinterpret(), indexCount, instanceCount, firstIndex, baseVertex, firstInstance)
}

actual fun wgpuRenderPassEncoderDrawIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit {
	webgpu.native.wgpuRenderPassEncoderDrawIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

actual fun wgpuRenderPassEncoderDrawIndexedIndirect(handler: WGPURenderPassEncoder?, indirectBuffer: WGPUBuffer?, indirectOffset: ULong): Unit {
	webgpu.native.wgpuRenderPassEncoderDrawIndexedIndirect(handler?.handler?.reinterpret(), indirectBuffer?.handler?.reinterpret(), indirectOffset)
}

actual fun wgpuRenderPassEncoderExecuteBundles(handler: WGPURenderPassEncoder?, bundleCount: ULong, bundles: ArrayHolder<WGPURenderBundle>?): Unit {
	webgpu.native.wgpuRenderPassEncoderExecuteBundles(handler?.handler?.reinterpret(), bundleCount, bundles?.handler?.reinterpret())
}

actual fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: WGPUStringView): Unit {
	webgpu.native.wgpuRenderPassEncoderInsertDebugMarker(handler?.handler?.reinterpret(), markerLabel.toCValue())
}

actual fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?): Unit {
	webgpu.native.wgpuRenderPassEncoderPopDebugGroup(handler?.handler?.reinterpret())
}

actual fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: WGPUStringView): Unit {
	webgpu.native.wgpuRenderPassEncoderPushDebugGroup(handler?.handler?.reinterpret(), groupLabel.toCValue())
}

actual fun wgpuRenderPassEncoderSetStencilReference(handler: WGPURenderPassEncoder?, reference: UInt): Unit {
	webgpu.native.wgpuRenderPassEncoderSetStencilReference(handler?.handler?.reinterpret(), reference)
}

actual fun wgpuRenderPassEncoderSetBlendConstant(handler: WGPURenderPassEncoder?, color: WGPUColor?): Unit {
	webgpu.native.wgpuRenderPassEncoderSetBlendConstant(handler?.handler?.reinterpret(), color?.handler?.reinterpret())
}

actual fun wgpuRenderPassEncoderSetViewport(handler: WGPURenderPassEncoder?, x: Float, y: Float, width: Float, height: Float, minDepth: Float, maxDepth: Float): Unit {
	webgpu.native.wgpuRenderPassEncoderSetViewport(handler?.handler?.reinterpret(), x, y, width, height, minDepth, maxDepth)
}

actual fun wgpuRenderPassEncoderSetScissorRect(handler: WGPURenderPassEncoder?, x: UInt, y: UInt, width: UInt, height: UInt): Unit {
	webgpu.native.wgpuRenderPassEncoderSetScissorRect(handler?.handler?.reinterpret(), x, y, width, height)
}

actual fun wgpuRenderPassEncoderSetVertexBuffer(handler: WGPURenderPassEncoder?, slot: UInt, buffer: WGPUBuffer?, offset: ULong, size: ULong): Unit {
	webgpu.native.wgpuRenderPassEncoderSetVertexBuffer(handler?.handler?.reinterpret(), slot, buffer?.handler?.reinterpret(), offset, size)
}

actual fun wgpuRenderPassEncoderSetIndexBuffer(handler: WGPURenderPassEncoder?, buffer: WGPUBuffer?, format: WGPUIndexFormat, offset: ULong, size: ULong): Unit {
	webgpu.native.wgpuRenderPassEncoderSetIndexBuffer(handler?.handler?.reinterpret(), buffer?.handler?.reinterpret(), format, offset, size)
}

actual fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: WGPURenderPassEncoder?, queryIndex: UInt): Unit {
	webgpu.native.wgpuRenderPassEncoderBeginOcclusionQuery(handler?.handler?.reinterpret(), queryIndex)
}

actual fun wgpuRenderPassEncoderEndOcclusionQuery(handler: WGPURenderPassEncoder?): Unit {
	webgpu.native.wgpuRenderPassEncoderEndOcclusionQuery(handler?.handler?.reinterpret())
}

actual fun wgpuRenderPassEncoderEnd(handler: WGPURenderPassEncoder?): Unit {
	webgpu.native.wgpuRenderPassEncoderEnd(handler?.handler?.reinterpret())
}

actual fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: WGPUStringView): Unit {
	webgpu.native.wgpuRenderPassEncoderSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?): Unit {
	webgpu.native.wgpuRenderPipelineRelease(handler?.handler?.reinterpret())
}

actual fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout? {
	return webgpu.native.wgpuRenderPipelineGetBindGroupLayout(handler?.handler?.reinterpret(), groupIndex)
		?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)
}

actual fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: WGPUStringView): Unit {
	webgpu.native.wgpuRenderPipelineSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuSamplerRelease(handler: WGPUSampler?): Unit {
	webgpu.native.wgpuSamplerRelease(handler?.handler?.reinterpret())
}

actual fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: WGPUStringView): Unit {
	webgpu.native.wgpuSamplerSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuShaderModuleRelease(handler: WGPUShaderModule?): Unit {
	webgpu.native.wgpuShaderModuleRelease(handler?.handler?.reinterpret())
}

actual fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callbackInfo: WGPUCompilationInfoCallbackInfo): Unit {
	webgpu.native.wgpuShaderModuleGetCompilationInfo(handler?.handler?.reinterpret(), callbackInfo.toCValue())
}

actual fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: WGPUStringView): Unit {
	webgpu.native.wgpuShaderModuleSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuSurfaceRelease(handler: WGPUSurface?): Unit {
	webgpu.native.wgpuSurfaceRelease(handler?.handler?.reinterpret())
}

actual fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?): Unit {
	webgpu.native.wgpuSurfaceConfigure(handler?.handler?.reinterpret(), config?.handler?.reinterpret())
}

actual fun wgpuSurfaceGetCapabilities(handler: WGPUSurface?, adapter: WGPUAdapter?, capabilities: WGPUSurfaceCapabilities?): WGPUStatus {
	return webgpu.native.wgpuSurfaceGetCapabilities(handler?.handler?.reinterpret(), adapter?.handler?.reinterpret(), capabilities?.handler?.reinterpret())
}

actual fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?): Unit {
	webgpu.native.wgpuSurfaceGetCurrentTexture(handler?.handler?.reinterpret(), surfaceTexture?.handler?.reinterpret())
}

actual fun wgpuSurfacePresent(handler: WGPUSurface?): WGPUStatus {
	return webgpu.native.wgpuSurfacePresent(handler?.handler?.reinterpret())
}

actual fun wgpuSurfaceUnconfigure(handler: WGPUSurface?): Unit {
	webgpu.native.wgpuSurfaceUnconfigure(handler?.handler?.reinterpret())
}

actual fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: WGPUStringView): Unit {
	webgpu.native.wgpuSurfaceSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuTextureRelease(handler: WGPUTexture?): Unit {
	webgpu.native.wgpuTextureRelease(handler?.handler?.reinterpret())
}

actual fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView? {
	return webgpu.native.wgpuTextureCreateView(handler?.handler?.reinterpret(), descriptor?.handler?.reinterpret())
		?.let(::NativeAddress)?.let(::WGPUTextureView)
}

actual fun wgpuTextureSetLabel(handler: WGPUTexture?, label: WGPUStringView): Unit {
	webgpu.native.wgpuTextureSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

actual fun wgpuTextureGetWidth(handler: WGPUTexture?): UInt {
	return webgpu.native.wgpuTextureGetWidth(handler?.handler?.reinterpret())
}

actual fun wgpuTextureGetHeight(handler: WGPUTexture?): UInt {
	return webgpu.native.wgpuTextureGetHeight(handler?.handler?.reinterpret())
}

actual fun wgpuTextureGetDepthOrArrayLayers(handler: WGPUTexture?): UInt {
	return webgpu.native.wgpuTextureGetDepthOrArrayLayers(handler?.handler?.reinterpret())
}

actual fun wgpuTextureGetMipLevelCount(handler: WGPUTexture?): UInt {
	return webgpu.native.wgpuTextureGetMipLevelCount(handler?.handler?.reinterpret())
}

actual fun wgpuTextureGetSampleCount(handler: WGPUTexture?): UInt {
	return webgpu.native.wgpuTextureGetSampleCount(handler?.handler?.reinterpret())
}

actual fun wgpuTextureGetDimension(handler: WGPUTexture?): WGPUTextureDimension {
	return webgpu.native.wgpuTextureGetDimension(handler?.handler?.reinterpret())
}

actual fun wgpuTextureGetFormat(handler: WGPUTexture?): WGPUTextureFormat {
	return webgpu.native.wgpuTextureGetFormat(handler?.handler?.reinterpret())
}

actual fun wgpuTextureGetUsage(handler: WGPUTexture?): ULong {
	return webgpu.native.wgpuTextureGetUsage(handler?.handler?.reinterpret())
}

actual fun wgpuTextureDestroy(handler: WGPUTexture?): Unit {
	webgpu.native.wgpuTextureDestroy(handler?.handler?.reinterpret())
}

actual fun wgpuTextureViewRelease(handler: WGPUTextureView?): Unit {
	webgpu.native.wgpuTextureViewRelease(handler?.handler?.reinterpret())
}

actual fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: WGPUStringView): Unit {
	webgpu.native.wgpuTextureViewSetLabel(handler?.handler?.reinterpret(), label.toCValue())
}

