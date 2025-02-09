//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUDepthStencilState](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [depthBiasClampLayout](depth-bias-clamp-layout.md) | [jvm]<br>val [depthBiasClampLayout](depth-bias-clamp-layout.md): ValueLayout |
| [depthBiasClampOffset](depth-bias-clamp-offset.md) | [jvm]<br>val [depthBiasClampOffset](depth-bias-clamp-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 68 |
| [depthBiasLayout](depth-bias-layout.md) | [jvm]<br>val [depthBiasLayout](depth-bias-layout.md): ValueLayout |
| [depthBiasOffset](depth-bias-offset.md) | [jvm]<br>val [depthBiasOffset](depth-bias-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 60 |
| [depthBiasSlopeScaleLayout](depth-bias-slope-scale-layout.md) | [jvm]<br>val [depthBiasSlopeScaleLayout](depth-bias-slope-scale-layout.md): ValueLayout |
| [depthBiasSlopeScaleOffset](depth-bias-slope-scale-offset.md) | [jvm]<br>val [depthBiasSlopeScaleOffset](depth-bias-slope-scale-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 64 |
| [depthCompareLayout](depth-compare-layout.md) | [jvm]<br>val [depthCompareLayout](depth-compare-layout.md): ValueLayout |
| [depthCompareOffset](depth-compare-offset.md) | [jvm]<br>val [depthCompareOffset](depth-compare-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [depthWriteEnabledLayout](depth-write-enabled-layout.md) | [jvm]<br>val [depthWriteEnabledLayout](depth-write-enabled-layout.md): ValueLayout |
| [depthWriteEnabledOffset](depth-write-enabled-offset.md) | [jvm]<br>val [depthWriteEnabledOffset](depth-write-enabled-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 12 |
| [formatLayout](format-layout.md) | [jvm]<br>val [formatLayout](format-layout.md): ValueLayout |
| [formatOffset](format-offset.md) | [jvm]<br>val [formatOffset](format-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [stencilBackLayout](stencil-back-layout.md) | [jvm]<br>val [stencilBackLayout](stencil-back-layout.md): StructLayout |
| [stencilBackOffset](stencil-back-offset.md) | [jvm]<br>val [stencilBackOffset](stencil-back-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 36 |
| [stencilFrontLayout](stencil-front-layout.md) | [jvm]<br>val [stencilFrontLayout](stencil-front-layout.md): StructLayout |
| [stencilFrontOffset](stencil-front-offset.md) | [jvm]<br>val [stencilFrontOffset](stencil-front-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 20 |
| [stencilReadMaskLayout](stencil-read-mask-layout.md) | [jvm]<br>val [stencilReadMaskLayout](stencil-read-mask-layout.md): ValueLayout |
| [stencilReadMaskOffset](stencil-read-mask-offset.md) | [jvm]<br>val [stencilReadMaskOffset](stencil-read-mask-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 52 |
| [stencilWriteMaskLayout](stencil-write-mask-layout.md) | [jvm]<br>val [stencilWriteMaskLayout](stencil-write-mask-layout.md): ValueLayout |
| [stencilWriteMaskOffset](stencil-write-mask-offset.md) | [jvm]<br>val [stencilWriteMaskOffset](stencil-write-mask-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 56 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUDepthStencilState](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUDepthStencilState](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUDepthStencilState](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUDepthStencilState](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUDepthStencilState](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUDepthStencilState](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUDepthStencilState](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUDepthStencilState](../index.md) |