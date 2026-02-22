package generator

import com.squareup.kotlinpoet.AnnotationSpec
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FileSpec
import disclamer
import domain.NativeModel
import generator.callback.addAndroidCallbacksTo
import generator.callback.addCommonCallbacksTo
import generator.callback.addJvmCallbacksTo
import generator.callback.addNativeCallbacksTo
import poet.WGPU_PACKAGE
import java.io.File

internal fun File.generateCommonCallback(callbacks: List<NativeModel.Callback>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Callbacks")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			addImport("ffi", "Callback")
			addImport("ffi", "CString")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "MemoryAllocator")
			addImport("ffi", "NativeAddress")
			callbacks.addCommonCallbacksTo(this)
		}
		.build()
	resolve("Callbacks.kt").writeText(fileSpec.toString())
}

internal fun File.generateJvmCallback(callbacks: List<NativeModel.Callback>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Callbacks.jvm")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			addImport("ffi", "Callback")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "MemoryAllocator")
			addImport("ffi", "NativeAddress")
			addImport("java.lang.foreign", "FunctionDescriptor")
			callbacks.addJvmCallbacksTo(this)
		}
		.build()
	resolve("Callbacks.jvm.kt").writeText(fileSpec.toString())
}

internal fun File.generateAndroidCallback(callbacks: List<NativeModel.Callback>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Callbacks.android")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			addImport("ffi", "Callback")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "ArrayHolder")
			addImport("ffi", "MemoryAllocator")
			addImport("ffi", "NativeAddress")
			callbacks.addAndroidCallbacksTo(this)
		}
		.build()
	resolve("Callbacks.android.kt").writeText(fileSpec.toString())
}

internal fun File.generateNativeCallback(callbacks: List<NativeModel.Callback>) {
	val fileSpec = FileSpec.builder(WGPU_PACKAGE, "Callbacks.native")
		.addFileComment(disclamer.removePrefix("// "))
		.addAnnotation(
			AnnotationSpec.builder(ClassName("kotlin", "OptIn"))
				.addMember("%T::class", ClassName("kotlinx.cinterop", "ExperimentalForeignApi"))
				.useSiteTarget(AnnotationSpec.UseSiteTarget.FILE)
				.build()
		)
		.indent("\t")
		.apply {
			addImport("ffi", "CString")
			addImport("ffi", "Callback")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "MemoryAllocator")
			addImport("ffi", "NativeAddress")
			addImport("ffi", "findCallback")
			addImport("ffi", "registerCallback")
			addImport("kotlinx.cinterop", "ExperimentalForeignApi")
			addImport("kotlinx.cinterop", "LongVar")
			addImport("kotlinx.cinterop", "COpaque")
			addImport("kotlinx.cinterop", "COpaquePointer")
			addImport("kotlinx.cinterop", "pointed")
			addImport("kotlinx.cinterop", "reinterpret")
			addImport("kotlinx.cinterop", "value")
			callbacks.addNativeCallbacksTo(this)
		}
		.build()
	resolve("Callbacks.native.kt").writeText(fileSpec.toString())
}
