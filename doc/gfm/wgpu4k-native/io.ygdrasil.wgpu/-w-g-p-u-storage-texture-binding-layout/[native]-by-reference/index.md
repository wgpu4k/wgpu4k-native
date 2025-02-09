//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUStorageTextureBindingLayout](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUStorageTextureBindingLayout](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [access](access.md) | [native]<br>open override var [access](access.md): [WGPUStorageTextureAccess](../../-w-g-p-u-storage-texture-access/index.md) |
| [format](format.md) | [native]<br>open override var [format](format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [viewDimension](view-dimension.md) | [native]<br>open override var [viewDimension](view-dimension.md): [WGPUTextureViewDimension](../../-w-g-p-u-texture-view-dimension/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUStorageTextureBindingLayout&gt; |