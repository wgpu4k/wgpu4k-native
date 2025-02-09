//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[wgpuQueueWriteBuffer](wgpu-queue-write-buffer.md)

# wgpuQueueWriteBuffer

[android, jvm, native]\
[android, jvm, native]\
actual fun [wgpuQueueWriteBuffer](wgpu-queue-write-buffer.md)(handler: [WGPUQueue](-w-g-p-u-queue/index.md)?, buffer: [WGPUBuffer](-w-g-p-u-buffer/index.md)?, bufferOffset: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html), data: [NativeAddress](../ffi/-native-address/index.md)?, size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html))

[common]\
expect fun [wgpuQueueWriteBuffer](wgpu-queue-write-buffer.md)(handler: [WGPUQueue](-w-g-p-u-queue/index.md)?, buffer: [WGPUBuffer](-w-g-p-u-buffer/index.md)?, bufferOffset: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html), data: [NativeAddress](../ffi/-native-address/index.md)?, size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html))

Produces a @ref DeviceError both content-timeline ([size](wgpu-queue-write-buffer.md) alignment) and device-timeline errors defined by the WebGPU specification.