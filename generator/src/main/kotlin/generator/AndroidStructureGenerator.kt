package generator

import com.squareup.kotlinpoet.FileSpec
import disclamer
import domain.NativeModel
import generator.structure.addAndroidStructuresTo
import generator.structure.addJnaStructuresTo
import poet.ANDROID_WGPU_PACKAGE
import poet.WGPU_PACKAGE
import java.io.File

fun File.generateAndroidStructures(structures: List<NativeModel.Structure>) = this.apply {
	val jnaFileSpec = FileSpec.builder(ANDROID_WGPU_PACKAGE, "Structures")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply { structures.addJnaStructuresTo(this) }
		.build()
	resolve("Structures.kt").writeText(jnaFileSpec.toString())

	val androidFileSpec = FileSpec.builder(WGPU_PACKAGE, "Structures.android")
		.addFileComment(disclamer.removePrefix("// "))
		.indent("\t")
		.apply {
			addImport("ffi", "NativeAddress")
			addImport("ffi", "CallbackHolder")
			addImport("ffi", "CString")
			addImport("ffi", "ArrayHolder")
			addImport("ffi", "MemoryAllocator")
			addImport("ffi", "register")
			structures.addAndroidStructuresTo(this)
		}
		.build()
	resolve("Structures.android.kt").writeText(androidFileSpec.toString())
}
