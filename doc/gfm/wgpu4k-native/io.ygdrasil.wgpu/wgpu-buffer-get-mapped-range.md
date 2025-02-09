//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[wgpuBufferGetMappedRange](wgpu-buffer-get-mapped-range.md)

# wgpuBufferGetMappedRange

[common]\
expect fun [wgpuBufferGetMappedRange](wgpu-buffer-get-mapped-range.md)(handler: [WGPUBuffer](-w-g-p-u-buffer/index.md)?, offset: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html), size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [NativeAddress](../ffi/-native-address/index.md)?

#### Return

Returns a mutable pointer to beginning of the mapped range. Returns NULL with @ref ImplementationDefinedLogging if:

- 
   There is any content-timeline error as defined in the WebGPU specification for getMappedRange() (alignments, overlaps, etc.)
- 
   The buffer is not mapped with @ref WGPUMapMode_Write.

#### Parameters

common

| | |
|---|---|
| offset | Byte offset relative to the beginning of the buffer. |
| size | Byte size of the range to get. The returned pointer is valid for exactly this many bytes. |

[android, jvm, native]\
[android, jvm, native]\
actual fun [wgpuBufferGetMappedRange](wgpu-buffer-get-mapped-range.md)(handler: [WGPUBuffer](-w-g-p-u-buffer/index.md)?, offset: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html), size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [NativeAddress](../ffi/-native-address/index.md)?