package generator

import disclamer
import domain.NativeModel
import java.io.File

val typesCommonMainFile = Paths.commonMainBasePath
    .resolve("webgpu")
    .resolve("Types.kt")

private val header = """
    $disclamer
    package io.ygdrasil.wgpu
    
    import ffi.NativeAddress
    import kotlin.jvm.JvmInline
    
""".trimIndent()

fun File.generateTypesCommonMain(classes: List<NativeModel.Pointer>) {
    writeText(header)
    classes.forEach {
        appendText("@JvmInline\n")
        appendText("value class ${it.name}(val handler: NativeAddress)\n")
    }
}
