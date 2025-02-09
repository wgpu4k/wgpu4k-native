//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTexelCopyTextureInfo](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUTexelCopyTextureInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [aspect](aspect.md) | [native]<br>open override var [aspect](aspect.md): [WGPUTextureAspect](../../-w-g-p-u-texture-aspect/index.md) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [mipLevel](mip-level.md) | [native]<br>open override var [mipLevel](mip-level.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [origin](origin.md) | [native]<br>open override val [origin](origin.md): [WGPUOrigin3D](../../-w-g-p-u-origin3-d/index.md) |
| [texture](texture.md) | [native]<br>open override var [texture](texture.md): [WGPUTexture](../../-w-g-p-u-texture/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUTexelCopyTextureInfo&gt; |