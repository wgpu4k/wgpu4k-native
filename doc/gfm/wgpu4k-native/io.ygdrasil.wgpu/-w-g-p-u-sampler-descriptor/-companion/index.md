//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSamplerDescriptor](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [addressModeULayout](address-mode-u-layout.md) | [jvm]<br>val [addressModeULayout](address-mode-u-layout.md): ValueLayout |
| [addressModeUOffset](address-mode-u-offset.md) | [jvm]<br>val [addressModeUOffset](address-mode-u-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [addressModeVLayout](address-mode-v-layout.md) | [jvm]<br>val [addressModeVLayout](address-mode-v-layout.md): ValueLayout |
| [addressModeVOffset](address-mode-v-offset.md) | [jvm]<br>val [addressModeVOffset](address-mode-v-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 28 |
| [addressModeWLayout](address-mode-w-layout.md) | [jvm]<br>val [addressModeWLayout](address-mode-w-layout.md): ValueLayout |
| [addressModeWOffset](address-mode-w-offset.md) | [jvm]<br>val [addressModeWOffset](address-mode-w-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |
| [compareLayout](compare-layout.md) | [jvm]<br>val [compareLayout](compare-layout.md): ValueLayout |
| [compareOffset](compare-offset.md) | [jvm]<br>val [compareOffset](compare-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 56 |
| [labelLayout](label-layout.md) | [jvm]<br>val [labelLayout](label-layout.md): StructLayout |
| [labelOffset](label-offset.md) | [jvm]<br>val [labelOffset](label-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [lodMaxClampLayout](lod-max-clamp-layout.md) | [jvm]<br>val [lodMaxClampLayout](lod-max-clamp-layout.md): ValueLayout |
| [lodMaxClampOffset](lod-max-clamp-offset.md) | [jvm]<br>val [lodMaxClampOffset](lod-max-clamp-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 52 |
| [lodMinClampLayout](lod-min-clamp-layout.md) | [jvm]<br>val [lodMinClampLayout](lod-min-clamp-layout.md): ValueLayout |
| [lodMinClampOffset](lod-min-clamp-offset.md) | [jvm]<br>val [lodMinClampOffset](lod-min-clamp-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 48 |
| [magFilterLayout](mag-filter-layout.md) | [jvm]<br>val [magFilterLayout](mag-filter-layout.md): ValueLayout |
| [magFilterOffset](mag-filter-offset.md) | [jvm]<br>val [magFilterOffset](mag-filter-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 36 |
| [maxAnisotropyLayout](max-anisotropy-layout.md) | [jvm]<br>val [maxAnisotropyLayout](max-anisotropy-layout.md): ValueLayout |
| [maxAnisotropyOffset](max-anisotropy-offset.md) | [jvm]<br>val [maxAnisotropyOffset](max-anisotropy-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 60 |
| [minFilterLayout](min-filter-layout.md) | [jvm]<br>val [minFilterLayout](min-filter-layout.md): ValueLayout |
| [minFilterOffset](min-filter-offset.md) | [jvm]<br>val [minFilterOffset](min-filter-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 40 |
| [mipmapFilterLayout](mipmap-filter-layout.md) | [jvm]<br>val [mipmapFilterLayout](mipmap-filter-layout.md): ValueLayout |
| [mipmapFilterOffset](mipmap-filter-offset.md) | [jvm]<br>val [mipmapFilterOffset](mipmap-filter-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 44 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUSamplerDescriptor](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUSamplerDescriptor](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUSamplerDescriptor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUSamplerDescriptor](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUSamplerDescriptor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUSamplerDescriptor](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUSamplerDescriptor](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUSamplerDescriptor](../index.md) |