//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTextureViewDescriptor](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [arrayLayerCountLayout](array-layer-count-layout.md) | [jvm]<br>val [arrayLayerCountLayout](array-layer-count-layout.md): ValueLayout |
| [arrayLayerCountOffset](array-layer-count-offset.md) | [jvm]<br>val [arrayLayerCountOffset](array-layer-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 44 |
| [aspectLayout](aspect-layout.md) | [jvm]<br>val [aspectLayout](aspect-layout.md): ValueLayout |
| [aspectOffset](aspect-offset.md) | [jvm]<br>val [aspectOffset](aspect-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 48 |
| [baseArrayLayerLayout](base-array-layer-layout.md) | [jvm]<br>val [baseArrayLayerLayout](base-array-layer-layout.md): ValueLayout |
| [baseArrayLayerOffset](base-array-layer-offset.md) | [jvm]<br>val [baseArrayLayerOffset](base-array-layer-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 40 |
| [baseMipLevelLayout](base-mip-level-layout.md) | [jvm]<br>val [baseMipLevelLayout](base-mip-level-layout.md): ValueLayout |
| [baseMipLevelOffset](base-mip-level-offset.md) | [jvm]<br>val [baseMipLevelOffset](base-mip-level-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |
| [dimensionLayout](dimension-layout.md) | [jvm]<br>val [dimensionLayout](dimension-layout.md): ValueLayout |
| [dimensionOffset](dimension-offset.md) | [jvm]<br>val [dimensionOffset](dimension-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 28 |
| [formatLayout](format-layout.md) | [jvm]<br>val [formatLayout](format-layout.md): ValueLayout |
| [formatOffset](format-offset.md) | [jvm]<br>val [formatOffset](format-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [labelLayout](label-layout.md) | [jvm]<br>val [labelLayout](label-layout.md): StructLayout |
| [labelOffset](label-offset.md) | [jvm]<br>val [labelOffset](label-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [mipLevelCountLayout](mip-level-count-layout.md) | [jvm]<br>val [mipLevelCountLayout](mip-level-count-layout.md): ValueLayout |
| [mipLevelCountOffset](mip-level-count-offset.md) | [jvm]<br>val [mipLevelCountOffset](mip-level-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 36 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [usageLayout](usage-layout.md) | [jvm]<br>val [usageLayout](usage-layout.md): ValueLayout |
| [usageOffset](usage-offset.md) | [jvm]<br>val [usageOffset](usage-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 56 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUTextureViewDescriptor](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUTextureViewDescriptor](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUTextureViewDescriptor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUTextureViewDescriptor](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUTextureViewDescriptor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUTextureViewDescriptor](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUTextureViewDescriptor](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUTextureViewDescriptor](../index.md) |