package generator

import com.squareup.kotlinpoet.FileSpec
import disclamer
import domain.NativeModel
import generator.function.addAndroidFunctionsTo
import generator.function.addJnaFunctionsInterfaceTo
import poet.ANDROID_WGPU_PACKAGE
import poet.WGPU_PACKAGE
import java.io.File

internal fun File.generateAndroidNativeFunctions(functions: List<NativeModel.Function>) {
	val fileSpec = FileSpec.builder(ANDROID_WGPU_PACKAGE, "Functions")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			functions.addJnaFunctionsInterfaceTo(this)
		}
		.build()
	resolve("Functions.kt").writeText(fileSpec.toString())
}

internal fun File.generateAndroidFunctions(functions: List<NativeModel.Function>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Functions.android")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			functions.addAndroidFunctionsTo(this)
		}
		.build()
	resolve("Functions.android.kt").writeText(fileSpec.toString())
}
