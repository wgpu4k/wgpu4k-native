package io.ygdrasil.wgpu

import ffi.ArrayHolder
import ffi.memoryScope


class HelloTriangleScene(val device: WGPUDevice, val renderingContextFormat: UInt, val surface: WGPUSurface) {

    val queue = wgpuDeviceGetQueue(device) ?: error("fail to get queue")
    var renderPipeline: WGPURenderPipeline? = null

    fun initialize() = memoryScope { scope ->
        renderPipeline = WGPURenderPipelineDescriptor.allocate(scope).apply {
            vertex.module = WGPUShaderModuleDescriptor.allocate(scope).apply {
                nextInChain = WGPUShaderModuleWGSLDescriptor.allocate(scope).apply {
                    code = scope.allocateFrom(triangleVertexShader)
                    chain.sType = WGPUSType_ShaderModuleWGSLDescriptor
                }.handler
            }.let { wgpuDeviceCreateShaderModule(device, it) } ?: error("fail to create shader module")

            vertex.entryPoint = scope.allocateFrom("main")

            fragment = WGPUFragmentState.allocate(scope).apply {
                entryPoint = scope.allocateFrom("main")
                module = WGPUShaderModuleDescriptor.allocate(scope).apply {
                    nextInChain = WGPUShaderModuleWGSLDescriptor.allocate(scope).apply {
                        code = scope.allocateFrom(redFragmentShader)
                        chain.sType = WGPUSType_ShaderModuleWGSLDescriptor
                    }.handler
                }.let { wgpuDeviceCreateShaderModule(device, it) } ?: error("fail to create shader module")

                targetCount = 1u
                targets = WGPUColorTargetState.allocateArray(scope, 1u) { index, structure ->
                    structure.format = renderingContextFormat
                    structure.writeMask = WGPUColorWriteMask_All
                }.let { ArrayHolder(it.handler) }
            }

            primitive.topology = WGPUPrimitiveTopology_TriangleList
            multisample.count = 1u
            multisample.mask = 0xFFFFFFFFu
        }.let { wgpuDeviceCreateRenderPipeline(device, it) }
    }

    fun render() = memoryScope { scope ->

        val surfaceTexture = WGPUSurfaceTexture.allocate(scope)
        wgpuSurfaceGetCurrentTexture(surface, surfaceTexture)

        if (surfaceTexture.status > WGPUSurfaceGetCurrentTextureStatus_Success) error("surface status is KO with status ${surfaceTexture.status}")
        surfaceTexture.texture ?: error("fail to get texture")

        val frame = wgpuTextureCreateView(surfaceTexture.texture, null) ?: error("fail to create view")

        val renderPipeline = renderPipeline ?: error("fail to create get pipeline")

        // Clear the canvas with a render pass
        val commandEncoder = wgpuDeviceCreateCommandEncoder(device, null) ?: error("fail to create command encoder")


        val renderPassEncoder = WGPURenderPassDescriptor.allocate(scope).apply {
            colorAttachmentCount = 1u
            colorAttachments = WGPURenderPassColorAttachment.allocateArray(scope, 1u) { index, structure ->
                structure.view = frame
                structure.loadOp = WGPULoadOp_Clear
                structure.storeOp = WGPUStoreOp_Store
                structure.depthSlice = UInt.MAX_VALUE
                structure.clearValue.r = .0
                structure.clearValue.g = 1.0
                structure.clearValue.b = .0
                structure.clearValue.a = 1.0
            }.let { ArrayHolder(it.handler) }
        }.let { wgpuCommandEncoderBeginRenderPass(commandEncoder, it) }

        wgpuRenderPassEncoderSetPipeline(renderPassEncoder, renderPipeline)
        wgpuRenderPassEncoderDraw(renderPassEncoder, 3u, 1u, 0u, 0u)
        wgpuRenderPassEncoderEnd(renderPassEncoder)
        wgpuRenderPassEncoderRelease(renderPassEncoder)

        val commandBuffer = wgpuCommandEncoderFinish(commandEncoder, null) ?: error("fail to get finish command buffer")

        wgpuQueueSubmit(queue, 1u, scope.bufferOfAddress(commandBuffer.handler).let { ArrayHolder(it.handler) })

        wgpuSurfacePresent(surface)

        wgpuCommandBufferRelease(commandBuffer)
        wgpuCommandEncoderRelease(commandEncoder)
        wgpuTextureViewRelease(frame)
        wgpuTextureRelease(surfaceTexture.texture)

    }
}

// language=wgsl
const val triangleVertexShader = """
@vertex
fn main(@builtin(vertex_index) in_vertex_index: u32) -> @builtin(position) vec4<f32> {
    let x = f32(i32(in_vertex_index) - 1);
    let y = f32(i32(in_vertex_index & 1u) * 2 - 1);
    return vec4<f32>(x, y, 0.0, 1.0);
}
"""

// language=wgsl
const val redFragmentShader = """
@fragment
fn main() -> @location(0) vec4f {
  return vec4(1.0, 0.0, 0.0, 1.0);
}
"""