//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTextureBindingLayout](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUTextureBindingLayout&gt;) : [WGPUTextureBindingLayout](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUTextureBindingLayout&gt;) |

## Properties

| Name | Summary |
|---|---|
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUTextureBindingLayout&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [multisampled](multisampled.md) | [native]<br>open override var [multisampled](multisampled.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [sampleType](sample-type.md) | [native]<br>open override var [sampleType](sample-type.md): [WGPUTextureSampleType](../../-w-g-p-u-texture-sample-type/index.md) |
| [viewDimension](view-dimension.md) | [native]<br>open override var [viewDimension](view-dimension.md): [WGPUTextureViewDimension](../../-w-g-p-u-texture-view-dimension/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUTextureBindingLayout&gt; |