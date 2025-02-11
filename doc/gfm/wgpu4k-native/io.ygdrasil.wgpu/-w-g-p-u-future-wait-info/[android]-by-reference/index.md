//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUFutureWaitInfo](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUFutureWaitInfo.ByReference = io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUFutureWaitInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUFutureWaitInfo.ByReference = io.ygdrasil.wgpu.android.WGPUFutureWaitInfo.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [completed](completed.md) | [android]<br>open override var [completed](completed.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [future](future.md) | [android]<br>open override val [future](future.md): [WGPUFuture](../../-w-g-p-u-future/index.md) |
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUFutureWaitInfo.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUFutureWaitInfo.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUFutureWaitInfo.ByReference |