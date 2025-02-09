//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPassDescriptor](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPassDescriptor&gt;) : [WGPURenderPassDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPassDescriptor&gt;) |

## Properties

| Name | Summary |
|---|---|
| [colorAttachmentCount](color-attachment-count.md) | [native]<br>open override var [colorAttachmentCount](color-attachment-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [colorAttachments](color-attachments.md) | [native]<br>open override var [colorAttachments](color-attachments.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURenderPassColorAttachment](../../-w-g-p-u-render-pass-color-attachment/index.md)&gt;? |
| [depthStencilAttachment](depth-stencil-attachment.md) | [native]<br>open override var [depthStencilAttachment](depth-stencil-attachment.md): [WGPURenderPassDepthStencilAttachment](../../-w-g-p-u-render-pass-depth-stencil-attachment/index.md)? |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPassDescriptor&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [native]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [occlusionQuerySet](occlusion-query-set.md) | [native]<br>open override var [occlusionQuerySet](occlusion-query-set.md): [WGPUQuerySet](../../-w-g-p-u-query-set/index.md)? |
| [timestampWrites](timestamp-writes.md) | [native]<br>open override var [timestampWrites](timestamp-writes.md): [WGPURenderPassTimestampWrites](../../-w-g-p-u-render-pass-timestamp-writes/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPassDescriptor&gt; |