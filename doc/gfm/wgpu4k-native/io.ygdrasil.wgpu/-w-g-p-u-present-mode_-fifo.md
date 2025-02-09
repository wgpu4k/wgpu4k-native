//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[WGPUPresentMode_Fifo](-w-g-p-u-present-mode_-fifo.md)

# WGPUPresentMode_Fifo

[common]\
const val [WGPUPresentMode_Fifo](-w-g-p-u-present-mode_-fifo.md): [WGPUPresentMode](-w-g-p-u-present-mode/index.md)

The presentation of the image to the user waits for the next vertical blanking period to update in a first-in, first-out manner. Tearing cannot be observed and frame-loop will be limited to the display's refresh rate. This is the only mode that's always available.