package converter.to.native

import convertToKotlinCallbackName
import convertToKotlinVariableName
import domain.NativeModel
import domain.YamlModel
import domain.toCType

internal fun YamlModel.convertCallbacks() = convertCallbacksFromV23() + convertCallbacksFromV22()

private fun YamlModel.convertCallbacksFromV22() = function_types.map {
    NativeModel.Callback(
        it.name.convertToKotlinCallbackName(),
        it.args.map {
            it.name.convertToKotlinVariableName() to it.type.toCType(
                it.pointer != null,
                it.pointer == "mutable"
            )
        }
    )
} + objects.flatMap { gpuObject ->
    gpuObject.methods.filter { it.returns_async != null }.map {
        NativeModel.Callback(
            "${gpuObject.name}_${it.name}".convertToKotlinCallbackName(),
            it.returns_async!!.map {
                it.name.convertToKotlinVariableName() to it.type.toCType(
                    it.pointer != null,
                    it.pointer == "mutable"
                )
            }
        )
    }
}

private fun YamlModel.convertCallbacksFromV23() = callbacks.map {
    NativeModel.Callback(
        it.name.convertToKotlinCallbackName(),
        it.args.map {
            it.name.convertToKotlinVariableName() to it.type.toCType(
                it.pointer != null,
                it.pointer == "mutable"
            )
        } +
                listOf(
                    "userdata1" to NativeModel.Reference.OpaquePointer,
                    "userdata2" to NativeModel.Reference.OpaquePointer
                )
    )
}