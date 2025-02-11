//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURequestDeviceCallbackInfo](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPURequestDeviceCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByValue(com.sun.jna.Pointer.NULL)) : [WGPURequestDeviceCallbackInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPURequestDeviceCallbackInfo.ByValue = io.ygdrasil.wgpu.android.WGPURequestDeviceCallbackInfo.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [android]<br>open override var [callback](callback.md): [CallbackHolder](../../../ffi/-callback-holder/index.md)&lt;[WGPURequestDeviceCallback](../../-w-g-p-u-request-device-callback/index.md)&gt;? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPURequestDeviceCallbackInfo.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [mode](mode.md) | [android]<br>open override var [mode](mode.md): [WGPUCallbackMode](../../-w-g-p-u-callback-mode/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [WGPUChainedStruct](../../-w-g-p-u-chained-struct/index.md)? |
| [userdata1](userdata1.md) | [android]<br>open override var [userdata1](userdata1.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [userdata2](userdata2.md) | [android]<br>open override var [userdata2](userdata2.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPURequestDeviceCallbackInfo.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPURequestDeviceCallbackInfo.ByReference |