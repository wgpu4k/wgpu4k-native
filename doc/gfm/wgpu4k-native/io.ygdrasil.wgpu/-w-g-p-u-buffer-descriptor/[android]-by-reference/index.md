//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBufferDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUBufferDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-buffer-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUBufferDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUBufferDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-buffer-descriptor/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUBufferDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUBufferDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-buffer-descriptor/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [mappedAtCreation](mapped-at-creation.md) | [android]<br>open override var [mappedAtCreation](mapped-at-creation.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [size](size.md) | [android]<br>open override var [size](size.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [usage](usage.md) | [android]<br>open override var [usage](usage.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUBufferDescriptor.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-buffer-descriptor/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUBufferDescriptor.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-buffer-descriptor/-by-reference/index.md) |