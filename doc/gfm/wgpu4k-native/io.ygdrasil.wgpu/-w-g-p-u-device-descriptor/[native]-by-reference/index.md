//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUDeviceDescriptor](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUDeviceDescriptor](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [defaultQueue](default-queue.md) | [native]<br>open override val [defaultQueue](default-queue.md): [WGPUQueueDescriptor](../../-w-g-p-u-queue-descriptor/index.md) |
| [deviceLostCallbackInfo](device-lost-callback-info.md) | [native]<br>open override val [deviceLostCallbackInfo](device-lost-callback-info.md): [WGPUDeviceLostCallbackInfo](../../-w-g-p-u-device-lost-callback-info/index.md) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [label](label.md) | [native]<br>open override val [label](label.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [requiredFeatureCount](required-feature-count.md) | [native]<br>open override var [requiredFeatureCount](required-feature-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [requiredFeatures](required-features.md) | [native]<br>open override var [requiredFeatures](required-features.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUFeatureName](../../-w-g-p-u-feature-name/index.md)&gt;? |
| [requiredLimits](required-limits.md) | [native]<br>open override var [requiredLimits](required-limits.md): [WGPULimits](../../-w-g-p-u-limits/index.md)? |
| [uncapturedErrorCallbackInfo](uncaptured-error-callback-info.md) | [native]<br>open override val [uncapturedErrorCallbackInfo](uncaptured-error-callback-info.md): [WGPUUncapturedErrorCallbackInfo](../../-w-g-p-u-uncaptured-error-callback-info/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUDeviceDescriptor&gt; |