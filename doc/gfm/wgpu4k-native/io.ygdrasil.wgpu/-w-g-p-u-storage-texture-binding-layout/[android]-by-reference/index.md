//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUStorageTextureBindingLayout](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUStorageTextureBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUStorageTextureBindingLayout](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUStorageTextureBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUStorageTextureBindingLayout.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [access](access.md) | [android]<br>open override var [access](access.md): [WGPUStorageTextureAccess](../../-w-g-p-u-storage-texture-access/index.md) |
| [format](format.md) | [android]<br>open override var [format](format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUStorageTextureBindingLayout.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [viewDimension](view-dimension.md) | [android]<br>open override var [viewDimension](view-dimension.md): [WGPUTextureViewDimension](../../-w-g-p-u-texture-view-dimension/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUStorageTextureBindingLayout.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUStorageTextureBindingLayout.ByReference |