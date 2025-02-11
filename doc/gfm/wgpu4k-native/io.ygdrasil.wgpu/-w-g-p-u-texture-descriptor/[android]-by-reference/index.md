//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTextureDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUTextureDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUTextureDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUTextureDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUTextureDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [dimension](dimension.md) | [android]<br>open override var [dimension](dimension.md): [WGPUTextureDimension](../../-w-g-p-u-texture-dimension/index.md) |
| [format](format.md) | [android]<br>open override var [format](format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUTextureDescriptor.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [mipLevelCount](mip-level-count.md) | [android]<br>open override var [mipLevelCount](mip-level-count.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [sampleCount](sample-count.md) | [android]<br>open override var [sampleCount](sample-count.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [size](size.md) | [android]<br>open override val [size](size.md): [WGPUExtent3D](../../-w-g-p-u-extent3-d/index.md) |
| [usage](usage.md) | [android]<br>open override var [usage](usage.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [viewFormatCount](view-format-count.md) | [android]<br>open override var [viewFormatCount](view-format-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [viewFormats](view-formats.md) | [android]<br>open override var [viewFormats](view-formats.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md)&gt;? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUTextureDescriptor.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUTextureDescriptor.ByReference |