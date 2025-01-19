// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

typealias WGPURequestAdapterStatus = UInt
const val WGPURequestAdapterStatus_Success : WGPURequestAdapterStatus = 0u
const val WGPURequestAdapterStatus_Unavailable : WGPURequestAdapterStatus = 1u
const val WGPURequestAdapterStatus_Error : WGPURequestAdapterStatus = 2u
const val WGPURequestAdapterStatus_Unknown : WGPURequestAdapterStatus = 3u

typealias WGPUAdapterType = UInt
const val WGPUAdapterType_DiscreteGPU : WGPUAdapterType = 0u
const val WGPUAdapterType_IntegratedGPU : WGPUAdapterType = 1u
const val WGPUAdapterType_CPU : WGPUAdapterType = 2u
const val WGPUAdapterType_Unknown : WGPUAdapterType = 3u

typealias WGPUAddressMode = UInt
const val WGPUAddressMode_Repeat : WGPUAddressMode = 0u
const val WGPUAddressMode_MirrorRepeat : WGPUAddressMode = 1u
const val WGPUAddressMode_ClampToEdge : WGPUAddressMode = 2u

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
const val WGPUBlendFactor_Zero : WGPUBlendFactor = 0u
const val WGPUBlendFactor_One : WGPUBlendFactor = 1u
const val WGPUBlendFactor_Src : WGPUBlendFactor = 2u
const val WGPUBlendFactor_OneMinusSrc : WGPUBlendFactor = 3u
const val WGPUBlendFactor_SrcAlpha : WGPUBlendFactor = 4u
const val WGPUBlendFactor_OneMinusSrcAlpha : WGPUBlendFactor = 5u
const val WGPUBlendFactor_Dst : WGPUBlendFactor = 6u
const val WGPUBlendFactor_OneMinusDst : WGPUBlendFactor = 7u
const val WGPUBlendFactor_DstAlpha : WGPUBlendFactor = 8u
const val WGPUBlendFactor_OneMinusDstAlpha : WGPUBlendFactor = 9u
const val WGPUBlendFactor_SrcAlphaSaturated : WGPUBlendFactor = 10u
const val WGPUBlendFactor_Constant : WGPUBlendFactor = 11u
const val WGPUBlendFactor_OneMinusConstant : WGPUBlendFactor = 12u

typealias WGPUBlendOperation = UInt
const val WGPUBlendOperation_Add : WGPUBlendOperation = 0u
const val WGPUBlendOperation_Subtract : WGPUBlendOperation = 1u
const val WGPUBlendOperation_ReverseSubtract : WGPUBlendOperation = 2u
const val WGPUBlendOperation_Min : WGPUBlendOperation = 3u
const val WGPUBlendOperation_Max : WGPUBlendOperation = 4u

typealias WGPUBufferMapAsyncStatus = UInt
const val WGPUBufferMapAsyncStatus_Success : WGPUBufferMapAsyncStatus = 0u
const val WGPUBufferMapAsyncStatus_ValidationError : WGPUBufferMapAsyncStatus = 1u
const val WGPUBufferMapAsyncStatus_Unknown : WGPUBufferMapAsyncStatus = 2u
const val WGPUBufferMapAsyncStatus_DeviceLost : WGPUBufferMapAsyncStatus = 3u
const val WGPUBufferMapAsyncStatus_DestroyedBeforeCallback : WGPUBufferMapAsyncStatus = 4u
const val WGPUBufferMapAsyncStatus_UnmappedBeforeCallback : WGPUBufferMapAsyncStatus = 5u
const val WGPUBufferMapAsyncStatus_MappingAlreadyPending : WGPUBufferMapAsyncStatus = 6u
const val WGPUBufferMapAsyncStatus_OffsetOutOfRange : WGPUBufferMapAsyncStatus = 7u
const val WGPUBufferMapAsyncStatus_SizeOutOfRange : WGPUBufferMapAsyncStatus = 8u

typealias WGPUBufferMapState = UInt
const val WGPUBufferMapState_Unmapped : WGPUBufferMapState = 0u
const val WGPUBufferMapState_Pending : WGPUBufferMapState = 1u
const val WGPUBufferMapState_Mapped : WGPUBufferMapState = 2u

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
const val WGPUCompilationInfoRequestStatus_Success : WGPUCompilationInfoRequestStatus = 0u
const val WGPUCompilationInfoRequestStatus_Error : WGPUCompilationInfoRequestStatus = 1u
const val WGPUCompilationInfoRequestStatus_DeviceLost : WGPUCompilationInfoRequestStatus = 2u
const val WGPUCompilationInfoRequestStatus_Unknown : WGPUCompilationInfoRequestStatus = 3u

typealias WGPUCompilationMessageType = UInt
const val WGPUCompilationMessageType_Error : WGPUCompilationMessageType = 0u
const val WGPUCompilationMessageType_Warning : WGPUCompilationMessageType = 1u
const val WGPUCompilationMessageType_Info : WGPUCompilationMessageType = 2u

typealias WGPUCompositeAlphaMode = UInt
const val WGPUCompositeAlphaMode_Auto : WGPUCompositeAlphaMode = 0u
const val WGPUCompositeAlphaMode_Opaque : WGPUCompositeAlphaMode = 1u
const val WGPUCompositeAlphaMode_Premultiplied : WGPUCompositeAlphaMode = 2u
const val WGPUCompositeAlphaMode_Unpremultiplied : WGPUCompositeAlphaMode = 3u
const val WGPUCompositeAlphaMode_Inherit : WGPUCompositeAlphaMode = 4u

typealias WGPUCreatePipelineAsyncStatus = UInt
const val WGPUCreatePipelineAsyncStatus_Success : WGPUCreatePipelineAsyncStatus = 0u
const val WGPUCreatePipelineAsyncStatus_ValidationError : WGPUCreatePipelineAsyncStatus = 1u
const val WGPUCreatePipelineAsyncStatus_InternalError : WGPUCreatePipelineAsyncStatus = 2u
const val WGPUCreatePipelineAsyncStatus_DeviceLost : WGPUCreatePipelineAsyncStatus = 3u
const val WGPUCreatePipelineAsyncStatus_DeviceDestroyed : WGPUCreatePipelineAsyncStatus = 4u
const val WGPUCreatePipelineAsyncStatus_Unknown : WGPUCreatePipelineAsyncStatus = 5u

typealias WGPUCullMode = UInt
const val WGPUCullMode_None : WGPUCullMode = 0u
const val WGPUCullMode_Front : WGPUCullMode = 1u
const val WGPUCullMode_Back : WGPUCullMode = 2u

typealias WGPUDeviceLostReason = UInt
const val WGPUDeviceLostReason_Unknown : WGPUDeviceLostReason = 1u
const val WGPUDeviceLostReason_Destroyed : WGPUDeviceLostReason = 2u

typealias WGPUErrorFilter = UInt
const val WGPUErrorFilter_Validation : WGPUErrorFilter = 0u
const val WGPUErrorFilter_OutOfMemory : WGPUErrorFilter = 1u
const val WGPUErrorFilter_Internal : WGPUErrorFilter = 2u

typealias WGPUErrorType = UInt
const val WGPUErrorType_NoError : WGPUErrorType = 0u
const val WGPUErrorType_Validation : WGPUErrorType = 1u
const val WGPUErrorType_OutOfMemory : WGPUErrorType = 2u
const val WGPUErrorType_Internal : WGPUErrorType = 3u
const val WGPUErrorType_Unknown : WGPUErrorType = 4u
const val WGPUErrorType_DeviceLost : WGPUErrorType = 5u

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
const val WGPUFilterMode_Nearest : WGPUFilterMode = 0u
const val WGPUFilterMode_Linear : WGPUFilterMode = 1u

typealias WGPUFrontFace = UInt
const val WGPUFrontFace_CCW : WGPUFrontFace = 0u
const val WGPUFrontFace_CW : WGPUFrontFace = 1u

typealias WGPUIndexFormat = UInt
const val WGPUIndexFormat_Undefined : WGPUIndexFormat = 0u
const val WGPUIndexFormat_Uint16 : WGPUIndexFormat = 1u
const val WGPUIndexFormat_Uint32 : WGPUIndexFormat = 2u

typealias WGPUVertexStepMode = UInt
const val WGPUVertexStepMode_Vertex : WGPUVertexStepMode = 0u
const val WGPUVertexStepMode_Instance : WGPUVertexStepMode = 1u
const val WGPUVertexStepMode_VertexBufferNotUsed : WGPUVertexStepMode = 2u

typealias WGPULoadOp = UInt
const val WGPULoadOp_Undefined : WGPULoadOp = 0u
const val WGPULoadOp_Clear : WGPULoadOp = 1u
const val WGPULoadOp_Load : WGPULoadOp = 2u

typealias WGPUMipmapFilterMode = UInt
const val WGPUMipmapFilterMode_Nearest : WGPUMipmapFilterMode = 0u
const val WGPUMipmapFilterMode_Linear : WGPUMipmapFilterMode = 1u

typealias WGPUStoreOp = UInt
const val WGPUStoreOp_Undefined : WGPUStoreOp = 0u
const val WGPUStoreOp_Store : WGPUStoreOp = 1u
const val WGPUStoreOp_Discard : WGPUStoreOp = 2u

typealias WGPUPowerPreference = UInt
const val WGPUPowerPreference_Undefined : WGPUPowerPreference = 0u
const val WGPUPowerPreference_LowPower : WGPUPowerPreference = 1u
const val WGPUPowerPreference_HighPerformance : WGPUPowerPreference = 2u

typealias WGPUPresentMode = UInt
const val WGPUPresentMode_Fifo : WGPUPresentMode = 0u
const val WGPUPresentMode_FifoRelaxed : WGPUPresentMode = 1u
const val WGPUPresentMode_Immediate : WGPUPresentMode = 2u
const val WGPUPresentMode_Mailbox : WGPUPresentMode = 3u

typealias WGPUPrimitiveTopology = UInt
const val WGPUPrimitiveTopology_PointList : WGPUPrimitiveTopology = 0u
const val WGPUPrimitiveTopology_LineList : WGPUPrimitiveTopology = 1u
const val WGPUPrimitiveTopology_LineStrip : WGPUPrimitiveTopology = 2u
const val WGPUPrimitiveTopology_TriangleList : WGPUPrimitiveTopology = 3u
const val WGPUPrimitiveTopology_TriangleStrip : WGPUPrimitiveTopology = 4u

typealias WGPUQueryType = UInt
const val WGPUQueryType_Occlusion : WGPUQueryType = 0u
const val WGPUQueryType_Timestamp : WGPUQueryType = 1u

typealias WGPUQueueWorkDoneStatus = UInt
const val WGPUQueueWorkDoneStatus_Success : WGPUQueueWorkDoneStatus = 0u
const val WGPUQueueWorkDoneStatus_Error : WGPUQueueWorkDoneStatus = 1u
const val WGPUQueueWorkDoneStatus_Unknown : WGPUQueueWorkDoneStatus = 2u
const val WGPUQueueWorkDoneStatus_DeviceLost : WGPUQueueWorkDoneStatus = 3u

typealias WGPURequestDeviceStatus = UInt
const val WGPURequestDeviceStatus_Success : WGPURequestDeviceStatus = 0u
const val WGPURequestDeviceStatus_Error : WGPURequestDeviceStatus = 1u
const val WGPURequestDeviceStatus_Unknown : WGPURequestDeviceStatus = 2u

typealias WGPUStencilOperation = UInt
const val WGPUStencilOperation_Keep : WGPUStencilOperation = 0u
const val WGPUStencilOperation_Zero : WGPUStencilOperation = 1u
const val WGPUStencilOperation_Replace : WGPUStencilOperation = 2u
const val WGPUStencilOperation_Invert : WGPUStencilOperation = 3u
const val WGPUStencilOperation_IncrementClamp : WGPUStencilOperation = 4u
const val WGPUStencilOperation_DecrementClamp : WGPUStencilOperation = 5u
const val WGPUStencilOperation_IncrementWrap : WGPUStencilOperation = 6u
const val WGPUStencilOperation_DecrementWrap : WGPUStencilOperation = 7u

typealias WGPUSType = UInt
const val WGPUSType_Invalid : WGPUSType = 0u
const val WGPUSType_SurfaceDescriptorFromMetalLayer : WGPUSType = 1u
const val WGPUSType_SurfaceDescriptorFromWindowsHWND : WGPUSType = 2u
const val WGPUSType_SurfaceDescriptorFromXlibWindow : WGPUSType = 3u
const val WGPUSType_SurfaceDescriptorFromCanvasHTMLSelector : WGPUSType = 4u
const val WGPUSType_ShaderModuleSPIRVDescriptor : WGPUSType = 5u
const val WGPUSType_ShaderModuleWGSLDescriptor : WGPUSType = 6u
const val WGPUSType_PrimitiveDepthClipControl : WGPUSType = 7u
const val WGPUSType_SurfaceDescriptorFromWaylandSurface : WGPUSType = 8u
const val WGPUSType_SurfaceDescriptorFromAndroidNativeWindow : WGPUSType = 9u
const val WGPUSType_SurfaceDescriptorFromXcbWindow : WGPUSType = 10u
const val WGPUSType_RenderPassDescriptorMaxDrawCount : WGPUSType = 15u

typealias WGPUSurfaceGetCurrentTextureStatus = UInt
const val WGPUSurfaceGetCurrentTextureStatus_Success : WGPUSurfaceGetCurrentTextureStatus = 0u
const val WGPUSurfaceGetCurrentTextureStatus_Timeout : WGPUSurfaceGetCurrentTextureStatus = 1u
const val WGPUSurfaceGetCurrentTextureStatus_Outdated : WGPUSurfaceGetCurrentTextureStatus = 2u
const val WGPUSurfaceGetCurrentTextureStatus_Lost : WGPUSurfaceGetCurrentTextureStatus = 3u
const val WGPUSurfaceGetCurrentTextureStatus_OutOfMemory : WGPUSurfaceGetCurrentTextureStatus = 4u
const val WGPUSurfaceGetCurrentTextureStatus_DeviceLost : WGPUSurfaceGetCurrentTextureStatus = 5u

typealias WGPUTextureAspect = UInt
const val WGPUTextureAspect_All : WGPUTextureAspect = 0u
const val WGPUTextureAspect_StencilOnly : WGPUTextureAspect = 1u
const val WGPUTextureAspect_DepthOnly : WGPUTextureAspect = 2u

typealias WGPUTextureDimension = UInt
const val WGPUTextureDimension_1D : WGPUTextureDimension = 0u
const val WGPUTextureDimension_2D : WGPUTextureDimension = 1u
const val WGPUTextureDimension_3D : WGPUTextureDimension = 2u

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

typealias WGPUBufferUsage = UInt
const val WGPUBufferUsage_None : WGPUBufferUsage = 0u
const val WGPUBufferUsage_MapRead : WGPUBufferUsage = 1u
const val WGPUBufferUsage_MapWrite : WGPUBufferUsage = 2u
const val WGPUBufferUsage_CopySrc : WGPUBufferUsage = 4u
const val WGPUBufferUsage_CopyDst : WGPUBufferUsage = 8u
const val WGPUBufferUsage_Index : WGPUBufferUsage = 16u
const val WGPUBufferUsage_Vertex : WGPUBufferUsage = 32u
const val WGPUBufferUsage_Uniform : WGPUBufferUsage = 64u
const val WGPUBufferUsage_Storage : WGPUBufferUsage = 128u
const val WGPUBufferUsage_Indirect : WGPUBufferUsage = 256u
const val WGPUBufferUsage_QueryResolve : WGPUBufferUsage = 512u

typealias WGPUColorWriteMask = UInt
const val WGPUColorWriteMask_None : WGPUColorWriteMask = 0u
const val WGPUColorWriteMask_Red : WGPUColorWriteMask = 1u
const val WGPUColorWriteMask_Green : WGPUColorWriteMask = 2u
const val WGPUColorWriteMask_Blue : WGPUColorWriteMask = 4u
const val WGPUColorWriteMask_Alpha : WGPUColorWriteMask = 8u
const val WGPUColorWriteMask_All : WGPUColorWriteMask = 15u

typealias WGPUMapMode = UInt
const val WGPUMapMode_None : WGPUMapMode = 0u
const val WGPUMapMode_Read : WGPUMapMode = 1u
const val WGPUMapMode_Write : WGPUMapMode = 2u

typealias WGPUShaderStage = UInt
const val WGPUShaderStage_None : WGPUShaderStage = 0u
const val WGPUShaderStage_Vertex : WGPUShaderStage = 1u
const val WGPUShaderStage_Fragment : WGPUShaderStage = 2u
const val WGPUShaderStage_Compute : WGPUShaderStage = 4u

typealias WGPUTextureUsage = UInt
const val WGPUTextureUsage_None : WGPUTextureUsage = 0u
const val WGPUTextureUsage_CopySrc : WGPUTextureUsage = 1u
const val WGPUTextureUsage_CopyDst : WGPUTextureUsage = 2u
const val WGPUTextureUsage_TextureBinding : WGPUTextureUsage = 4u
const val WGPUTextureUsage_StorageBinding : WGPUTextureUsage = 8u
const val WGPUTextureUsage_RenderAttachment : WGPUTextureUsage = 16u

typealias WGPUInstanceFlag = UInt
const val WGPUInstanceFlag_Default : WGPUInstanceFlag = 0u
const val WGPUInstanceFlag_Debug : WGPUInstanceFlag = 1u
const val WGPUInstanceFlag_Validation : WGPUInstanceFlag = 2u
const val WGPUInstanceFlag_DiscardHalLabels : WGPUInstanceFlag = 4u

typealias WGPUInstanceBackend = UInt
const val WGPUInstanceBackend_All : WGPUInstanceBackend = 0u
const val WGPUInstanceBackend_Vulkan : WGPUInstanceBackend = 1u
const val WGPUInstanceBackend_GL : WGPUInstanceBackend = 2u
const val WGPUInstanceBackend_Metal : WGPUInstanceBackend = 4u
const val WGPUInstanceBackend_DX12 : WGPUInstanceBackend = 8u
const val WGPUInstanceBackend_DX11 : WGPUInstanceBackend = 16u
const val WGPUInstanceBackend_BrowserWebGPU : WGPUInstanceBackend = 32u
const val WGPUInstanceBackend_Primary : WGPUInstanceBackend = 45u
const val WGPUInstanceBackend_Secondary : WGPUInstanceBackend = 18u

