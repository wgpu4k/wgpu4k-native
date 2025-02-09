//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUVertexState](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexState&gt;) : [WGPUVertexState](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexState&gt;) |

## Properties

| Name | Summary |
|---|---|
| [bufferCount](buffer-count.md) | [native]<br>open override var [bufferCount](buffer-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [buffers](buffers.md) | [native]<br>open override var [buffers](buffers.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUVertexBufferLayout](../../-w-g-p-u-vertex-buffer-layout/index.md)&gt;? |
| [constantCount](constant-count.md) | [native]<br>open override var [constantCount](constant-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [constants](constants.md) | [native]<br>open override var [constants](constants.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUConstantEntry](../../-w-g-p-u-constant-entry/index.md)&gt;? |
| [entryPoint](entry-point.md) | [native]<br>open override val [entryPoint](entry-point.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexState&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [module](module.md) | [native]<br>open override var [module](module.md): [WGPUShaderModule](../../-w-g-p-u-shader-module/index.md)? |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexState&gt; |