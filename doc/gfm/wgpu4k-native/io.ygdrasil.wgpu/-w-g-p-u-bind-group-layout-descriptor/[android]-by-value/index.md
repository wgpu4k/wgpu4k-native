//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBindGroupLayoutDescriptor](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPUBindGroupLayoutDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUBindGroupLayoutDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPUBindGroupLayoutDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUBindGroupLayoutDescriptor.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | [android]<br>open override var [entries](entries.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUBindGroupLayoutEntry](../../-w-g-p-u-bind-group-layout-entry/index.md)&gt;? |
| [entryCount](entry-count.md) | [android]<br>open override var [entryCount](entry-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUBindGroupLayoutDescriptor.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUBindGroupLayoutDescriptor.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUBindGroupLayoutDescriptor.ByReference |