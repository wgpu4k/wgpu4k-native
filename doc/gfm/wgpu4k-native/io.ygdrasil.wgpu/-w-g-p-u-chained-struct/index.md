//[wgpu4k-native](../../../index.md)/[io.ygdrasil.wgpu](../index.md)/[WGPUChainedStruct](index.md)

# WGPUChainedStruct

expect interface [WGPUChainedStruct](index.md)actual interface [WGPUChainedStruct](index.md)actual interface [WGPUChainedStruct](index.md) : [CStructure](../../ffi/[jvm]-c-structure/index.md)actual interface [WGPUChainedStruct](index.md)

#### Inheritors

| |
|---|
| [ByReference]([android]-by-reference/index.md) |
| [ByValue]([android]-by-value/index.md) |
| [ByReference]([jvm]-by-reference/index.md) |
| [ByReference]([native]-by-reference/index.md) |
| [ByValue]([native]-by-value/index.md) |

## Types

| Name | Summary |
|---|---|
| ByReference | [android, jvm, native]<br>[android]<br>class [ByReference]([android]-by-reference/index.md)(val handle: WGPUChainedStruct.ByReference = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUChainedStruct](index.md)<br>[jvm]<br>@[JvmInline](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-inline/index.html)<br>value class [ByReference]([jvm]-by-reference/index.md)(val handler: [NativeAddress](../../ffi/-native-address/index.md)) : [WGPUChainedStruct](index.md)<br>[native]<br>value class [ByReference]([native]-by-reference/index.md)(val handler: [NativeAddress](../../ffi/-native-address/index.md)) : [WGPUChainedStruct](index.md) |
| ByValue | [android, native]<br>[android]<br>class [ByValue]([android]-by-value/index.md)(val handle: WGPUChainedStruct.ByValue = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUChainedStruct](index.md)<br>[native]<br>value class [ByValue]([native]-by-value/index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUChainedStruct&gt;) : [WGPUChainedStruct](index.md) |
| [Companion](-companion/index.md) | [common, android, jvm, native]<br>[common]<br>expect object [Companion](-companion/index.md)<br>[android, jvm, native]<br>actual object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| handler | [jvm, common, android, native]<br>[jvm]<br>abstract val [handler](../../ffi/[jvm]-c-structure/handler.md): [NativeAddress](../../ffi/-native-address/index.md)<br>[common]<br>expect abstract val [handler](handler.md): [NativeAddress](../../ffi/-native-address/index.md)<br>[android, native]<br>actual abstract val [handler](handler.md): [NativeAddress](../../ffi/-native-address/index.md) |
| [next](next.md) | [common, android, jvm, native]<br>[common]<br>expect abstract var [next](next.md): [WGPUChainedStruct](index.md)?<br>[android, jvm, native]<br>actual abstract var [next](next.md): [WGPUChainedStruct](index.md)? |
| [sType](s-type.md) | [common, android, jvm, native]<br>[common]<br>expect abstract var [sType](s-type.md): [WGPUSType](../-w-g-p-u-s-type/index.md)<br>[android, jvm, native]<br>actual abstract var [sType](s-type.md): [WGPUSType](../-w-g-p-u-s-type/index.md) |

## Functions

| Name | Summary |
|---|---|
| [get](../../ffi/[jvm]-c-structure/get.md) | [jvm]<br>open fun [get](../../ffi/[jvm]-c-structure/get.md)(layout: StructLayout, offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [MemorySegment](../../ffi/-memory-segment/index.md)<br>open fun [get](../../ffi/[jvm]-c-structure/get.md)(layout: ValueLayout, offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [MemorySegment](../../ffi/-memory-segment/index.md) |
| [getDouble](../../ffi/[jvm]-c-structure/get-double.md) | [jvm]<br>open fun [getDouble](../../ffi/[jvm]-c-structure/get-double.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Double](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-double/index.html) |
| [getFloat](../../ffi/[jvm]-c-structure/get-float.md) | [jvm]<br>open fun [getFloat](../../ffi/[jvm]-c-structure/get-float.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [getInt](../../ffi/[jvm]-c-structure/get-int.md) | [jvm]<br>open fun [getInt](../../ffi/[jvm]-c-structure/get-int.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [getShort](../../ffi/[jvm]-c-structure/get-short.md) | [jvm]<br>open fun [getShort](../../ffi/[jvm]-c-structure/get-short.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Short](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-short/index.html) |
| [getUInt](../../ffi/[jvm]-c-structure/get-u-int.md) | [jvm]<br>open fun [getUInt](../../ffi/[jvm]-c-structure/get-u-int.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [getULong](../../ffi/[jvm]-c-structure/get-u-long.md) | [jvm]<br>open fun [getULong](../../ffi/[jvm]-c-structure/get-u-long.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [getUShort](../../ffi/[jvm]-c-structure/get-u-short.md) | [jvm]<br>open fun [getUShort](../../ffi/[jvm]-c-structure/get-u-short.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [UShort](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-short/index.html) |
| [set](../../ffi/[jvm]-c-structure/set.md) | [jvm]<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html))<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Double](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-double/index.html))<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Short](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-short/index.html))<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html))<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html))<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [UShort](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-short/index.html))<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(layout: StructLayout, offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), address: [NativeAddress](../../ffi/-native-address/index.md)?)<br>open fun [set](../../ffi/[jvm]-c-structure/set.md)(layout: ValueLayout, offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), address: [NativeAddress](../../ffi/-native-address/index.md)?) |
| toCValue | [android, native]<br>[android]<br>open fun [toCValue]([android]to-c-value.md)(): WGPUChainedStruct.ByValue<br>[native]<br>open fun [toCValue]([native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUChainedStruct&gt; |
| [toReference](to-reference.md) | [android]<br>open fun [toReference](to-reference.md)(): WGPUChainedStruct.ByReference |