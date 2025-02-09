package converter.to.native

import domain.NativeModel
import domain.YamlModel
import domain.toCType
import convertToKotlinCallbackName
import convertToKotlinCallbackStructureName
import convertToKotlinClassName
import convertToKotlinVariableName
import domain.Version
import domain.actualDoc
import domain.mappingVersion

internal fun YamlModel.generateCLibraryStructures() = structs.map {
    val members = getMembers(it)
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
        },
        it.doc.actualDoc()
    )
} + listOf(
    NativeModel.Structure(
        "WGPUChainedStruct", listOf(
            NativeModel.StructureField("next", NativeModel.Reference.Structure("WGPUChainedStruct"), "?"),
            NativeModel.StructureField("sType", NativeModel.Reference.Enumeration("WGPUSType"), "")
        ),
        null
    ),
    NativeModel.Structure(
        "WGPUChainedStructOut", listOf(
            NativeModel.StructureField("next", NativeModel.Reference.Structure("WGPUChainedStructOut"), "?"),
            NativeModel.StructureField("sType", NativeModel.Reference.Enumeration("WGPUSType"), "")
        ),
        null
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
            ),
            null
        )
        else -> NativeModel.Structure(
            name, listOf(
                NativeModel.StructureField("nextInChain", NativeModel.Reference.Structure("WGPUChainedStruct"), "?"),
                NativeModel.StructureField("callback", NativeModel.Reference.Callback(it.name.convertToKotlinCallbackName()), "?"),
                NativeModel.StructureField("userdata1", NativeModel.Reference.OpaquePointer, "?"),
                NativeModel.StructureField("userdata2", NativeModel.Reference.OpaquePointer, "?")
            ),
            null
        )
    }
} + if (mappingVersion == Version.v23) listOf(
    NativeModel.Structure(
        "WGPUStringView", listOf(
            NativeModel.StructureField("data", NativeModel.Reference.CString, "?"),
            NativeModel.StructureField("length", NativeModel.Primitive.UInt64, "")
        ),
        null
    )
) else emptyList()

private fun getMembers(it: YamlModel.Struct) = when {
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


private fun NativeModel.StructureField.generateArrayCounter() = let { (name, _, _) ->
    val newName = when {
        name.endsWith("ies") -> name.removeSuffix("ies") + "yCount"
        else -> name.removeSuffix("s") + "Count"
    }
    NativeModel.StructureField(newName, NativeModel.Primitive.UInt64, "")
}