//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[wgpuSurfaceGetCurrentTexture](wgpu-surface-get-current-texture.md)

# wgpuSurfaceGetCurrentTexture

[common]\
expect fun [wgpuSurfaceGetCurrentTexture](wgpu-surface-get-current-texture.md)(handler: [WGPUSurface](-w-g-p-u-surface/index.md)?, surfaceTexture: [WGPUSurfaceTexture](-w-g-p-u-surface-texture/index.md)?)

Returns the @ref WGPUTexture to render to surface this frame along with metadata on the frame. Returns NULL and @ref WGPUSurfaceGetCurrentTextureStatus_Error if the surface is not configured.

See @ref Surface-Presenting for more details.

#### Parameters

common

| | |
|---|---|
| surfaceTexture | The structure to fill the @ref WGPUTexture and metadata in. |

[android, jvm, native]\
[android, jvm, native]\
actual fun [wgpuSurfaceGetCurrentTexture](wgpu-surface-get-current-texture.md)(handler: [WGPUSurface](-w-g-p-u-surface/index.md)?, surfaceTexture: [WGPUSurfaceTexture](-w-g-p-u-surface-texture/index.md)?)