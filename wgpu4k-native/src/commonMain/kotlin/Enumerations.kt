// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

typealias WGPUAdapterType = UInt
const val WGPUAdapterType_DiscreteGPU : WGPUAdapterType = 1u
const val WGPUAdapterType_IntegratedGPU : WGPUAdapterType = 2u
const val WGPUAdapterType_CPU : WGPUAdapterType = 3u
const val WGPUAdapterType_Unknown : WGPUAdapterType = 4u

typealias WGPUAddressMode = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUAddressMode_Undefined : WGPUAddressMode = 0u
const val WGPUAddressMode_ClampToEdge : WGPUAddressMode = 1u
const val WGPUAddressMode_Repeat : WGPUAddressMode = 2u
const val WGPUAddressMode_MirrorRepeat : WGPUAddressMode = 3u

typealias WGPUBackendType = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUBackendType_Undefined : WGPUBackendType = 0u
const val WGPUBackendType_Null : WGPUBackendType = 1u
const val WGPUBackendType_WebGPU : WGPUBackendType = 2u
const val WGPUBackendType_D3D11 : WGPUBackendType = 3u
const val WGPUBackendType_D3D12 : WGPUBackendType = 4u
const val WGPUBackendType_Metal : WGPUBackendType = 5u
const val WGPUBackendType_Vulkan : WGPUBackendType = 6u
const val WGPUBackendType_OpenGL : WGPUBackendType = 7u
const val WGPUBackendType_OpenGLES : WGPUBackendType = 8u

typealias WGPUBlendFactor = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUBlendFactor_Undefined : WGPUBlendFactor = 0u
const val WGPUBlendFactor_Zero : WGPUBlendFactor = 1u
const val WGPUBlendFactor_One : WGPUBlendFactor = 2u
const val WGPUBlendFactor_Src : WGPUBlendFactor = 3u
const val WGPUBlendFactor_OneMinusSrc : WGPUBlendFactor = 4u
const val WGPUBlendFactor_SrcAlpha : WGPUBlendFactor = 5u
const val WGPUBlendFactor_OneMinusSrcAlpha : WGPUBlendFactor = 6u
const val WGPUBlendFactor_Dst : WGPUBlendFactor = 7u
const val WGPUBlendFactor_OneMinusDst : WGPUBlendFactor = 8u
const val WGPUBlendFactor_DstAlpha : WGPUBlendFactor = 9u
const val WGPUBlendFactor_OneMinusDstAlpha : WGPUBlendFactor = 10u
const val WGPUBlendFactor_SrcAlphaSaturated : WGPUBlendFactor = 11u
const val WGPUBlendFactor_Constant : WGPUBlendFactor = 12u
const val WGPUBlendFactor_OneMinusConstant : WGPUBlendFactor = 13u
const val WGPUBlendFactor_Src1 : WGPUBlendFactor = 14u
const val WGPUBlendFactor_OneMinusSrc1 : WGPUBlendFactor = 15u
const val WGPUBlendFactor_Src1Alpha : WGPUBlendFactor = 16u
const val WGPUBlendFactor_OneMinusSrc1Alpha : WGPUBlendFactor = 17u

typealias WGPUBlendOperation = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUBlendOperation_Undefined : WGPUBlendOperation = 0u
const val WGPUBlendOperation_Add : WGPUBlendOperation = 1u
const val WGPUBlendOperation_Subtract : WGPUBlendOperation = 2u
const val WGPUBlendOperation_ReverseSubtract : WGPUBlendOperation = 3u
const val WGPUBlendOperation_Min : WGPUBlendOperation = 4u
const val WGPUBlendOperation_Max : WGPUBlendOperation = 5u

typealias WGPUBufferBindingType = UInt
/**
 * Indicates that this @ref WGPUBufferBindingLayout member of
 * its parent @ref WGPUBindGroupLayoutEntry is not used.
 * (See also @ref SentinelValues.)
 */
const val WGPUBufferBindingType_BindingNotUsed : WGPUBufferBindingType = 0u
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUBufferBindingType_Undefined : WGPUBufferBindingType = 1u
const val WGPUBufferBindingType_Uniform : WGPUBufferBindingType = 2u
const val WGPUBufferBindingType_Storage : WGPUBufferBindingType = 3u
const val WGPUBufferBindingType_ReadOnlyStorage : WGPUBufferBindingType = 4u

typealias WGPUBufferMapState = UInt
const val WGPUBufferMapState_Unmapped : WGPUBufferMapState = 1u
const val WGPUBufferMapState_Pending : WGPUBufferMapState = 2u
const val WGPUBufferMapState_Mapped : WGPUBufferMapState = 3u

/**
 * The callback mode controls how a callback for an asynchronous operation may be fired. See @ref Asynchronous-Operations for how these are used.
 */
typealias WGPUCallbackMode = UInt
/**
 * Callbacks created with [WGPUCallbackMode_WaitAnyOnly]:
 * - fire when the asynchronous operation's future is passed to a call to [wgpuInstanceWaitAny]
 *   AND the operation has already completed or it completes inside the call to [wgpuInstanceWaitAny].
 */
const val WGPUCallbackMode_WaitAnyOnly : WGPUCallbackMode = 1u
/**
 * Callbacks created with [WGPUCallbackMode_AllowProcessEvents]:
 * - fire for the same reasons as callbacks created with [WGPUCallbackMode_WaitAnyOnly]
 * - fire inside a call to [wgpuInstanceProcessEvents] if the asynchronous operation is complete.
 */
const val WGPUCallbackMode_AllowProcessEvents : WGPUCallbackMode = 2u
/**
 * Callbacks created with [WGPUCallbackMode_AllowSpontaneous]:
 * - fire for the same reasons as callbacks created with [WGPUCallbackMode_AllowProcessEvents]
 * - **may** fire spontaneously on an arbitrary or application thread, when the WebGPU implementations discovers that the asynchronous operation is complete.
 * 
 *   Implementations _should_ fire spontaneous callbacks as soon as possible.
 * 
 * @note Because spontaneous callbacks may fire at an arbitrary time on an arbitrary thread, applications should take extra care when acquiring locks or mutating state inside the callback. It undefined behavior to re-entrantly call into the webgpu.h API if the callback fires while inside the callstack of another webgpu.h function that is not [wgpuInstanceWaitAny] or [wgpuInstanceProcessEvents].
 */
const val WGPUCallbackMode_AllowSpontaneous : WGPUCallbackMode = 3u

typealias WGPUCompareFunction = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUCompareFunction_Undefined : WGPUCompareFunction = 0u
const val WGPUCompareFunction_Never : WGPUCompareFunction = 1u
const val WGPUCompareFunction_Less : WGPUCompareFunction = 2u
const val WGPUCompareFunction_Equal : WGPUCompareFunction = 3u
const val WGPUCompareFunction_LessEqual : WGPUCompareFunction = 4u
const val WGPUCompareFunction_Greater : WGPUCompareFunction = 5u
const val WGPUCompareFunction_NotEqual : WGPUCompareFunction = 6u
const val WGPUCompareFunction_GreaterEqual : WGPUCompareFunction = 7u
const val WGPUCompareFunction_Always : WGPUCompareFunction = 8u

typealias WGPUCompilationInfoRequestStatus = UInt
const val WGPUCompilationInfoRequestStatus_Success : WGPUCompilationInfoRequestStatus = 1u
const val WGPUCompilationInfoRequestStatus_InstanceDropped : WGPUCompilationInfoRequestStatus = 2u
const val WGPUCompilationInfoRequestStatus_Error : WGPUCompilationInfoRequestStatus = 3u
const val WGPUCompilationInfoRequestStatus_Unknown : WGPUCompilationInfoRequestStatus = 4u

typealias WGPUCompilationMessageType = UInt
const val WGPUCompilationMessageType_Error : WGPUCompilationMessageType = 1u
const val WGPUCompilationMessageType_Warning : WGPUCompilationMessageType = 2u
const val WGPUCompilationMessageType_Info : WGPUCompilationMessageType = 3u

/**
 * Describes how frames are composited with other contents on the screen when [wgpuSurfacePresent] is called.
 */
typealias WGPUCompositeAlphaMode = UInt
/**
 * Lets the WebGPU implementation choose the best mode (supported, and with the best performance) between @ref WGPUCompositeAlphaMode_Opaque or @ref WGPUCompositeAlphaMode_Inherit.
 */
const val WGPUCompositeAlphaMode_Auto : WGPUCompositeAlphaMode = 0u
/**
 * The alpha component of the image is ignored and teated as if it is always 1.0.
 */
const val WGPUCompositeAlphaMode_Opaque : WGPUCompositeAlphaMode = 1u
/**
 * The alpha component is respected and non-alpha components are assumed to be already multiplied with the alpha component. For example, (0.5, 0, 0, 0.5) is semi-transparent bright red.
 */
const val WGPUCompositeAlphaMode_Premultiplied : WGPUCompositeAlphaMode = 2u
/**
 * The alpha component is respected and non-alpha components are assumed to NOT be already multiplied with the alpha component. For example, (1.0, 0, 0, 0.5) is semi-transparent bright red.
 */
const val WGPUCompositeAlphaMode_Unpremultiplied : WGPUCompositeAlphaMode = 3u
/**
 * The handling of the alpha component is unknown to WebGPU and should be handled by the application using system-specific APIs. This mode may be unavailable (for example on Wasm).
 */
const val WGPUCompositeAlphaMode_Inherit : WGPUCompositeAlphaMode = 4u

typealias WGPUCreatePipelineAsyncStatus = UInt
const val WGPUCreatePipelineAsyncStatus_Success : WGPUCreatePipelineAsyncStatus = 1u
const val WGPUCreatePipelineAsyncStatus_InstanceDropped : WGPUCreatePipelineAsyncStatus = 2u
const val WGPUCreatePipelineAsyncStatus_ValidationError : WGPUCreatePipelineAsyncStatus = 3u
const val WGPUCreatePipelineAsyncStatus_InternalError : WGPUCreatePipelineAsyncStatus = 4u
const val WGPUCreatePipelineAsyncStatus_Unknown : WGPUCreatePipelineAsyncStatus = 5u

typealias WGPUCullMode = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUCullMode_Undefined : WGPUCullMode = 0u
const val WGPUCullMode_None : WGPUCullMode = 1u
const val WGPUCullMode_Front : WGPUCullMode = 2u
const val WGPUCullMode_Back : WGPUCullMode = 3u

typealias WGPUDeviceLostReason = UInt
const val WGPUDeviceLostReason_Unknown : WGPUDeviceLostReason = 1u
const val WGPUDeviceLostReason_Destroyed : WGPUDeviceLostReason = 2u
const val WGPUDeviceLostReason_InstanceDropped : WGPUDeviceLostReason = 3u
const val WGPUDeviceLostReason_FailedCreation : WGPUDeviceLostReason = 4u

typealias WGPUErrorFilter = UInt
const val WGPUErrorFilter_Validation : WGPUErrorFilter = 1u
const val WGPUErrorFilter_OutOfMemory : WGPUErrorFilter = 2u
const val WGPUErrorFilter_Internal : WGPUErrorFilter = 3u

typealias WGPUErrorType = UInt
const val WGPUErrorType_NoError : WGPUErrorType = 1u
const val WGPUErrorType_Validation : WGPUErrorType = 2u
const val WGPUErrorType_OutOfMemory : WGPUErrorType = 3u
const val WGPUErrorType_Internal : WGPUErrorType = 4u
const val WGPUErrorType_Unknown : WGPUErrorType = 5u

/**
 * See @ref WGPURequestAdapterOptions::featureLevel.
 */
typealias WGPUFeatureLevel = UInt
/**
 * "Compatibility" profile which can be supported on OpenGL ES 3.1.
 */
const val WGPUFeatureLevel_Compatibility : WGPUFeatureLevel = 1u
/**
 * "Core" profile which can be supported on Vulkan/Metal/D3D12.
 */
const val WGPUFeatureLevel_Core : WGPUFeatureLevel = 2u

typealias WGPUFeatureName = UInt
const val WGPUFeatureName_Undefined : WGPUFeatureName = 0u
const val WGPUFeatureName_DepthClipControl : WGPUFeatureName = 1u
const val WGPUFeatureName_Depth32FloatStencil8 : WGPUFeatureName = 2u
const val WGPUFeatureName_TimestampQuery : WGPUFeatureName = 3u
const val WGPUFeatureName_TextureCompressionBC : WGPUFeatureName = 4u
const val WGPUFeatureName_TextureCompressionBCSliced3D : WGPUFeatureName = 5u
const val WGPUFeatureName_TextureCompressionETC2 : WGPUFeatureName = 6u
const val WGPUFeatureName_TextureCompressionASTC : WGPUFeatureName = 7u
const val WGPUFeatureName_TextureCompressionASTCSliced3D : WGPUFeatureName = 8u
const val WGPUFeatureName_IndirectFirstInstance : WGPUFeatureName = 9u
const val WGPUFeatureName_ShaderF16 : WGPUFeatureName = 10u
const val WGPUFeatureName_RG11B10UfloatRenderable : WGPUFeatureName = 11u
const val WGPUFeatureName_BGRA8UnormStorage : WGPUFeatureName = 12u
const val WGPUFeatureName_Float32Filterable : WGPUFeatureName = 13u
const val WGPUFeatureName_Float32Blendable : WGPUFeatureName = 14u
const val WGPUFeatureName_ClipDistances : WGPUFeatureName = 15u
const val WGPUFeatureName_DualSourceBlending : WGPUFeatureName = 16u

typealias WGPUFilterMode = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUFilterMode_Undefined : WGPUFilterMode = 0u
const val WGPUFilterMode_Nearest : WGPUFilterMode = 1u
const val WGPUFilterMode_Linear : WGPUFilterMode = 2u

typealias WGPUFrontFace = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUFrontFace_Undefined : WGPUFrontFace = 0u
const val WGPUFrontFace_CCW : WGPUFrontFace = 1u
const val WGPUFrontFace_CW : WGPUFrontFace = 2u

typealias WGPUIndexFormat = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUIndexFormat_Undefined : WGPUIndexFormat = 0u
const val WGPUIndexFormat_Uint16 : WGPUIndexFormat = 1u
const val WGPUIndexFormat_Uint32 : WGPUIndexFormat = 2u

typealias WGPULoadOp = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPULoadOp_Undefined : WGPULoadOp = 0u
const val WGPULoadOp_Load : WGPULoadOp = 1u
const val WGPULoadOp_Clear : WGPULoadOp = 2u

typealias WGPUMapAsyncStatus = UInt
const val WGPUMapAsyncStatus_Success : WGPUMapAsyncStatus = 1u
const val WGPUMapAsyncStatus_InstanceDropped : WGPUMapAsyncStatus = 2u
const val WGPUMapAsyncStatus_Error : WGPUMapAsyncStatus = 3u
const val WGPUMapAsyncStatus_Aborted : WGPUMapAsyncStatus = 4u
const val WGPUMapAsyncStatus_Unknown : WGPUMapAsyncStatus = 5u

typealias WGPUMipmapFilterMode = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUMipmapFilterMode_Undefined : WGPUMipmapFilterMode = 0u
const val WGPUMipmapFilterMode_Nearest : WGPUMipmapFilterMode = 1u
const val WGPUMipmapFilterMode_Linear : WGPUMipmapFilterMode = 2u

typealias WGPUOptionalBool = UInt
const val WGPUOptionalBool_False : WGPUOptionalBool = 0u
const val WGPUOptionalBool_True : WGPUOptionalBool = 1u
const val WGPUOptionalBool_Undefined : WGPUOptionalBool = 2u

typealias WGPUPopErrorScopeStatus = UInt
/**
 * The error scope stack was successfully popped and a result was reported.
 */
const val WGPUPopErrorScopeStatus_Success : WGPUPopErrorScopeStatus = 1u
const val WGPUPopErrorScopeStatus_InstanceDropped : WGPUPopErrorScopeStatus = 2u
/**
 * The error scope stack could not be popped, because it was empty.
 */
const val WGPUPopErrorScopeStatus_EmptyStack : WGPUPopErrorScopeStatus = 3u

typealias WGPUPowerPreference = UInt
/**
 * No preference. (See also @ref SentinelValues.)
 */
const val WGPUPowerPreference_Undefined : WGPUPowerPreference = 0u
const val WGPUPowerPreference_LowPower : WGPUPowerPreference = 1u
const val WGPUPowerPreference_HighPerformance : WGPUPowerPreference = 2u

/**
 * Describes when and in which order frames are presented on the screen when [wgpuSurfacePresent] is called.
 */
typealias WGPUPresentMode = UInt
/**
 * Present mode is not specified. Use the default.
 */
const val WGPUPresentMode_Undefined : WGPUPresentMode = 0u
/**
 * The presentation of the image to the user waits for the next vertical blanking period to update in a first-in, first-out manner.
 * Tearing cannot be observed and frame-loop will be limited to the display's refresh rate.
 * This is the only mode that's always available.
 */
const val WGPUPresentMode_Fifo : WGPUPresentMode = 1u
/**
 * The presentation of the image to the user tries to wait for the next vertical blanking period but may decide to not wait if a frame is presented late.
 * Tearing can sometimes be observed but late-frame don't produce a full-frame stutter in the presentation.
 * This is still a first-in, first-out mechanism so a frame-loop will be limited to the display's refresh rate.
 */
const val WGPUPresentMode_FifoRelaxed : WGPUPresentMode = 2u
/**
 * The presentation of the image to the user is updated immediately without waiting for a vertical blank.
 * Tearing can be observed but latency is minimized.
 */
const val WGPUPresentMode_Immediate : WGPUPresentMode = 3u
/**
 * The presentation of the image to the user waits for the next vertical blanking period to update to the latest provided image.
 * Tearing cannot be observed and a frame-loop is not limited to the display's refresh rate.
 */
const val WGPUPresentMode_Mailbox : WGPUPresentMode = 4u

typealias WGPUPrimitiveTopology = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUPrimitiveTopology_Undefined : WGPUPrimitiveTopology = 0u
const val WGPUPrimitiveTopology_PointList : WGPUPrimitiveTopology = 1u
const val WGPUPrimitiveTopology_LineList : WGPUPrimitiveTopology = 2u
const val WGPUPrimitiveTopology_LineStrip : WGPUPrimitiveTopology = 3u
const val WGPUPrimitiveTopology_TriangleList : WGPUPrimitiveTopology = 4u
const val WGPUPrimitiveTopology_TriangleStrip : WGPUPrimitiveTopology = 5u

typealias WGPUQueryType = UInt
const val WGPUQueryType_Occlusion : WGPUQueryType = 1u
const val WGPUQueryType_Timestamp : WGPUQueryType = 2u

typealias WGPUQueueWorkDoneStatus = UInt
const val WGPUQueueWorkDoneStatus_Success : WGPUQueueWorkDoneStatus = 1u
const val WGPUQueueWorkDoneStatus_InstanceDropped : WGPUQueueWorkDoneStatus = 2u
const val WGPUQueueWorkDoneStatus_Error : WGPUQueueWorkDoneStatus = 3u
const val WGPUQueueWorkDoneStatus_Unknown : WGPUQueueWorkDoneStatus = 4u

typealias WGPURequestAdapterStatus = UInt
const val WGPURequestAdapterStatus_Success : WGPURequestAdapterStatus = 1u
const val WGPURequestAdapterStatus_InstanceDropped : WGPURequestAdapterStatus = 2u
const val WGPURequestAdapterStatus_Unavailable : WGPURequestAdapterStatus = 3u
const val WGPURequestAdapterStatus_Error : WGPURequestAdapterStatus = 4u
const val WGPURequestAdapterStatus_Unknown : WGPURequestAdapterStatus = 5u

typealias WGPURequestDeviceStatus = UInt
const val WGPURequestDeviceStatus_Success : WGPURequestDeviceStatus = 1u
const val WGPURequestDeviceStatus_InstanceDropped : WGPURequestDeviceStatus = 2u
const val WGPURequestDeviceStatus_Error : WGPURequestDeviceStatus = 3u
const val WGPURequestDeviceStatus_Unknown : WGPURequestDeviceStatus = 4u

typealias WGPUSType = UInt
const val WGPUSType_ShaderSourceSPIRV : WGPUSType = 1u
const val WGPUSType_ShaderSourceWGSL : WGPUSType = 2u
const val WGPUSType_RenderPassMaxDrawCount : WGPUSType = 3u
const val WGPUSType_SurfaceSourceMetalLayer : WGPUSType = 4u
const val WGPUSType_SurfaceSourceWindowsHWND : WGPUSType = 5u
const val WGPUSType_SurfaceSourceXlibWindow : WGPUSType = 6u
const val WGPUSType_SurfaceSourceWaylandSurface : WGPUSType = 7u
const val WGPUSType_SurfaceSourceAndroidNativeWindow : WGPUSType = 8u
const val WGPUSType_SurfaceSourceXCBWindow : WGPUSType = 9u

typealias WGPUSamplerBindingType = UInt
/**
 * Indicates that this @ref WGPUSamplerBindingLayout member of
 * its parent @ref WGPUBindGroupLayoutEntry is not used.
 * (See also @ref SentinelValues.)
 */
const val WGPUSamplerBindingType_BindingNotUsed : WGPUSamplerBindingType = 0u
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUSamplerBindingType_Undefined : WGPUSamplerBindingType = 1u
const val WGPUSamplerBindingType_Filtering : WGPUSamplerBindingType = 2u
const val WGPUSamplerBindingType_NonFiltering : WGPUSamplerBindingType = 3u
const val WGPUSamplerBindingType_Comparison : WGPUSamplerBindingType = 4u

/**
 * Status code returned (synchronously) from many operations. Generally
 * indicates an invalid input like an unknown enum value or @ref OutStructChainError.
 * Read the function's documentation for specific error conditions.
 */
typealias WGPUStatus = UInt
const val WGPUStatus_Success : WGPUStatus = 1u
const val WGPUStatus_Error : WGPUStatus = 2u

typealias WGPUStencilOperation = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUStencilOperation_Undefined : WGPUStencilOperation = 0u
const val WGPUStencilOperation_Keep : WGPUStencilOperation = 1u
const val WGPUStencilOperation_Zero : WGPUStencilOperation = 2u
const val WGPUStencilOperation_Replace : WGPUStencilOperation = 3u
const val WGPUStencilOperation_Invert : WGPUStencilOperation = 4u
const val WGPUStencilOperation_IncrementClamp : WGPUStencilOperation = 5u
const val WGPUStencilOperation_DecrementClamp : WGPUStencilOperation = 6u
const val WGPUStencilOperation_IncrementWrap : WGPUStencilOperation = 7u
const val WGPUStencilOperation_DecrementWrap : WGPUStencilOperation = 8u

typealias WGPUStorageTextureAccess = UInt
/**
 * Indicates that this @ref WGPUStorageTextureBindingLayout member of
 * its parent @ref WGPUBindGroupLayoutEntry is not used.
 * (See also @ref SentinelValues.)
 */
const val WGPUStorageTextureAccess_BindingNotUsed : WGPUStorageTextureAccess = 0u
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUStorageTextureAccess_Undefined : WGPUStorageTextureAccess = 1u
const val WGPUStorageTextureAccess_WriteOnly : WGPUStorageTextureAccess = 2u
const val WGPUStorageTextureAccess_ReadOnly : WGPUStorageTextureAccess = 3u
const val WGPUStorageTextureAccess_ReadWrite : WGPUStorageTextureAccess = 4u

typealias WGPUStoreOp = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUStoreOp_Undefined : WGPUStoreOp = 0u
const val WGPUStoreOp_Store : WGPUStoreOp = 1u
const val WGPUStoreOp_Discard : WGPUStoreOp = 2u

/**
 * The status enum for [wgpuSurfaceGetCurrentTexture].
 */
typealias WGPUSurfaceGetCurrentTextureStatus = UInt
/**
 * Yay! Everything is good and we can render this frame.
 */
const val WGPUSurfaceGetCurrentTextureStatus_SuccessOptimal : WGPUSurfaceGetCurrentTextureStatus = 1u
/**
 * Still OK - the surface can present the frame, but in a suboptimal way. The surface may need reconfiguration.
 */
const val WGPUSurfaceGetCurrentTextureStatus_SuccessSuboptimal : WGPUSurfaceGetCurrentTextureStatus = 2u
/**
 * Some operation timed out while trying to acquire the frame.
 */
const val WGPUSurfaceGetCurrentTextureStatus_Timeout : WGPUSurfaceGetCurrentTextureStatus = 3u
/**
 * The surface is too different to be used, compared to when it was originally created.
 */
const val WGPUSurfaceGetCurrentTextureStatus_Outdated : WGPUSurfaceGetCurrentTextureStatus = 4u
/**
 * The connection to whatever owns the surface was lost.
 */
const val WGPUSurfaceGetCurrentTextureStatus_Lost : WGPUSurfaceGetCurrentTextureStatus = 5u
/**
 * The system ran out of memory.
 */
const val WGPUSurfaceGetCurrentTextureStatus_OutOfMemory : WGPUSurfaceGetCurrentTextureStatus = 6u
/**
 * The @ref WGPUDevice configured on the @ref WGPUSurface was lost.
 */
const val WGPUSurfaceGetCurrentTextureStatus_DeviceLost : WGPUSurfaceGetCurrentTextureStatus = 7u
/**
 * The surface is not configured, or there was an @ref OutStructChainError.
 */
const val WGPUSurfaceGetCurrentTextureStatus_Error : WGPUSurfaceGetCurrentTextureStatus = 8u

typealias WGPUTextureAspect = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUTextureAspect_Undefined : WGPUTextureAspect = 0u
const val WGPUTextureAspect_All : WGPUTextureAspect = 1u
const val WGPUTextureAspect_StencilOnly : WGPUTextureAspect = 2u
const val WGPUTextureAspect_DepthOnly : WGPUTextureAspect = 3u

typealias WGPUTextureDimension = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUTextureDimension_Undefined : WGPUTextureDimension = 0u
const val WGPUTextureDimension_1D : WGPUTextureDimension = 1u
const val WGPUTextureDimension_2D : WGPUTextureDimension = 2u
const val WGPUTextureDimension_3D : WGPUTextureDimension = 3u

typealias WGPUTextureFormat = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUTextureFormat_Undefined : WGPUTextureFormat = 0u
const val WGPUTextureFormat_R8Unorm : WGPUTextureFormat = 1u
const val WGPUTextureFormat_R8Snorm : WGPUTextureFormat = 2u
const val WGPUTextureFormat_R8Uint : WGPUTextureFormat = 3u
const val WGPUTextureFormat_R8Sint : WGPUTextureFormat = 4u
const val WGPUTextureFormat_R16Uint : WGPUTextureFormat = 5u
const val WGPUTextureFormat_R16Sint : WGPUTextureFormat = 6u
const val WGPUTextureFormat_R16Float : WGPUTextureFormat = 7u
const val WGPUTextureFormat_RG8Unorm : WGPUTextureFormat = 8u
const val WGPUTextureFormat_RG8Snorm : WGPUTextureFormat = 9u
const val WGPUTextureFormat_RG8Uint : WGPUTextureFormat = 10u
const val WGPUTextureFormat_RG8Sint : WGPUTextureFormat = 11u
const val WGPUTextureFormat_R32Float : WGPUTextureFormat = 12u
const val WGPUTextureFormat_R32Uint : WGPUTextureFormat = 13u
const val WGPUTextureFormat_R32Sint : WGPUTextureFormat = 14u
const val WGPUTextureFormat_RG16Uint : WGPUTextureFormat = 15u
const val WGPUTextureFormat_RG16Sint : WGPUTextureFormat = 16u
const val WGPUTextureFormat_RG16Float : WGPUTextureFormat = 17u
const val WGPUTextureFormat_RGBA8Unorm : WGPUTextureFormat = 18u
const val WGPUTextureFormat_RGBA8UnormSrgb : WGPUTextureFormat = 19u
const val WGPUTextureFormat_RGBA8Snorm : WGPUTextureFormat = 20u
const val WGPUTextureFormat_RGBA8Uint : WGPUTextureFormat = 21u
const val WGPUTextureFormat_RGBA8Sint : WGPUTextureFormat = 22u
const val WGPUTextureFormat_BGRA8Unorm : WGPUTextureFormat = 23u
const val WGPUTextureFormat_BGRA8UnormSrgb : WGPUTextureFormat = 24u
const val WGPUTextureFormat_RGB10A2Uint : WGPUTextureFormat = 25u
const val WGPUTextureFormat_RGB10A2Unorm : WGPUTextureFormat = 26u
const val WGPUTextureFormat_RG11B10Ufloat : WGPUTextureFormat = 27u
const val WGPUTextureFormat_RGB9E5Ufloat : WGPUTextureFormat = 28u
const val WGPUTextureFormat_RG32Float : WGPUTextureFormat = 29u
const val WGPUTextureFormat_RG32Uint : WGPUTextureFormat = 30u
const val WGPUTextureFormat_RG32Sint : WGPUTextureFormat = 31u
const val WGPUTextureFormat_RGBA16Uint : WGPUTextureFormat = 32u
const val WGPUTextureFormat_RGBA16Sint : WGPUTextureFormat = 33u
const val WGPUTextureFormat_RGBA16Float : WGPUTextureFormat = 34u
const val WGPUTextureFormat_RGBA32Float : WGPUTextureFormat = 35u
const val WGPUTextureFormat_RGBA32Uint : WGPUTextureFormat = 36u
const val WGPUTextureFormat_RGBA32Sint : WGPUTextureFormat = 37u
const val WGPUTextureFormat_Stencil8 : WGPUTextureFormat = 38u
const val WGPUTextureFormat_Depth16Unorm : WGPUTextureFormat = 39u
const val WGPUTextureFormat_Depth24Plus : WGPUTextureFormat = 40u
const val WGPUTextureFormat_Depth24PlusStencil8 : WGPUTextureFormat = 41u
const val WGPUTextureFormat_Depth32Float : WGPUTextureFormat = 42u
const val WGPUTextureFormat_Depth32FloatStencil8 : WGPUTextureFormat = 43u
const val WGPUTextureFormat_BC1RGBAUnorm : WGPUTextureFormat = 44u
const val WGPUTextureFormat_BC1RGBAUnormSrgb : WGPUTextureFormat = 45u
const val WGPUTextureFormat_BC2RGBAUnorm : WGPUTextureFormat = 46u
const val WGPUTextureFormat_BC2RGBAUnormSrgb : WGPUTextureFormat = 47u
const val WGPUTextureFormat_BC3RGBAUnorm : WGPUTextureFormat = 48u
const val WGPUTextureFormat_BC3RGBAUnormSrgb : WGPUTextureFormat = 49u
const val WGPUTextureFormat_BC4RUnorm : WGPUTextureFormat = 50u
const val WGPUTextureFormat_BC4RSnorm : WGPUTextureFormat = 51u
const val WGPUTextureFormat_BC5RGUnorm : WGPUTextureFormat = 52u
const val WGPUTextureFormat_BC5RGSnorm : WGPUTextureFormat = 53u
const val WGPUTextureFormat_BC6HRGBUfloat : WGPUTextureFormat = 54u
const val WGPUTextureFormat_BC6HRGBFloat : WGPUTextureFormat = 55u
const val WGPUTextureFormat_BC7RGBAUnorm : WGPUTextureFormat = 56u
const val WGPUTextureFormat_BC7RGBAUnormSrgb : WGPUTextureFormat = 57u
const val WGPUTextureFormat_ETC2RGB8Unorm : WGPUTextureFormat = 58u
const val WGPUTextureFormat_ETC2RGB8UnormSrgb : WGPUTextureFormat = 59u
const val WGPUTextureFormat_ETC2RGB8A1Unorm : WGPUTextureFormat = 60u
const val WGPUTextureFormat_ETC2RGB8A1UnormSrgb : WGPUTextureFormat = 61u
const val WGPUTextureFormat_ETC2RGBA8Unorm : WGPUTextureFormat = 62u
const val WGPUTextureFormat_ETC2RGBA8UnormSrgb : WGPUTextureFormat = 63u
const val WGPUTextureFormat_EACR11Unorm : WGPUTextureFormat = 64u
const val WGPUTextureFormat_EACR11Snorm : WGPUTextureFormat = 65u
const val WGPUTextureFormat_EACRG11Unorm : WGPUTextureFormat = 66u
const val WGPUTextureFormat_EACRG11Snorm : WGPUTextureFormat = 67u
const val WGPUTextureFormat_ASTC4x4Unorm : WGPUTextureFormat = 68u
const val WGPUTextureFormat_ASTC4x4UnormSrgb : WGPUTextureFormat = 69u
const val WGPUTextureFormat_ASTC5x4Unorm : WGPUTextureFormat = 70u
const val WGPUTextureFormat_ASTC5x4UnormSrgb : WGPUTextureFormat = 71u
const val WGPUTextureFormat_ASTC5x5Unorm : WGPUTextureFormat = 72u
const val WGPUTextureFormat_ASTC5x5UnormSrgb : WGPUTextureFormat = 73u
const val WGPUTextureFormat_ASTC6x5Unorm : WGPUTextureFormat = 74u
const val WGPUTextureFormat_ASTC6x5UnormSrgb : WGPUTextureFormat = 75u
const val WGPUTextureFormat_ASTC6x6Unorm : WGPUTextureFormat = 76u
const val WGPUTextureFormat_ASTC6x6UnormSrgb : WGPUTextureFormat = 77u
const val WGPUTextureFormat_ASTC8x5Unorm : WGPUTextureFormat = 78u
const val WGPUTextureFormat_ASTC8x5UnormSrgb : WGPUTextureFormat = 79u
const val WGPUTextureFormat_ASTC8x6Unorm : WGPUTextureFormat = 80u
const val WGPUTextureFormat_ASTC8x6UnormSrgb : WGPUTextureFormat = 81u
const val WGPUTextureFormat_ASTC8x8Unorm : WGPUTextureFormat = 82u
const val WGPUTextureFormat_ASTC8x8UnormSrgb : WGPUTextureFormat = 83u
const val WGPUTextureFormat_ASTC10x5Unorm : WGPUTextureFormat = 84u
const val WGPUTextureFormat_ASTC10x5UnormSrgb : WGPUTextureFormat = 85u
const val WGPUTextureFormat_ASTC10x6Unorm : WGPUTextureFormat = 86u
const val WGPUTextureFormat_ASTC10x6UnormSrgb : WGPUTextureFormat = 87u
const val WGPUTextureFormat_ASTC10x8Unorm : WGPUTextureFormat = 88u
const val WGPUTextureFormat_ASTC10x8UnormSrgb : WGPUTextureFormat = 89u
const val WGPUTextureFormat_ASTC10x10Unorm : WGPUTextureFormat = 90u
const val WGPUTextureFormat_ASTC10x10UnormSrgb : WGPUTextureFormat = 91u
const val WGPUTextureFormat_ASTC12x10Unorm : WGPUTextureFormat = 92u
const val WGPUTextureFormat_ASTC12x10UnormSrgb : WGPUTextureFormat = 93u
const val WGPUTextureFormat_ASTC12x12Unorm : WGPUTextureFormat = 94u
const val WGPUTextureFormat_ASTC12x12UnormSrgb : WGPUTextureFormat = 95u

typealias WGPUTextureSampleType = UInt
/**
 * Indicates that this @ref WGPUTextureBindingLayout member of
 * its parent @ref WGPUBindGroupLayoutEntry is not used.
 * (See also @ref SentinelValues.)
 */
const val WGPUTextureSampleType_BindingNotUsed : WGPUTextureSampleType = 0u
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUTextureSampleType_Undefined : WGPUTextureSampleType = 1u
const val WGPUTextureSampleType_Float : WGPUTextureSampleType = 2u
const val WGPUTextureSampleType_UnfilterableFloat : WGPUTextureSampleType = 3u
const val WGPUTextureSampleType_Depth : WGPUTextureSampleType = 4u
const val WGPUTextureSampleType_Sint : WGPUTextureSampleType = 5u
const val WGPUTextureSampleType_Uint : WGPUTextureSampleType = 6u

typealias WGPUTextureViewDimension = UInt
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUTextureViewDimension_Undefined : WGPUTextureViewDimension = 0u
const val WGPUTextureViewDimension_1D : WGPUTextureViewDimension = 1u
const val WGPUTextureViewDimension_2D : WGPUTextureViewDimension = 2u
const val WGPUTextureViewDimension_2DArray : WGPUTextureViewDimension = 3u
const val WGPUTextureViewDimension_Cube : WGPUTextureViewDimension = 4u
const val WGPUTextureViewDimension_CubeArray : WGPUTextureViewDimension = 5u
const val WGPUTextureViewDimension_3D : WGPUTextureViewDimension = 6u

typealias WGPUVertexFormat = UInt
const val WGPUVertexFormat_Uint8 : WGPUVertexFormat = 1u
const val WGPUVertexFormat_Uint8x2 : WGPUVertexFormat = 2u
const val WGPUVertexFormat_Uint8x4 : WGPUVertexFormat = 3u
const val WGPUVertexFormat_Sint8 : WGPUVertexFormat = 4u
const val WGPUVertexFormat_Sint8x2 : WGPUVertexFormat = 5u
const val WGPUVertexFormat_Sint8x4 : WGPUVertexFormat = 6u
const val WGPUVertexFormat_Unorm8 : WGPUVertexFormat = 7u
const val WGPUVertexFormat_Unorm8x2 : WGPUVertexFormat = 8u
const val WGPUVertexFormat_Unorm8x4 : WGPUVertexFormat = 9u
const val WGPUVertexFormat_Snorm8 : WGPUVertexFormat = 10u
const val WGPUVertexFormat_Snorm8x2 : WGPUVertexFormat = 11u
const val WGPUVertexFormat_Snorm8x4 : WGPUVertexFormat = 12u
const val WGPUVertexFormat_Uint16 : WGPUVertexFormat = 13u
const val WGPUVertexFormat_Uint16x2 : WGPUVertexFormat = 14u
const val WGPUVertexFormat_Uint16x4 : WGPUVertexFormat = 15u
const val WGPUVertexFormat_Sint16 : WGPUVertexFormat = 16u
const val WGPUVertexFormat_Sint16x2 : WGPUVertexFormat = 17u
const val WGPUVertexFormat_Sint16x4 : WGPUVertexFormat = 18u
const val WGPUVertexFormat_Unorm16 : WGPUVertexFormat = 19u
const val WGPUVertexFormat_Unorm16x2 : WGPUVertexFormat = 20u
const val WGPUVertexFormat_Unorm16x4 : WGPUVertexFormat = 21u
const val WGPUVertexFormat_Snorm16 : WGPUVertexFormat = 22u
const val WGPUVertexFormat_Snorm16x2 : WGPUVertexFormat = 23u
const val WGPUVertexFormat_Snorm16x4 : WGPUVertexFormat = 24u
const val WGPUVertexFormat_Float16 : WGPUVertexFormat = 25u
const val WGPUVertexFormat_Float16x2 : WGPUVertexFormat = 26u
const val WGPUVertexFormat_Float16x4 : WGPUVertexFormat = 27u
const val WGPUVertexFormat_Float32 : WGPUVertexFormat = 28u
const val WGPUVertexFormat_Float32x2 : WGPUVertexFormat = 29u
const val WGPUVertexFormat_Float32x3 : WGPUVertexFormat = 30u
const val WGPUVertexFormat_Float32x4 : WGPUVertexFormat = 31u
const val WGPUVertexFormat_Uint32 : WGPUVertexFormat = 32u
const val WGPUVertexFormat_Uint32x2 : WGPUVertexFormat = 33u
const val WGPUVertexFormat_Uint32x3 : WGPUVertexFormat = 34u
const val WGPUVertexFormat_Uint32x4 : WGPUVertexFormat = 35u
const val WGPUVertexFormat_Sint32 : WGPUVertexFormat = 36u
const val WGPUVertexFormat_Sint32x2 : WGPUVertexFormat = 37u
const val WGPUVertexFormat_Sint32x3 : WGPUVertexFormat = 38u
const val WGPUVertexFormat_Sint32x4 : WGPUVertexFormat = 39u
const val WGPUVertexFormat_Unorm1010102 : WGPUVertexFormat = 40u
const val WGPUVertexFormat_Unorm8x4BGRA : WGPUVertexFormat = 41u

typealias WGPUVertexStepMode = UInt
/**
 * This @ref WGPUVertexBufferLayout is a "hole" in the @ref WGPUVertexState [buffers] array.
 * (See also @ref SentinelValues.)
 */
const val WGPUVertexStepMode_VertexBufferNotUsed : WGPUVertexStepMode = 0u
/**
 * Indicates no value is passed for this argument. See @ref SentinelValues.
 */
const val WGPUVertexStepMode_Undefined : WGPUVertexStepMode = 1u
const val WGPUVertexStepMode_Vertex : WGPUVertexStepMode = 2u
const val WGPUVertexStepMode_Instance : WGPUVertexStepMode = 3u

/**
 * Status returned from a call to ::wgpuInstanceWaitAny.
 */
typealias WGPUWaitStatus = UInt
/**
 * At least one WGPUFuture completed successfully.
 */
const val WGPUWaitStatus_Success : WGPUWaitStatus = 1u
/**
 * No WGPUFutures completed within the timeout.
 */
const val WGPUWaitStatus_TimedOut : WGPUWaitStatus = 2u
/**
 * A @ref Timed-Wait was performed when WGPUInstanceFeatures::timedWaitAnyEnable is false.
 */
const val WGPUWaitStatus_UnsupportedTimeout : WGPUWaitStatus = 3u
/**
 * The number of futures waited on in a @ref Timed-Wait is greater than the supported WGPUInstanceFeatures::timedWaitAnyMaxCount.
 */
const val WGPUWaitStatus_UnsupportedCount : WGPUWaitStatus = 4u
/**
 * An invalid wait was performed with @ref Mixed-Sources.
 */
const val WGPUWaitStatus_UnsupportedMixedSources : WGPUWaitStatus = 5u

typealias WGPUWGSLLanguageFeatureName = UInt
const val WGPUWGSLLanguageFeatureName_ReadonlyAndReadwriteStorageTextures : WGPUWGSLLanguageFeatureName = 1u
const val WGPUWGSLLanguageFeatureName_Packed4x8IntegerDotProduct : WGPUWGSLLanguageFeatureName = 2u
const val WGPUWGSLLanguageFeatureName_UnrestrictedPointerParameters : WGPUWGSLLanguageFeatureName = 3u
const val WGPUWGSLLanguageFeatureName_PointerCompositeAccess : WGPUWGSLLanguageFeatureName = 4u

typealias WGPUGles3MinorVersion = UInt
const val WGPUGles3MinorVersion_Automatic : WGPUGles3MinorVersion = 0u
const val WGPUGles3MinorVersion_Version0 : WGPUGles3MinorVersion = 1u
const val WGPUGles3MinorVersion_Version1 : WGPUGles3MinorVersion = 2u
const val WGPUGles3MinorVersion_Version2 : WGPUGles3MinorVersion = 3u

typealias WGPUDx12Compiler = UInt
const val WGPUDx12Compiler_Undefined : WGPUDx12Compiler = 0u
const val WGPUDx12Compiler_Fxc : WGPUDx12Compiler = 1u
const val WGPUDx12Compiler_Dxc : WGPUDx12Compiler = 2u

typealias WGPULogLevel = UInt
const val WGPULogLevel_Off : WGPULogLevel = 0u
const val WGPULogLevel_Error : WGPULogLevel = 1u
const val WGPULogLevel_Warn : WGPULogLevel = 2u
const val WGPULogLevel_Info : WGPULogLevel = 3u
const val WGPULogLevel_Debug : WGPULogLevel = 4u
const val WGPULogLevel_Trace : WGPULogLevel = 5u

typealias WGPUNativeSType = UInt
const val WGPUNativeSType_DeviceExtras : WGPUNativeSType = 196609u
const val WGPUNativeSType_RequiredLimitsExtras : WGPUNativeSType = 196610u
const val WGPUNativeSType_PipelineLayoutExtras : WGPUNativeSType = 196611u
const val WGPUNativeSType_ShaderModuleGLSLDescriptor : WGPUNativeSType = 196612u
const val WGPUNativeSType_SupportedLimitsExtras : WGPUNativeSType = 196613u
const val WGPUNativeSType_InstanceExtras : WGPUNativeSType = 196614u
const val WGPUNativeSType_BindGroupEntryExtras : WGPUNativeSType = 196615u
const val WGPUNativeSType_BindGroupLayoutEntryExtras : WGPUNativeSType = 196616u
const val WGPUNativeSType_QuerySetDescriptorExtras : WGPUNativeSType = 196617u
const val WGPUNativeSType_SurfaceConfigurationExtras : WGPUNativeSType = 196618u

typealias WGPUBufferUsage = ULong
const val WGPUBufferUsage_None : WGPUBufferUsage = 0uL
const val WGPUBufferUsage_MapRead : WGPUBufferUsage = 1uL
const val WGPUBufferUsage_MapWrite : WGPUBufferUsage = 2uL
const val WGPUBufferUsage_CopySrc : WGPUBufferUsage = 4uL
const val WGPUBufferUsage_CopyDst : WGPUBufferUsage = 8uL
const val WGPUBufferUsage_Index : WGPUBufferUsage = 16uL
const val WGPUBufferUsage_Vertex : WGPUBufferUsage = 32uL
const val WGPUBufferUsage_Uniform : WGPUBufferUsage = 64uL
const val WGPUBufferUsage_Storage : WGPUBufferUsage = 128uL
const val WGPUBufferUsage_Indirect : WGPUBufferUsage = 256uL
const val WGPUBufferUsage_QueryResolve : WGPUBufferUsage = 512uL

typealias WGPUColorWriteMask = ULong
const val WGPUColorWriteMask_None : WGPUColorWriteMask = 0uL
const val WGPUColorWriteMask_Red : WGPUColorWriteMask = 1uL
const val WGPUColorWriteMask_Green : WGPUColorWriteMask = 2uL
const val WGPUColorWriteMask_Blue : WGPUColorWriteMask = 4uL
const val WGPUColorWriteMask_Alpha : WGPUColorWriteMask = 8uL
const val WGPUColorWriteMask_All : WGPUColorWriteMask = 15uL

typealias WGPUMapMode = ULong
const val WGPUMapMode_None : WGPUMapMode = 0uL
const val WGPUMapMode_Read : WGPUMapMode = 1uL
const val WGPUMapMode_Write : WGPUMapMode = 2uL

typealias WGPUShaderStage = ULong
const val WGPUShaderStage_None : WGPUShaderStage = 0uL
const val WGPUShaderStage_Vertex : WGPUShaderStage = 1uL
const val WGPUShaderStage_Fragment : WGPUShaderStage = 2uL
const val WGPUShaderStage_Compute : WGPUShaderStage = 4uL

typealias WGPUTextureUsage = ULong
const val WGPUTextureUsage_None : WGPUTextureUsage = 0uL
const val WGPUTextureUsage_CopySrc : WGPUTextureUsage = 1uL
const val WGPUTextureUsage_CopyDst : WGPUTextureUsage = 2uL
const val WGPUTextureUsage_TextureBinding : WGPUTextureUsage = 4uL
const val WGPUTextureUsage_StorageBinding : WGPUTextureUsage = 8uL
const val WGPUTextureUsage_RenderAttachment : WGPUTextureUsage = 16uL

typealias WGPUInstanceFlag = ULong
const val WGPUInstanceFlag_Default : WGPUInstanceFlag = 0uL
const val WGPUInstanceFlag_Debug : WGPUInstanceFlag = 1uL
const val WGPUInstanceFlag_Validation : WGPUInstanceFlag = 2uL
const val WGPUInstanceFlag_DiscardHalLabels : WGPUInstanceFlag = 4uL

typealias WGPUInstanceBackend = ULong
const val WGPUInstanceBackend_All : WGPUInstanceBackend = 0uL
const val WGPUInstanceBackend_Vulkan : WGPUInstanceBackend = 1uL
const val WGPUInstanceBackend_GL : WGPUInstanceBackend = 2uL
const val WGPUInstanceBackend_Metal : WGPUInstanceBackend = 4uL
const val WGPUInstanceBackend_DX12 : WGPUInstanceBackend = 8uL
const val WGPUInstanceBackend_DX11 : WGPUInstanceBackend = 16uL
const val WGPUInstanceBackend_BrowserWebGPU : WGPUInstanceBackend = 32uL
const val WGPUInstanceBackend_Primary : WGPUInstanceBackend = 45uL
const val WGPUInstanceBackend_Secondary : WGPUInstanceBackend = 18uL

