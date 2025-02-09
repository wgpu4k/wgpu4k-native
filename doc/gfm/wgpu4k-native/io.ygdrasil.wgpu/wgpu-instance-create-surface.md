//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[wgpuInstanceCreateSurface](wgpu-instance-create-surface.md)

# wgpuInstanceCreateSurface

[common]\
expect fun [wgpuInstanceCreateSurface](wgpu-instance-create-surface.md)(handler: [WGPUInstance](-w-g-p-u-instance/index.md)?, descriptor: [WGPUSurfaceDescriptor](-w-g-p-u-surface-descriptor/index.md)?): [WGPUSurface](-w-g-p-u-surface/index.md)?

Creates a @ref WGPUSurface, see @ref Surface-Creation for more details.

#### Return

A new @ref WGPUSurface for this descriptor (or an error @ref WGPUSurface).

#### Parameters

common

| | |
|---|---|
| descriptor | The description of the @ref WGPUSurface to create. |

[android, jvm, native]\
[android, jvm, native]\
actual fun [wgpuInstanceCreateSurface](wgpu-instance-create-surface.md)(handler: [WGPUInstance](-w-g-p-u-instance/index.md)?, descriptor: [WGPUSurfaceDescriptor](-w-g-p-u-surface-descriptor/index.md)?): [WGPUSurface](-w-g-p-u-surface/index.md)?