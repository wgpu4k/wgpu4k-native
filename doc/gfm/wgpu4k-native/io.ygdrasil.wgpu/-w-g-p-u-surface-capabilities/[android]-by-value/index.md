//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSurfaceCapabilities](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPUSurfaceCapabilities.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUSurfaceCapabilities](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPUSurfaceCapabilities.ByValue = io.ygdrasil.wgpu.android.WGPUSurfaceCapabilities.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [alphaModeCount](alpha-mode-count.md) | [android]<br>open override var [alphaModeCount](alpha-mode-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [alphaModes](alpha-modes.md) | [android]<br>open override var [alphaModes](alpha-modes.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUCompositeAlphaMode](../../-w-g-p-u-composite-alpha-mode/index.md)&gt;? |
| [formatCount](format-count.md) | [android]<br>open override var [formatCount](format-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [formats](formats.md) | [android]<br>open override var [formats](formats.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md)&gt;? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUSurfaceCapabilities.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [presentModeCount](present-mode-count.md) | [android]<br>open override var [presentModeCount](present-mode-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [presentModes](present-modes.md) | [android]<br>open override var [presentModes](present-modes.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUPresentMode](../../-w-g-p-u-present-mode/index.md)&gt;? |
| [usages](usages.md) | [android]<br>open override var [usages](usages.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUSurfaceCapabilities.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUSurfaceCapabilities.ByReference |