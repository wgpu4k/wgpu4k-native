//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUVertexAttribute](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUVertexAttribute.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-attribute/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUVertexAttribute](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUVertexAttribute.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-attribute/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUVertexAttribute.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [format](format.md) | [android]<br>open override var [format](format.md): [WGPUVertexFormat](../../-w-g-p-u-vertex-format/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUVertexAttribute.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-attribute/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [offset](offset.md) | [android]<br>open override var [offset](offset.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [shaderLocation](shader-location.md) | [android]<br>open override var [shaderLocation](shader-location.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUVertexAttribute.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-attribute/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUVertexAttribute.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-vertex-attribute/-by-reference/index.md) |