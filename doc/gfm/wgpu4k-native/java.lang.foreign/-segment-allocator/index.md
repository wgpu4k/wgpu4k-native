//[wgpu4k-native](../../../index.md)/[java.lang.foreign](../index.md)/[SegmentAllocator](index.md)

# SegmentAllocator

[android]\
class [SegmentAllocator](index.md)(arena: [JnaArena](../../ffi/-jna-arena/index.md))

## Constructors

| | |
|---|---|
| [SegmentAllocator](-segment-allocator.md) | [android]<br>constructor(arena: [JnaArena](../../ffi/-jna-arena/index.md)) |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [android]<br>fun [allocate](allocate.md)(layout: [ValueLayout](../-value-layout/index.md)): [MemorySegment](../-memory-segment/index.md)<br>fun [allocate](allocate.md)(size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [NativeAddress](../../ffi/-native-address/index.md)<br>fun [allocate](allocate.md)(layout: [ValueLayout](../-value-layout/index.md), size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [MemorySegment](../-memory-segment/index.md) |
| [allocateFrom](allocate-from.md) | [android]<br>fun [allocateFrom](allocate-from.md)(label: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): Pointer<br>fun [allocateFrom](allocate-from.md)(layout: [ValueLayout.OfByte](../-value-layout/-of-byte/index.md), values: [ByteArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-byte-array/index.html)): [MemorySegment](../-memory-segment/index.md)<br>fun [allocateFrom](allocate-from.md)(layout: [ValueLayout.OfDouble](../-value-layout/-of-double/index.md), values: [DoubleArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-double-array/index.html)): [MemorySegment](../-memory-segment/index.md)<br>fun [allocateFrom](allocate-from.md)(layout: [ValueLayout.OfFloat](../-value-layout/-of-float/index.md), values: [FloatArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float-array/index.html)): [MemorySegment](../-memory-segment/index.md)<br>fun [allocateFrom](allocate-from.md)(layout: [ValueLayout.OfInt](../-value-layout/-of-int/index.md), values: [IntArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int-array/index.html)): [MemorySegment](../-memory-segment/index.md)<br>fun [allocateFrom](allocate-from.md)(layout: [ValueLayout.OfLong](../-value-layout/-of-long/index.md), values: [LongArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long-array/index.html)): [MemorySegment](../-memory-segment/index.md)<br>fun [allocateFrom](allocate-from.md)(layout: [ValueLayout.OfShort](../-value-layout/-of-short/index.md), values: [ShortArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-short-array/index.html)): [MemorySegment](../-memory-segment/index.md) |