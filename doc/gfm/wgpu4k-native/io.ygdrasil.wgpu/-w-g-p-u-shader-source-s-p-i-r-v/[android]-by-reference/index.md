//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUShaderSourceSPIRV](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUShaderSourceSPIRV.ByReference = io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUShaderSourceSPIRV](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUShaderSourceSPIRV.ByReference = io.ygdrasil.wgpu.android.WGPUShaderSourceSPIRV.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [chain](chain.md) | [android]<br>open override val [chain](chain.md): [WGPUChainedStruct](../../-w-g-p-u-chained-struct/index.md) |
| [code](code.md) | [android]<br>open override var [code](code.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [codeSize](code-size.md) | [android]<br>open override var [codeSize](code-size.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUShaderSourceSPIRV.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUShaderSourceSPIRV.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUShaderSourceSPIRV.ByReference |