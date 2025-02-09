//[wgpu4k-native](../../../index.md)/[ffi](../index.md)/[CString](index.md)

# CString

[common]\
expect value class [CString](index.md)

[android, jvm]\
@[JvmInline](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-inline/index.html)

actual value class [CString](index.md)

[native]\
actual value class [CString](index.md)

## Constructors

| | |
|---|---|
| [CString](-c-string.md) | [common]<br>expect constructor(handler: [NativeAddress](../-native-address/index.md))<br>[android, jvm, native]<br>actual constructor(handler: [NativeAddress](../-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [handler](handler.md) | [common, android, jvm, native]<br>[common]<br>expect val [handler](handler.md): [NativeAddress](../-native-address/index.md)<br>[android, jvm, native]<br>actual val [handler](handler.md): [NativeAddress](../-native-address/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toKString](to-k-string.md) | [common, android, jvm, native]<br>[common]<br>expect fun [toKString](to-k-string.md)(): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)?<br>[android, jvm, native]<br>actual fun [toKString](to-k-string.md)(): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)?<br>[common]<br>expect fun [toKString](to-k-string.md)(size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)?<br>[android, jvm, native]<br>actual fun [toKString](to-k-string.md)(size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)? |