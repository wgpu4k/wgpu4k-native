//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUCompilationInfo](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: WGPUCompilationInfo.ByReference = io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUCompilationInfo](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: WGPUCompilationInfo.ByReference = io.ygdrasil.wgpu.android.WGPUCompilationInfo.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUCompilationInfo.ByReference |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [messageCount](message-count.md) | [android]<br>open override var [messageCount](message-count.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [messages](messages.md) | [android]<br>open override var [messages](messages.md): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUCompilationMessage](../../-w-g-p-u-compilation-message/index.md)&gt;? |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUCompilationInfo.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUCompilationInfo.ByReference |