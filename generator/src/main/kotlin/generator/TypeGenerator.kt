package generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import disclamer
import domain.NativeModel
import poet.NATIVE_ADDRESS
import poet.WGPU_PACKAGE
import java.io.File

fun File.generateCommonTypes(classes: List<NativeModel.Pointer>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Types")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			classes.forEach { pointer ->
				TypeSpec.classBuilder(pointer.name)
					.addAnnotation(AnnotationSpec.builder(JvmInline::class).build())
					.addModifiers(KModifier.VALUE)
					.primaryConstructor(
						FunSpec.constructorBuilder()
							.addParameter("handler", NATIVE_ADDRESS)
							.build()
					)
					.addProperty(
						PropertySpec.builder("handler", NATIVE_ADDRESS)
							.initializer("handler")
							.build()
					)
					.apply { pointer.doc?.let { addKdoc("%L", it) } }
					.build()
					.let(::addType)
			}
		}
		.build()
	resolve("Types.kt").writeText(fileSpec.toString())
}
