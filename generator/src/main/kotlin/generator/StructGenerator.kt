package generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_INT
import com.squareup.kotlinpoet.UNIT
import disclamer
import domain.NativeModel
import generator.structure.addJvmStructuresTo
import generator.structure.addNativeStructuresTo
import poet.ARRAY_HOLDER
import poet.MEMORY_ALLOCATOR
import poet.NATIVE_ADDRESS
import poet.WGPU_PACKAGE
import poet.toCommonTypeName
import java.io.File

internal fun File.generateCommonStructures(structures: List<NativeModel.Structure>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Structures")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			addImport("ffi", "NativeAddress")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "CString")
			addImport("ffi", "ArrayHolder")
			addImport("ffi", "MemoryAllocator")
			structures.forEach { addType(it.toExpectTypeSpec()) }
		}
		.build()
	resolve("Structures.kt").writeText(fileSpec.toString())
}

private fun NativeModel.Structure.toExpectTypeSpec(): TypeSpec {
	val selfClass = ClassName(WGPU_PACKAGE, name)
	val arrayHolderOfSelf = ARRAY_HOLDER.parameterizedBy(selfClass)
	val providerType = LambdaTypeName.get(
		parameters = arrayOf(U_INT, selfClass),
		returnType = UNIT
	)

	val companion = TypeSpec.companionObjectBuilder()
		.addFunction(
			FunSpec.builder("invoke")
				.addModifiers(KModifier.OPERATOR)
				.addParameter("address", NATIVE_ADDRESS)
				.returns(selfClass)
				.build()
		)
		.addFunction(
			FunSpec.builder("allocate")
				.addParameter("allocator", MEMORY_ALLOCATOR)
				.returns(selfClass)
				.build()
		)
		.addFunction(
			FunSpec.builder("allocateArray")
				.addParameter("allocator", MEMORY_ALLOCATOR)
				.addParameter("size", U_INT)
				.addParameter(ParameterSpec.builder("provider", providerType).build())
				.returns(arrayHolderOfSelf)
				.build()
		)
		.build()

	return TypeSpec.interfaceBuilder(name)
		.addModifiers(KModifier.EXPECT)
		.apply {
			doc?.let { addKdoc("%L", it) }
			members.forEach { member ->
				val memberType = member.type.toCommonTypeName()
					.let { t -> if (member.option == "?") t.copy(nullable = true) else t }
				val isMutable = member.type !is NativeModel.Reference.StructureField
				val prop = PropertySpec.builder(member.name, memberType)
					.mutable(isMutable)
					.apply { member.doc?.let { addKdoc("%L", it) } }
					.build()
				addProperty(prop)
			}
			addProperty(PropertySpec.builder("handler", NATIVE_ADDRESS).build())
		}
		.addType(companion)
		.build()
}

internal fun File.generateNativeStructures(structures: List<NativeModel.Structure>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Structures.native")
		.addFileComment(disclamer.removePrefix("// "))
		.addAnnotation(
			AnnotationSpec.builder(ClassName("kotlin", "OptIn"))
				.addMember("%T::class", ClassName("kotlinx.cinterop", "ExperimentalForeignApi"))
				.useSiteTarget(AnnotationSpec.UseSiteTarget.FILE)
				.build()
		)
		.indent("\t")
		.apply {
			addImport("ffi", "NativeAddress")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "CString")
			addImport("ffi", "toCString")
			addImport("ffi", "ArrayHolder")
			addImport("ffi", "MemoryAllocator")
			addImport("kotlinx.cinterop", "ExperimentalForeignApi")
			addImport("kotlinx.cinterop", "pointed")
			addImport("kotlinx.cinterop", "useContents")
			addImport("kotlinx.cinterop", "toCPointer")
			addImport("kotlinx.cinterop", "toKString")
			addImport("kotlinx.cinterop", "toLong")
			addImport("kotlinx.cinterop", "sizeOf")
			addImport("kotlinx.cinterop", "CValue")
			addImport("kotlinx.cinterop", "cValue")
			structures.addNativeStructuresTo(this)
		}
		.build()
	resolve("Structures.native.kt").writeText(fileSpec.toString())
}

internal fun File.generateJvmStructures(structures: List<NativeModel.Structure>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Structures.jvm")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			addImport("ffi", "NativeAddress")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "CString")
			addImport("ffi", "ArrayHolder")
			addImport("ffi", "C_LONG")
			addImport("ffi", "C_POINTER")
			addImport("ffi", "C_SHORT")
			addImport("ffi", "C_INT")
			addImport("ffi", "C_FLOAT")
			addImport("ffi", "C_DOUBLE")
			addImport("ffi", "CStructure")
			addImport("ffi", "MemoryAllocator")
			addImport("java.lang.foreign", "MemoryLayout")
			addImport("java.lang.foreign", "GroupLayout")
			addImport("java.lang.foreign.MemoryLayout.PathElement", "groupElement")
			addImport("java.lang.foreign.MemoryLayout", "structLayout")
			structures.addJvmStructuresTo(this)
		}
		.build()
	resolve("Structures.jvm.kt").writeText(fileSpec.toString())
}
