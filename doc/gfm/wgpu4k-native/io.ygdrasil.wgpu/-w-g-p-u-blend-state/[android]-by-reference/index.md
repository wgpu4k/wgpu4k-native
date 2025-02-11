//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBlendState](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUBlendState.ByReference = io.ygdrasil.wgpu.android.WGPUBlendState.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUBlendState](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUBlendState.ByReference = io.ygdrasil.wgpu.android.WGPUBlendState.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [alpha](alpha.md) | [android]<br>open override val [alpha](alpha.md): [WGPUBlendComponent](../../-w-g-p-u-blend-component/index.md) |
| [color](color.md) | [android]<br>open override val [color](color.md): [WGPUBlendComponent](../../-w-g-p-u-blend-component/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUBlendState.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUBlendState.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUBlendState.ByReference |