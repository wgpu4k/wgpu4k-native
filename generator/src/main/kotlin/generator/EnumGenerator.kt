package generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeAliasSpec
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.U_LONG
import disclamer
import domain.NativeModel
import poet.WGPU_PACKAGE
import java.io.File

internal fun File.generateCommonEnumerations(enumerations: List<NativeModel.Enumeration>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Enumerations")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			enumerations.forEach { enumeration ->
				val (underlyingType, valueSuffix) = if (enumeration.size == 32) U_INT to "u" else U_LONG to "uL"
				val typeAliasType = ClassName(WGPU_PACKAGE, enumeration.name)

				TypeAliasSpec.builder(enumeration.name, underlyingType)
					.apply { enumeration.doc?.let { addKdoc("%L", it) } }
					.build()
					.let(::addTypeAlias)

				enumeration.values.forEach { (name, value, doc) ->
					PropertySpec.builder("${enumeration.name}_$name", typeAliasType)
						.addModifiers(KModifier.CONST)
						.initializer("$value$valueSuffix")
						.apply { doc?.let { addKdoc("%L", it) } }
						.build()
						.let(::addProperty)
				}
			}
		}
		.build()
	resolve("Enumerations.kt").writeText(fileSpec.toString())
}
