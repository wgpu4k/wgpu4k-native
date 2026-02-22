package generator.structure

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import domain.NativeModel
import poet.ANDROID_WGPU_PACKAGE
import poet.JNA_PACKAGE
import poet.isNullableInJna
import poet.toJnaTypeName

fun List<NativeModel.Structure>.addJnaStructuresTo(fileSpec: FileSpec.Builder) {
	forEach { fileSpec.addType(it.toJnaTypeSpec()) }
}

private fun NativeModel.Structure.toJnaTypeSpec(): TypeSpec {
	val selfClass = ClassName(ANDROID_WGPU_PACKAGE, name)
	val jnaPointerNullable = ClassName(JNA_PACKAGE, "Pointer").copy(nullable = true)

	val primaryCtor = FunSpec.constructorBuilder()
		.addParameter(ParameterSpec.builder("pointer", jnaPointerNullable).defaultValue("null").build())
		.build()

	val fields = members.map { (memberName, type, _) ->
		val fieldType = type.toJnaTypeName().let { if (type.isNullableInJna()) it.copy(nullable = true) else it }
		PropertySpec.builder(memberName, fieldType)
			.mutable(true)
			.addAnnotation(AnnotationSpec.builder(ClassName("kotlin.jvm", "JvmField")).build())
			.initializer(type.toJnaDefaultValue())
			.build()
	}

	val getFieldOrder = FunSpec.builder("getFieldOrder")
		.addModifiers(KModifier.OVERRIDE)
		.addCode("return listOf(${members.joinToString(", ") { (n, _, _) -> "\"$n\"" }})")
		.build()

	val copyBody = members.joinToString("\n") { (n, _, _) -> "this.$n = other.$n" } + "\n"

	val byRef = TypeSpec.classBuilder("ByReference")
		.primaryConstructor(
			FunSpec.constructorBuilder()
				.addParameter(ParameterSpec.builder("pointer", jnaPointerNullable).defaultValue("null").build())
				.build()
		)
		.superclass(selfClass)
		.addSuperclassConstructorParameter("pointer")
		.addSuperinterface(ClassName(JNA_PACKAGE, "Structure", "ByReference"))
		.addFunction(
			FunSpec.constructorBuilder()
				.addParameter("other", selfClass)
				.callThisConstructor("other.pointer")
				.addCode(copyBody)
				.build()
		)
		.build()

	val byVal = TypeSpec.classBuilder("ByValue")
		.primaryConstructor(
			FunSpec.constructorBuilder()
				.addParameter(ParameterSpec.builder("pointer", jnaPointerNullable).defaultValue("null").build())
				.build()
		)
		.superclass(selfClass)
		.addSuperclassConstructorParameter("pointer")
		.addSuperinterface(ClassName(JNA_PACKAGE, "Structure", "ByValue"))
		.addFunction(
			FunSpec.constructorBuilder()
				.addParameter("other", selfClass)
				.callThisConstructor("other.pointer")
				.addCode(copyBody)
				.build()
		)
		.build()

	return TypeSpec.classBuilder(name)
		.addModifiers(KModifier.SEALED)
		.addKdoc("@suppress")
		.primaryConstructor(primaryCtor)
		.superclass(ClassName(JNA_PACKAGE, "Structure"))
		.addSuperclassConstructorParameter("pointer")
		.addProperties(fields)
		.addFunction(getFieldOrder)
		.addType(byRef)
		.addType(byVal)
		.build()
}

private fun NativeModel.Type.toJnaDefaultValue(): String = when (this) {
	NativeModel.Primitive.Bool -> "0"
	NativeModel.Primitive.UInt64 -> "0L"
	NativeModel.Primitive.Int64 -> "0L"
	is NativeModel.Reference.Enumeration,
	NativeModel.Primitive.UInt32 -> "0"
	NativeModel.Primitive.UInt16 -> "0"
	NativeModel.Primitive.Int32 -> "0"
	NativeModel.Primitive.Float32 -> "0f"
	NativeModel.Primitive.Float64 -> "0.0"
	NativeModel.Primitive.UInt8 -> "0"
	is NativeModel.Reference.StructureField -> "${name}.ByValue()"
	else -> "null"
}
