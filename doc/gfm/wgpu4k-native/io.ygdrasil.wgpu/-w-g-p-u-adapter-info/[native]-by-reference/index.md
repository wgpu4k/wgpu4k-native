//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUAdapterInfo](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUAdapterInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [adapterType](adapter-type.md) | [native]<br>open override var [adapterType](adapter-type.md): [WGPUAdapterType](../../-w-g-p-u-adapter-type/index.md) |
| [architecture](architecture.md) | [native]<br>open override val [architecture](architecture.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [backendType](backend-type.md) | [native]<br>open override var [backendType](backend-type.md): [WGPUBackendType](../../-w-g-p-u-backend-type/index.md) |
| [description](description.md) | [native]<br>open override val [description](description.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [device](device.md) | [native]<br>open override val [device](device.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [deviceID](device-i-d.md) | [native]<br>open override var [deviceID](device-i-d.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [native]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [vendor](vendor.md) | [native]<br>open override val [vendor](vendor.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [vendorID](vendor-i-d.md) | [native]<br>open override var [vendorID](vendor-i-d.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUAdapterInfo&gt; |