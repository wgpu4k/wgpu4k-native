//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUVertexAttribute](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexAttribute&gt;) : [WGPUVertexAttribute](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexAttribute&gt;) |

## Properties

| Name | Summary |
|---|---|
| [format](format.md) | [native]<br>open override var [format](format.md): [WGPUVertexFormat](../../-w-g-p-u-vertex-format/index.md) |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexAttribute&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [offset](offset.md) | [native]<br>open override var [offset](offset.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [shaderLocation](shader-location.md) | [native]<br>open override var [shaderLocation](shader-location.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUVertexAttribute&gt; |