package io.ygdrasil.wgpu.nativeWgpu4k

import com.sun.jna.Native

object NativeWgpu4k {

    init {
        Native.register(NativeWgpu4k::class.java, "wgpu4k")
    }

    /*** Instance ***/
    external fun wgpuCreateInstance(descriptor: Long): Long
    external fun wgpuInstanceRelease(handler: Long)
    external fun wgpuInstanceCreateSurface(handler: Long, descriptor: Long): Long
    external fun wgpuInstanceRequestAdapterNoCallback(handler: Long, descriptor: Long): Long
    /** TODO
     * external fun wgpuInstanceEnumerateAdapters
     * external fun wgpuInstanceHasWGSLLanguageFeature
     * external fun wgpuInstanceProcessEvents
     * external fun wgpuInstanceReference
     */

    /*** Surface ***/
    external fun wgpuSurfaceRelease(handler: Long)
    external fun wgpuSurfaceConfigure(handler: Long, descriptor: Long)
    external fun wgpuSurfaceGetCurrentTexture(handler: Long, surfaceTexture: Long): Long
    external fun wgpuSurfaceGetCapabilities(handler: Long, adapter: Long, surfaceCapabilities: Long)
    /** TODO
     * external fun wgpuSurfaceUnconfigure
     * external fun wgpuSurfaceSetLabel
     * external fun wgpuSurfaceReference
     * external fun wgpuSurfaceCapabilitiesFreeMembers
     */

    /*** TextureView ***/
    external fun wgpuTextureViewRelease(handler: Long)
    external fun wgpuTextureRelease(handler: Long)

    /*** RenderPassEncoder ***/
    external fun wgpuRenderPassEncoderEnd(handler: Long)
    external fun wgpuRenderPassEncoderRelease(handler: Long)
    external fun wgpuRenderPassEncoderSetPipeline(handler: Long, renderPipeline: Long)
    external fun wgpuRenderPassEncoderDraw(
        handler: Long,
        vertexCount: Int,
        instanceCount: Int,
        firstVertex: Int,
        firstInstance: Int
    )

    external fun wgpuRenderPassEncoderSetBindGroup(
        handler: Long,
        index: Int,
        handler1: Long,
        l: Long,
        memorySegment: Long
    )

    external fun wgpuRenderPassEncoderSetVertexBuffer(handler: Long, slot: Int, buffer: Long, l: Long, size: Long)
    external fun wgpuRenderPassEncoderSetIndexBuffer(
        handler: Long,
        buffer: Long,
        value: Int,
        offset: Long,
        size: Long
    )

    external fun wgpuRenderPassEncoderExecuteBundles(handler: Long, toLong: Long, toNativeArray: Long)

    /**
     * TODO
     * external fun wgpuRenderPassEncoderSetViewport
     * external fun wgpuRenderPassEncoderSetStencilReference
     * external fun wgpuRenderPassEncoderSetScissorRect
     * external fun wgpuRenderPassEncoderSetPushConstants
     * external fun wgpuRenderPassEncoderSetLabel
     * external fun wgpuRenderPassEncoderSetBlendConstant
     * external fun wgpuRenderPassEncoderReference
     * external fun wgpuRenderPassEncoderPushDebugGroup
     * external fun wgpuRenderPassEncoderPopDebugGroup
     * external fun wgpuRenderPassEncoderMultiDrawIndirectCount
     * external fun wgpuRenderPassEncoderMultiDrawIndirect
     * external fun wgpuRenderPassEncoderMultiDrawIndexedIndirectCount
     * external fun wgpuRenderPassEncoderMultiDrawIndexedIndirect
     * external fun wgpuRenderPassEncoderInsertDebugMarker
     * external fun wgpuRenderPassEncoderEndPipelineStatisticsQuery
     * external fun wgpuRenderPassEncoderEndOcclusionQuery
     * external fun wgpuRenderPassEncoderDrawIndirect
     * external fun wgpuRenderPassEncoderDrawIndexedIndirect
     * external fun wgpuRenderPassEncoderDrawIndexed
     * external fun wgpuRenderPassEncoderBeginPipelineStatisticsQuery
     * external fun wgpuRenderPassEncoderBeginOcclusionQuery
     */

    /*** CommandBuffer ***/
    external fun wgpuCommandBufferRelease(handler: Long)
    /** TODO
     * external fun wgpuCommandBufferSetLabel
     * external fun wgpuCommandBufferReference
     */

    /*** Sampler ***/
    external fun wgpuSamplerRelease(handler: Long)
    /**
     * TODO
     * external fun wgpuSamplerSetLabel
     * external fun wgpuSamplerReference
     */

    /*** ShaderModule ***/
    external fun wgpuShaderModuleRelease(handler: Long)
    /**
     * TODO
     * external fun wgpuShaderModuleSetLabel
     * external fun wgpuShaderModuleReference
     * external fun wgpuShaderModuleGetCompilationInfo
     */

    /*** BindGroup ***/
    external fun wgpuBindGroupRelease(handler: Long)

    /** TODO
     * external fun wgpuBindGroupSetLabel
     * external fun wgpuBindGroupLayoutSetLabel
     * external fun wgpuBindGroupReference
     * external fun wgpuBindGroupLayoutReference
     */

    /*** BindGroupLayout ***/
    external fun wgpuBindGroupLayoutRelease(handler: Long)

    /*** Surface ***/
    external fun wgpuSurfacePresent(handler: Long)

    /*** Device ***/
    external fun wgpuDeviceGetQueue(handler: Long): Long
    external fun wgpuDeviceCreateCommandEncoder(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateShaderModule(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreatePipelineLayout(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateRenderPipeline(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateBuffer(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateBindGroup(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateTexture(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateSampler(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateComputePipeline(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateBindGroupLayout(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateRenderBundleEncoder(handler: Long, descriptor: Long): Long
    external fun wgpuDeviceCreateQuerySet(handler: Long, descriptor: Long): Long
    external fun wgpuDevicePoll(handler: Long, bool: Int, ptr: Long)
    external fun wgpuDeviceRelease(handler: Long)

    /** TODO
     * external fun wgpuDeviceSetLabel
     * external fun wgpuDevicePopErrorScope
     * external fun wgpuDevicePushErrorScope
     * external fun wgpuDeviceReference
     * external fun wgpuDeviceHasFeature
     * external fun wgpuDeviceDestroy
     * external fun wgpuDeviceEnumerateFeatures
     * external fun wgpuDeviceGetLimits
     * external fun wgpuDeviceCreateRenderPipelineAsync
     * external fun wgpuDeviceCreateComputePipelineAsync
     * external fun wgpuComputePipelineSetLabel
     * external fun wgpuComputePipelineReference
     */

    /*** Texture ***/
    external fun wgpuTextureCreateView(
        handler: Long,
        textureViewDescriptor: Long
    ): Long
    external fun wgpuTextureGetWidth(handler: Long): Int
    external fun wgpuTextureGetHeight(handler: Long): Int
    external fun wgpuTextureGetDepthOrArrayLayers(handler: Long): Int
    external fun wgpuTextureGetMipLevelCount(handler: Long): Int
    external fun wgpuTextureGetSampleCount(handler: Long): Int
    external fun wgpuTextureGetDimension(handler: Long): Int
    external fun wgpuTextureGetFormat(handler: Long): Int
    external fun wgpuTextureGetUsage(handler: Long): Int
    /** TODO
     * external fun wgpuTextureReference
     * external fun wgpuTextureSetLabel
     * external fun wgpuTextureViewReference
     * external fun wgpuTextureViewSetLabel
     * external fun wgpuTextureDestroy
     */

    /*** RenderBundleEncoder ***/
    external fun wgpuRenderBundleEncoderFinish(handler: Long, descriptor: Long): Long
    external fun wgpuRenderBundleEncoderSetBindGroup(
        handler: Long,
        index: Int,
        bindGroup: Long,
        i: Int,
        l: Long
    )

    external fun wgpuRenderBundleEncoderSetPipeline(handler: Long, renderPipeline: Long)
    external fun wgpuRenderBundleEncoderSetVertexBuffer(
        handler: Long,
        slot: Int,
        buffer: Long,
        offset: Long,
        size: Long
    )

    external fun wgpuRenderBundleEncoderSetIndexBuffer(
        handler: Long,
        buffer: Long,
        value: Int,
        offset: Long,
        size: Long
    )

    external fun wgpuRenderBundleEncoderDrawIndexed(
        handler: Long,
        indexCount: Int,
        instanceCount: Int,
        firstIndex: Int,
        baseVertex: Int,
        firstInstance: Int
    )

    external fun wgpuRenderBundleEncoderDraw(
        handler: Long,
        vertexCount: Int,
        instanceCount: Int,
        firstVertex: Int,
        firstInstance: Int
    )

    external fun wgpuRenderBundleEncoderRelease(handler: Long)

    /**
     * TODO
     * external fun wgpuRenderBundleEncoderSetLabel
     * external fun wgpuRenderBundleEncoderReference
     * external fun wgpuRenderBundleEncoderPushDebugGroup
     * external fun wgpuRenderBundleEncoderPopDebugGroup
     * external fun wgpuRenderBundleEncoderInsertDebugMarker
     * external fun wgpuRenderBundleEncoderDrawIndirect
     * external fun wgpuRenderBundleEncoderDrawIndexedIndirect
     */

    /*** ComputePipeline ***/
    external fun wgpuComputePipelineGetBindGroupLayout(handler: Long, index: Int): Long
    external fun wgpuComputePipelineRelease(handler: Long)

    /*** RenderPipeline ***/
    external fun wgpuRenderPipelineGetBindGroupLayout(handler: Long, index: Int): Long
    external fun wgpuRenderPipelineRelease(handler: Long)
    /**
     * TODO
     * external fun wgpuRenderPipelineSetLabel
     * external fun wgpuRenderPipelineReference
     */

    /*** ComputePassEncoder ***/
    external fun wgpuComputePassEncoderSetPipeline(handler: Long, descriptor: Long)
    external fun wgpuComputePassEncoderDispatchWorkgroups(
        handler: Long,
        workgroupCountX: Int,
        workgroupCountY: Int,
        workgroupCountZ: Int
    )

    external fun wgpuComputePassEncoderDispatchWorkgroupsIndirect(
        handler: Long,
        handler1: Long,
        indirectOffset: Long
    )

    external fun wgpuComputePassEncoderEnd(handler: Long)
    external fun wgpuComputePassEncoderRelease(handler: Long)

    /** TODO
     * external fun wgpuComputePassEncoderSetBindGroup
     * external fun wgpuComputePassEncoderSetLabel
     * external fun wgpuComputePassEncoderEndPipelineStatisticsQuery
     * external fun wgpuComputePassEncoderInsertDebugMarker
     * external fun wgpuComputePassEncoderPopDebugGroup
     * external fun wgpuComputePassEncoderPushDebugGroup
     * external fun wgpuComputePassEncoderReference
     * external fun wgpuComputePassEncoderBeginPipelineStatisticsQuery
     */

    /*** CommandEncoder ***/
    external fun wgpuCommandEncoderBeginRenderPass(handler: Long, descriptor: Long): Long
    external fun wgpuCommandEncoderFinish(handler: Long, descriptor: Long): Long
    external fun wgpuCommandEncoderCopyTextureToTexture(
        handler: Long,
        source: Long,
        destination: Long,
        size: Long
    )

    external fun wgpuCommandEncoderBeginComputePass(handler: Long, descriptor: Long): Long
    external fun wgpuCommandEncoderCopyTextureToBuffer(
        handler: Long,
        source: Long,
        destination: Long,
        size: Long
    )

    external fun wgpuCommandEncoderCopyBufferToTexture(
        handler: Long,
        source: Long,
        destination: Long,
        size: Long
    )

    external fun wgpuCommandEncoderRelease(handler: Long)
    /** TODO
     * external fun wgpuCommandEncoderResolveQuerySet
     * external fun wgpuCommandEncoderSetLabel
     * external fun wgpuCommandEncoderWriteTimestamp
     * external fun wgpuCommandEncoderInsertDebugMarker
     * external fun wgpuCommandEncoderPopDebugGroup
     * external fun wgpuCommandEncoderPushDebugGroup
     * external fun wgpuCommandEncoderReference
     * external fun wgpuCommandEncoderClearBuffer
     * external fun wgpuCommandEncoderCopyBufferToBuffer
     */

    /*** Queue ***/
    external fun wgpuQueueSubmit(
        handler: Long,
        commandsBufferSize: Long,
        commandsBuffer: Long
    )

    external fun wgpuQueueWriteBuffer(handler: Long, buffer: Long, bufferOffset: Long, data: Long, size: Long)
    external fun wgpuQueueWriteTexture(
        handler: Long,
        destination: Long,
        data: Long,
        toLong: Long,
        dataLayout: Long,
        size3D: Long
    )
    /**
     * TODO
     * external fun wgpuQueueSubmitForIndex
     * external fun wgpuQuerySetDestroy
     * external fun wgpuQuerySetGetCount
     * external fun wgpuQuerySetGetType
     * external fun wgpuQuerySetReference
     * external fun wgpuQuerySetRelease
     * external fun wgpuQuerySetSetLabel
     * external fun wgpuQueueOnSubmittedWorkDone
     * external fun wgpuQueueReference
     * external fun wgpuQueueRelease
     * external fun wgpuQueueSetLabel
     */


    /*** Buffer ***/

    external fun wgpuBufferGetSize(handler: Long): Long
    external fun wgpuBufferGetUsage(handler: Long): Int
    external fun wgpuBufferGetMapState(handler: Long): Int
    external fun wgpuBufferUnmap(handler: Long)
    external fun wgpuBufferGetMappedRange(handler: Long, toLong: Long, toLong1: Long): Long
    external fun wgpuBufferMapAsync(
        handler: Long,
        flags: Int,
        offset: Long,
        size: Long,
        callback: Long,
        objectPtr: Long
    )

    external fun wgpuBufferRelease(handler: Long)

    /** TODO
     * external fun wgpuBufferSetLabel
     * external fun wgpuBufferReference
     * external fun wgpuBufferDestroy
     * external fun wgpuBufferGetConstMappedRange
     */

    /*** Adapter ***/
    external fun wgpuAdapterRequestDevice(handler: Long, descriptor: Long): Long
    external fun wgpuAdapterRequestDeviceNoCallback(handler: Long, descriptor: Long): Long
    external fun wgpuAdapterRelease(handler: Long)
    /**
     * TODO
     * external fun wgpuAdapterEnumerateFeatures
     * external fun wgpuAdapterGetInfo
     * external fun wgpuAdapterGetLimits
     * external fun wgpuAdapterHasFeature
     * external fun wgpuAdapterInfoFreeMembers
     * external fun wgpuAdapterReference
     */
    /*** Log ***/
    /**
     * TODO
     * external fun wgpuSetLogLevel
     * external fun wgpuSetLogCallback
     */

    /*** RenderBundle ***/
    /**
     * TODO
     * external fun wgpuRenderBundleSetLabel
     * external fun wgpuRenderBundleRelease
     * external fun wgpuRenderBundleReference
     */

    /*** PipelineLayout **/
    /**
     * TODO
     * external fun wgpuPipelineLayoutReference
     * external fun wgpuPipelineLayoutRelease
     * external fun wgpuPipelineLayoutSetLabel
     */

    /*** Other ***/
    /** TODO
     * external fun wgpuGetProcAddress
     * external fun wgpuGetVersion
     * external fun wgpuGenerateReport
     */
}