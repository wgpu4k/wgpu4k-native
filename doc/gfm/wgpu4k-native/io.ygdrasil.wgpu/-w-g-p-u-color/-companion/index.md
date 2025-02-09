//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUColor](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [aLayout](a-layout.md) | [jvm]<br>val [aLayout](a-layout.md): ValueLayout |
| [aOffset](a-offset.md) | [jvm]<br>val [aOffset](a-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [bLayout](b-layout.md) | [jvm]<br>val [bLayout](b-layout.md): ValueLayout |
| [bOffset](b-offset.md) | [jvm]<br>val [bOffset](b-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [gLayout](g-layout.md) | [jvm]<br>val [gLayout](g-layout.md): ValueLayout |
| [gOffset](g-offset.md) | [jvm]<br>val [gOffset](g-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [rLayout](r-layout.md) | [jvm]<br>val [rLayout](r-layout.md): ValueLayout |
| [rOffset](r-offset.md) | [jvm]<br>val [rOffset](r-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUColor](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUColor](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUColor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUColor](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUColor](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUColor](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUColor](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUColor](../index.md) |