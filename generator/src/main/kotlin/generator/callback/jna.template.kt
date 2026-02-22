package generator.callback

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT
import domain.NativeModel
import poet.CALLBACK_HOLDER
import poet.FFI_PACKAGE
import poet.JNA_PACKAGE
import poet.MEMORY_ALLOCATOR
import poet.WGPU_PACKAGE
import poet.isNullableCallbackParam
import poet.toCommonTypeName
import poet.toJnaCallbackTypeName

internal fun List<NativeModel.Callback>.addAndroidCallbacksTo(fileSpec: FileSpec.Builder) {
	forEach { callback ->
		fileSpec.addType(callback.toJnaCallbackTypeSpec())
	}
}

private fun NativeModel.Callback.toJnaCallbackTypeSpec(): TypeSpec {
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

	// Function inner interface (JNA)
	val functionInterface = TypeSpec.interfaceBuilder("Function")
		.addSuperinterface(ClassName(JNA_PACKAGE, "Callback"))
		.addFunction(
			FunSpec.builder("apply")
				.apply {
					members.forEach { (argName, type) ->
						addParameter(argName, type.toJnaCallbackTypeName())
					}
				}
				.returns(UNIT)
				.build()
		)
		.build()

	// allocate body with anonymous object
	val jvmArgs = members.joinToString(", ") { (argName, type) ->
		"$argName: ${type.toCallbackJvmTypeString()}"
	}
	val argsCall = members.joinToString(", ") { (argName, type) ->
		type.toJnaCallbackArgCall(argName)
	}

	val allocateBody = buildString {
		append("val callbackFunction = object : Function {\n")
		append("\toverride fun apply($jvmArgs) {\n")
		append("\t\tcallback.invoke($argsCall)\n")
		append("\t}\n")
		append("}\n")
		append("return CallbackHolder(com.sun.jna.Pointer(0), callbackFunction)\n")
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
		.addType(functionInterface)
		.addType(companionObject)
		.build()
}

// Raw string helpers for use inside code blocks (not as TypeName objects)
private fun NativeModel.Type.toCallbackJvmTypeString(): String = when (this) {
	NativeModel.Primitive.Float32 -> "Float"
	NativeModel.Primitive.Float64 -> "Double"
	NativeModel.Primitive.UInt16 -> "Short"
	NativeModel.Primitive.UInt8 -> "Byte"
	NativeModel.Primitive.UInt64,
	NativeModel.Primitive.Int64 -> "Long"
	NativeModel.Primitive.Bool,
	NativeModel.Primitive.Int32,
	NativeModel.Primitive.UInt32,
	is NativeModel.Reference.Enumeration -> "Int"
	is NativeModel.Reference.StructureField -> "io.ygdrasil.wgpu.android.${this.name}.ByValue"
	is NativeModel.Array,
	NativeModel.Reference.CString,
	is NativeModel.Reference.Callback,
	NativeModel.Reference.OpaquePointer,
	is NativeModel.Reference.Pointer,
	is NativeModel.Reference.Structure -> "com.sun.jna.Pointer?"
	NativeModel.Void -> error("unsupported type here")
}

private fun NativeModel.Type.toJnaCallbackArgCall(name: String): String = when (this) {
	NativeModel.Primitive.Bool,
	is NativeModel.Reference.Enumeration,
	NativeModel.Primitive.UInt32 -> "$name.toUInt()"
	NativeModel.Primitive.Float32,
	NativeModel.Primitive.Float64,
	NativeModel.Primitive.Int32,
	NativeModel.Primitive.Int64 -> name
	NativeModel.Primitive.UInt8 -> "$name.toUByte()"
	NativeModel.Primitive.UInt16 -> "$name.toUShort()"
	NativeModel.Primitive.UInt64 -> "$name.toULong()"
	NativeModel.Reference.OpaquePointer -> "$name ?: com.sun.jna.Pointer(0)"
	is NativeModel.Reference.StructureField -> "$name.let { ${this.name}.ByValue(it) }"
	is NativeModel.Array -> "$name?.let(::ArrayHolder)"
	is NativeModel.Reference.Callback -> "$name?.let(::CallbackHolder)"
	is NativeModel.Reference -> "$name?.let { ${this.name}(it) }"
	NativeModel.Void -> error("unsupported type here")
}
