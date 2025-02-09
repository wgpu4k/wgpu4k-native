//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPassDepthStencilAttachment](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPURenderPassDepthStencilAttachment](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [depthClearValue](depth-clear-value.md) | [native]<br>open override var [depthClearValue](depth-clear-value.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [depthLoadOp](depth-load-op.md) | [native]<br>open override var [depthLoadOp](depth-load-op.md): [WGPULoadOp](../../-w-g-p-u-load-op/index.md) |
| [depthReadOnly](depth-read-only.md) | [native]<br>open override var [depthReadOnly](depth-read-only.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [depthStoreOp](depth-store-op.md) | [native]<br>open override var [depthStoreOp](depth-store-op.md): [WGPUStoreOp](../../-w-g-p-u-store-op/index.md) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [stencilClearValue](stencil-clear-value.md) | [native]<br>open override var [stencilClearValue](stencil-clear-value.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [stencilLoadOp](stencil-load-op.md) | [native]<br>open override var [stencilLoadOp](stencil-load-op.md): [WGPULoadOp](../../-w-g-p-u-load-op/index.md) |
| [stencilReadOnly](stencil-read-only.md) | [native]<br>open override var [stencilReadOnly](stencil-read-only.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [stencilStoreOp](stencil-store-op.md) | [native]<br>open override var [stencilStoreOp](stencil-store-op.md): [WGPUStoreOp](../../-w-g-p-u-store-op/index.md) |
| [view](view.md) | [native]<br>open override var [view](view.md): [WGPUTextureView](../../-w-g-p-u-texture-view/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPassDepthStencilAttachment&gt; |