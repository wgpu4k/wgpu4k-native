//[wgpu4k-native](../../../index.md)/[java.lang.foreign](../index.md)/[ValueLayout](index.md)

# ValueLayout

abstract class [ValueLayout](index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null)

#### Inheritors

| |
|---|
| [GroupLayout](../-group-layout/index.md) |
| [OfDouble](-of-double/index.md) |
| [OfFloat](-of-float/index.md) |
| [OfInt](-of-int/index.md) |
| [OfLong](-of-long/index.md) |
| [OfShort](-of-short/index.md) |
| [OfByte](-of-byte/index.md) |
| [OfBoolean](-of-boolean/index.md) |
| [PaddingLayout](../-padding-layout/index.md) |

## Constructors

| | |
|---|---|
| [ValueLayout](-value-layout.md) | [android]<br>constructor(size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [android]<br>object [Companion](-companion/index.md) |
| [OfBoolean](-of-boolean/index.md) | [android]<br>class [OfBoolean](-of-boolean/index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](index.md) |
| [OfByte](-of-byte/index.md) | [android]<br>class [OfByte](-of-byte/index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](index.md) |
| [OfDouble](-of-double/index.md) | [android]<br>class [OfDouble](-of-double/index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](index.md) |
| [OfFloat](-of-float/index.md) | [android]<br>class [OfFloat](-of-float/index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](index.md) |
| [OfInt](-of-int/index.md) | [android]<br>class [OfInt](-of-int/index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](index.md) |
| [OfLong](-of-long/index.md) | [android]<br>class [OfLong](-of-long/index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](index.md) |
| [OfShort](-of-short/index.md) | [android]<br>class [OfShort](-of-short/index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](index.md) |

## Properties

| Name | Summary |
|---|---|
| [name](name.md) | [android]<br>val [name](name.md): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null |
| [size](size.md) | [android]<br>val [size](size.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [withName](with-name.md) | [android]<br>abstract fun [withName](with-name.md)(name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [ValueLayout](index.md) |