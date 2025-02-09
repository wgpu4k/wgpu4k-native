package generator

import builder.templateBuilder
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
    templateBuilder {
        classes.forEach {
            appendDoc(it.doc)
            appendLine("@JvmInline")
            appendLine("value class ${it.name}(val handler: NativeAddress)")
        }
    }.let(::appendText)
}
