package generator.function

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import domain.NativeModel
import poet.isNullableParam
import poet.isNullableReturnType
import poet.toCommonTypeName

fun List<NativeModel.Function>.addAndroidFunctionsTo(fileSpec: FileSpec.Builder) {
	forEach { fileSpec.addFunction(it.toAndroidFunSpec()) }
}

private fun NativeModel.Function.toAndroidFunSpec(): FunSpec {
	val returnType = returnType.first
	val returnTypeName = returnType.toCommonTypeName()
		.let { if (returnType.isNullableReturnType()) it.copy(nullable = true) else it }
	val argsCall = args.map { (name, type) -> type.toAndroidArgCall(name) }.joinToString(", ")

	val chain = when (returnType) {
		is NativeModel.Reference.Enumeration,
		is NativeModel.Reference.OpaquePointer -> null
		is NativeModel.Reference.StructureField -> "\t.let(${returnType.name}::ByValue)"
		is NativeModel.Reference -> "\t?.let(::${returnType.name})"
		is NativeModel.Primitive.Bool -> "\t.toBoolean()"
		else -> null
	}

	val body = buildString {
		append("\t = io.ygdrasil.wgpu.android.Functions.$name($argsCall)\n")
		chain?.let { append("$it\n") }
	}

	return FunSpec.builder(name)
		.addModifiers(KModifier.ACTUAL)
		.apply {
			args.forEach { (argName, type, _) ->
				val paramType = type.toCommonTypeName()
					.let { if (type.isNullableParam()) it.copy(nullable = true) else it }
				addParameter(argName, paramType)
			}
		}
		.returns(returnTypeName)
		.addCode(body)
		.build()
}

private fun NativeModel.Type.toAndroidArgCall(name: String) = when (this) {
	is NativeModel.Primitive.Bool -> "$name.toUInt()"
	is NativeModel.Reference.StructureField -> when (isOptional) {
		true -> "$name?.toCValue()"
		else -> "${name}.toCValue()"
	}
	is NativeModel.Reference.Structure -> "${name}?.toReference()"
	is NativeModel.Reference.OpaquePointer,
	is NativeModel.Reference.Enumeration -> name
	is NativeModel.Reference.Callback -> "$name?.callback"
	is NativeModel.Array,
	is NativeModel.Reference -> "$name?.handler"
	else -> name
}

internal fun NativeModel.Type.optionalReturnType(): String = when (this) {
	NativeModel.Reference.OpaquePointer,
	is NativeModel.Reference.Pointer,
	is NativeModel.Reference.Structure,
	NativeModel.Reference.CString,
	is NativeModel.Reference.Callback,
	is NativeModel.Array -> "?"
	else -> ""
}

internal fun NativeModel.Type.optional(): String = when (this) {
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
