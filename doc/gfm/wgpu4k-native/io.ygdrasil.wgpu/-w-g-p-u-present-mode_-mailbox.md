//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[WGPUPresentMode_Mailbox](-w-g-p-u-present-mode_-mailbox.md)

# WGPUPresentMode_Mailbox

[common]\
const val [WGPUPresentMode_Mailbox](-w-g-p-u-present-mode_-mailbox.md): [WGPUPresentMode](-w-g-p-u-present-mode/index.md)

The presentation of the image to the user waits for the next vertical blanking period to update to the latest provided image. Tearing cannot be observed and a frame-loop is not limited to the display's refresh rate.