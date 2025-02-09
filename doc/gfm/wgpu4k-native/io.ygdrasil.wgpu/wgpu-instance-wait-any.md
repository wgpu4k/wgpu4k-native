//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[wgpuInstanceWaitAny](wgpu-instance-wait-any.md)

# wgpuInstanceWaitAny

[common]\
expect fun [wgpuInstanceWaitAny](wgpu-instance-wait-any.md)(handler: [WGPUInstance](-w-g-p-u-instance/index.md)?, futureCount: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html), futures: [WGPUFutureWaitInfo](-w-g-p-u-future-wait-info/index.md)?, timeoutNS: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [WGPUWaitStatus](-w-g-p-u-wait-status/index.md)

Wait for at least one WGPUFuture in [futures](wgpu-instance-wait-any.md) to complete, and call callbacks of the respective completed asynchronous operations.

See @ref Wait-Any for more information.

[android, jvm, native]\
[android, jvm, native]\
actual fun [wgpuInstanceWaitAny](wgpu-instance-wait-any.md)(handler: [WGPUInstance](-w-g-p-u-instance/index.md)?, futureCount: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html), futures: [WGPUFutureWaitInfo](-w-g-p-u-future-wait-info/index.md)?, timeoutNS: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [WGPUWaitStatus](-w-g-p-u-wait-status/index.md)