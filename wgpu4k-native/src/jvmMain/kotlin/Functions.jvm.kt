// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.ArrayHolder
import ffi.CString
import ffi.CallbackHolder
import ffi.NativeAddress
import ffi.adapt
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.UInt
import kotlin.ULong

public actual fun wgpuCreateInstance(descriptor: WGPUInstanceDescriptor?): WGPUInstance? {
		 = Functions.wgpuCreateInstance(descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUInstance)
}

public actual fun wgpuGetInstanceCapabilities(capabilities: WGPUInstanceCapabilities?): WGPUStatus {
		 = Functions.wgpuGetInstanceCapabilities(capabilities?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuDevicePoll(
	device: WGPUDevice?,
	wait: Boolean,
	wrappedSubmissionIndex: NativeAddress?,
): Boolean {
		 = Functions.wgpuDevicePoll(device?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, wait.toUInt(), wrappedSubmissionIndex.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			.toBoolean()
}

public actual fun wgpuSetLogCallback(callback: CallbackHolder<WGPULogCallback>?, userdata: NativeAddress?) {
		 = Functions.wgpuSetLogCallback(callback?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, userdata.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSetLogLevel(level: WGPULogLevel) {
		 = Functions.wgpuSetLogLevel(level)
}

public actual fun wgpuAdapterRelease(handler: WGPUAdapter?) {
		 = Functions.wgpuAdapterRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuAdapterGetLimits(handler: WGPUAdapter?, limits: WGPULimits?): WGPUStatus {
		 = Functions.wgpuAdapterGetLimits(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, limits?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuAdapterHasFeature(handler: WGPUAdapter?, feature: WGPUFeatureName): Boolean {
		 = Functions.wgpuAdapterHasFeature(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, feature)
			.toBoolean()
}

public actual fun wgpuAdapterGetFeatures(handler: WGPUAdapter?, features: WGPUSupportedFeatures?) {
		 = Functions.wgpuAdapterGetFeatures(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, features?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuAdapterGetInfo(handler: WGPUAdapter?, info: WGPUAdapterInfo?): WGPUStatus {
		 = Functions.wgpuAdapterGetInfo(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, info?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuAdapterRequestDevice(
	handler: WGPUAdapter?,
	descriptor: WGPUDeviceDescriptor?,
	callbackInfo: WGPURequestDeviceCallbackInfo,
) {
		 = Functions.wgpuAdapterRequestDevice(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBindGroupRelease(handler: WGPUBindGroup?) {
		 = Functions.wgpuBindGroupRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBindGroupSetLabel(handler: WGPUBindGroup?, label: WGPUStringView) {
		 = Functions.wgpuBindGroupSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBindGroupLayoutRelease(handler: WGPUBindGroupLayout?) {
		 = Functions.wgpuBindGroupLayoutRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBindGroupLayoutSetLabel(handler: WGPUBindGroupLayout?, label: WGPUStringView) {
		 = Functions.wgpuBindGroupLayoutSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBufferRelease(handler: WGPUBuffer?) {
		 = Functions.wgpuBufferRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBufferMapAsync(
	handler: WGPUBuffer?,
	mode: ULong,
	offset: ULong,
	size: ULong,
	callbackInfo: WGPUBufferMapCallbackInfo,
) {
		 = Functions.wgpuBufferMapAsync(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, mode, offset, size, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBufferGetMappedRange(
	handler: WGPUBuffer?,
	offset: ULong,
	size: ULong,
): NativeAddress? {
		 = Functions.wgpuBufferGetMappedRange(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)
			?.let(::NativeAddress)
}

public actual fun wgpuBufferGetConstMappedRange(
	handler: WGPUBuffer?,
	offset: ULong,
	size: ULong,
): NativeAddress? {
		 = Functions.wgpuBufferGetConstMappedRange(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)
			?.let(::NativeAddress)
}

public actual fun wgpuBufferSetLabel(handler: WGPUBuffer?, label: WGPUStringView) {
		 = Functions.wgpuBufferSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBufferGetUsage(handler: WGPUBuffer?): ULong {
		 = Functions.wgpuBufferGetUsage(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBufferGetSize(handler: WGPUBuffer?): ULong {
		 = Functions.wgpuBufferGetSize(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBufferGetMapState(handler: WGPUBuffer?): WGPUBufferMapState {
		 = Functions.wgpuBufferGetMapState(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBufferUnmap(handler: WGPUBuffer?) {
		 = Functions.wgpuBufferUnmap(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuBufferDestroy(handler: WGPUBuffer?) {
		 = Functions.wgpuBufferDestroy(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandBufferRelease(handler: WGPUCommandBuffer?) {
		 = Functions.wgpuCommandBufferRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandBufferSetLabel(handler: WGPUCommandBuffer?, label: WGPUStringView) {
		 = Functions.wgpuCommandBufferSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandEncoderRelease(handler: WGPUCommandEncoder?) {
		 = Functions.wgpuCommandEncoderRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandEncoderFinish(handler: WGPUCommandEncoder?, descriptor: WGPUCommandBufferDescriptor?): WGPUCommandBuffer? {
		 = Functions.wgpuCommandEncoderFinish(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUCommandBuffer)
}

public actual fun wgpuCommandEncoderBeginComputePass(handler: WGPUCommandEncoder?, descriptor: WGPUComputePassDescriptor?): WGPUComputePassEncoder? {
		 = Functions.wgpuCommandEncoderBeginComputePass(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUComputePassEncoder)
}

public actual fun wgpuCommandEncoderBeginRenderPass(handler: WGPUCommandEncoder?, descriptor: WGPURenderPassDescriptor?): WGPURenderPassEncoder? {
		 = Functions.wgpuCommandEncoderBeginRenderPass(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPURenderPassEncoder)
}

public actual fun wgpuCommandEncoderCopyBufferToBuffer(
	handler: WGPUCommandEncoder?,
	source: WGPUBuffer?,
	sourceOffset: ULong,
	destination: WGPUBuffer?,
	destinationOffset: ULong,
	size: ULong,
) {
		 = Functions.wgpuCommandEncoderCopyBufferToBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, sourceOffset, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destinationOffset, size)
}

public actual fun wgpuCommandEncoderCopyBufferToTexture(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyBufferInfo?,
	destination: WGPUTexelCopyTextureInfo?,
	copySize: WGPUExtent3D?,
) {
		 = Functions.wgpuCommandEncoderCopyBufferToTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, copySize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandEncoderCopyTextureToBuffer(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyTextureInfo?,
	destination: WGPUTexelCopyBufferInfo?,
	copySize: WGPUExtent3D?,
) {
		 = Functions.wgpuCommandEncoderCopyTextureToBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, copySize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandEncoderCopyTextureToTexture(
	handler: WGPUCommandEncoder?,
	source: WGPUTexelCopyTextureInfo?,
	destination: WGPUTexelCopyTextureInfo?,
	copySize: WGPUExtent3D?,
) {
		 = Functions.wgpuCommandEncoderCopyTextureToTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, source?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, copySize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandEncoderClearBuffer(
	handler: WGPUCommandEncoder?,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
) {
		 = Functions.wgpuCommandEncoderClearBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)
}

public actual fun wgpuCommandEncoderInsertDebugMarker(handler: WGPUCommandEncoder?, markerLabel: WGPUStringView) {
		 = Functions.wgpuCommandEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandEncoderPopDebugGroup(handler: WGPUCommandEncoder?) {
		 = Functions.wgpuCommandEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandEncoderPushDebugGroup(handler: WGPUCommandEncoder?, groupLabel: WGPUStringView) {
		 = Functions.wgpuCommandEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuCommandEncoderResolveQuerySet(
	handler: WGPUCommandEncoder?,
	querySet: WGPUQuerySet?,
	firstQuery: UInt,
	queryCount: UInt,
	destination: WGPUBuffer?,
	destinationOffset: ULong,
) {
		 = Functions.wgpuCommandEncoderResolveQuerySet(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, querySet?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, firstQuery, queryCount, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destinationOffset)
}

public actual fun wgpuCommandEncoderWriteTimestamp(
	handler: WGPUCommandEncoder?,
	querySet: WGPUQuerySet?,
	queryIndex: UInt,
) {
		 = Functions.wgpuCommandEncoderWriteTimestamp(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, querySet?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, queryIndex)
}

public actual fun wgpuCommandEncoderSetLabel(handler: WGPUCommandEncoder?, label: WGPUStringView) {
		 = Functions.wgpuCommandEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePassEncoderRelease(handler: WGPUComputePassEncoder?) {
		 = Functions.wgpuComputePassEncoderRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePassEncoderInsertDebugMarker(handler: WGPUComputePassEncoder?, markerLabel: WGPUStringView) {
		 = Functions.wgpuComputePassEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePassEncoderPopDebugGroup(handler: WGPUComputePassEncoder?) {
		 = Functions.wgpuComputePassEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePassEncoderPushDebugGroup(handler: WGPUComputePassEncoder?, groupLabel: WGPUStringView) {
		 = Functions.wgpuComputePassEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePassEncoderSetPipeline(handler: WGPUComputePassEncoder?, pipeline: WGPUComputePipeline?) {
		 = Functions.wgpuComputePassEncoderSetPipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, pipeline?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePassEncoderSetBindGroup(
	handler: WGPUComputePassEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
) {
		 = Functions.wgpuComputePassEncoderSetBindGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex, group?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, dynamicOffsetCount, dynamicOffsets?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePassEncoderDispatchWorkgroups(
	handler: WGPUComputePassEncoder?,
	workgroupCountX: UInt,
	workgroupCountY: UInt,
	workgroupCountZ: UInt,
) {
		 = Functions.wgpuComputePassEncoderDispatchWorkgroups(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, workgroupCountX, workgroupCountY, workgroupCountZ)
}

public actual fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(
	handler: WGPUComputePassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = Functions.wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)
}

public actual fun wgpuComputePassEncoderEnd(handler: WGPUComputePassEncoder?) {
		 = Functions.wgpuComputePassEncoderEnd(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePassEncoderSetLabel(handler: WGPUComputePassEncoder?, label: WGPUStringView) {
		 = Functions.wgpuComputePassEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePipelineRelease(handler: WGPUComputePipeline?) {
		 = Functions.wgpuComputePipelineRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuComputePipelineGetBindGroupLayout(handler: WGPUComputePipeline?, groupIndex: UInt): WGPUBindGroupLayout? {
		 = Functions.wgpuComputePipelineGetBindGroupLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex)
			?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)
}

public actual fun wgpuComputePipelineSetLabel(handler: WGPUComputePipeline?, label: WGPUStringView) {
		 = Functions.wgpuComputePipelineSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuDeviceRelease(handler: WGPUDevice?) {
		 = Functions.wgpuDeviceRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuDeviceCreateBindGroup(handler: WGPUDevice?, descriptor: WGPUBindGroupDescriptor?): WGPUBindGroup? {
		 = Functions.wgpuDeviceCreateBindGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUBindGroup)
}

public actual fun wgpuDeviceCreateBindGroupLayout(handler: WGPUDevice?, descriptor: WGPUBindGroupLayoutDescriptor?): WGPUBindGroupLayout? {
		 = Functions.wgpuDeviceCreateBindGroupLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)
}

public actual fun wgpuDeviceCreateBuffer(handler: WGPUDevice?, descriptor: WGPUBufferDescriptor?): WGPUBuffer? {
		 = Functions.wgpuDeviceCreateBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUBuffer)
}

public actual fun wgpuDeviceCreateCommandEncoder(handler: WGPUDevice?, descriptor: WGPUCommandEncoderDescriptor?): WGPUCommandEncoder? {
		 = Functions.wgpuDeviceCreateCommandEncoder(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUCommandEncoder)
}

public actual fun wgpuDeviceCreateComputePipeline(handler: WGPUDevice?, descriptor: WGPUComputePipelineDescriptor?): WGPUComputePipeline? {
		 = Functions.wgpuDeviceCreateComputePipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUComputePipeline)
}

public actual fun wgpuDeviceCreateComputePipelineAsync(
	handler: WGPUDevice?,
	descriptor: WGPUComputePipelineDescriptor?,
	callbackInfo: WGPUCreateComputePipelineAsyncCallbackInfo,
) {
		 = Functions.wgpuDeviceCreateComputePipelineAsync(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuDeviceCreatePipelineLayout(handler: WGPUDevice?, descriptor: WGPUPipelineLayoutDescriptor?): WGPUPipelineLayout? {
		 = Functions.wgpuDeviceCreatePipelineLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUPipelineLayout)
}

public actual fun wgpuDeviceCreateQuerySet(handler: WGPUDevice?, descriptor: WGPUQuerySetDescriptor?): WGPUQuerySet? {
		 = Functions.wgpuDeviceCreateQuerySet(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUQuerySet)
}

public actual fun wgpuDeviceCreateRenderPipelineAsync(
	handler: WGPUDevice?,
	descriptor: WGPURenderPipelineDescriptor?,
	callbackInfo: WGPUCreateRenderPipelineAsyncCallbackInfo,
) {
		 = Functions.wgpuDeviceCreateRenderPipelineAsync(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuDeviceCreateRenderBundleEncoder(handler: WGPUDevice?, descriptor: WGPURenderBundleEncoderDescriptor?): WGPURenderBundleEncoder? {
		 = Functions.wgpuDeviceCreateRenderBundleEncoder(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPURenderBundleEncoder)
}

public actual fun wgpuDeviceCreateRenderPipeline(handler: WGPUDevice?, descriptor: WGPURenderPipelineDescriptor?): WGPURenderPipeline? {
		 = Functions.wgpuDeviceCreateRenderPipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPURenderPipeline)
}

public actual fun wgpuDeviceCreateSampler(handler: WGPUDevice?, descriptor: WGPUSamplerDescriptor?): WGPUSampler? {
		 = Functions.wgpuDeviceCreateSampler(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUSampler)
}

public actual fun wgpuDeviceCreateShaderModule(handler: WGPUDevice?, descriptor: WGPUShaderModuleDescriptor?): WGPUShaderModule? {
		 = Functions.wgpuDeviceCreateShaderModule(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUShaderModule)
}

public actual fun wgpuDeviceCreateTexture(handler: WGPUDevice?, descriptor: WGPUTextureDescriptor?): WGPUTexture? {
		 = Functions.wgpuDeviceCreateTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUTexture)
}

public actual fun wgpuDeviceDestroy(handler: WGPUDevice?) {
		 = Functions.wgpuDeviceDestroy(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuDeviceGetLostFuture(handler: WGPUDevice?): WGPUFuture {
		 = Functions.wgpuDeviceGetLostFuture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			.let(::NativeAddress).let(WGPUFuture::invoke)
}

public actual fun wgpuDeviceGetLimits(handler: WGPUDevice?, limits: WGPULimits?): WGPUStatus {
		 = Functions.wgpuDeviceGetLimits(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, limits?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuDeviceHasFeature(handler: WGPUDevice?, feature: WGPUFeatureName): Boolean {
		 = Functions.wgpuDeviceHasFeature(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, feature)
			.toBoolean()
}

public actual fun wgpuDeviceGetFeatures(handler: WGPUDevice?, features: WGPUSupportedFeatures?) {
		 = Functions.wgpuDeviceGetFeatures(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, features?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuDeviceGetAdapterInfo(handler: WGPUDevice?): WGPUAdapterInfo {
		 = Functions.wgpuDeviceGetAdapterInfo(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			.let(::NativeAddress).let(WGPUAdapterInfo::invoke)
}

public actual fun wgpuDeviceGetQueue(handler: WGPUDevice?): WGPUQueue? {
		 = Functions.wgpuDeviceGetQueue(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUQueue)
}

public actual fun wgpuDevicePushErrorScope(handler: WGPUDevice?, filter: WGPUErrorFilter) {
		 = Functions.wgpuDevicePushErrorScope(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, filter)
}

public actual fun wgpuDevicePopErrorScope(handler: WGPUDevice?, callbackInfo: WGPUPopErrorScopeCallbackInfo) {
		 = Functions.wgpuDevicePopErrorScope(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuDeviceSetLabel(handler: WGPUDevice?, label: WGPUStringView) {
		 = Functions.wgpuDeviceSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuInstanceRelease(handler: WGPUInstance?) {
		 = Functions.wgpuInstanceRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuInstanceCreateSurface(handler: WGPUInstance?, descriptor: WGPUSurfaceDescriptor?): WGPUSurface? {
		 = Functions.wgpuInstanceCreateSurface(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUSurface)
}

public actual fun wgpuInstanceGetWGSLLanguageFeatures(handler: WGPUInstance?, features: WGPUSupportedWGSLLanguageFeatures?): WGPUStatus {
		 = Functions.wgpuInstanceGetWGSLLanguageFeatures(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, features?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuInstanceHasWGSLLanguageFeature(handler: WGPUInstance?, feature: WGPUWGSLLanguageFeatureName): Boolean {
		 = Functions.wgpuInstanceHasWGSLLanguageFeature(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, feature)
			.toBoolean()
}

public actual fun wgpuInstanceProcessEvents(handler: WGPUInstance?) {
		 = Functions.wgpuInstanceProcessEvents(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuInstanceRequestAdapter(
	handler: WGPUInstance?,
	options: WGPURequestAdapterOptions?,
	callbackInfo: WGPURequestAdapterCallbackInfo,
) {
		 = Functions.wgpuInstanceRequestAdapter(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, options?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuInstanceWaitAny(
	handler: WGPUInstance?,
	futureCount: ULong,
	futures: WGPUFutureWaitInfo?,
	timeoutNS: ULong,
): WGPUWaitStatus {
		 = Functions.wgpuInstanceWaitAny(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, futureCount, futures?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, timeoutNS)
}

public actual fun wgpuPipelineLayoutRelease(handler: WGPUPipelineLayout?) {
		 = Functions.wgpuPipelineLayoutRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuPipelineLayoutSetLabel(handler: WGPUPipelineLayout?, label: WGPUStringView) {
		 = Functions.wgpuPipelineLayoutSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQuerySetRelease(handler: WGPUQuerySet?) {
		 = Functions.wgpuQuerySetRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQuerySetSetLabel(handler: WGPUQuerySet?, label: WGPUStringView) {
		 = Functions.wgpuQuerySetSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQuerySetGetType(handler: WGPUQuerySet?): WGPUQueryType {
		 = Functions.wgpuQuerySetGetType(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQuerySetGetCount(handler: WGPUQuerySet?): UInt {
		 = Functions.wgpuQuerySetGetCount(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQuerySetDestroy(handler: WGPUQuerySet?) {
		 = Functions.wgpuQuerySetDestroy(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQueueRelease(handler: WGPUQueue?) {
		 = Functions.wgpuQueueRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQueueSubmit(
	handler: WGPUQueue?,
	commandCount: ULong,
	commands: ArrayHolder<WGPUCommandBuffer>?,
) {
		 = Functions.wgpuQueueSubmit(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, commandCount, commands?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQueueOnSubmittedWorkDone(handler: WGPUQueue?, callbackInfo: WGPUQueueWorkDoneCallbackInfo) {
		 = Functions.wgpuQueueOnSubmittedWorkDone(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQueueWriteBuffer(
	handler: WGPUQueue?,
	buffer: WGPUBuffer?,
	bufferOffset: ULong,
	`data`: NativeAddress?,
	size: ULong,
) {
		 = Functions.wgpuQueueWriteBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, bufferOffset, data.adapt() ?: java.lang.foreign.MemorySegment.NULL, size)
}

public actual fun wgpuQueueWriteTexture(
	handler: WGPUQueue?,
	destination: WGPUTexelCopyTextureInfo?,
	`data`: NativeAddress?,
	dataSize: ULong,
	dataLayout: WGPUTexelCopyBufferLayout?,
	writeSize: WGPUExtent3D?,
) {
		 = Functions.wgpuQueueWriteTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, destination?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, data.adapt() ?: java.lang.foreign.MemorySegment.NULL, dataSize, dataLayout?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, writeSize?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuQueueSetLabel(handler: WGPUQueue?, label: WGPUStringView) {
		 = Functions.wgpuQueueSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderBundleRelease(handler: WGPURenderBundle?) {
		 = Functions.wgpuRenderBundleRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderBundleSetLabel(handler: WGPURenderBundle?, label: WGPUStringView) {
		 = Functions.wgpuRenderBundleSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderBundleEncoderRelease(handler: WGPURenderBundleEncoder?) {
		 = Functions.wgpuRenderBundleEncoderRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderBundleEncoderSetPipeline(handler: WGPURenderBundleEncoder?, pipeline: WGPURenderPipeline?) {
		 = Functions.wgpuRenderBundleEncoderSetPipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, pipeline?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderBundleEncoderSetBindGroup(
	handler: WGPURenderBundleEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
) {
		 = Functions.wgpuRenderBundleEncoderSetBindGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex, group?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, dynamicOffsetCount, dynamicOffsets?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderBundleEncoderDraw(
	handler: WGPURenderBundleEncoder?,
	vertexCount: UInt,
	instanceCount: UInt,
	firstVertex: UInt,
	firstInstance: UInt,
) {
		 = Functions.wgpuRenderBundleEncoderDraw(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, vertexCount, instanceCount, firstVertex, firstInstance)
}

public actual fun wgpuRenderBundleEncoderDrawIndexed(
	handler: WGPURenderBundleEncoder?,
	indexCount: UInt,
	instanceCount: UInt,
	firstIndex: UInt,
	baseVertex: Int,
	firstInstance: UInt,
) {
		 = Functions.wgpuRenderBundleEncoderDrawIndexed(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indexCount, instanceCount, firstIndex, baseVertex, firstInstance)
}

public actual fun wgpuRenderBundleEncoderDrawIndirect(
	handler: WGPURenderBundleEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = Functions.wgpuRenderBundleEncoderDrawIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)
}

public actual fun wgpuRenderBundleEncoderDrawIndexedIndirect(
	handler: WGPURenderBundleEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = Functions.wgpuRenderBundleEncoderDrawIndexedIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)
}

public actual fun wgpuRenderBundleEncoderInsertDebugMarker(handler: WGPURenderBundleEncoder?, markerLabel: WGPUStringView) {
		 = Functions.wgpuRenderBundleEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderBundleEncoderPopDebugGroup(handler: WGPURenderBundleEncoder?) {
		 = Functions.wgpuRenderBundleEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderBundleEncoderPushDebugGroup(handler: WGPURenderBundleEncoder?, groupLabel: WGPUStringView) {
		 = Functions.wgpuRenderBundleEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderBundleEncoderSetVertexBuffer(
	handler: WGPURenderBundleEncoder?,
	slot: UInt,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
) {
		 = Functions.wgpuRenderBundleEncoderSetVertexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, slot, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)
}

public actual fun wgpuRenderBundleEncoderSetIndexBuffer(
	handler: WGPURenderBundleEncoder?,
	buffer: WGPUBuffer?,
	format: WGPUIndexFormat,
	offset: ULong,
	size: ULong,
) {
		 = Functions.wgpuRenderBundleEncoderSetIndexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, format, offset, size)
}

public actual fun wgpuRenderBundleEncoderFinish(handler: WGPURenderBundleEncoder?, descriptor: WGPURenderBundleDescriptor?): WGPURenderBundle? {
		 = Functions.wgpuRenderBundleEncoderFinish(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPURenderBundle)
}

public actual fun wgpuRenderBundleEncoderSetLabel(handler: WGPURenderBundleEncoder?, label: WGPUStringView) {
		 = Functions.wgpuRenderBundleEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderRelease(handler: WGPURenderPassEncoder?) {
		 = Functions.wgpuRenderPassEncoderRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderSetPipeline(handler: WGPURenderPassEncoder?, pipeline: WGPURenderPipeline?) {
		 = Functions.wgpuRenderPassEncoderSetPipeline(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, pipeline?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderSetBindGroup(
	handler: WGPURenderPassEncoder?,
	groupIndex: UInt,
	group: WGPUBindGroup?,
	dynamicOffsetCount: ULong,
	dynamicOffsets: ArrayHolder<UInt>?,
) {
		 = Functions.wgpuRenderPassEncoderSetBindGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex, group?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, dynamicOffsetCount, dynamicOffsets?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderDraw(
	handler: WGPURenderPassEncoder?,
	vertexCount: UInt,
	instanceCount: UInt,
	firstVertex: UInt,
	firstInstance: UInt,
) {
		 = Functions.wgpuRenderPassEncoderDraw(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, vertexCount, instanceCount, firstVertex, firstInstance)
}

public actual fun wgpuRenderPassEncoderDrawIndexed(
	handler: WGPURenderPassEncoder?,
	indexCount: UInt,
	instanceCount: UInt,
	firstIndex: UInt,
	baseVertex: Int,
	firstInstance: UInt,
) {
		 = Functions.wgpuRenderPassEncoderDrawIndexed(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indexCount, instanceCount, firstIndex, baseVertex, firstInstance)
}

public actual fun wgpuRenderPassEncoderDrawIndirect(
	handler: WGPURenderPassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = Functions.wgpuRenderPassEncoderDrawIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)
}

public actual fun wgpuRenderPassEncoderDrawIndexedIndirect(
	handler: WGPURenderPassEncoder?,
	indirectBuffer: WGPUBuffer?,
	indirectOffset: ULong,
) {
		 = Functions.wgpuRenderPassEncoderDrawIndexedIndirect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectBuffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, indirectOffset)
}

public actual fun wgpuRenderPassEncoderExecuteBundles(
	handler: WGPURenderPassEncoder?,
	bundleCount: ULong,
	bundles: ArrayHolder<WGPURenderBundle>?,
) {
		 = Functions.wgpuRenderPassEncoderExecuteBundles(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, bundleCount, bundles?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderInsertDebugMarker(handler: WGPURenderPassEncoder?, markerLabel: WGPUStringView) {
		 = Functions.wgpuRenderPassEncoderInsertDebugMarker(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, markerLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderPopDebugGroup(handler: WGPURenderPassEncoder?) {
		 = Functions.wgpuRenderPassEncoderPopDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderPushDebugGroup(handler: WGPURenderPassEncoder?, groupLabel: WGPUStringView) {
		 = Functions.wgpuRenderPassEncoderPushDebugGroup(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupLabel?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderSetStencilReference(handler: WGPURenderPassEncoder?, reference: UInt) {
		 = Functions.wgpuRenderPassEncoderSetStencilReference(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, reference)
}

public actual fun wgpuRenderPassEncoderSetBlendConstant(handler: WGPURenderPassEncoder?, color: WGPUColor?) {
		 = Functions.wgpuRenderPassEncoderSetBlendConstant(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, color?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
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
		 = Functions.wgpuRenderPassEncoderSetViewport(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, x, y, width, height, minDepth, maxDepth)
}

public actual fun wgpuRenderPassEncoderSetScissorRect(
	handler: WGPURenderPassEncoder?,
	x: UInt,
	y: UInt,
	width: UInt,
	height: UInt,
) {
		 = Functions.wgpuRenderPassEncoderSetScissorRect(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, x, y, width, height)
}

public actual fun wgpuRenderPassEncoderSetVertexBuffer(
	handler: WGPURenderPassEncoder?,
	slot: UInt,
	buffer: WGPUBuffer?,
	offset: ULong,
	size: ULong,
) {
		 = Functions.wgpuRenderPassEncoderSetVertexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, slot, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, offset, size)
}

public actual fun wgpuRenderPassEncoderSetIndexBuffer(
	handler: WGPURenderPassEncoder?,
	buffer: WGPUBuffer?,
	format: WGPUIndexFormat,
	offset: ULong,
	size: ULong,
) {
		 = Functions.wgpuRenderPassEncoderSetIndexBuffer(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, buffer?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, format, offset, size)
}

public actual fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: WGPURenderPassEncoder?, queryIndex: UInt) {
		 = Functions.wgpuRenderPassEncoderBeginOcclusionQuery(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, queryIndex)
}

public actual fun wgpuRenderPassEncoderEndOcclusionQuery(handler: WGPURenderPassEncoder?) {
		 = Functions.wgpuRenderPassEncoderEndOcclusionQuery(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderEnd(handler: WGPURenderPassEncoder?) {
		 = Functions.wgpuRenderPassEncoderEnd(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPassEncoderSetLabel(handler: WGPURenderPassEncoder?, label: WGPUStringView) {
		 = Functions.wgpuRenderPassEncoderSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPipelineRelease(handler: WGPURenderPipeline?) {
		 = Functions.wgpuRenderPipelineRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuRenderPipelineGetBindGroupLayout(handler: WGPURenderPipeline?, groupIndex: UInt): WGPUBindGroupLayout? {
		 = Functions.wgpuRenderPipelineGetBindGroupLayout(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, groupIndex)
			?.let(::NativeAddress)?.let(::WGPUBindGroupLayout)
}

public actual fun wgpuRenderPipelineSetLabel(handler: WGPURenderPipeline?, label: WGPUStringView) {
		 = Functions.wgpuRenderPipelineSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSamplerRelease(handler: WGPUSampler?) {
		 = Functions.wgpuSamplerRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSamplerSetLabel(handler: WGPUSampler?, label: WGPUStringView) {
		 = Functions.wgpuSamplerSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuShaderModuleRelease(handler: WGPUShaderModule?) {
		 = Functions.wgpuShaderModuleRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuShaderModuleGetCompilationInfo(handler: WGPUShaderModule?, callbackInfo: WGPUCompilationInfoCallbackInfo) {
		 = Functions.wgpuShaderModuleGetCompilationInfo(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, callbackInfo?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuShaderModuleSetLabel(handler: WGPUShaderModule?, label: WGPUStringView) {
		 = Functions.wgpuShaderModuleSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSurfaceRelease(handler: WGPUSurface?) {
		 = Functions.wgpuSurfaceRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSurfaceConfigure(handler: WGPUSurface?, config: WGPUSurfaceConfiguration?) {
		 = Functions.wgpuSurfaceConfigure(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, config?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSurfaceGetCapabilities(
	handler: WGPUSurface?,
	adapter: WGPUAdapter?,
	capabilities: WGPUSurfaceCapabilities?,
): WGPUStatus {
		 = Functions.wgpuSurfaceGetCapabilities(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, adapter?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, capabilities?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSurfaceGetCurrentTexture(handler: WGPUSurface?, surfaceTexture: WGPUSurfaceTexture?) {
		 = Functions.wgpuSurfaceGetCurrentTexture(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, surfaceTexture?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSurfacePresent(handler: WGPUSurface?): WGPUStatus {
		 = Functions.wgpuSurfacePresent(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSurfaceUnconfigure(handler: WGPUSurface?) {
		 = Functions.wgpuSurfaceUnconfigure(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuSurfaceSetLabel(handler: WGPUSurface?, label: WGPUStringView) {
		 = Functions.wgpuSurfaceSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureRelease(handler: WGPUTexture?) {
		 = Functions.wgpuTextureRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureCreateView(handler: WGPUTexture?, descriptor: WGPUTextureViewDescriptor?): WGPUTextureView? {
		 = Functions.wgpuTextureCreateView(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, descriptor?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
			?.let(::NativeAddress)?.let(::WGPUTextureView)
}

public actual fun wgpuTextureSetLabel(handler: WGPUTexture?, label: WGPUStringView) {
		 = Functions.wgpuTextureSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureGetWidth(handler: WGPUTexture?): UInt {
		 = Functions.wgpuTextureGetWidth(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureGetHeight(handler: WGPUTexture?): UInt {
		 = Functions.wgpuTextureGetHeight(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureGetDepthOrArrayLayers(handler: WGPUTexture?): UInt {
		 = Functions.wgpuTextureGetDepthOrArrayLayers(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureGetMipLevelCount(handler: WGPUTexture?): UInt {
		 = Functions.wgpuTextureGetMipLevelCount(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureGetSampleCount(handler: WGPUTexture?): UInt {
		 = Functions.wgpuTextureGetSampleCount(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureGetDimension(handler: WGPUTexture?): WGPUTextureDimension {
		 = Functions.wgpuTextureGetDimension(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureGetFormat(handler: WGPUTexture?): WGPUTextureFormat {
		 = Functions.wgpuTextureGetFormat(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureGetUsage(handler: WGPUTexture?): ULong {
		 = Functions.wgpuTextureGetUsage(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureDestroy(handler: WGPUTexture?) {
		 = Functions.wgpuTextureDestroy(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureViewRelease(handler: WGPUTextureView?) {
		 = Functions.wgpuTextureViewRelease(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}

public actual fun wgpuTextureViewSetLabel(handler: WGPUTextureView?, label: WGPUStringView) {
		 = Functions.wgpuTextureViewSetLabel(handler?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL, label?.handler.adapt() ?: java.lang.foreign.MemorySegment.NULL)
}
