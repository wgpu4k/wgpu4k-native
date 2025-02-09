//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUPopErrorScopeCallbackInfo](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUPopErrorScopeCallbackInfo.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-pop-error-scope-callback-info/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUPopErrorScopeCallbackInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUPopErrorScopeCallbackInfo.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-pop-error-scope-callback-info/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUPopErrorScopeCallbackInfo.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [callback](callback.md) | [android]<br>open override var [callback](callback.md): [CallbackHolder](../../../ffi/-callback-holder/index.md)&lt;[WGPUPopErrorScopeCallback](../../-w-g-p-u-pop-error-scope-callback/index.md)&gt;? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUPopErrorScopeCallbackInfo.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-pop-error-scope-callback-info/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [mode](mode.md) | [android]<br>open override var [mode](mode.md): [WGPUCallbackMode](../../-w-g-p-u-callback-mode/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [WGPUChainedStruct](../../-w-g-p-u-chained-struct/index.md)? |
| [userdata1](userdata1.md) | [android]<br>open override var [userdata1](userdata1.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [userdata2](userdata2.md) | [android]<br>open override var [userdata2](userdata2.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUPopErrorScopeCallbackInfo.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-pop-error-scope-callback-info/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUPopErrorScopeCallbackInfo.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-pop-error-scope-callback-info/-by-reference/index.md) |