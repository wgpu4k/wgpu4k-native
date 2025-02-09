//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPassDepthStencilAttachment](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPassDepthStencilAttachment&gt;) : [WGPURenderPassDepthStencilAttachment](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPassDepthStencilAttachment&gt;) |

## Properties

| Name | Summary |
|---|---|
| [depthClearValue](depth-clear-value.md) | [native]<br>open override var [depthClearValue](depth-clear-value.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [depthLoadOp](depth-load-op.md) | [native]<br>open override var [depthLoadOp](depth-load-op.md): [WGPULoadOp](../../-w-g-p-u-load-op/index.md) |
| [depthReadOnly](depth-read-only.md) | [native]<br>open override var [depthReadOnly](depth-read-only.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [depthStoreOp](depth-store-op.md) | [native]<br>open override var [depthStoreOp](depth-store-op.md): [WGPUStoreOp](../../-w-g-p-u-store-op/index.md) |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPassDepthStencilAttachment&gt; |
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