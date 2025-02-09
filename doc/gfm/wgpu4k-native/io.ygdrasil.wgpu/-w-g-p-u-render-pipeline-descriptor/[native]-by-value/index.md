//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPURenderPipelineDescriptor](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPipelineDescriptor&gt;) : [WGPURenderPipelineDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPipelineDescriptor&gt;) |

## Properties

| Name | Summary |
|---|---|
| [depthStencil](depth-stencil.md) | [native]<br>open override var [depthStencil](depth-stencil.md): [WGPUDepthStencilState](../../-w-g-p-u-depth-stencil-state/index.md)? |
| [fragment](fragment.md) | [native]<br>open override var [fragment](fragment.md): [WGPUFragmentState](../../-w-g-p-u-fragment-state/index.md)? |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPipelineDescriptor&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [native]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [layout](layout.md) | [native]<br>open override var [layout](layout.md): [WGPUPipelineLayout](../../-w-g-p-u-pipeline-layout/index.md)? |
| [multisample](multisample.md) | [native]<br>open override val [multisample](multisample.md): [WGPUMultisampleState](../../-w-g-p-u-multisample-state/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [primitive](primitive.md) | [native]<br>open override val [primitive](primitive.md): [WGPUPrimitiveState](../../-w-g-p-u-primitive-state/index.md) |
| [vertex](vertex.md) | [native]<br>open override val [vertex](vertex.md): [WGPUVertexState](../../-w-g-p-u-vertex-state/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPURenderPipelineDescriptor&gt; |