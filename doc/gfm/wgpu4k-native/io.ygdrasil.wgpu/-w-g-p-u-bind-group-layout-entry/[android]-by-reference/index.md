//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBindGroupLayoutEntry](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUBindGroupLayoutEntry.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUBindGroupLayoutEntry](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUBindGroupLayoutEntry.ByReference = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutEntry.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [binding](binding.md) | [android]<br>open override var [binding](binding.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [buffer](buffer.md) | [android]<br>open override val [buffer](buffer.md): [WGPUBufferBindingLayout](../../-w-g-p-u-buffer-binding-layout/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUBindGroupLayoutEntry.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [sampler](sampler.md) | [android]<br>open override val [sampler](sampler.md): [WGPUSamplerBindingLayout](../../-w-g-p-u-sampler-binding-layout/index.md) |
| [storageTexture](storage-texture.md) | [android]<br>open override val [storageTexture](storage-texture.md): [WGPUStorageTextureBindingLayout](../../-w-g-p-u-storage-texture-binding-layout/index.md) |
| [texture](texture.md) | [android]<br>open override val [texture](texture.md): [WGPUTextureBindingLayout](../../-w-g-p-u-texture-binding-layout/index.md) |
| [visibility](visibility.md) | [android]<br>open override var [visibility](visibility.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUBindGroupLayoutEntry.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUBindGroupLayoutEntry.ByReference |