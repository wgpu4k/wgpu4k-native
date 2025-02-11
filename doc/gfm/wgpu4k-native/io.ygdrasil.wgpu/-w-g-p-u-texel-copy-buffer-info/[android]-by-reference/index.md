//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUTexelCopyBufferInfo](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUTexelCopyBufferInfo.ByReference = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUTexelCopyBufferInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUTexelCopyBufferInfo.ByReference = io.ygdrasil.wgpu.android.WGPUTexelCopyBufferInfo.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [buffer](buffer.md) | [android]<br>open override var [buffer](buffer.md): [WGPUBuffer](../../-w-g-p-u-buffer/index.md)? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUTexelCopyBufferInfo.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [layout](layout.md) | [android]<br>open override val [layout](layout.md): [WGPUTexelCopyBufferLayout](../../-w-g-p-u-texel-copy-buffer-layout/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUTexelCopyBufferInfo.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUTexelCopyBufferInfo.ByReference |