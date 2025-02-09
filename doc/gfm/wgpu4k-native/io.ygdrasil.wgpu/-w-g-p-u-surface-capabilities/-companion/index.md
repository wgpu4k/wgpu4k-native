//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSurfaceCapabilities](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [alphaModeCountLayout](alpha-mode-count-layout.md) | [jvm]<br>val [alphaModeCountLayout](alpha-mode-count-layout.md): ValueLayout |
| [alphaModeCountOffset](alpha-mode-count-offset.md) | [jvm]<br>val [alphaModeCountOffset](alpha-mode-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 48 |
| [alphaModesLayout](alpha-modes-layout.md) | [jvm]<br>val [alphaModesLayout](alpha-modes-layout.md): ValueLayout |
| [alphaModesOffset](alpha-modes-offset.md) | [jvm]<br>val [alphaModesOffset](alpha-modes-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 56 |
| [formatCountLayout](format-count-layout.md) | [jvm]<br>val [formatCountLayout](format-count-layout.md): ValueLayout |
| [formatCountOffset](format-count-offset.md) | [jvm]<br>val [formatCountOffset](format-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [formatsLayout](formats-layout.md) | [jvm]<br>val [formatsLayout](formats-layout.md): ValueLayout |
| [formatsOffset](formats-offset.md) | [jvm]<br>val [formatsOffset](formats-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [presentModeCountLayout](present-mode-count-layout.md) | [jvm]<br>val [presentModeCountLayout](present-mode-count-layout.md): ValueLayout |
| [presentModeCountOffset](present-mode-count-offset.md) | [jvm]<br>val [presentModeCountOffset](present-mode-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |
| [presentModesLayout](present-modes-layout.md) | [jvm]<br>val [presentModesLayout](present-modes-layout.md): ValueLayout |
| [presentModesOffset](present-modes-offset.md) | [jvm]<br>val [presentModesOffset](present-modes-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 40 |
| [usagesLayout](usages-layout.md) | [jvm]<br>val [usagesLayout](usages-layout.md): ValueLayout |
| [usagesOffset](usages-offset.md) | [jvm]<br>val [usagesOffset](usages-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUSurfaceCapabilities](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUSurfaceCapabilities](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUSurfaceCapabilities](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUSurfaceCapabilities](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUSurfaceCapabilities](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUSurfaceCapabilities](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUSurfaceCapabilities](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUSurfaceCapabilities](../index.md) |