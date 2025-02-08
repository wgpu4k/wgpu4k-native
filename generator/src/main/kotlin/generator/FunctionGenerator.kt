package generator

import disclamer
import builder.templateBuilder
import domain.NativeModel
import domain.toFunctionKotlinType
import generator.function.toNativeFunctionsInterface
import generator.function.toJvmFunctions
import java.io.File

private val header = """
    $disclamer
    package io.ygdrasil.wgpu
    
    import ffi.CString
    import ffi.NativeAddress
    import ffi.CallbackHolder
    import ffi.ArrayHolder
    
    
    
""".trimIndent()

private val jvmHeader = """
    $disclamer
    package io.ygdrasil.wgpu
    
    import ffi.CString
    import ffi.NativeAddress
    import ffi.ArrayHolder
    import ffi.CallbackHolder
    import ffi.adapt
    
    
    
""".trimIndent()

private val nativeHeader = """
    @file:OptIn(ExperimentalForeignApi::class)
    $disclamer
    package io.ygdrasil.wgpu
    
    import ffi.CString
    import ffi.NativeAddress
    import ffi.ArrayHolder
    import ffi.CallbackHolder
    import kotlinx.cinterop.ExperimentalForeignApi
    import kotlinx.cinterop.toCPointer
    
    
    
""".trimIndent()

internal fun File.generateCommonFunctions(functions: List<NativeModel.Function>) = resolve("Functions.kt").apply {

    writeText(header)

    functions.forEach { function ->
        writeFunction(function)
            .let(::appendText)
    }

}

private fun writeFunction(function: NativeModel.Function) = templateBuilder {
    val name = function.name
    val returnType = function.returnType.first.toFunctionKotlinType() + function.returnType.first.optionalReturnType()
    val args = function.args
        .map { (name, type) -> "${name}: ${type.toFunctionKotlinType()}${type.optional()}" }
        .joinToString(", ")

    val argsDoc = function.args.mapNotNull { (name, _, doc) -> doc?.let { "@param $name $doc"} }
        .joinToString("\n")
        .takeIf { it.isNotBlank() }
    val returnDoc = function.returnType.second?.let { doc -> "@return $doc" }
    val doc = ((function.doc ?: "") + (argsDoc?.let { "\n$it" } ?: "") + (returnDoc?.let { "\n$it" } ?: ""))
        .takeIf { it.isNotBlank() }

    appendDoc(doc)
    appendLine("expect fun $name($args): $returnType")
}

private fun NativeModel.Type.optionalReturnType(): String = when (this) {
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    is NativeModel.Array -> "?"

    else -> ""
}

private fun NativeModel.Type.optional(): String = when (this) {
    NativeModel.Void,
    NativeModel.Reference.OpaquePointer,
    is NativeModel.Reference.Pointer,
    is NativeModel.Reference.Structure,
    NativeModel.Reference.CString,
    is NativeModel.Reference.Callback,
    is NativeModel.Array -> "?"

    is NativeModel.Reference.StructureField -> when (isOptional) {
        true -> "?"
        else -> ""
    }

    else -> ""
}


internal fun File.generateNativeFunctions(functions: List<NativeModel.Function>) =
    resolve("Functions.native.kt").apply {
        writeText(nativeHeader)
        functions.toNativeFunctionsInterface()
            .let(::appendText)
    }


internal fun File.generateJvmFunctions(functions: List<NativeModel.Function>)
= resolve("Functions.jvm.kt").apply {
    writeText(jvmHeader)
    functions.toJvmFunctions()
        .let(::appendText)
}

