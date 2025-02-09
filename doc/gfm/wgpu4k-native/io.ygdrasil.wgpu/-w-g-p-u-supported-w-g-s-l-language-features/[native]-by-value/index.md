//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSupportedWGSLLanguageFeatures](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSupportedWGSLLanguageFeatures&gt;) : [WGPUSupportedWGSLLanguageFeatures](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSupportedWGSLLanguageFeatures&gt;) |

## Properties

| Name | Summary |
|---|---|
| [featureCount](feature-count.md) | [native]<br>open override var [featureCount](feature-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [features](features.md) | [native]<br>open override var [features](features.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUWGSLLanguageFeatureName](../../-w-g-p-u-w-g-s-l-language-feature-name/index.md)&gt;? |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSupportedWGSLLanguageFeatures&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSupportedWGSLLanguageFeatures&gt; |