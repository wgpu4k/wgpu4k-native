# WebGPU Binding Generation - wgpu4k-native

This document explains the automatic Kotlin binding generation process for the native WebGPU API.

## Overview

The **wgpu4k-native** project uses a code generation system to automatically produce Kotlin bindings from the official WebGPU API specifications. This allows maintaining perfect compatibility with recent WebGPU versions while providing an idiomatic Kotlin API.

## Generator Architecture

The generator is organized into several modules:

```
wgpu4k-native/
├── generator/              # Gradle module containing the generator
│   └── src/main/kotlin/
│       ├── generate.kt      # Entry point for generation
│       ├── Paths.kt         # File path management
│       ├── Domain.kt        # Utility transformation functions
│       └── generator/        # Platform-specific generators
│           ├── callback/     # Callback generation
│           ├── function/    # Function generation
│           └── structure/    # Structure generation
├── wgpu4k-native-specs/    # Module containing specifications
│   └── src/jvmMain/resources/
│       ├── webgpu.yml       # YAML specification of WebGPU API
│       ├── extra.yml        # Extensions and specific modifications
│       ├── webgpu.h         # Official C header
│       └── wgpu.h           # Alternative C header
└── wgpu4k-native/          # Target module
    └── src/                 # Generated code (DO NOT edit manually)
```

## Specification Source Files

### `webgpu.yml`
Main YAML file containing the complete WebGPU API description:
- **Structures**: C structure definitions (e.g., `WGPUBufferDescriptor`, `WGPUInstanceDescriptor`)
- **Enumerations**: Enumerated values (e.g., `WGPUTextureFormat`, `WGPUBufferUsage`)
- **Functions**: Native API function declarations
- **Callbacks**: Callback type definitions

### `extra.yml`
Supplementary file providing:
- Modifications to existing structures
- Additional properties not present in the standard specification
- Kotlin-specific adaptations

## Generation Process

### 1. Loading Specifications

The entry point is the Gradle task `generateBinding` defined in:
```
generator/src/main/kotlin/generator.gradle.kts
```

This task calls the `generate()` function in `generate.kt` with the appropriate paths.

```kotlin
// generator/src/main/kotlin/generator.gradle.kts
tasks.register("generateBinding") {
    group = "build"
    doLast {
        Paths(
            project(":wgpu4k-native").projectDir,
            project(":wgpu4k-native-specs").projectDir
        ).let { generate(it) }
    }
}
```

### 2. Parsing and Merging Specifications

```kotlin
// In generate.kt
val webgpuCModel = path.specs.loadWebGPUYaml()
    .merge(path.specs.loadExtraYaml())
    .toNativeModel()
```

- `loadWebGPUYaml()`: Loads and parses `webgpu.yml`
- `loadExtraYaml()`: Loads and parses `extra.yml`
- `merge()`: Merges both specifications (extra.yml overrides/extends webgpu.yml)
- `toNativeModel()`: Converts the YAML model to a Kotlin model usable by generators

### 3. Code Generation per Platform

Code is generated for **4 distinct platforms**:

| Platform | Output Path | Usage |
|----------|-------------|-------|
| **Common** | `wgpu4k-native/src/commonMain/kotlin` | Shared code (Multiplatform) |
| **JVM** | `wgpu4k-native/src/jvmMain/kotlin` | JVM-specific (via JNA) |
| **Native** | `wgpu4k-native/src/nativeMain/kotlin` | Kotlin/Native (C interop) |
| **Android** | `wgpu4k-native/src/androidMain/kotlin` | Android-specific (via JNA) |

#### Generated Code per Platform

**For each platform, generators produce:**

```kotlin
// Base types
generateCommonTypes(webgpuCModel.pointers)

// Callbacks
generateCommonCallback(webgpuCModel.callbacks)      // Common
generateJvmCallback(webgpuCModel.callbacks)          // JVM
generateNativeCallback(webgpuCModel.callbacks)      // Native
generateAndroidCallback(webgpuCModel.callbacks)    // Android

// Enumerations
generateCommonEnumerations(webgpuCModel.enumerations)

// Functions
generateCommonFunctions(webgpuCModel.functions)      // Common
generateJvmFunctions(webgpuCModel.functions)          // JVM
generateJvmNativeFunctions(webgpuCModel.functions)   // JVM (native via JNA)
generateNativeFunctions(webgpuCModel.functions)      // Native
generateAndroidFunctions(webgpuCModel.functions)    // Android
generateAndroidNativeFunctions(webgpuCModel.functions) // Android (native)

// Structures
generateCommonStructures(webgpuCModel.structures)   // Common
generateJvmStructures(webgpuCModel.structures)       // JVM
generateNativeStructures(webgpuCModel.structures)   // Native
generateAndroidStructures(webgpuCModel.structures)  // Android
```

### 4. Generation Templates

Each code type (functions, structures, callbacks) has specific templates for each platform:

```
generator/src/main/kotlin/generator/
├── callback/
│   ├── common.template.kt    # Callback templates for Common
│   ├── jvm.template.kt       # Callback templates for JVM (JNA)
│   ├── native.template.kt    # Callback templates for Native
│   └── jna.template.kt       # Callback templates for Android JNA
├── function/
│   ├── android.template.kt
│   ├── jvm.template.kt
│   ├── jna.template.kt
│   └── native.template.kt
└── structure/
    ├── android.template.kt
    ├── jvm.template.kt
    ├── jna.template.kt
    └── native.template.kt
```

## Running the Generation

### Gradle Command

```bash
# Generate bindings
./gradlew :wgpu4k-native:generateBinding

# Generate and build the entire project
./gradlew build
```

### What the Command Does

1. **Downloads dependencies** if needed (via `fetch-native-dependencies`)
2. **Retrieves WebGPU headers** (`webgpu.h`, `wgpu.h`)
3. **Loads YAML specifications** from `wgpu4k-native-specs`
4. **Generates Kotlin code** in the correct directories
5. **Marks files** with the disclaimer: `// This file has been generated DO NOT EDIT !!!`

## Generated Code Structure

### Example: Generated Structure

A structure like `WGPUBufferDescriptor` in `webgpu.yml`:

```yaml
structs:
  BufferDescriptor:
    members:
      - name: label
        type: string
      - name: size
        type: uint64
      - name: usage
        type: bitflag.BufferUsage
      - name: mappedAtCreation
        type: bool
```

Becomes in Kotlin (Common version):

```kotlin
// This file has been generated DO NOT EDIT !!!
package io.ygdrasil.wgpu

import ffi.NativeAddress
import ffi.CallbackHolder

expect class WGPUBufferDescriptor {
    var label: String?
    var size: ULong
    var usage: WGPUBufferUsage
    var mappedAtCreation: Boolean
}
```

### Example: Generated Function

A function like `wgpuCreateBuffer` becomes:

**Native Version (C interop):**
```kotlin
fun wgpuCreateBuffer(
    device: Long,
    descriptor: WGPUBufferDescriptor?
): Long
```

**JVM Version (JNA):**
```kotlin
fun wgpuCreateBuffer(
    device: Pointer,
    descriptor: WGPUBufferDescriptor?
): Pointer
```

## Name Transformations

The generator applies systematic transformations:

| Type | Transformation | Example |
|------|---------------|---------|
| **Class names** | `snake_case` → `PascalCase` with `WGPU` prefix | `buffer_descriptor` → `WGPUBufferDescriptor` |
| **Function names** | `snake_case` → `camelCase` with `wgpu` prefix | `create_buffer` → `wgpuCreateBuffer` |
| **Variable names** | `snake_case` → `camelCase` | `mapped_at_creation` → `mappedAtCreation` |
| **Callbacks** | `_callback` suffix → `Callback` | `proc_callback` → `WGPUProcCallback` |
| **Enumerations** | `snake_case` → `UPPER_CASE` | `texture_usage_copy_src` → `TEXTURE_USAGE_COPY_SRC` |

See `Domain.kt` for implementations:
```kotlin
fun String.convertToKotlinClassName() = split("_")
    .map { it.replaceFirstChar { it.uppercase() } }
    .joinToString("")
    .let { "WGPU$it" }

fun String.convertToKotlinFunctionName() = split("_")
    .map { it.replaceFirstChar { it.uppercase() } }
    .joinToString("")
    .let { "wgpu$it" }
```

## C to Kotlin Type Mapping

C types are mapped to Kotlin types via the `toFunctionKotlinType()` function:

| C Type | Kotlin Type | Usage |
|--------|-------------|-------|
| `struct.*`, `array<*>`, `object.*`, `string` | `Long` | Pointers / structures (native) |
| `c_void` | `Unit` | Void |
| `enum.*`, `bool` | `UInt` | Enumerations and booleans |
| `float32` | `Float` | 32-bit float |
| `float64` | `Double` | 64-bit float |
| `int32` | `Int` | Signed 32-bit integer |
| `uint32` | `UInt` | Unsigned 32-bit integer |
| `int64`, `usize` | `Long` | 64-bit integer |
| `uint64`, `bitflag.*` | `ULong` | Unsigned 64-bit integer / Bitflags |

## Customization via `extra.yml`

The `extra.yml` file allows:

1. **Adding properties** to existing structures
2. **Modifying types** for specific cases
3. **Adding custom structures** not present in the official spec

Example extension in `extra.yml`:

```yaml
structs:
  ChainedStruct:
    members:
      - name: next
        type: struct.ChainedStruct*
      - name: nextInChain
        type: struct.ChainedStruct*
```

## Native Dependencies Management

Before generation, native headers and libraries are downloaded via the `fetch-native-dependencies` task defined in `wgpu4k-native/build.gradle.kts`.

Files are placed in:
- `wgpu4k-native/build/native/` - Headers and libraries for building
- `wgpu4k-native/build/generated/resources/` - Resources for JVM

## Generator Dependencies

The `generator` module depends on:
- **Kotlin DSL**: For Gradle integration
- **Kotlin Serialization**: For parsing YAML files
- **KAML**: YAML library for Kotlin

See `generator/build.gradle.kts`:
```kotlin
plugins {
    `kotlin-dsl`
    kotlin("plugin.serialization") version "2.2.0"
}

dependencies {
    implementation(libs.plugins.kotlin.multiplatform.asLibrary())
    implementation(libs.kaml)
}
```

## Best Practices

### ❌ DON'T

- **Manually edit** generated files in `wgpu4k-native/src/`
- **Directly modify** `webgpu.yml` (use `extra.yml` for extensions)
- **Remove** the disclaimer `// This file has been generated DO NOT EDIT !!!`

### ✅ DO

- **Update** `webgpu.yml` from the official WebGPU specification
- **Use** `extra.yml` for project-specific modifications
- **Verify** generation after modifying specs
- **Run** tests after generation

## Troubleshooting

### Problem: Generation Failed

```bash
# Check YAML parsing errors
./gradlew :wgpu4k-native:generateBinding --stacktrace
```

YAML parsing errors are usually due to:
- Invalid YAML syntax in `webgpu.yml` or `extra.yml`
- Unknown type not handled by `toFunctionKotlinType()`

### Problem: Missing Types

If a C type is not mapped correctly:
1. Check `Domain.kt` to add the mapping
2. Or modify `extra.yml` to use a supported type

### Problem: Files Not Generated

Verify that:
- Paths in `Paths.kt` are correct
- YAML specifications are loaded correctly
- Generators are called for each platform

## Complete Development Flow

```
┌─────────────────────────────────────────────────────────────┐
│                  WebGPU Specifications                        │
│              (webgpu.yml, extra.yml, headers)                 │
└───────────────────────────────┬───────────────────────────────┘
                                    │
                                    ▼
┌─────────────────────────────────────────────────────────────┐
│                    Gradle Task :generateBinding                │
│                   (generator.gradle.kts)                       │
└───────────────────────────────┬───────────────────────────────┘
                                    │
                                    ▼
┌─────────────────────────────────────────────────────────────┐
│                   generate() Function                          │
│                    (generate.kt)                               │
│  - Loads and merges YAMLs                                       │
│  - Converts to Kotlin model                                     │
│  - Calls platform-specific generators                          │
└───────────────────────────────┬───────────────────────────────┘
                                    │
          ┌─────────────────────────┬─────────────────────────┐
          ▼                         ▼                         ▼
┌───────────────────┐ ┌─────────────────┐ ┌─────────────────────┐
│   Generators       │ │  Generators     │ │   Generators       │
│   Common           │ │  JVM            │ │   Native & Android  │
│   (commonMain)     │ │  (jvmMain)      │ │   (nativeMain,      │
│                    │ │                 │ │    androidMain)     │
└─────────┬─────────┘ └─────────┬─────────┘ └──────────┬──────────┘
          │                     │                      │
          ▼                     ▼                      ▼
┌─────────────────────────────────────────────────────────────┐
│                 Generated Code in wgpu4k-native/src/            │
│  ┌──────────────┐ ┌──────────────┐ ┌────────────────┐      │
│  │ commonMain   │ │ jvmMain       │ │ nativeMain      │      │
│  │ androidMain  │ │               │ │ androidMain     │      │
│  └──────────────┘ └──────────────┘ └────────────────┘      │
└─────────────────────────────────────────────────────────────┘
                                    │
                                    ▼
┌─────────────────────────────────────────────────────────────┐
│                    Build & Tests                                │
└─────────────────────────────────────────────────────────────┘
```

## References

- [Official WebGPU Specification](https://gpuweb.github.io/gpuweb/)
- [wgpu-native Repository](https://github.com/gfx-rs/wgpu-native) (source of headers)
- [Kotlin Multiplatform](https://kotlinlang.org/docs/multiplatform-mobile-configure-project.html)
- [Kotlin/Native C Interop](https://kotlinlang.org/docs/native-c-interop.html)
- [JNA (Java Native Access)](https://github.com/java-native-access/jna)
