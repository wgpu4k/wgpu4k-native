//[wgpu4k-native](../../../index.md)/[ffi](../index.md)/[CallbackHolder](index.md)

# CallbackHolder

[common]\
expect class [CallbackHolder](index.md)&lt;[T](index.md) : [Callback](../-callback/index.md)&gt;

[android, jvm, native]\
actual class [CallbackHolder](index.md)&lt;[T](index.md) : [Callback](../-callback/index.md)&gt;

## Constructors

| | |
|---|---|
| [CallbackHolder](-callback-holder.md) | [android]<br>constructor(handler: [NativeAddress](../-native-address/index.md), callback: Callback? = null)<br>[jvm]<br>constructor(handler: [NativeAddress](../-native-address/index.md))<br>[native]<br>constructor(handler: [NativeAddress](../-native-address/index.md), actualCallback: [COpaquePointer](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-opaque-pointer/index.html)? = null) |

## Properties

| Name | Summary |
|---|---|
| [actualCallback](actual-callback.md) | [native]<br>val [actualCallback](actual-callback.md): [COpaquePointer](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-opaque-pointer/index.html)? = null |
| [callback](callback.md) | [android]<br>val [callback](callback.md): Callback? = null |
| [handler](handler.md) | [common, android, jvm, native]<br>[common]<br>expect val [handler](handler.md): [NativeAddress](../-native-address/index.md)<br>[android, jvm, native]<br>actual val [handler](handler.md): [NativeAddress](../-native-address/index.md) |