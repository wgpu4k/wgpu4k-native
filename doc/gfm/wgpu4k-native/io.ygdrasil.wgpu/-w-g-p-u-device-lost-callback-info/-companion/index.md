//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUDeviceLostCallbackInfo](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [callbackLayout](callback-layout.md) | [jvm]<br>val [callbackLayout](callback-layout.md): ValueLayout |
| [callbackOffset](callback-offset.md) | [jvm]<br>val [callbackOffset](callback-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [modeLayout](mode-layout.md) | [jvm]<br>val [modeLayout](mode-layout.md): ValueLayout |
| [modeOffset](mode-offset.md) | [jvm]<br>val [modeOffset](mode-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [userdata1Layout](userdata1-layout.md) | [jvm]<br>val [userdata1Layout](userdata1-layout.md): ValueLayout |
| [userdata1Offset](userdata1-offset.md) | [jvm]<br>val [userdata1Offset](userdata1-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [userdata2Layout](userdata2-layout.md) | [jvm]<br>val [userdata2Layout](userdata2-layout.md): ValueLayout |
| [userdata2Offset](userdata2-offset.md) | [jvm]<br>val [userdata2Offset](userdata2-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUDeviceLostCallbackInfo](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUDeviceLostCallbackInfo](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUDeviceLostCallbackInfo](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUDeviceLostCallbackInfo](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUDeviceLostCallbackInfo](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUDeviceLostCallbackInfo](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUDeviceLostCallbackInfo](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUDeviceLostCallbackInfo](../index.md) |