//[wgpu4k-native](../../index.md)/[java.lang.foreign](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [AddressLayout](-address-layout/index.md) | [android]<br>typealias [AddressLayout](-address-layout/index.md) = [ValueLayout](-value-layout/index.md) |
| [Arena](-arena/index.md) | [android]<br>class [Arena](-arena/index.md) |
| [GroupLayout](-group-layout/index.md) | [android]<br>class [GroupLayout](-group-layout/index.md)(layouts: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[ValueLayout](-value-layout/index.md)&gt;, val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](-value-layout/index.md) |
| [MemoryLayout](-memory-layout/index.md) | [android]<br>class [MemoryLayout](-memory-layout/index.md) |
| [MemorySegment](-memory-segment/index.md) | [android]<br>class [MemorySegment](-memory-segment/index.md)(val pointer: Pointer, val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = -1) |
| [PaddingLayout](-padding-layout/index.md) | [android]<br>class [PaddingLayout](-padding-layout/index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](-value-layout/index.md) |
| [SegmentAllocator](-segment-allocator/index.md) | [android]<br>class [SegmentAllocator](-segment-allocator/index.md)(arena: [JnaArena](../ffi/-jna-arena/index.md)) |
| [ValueLayout](-value-layout/index.md) | [android]<br>abstract class [ValueLayout](-value-layout/index.md)(val size: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html), val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) |

## Functions

| Name | Summary |
|---|---|
| [getBytes](get-bytes.md) | [android]<br>fun [getBytes](get-bytes.md)(s: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), charset: [Charset](https://developer.android.com/reference/kotlin/java/nio/charset/Charset.html)?): [ByteArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-byte-array/index.html)<br>fun [getBytes](get-bytes.md)(s: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), encoding: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)?): [ByteArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-byte-array/index.html) |