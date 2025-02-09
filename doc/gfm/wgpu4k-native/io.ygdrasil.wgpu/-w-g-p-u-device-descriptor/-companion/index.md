//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUDeviceDescriptor](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [defaultQueueLayout](default-queue-layout.md) | [jvm]<br>val [defaultQueueLayout](default-queue-layout.md): StructLayout |
| [defaultQueueOffset](default-queue-offset.md) | [jvm]<br>val [defaultQueueOffset](default-queue-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 48 |
| [deviceLostCallbackInfoLayout](device-lost-callback-info-layout.md) | [jvm]<br>val [deviceLostCallbackInfoLayout](device-lost-callback-info-layout.md): StructLayout |
| [deviceLostCallbackInfoOffset](device-lost-callback-info-offset.md) | [jvm]<br>val [deviceLostCallbackInfoOffset](device-lost-callback-info-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 72 |
| [labelLayout](label-layout.md) | [jvm]<br>val [labelLayout](label-layout.md): StructLayout |
| [labelOffset](label-offset.md) | [jvm]<br>val [labelOffset](label-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [requiredFeatureCountLayout](required-feature-count-layout.md) | [jvm]<br>val [requiredFeatureCountLayout](required-feature-count-layout.md): ValueLayout |
| [requiredFeatureCountOffset](required-feature-count-offset.md) | [jvm]<br>val [requiredFeatureCountOffset](required-feature-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [requiredFeaturesLayout](required-features-layout.md) | [jvm]<br>val [requiredFeaturesLayout](required-features-layout.md): ValueLayout |
| [requiredFeaturesOffset](required-features-offset.md) | [jvm]<br>val [requiredFeaturesOffset](required-features-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |
| [requiredLimitsLayout](required-limits-layout.md) | [jvm]<br>val [requiredLimitsLayout](required-limits-layout.md): ValueLayout |
| [requiredLimitsOffset](required-limits-offset.md) | [jvm]<br>val [requiredLimitsOffset](required-limits-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 40 |
| [uncapturedErrorCallbackInfoLayout](uncaptured-error-callback-info-layout.md) | [jvm]<br>val [uncapturedErrorCallbackInfoLayout](uncaptured-error-callback-info-layout.md): StructLayout |
| [uncapturedErrorCallbackInfoOffset](uncaptured-error-callback-info-offset.md) | [jvm]<br>val [uncapturedErrorCallbackInfoOffset](uncaptured-error-callback-info-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 112 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUDeviceDescriptor](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUDeviceDescriptor](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUDeviceDescriptor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUDeviceDescriptor](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUDeviceDescriptor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUDeviceDescriptor](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUDeviceDescriptor](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUDeviceDescriptor](../index.md) |