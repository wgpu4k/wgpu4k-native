package converter.to.native

import convertToKotlinCallbackName
import convertToKotlinCallbackStructureName
import convertToKotlinFunctionName
import convertToKotlinVariableName
import domain.FunctionArgument
import domain.FunctionReturnType
import domain.NativeModel
import domain.YamlModel
import domain.actualDoc
import domain.toCType

internal fun YamlModel.convertToCLibraryFunctions(): List<NativeModel.Function> = functions
    .map {
        NativeModel.Function(
            it.name.convertToKotlinFunctionName(),
            FunctionReturnType(it.returns.let { it?.type }.toCType(it.returns?.pointer != null, it.returns?.pointer == "mutable"), it.returns?.doc?.actualDoc()),
            convertToCFunctionArgs(it.args, it.callback),
            it.doc.actualDoc()
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
                FunctionReturnType(it.returns.let { it?.type }.toCType(it.returns?.pointer != null, it.returns?.pointer == "mutable"), it.returns?.doc?.actualDoc()),
                convertToCFunctionArgs(
                    args,
                    it.callback
                ) + it.returns_async.injectCallbackVariable("${reference.name}_${it.name}"),
                it.doc.actualDoc()
            )
        }
}

private fun List<YamlModel.Function.Arg>?.injectCallbackVariable(name: String): List<FunctionArgument> {
    return if (this != null) {
        listOf(
            FunctionArgument("callback", NativeModel.Reference.Callback(name.convertToKotlinCallbackName()), null),
            FunctionArgument("userdata", NativeModel.Reference.OpaquePointer, null),
        )
    } else emptyList()
}


private fun convertToCFunctionArgs(args: List<YamlModel.Function.Arg>, callback: String?): List<FunctionArgument> {
    return args.flatMap { arg ->
        FunctionArgument(
            arg.name.convertToKotlinVariableName(),
            arg.type.toCType(
                arg.pointer != null,
                arg.pointer == "mutable",
                arg.optional
            ),
            arg.doc.actualDoc()
        ).let {
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


private fun String?.injectCallbackInfoStructure(): List<FunctionArgument> = when {
    this != null -> listOf(
        FunctionArgument(
            "callbackInfo",
            NativeModel.Reference.StructureField(
                split(".")[1].convertToKotlinCallbackStructureName(),
                false
            ),
            null
        )
    )

    else -> emptyList()
}

private fun FunctionArgument.generateArrayCounter(): FunctionArgument = let { (name, _) ->
    val newName = when {
        name.endsWith("ies") -> name.removeSuffix("ies") + "yCount"
        else -> name.removeSuffix("s") + "Count"
    }
    FunctionArgument(newName, NativeModel.Primitive.UInt64, "number of elements in the array [$name]")
}