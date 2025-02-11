//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUUncapturedErrorCallbackInfo](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUUncapturedErrorCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUUncapturedErrorCallbackInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUUncapturedErrorCallbackInfo.ByReference = io.ygdrasil.wgpu.android.WGPUUncapturedErrorCallbackInfo.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [android]<br>open override var [callback](callback.md): [CallbackHolder](../../../ffi/-callback-holder/index.md)&lt;[WGPUUncapturedErrorCallback](../../-w-g-p-u-uncaptured-error-callback/index.md)&gt;? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUUncapturedErrorCallbackInfo.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [WGPUChainedStruct](../../-w-g-p-u-chained-struct/index.md)? |
| [userdata1](userdata1.md) | [android]<br>open override var [userdata1](userdata1.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [userdata2](userdata2.md) | [android]<br>open override var [userdata2](userdata2.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUUncapturedErrorCallbackInfo.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUUncapturedErrorCallbackInfo.ByReference |