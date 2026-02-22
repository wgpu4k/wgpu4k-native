// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.ArrayHolder
import ffi.CallbackHolder
import ffi.NativeAddress
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.UInt
import kotlin.ULong

public actual fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor?): WGPUInstance? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCreateInstance(descriptor?.toReference())
		?.let(::WGPUInstance)
}

public actual fun wgpuGetInstanceCapabilities(capabilities: WGPUInstanceCapabilities?): WGPUStatus {
		 = io.ygdrasil.wgpu.android.Functions.wgpuGetInstanceCapabilities(capabilities?.toReference())
}

public actual fun wgpuDevicePoll(
	device: WGPUDevice?,
	wait: Boolean,
	wrappedSubmissionIndex: NativeAddress?,
): Boolean {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDevicePoll(device?.handler, wait.toUInt(), wrappedSubmissionIndex)
		.toBoolean()
}

public actual fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSetLogCallback(callback?.callback, userdata)
}

public actual fun wgpuSetLogLevel(level: WGPULogLevel) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSetLogLevel(level)
}

public actual fun wgpuAdapterRelease(handler: WGPUAdapter?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterRelease(handler?.handler)
}

public actual fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPULimits?): WGPUStatus {
		 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterGetLimits(handler?.handler, limits?.toReference())
}

public actual fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean {
		 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterHasFeature(handler?.handler, feature)
		.toBoolean()
}

public actual fun wgpuAdapterGetFeatures(handler: WGPUAdapter?, features: WGPUSupportedFeatures?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterGetFeatures(handler?.handler, features?.toReference())
}

public actual fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): WGPUStatus {
		 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterGetInfo(handler?.handler, info?.toReference())
}

public actual fun wgpuAdapterRequestDevice(
	handler: WGPUAdapter?,
	descriptor: WGPUDeviceDescriptor?,
	callbackInfo: WGPURequestDeviceCallbackInfo,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuAdapterRequestDevice(handler?.handler, descriptor?.toReference(), callbackInfo.toCValue())
}

public actual fun wgpuBindGroupRelease(handler: WGPUBindGroup?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBindGroupRelease(handler?.handler)
}

public actual fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBindGroupSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBindGroupLayoutRelease(handler?.handler)
}

public actual fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBindGroupLayoutSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuBufferRelease(handler: WGPUBuffer?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferRelease(handler?.handler)
}

public actual fun wgpuBufferMapAsync(
	handler: WGPUBuffer?,
	mode: ULong,
	offset: ULong,
	size: ULong,
	callbackInfo: WGPUBufferMapCallbackInfo,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferMapAsync(handler?.handler, mode, offset, size, callbackInfo.toCValue())
}

public actual fun wgpuBufferGetMappedRange(
	handler: WGPUBuffer?,
	offset: ULong,
	size: ULong,
): NativeAddress? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetMappedRange(handler?.handler, offset, size)
}

public actual fun wgpuBufferGetConstMappedRange(
	handler: WGPUBuffer?,
	offset: ULong,
	size: ULong,
): NativeAddress? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetConstMappedRange(handler?.handler, offset, size)
}

public actual fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuBufferGetUsage(handler: WGPUBuffer?): ULong {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetUsage(handler?.handler)
}

public actual fun wgpuBufferGetSize(handler: WGPUBuffer?): ULong {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetSize(handler?.handler)
}

public actual fun wgpuBufferGetMapState(handler: WGPUBuffer?): WGPUBufferMapState {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferGetMapState(handler?.handler)
}

public actual fun wgpuBufferUnmap(handler: WGPUBuffer?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferUnmap(handler?.handler)
}

public actual fun wgpuBufferDestroy(handler: WGPUBuffer?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuBufferDestroy(handler?.handler)
}

public actual fun wgpuCommandBufferRelease(handler: WGPUCommandBuffer?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandBufferRelease(handler?.handler)
}

public actual fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandBufferSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuCommandEncoderRelease(handler: WGPUCommandEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderRelease(handler?.handler)
}

public actual fun wgpuCommandEncoderFinish(handler: WGPUCommandEncoder?, descriptor: WGPUCommandBufferDescriptor?): WGPUCommandBuffer? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderFinish(handler?.handler, descriptor?.toReference())
		?.let(::WGPUCommandBuffer)
}

public actual fun wgpuCommandEncoderBeginComputePass(handler: WGPUCommandEncoder?, descriptor: WGPUComputePassDescriptor?): WGPUComputePassEncoder? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderBeginComputePass(handler?.handler, descriptor?.toReference())
		?.let(::WGPUComputePassEncoder)
}

public actual fun wgpuCommandEncoderBeginRenderPass(handler: WGPUCommandEncoder?, descriptor: WGPURenderPassDescriptor?): WGPURenderPassEncoder? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderBeginRenderPass(handler?.handler, descriptor?.toReference())
		?.let(::WGPURenderPassEncoder)
}

public actual fun wgpuCommandEncoderCopyBufferToBuffer(
	handler: WGPUCommandEncoder?,
	source: WGPUBuffer?,
	sourceOffset: ULong,
	destination: WGPUBuffer?,
	destinationOffset: ULong,
	size: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderCopyBufferToBuffer(handler?.handler, source?.handler, sourceOffset, destination?.handler, destinationOffset, size)
}

public actual fun wgpuCommandEncoderCopyBufferToTexture(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyBufferInfo?,
	destination: WGPUTexelCopyTextureInfo?,
	copySize: WGPUExtent3D?,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderCopyBufferToTexture(handler?.handler, source?.toReference(), destination?.toReference(), copySize?.toReference())
}

public actual fun wgpuCommandEncoderCopyTextureToBuffer(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyTextureInfo?,
	destination: WGPUTexelCopyBufferInfo?,
	copySize: WGPUExtent3D?,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderCopyTextureToBuffer(handler?.handler, source?.toReference(), destination?.toReference(), copySize?.toReference())
}

public actual fun wgpuCommandEncoderCopyTextureToTexture(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyTextureInfo?,
	destination: WGPUTexelCopyTextureInfo?,
	copySize: WGPUExtent3D?,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderCopyTextureToTexture(handler?.handler, source?.toReference(), destination?.toReference(), copySize?.toReference())
}

public actual fun wgpuCommandEncoderClearBuffer(
	handler: WGPUCommandEncoder?,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderClearBuffer(handler?.handler, buffer?.handler, offset, size)
}

public actual fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderInsertDebugMarker(handler?.handler, markerLabel.toCValue())
}

public actual fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderPopDebugGroup(handler?.handler)
}

public actual fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderPushDebugGroup(handler?.handler, groupLabel.toCValue())
}

public actual fun wgpuCommandEncoderResolveQuerySet(
	handler: WGPUCommandEncoder?,
	querySet: WGPUQuerySet?,
	firstQuery: UInt,
	queryCount: UInt,
	destination: WGPUBuffer?,
	destinationOffset: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderResolveQuerySet(handler?.handler, querySet?.handler, firstQuery, queryCount, destination?.handler, destinationOffset)
}

public actual fun wgpuCommandEncoderWriteTimestamp(
	handler: WGPUCommandEncoder?,
	querySet: WGPUQuerySet?,
	queryIndex: UInt,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderWriteTimestamp(handler?.handler, querySet?.handler, queryIndex)
}

public actual fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuCommandEncoderSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderRelease(handler?.handler)
}

public actual fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderInsertDebugMarker(handler?.handler, markerLabel.toCValue())
}

public actual fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderPopDebugGroup(handler?.handler)
}

public actual fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderPushDebugGroup(handler?.handler, groupLabel.toCValue())
}

public actual fun wgpuComputePassEncoderSetPipeline(handler: WGPUComputePassEncoder?, pipeline: WGPUComputePipeline?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderSetPipeline(handler?.handler, pipeline?.handler)
}

public actual fun wgpuComputePassEncoderSetBindGroup(
	handler: WGPUComputePassEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderSetBindGroup(handler?.handler, groupIndex, group?.handler, dynamicOffsetCount, dynamicOffsets?.handler)
}

public actual fun wgpuComputePassEncoderDispatchWorkgroups(
	handler: WGPUComputePassEncoder?,
	workgroupCountX: UInt,
	workgroupCountY: UInt,
	workgroupCountZ: UInt,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderDispatchWorkgroups(handler?.handler, workgroupCountX, workgroupCountY, workgroupCountZ)
}

public actual fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(
	handler: WGPUComputePassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)
}

public actual fun wgpuComputePassEncoderEnd(handler: WGPUComputePassEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderEnd(handler?.handler)
}

public actual fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePassEncoderSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePipelineRelease(handler?.handler)
}

public actual fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePipelineGetBindGroupLayout(handler?.handler, groupIndex)
		?.let(::WGPUBindGroupLayout)
}

public actual fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuComputePipelineSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuDeviceRelease(handler: WGPUDevice?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceRelease(handler?.handler)
}

public actual fun wgpuDeviceCreateBindGroup(handler: WGPUDevice?, descriptor: WGPUBindGroupDescriptor?): WGPUBindGroup? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateBindGroup(handler?.handler, descriptor?.toReference())
		?.let(::WGPUBindGroup)
}

public actual fun wgpuDeviceCreateBindGroupLayout(handler: WGPUDevice?, descriptor: WGPUBindGroupLayoutDescriptor?): WGPUBindGroupLayout? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateBindGroupLayout(handler?.handler, descriptor?.toReference())
		?.let(::WGPUBindGroupLayout)
}

public actual fun wgpuDeviceCreateBuffer(handler: WGPUDevice?, descriptor: WGPUBufferDescriptor?): WGPUBuffer? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateBuffer(handler?.handler, descriptor?.toReference())
		?.let(::WGPUBuffer)
}

public actual fun wgpuDeviceCreateCommandEncoder(handler: WGPUDevice?, descriptor: WGPUCommandEncoderDescriptor?): WGPUCommandEncoder? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateCommandEncoder(handler?.handler, descriptor?.toReference())
		?.let(::WGPUCommandEncoder)
}

public actual fun wgpuDeviceCreateComputePipeline(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?): WGPUComputePipeline? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateComputePipeline(handler?.handler, descriptor?.toReference())
		?.let(::WGPUComputePipeline)
}

public actual fun wgpuDeviceCreateComputePipelineAsync(
	handler: WGPUDevice?,
	descriptor: WGPUComputePipelineDescriptor?,
	callbackInfo: WGPUCreateComputePipelineAsyncCallbackInfo,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateComputePipelineAsync(handler?.handler, descriptor?.toReference(), callbackInfo.toCValue())
}

public actual fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreatePipelineLayout(handler?.handler, descriptor?.toReference())
		?.let(::WGPUPipelineLayout)
}

public actual fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateQuerySet(handler?.handler, descriptor?.toReference())
		?.let(::WGPUQuerySet)
}

public actual fun wgpuDeviceCreateRenderPipelineAsync(
	handler: WGPUDevice?,
	descriptor: WGPURenderPipelineDescriptor?,
	callbackInfo: WGPUCreateRenderPipelineAsyncCallbackInfo,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateRenderPipelineAsync(handler?.handler, descriptor?.toReference(), callbackInfo.toCValue())
}

public actual fun wgpuDeviceCreateRenderBundleEncoder(handler: WGPUDevice?, descriptor: WGPURenderBundleEncoderDescriptor?): WGPURenderBundleEncoder? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateRenderBundleEncoder(handler?.handler, descriptor?.toReference())
		?.let(::WGPURenderBundleEncoder)
}

public actual fun wgpuDeviceCreateRenderPipeline(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?): WGPURenderPipeline? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateRenderPipeline(handler?.handler, descriptor?.toReference())
		?.let(::WGPURenderPipeline)
}

public actual fun wgpuDeviceCreateSampler(handler: WGPUDevice?, descriptor: WGPUSamplerDescriptor?): WGPUSampler? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateSampler(handler?.handler, descriptor?.toReference())
		?.let(::WGPUSampler)
}

public actual fun wgpuDeviceCreateShaderModule(handler: WGPUDevice?, descriptor: WGPUShaderModuleDescriptor?): WGPUShaderModule? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateShaderModule(handler?.handler, descriptor?.toReference())
		?.let(::WGPUShaderModule)
}

public actual fun wgpuDeviceCreateTexture(handler: WGPUDevice?, descriptor: WGPUTextureDescriptor?): WGPUTexture? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceCreateTexture(handler?.handler, descriptor?.toReference())
		?.let(::WGPUTexture)
}

public actual fun wgpuDeviceDestroy(handler: WGPUDevice?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceDestroy(handler?.handler)
}

public actual fun wgpuDeviceGetLostFuture(handler: WGPUDevice?): WGPUFuture {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceGetLostFuture(handler?.handler)
		.let(WGPUFuture::ByValue)
}

public actual fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPULimits?): WGPUStatus {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceGetLimits(handler?.handler, limits?.toReference())
}

public actual fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceHasFeature(handler?.handler, feature)
		.toBoolean()
}

public actual fun wgpuDeviceGetFeatures(handler: WGPUDevice?, features: WGPUSupportedFeatures?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceGetFeatures(handler?.handler, features?.toReference())
}

public actual fun wgpuDeviceGetAdapterInfo(handler: WGPUDevice?): WGPUAdapterInfo {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceGetAdapterInfo(handler?.handler)
		.let(WGPUAdapterInfo::ByValue)
}

public actual fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceGetQueue(handler?.handler)
		?.let(::WGPUQueue)
}

public actual fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDevicePushErrorScope(handler?.handler, filter)
}

public actual fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callbackInfo: WGPUPopErrorScopeCallbackInfo) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDevicePopErrorScope(handler?.handler, callbackInfo.toCValue())
}

public actual fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuDeviceSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuInstanceRelease(handler: WGPUInstance?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceRelease(handler?.handler)
}

public actual fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceCreateSurface(handler?.handler, descriptor?.toReference())
		?.let(::WGPUSurface)
}

public actual fun wgpuInstanceGetWGSLLanguageFeatures(handler: WGPUInstance?, features: WGPUSupportedWGSLLanguageFeatures?): WGPUStatus {
		 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceGetWGSLLanguageFeatures(handler?.handler, features?.toReference())
}

public actual fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLLanguageFeatureName): Boolean {
		 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceHasWGSLLanguageFeature(handler?.handler, feature)
		.toBoolean()
}

public actual fun wgpuInstanceProcessEvents(handler: WGPUInstance?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceProcessEvents(handler?.handler)
}

public actual fun wgpuInstanceRequestAdapter(
	handler: WGPUInstance?,
	options: WGPURequestAdapterOptions?,
	callbackInfo: WGPURequestAdapterCallbackInfo,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceRequestAdapter(handler?.handler, options?.toReference(), callbackInfo.toCValue())
}

public actual fun wgpuInstanceWaitAny(
	handler: WGPUInstance?,
	futureCount: ULong,
	futures: WGPUFutureWaitInfo?,
	timeoutNS: ULong,
): WGPUWaitStatus {
		 = io.ygdrasil.wgpu.android.Functions.wgpuInstanceWaitAny(handler?.handler, futureCount, futures?.toReference(), timeoutNS)
}

public actual fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuPipelineLayoutRelease(handler?.handler)
}

public actual fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuPipelineLayoutSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuQuerySetRelease(handler: WGPUQuerySet?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetRelease(handler?.handler)
}

public actual fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuQuerySetGetType(handler: WGPUQuerySet?): WGPUQueryType {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetGetType(handler?.handler)
}

public actual fun wgpuQuerySetGetCount(handler: WGPUQuerySet?): UInt {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetGetCount(handler?.handler)
}

public actual fun wgpuQuerySetDestroy(handler: WGPUQuerySet?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQuerySetDestroy(handler?.handler)
}

public actual fun wgpuQueueRelease(handler: WGPUQueue?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQueueRelease(handler?.handler)
}

public actual fun wgpuQueueSubmit(
	handler: WGPUQueue?,
	commandCount: ULong,
	commands: ArrayHolder<WGPUCommandBuffer>?,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQueueSubmit(handler?.handler, commandCount, commands?.handler)
}

public actual fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callbackInfo: WGPUQueueWorkDoneCallbackInfo) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQueueOnSubmittedWorkDone(handler?.handler, callbackInfo.toCValue())
}

public actual fun wgpuQueueWriteBuffer(
	handler: WGPUQueue?,
	buffer: WGPUBuffer?,
	bufferOffset: ULong,
	`data`: NativeAddress?,
	size: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQueueWriteBuffer(handler?.handler, buffer?.handler, bufferOffset, data, size)
}

public actual fun wgpuQueueWriteTexture(
	handler: WGPUQueue?,
	destination: WGPUTexelCopyTextureInfo?,
	`data`: NativeAddress?,
	dataSize: ULong,
	dataLayout: WGPUTexelCopyBufferLayout?,
	writeSize: WGPUExtent3D?,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQueueWriteTexture(handler?.handler, destination?.toReference(), data, dataSize, dataLayout?.toReference(), writeSize?.toReference())
}

public actual fun wgpuQueueSetLabel(handler: WGPUQueue?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuQueueSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuRenderBundleRelease(handler: WGPURenderBundle?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleRelease(handler?.handler)
}

public actual fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuRenderBundleEncoderRelease(handler: WGPURenderBundleEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderRelease(handler?.handler)
}

public actual fun wgpuRenderBundleEncoderSetPipeline(handler: WGPURenderBundleEncoder?, pipeline: WGPURenderPipeline?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetPipeline(handler?.handler, pipeline?.handler)
}

public actual fun wgpuRenderBundleEncoderSetBindGroup(
	handler: WGPURenderBundleEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetBindGroup(handler?.handler, groupIndex, group?.handler, dynamicOffsetCount, dynamicOffsets?.handler)
}

public actual fun wgpuRenderBundleEncoderDraw(
	handler: WGPURenderBundleEncoder?,
	vertexCount: UInt,
	instanceCount: UInt,
	firstVertex: UInt,
	firstInstance: UInt,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderDraw(handler?.handler, vertexCount, instanceCount, firstVertex, firstInstance)
}

public actual fun wgpuRenderBundleEncoderDrawIndexed(
	handler: WGPURenderBundleEncoder?,
	indexCount: UInt,
	instanceCount: UInt,
	firstIndex: UInt,
	baseVertex: Int,
	firstInstance: UInt,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderDrawIndexed(handler?.handler, indexCount, instanceCount, firstIndex, baseVertex, firstInstance)
}

public actual fun wgpuRenderBundleEncoderDrawIndirect(
	handler: WGPURenderBundleEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderDrawIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)
}

public actual fun wgpuRenderBundleEncoderDrawIndexedIndirect(
	handler: WGPURenderBundleEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderDrawIndexedIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)
}

public actual fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderInsertDebugMarker(handler?.handler, markerLabel.toCValue())
}

public actual fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderPopDebugGroup(handler?.handler)
}

public actual fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderPushDebugGroup(handler?.handler, groupLabel.toCValue())
}

public actual fun wgpuRenderBundleEncoderSetVertexBuffer(
	handler: WGPURenderBundleEncoder?,
	slot: UInt,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetVertexBuffer(handler?.handler, slot, buffer?.handler, offset, size)
}

public actual fun wgpuRenderBundleEncoderSetIndexBuffer(
	handler: WGPURenderBundleEncoder?,
	buffer: WGPUBuffer?,
	format: WGPUIndexFormat,
	offset: ULong,
	size: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetIndexBuffer(handler?.handler, buffer?.handler, format, offset, size)
}

public actual fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderFinish(handler?.handler, descriptor?.toReference())
		?.let(::WGPURenderBundle)
}

public actual fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderBundleEncoderSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuRenderPassEncoderRelease(handler: WGPURenderPassEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderRelease(handler?.handler)
}

public actual fun wgpuRenderPassEncoderSetPipeline(handler: WGPURenderPassEncoder?, pipeline: WGPURenderPipeline?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetPipeline(handler?.handler, pipeline?.handler)
}

public actual fun wgpuRenderPassEncoderSetBindGroup(
	handler: WGPURenderPassEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetBindGroup(handler?.handler, groupIndex, group?.handler, dynamicOffsetCount, dynamicOffsets?.handler)
}

public actual fun wgpuRenderPassEncoderDraw(
	handler: WGPURenderPassEncoder?,
	vertexCount: UInt,
	instanceCount: UInt,
	firstVertex: UInt,
	firstInstance: UInt,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderDraw(handler?.handler, vertexCount, instanceCount, firstVertex, firstInstance)
}

public actual fun wgpuRenderPassEncoderDrawIndexed(
	handler: WGPURenderPassEncoder?,
	indexCount: UInt,
	instanceCount: UInt,
	firstIndex: UInt,
	baseVertex: Int,
	firstInstance: UInt,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderDrawIndexed(handler?.handler, indexCount, instanceCount, firstIndex, baseVertex, firstInstance)
}

public actual fun wgpuRenderPassEncoderDrawIndirect(
	handler: WGPURenderPassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderDrawIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)
}

public actual fun wgpuRenderPassEncoderDrawIndexedIndirect(
	handler: WGPURenderPassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderDrawIndexedIndirect(handler?.handler, indirectBuffer?.handler, indirectOffset)
}

public actual fun wgpuRenderPassEncoderExecuteBundles(
	handler: WGPURenderPassEncoder?,
	bundleCount: ULong,
	bundles: ArrayHolder<WGPURenderBundle>?,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderExecuteBundles(handler?.handler, bundleCount, bundles?.handler)
}

public actual fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderInsertDebugMarker(handler?.handler, markerLabel.toCValue())
}

public actual fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderPopDebugGroup(handler?.handler)
}

public actual fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderPushDebugGroup(handler?.handler, groupLabel.toCValue())
}

public actual fun wgpuRenderPassEncoderSetStencilReference(handler: WGPURenderPassEncoder?, reference: UInt) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetStencilReference(handler?.handler, reference)
}

public actual fun wgpuRenderPassEncoderSetBlendConstant(handler: WGPURenderPassEncoder?, color: WGPUColor?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetBlendConstant(handler?.handler, color?.toReference())
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
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetViewport(handler?.handler, x, y, width, height, minDepth, maxDepth)
}

public actual fun wgpuRenderPassEncoderSetScissorRect(
	handler: WGPURenderPassEncoder?,
	x: UInt,
	y: UInt,
	width: UInt,
	height: UInt,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetScissorRect(handler?.handler, x, y, width, height)
}

public actual fun wgpuRenderPassEncoderSetVertexBuffer(
	handler: WGPURenderPassEncoder?,
	slot: UInt,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetVertexBuffer(handler?.handler, slot, buffer?.handler, offset, size)
}

public actual fun wgpuRenderPassEncoderSetIndexBuffer(
	handler: WGPURenderPassEncoder?,
	buffer: WGPUBuffer?,
	format: WGPUIndexFormat,
	offset: ULong,
	size: ULong,
) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetIndexBuffer(handler?.handler, buffer?.handler, format, offset, size)
}

public actual fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: WGPURenderPassEncoder?, queryIndex: UInt) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderBeginOcclusionQuery(handler?.handler, queryIndex)
}

public actual fun wgpuRenderPassEncoderEndOcclusionQuery(handler: WGPURenderPassEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderEndOcclusionQuery(handler?.handler)
}

public actual fun wgpuRenderPassEncoderEnd(handler: WGPURenderPassEncoder?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderEnd(handler?.handler)
}

public actual fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPassEncoderSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPipelineRelease(handler?.handler)
}

public actual fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPipelineGetBindGroupLayout(handler?.handler, groupIndex)
		?.let(::WGPUBindGroupLayout)
}

public actual fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuRenderPipelineSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuSamplerRelease(handler: WGPUSampler?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSamplerRelease(handler?.handler)
}

public actual fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSamplerSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuShaderModuleRelease(handler: WGPUShaderModule?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuShaderModuleRelease(handler?.handler)
}

public actual fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callbackInfo: WGPUCompilationInfoCallbackInfo) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuShaderModuleGetCompilationInfo(handler?.handler, callbackInfo.toCValue())
}

public actual fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuShaderModuleSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuSurfaceRelease(handler: WGPUSurface?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceRelease(handler?.handler)
}

public actual fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceConfigure(handler?.handler, config?.toReference())
}

public actual fun wgpuSurfaceGetCapabilities(
	handler: WGPUSurface?,
	adapter: WGPUAdapter?,
	capabilities: WGPUSurfaceCapabilities?,
): WGPUStatus {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceGetCapabilities(handler?.handler, adapter?.handler, capabilities?.toReference())
}

public actual fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceGetCurrentTexture(handler?.handler, surfaceTexture?.toReference())
}

public actual fun wgpuSurfacePresent(handler: WGPUSurface?): WGPUStatus {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSurfacePresent(handler?.handler)
}

public actual fun wgpuSurfaceUnconfigure(handler: WGPUSurface?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceUnconfigure(handler?.handler)
}

public actual fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuSurfaceSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuTextureRelease(handler: WGPUTexture?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureRelease(handler?.handler)
}

public actual fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView? {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureCreateView(handler?.handler, descriptor?.toReference())
		?.let(::WGPUTextureView)
}

public actual fun wgpuTextureSetLabel(handler: WGPUTexture?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureSetLabel(handler?.handler, label.toCValue())
}

public actual fun wgpuTextureGetWidth(handler: WGPUTexture?): UInt {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetWidth(handler?.handler)
}

public actual fun wgpuTextureGetHeight(handler: WGPUTexture?): UInt {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetHeight(handler?.handler)
}

public actual fun wgpuTextureGetDepthOrArrayLayers(handler: WGPUTexture?): UInt {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetDepthOrArrayLayers(handler?.handler)
}

public actual fun wgpuTextureGetMipLevelCount(handler: WGPUTexture?): UInt {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetMipLevelCount(handler?.handler)
}

public actual fun wgpuTextureGetSampleCount(handler: WGPUTexture?): UInt {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetSampleCount(handler?.handler)
}

public actual fun wgpuTextureGetDimension(handler: WGPUTexture?): WGPUTextureDimension {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetDimension(handler?.handler)
}

public actual fun wgpuTextureGetFormat(handler: WGPUTexture?): WGPUTextureFormat {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetFormat(handler?.handler)
}

public actual fun wgpuTextureGetUsage(handler: WGPUTexture?): ULong {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureGetUsage(handler?.handler)
}

public actual fun wgpuTextureDestroy(handler: WGPUTexture?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureDestroy(handler?.handler)
}

public actual fun wgpuTextureViewRelease(handler: WGPUTextureView?) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureViewRelease(handler?.handler)
}

public actual fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: WGPUStringView) {
		 = io.ygdrasil.wgpu.android.Functions.wgpuTextureViewSetLabel(handler?.handler, label.toCValue())
}
