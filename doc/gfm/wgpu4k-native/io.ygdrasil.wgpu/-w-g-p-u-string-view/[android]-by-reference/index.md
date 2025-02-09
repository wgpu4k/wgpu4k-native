//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUStringView](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUStringView.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-string-view/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUStringView.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUStringView](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUStringView.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-string-view/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUStringView.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [data](data.md) | [android]<br>open override var [data](data.md): [CString](../../../ffi/-c-string/index.md)? |
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUStringView.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-string-view/-by-reference/index.md) |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [length](length.md) | [android]<br>open override var [length](length.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUStringView.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-string-view/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUStringView.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-string-view/-by-reference/index.md) |