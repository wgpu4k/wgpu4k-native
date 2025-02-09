//[wgpu4k-native](../../index.md)/[io.ygdrasil.wgpu](index.md)/[wgpuBufferGetConstMappedRange](wgpu-buffer-get-const-mapped-range.md)

# wgpuBufferGetConstMappedRange

[common]\
expect fun [wgpuBufferGetConstMappedRange](wgpu-buffer-get-const-mapped-range.md)(handler: [WGPUBuffer](-w-g-p-u-buffer/index.md)?, offset: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html), size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [NativeAddress](../ffi/-native-address/index.md)?

#### Return

Returns a const pointer to beginning of the mapped range. It must not be written; writing to this range causes undefined behavior. Returns NULL with @ref ImplementationDefinedLogging if:

- 
   There is any content-timeline error as defined in the WebGPU specification for getMappedRange() (alignments, overlaps, etc.) **except** for overlaps with other *const* ranges, which are allowed in C. (JS does not allow this because const ranges do not exist.)

#### Parameters

common

| | |
|---|---|
| offset | Byte offset relative to the beginning of the buffer. |
| size | Byte size of the range to get. The returned pointer is valid for exactly this many bytes. |

[android, jvm, native]\
[android, jvm, native]\
actual fun [wgpuBufferGetConstMappedRange](wgpu-buffer-get-const-mapped-range.md)(handler: [WGPUBuffer](-w-g-p-u-buffer/index.md)?, offset: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html), size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [NativeAddress](../ffi/-native-address/index.md)?