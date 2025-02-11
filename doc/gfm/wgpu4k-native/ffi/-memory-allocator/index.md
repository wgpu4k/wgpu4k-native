//[wgpu4k-native](../../../index.md)/[ffi](../index.md)/[MemoryAllocator](index.md)

# MemoryAllocator

[common]\
expect class [MemoryAllocator](index.md) : [AutoCloseable](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-auto-closeable/index.html)

[android, jvm]\
actual class [MemoryAllocator](index.md) : [AutoCloseable](https://developer.android.com/reference/kotlin/java/lang/AutoCloseable.html)

[native]\
actual class [MemoryAllocator](index.md) : [AutoCloseable](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-auto-closeable/index.html)

## Constructors

| | |
|---|---|
| [MemoryAllocator](-memory-allocator.md) | [android, jvm, native]<br>constructor()<br>[common]<br>expect constructor() |

## Properties

| Name | Summary |
|---|---|
| allocator | [android, jvm, native]<br>[android]<br>val [allocator]([android]allocator.md): SegmentAllocator<br>[jvm]<br>val [allocator]([jvm]allocator.md): SegmentAllocator<br>[native]<br>val [allocator]([native]allocator.md): [Arena](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-arena/index.html) |
| [arena](arena.md) | [jvm]<br>val [arena](arena.md): Arena |

## Functions

| Name | Summary |
|---|---|
| [allocate](allocate.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocate](allocate.md)(sizeInByte: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [NativeAddress](../-native-address/index.md)<br>[android, jvm, native]<br>actual fun [allocate](allocate.md)(sizeInByte: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [NativeAddress](../-native-address/index.md) |
| [allocateBuffer](allocate-buffer.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateBuffer](allocate-buffer.md)(size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [MemoryBuffer](../-memory-buffer/index.md)<br>[android, jvm, native]<br>actual fun [allocateBuffer](allocate-buffer.md)(size: [ULong](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-u-long/index.html)): [MemoryBuffer](../-memory-buffer/index.md) |
| [allocateFrom](allocate-from.md) | [common, android, jvm, native]<br>[common]<br>expect fun [allocateFrom](allocate-from.md)(value: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [CString](../-c-string/index.md)<br>[android, jvm, native]<br>actual fun [allocateFrom](allocate-from.md)(value: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [CString](../-c-string/index.md) |
| [bufferOf](buffer-of.md) | [common, android, jvm, native]<br>[common]<br>expect fun [bufferOf](buffer-of.md)(value: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [MemoryBuffer](../-memory-buffer/index.md)<br>[android, jvm, native]<br>actual fun [bufferOf](buffer-of.md)(value: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html)): [MemoryBuffer](../-memory-buffer/index.md) |
| [bufferOfAddress](buffer-of-address.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual fun [bufferOfAddress](buffer-of-address.md)(value: [NativeAddress](../-native-address/index.md)): [MemoryBuffer](../-memory-buffer/index.md)<br>[common]<br>expect fun [bufferOfAddress](buffer-of-address.md)(value: [NativeAddress](../-native-address/index.md)): [MemoryBuffer](../-memory-buffer/index.md) |
| [bufferOfAddresses](buffer-of-addresses.md) | [android, jvm, common, native]<br>[android, jvm, native]<br>actual fun [bufferOfAddresses](buffer-of-addresses.md)(value: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[NativeAddress](../-native-address/index.md)&gt;): [MemoryBuffer](../-memory-buffer/index.md)<br>[common]<br>expect fun [bufferOfAddresses](buffer-of-addresses.md)(value: [List](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/-list/index.html)&lt;[NativeAddress](../-native-address/index.md)&gt;): [MemoryBuffer](../-memory-buffer/index.md) |
| [close](close.md) | [common, android, jvm, native]<br>[common]<br>expect open override fun [close](close.md)()<br>[android, jvm, native]<br>actual open override fun [close](close.md)() |
| [register](register.md) | [android]<br>fun [register](register.md)(it: [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)) |
| [registerCallback](register-callback.md) | [android]<br>fun [registerCallback](register-callback.md)(function: Callback) |