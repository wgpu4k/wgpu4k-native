//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSurfaceCapabilities](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSurfaceCapabilities&gt;) : [WGPUSurfaceCapabilities](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSurfaceCapabilities&gt;) |

## Properties

| Name | Summary |
|---|---|
| [alphaModeCount](alpha-mode-count.md) | [native]<br>open override var [alphaModeCount](alpha-mode-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [alphaModes](alpha-modes.md) | [native]<br>open override var [alphaModes](alpha-modes.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUCompositeAlphaMode](../../-w-g-p-u-composite-alpha-mode/index.md)&gt;? |
| [formatCount](format-count.md) | [native]<br>open override var [formatCount](format-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [formats](formats.md) | [native]<br>open override var [formats](formats.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUTextureFormat](../../-w-g-p-u-texture-format/index.md)&gt;? |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSurfaceCapabilities&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [presentModeCount](present-mode-count.md) | [native]<br>open override var [presentModeCount](present-mode-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [presentModes](present-modes.md) | [native]<br>open override var [presentModes](present-modes.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUPresentMode](../../-w-g-p-u-present-mode/index.md)&gt;? |
| [usages](usages.md) | [native]<br>open override var [usages](usages.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSurfaceCapabilities&gt; |