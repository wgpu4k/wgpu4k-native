package generator

import disclamer
import domain.NativeModel
import java.io.File

private val header = """
    $disclamer
    package io.ygdrasil.wgpu
    
    import ffi.NativeAddress
    import kotlin.jvm.JvmInline
    
""".trimIndent()

fun File.generateCommonTypes(classes: List<NativeModel.Pointer>) = resolve("Types.kt").apply {
    writeText(header)
    classes.forEach {
        appendText("@JvmInline\n")
        appendText("value class ${it.name}(val handler: NativeAddress)\n")
    }
}
