//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderBundleEncoderDescriptor](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderBundleEncoderDescriptor&gt;) : [WGPURenderBundleEncoderDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderBundleEncoderDescriptor&gt;) |

## Properties

| Name | Summary |
|---|---|
| [colorFormatCount](color-format-count.md) | [native]<br>open override var [colorFormatCount](color-format-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [colorFormats](color-formats.md) | [native]<br>open override var [colorFormats](color-formats.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md)&gt;? |
| [depthReadOnly](depth-read-only.md) | [native]<br>open override var [depthReadOnly](depth-read-only.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [depthStencilFormat](depth-stencil-format.md) | [native]<br>open override var [depthStencilFormat](depth-stencil-format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderBundleEncoderDescriptor&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [native]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [sampleCount](sample-count.md) | [native]<br>open override var [sampleCount](sample-count.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [stencilReadOnly](stencil-read-only.md) | [native]<br>open override var [stencilReadOnly](stencil-read-only.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderBundleEncoderDescriptor&gt; |