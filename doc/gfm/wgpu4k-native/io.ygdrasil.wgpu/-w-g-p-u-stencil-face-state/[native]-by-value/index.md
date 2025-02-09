//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUStencilFaceState](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUStencilFaceState&gt;) : [WGPUStencilFaceState](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUStencilFaceState&gt;) |

## Properties

| Name | Summary |
|---|---|
| [compare](compare.md) | [native]<br>open override var [compare](compare.md): [WGPUCompareFunction](../../-w-g-p-u-compare-function/index.md) |
| [depthFailOp](depth-fail-op.md) | [native]<br>open override var [depthFailOp](depth-fail-op.md): [WGPUStencilOperation](../../-w-g-p-u-stencil-operation/index.md) |
| [failOp](fail-op.md) | [native]<br>open override var [failOp](fail-op.md): [WGPUStencilOperation](../../-w-g-p-u-stencil-operation/index.md) |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUStencilFaceState&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [passOp](pass-op.md) | [native]<br>open override var [passOp](pass-op.md): [WGPUStencilOperation](../../-w-g-p-u-stencil-operation/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUStencilFaceState&gt; |