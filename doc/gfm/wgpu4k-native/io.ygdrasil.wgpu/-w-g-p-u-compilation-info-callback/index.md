//[wgpu4k-native](../../../index.md)/[io.ygdrasil.wgpu](../index.md)/[WGPUCompilationInfoCallback](index.md)

# WGPUCompilationInfoCallback

[common]\
expect fun interface [WGPUCompilationInfoCallback](index.md) : [Callback](../../ffi/-callback/index.md)

[android, jvm, native]\
actual fun interface [WGPUCompilationInfoCallback](index.md) : [Callback](../../ffi/-callback/index.md)

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common, android, jvm, native]<br>[common]<br>expect object [Companion](-companion/index.md)<br>[android, jvm, native]<br>actual object [Companion](-companion/index.md) |
| Function | [android, jvm]<br>[android]<br>interface [Function]([android]-function/index.md) : Callback<br>[jvm]<br>interface [Function]([jvm]-function/index.md) |

## Functions

| Name | Summary |
|---|---|
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual abstract fun [invoke](invoke.md)(status: [WGPUCompilationInfoRequestStatus](../-w-g-p-u-compilation-info-request-status/index.md), compilationInfo: [WGPUCompilationInfo](../-w-g-p-u-compilation-info/index.md)?, userdata1: [NativeAddress](../../ffi/-native-address/index.md)?, userdata2: [NativeAddress](../../ffi/-native-address/index.md)?)<br>[common]<br>expect abstract fun [invoke](invoke.md)(status: [WGPUCompilationInfoRequestStatus](../-w-g-p-u-compilation-info-request-status/index.md), compilationInfo: [WGPUCompilationInfo](../-w-g-p-u-compilation-info/index.md)?, userdata1: [NativeAddress](../../ffi/-native-address/index.md)?, userdata2: [NativeAddress](../../ffi/-native-address/index.md)?) |