//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUInstanceExtras](../index.md)/[[native]ByValue](index.md)

# ByValue

[native]\
value class [ByValue](index.md)(val handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUInstanceExtras&gt;) : [WGPUInstanceExtras](../index.md)

## Constructors

| | |
|---|---|
| [ByValue](-by-value.md) | [native]<br>constructor(handle: [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUInstanceExtras&gt;) |

## Properties

| Name | Summary |
|---|---|
| [backends](backends.md) | [native]<br>open override var [backends](backends.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [chain](chain.md) | [native]<br>open override val [chain](chain.md): [WGPUChainedStruct](../../-w-g-p-u-chained-struct/index.md) |
| [dx12ShaderCompiler](dx12-shader-compiler.md) | [native]<br>open override var [dx12ShaderCompiler](dx12-shader-compiler.md): [WGPUDx12Compiler](../../-w-g-p-u-dx12-compiler/index.md) |
| [dxcPath](dxc-path.md) | [native]<br>open override val [dxcPath](dxc-path.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [dxilPath](dxil-path.md) | [native]<br>open override val [dxilPath](dxil-path.md): [WGPUStringView](../../-w-g-p-u-string-view/index.md) |
| [flags](flags.md) | [native]<br>open override var [flags](flags.md): [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html) |
| [gles3MinorVersion](gles3-minor-version.md) | [native]<br>open override var [gles3MinorVersion](gles3-minor-version.md): [WGPUGles3MinorVersion](../../-w-g-p-u-gles3-minor-version/index.md) |
| [handle](handle.md) | [native]<br>val [handle](handle.md): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUInstanceExtras&gt; |
| [handler](handler.md) | [native]<br>open override val [handler](handler.md): [NativeAddress](../../../ffi/-native-address/index.md) |

## Functions

| Name | Summary |
|---|---|
| [toCValue](../[native]to-c-value.md) | [native]<br>open fun [toCValue](../[native]to-c-value.md)(): [CValue](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-value/index.html)&lt;WGPUInstanceExtras&gt; |