//[wgpu4k-native](../../../../index.md)/[io.ygdrasil.wgpu](../../index.md)/[WGPUInstanceExtras](../index.md)/[Companion](index.md)

# Companion

[common]\
expect object [Companion](index.md)

[android, jvm, native]\
actual object [Companion](index.md)

## Properties

| Name | Summary |
|---|---|
| [backendsLayout](backends-layout.md) | [jvm]<br>val [backendsLayout](backends-layout.md): ValueLayout |
| [backendsOffset](backends-offset.md) | [jvm]<br>val [backendsOffset](backends-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 16 |
| [chainLayout](chain-layout.md) | [jvm]<br>val [chainLayout](chain-layout.md): StructLayout |
| [chainOffset](chain-offset.md) | [jvm]<br>val [chainOffset](chain-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 0 |
| [dx12ShaderCompilerLayout](dx12-shader-compiler-layout.md) | [jvm]<br>val [dx12ShaderCompilerLayout](dx12-shader-compiler-layout.md): ValueLayout |
| [dx12ShaderCompilerOffset](dx12-shader-compiler-offset.md) | [jvm]<br>val [dx12ShaderCompilerOffset](dx12-shader-compiler-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 32 |
| [dxcPathLayout](dxc-path-layout.md) | [jvm]<br>val [dxcPathLayout](dxc-path-layout.md): StructLayout |
| [dxcPathOffset](dxc-path-offset.md) | [jvm]<br>val [dxcPathOffset](dxc-path-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 56 |
| [dxilPathLayout](dxil-path-layout.md) | [jvm]<br>val [dxilPathLayout](dxil-path-layout.md): StructLayout |
| [dxilPathOffset](dxil-path-offset.md) | [jvm]<br>val [dxilPathOffset](dxil-path-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 40 |
| [flagsLayout](flags-layout.md) | [jvm]<br>val [flagsLayout](flags-layout.md): ValueLayout |
| [flagsOffset](flags-offset.md) | [jvm]<br>val [flagsOffset](flags-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 24 |
| [gles3MinorVersionLayout](gles3-minor-version-layout.md) | [jvm]<br>val [gles3MinorVersionLayout](gles3-minor-version-layout.md): ValueLayout |
| [gles3MinorVersionOffset](gles3-minor-version-offset.md) | [jvm]<br>val [gles3MinorVersionOffset](gles3-minor-version-offset.md): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) = 36 |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUInstanceExtras](../index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md)): [WGPUInstanceExtras](../index.md) |
| [allocateArray](allocate-array.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUInstanceExtras](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUInstanceExtras](../index.md)&gt;<br>[android, jvm, native]<br>actual fun [allocateArray](allocate-array.md)(allocator: [MemoryAllocator](../../../ffi/-memory-allocator/index.md), size: [UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), provider: ([UInt](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-int/index.html), [WGPUInstanceExtras](../index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html)): [ArrayHolder](../../../ffi/-array-holder/index.md)&lt;[WGPUInstanceExtras](../index.md)&gt; |
| [invoke](invoke.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUInstanceExtras](../index.md)<br>[common]<br>expect operator fun [invoke](invoke.md)(address: [NativeAddress](../../../ffi/-native-address/index.md)): [WGPUInstanceExtras](../index.md) |