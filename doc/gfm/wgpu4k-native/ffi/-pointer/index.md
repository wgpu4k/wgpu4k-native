//[wgpu4k-native](../../../index.md)/[ffi](../index.md)/[Pointer](index.md)

# Pointer

[native]\
class [Pointer](index.md)(val pointer: [CPointer](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-pointer/index.html)&lt;[COpaque](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-opaque/index.html)&gt;)

## Constructors

| | |
|---|---|
| [Pointer](-pointer.md) | [native]<br>constructor(pointer: [CPointer](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-pointer/index.html)&lt;*&gt;)constructor(pointer: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html))constructor(pointer: [CPointer](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-pointer/index.html)&lt;[COpaque](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-opaque/index.html)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [pointer](pointer.md) | [native]<br>val [pointer](pointer.md): [CPointer](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-pointer/index.html)&lt;[COpaque](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-opaque/index.html)&gt; |
| [rawValue](raw-value.md) | [native]<br>val [rawValue](raw-value.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [reinterpret](reinterpret.md) | [native]<br>fun &lt;[T](reinterpret.md) : [CPointed](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-pointed/index.html)&gt; [reinterpret](reinterpret.md)(): [CPointer](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-pointer/index.html)&lt;[T](reinterpret.md)&gt; |