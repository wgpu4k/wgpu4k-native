import com.charleskorn.kaml.Yaml
import converter.toNativeModel
import domain.YamlModel
import generator.generateAndroidCallback
import generator.generateAndroidFunctions
import generator.generateAndroidNativeFunctions
import generator.generateAndroidStructures
import generator.generateCommonCallback
import generator.generateCommonEnumerations
import generator.generateCommonFunctions
import generator.generateCommonStructures
import generator.generateJvmCallback
import generator.generateJvmFunctions
import generator.generateJvmNativeFunctions
import generator.generateJvmStructures
import generator.generateNativeCallback
import generator.generateNativeFunctions
import generator.generateNativeStructures
import generator.generateCommonTypes
import java.io.File

fun generate(path: Paths) {

    val webgpuCModel = path.specs.loadWebGPUYaml()
        .merge(path.specs.loadExtraYaml())
        .toNativeModel()

    path.commonMainBasePath.apply {
        generateCommonTypes(webgpuCModel.pointers)
        generateCommonCallback(webgpuCModel.callbacks)
        generateCommonEnumerations(webgpuCModel.enumerations)
        generateCommonFunctions(webgpuCModel.functions)
        generateCommonStructures(webgpuCModel.structures)
    }

    path.jvmMainBasePath.apply {
        generateJvmCallback(webgpuCModel.callbacks)
        generateJvmNativeFunctions(webgpuCModel.functions)
        generateJvmFunctions(webgpuCModel.functions)
        generateJvmStructures(webgpuCModel.structures)
    }

    path.nativeMainBasePath.apply {
        generateNativeCallback(webgpuCModel.callbacks)
        generateNativeFunctions(webgpuCModel.functions)
        generateNativeStructures(webgpuCModel.structures)
    }


    path.androidMainBasePath.apply {
        generateAndroidCallback(webgpuCModel.callbacks)
        generateAndroidNativeFunctions(webgpuCModel.functions)
        generateAndroidFunctions(webgpuCModel.functions)
        generateAndroidStructures(webgpuCModel.structures)
    }
}

fun File.loadExtraYaml() = resolve("extra.yml")
    .readText()
    .let { text -> parser.decodeFromString(YamlModel.serializer(), text) }

fun File.loadWebGPUYaml() = resolve("webgpu.yml")
    .readText()
    .let { text -> parser.decodeFromString(YamlModel.serializer(), text)}

val parser = Yaml(
    configuration = Yaml.default.configuration.copy(strictMode = true)
)

