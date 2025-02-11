//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTexelCopyBufferLayout](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUTexelCopyBufferLayout.ByReference = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUTexelCopyBufferLayout](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUTexelCopyBufferLayout.ByReference = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferLayout.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [bytesPerRow](bytes-per-row.md) | [android]<br>open override var [bytesPerRow](bytes-per-row.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUTexelCopyBufferLayout.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [offset](offset.md) | [android]<br>open override var [offset](offset.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [rowsPerImage](rows-per-image.md) | [android]<br>open override var [rowsPerImage](rows-per-image.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUTexelCopyBufferLayout.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUTexelCopyBufferLayout.ByReference |