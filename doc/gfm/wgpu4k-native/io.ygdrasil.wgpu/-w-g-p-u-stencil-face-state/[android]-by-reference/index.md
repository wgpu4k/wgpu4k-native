//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUStencilFaceState](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUStencilFaceState.ByReference = io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUStencilFaceState](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUStencilFaceState.ByReference = io.ygdrasil.wgpu.android.WGPUStencilFaceState.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [compare](compare.md) | [android]<br>open override var [compare](compare.md): [WGPUCompareFunction](../../-w-g-p-u-compare-function/index.md) |
| [depthFailOp](depth-fail-op.md) | [android]<br>open override var [depthFailOp](depth-fail-op.md): [WGPUStencilOperation](../../-w-g-p-u-stencil-operation/index.md) |
| [failOp](fail-op.md) | [android]<br>open override var [failOp](fail-op.md): [WGPUStencilOperation](../../-w-g-p-u-stencil-operation/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUStencilFaceState.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [passOp](pass-op.md) | [android]<br>open override var [passOp](pass-op.md): [WGPUStencilOperation](../../-w-g-p-u-stencil-operation/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUStencilFaceState.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUStencilFaceState.ByReference |