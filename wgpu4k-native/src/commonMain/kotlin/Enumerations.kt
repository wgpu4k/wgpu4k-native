// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import kotlin.UInt
import kotlin.ULong

public typealias WGPUAdapterType = UInt

public const val WGPUAdapterType_DiscreteGPU: WGPUAdapterType = 1u

public const val WGPUAdapterType_IntegratedGPU: WGPUAdapterType = 2u

public const val WGPUAdapterType_CPU: WGPUAdapterType = 3u

public const val WGPUAdapterType_Unknown: WGPUAdapterType = 4u

public typealias WGPUAddressMode = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUAddressMode_Undefined: WGPUAddressMode = 0u

public const val WGPUAddressMode_ClampToEdge: WGPUAddressMode = 1u

public const val WGPUAddressMode_Repeat: WGPUAddressMode = 2u

public const val WGPUAddressMode_MirrorRepeat: WGPUAddressMode = 3u

public typealias WGPUBackendType = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUBackendType_Undefined: WGPUBackendType = 0u

public const val WGPUBackendType_Null: WGPUBackendType = 1u

public const val WGPUBackendType_WebGPU: WGPUBackendType = 2u

public const val WGPUBackendType_D3D11: WGPUBackendType = 3u

public const val WGPUBackendType_D3D12: WGPUBackendType = 4u

public const val WGPUBackendType_Metal: WGPUBackendType = 5u

public const val WGPUBackendType_Vulkan: WGPUBackendType = 6u

public const val WGPUBackendType_OpenGL: WGPUBackendType = 7u

public const val WGPUBackendType_OpenGLES: WGPUBackendType = 8u

public typealias WGPUBlendFactor = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUBlendFactor_Undefined: WGPUBlendFactor = 0u

public const val WGPUBlendFactor_Zero: WGPUBlendFactor = 1u

public const val WGPUBlendFactor_One: WGPUBlendFactor = 2u

public const val WGPUBlendFactor_Src: WGPUBlendFactor = 3u

public const val WGPUBlendFactor_OneMinusSrc: WGPUBlendFactor = 4u

public const val WGPUBlendFactor_SrcAlpha: WGPUBlendFactor = 5u

public const val WGPUBlendFactor_OneMinusSrcAlpha: WGPUBlendFactor = 6u

public const val WGPUBlendFactor_Dst: WGPUBlendFactor = 7u

public const val WGPUBlendFactor_OneMinusDst: WGPUBlendFactor = 8u

public const val WGPUBlendFactor_DstAlpha: WGPUBlendFactor = 9u

public const val WGPUBlendFactor_OneMinusDstAlpha: WGPUBlendFactor = 10u

public const val WGPUBlendFactor_SrcAlphaSaturated: WGPUBlendFactor = 11u

public const val WGPUBlendFactor_Constant: WGPUBlendFactor = 12u

public const val WGPUBlendFactor_OneMinusConstant: WGPUBlendFactor = 13u

public const val WGPUBlendFactor_Src1: WGPUBlendFactor = 14u

public const val WGPUBlendFactor_OneMinusSrc1: WGPUBlendFactor = 15u

public const val WGPUBlendFactor_Src1Alpha: WGPUBlendFactor = 16u

public const val WGPUBlendFactor_OneMinusSrc1Alpha: WGPUBlendFactor = 17u

public typealias WGPUBlendOperation = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUBlendOperation_Undefined: WGPUBlendOperation = 0u

public const val WGPUBlendOperation_Add: WGPUBlendOperation = 1u

public const val WGPUBlendOperation_Subtract: WGPUBlendOperation = 2u

public const val WGPUBlendOperation_ReverseSubtract: WGPUBlendOperation = 3u

public const val WGPUBlendOperation_Min: WGPUBlendOperation = 4u

public const val WGPUBlendOperation_Max: WGPUBlendOperation = 5u

public typealias WGPUBufferBindingType = UInt

/**
 * Indicates that this @ref WGPUBufferBindingLayout member of
 * its parent @ref WGPUBindGroupLayoutEntry is not used.
 * (See also @ref SentinelValues.)
 */
public const val WGPUBufferBindingType_BindingNotUsed: WGPUBufferBindingType = 0u

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUBufferBindingType_Undefined: WGPUBufferBindingType = 1u

public const val WGPUBufferBindingType_Uniform: WGPUBufferBindingType = 2u

public const val WGPUBufferBindingType_Storage: WGPUBufferBindingType = 3u

public const val WGPUBufferBindingType_ReadOnlyStorage: WGPUBufferBindingType = 4u

public typealias WGPUBufferMapState = UInt

public const val WGPUBufferMapState_Unmapped: WGPUBufferMapState = 1u

public const val WGPUBufferMapState_Pending: WGPUBufferMapState = 2u

public const val WGPUBufferMapState_Mapped: WGPUBufferMapState = 3u

/**
 * The callback mode controls how a callback for an asynchronous operation may be fired. See @ref Asynchronous-Operations for how these are used.
 */
public typealias WGPUCallbackMode = UInt

/**
 * Callbacks created with [WGPUCallbackMode_WaitAnyOnly]:
 * - fire when the asynchronous operation's future is passed to a call to [wgpuInstanceWaitAny]
 *   AND the operation has already completed or it completes inside the call to [wgpuInstanceWaitAny].
 */
public const val WGPUCallbackMode_WaitAnyOnly: WGPUCallbackMode = 1u

/**
 * Callbacks created with [WGPUCallbackMode_AllowProcessEvents]:
 * - fire for the same reasons as callbacks created with [WGPUCallbackMode_WaitAnyOnly]
 * - fire inside a call to [wgpuInstanceProcessEvents] if the asynchronous operation is complete.
 */
public const val WGPUCallbackMode_AllowProcessEvents: WGPUCallbackMode = 2u

/**
 * Callbacks created with [WGPUCallbackMode_AllowSpontaneous]:
 * - fire for the same reasons as callbacks created with [WGPUCallbackMode_AllowProcessEvents]
 * - **may** fire spontaneously on an arbitrary or application thread, when the WebGPU implementations discovers that the asynchronous operation is complete.
 *
 *   Implementations _should_ fire spontaneous callbacks as soon as possible.
 *
 * @note Because spontaneous callbacks may fire at an arbitrary time on an arbitrary thread, applications should take extra care when acquiring locks or mutating state inside the callback. It undefined behavior to re-entrantly call into the webgpu.h API if the callback fires while inside the callstack of another webgpu.h function that is not [wgpuInstanceWaitAny] or [wgpuInstanceProcessEvents].
 */
public const val WGPUCallbackMode_AllowSpontaneous: WGPUCallbackMode = 3u

public typealias WGPUCompareFunction = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUCompareFunction_Undefined: WGPUCompareFunction = 0u

public const val WGPUCompareFunction_Never: WGPUCompareFunction = 1u

public const val WGPUCompareFunction_Less: WGPUCompareFunction = 2u

public const val WGPUCompareFunction_Equal: WGPUCompareFunction = 3u

public const val WGPUCompareFunction_LessEqual: WGPUCompareFunction = 4u

public const val WGPUCompareFunction_Greater: WGPUCompareFunction = 5u

public const val WGPUCompareFunction_NotEqual: WGPUCompareFunction = 6u

public const val WGPUCompareFunction_GreaterEqual: WGPUCompareFunction = 7u

public const val WGPUCompareFunction_Always: WGPUCompareFunction = 8u

public typealias WGPUCompilationInfoRequestStatus = UInt

public const val WGPUCompilationInfoRequestStatus_Success: WGPUCompilationInfoRequestStatus = 1u

public const val WGPUCompilationInfoRequestStatus_InstanceDropped: WGPUCompilationInfoRequestStatus
		= 2u

public const val WGPUCompilationInfoRequestStatus_Error: WGPUCompilationInfoRequestStatus = 3u

public const val WGPUCompilationInfoRequestStatus_Unknown: WGPUCompilationInfoRequestStatus = 4u

public typealias WGPUCompilationMessageType = UInt

public const val WGPUCompilationMessageType_Error: WGPUCompilationMessageType = 1u

public const val WGPUCompilationMessageType_Warning: WGPUCompilationMessageType = 2u

public const val WGPUCompilationMessageType_Info: WGPUCompilationMessageType = 3u

/**
 * Describes how frames are composited with other contents on the screen when [wgpuSurfacePresent] is called.
 */
public typealias WGPUCompositeAlphaMode = UInt

/**
 * Lets the WebGPU implementation choose the best mode (supported, and with the best performance) between @ref WGPUCompositeAlphaMode_Opaque or @ref WGPUCompositeAlphaMode_Inherit.
 */
public const val WGPUCompositeAlphaMode_Auto: WGPUCompositeAlphaMode = 0u

/**
 * The alpha component of the image is ignored and teated as if it is always 1.0.
 */
public const val WGPUCompositeAlphaMode_Opaque: WGPUCompositeAlphaMode = 1u

/**
 * The alpha component is respected and non-alpha components are assumed to be already multiplied with the alpha component. For example, (0.5, 0, 0, 0.5) is semi-transparent bright red.
 */
public const val WGPUCompositeAlphaMode_Premultiplied: WGPUCompositeAlphaMode = 2u

/**
 * The alpha component is respected and non-alpha components are assumed to NOT be already multiplied with the alpha component. For example, (1.0, 0, 0, 0.5) is semi-transparent bright red.
 */
public const val WGPUCompositeAlphaMode_Unpremultiplied: WGPUCompositeAlphaMode = 3u

/**
 * The handling of the alpha component is unknown to WebGPU and should be handled by the application using system-specific APIs. This mode may be unavailable (for example on Wasm).
 */
public const val WGPUCompositeAlphaMode_Inherit: WGPUCompositeAlphaMode = 4u

public typealias WGPUCreatePipelineAsyncStatus = UInt

public const val WGPUCreatePipelineAsyncStatus_Success: WGPUCreatePipelineAsyncStatus = 1u

public const val WGPUCreatePipelineAsyncStatus_InstanceDropped: WGPUCreatePipelineAsyncStatus = 2u

public const val WGPUCreatePipelineAsyncStatus_ValidationError: WGPUCreatePipelineAsyncStatus = 3u

public const val WGPUCreatePipelineAsyncStatus_InternalError: WGPUCreatePipelineAsyncStatus = 4u

public const val WGPUCreatePipelineAsyncStatus_Unknown: WGPUCreatePipelineAsyncStatus = 5u

public typealias WGPUCullMode = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUCullMode_Undefined: WGPUCullMode = 0u

public const val WGPUCullMode_None: WGPUCullMode = 1u

public const val WGPUCullMode_Front: WGPUCullMode = 2u

public const val WGPUCullMode_Back: WGPUCullMode = 3u

public typealias WGPUDeviceLostReason = UInt

public const val WGPUDeviceLostReason_Unknown: WGPUDeviceLostReason = 1u

public const val WGPUDeviceLostReason_Destroyed: WGPUDeviceLostReason = 2u

public const val WGPUDeviceLostReason_InstanceDropped: WGPUDeviceLostReason = 3u

public const val WGPUDeviceLostReason_FailedCreation: WGPUDeviceLostReason = 4u

public typealias WGPUErrorFilter = UInt

public const val WGPUErrorFilter_Validation: WGPUErrorFilter = 1u

public const val WGPUErrorFilter_OutOfMemory: WGPUErrorFilter = 2u

public const val WGPUErrorFilter_Internal: WGPUErrorFilter = 3u

public typealias WGPUErrorType = UInt

public const val WGPUErrorType_NoError: WGPUErrorType = 1u

public const val WGPUErrorType_Validation: WGPUErrorType = 2u

public const val WGPUErrorType_OutOfMemory: WGPUErrorType = 3u

public const val WGPUErrorType_Internal: WGPUErrorType = 4u

public const val WGPUErrorType_Unknown: WGPUErrorType = 5u

/**
 * See @ref WGPURequestAdapterOptions::featureLevel.
 */
public typealias WGPUFeatureLevel = UInt

/**
 * "Compatibility" profile which can be supported on OpenGL ES 3.1.
 */
public const val WGPUFeatureLevel_Compatibility: WGPUFeatureLevel = 1u

/**
 * "Core" profile which can be supported on Vulkan/Metal/D3D12.
 */
public const val WGPUFeatureLevel_Core: WGPUFeatureLevel = 2u

public typealias WGPUFeatureName = UInt

public const val WGPUFeatureName_Undefined: WGPUFeatureName = 0u

public const val WGPUFeatureName_DepthClipControl: WGPUFeatureName = 1u

public const val WGPUFeatureName_Depth32FloatStencil8: WGPUFeatureName = 2u

public const val WGPUFeatureName_TimestampQuery: WGPUFeatureName = 3u

public const val WGPUFeatureName_TextureCompressionBC: WGPUFeatureName = 4u

public const val WGPUFeatureName_TextureCompressionBCSliced3D: WGPUFeatureName = 5u

public const val WGPUFeatureName_TextureCompressionETC2: WGPUFeatureName = 6u

public const val WGPUFeatureName_TextureCompressionASTC: WGPUFeatureName = 7u

public const val WGPUFeatureName_TextureCompressionASTCSliced3D: WGPUFeatureName = 8u

public const val WGPUFeatureName_IndirectFirstInstance: WGPUFeatureName = 9u

public const val WGPUFeatureName_ShaderF16: WGPUFeatureName = 10u

public const val WGPUFeatureName_RG11B10UfloatRenderable: WGPUFeatureName = 11u

public const val WGPUFeatureName_BGRA8UnormStorage: WGPUFeatureName = 12u

public const val WGPUFeatureName_Float32Filterable: WGPUFeatureName = 13u

public const val WGPUFeatureName_Float32Blendable: WGPUFeatureName = 14u

public const val WGPUFeatureName_ClipDistances: WGPUFeatureName = 15u

public const val WGPUFeatureName_DualSourceBlending: WGPUFeatureName = 16u

public typealias WGPUFilterMode = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUFilterMode_Undefined: WGPUFilterMode = 0u

public const val WGPUFilterMode_Nearest: WGPUFilterMode = 1u

public const val WGPUFilterMode_Linear: WGPUFilterMode = 2u

public typealias WGPUFrontFace = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUFrontFace_Undefined: WGPUFrontFace = 0u

public const val WGPUFrontFace_CCW: WGPUFrontFace = 1u

public const val WGPUFrontFace_CW: WGPUFrontFace = 2u

public typealias WGPUIndexFormat = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUIndexFormat_Undefined: WGPUIndexFormat = 0u

public const val WGPUIndexFormat_Uint16: WGPUIndexFormat = 1u

public const val WGPUIndexFormat_Uint32: WGPUIndexFormat = 2u

public typealias WGPULoadOp = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPULoadOp_Undefined: WGPULoadOp = 0u

public const val WGPULoadOp_Load: WGPULoadOp = 1u

public const val WGPULoadOp_Clear: WGPULoadOp = 2u

public typealias WGPUMapAsyncStatus = UInt

public const val WGPUMapAsyncStatus_Success: WGPUMapAsyncStatus = 1u

public const val WGPUMapAsyncStatus_InstanceDropped: WGPUMapAsyncStatus = 2u

public const val WGPUMapAsyncStatus_Error: WGPUMapAsyncStatus = 3u

public const val WGPUMapAsyncStatus_Aborted: WGPUMapAsyncStatus = 4u

public const val WGPUMapAsyncStatus_Unknown: WGPUMapAsyncStatus = 5u

public typealias WGPUMipmapFilterMode = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUMipmapFilterMode_Undefined: WGPUMipmapFilterMode = 0u

public const val WGPUMipmapFilterMode_Nearest: WGPUMipmapFilterMode = 1u

public const val WGPUMipmapFilterMode_Linear: WGPUMipmapFilterMode = 2u

public typealias WGPUOptionalBool = UInt

public const val WGPUOptionalBool_False: WGPUOptionalBool = 0u

public const val WGPUOptionalBool_True: WGPUOptionalBool = 1u

public const val WGPUOptionalBool_Undefined: WGPUOptionalBool = 2u

public typealias WGPUPopErrorScopeStatus = UInt

/**
 * The error scope stack was successfully popped and a result was reported.
 */
public const val WGPUPopErrorScopeStatus_Success: WGPUPopErrorScopeStatus = 1u

public const val WGPUPopErrorScopeStatus_InstanceDropped: WGPUPopErrorScopeStatus = 2u

/**
 * The error scope stack could not be popped, because it was empty.
 */
public const val WGPUPopErrorScopeStatus_EmptyStack: WGPUPopErrorScopeStatus = 3u

public typealias WGPUPowerPreference = UInt

/**
 * No preference. (See also @ref SentinelValues.)
 */
public const val WGPUPowerPreference_Undefined: WGPUPowerPreference = 0u

public const val WGPUPowerPreference_LowPower: WGPUPowerPreference = 1u

public const val WGPUPowerPreference_HighPerformance: WGPUPowerPreference = 2u

/**
 * Describes when and in which order frames are presented on the screen when [wgpuSurfacePresent] is called.
 */
public typealias WGPUPresentMode = UInt

/**
 * Present mode is not specified. Use the default.
 */
public const val WGPUPresentMode_Undefined: WGPUPresentMode = 0u

/**
 * The presentation of the image to the user waits for the next vertical blanking period to update in a first-in, first-out manner.
 * Tearing cannot be observed and frame-loop will be limited to the display's refresh rate.
 * This is the only mode that's always available.
 */
public const val WGPUPresentMode_Fifo: WGPUPresentMode = 1u

/**
 * The presentation of the image to the user tries to wait for the next vertical blanking period but may decide to not wait if a frame is presented late.
 * Tearing can sometimes be observed but late-frame don't produce a full-frame stutter in the presentation.
 * This is still a first-in, first-out mechanism so a frame-loop will be limited to the display's refresh rate.
 */
public const val WGPUPresentMode_FifoRelaxed: WGPUPresentMode = 2u

/**
 * The presentation of the image to the user is updated immediately without waiting for a vertical blank.
 * Tearing can be observed but latency is minimized.
 */
public const val WGPUPresentMode_Immediate: WGPUPresentMode = 3u

/**
 * The presentation of the image to the user waits for the next vertical blanking period to update to the latest provided image.
 * Tearing cannot be observed and a frame-loop is not limited to the display's refresh rate.
 */
public const val WGPUPresentMode_Mailbox: WGPUPresentMode = 4u

public typealias WGPUPrimitiveTopology = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUPrimitiveTopology_Undefined: WGPUPrimitiveTopology = 0u

public const val WGPUPrimitiveTopology_PointList: WGPUPrimitiveTopology = 1u

public const val WGPUPrimitiveTopology_LineList: WGPUPrimitiveTopology = 2u

public const val WGPUPrimitiveTopology_LineStrip: WGPUPrimitiveTopology = 3u

public const val WGPUPrimitiveTopology_TriangleList: WGPUPrimitiveTopology = 4u

public const val WGPUPrimitiveTopology_TriangleStrip: WGPUPrimitiveTopology = 5u

public typealias WGPUQueryType = UInt

public const val WGPUQueryType_Occlusion: WGPUQueryType = 1u

public const val WGPUQueryType_Timestamp: WGPUQueryType = 2u

public typealias WGPUQueueWorkDoneStatus = UInt

public const val WGPUQueueWorkDoneStatus_Success: WGPUQueueWorkDoneStatus = 1u

public const val WGPUQueueWorkDoneStatus_InstanceDropped: WGPUQueueWorkDoneStatus = 2u

public const val WGPUQueueWorkDoneStatus_Error: WGPUQueueWorkDoneStatus = 3u

public const val WGPUQueueWorkDoneStatus_Unknown: WGPUQueueWorkDoneStatus = 4u

public typealias WGPURequestAdapterStatus = UInt

public const val WGPURequestAdapterStatus_Success: WGPURequestAdapterStatus = 1u

public const val WGPURequestAdapterStatus_InstanceDropped: WGPURequestAdapterStatus = 2u

public const val WGPURequestAdapterStatus_Unavailable: WGPURequestAdapterStatus = 3u

public const val WGPURequestAdapterStatus_Error: WGPURequestAdapterStatus = 4u

public const val WGPURequestAdapterStatus_Unknown: WGPURequestAdapterStatus = 5u

public typealias WGPURequestDeviceStatus = UInt

public const val WGPURequestDeviceStatus_Success: WGPURequestDeviceStatus = 1u

public const val WGPURequestDeviceStatus_InstanceDropped: WGPURequestDeviceStatus = 2u

public const val WGPURequestDeviceStatus_Error: WGPURequestDeviceStatus = 3u

public const val WGPURequestDeviceStatus_Unknown: WGPURequestDeviceStatus = 4u

public typealias WGPUSType = UInt

public const val WGPUSType_ShaderSourceSPIRV: WGPUSType = 1u

public const val WGPUSType_ShaderSourceWGSL: WGPUSType = 2u

public const val WGPUSType_RenderPassMaxDrawCount: WGPUSType = 3u

public const val WGPUSType_SurfaceSourceMetalLayer: WGPUSType = 4u

public const val WGPUSType_SurfaceSourceWindowsHWND: WGPUSType = 5u

public const val WGPUSType_SurfaceSourceXlibWindow: WGPUSType = 6u

public const val WGPUSType_SurfaceSourceWaylandSurface: WGPUSType = 7u

public const val WGPUSType_SurfaceSourceAndroidNativeWindow: WGPUSType = 8u

public const val WGPUSType_SurfaceSourceXCBWindow: WGPUSType = 9u

public typealias WGPUSamplerBindingType = UInt

/**
 * Indicates that this @ref WGPUSamplerBindingLayout member of
 * its parent @ref WGPUBindGroupLayoutEntry is not used.
 * (See also @ref SentinelValues.)
 */
public const val WGPUSamplerBindingType_BindingNotUsed: WGPUSamplerBindingType = 0u

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUSamplerBindingType_Undefined: WGPUSamplerBindingType = 1u

public const val WGPUSamplerBindingType_Filtering: WGPUSamplerBindingType = 2u

public const val WGPUSamplerBindingType_NonFiltering: WGPUSamplerBindingType = 3u

public const val WGPUSamplerBindingType_Comparison: WGPUSamplerBindingType = 4u

/**
 * Status code returned (synchronously) from many operations. Generally
 * indicates an invalid input like an unknown enum value or @ref OutStructChainError.
 * Read the function's documentation for specific error conditions.
 */
public typealias WGPUStatus = UInt

public const val WGPUStatus_Success: WGPUStatus = 1u

public const val WGPUStatus_Error: WGPUStatus = 2u

public typealias WGPUStencilOperation = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUStencilOperation_Undefined: WGPUStencilOperation = 0u

public const val WGPUStencilOperation_Keep: WGPUStencilOperation = 1u

public const val WGPUStencilOperation_Zero: WGPUStencilOperation = 2u

public const val WGPUStencilOperation_Replace: WGPUStencilOperation = 3u

public const val WGPUStencilOperation_Invert: WGPUStencilOperation = 4u

public const val WGPUStencilOperation_IncrementClamp: WGPUStencilOperation = 5u

public const val WGPUStencilOperation_DecrementClamp: WGPUStencilOperation = 6u

public const val WGPUStencilOperation_IncrementWrap: WGPUStencilOperation = 7u

public const val WGPUStencilOperation_DecrementWrap: WGPUStencilOperation = 8u

public typealias WGPUStorageTextureAccess = UInt

/**
 * Indicates that this @ref WGPUStorageTextureBindingLayout member of
 * its parent @ref WGPUBindGroupLayoutEntry is not used.
 * (See also @ref SentinelValues.)
 */
public const val WGPUStorageTextureAccess_BindingNotUsed: WGPUStorageTextureAccess = 0u

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUStorageTextureAccess_Undefined: WGPUStorageTextureAccess = 1u

public const val WGPUStorageTextureAccess_WriteOnly: WGPUStorageTextureAccess = 2u

public const val WGPUStorageTextureAccess_ReadOnly: WGPUStorageTextureAccess = 3u

public const val WGPUStorageTextureAccess_ReadWrite: WGPUStorageTextureAccess = 4u

public typealias WGPUStoreOp = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUStoreOp_Undefined: WGPUStoreOp = 0u

public const val WGPUStoreOp_Store: WGPUStoreOp = 1u

public const val WGPUStoreOp_Discard: WGPUStoreOp = 2u

/**
 * The status enum for [wgpuSurfaceGetCurrentTexture].
 */
public typealias WGPUSurfaceGetCurrentTextureStatus = UInt

/**
 * Yay! Everything is good and we can render this frame.
 */
public const val WGPUSurfaceGetCurrentTextureStatus_SuccessOptimal:
		WGPUSurfaceGetCurrentTextureStatus = 1u

/**
 * Still OK - the surface can present the frame, but in a suboptimal way. The surface may need reconfiguration.
 */
public const val WGPUSurfaceGetCurrentTextureStatus_SuccessSuboptimal:
		WGPUSurfaceGetCurrentTextureStatus = 2u

/**
 * Some operation timed out while trying to acquire the frame.
 */
public const val WGPUSurfaceGetCurrentTextureStatus_Timeout: WGPUSurfaceGetCurrentTextureStatus = 3u

/**
 * The surface is too different to be used, compared to when it was originally created.
 */
public const val WGPUSurfaceGetCurrentTextureStatus_Outdated: WGPUSurfaceGetCurrentTextureStatus =
		4u

/**
 * The connection to whatever owns the surface was lost.
 */
public const val WGPUSurfaceGetCurrentTextureStatus_Lost: WGPUSurfaceGetCurrentTextureStatus = 5u

/**
 * The system ran out of memory.
 */
public const val WGPUSurfaceGetCurrentTextureStatus_OutOfMemory: WGPUSurfaceGetCurrentTextureStatus
		= 6u

/**
 * The @ref WGPUDevice configured on the @ref WGPUSurface was lost.
 */
public const val WGPUSurfaceGetCurrentTextureStatus_DeviceLost: WGPUSurfaceGetCurrentTextureStatus =
		7u

/**
 * The surface is not configured, or there was an @ref OutStructChainError.
 */
public const val WGPUSurfaceGetCurrentTextureStatus_Error: WGPUSurfaceGetCurrentTextureStatus = 8u

public typealias WGPUTextureAspect = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUTextureAspect_Undefined: WGPUTextureAspect = 0u

public const val WGPUTextureAspect_All: WGPUTextureAspect = 1u

public const val WGPUTextureAspect_StencilOnly: WGPUTextureAspect = 2u

public const val WGPUTextureAspect_DepthOnly: WGPUTextureAspect = 3u

public typealias WGPUTextureDimension = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUTextureDimension_Undefined: WGPUTextureDimension = 0u

public const val WGPUTextureDimension_1D: WGPUTextureDimension = 1u

public const val WGPUTextureDimension_2D: WGPUTextureDimension = 2u

public const val WGPUTextureDimension_3D: WGPUTextureDimension = 3u

public typealias WGPUTextureFormat = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUTextureFormat_Undefined: WGPUTextureFormat = 0u

public const val WGPUTextureFormat_R8Unorm: WGPUTextureFormat = 1u

public const val WGPUTextureFormat_R8Snorm: WGPUTextureFormat = 2u

public const val WGPUTextureFormat_R8Uint: WGPUTextureFormat = 3u

public const val WGPUTextureFormat_R8Sint: WGPUTextureFormat = 4u

public const val WGPUTextureFormat_R16Uint: WGPUTextureFormat = 5u

public const val WGPUTextureFormat_R16Sint: WGPUTextureFormat = 6u

public const val WGPUTextureFormat_R16Float: WGPUTextureFormat = 7u

public const val WGPUTextureFormat_RG8Unorm: WGPUTextureFormat = 8u

public const val WGPUTextureFormat_RG8Snorm: WGPUTextureFormat = 9u

public const val WGPUTextureFormat_RG8Uint: WGPUTextureFormat = 10u

public const val WGPUTextureFormat_RG8Sint: WGPUTextureFormat = 11u

public const val WGPUTextureFormat_R32Float: WGPUTextureFormat = 12u

public const val WGPUTextureFormat_R32Uint: WGPUTextureFormat = 13u

public const val WGPUTextureFormat_R32Sint: WGPUTextureFormat = 14u

public const val WGPUTextureFormat_RG16Uint: WGPUTextureFormat = 15u

public const val WGPUTextureFormat_RG16Sint: WGPUTextureFormat = 16u

public const val WGPUTextureFormat_RG16Float: WGPUTextureFormat = 17u

public const val WGPUTextureFormat_RGBA8Unorm: WGPUTextureFormat = 18u

public const val WGPUTextureFormat_RGBA8UnormSrgb: WGPUTextureFormat = 19u

public const val WGPUTextureFormat_RGBA8Snorm: WGPUTextureFormat = 20u

public const val WGPUTextureFormat_RGBA8Uint: WGPUTextureFormat = 21u

public const val WGPUTextureFormat_RGBA8Sint: WGPUTextureFormat = 22u

public const val WGPUTextureFormat_BGRA8Unorm: WGPUTextureFormat = 23u

public const val WGPUTextureFormat_BGRA8UnormSrgb: WGPUTextureFormat = 24u

public const val WGPUTextureFormat_RGB10A2Uint: WGPUTextureFormat = 25u

public const val WGPUTextureFormat_RGB10A2Unorm: WGPUTextureFormat = 26u

public const val WGPUTextureFormat_RG11B10Ufloat: WGPUTextureFormat = 27u

public const val WGPUTextureFormat_RGB9E5Ufloat: WGPUTextureFormat = 28u

public const val WGPUTextureFormat_RG32Float: WGPUTextureFormat = 29u

public const val WGPUTextureFormat_RG32Uint: WGPUTextureFormat = 30u

public const val WGPUTextureFormat_RG32Sint: WGPUTextureFormat = 31u

public const val WGPUTextureFormat_RGBA16Uint: WGPUTextureFormat = 32u

public const val WGPUTextureFormat_RGBA16Sint: WGPUTextureFormat = 33u

public const val WGPUTextureFormat_RGBA16Float: WGPUTextureFormat = 34u

public const val WGPUTextureFormat_RGBA32Float: WGPUTextureFormat = 35u

public const val WGPUTextureFormat_RGBA32Uint: WGPUTextureFormat = 36u

public const val WGPUTextureFormat_RGBA32Sint: WGPUTextureFormat = 37u

public const val WGPUTextureFormat_Stencil8: WGPUTextureFormat = 38u

public const val WGPUTextureFormat_Depth16Unorm: WGPUTextureFormat = 39u

public const val WGPUTextureFormat_Depth24Plus: WGPUTextureFormat = 40u

public const val WGPUTextureFormat_Depth24PlusStencil8: WGPUTextureFormat = 41u

public const val WGPUTextureFormat_Depth32Float: WGPUTextureFormat = 42u

public const val WGPUTextureFormat_Depth32FloatStencil8: WGPUTextureFormat = 43u

public const val WGPUTextureFormat_BC1RGBAUnorm: WGPUTextureFormat = 44u

public const val WGPUTextureFormat_BC1RGBAUnormSrgb: WGPUTextureFormat = 45u

public const val WGPUTextureFormat_BC2RGBAUnorm: WGPUTextureFormat = 46u

public const val WGPUTextureFormat_BC2RGBAUnormSrgb: WGPUTextureFormat = 47u

public const val WGPUTextureFormat_BC3RGBAUnorm: WGPUTextureFormat = 48u

public const val WGPUTextureFormat_BC3RGBAUnormSrgb: WGPUTextureFormat = 49u

public const val WGPUTextureFormat_BC4RUnorm: WGPUTextureFormat = 50u

public const val WGPUTextureFormat_BC4RSnorm: WGPUTextureFormat = 51u

public const val WGPUTextureFormat_BC5RGUnorm: WGPUTextureFormat = 52u

public const val WGPUTextureFormat_BC5RGSnorm: WGPUTextureFormat = 53u

public const val WGPUTextureFormat_BC6HRGBUfloat: WGPUTextureFormat = 54u

public const val WGPUTextureFormat_BC6HRGBFloat: WGPUTextureFormat = 55u

public const val WGPUTextureFormat_BC7RGBAUnorm: WGPUTextureFormat = 56u

public const val WGPUTextureFormat_BC7RGBAUnormSrgb: WGPUTextureFormat = 57u

public const val WGPUTextureFormat_ETC2RGB8Unorm: WGPUTextureFormat = 58u

public const val WGPUTextureFormat_ETC2RGB8UnormSrgb: WGPUTextureFormat = 59u

public const val WGPUTextureFormat_ETC2RGB8A1Unorm: WGPUTextureFormat = 60u

public const val WGPUTextureFormat_ETC2RGB8A1UnormSrgb: WGPUTextureFormat = 61u

public const val WGPUTextureFormat_ETC2RGBA8Unorm: WGPUTextureFormat = 62u

public const val WGPUTextureFormat_ETC2RGBA8UnormSrgb: WGPUTextureFormat = 63u

public const val WGPUTextureFormat_EACR11Unorm: WGPUTextureFormat = 64u

public const val WGPUTextureFormat_EACR11Snorm: WGPUTextureFormat = 65u

public const val WGPUTextureFormat_EACRG11Unorm: WGPUTextureFormat = 66u

public const val WGPUTextureFormat_EACRG11Snorm: WGPUTextureFormat = 67u

public const val WGPUTextureFormat_ASTC4x4Unorm: WGPUTextureFormat = 68u

public const val WGPUTextureFormat_ASTC4x4UnormSrgb: WGPUTextureFormat = 69u

public const val WGPUTextureFormat_ASTC5x4Unorm: WGPUTextureFormat = 70u

public const val WGPUTextureFormat_ASTC5x4UnormSrgb: WGPUTextureFormat = 71u

public const val WGPUTextureFormat_ASTC5x5Unorm: WGPUTextureFormat = 72u

public const val WGPUTextureFormat_ASTC5x5UnormSrgb: WGPUTextureFormat = 73u

public const val WGPUTextureFormat_ASTC6x5Unorm: WGPUTextureFormat = 74u

public const val WGPUTextureFormat_ASTC6x5UnormSrgb: WGPUTextureFormat = 75u

public const val WGPUTextureFormat_ASTC6x6Unorm: WGPUTextureFormat = 76u

public const val WGPUTextureFormat_ASTC6x6UnormSrgb: WGPUTextureFormat = 77u

public const val WGPUTextureFormat_ASTC8x5Unorm: WGPUTextureFormat = 78u

public const val WGPUTextureFormat_ASTC8x5UnormSrgb: WGPUTextureFormat = 79u

public const val WGPUTextureFormat_ASTC8x6Unorm: WGPUTextureFormat = 80u

public const val WGPUTextureFormat_ASTC8x6UnormSrgb: WGPUTextureFormat = 81u

public const val WGPUTextureFormat_ASTC8x8Unorm: WGPUTextureFormat = 82u

public const val WGPUTextureFormat_ASTC8x8UnormSrgb: WGPUTextureFormat = 83u

public const val WGPUTextureFormat_ASTC10x5Unorm: WGPUTextureFormat = 84u

public const val WGPUTextureFormat_ASTC10x5UnormSrgb: WGPUTextureFormat = 85u

public const val WGPUTextureFormat_ASTC10x6Unorm: WGPUTextureFormat = 86u

public const val WGPUTextureFormat_ASTC10x6UnormSrgb: WGPUTextureFormat = 87u

public const val WGPUTextureFormat_ASTC10x8Unorm: WGPUTextureFormat = 88u

public const val WGPUTextureFormat_ASTC10x8UnormSrgb: WGPUTextureFormat = 89u

public const val WGPUTextureFormat_ASTC10x10Unorm: WGPUTextureFormat = 90u

public const val WGPUTextureFormat_ASTC10x10UnormSrgb: WGPUTextureFormat = 91u

public const val WGPUTextureFormat_ASTC12x10Unorm: WGPUTextureFormat = 92u

public const val WGPUTextureFormat_ASTC12x10UnormSrgb: WGPUTextureFormat = 93u

public const val WGPUTextureFormat_ASTC12x12Unorm: WGPUTextureFormat = 94u

public const val WGPUTextureFormat_ASTC12x12UnormSrgb: WGPUTextureFormat = 95u

public typealias WGPUTextureSampleType = UInt

/**
 * Indicates that this @ref WGPUTextureBindingLayout member of
 * its parent @ref WGPUBindGroupLayoutEntry is not used.
 * (See also @ref SentinelValues.)
 */
public const val WGPUTextureSampleType_BindingNotUsed: WGPUTextureSampleType = 0u

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUTextureSampleType_Undefined: WGPUTextureSampleType = 1u

public const val WGPUTextureSampleType_Float: WGPUTextureSampleType = 2u

public const val WGPUTextureSampleType_UnfilterableFloat: WGPUTextureSampleType = 3u

public const val WGPUTextureSampleType_Depth: WGPUTextureSampleType = 4u

public const val WGPUTextureSampleType_Sint: WGPUTextureSampleType = 5u

public const val WGPUTextureSampleType_Uint: WGPUTextureSampleType = 6u

public typealias WGPUTextureViewDimension = UInt

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUTextureViewDimension_Undefined: WGPUTextureViewDimension = 0u

public const val WGPUTextureViewDimension_1D: WGPUTextureViewDimension = 1u

public const val WGPUTextureViewDimension_2D: WGPUTextureViewDimension = 2u

public const val WGPUTextureViewDimension_2DArray: WGPUTextureViewDimension = 3u

public const val WGPUTextureViewDimension_Cube: WGPUTextureViewDimension = 4u

public const val WGPUTextureViewDimension_CubeArray: WGPUTextureViewDimension = 5u

public const val WGPUTextureViewDimension_3D: WGPUTextureViewDimension = 6u

public typealias WGPUVertexFormat = UInt

public const val WGPUVertexFormat_Uint8: WGPUVertexFormat = 1u

public const val WGPUVertexFormat_Uint8x2: WGPUVertexFormat = 2u

public const val WGPUVertexFormat_Uint8x4: WGPUVertexFormat = 3u

public const val WGPUVertexFormat_Sint8: WGPUVertexFormat = 4u

public const val WGPUVertexFormat_Sint8x2: WGPUVertexFormat = 5u

public const val WGPUVertexFormat_Sint8x4: WGPUVertexFormat = 6u

public const val WGPUVertexFormat_Unorm8: WGPUVertexFormat = 7u

public const val WGPUVertexFormat_Unorm8x2: WGPUVertexFormat = 8u

public const val WGPUVertexFormat_Unorm8x4: WGPUVertexFormat = 9u

public const val WGPUVertexFormat_Snorm8: WGPUVertexFormat = 10u

public const val WGPUVertexFormat_Snorm8x2: WGPUVertexFormat = 11u

public const val WGPUVertexFormat_Snorm8x4: WGPUVertexFormat = 12u

public const val WGPUVertexFormat_Uint16: WGPUVertexFormat = 13u

public const val WGPUVertexFormat_Uint16x2: WGPUVertexFormat = 14u

public const val WGPUVertexFormat_Uint16x4: WGPUVertexFormat = 15u

public const val WGPUVertexFormat_Sint16: WGPUVertexFormat = 16u

public const val WGPUVertexFormat_Sint16x2: WGPUVertexFormat = 17u

public const val WGPUVertexFormat_Sint16x4: WGPUVertexFormat = 18u

public const val WGPUVertexFormat_Unorm16: WGPUVertexFormat = 19u

public const val WGPUVertexFormat_Unorm16x2: WGPUVertexFormat = 20u

public const val WGPUVertexFormat_Unorm16x4: WGPUVertexFormat = 21u

public const val WGPUVertexFormat_Snorm16: WGPUVertexFormat = 22u

public const val WGPUVertexFormat_Snorm16x2: WGPUVertexFormat = 23u

public const val WGPUVertexFormat_Snorm16x4: WGPUVertexFormat = 24u

public const val WGPUVertexFormat_Float16: WGPUVertexFormat = 25u

public const val WGPUVertexFormat_Float16x2: WGPUVertexFormat = 26u

public const val WGPUVertexFormat_Float16x4: WGPUVertexFormat = 27u

public const val WGPUVertexFormat_Float32: WGPUVertexFormat = 28u

public const val WGPUVertexFormat_Float32x2: WGPUVertexFormat = 29u

public const val WGPUVertexFormat_Float32x3: WGPUVertexFormat = 30u

public const val WGPUVertexFormat_Float32x4: WGPUVertexFormat = 31u

public const val WGPUVertexFormat_Uint32: WGPUVertexFormat = 32u

public const val WGPUVertexFormat_Uint32x2: WGPUVertexFormat = 33u

public const val WGPUVertexFormat_Uint32x3: WGPUVertexFormat = 34u

public const val WGPUVertexFormat_Uint32x4: WGPUVertexFormat = 35u

public const val WGPUVertexFormat_Sint32: WGPUVertexFormat = 36u

public const val WGPUVertexFormat_Sint32x2: WGPUVertexFormat = 37u

public const val WGPUVertexFormat_Sint32x3: WGPUVertexFormat = 38u

public const val WGPUVertexFormat_Sint32x4: WGPUVertexFormat = 39u

public const val WGPUVertexFormat_Unorm1010102: WGPUVertexFormat = 40u

public const val WGPUVertexFormat_Unorm8x4BGRA: WGPUVertexFormat = 41u

public typealias WGPUVertexStepMode = UInt

/**
 * This @ref WGPUVertexBufferLayout is a "hole" in the @ref WGPUVertexState [buffers] array.
 * (See also @ref SentinelValues.)
 */
public const val WGPUVertexStepMode_VertexBufferNotUsed: WGPUVertexStepMode = 0u

/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
public const val WGPUVertexStepMode_Undefined: WGPUVertexStepMode = 1u

public const val WGPUVertexStepMode_Vertex: WGPUVertexStepMode = 2u

public const val WGPUVertexStepMode_Instance: WGPUVertexStepMode = 3u

/**
 * Status returned from a call to ::wgpuInstanceWaitAny.
 */
public typealias WGPUWaitStatus = UInt

/**
 * At least one WGPUFuture completed successfully.
 */
public const val WGPUWaitStatus_Success: WGPUWaitStatus = 1u

/**
 * No WGPUFutures completed within the timeout.
 */
public const val WGPUWaitStatus_TimedOut: WGPUWaitStatus = 2u

/**
 * A @ref Timed-Wait was performed when WGPUInstanceFeatures::timedWaitAnyEnable is false.
 */
public const val WGPUWaitStatus_UnsupportedTimeout: WGPUWaitStatus = 3u

/**
 * The number of futures waited on in a @ref Timed-Wait is greater than the supported WGPUInstanceFeatures::timedWaitAnyMaxCount.
 */
public const val WGPUWaitStatus_UnsupportedCount: WGPUWaitStatus = 4u

/**
 * An invalid wait was performed with @ref Mixed-Sources.
 */
public const val WGPUWaitStatus_UnsupportedMixedSources: WGPUWaitStatus = 5u

public typealias WGPUWGSLLanguageFeatureName = UInt

public const val WGPUWGSLLanguageFeatureName_ReadonlyAndReadwriteStorageTextures:
		WGPUWGSLLanguageFeatureName = 1u

public const val WGPUWGSLLanguageFeatureName_Packed4x8IntegerDotProduct: WGPUWGSLLanguageFeatureName
		= 2u

public const val WGPUWGSLLanguageFeatureName_UnrestrictedPointerParameters:
		WGPUWGSLLanguageFeatureName = 3u

public const val WGPUWGSLLanguageFeatureName_PointerCompositeAccess: WGPUWGSLLanguageFeatureName =
		4u

public typealias WGPUGles3MinorVersion = UInt

public const val WGPUGles3MinorVersion_Automatic: WGPUGles3MinorVersion = 0u

public const val WGPUGles3MinorVersion_Version0: WGPUGles3MinorVersion = 1u

public const val WGPUGles3MinorVersion_Version1: WGPUGles3MinorVersion = 2u

public const val WGPUGles3MinorVersion_Version2: WGPUGles3MinorVersion = 3u

public typealias WGPUDx12Compiler = UInt

public const val WGPUDx12Compiler_Undefined: WGPUDx12Compiler = 0u

public const val WGPUDx12Compiler_Fxc: WGPUDx12Compiler = 1u

public const val WGPUDx12Compiler_Dxc: WGPUDx12Compiler = 2u

public typealias WGPULogLevel = UInt

public const val WGPULogLevel_Off: WGPULogLevel = 0u

public const val WGPULogLevel_Error: WGPULogLevel = 1u

public const val WGPULogLevel_Warn: WGPULogLevel = 2u

public const val WGPULogLevel_Info: WGPULogLevel = 3u

public const val WGPULogLevel_Debug: WGPULogLevel = 4u

public const val WGPULogLevel_Trace: WGPULogLevel = 5u

public typealias WGPUGLFenceBehaviour = UInt

public const val WGPUGLFenceBehaviour_Normal: WGPUGLFenceBehaviour = 0u

public const val WGPUGLFenceBehaviour_AutoFinish: WGPUGLFenceBehaviour = 1u

public typealias WGPUDxcMaxShaderModel = UInt

public const val WGPUDxcMaxShaderModel_V60: WGPUDxcMaxShaderModel = 0u

public const val WGPUDxcMaxShaderModel_V61: WGPUDxcMaxShaderModel = 1u

public const val WGPUDxcMaxShaderModel_V62: WGPUDxcMaxShaderModel = 2u

public const val WGPUDxcMaxShaderModel_V63: WGPUDxcMaxShaderModel = 3u

public const val WGPUDxcMaxShaderModel_V64: WGPUDxcMaxShaderModel = 4u

public const val WGPUDxcMaxShaderModel_V65: WGPUDxcMaxShaderModel = 5u

public const val WGPUDxcMaxShaderModel_V66: WGPUDxcMaxShaderModel = 6u

public const val WGPUDxcMaxShaderModel_V67: WGPUDxcMaxShaderModel = 7u

public typealias WGPUNativeSType = UInt

public const val WGPUNativeSType_DeviceExtras: WGPUNativeSType = 196609u

public const val WGPUNativeSType_RequiredLimitsExtras: WGPUNativeSType = 196610u

public const val WGPUNativeSType_PipelineLayoutExtras: WGPUNativeSType = 196611u

public const val WGPUNativeSType_ShaderSourceGLSL: WGPUNativeSType = 196612u

public const val WGPUNativeSType_SupportedLimitsExtras: WGPUNativeSType = 196613u

public const val WGPUNativeSType_InstanceExtras: WGPUNativeSType = 196614u

public const val WGPUNativeSType_BindGroupEntryExtras: WGPUNativeSType = 196615u

public const val WGPUNativeSType_BindGroupLayoutEntryExtras: WGPUNativeSType = 196616u

public const val WGPUNativeSType_QuerySetDescriptorExtras: WGPUNativeSType = 196617u

public const val WGPUNativeSType_SurfaceConfigurationExtras: WGPUNativeSType = 196618u

public const val WGPUNativeSType_SurfaceSourceSwapChainPanel: WGPUNativeSType = 196619u

public const val WGPUNativeSType_PrimitiveStateExtras: WGPUNativeSType = 196620u

public typealias WGPUBufferUsage = ULong

public const val WGPUBufferUsage_None: WGPUBufferUsage = 0uL

public const val WGPUBufferUsage_MapRead: WGPUBufferUsage = 1uL

public const val WGPUBufferUsage_MapWrite: WGPUBufferUsage = 2uL

public const val WGPUBufferUsage_CopySrc: WGPUBufferUsage = 4uL

public const val WGPUBufferUsage_CopyDst: WGPUBufferUsage = 8uL

public const val WGPUBufferUsage_Index: WGPUBufferUsage = 16uL

public const val WGPUBufferUsage_Vertex: WGPUBufferUsage = 32uL

public const val WGPUBufferUsage_Uniform: WGPUBufferUsage = 64uL

public const val WGPUBufferUsage_Storage: WGPUBufferUsage = 128uL

public const val WGPUBufferUsage_Indirect: WGPUBufferUsage = 256uL

public const val WGPUBufferUsage_QueryResolve: WGPUBufferUsage = 512uL

public typealias WGPUColorWriteMask = ULong

public const val WGPUColorWriteMask_None: WGPUColorWriteMask = 0uL

public const val WGPUColorWriteMask_Red: WGPUColorWriteMask = 1uL

public const val WGPUColorWriteMask_Green: WGPUColorWriteMask = 2uL

public const val WGPUColorWriteMask_Blue: WGPUColorWriteMask = 4uL

public const val WGPUColorWriteMask_Alpha: WGPUColorWriteMask = 8uL

public const val WGPUColorWriteMask_All: WGPUColorWriteMask = 15uL

public typealias WGPUMapMode = ULong

public const val WGPUMapMode_None: WGPUMapMode = 0uL

public const val WGPUMapMode_Read: WGPUMapMode = 1uL

public const val WGPUMapMode_Write: WGPUMapMode = 2uL

public typealias WGPUShaderStage = ULong

public const val WGPUShaderStage_None: WGPUShaderStage = 0uL

public const val WGPUShaderStage_Vertex: WGPUShaderStage = 1uL

public const val WGPUShaderStage_Fragment: WGPUShaderStage = 2uL

public const val WGPUShaderStage_Compute: WGPUShaderStage = 4uL

public typealias WGPUTextureUsage = ULong

public const val WGPUTextureUsage_None: WGPUTextureUsage = 0uL

public const val WGPUTextureUsage_CopySrc: WGPUTextureUsage = 1uL

public const val WGPUTextureUsage_CopyDst: WGPUTextureUsage = 2uL

public const val WGPUTextureUsage_TextureBinding: WGPUTextureUsage = 4uL

public const val WGPUTextureUsage_StorageBinding: WGPUTextureUsage = 8uL

public const val WGPUTextureUsage_RenderAttachment: WGPUTextureUsage = 16uL

public typealias WGPUInstanceFlag = ULong

public const val WGPUInstanceFlag_Default: WGPUInstanceFlag = 0uL

public const val WGPUInstanceFlag_Debug: WGPUInstanceFlag = 1uL

public const val WGPUInstanceFlag_Validation: WGPUInstanceFlag = 2uL

public const val WGPUInstanceFlag_DiscardHalLabels: WGPUInstanceFlag = 4uL

public typealias WGPUInstanceBackend = ULong

public const val WGPUInstanceBackend_All: WGPUInstanceBackend = 0uL

public const val WGPUInstanceBackend_Vulkan: WGPUInstanceBackend = 1uL

public const val WGPUInstanceBackend_GL: WGPUInstanceBackend = 2uL

public const val WGPUInstanceBackend_Metal: WGPUInstanceBackend = 4uL

public const val WGPUInstanceBackend_DX12: WGPUInstanceBackend = 8uL

public const val WGPUInstanceBackend_DX11: WGPUInstanceBackend = 16uL

public const val WGPUInstanceBackend_BrowserWebGPU: WGPUInstanceBackend = 32uL

public const val WGPUInstanceBackend_Primary: WGPUInstanceBackend = 45uL

public const val WGPUInstanceBackend_Secondary: WGPUInstanceBackend = 18uL
