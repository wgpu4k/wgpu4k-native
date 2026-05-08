package domain

import com.charleskorn.kaml.YamlList
import com.charleskorn.kaml.YamlNode
import com.charleskorn.kaml.YamlNull
import com.charleskorn.kaml.yamlMap
import com.charleskorn.kaml.yamlScalar
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

@Serializable
data class YamlModel(
    val copyright: String,
    val name: String,
    val enum_prefix: String,
    val doc: String? = null,
    val constants: List<Constant>,
    val typedefs: List<Typedef>,
    val bitflags: List<Bitflag>,
    val structs: List<Struct>,
    val functions: List<Function>,
    val objects: List<Object>? = null,
    val enums: List<Enum>,
    // Used on v22
    val function_types: List<FunctionType> = listOf(),
    // Used on v23
    val callbacks: List<Callback> = listOf(),
) {
    fun merge(loadExtraYaml: YamlModel): YamlModel {
        return YamlModel(
            copyright = this.copyright,
            name = this.name,
            enum_prefix = this.enum_prefix,
            constants = (this.constants + loadExtraYaml.constants).distinctBy { it.name },
            typedefs = (this.typedefs + loadExtraYaml.typedefs).distinct(),
            enums = (this.enums + loadExtraYaml.enums).distinctBy { it.name },
            bitflags = (this.bitflags + loadExtraYaml.bitflags).distinctBy { it.name },
            structs = (this.structs + loadExtraYaml.structs).distinctBy { it.name },
            callbacks = (this.callbacks + loadExtraYaml.callbacks).distinctBy { it.name },
            functions = (this.functions + loadExtraYaml.functions).distinctBy { it.name },
            objects = (this.objects.orEmpty() + loadExtraYaml.objects.orEmpty()).distinctBy { it.name },
            function_types = (this.function_types + loadExtraYaml.function_types).distinctBy { it.name },
        )
    }

    @Serializable
    data class Object(
        val name: String,
        val doc: String,
        val methods: List<Function>,
    )

    @Serializable
    data class Function(
        val name: String,
        val doc: String,
        val args: List<Arg> = listOf(),
        val returns_async: List<Arg>? = null,
        val returns: Return? = null,
        val callback: String? = null,
    ) {
        @Serializable
        data class Return(
            val type: String,
            val doc: String? = null,
            val passed_with_ownership: Boolean = false,
            val pointer: String? = null,
            val optional: Boolean = false,
        ) {
            val isMutable: Boolean
                get() = passed_with_ownership || pointer == "mutable"
        }

        @Serializable
        data class Arg(
            val name: String,
            val doc: String? = null,
            val type: String,
            val pointer: String? = null,
            val optional: Boolean = false,
            val passed_with_ownership: Boolean? = null,
            val array: Boolean = false,
        )
    }

    @Serializable
    data class FunctionType(
        val name: String,
        val doc: String? = null,
        var args: List<Arg>
    ) {
        @Serializable
        data class Arg(
            val name: String,
            val doc: String? = null,
            val type: String,
            val pointer: String? = null,
            val array: Boolean = false,
        )
    }

    /**
     * Model v23
     */
    @Serializable
    data class Callback(
        val name: String,
        val doc: String,
        val style: String? = null,
        val args: List<Arg>,
    ) {
        @Serializable
        data class Arg(
            val name: String,
            val doc: String? = null,
            val type: String,
            val pointer: String? = null,
            val passed_with_ownership: Boolean? = null,
        )
    }

    @Serializable
    data class Struct(
        val name: String,
        val doc: String? = null,
        val type: String? = null,
        val members: List<Member> = listOf(),
        val free_members: Boolean = false,
        val extends: List<String> = listOf()
    ) {
        @Serializable
        data class Member(
            val name: String,
            val doc: String? = null,
            val type: String,
            val optional: Boolean = false,
            val pointer: String? = null,
            val default: String? = null,
            val array: Boolean = false,
            val members: List<Member>? = null
        )
    }

    @Serializable
    data class Bitflag(
        val name: String,
        val doc: String,
        val entries: List<Entry>,
    ) {
        @Serializable
        data class Entry(
            val name: String,
            val doc: String? = null,
            val value_combination: List<String>? = null,
            val value: Int? = null,
        )
    }

    @Serializable
    data class Constant(
        val name: String,
        val value: String,
        val doc: String
    )

    @Serializable
    data class Typedef(
        val name: String,
        val type: String,
    )

    @Serializable
    data class Enum(
        val name: String,
        val doc: String? = null,
        val entries: List<Entry?>,
    ) {

        @Serializable
        data class Entry(
            val name: String,
            val doc: String? = null,
            val value: Int? = null,
        )
    }
}

fun String?.actualDoc(): String? = this?.trim()
    ?.takeIf { it != "TODO" }
    ?.takeIf { it.isNotBlank() }
    ?.convertFunctionReferenceToDokka()
    ?.convertReferenceToDokka()

private fun String.convertFunctionReferenceToDokka(): String {
    val regex = Regex("`::(.*?)`")
    return replace(regex) { matchResult ->
        val content = matchResult.groupValues[1]
        "[$content]"
    }
}

private fun String.convertReferenceToDokka(): String {
    val regex = Regex("`(.*?)`")
    return replace(regex) { matchResult ->
        val content = matchResult.groupValues[1]
        "[$content]"
    }
}

