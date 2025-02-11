//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderBundleEncoderDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPURenderBundleEncoderDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPURenderBundleEncoderDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPURenderBundleEncoderDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderBundleEncoderDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [colorFormatCount](color-format-count.md) | [android]<br>open override var [colorFormatCount](color-format-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [colorFormats](color-formats.md) | [android]<br>open override var [colorFormats](color-formats.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md)&gt;? |
| [depthReadOnly](depth-read-only.md) | [android]<br>open override var [depthReadOnly](depth-read-only.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [depthStencilFormat](depth-stencil-format.md) | [android]<br>open override var [depthStencilFormat](depth-stencil-format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPURenderBundleEncoderDescriptor.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [sampleCount](sample-count.md) | [android]<br>open override var [sampleCount](sample-count.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [stencilReadOnly](stencil-read-only.md) | [android]<br>open override var [stencilReadOnly](stencil-read-only.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPURenderBundleEncoderDescriptor.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPURenderBundleEncoderDescriptor.ByReference |