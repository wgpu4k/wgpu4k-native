//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUInstanceCapabilities](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [timedWaitAnyEnableLayout](timed-wait-any-enable-layout.md) | [jvm]<br>val [timedWaitAnyEnableLayout](timed-wait-any-enable-layout.md): ValueLayout |
| [timedWaitAnyEnableOffset](timed-wait-any-enable-offset.md) | [jvm]<br>val [timedWaitAnyEnableOffset](timed-wait-any-enable-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [timedWaitAnyMaxCountLayout](timed-wait-any-max-count-layout.md) | [jvm]<br>val [timedWaitAnyMaxCountLayout](timed-wait-any-max-count-layout.md): ValueLayout |
| [timedWaitAnyMaxCountOffset](timed-wait-any-max-count-offset.md) | [jvm]<br>val [timedWaitAnyMaxCountOffset](timed-wait-any-max-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUInstanceCapabilities](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUInstanceCapabilities](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUInstanceCapabilities](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUInstanceCapabilities](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUInstanceCapabilities](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUInstanceCapabilities](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUInstanceCapabilities](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUInstanceCapabilities](../index.md) |