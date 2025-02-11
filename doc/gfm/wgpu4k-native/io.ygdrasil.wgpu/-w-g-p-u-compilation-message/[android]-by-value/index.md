//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUCompilationMessage](../index.md)/[[android]ByValue](index.md)

# ByValue

[android]\
class [ByValue](index.md)(val handle: WGPUCompilationMessage.ByValue = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue(com.sun.jna.Pointer.NULL)) : [WGPUCompilationMessage](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [android]<br>constructor(handle: WGPUCompilationMessage.ByValue = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByValue(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [handle](handle.md) | [android]<br>val [handle](handle.md): WGPUCompilationMessage.ByValue |
| [handler](handler.md) | [android]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [length](length.md) | [android]<br>open override var [length](length.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [lineNum](line-num.md) | [android]<br>open override var [lineNum](line-num.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [linePos](line-pos.md) | [android]<br>open override var [linePos](line-pos.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [message](message.md) | [android]<br>open override val [message](message.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [nextInChain](next-in-chain.md) | [android]<br>open override var [nextInChain](next-in-chain.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [offset](offset.md) | [android]<br>open override var [offset](offset.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [type](type.md) | [android]<br>open override var [type](type.md): [WGPUCompilationMessageType](../../-w-g-p-u-compilation-message-type/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): WGPUCompilationMessage.ByValue |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): WGPUCompilationMessage.ByReference |