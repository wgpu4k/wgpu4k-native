//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUSurfaceSourceWindowsHWND](../index.md)/[[native]ByReference](index.md)

# ByReference

[native]\
value class [ByReference](index.md)(val handler: [NativeAddress](../../../ffi/-native-address/index.md)) : [WGPUSurfaceSourceWindowsHWND](../index.md)

## Constructors

| | |
|---|---|
| [ByReference](-by-reference.md) | [native]<br>constructor(handler: [NativeAddress](../../../ffi/-native-address/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [chain](chain.md) | [native]<br>open override val [chain](chain.md): [WGPUChainedStruct](../../-w-g-p-u-chained-struct/index.md) |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |
| [hinstance](hinstance.md) | [native]<br>open override var [hinstance](hinstance.md): [NativeAddress](../../../ffi/-native-address/index.md)? |
| [hwnd](hwnd.md) | [native]<br>open override var [hwnd](hwnd.md): [NativeAddress](../../../ffi/-native-address/index.md)? |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUSurfaceSourceWindowsHWND&gt; |