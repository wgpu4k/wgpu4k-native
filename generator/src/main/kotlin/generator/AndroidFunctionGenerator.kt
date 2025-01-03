package generator

import disclamer
import domain.NativeModel
import generator.function.toAndroidFunctions
import generator.function.toJnaFunctionsInterface
import java.io.File

private val jnaHeader = """
    $disclamer
    package io.ygdrasil.wgpu.android

    
    
""".trimIndent()


private val header = """
    $disclamer
    package io.ygdrasil.wgpu
    
    import ffi.CString
    import ffi.NativeAddress
    import ffi.CallbackHolder
    import ffi.ArrayHolder
    import ffi.adapt
    
    
    
""".trimIndent()

internal fun File.generateAndroidNativeFunctions(functions: List<NativeModel.Function>) =
    resolve("Functions.kt").apply {
        writeText(jnaHeader)

        functions.toJnaFunctionsInterface()
            .let(::appendText)

    }


internal fun File.generateAndroidFunctions(functions: List<NativeModel.Function>) = resolve("Functions.android.kt").apply {
        writeText(header)

        functions.toAndroidFunctions()
            .let(::appendText)

    }