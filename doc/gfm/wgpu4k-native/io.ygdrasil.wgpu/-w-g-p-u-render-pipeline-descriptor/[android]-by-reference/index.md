//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPipelineDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPURenderPipelineDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPURenderPipelineDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPURenderPipelineDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPURenderPipelineDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [depthStencil](depth-stencil.md) | [android]<br>open override var [depthStencil](depth-stencil.md): [WGPUDepthStencilState](../../-w-g-p-u-depth-stencil-state/index.md)? |
| [fragment](fragment.md) | [android]<br>open override var [fragment](fragment.md): [WGPUFragmentState](../../-w-g-p-u-fragment-state/index.md)? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPURenderPipelineDescriptor.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [layout](layout.md) | [android]<br>open override var [layout](layout.md): [WGPUPipelineLayout](../../-w-g-p-u-pipeline-layout/index.md)? |
| [multisample](multisample.md) | [android]<br>open override val [multisample](multisample.md): [WGPUMultisampleState](../../-w-g-p-u-multisample-state/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [primitive](primitive.md) | [android]<br>open override val [primitive](primitive.md): [WGPUPrimitiveState](../../-w-g-p-u-primitive-state/index.md) |
| [vertex](vertex.md) | [android]<br>open override val [vertex](vertex.md): [WGPUVertexState](../../-w-g-p-u-vertex-state/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPURenderPipelineDescriptor.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPURenderPipelineDescriptor.ByReference |