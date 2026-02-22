package generator.callback

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT
import domain.NativeModel
import domain.toFunctionKotlinType
import poet.CALLBACK_HOLDER
import poet.FFI_PACKAGE
import poet.MEMORY_ALLOCATOR
import poet.WGPU_PACKAGE
import poet.isNullableCallbackParam
import poet.toCommonTypeName

internal fun List<NativeModel.Callback>.addNativeCallbacksTo(fileSpec: FileSpec.Builder) {
	forEach { callback ->
		fileSpec.addType(callback.toNativeCallbackTypeSpec())
	}
}

private fun NativeModel.Callback.toNativeCallbackTypeSpec(): TypeSpec {
	val callbackClass = ClassName(WGPU_PACKAGE, name)
	val callbackName = name

	// invoke function with common types
	val invokeFunc = FunSpec.builder("invoke")
		.addModifiers(KModifier.ACTUAL)
		.apply {
			members.forEach { (argName, type) ->
				val paramType = type.toCommonTypeName()
					.let { if (type.isNullableCallbackParam()) it.copy(nullable = true) else it }
				addParameter(argName, paramType)
			}
		}
		.returns(UNIT)
		.build()

	// Build allocate body with staticCFunction
	val args = members.joinToString(", ") { (argName, type) ->
		"$argName: ${type.toNativeCallbackArg()}"
	}
	val argsCall = members.joinToString(", ") { (argName, type) ->
		type.toNativeCallbackArgCall(argName)
	}
	val lastArgName = members.last().first

	val allocateBody = buildString {
		append("val actualCallback = kotlinx.cinterop.staticCFunction { $args ->\n")
		append("\tval address = $lastArgName?.reinterpret<LongVar>()?.pointed?.value?.let(::NativeAddress) ?: error(\"Missing callback address on last argument\")\n")
		append("\tval callback = findCallback<$callbackName>(address.reinterpret<COpaque>())\n")
		append("\t\t?: error(\"Callback not found with address \$address and type $callbackName\")\n")
		append("\tcallback.invoke($argsCall)\n")
		append("}\n")
		append("registerCallback(actualCallback, callback)\n")
		append("return CallbackHolder(actualCallback.let(::NativeAddress), actualCallback)\n")
	}

	val allocateFunc = FunSpec.builder("allocate")
		.addModifiers(KModifier.ACTUAL)
		.addParameter("allocator", MEMORY_ALLOCATOR)
		.addParameter("callback", callbackClass)
		.returns(CALLBACK_HOLDER.parameterizedBy(callbackClass))
		.addCode(allocateBody)
		.build()

	val companionObject = TypeSpec.companionObjectBuilder()
		.addModifiers(KModifier.ACTUAL)
		.addFunction(allocateFunc)
		.build()

	return TypeSpec.funInterfaceBuilder(callbackName)
		.addModifiers(KModifier.ACTUAL)
		.addSuperinterface(ClassName(FFI_PACKAGE, "Callback"))
		.addFunction(invokeFunc)
		.addType(companionObject)
		.build()
}

private fun NativeModel.Type.toNativeCallbackArgCall(name: String): String = when (this) {
	is NativeModel.Reference.Enumeration,
	is NativeModel.Primitive -> name
	is NativeModel.Reference.StructureField -> "$name.let { ${this.name}.ByValue(it) }"
	is NativeModel.Reference.Pointer -> "$name?.let(::NativeAddress)?.let(::${this.name})"
	is NativeModel.Reference.Structure -> "$name?.let(::NativeAddress)?.let { ${this.name}(it) }"
	NativeModel.Reference.CString -> "$name?.let(::NativeAddress)?.let(::CString)"
	NativeModel.Void -> error("unsupported type")
	else -> "$name?.let(::NativeAddress)"
}

private fun NativeModel.Type.toNativeCallbackArg(): String = when (this) {
	is NativeModel.Primitive -> toFunctionKotlinType()
	is NativeModel.Reference.StructureField -> "kotlinx.cinterop.CValue<webgpu.native.$name>"
	is NativeModel.Reference.Enumeration -> "UInt"
	NativeModel.Void -> error("unsupported type")
	else -> "COpaquePointer?"
}
