//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPassDepthStencilAttachment](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [depthClearValueLayout](depth-clear-value-layout.md) | [jvm]<br>val [depthClearValueLayout](depth-clear-value-layout.md): ValueLayout |
| [depthClearValueOffset](depth-clear-value-offset.md) | [jvm]<br>val [depthClearValueOffset](depth-clear-value-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [depthLoadOpLayout](depth-load-op-layout.md) | [jvm]<br>val [depthLoadOpLayout](depth-load-op-layout.md): ValueLayout |
| [depthLoadOpOffset](depth-load-op-offset.md) | [jvm]<br>val [depthLoadOpOffset](depth-load-op-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |
| [depthReadOnlyLayout](depth-read-only-layout.md) | [jvm]<br>val [depthReadOnlyLayout](depth-read-only-layout.md): ValueLayout |
| [depthReadOnlyOffset](depth-read-only-offset.md) | [jvm]<br>val [depthReadOnlyOffset](depth-read-only-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 20 |
| [depthStoreOpLayout](depth-store-op-layout.md) | [jvm]<br>val [depthStoreOpLayout](depth-store-op-layout.md): ValueLayout |
| [depthStoreOpOffset](depth-store-op-offset.md) | [jvm]<br>val [depthStoreOpOffset](depth-store-op-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 12 |
| [stencilClearValueLayout](stencil-clear-value-layout.md) | [jvm]<br>val [stencilClearValueLayout](stencil-clear-value-layout.md): ValueLayout |
| [stencilClearValueOffset](stencil-clear-value-offset.md) | [jvm]<br>val [stencilClearValueOffset](stencil-clear-value-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |
| [stencilLoadOpLayout](stencil-load-op-layout.md) | [jvm]<br>val [stencilLoadOpLayout](stencil-load-op-layout.md): ValueLayout |
| [stencilLoadOpOffset](stencil-load-op-offset.md) | [jvm]<br>val [stencilLoadOpOffset](stencil-load-op-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [stencilReadOnlyLayout](stencil-read-only-layout.md) | [jvm]<br>val [stencilReadOnlyLayout](stencil-read-only-layout.md): ValueLayout |
| [stencilReadOnlyOffset](stencil-read-only-offset.md) | [jvm]<br>val [stencilReadOnlyOffset](stencil-read-only-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 36 |
| [stencilStoreOpLayout](stencil-store-op-layout.md) | [jvm]<br>val [stencilStoreOpLayout](stencil-store-op-layout.md): ValueLayout |
| [stencilStoreOpOffset](stencil-store-op-offset.md) | [jvm]<br>val [stencilStoreOpOffset](stencil-store-op-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 28 |
| [viewLayout](view-layout.md) | [jvm]<br>val [viewLayout](view-layout.md): ValueLayout |
| [viewOffset](view-offset.md) | [jvm]<br>val [viewOffset](view-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPURenderPassDepthStencilAttachment](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPURenderPassDepthStencilAttachment](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPURenderPassDepthStencilAttachment](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURenderPassDepthStencilAttachment](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPURenderPassDepthStencilAttachment](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURenderPassDepthStencilAttachment](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPURenderPassDepthStencilAttachment](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPURenderPassDepthStencilAttachment](../index.md) |