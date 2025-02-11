//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTexelCopyTextureInfo](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPUTexelCopyTextureInfo.ByValue = io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUTexelCopyTextureInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPUTexelCopyTextureInfo.ByValue = io.ygdrasil.wgpu.android.WGPUTexelCopyTextureInfo.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [aspect](aspect.md) | [android]<br>open override var [aspect](aspect.md): [WGPUTextureAspect](../../-w-g-p-u-texture-aspect/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUTexelCopyTextureInfo.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [mipLevel](mip-level.md) | [android]<br>open override var [mipLevel](mip-level.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [origin](origin.md) | [android]<br>open override val [origin](origin.md): [WGPUOrigin3D](../../-w-g-p-u-origin3-d/index.md) |
| [texture](texture.md) | [android]<br>open override var [texture](texture.md): [WGPUTexture](../../-w-g-p-u-texture/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUTexelCopyTextureInfo.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUTexelCopyTextureInfo.ByReference |