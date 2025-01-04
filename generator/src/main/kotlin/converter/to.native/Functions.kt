package converter.to.native

import domain.NativeModel
import domain.NativeModel.Type
import domain.YamlModel
import domain.toCType
import convertToKotlinCallbackName
import convertToKotlinCallbackStructureName
import convertToKotlinFunctionName
import convertToKotlinVariableName

internal fun YamlModel.convertToCLibraryFunctions(): List<NativeModel.Function> = functions
    .map {
        NativeModel.Function(
            it.name.convertToKotlinFunctionName(),
            it.returns.let { it?.type }.toCType(it.returns?.pointer != null, it.returns?.pointer == "mutable"),
            convertToCFunctionArgs(it.args, it.callback)
        )
    } + objects.flatMap { reference ->
    (listOf(
        YamlModel.Function("release", "")
    ) + reference.methods)
        .map {
            val name = "${reference.name}_${it.name}".convertToKotlinFunctionName()
            val args = listOf(YamlModel.Function.Arg("handler", "", "object.${reference.name}")) + it.args
            NativeModel.Function(
                name,
                it.returns.let { it?.type }.toCType(it.returns?.pointer != null, it.returns?.pointer == "mutable"),
                convertToCFunctionArgs(args, it.callback) + it.returns_async.injectCallbackVariable("${reference.name}_${it.name}")
            )
        }
}

private fun List<YamlModel.Function.Arg>?.injectCallbackVariable(name: String): List<Pair<String, Type>> {
    return if (this != null ) {
        listOf(
            "callback" to NativeModel.Reference.Callback(name.convertToKotlinCallbackName()),
            "userdata" to NativeModel.Reference.OpaquePointer,
        )
    } else emptyList()
}


private fun convertToCFunctionArgs(args: List<YamlModel.Function.Arg>, callback: String?): List<Pair<String, Type>> {
    return args.flatMap { arg ->
        (arg.name.convertToKotlinVariableName() to arg.type.toCType(
            arg.pointer != null,
            arg.pointer == "mutable"
        )).let {
            when (it.second) {
                is NativeModel.Array -> listOf(
                    it.generateArrayCounter(),
                    it
                )

                else -> listOf(it)
            }
        }
    } + callback.injectCallbackInfoStructure()
}


private fun String?.injectCallbackInfoStructure(): List<Pair<String, Type>> = when {
    this != null -> listOf("callbackInfo" to NativeModel.Reference.StructureField(split(".")[1].convertToKotlinCallbackStructureName()))
    else -> emptyList()
}

private fun Pair<String, NativeModel.Type>.generateArrayCounter() = let { (name, _) ->
    val newName = when {
        name.endsWith("ies") -> name.removeSuffix("ies") + "yCount"
        else -> name.removeSuffix("s") + "Count"
    }
    newName to NativeModel.Primitive.UInt64
}