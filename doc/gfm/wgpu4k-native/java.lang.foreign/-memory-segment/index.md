//[wgpu4k-native](../../../index.md)/[java.lang.foreign](../index.md)/[MemorySegment](index.md)

# MemorySegment

[android]\
class [MemorySegment](index.md)(val pointer: Pointer, val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = -1)

## Constructors

| | |
|---|---|
| [MemorySegment](-memory-segment.md) | [android]<br>constructor(address: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = -1)constructor(pointer: Pointer, size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = -1) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [android]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [pointer](pointer.md) | [android]<br>val [pointer](pointer.md): Pointer |
| [size](size.md) | [android]<br>val [size](size.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [asSlice](as-slice.md) | [android]<br>fun [asSlice](as-slice.md)(offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0): [MemorySegment](index.md) |
| [fillWithZero](fill-with-zero.md) | [android]<br>fun [fillWithZero](fill-with-zero.md)() |
| [get](get.md) | [android]<br>fun [get](get.md)(layout: ValueLayout.OfDouble?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Double](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-double/index.html)<br>fun [get](get.md)(layout: ValueLayout.OfFloat?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html)<br>fun [get](get.md)(layout: ValueLayout.OfInt?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)<br>fun [get](get.md)(layout: ValueLayout.OfLong?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)<br>fun [get](get.md)(layout: ValueLayout.OfShort?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [Short](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-short/index.html)<br>fun [get](get.md)(layout: [AddressLayout](../-address-layout/index.md)?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [MemorySegment](index.md) |
| [set](set.md) | [android]<br>fun [set](set.md)(layout: ValueLayout.OfDouble?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), newValue: [Double](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-double/index.html))<br>fun [set](set.md)(layout: ValueLayout.OfFloat?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), newValue: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>fun [set](set.md)(layout: ValueLayout.OfInt?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), newValue: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>fun [set](set.md)(layout: ValueLayout.OfLong?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), newValue: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html))<br>fun [set](set.md)(layout: ValueLayout.OfShort?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), newValue: [Short](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-short/index.html))<br>fun [set](set.md)(layout: [AddressLayout](../-address-layout/index.md)?, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), newValue: [MemorySegment](index.md)) |
| [setAtIndex](set-at-index.md) | [android]<br>fun [setAtIndex](set-at-index.md)(layout: ValueLayout.OfInt, offest: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), value: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)) |