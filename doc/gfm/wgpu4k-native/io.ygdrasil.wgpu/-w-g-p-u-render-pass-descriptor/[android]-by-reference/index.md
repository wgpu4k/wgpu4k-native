//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPassDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPURenderPassDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPURenderPassDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPURenderPassDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPURenderPassDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [colorAttachmentCount](color-attachment-count.md) | [android]<br>open override var [colorAttachmentCount](color-attachment-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [colorAttachments](color-attachments.md) | [android]<br>open override var [colorAttachments](color-attachments.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPURenderPassColorAttachment](../../-w-g-p-u-render-pass-color-attachment/index.md)&gt;? |
| [depthStencilAttachment](depth-stencil-attachment.md) | [android]<br>open override var [depthStencilAttachment](depth-stencil-attachment.md): [WGPURenderPassDepthStencilAttachment](../../-w-g-p-u-render-pass-depth-stencil-attachment/index.md)? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPURenderPassDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-descriptor/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [occlusionQuerySet](occlusion-query-set.md) | [android]<br>open override var [occlusionQuerySet](occlusion-query-set.md): [WGPUQuerySet](../../-w-g-p-u-query-set/index.md)? |
| [timestampWrites](timestamp-writes.md) | [android]<br>open override var [timestampWrites](timestamp-writes.md): [WGPURenderPassTimestampWrites](../../-w-g-p-u-render-pass-timestamp-writes/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPURenderPassDescriptor.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-descriptor/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPURenderPassDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-descriptor/-by-reference/index.md) |