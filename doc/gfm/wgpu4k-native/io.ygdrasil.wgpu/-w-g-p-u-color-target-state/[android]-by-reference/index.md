//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUColorTargetState](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUColorTargetState.ByReference = io.ygdrasil.wgpu.android.WGPUColorTargetState.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUColorTargetState](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUColorTargetState.ByReference = io.ygdrasil.wgpu.android.WGPUColorTargetState.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [blend](blend.md) | [android]<br>open override var [blend](blend.md): [WGPUBlendState](../../-w-g-p-u-blend-state/index.md)? |
| [format](format.md) | [android]<br>open override var [format](format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUColorTargetState.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [writeMask](write-mask.md) | [android]<br>open override var [writeMask](write-mask.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUColorTargetState.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUColorTargetState.ByReference |