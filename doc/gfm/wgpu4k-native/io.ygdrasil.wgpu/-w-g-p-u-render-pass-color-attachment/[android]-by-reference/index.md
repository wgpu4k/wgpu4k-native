//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPassColorAttachment](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPURenderPassColorAttachment.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-color-attachment/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByReference(com.sun.jna.Pointer.NULL)) : [WGPURenderPassColorAttachment](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPURenderPassColorAttachment.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-color-attachment/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPURenderPassColorAttachment.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [clearValue](clear-value.md) | [android]<br>open override val [clearValue](clear-value.md): [WGPUColor](../../-w-g-p-u-color/index.md) |
| [depthSlice](depth-slice.md) | [android]<br>open override var [depthSlice](depth-slice.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPURenderPassColorAttachment.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-color-attachment/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [loadOp](load-op.md) | [android]<br>open override var [loadOp](load-op.md): [WGPULoadOp](../../-w-g-p-u-load-op/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [resolveTarget](resolve-target.md) | [android]<br>open override var [resolveTarget](resolve-target.md): [WGPUTextureView](../../-w-g-p-u-texture-view/index.md)? |
| [storeOp](store-op.md) | [android]<br>open override var [storeOp](store-op.md): [WGPUStoreOp](../../-w-g-p-u-store-op/index.md) |
| [view](view.md) | [android]<br>open override var [view](view.md): [WGPUTextureView](../../-w-g-p-u-texture-view/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPURenderPassColorAttachment.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-color-attachment/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPURenderPassColorAttachment.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-render-pass-color-attachment/-by-reference/index.md) |