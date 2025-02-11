//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUPipelineLayoutDescriptor](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPUPipelineLayoutDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUPipelineLayoutDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPUPipelineLayoutDescriptor.ByValue = io.ygdrasil.wgpu.android.WGPUPipelineLayoutDescriptor.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [bindGroupLayoutCount](bind-group-layout-count.md) | [android]<br>open override var [bindGroupLayoutCount](bind-group-layout-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [bindGroupLayouts](bind-group-layouts.md) | [android]<br>open override var [bindGroupLayouts](bind-group-layouts.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUBindGroupLayout](../../-w-g-p-u-bind-group-layout/index.md)&gt;? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUPipelineLayoutDescriptor.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUPipelineLayoutDescriptor.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUPipelineLayoutDescriptor.ByReference |