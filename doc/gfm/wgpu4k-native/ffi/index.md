//[wgpu4k-native](../../index.md)/[ffi](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [ArrayHolder](-array-holder/index.md) | [common]<br>@[JvmInline](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-inline/index.html)<br>value class [ArrayHolder](-array-holder/index.md)&lt;[T](-array-holder/index.md)&gt;(val handler: [NativeAddress](-native-address/index.md)) |
| [Callback](-callback/index.md) | [common]<br>interface [Callback](-callback/index.md) |
| [CallbackHolder](-callback-holder/index.md) | [common, android, jvm, native]<br>[common]<br>expect class [CallbackHolder](-callback-holder/index.md)&lt;[T](-callback-holder/index.md) : [Callback](-callback/index.md)&gt;<br>[android, jvm, native]<br>actual class [CallbackHolder](-callback-holder/index.md)&lt;[T](-callback-holder/index.md) : [Callback](-callback/index.md)&gt; |
| [CString](-c-string/index.md) | [common, android, jvm, native]<br>[common]<br>expect value class [CString](-c-string/index.md)<br>[android, jvm]<br>@[JvmInline](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.jvm/-jvm-inline/index.html)<br>actual value class [CString](-c-string/index.md)<br>[native]<br>actual value class [CString](-c-string/index.md) |
| CStructure | [android, jvm]<br>[android]<br>interface [CStructure]([android]-c-structure/index.md)<br>[jvm]<br>interface [CStructure]([jvm]-c-structure/index.md) |
| [JnaArena](-jna-arena/index.md) | [android]<br>class [JnaArena](-jna-arena/index.md) : [AutoCloseable](https://developer.android.com/reference/kotlin/java/lang/AutoCloseable.html) |
| [LibraryLoader](-library-loader/index.md) | [jvm]<br>object [LibraryLoader](-library-loader/index.md) |
| [MemoryAllocator](-memory-allocator/index.md) | [common, android, jvm, native]<br>[common]<br>expect class [MemoryAllocator](-memory-allocator/index.md) : [AutoCloseable](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-auto-closeable/index.html)<br>[android, jvm]<br>actual class [MemoryAllocator](-memory-allocator/index.md) : [AutoCloseable](https://developer.android.com/reference/kotlin/java/lang/AutoCloseable.html)<br>[native]<br>actual class [MemoryAllocator](-memory-allocator/index.md) : [AutoCloseable](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-auto-closeable/index.html) |
| [MemoryBuffer](-memory-buffer/index.md) | [common, android, jvm, native]<br>[common]<br>expect class [MemoryBuffer](-memory-buffer/index.md)<br>[android, jvm, native]<br>actual class [MemoryBuffer](-memory-buffer/index.md) |
| [MemorySegment](-memory-segment/index.md) | [jvm]<br>class [MemorySegment](-memory-segment/index.md)(val handler: MemorySegment) |
| [NativeAddress](-native-address/index.md) | [common, android, jvm, native]<br>[common]<br>expect class [NativeAddress](-native-address/index.md)<br>[android]<br>actual typealias [NativeAddress](-native-address/index.md) = Pointer<br>[jvm]<br>actual typealias [NativeAddress](-native-address/index.md) = [MemorySegment](-memory-segment/index.md)<br>[native]<br>actual typealias [NativeAddress](-native-address/index.md) = [Pointer](-pointer/index.md) |
| [Pointer](-pointer/index.md) | [native]<br>class [Pointer](-pointer/index.md)(val pointer: [CPointer](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-pointer/index.html)&lt;[COpaque](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-opaque/index.html)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [C_BOOL](-c_-b-o-o-l.md) | [android, jvm]<br>[android, jvm]<br>val [C_BOOL](-c_-b-o-o-l.md): ValueLayout |
| [C_CHAR](-c_-c-h-a-r.md) | [android, jvm]<br>[android, jvm]<br>val [C_CHAR](-c_-c-h-a-r.md): ValueLayout |
| [C_DOUBLE](-c_-d-o-u-b-l-e.md) | [android, jvm]<br>[android, jvm]<br>val [C_DOUBLE](-c_-d-o-u-b-l-e.md): ValueLayout |
| [C_FLOAT](-c_-f-l-o-a-t.md) | [android, jvm]<br>[android, jvm]<br>val [C_FLOAT](-c_-f-l-o-a-t.md): ValueLayout |
| [C_INT](-c_-i-n-t.md) | [android, jvm]<br>[android, jvm]<br>val [C_INT](-c_-i-n-t.md): ValueLayout |
| [C_LONG](-c_-l-o-n-g.md) | [android, jvm]<br>[android, jvm]<br>val [C_LONG](-c_-l-o-n-g.md): ValueLayout |
| [C_LONG_LONG](-c_-l-o-n-g_-l-o-n-g.md) | [android, jvm]<br>[android, jvm]<br>val [C_LONG_LONG](-c_-l-o-n-g_-l-o-n-g.md): ValueLayout |
| [C_POINTER](-c_-p-o-i-n-t-e-r.md) | [android, jvm]<br>[android, jvm]<br>val [C_POINTER](-c_-p-o-i-n-t-e-r.md): ValueLayout |
| [C_SHORT](-c_-s-h-o-r-t.md) | [android, jvm]<br>[android, jvm]<br>val [C_SHORT](-c_-s-h-o-r-t.md): ValueLayout |
| [globalMemory](global-memory.md) | [common]<br>val [globalMemory](global-memory.md): [MemoryAllocator](-memory-allocator/index.md) |

## Functions

| Name | Summary |
|---|---|
| [memoryScope](memory-scope.md) | [common]<br>inline fun &lt;[R](memory-scope.md)&gt; [memoryScope](memory-scope.md)(block: (allocator: [MemoryAllocator](-memory-allocator/index.md)) -&gt; [R](memory-scope.md)): [R](memory-scope.md) |
| [toAddress](to-address.md) | [android]<br>fun Pointer.[toAddress](to-address.md)(): [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html) |
| [toCString](to-c-string.md) | [native]<br>fun [CPointer](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-c-pointer/index.html)&lt;[ByteVarOf](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-byte-var-of/index.html)&lt;[Byte](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-byte/index.html)&gt;&gt;.[toCString](to-c-string.md)(): [CString](-c-string/index.md) |
| [toOpaqueNativeAddress](to-opaque-native-address.md) | [native]<br>fun [NativePointed](https://kotlinlang.org/api/core/kotlin-stdlib/kotlinx.cinterop/-native-pointed/index.html).[toOpaqueNativeAddress](to-opaque-native-address.md)(): [Pointer](-pointer/index.md) |
| [upcallHandle](upcall-handle.md) | [jvm]<br>fun [upcallHandle](upcall-handle.md)(fi: [Class](https://developer.android.com/reference/kotlin/java/lang/Class.html)&lt;*&gt;?, name: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)?, fdesc: FunctionDescriptor): [MethodHandle](https://developer.android.com/reference/kotlin/java/lang/invoke/MethodHandle.html) |