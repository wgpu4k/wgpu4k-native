//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSurfaceDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUSurfaceDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUSurfaceDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUSurfaceDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUSurfaceDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUSurfaceDescriptor.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [android]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUSurfaceDescriptor.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUSurfaceDescriptor.ByReference |