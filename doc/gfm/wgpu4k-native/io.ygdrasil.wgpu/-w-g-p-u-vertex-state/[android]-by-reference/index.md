//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUVertexState](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUVertexState.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-state/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUVertexState.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUVertexState](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUVertexState.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-state/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUVertexState.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [bufferCount](buffer-count.md) | [android]<br>open override var [bufferCount](buffer-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [buffers](buffers.md) | [android]<br>open override var [buffers](buffers.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUVertexBufferLayout](../../-w-g-p-u-vertex-buffer-layout/index.md)&gt;? |
| [constantCount](constant-count.md) | [android]<br>open override var [constantCount](constant-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [constants](constants.md) | [android]<br>open override var [constants](constants.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUConstantEntry](../../-w-g-p-u-constant-entry/index.md)&gt;? |
| [entryPoint](entry-point.md) | [android]<br>open override val [entryPoint](entry-point.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUVertexState.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-state/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [module](module.md) | [android]<br>open override var [module](module.md): [WGPUShaderModule](../../-w-g-p-u-shader-module/index.md)? |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUVertexState.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-state/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUVertexState.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-state/-by-reference/index.md) |