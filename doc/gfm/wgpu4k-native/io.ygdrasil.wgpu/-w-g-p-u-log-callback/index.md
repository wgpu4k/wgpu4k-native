//[wgpu4k-native](../../../index.md)/[io.ygdrasil.wgpu](../index.md)/[WGPULogCallback](index.md)

# WGPULogCallback

[common]\
expect fun interface [WGPULogCallback](index.md) : [Callback](../../ffi/-callback/index.md)

[android, jvm, native]\
actual fun interface [WGPULogCallback](index.md) : [Callback](../../ffi/-callback/index.md)

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common, android, jvm, native]<br>[common]<br>expect object [Companion](-companion/index.md)<br>[android, jvm, native]<br>actual object [Companion](-companion/index.md) |
| Function | [android, jvm]<br>[android]<br>interface [Function]([android]-function/index.md) : Callback<br>[jvm]<br>interface [Function]([jvm]-function/index.md) |

## Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual abstract fun [invoke](invoke.md)(level: [WGPULogLevel](../-w-g-p-u-log-level/index.md), message: [WGPUStringView](../-w-g-p-u-string-view/index.md)?, userdata: [NativeAddress](../../ffi/-native-address/index.md)?)<br>[common]<br>expect abstract fun [invoke](invoke.md)(level: [WGPULogLevel](../-w-g-p-u-log-level/index.md), message: [WGPUStringView](../-w-g-p-u-string-view/index.md)?, userdata: [NativeAddress](../../ffi/-native-address/index.md)?) |