//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[wgpuSurfaceGetCapabilities](wgpu-surface-get-capabilities.md)

# wgpuSurfaceGetCapabilities

[common]\
expect fun [wgpuSurfaceGetCapabilities](wgpu-surface-get-capabilities.md)(handler: [WGPUSurface](-w-g-p-u-surface/index.md)?, adapter: [WGPUAdapter](-w-g-p-u-adapter/index.md)?, capabilities: [WGPUSurfaceCapabilities](-w-g-p-u-surface-capabilities/index.md)?): [WGPUStatus](-w-g-p-u-status/index.md)

Provides information on how [adapter](wgpu-surface-get-capabilities.md) is able to use surface. See @ref Surface-Capabilities for more details.

#### Return

Indicates if there was an @ref OutStructChainError.

#### Parameters

common

| | |
|---|---|
| adapter | The @ref WGPUAdapter to get capabilities for presenting to this @ref WGPUSurface. |
| capabilities | The structure to fill capabilities in. It may contain memory allocations so wgpuSurfaceCapabilitiesFreeMembers must be called to avoid memory leaks. |

[android, jvm, native]\
[android, jvm, native]\
actual fun [wgpuSurfaceGetCapabilities](wgpu-surface-get-capabilities.md)(handler: [WGPUSurface](-w-g-p-u-surface/index.md)?, adapter: [WGPUAdapter](-w-g-p-u-adapter/index.md)?, capabilities: [WGPUSurfaceCapabilities](-w-g-p-u-surface-capabilities/index.md)?): [WGPUStatus](-w-g-p-u-status/index.md)