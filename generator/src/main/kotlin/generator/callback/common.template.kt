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
import poet.MEMORY_ALLOCATOR
import poet.WGPU_PACKAGE
import poet.isNullableCallbackParam
import poet.toCommonTypeName

internal fun List<NativeModel.Callback>.addCommonCallbacksTo(fileSpec: FileSpec.Builder) {
	forEach { callback ->
		val callbackClass = ClassName(WGPU_PACKAGE, callback.name)

		val invokeFunc = FunSpec.builder("invoke")
			.apply {
				callback.members.forEach { (argName, type) ->
					val paramType = type.toCommonTypeName()
						.let { if (type.isNullableCallbackParam()) it.copy(nullable = true) else it }
					addParameter(argName, paramType)
				}
			}
			.returns(UNIT)
			.build()

		val allocateFunc = FunSpec.builder("allocate")
			.addParameter("allocator", MEMORY_ALLOCATOR)
			.addParameter("callback", callbackClass)
			.returns(CALLBACK_HOLDER.parameterizedBy(callbackClass))
			.build()

		val companionObject = TypeSpec.companionObjectBuilder()
			.addFunction(allocateFunc)
			.build()

		val typeSpec = TypeSpec.funInterfaceBuilder(callback.name)
			.addModifiers(KModifier.EXPECT)
			.addSuperinterface(ClassName(FFI_PACKAGE, "Callback"))
			.apply { callback.doc?.let { addKdoc("%L", it) } }
			.addFunction(invokeFunc)
			.addType(companionObject)
			.build()

		fileSpec.addType(typeSpec)
	}
}
