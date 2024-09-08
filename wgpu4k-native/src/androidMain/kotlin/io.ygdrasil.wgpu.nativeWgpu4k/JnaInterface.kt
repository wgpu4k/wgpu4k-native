package io.ygdrasil.wgpu.nativeWgpu4k

import com.sun.jna.Native

internal object JnaInterface {

    init {
        Native.register(JnaInterface::class.java, "wgpu4kv2")
    }

    /*** Instance ***/
    external fun wgpuCreateInstance(descriptor: Long): Long
    external fun wgpuInstanceRelease(handler: Long)
    external fun wgpuInstanceCreateSurface(handler: Long, descriptor: Long): Long
    external fun wgpuInstanceRequestAdapterNoCallback(handler: Long, descriptor: Long): Long

    /*** Surface ***/
    external fun wgpuSurfaceRelease(handler: Long)
    external fun wgpuSurfaceConfigure(handler: Long, descriptor: Long)
    external fun wgpuSurfaceGetCurrentTexture(handler: Long, surfaceTexture: Long): Long
    external fun wgpuSurfaceGetCapabilities(handler: Long, adapter: Long, surfaceCapabilities: Long)

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

    /*** CommandBuffer ***/
    external fun wgpuCommandBufferRelease(handler: Long)

    /*** Sampler ***/
    external fun wgpuSamplerRelease(handler: Long)

    /*** ShaderModule ***/
    external fun wgpuShaderModuleRelease(handler: Long)

    /*** BindGroup ***/
    external fun wgpuBindGroupRelease(handler: Long)

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

    /*** ComputePipeline ***/
    external fun wgpuComputePipelineGetBindGroupLayout(handler: Long, index: Int): Long
    external fun wgpuComputePipelineRelease(handler: Long)

    /*** RenderPipeline ***/
    external fun wgpuRenderPipelineGetBindGroupLayout(handler: Long, index: Int): Long
    external fun wgpuRenderPipelineRelease(handler: Long)

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

    /*** Adapter ***/
    external fun wgpuAdapterRequestDevice(handler: Long, descriptor: Long): Long
    external fun wgpuAdapterRequestDeviceNoCallback(handler: Long, descriptor: Long): Long
    external fun wgpuAdapterRelease(handler: Long)
}