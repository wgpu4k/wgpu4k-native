//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[wgpuSurfacePresent](wgpu-surface-present.md)

# wgpuSurfacePresent

[common]\
expect fun [wgpuSurfacePresent](wgpu-surface-present.md)(handler: [WGPUSurface](-w-g-p-u-surface/index.md)?): [WGPUStatus](-w-g-p-u-status/index.md)

Shows surface's current texture to the user. See @ref Surface-Presenting for more details.

#### Return

Returns @ref WGPUStatus_Error if the surface doesn't have a current texture.

[android, jvm, native]\
[android, jvm, native]\
actual fun [wgpuSurfacePresent](wgpu-surface-present.md)(handler: [WGPUSurface](-w-g-p-u-surface/index.md)?): [WGPUStatus](-w-g-p-u-status/index.md)