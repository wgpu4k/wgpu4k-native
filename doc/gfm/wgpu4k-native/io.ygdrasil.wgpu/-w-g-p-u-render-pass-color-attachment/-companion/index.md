//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPassColorAttachment](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [clearValueLayout](clear-value-layout.md) | [jvm]<br>val [clearValueLayout](clear-value-layout.md): StructLayout |
| [clearValueOffset](clear-value-offset.md) | [jvm]<br>val [clearValueOffset](clear-value-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 40 |
| [depthSliceLayout](depth-slice-layout.md) | [jvm]<br>val [depthSliceLayout](depth-slice-layout.md): ValueLayout |
| [depthSliceOffset](depth-slice-offset.md) | [jvm]<br>val [depthSliceOffset](depth-slice-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [loadOpLayout](load-op-layout.md) | [jvm]<br>val [loadOpLayout](load-op-layout.md): ValueLayout |
| [loadOpOffset](load-op-offset.md) | [jvm]<br>val [loadOpOffset](load-op-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [resolveTargetLayout](resolve-target-layout.md) | [jvm]<br>val [resolveTargetLayout](resolve-target-layout.md): ValueLayout |
| [resolveTargetOffset](resolve-target-offset.md) | [jvm]<br>val [resolveTargetOffset](resolve-target-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [storeOpLayout](store-op-layout.md) | [jvm]<br>val [storeOpLayout](store-op-layout.md): ValueLayout |
| [storeOpOffset](store-op-offset.md) | [jvm]<br>val [storeOpOffset](store-op-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 36 |
| [viewLayout](view-layout.md) | [jvm]<br>val [viewLayout](view-layout.md): ValueLayout |
| [viewOffset](view-offset.md) | [jvm]<br>val [viewOffset](view-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPURenderPassColorAttachment](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPURenderPassColorAttachment](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPURenderPassColorAttachment](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURenderPassColorAttachment](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPURenderPassColorAttachment](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURenderPassColorAttachment](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPURenderPassColorAttachment](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPURenderPassColorAttachment](../index.md) |