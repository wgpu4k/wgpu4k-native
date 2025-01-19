package generator

import disclamer
import domain.NativeModel
import generator.function.toJvmFunctionsInterface
import java.io.File

private val header = """
    $disclamer
    package io.ygdrasil.wgpu
    
    import java.lang.foreign.MemorySegment
    import java.lang.foreign.Linker
    import ffi.findOrThrow
    import ffi.C_POINTER
    import ffi.C_INT
    import ffi.C_LONG
    import ffi.C_FLOAT
    import ffi.NativeAddress
    import java.lang.foreign.FunctionDescriptor
    
    
""".trimIndent()

internal fun File.generateJvmNativeFunctions(functions: List<NativeModel.Function>)
 = resolve("Functions.kt").apply {
    writeText(header)
    functions.toJvmFunctionsInterface()
        .let(::appendText)
}
