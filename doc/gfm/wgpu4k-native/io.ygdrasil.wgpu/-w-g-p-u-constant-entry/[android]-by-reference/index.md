//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUConstantEntry](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUConstantEntry.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-constant-entry/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUConstantEntry.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUConstantEntry](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUConstantEntry.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-constant-entry/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUConstantEntry.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUConstantEntry.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-constant-entry/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [key](key.md) | [android]<br>open override val [key](key.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [value](value.md) | [android]<br>open override var [value](value.md): [Double](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-double/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUConstantEntry.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-constant-entry/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUConstantEntry.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-constant-entry/-by-reference/index.md) |