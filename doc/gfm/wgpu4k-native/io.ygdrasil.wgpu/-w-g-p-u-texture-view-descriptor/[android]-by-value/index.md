//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTextureViewDescriptor](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPUTextureViewDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUTextureViewDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPUTextureViewDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUTextureViewDescriptor.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [arrayLayerCount](array-layer-count.md) | [android]<br>open override var [arrayLayerCount](array-layer-count.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [aspect](aspect.md) | [android]<br>open override var [aspect](aspect.md): [WGPUTextureAspect](../../-w-g-p-u-texture-aspect/index.md) |
| [baseArrayLayer](base-array-layer.md) | [android]<br>open override var [baseArrayLayer](base-array-layer.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [baseMipLevel](base-mip-level.md) | [android]<br>open override var [baseMipLevel](base-mip-level.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [dimension](dimension.md) | [android]<br>open override var [dimension](dimension.md): [WGPUTextureViewDimension](../../-w-g-p-u-texture-view-dimension/index.md) |
| [format](format.md) | [android]<br>open override var [format](format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUTextureViewDescriptor.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [mipLevelCount](mip-level-count.md) | [android]<br>open override var [mipLevelCount](mip-level-count.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [usage](usage.md) | [android]<br>open override var [usage](usage.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUTextureViewDescriptor.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUTextureViewDescriptor.ByReference |