//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUProgrammableStageDescriptor](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUProgrammableStageDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUProgrammableStageDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUProgrammableStageDescriptor.ByReference = io.ygdrasil.wgpu.android.WGPUProgrammableStageDescriptor.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [constantCount](constant-count.md) | [android]<br>open override var [constantCount](constant-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [constants](constants.md) | [android]<br>open override var [constants](constants.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUConstantEntry](../../-w-g-p-u-constant-entry/index.md)&gt;? |
| [entryPoint](entry-point.md) | [android]<br>open override val [entryPoint](entry-point.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUProgrammableStageDescriptor.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [module](module.md) | [android]<br>open override var [module](module.md): [WGPUShaderModule](../../-w-g-p-u-shader-module/index.md)? |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUProgrammableStageDescriptor.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUProgrammableStageDescriptor.ByReference |