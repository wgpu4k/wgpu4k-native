//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[WGPUCallbackMode_AllowProcessEvents](-w-g-p-u-callback-mode_-allow-process-events.md)

# WGPUCallbackMode_AllowProcessEvents

[common]\
const val [WGPUCallbackMode_AllowProcessEvents](-w-g-p-u-callback-mode_-allow-process-events.md): [WGPUCallbackMode](-w-g-p-u-callback-mode/index.md)

Callbacks created with [WGPUCallbackMode_AllowProcessEvents](-w-g-p-u-callback-mode_-allow-process-events.md):

- 
   fire for the same reasons as callbacks created with [WGPUCallbackMode_WaitAnyOnly](-w-g-p-u-callback-mode_-wait-any-only.md)
- 
   fire inside a call to [wgpuInstanceProcessEvents](wgpu-instance-process-events.md) if the asynchronous operation is complete.