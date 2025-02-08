package generator

import builder.templateBuilder
import disclamer
import domain.NativeModel
import java.io.File

private val header = """
    $disclamer
    package io.ygdrasil.wgpu
    
    
""".trimIndent()

internal fun File.generateCommonEnumerations(enumerations: List<NativeModel.Enumeration>)
= resolve("Enumerations.kt").apply {

    writeText(header)

    templateBuilder {
        enumerations.forEach { enumeration ->
            val type = if (enumeration.size == 32) "UInt" else "ULong"
            val valueSuffix = if (enumeration.size == 32) "u" else "uL"
            appendDoc(enumeration.doc)
            appendLine("typealias ${enumeration.name} = $type")
            enumeration.values.forEach { (name, value, doc) ->
                appendDoc(doc)
                appendLine("const val ${enumeration.name}_$name : ${enumeration.name} = ${value}$valueSuffix")
            }
            newLine()
        }
    }.let(::appendText)

}