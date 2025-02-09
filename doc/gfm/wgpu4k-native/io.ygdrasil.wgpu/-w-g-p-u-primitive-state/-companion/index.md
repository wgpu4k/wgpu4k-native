//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUPrimitiveState](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [cullModeLayout](cull-mode-layout.md) | [jvm]<br>val [cullModeLayout](cull-mode-layout.md): ValueLayout |
| [cullModeOffset](cull-mode-offset.md) | [jvm]<br>val [cullModeOffset](cull-mode-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 20 |
| [frontFaceLayout](front-face-layout.md) | [jvm]<br>val [frontFaceLayout](front-face-layout.md): ValueLayout |
| [frontFaceOffset](front-face-offset.md) | [jvm]<br>val [frontFaceOffset](front-face-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [stripIndexFormatLayout](strip-index-format-layout.md) | [jvm]<br>val [stripIndexFormatLayout](strip-index-format-layout.md): ValueLayout |
| [stripIndexFormatOffset](strip-index-format-offset.md) | [jvm]<br>val [stripIndexFormatOffset](strip-index-format-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 12 |
| [topologyLayout](topology-layout.md) | [jvm]<br>val [topologyLayout](topology-layout.md): ValueLayout |
| [topologyOffset](topology-offset.md) | [jvm]<br>val [topologyOffset](topology-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [unclippedDepthLayout](unclipped-depth-layout.md) | [jvm]<br>val [unclippedDepthLayout](unclipped-depth-layout.md): ValueLayout |
| [unclippedDepthOffset](unclipped-depth-offset.md) | [jvm]<br>val [unclippedDepthOffset](unclipped-depth-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUPrimitiveState](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUPrimitiveState](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUPrimitiveState](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUPrimitiveState](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUPrimitiveState](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUPrimitiveState](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUPrimitiveState](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUPrimitiveState](../index.md) |