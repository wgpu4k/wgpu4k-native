//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUAdapterInfo](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [adapterTypeLayout](adapter-type-layout.md) | [jvm]<br>val [adapterTypeLayout](adapter-type-layout.md): ValueLayout |
| [adapterTypeOffset](adapter-type-offset.md) | [jvm]<br>val [adapterTypeOffset](adapter-type-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 76 |
| [architectureLayout](architecture-layout.md) | [jvm]<br>val [architectureLayout](architecture-layout.md): StructLayout |
| [architectureOffset](architecture-offset.md) | [jvm]<br>val [architectureOffset](architecture-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [backendTypeLayout](backend-type-layout.md) | [jvm]<br>val [backendTypeLayout](backend-type-layout.md): ValueLayout |
| [backendTypeOffset](backend-type-offset.md) | [jvm]<br>val [backendTypeOffset](backend-type-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 72 |
| [descriptionLayout](description-layout.md) | [jvm]<br>val [descriptionLayout](description-layout.md): StructLayout |
| [descriptionOffset](description-offset.md) | [jvm]<br>val [descriptionOffset](description-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 56 |
| [deviceIDLayout](device-i-d-layout.md) | [jvm]<br>val [deviceIDLayout](device-i-d-layout.md): ValueLayout |
| [deviceIDOffset](device-i-d-offset.md) | [jvm]<br>val [deviceIDOffset](device-i-d-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 84 |
| [deviceLayout](device-layout.md) | [jvm]<br>val [deviceLayout](device-layout.md): StructLayout |
| [deviceOffset](device-offset.md) | [jvm]<br>val [deviceOffset](device-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 40 |
| [nextInChainLayout](next-in-chain-layout.md) | [jvm]<br>val [nextInChainLayout](next-in-chain-layout.md): ValueLayout |
| [nextInChainOffset](next-in-chain-offset.md) | [jvm]<br>val [nextInChainOffset](next-in-chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [vendorIDLayout](vendor-i-d-layout.md) | [jvm]<br>val [vendorIDLayout](vendor-i-d-layout.md): ValueLayout |
| [vendorIDOffset](vendor-i-d-offset.md) | [jvm]<br>val [vendorIDOffset](vendor-i-d-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 80 |
| [vendorLayout](vendor-layout.md) | [jvm]<br>val [vendorLayout](vendor-layout.md): StructLayout |
| [vendorOffset](vendor-offset.md) | [jvm]<br>val [vendorOffset](vendor-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 8 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUAdapterInfo](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUAdapterInfo](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUAdapterInfo](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUAdapterInfo](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUAdapterInfo](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUAdapterInfo](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUAdapterInfo](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUAdapterInfo](../index.md) |