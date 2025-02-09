//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURequestAdapterOptions](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [backendTypeLayout](backend-type-layout.md) | [jvm]<br>val [backendTypeLayout](backend-type-layout.md): ValueLayout |
| [backendTypeOffset](backend-type-offset.md) | [jvm]<br>val [backendTypeOffset](backend-type-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 20 |
| [compatibleSurfaceLayout](compatible-surface-layout.md) | [jvm]<br>val [compatibleSurfaceLayout](compatible-surface-layout.md): ValueLayout |
| [compatibleSurfaceOffset](compatible-surface-offset.md) | [jvm]<br>val [compatibleSurfaceOffset](compatible-surface-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [featureLevelLayout](feature-level-layout.md) | [jvm]<br>val [featureLevelLayout](feature-level-layout.md): ValueLayout |
| [featureLevelOffset](feature-level-offset.md) | [jvm]<br>val [featureLevelOffset](feature-level-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [forceFallbackAdapterLayout](force-fallback-adapter-layout.md) | [jvm]<br>val [forceFallbackAdapterLayout](force-fallback-adapter-layout.md): ValueLayout |
| [forceFallbackAdapterOffset](force-fallback-adapter-offset.md) | [jvm]<br>val [forceFallbackAdapterOffset](force-fallback-adapter-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [powerPreferenceLayout](power-preference-layout.md) | [jvm]<br>val [powerPreferenceLayout](power-preference-layout.md): ValueLayout |
| [powerPreferenceOffset](power-preference-offset.md) | [jvm]<br>val [powerPreferenceOffset](power-preference-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 12 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPURequestAdapterOptions](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPURequestAdapterOptions](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPURequestAdapterOptions](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURequestAdapterOptions](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPURequestAdapterOptions](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURequestAdapterOptions](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPURequestAdapterOptions](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPURequestAdapterOptions](../index.md) |