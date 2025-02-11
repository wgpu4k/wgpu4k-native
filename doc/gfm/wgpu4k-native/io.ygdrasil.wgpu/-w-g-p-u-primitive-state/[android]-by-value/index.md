//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUPrimitiveState](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPUPrimitiveState.ByValue = io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUPrimitiveState](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPUPrimitiveState.ByValue = io.ygdrasil.wgpu.android.WGPUPrimitiveState.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [cullMode](cull-mode.md) | [android]<br>open override var [cullMode](cull-mode.md): [WGPUCullMode](../../-w-g-p-u-cull-mode/index.md) |
| [frontFace](front-face.md) | [android]<br>open override var [frontFace](front-face.md): [WGPUFrontFace](../../-w-g-p-u-front-face/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUPrimitiveState.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [stripIndexFormat](strip-index-format.md) | [android]<br>open override var [stripIndexFormat](strip-index-format.md): [WGPUIndexFormat](../../-w-g-p-u-index-format/index.md) |
| [topology](topology.md) | [android]<br>open override var [topology](topology.md): [WGPUPrimitiveTopology](../../-w-g-p-u-primitive-topology/index.md) |
| [unclippedDepth](unclipped-depth.md) | [android]<br>open override var [unclippedDepth](unclipped-depth.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUPrimitiveState.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUPrimitiveState.ByReference |