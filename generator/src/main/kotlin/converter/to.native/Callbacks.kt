package converter.to.native

import domain.NativeModel
import domain.YamlModel
import domain.toCType
import convertToKotlinCallbackName
import convertToKotlinVariableName

internal fun YamlModel.convertCallbacks() = convertCallbacksFromV23() + function_types.map {
    NativeModel.Callback(
        it.name.convertToKotlinCallbackName(),
        it.args.map {
            it.name.convertToKotlinVariableName() to it.type.toCType(
                it.pointer != null,
                it.pointer == "mutable"
            )
        }
    )
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