//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSamplerDescriptor](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPUSamplerDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUSamplerDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPUSamplerDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUSamplerDescriptor.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [addressModeU](address-mode-u.md) | [android]<br>open override var [addressModeU](address-mode-u.md): [WGPUAddressMode](../../-w-g-p-u-address-mode/index.md) |
| [addressModeV](address-mode-v.md) | [android]<br>open override var [addressModeV](address-mode-v.md): [WGPUAddressMode](../../-w-g-p-u-address-mode/index.md) |
| [addressModeW](address-mode-w.md) | [android]<br>open override var [addressModeW](address-mode-w.md): [WGPUAddressMode](../../-w-g-p-u-address-mode/index.md) |
| [compare](compare.md) | [android]<br>open override var [compare](compare.md): [WGPUCompareFunction](../../-w-g-p-u-compare-function/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUSamplerDescriptor.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [lodMaxClamp](lod-max-clamp.md) | [android]<br>open override var [lodMaxClamp](lod-max-clamp.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [lodMinClamp](lod-min-clamp.md) | [android]<br>open override var [lodMinClamp](lod-min-clamp.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [magFilter](mag-filter.md) | [android]<br>open override var [magFilter](mag-filter.md): [WGPUFilterMode](../../-w-g-p-u-filter-mode/index.md) |
| [maxAnisotropy](max-anisotropy.md) | [android]<br>open override var [maxAnisotropy](max-anisotropy.md): [UShort](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-short/index.html) |
| [minFilter](min-filter.md) | [android]<br>open override var [minFilter](min-filter.md): [WGPUFilterMode](../../-w-g-p-u-filter-mode/index.md) |
| [mipmapFilter](mipmap-filter.md) | [android]<br>open override var [mipmapFilter](mipmap-filter.md): [WGPUMipmapFilterMode](../../-w-g-p-u-mipmap-filter-mode/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUSamplerDescriptor.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUSamplerDescriptor.ByReference |