//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUQuerySetDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUQuerySetDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-query-set-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUQuerySetDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUQuerySetDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-query-set-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUQuerySetDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [count](count.md) | [android]<br>open override var [count](count.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUQuerySetDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-query-set-descriptor/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [type](type.md) | [android]<br>open override var [type](type.md): [WGPUQueryType](../../-w-g-p-u-query-type/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUQuerySetDescriptor.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-query-set-descriptor/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUQuerySetDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-query-set-descriptor/-by-reference/index.md) |