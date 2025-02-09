//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSamplerDescriptor](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUSamplerDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [addressModeU](address-mode-u.md) | [native]<br>open override var [addressModeU](address-mode-u.md): [WGPUAddressMode](../../-w-g-p-u-address-mode/index.md) |
| [addressModeV](address-mode-v.md) | [native]<br>open override var [addressModeV](address-mode-v.md): [WGPUAddressMode](../../-w-g-p-u-address-mode/index.md) |
| [addressModeW](address-mode-w.md) | [native]<br>open override var [addressModeW](address-mode-w.md): [WGPUAddressMode](../../-w-g-p-u-address-mode/index.md) |
| [compare](compare.md) | [native]<br>open override var [compare](compare.md): [WGPUCompareFunction](../../-w-g-p-u-compare-function/index.md) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [native]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [lodMaxClamp](lod-max-clamp.md) | [native]<br>open override var [lodMaxClamp](lod-max-clamp.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [lodMinClamp](lod-min-clamp.md) | [native]<br>open override var [lodMinClamp](lod-min-clamp.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [magFilter](mag-filter.md) | [native]<br>open override var [magFilter](mag-filter.md): [WGPUFilterMode](../../-w-g-p-u-filter-mode/index.md) |
| [maxAnisotropy](max-anisotropy.md) | [native]<br>open override var [maxAnisotropy](max-anisotropy.md): [UShort](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-short/index.html) |
| [minFilter](min-filter.md) | [native]<br>open override var [minFilter](min-filter.md): [WGPUFilterMode](../../-w-g-p-u-filter-mode/index.md) |
| [mipmapFilter](mipmap-filter.md) | [native]<br>open override var [mipmapFilter](mipmap-filter.md): [WGPUMipmapFilterMode](../../-w-g-p-u-mipmap-filter-mode/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSamplerDescriptor&gt; |