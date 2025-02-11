//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPassDepthStencilAttachment](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPURenderPassDepthStencilAttachment.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByReference(com.sun.jna.Pointer.NULL)) : [WGPURenderPassDepthStencilAttachment](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPURenderPassDepthStencilAttachment.ByReference = io.ygdrasil.wgpu.android.WGPURenderPassDepthStencilAttachment.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [depthClearValue](depth-clear-value.md) | [android]<br>open override var [depthClearValue](depth-clear-value.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [depthLoadOp](depth-load-op.md) | [android]<br>open override var [depthLoadOp](depth-load-op.md): [WGPULoadOp](../../-w-g-p-u-load-op/index.md) |
| [depthReadOnly](depth-read-only.md) | [android]<br>open override var [depthReadOnly](depth-read-only.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [depthStoreOp](depth-store-op.md) | [android]<br>open override var [depthStoreOp](depth-store-op.md): [WGPUStoreOp](../../-w-g-p-u-store-op/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPURenderPassDepthStencilAttachment.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [stencilClearValue](stencil-clear-value.md) | [android]<br>open override var [stencilClearValue](stencil-clear-value.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [stencilLoadOp](stencil-load-op.md) | [android]<br>open override var [stencilLoadOp](stencil-load-op.md): [WGPULoadOp](../../-w-g-p-u-load-op/index.md) |
| [stencilReadOnly](stencil-read-only.md) | [android]<br>open override var [stencilReadOnly](stencil-read-only.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [stencilStoreOp](stencil-store-op.md) | [android]<br>open override var [stencilStoreOp](stencil-store-op.md): [WGPUStoreOp](../../-w-g-p-u-store-op/index.md) |
| [view](view.md) | [android]<br>open override var [view](view.md): [WGPUTextureView](../../-w-g-p-u-texture-view/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPURenderPassDepthStencilAttachment.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPURenderPassDepthStencilAttachment.ByReference |