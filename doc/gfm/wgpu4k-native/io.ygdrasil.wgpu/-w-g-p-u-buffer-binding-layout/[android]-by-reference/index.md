//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUBufferBindingLayout](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUBufferBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUBufferBindingLayout](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUBufferBindingLayout.ByReference = io.ygdrasil.wgpu.android.WGPUBufferBindingLayout.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUBufferBindingLayout.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [hasDynamicOffset](has-dynamic-offset.md) | [android]<br>open override var [hasDynamicOffset](has-dynamic-offset.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [minBindingSize](min-binding-size.md) | [android]<br>open override var [minBindingSize](min-binding-size.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [type](type.md) | [android]<br>open override var [type](type.md): [WGPUBufferBindingType](../../-w-g-p-u-buffer-binding-type/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUBufferBindingLayout.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUBufferBindingLayout.ByReference |