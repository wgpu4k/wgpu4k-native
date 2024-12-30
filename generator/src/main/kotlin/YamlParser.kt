import com.charleskorn.kaml.Yaml
import com.charleskorn.kaml.YamlList
import com.charleskorn.kaml.YamlNode
import com.charleskorn.kaml.YamlNull
import com.charleskorn.kaml.yamlMap
import com.charleskorn.kaml.yamlScalar
import converter.toCModel
import domain.YamlModel
import generator.enumerationCommonMainFile
import generator.functionsCommonMainFile
import generator.functionsJvmMainFile
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
import generator.generateTypesCommonMain
import generator.jvmNativeFunctionsMainFile
import generator.structuresCommonMainFile
import generator.structuresJvmMainFile
import generator.structuresNativeMainFile
import generator.typesCommonMainFile
import java.io.File


fun main() {

    val webgpuCModel = loadWebGPUYaml()
        .merge(loadExtraYaml())
        .toCModel()

    typesCommonMainFile.generateTypesCommonMain(webgpuCModel.pointers)


    Paths.commonMainBasePath.apply {
        generateCommonCallback(webgpuCModel.callbacks)
    }

    Paths.jvmMainBasePath.apply {
        generateJvmCallback(webgpuCModel.callbacks)
    }

    Paths. nativeMainBasePath.apply {
        generateNativeFunctions(webgpuCModel.functions)
        generateNativeCallback(webgpuCModel.callbacks)
    }

    jvmNativeFunctionsMainFile.generateJvmNativeFunctions(webgpuCModel.functions)

    functionsCommonMainFile.generateCommonFunctions(webgpuCModel.functions)
    functionsJvmMainFile.generateJvmFunctions(webgpuCModel.functions)

    structuresCommonMainFile.generateCommonStructures(webgpuCModel.structures)



    structuresJvmMainFile.generateJvmStructures(webgpuCModel.structures)
    structuresNativeMainFile.generateNativeStructures(webgpuCModel.structures)

    enumerationCommonMainFile.generateCommonEnumerations(webgpuCModel.enumerations)

    Paths.androidMainBasePath.apply {
        generateAndroidCallback(webgpuCModel.callbacks)
        generateAndroidStructures(webgpuCModel.structures)
        generateAndroidNativeFunctions(webgpuCModel.functions)
        generateAndroidFunctions(webgpuCModel.functions)
    }
}

fun loadExtraYaml() = Paths.specs
    .resolve("extra.yml")
    .readText()
    .let { text -> parser.decodeFromString(YamlModel.serializer(), text) }

fun loadWebGPUYaml() = Paths.specs
    .resolve("webgpu.yml")
    .readText()
    .let { text -> parser.decodeFromString(YamlModel.serializer(), text)}

val parser = Yaml(
    configuration = Yaml.default.configuration.copy(strictMode = true)
)

