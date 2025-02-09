//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUFragmentState](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUFragmentState](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [constantCount](constant-count.md) | [native]<br>open override var [constantCount](constant-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [constants](constants.md) | [native]<br>open override var [constants](constants.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUConstantEntry](../../-w-g-p-u-constant-entry/index.md)&gt;? |
| [entryPoint](entry-point.md) | [native]<br>open override val [entryPoint](entry-point.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [module](module.md) | [native]<br>open override var [module](module.md): [WGPUShaderModule](../../-w-g-p-u-shader-module/index.md)? |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [targetCount](target-count.md) | [native]<br>open override var [targetCount](target-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [targets](targets.md) | [native]<br>open override var [targets](targets.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUColorTargetState](../../-w-g-p-u-color-target-state/index.md)&gt;? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUFragmentState&gt; |