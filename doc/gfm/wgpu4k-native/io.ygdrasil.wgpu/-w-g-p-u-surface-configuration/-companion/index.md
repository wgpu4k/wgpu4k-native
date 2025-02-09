//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSurfaceConfiguration](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [alphaModeLayout](alpha-mode-layout.md) | [jvm]<br>val [alphaModeLayout](alpha-mode-layout.md): ValueLayout |
| [alphaModeOffset](alpha-mode-offset.md) | [jvm]<br>val [alphaModeOffset](alpha-mode-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 56 |
| [deviceLayout](device-layout.md) | [jvm]<br>val [deviceLayout](device-layout.md): ValueLayout |
| [deviceOffset](device-offset.md) | [jvm]<br>val [deviceOffset](device-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [formatLayout](format-layout.md) | [jvm]<br>val [formatLayout](format-layout.md): ValueLayout |
| [formatOffset](format-offset.md) | [jvm]<br>val [formatOffset](format-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [heightLayout](height-layout.md) | [jvm]<br>val [heightLayout](height-layout.md): ValueLayout |
| [heightOffset](height-offset.md) | [jvm]<br>val [heightOffset](height-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 36 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [presentModeLayout](present-mode-layout.md) | [jvm]<br>val [presentModeLayout](present-mode-layout.md): ValueLayout |
| [presentModeOffset](present-mode-offset.md) | [jvm]<br>val [presentModeOffset](present-mode-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 60 |
| [usageLayout](usage-layout.md) | [jvm]<br>val [usageLayout](usage-layout.md): ValueLayout |
| [usageOffset](usage-offset.md) | [jvm]<br>val [usageOffset](usage-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [viewFormatCountLayout](view-format-count-layout.md) | [jvm]<br>val [viewFormatCountLayout](view-format-count-layout.md): ValueLayout |
| [viewFormatCountOffset](view-format-count-offset.md) | [jvm]<br>val [viewFormatCountOffset](view-format-count-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 40 |
| [viewFormatsLayout](view-formats-layout.md) | [jvm]<br>val [viewFormatsLayout](view-formats-layout.md): ValueLayout |
| [viewFormatsOffset](view-formats-offset.md) | [jvm]<br>val [viewFormatsOffset](view-formats-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 48 |
| [widthLayout](width-layout.md) | [jvm]<br>val [widthLayout](width-layout.md): ValueLayout |
| [widthOffset](width-offset.md) | [jvm]<br>val [widthOffset](width-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUSurfaceConfiguration](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUSurfaceConfiguration](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUSurfaceConfiguration](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUSurfaceConfiguration](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUSurfaceConfiguration](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUSurfaceConfiguration](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUSurfaceConfiguration](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUSurfaceConfiguration](../index.md) |