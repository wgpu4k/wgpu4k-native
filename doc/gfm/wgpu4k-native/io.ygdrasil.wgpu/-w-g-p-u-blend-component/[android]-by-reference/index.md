//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBlendComponent](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUBlendComponent.ByReference = io.ygdrasil.wgpu.android.WGPUBlendComponent.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUBlendComponent](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUBlendComponent.ByReference = io.ygdrasil.wgpu.android.WGPUBlendComponent.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [dstFactor](dst-factor.md) | [android]<br>open override var [dstFactor](dst-factor.md): [WGPUBlendFactor](../../-w-g-p-u-blend-factor/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUBlendComponent.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [operation](operation.md) | [android]<br>open override var [operation](operation.md): [WGPUBlendOperation](../../-w-g-p-u-blend-operation/index.md) |
| [srcFactor](src-factor.md) | [android]<br>open override var [srcFactor](src-factor.md): [WGPUBlendFactor](../../-w-g-p-u-blend-factor/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUBlendComponent.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUBlendComponent.ByReference |