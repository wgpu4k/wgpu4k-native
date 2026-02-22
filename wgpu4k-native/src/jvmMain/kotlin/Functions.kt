// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.C_BYTE
import ffi.C_DOUBLE
import ffi.C_FLOAT
import ffi.C_INT
import ffi.C_LONG
import ffi.C_POINTER
import ffi.C_SHORT
import ffi.findOrThrow
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemorySegment
import java.lang.invoke.MethodHandle
import kotlin.Float
import kotlin.Int
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

public object Functions {
	private val wgpuCreateInstanceHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_POINTER,
						C_POINTER
					)

	private val wgpuCreateInstanceHandlerAddress: MemorySegment = findOrThrow("wgpuCreateInstance")

	private val wgpuCreateInstanceHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCreateInstanceHandlerAddress, wgpuCreateInstanceHandlerDescription)

	private val wgpuGetInstanceCapabilitiesHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuGetInstanceCapabilitiesHandlerAddress: MemorySegment =
			findOrThrow("wgpuGetInstanceCapabilities")

	private val wgpuGetInstanceCapabilitiesHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuGetInstanceCapabilitiesHandlerAddress, wgpuGetInstanceCapabilitiesHandlerDescription)

	private val wgpuDevicePollHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_INT,
						C_POINTER
					)

	private val wgpuDevicePollHandlerAddress: MemorySegment = findOrThrow("wgpuDevicePoll")

	private val wgpuDevicePollHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDevicePollHandlerAddress, wgpuDevicePollHandlerDescription)

	private val wgpuSetLogCallbackHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER
					)

	private val wgpuSetLogCallbackHandlerAddress: MemorySegment = findOrThrow("wgpuSetLogCallback")

	private val wgpuSetLogCallbackHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSetLogCallbackHandlerAddress, wgpuSetLogCallbackHandlerDescription)

	private val wgpuSetLogLevelHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_INT
					)

	private val wgpuSetLogLevelHandlerAddress: MemorySegment = findOrThrow("wgpuSetLogLevel")

	private val wgpuSetLogLevelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSetLogLevelHandlerAddress, wgpuSetLogLevelHandlerDescription)

	private val wgpuAdapterReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuAdapterReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuAdapterRelease")

	private val wgpuAdapterReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuAdapterReleaseHandlerAddress, wgpuAdapterReleaseHandlerDescription)

	private val wgpuAdapterGetLimitsHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_POINTER
					)

	private val wgpuAdapterGetLimitsHandlerAddress: MemorySegment = findOrThrow("wgpuAdapterGetLimits")

	private val wgpuAdapterGetLimitsHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuAdapterGetLimitsHandlerAddress, wgpuAdapterGetLimitsHandlerDescription)

	private val wgpuAdapterHasFeatureHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_INT
					)

	private val wgpuAdapterHasFeatureHandlerAddress: MemorySegment =
			findOrThrow("wgpuAdapterHasFeature")

	private val wgpuAdapterHasFeatureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuAdapterHasFeatureHandlerAddress, wgpuAdapterHasFeatureHandlerDescription)

	private val wgpuAdapterGetFeaturesHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER
					)

	private val wgpuAdapterGetFeaturesHandlerAddress: MemorySegment =
			findOrThrow("wgpuAdapterGetFeatures")

	private val wgpuAdapterGetFeaturesHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuAdapterGetFeaturesHandlerAddress, wgpuAdapterGetFeaturesHandlerDescription)

	private val wgpuAdapterGetInfoHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_POINTER
					)

	private val wgpuAdapterGetInfoHandlerAddress: MemorySegment = findOrThrow("wgpuAdapterGetInfo")

	private val wgpuAdapterGetInfoHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuAdapterGetInfoHandlerAddress, wgpuAdapterGetInfoHandlerDescription)

	private val wgpuAdapterRequestDeviceHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						WGPURequestDeviceCallbackInfo.LAYOUT
					)

	private val wgpuAdapterRequestDeviceHandlerAddress: MemorySegment =
			findOrThrow("wgpuAdapterRequestDevice")

	private val wgpuAdapterRequestDeviceHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuAdapterRequestDeviceHandlerAddress, wgpuAdapterRequestDeviceHandlerDescription)

	private val wgpuBindGroupReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuBindGroupReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuBindGroupRelease")

	private val wgpuBindGroupReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBindGroupReleaseHandlerAddress, wgpuBindGroupReleaseHandlerDescription)

	private val wgpuBindGroupSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuBindGroupSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuBindGroupSetLabel")

	private val wgpuBindGroupSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBindGroupSetLabelHandlerAddress, wgpuBindGroupSetLabelHandlerDescription)

	private val wgpuBindGroupLayoutReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuBindGroupLayoutReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuBindGroupLayoutRelease")

	private val wgpuBindGroupLayoutReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBindGroupLayoutReleaseHandlerAddress, wgpuBindGroupLayoutReleaseHandlerDescription)

	private val wgpuBindGroupLayoutSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuBindGroupLayoutSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuBindGroupLayoutSetLabel")

	private val wgpuBindGroupLayoutSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBindGroupLayoutSetLabelHandlerAddress, wgpuBindGroupLayoutSetLabelHandlerDescription)

	private val wgpuBufferReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuBufferReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuBufferRelease")

	private val wgpuBufferReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferReleaseHandlerAddress, wgpuBufferReleaseHandlerDescription)

	private val wgpuBufferMapAsyncHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						C_LONG,
						C_LONG,
						C_LONG,
						WGPUBufferMapCallbackInfo.LAYOUT
					)

	private val wgpuBufferMapAsyncHandlerAddress: MemorySegment = findOrThrow("wgpuBufferMapAsync")

	private val wgpuBufferMapAsyncHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferMapAsyncHandlerAddress, wgpuBufferMapAsyncHandlerDescription)

	private val wgpuBufferGetMappedRangeHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_LONG,
						C_LONG
					)

	private val wgpuBufferGetMappedRangeHandlerAddress: MemorySegment =
			findOrThrow("wgpuBufferGetMappedRange")

	private val wgpuBufferGetMappedRangeHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferGetMappedRangeHandlerAddress, wgpuBufferGetMappedRangeHandlerDescription)

	private val wgpuBufferGetConstMappedRangeHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_LONG,
						C_LONG
					)

	private val wgpuBufferGetConstMappedRangeHandlerAddress: MemorySegment =
			findOrThrow("wgpuBufferGetConstMappedRange")

	private val wgpuBufferGetConstMappedRangeHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferGetConstMappedRangeHandlerAddress, wgpuBufferGetConstMappedRangeHandlerDescription)

	private val wgpuBufferSetLabelHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuBufferSetLabelHandlerAddress: MemorySegment = findOrThrow("wgpuBufferSetLabel")

	private val wgpuBufferSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferSetLabelHandlerAddress, wgpuBufferSetLabelHandlerDescription)

	private val wgpuBufferGetUsageHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_LONG,
						C_POINTER
					)

	private val wgpuBufferGetUsageHandlerAddress: MemorySegment = findOrThrow("wgpuBufferGetUsage")

	private val wgpuBufferGetUsageHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferGetUsageHandlerAddress, wgpuBufferGetUsageHandlerDescription)

	private val wgpuBufferGetSizeHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_LONG,
						C_POINTER
					)

	private val wgpuBufferGetSizeHandlerAddress: MemorySegment = findOrThrow("wgpuBufferGetSize")

	private val wgpuBufferGetSizeHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferGetSizeHandlerAddress, wgpuBufferGetSizeHandlerDescription)

	private val wgpuBufferGetMapStateHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuBufferGetMapStateHandlerAddress: MemorySegment =
			findOrThrow("wgpuBufferGetMapState")

	private val wgpuBufferGetMapStateHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferGetMapStateHandlerAddress, wgpuBufferGetMapStateHandlerDescription)

	private val wgpuBufferUnmapHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuBufferUnmapHandlerAddress: MemorySegment = findOrThrow("wgpuBufferUnmap")

	private val wgpuBufferUnmapHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferUnmapHandlerAddress, wgpuBufferUnmapHandlerDescription)

	private val wgpuBufferDestroyHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuBufferDestroyHandlerAddress: MemorySegment = findOrThrow("wgpuBufferDestroy")

	private val wgpuBufferDestroyHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuBufferDestroyHandlerAddress, wgpuBufferDestroyHandlerDescription)

	private val wgpuCommandBufferReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuCommandBufferReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandBufferRelease")

	private val wgpuCommandBufferReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandBufferReleaseHandlerAddress, wgpuCommandBufferReleaseHandlerDescription)

	private val wgpuCommandBufferSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuCommandBufferSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandBufferSetLabel")

	private val wgpuCommandBufferSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandBufferSetLabelHandlerAddress, wgpuCommandBufferSetLabelHandlerDescription)

	private val wgpuCommandEncoderReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuCommandEncoderReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderRelease")

	private val wgpuCommandEncoderReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderReleaseHandlerAddress, wgpuCommandEncoderReleaseHandlerDescription)

	private val wgpuCommandEncoderFinishHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuCommandEncoderFinishHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderFinish")

	private val wgpuCommandEncoderFinishHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderFinishHandlerAddress, wgpuCommandEncoderFinishHandlerDescription)

	private val wgpuCommandEncoderBeginComputePassHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuCommandEncoderBeginComputePassHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderBeginComputePass")

	private val wgpuCommandEncoderBeginComputePassHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderBeginComputePassHandlerAddress, wgpuCommandEncoderBeginComputePassHandlerDescription)

	private val wgpuCommandEncoderBeginRenderPassHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuCommandEncoderBeginRenderPassHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderBeginRenderPass")

	private val wgpuCommandEncoderBeginRenderPassHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderBeginRenderPassHandlerAddress, wgpuCommandEncoderBeginRenderPassHandlerDescription)

	private val wgpuCommandEncoderCopyBufferToBufferHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_LONG,
						C_POINTER,
						C_LONG,
						C_LONG
					)

	private val wgpuCommandEncoderCopyBufferToBufferHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderCopyBufferToBuffer")

	private val wgpuCommandEncoderCopyBufferToBufferHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderCopyBufferToBufferHandlerAddress, wgpuCommandEncoderCopyBufferToBufferHandlerDescription)

	private val wgpuCommandEncoderCopyBufferToTextureHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuCommandEncoderCopyBufferToTextureHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderCopyBufferToTexture")

	private val wgpuCommandEncoderCopyBufferToTextureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderCopyBufferToTextureHandlerAddress, wgpuCommandEncoderCopyBufferToTextureHandlerDescription)

	private val wgpuCommandEncoderCopyTextureToBufferHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuCommandEncoderCopyTextureToBufferHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderCopyTextureToBuffer")

	private val wgpuCommandEncoderCopyTextureToBufferHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderCopyTextureToBufferHandlerAddress, wgpuCommandEncoderCopyTextureToBufferHandlerDescription)

	private val wgpuCommandEncoderCopyTextureToTextureHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuCommandEncoderCopyTextureToTextureHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderCopyTextureToTexture")

	private val wgpuCommandEncoderCopyTextureToTextureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderCopyTextureToTextureHandlerAddress, wgpuCommandEncoderCopyTextureToTextureHandlerDescription)

	private val wgpuCommandEncoderClearBufferHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_LONG,
						C_LONG
					)

	private val wgpuCommandEncoderClearBufferHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderClearBuffer")

	private val wgpuCommandEncoderClearBufferHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderClearBufferHandlerAddress, wgpuCommandEncoderClearBufferHandlerDescription)

	private val wgpuCommandEncoderInsertDebugMarkerHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuCommandEncoderInsertDebugMarkerHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderInsertDebugMarker")

	private val wgpuCommandEncoderInsertDebugMarkerHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderInsertDebugMarkerHandlerAddress, wgpuCommandEncoderInsertDebugMarkerHandlerDescription)

	private val wgpuCommandEncoderPopDebugGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuCommandEncoderPopDebugGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderPopDebugGroup")

	private val wgpuCommandEncoderPopDebugGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderPopDebugGroupHandlerAddress, wgpuCommandEncoderPopDebugGroupHandlerDescription)

	private val wgpuCommandEncoderPushDebugGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuCommandEncoderPushDebugGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderPushDebugGroup")

	private val wgpuCommandEncoderPushDebugGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderPushDebugGroupHandlerAddress, wgpuCommandEncoderPushDebugGroupHandlerDescription)

	private val wgpuCommandEncoderResolveQuerySetHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_INT,
						C_INT,
						C_POINTER,
						C_LONG
					)

	private val wgpuCommandEncoderResolveQuerySetHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderResolveQuerySet")

	private val wgpuCommandEncoderResolveQuerySetHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderResolveQuerySetHandlerAddress, wgpuCommandEncoderResolveQuerySetHandlerDescription)

	private val wgpuCommandEncoderWriteTimestampHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_INT
					)

	private val wgpuCommandEncoderWriteTimestampHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderWriteTimestamp")

	private val wgpuCommandEncoderWriteTimestampHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderWriteTimestampHandlerAddress, wgpuCommandEncoderWriteTimestampHandlerDescription)

	private val wgpuCommandEncoderSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuCommandEncoderSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuCommandEncoderSetLabel")

	private val wgpuCommandEncoderSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuCommandEncoderSetLabelHandlerAddress, wgpuCommandEncoderSetLabelHandlerDescription)

	private val wgpuComputePassEncoderReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuComputePassEncoderReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderRelease")

	private val wgpuComputePassEncoderReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderReleaseHandlerAddress, wgpuComputePassEncoderReleaseHandlerDescription)

	private val wgpuComputePassEncoderInsertDebugMarkerHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuComputePassEncoderInsertDebugMarkerHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderInsertDebugMarker")

	private val wgpuComputePassEncoderInsertDebugMarkerHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderInsertDebugMarkerHandlerAddress, wgpuComputePassEncoderInsertDebugMarkerHandlerDescription)

	private val wgpuComputePassEncoderPopDebugGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuComputePassEncoderPopDebugGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderPopDebugGroup")

	private val wgpuComputePassEncoderPopDebugGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderPopDebugGroupHandlerAddress, wgpuComputePassEncoderPopDebugGroupHandlerDescription)

	private val wgpuComputePassEncoderPushDebugGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuComputePassEncoderPushDebugGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderPushDebugGroup")

	private val wgpuComputePassEncoderPushDebugGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderPushDebugGroupHandlerAddress, wgpuComputePassEncoderPushDebugGroupHandlerDescription)

	private val wgpuComputePassEncoderSetPipelineHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER
					)

	private val wgpuComputePassEncoderSetPipelineHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderSetPipeline")

	private val wgpuComputePassEncoderSetPipelineHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderSetPipelineHandlerAddress, wgpuComputePassEncoderSetPipelineHandlerDescription)

	private val wgpuComputePassEncoderSetBindGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_POINTER,
						C_LONG,
						C_POINTER
					)

	private val wgpuComputePassEncoderSetBindGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderSetBindGroup")

	private val wgpuComputePassEncoderSetBindGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderSetBindGroupHandlerAddress, wgpuComputePassEncoderSetBindGroupHandlerDescription)

	private val wgpuComputePassEncoderDispatchWorkgroupsHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_INT,
						C_INT
					)

	private val wgpuComputePassEncoderDispatchWorkgroupsHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderDispatchWorkgroups")

	private val wgpuComputePassEncoderDispatchWorkgroupsHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderDispatchWorkgroupsHandlerAddress, wgpuComputePassEncoderDispatchWorkgroupsHandlerDescription)

	private val wgpuComputePassEncoderDispatchWorkgroupsIndirectHandlerDescription: FunctionDescriptor
			= FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_LONG
					)

	private val wgpuComputePassEncoderDispatchWorkgroupsIndirectHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderDispatchWorkgroupsIndirect")

	private val wgpuComputePassEncoderDispatchWorkgroupsIndirectHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderDispatchWorkgroupsIndirectHandlerAddress, wgpuComputePassEncoderDispatchWorkgroupsIndirectHandlerDescription)

	private val wgpuComputePassEncoderEndHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuComputePassEncoderEndHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderEnd")

	private val wgpuComputePassEncoderEndHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderEndHandlerAddress, wgpuComputePassEncoderEndHandlerDescription)

	private val wgpuComputePassEncoderSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuComputePassEncoderSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePassEncoderSetLabel")

	private val wgpuComputePassEncoderSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePassEncoderSetLabelHandlerAddress, wgpuComputePassEncoderSetLabelHandlerDescription)

	private val wgpuComputePipelineReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuComputePipelineReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePipelineRelease")

	private val wgpuComputePipelineReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePipelineReleaseHandlerAddress, wgpuComputePipelineReleaseHandlerDescription)

	private val wgpuComputePipelineGetBindGroupLayoutHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_INT
					)

	private val wgpuComputePipelineGetBindGroupLayoutHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePipelineGetBindGroupLayout")

	private val wgpuComputePipelineGetBindGroupLayoutHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePipelineGetBindGroupLayoutHandlerAddress, wgpuComputePipelineGetBindGroupLayoutHandlerDescription)

	private val wgpuComputePipelineSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuComputePipelineSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuComputePipelineSetLabel")

	private val wgpuComputePipelineSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuComputePipelineSetLabelHandlerAddress, wgpuComputePipelineSetLabelHandlerDescription)

	private val wgpuDeviceReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuDeviceReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuDeviceRelease")

	private val wgpuDeviceReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceReleaseHandlerAddress, wgpuDeviceReleaseHandlerDescription)

	private val wgpuDeviceCreateBindGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateBindGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateBindGroup")

	private val wgpuDeviceCreateBindGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateBindGroupHandlerAddress, wgpuDeviceCreateBindGroupHandlerDescription)

	private val wgpuDeviceCreateBindGroupLayoutHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateBindGroupLayoutHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateBindGroupLayout")

	private val wgpuDeviceCreateBindGroupLayoutHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateBindGroupLayoutHandlerAddress, wgpuDeviceCreateBindGroupLayoutHandlerDescription)

	private val wgpuDeviceCreateBufferHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateBufferHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateBuffer")

	private val wgpuDeviceCreateBufferHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateBufferHandlerAddress, wgpuDeviceCreateBufferHandlerDescription)

	private val wgpuDeviceCreateCommandEncoderHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateCommandEncoderHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateCommandEncoder")

	private val wgpuDeviceCreateCommandEncoderHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateCommandEncoderHandlerAddress, wgpuDeviceCreateCommandEncoderHandlerDescription)

	private val wgpuDeviceCreateComputePipelineHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateComputePipelineHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateComputePipeline")

	private val wgpuDeviceCreateComputePipelineHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateComputePipelineHandlerAddress, wgpuDeviceCreateComputePipelineHandlerDescription)

	private val wgpuDeviceCreateComputePipelineAsyncHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						WGPUCreateComputePipelineAsyncCallbackInfo.LAYOUT
					)

	private val wgpuDeviceCreateComputePipelineAsyncHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateComputePipelineAsync")

	private val wgpuDeviceCreateComputePipelineAsyncHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateComputePipelineAsyncHandlerAddress, wgpuDeviceCreateComputePipelineAsyncHandlerDescription)

	private val wgpuDeviceCreatePipelineLayoutHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreatePipelineLayoutHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreatePipelineLayout")

	private val wgpuDeviceCreatePipelineLayoutHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreatePipelineLayoutHandlerAddress, wgpuDeviceCreatePipelineLayoutHandlerDescription)

	private val wgpuDeviceCreateQuerySetHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateQuerySetHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateQuerySet")

	private val wgpuDeviceCreateQuerySetHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateQuerySetHandlerAddress, wgpuDeviceCreateQuerySetHandlerDescription)

	private val wgpuDeviceCreateRenderPipelineAsyncHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						WGPUCreateRenderPipelineAsyncCallbackInfo.LAYOUT
					)

	private val wgpuDeviceCreateRenderPipelineAsyncHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateRenderPipelineAsync")

	private val wgpuDeviceCreateRenderPipelineAsyncHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateRenderPipelineAsyncHandlerAddress, wgpuDeviceCreateRenderPipelineAsyncHandlerDescription)

	private val wgpuDeviceCreateRenderBundleEncoderHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateRenderBundleEncoderHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateRenderBundleEncoder")

	private val wgpuDeviceCreateRenderBundleEncoderHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateRenderBundleEncoderHandlerAddress, wgpuDeviceCreateRenderBundleEncoderHandlerDescription)

	private val wgpuDeviceCreateRenderPipelineHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateRenderPipelineHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateRenderPipeline")

	private val wgpuDeviceCreateRenderPipelineHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateRenderPipelineHandlerAddress, wgpuDeviceCreateRenderPipelineHandlerDescription)

	private val wgpuDeviceCreateSamplerHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateSamplerHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateSampler")

	private val wgpuDeviceCreateSamplerHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateSamplerHandlerAddress, wgpuDeviceCreateSamplerHandlerDescription)

	private val wgpuDeviceCreateShaderModuleHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateShaderModuleHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateShaderModule")

	private val wgpuDeviceCreateShaderModuleHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateShaderModuleHandlerAddress, wgpuDeviceCreateShaderModuleHandlerDescription)

	private val wgpuDeviceCreateTextureHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceCreateTextureHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceCreateTexture")

	private val wgpuDeviceCreateTextureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceCreateTextureHandlerAddress, wgpuDeviceCreateTextureHandlerDescription)

	private val wgpuDeviceDestroyHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuDeviceDestroyHandlerAddress: MemorySegment = findOrThrow("wgpuDeviceDestroy")

	private val wgpuDeviceDestroyHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceDestroyHandlerAddress, wgpuDeviceDestroyHandlerDescription)

	private val wgpuDeviceGetLostFutureHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						WGPUFuture.LAYOUT,
						C_POINTER
					)

	private val wgpuDeviceGetLostFutureHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceGetLostFuture")

	private val wgpuDeviceGetLostFutureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceGetLostFutureHandlerAddress, wgpuDeviceGetLostFutureHandlerDescription)

	private val wgpuDeviceGetLimitsHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceGetLimitsHandlerAddress: MemorySegment = findOrThrow("wgpuDeviceGetLimits")

	private val wgpuDeviceGetLimitsHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceGetLimitsHandlerAddress, wgpuDeviceGetLimitsHandlerDescription)

	private val wgpuDeviceHasFeatureHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_INT
					)

	private val wgpuDeviceHasFeatureHandlerAddress: MemorySegment = findOrThrow("wgpuDeviceHasFeature")

	private val wgpuDeviceHasFeatureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceHasFeatureHandlerAddress, wgpuDeviceHasFeatureHandlerDescription)

	private val wgpuDeviceGetFeaturesHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceGetFeaturesHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceGetFeatures")

	private val wgpuDeviceGetFeaturesHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceGetFeaturesHandlerAddress, wgpuDeviceGetFeaturesHandlerDescription)

	private val wgpuDeviceGetAdapterInfoHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						WGPUAdapterInfo.LAYOUT,
						C_POINTER
					)

	private val wgpuDeviceGetAdapterInfoHandlerAddress: MemorySegment =
			findOrThrow("wgpuDeviceGetAdapterInfo")

	private val wgpuDeviceGetAdapterInfoHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceGetAdapterInfoHandlerAddress, wgpuDeviceGetAdapterInfoHandlerDescription)

	private val wgpuDeviceGetQueueHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_POINTER,
						C_POINTER
					)

	private val wgpuDeviceGetQueueHandlerAddress: MemorySegment = findOrThrow("wgpuDeviceGetQueue")

	private val wgpuDeviceGetQueueHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceGetQueueHandlerAddress, wgpuDeviceGetQueueHandlerDescription)

	private val wgpuDevicePushErrorScopeHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT
					)

	private val wgpuDevicePushErrorScopeHandlerAddress: MemorySegment =
			findOrThrow("wgpuDevicePushErrorScope")

	private val wgpuDevicePushErrorScopeHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDevicePushErrorScopeHandlerAddress, wgpuDevicePushErrorScopeHandlerDescription)

	private val wgpuDevicePopErrorScopeHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUPopErrorScopeCallbackInfo.LAYOUT
					)

	private val wgpuDevicePopErrorScopeHandlerAddress: MemorySegment =
			findOrThrow("wgpuDevicePopErrorScope")

	private val wgpuDevicePopErrorScopeHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDevicePopErrorScopeHandlerAddress, wgpuDevicePopErrorScopeHandlerDescription)

	private val wgpuDeviceSetLabelHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuDeviceSetLabelHandlerAddress: MemorySegment = findOrThrow("wgpuDeviceSetLabel")

	private val wgpuDeviceSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuDeviceSetLabelHandlerAddress, wgpuDeviceSetLabelHandlerDescription)

	private val wgpuInstanceReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuInstanceReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuInstanceRelease")

	private val wgpuInstanceReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuInstanceReleaseHandlerAddress, wgpuInstanceReleaseHandlerDescription)

	private val wgpuInstanceCreateSurfaceHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuInstanceCreateSurfaceHandlerAddress: MemorySegment =
			findOrThrow("wgpuInstanceCreateSurface")

	private val wgpuInstanceCreateSurfaceHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuInstanceCreateSurfaceHandlerAddress, wgpuInstanceCreateSurfaceHandlerDescription)

	private val wgpuInstanceGetWGSLLanguageFeaturesHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_POINTER
					)

	private val wgpuInstanceGetWGSLLanguageFeaturesHandlerAddress: MemorySegment =
			findOrThrow("wgpuInstanceGetWGSLLanguageFeatures")

	private val wgpuInstanceGetWGSLLanguageFeaturesHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuInstanceGetWGSLLanguageFeaturesHandlerAddress, wgpuInstanceGetWGSLLanguageFeaturesHandlerDescription)

	private val wgpuInstanceHasWGSLLanguageFeatureHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_INT
					)

	private val wgpuInstanceHasWGSLLanguageFeatureHandlerAddress: MemorySegment =
			findOrThrow("wgpuInstanceHasWGSLLanguageFeature")

	private val wgpuInstanceHasWGSLLanguageFeatureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuInstanceHasWGSLLanguageFeatureHandlerAddress, wgpuInstanceHasWGSLLanguageFeatureHandlerDescription)

	private val wgpuInstanceProcessEventsHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuInstanceProcessEventsHandlerAddress: MemorySegment =
			findOrThrow("wgpuInstanceProcessEvents")

	private val wgpuInstanceProcessEventsHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuInstanceProcessEventsHandlerAddress, wgpuInstanceProcessEventsHandlerDescription)

	private val wgpuInstanceRequestAdapterHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						WGPURequestAdapterCallbackInfo.LAYOUT
					)

	private val wgpuInstanceRequestAdapterHandlerAddress: MemorySegment =
			findOrThrow("wgpuInstanceRequestAdapter")

	private val wgpuInstanceRequestAdapterHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuInstanceRequestAdapterHandlerAddress, wgpuInstanceRequestAdapterHandlerDescription)

	private val wgpuInstanceWaitAnyHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_LONG,
						C_POINTER,
						C_LONG
					)

	private val wgpuInstanceWaitAnyHandlerAddress: MemorySegment = findOrThrow("wgpuInstanceWaitAny")

	private val wgpuInstanceWaitAnyHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuInstanceWaitAnyHandlerAddress, wgpuInstanceWaitAnyHandlerDescription)

	private val wgpuPipelineLayoutReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuPipelineLayoutReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuPipelineLayoutRelease")

	private val wgpuPipelineLayoutReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuPipelineLayoutReleaseHandlerAddress, wgpuPipelineLayoutReleaseHandlerDescription)

	private val wgpuPipelineLayoutSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuPipelineLayoutSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuPipelineLayoutSetLabel")

	private val wgpuPipelineLayoutSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuPipelineLayoutSetLabelHandlerAddress, wgpuPipelineLayoutSetLabelHandlerDescription)

	private val wgpuQuerySetReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuQuerySetReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuQuerySetRelease")

	private val wgpuQuerySetReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQuerySetReleaseHandlerAddress, wgpuQuerySetReleaseHandlerDescription)

	private val wgpuQuerySetSetLabelHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuQuerySetSetLabelHandlerAddress: MemorySegment = findOrThrow("wgpuQuerySetSetLabel")

	private val wgpuQuerySetSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQuerySetSetLabelHandlerAddress, wgpuQuerySetSetLabelHandlerDescription)

	private val wgpuQuerySetGetTypeHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuQuerySetGetTypeHandlerAddress: MemorySegment = findOrThrow("wgpuQuerySetGetType")

	private val wgpuQuerySetGetTypeHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQuerySetGetTypeHandlerAddress, wgpuQuerySetGetTypeHandlerDescription)

	private val wgpuQuerySetGetCountHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuQuerySetGetCountHandlerAddress: MemorySegment = findOrThrow("wgpuQuerySetGetCount")

	private val wgpuQuerySetGetCountHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQuerySetGetCountHandlerAddress, wgpuQuerySetGetCountHandlerDescription)

	private val wgpuQuerySetDestroyHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuQuerySetDestroyHandlerAddress: MemorySegment = findOrThrow("wgpuQuerySetDestroy")

	private val wgpuQuerySetDestroyHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQuerySetDestroyHandlerAddress, wgpuQuerySetDestroyHandlerDescription)

	private val wgpuQueueReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuQueueReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuQueueRelease")

	private val wgpuQueueReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQueueReleaseHandlerAddress, wgpuQueueReleaseHandlerDescription)

	private val wgpuQueueSubmitHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						C_LONG,
						C_POINTER
					)

	private val wgpuQueueSubmitHandlerAddress: MemorySegment = findOrThrow("wgpuQueueSubmit")

	private val wgpuQueueSubmitHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQueueSubmitHandlerAddress, wgpuQueueSubmitHandlerDescription)

	private val wgpuQueueOnSubmittedWorkDoneHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUQueueWorkDoneCallbackInfo.LAYOUT
					)

	private val wgpuQueueOnSubmittedWorkDoneHandlerAddress: MemorySegment =
			findOrThrow("wgpuQueueOnSubmittedWorkDone")

	private val wgpuQueueOnSubmittedWorkDoneHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQueueOnSubmittedWorkDoneHandlerAddress, wgpuQueueOnSubmittedWorkDoneHandlerDescription)

	private val wgpuQueueWriteBufferHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_LONG,
						C_POINTER,
						C_LONG
					)

	private val wgpuQueueWriteBufferHandlerAddress: MemorySegment = findOrThrow("wgpuQueueWriteBuffer")

	private val wgpuQueueWriteBufferHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQueueWriteBufferHandlerAddress, wgpuQueueWriteBufferHandlerDescription)

	private val wgpuQueueWriteTextureHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_POINTER,
						C_LONG,
						C_POINTER,
						C_POINTER
					)

	private val wgpuQueueWriteTextureHandlerAddress: MemorySegment =
			findOrThrow("wgpuQueueWriteTexture")

	private val wgpuQueueWriteTextureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQueueWriteTextureHandlerAddress, wgpuQueueWriteTextureHandlerDescription)

	private val wgpuQueueSetLabelHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuQueueSetLabelHandlerAddress: MemorySegment = findOrThrow("wgpuQueueSetLabel")

	private val wgpuQueueSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuQueueSetLabelHandlerAddress, wgpuQueueSetLabelHandlerDescription)

	private val wgpuRenderBundleReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuRenderBundleReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleRelease")

	private val wgpuRenderBundleReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleReleaseHandlerAddress, wgpuRenderBundleReleaseHandlerDescription)

	private val wgpuRenderBundleSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuRenderBundleSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleSetLabel")

	private val wgpuRenderBundleSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleSetLabelHandlerAddress, wgpuRenderBundleSetLabelHandlerDescription)

	private val wgpuRenderBundleEncoderReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuRenderBundleEncoderReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderRelease")

	private val wgpuRenderBundleEncoderReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderReleaseHandlerAddress, wgpuRenderBundleEncoderReleaseHandlerDescription)

	private val wgpuRenderBundleEncoderSetPipelineHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER
					)

	private val wgpuRenderBundleEncoderSetPipelineHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderSetPipeline")

	private val wgpuRenderBundleEncoderSetPipelineHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetPipelineHandlerAddress, wgpuRenderBundleEncoderSetPipelineHandlerDescription)

	private val wgpuRenderBundleEncoderSetBindGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_POINTER,
						C_LONG,
						C_POINTER
					)

	private val wgpuRenderBundleEncoderSetBindGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderSetBindGroup")

	private val wgpuRenderBundleEncoderSetBindGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetBindGroupHandlerAddress, wgpuRenderBundleEncoderSetBindGroupHandlerDescription)

	private val wgpuRenderBundleEncoderDrawHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_INT,
						C_INT,
						C_INT
					)

	private val wgpuRenderBundleEncoderDrawHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderDraw")

	private val wgpuRenderBundleEncoderDrawHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderDrawHandlerAddress, wgpuRenderBundleEncoderDrawHandlerDescription)

	private val wgpuRenderBundleEncoderDrawIndexedHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_INT,
						C_INT,
						C_INT,
						C_INT
					)

	private val wgpuRenderBundleEncoderDrawIndexedHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderDrawIndexed")

	private val wgpuRenderBundleEncoderDrawIndexedHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderDrawIndexedHandlerAddress, wgpuRenderBundleEncoderDrawIndexedHandlerDescription)

	private val wgpuRenderBundleEncoderDrawIndirectHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_LONG
					)

	private val wgpuRenderBundleEncoderDrawIndirectHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderDrawIndirect")

	private val wgpuRenderBundleEncoderDrawIndirectHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderDrawIndirectHandlerAddress, wgpuRenderBundleEncoderDrawIndirectHandlerDescription)

	private val wgpuRenderBundleEncoderDrawIndexedIndirectHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_LONG
					)

	private val wgpuRenderBundleEncoderDrawIndexedIndirectHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderDrawIndexedIndirect")

	private val wgpuRenderBundleEncoderDrawIndexedIndirectHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderDrawIndexedIndirectHandlerAddress, wgpuRenderBundleEncoderDrawIndexedIndirectHandlerDescription)

	private val wgpuRenderBundleEncoderInsertDebugMarkerHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuRenderBundleEncoderInsertDebugMarkerHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderInsertDebugMarker")

	private val wgpuRenderBundleEncoderInsertDebugMarkerHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderInsertDebugMarkerHandlerAddress, wgpuRenderBundleEncoderInsertDebugMarkerHandlerDescription)

	private val wgpuRenderBundleEncoderPopDebugGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuRenderBundleEncoderPopDebugGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderPopDebugGroup")

	private val wgpuRenderBundleEncoderPopDebugGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderPopDebugGroupHandlerAddress, wgpuRenderBundleEncoderPopDebugGroupHandlerDescription)

	private val wgpuRenderBundleEncoderPushDebugGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuRenderBundleEncoderPushDebugGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderPushDebugGroup")

	private val wgpuRenderBundleEncoderPushDebugGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderPushDebugGroupHandlerAddress, wgpuRenderBundleEncoderPushDebugGroupHandlerDescription)

	private val wgpuRenderBundleEncoderSetVertexBufferHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_POINTER,
						C_LONG,
						C_LONG
					)

	private val wgpuRenderBundleEncoderSetVertexBufferHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderSetVertexBuffer")

	private val wgpuRenderBundleEncoderSetVertexBufferHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetVertexBufferHandlerAddress, wgpuRenderBundleEncoderSetVertexBufferHandlerDescription)

	private val wgpuRenderBundleEncoderSetIndexBufferHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_INT,
						C_LONG,
						C_LONG
					)

	private val wgpuRenderBundleEncoderSetIndexBufferHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderSetIndexBuffer")

	private val wgpuRenderBundleEncoderSetIndexBufferHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetIndexBufferHandlerAddress, wgpuRenderBundleEncoderSetIndexBufferHandlerDescription)

	private val wgpuRenderBundleEncoderFinishHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuRenderBundleEncoderFinishHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderFinish")

	private val wgpuRenderBundleEncoderFinishHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderFinishHandlerAddress, wgpuRenderBundleEncoderFinishHandlerDescription)

	private val wgpuRenderBundleEncoderSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuRenderBundleEncoderSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderBundleEncoderSetLabel")

	private val wgpuRenderBundleEncoderSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderBundleEncoderSetLabelHandlerAddress, wgpuRenderBundleEncoderSetLabelHandlerDescription)

	private val wgpuRenderPassEncoderReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuRenderPassEncoderReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderRelease")

	private val wgpuRenderPassEncoderReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderReleaseHandlerAddress, wgpuRenderPassEncoderReleaseHandlerDescription)

	private val wgpuRenderPassEncoderSetPipelineHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER
					)

	private val wgpuRenderPassEncoderSetPipelineHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderSetPipeline")

	private val wgpuRenderPassEncoderSetPipelineHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetPipelineHandlerAddress, wgpuRenderPassEncoderSetPipelineHandlerDescription)

	private val wgpuRenderPassEncoderSetBindGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_POINTER,
						C_LONG,
						C_POINTER
					)

	private val wgpuRenderPassEncoderSetBindGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderSetBindGroup")

	private val wgpuRenderPassEncoderSetBindGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetBindGroupHandlerAddress, wgpuRenderPassEncoderSetBindGroupHandlerDescription)

	private val wgpuRenderPassEncoderDrawHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_INT,
						C_INT,
						C_INT
					)

	private val wgpuRenderPassEncoderDrawHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderDraw")

	private val wgpuRenderPassEncoderDrawHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderDrawHandlerAddress, wgpuRenderPassEncoderDrawHandlerDescription)

	private val wgpuRenderPassEncoderDrawIndexedHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_INT,
						C_INT,
						C_INT,
						C_INT
					)

	private val wgpuRenderPassEncoderDrawIndexedHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderDrawIndexed")

	private val wgpuRenderPassEncoderDrawIndexedHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderDrawIndexedHandlerAddress, wgpuRenderPassEncoderDrawIndexedHandlerDescription)

	private val wgpuRenderPassEncoderDrawIndirectHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_LONG
					)

	private val wgpuRenderPassEncoderDrawIndirectHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderDrawIndirect")

	private val wgpuRenderPassEncoderDrawIndirectHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderDrawIndirectHandlerAddress, wgpuRenderPassEncoderDrawIndirectHandlerDescription)

	private val wgpuRenderPassEncoderDrawIndexedIndirectHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_LONG
					)

	private val wgpuRenderPassEncoderDrawIndexedIndirectHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderDrawIndexedIndirect")

	private val wgpuRenderPassEncoderDrawIndexedIndirectHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderDrawIndexedIndirectHandlerAddress, wgpuRenderPassEncoderDrawIndexedIndirectHandlerDescription)

	private val wgpuRenderPassEncoderExecuteBundlesHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_LONG,
						C_POINTER
					)

	private val wgpuRenderPassEncoderExecuteBundlesHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderExecuteBundles")

	private val wgpuRenderPassEncoderExecuteBundlesHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderExecuteBundlesHandlerAddress, wgpuRenderPassEncoderExecuteBundlesHandlerDescription)

	private val wgpuRenderPassEncoderInsertDebugMarkerHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuRenderPassEncoderInsertDebugMarkerHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderInsertDebugMarker")

	private val wgpuRenderPassEncoderInsertDebugMarkerHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderInsertDebugMarkerHandlerAddress, wgpuRenderPassEncoderInsertDebugMarkerHandlerDescription)

	private val wgpuRenderPassEncoderPopDebugGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuRenderPassEncoderPopDebugGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderPopDebugGroup")

	private val wgpuRenderPassEncoderPopDebugGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderPopDebugGroupHandlerAddress, wgpuRenderPassEncoderPopDebugGroupHandlerDescription)

	private val wgpuRenderPassEncoderPushDebugGroupHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuRenderPassEncoderPushDebugGroupHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderPushDebugGroup")

	private val wgpuRenderPassEncoderPushDebugGroupHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderPushDebugGroupHandlerAddress, wgpuRenderPassEncoderPushDebugGroupHandlerDescription)

	private val wgpuRenderPassEncoderSetStencilReferenceHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT
					)

	private val wgpuRenderPassEncoderSetStencilReferenceHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderSetStencilReference")

	private val wgpuRenderPassEncoderSetStencilReferenceHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetStencilReferenceHandlerAddress, wgpuRenderPassEncoderSetStencilReferenceHandlerDescription)

	private val wgpuRenderPassEncoderSetBlendConstantHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER
					)

	private val wgpuRenderPassEncoderSetBlendConstantHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderSetBlendConstant")

	private val wgpuRenderPassEncoderSetBlendConstantHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetBlendConstantHandlerAddress, wgpuRenderPassEncoderSetBlendConstantHandlerDescription)

	private val wgpuRenderPassEncoderSetViewportHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_FLOAT,
						C_FLOAT,
						C_FLOAT,
						C_FLOAT,
						C_FLOAT,
						C_FLOAT
					)

	private val wgpuRenderPassEncoderSetViewportHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderSetViewport")

	private val wgpuRenderPassEncoderSetViewportHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetViewportHandlerAddress, wgpuRenderPassEncoderSetViewportHandlerDescription)

	private val wgpuRenderPassEncoderSetScissorRectHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_INT,
						C_INT,
						C_INT
					)

	private val wgpuRenderPassEncoderSetScissorRectHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderSetScissorRect")

	private val wgpuRenderPassEncoderSetScissorRectHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetScissorRectHandlerAddress, wgpuRenderPassEncoderSetScissorRectHandlerDescription)

	private val wgpuRenderPassEncoderSetVertexBufferHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT,
						C_POINTER,
						C_LONG,
						C_LONG
					)

	private val wgpuRenderPassEncoderSetVertexBufferHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderSetVertexBuffer")

	private val wgpuRenderPassEncoderSetVertexBufferHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetVertexBufferHandlerAddress, wgpuRenderPassEncoderSetVertexBufferHandlerDescription)

	private val wgpuRenderPassEncoderSetIndexBufferHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER,
						C_INT,
						C_LONG,
						C_LONG
					)

	private val wgpuRenderPassEncoderSetIndexBufferHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderSetIndexBuffer")

	private val wgpuRenderPassEncoderSetIndexBufferHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetIndexBufferHandlerAddress, wgpuRenderPassEncoderSetIndexBufferHandlerDescription)

	private val wgpuRenderPassEncoderBeginOcclusionQueryHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_INT
					)

	private val wgpuRenderPassEncoderBeginOcclusionQueryHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderBeginOcclusionQuery")

	private val wgpuRenderPassEncoderBeginOcclusionQueryHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderBeginOcclusionQueryHandlerAddress, wgpuRenderPassEncoderBeginOcclusionQueryHandlerDescription)

	private val wgpuRenderPassEncoderEndOcclusionQueryHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuRenderPassEncoderEndOcclusionQueryHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderEndOcclusionQuery")

	private val wgpuRenderPassEncoderEndOcclusionQueryHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderEndOcclusionQueryHandlerAddress, wgpuRenderPassEncoderEndOcclusionQueryHandlerDescription)

	private val wgpuRenderPassEncoderEndHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuRenderPassEncoderEndHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderEnd")

	private val wgpuRenderPassEncoderEndHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderEndHandlerAddress, wgpuRenderPassEncoderEndHandlerDescription)

	private val wgpuRenderPassEncoderSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuRenderPassEncoderSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPassEncoderSetLabel")

	private val wgpuRenderPassEncoderSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPassEncoderSetLabelHandlerAddress, wgpuRenderPassEncoderSetLabelHandlerDescription)

	private val wgpuRenderPipelineReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuRenderPipelineReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPipelineRelease")

	private val wgpuRenderPipelineReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPipelineReleaseHandlerAddress, wgpuRenderPipelineReleaseHandlerDescription)

	private val wgpuRenderPipelineGetBindGroupLayoutHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_INT
					)

	private val wgpuRenderPipelineGetBindGroupLayoutHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPipelineGetBindGroupLayout")

	private val wgpuRenderPipelineGetBindGroupLayoutHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPipelineGetBindGroupLayoutHandlerAddress, wgpuRenderPipelineGetBindGroupLayoutHandlerDescription)

	private val wgpuRenderPipelineSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuRenderPipelineSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuRenderPipelineSetLabel")

	private val wgpuRenderPipelineSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuRenderPipelineSetLabelHandlerAddress, wgpuRenderPipelineSetLabelHandlerDescription)

	private val wgpuSamplerReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuSamplerReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuSamplerRelease")

	private val wgpuSamplerReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSamplerReleaseHandlerAddress, wgpuSamplerReleaseHandlerDescription)

	private val wgpuSamplerSetLabelHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuSamplerSetLabelHandlerAddress: MemorySegment = findOrThrow("wgpuSamplerSetLabel")

	private val wgpuSamplerSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSamplerSetLabelHandlerAddress, wgpuSamplerSetLabelHandlerDescription)

	private val wgpuShaderModuleReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuShaderModuleReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuShaderModuleRelease")

	private val wgpuShaderModuleReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuShaderModuleReleaseHandlerAddress, wgpuShaderModuleReleaseHandlerDescription)

	private val wgpuShaderModuleGetCompilationInfoHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUCompilationInfoCallbackInfo.LAYOUT
					)

	private val wgpuShaderModuleGetCompilationInfoHandlerAddress: MemorySegment =
			findOrThrow("wgpuShaderModuleGetCompilationInfo")

	private val wgpuShaderModuleGetCompilationInfoHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuShaderModuleGetCompilationInfoHandlerAddress, wgpuShaderModuleGetCompilationInfoHandlerDescription)

	private val wgpuShaderModuleSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuShaderModuleSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuShaderModuleSetLabel")

	private val wgpuShaderModuleSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuShaderModuleSetLabelHandlerAddress, wgpuShaderModuleSetLabelHandlerDescription)

	private val wgpuSurfaceReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuSurfaceReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuSurfaceRelease")

	private val wgpuSurfaceReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSurfaceReleaseHandlerAddress, wgpuSurfaceReleaseHandlerDescription)

	private val wgpuSurfaceConfigureHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER
					)

	private val wgpuSurfaceConfigureHandlerAddress: MemorySegment = findOrThrow("wgpuSurfaceConfigure")

	private val wgpuSurfaceConfigureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSurfaceConfigureHandlerAddress, wgpuSurfaceConfigureHandlerDescription)

	private val wgpuSurfaceGetCapabilitiesHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_INT,
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuSurfaceGetCapabilitiesHandlerAddress: MemorySegment =
			findOrThrow("wgpuSurfaceGetCapabilities")

	private val wgpuSurfaceGetCapabilitiesHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSurfaceGetCapabilitiesHandlerAddress, wgpuSurfaceGetCapabilitiesHandlerDescription)

	private val wgpuSurfaceGetCurrentTextureHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						C_POINTER
					)

	private val wgpuSurfaceGetCurrentTextureHandlerAddress: MemorySegment =
			findOrThrow("wgpuSurfaceGetCurrentTexture")

	private val wgpuSurfaceGetCurrentTextureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSurfaceGetCurrentTextureHandlerAddress, wgpuSurfaceGetCurrentTextureHandlerDescription)

	private val wgpuSurfacePresentHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuSurfacePresentHandlerAddress: MemorySegment = findOrThrow("wgpuSurfacePresent")

	private val wgpuSurfacePresentHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSurfacePresentHandlerAddress, wgpuSurfacePresentHandlerDescription)

	private val wgpuSurfaceUnconfigureHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuSurfaceUnconfigureHandlerAddress: MemorySegment =
			findOrThrow("wgpuSurfaceUnconfigure")

	private val wgpuSurfaceUnconfigureHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSurfaceUnconfigureHandlerAddress, wgpuSurfaceUnconfigureHandlerDescription)

	private val wgpuSurfaceSetLabelHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuSurfaceSetLabelHandlerAddress: MemorySegment = findOrThrow("wgpuSurfaceSetLabel")

	private val wgpuSurfaceSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuSurfaceSetLabelHandlerAddress, wgpuSurfaceSetLabelHandlerDescription)

	private val wgpuTextureReleaseHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuTextureReleaseHandlerAddress: MemorySegment = findOrThrow("wgpuTextureRelease")

	private val wgpuTextureReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureReleaseHandlerAddress, wgpuTextureReleaseHandlerDescription)

	private val wgpuTextureCreateViewHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_POINTER,
						C_POINTER,
						C_POINTER
					)

	private val wgpuTextureCreateViewHandlerAddress: MemorySegment =
			findOrThrow("wgpuTextureCreateView")

	private val wgpuTextureCreateViewHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureCreateViewHandlerAddress, wgpuTextureCreateViewHandlerDescription)

	private val wgpuTextureSetLabelHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuTextureSetLabelHandlerAddress: MemorySegment = findOrThrow("wgpuTextureSetLabel")

	private val wgpuTextureSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureSetLabelHandlerAddress, wgpuTextureSetLabelHandlerDescription)

	private val wgpuTextureGetWidthHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuTextureGetWidthHandlerAddress: MemorySegment = findOrThrow("wgpuTextureGetWidth")

	private val wgpuTextureGetWidthHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureGetWidthHandlerAddress, wgpuTextureGetWidthHandlerDescription)

	private val wgpuTextureGetHeightHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuTextureGetHeightHandlerAddress: MemorySegment = findOrThrow("wgpuTextureGetHeight")

	private val wgpuTextureGetHeightHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureGetHeightHandlerAddress, wgpuTextureGetHeightHandlerDescription)

	private val wgpuTextureGetDepthOrArrayLayersHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuTextureGetDepthOrArrayLayersHandlerAddress: MemorySegment =
			findOrThrow("wgpuTextureGetDepthOrArrayLayers")

	private val wgpuTextureGetDepthOrArrayLayersHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureGetDepthOrArrayLayersHandlerAddress, wgpuTextureGetDepthOrArrayLayersHandlerDescription)

	private val wgpuTextureGetMipLevelCountHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuTextureGetMipLevelCountHandlerAddress: MemorySegment =
			findOrThrow("wgpuTextureGetMipLevelCount")

	private val wgpuTextureGetMipLevelCountHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureGetMipLevelCountHandlerAddress, wgpuTextureGetMipLevelCountHandlerDescription)

	private val wgpuTextureGetSampleCountHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuTextureGetSampleCountHandlerAddress: MemorySegment =
			findOrThrow("wgpuTextureGetSampleCount")

	private val wgpuTextureGetSampleCountHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureGetSampleCountHandlerAddress, wgpuTextureGetSampleCountHandlerDescription)

	private val wgpuTextureGetDimensionHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuTextureGetDimensionHandlerAddress: MemorySegment =
			findOrThrow("wgpuTextureGetDimension")

	private val wgpuTextureGetDimensionHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureGetDimensionHandlerAddress, wgpuTextureGetDimensionHandlerDescription)

	private val wgpuTextureGetFormatHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_INT,
						C_POINTER
					)

	private val wgpuTextureGetFormatHandlerAddress: MemorySegment = findOrThrow("wgpuTextureGetFormat")

	private val wgpuTextureGetFormatHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureGetFormatHandlerAddress, wgpuTextureGetFormatHandlerDescription)

	private val wgpuTextureGetUsageHandlerDescription: FunctionDescriptor = FunctionDescriptor.of(
						C_LONG,
						C_POINTER
					)

	private val wgpuTextureGetUsageHandlerAddress: MemorySegment = findOrThrow("wgpuTextureGetUsage")

	private val wgpuTextureGetUsageHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureGetUsageHandlerAddress, wgpuTextureGetUsageHandlerDescription)

	private val wgpuTextureDestroyHandlerDescription: FunctionDescriptor = FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuTextureDestroyHandlerAddress: MemorySegment = findOrThrow("wgpuTextureDestroy")

	private val wgpuTextureDestroyHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureDestroyHandlerAddress, wgpuTextureDestroyHandlerDescription)

	private val wgpuTextureViewReleaseHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER
					)

	private val wgpuTextureViewReleaseHandlerAddress: MemorySegment =
			findOrThrow("wgpuTextureViewRelease")

	private val wgpuTextureViewReleaseHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureViewReleaseHandlerAddress, wgpuTextureViewReleaseHandlerDescription)

	private val wgpuTextureViewSetLabelHandlerDescription: FunctionDescriptor =
			FunctionDescriptor.ofVoid(
						C_POINTER,
						WGPUStringView.LAYOUT
					)

	private val wgpuTextureViewSetLabelHandlerAddress: MemorySegment =
			findOrThrow("wgpuTextureViewSetLabel")

	private val wgpuTextureViewSetLabelHandler: MethodHandle =
			Linker.nativeLinker().downcallHandle(wgpuTextureViewSetLabelHandlerAddress, wgpuTextureViewSetLabelHandlerDescription)

	public fun wgpuCreateInstance(descriptor: MemorySegment): MemorySegment = (wgpuCreateInstanceHandler.invokeExact(descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuGetInstanceCapabilities(capabilities: MemorySegment): UInt = (wgpuGetInstanceCapabilitiesHandler.invokeExact(capabilities) as Int).toUInt()

	public fun wgpuDevicePoll(
		device: MemorySegment,
		wait: UInt,
		wrappedSubmissionIndex: MemorySegment,
	): UInt = (wgpuDevicePollHandler.invokeExact(device, wait.toInt(), wrappedSubmissionIndex) as Int).toUInt()

	public fun wgpuSetLogCallback(callback: MemorySegment, userdata: MemorySegment): Unit = (wgpuSetLogCallbackHandler.invokeExact(callback, userdata) as Unit)

	public fun wgpuSetLogLevel(level: UInt): Unit = (wgpuSetLogLevelHandler.invokeExact(level.toInt()) as Unit)

	public fun wgpuAdapterRelease(handler: MemorySegment): Unit = (wgpuAdapterReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuAdapterGetLimits(handler: MemorySegment, limits: MemorySegment): UInt = (wgpuAdapterGetLimitsHandler.invokeExact(handler, limits) as Int).toUInt()

	public fun wgpuAdapterHasFeature(handler: MemorySegment, feature: UInt): UInt = (wgpuAdapterHasFeatureHandler.invokeExact(handler, feature.toInt()) as Int).toUInt()

	public fun wgpuAdapterGetFeatures(handler: MemorySegment, features: MemorySegment): Unit = (wgpuAdapterGetFeaturesHandler.invokeExact(handler, features) as Unit)

	public fun wgpuAdapterGetInfo(handler: MemorySegment, info: MemorySegment): UInt = (wgpuAdapterGetInfoHandler.invokeExact(handler, info) as Int).toUInt()

	public fun wgpuAdapterRequestDevice(
		handler: MemorySegment,
		descriptor: MemorySegment,
		callbackInfo: MemorySegment,
	): Unit = (wgpuAdapterRequestDeviceHandler.invokeExact(handler, descriptor, callbackInfo) as Unit)

	public fun wgpuBindGroupRelease(handler: MemorySegment): Unit = (wgpuBindGroupReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuBindGroupSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuBindGroupSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuBindGroupLayoutRelease(handler: MemorySegment): Unit = (wgpuBindGroupLayoutReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuBindGroupLayoutSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuBindGroupLayoutSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuBufferRelease(handler: MemorySegment): Unit = (wgpuBufferReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuBufferMapAsync(
		handler: MemorySegment,
		mode: ULong,
		offset: ULong,
		size: ULong,
		callbackInfo: MemorySegment,
	): Unit = (wgpuBufferMapAsyncHandler.invokeExact(handler, mode.toLong(), offset.toLong(), size.toLong(), callbackInfo) as Unit)

	public fun wgpuBufferGetMappedRange(
		handler: MemorySegment,
		offset: ULong,
		size: ULong,
	): MemorySegment = (wgpuBufferGetMappedRangeHandler.invokeExact(handler, offset.toLong(), size.toLong()) as java.lang.foreign.MemorySegment)

	public fun wgpuBufferGetConstMappedRange(
		handler: MemorySegment,
		offset: ULong,
		size: ULong,
	): MemorySegment = (wgpuBufferGetConstMappedRangeHandler.invokeExact(handler, offset.toLong(), size.toLong()) as java.lang.foreign.MemorySegment)

	public fun wgpuBufferSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuBufferSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuBufferGetUsage(handler: MemorySegment): ULong = (wgpuBufferGetUsageHandler.invokeExact(handler) as Long).toULong()

	public fun wgpuBufferGetSize(handler: MemorySegment): ULong = (wgpuBufferGetSizeHandler.invokeExact(handler) as Long).toULong()

	public fun wgpuBufferGetMapState(handler: MemorySegment): UInt = (wgpuBufferGetMapStateHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuBufferUnmap(handler: MemorySegment): Unit = (wgpuBufferUnmapHandler.invokeExact(handler) as Unit)

	public fun wgpuBufferDestroy(handler: MemorySegment): Unit = (wgpuBufferDestroyHandler.invokeExact(handler) as Unit)

	public fun wgpuCommandBufferRelease(handler: MemorySegment): Unit = (wgpuCommandBufferReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuCommandBufferSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuCommandBufferSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuCommandEncoderRelease(handler: MemorySegment): Unit = (wgpuCommandEncoderReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuCommandEncoderFinish(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuCommandEncoderFinishHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuCommandEncoderBeginComputePass(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuCommandEncoderBeginComputePassHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuCommandEncoderBeginRenderPass(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuCommandEncoderBeginRenderPassHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuCommandEncoderCopyBufferToBuffer(
		handler: MemorySegment,
		source: MemorySegment,
		sourceOffset: ULong,
		destination: MemorySegment,
		destinationOffset: ULong,
		size: ULong,
	): Unit = (wgpuCommandEncoderCopyBufferToBufferHandler.invokeExact(handler, source, sourceOffset.toLong(), destination, destinationOffset.toLong(), size.toLong()) as Unit)

	public fun wgpuCommandEncoderCopyBufferToTexture(
		handler: MemorySegment,
		source: MemorySegment,
		destination: MemorySegment,
		copySize: MemorySegment,
	): Unit = (wgpuCommandEncoderCopyBufferToTextureHandler.invokeExact(handler, source, destination, copySize) as Unit)

	public fun wgpuCommandEncoderCopyTextureToBuffer(
		handler: MemorySegment,
		source: MemorySegment,
		destination: MemorySegment,
		copySize: MemorySegment,
	): Unit = (wgpuCommandEncoderCopyTextureToBufferHandler.invokeExact(handler, source, destination, copySize) as Unit)

	public fun wgpuCommandEncoderCopyTextureToTexture(
		handler: MemorySegment,
		source: MemorySegment,
		destination: MemorySegment,
		copySize: MemorySegment,
	): Unit = (wgpuCommandEncoderCopyTextureToTextureHandler.invokeExact(handler, source, destination, copySize) as Unit)

	public fun wgpuCommandEncoderClearBuffer(
		handler: MemorySegment,
		buffer: MemorySegment,
		offset: ULong,
		size: ULong,
	): Unit = (wgpuCommandEncoderClearBufferHandler.invokeExact(handler, buffer, offset.toLong(), size.toLong()) as Unit)

	public fun wgpuCommandEncoderInsertDebugMarker(handler: MemorySegment, markerLabel: MemorySegment): Unit = (wgpuCommandEncoderInsertDebugMarkerHandler.invokeExact(handler, markerLabel) as Unit)

	public fun wgpuCommandEncoderPopDebugGroup(handler: MemorySegment): Unit = (wgpuCommandEncoderPopDebugGroupHandler.invokeExact(handler) as Unit)

	public fun wgpuCommandEncoderPushDebugGroup(handler: MemorySegment, groupLabel: MemorySegment): Unit = (wgpuCommandEncoderPushDebugGroupHandler.invokeExact(handler, groupLabel) as Unit)

	public fun wgpuCommandEncoderResolveQuerySet(
		handler: MemorySegment,
		querySet: MemorySegment,
		firstQuery: UInt,
		queryCount: UInt,
		destination: MemorySegment,
		destinationOffset: ULong,
	): Unit = (wgpuCommandEncoderResolveQuerySetHandler.invokeExact(handler, querySet, firstQuery.toInt(), queryCount.toInt(), destination, destinationOffset.toLong()) as Unit)

	public fun wgpuCommandEncoderWriteTimestamp(
		handler: MemorySegment,
		querySet: MemorySegment,
		queryIndex: UInt,
	): Unit = (wgpuCommandEncoderWriteTimestampHandler.invokeExact(handler, querySet, queryIndex.toInt()) as Unit)

	public fun wgpuCommandEncoderSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuCommandEncoderSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuComputePassEncoderRelease(handler: MemorySegment): Unit = (wgpuComputePassEncoderReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuComputePassEncoderInsertDebugMarker(handler: MemorySegment, markerLabel: MemorySegment): Unit = (wgpuComputePassEncoderInsertDebugMarkerHandler.invokeExact(handler, markerLabel) as Unit)

	public fun wgpuComputePassEncoderPopDebugGroup(handler: MemorySegment): Unit = (wgpuComputePassEncoderPopDebugGroupHandler.invokeExact(handler) as Unit)

	public fun wgpuComputePassEncoderPushDebugGroup(handler: MemorySegment, groupLabel: MemorySegment): Unit = (wgpuComputePassEncoderPushDebugGroupHandler.invokeExact(handler, groupLabel) as Unit)

	public fun wgpuComputePassEncoderSetPipeline(handler: MemorySegment, pipeline: MemorySegment): Unit = (wgpuComputePassEncoderSetPipelineHandler.invokeExact(handler, pipeline) as Unit)

	public fun wgpuComputePassEncoderSetBindGroup(
		handler: MemorySegment,
		groupIndex: UInt,
		group: MemorySegment,
		dynamicOffsetCount: ULong,
		dynamicOffsets: MemorySegment,
	): Unit = (wgpuComputePassEncoderSetBindGroupHandler.invokeExact(handler, groupIndex.toInt(), group, dynamicOffsetCount.toLong(), dynamicOffsets) as Unit)

	public fun wgpuComputePassEncoderDispatchWorkgroups(
		handler: MemorySegment,
		workgroupCountX: UInt,
		workgroupCountY: UInt,
		workgroupCountZ: UInt,
	): Unit = (wgpuComputePassEncoderDispatchWorkgroupsHandler.invokeExact(handler, workgroupCountX.toInt(), workgroupCountY.toInt(), workgroupCountZ.toInt()) as Unit)

	public fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(
		handler: MemorySegment,
		indirectBuffer: MemorySegment,
		indirectOffset: ULong,
	): Unit = (wgpuComputePassEncoderDispatchWorkgroupsIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)

	public fun wgpuComputePassEncoderEnd(handler: MemorySegment): Unit = (wgpuComputePassEncoderEndHandler.invokeExact(handler) as Unit)

	public fun wgpuComputePassEncoderSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuComputePassEncoderSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuComputePipelineRelease(handler: MemorySegment): Unit = (wgpuComputePipelineReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuComputePipelineGetBindGroupLayout(handler: MemorySegment, groupIndex: UInt): MemorySegment = (wgpuComputePipelineGetBindGroupLayoutHandler.invokeExact(handler, groupIndex.toInt()) as java.lang.foreign.MemorySegment)

	public fun wgpuComputePipelineSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuComputePipelineSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuDeviceRelease(handler: MemorySegment): Unit = (wgpuDeviceReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuDeviceCreateBindGroup(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateBindGroupHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateBindGroupLayout(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateBindGroupLayoutHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateBuffer(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateBufferHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateCommandEncoder(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateCommandEncoderHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateComputePipeline(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateComputePipelineHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateComputePipelineAsync(
		handler: MemorySegment,
		descriptor: MemorySegment,
		callbackInfo: MemorySegment,
	): Unit = (wgpuDeviceCreateComputePipelineAsyncHandler.invokeExact(handler, descriptor, callbackInfo) as Unit)

	public fun wgpuDeviceCreatePipelineLayout(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreatePipelineLayoutHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateQuerySet(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateQuerySetHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateRenderPipelineAsync(
		handler: MemorySegment,
		descriptor: MemorySegment,
		callbackInfo: MemorySegment,
	): Unit = (wgpuDeviceCreateRenderPipelineAsyncHandler.invokeExact(handler, descriptor, callbackInfo) as Unit)

	public fun wgpuDeviceCreateRenderBundleEncoder(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateRenderBundleEncoderHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateRenderPipeline(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateRenderPipelineHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateSampler(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateSamplerHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateShaderModule(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateShaderModuleHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceCreateTexture(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuDeviceCreateTextureHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceDestroy(handler: MemorySegment): Unit = (wgpuDeviceDestroyHandler.invokeExact(handler) as Unit)

	public fun wgpuDeviceGetLostFuture(handler: MemorySegment): MemorySegment = (wgpuDeviceGetLostFutureHandler.invokeExact(handler) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceGetLimits(handler: MemorySegment, limits: MemorySegment): UInt = (wgpuDeviceGetLimitsHandler.invokeExact(handler, limits) as Int).toUInt()

	public fun wgpuDeviceHasFeature(handler: MemorySegment, feature: UInt): UInt = (wgpuDeviceHasFeatureHandler.invokeExact(handler, feature.toInt()) as Int).toUInt()

	public fun wgpuDeviceGetFeatures(handler: MemorySegment, features: MemorySegment): Unit = (wgpuDeviceGetFeaturesHandler.invokeExact(handler, features) as Unit)

	public fun wgpuDeviceGetAdapterInfo(handler: MemorySegment): MemorySegment = (wgpuDeviceGetAdapterInfoHandler.invokeExact(handler) as java.lang.foreign.MemorySegment)

	public fun wgpuDeviceGetQueue(handler: MemorySegment): MemorySegment = (wgpuDeviceGetQueueHandler.invokeExact(handler) as java.lang.foreign.MemorySegment)

	public fun wgpuDevicePushErrorScope(handler: MemorySegment, filter: UInt): Unit = (wgpuDevicePushErrorScopeHandler.invokeExact(handler, filter.toInt()) as Unit)

	public fun wgpuDevicePopErrorScope(handler: MemorySegment, callbackInfo: MemorySegment): Unit = (wgpuDevicePopErrorScopeHandler.invokeExact(handler, callbackInfo) as Unit)

	public fun wgpuDeviceSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuDeviceSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuInstanceRelease(handler: MemorySegment): Unit = (wgpuInstanceReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuInstanceCreateSurface(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuInstanceCreateSurfaceHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuInstanceGetWGSLLanguageFeatures(handler: MemorySegment, features: MemorySegment): UInt = (wgpuInstanceGetWGSLLanguageFeaturesHandler.invokeExact(handler, features) as Int).toUInt()

	public fun wgpuInstanceHasWGSLLanguageFeature(handler: MemorySegment, feature: UInt): UInt = (wgpuInstanceHasWGSLLanguageFeatureHandler.invokeExact(handler, feature.toInt()) as Int).toUInt()

	public fun wgpuInstanceProcessEvents(handler: MemorySegment): Unit = (wgpuInstanceProcessEventsHandler.invokeExact(handler) as Unit)

	public fun wgpuInstanceRequestAdapter(
		handler: MemorySegment,
		options: MemorySegment,
		callbackInfo: MemorySegment,
	): Unit = (wgpuInstanceRequestAdapterHandler.invokeExact(handler, options, callbackInfo) as Unit)

	public fun wgpuInstanceWaitAny(
		handler: MemorySegment,
		futureCount: ULong,
		futures: MemorySegment,
		timeoutNS: ULong,
	): UInt = (wgpuInstanceWaitAnyHandler.invokeExact(handler, futureCount.toLong(), futures, timeoutNS.toLong()) as Int).toUInt()

	public fun wgpuPipelineLayoutRelease(handler: MemorySegment): Unit = (wgpuPipelineLayoutReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuPipelineLayoutSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuPipelineLayoutSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuQuerySetRelease(handler: MemorySegment): Unit = (wgpuQuerySetReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuQuerySetSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuQuerySetSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuQuerySetGetType(handler: MemorySegment): UInt = (wgpuQuerySetGetTypeHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuQuerySetGetCount(handler: MemorySegment): UInt = (wgpuQuerySetGetCountHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuQuerySetDestroy(handler: MemorySegment): Unit = (wgpuQuerySetDestroyHandler.invokeExact(handler) as Unit)

	public fun wgpuQueueRelease(handler: MemorySegment): Unit = (wgpuQueueReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuQueueSubmit(
		handler: MemorySegment,
		commandCount: ULong,
		commands: MemorySegment,
	): Unit = (wgpuQueueSubmitHandler.invokeExact(handler, commandCount.toLong(), commands) as Unit)

	public fun wgpuQueueOnSubmittedWorkDone(handler: MemorySegment, callbackInfo: MemorySegment): Unit = (wgpuQueueOnSubmittedWorkDoneHandler.invokeExact(handler, callbackInfo) as Unit)

	public fun wgpuQueueWriteBuffer(
		handler: MemorySegment,
		buffer: MemorySegment,
		bufferOffset: ULong,
		`data`: MemorySegment,
		size: ULong,
	): Unit = (wgpuQueueWriteBufferHandler.invokeExact(handler, buffer, bufferOffset.toLong(), data, size.toLong()) as Unit)

	public fun wgpuQueueWriteTexture(
		handler: MemorySegment,
		destination: MemorySegment,
		`data`: MemorySegment,
		dataSize: ULong,
		dataLayout: MemorySegment,
		writeSize: MemorySegment,
	): Unit = (wgpuQueueWriteTextureHandler.invokeExact(handler, destination, data, dataSize.toLong(), dataLayout, writeSize) as Unit)

	public fun wgpuQueueSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuQueueSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuRenderBundleRelease(handler: MemorySegment): Unit = (wgpuRenderBundleReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuRenderBundleSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuRenderBundleSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuRenderBundleEncoderRelease(handler: MemorySegment): Unit = (wgpuRenderBundleEncoderReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuRenderBundleEncoderSetPipeline(handler: MemorySegment, pipeline: MemorySegment): Unit = (wgpuRenderBundleEncoderSetPipelineHandler.invokeExact(handler, pipeline) as Unit)

	public fun wgpuRenderBundleEncoderSetBindGroup(
		handler: MemorySegment,
		groupIndex: UInt,
		group: MemorySegment,
		dynamicOffsetCount: ULong,
		dynamicOffsets: MemorySegment,
	): Unit = (wgpuRenderBundleEncoderSetBindGroupHandler.invokeExact(handler, groupIndex.toInt(), group, dynamicOffsetCount.toLong(), dynamicOffsets) as Unit)

	public fun wgpuRenderBundleEncoderDraw(
		handler: MemorySegment,
		vertexCount: UInt,
		instanceCount: UInt,
		firstVertex: UInt,
		firstInstance: UInt,
	): Unit = (wgpuRenderBundleEncoderDrawHandler.invokeExact(handler, vertexCount.toInt(), instanceCount.toInt(), firstVertex.toInt(), firstInstance.toInt()) as Unit)

	public fun wgpuRenderBundleEncoderDrawIndexed(
		handler: MemorySegment,
		indexCount: UInt,
		instanceCount: UInt,
		firstIndex: UInt,
		baseVertex: Int,
		firstInstance: UInt,
	): Unit = (wgpuRenderBundleEncoderDrawIndexedHandler.invokeExact(handler, indexCount.toInt(), instanceCount.toInt(), firstIndex.toInt(), baseVertex, firstInstance.toInt()) as Unit)

	public fun wgpuRenderBundleEncoderDrawIndirect(
		handler: MemorySegment,
		indirectBuffer: MemorySegment,
		indirectOffset: ULong,
	): Unit = (wgpuRenderBundleEncoderDrawIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)

	public fun wgpuRenderBundleEncoderDrawIndexedIndirect(
		handler: MemorySegment,
		indirectBuffer: MemorySegment,
		indirectOffset: ULong,
	): Unit = (wgpuRenderBundleEncoderDrawIndexedIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)

	public fun wgpuRenderBundleEncoderInsertDebugMarker(handler: MemorySegment, markerLabel: MemorySegment): Unit = (wgpuRenderBundleEncoderInsertDebugMarkerHandler.invokeExact(handler, markerLabel) as Unit)

	public fun wgpuRenderBundleEncoderPopDebugGroup(handler: MemorySegment): Unit = (wgpuRenderBundleEncoderPopDebugGroupHandler.invokeExact(handler) as Unit)

	public fun wgpuRenderBundleEncoderPushDebugGroup(handler: MemorySegment, groupLabel: MemorySegment): Unit = (wgpuRenderBundleEncoderPushDebugGroupHandler.invokeExact(handler, groupLabel) as Unit)

	public fun wgpuRenderBundleEncoderSetVertexBuffer(
		handler: MemorySegment,
		slot: UInt,
		buffer: MemorySegment,
		offset: ULong,
		size: ULong,
	): Unit = (wgpuRenderBundleEncoderSetVertexBufferHandler.invokeExact(handler, slot.toInt(), buffer, offset.toLong(), size.toLong()) as Unit)

	public fun wgpuRenderBundleEncoderSetIndexBuffer(
		handler: MemorySegment,
		buffer: MemorySegment,
		format: UInt,
		offset: ULong,
		size: ULong,
	): Unit = (wgpuRenderBundleEncoderSetIndexBufferHandler.invokeExact(handler, buffer, format.toInt(), offset.toLong(), size.toLong()) as Unit)

	public fun wgpuRenderBundleEncoderFinish(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuRenderBundleEncoderFinishHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuRenderBundleEncoderSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuRenderBundleEncoderSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuRenderPassEncoderRelease(handler: MemorySegment): Unit = (wgpuRenderPassEncoderReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuRenderPassEncoderSetPipeline(handler: MemorySegment, pipeline: MemorySegment): Unit = (wgpuRenderPassEncoderSetPipelineHandler.invokeExact(handler, pipeline) as Unit)

	public fun wgpuRenderPassEncoderSetBindGroup(
		handler: MemorySegment,
		groupIndex: UInt,
		group: MemorySegment,
		dynamicOffsetCount: ULong,
		dynamicOffsets: MemorySegment,
	): Unit = (wgpuRenderPassEncoderSetBindGroupHandler.invokeExact(handler, groupIndex.toInt(), group, dynamicOffsetCount.toLong(), dynamicOffsets) as Unit)

	public fun wgpuRenderPassEncoderDraw(
		handler: MemorySegment,
		vertexCount: UInt,
		instanceCount: UInt,
		firstVertex: UInt,
		firstInstance: UInt,
	): Unit = (wgpuRenderPassEncoderDrawHandler.invokeExact(handler, vertexCount.toInt(), instanceCount.toInt(), firstVertex.toInt(), firstInstance.toInt()) as Unit)

	public fun wgpuRenderPassEncoderDrawIndexed(
		handler: MemorySegment,
		indexCount: UInt,
		instanceCount: UInt,
		firstIndex: UInt,
		baseVertex: Int,
		firstInstance: UInt,
	): Unit = (wgpuRenderPassEncoderDrawIndexedHandler.invokeExact(handler, indexCount.toInt(), instanceCount.toInt(), firstIndex.toInt(), baseVertex, firstInstance.toInt()) as Unit)

	public fun wgpuRenderPassEncoderDrawIndirect(
		handler: MemorySegment,
		indirectBuffer: MemorySegment,
		indirectOffset: ULong,
	): Unit = (wgpuRenderPassEncoderDrawIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)

	public fun wgpuRenderPassEncoderDrawIndexedIndirect(
		handler: MemorySegment,
		indirectBuffer: MemorySegment,
		indirectOffset: ULong,
	): Unit = (wgpuRenderPassEncoderDrawIndexedIndirectHandler.invokeExact(handler, indirectBuffer, indirectOffset.toLong()) as Unit)

	public fun wgpuRenderPassEncoderExecuteBundles(
		handler: MemorySegment,
		bundleCount: ULong,
		bundles: MemorySegment,
	): Unit = (wgpuRenderPassEncoderExecuteBundlesHandler.invokeExact(handler, bundleCount.toLong(), bundles) as Unit)

	public fun wgpuRenderPassEncoderInsertDebugMarker(handler: MemorySegment, markerLabel: MemorySegment): Unit = (wgpuRenderPassEncoderInsertDebugMarkerHandler.invokeExact(handler, markerLabel) as Unit)

	public fun wgpuRenderPassEncoderPopDebugGroup(handler: MemorySegment): Unit = (wgpuRenderPassEncoderPopDebugGroupHandler.invokeExact(handler) as Unit)

	public fun wgpuRenderPassEncoderPushDebugGroup(handler: MemorySegment, groupLabel: MemorySegment): Unit = (wgpuRenderPassEncoderPushDebugGroupHandler.invokeExact(handler, groupLabel) as Unit)

	public fun wgpuRenderPassEncoderSetStencilReference(handler: MemorySegment, reference: UInt): Unit = (wgpuRenderPassEncoderSetStencilReferenceHandler.invokeExact(handler, reference.toInt()) as Unit)

	public fun wgpuRenderPassEncoderSetBlendConstant(handler: MemorySegment, color: MemorySegment): Unit = (wgpuRenderPassEncoderSetBlendConstantHandler.invokeExact(handler, color) as Unit)

	public fun wgpuRenderPassEncoderSetViewport(
		handler: MemorySegment,
		x: Float,
		y: Float,
		width: Float,
		height: Float,
		minDepth: Float,
		maxDepth: Float,
	): Unit = (wgpuRenderPassEncoderSetViewportHandler.invokeExact(handler, x, y, width, height, minDepth, maxDepth) as Unit)

	public fun wgpuRenderPassEncoderSetScissorRect(
		handler: MemorySegment,
		x: UInt,
		y: UInt,
		width: UInt,
		height: UInt,
	): Unit = (wgpuRenderPassEncoderSetScissorRectHandler.invokeExact(handler, x.toInt(), y.toInt(), width.toInt(), height.toInt()) as Unit)

	public fun wgpuRenderPassEncoderSetVertexBuffer(
		handler: MemorySegment,
		slot: UInt,
		buffer: MemorySegment,
		offset: ULong,
		size: ULong,
	): Unit = (wgpuRenderPassEncoderSetVertexBufferHandler.invokeExact(handler, slot.toInt(), buffer, offset.toLong(), size.toLong()) as Unit)

	public fun wgpuRenderPassEncoderSetIndexBuffer(
		handler: MemorySegment,
		buffer: MemorySegment,
		format: UInt,
		offset: ULong,
		size: ULong,
	): Unit = (wgpuRenderPassEncoderSetIndexBufferHandler.invokeExact(handler, buffer, format.toInt(), offset.toLong(), size.toLong()) as Unit)

	public fun wgpuRenderPassEncoderBeginOcclusionQuery(handler: MemorySegment, queryIndex: UInt): Unit = (wgpuRenderPassEncoderBeginOcclusionQueryHandler.invokeExact(handler, queryIndex.toInt()) as Unit)

	public fun wgpuRenderPassEncoderEndOcclusionQuery(handler: MemorySegment): Unit = (wgpuRenderPassEncoderEndOcclusionQueryHandler.invokeExact(handler) as Unit)

	public fun wgpuRenderPassEncoderEnd(handler: MemorySegment): Unit = (wgpuRenderPassEncoderEndHandler.invokeExact(handler) as Unit)

	public fun wgpuRenderPassEncoderSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuRenderPassEncoderSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuRenderPipelineRelease(handler: MemorySegment): Unit = (wgpuRenderPipelineReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuRenderPipelineGetBindGroupLayout(handler: MemorySegment, groupIndex: UInt): MemorySegment = (wgpuRenderPipelineGetBindGroupLayoutHandler.invokeExact(handler, groupIndex.toInt()) as java.lang.foreign.MemorySegment)

	public fun wgpuRenderPipelineSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuRenderPipelineSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuSamplerRelease(handler: MemorySegment): Unit = (wgpuSamplerReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuSamplerSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuSamplerSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuShaderModuleRelease(handler: MemorySegment): Unit = (wgpuShaderModuleReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuShaderModuleGetCompilationInfo(handler: MemorySegment, callbackInfo: MemorySegment): Unit = (wgpuShaderModuleGetCompilationInfoHandler.invokeExact(handler, callbackInfo) as Unit)

	public fun wgpuShaderModuleSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuShaderModuleSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuSurfaceRelease(handler: MemorySegment): Unit = (wgpuSurfaceReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuSurfaceConfigure(handler: MemorySegment, config: MemorySegment): Unit = (wgpuSurfaceConfigureHandler.invokeExact(handler, config) as Unit)

	public fun wgpuSurfaceGetCapabilities(
		handler: MemorySegment,
		adapter: MemorySegment,
		capabilities: MemorySegment,
	): UInt = (wgpuSurfaceGetCapabilitiesHandler.invokeExact(handler, adapter, capabilities) as Int).toUInt()

	public fun wgpuSurfaceGetCurrentTexture(handler: MemorySegment, surfaceTexture: MemorySegment): Unit = (wgpuSurfaceGetCurrentTextureHandler.invokeExact(handler, surfaceTexture) as Unit)

	public fun wgpuSurfacePresent(handler: MemorySegment): UInt = (wgpuSurfacePresentHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuSurfaceUnconfigure(handler: MemorySegment): Unit = (wgpuSurfaceUnconfigureHandler.invokeExact(handler) as Unit)

	public fun wgpuSurfaceSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuSurfaceSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuTextureRelease(handler: MemorySegment): Unit = (wgpuTextureReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuTextureCreateView(handler: MemorySegment, descriptor: MemorySegment): MemorySegment = (wgpuTextureCreateViewHandler.invokeExact(handler, descriptor) as java.lang.foreign.MemorySegment)

	public fun wgpuTextureSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuTextureSetLabelHandler.invokeExact(handler, label) as Unit)

	public fun wgpuTextureGetWidth(handler: MemorySegment): UInt = (wgpuTextureGetWidthHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuTextureGetHeight(handler: MemorySegment): UInt = (wgpuTextureGetHeightHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuTextureGetDepthOrArrayLayers(handler: MemorySegment): UInt = (wgpuTextureGetDepthOrArrayLayersHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuTextureGetMipLevelCount(handler: MemorySegment): UInt = (wgpuTextureGetMipLevelCountHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuTextureGetSampleCount(handler: MemorySegment): UInt = (wgpuTextureGetSampleCountHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuTextureGetDimension(handler: MemorySegment): UInt = (wgpuTextureGetDimensionHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuTextureGetFormat(handler: MemorySegment): UInt = (wgpuTextureGetFormatHandler.invokeExact(handler) as Int).toUInt()

	public fun wgpuTextureGetUsage(handler: MemorySegment): ULong = (wgpuTextureGetUsageHandler.invokeExact(handler) as Long).toULong()

	public fun wgpuTextureDestroy(handler: MemorySegment): Unit = (wgpuTextureDestroyHandler.invokeExact(handler) as Unit)

	public fun wgpuTextureViewRelease(handler: MemorySegment): Unit = (wgpuTextureViewReleaseHandler.invokeExact(handler) as Unit)

	public fun wgpuTextureViewSetLabel(handler: MemorySegment, label: MemorySegment): Unit = (wgpuTextureViewSetLabelHandler.invokeExact(handler, label) as Unit)
}
