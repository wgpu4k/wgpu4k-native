//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSupportedFeatures](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPUSupportedFeatures.ByValue = io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUSupportedFeatures](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPUSupportedFeatures.ByValue = io.ygdrasil.wgpu.android.WGPUSupportedFeatures.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [featureCount](feature-count.md) | [android]<br>open override var [featureCount](feature-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [features](features.md) | [android]<br>open override var [features](features.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUFeatureName](../../-w-g-p-u-feature-name/index.md)&gt;? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUSupportedFeatures.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUSupportedFeatures.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUSupportedFeatures.ByReference |