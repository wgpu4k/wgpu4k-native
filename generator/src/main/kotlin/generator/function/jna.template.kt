package generator.function

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import domain.NativeModel
import poet.ANDROID_WGPU_PACKAGE
import poet.JNA_CALLBACK
import poet.JNA_POINTER
import poet.toJnaFunctionTypeName

fun List<NativeModel.Function>.addJnaFunctionsInterfaceTo(fileSpec: FileSpec.Builder) {
	val interfaceSpec = TypeSpec.interfaceBuilder("FunctionsInterface")
		.addModifiers(KModifier.INTERNAL)
		.addSuperinterface(ClassName("com.sun.jna", "Library"))
		.apply {
			forEach { function ->
				val returnTypeName = function.returnType.first.toJnaFunctionTypeName()
				val funSpec = FunSpec.builder(function.name)
					.addAnnotation(
						AnnotationSpec.builder(Suppress::class)
							.addMember("%S", "INAPPLICABLE_JVM_NAME")
							.build()
					)
					.addAnnotation(
						AnnotationSpec.builder(JvmName::class)
							.addMember("%S", function.name)
							.build()
					)
					.addModifiers(KModifier.ABSTRACT)
					.apply {
						function.args.forEach { (argName, type, _) ->
							addParameter(argName, type.toJnaFunctionTypeName())
						}
					}
					.returns(returnTypeName)
					.build()
				addFunction(funSpec)
			}
		}
		.build()

	val functionsProperty = PropertySpec.builder(
		"Functions",
		ClassName("", "FunctionsInterface")
	)
		.addModifiers(KModifier.INTERNAL)
		.initializer(
			"%T.load(%S, %T::class.java)",
			ClassName("com.sun.jna", "Native"),
			"wgpu4k",
			ClassName("", "FunctionsInterface")
		)
		.build()

	fileSpec.addType(interfaceSpec)
	fileSpec.addProperty(functionsProperty)
}

internal fun NativeModel.Type.toAndroidNativeType(): String = when (this) {
	is NativeModel.Primitive.Int32 -> "Int"
	is NativeModel.Primitive.Int64 -> "Long"
	is NativeModel.Void -> "Unit"
	NativeModel.Primitive.Bool -> "UInt"
	NativeModel.Primitive.UInt64 -> "ULong"
	NativeModel.Primitive.Float64 -> "Double"
	NativeModel.Primitive.Float32 -> "Float"
	is NativeModel.Reference.Enumeration,
	NativeModel.Primitive.UInt32 -> "UInt"
	NativeModel.Primitive.UInt16 -> "UShort"
	NativeModel.Primitive.UInt8 -> "UByte"
	is NativeModel.Reference.StructureField -> when (isOptional) {
		true -> "${name}.ByValue?"
		else -> "${name}.ByValue"
	}
	is NativeModel.Reference.Structure -> "${name}.ByReference?"
	is NativeModel.Reference.Callback -> "com.sun.jna.Callback?"
	is NativeModel.Array,
	NativeModel.Reference.CString,
	NativeModel.Reference.OpaquePointer,
	is NativeModel.Reference.Pointer -> "com.sun.jna.Pointer?"
}
