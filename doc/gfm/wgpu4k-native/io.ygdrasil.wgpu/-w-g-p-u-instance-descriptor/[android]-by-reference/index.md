//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUInstanceDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUInstanceDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-instance-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUInstanceDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUInstanceDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-instance-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUInstanceDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [features](features.md) | [android]<br>open override val [features](features.md): [WGPUInstanceCapabilities](../../-w-g-p-u-instance-capabilities/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUInstanceDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-instance-descriptor/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUInstanceDescriptor.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-instance-descriptor/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUInstanceDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-instance-descriptor/-by-reference/index.md) |