package generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import disclamer
import domain.NativeModel
import generator.function.addJvmFunctionsTo
import generator.function.addNativeFunctionsTo
import poet.isNullableParam
import poet.isNullableReturnType
import poet.toCommonTypeName
import poet.WGPU_PACKAGE
import java.io.File

internal fun File.generateCommonFunctions(functions: List<NativeModel.Function>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Functions")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			addImport("ffi", "CString")
			addImport("ffi", "NativeAddress")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "ArrayHolder")
			functions.forEach { function ->
				addFunction(function.toCommonFunSpec())
			}
		}
		.build()
	resolve("Functions.kt").writeText(fileSpec.toString())
}

private fun NativeModel.Function.toCommonFunSpec(): FunSpec {
	val typeArg = returnType.first
	val typeArgDoc = returnType.second
	val returnTypeName = typeArg.toCommonTypeName()
		.let { if (typeArg.isNullableReturnType()) it.copy(nullable = true) else it }

	val argsDocParts = args.mapNotNull { (name, _, argDoc) -> argDoc?.let { "@param $name $it" } }
	val returnDocPart = typeArgDoc?.let { "@return $it" }
	val docParts = listOfNotNull(doc, *argsDocParts.toTypedArray(), returnDocPart)
	val fullDoc = docParts.joinToString("\n").takeIf { it.isNotBlank() }

	return FunSpec.builder(name)
		.addModifiers(KModifier.EXPECT)
		.apply {
			args.forEach { (argName, type, _) ->
				val paramType = type.toCommonTypeName()
					.let { if (type.isNullableParam()) it.copy(nullable = true) else it }
				addParameter(argName, paramType)
			}
			fullDoc?.let { addKdoc("%L", it) }
		}
		.returns(returnTypeName)
		.build()
}

internal fun File.generateNativeFunctions(functions: List<NativeModel.Function>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Functions.native")
		.addFileComment(disclamer.removePrefix("// "))
		.addAnnotation(
			AnnotationSpec.builder(ClassName("kotlin", "OptIn"))
				.addMember("%T::class", ClassName("kotlinx.cinterop", "ExperimentalForeignApi"))
				.useSiteTarget(AnnotationSpec.UseSiteTarget.FILE)
				.build()
		)
		.indent("\t")
		.apply {
			addImport("ffi", "CString")
			addImport("ffi", "NativeAddress")
			addImport("ffi", "ArrayHolder")
			addImport("ffi", "CallbackHolder")
			addImport("kotlinx.cinterop", "ExperimentalForeignApi")
			addImport("kotlinx.cinterop", "toCPointer")
			functions.addNativeFunctionsTo(this)
		}
		.build()
	resolve("Functions.native.kt").writeText(fileSpec.toString())
}

internal fun File.generateJvmFunctions(functions: List<NativeModel.Function>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Functions.jvm")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			addImport("ffi", "CString")
			addImport("ffi", "NativeAddress")
			addImport("ffi", "ArrayHolder")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "adapt")
			functions.addJvmFunctionsTo(this)
		}
		.build()
	resolve("Functions.jvm.kt").writeText(fileSpec.toString())
}
