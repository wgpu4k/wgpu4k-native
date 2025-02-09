//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu.android](../../index.md)/[WGPURequestDeviceCallbackInfo](../index.md)/[ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(pointer: Pointer? = null) : [WGPURequestDeviceCallbackInfo](../index.md), Structure.ByValue

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(other: [WGPURequestDeviceCallbackInfo](../index.md))constructor(pointer: Pointer? = null) |

## Properties

| Name | Summary |
|---|---|
| [autoRead](index.md#-1660627269%2FFunctions%2F-895170507) | [android]<br>var [autoRead](index.md#-1660627269%2FFunctions%2F-895170507): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [autoWrite](index.md#2132137834%2FFunctions%2F-895170507) | [android]<br>var [autoWrite](index.md#2132137834%2FFunctions%2F-895170507): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [callback](../callback.md) | [android]<br>@[JvmField](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [callback](../callback.md): Callback? |
| [mode](../mode.md) | [android]<br>@[JvmField](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [mode](../mode.md): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [nextInChain](../next-in-chain.md) | [android]<br>@[JvmField](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [nextInChain](../next-in-chain.md): [WGPUChainedStruct.ByReference](../../-w-g-p-u-chained-struct/-by-reference/index.md)? |
| [userdata1](../userdata1.md) | [android]<br>@[JvmField](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [userdata1](../userdata1.md): Pointer? |
| [userdata2](../userdata2.md) | [android]<br>@[JvmField](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-field/index.html)<br>var [userdata2](../userdata2.md): Pointer? |

## Functions

| Name | Summary |
|---|---|
| [autoRead](index.md#-1660627269%2FFunctions%2F-895170507) | [android]<br>open fun [autoRead](index.md#-1660627269%2FFunctions%2F-895170507)() |
| [autoWrite](index.md#2132137834%2FFunctions%2F-895170507) | [android]<br>open fun [autoWrite](index.md#2132137834%2FFunctions%2F-895170507)() |
| [clear](index.md#718961069%2FFunctions%2F-895170507) | [android]<br>open fun [clear](index.md#718961069%2FFunctions%2F-895170507)() |
| [dataEquals](index.md#1435600696%2FFunctions%2F-895170507) | [android]<br>open fun [dataEquals](index.md#1435600696%2FFunctions%2F-895170507)(p0: Structure): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)<br>open fun [dataEquals](index.md#-611011252%2FFunctions%2F-895170507)(p0: Structure, p1: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [equals](index.md#-1689848703%2FFunctions%2F-895170507) | [android]<br>open operator override fun [equals](index.md#-1689848703%2FFunctions%2F-895170507)(other: [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [getPointer](index.md#-1766351335%2FFunctions%2F-895170507) | [android]<br>open fun [getPointer](index.md#-1766351335%2FFunctions%2F-895170507)(): Pointer |
| [hashCode](index.md#-87232699%2FFunctions%2F-895170507) | [android]<br>open override fun [hashCode](index.md#-87232699%2FFunctions%2F-895170507)(): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [read](index.md#-605623382%2FFunctions%2F-895170507) | [android]<br>open fun [read](index.md#-605623382%2FFunctions%2F-895170507)() |
| [readField](index.md#-142250898%2FFunctions%2F-895170507) | [android]<br>open fun [readField](index.md#-142250898%2FFunctions%2F-895170507)(p0: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html) |
| [setAutoSynch](index.md#-1873879351%2FFunctions%2F-895170507) | [android]<br>open fun [setAutoSynch](index.md#-1873879351%2FFunctions%2F-895170507)(p0: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)) |
| [size](index.md#1665065887%2FFunctions%2F-895170507) | [android]<br>open fun [size](index.md#1665065887%2FFunctions%2F-895170507)(): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [toArray](index.md#2132340621%2FFunctions%2F-895170507) | [android]<br>open fun [toArray](index.md#2132340621%2FFunctions%2F-895170507)(p0: [Array](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-array/index.html)&lt;Structure&gt;): [Array](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-array/index.html)&lt;Structure&gt;<br>open fun [toArray](index.md#554934234%2FFunctions%2F-895170507)(p0: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)): [Array](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-array/index.html)&lt;Structure&gt; |
| [toString](index.md#-265398764%2FFunctions%2F-895170507) | [android]<br>open override fun [toString](index.md#-265398764%2FFunctions%2F-895170507)(): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)<br>open fun [toString](index.md#1718618713%2FFunctions%2F-895170507)(p0: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
| [write](index.md#477519963%2FFunctions%2F-895170507) | [android]<br>open fun [write](index.md#477519963%2FFunctions%2F-895170507)() |
| [writeField](index.md#963475167%2FFunctions%2F-895170507) | [android]<br>open fun [writeField](index.md#963475167%2FFunctions%2F-895170507)(p0: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html))<br>open fun [writeField](index.md#1741006465%2FFunctions%2F-895170507)(p0: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), p1: [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)) |