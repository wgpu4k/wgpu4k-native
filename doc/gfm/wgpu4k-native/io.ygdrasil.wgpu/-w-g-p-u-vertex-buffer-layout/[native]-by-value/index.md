//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUVertexBufferLayout](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexBufferLayout&gt;) : [WGPUVertexBufferLayout](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexBufferLayout&gt;) |

## Properties

| Name | Summary |
|---|---|
| [arrayStride](array-stride.md) | [native]<br>open override var [arrayStride](array-stride.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [attributeCount](attribute-count.md) | [native]<br>open override var [attributeCount](attribute-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [attributes](attributes.md) | [native]<br>open override var [attributes](attributes.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUVertexAttribute](../../-w-g-p-u-vertex-attribute/index.md)&gt;? |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexBufferLayout&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [stepMode](step-mode.md) | [native]<br>open override var [stepMode](step-mode.md): [WGPUVertexStepMode](../../-w-g-p-u-vertex-step-mode/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexBufferLayout&gt; |