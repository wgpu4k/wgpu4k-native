//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSurfaceCapabilities](../index.md)/[[jvm]ByReference](index.md)

# ByReference

[jvm]\
@[JvmInline](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-inline/index.html)

value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUSurfaceCapabilities](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [jvm]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [alphaModeCount](alpha-mode-count.md) | [jvm]<br>open override var [alphaModeCount](alpha-mode-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [alphaModes](alpha-modes.md) | [jvm]<br>open override var [alphaModes](alpha-modes.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUCompositeAlphaMode](../../-w-g-p-u-composite-alpha-mode/index.md)&gt;? |
| [formatCount](format-count.md) | [jvm]<br>open override var [formatCount](format-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [formats](formats.md) | [jvm]<br>open override var [formats](formats.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md)&gt;? |
| [handler](handler.md) | [jvm]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [jvm]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [presentModeCount](present-mode-count.md) | [jvm]<br>open override var [presentModeCount](present-mode-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [presentModes](present-modes.md) | [jvm]<br>open override var [presentModes](present-modes.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUPresentMode](../../-w-g-p-u-present-mode/index.md)&gt;? |
| [usages](usages.md) | [jvm]<br>open override var [usages](usages.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [get](../../../ffi/[jvm]-c-structure/get.md) | [jvm]<br>open fun [get](../../../ffi/[jvm]-c-structure/get.md)(layout: StructLayout, offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [MemorySegment](../../../ffi/-memory-segment/index.md)<br>open fun [get](../../../ffi/[jvm]-c-structure/get.md)(layout: ValueLayout, offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [MemorySegment](../../../ffi/-memory-segment/index.md) |
| [getDouble](../../../ffi/[jvm]-c-structure/get-double.md) | [jvm]<br>open fun [getDouble](../../../ffi/[jvm]-c-structure/get-double.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Double](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-double/index.html) |
| [getFloat](../../../ffi/[jvm]-c-structure/get-float.md) | [jvm]<br>open fun [getFloat](../../../ffi/[jvm]-c-structure/get-float.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [getInt](../../../ffi/[jvm]-c-structure/get-int.md) | [jvm]<br>open fun [getInt](../../../ffi/[jvm]-c-structure/get-int.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [getShort](../../../ffi/[jvm]-c-structure/get-short.md) | [jvm]<br>open fun [getShort](../../../ffi/[jvm]-c-structure/get-short.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Short](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-short/index.html) |
| [getUInt](../../../ffi/[jvm]-c-structure/get-u-int.md) | [jvm]<br>open fun [getUInt](../../../ffi/[jvm]-c-structure/get-u-int.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [getULong](../../../ffi/[jvm]-c-structure/get-u-long.md) | [jvm]<br>open fun [getULong](../../../ffi/[jvm]-c-structure/get-u-long.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [getUShort](../../../ffi/[jvm]-c-structure/get-u-short.md) | [jvm]<br>open fun [getUShort](../../../ffi/[jvm]-c-structure/get-u-short.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [UShort](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-short/index.html) |
| [set](../../../ffi/[jvm]-c-structure/set.md) | [jvm]<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html))<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Double](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-double/index.html))<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Short](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-short/index.html))<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html))<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html))<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [UShort](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-short/index.html))<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(layout: StructLayout, offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), address: [NativeAddress](../../../ffi/-native-address/index.md)?)<br>open fun [set](../../../ffi/[jvm]-c-structure/set.md)(layout: ValueLayout, offset: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), address: [NativeAddress](../../../ffi/-native-address/index.md)?) |