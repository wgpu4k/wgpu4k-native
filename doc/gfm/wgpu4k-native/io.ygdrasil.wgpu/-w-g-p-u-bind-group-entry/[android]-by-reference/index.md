//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBindGroupEntry](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUBindGroupEntry.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-entry/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUBindGroupEntry](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUBindGroupEntry.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-entry/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUBindGroupEntry.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [binding](binding.md) | [android]<br>open override var [binding](binding.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [buffer](buffer.md) | [android]<br>open override var [buffer](buffer.md): [WGPUBuffer](../../-w-g-p-u-buffer/index.md)? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUBindGroupEntry.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-entry/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [offset](offset.md) | [android]<br>open override var [offset](offset.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [sampler](sampler.md) | [android]<br>open override var [sampler](sampler.md): [WGPUSampler](../../-w-g-p-u-sampler/index.md)? |
| [size](size.md) | [android]<br>open override var [size](size.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [textureView](texture-view.md) | [android]<br>open override var [textureView](texture-view.md): [WGPUTextureView](../../-w-g-p-u-texture-view/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUBindGroupEntry.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-entry/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUBindGroupEntry.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-entry/-by-reference/index.md) |