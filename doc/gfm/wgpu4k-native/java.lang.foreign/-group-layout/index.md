//[wgpu4k-native](../../../index.md)/[java.lang.foreign](../index.md)/[GroupLayout](index.md)

# GroupLayout

[android]\
class [GroupLayout](index.md)(layouts: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[ValueLayout](../-value-layout/index.md)&gt;, val name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) : [ValueLayout](../-value-layout/index.md)

## Constructors

| | |
|---|---|
| [GroupLayout](-group-layout.md) | [android]<br>constructor(layouts: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[ValueLayout](../-value-layout/index.md)&gt;, name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [name](../-value-layout/name.md) | [android]<br>val [name](../-value-layout/name.md): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? = null |
| [size](../-value-layout/size.md) | [android]<br>val [size](../-value-layout/size.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [byteSize](byte-size.md) | [android]<br>fun [byteSize](byte-size.md)(): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) |
| [select](select.md) | [android]<br>fun [select](select.md)(name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [ValueLayout](../-value-layout/index.md) |
| [withName](with-name.md) | [android]<br>open override fun [withName](with-name.md)(name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [GroupLayout](index.md) |