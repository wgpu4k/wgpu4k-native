//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBindGroupDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUBindGroupDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUBindGroupDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUBindGroupDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUBindGroupDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | [android]<br>open override var [entries](entries.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUBindGroupEntry](../../-w-g-p-u-bind-group-entry/index.md)&gt;? |
| [entryCount](entry-count.md) | [android]<br>open override var [entryCount](entry-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUBindGroupDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-descriptor/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [layout](layout.md) | [android]<br>open override var [layout](layout.md): [WGPUBindGroupLayout](../../-w-g-p-u-bind-group-layout/index.md)? |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUBindGroupDescriptor.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-descriptor/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUBindGroupDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-bind-group-descriptor/-by-reference/index.md) |