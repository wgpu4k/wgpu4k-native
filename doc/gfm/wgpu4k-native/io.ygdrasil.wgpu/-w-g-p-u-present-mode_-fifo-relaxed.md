//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[WGPUPresentMode_FifoRelaxed](-w-g-p-u-present-mode_-fifo-relaxed.md)

# WGPUPresentMode_FifoRelaxed

[common]\
const val [WGPUPresentMode_FifoRelaxed](-w-g-p-u-present-mode_-fifo-relaxed.md): [WGPUPresentMode](-w-g-p-u-present-mode/index.md)

The presentation of the image to the user tries to wait for the next vertical blanking period but may decide to not wait if a frame is presented late. Tearing can sometimes be observed but late-frame don't produce a full-frame stutter in the presentation. This is still a first-in, first-out mechanism so a frame-loop will be limited to the display's refresh rate.