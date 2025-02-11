//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUDepthStencilState](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUDepthStencilState.ByReference = io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUDepthStencilState](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUDepthStencilState.ByReference = io.ygdrasil.wgpu.android.WGPUDepthStencilState.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [depthBias](depth-bias.md) | [android]<br>open override var [depthBias](depth-bias.md): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [depthBiasClamp](depth-bias-clamp.md) | [android]<br>open override var [depthBiasClamp](depth-bias-clamp.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [depthBiasSlopeScale](depth-bias-slope-scale.md) | [android]<br>open override var [depthBiasSlopeScale](depth-bias-slope-scale.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) |
| [depthCompare](depth-compare.md) | [android]<br>open override var [depthCompare](depth-compare.md): [WGPUCompareFunction](../../-w-g-p-u-compare-function/index.md) |
| [depthWriteEnabled](depth-write-enabled.md) | [android]<br>open override var [depthWriteEnabled](depth-write-enabled.md): [WGPUOptionalBool](../../-w-g-p-u-optional-bool/index.md) |
| [format](format.md) | [android]<br>open override var [format](format.md): [WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUDepthStencilState.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [stencilBack](stencil-back.md) | [android]<br>open override val [stencilBack](stencil-back.md): [WGPUStencilFaceState](../../-w-g-p-u-stencil-face-state/index.md) |
| [stencilFront](stencil-front.md) | [android]<br>open override val [stencilFront](stencil-front.md): [WGPUStencilFaceState](../../-w-g-p-u-stencil-face-state/index.md) |
| [stencilReadMask](stencil-read-mask.md) | [android]<br>open override var [stencilReadMask](stencil-read-mask.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [stencilWriteMask](stencil-write-mask.md) | [android]<br>open override var [stencilWriteMask](stencil-write-mask.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUDepthStencilState.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUDepthStencilState.ByReference |