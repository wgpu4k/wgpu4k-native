//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBindGroupLayoutEntry](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUBindGroupLayoutEntry](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [binding](binding.md) | [native]<br>open override var [binding](binding.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [buffer](buffer.md) | [native]<br>open override val [buffer](buffer.md): [WGPUBufferBindingLayout](../../-w-g-p-u-buffer-binding-layout/index.md) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [sampler](sampler.md) | [native]<br>open override val [sampler](sampler.md): [WGPUSamplerBindingLayout](../../-w-g-p-u-sampler-binding-layout/index.md) |
| [storageTexture](storage-texture.md) | [native]<br>open override val [storageTexture](storage-texture.md): [WGPUStorageTextureBindingLayout](../../-w-g-p-u-storage-texture-binding-layout/index.md) |
| [texture](texture.md) | [native]<br>open override val [texture](texture.md): [WGPUTextureBindingLayout](../../-w-g-p-u-texture-binding-layout/index.md) |
| [visibility](visibility.md) | [native]<br>open override var [visibility](visibility.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUBindGroupLayoutEntry&gt; |