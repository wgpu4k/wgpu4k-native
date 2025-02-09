//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUDepthStencilState](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUDepthStencilState&gt;) : [WGPUDepthStencilState](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUDepthStencilState&gt;) |

## Properties

| Name | Summary |
|---|---|
| [depthBias](depth-bias.md) | [native]<br>open override var [depthBias](depth-bias.md): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [depthBiasClamp](depth-bias-clamp.md) | [native]<br>open override var [depthBiasClamp](depth-bias-clamp.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [depthBiasSlopeScale](depth-bias-slope-scale.md) | [native]<br>open override var [depthBiasSlopeScale](depth-bias-slope-scale.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [depthCompare](depth-compare.md) | [native]<br>open override var [depthCompare](depth-compare.md): [WGPUCompareFunction](../../-w-g-p-u-compare-function/index.md) |
| [depthWriteEnabled](depth-write-enabled.md) | [native]<br>open override var [depthWriteEnabled](depth-write-enabled.md): [WGPUOptionalBool](../../-w-g-p-u-optional-bool/index.md) |
| [format](format.md) | [native]<br>open override var [format](format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUDepthStencilState&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [stencilBack](stencil-back.md) | [native]<br>open override val [stencilBack](stencil-back.md): [WGPUStencilFaceState](../../-w-g-p-u-stencil-face-state/index.md) |
| [stencilFront](stencil-front.md) | [native]<br>open override val [stencilFront](stencil-front.md): [WGPUStencilFaceState](../../-w-g-p-u-stencil-face-state/index.md) |
| [stencilReadMask](stencil-read-mask.md) | [native]<br>open override var [stencilReadMask](stencil-read-mask.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [stencilWriteMask](stencil-write-mask.md) | [native]<br>open override var [stencilWriteMask](stencil-write-mask.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUDepthStencilState&gt; |