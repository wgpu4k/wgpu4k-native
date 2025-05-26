// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import java.lang.foreign.MemorySegment
import java.lang.foreign.Linker
import ffi.findOrThrow
import ffi.C_POINTER
import ffi.C_INT
import ffi.C_LONG
import ffi.C_FLOAT
import ffi.NativeAddress
import java.lang.foreign.FunctionDescriptor

object Functions {
	fun wgpuCreateInstance(descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuCreateInstanceHandler.invokeExact(descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuCreateInstanceHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER
		)
	private val wgpuCreateInstanceHandlerAddress = findOrThrow("wgpuCreateInstance")
	private val wgpuCreateInstanceHandler = Linker.nativeLinker().downcallHandle(wgpuCreateInstanceHandlerAddress, wgpuCreateInstanceHandlerDescription)

	fun wgpuGetInstanceCapabilities(capabilities: java.lang.foreign.MemorySegment): UInt {
		return (wgpuGetInstanceCapabilitiesHandler.invokeExact(capabilities) as Int).toUInt()
	}
	private val wgpuGetInstanceCapabilitiesHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuGetInstanceCapabilitiesHandlerAddress = findOrThrow("wgpuGetInstanceCapabilities")
	private val wgpuGetInstanceCapabilitiesHandler = Linker.nativeLinker().downcallHandle(wgpuGetInstanceCapabilitiesHandlerAddress, wgpuGetInstanceCapabilitiesHandlerDescription)

	fun wgpuDevicePoll(device: java.lang.foreign.MemorySegment, wait: UInt, wrappedSubmissionIndex: java.lang.foreign.MemorySegment): UInt {
		return (wgpuDevicePollHandler.invokeExact(device, wait.toInt(), wrappedSubmissionIndex) as Int).toUInt()
	}
	private val wgpuDevicePollHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_INT,
			C_POINTER
		)
	private val wgpuDevicePollHandlerAddress = findOrThrow("wgpuDevicePoll")
	private val wgpuDevicePollHandler = Linker.nativeLinker().downcallHandle(wgpuDevicePollHandlerAddress, wgpuDevicePollHandlerDescription)

	fun wgpuSetLogCallback(callback: java.lang.foreign.MemorySegment, userdata: java.lang.foreign.MemorySegment): Unit {
		return (wgpuSetLogCallbackHandler.invokeExact(callback, userdata) as Unit)
	}
	private val wgpuSetLogCallbackHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER
		)
	private val wgpuSetLogCallbackHandlerAddress = findOrThrow("wgpuSetLogCallback")
	private val wgpuSetLogCallbackHandler = Linker.nativeLinker().downcallHandle(wgpuSetLogCallbackHandlerAddress, wgpuSetLogCallbackHandlerDescription)

	fun wgpuSetLogLevel(level: UInt): Unit {
		return (wgpuSetLogLevelHandler.invokeExact(level.toInt()) as Unit)
	}
	private val wgpuSetLogLevelHandlerDescription = FunctionDescriptor.ofVoid(
			C_INT
		)
	private val wgpuSetLogLevelHandlerAddress = findOrThrow("wgpuSetLogLevel")
	private val wgpuSetLogLevelHandler = Linker.nativeLinker().downcallHandle(wgpuSetLogLevelHandlerAddress, wgpuSetLogLevelHandlerDescription)

	fun wgpuAdapterRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuAdapterReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuAdapterReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuAdapterReleaseHandlerAddress = findOrThrow("wgpuAdapterRelease")
	private val wgpuAdapterReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuAdapterReleaseHandlerAddress, wgpuAdapterReleaseHandlerDescription)

	fun wgpuAdapterGetLimits(handler: java.lang.foreign.MemorySegment, limits: java.lang.foreign.MemorySegment): UInt {
		return (wgpuAdapterGetLimitsHandler.invokeExact(handler, limits) as Int).toUInt()
	}
	private val wgpuAdapterGetLimitsHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_POINTER
		)
	private val wgpuAdapterGetLimitsHandlerAddress = findOrThrow("wgpuAdapterGetLimits")
	private val wgpuAdapterGetLimitsHandler = Linker.nativeLinker().downcallHandle(wgpuAdapterGetLimitsHandlerAddress, wgpuAdapterGetLimitsHandlerDescription)

	fun wgpuAdapterHasFeature(handler: java.lang.foreign.MemorySegment, feature: UInt): UInt {
		return (wgpuAdapterHasFeatureHandler.invokeExact(handler, feature.toInt()) as Int).toUInt()
	}
	private val wgpuAdapterHasFeatureHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_INT
		)
	private val wgpuAdapterHasFeatureHandlerAddress = findOrThrow("wgpuAdapterHasFeature")
	private val wgpuAdapterHasFeatureHandler = Linker.nativeLinker().downcallHandle(wgpuAdapterHasFeatureHandlerAddress, wgpuAdapterHasFeatureHandlerDescription)

	fun wgpuAdapterGetFeatures(handler: java.lang.foreign.MemorySegment, features: java.lang.foreign.MemorySegment): Unit {
		return (wgpuAdapterGetFeaturesHandler.invokeExact(handler, features) as Unit)
	}
	private val wgpuAdapterGetFeaturesHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER
		)
	private val wgpuAdapterGetFeaturesHandlerAddress = findOrThrow("wgpuAdapterGetFeatures")
	private val wgpuAdapterGetFeaturesHandler = Linker.nativeLinker().downcallHandle(wgpuAdapterGetFeaturesHandlerAddress, wgpuAdapterGetFeaturesHandlerDescription)

	fun wgpuAdapterGetInfo(handler: java.lang.foreign.MemorySegment, info: java.lang.foreign.MemorySegment): UInt {
		return (wgpuAdapterGetInfoHandler.invokeExact(handler, info) as Int).toUInt()
	}
	private val wgpuAdapterGetInfoHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_POINTER
		)
	private val wgpuAdapterGetInfoHandlerAddress = findOrThrow("wgpuAdapterGetInfo")
	private val wgpuAdapterGetInfoHandler = Linker.nativeLinker().downcallHandle(wgpuAdapterGetInfoHandlerAddress, wgpuAdapterGetInfoHandlerDescription)

	fun wgpuAdapterRequestDevice(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment, callbackInfo: java.lang.foreign.MemorySegment): Unit {
		return (wgpuAdapterRequestDeviceHandler.invokeExact(handler, descriptor, callbackInfo) as Unit)
	}
	private val wgpuAdapterRequestDeviceHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			WGPURequestDeviceCallbackInfo.LAYOUT
		)
	private val wgpuAdapterRequestDeviceHandlerAddress = findOrThrow("wgpuAdapterRequestDevice")
	private val wgpuAdapterRequestDeviceHandler = Linker.nativeLinker().downcallHandle(wgpuAdapterRequestDeviceHandlerAddress, wgpuAdapterRequestDeviceHandlerDescription)

	fun wgpuBindGroupRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuBindGroupReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuBindGroupReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuBindGroupReleaseHandlerAddress = findOrThrow("wgpuBindGroupRelease")
	private val wgpuBindGroupReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuBindGroupReleaseHandlerAddress, wgpuBindGroupReleaseHandlerDescription)

	fun wgpuBindGroupSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuBindGroupSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuBindGroupSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuBindGroupSetLabelHandlerAddress = findOrThrow("wgpuBindGroupSetLabel")
	private val wgpuBindGroupSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuBindGroupSetLabelHandlerAddress, wgpuBindGroupSetLabelHandlerDescription)

	fun wgpuBindGroupLayoutRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuBindGroupLayoutReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuBindGroupLayoutReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuBindGroupLayoutReleaseHandlerAddress = findOrThrow("wgpuBindGroupLayoutRelease")
	private val wgpuBindGroupLayoutReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuBindGroupLayoutReleaseHandlerAddress, wgpuBindGroupLayoutReleaseHandlerDescription)

	fun wgpuBindGroupLayoutSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuBindGroupLayoutSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuBindGroupLayoutSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuBindGroupLayoutSetLabelHandlerAddress = findOrThrow("wgpuBindGroupLayoutSetLabel")
	private val wgpuBindGroupLayoutSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuBindGroupLayoutSetLabelHandlerAddress, wgpuBindGroupLayoutSetLabelHandlerDescription)

	fun wgpuBufferRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuBufferReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuBufferReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuBufferReleaseHandlerAddress = findOrThrow("wgpuBufferRelease")
	private val wgpuBufferReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuBufferReleaseHandlerAddress, wgpuBufferReleaseHandlerDescription)

	fun wgpuBufferMapAsync(handler: java.lang.foreign.MemorySegment, mode: ULong, offset: ULong, size: ULong, callbackInfo: java.lang.foreign.MemorySegment): Unit {
		return (wgpuBufferMapAsyncHandler.invokeExact(handler, mode.toLong(), offset.toLong(), size.toLong(), callbackInfo) as Unit)
	}
	private val wgpuBufferMapAsyncHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_LONG,
			C_LONG,
			C_LONG,
			WGPUBufferMapCallbackInfo.LAYOUT
		)
	private val wgpuBufferMapAsyncHandlerAddress = findOrThrow("wgpuBufferMapAsync")
	private val wgpuBufferMapAsyncHandler = Linker.nativeLinker().downcallHandle(wgpuBufferMapAsyncHandlerAddress, wgpuBufferMapAsyncHandlerDescription)

	fun wgpuBufferGetMappedRange(handler: java.lang.foreign.MemorySegment, offset: ULong, size: ULong): java.lang.foreign.MemorySegment {
		return (wgpuBufferGetMappedRangeHandler.invokeExact(handler, offset.toLong(), size.toLong()) as java.lang.foreign.MemorySegment)
	}
	private val wgpuBufferGetMappedRangeHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_LONG,
			C_LONG
		)
	private val wgpuBufferGetMappedRangeHandlerAddress = findOrThrow("wgpuBufferGetMappedRange")
	private val wgpuBufferGetMappedRangeHandler = Linker.nativeLinker().downcallHandle(wgpuBufferGetMappedRangeHandlerAddress, wgpuBufferGetMappedRangeHandlerDescription)

	fun wgpuBufferGetConstMappedRange(handler: java.lang.foreign.MemorySegment, offset: ULong, size: ULong): java.lang.foreign.MemorySegment {
		return (wgpuBufferGetConstMappedRangeHandler.invokeExact(handler, offset.toLong(), size.toLong()) as java.lang.foreign.MemorySegment)
	}
	private val wgpuBufferGetConstMappedRangeHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_LONG,
			C_LONG
		)
	private val wgpuBufferGetConstMappedRangeHandlerAddress = findOrThrow("wgpuBufferGetConstMappedRange")
	private val wgpuBufferGetConstMappedRangeHandler = Linker.nativeLinker().downcallHandle(wgpuBufferGetConstMappedRangeHandlerAddress, wgpuBufferGetConstMappedRangeHandlerDescription)

	fun wgpuBufferSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuBufferSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuBufferSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuBufferSetLabelHandlerAddress = findOrThrow("wgpuBufferSetLabel")
	private val wgpuBufferSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuBufferSetLabelHandlerAddress, wgpuBufferSetLabelHandlerDescription)

	fun wgpuBufferGetUsage(handler: java.lang.foreign.MemorySegment): ULong {
		return (wgpuBufferGetUsageHandler.invokeExact(handler) as Long).toULong()
	}
	private val wgpuBufferGetUsageHandlerDescription = FunctionDescriptor.of(
			C_LONG,
			C_POINTER
		)
	private val wgpuBufferGetUsageHandlerAddress = findOrThrow("wgpuBufferGetUsage")
	private val wgpuBufferGetUsageHandler = Linker.nativeLinker().downcallHandle(wgpuBufferGetUsageHandlerAddress, wgpuBufferGetUsageHandlerDescription)

	fun wgpuBufferGetSize(handler: java.lang.foreign.MemorySegment): ULong {
		return (wgpuBufferGetSizeHandler.invokeExact(handler) as Long).toULong()
	}
	private val wgpuBufferGetSizeHandlerDescription = FunctionDescriptor.of(
			C_LONG,
			C_POINTER
		)
	private val wgpuBufferGetSizeHandlerAddress = findOrThrow("wgpuBufferGetSize")
	private val wgpuBufferGetSizeHandler = Linker.nativeLinker().downcallHandle(wgpuBufferGetSizeHandlerAddress, wgpuBufferGetSizeHandlerDescription)

	fun wgpuBufferGetMapState(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuBufferGetMapStateHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuBufferGetMapStateHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuBufferGetMapStateHandlerAddress = findOrThrow("wgpuBufferGetMapState")
	private val wgpuBufferGetMapStateHandler = Linker.nativeLinker().downcallHandle(wgpuBufferGetMapStateHandlerAddress, wgpuBufferGetMapStateHandlerDescription)

	fun wgpuBufferUnmap(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuBufferUnmapHandler.invokeExact(handler) as Unit)
	}
	private val wgpuBufferUnmapHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuBufferUnmapHandlerAddress = findOrThrow("wgpuBufferUnmap")
	private val wgpuBufferUnmapHandler = Linker.nativeLinker().downcallHandle(wgpuBufferUnmapHandlerAddress, wgpuBufferUnmapHandlerDescription)

	fun wgpuBufferDestroy(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuBufferDestroyHandler.invokeExact(handler) as Unit)
	}
	private val wgpuBufferDestroyHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuBufferDestroyHandlerAddress = findOrThrow("wgpuBufferDestroy")
	private val wgpuBufferDestroyHandler = Linker.nativeLinker().downcallHandle(wgpuBufferDestroyHandlerAddress, wgpuBufferDestroyHandlerDescription)

	fun wgpuCommandBufferRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandBufferReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuCommandBufferReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuCommandBufferReleaseHandlerAddress = findOrThrow("wgpuCommandBufferRelease")
	private val wgpuCommandBufferReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuCommandBufferReleaseHandlerAddress, wgpuCommandBufferReleaseHandlerDescription)

	fun wgpuCommandBufferSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandBufferSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuCommandBufferSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuCommandBufferSetLabelHandlerAddress = findOrThrow("wgpuCommandBufferSetLabel")
	private val wgpuCommandBufferSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuCommandBufferSetLabelHandlerAddress, wgpuCommandBufferSetLabelHandlerDescription)

	fun wgpuCommandEncoderRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandEncoderReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuCommandEncoderReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuCommandEncoderReleaseHandlerAddress = findOrThrow("wgpuCommandEncoderRelease")
	private val wgpuCommandEncoderReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderReleaseHandlerAddress, wgpuCommandEncoderReleaseHandlerDescription)

	fun wgpuCommandEncoderFinish(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuCommandEncoderFinishHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuCommandEncoderFinishHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuCommandEncoderFinishHandlerAddress = findOrThrow("wgpuCommandEncoderFinish")
	private val wgpuCommandEncoderFinishHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderFinishHandlerAddress, wgpuCommandEncoderFinishHandlerDescription)

	fun wgpuCommandEncoderBeginComputePass(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuCommandEncoderBeginComputePassHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuCommandEncoderBeginComputePassHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuCommandEncoderBeginComputePassHandlerAddress = findOrThrow("wgpuCommandEncoderBeginComputePass")
	private val wgpuCommandEncoderBeginComputePassHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderBeginComputePassHandlerAddress, wgpuCommandEncoderBeginComputePassHandlerDescription)

	fun wgpuCommandEncoderBeginRenderPass(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuCommandEncoderBeginRenderPassHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuCommandEncoderBeginRenderPassHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuCommandEncoderBeginRenderPassHandlerAddress = findOrThrow("wgpuCommandEncoderBeginRenderPass")
	private val wgpuCommandEncoderBeginRenderPassHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderBeginRenderPassHandlerAddress, wgpuCommandEncoderBeginRenderPassHandlerDescription)

	fun wgpuCommandEncoderCopyBufferToBuffer(handler: java.lang.foreign.MemorySegment, source: java.lang.foreign.MemorySegment, sourceOffset: ULong, destination: java.lang.foreign.MemorySegment, destinationOffset: ULong, size: ULong): Unit {
		return (wgpuCommandEncoderCopyBufferToBufferHandler.invokeExact(handler, source, sourceOffset.toLong(), destination, destinationOffset.toLong(), size.toLong()) as Unit)
	}
	private val wgpuCommandEncoderCopyBufferToBufferHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_LONG,
			C_POINTER,
			C_LONG,
			C_LONG
		)
	private val wgpuCommandEncoderCopyBufferToBufferHandlerAddress = findOrThrow("wgpuCommandEncoderCopyBufferToBuffer")
	private val wgpuCommandEncoderCopyBufferToBufferHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderCopyBufferToBufferHandlerAddress, wgpuCommandEncoderCopyBufferToBufferHandlerDescription)

	fun wgpuCommandEncoderCopyBufferToTexture(handler: java.lang.foreign.MemorySegment, source: java.lang.foreign.MemorySegment, destination: java.lang.foreign.MemorySegment, copySize: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandEncoderCopyBufferToTextureHandler.invokeExact(handler, source, destination, copySize) as Unit)
	}
	private val wgpuCommandEncoderCopyBufferToTextureHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuCommandEncoderCopyBufferToTextureHandlerAddress = findOrThrow("wgpuCommandEncoderCopyBufferToTexture")
	private val wgpuCommandEncoderCopyBufferToTextureHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderCopyBufferToTextureHandlerAddress, wgpuCommandEncoderCopyBufferToTextureHandlerDescription)

	fun wgpuCommandEncoderCopyTextureToBuffer(handler: java.lang.foreign.MemorySegment, source: java.lang.foreign.MemorySegment, destination: java.lang.foreign.MemorySegment, copySize: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandEncoderCopyTextureToBufferHandler.invokeExact(handler, source, destination, copySize) as Unit)
	}
	private val wgpuCommandEncoderCopyTextureToBufferHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuCommandEncoderCopyTextureToBufferHandlerAddress = findOrThrow("wgpuCommandEncoderCopyTextureToBuffer")
	private val wgpuCommandEncoderCopyTextureToBufferHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderCopyTextureToBufferHandlerAddress, wgpuCommandEncoderCopyTextureToBufferHandlerDescription)

	fun wgpuCommandEncoderCopyTextureToTexture(handler: java.lang.foreign.MemorySegment, source: java.lang.foreign.MemorySegment, destination: java.lang.foreign.MemorySegment, copySize: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandEncoderCopyTextureToTextureHandler.invokeExact(handler, source, destination, copySize) as Unit)
	}
	private val wgpuCommandEncoderCopyTextureToTextureHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuCommandEncoderCopyTextureToTextureHandlerAddress = findOrThrow("wgpuCommandEncoderCopyTextureToTexture")
	private val wgpuCommandEncoderCopyTextureToTextureHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderCopyTextureToTextureHandlerAddress, wgpuCommandEncoderCopyTextureToTextureHandlerDescription)

	fun wgpuCommandEncoderClearBuffer(handler: java.lang.foreign.MemorySegment, buffer: java.lang.foreign.MemorySegment, offset: ULong, size: ULong): Unit {
		return (wgpuCommandEncoderClearBufferHandler.invokeExact(handler, buffer, offset.toLong(), size.toLong()) as Unit)
	}
	private val wgpuCommandEncoderClearBufferHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_LONG,
			C_LONG
		)
	private val wgpuCommandEncoderClearBufferHandlerAddress = findOrThrow("wgpuCommandEncoderClearBuffer")
	private val wgpuCommandEncoderClearBufferHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderClearBufferHandlerAddress, wgpuCommandEncoderClearBufferHandlerDescription)

	fun wgpuCommandEncoderInsertDebugMarker(handler: java.lang.foreign.MemorySegment, markerLabel: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandEncoderInsertDebugMarkerHandler.invokeExact(handler, markerLabel) as Unit)
	}
	private val wgpuCommandEncoderInsertDebugMarkerHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuCommandEncoderInsertDebugMarkerHandlerAddress = findOrThrow("wgpuCommandEncoderInsertDebugMarker")
	private val wgpuCommandEncoderInsertDebugMarkerHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderInsertDebugMarkerHandlerAddress, wgpuCommandEncoderInsertDebugMarkerHandlerDescription)

	fun wgpuCommandEncoderPopDebugGroup(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandEncoderPopDebugGroupHandler.invokeExact(handler) as Unit)
	}
	private val wgpuCommandEncoderPopDebugGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuCommandEncoderPopDebugGroupHandlerAddress = findOrThrow("wgpuCommandEncoderPopDebugGroup")
	private val wgpuCommandEncoderPopDebugGroupHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderPopDebugGroupHandlerAddress, wgpuCommandEncoderPopDebugGroupHandlerDescription)

	fun wgpuCommandEncoderPushDebugGroup(handler: java.lang.foreign.MemorySegment, groupLabel: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandEncoderPushDebugGroupHandler.invokeExact(handler, groupLabel) as Unit)
	}
	private val wgpuCommandEncoderPushDebugGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuCommandEncoderPushDebugGroupHandlerAddress = findOrThrow("wgpuCommandEncoderPushDebugGroup")
	private val wgpuCommandEncoderPushDebugGroupHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderPushDebugGroupHandlerAddress, wgpuCommandEncoderPushDebugGroupHandlerDescription)

	fun wgpuCommandEncoderResolveQuerySet(handler: java.lang.foreign.MemorySegment, querySet: java.lang.foreign.MemorySegment, firstQuery: UInt, queryCount: UInt, destination: java.lang.foreign.MemorySegment, destinationOffset: ULong): Unit {
		return (wgpuCommandEncoderResolveQuerySetHandler.invokeExact(handler, querySet, firstQuery.toInt(), queryCount.toInt(), destination, destinationOffset.toLong()) as Unit)
	}
	private val wgpuCommandEncoderResolveQuerySetHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_INT,
			C_INT,
			C_POINTER,
			C_LONG
		)
	private val wgpuCommandEncoderResolveQuerySetHandlerAddress = findOrThrow("wgpuCommandEncoderResolveQuerySet")
	private val wgpuCommandEncoderResolveQuerySetHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderResolveQuerySetHandlerAddress, wgpuCommandEncoderResolveQuerySetHandlerDescription)

	fun wgpuCommandEncoderWriteTimestamp(handler: java.lang.foreign.MemorySegment, querySet: java.lang.foreign.MemorySegment, queryIndex: UInt): Unit {
		return (wgpuCommandEncoderWriteTimestampHandler.invokeExact(handler, querySet, queryIndex.toInt()) as Unit)
	}
	private val wgpuCommandEncoderWriteTimestampHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_INT
		)
	private val wgpuCommandEncoderWriteTimestampHandlerAddress = findOrThrow("wgpuCommandEncoderWriteTimestamp")
	private val wgpuCommandEncoderWriteTimestampHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderWriteTimestampHandlerAddress, wgpuCommandEncoderWriteTimestampHandlerDescription)

	fun wgpuCommandEncoderSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuCommandEncoderSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuCommandEncoderSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuCommandEncoderSetLabelHandlerAddress = findOrThrow("wgpuCommandEncoderSetLabel")
	private val wgpuCommandEncoderSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuCommandEncoderSetLabelHandlerAddress, wgpuCommandEncoderSetLabelHandlerDescription)

	fun wgpuComputePassEncoderRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePassEncoderReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuComputePassEncoderReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuComputePassEncoderReleaseHandlerAddress = findOrThrow("wgpuComputePassEncoderRelease")
	private val wgpuComputePassEncoderReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderReleaseHandlerAddress, wgpuComputePassEncoderReleaseHandlerDescription)

	fun wgpuComputePassEncoderInsertDebugMarker(handler: java.lang.foreign.MemorySegment, markerLabel: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePassEncoderInsertDebugMarkerHandler.invokeExact(handler, markerLabel) as Unit)
	}
	private val wgpuComputePassEncoderInsertDebugMarkerHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuComputePassEncoderInsertDebugMarkerHandlerAddress = findOrThrow("wgpuComputePassEncoderInsertDebugMarker")
	private val wgpuComputePassEncoderInsertDebugMarkerHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderInsertDebugMarkerHandlerAddress, wgpuComputePassEncoderInsertDebugMarkerHandlerDescription)

	fun wgpuComputePassEncoderPopDebugGroup(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePassEncoderPopDebugGroupHandler.invokeExact(handler) as Unit)
	}
	private val wgpuComputePassEncoderPopDebugGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuComputePassEncoderPopDebugGroupHandlerAddress = findOrThrow("wgpuComputePassEncoderPopDebugGroup")
	private val wgpuComputePassEncoderPopDebugGroupHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderPopDebugGroupHandlerAddress, wgpuComputePassEncoderPopDebugGroupHandlerDescription)

	fun wgpuComputePassEncoderPushDebugGroup(handler: java.lang.foreign.MemorySegment, groupLabel: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePassEncoderPushDebugGroupHandler.invokeExact(handler, groupLabel) as Unit)
	}
	private val wgpuComputePassEncoderPushDebugGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuComputePassEncoderPushDebugGroupHandlerAddress = findOrThrow("wgpuComputePassEncoderPushDebugGroup")
	private val wgpuComputePassEncoderPushDebugGroupHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderPushDebugGroupHandlerAddress, wgpuComputePassEncoderPushDebugGroupHandlerDescription)

	fun wgpuComputePassEncoderSetPipeline(handler: java.lang.foreign.MemorySegment, pipeline: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePassEncoderSetPipelineHandler.invokeExact(handler, pipeline) as Unit)
	}
	private val wgpuComputePassEncoderSetPipelineHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER
		)
	private val wgpuComputePassEncoderSetPipelineHandlerAddress = findOrThrow("wgpuComputePassEncoderSetPipeline")
	private val wgpuComputePassEncoderSetPipelineHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderSetPipelineHandlerAddress, wgpuComputePassEncoderSetPipelineHandlerDescription)

	fun wgpuComputePassEncoderSetBindGroup(handler: java.lang.foreign.MemorySegment, groupIndex: UInt, group: java.lang.foreign.MemorySegment, dynamicOffsetCount: ULong, dynamicOffsets: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePassEncoderSetBindGroupHandler.invokeExact(handler, groupIndex.toInt(), group, dynamicOffsetCount.toLong(), dynamicOffsets) as Unit)
	}
	private val wgpuComputePassEncoderSetBindGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_POINTER,
			C_LONG,
			C_POINTER
		)
	private val wgpuComputePassEncoderSetBindGroupHandlerAddress = findOrThrow("wgpuComputePassEncoderSetBindGroup")
	private val wgpuComputePassEncoderSetBindGroupHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderSetBindGroupHandlerAddress, wgpuComputePassEncoderSetBindGroupHandlerDescription)

	fun wgpuComputePassEncoderDispatchWorkgroups(handler: java.lang.foreign.MemorySegment, workgroupCountX: UInt, workgroupCountY: UInt, workgroupCountZ: UInt): Unit {
		return (wgpuComputePassEncoderDispatchWorkgroupsHandler.invokeExact(handler, workgroupCountX.toInt(), workgroupCountY.toInt(), workgroupCountZ.toInt()) as Unit)
	}
	private val wgpuComputePassEncoderDispatchWorkgroupsHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_INT,
			C_INT
		)
	private val wgpuComputePassEncoderDispatchWorkgroupsHandlerAddress = findOrThrow("wgpuComputePassEncoderDispatchWorkgroups")
	private val wgpuComputePassEncoderDispatchWorkgroupsHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderDispatchWorkgroupsHandlerAddress, wgpuComputePassEncoderDispatchWorkgroupsHandlerDescription)

	fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(handler: java.lang.foreign.MemorySegment, indirectBuffer: java.lang.foreign.MemorySegment, indirectOffset: ULong): Unit {
		return (wgpuComputePassEncoderDispatchWorkgroupsIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)
	}
	private val wgpuComputePassEncoderDispatchWorkgroupsIndirectHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_LONG
		)
	private val wgpuComputePassEncoderDispatchWorkgroupsIndirectHandlerAddress = findOrThrow("wgpuComputePassEncoderDispatchWorkgroupsIndirect")
	private val wgpuComputePassEncoderDispatchWorkgroupsIndirectHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderDispatchWorkgroupsIndirectHandlerAddress, wgpuComputePassEncoderDispatchWorkgroupsIndirectHandlerDescription)

	fun wgpuComputePassEncoderEnd(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePassEncoderEndHandler.invokeExact(handler) as Unit)
	}
	private val wgpuComputePassEncoderEndHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuComputePassEncoderEndHandlerAddress = findOrThrow("wgpuComputePassEncoderEnd")
	private val wgpuComputePassEncoderEndHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderEndHandlerAddress, wgpuComputePassEncoderEndHandlerDescription)

	fun wgpuComputePassEncoderSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePassEncoderSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuComputePassEncoderSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuComputePassEncoderSetLabelHandlerAddress = findOrThrow("wgpuComputePassEncoderSetLabel")
	private val wgpuComputePassEncoderSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderSetLabelHandlerAddress, wgpuComputePassEncoderSetLabelHandlerDescription)

	fun wgpuComputePipelineRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePipelineReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuComputePipelineReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuComputePipelineReleaseHandlerAddress = findOrThrow("wgpuComputePipelineRelease")
	private val wgpuComputePipelineReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuComputePipelineReleaseHandlerAddress, wgpuComputePipelineReleaseHandlerDescription)

	fun wgpuComputePipelineGetBindGroupLayout(handler: java.lang.foreign.MemorySegment, groupIndex: UInt): java.lang.foreign.MemorySegment {
		return (wgpuComputePipelineGetBindGroupLayoutHandler.invokeExact(handler, groupIndex.toInt()) as java.lang.foreign.MemorySegment)
	}
	private val wgpuComputePipelineGetBindGroupLayoutHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_INT
		)
	private val wgpuComputePipelineGetBindGroupLayoutHandlerAddress = findOrThrow("wgpuComputePipelineGetBindGroupLayout")
	private val wgpuComputePipelineGetBindGroupLayoutHandler = Linker.nativeLinker().downcallHandle(wgpuComputePipelineGetBindGroupLayoutHandlerAddress, wgpuComputePipelineGetBindGroupLayoutHandlerDescription)

	fun wgpuComputePipelineSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuComputePipelineSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuComputePipelineSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuComputePipelineSetLabelHandlerAddress = findOrThrow("wgpuComputePipelineSetLabel")
	private val wgpuComputePipelineSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuComputePipelineSetLabelHandlerAddress, wgpuComputePipelineSetLabelHandlerDescription)

	fun wgpuDeviceRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuDeviceReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuDeviceReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuDeviceReleaseHandlerAddress = findOrThrow("wgpuDeviceRelease")
	private val wgpuDeviceReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceReleaseHandlerAddress, wgpuDeviceReleaseHandlerDescription)

	fun wgpuDeviceCreateBindGroup(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateBindGroupHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateBindGroupHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateBindGroupHandlerAddress = findOrThrow("wgpuDeviceCreateBindGroup")
	private val wgpuDeviceCreateBindGroupHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateBindGroupHandlerAddress, wgpuDeviceCreateBindGroupHandlerDescription)

	fun wgpuDeviceCreateBindGroupLayout(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateBindGroupLayoutHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateBindGroupLayoutHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateBindGroupLayoutHandlerAddress = findOrThrow("wgpuDeviceCreateBindGroupLayout")
	private val wgpuDeviceCreateBindGroupLayoutHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateBindGroupLayoutHandlerAddress, wgpuDeviceCreateBindGroupLayoutHandlerDescription)

	fun wgpuDeviceCreateBuffer(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateBufferHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateBufferHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateBufferHandlerAddress = findOrThrow("wgpuDeviceCreateBuffer")
	private val wgpuDeviceCreateBufferHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateBufferHandlerAddress, wgpuDeviceCreateBufferHandlerDescription)

	fun wgpuDeviceCreateCommandEncoder(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateCommandEncoderHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateCommandEncoderHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateCommandEncoderHandlerAddress = findOrThrow("wgpuDeviceCreateCommandEncoder")
	private val wgpuDeviceCreateCommandEncoderHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateCommandEncoderHandlerAddress, wgpuDeviceCreateCommandEncoderHandlerDescription)

	fun wgpuDeviceCreateComputePipeline(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateComputePipelineHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateComputePipelineHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateComputePipelineHandlerAddress = findOrThrow("wgpuDeviceCreateComputePipeline")
	private val wgpuDeviceCreateComputePipelineHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateComputePipelineHandlerAddress, wgpuDeviceCreateComputePipelineHandlerDescription)

	fun wgpuDeviceCreateComputePipelineAsync(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment, callbackInfo: java.lang.foreign.MemorySegment): Unit {
		return (wgpuDeviceCreateComputePipelineAsyncHandler.invokeExact(handler, descriptor, callbackInfo) as Unit)
	}
	private val wgpuDeviceCreateComputePipelineAsyncHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			WGPUCreateComputePipelineAsyncCallbackInfo.LAYOUT
		)
	private val wgpuDeviceCreateComputePipelineAsyncHandlerAddress = findOrThrow("wgpuDeviceCreateComputePipelineAsync")
	private val wgpuDeviceCreateComputePipelineAsyncHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateComputePipelineAsyncHandlerAddress, wgpuDeviceCreateComputePipelineAsyncHandlerDescription)

	fun wgpuDeviceCreatePipelineLayout(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreatePipelineLayoutHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreatePipelineLayoutHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreatePipelineLayoutHandlerAddress = findOrThrow("wgpuDeviceCreatePipelineLayout")
	private val wgpuDeviceCreatePipelineLayoutHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreatePipelineLayoutHandlerAddress, wgpuDeviceCreatePipelineLayoutHandlerDescription)

	fun wgpuDeviceCreateQuerySet(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateQuerySetHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateQuerySetHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateQuerySetHandlerAddress = findOrThrow("wgpuDeviceCreateQuerySet")
	private val wgpuDeviceCreateQuerySetHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateQuerySetHandlerAddress, wgpuDeviceCreateQuerySetHandlerDescription)

	fun wgpuDeviceCreateRenderPipelineAsync(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment, callbackInfo: java.lang.foreign.MemorySegment): Unit {
		return (wgpuDeviceCreateRenderPipelineAsyncHandler.invokeExact(handler, descriptor, callbackInfo) as Unit)
	}
	private val wgpuDeviceCreateRenderPipelineAsyncHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			WGPUCreateRenderPipelineAsyncCallbackInfo.LAYOUT
		)
	private val wgpuDeviceCreateRenderPipelineAsyncHandlerAddress = findOrThrow("wgpuDeviceCreateRenderPipelineAsync")
	private val wgpuDeviceCreateRenderPipelineAsyncHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateRenderPipelineAsyncHandlerAddress, wgpuDeviceCreateRenderPipelineAsyncHandlerDescription)

	fun wgpuDeviceCreateRenderBundleEncoder(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateRenderBundleEncoderHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateRenderBundleEncoderHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateRenderBundleEncoderHandlerAddress = findOrThrow("wgpuDeviceCreateRenderBundleEncoder")
	private val wgpuDeviceCreateRenderBundleEncoderHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateRenderBundleEncoderHandlerAddress, wgpuDeviceCreateRenderBundleEncoderHandlerDescription)

	fun wgpuDeviceCreateRenderPipeline(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateRenderPipelineHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateRenderPipelineHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateRenderPipelineHandlerAddress = findOrThrow("wgpuDeviceCreateRenderPipeline")
	private val wgpuDeviceCreateRenderPipelineHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateRenderPipelineHandlerAddress, wgpuDeviceCreateRenderPipelineHandlerDescription)

	fun wgpuDeviceCreateSampler(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateSamplerHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateSamplerHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateSamplerHandlerAddress = findOrThrow("wgpuDeviceCreateSampler")
	private val wgpuDeviceCreateSamplerHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateSamplerHandlerAddress, wgpuDeviceCreateSamplerHandlerDescription)

	fun wgpuDeviceCreateShaderModule(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateShaderModuleHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateShaderModuleHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateShaderModuleHandlerAddress = findOrThrow("wgpuDeviceCreateShaderModule")
	private val wgpuDeviceCreateShaderModuleHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateShaderModuleHandlerAddress, wgpuDeviceCreateShaderModuleHandlerDescription)

	fun wgpuDeviceCreateTexture(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceCreateTextureHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceCreateTextureHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceCreateTextureHandlerAddress = findOrThrow("wgpuDeviceCreateTexture")
	private val wgpuDeviceCreateTextureHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceCreateTextureHandlerAddress, wgpuDeviceCreateTextureHandlerDescription)

	fun wgpuDeviceDestroy(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuDeviceDestroyHandler.invokeExact(handler) as Unit)
	}
	private val wgpuDeviceDestroyHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuDeviceDestroyHandlerAddress = findOrThrow("wgpuDeviceDestroy")
	private val wgpuDeviceDestroyHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceDestroyHandlerAddress, wgpuDeviceDestroyHandlerDescription)

	fun wgpuDeviceGetLostFuture(handler: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceGetLostFutureHandler.invokeExact(handler) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceGetLostFutureHandlerDescription = FunctionDescriptor.of(
			WGPUFuture.LAYOUT,
			C_POINTER
		)
	private val wgpuDeviceGetLostFutureHandlerAddress = findOrThrow("wgpuDeviceGetLostFuture")
	private val wgpuDeviceGetLostFutureHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceGetLostFutureHandlerAddress, wgpuDeviceGetLostFutureHandlerDescription)

	fun wgpuDeviceGetLimits(handler: java.lang.foreign.MemorySegment, limits: java.lang.foreign.MemorySegment): UInt {
		return (wgpuDeviceGetLimitsHandler.invokeExact(handler, limits) as Int).toUInt()
	}
	private val wgpuDeviceGetLimitsHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceGetLimitsHandlerAddress = findOrThrow("wgpuDeviceGetLimits")
	private val wgpuDeviceGetLimitsHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceGetLimitsHandlerAddress, wgpuDeviceGetLimitsHandlerDescription)

	fun wgpuDeviceHasFeature(handler: java.lang.foreign.MemorySegment, feature: UInt): UInt {
		return (wgpuDeviceHasFeatureHandler.invokeExact(handler, feature.toInt()) as Int).toUInt()
	}
	private val wgpuDeviceHasFeatureHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_INT
		)
	private val wgpuDeviceHasFeatureHandlerAddress = findOrThrow("wgpuDeviceHasFeature")
	private val wgpuDeviceHasFeatureHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceHasFeatureHandlerAddress, wgpuDeviceHasFeatureHandlerDescription)

	fun wgpuDeviceGetFeatures(handler: java.lang.foreign.MemorySegment, features: java.lang.foreign.MemorySegment): Unit {
		return (wgpuDeviceGetFeaturesHandler.invokeExact(handler, features) as Unit)
	}
	private val wgpuDeviceGetFeaturesHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceGetFeaturesHandlerAddress = findOrThrow("wgpuDeviceGetFeatures")
	private val wgpuDeviceGetFeaturesHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceGetFeaturesHandlerAddress, wgpuDeviceGetFeaturesHandlerDescription)

	fun wgpuDeviceGetAdapterInfo(handler: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceGetAdapterInfoHandler.invokeExact(handler) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceGetAdapterInfoHandlerDescription = FunctionDescriptor.of(
			WGPUAdapterInfo.LAYOUT,
			C_POINTER
		)
	private val wgpuDeviceGetAdapterInfoHandlerAddress = findOrThrow("wgpuDeviceGetAdapterInfo")
	private val wgpuDeviceGetAdapterInfoHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceGetAdapterInfoHandlerAddress, wgpuDeviceGetAdapterInfoHandlerDescription)

	fun wgpuDeviceGetQueue(handler: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuDeviceGetQueueHandler.invokeExact(handler) as java.lang.foreign.MemorySegment)
	}
	private val wgpuDeviceGetQueueHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER
		)
	private val wgpuDeviceGetQueueHandlerAddress = findOrThrow("wgpuDeviceGetQueue")
	private val wgpuDeviceGetQueueHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceGetQueueHandlerAddress, wgpuDeviceGetQueueHandlerDescription)

	fun wgpuDevicePushErrorScope(handler: java.lang.foreign.MemorySegment, filter: UInt): Unit {
		return (wgpuDevicePushErrorScopeHandler.invokeExact(handler, filter.toInt()) as Unit)
	}
	private val wgpuDevicePushErrorScopeHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT
		)
	private val wgpuDevicePushErrorScopeHandlerAddress = findOrThrow("wgpuDevicePushErrorScope")
	private val wgpuDevicePushErrorScopeHandler = Linker.nativeLinker().downcallHandle(wgpuDevicePushErrorScopeHandlerAddress, wgpuDevicePushErrorScopeHandlerDescription)

	fun wgpuDevicePopErrorScope(handler: java.lang.foreign.MemorySegment, callbackInfo: java.lang.foreign.MemorySegment): Unit {
		return (wgpuDevicePopErrorScopeHandler.invokeExact(handler, callbackInfo) as Unit)
	}
	private val wgpuDevicePopErrorScopeHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUPopErrorScopeCallbackInfo.LAYOUT
		)
	private val wgpuDevicePopErrorScopeHandlerAddress = findOrThrow("wgpuDevicePopErrorScope")
	private val wgpuDevicePopErrorScopeHandler = Linker.nativeLinker().downcallHandle(wgpuDevicePopErrorScopeHandlerAddress, wgpuDevicePopErrorScopeHandlerDescription)

	fun wgpuDeviceSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuDeviceSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuDeviceSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuDeviceSetLabelHandlerAddress = findOrThrow("wgpuDeviceSetLabel")
	private val wgpuDeviceSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuDeviceSetLabelHandlerAddress, wgpuDeviceSetLabelHandlerDescription)

	fun wgpuInstanceRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuInstanceReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuInstanceReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuInstanceReleaseHandlerAddress = findOrThrow("wgpuInstanceRelease")
	private val wgpuInstanceReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuInstanceReleaseHandlerAddress, wgpuInstanceReleaseHandlerDescription)

	fun wgpuInstanceCreateSurface(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuInstanceCreateSurfaceHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuInstanceCreateSurfaceHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuInstanceCreateSurfaceHandlerAddress = findOrThrow("wgpuInstanceCreateSurface")
	private val wgpuInstanceCreateSurfaceHandler = Linker.nativeLinker().downcallHandle(wgpuInstanceCreateSurfaceHandlerAddress, wgpuInstanceCreateSurfaceHandlerDescription)

	fun wgpuInstanceGetWGSLLanguageFeatures(handler: java.lang.foreign.MemorySegment, features: java.lang.foreign.MemorySegment): UInt {
		return (wgpuInstanceGetWGSLLanguageFeaturesHandler.invokeExact(handler, features) as Int).toUInt()
	}
	private val wgpuInstanceGetWGSLLanguageFeaturesHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_POINTER
		)
	private val wgpuInstanceGetWGSLLanguageFeaturesHandlerAddress = findOrThrow("wgpuInstanceGetWGSLLanguageFeatures")
	private val wgpuInstanceGetWGSLLanguageFeaturesHandler = Linker.nativeLinker().downcallHandle(wgpuInstanceGetWGSLLanguageFeaturesHandlerAddress, wgpuInstanceGetWGSLLanguageFeaturesHandlerDescription)

	fun wgpuInstanceHasWGSLLanguageFeature(handler: java.lang.foreign.MemorySegment, feature: UInt): UInt {
		return (wgpuInstanceHasWGSLLanguageFeatureHandler.invokeExact(handler, feature.toInt()) as Int).toUInt()
	}
	private val wgpuInstanceHasWGSLLanguageFeatureHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_INT
		)
	private val wgpuInstanceHasWGSLLanguageFeatureHandlerAddress = findOrThrow("wgpuInstanceHasWGSLLanguageFeature")
	private val wgpuInstanceHasWGSLLanguageFeatureHandler = Linker.nativeLinker().downcallHandle(wgpuInstanceHasWGSLLanguageFeatureHandlerAddress, wgpuInstanceHasWGSLLanguageFeatureHandlerDescription)

	fun wgpuInstanceProcessEvents(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuInstanceProcessEventsHandler.invokeExact(handler) as Unit)
	}
	private val wgpuInstanceProcessEventsHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuInstanceProcessEventsHandlerAddress = findOrThrow("wgpuInstanceProcessEvents")
	private val wgpuInstanceProcessEventsHandler = Linker.nativeLinker().downcallHandle(wgpuInstanceProcessEventsHandlerAddress, wgpuInstanceProcessEventsHandlerDescription)

	fun wgpuInstanceRequestAdapter(handler: java.lang.foreign.MemorySegment, options: java.lang.foreign.MemorySegment, callbackInfo: java.lang.foreign.MemorySegment): Unit {
		return (wgpuInstanceRequestAdapterHandler.invokeExact(handler, options, callbackInfo) as Unit)
	}
	private val wgpuInstanceRequestAdapterHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			WGPURequestAdapterCallbackInfo.LAYOUT
		)
	private val wgpuInstanceRequestAdapterHandlerAddress = findOrThrow("wgpuInstanceRequestAdapter")
	private val wgpuInstanceRequestAdapterHandler = Linker.nativeLinker().downcallHandle(wgpuInstanceRequestAdapterHandlerAddress, wgpuInstanceRequestAdapterHandlerDescription)

	fun wgpuInstanceWaitAny(handler: java.lang.foreign.MemorySegment, futureCount: ULong, futures: java.lang.foreign.MemorySegment, timeoutNS: ULong): UInt {
		return (wgpuInstanceWaitAnyHandler.invokeExact(handler, futureCount.toLong(), futures, timeoutNS.toLong()) as Int).toUInt()
	}
	private val wgpuInstanceWaitAnyHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_LONG,
			C_POINTER,
			C_LONG
		)
	private val wgpuInstanceWaitAnyHandlerAddress = findOrThrow("wgpuInstanceWaitAny")
	private val wgpuInstanceWaitAnyHandler = Linker.nativeLinker().downcallHandle(wgpuInstanceWaitAnyHandlerAddress, wgpuInstanceWaitAnyHandlerDescription)

	fun wgpuPipelineLayoutRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuPipelineLayoutReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuPipelineLayoutReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuPipelineLayoutReleaseHandlerAddress = findOrThrow("wgpuPipelineLayoutRelease")
	private val wgpuPipelineLayoutReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuPipelineLayoutReleaseHandlerAddress, wgpuPipelineLayoutReleaseHandlerDescription)

	fun wgpuPipelineLayoutSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuPipelineLayoutSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuPipelineLayoutSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuPipelineLayoutSetLabelHandlerAddress = findOrThrow("wgpuPipelineLayoutSetLabel")
	private val wgpuPipelineLayoutSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuPipelineLayoutSetLabelHandlerAddress, wgpuPipelineLayoutSetLabelHandlerDescription)

	fun wgpuQuerySetRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuQuerySetReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuQuerySetReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuQuerySetReleaseHandlerAddress = findOrThrow("wgpuQuerySetRelease")
	private val wgpuQuerySetReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuQuerySetReleaseHandlerAddress, wgpuQuerySetReleaseHandlerDescription)

	fun wgpuQuerySetSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuQuerySetSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuQuerySetSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuQuerySetSetLabelHandlerAddress = findOrThrow("wgpuQuerySetSetLabel")
	private val wgpuQuerySetSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuQuerySetSetLabelHandlerAddress, wgpuQuerySetSetLabelHandlerDescription)

	fun wgpuQuerySetGetType(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuQuerySetGetTypeHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuQuerySetGetTypeHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuQuerySetGetTypeHandlerAddress = findOrThrow("wgpuQuerySetGetType")
	private val wgpuQuerySetGetTypeHandler = Linker.nativeLinker().downcallHandle(wgpuQuerySetGetTypeHandlerAddress, wgpuQuerySetGetTypeHandlerDescription)

	fun wgpuQuerySetGetCount(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuQuerySetGetCountHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuQuerySetGetCountHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuQuerySetGetCountHandlerAddress = findOrThrow("wgpuQuerySetGetCount")
	private val wgpuQuerySetGetCountHandler = Linker.nativeLinker().downcallHandle(wgpuQuerySetGetCountHandlerAddress, wgpuQuerySetGetCountHandlerDescription)

	fun wgpuQuerySetDestroy(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuQuerySetDestroyHandler.invokeExact(handler) as Unit)
	}
	private val wgpuQuerySetDestroyHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuQuerySetDestroyHandlerAddress = findOrThrow("wgpuQuerySetDestroy")
	private val wgpuQuerySetDestroyHandler = Linker.nativeLinker().downcallHandle(wgpuQuerySetDestroyHandlerAddress, wgpuQuerySetDestroyHandlerDescription)

	fun wgpuQueueRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuQueueReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuQueueReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuQueueReleaseHandlerAddress = findOrThrow("wgpuQueueRelease")
	private val wgpuQueueReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuQueueReleaseHandlerAddress, wgpuQueueReleaseHandlerDescription)

	fun wgpuQueueSubmit(handler: java.lang.foreign.MemorySegment, commandCount: ULong, commands: java.lang.foreign.MemorySegment): Unit {
		return (wgpuQueueSubmitHandler.invokeExact(handler, commandCount.toLong(), commands) as Unit)
	}
	private val wgpuQueueSubmitHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_LONG,
			C_POINTER
		)
	private val wgpuQueueSubmitHandlerAddress = findOrThrow("wgpuQueueSubmit")
	private val wgpuQueueSubmitHandler = Linker.nativeLinker().downcallHandle(wgpuQueueSubmitHandlerAddress, wgpuQueueSubmitHandlerDescription)

	fun wgpuQueueOnSubmittedWorkDone(handler: java.lang.foreign.MemorySegment, callbackInfo: java.lang.foreign.MemorySegment): Unit {
		return (wgpuQueueOnSubmittedWorkDoneHandler.invokeExact(handler, callbackInfo) as Unit)
	}
	private val wgpuQueueOnSubmittedWorkDoneHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUQueueWorkDoneCallbackInfo.LAYOUT
		)
	private val wgpuQueueOnSubmittedWorkDoneHandlerAddress = findOrThrow("wgpuQueueOnSubmittedWorkDone")
	private val wgpuQueueOnSubmittedWorkDoneHandler = Linker.nativeLinker().downcallHandle(wgpuQueueOnSubmittedWorkDoneHandlerAddress, wgpuQueueOnSubmittedWorkDoneHandlerDescription)

	fun wgpuQueueWriteBuffer(handler: java.lang.foreign.MemorySegment, buffer: java.lang.foreign.MemorySegment, bufferOffset: ULong, data: java.lang.foreign.MemorySegment, size: ULong): Unit {
		return (wgpuQueueWriteBufferHandler.invokeExact(handler, buffer, bufferOffset.toLong(), data, size.toLong()) as Unit)
	}
	private val wgpuQueueWriteBufferHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_LONG,
			C_POINTER,
			C_LONG
		)
	private val wgpuQueueWriteBufferHandlerAddress = findOrThrow("wgpuQueueWriteBuffer")
	private val wgpuQueueWriteBufferHandler = Linker.nativeLinker().downcallHandle(wgpuQueueWriteBufferHandlerAddress, wgpuQueueWriteBufferHandlerDescription)

	fun wgpuQueueWriteTexture(handler: java.lang.foreign.MemorySegment, destination: java.lang.foreign.MemorySegment, data: java.lang.foreign.MemorySegment, dataSize: ULong, dataLayout: java.lang.foreign.MemorySegment, writeSize: java.lang.foreign.MemorySegment): Unit {
		return (wgpuQueueWriteTextureHandler.invokeExact(handler, destination, data, dataSize.toLong(), dataLayout, writeSize) as Unit)
	}
	private val wgpuQueueWriteTextureHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_POINTER,
			C_LONG,
			C_POINTER,
			C_POINTER
		)
	private val wgpuQueueWriteTextureHandlerAddress = findOrThrow("wgpuQueueWriteTexture")
	private val wgpuQueueWriteTextureHandler = Linker.nativeLinker().downcallHandle(wgpuQueueWriteTextureHandlerAddress, wgpuQueueWriteTextureHandlerDescription)

	fun wgpuQueueSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuQueueSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuQueueSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuQueueSetLabelHandlerAddress = findOrThrow("wgpuQueueSetLabel")
	private val wgpuQueueSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuQueueSetLabelHandlerAddress, wgpuQueueSetLabelHandlerDescription)

	fun wgpuRenderBundleRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderBundleReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuRenderBundleReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuRenderBundleReleaseHandlerAddress = findOrThrow("wgpuRenderBundleRelease")
	private val wgpuRenderBundleReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleReleaseHandlerAddress, wgpuRenderBundleReleaseHandlerDescription)

	fun wgpuRenderBundleSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderBundleSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuRenderBundleSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuRenderBundleSetLabelHandlerAddress = findOrThrow("wgpuRenderBundleSetLabel")
	private val wgpuRenderBundleSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleSetLabelHandlerAddress, wgpuRenderBundleSetLabelHandlerDescription)

	fun wgpuRenderBundleEncoderRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderBundleEncoderReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuRenderBundleEncoderReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuRenderBundleEncoderReleaseHandlerAddress = findOrThrow("wgpuRenderBundleEncoderRelease")
	private val wgpuRenderBundleEncoderReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderReleaseHandlerAddress, wgpuRenderBundleEncoderReleaseHandlerDescription)

	fun wgpuRenderBundleEncoderSetPipeline(handler: java.lang.foreign.MemorySegment, pipeline: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderBundleEncoderSetPipelineHandler.invokeExact(handler, pipeline) as Unit)
	}
	private val wgpuRenderBundleEncoderSetPipelineHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER
		)
	private val wgpuRenderBundleEncoderSetPipelineHandlerAddress = findOrThrow("wgpuRenderBundleEncoderSetPipeline")
	private val wgpuRenderBundleEncoderSetPipelineHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetPipelineHandlerAddress, wgpuRenderBundleEncoderSetPipelineHandlerDescription)

	fun wgpuRenderBundleEncoderSetBindGroup(handler: java.lang.foreign.MemorySegment, groupIndex: UInt, group: java.lang.foreign.MemorySegment, dynamicOffsetCount: ULong, dynamicOffsets: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderBundleEncoderSetBindGroupHandler.invokeExact(handler, groupIndex.toInt(), group, dynamicOffsetCount.toLong(), dynamicOffsets) as Unit)
	}
	private val wgpuRenderBundleEncoderSetBindGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_POINTER,
			C_LONG,
			C_POINTER
		)
	private val wgpuRenderBundleEncoderSetBindGroupHandlerAddress = findOrThrow("wgpuRenderBundleEncoderSetBindGroup")
	private val wgpuRenderBundleEncoderSetBindGroupHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetBindGroupHandlerAddress, wgpuRenderBundleEncoderSetBindGroupHandlerDescription)

	fun wgpuRenderBundleEncoderDraw(handler: java.lang.foreign.MemorySegment, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit {
		return (wgpuRenderBundleEncoderDrawHandler.invokeExact(handler, vertexCount.toInt(), instanceCount.toInt(), firstVertex.toInt(), firstInstance.toInt()) as Unit)
	}
	private val wgpuRenderBundleEncoderDrawHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_INT,
			C_INT,
			C_INT
		)
	private val wgpuRenderBundleEncoderDrawHandlerAddress = findOrThrow("wgpuRenderBundleEncoderDraw")
	private val wgpuRenderBundleEncoderDrawHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderDrawHandlerAddress, wgpuRenderBundleEncoderDrawHandlerDescription)

	fun wgpuRenderBundleEncoderDrawIndexed(handler: java.lang.foreign.MemorySegment, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit {
		return (wgpuRenderBundleEncoderDrawIndexedHandler.invokeExact(handler, indexCount.toInt(), instanceCount.toInt(), firstIndex.toInt(), baseVertex, firstInstance.toInt()) as Unit)
	}
	private val wgpuRenderBundleEncoderDrawIndexedHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_INT,
			C_INT,
			C_INT,
			C_INT
		)
	private val wgpuRenderBundleEncoderDrawIndexedHandlerAddress = findOrThrow("wgpuRenderBundleEncoderDrawIndexed")
	private val wgpuRenderBundleEncoderDrawIndexedHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderDrawIndexedHandlerAddress, wgpuRenderBundleEncoderDrawIndexedHandlerDescription)

	fun wgpuRenderBundleEncoderDrawIndirect(handler: java.lang.foreign.MemorySegment, indirectBuffer: java.lang.foreign.MemorySegment, indirectOffset: ULong): Unit {
		return (wgpuRenderBundleEncoderDrawIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)
	}
	private val wgpuRenderBundleEncoderDrawIndirectHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_LONG
		)
	private val wgpuRenderBundleEncoderDrawIndirectHandlerAddress = findOrThrow("wgpuRenderBundleEncoderDrawIndirect")
	private val wgpuRenderBundleEncoderDrawIndirectHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderDrawIndirectHandlerAddress, wgpuRenderBundleEncoderDrawIndirectHandlerDescription)

	fun wgpuRenderBundleEncoderDrawIndexedIndirect(handler: java.lang.foreign.MemorySegment, indirectBuffer: java.lang.foreign.MemorySegment, indirectOffset: ULong): Unit {
		return (wgpuRenderBundleEncoderDrawIndexedIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)
	}
	private val wgpuRenderBundleEncoderDrawIndexedIndirectHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_LONG
		)
	private val wgpuRenderBundleEncoderDrawIndexedIndirectHandlerAddress = findOrThrow("wgpuRenderBundleEncoderDrawIndexedIndirect")
	private val wgpuRenderBundleEncoderDrawIndexedIndirectHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderDrawIndexedIndirectHandlerAddress, wgpuRenderBundleEncoderDrawIndexedIndirectHandlerDescription)

	fun wgpuRenderBundleEncoderInsertDebugMarker(handler: java.lang.foreign.MemorySegment, markerLabel: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderBundleEncoderInsertDebugMarkerHandler.invokeExact(handler, markerLabel) as Unit)
	}
	private val wgpuRenderBundleEncoderInsertDebugMarkerHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuRenderBundleEncoderInsertDebugMarkerHandlerAddress = findOrThrow("wgpuRenderBundleEncoderInsertDebugMarker")
	private val wgpuRenderBundleEncoderInsertDebugMarkerHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderInsertDebugMarkerHandlerAddress, wgpuRenderBundleEncoderInsertDebugMarkerHandlerDescription)

	fun wgpuRenderBundleEncoderPopDebugGroup(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderBundleEncoderPopDebugGroupHandler.invokeExact(handler) as Unit)
	}
	private val wgpuRenderBundleEncoderPopDebugGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuRenderBundleEncoderPopDebugGroupHandlerAddress = findOrThrow("wgpuRenderBundleEncoderPopDebugGroup")
	private val wgpuRenderBundleEncoderPopDebugGroupHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderPopDebugGroupHandlerAddress, wgpuRenderBundleEncoderPopDebugGroupHandlerDescription)

	fun wgpuRenderBundleEncoderPushDebugGroup(handler: java.lang.foreign.MemorySegment, groupLabel: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderBundleEncoderPushDebugGroupHandler.invokeExact(handler, groupLabel) as Unit)
	}
	private val wgpuRenderBundleEncoderPushDebugGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuRenderBundleEncoderPushDebugGroupHandlerAddress = findOrThrow("wgpuRenderBundleEncoderPushDebugGroup")
	private val wgpuRenderBundleEncoderPushDebugGroupHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderPushDebugGroupHandlerAddress, wgpuRenderBundleEncoderPushDebugGroupHandlerDescription)

	fun wgpuRenderBundleEncoderSetVertexBuffer(handler: java.lang.foreign.MemorySegment, slot: UInt, buffer: java.lang.foreign.MemorySegment, offset: ULong, size: ULong): Unit {
		return (wgpuRenderBundleEncoderSetVertexBufferHandler.invokeExact(handler, slot.toInt(), buffer, offset.toLong(), size.toLong()) as Unit)
	}
	private val wgpuRenderBundleEncoderSetVertexBufferHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_POINTER,
			C_LONG,
			C_LONG
		)
	private val wgpuRenderBundleEncoderSetVertexBufferHandlerAddress = findOrThrow("wgpuRenderBundleEncoderSetVertexBuffer")
	private val wgpuRenderBundleEncoderSetVertexBufferHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetVertexBufferHandlerAddress, wgpuRenderBundleEncoderSetVertexBufferHandlerDescription)

	fun wgpuRenderBundleEncoderSetIndexBuffer(handler: java.lang.foreign.MemorySegment, buffer: java.lang.foreign.MemorySegment, format: UInt, offset: ULong, size: ULong): Unit {
		return (wgpuRenderBundleEncoderSetIndexBufferHandler.invokeExact(handler, buffer, format.toInt(), offset.toLong(), size.toLong()) as Unit)
	}
	private val wgpuRenderBundleEncoderSetIndexBufferHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_INT,
			C_LONG,
			C_LONG
		)
	private val wgpuRenderBundleEncoderSetIndexBufferHandlerAddress = findOrThrow("wgpuRenderBundleEncoderSetIndexBuffer")
	private val wgpuRenderBundleEncoderSetIndexBufferHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetIndexBufferHandlerAddress, wgpuRenderBundleEncoderSetIndexBufferHandlerDescription)

	fun wgpuRenderBundleEncoderFinish(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuRenderBundleEncoderFinishHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuRenderBundleEncoderFinishHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuRenderBundleEncoderFinishHandlerAddress = findOrThrow("wgpuRenderBundleEncoderFinish")
	private val wgpuRenderBundleEncoderFinishHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderFinishHandlerAddress, wgpuRenderBundleEncoderFinishHandlerDescription)

	fun wgpuRenderBundleEncoderSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderBundleEncoderSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuRenderBundleEncoderSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuRenderBundleEncoderSetLabelHandlerAddress = findOrThrow("wgpuRenderBundleEncoderSetLabel")
	private val wgpuRenderBundleEncoderSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetLabelHandlerAddress, wgpuRenderBundleEncoderSetLabelHandlerDescription)

	fun wgpuRenderPassEncoderRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuRenderPassEncoderReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuRenderPassEncoderReleaseHandlerAddress = findOrThrow("wgpuRenderPassEncoderRelease")
	private val wgpuRenderPassEncoderReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderReleaseHandlerAddress, wgpuRenderPassEncoderReleaseHandlerDescription)

	fun wgpuRenderPassEncoderSetPipeline(handler: java.lang.foreign.MemorySegment, pipeline: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderSetPipelineHandler.invokeExact(handler, pipeline) as Unit)
	}
	private val wgpuRenderPassEncoderSetPipelineHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER
		)
	private val wgpuRenderPassEncoderSetPipelineHandlerAddress = findOrThrow("wgpuRenderPassEncoderSetPipeline")
	private val wgpuRenderPassEncoderSetPipelineHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetPipelineHandlerAddress, wgpuRenderPassEncoderSetPipelineHandlerDescription)

	fun wgpuRenderPassEncoderSetBindGroup(handler: java.lang.foreign.MemorySegment, groupIndex: UInt, group: java.lang.foreign.MemorySegment, dynamicOffsetCount: ULong, dynamicOffsets: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderSetBindGroupHandler.invokeExact(handler, groupIndex.toInt(), group, dynamicOffsetCount.toLong(), dynamicOffsets) as Unit)
	}
	private val wgpuRenderPassEncoderSetBindGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_POINTER,
			C_LONG,
			C_POINTER
		)
	private val wgpuRenderPassEncoderSetBindGroupHandlerAddress = findOrThrow("wgpuRenderPassEncoderSetBindGroup")
	private val wgpuRenderPassEncoderSetBindGroupHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetBindGroupHandlerAddress, wgpuRenderPassEncoderSetBindGroupHandlerDescription)

	fun wgpuRenderPassEncoderDraw(handler: java.lang.foreign.MemorySegment, vertexCount: UInt, instanceCount: UInt, firstVertex: UInt, firstInstance: UInt): Unit {
		return (wgpuRenderPassEncoderDrawHandler.invokeExact(handler, vertexCount.toInt(), instanceCount.toInt(), firstVertex.toInt(), firstInstance.toInt()) as Unit)
	}
	private val wgpuRenderPassEncoderDrawHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_INT,
			C_INT,
			C_INT
		)
	private val wgpuRenderPassEncoderDrawHandlerAddress = findOrThrow("wgpuRenderPassEncoderDraw")
	private val wgpuRenderPassEncoderDrawHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderDrawHandlerAddress, wgpuRenderPassEncoderDrawHandlerDescription)

	fun wgpuRenderPassEncoderDrawIndexed(handler: java.lang.foreign.MemorySegment, indexCount: UInt, instanceCount: UInt, firstIndex: UInt, baseVertex: Int, firstInstance: UInt): Unit {
		return (wgpuRenderPassEncoderDrawIndexedHandler.invokeExact(handler, indexCount.toInt(), instanceCount.toInt(), firstIndex.toInt(), baseVertex, firstInstance.toInt()) as Unit)
	}
	private val wgpuRenderPassEncoderDrawIndexedHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_INT,
			C_INT,
			C_INT,
			C_INT
		)
	private val wgpuRenderPassEncoderDrawIndexedHandlerAddress = findOrThrow("wgpuRenderPassEncoderDrawIndexed")
	private val wgpuRenderPassEncoderDrawIndexedHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderDrawIndexedHandlerAddress, wgpuRenderPassEncoderDrawIndexedHandlerDescription)

	fun wgpuRenderPassEncoderDrawIndirect(handler: java.lang.foreign.MemorySegment, indirectBuffer: java.lang.foreign.MemorySegment, indirectOffset: ULong): Unit {
		return (wgpuRenderPassEncoderDrawIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)
	}
	private val wgpuRenderPassEncoderDrawIndirectHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_LONG
		)
	private val wgpuRenderPassEncoderDrawIndirectHandlerAddress = findOrThrow("wgpuRenderPassEncoderDrawIndirect")
	private val wgpuRenderPassEncoderDrawIndirectHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderDrawIndirectHandlerAddress, wgpuRenderPassEncoderDrawIndirectHandlerDescription)

	fun wgpuRenderPassEncoderDrawIndexedIndirect(handler: java.lang.foreign.MemorySegment, indirectBuffer: java.lang.foreign.MemorySegment, indirectOffset: ULong): Unit {
		return (wgpuRenderPassEncoderDrawIndexedIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)
	}
	private val wgpuRenderPassEncoderDrawIndexedIndirectHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_LONG
		)
	private val wgpuRenderPassEncoderDrawIndexedIndirectHandlerAddress = findOrThrow("wgpuRenderPassEncoderDrawIndexedIndirect")
	private val wgpuRenderPassEncoderDrawIndexedIndirectHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderDrawIndexedIndirectHandlerAddress, wgpuRenderPassEncoderDrawIndexedIndirectHandlerDescription)

	fun wgpuRenderPassEncoderExecuteBundles(handler: java.lang.foreign.MemorySegment, bundleCount: ULong, bundles: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderExecuteBundlesHandler.invokeExact(handler, bundleCount.toLong(), bundles) as Unit)
	}
	private val wgpuRenderPassEncoderExecuteBundlesHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_LONG,
			C_POINTER
		)
	private val wgpuRenderPassEncoderExecuteBundlesHandlerAddress = findOrThrow("wgpuRenderPassEncoderExecuteBundles")
	private val wgpuRenderPassEncoderExecuteBundlesHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderExecuteBundlesHandlerAddress, wgpuRenderPassEncoderExecuteBundlesHandlerDescription)

	fun wgpuRenderPassEncoderInsertDebugMarker(handler: java.lang.foreign.MemorySegment, markerLabel: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderInsertDebugMarkerHandler.invokeExact(handler, markerLabel) as Unit)
	}
	private val wgpuRenderPassEncoderInsertDebugMarkerHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuRenderPassEncoderInsertDebugMarkerHandlerAddress = findOrThrow("wgpuRenderPassEncoderInsertDebugMarker")
	private val wgpuRenderPassEncoderInsertDebugMarkerHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderInsertDebugMarkerHandlerAddress, wgpuRenderPassEncoderInsertDebugMarkerHandlerDescription)

	fun wgpuRenderPassEncoderPopDebugGroup(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderPopDebugGroupHandler.invokeExact(handler) as Unit)
	}
	private val wgpuRenderPassEncoderPopDebugGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuRenderPassEncoderPopDebugGroupHandlerAddress = findOrThrow("wgpuRenderPassEncoderPopDebugGroup")
	private val wgpuRenderPassEncoderPopDebugGroupHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderPopDebugGroupHandlerAddress, wgpuRenderPassEncoderPopDebugGroupHandlerDescription)

	fun wgpuRenderPassEncoderPushDebugGroup(handler: java.lang.foreign.MemorySegment, groupLabel: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderPushDebugGroupHandler.invokeExact(handler, groupLabel) as Unit)
	}
	private val wgpuRenderPassEncoderPushDebugGroupHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuRenderPassEncoderPushDebugGroupHandlerAddress = findOrThrow("wgpuRenderPassEncoderPushDebugGroup")
	private val wgpuRenderPassEncoderPushDebugGroupHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderPushDebugGroupHandlerAddress, wgpuRenderPassEncoderPushDebugGroupHandlerDescription)

	fun wgpuRenderPassEncoderSetStencilReference(handler: java.lang.foreign.MemorySegment, reference: UInt): Unit {
		return (wgpuRenderPassEncoderSetStencilReferenceHandler.invokeExact(handler, reference.toInt()) as Unit)
	}
	private val wgpuRenderPassEncoderSetStencilReferenceHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT
		)
	private val wgpuRenderPassEncoderSetStencilReferenceHandlerAddress = findOrThrow("wgpuRenderPassEncoderSetStencilReference")
	private val wgpuRenderPassEncoderSetStencilReferenceHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetStencilReferenceHandlerAddress, wgpuRenderPassEncoderSetStencilReferenceHandlerDescription)

	fun wgpuRenderPassEncoderSetBlendConstant(handler: java.lang.foreign.MemorySegment, color: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderSetBlendConstantHandler.invokeExact(handler, color) as Unit)
	}
	private val wgpuRenderPassEncoderSetBlendConstantHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER
		)
	private val wgpuRenderPassEncoderSetBlendConstantHandlerAddress = findOrThrow("wgpuRenderPassEncoderSetBlendConstant")
	private val wgpuRenderPassEncoderSetBlendConstantHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetBlendConstantHandlerAddress, wgpuRenderPassEncoderSetBlendConstantHandlerDescription)

	fun wgpuRenderPassEncoderSetViewport(handler: java.lang.foreign.MemorySegment, x: Float, y: Float, width: Float, height: Float, minDepth: Float, maxDepth: Float): Unit {
		return (wgpuRenderPassEncoderSetViewportHandler.invokeExact(handler, x, y, width, height, minDepth, maxDepth) as Unit)
	}
	private val wgpuRenderPassEncoderSetViewportHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_FLOAT,
			C_FLOAT,
			C_FLOAT,
			C_FLOAT,
			C_FLOAT,
			C_FLOAT
		)
	private val wgpuRenderPassEncoderSetViewportHandlerAddress = findOrThrow("wgpuRenderPassEncoderSetViewport")
	private val wgpuRenderPassEncoderSetViewportHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetViewportHandlerAddress, wgpuRenderPassEncoderSetViewportHandlerDescription)

	fun wgpuRenderPassEncoderSetScissorRect(handler: java.lang.foreign.MemorySegment, x: UInt, y: UInt, width: UInt, height: UInt): Unit {
		return (wgpuRenderPassEncoderSetScissorRectHandler.invokeExact(handler, x.toInt(), y.toInt(), width.toInt(), height.toInt()) as Unit)
	}
	private val wgpuRenderPassEncoderSetScissorRectHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_INT,
			C_INT,
			C_INT
		)
	private val wgpuRenderPassEncoderSetScissorRectHandlerAddress = findOrThrow("wgpuRenderPassEncoderSetScissorRect")
	private val wgpuRenderPassEncoderSetScissorRectHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetScissorRectHandlerAddress, wgpuRenderPassEncoderSetScissorRectHandlerDescription)

	fun wgpuRenderPassEncoderSetVertexBuffer(handler: java.lang.foreign.MemorySegment, slot: UInt, buffer: java.lang.foreign.MemorySegment, offset: ULong, size: ULong): Unit {
		return (wgpuRenderPassEncoderSetVertexBufferHandler.invokeExact(handler, slot.toInt(), buffer, offset.toLong(), size.toLong()) as Unit)
	}
	private val wgpuRenderPassEncoderSetVertexBufferHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT,
			C_POINTER,
			C_LONG,
			C_LONG
		)
	private val wgpuRenderPassEncoderSetVertexBufferHandlerAddress = findOrThrow("wgpuRenderPassEncoderSetVertexBuffer")
	private val wgpuRenderPassEncoderSetVertexBufferHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetVertexBufferHandlerAddress, wgpuRenderPassEncoderSetVertexBufferHandlerDescription)

	fun wgpuRenderPassEncoderSetIndexBuffer(handler: java.lang.foreign.MemorySegment, buffer: java.lang.foreign.MemorySegment, format: UInt, offset: ULong, size: ULong): Unit {
		return (wgpuRenderPassEncoderSetIndexBufferHandler.invokeExact(handler, buffer, format.toInt(), offset.toLong(), size.toLong()) as Unit)
	}
	private val wgpuRenderPassEncoderSetIndexBufferHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER,
			C_INT,
			C_LONG,
			C_LONG
		)
	private val wgpuRenderPassEncoderSetIndexBufferHandlerAddress = findOrThrow("wgpuRenderPassEncoderSetIndexBuffer")
	private val wgpuRenderPassEncoderSetIndexBufferHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetIndexBufferHandlerAddress, wgpuRenderPassEncoderSetIndexBufferHandlerDescription)

	fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: java.lang.foreign.MemorySegment, queryIndex: UInt): Unit {
		return (wgpuRenderPassEncoderBeginOcclusionQueryHandler.invokeExact(handler, queryIndex.toInt()) as Unit)
	}
	private val wgpuRenderPassEncoderBeginOcclusionQueryHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_INT
		)
	private val wgpuRenderPassEncoderBeginOcclusionQueryHandlerAddress = findOrThrow("wgpuRenderPassEncoderBeginOcclusionQuery")
	private val wgpuRenderPassEncoderBeginOcclusionQueryHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderBeginOcclusionQueryHandlerAddress, wgpuRenderPassEncoderBeginOcclusionQueryHandlerDescription)

	fun wgpuRenderPassEncoderEndOcclusionQuery(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderEndOcclusionQueryHandler.invokeExact(handler) as Unit)
	}
	private val wgpuRenderPassEncoderEndOcclusionQueryHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuRenderPassEncoderEndOcclusionQueryHandlerAddress = findOrThrow("wgpuRenderPassEncoderEndOcclusionQuery")
	private val wgpuRenderPassEncoderEndOcclusionQueryHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderEndOcclusionQueryHandlerAddress, wgpuRenderPassEncoderEndOcclusionQueryHandlerDescription)

	fun wgpuRenderPassEncoderEnd(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderEndHandler.invokeExact(handler) as Unit)
	}
	private val wgpuRenderPassEncoderEndHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuRenderPassEncoderEndHandlerAddress = findOrThrow("wgpuRenderPassEncoderEnd")
	private val wgpuRenderPassEncoderEndHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderEndHandlerAddress, wgpuRenderPassEncoderEndHandlerDescription)

	fun wgpuRenderPassEncoderSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPassEncoderSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuRenderPassEncoderSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuRenderPassEncoderSetLabelHandlerAddress = findOrThrow("wgpuRenderPassEncoderSetLabel")
	private val wgpuRenderPassEncoderSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetLabelHandlerAddress, wgpuRenderPassEncoderSetLabelHandlerDescription)

	fun wgpuRenderPipelineRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPipelineReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuRenderPipelineReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuRenderPipelineReleaseHandlerAddress = findOrThrow("wgpuRenderPipelineRelease")
	private val wgpuRenderPipelineReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPipelineReleaseHandlerAddress, wgpuRenderPipelineReleaseHandlerDescription)

	fun wgpuRenderPipelineGetBindGroupLayout(handler: java.lang.foreign.MemorySegment, groupIndex: UInt): java.lang.foreign.MemorySegment {
		return (wgpuRenderPipelineGetBindGroupLayoutHandler.invokeExact(handler, groupIndex.toInt()) as java.lang.foreign.MemorySegment)
	}
	private val wgpuRenderPipelineGetBindGroupLayoutHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_INT
		)
	private val wgpuRenderPipelineGetBindGroupLayoutHandlerAddress = findOrThrow("wgpuRenderPipelineGetBindGroupLayout")
	private val wgpuRenderPipelineGetBindGroupLayoutHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPipelineGetBindGroupLayoutHandlerAddress, wgpuRenderPipelineGetBindGroupLayoutHandlerDescription)

	fun wgpuRenderPipelineSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuRenderPipelineSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuRenderPipelineSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuRenderPipelineSetLabelHandlerAddress = findOrThrow("wgpuRenderPipelineSetLabel")
	private val wgpuRenderPipelineSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuRenderPipelineSetLabelHandlerAddress, wgpuRenderPipelineSetLabelHandlerDescription)

	fun wgpuSamplerRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuSamplerReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuSamplerReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuSamplerReleaseHandlerAddress = findOrThrow("wgpuSamplerRelease")
	private val wgpuSamplerReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuSamplerReleaseHandlerAddress, wgpuSamplerReleaseHandlerDescription)

	fun wgpuSamplerSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuSamplerSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuSamplerSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuSamplerSetLabelHandlerAddress = findOrThrow("wgpuSamplerSetLabel")
	private val wgpuSamplerSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuSamplerSetLabelHandlerAddress, wgpuSamplerSetLabelHandlerDescription)

	fun wgpuShaderModuleRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuShaderModuleReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuShaderModuleReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuShaderModuleReleaseHandlerAddress = findOrThrow("wgpuShaderModuleRelease")
	private val wgpuShaderModuleReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuShaderModuleReleaseHandlerAddress, wgpuShaderModuleReleaseHandlerDescription)

	fun wgpuShaderModuleGetCompilationInfo(handler: java.lang.foreign.MemorySegment, callbackInfo: java.lang.foreign.MemorySegment): Unit {
		return (wgpuShaderModuleGetCompilationInfoHandler.invokeExact(handler, callbackInfo) as Unit)
	}
	private val wgpuShaderModuleGetCompilationInfoHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUCompilationInfoCallbackInfo.LAYOUT
		)
	private val wgpuShaderModuleGetCompilationInfoHandlerAddress = findOrThrow("wgpuShaderModuleGetCompilationInfo")
	private val wgpuShaderModuleGetCompilationInfoHandler = Linker.nativeLinker().downcallHandle(wgpuShaderModuleGetCompilationInfoHandlerAddress, wgpuShaderModuleGetCompilationInfoHandlerDescription)

	fun wgpuShaderModuleSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuShaderModuleSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuShaderModuleSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuShaderModuleSetLabelHandlerAddress = findOrThrow("wgpuShaderModuleSetLabel")
	private val wgpuShaderModuleSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuShaderModuleSetLabelHandlerAddress, wgpuShaderModuleSetLabelHandlerDescription)

	fun wgpuSurfaceRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuSurfaceReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuSurfaceReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuSurfaceReleaseHandlerAddress = findOrThrow("wgpuSurfaceRelease")
	private val wgpuSurfaceReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuSurfaceReleaseHandlerAddress, wgpuSurfaceReleaseHandlerDescription)

	fun wgpuSurfaceConfigure(handler: java.lang.foreign.MemorySegment, config: java.lang.foreign.MemorySegment): Unit {
		return (wgpuSurfaceConfigureHandler.invokeExact(handler, config) as Unit)
	}
	private val wgpuSurfaceConfigureHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER
		)
	private val wgpuSurfaceConfigureHandlerAddress = findOrThrow("wgpuSurfaceConfigure")
	private val wgpuSurfaceConfigureHandler = Linker.nativeLinker().downcallHandle(wgpuSurfaceConfigureHandlerAddress, wgpuSurfaceConfigureHandlerDescription)

	fun wgpuSurfaceGetCapabilities(handler: java.lang.foreign.MemorySegment, adapter: java.lang.foreign.MemorySegment, capabilities: java.lang.foreign.MemorySegment): UInt {
		return (wgpuSurfaceGetCapabilitiesHandler.invokeExact(handler, adapter, capabilities) as Int).toUInt()
	}
	private val wgpuSurfaceGetCapabilitiesHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuSurfaceGetCapabilitiesHandlerAddress = findOrThrow("wgpuSurfaceGetCapabilities")
	private val wgpuSurfaceGetCapabilitiesHandler = Linker.nativeLinker().downcallHandle(wgpuSurfaceGetCapabilitiesHandlerAddress, wgpuSurfaceGetCapabilitiesHandlerDescription)

	fun wgpuSurfaceGetCurrentTexture(handler: java.lang.foreign.MemorySegment, surfaceTexture: java.lang.foreign.MemorySegment): Unit {
		return (wgpuSurfaceGetCurrentTextureHandler.invokeExact(handler, surfaceTexture) as Unit)
	}
	private val wgpuSurfaceGetCurrentTextureHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			C_POINTER
		)
	private val wgpuSurfaceGetCurrentTextureHandlerAddress = findOrThrow("wgpuSurfaceGetCurrentTexture")
	private val wgpuSurfaceGetCurrentTextureHandler = Linker.nativeLinker().downcallHandle(wgpuSurfaceGetCurrentTextureHandlerAddress, wgpuSurfaceGetCurrentTextureHandlerDescription)

	fun wgpuSurfacePresent(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuSurfacePresentHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuSurfacePresentHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuSurfacePresentHandlerAddress = findOrThrow("wgpuSurfacePresent")
	private val wgpuSurfacePresentHandler = Linker.nativeLinker().downcallHandle(wgpuSurfacePresentHandlerAddress, wgpuSurfacePresentHandlerDescription)

	fun wgpuSurfaceUnconfigure(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuSurfaceUnconfigureHandler.invokeExact(handler) as Unit)
	}
	private val wgpuSurfaceUnconfigureHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuSurfaceUnconfigureHandlerAddress = findOrThrow("wgpuSurfaceUnconfigure")
	private val wgpuSurfaceUnconfigureHandler = Linker.nativeLinker().downcallHandle(wgpuSurfaceUnconfigureHandlerAddress, wgpuSurfaceUnconfigureHandlerDescription)

	fun wgpuSurfaceSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuSurfaceSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuSurfaceSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuSurfaceSetLabelHandlerAddress = findOrThrow("wgpuSurfaceSetLabel")
	private val wgpuSurfaceSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuSurfaceSetLabelHandlerAddress, wgpuSurfaceSetLabelHandlerDescription)

	fun wgpuTextureRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuTextureReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuTextureReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuTextureReleaseHandlerAddress = findOrThrow("wgpuTextureRelease")
	private val wgpuTextureReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuTextureReleaseHandlerAddress, wgpuTextureReleaseHandlerDescription)

	fun wgpuTextureCreateView(handler: java.lang.foreign.MemorySegment, descriptor: java.lang.foreign.MemorySegment): java.lang.foreign.MemorySegment {
		return (wgpuTextureCreateViewHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)
	}
	private val wgpuTextureCreateViewHandlerDescription = FunctionDescriptor.of(
			C_POINTER,
			C_POINTER,
			C_POINTER
		)
	private val wgpuTextureCreateViewHandlerAddress = findOrThrow("wgpuTextureCreateView")
	private val wgpuTextureCreateViewHandler = Linker.nativeLinker().downcallHandle(wgpuTextureCreateViewHandlerAddress, wgpuTextureCreateViewHandlerDescription)

	fun wgpuTextureSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuTextureSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuTextureSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuTextureSetLabelHandlerAddress = findOrThrow("wgpuTextureSetLabel")
	private val wgpuTextureSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuTextureSetLabelHandlerAddress, wgpuTextureSetLabelHandlerDescription)

	fun wgpuTextureGetWidth(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuTextureGetWidthHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuTextureGetWidthHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuTextureGetWidthHandlerAddress = findOrThrow("wgpuTextureGetWidth")
	private val wgpuTextureGetWidthHandler = Linker.nativeLinker().downcallHandle(wgpuTextureGetWidthHandlerAddress, wgpuTextureGetWidthHandlerDescription)

	fun wgpuTextureGetHeight(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuTextureGetHeightHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuTextureGetHeightHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuTextureGetHeightHandlerAddress = findOrThrow("wgpuTextureGetHeight")
	private val wgpuTextureGetHeightHandler = Linker.nativeLinker().downcallHandle(wgpuTextureGetHeightHandlerAddress, wgpuTextureGetHeightHandlerDescription)

	fun wgpuTextureGetDepthOrArrayLayers(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuTextureGetDepthOrArrayLayersHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuTextureGetDepthOrArrayLayersHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuTextureGetDepthOrArrayLayersHandlerAddress = findOrThrow("wgpuTextureGetDepthOrArrayLayers")
	private val wgpuTextureGetDepthOrArrayLayersHandler = Linker.nativeLinker().downcallHandle(wgpuTextureGetDepthOrArrayLayersHandlerAddress, wgpuTextureGetDepthOrArrayLayersHandlerDescription)

	fun wgpuTextureGetMipLevelCount(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuTextureGetMipLevelCountHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuTextureGetMipLevelCountHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuTextureGetMipLevelCountHandlerAddress = findOrThrow("wgpuTextureGetMipLevelCount")
	private val wgpuTextureGetMipLevelCountHandler = Linker.nativeLinker().downcallHandle(wgpuTextureGetMipLevelCountHandlerAddress, wgpuTextureGetMipLevelCountHandlerDescription)

	fun wgpuTextureGetSampleCount(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuTextureGetSampleCountHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuTextureGetSampleCountHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuTextureGetSampleCountHandlerAddress = findOrThrow("wgpuTextureGetSampleCount")
	private val wgpuTextureGetSampleCountHandler = Linker.nativeLinker().downcallHandle(wgpuTextureGetSampleCountHandlerAddress, wgpuTextureGetSampleCountHandlerDescription)

	fun wgpuTextureGetDimension(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuTextureGetDimensionHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuTextureGetDimensionHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuTextureGetDimensionHandlerAddress = findOrThrow("wgpuTextureGetDimension")
	private val wgpuTextureGetDimensionHandler = Linker.nativeLinker().downcallHandle(wgpuTextureGetDimensionHandlerAddress, wgpuTextureGetDimensionHandlerDescription)

	fun wgpuTextureGetFormat(handler: java.lang.foreign.MemorySegment): UInt {
		return (wgpuTextureGetFormatHandler.invokeExact(handler) as Int).toUInt()
	}
	private val wgpuTextureGetFormatHandlerDescription = FunctionDescriptor.of(
			C_INT,
			C_POINTER
		)
	private val wgpuTextureGetFormatHandlerAddress = findOrThrow("wgpuTextureGetFormat")
	private val wgpuTextureGetFormatHandler = Linker.nativeLinker().downcallHandle(wgpuTextureGetFormatHandlerAddress, wgpuTextureGetFormatHandlerDescription)

	fun wgpuTextureGetUsage(handler: java.lang.foreign.MemorySegment): ULong {
		return (wgpuTextureGetUsageHandler.invokeExact(handler) as Long).toULong()
	}
	private val wgpuTextureGetUsageHandlerDescription = FunctionDescriptor.of(
			C_LONG,
			C_POINTER
		)
	private val wgpuTextureGetUsageHandlerAddress = findOrThrow("wgpuTextureGetUsage")
	private val wgpuTextureGetUsageHandler = Linker.nativeLinker().downcallHandle(wgpuTextureGetUsageHandlerAddress, wgpuTextureGetUsageHandlerDescription)

	fun wgpuTextureDestroy(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuTextureDestroyHandler.invokeExact(handler) as Unit)
	}
	private val wgpuTextureDestroyHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuTextureDestroyHandlerAddress = findOrThrow("wgpuTextureDestroy")
	private val wgpuTextureDestroyHandler = Linker.nativeLinker().downcallHandle(wgpuTextureDestroyHandlerAddress, wgpuTextureDestroyHandlerDescription)

	fun wgpuTextureViewRelease(handler: java.lang.foreign.MemorySegment): Unit {
		return (wgpuTextureViewReleaseHandler.invokeExact(handler) as Unit)
	}
	private val wgpuTextureViewReleaseHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER
		)
	private val wgpuTextureViewReleaseHandlerAddress = findOrThrow("wgpuTextureViewRelease")
	private val wgpuTextureViewReleaseHandler = Linker.nativeLinker().downcallHandle(wgpuTextureViewReleaseHandlerAddress, wgpuTextureViewReleaseHandlerDescription)

	fun wgpuTextureViewSetLabel(handler: java.lang.foreign.MemorySegment, label: java.lang.foreign.MemorySegment): Unit {
		return (wgpuTextureViewSetLabelHandler.invokeExact(handler, label) as Unit)
	}
	private val wgpuTextureViewSetLabelHandlerDescription = FunctionDescriptor.ofVoid(
			C_POINTER,
			WGPUStringView.LAYOUT
		)
	private val wgpuTextureViewSetLabelHandlerAddress = findOrThrow("wgpuTextureViewSetLabel")
	private val wgpuTextureViewSetLabelHandler = Linker.nativeLinker().downcallHandle(wgpuTextureViewSetLabelHandlerAddress, wgpuTextureViewSetLabelHandlerDescription)

}
