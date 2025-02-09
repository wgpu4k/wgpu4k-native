//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUCompilationMessage](../index.md)/[[android]ByReference](index.md)

# ByReference

[android]\
class [ByReference](index.md)(val handle: [WGPUCompilationMessage.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compilation-message/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByReference(com.sun.jna.Pointer.NULL)) : [WGPUCompilationMessage](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [android]<br>constructor(handle: [WGPUCompilationMessage.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compilation-message/-by-reference/index.md) = io.ygdrasil.wgpu.android.WGPUCompilationMessage.ByReference(com.sun.jna.Pointer.NULL)) |

## Properties

| Name | Summary |
|---|---|
| [handle](handle.md) | [android]<br>val [handle](handle.md): [WGPUCompilationMessage.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compilation-message/-by-reference/index.md) |
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
| [toCValue](../[android]to-c-value.md) | [android]<br>open fun [toCValue](../[android]to-c-value.md)(): [WGPUCompilationMessage.ByValue](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compilation-message/-by-value/index.md) |
| [toReference](../to-reference.md) | [android]<br>open fun [toReference](../to-reference.md)(): [WGPUCompilationMessage.ByReference](../../../io.ygdrasil.wgpu.android/-w-g-p-u-compilation-message/-by-reference/index.md) |