package generator.function

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import domain.NativeModel
import poet.isNullableParam
import poet.isNullableReturnType
import poet.toCommonTypeName

internal fun List<NativeModel.Function>.addNativeFunctionsTo(fileSpec: FileSpec.Builder) {
	forEach { fileSpec.addFunction(it.toNativeFunSpec()) }
}

private fun NativeModel.Function.toNativeFunSpec(): FunSpec {
	val returnType = returnType.first
	val returnTypeName = returnType.toCommonTypeName()
		.let { if (returnType.isNullableReturnType()) it.copy(nullable = true) else it }
	val argsCall = args.map { (name, type) -> type.toNativeArgCall(name) }.joinToString(", ")

	val prefix = if (returnType is NativeModel.Void) "" else "return "
	val chain = when (returnType) {
		is NativeModel.Reference.Enumeration -> null
		is NativeModel.Reference.OpaquePointer -> "\t?.let(::NativeAddress)"
		is NativeModel.Reference.StructureField -> "\t.let(${returnType.name}::ByValue)"
		is NativeModel.Reference -> "\t?.let(::NativeAddress)?.let(::${returnType.name})"
		is NativeModel.Primitive.Bool -> "\t.toBoolean()"
		else -> null
	}

	val body = buildString {
		append("${prefix}webgpu.native.$name($argsCall)\n")
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

private fun NativeModel.Type.toNativeArgCall(name: String) = when (this) {
	is NativeModel.Primitive.Bool -> "$name.toUInt()"
	is NativeModel.Reference.StructureField -> when (isOptional) {
		true -> "$name?.toCValue()"
		else -> "$name.toCValue()"
	}
	is NativeModel.Reference.CString -> "$name?.toKString()"
	is NativeModel.Reference.OpaquePointer -> "$name?.pointer"
	is NativeModel.Reference.Enumeration -> name
	is NativeModel.Array,
	is NativeModel.Reference -> "$name?.handler?.reinterpret()"
	else -> name
}
