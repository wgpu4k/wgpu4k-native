package generator

import com.squareup.kotlinpoet.FileSpec
import disclamer
import domain.NativeModel
import generator.function.addJvmFunctionsInterfaceTo
import poet.WGPU_PACKAGE
import java.io.File

internal fun File.generateJvmNativeFunctions(functions: List<NativeModel.Function>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Functions")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			addImport("java.lang.foreign", "Linker")
			addImport("ffi", "findOrThrow")
			addImport("ffi", "C_POINTER")
			addImport("ffi", "C_INT")
			addImport("ffi", "C_LONG")
			addImport("ffi", "C_FLOAT")
			addImport("ffi", "C_DOUBLE")
			addImport("ffi", "C_SHORT")
			addImport("ffi", "C_BYTE")
			functions.addJvmFunctionsInterfaceTo(this)
		}
		.build()
	resolve("Functions.kt").writeText(fileSpec.toString())
}
