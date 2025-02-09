//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderBundleEncoderDescriptor](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [colorFormatCountLayout](color-format-count-layout.md) | [jvm]<br>val [colorFormatCountLayout](color-format-count-layout.md): ValueLayout |
| [colorFormatCountOffset](color-format-count-offset.md) | [jvm]<br>val [colorFormatCountOffset](color-format-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [colorFormatsLayout](color-formats-layout.md) | [jvm]<br>val [colorFormatsLayout](color-formats-layout.md): ValueLayout |
| [colorFormatsOffset](color-formats-offset.md) | [jvm]<br>val [colorFormatsOffset](color-formats-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |
| [depthReadOnlyLayout](depth-read-only-layout.md) | [jvm]<br>val [depthReadOnlyLayout](depth-read-only-layout.md): ValueLayout |
| [depthReadOnlyOffset](depth-read-only-offset.md) | [jvm]<br>val [depthReadOnlyOffset](depth-read-only-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 48 |
| [depthStencilFormatLayout](depth-stencil-format-layout.md) | [jvm]<br>val [depthStencilFormatLayout](depth-stencil-format-layout.md): ValueLayout |
| [depthStencilFormatOffset](depth-stencil-format-offset.md) | [jvm]<br>val [depthStencilFormatOffset](depth-stencil-format-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 40 |
| [labelLayout](label-layout.md) | [jvm]<br>val [labelLayout](label-layout.md): StructLayout |
| [labelOffset](label-offset.md) | [jvm]<br>val [labelOffset](label-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [sampleCountLayout](sample-count-layout.md) | [jvm]<br>val [sampleCountLayout](sample-count-layout.md): ValueLayout |
| [sampleCountOffset](sample-count-offset.md) | [jvm]<br>val [sampleCountOffset](sample-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 44 |
| [stencilReadOnlyLayout](stencil-read-only-layout.md) | [jvm]<br>val [stencilReadOnlyLayout](stencil-read-only-layout.md): ValueLayout |
| [stencilReadOnlyOffset](stencil-read-only-offset.md) | [jvm]<br>val [stencilReadOnlyOffset](stencil-read-only-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 52 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPURenderBundleEncoderDescriptor](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPURenderBundleEncoderDescriptor](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPURenderBundleEncoderDescriptor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURenderBundleEncoderDescriptor](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPURenderBundleEncoderDescriptor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURenderBundleEncoderDescriptor](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPURenderBundleEncoderDescriptor](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPURenderBundleEncoderDescriptor](../index.md) |