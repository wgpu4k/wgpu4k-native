//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUComputePipelineDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUComputePipelineDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compute-pipeline-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUComputePipelineDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUComputePipelineDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compute-pipeline-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUComputePipelineDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [compute](compute.md) | [android]<br>open override val [compute](compute.md): [WGPUProgrammableStageDescriptor](../../-w-g-p-u-programmable-stage-descriptor/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUComputePipelineDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compute-pipeline-descriptor/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [layout](layout.md) | [android]<br>open override var [layout](layout.md): [WGPUPipelineLayout](../../-w-g-p-u-pipeline-layout/index.md)? |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUComputePipelineDescriptor.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compute-pipeline-descriptor/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUComputePipelineDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compute-pipeline-descriptor/-by-reference/index.md) |