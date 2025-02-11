//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUAdapterInfo](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUAdapterInfo.ByReference = io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUAdapterInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUAdapterInfo.ByReference = io.ygdrasil.wgpu.android.WGPUAdapterInfo.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [adapterType](adapter-type.md) | [android]<br>open override var [adapterType](adapter-type.md): [WGPUAdapterType](../../-w-g-p-u-adapter-type/index.md) |
| [architecture](architecture.md) | [android]<br>open override val [architecture](architecture.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [backendType](backend-type.md) | [android]<br>open override var [backendType](backend-type.md): [WGPUBackendType](../../-w-g-p-u-backend-type/index.md) |
| [description](description.md) | [android]<br>open override val [description](description.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [device](device.md) | [android]<br>open override val [device](device.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [deviceID](device-i-d.md) | [android]<br>open override var [deviceID](device-i-d.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUAdapterInfo.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [vendor](vendor.md) | [android]<br>open override val [vendor](vendor.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [vendorID](vendor-i-d.md) | [android]<br>open override var [vendorID](vendor-i-d.md): [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUAdapterInfo.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUAdapterInfo.ByReference |