//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUChainedStruct](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUChainedStruct.ByReference = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUChainedStruct](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUChainedStruct.ByReference = io.ygdrasil.wgpu.android.WGPUChainedStruct.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUChainedStruct.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [next](next.md) | [android]<br>open override var [next](next.md): [WGPUChainedStruct](../index.md)? |
| [sType](s-type.md) | [android]<br>open override var [sType](s-type.md): [WGPUSType](../../-w-g-p-u-s-type/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUChainedStruct.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUChainedStruct.ByReference |