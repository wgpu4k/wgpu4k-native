//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUFutureWaitInfo](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [completedLayout](completed-layout.md) | [jvm]<br>val [completedLayout](completed-layout.md): ValueLayout |
| [completedOffset](completed-offset.md) | [jvm]<br>val [completedOffset](completed-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [futureLayout](future-layout.md) | [jvm]<br>val [futureLayout](future-layout.md): StructLayout |
| [futureOffset](future-offset.md) | [jvm]<br>val [futureOffset](future-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUFutureWaitInfo](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUFutureWaitInfo](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUFutureWaitInfo](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUFutureWaitInfo](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUFutureWaitInfo](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUFutureWaitInfo](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUFutureWaitInfo](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUFutureWaitInfo](../index.md) |