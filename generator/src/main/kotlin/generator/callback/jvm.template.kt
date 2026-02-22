package generator.callback

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT
import domain.NativeModel
import domain.typeToJvmLayout
import poet.CALLBACK_HOLDER
import poet.FFI_PACKAGE
import poet.MEMORY_ALLOCATOR
import poet.MEMORY_SEGMENT
import poet.WGPU_PACKAGE
import poet.isNullableCallbackParam
import poet.toCommonTypeName
import poet.toJvmCallbackTypeName

internal fun List<NativeModel.Callback>.addJvmCallbacksTo(fileSpec: FileSpec.Builder) {
	forEach { callback ->
		fileSpec.addType(callback.toJvmCallbackTypeSpec())
	}
}

private fun NativeModel.Callback.toJvmCallbackTypeSpec(): TypeSpec {
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

	// Function inner interface (Panama)
	val functionInterface = TypeSpec.interfaceBuilder("Function")
		.addFunction(
			FunSpec.builder("apply")
				.apply {
					members.forEach { (argName, type) ->
						addParameter(argName, type.toJvmCallbackTypeName())
					}
				}
				.returns(UNIT)
				.build()
		)
		.build()

	// Build allocate body with anonymous object
	val jvmArgs = members.joinToString(", ") { (argName, type) ->
		"$argName: ${type.toJvmCallbackTypeString()}"
	}
	val argsCall = members.joinToString(", ") { (argName, type) ->
		type.toJvmCallbackArgCall(argName)
	}

	val allocateBody = buildString {
		append("val function = object : Function {\n")
		append("\toverride fun apply($jvmArgs) {\n")
		append("\t\tcallback.invoke($argsCall)\n")
		append("\t}\n")
		append("}\n")
		append("return java.lang.foreign.Linker.nativeLinker().upcallStub(\n")
		append("\thandler.bindTo(function),\n")
		append("\tdescriptor,\n")
		append("\tallocator.arena\n")
		append(").let(::NativeAddress)\n")
		append("\t.let(::CallbackHolder)\n")
	}

	val allocateFunc = FunSpec.builder("allocate")
		.addModifiers(KModifier.ACTUAL)
		.addParameter("allocator", MEMORY_ALLOCATOR)
		.addParameter("callback", callbackClass)
		.returns(CALLBACK_HOLDER.parameterizedBy(callbackClass))
		.addCode(allocateBody)
		.build()

	// descriptor property
	val descriptorBody = buildString {
		append("FunctionDescriptor.ofVoid(\n")
		members.forEach { (_, type) ->
			append("\t${typeToJvmLayout(type)},\n")
		}
		append(")")
	}
	val descriptorProp = PropertySpec.builder(
		"descriptor",
		ClassName("java.lang.foreign", "FunctionDescriptor")
	)
		.addModifiers(KModifier.PRIVATE)
		.initializer(descriptorBody)
		.build()

	// handler property
	val handlerBody = buildString {
		append("ffi.upcallHandle(\n")
		append("\tFunction::class.java,\n")
		append("\t\"apply\",\n")
		append("\tdescriptor\n")
		append(")")
	}
	val handlerProp = PropertySpec.builder(
		"handler",
		ClassName("java.lang.invoke", "MethodHandle")
	)
		.addModifiers(KModifier.PRIVATE)
		.initializer(handlerBody)
		.build()

	val companionObject = TypeSpec.companionObjectBuilder()
		.addModifiers(KModifier.ACTUAL)
		.addFunction(allocateFunc)
		.addProperty(descriptorProp)
		.addProperty(handlerProp)
		.build()

	return TypeSpec.funInterfaceBuilder(callbackName)
		.addModifiers(KModifier.ACTUAL)
		.addSuperinterface(ClassName(FFI_PACKAGE, "Callback"))
		.addFunction(invokeFunc)
		.addType(functionInterface)
		.addType(companionObject)
		.build()
}

// Raw string helpers for use inside code blocks
private fun NativeModel.Type.toJvmCallbackTypeString(): String = when (this) {
	NativeModel.Primitive.Float32 -> "Float"
	NativeModel.Primitive.Float64 -> "Double"
	NativeModel.Primitive.UInt8 -> "Byte"
	NativeModel.Primitive.UInt16 -> "Short"
	NativeModel.Primitive.UInt64,
	NativeModel.Primitive.Int64 -> "Long"
	NativeModel.Primitive.Bool,
	NativeModel.Primitive.Int32,
	NativeModel.Primitive.UInt32,
	is NativeModel.Reference.Enumeration -> "Int"
	is NativeModel.Array,
	NativeModel.Reference.CString,
	is NativeModel.Reference.Callback,
	NativeModel.Reference.OpaquePointer,
	is NativeModel.Reference.Pointer,
	is NativeModel.Reference.Structure,
	is NativeModel.Reference.StructureField -> "java.lang.foreign.MemorySegment"
	NativeModel.Void -> error("unsupported type here")
}

private fun NativeModel.Type.toJvmCallbackArgCall(name: String): String = when (this) {
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
	NativeModel.Reference.OpaquePointer -> "$name.let(::NativeAddress)"
	is NativeModel.Array ->
		"$name.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let(::NativeAddress)?.let(::ArrayHolder)"
	is NativeModel.Reference.Callback ->
		"$name.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let(::NativeAddress)?.let(::CallbackHolder)"
	is NativeModel.Reference ->
		"$name.takeIf { it != java.lang.foreign.MemorySegment.NULL }?.let { java.lang.foreign.MemorySegment.ofAddress(it.address()).reinterpret(it.byteSize()) }?.let(::NativeAddress)?.let { ${this.name}(it) }"
	NativeModel.Void -> error("unsupported type here")
}
