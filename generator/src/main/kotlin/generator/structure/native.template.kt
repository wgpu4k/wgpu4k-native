package generator.structure

import builder.Builder
import builder.templateBuilder
import converter.variableType
import domain.NativeModel
import domain.toFunctionKotlinType

internal fun NativeModel.Structure.toNativeStructure() = templateBuilder {
    val structureName = name
    appendBlock("actual interface $name") {

        toNativeImplementationByValue(this@toNativeStructure)
        toNativeImplementationByReference(this@toNativeStructure)
        newLine()
        members.forEach { (name, type, optional) ->
            appendLine("actual ${type.variableType()} $name: ${type.toFunctionKotlinType()}$optional")
        }
        appendLine("actual val handler: NativeAddress")
        newLine()
        appendBlock("actual companion object") {
            appendBlock("actual operator fun invoke(address: NativeAddress): $structureName") {
                appendLine("return ByReference(address)")
            }
            newLine()
            appendBlock("actual fun allocate(allocator: MemoryAllocator): $structureName") {
                appendLine("return allocator.allocate(sizeOf<webgpu.native.$structureName>())") {
                    appendLine(".let { $structureName(it) }")
                }
            }
            newLine()
            appendBlock("actual fun allocateArray(allocator: MemoryAllocator, size: UInt, provider: (UInt,  $structureName) -> Unit): ArrayHolder<$structureName>") {
                appendLine("return allocator.allocate(sizeOf<webgpu.native.$structureName>() * size.toLong())") {
                    appendBlock(".also") {
                        appendBlock("(0u until size).forEach", "index") {
                            appendLine("(it.rawValue + index.toLong() * sizeOf<webgpu.native.$structureName>())") {
                                appendLine(".let(::NativeAddress)")
                                appendLine(".let { $structureName(it) }")
                                appendLine(".let { provider(index, it) }")
                            }
                        }
                    }
                    appendLine(".let(::ArrayHolder)")
                }

            }
        }
        appendBlock("fun toCValue(): CValue<webgpu.native.$structureName>") {
            appendBlock("return cValue<webgpu.native.$structureName>") {
                members
                    .filter { (_, type, _) -> type is NativeModel.Reference.StructureField }
                    .forEach { (name, _, _) ->
                        appendLine("$name.adapt(this@$structureName.$name)")
                    }
                members
                    .filter { (_, type, _) -> type !is NativeModel.Reference.StructureField }
                    .forEach { (name, type, _) ->
                    val adapter = when (type) {
                        NativeModel.Reference.OpaquePointer -> "?.reinterpret()"
                        is NativeModel.Reference.Pointer,
                        is NativeModel.Reference.Structure,
                        NativeModel.Reference.CString,
                        is NativeModel.Reference.Callback,
                        is NativeModel.Array -> "?.handler?.reinterpret()"
                        NativeModel.Primitive.Bool -> ".toUInt()"
                        NativeModel.Primitive.Float32,
                        NativeModel.Primitive.Float64,
                        NativeModel.Primitive.Int32,
                        NativeModel.Primitive.Int64,
                        NativeModel.Primitive.UInt16,
                        NativeModel.Primitive.UInt32,
                        NativeModel.Primitive.UInt64,
                        is NativeModel.Reference.Enumeration -> ""
                        is NativeModel.Reference.StructureField,
                            NativeModel.Void -> error("$type is not allowed")
                    }
                    appendLine("$name = this@$structureName.$name$adapter")
                }
            }
        }
    }
    newLine()
    appendBlock("fun webgpu.native.$structureName.adapt(structure: $name)") {
        members
            .filter { (_, type, _) -> type is NativeModel.Reference.StructureField }
            .forEach { (name, _, _) ->
                appendLine("$name.adapt(structure.$name)")
            }
        members
            .filter { (_, type, _) -> type !is NativeModel.Reference.StructureField }
            .forEach { (name, type, _) ->
                val adapter = when (type) {
                    NativeModel.Reference.OpaquePointer -> "?.reinterpret()"
                    is NativeModel.Reference.Pointer,
                    is NativeModel.Reference.Structure,
                    NativeModel.Reference.CString,
                    is NativeModel.Reference.Callback,
                    is NativeModel.Array -> "?.handler?.reinterpret()"
                    NativeModel.Primitive.Bool -> ".toUInt()"
                    NativeModel.Primitive.Float32,
                    NativeModel.Primitive.Float64,
                    NativeModel.Primitive.Int32,
                    NativeModel.Primitive.Int64,
                    NativeModel.Primitive.UInt16,
                    NativeModel.Primitive.UInt32,
                    NativeModel.Primitive.UInt64,
                    is NativeModel.Reference.Enumeration -> ""
                    is NativeModel.Reference.StructureField,
                    NativeModel.Void -> error("$type is not allowed")
                }
                appendLine("$name = structure.$name$adapter")
            }
    }
    newLine()
}

private fun Builder.toNativeImplementationByValue(structure: NativeModel.Structure) {
    val structureName = structure.name
    appendBlock("value class ByValue(val handle: CValue<webgpu.native.$structureName>) : $structureName") {

        structure.members.forEach { (name, type, optional) ->
            val variableType = type.variableType()
            val nativeAccessor = "handle.useContents { "
            appendLine("override $variableType $name: ${type.toFunctionKotlinType()}$optional")
            // Getter
            when (type) {
                is NativeModel.Reference.OpaquePointer
                    -> "$nativeAccessor${name}?.let(::NativeAddress)"

                is NativeModel.Reference.Enumeration
                    -> "$nativeAccessor${name} ?: error(\"pointer of $structureName is null\")"

                is NativeModel.Primitive.Bool
                    -> "$nativeAccessor${name}.toBoolean() ?: error(\"pointer of $structureName is null\")"

                is NativeModel.Primitive
                    -> "$nativeAccessor${name} ?: error(\"pointer of $structureName is null\")"

                is NativeModel.Reference.CString
                    -> "$nativeAccessor${name}?.toCString()"

                is NativeModel.Reference.Pointer
                    -> "$nativeAccessor${name}" +
                        "?.let(::NativeAddress)" +
                        "?.let { ${type.name}(it) }"

                is NativeModel.Reference.StructureField
                    -> "$nativeAccessor${name}.rawPtr.toLong()" +
                        ".let(::NativeAddress)" +
                        ".let { ${type.name}(it) }"

                is NativeModel.Reference.Structure
                    -> "$nativeAccessor${name}" +
                        "?.let(::NativeAddress)" +
                        "?.let { ${type.name}(it) }"

                is NativeModel.Reference.Callback
                    -> "$nativeAccessor${name}" +
                        "?.let(::NativeAddress)" +
                        "?.let { CallbackHolder<${type.name}>(it) }"

                is NativeModel.Array
                    -> "$nativeAccessor${name}" +
                        "?.let(::NativeAddress)" +
                        "?.let { ArrayHolder<${type.subType.toFunctionKotlinType()}>(it) }"

                NativeModel.Void -> error("void is not allowed")
            }.let { appendLine("\tget() = $it }") }
            // Setter
            when (type) {
                is NativeModel.Reference.OpaquePointer
                    -> nativeAccessor +
                        "${name} = newValue?.reinterpret()"

                is NativeModel.Reference.Enumeration
                    -> nativeAccessor +
                        "${name} = newValue"

                is NativeModel.Reference.CString
                    -> nativeAccessor +
                        "${name} = newValue?.handler?.reinterpret()"

                is NativeModel.Primitive.Bool
                    -> nativeAccessor +
                        "${name} = newValue.toUInt()"

                is NativeModel.Primitive
                    -> nativeAccessor +
                        "${name} = newValue"

                is NativeModel.Reference.Pointer
                    -> nativeAccessor +
                        "${name} = newValue?.handler?.reinterpret()"

                is NativeModel.Reference.Structure
                    -> nativeAccessor +
                        "${name} = newValue?.handler?.reinterpret()"

                is NativeModel.Reference.Callback
                    -> nativeAccessor +
                        "${name} = newValue?.handler?.reinterpret()"

                is NativeModel.Array
                    -> nativeAccessor +
                        "${name} = newValue?.handler?.reinterpret()"

                is NativeModel.Reference.StructureField -> null

                NativeModel.Void -> error("void is not allowed")
            }?.let { appendLine("\tset(newValue) { $it } } \n") } ?: newLine()

        }
        appendLine("override val handler: NativeAddress")
        appendLine("\tget() = error(\"should not be call on CValue\")")
        newLine()
    }
}

private fun Builder.toNativeImplementationByReference(structure: NativeModel.Structure) {
    val structureName = structure.name
    appendBlock("value class ByReference(override val handler: NativeAddress) : $structureName") {

        structure.members.forEach { (name, type, optional) ->
            val variableType = type.variableType()
            val nativeAccessor = "handler.reinterpret<webgpu.native.$structureName>().pointed"
            appendLine("override $variableType $name: ${type.toFunctionKotlinType()}$optional")
            // Getter
            when (type) {
                is NativeModel.Reference.OpaquePointer
                    -> "$nativeAccessor.${name}?.let(::NativeAddress)"

                is NativeModel.Reference.Enumeration
                    -> "$nativeAccessor.${name} ?: error(\"pointer of $structureName is null\")"

                is NativeModel.Primitive.Bool
                    -> "$nativeAccessor.${name}.toBoolean() ?: error(\"pointer of $structureName is null\")"

                is NativeModel.Primitive
                    -> "$nativeAccessor.${name} ?: error(\"pointer of $structureName is null\")"

                is NativeModel.Reference.CString
                    -> "$nativeAccessor.${name}?.toCString()"

                is NativeModel.Reference.Pointer
                    -> "$nativeAccessor.${name}" +
                        "?.let(::NativeAddress)" +
                        "?.let { ${type.name}(it) }"

                is NativeModel.Reference.StructureField
                    -> "$nativeAccessor.${name}.rawPtr.toLong()" +
                        ".let(::NativeAddress)" +
                        ".let { ${type.name}(it) }"

                is NativeModel.Reference.Structure
                    -> "$nativeAccessor.${name}" +
                        "?.let(::NativeAddress)" +
                        "?.let { ${type.name}(it) }"

                is NativeModel.Reference.Callback
                    -> "$nativeAccessor.${name}" +
                        "?.let(::NativeAddress)" +
                        "?.let { CallbackHolder<${type.name}>(it) }"

                is NativeModel.Array
                    -> "$nativeAccessor.${name}" +
                        "?.let(::NativeAddress)" +
                        "?.let { ArrayHolder<${type.subType.toFunctionKotlinType()}>(it) }"

                NativeModel.Void -> error("void is not allowed")
            }.let { appendLine("\tget() = $it") }
            // Setter
            when (type) {
                is NativeModel.Reference.OpaquePointer
                    -> nativeAccessor +
                        ".let { it.${name} = newValue?.reinterpret() }"

                is NativeModel.Reference.Enumeration
                    -> nativeAccessor +
                        ".let { it.${name} = newValue }"

                is NativeModel.Reference.CString
                    -> nativeAccessor +
                        ".let { it.${name} = newValue?.handler?.reinterpret() }"

                is NativeModel.Primitive.Bool
                    -> nativeAccessor +
                        ".let { it.${name} = newValue.toUInt() }"

                is NativeModel.Primitive
                    -> nativeAccessor +
                        ".let { it.${name} = newValue }"

                is NativeModel.Reference.Pointer
                    -> nativeAccessor +
                        ".let { it.${name} = newValue?.handler?.reinterpret() }"

                is NativeModel.Reference.Structure
                    -> nativeAccessor +
                        ".let { it.${name} = newValue?.handler?.reinterpret() }"

                is NativeModel.Reference.Callback
                    -> nativeAccessor +
                        ".let { it.${name} = newValue?.handler?.reinterpret() }"

                is NativeModel.Array
                    -> nativeAccessor +
                        ".let { it.${name} = newValue?.handler?.reinterpret() }"

                is NativeModel.Reference.StructureField -> null

                NativeModel.Void -> error("void is not allowed")
            }?.let { appendLine("\tset(newValue) { $it } \n") } ?: newLine()
        }
    }
}
