//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUPrimitiveState](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUPrimitiveState&gt;) : [WGPUPrimitiveState](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUPrimitiveState&gt;) |

## Properties

| Name | Summary |
|---|---|
| [cullMode](cull-mode.md) | [native]<br>open override var [cullMode](cull-mode.md): [WGPUCullMode](../../-w-g-p-u-cull-mode/index.md) |
| [frontFace](front-face.md) | [native]<br>open override var [frontFace](front-face.md): [WGPUFrontFace](../../-w-g-p-u-front-face/index.md) |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUPrimitiveState&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [stripIndexFormat](strip-index-format.md) | [native]<br>open override var [stripIndexFormat](strip-index-format.md): [WGPUIndexFormat](../../-w-g-p-u-index-format/index.md) |
| [topology](topology.md) | [native]<br>open override var [topology](topology.md): [WGPUPrimitiveTopology](../../-w-g-p-u-primitive-topology/index.md) |
| [unclippedDepth](unclipped-depth.md) | [native]<br>open override var [unclippedDepth](unclipped-depth.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUPrimitiveState&gt; |