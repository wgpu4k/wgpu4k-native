// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

typealias WGPURequestAdapterStatus = UInt
const val WGPURequestAdapterStatus_Success : WGPURequestAdapterStatus = 1u
const val WGPURequestAdapterStatus_Unavailable : WGPURequestAdapterStatus = 2u
const val WGPURequestAdapterStatus_Error : WGPURequestAdapterStatus = 3u
const val WGPURequestAdapterStatus_Unknown : WGPURequestAdapterStatus = 4u

typealias WGPUAdapterType = UInt
const val WGPUAdapterType_DiscreteGPU : WGPUAdapterType = 1u
const val WGPUAdapterType_IntegratedGPU : WGPUAdapterType = 2u
const val WGPUAdapterType_CPU : WGPUAdapterType = 3u
const val WGPUAdapterType_Unknown : WGPUAdapterType = 4u

typealias WGPUAddressMode = UInt
const val WGPUAddressMode_Repeat : WGPUAddressMode = 1u
const val WGPUAddressMode_MirrorRepeat : WGPUAddressMode = 2u
const val WGPUAddressMode_ClampToEdge : WGPUAddressMode = 3u

typealias WGPUBackendType = UInt
const val WGPUBackendType_Undefined : WGPUBackendType = 0u
const val WGPUBackendType_Null : WGPUBackendType = 1u
const val WGPUBackendType_WebGPU : WGPUBackendType = 2u
const val WGPUBackendType_D3D11 : WGPUBackendType = 3u
const val WGPUBackendType_D3D12 : WGPUBackendType = 4u
const val WGPUBackendType_Metal : WGPUBackendType = 5u
const val WGPUBackendType_Vulkan : WGPUBackendType = 6u
const val WGPUBackendType_OpenGL : WGPUBackendType = 7u
const val WGPUBackendType_OpenGLES : WGPUBackendType = 8u

typealias WGPUBufferBindingType = UInt
const val WGPUBufferBindingType_Undefined : WGPUBufferBindingType = 0u
const val WGPUBufferBindingType_Uniform : WGPUBufferBindingType = 1u
const val WGPUBufferBindingType_Storage : WGPUBufferBindingType = 2u
const val WGPUBufferBindingType_ReadOnlyStorage : WGPUBufferBindingType = 3u

typealias WGPUSamplerBindingType = UInt
const val WGPUSamplerBindingType_Undefined : WGPUSamplerBindingType = 0u
const val WGPUSamplerBindingType_Filtering : WGPUSamplerBindingType = 1u
const val WGPUSamplerBindingType_NonFiltering : WGPUSamplerBindingType = 2u
const val WGPUSamplerBindingType_Comparison : WGPUSamplerBindingType = 3u

typealias WGPUTextureSampleType = UInt
const val WGPUTextureSampleType_Undefined : WGPUTextureSampleType = 0u
const val WGPUTextureSampleType_Float : WGPUTextureSampleType = 1u
const val WGPUTextureSampleType_UnfilterableFloat : WGPUTextureSampleType = 2u
const val WGPUTextureSampleType_Depth : WGPUTextureSampleType = 3u
const val WGPUTextureSampleType_Sint : WGPUTextureSampleType = 4u
const val WGPUTextureSampleType_Uint : WGPUTextureSampleType = 5u

typealias WGPUStorageTextureAccess = UInt
const val WGPUStorageTextureAccess_Undefined : WGPUStorageTextureAccess = 0u
const val WGPUStorageTextureAccess_WriteOnly : WGPUStorageTextureAccess = 1u
const val WGPUStorageTextureAccess_ReadOnly : WGPUStorageTextureAccess = 2u
const val WGPUStorageTextureAccess_ReadWrite : WGPUStorageTextureAccess = 3u

typealias WGPUBlendFactor = UInt
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

typealias WGPUBlendOperation = UInt
const val WGPUBlendOperation_Add : WGPUBlendOperation = 1u
const val WGPUBlendOperation_Subtract : WGPUBlendOperation = 2u
const val WGPUBlendOperation_ReverseSubtract : WGPUBlendOperation = 3u
const val WGPUBlendOperation_Min : WGPUBlendOperation = 4u
const val WGPUBlendOperation_Max : WGPUBlendOperation = 5u

typealias WGPUBufferMapAsyncStatus = UInt
const val WGPUBufferMapAsyncStatus_Success : WGPUBufferMapAsyncStatus = 1u
const val WGPUBufferMapAsyncStatus_ValidationError : WGPUBufferMapAsyncStatus = 2u
const val WGPUBufferMapAsyncStatus_Unknown : WGPUBufferMapAsyncStatus = 3u
const val WGPUBufferMapAsyncStatus_DeviceLost : WGPUBufferMapAsyncStatus = 4u
const val WGPUBufferMapAsyncStatus_DestroyedBeforeCallback : WGPUBufferMapAsyncStatus = 5u
const val WGPUBufferMapAsyncStatus_UnmappedBeforeCallback : WGPUBufferMapAsyncStatus = 6u
const val WGPUBufferMapAsyncStatus_MappingAlreadyPending : WGPUBufferMapAsyncStatus = 7u
const val WGPUBufferMapAsyncStatus_OffsetOutOfRange : WGPUBufferMapAsyncStatus = 8u
const val WGPUBufferMapAsyncStatus_SizeOutOfRange : WGPUBufferMapAsyncStatus = 9u

typealias WGPUBufferMapState = UInt
const val WGPUBufferMapState_Unmapped : WGPUBufferMapState = 1u
const val WGPUBufferMapState_Pending : WGPUBufferMapState = 2u
const val WGPUBufferMapState_Mapped : WGPUBufferMapState = 3u

typealias WGPUCompareFunction = UInt
const val WGPUCompareFunction_Undefined : WGPUCompareFunction = 0u
const val WGPUCompareFunction_Never : WGPUCompareFunction = 1u
const val WGPUCompareFunction_Less : WGPUCompareFunction = 2u
const val WGPUCompareFunction_LessEqual : WGPUCompareFunction = 3u
const val WGPUCompareFunction_Greater : WGPUCompareFunction = 4u
const val WGPUCompareFunction_GreaterEqual : WGPUCompareFunction = 5u
const val WGPUCompareFunction_Equal : WGPUCompareFunction = 6u
const val WGPUCompareFunction_NotEqual : WGPUCompareFunction = 7u
const val WGPUCompareFunction_Always : WGPUCompareFunction = 8u

typealias WGPUCompilationInfoRequestStatus = UInt
const val WGPUCompilationInfoRequestStatus_Success : WGPUCompilationInfoRequestStatus = 1u
const val WGPUCompilationInfoRequestStatus_Error : WGPUCompilationInfoRequestStatus = 2u
const val WGPUCompilationInfoRequestStatus_DeviceLost : WGPUCompilationInfoRequestStatus = 3u
const val WGPUCompilationInfoRequestStatus_Unknown : WGPUCompilationInfoRequestStatus = 4u

typealias WGPUCompilationMessageType = UInt
const val WGPUCompilationMessageType_Error : WGPUCompilationMessageType = 1u
const val WGPUCompilationMessageType_Warning : WGPUCompilationMessageType = 2u
const val WGPUCompilationMessageType_Info : WGPUCompilationMessageType = 3u

typealias WGPUCompositeAlphaMode = UInt
const val WGPUCompositeAlphaMode_Auto : WGPUCompositeAlphaMode = 1u
const val WGPUCompositeAlphaMode_Opaque : WGPUCompositeAlphaMode = 2u
const val WGPUCompositeAlphaMode_Premultiplied : WGPUCompositeAlphaMode = 3u
const val WGPUCompositeAlphaMode_Unpremultiplied : WGPUCompositeAlphaMode = 4u
const val WGPUCompositeAlphaMode_Inherit : WGPUCompositeAlphaMode = 5u

typealias WGPUCreatePipelineAsyncStatus = UInt
const val WGPUCreatePipelineAsyncStatus_Success : WGPUCreatePipelineAsyncStatus = 1u
const val WGPUCreatePipelineAsyncStatus_ValidationError : WGPUCreatePipelineAsyncStatus = 2u
const val WGPUCreatePipelineAsyncStatus_InternalError : WGPUCreatePipelineAsyncStatus = 3u
const val WGPUCreatePipelineAsyncStatus_DeviceLost : WGPUCreatePipelineAsyncStatus = 4u
const val WGPUCreatePipelineAsyncStatus_DeviceDestroyed : WGPUCreatePipelineAsyncStatus = 5u
const val WGPUCreatePipelineAsyncStatus_Unknown : WGPUCreatePipelineAsyncStatus = 6u

typealias WGPUCullMode = UInt
const val WGPUCullMode_None : WGPUCullMode = 1u
const val WGPUCullMode_Front : WGPUCullMode = 2u
const val WGPUCullMode_Back : WGPUCullMode = 3u

typealias WGPUDeviceLostReason = UInt
const val WGPUDeviceLostReason_Unknown : WGPUDeviceLostReason = 1u
const val WGPUDeviceLostReason_Destroyed : WGPUDeviceLostReason = 2u

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
const val WGPUErrorType_DeviceLost : WGPUErrorType = 6u

typealias WGPUFeatureName = UInt
const val WGPUFeatureName_Undefined : WGPUFeatureName = 0u
const val WGPUFeatureName_DepthClipControl : WGPUFeatureName = 1u
const val WGPUFeatureName_Depth32FloatStencil8 : WGPUFeatureName = 2u
const val WGPUFeatureName_TimestampQuery : WGPUFeatureName = 3u
const val WGPUFeatureName_TextureCompressionBC : WGPUFeatureName = 4u
const val WGPUFeatureName_TextureCompressionETC2 : WGPUFeatureName = 5u
const val WGPUFeatureName_TextureCompressionASTC : WGPUFeatureName = 6u
const val WGPUFeatureName_IndirectFirstInstance : WGPUFeatureName = 7u
const val WGPUFeatureName_ShaderF16 : WGPUFeatureName = 8u
const val WGPUFeatureName_RG11B10UfloatRenderable : WGPUFeatureName = 9u
const val WGPUFeatureName_BGRA8UnormStorage : WGPUFeatureName = 10u
const val WGPUFeatureName_Float32Filterable : WGPUFeatureName = 11u

typealias WGPUFilterMode = UInt
const val WGPUFilterMode_Nearest : WGPUFilterMode = 1u
const val WGPUFilterMode_Linear : WGPUFilterMode = 2u

typealias WGPUFrontFace = UInt
const val WGPUFrontFace_CCW : WGPUFrontFace = 1u
const val WGPUFrontFace_CW : WGPUFrontFace = 2u

typealias WGPUIndexFormat = UInt
const val WGPUIndexFormat_Undefined : WGPUIndexFormat = 0u
const val WGPUIndexFormat_Uint16 : WGPUIndexFormat = 1u
const val WGPUIndexFormat_Uint32 : WGPUIndexFormat = 2u

typealias WGPUVertexStepMode = UInt
const val WGPUVertexStepMode_Vertex : WGPUVertexStepMode = 1u
const val WGPUVertexStepMode_Instance : WGPUVertexStepMode = 2u
const val WGPUVertexStepMode_VertexBufferNotUsed : WGPUVertexStepMode = 3u

typealias WGPULoadOp = UInt
const val WGPULoadOp_Undefined : WGPULoadOp = 0u
const val WGPULoadOp_Clear : WGPULoadOp = 1u
const val WGPULoadOp_Load : WGPULoadOp = 2u

typealias WGPUMipmapFilterMode = UInt
const val WGPUMipmapFilterMode_Nearest : WGPUMipmapFilterMode = 1u
const val WGPUMipmapFilterMode_Linear : WGPUMipmapFilterMode = 2u

typealias WGPUStoreOp = UInt
const val WGPUStoreOp_Undefined : WGPUStoreOp = 0u
const val WGPUStoreOp_Store : WGPUStoreOp = 1u
const val WGPUStoreOp_Discard : WGPUStoreOp = 2u

typealias WGPUPowerPreference = UInt
const val WGPUPowerPreference_Undefined : WGPUPowerPreference = 0u
const val WGPUPowerPreference_LowPower : WGPUPowerPreference = 1u
const val WGPUPowerPreference_HighPerformance : WGPUPowerPreference = 2u

typealias WGPUPresentMode = UInt
const val WGPUPresentMode_Fifo : WGPUPresentMode = 1u
const val WGPUPresentMode_FifoRelaxed : WGPUPresentMode = 2u
const val WGPUPresentMode_Immediate : WGPUPresentMode = 3u
const val WGPUPresentMode_Mailbox : WGPUPresentMode = 4u

typealias WGPUPrimitiveTopology = UInt
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
const val WGPUQueueWorkDoneStatus_Error : WGPUQueueWorkDoneStatus = 2u
const val WGPUQueueWorkDoneStatus_Unknown : WGPUQueueWorkDoneStatus = 3u
const val WGPUQueueWorkDoneStatus_DeviceLost : WGPUQueueWorkDoneStatus = 4u

typealias WGPURequestDeviceStatus = UInt
const val WGPURequestDeviceStatus_Success : WGPURequestDeviceStatus = 1u
const val WGPURequestDeviceStatus_Error : WGPURequestDeviceStatus = 2u
const val WGPURequestDeviceStatus_Unknown : WGPURequestDeviceStatus = 3u

typealias WGPUStencilOperation = UInt
const val WGPUStencilOperation_Keep : WGPUStencilOperation = 1u
const val WGPUStencilOperation_Zero : WGPUStencilOperation = 2u
const val WGPUStencilOperation_Replace : WGPUStencilOperation = 3u
const val WGPUStencilOperation_Invert : WGPUStencilOperation = 4u
const val WGPUStencilOperation_IncrementClamp : WGPUStencilOperation = 5u
const val WGPUStencilOperation_DecrementClamp : WGPUStencilOperation = 6u
const val WGPUStencilOperation_IncrementWrap : WGPUStencilOperation = 7u
const val WGPUStencilOperation_DecrementWrap : WGPUStencilOperation = 8u

typealias WGPUSType = UInt
const val WGPUSType_Invalid : WGPUSType = 1u
const val WGPUSType_SurfaceDescriptorFromMetalLayer : WGPUSType = 2u
const val WGPUSType_SurfaceDescriptorFromWindowsHWND : WGPUSType = 3u
const val WGPUSType_SurfaceDescriptorFromXlibWindow : WGPUSType = 4u
const val WGPUSType_SurfaceDescriptorFromCanvasHTMLSelector : WGPUSType = 5u
const val WGPUSType_ShaderModuleSPIRVDescriptor : WGPUSType = 6u
const val WGPUSType_ShaderModuleWGSLDescriptor : WGPUSType = 7u
const val WGPUSType_PrimitiveDepthClipControl : WGPUSType = 8u
const val WGPUSType_SurfaceDescriptorFromWaylandSurface : WGPUSType = 9u
const val WGPUSType_SurfaceDescriptorFromAndroidNativeWindow : WGPUSType = 10u
const val WGPUSType_SurfaceDescriptorFromXcbWindow : WGPUSType = 11u
const val WGPUSType_RenderPassDescriptorMaxDrawCount : WGPUSType = 15u

typealias WGPUSurfaceGetCurrentTextureStatus = UInt
const val WGPUSurfaceGetCurrentTextureStatus_Success : WGPUSurfaceGetCurrentTextureStatus = 1u
const val WGPUSurfaceGetCurrentTextureStatus_Timeout : WGPUSurfaceGetCurrentTextureStatus = 2u
const val WGPUSurfaceGetCurrentTextureStatus_Outdated : WGPUSurfaceGetCurrentTextureStatus = 3u
const val WGPUSurfaceGetCurrentTextureStatus_Lost : WGPUSurfaceGetCurrentTextureStatus = 4u
const val WGPUSurfaceGetCurrentTextureStatus_OutOfMemory : WGPUSurfaceGetCurrentTextureStatus = 5u
const val WGPUSurfaceGetCurrentTextureStatus_DeviceLost : WGPUSurfaceGetCurrentTextureStatus = 6u

typealias WGPUTextureAspect = UInt
const val WGPUTextureAspect_All : WGPUTextureAspect = 1u
const val WGPUTextureAspect_StencilOnly : WGPUTextureAspect = 2u
const val WGPUTextureAspect_DepthOnly : WGPUTextureAspect = 3u

typealias WGPUTextureDimension = UInt
const val WGPUTextureDimension_1D : WGPUTextureDimension = 1u
const val WGPUTextureDimension_2D : WGPUTextureDimension = 2u
const val WGPUTextureDimension_3D : WGPUTextureDimension = 3u

typealias WGPUTextureFormat = UInt
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

typealias WGPUTextureViewDimension = UInt
const val WGPUTextureViewDimension_Undefined : WGPUTextureViewDimension = 0u
const val WGPUTextureViewDimension_1D : WGPUTextureViewDimension = 1u
const val WGPUTextureViewDimension_2D : WGPUTextureViewDimension = 2u
const val WGPUTextureViewDimension_2DArray : WGPUTextureViewDimension = 3u
const val WGPUTextureViewDimension_Cube : WGPUTextureViewDimension = 4u
const val WGPUTextureViewDimension_CubeArray : WGPUTextureViewDimension = 5u
const val WGPUTextureViewDimension_3D : WGPUTextureViewDimension = 6u

typealias WGPUVertexFormat = UInt
const val WGPUVertexFormat_Undefined : WGPUVertexFormat = 0u
const val WGPUVertexFormat_Uint8x2 : WGPUVertexFormat = 1u
const val WGPUVertexFormat_Uint8x4 : WGPUVertexFormat = 2u
const val WGPUVertexFormat_Sint8x2 : WGPUVertexFormat = 3u
const val WGPUVertexFormat_Sint8x4 : WGPUVertexFormat = 4u
const val WGPUVertexFormat_Unorm8x2 : WGPUVertexFormat = 5u
const val WGPUVertexFormat_Unorm8x4 : WGPUVertexFormat = 6u
const val WGPUVertexFormat_Snorm8x2 : WGPUVertexFormat = 7u
const val WGPUVertexFormat_Snorm8x4 : WGPUVertexFormat = 8u
const val WGPUVertexFormat_Uint16x2 : WGPUVertexFormat = 9u
const val WGPUVertexFormat_Uint16x4 : WGPUVertexFormat = 10u
const val WGPUVertexFormat_Sint16x2 : WGPUVertexFormat = 11u
const val WGPUVertexFormat_Sint16x4 : WGPUVertexFormat = 12u
const val WGPUVertexFormat_Unorm16x2 : WGPUVertexFormat = 13u
const val WGPUVertexFormat_Unorm16x4 : WGPUVertexFormat = 14u
const val WGPUVertexFormat_Snorm16x2 : WGPUVertexFormat = 15u
const val WGPUVertexFormat_Snorm16x4 : WGPUVertexFormat = 16u
const val WGPUVertexFormat_Float16x2 : WGPUVertexFormat = 17u
const val WGPUVertexFormat_Float16x4 : WGPUVertexFormat = 18u
const val WGPUVertexFormat_Float32 : WGPUVertexFormat = 19u
const val WGPUVertexFormat_Float32x2 : WGPUVertexFormat = 20u
const val WGPUVertexFormat_Float32x3 : WGPUVertexFormat = 21u
const val WGPUVertexFormat_Float32x4 : WGPUVertexFormat = 22u
const val WGPUVertexFormat_Uint32 : WGPUVertexFormat = 23u
const val WGPUVertexFormat_Uint32x2 : WGPUVertexFormat = 24u
const val WGPUVertexFormat_Uint32x3 : WGPUVertexFormat = 25u
const val WGPUVertexFormat_Uint32x4 : WGPUVertexFormat = 26u
const val WGPUVertexFormat_Sint32 : WGPUVertexFormat = 27u
const val WGPUVertexFormat_Sint32x2 : WGPUVertexFormat = 28u
const val WGPUVertexFormat_Sint32x3 : WGPUVertexFormat = 29u
const val WGPUVertexFormat_Sint32x4 : WGPUVertexFormat = 30u

typealias WGPUWGSLFeatureName = UInt
const val WGPUWGSLFeatureName_Undefined : WGPUWGSLFeatureName = 0u
const val WGPUWGSLFeatureName_ReadonlyAndReadwriteStorageTextures : WGPUWGSLFeatureName = 1u
const val WGPUWGSLFeatureName_Packed4x8IntegerDotProduct : WGPUWGSLFeatureName = 2u
const val WGPUWGSLFeatureName_UnrestrictedPointerParameters : WGPUWGSLFeatureName = 3u
const val WGPUWGSLFeatureName_PointerCompositeAccess : WGPUWGSLFeatureName = 4u

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

