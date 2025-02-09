//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[WGPUCallbackMode_AllowSpontaneous](-w-g-p-u-callback-mode_-allow-spontaneous.md)

# WGPUCallbackMode_AllowSpontaneous

[common]\
const val [WGPUCallbackMode_AllowSpontaneous](-w-g-p-u-callback-mode_-allow-spontaneous.md): [WGPUCallbackMode](-w-g-p-u-callback-mode/index.md)

Callbacks created with [WGPUCallbackMode_AllowSpontaneous](-w-g-p-u-callback-mode_-allow-spontaneous.md):

- 
   fire for the same reasons as callbacks created with [WGPUCallbackMode_AllowProcessEvents](-w-g-p-u-callback-mode_-allow-process-events.md)
- 
   **may** fire spontaneously on an arbitrary or application thread, when the WebGPU implementations discovers that the asynchronous operation is complete.

Implementations *should* fire spontaneous callbacks as soon as possible.