//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTexelCopyTextureInfo](../index.md)/[[jvm]ByReference](index.md)

# ByReference

[jvm]\
@[JvmInline](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-inline/index.html)

value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUTexelCopyTextureInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [jvm]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [aspect](aspect.md) | [jvm]<br>open override var [aspect](aspect.md): [WGPUTextureAspect](../../-w-g-p-u-texture-aspect/index.md) |
| [handler](handler.md) | [jvm]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [mipLevel](mip-level.md) | [jvm]<br>open override var [mipLevel](mip-level.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [origin](origin.md) | [jvm]<br>open override val [origin](origin.md): [WGPUOrigin3D](../../-w-g-p-u-origin3-d/index.md) |
| [texture](texture.md) | [jvm]<br>open override var [texture](texture.md): [WGPUTexture](../../-w-g-p-u-texture/index.md)? |

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