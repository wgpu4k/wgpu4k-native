package io.ygdrasil.wgpu

import ffi.MemoryBuffer
import ffi.memoryScope

data class SurfaceCapabilities(val formats: List<WGPUTextureFormat>, val alphaModes: List<WGPUCompositeAlphaMode>)

fun surfaceCapabilities(surface: WGPUSurface, adapter: WGPUAdapter): SurfaceCapabilities = memoryScope { scope ->
    val surfaceCapabilities = WGPUSurfaceCapabilities.allocate(scope)
    wgpuSurfaceGetCapabilities(surface, adapter, surfaceCapabilities)

    if (surfaceCapabilities.formatCount == 0uL) error("No surface formats available")
    if (surfaceCapabilities.alphaModeCount == 0uL) error("No alpha modes available")

    val formats = surfaceCapabilities.formats
        ?.toBuffer(UInt.SIZE_BYTES.toULong() * surfaceCapabilities.formatCount)
        ?.let { buffer ->
            UIntArray(surfaceCapabilities.formatCount.toInt()).let {
                buffer.readUInts(it)
                it.toList()
            }
        } ?: error("no formats")

    val alphaModes = surfaceCapabilities.alphaModes
        ?.toBuffer(UInt.SIZE_BYTES.toULong() * surfaceCapabilities.alphaModeCount)
        ?.let { buffer ->
            UIntArray(surfaceCapabilities.alphaModeCount.toInt()).let {
                buffer.readUInts(it)
                it.toList()
            }
        } ?: error("no alpha modes")

    return SurfaceCapabilities(formats, alphaModes)
}

fun compatibleFormat(surface: WGPUSurface, adapter: WGPUAdapter): UInt = memoryScope { scope ->
    val surfaceCapabilities = WGPUSurfaceCapabilities.allocate(scope)
    wgpuSurfaceGetCapabilities(surface, adapter, surfaceCapabilities)
    if (surfaceCapabilities.formatCount == 0uL) error("no surface format")
    println("surface format count: ${surfaceCapabilities.formatCount}")
    return surfaceCapabilities.formats?.handler
        ?.let { MemoryBuffer(it, Int.SIZE_BYTES.toULong() * surfaceCapabilities.formatCount) }
        ?.readInt()?.toUInt()
        ?: error("no compatible format")
}

fun compatibleAlphaMode(surface: WGPUSurface, adapter: WGPUAdapter): UInt = memoryScope { scope ->
    val surfaceCapabilities = WGPUSurfaceCapabilities.allocate(scope)
    wgpuSurfaceGetCapabilities(surface, adapter, surfaceCapabilities)
    if (surfaceCapabilities.alphaModeCount == 0uL) error("no surface alpha mode")
    return surfaceCapabilities.alphaModes?.handler?.let { MemoryBuffer(it, Int.SIZE_BYTES.toULong() * surfaceCapabilities.formatCount) }?.readInt()?.toUInt()
        ?: error("no compatible alpha mode")
}
