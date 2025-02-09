//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTextureViewDescriptor](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUTextureViewDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [arrayLayerCount](array-layer-count.md) | [native]<br>open override var [arrayLayerCount](array-layer-count.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [aspect](aspect.md) | [native]<br>open override var [aspect](aspect.md): [WGPUTextureAspect](../../-w-g-p-u-texture-aspect/index.md) |
| [baseArrayLayer](base-array-layer.md) | [native]<br>open override var [baseArrayLayer](base-array-layer.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [baseMipLevel](base-mip-level.md) | [native]<br>open override var [baseMipLevel](base-mip-level.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [dimension](dimension.md) | [native]<br>open override var [dimension](dimension.md): [WGPUTextureViewDimension](../../-w-g-p-u-texture-view-dimension/index.md) |
| [format](format.md) | [native]<br>open override var [format](format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [native]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [mipLevelCount](mip-level-count.md) | [native]<br>open override var [mipLevelCount](mip-level-count.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [usage](usage.md) | [native]<br>open override var [usage](usage.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUTextureViewDescriptor&gt; |