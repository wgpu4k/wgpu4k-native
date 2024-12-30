package converter

import convertToEnumValueName
import convertToKotlinCallbackName
import convertToKotlinCallbackStructureName
import convertToKotlinClassName
import convertToKotlinFunctionName
import convertToKotlinVariableName
import domain.NativeModel
import domain.NativeModel.Type
import domain.Version
import domain.YamlModel
import domain.toCType
import converter.to.native.convertCallbacks

internal fun YamlModel.toNativeModel(version: Version): NativeModel {
    val pointers = convertToPointer()
    val functions = convertToCLibraryFunctions()
    val enumerations = convertToCLibraryEnumerations()
    val structures = generateCLibraryStructures()
        .calculateSizeAndPadding()
    val callbacks = convertCallbacks()

    return NativeModel(pointers, functions, enumerations, structures, callbacks)
}


private fun YamlModel.generateCLibraryStructures() = structs.map {
    val members = when {
        it.type == "base_in" -> listOf(
            YamlModel.Struct.Member(
                "nextInChain",
                "",
                "c_void",
                true,
                "mutable"
            )
        ) + it.members

        it.type == "extension_in" -> listOf(YamlModel.Struct.Member("chain", "", "struct.chained_struct")) + it.members
        it.type == "base_out" || it.type == "base_in_or_out" -> listOf(
            YamlModel.Struct.Member(
                "nextInChain",
                "",
                "c_void",
                true,
                "mutable"
            )
        ) + it.members

        it.type == "standalone" -> it.members
        else -> error("unsuported type ${it.type}")
    }

    NativeModel.Structure(
        it.name.convertToKotlinClassName(),
        members.flatMap {
            NativeModel.StructureField(
                it.name.convertToKotlinVariableName(),
                it.type.toCType(it.pointer != null, it.pointer == "mutable"),
                if (it.type.toCType(it.pointer != null, it.pointer == "mutable") is NativeModel.Array ||
                    (it.type.toCType(it.pointer != null, it.pointer == "mutable") is NativeModel.Reference &&
                            it.type.toCType(
                                it.pointer != null,
                                it.pointer == "mutable"
                            ) !is NativeModel.Reference.Enumeration &&
                            it.type.toCType(
                                it.pointer != null,
                                it.pointer == "mutable"
                            ) !is NativeModel.Reference.StructureField)
                ) "?" else ""
            ).let {
                when (it.type) {
                    is NativeModel.Array -> listOf(
                        it.generateArrayCounter(),
                        it
                    )

                    else -> listOf(it)
                }
            }
        }
    )
} + listOf(
    NativeModel.Structure(
        "WGPUChainedStruct", listOf(
            NativeModel.StructureField("next", NativeModel.Reference.Structure("WGPUChainedStruct"), "?"),
            NativeModel.StructureField("sType", NativeModel.Reference.Enumeration("WGPUSType"), "")
        )
    ),
    NativeModel.Structure(
        "WGPUChainedStructOut", listOf(
            NativeModel.StructureField("next", NativeModel.Reference.Structure("WGPUChainedStructOut"), "?"),
            NativeModel.StructureField("sType", NativeModel.Reference.Enumeration("WGPUSType"), "")
        )
    ),
    NativeModel.Structure(
        "WGPUStringView", listOf(
            NativeModel.StructureField("data", NativeModel.Reference.CString, "?"),
            NativeModel.StructureField("length", NativeModel.Primitive.UInt64, "")
        )
    )
) + callbacks.map {
    val name = it.name.convertToKotlinCallbackStructureName()
    when (it.style) {
        "callback_mode" -> NativeModel.Structure(
            name, listOf(
                NativeModel.StructureField("nextInChain", NativeModel.Reference.Structure("WGPUChainedStruct"), "?"),
                NativeModel.StructureField("mode", NativeModel.Reference.Enumeration("WGPUCallbackMode"), ""),
                NativeModel.StructureField("callback", NativeModel.Reference.Callback(it.name.convertToKotlinCallbackName()), "?"),
                NativeModel.StructureField("userdata1", NativeModel.Reference.OpaquePointer, "?"),
                NativeModel.StructureField("userdata2", NativeModel.Reference.OpaquePointer, "?")
            )
        )
        else -> NativeModel.Structure(
            name, listOf(
                NativeModel.StructureField("nextInChain", NativeModel.Reference.Structure("WGPUChainedStruct"), "?"),
                NativeModel.StructureField("callback", NativeModel.Reference.Callback(it.name.convertToKotlinCallbackName()), "?"),
                NativeModel.StructureField("userdata1", NativeModel.Reference.OpaquePointer, "?"),
                NativeModel.StructureField("userdata2", NativeModel.Reference.OpaquePointer, "?")
            )
        )
    }
}

private fun YamlModel.convertToCLibraryEnumerations() =
    enums.map {
        NativeModel.Enumeration(it.name.convertToKotlinClassName(), it.values.convertEnumToEnumValues(it.values.getBaseValue()))
    } + bitflags.map {
        NativeModel.Enumeration(it.name.convertToKotlinClassName(), it.entries.convertToEnumValues(it.entries), 64)
    }

private fun List<YamlModel.Enum.Entry>.getBaseValue(): Int {
    return if (isNotEmpty() && first().name == "undefined") 0 else 1
}

private fun List<YamlModel.Bitflag.Entry>.convertToEnumValues(entries: List<YamlModel.Bitflag.Entry>): List<Pair<String, Int>> = mapIndexed { index, entry ->
    // Calculate first if that a combination
    val value = entry.value_combination?.sumOf { subPart -> indexToFlagValue(entries.indexOfFirst { it.name == subPart }) }
        ?: indexToFlagValue(index)
    entry.name.convertToEnumValueName() to value
}

private fun indexToFlagValue(base: Int): Int = if (base == 0) 0 else 1 shl (base - 1)

private fun List<YamlModel.Enum.Entry>.convertEnumToEnumValues(baseValue: Int): List<Pair<String, Int>> = mapIndexed { index, entry ->
    entry.name.convertToEnumValueName() to (entry.value ?: (index + baseValue))
}


private fun YamlModel.convertToCLibraryFunctions(): List<NativeModel.Function> = functions
    // TODO Skip until added to binding
    .filter { it.name != "get_instance_features" }
    .map {
        NativeModel.Function(
            it.name.convertToKotlinFunctionName(),
            it.returns.let { it?.type }.toCType(it.returns?.pointer != null, it.returns?.pointer == "mutable"),
            // Uncomnent when success to handle structure filed
            /*if (it.callback != null) CLibraryModel.Reference.StructureField("WGPUFuture") else it.returns.let { it?.type }
                .toCType(it.returns?.pointer != null),*/
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
                // Uncomnent when success to handle structure filed
                /*if (it.callback != null) CLibraryModel.Reference.StructureField("WGPUFuture") else it.returns.let { it?.type }
                    .toCType(it.returns?.pointer != null),*/
                convertToCFunctionArgs(args, it.callback)
            )
        }
}

fun convertToCFunctionArgs(args: List<YamlModel.Function.Arg>, callback: String?): List<Pair<String, Type>> {
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

private fun YamlModel.convertToPointer(): List<NativeModel.Pointer> {
    val pointers = objects.map { it.name.convertToKotlinClassName() }
        .map { NativeModel.Pointer(it) }
    return pointers
}

private fun NativeModel.StructureField.generateArrayCounter() = let { (name, _, _) ->
    val newName = when {
        name.endsWith("ies") -> name.removeSuffix("ies") + "yCount"
        else -> name.removeSuffix("s") + "Count"
    }
    NativeModel.StructureField(newName, NativeModel.Primitive.UInt64, "")
}

private fun Pair<String, NativeModel.Type>.generateArrayCounter() = let { (name, _) ->
    val newName = when {
        name.endsWith("ies") -> name.removeSuffix("ies") + "yCount"
        else -> name.removeSuffix("s") + "Count"
    }
    newName to NativeModel.Primitive.UInt64
}


data class Field(val name: String, val size: Int, val alignment: Int)

fun main() {

    val fields = listOf(
        Field("a", 8, 8),  // char a (1 byte, alignment 1)
        Field("b", 4, 4),  // int b (4 bytes, alignment 4)
        Field("c", 1, 1)   // char c (1 byte, alignment 1)
    )

    calculatePadding(fields)
}

fun calculatePadding(fields: List<Field>) {
    var offset = 0
    var totalSize = 0

    println("Field\tOffset\tPadding")

    for (field in fields) {
        // Adjust offset to align with field's alignment
        val alignmentOffset = (field.alignment - (offset % field.alignment)) % field.alignment
        offset += alignmentOffset

        println("${field.name}\t$offset\t$alignmentOffset")

        offset += field.size
        totalSize += field.size + alignmentOffset
    }

    // Align the total size to the largest alignment in the structure
    val largestAlignment = fields.maxOf { it.alignment }
    val finalPadding = (largestAlignment - (totalSize % largestAlignment)) % largestAlignment
    totalSize += finalPadding

    println("Total size (with padding): $totalSize")
    println("Final padding: $finalPadding")
}