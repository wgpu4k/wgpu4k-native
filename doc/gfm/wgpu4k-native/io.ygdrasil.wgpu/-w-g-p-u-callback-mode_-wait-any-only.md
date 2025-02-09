//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[WGPUCallbackMode_WaitAnyOnly](-w-g-p-u-callback-mode_-wait-any-only.md)

# WGPUCallbackMode_WaitAnyOnly

[common]\
const val [WGPUCallbackMode_WaitAnyOnly](-w-g-p-u-callback-mode_-wait-any-only.md): [WGPUCallbackMode](-w-g-p-u-callback-mode/index.md)

Callbacks created with [WGPUCallbackMode_WaitAnyOnly](-w-g-p-u-callback-mode_-wait-any-only.md):

- 
   fire when the asynchronous operation's future is passed to a call to [wgpuInstanceWaitAny](wgpu-instance-wait-any.md) AND the operation has already completed or it completes inside the call to [wgpuInstanceWaitAny](wgpu-instance-wait-any.md).