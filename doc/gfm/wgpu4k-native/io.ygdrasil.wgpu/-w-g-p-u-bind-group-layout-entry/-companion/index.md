//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBindGroupLayoutEntry](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [bindingLayout](binding-layout.md) | [jvm]<br>val [bindingLayout](binding-layout.md): ValueLayout |
| [bindingOffset](binding-offset.md) | [jvm]<br>val [bindingOffset](binding-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [bufferLayout](buffer-layout.md) | [jvm]<br>val [bufferLayout](buffer-layout.md): StructLayout |
| [bufferOffset](buffer-offset.md) | [jvm]<br>val [bufferOffset](buffer-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [samplerLayout](sampler-layout.md) | [jvm]<br>val [samplerLayout](sampler-layout.md): StructLayout |
| [samplerOffset](sampler-offset.md) | [jvm]<br>val [samplerOffset](sampler-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 48 |
| [storageTextureLayout](storage-texture-layout.md) | [jvm]<br>val [storageTextureLayout](storage-texture-layout.md): StructLayout |
| [storageTextureOffset](storage-texture-offset.md) | [jvm]<br>val [storageTextureOffset](storage-texture-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 88 |
| [textureLayout](texture-layout.md) | [jvm]<br>val [textureLayout](texture-layout.md): StructLayout |
| [textureOffset](texture-offset.md) | [jvm]<br>val [textureOffset](texture-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 64 |
| [visibilityLayout](visibility-layout.md) | [jvm]<br>val [visibilityLayout](visibility-layout.md): ValueLayout |
| [visibilityOffset](visibility-offset.md) | [jvm]<br>val [visibilityOffset](visibility-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUBindGroupLayoutEntry](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUBindGroupLayoutEntry](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUBindGroupLayoutEntry](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUBindGroupLayoutEntry](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUBindGroupLayoutEntry](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUBindGroupLayoutEntry](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUBindGroupLayoutEntry](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUBindGroupLayoutEntry](../index.md) |