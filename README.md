# wgpu4k native : a Kotlin binding of wgpu library

[![Tests](https://github.com/wgpu4k/wgpu4k-native/actions/workflows/test.yml/badge.svg?branch=main)](https://github.com/wgpu4k/wgpu4k-native/actions/workflows/test.yml)
![Static Badge](https://img.shields.io/badge/Status-Stable-green?style=plastic)
![Static Badge](https://img.shields.io/badge/Latest%20version-v22.0.2-green?style=plastic)
[![Static Badge](https://img.shields.io/badge/Licence-MIT-blue?style=plastic)](https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FMIT_License)
[![Static Badge](https://img.shields.io/badge/Discord-wgpu4k-purple?style=plastic)](https://discord.gg/qy9KQAP9Kc)

## About
This project is a WebGPU binding compatible with Desktop and Mobile. 

If you are looking for an experience that also covers the web, you can use the [wgpu4k](https://github.com/wgpu4k/wgpu4k) project.

This library uses the Firefox backend written in Rust, [available here](https://github.com/gfx-rs/wgpu-native).

## How to Run the demo

1. On JVM: `./gradlew demo:desktop-and-ios:runJvm`
4. On native Macos or Linux: `./gradlew demo:desktop-and-ios:runDebugExecutable`
5. On Android, run the subproject `android` with android studio !
6. On iOS `./gradlew demo:desktop-and-ios:assembleWgpuAppXCFramework` to build the XC Framework, then you can run the subproject `iosApp` (on demo/desktop-and-ios folder) with XCode on a iOS simulator or real device.


## How to use

[View the API reference](https://wgpu4k.github.io/wgpu4k-native/)

From a basic multiplatform project, create a common native source set and add the library:

``` kotlin
private val hierarchyTemplate = KotlinHierarchyTemplate {
    /* natural hierarchy is only applied to default 'main'/'test' compilations (by default) */
    withSourceSetTree(KotlinSourceSetTree.main, KotlinSourceSetTree.test)

    common {
        /* All compilations shall be added to the common group by default */
        withCompilations { true }

        group("commonNative") {
            group("native") {
                withNative()

                group("apple") {
                    withApple()

                    group("ios") {
                        withIos()
                    }

                    group("tvos") {
                        withTvos()
                    }

                    group("watchos") {
                        withWatchos()
                    }

                    group("macos") {
                        withMacos()
                    }
                }

                group("linux") {
                    withLinux()
                }

                group("mingw") {
                    withMingw()
                }

            }

            withJvm()
            withAndroidTarget()
        }
    }
}

kotlin {
    ...
    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_22
        }
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()
    macosArm64()
    macosX64()
    linuxArm64()
    linuxX64()
    mingwX64()

    androidTarget {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_22
        }

        publishLibraryVariants("release", "debug")
    }

    applyHierarchyTemplate(hierarchyTemplate)

    sourceSets {
    
        ...
        val commonNativeMain by getting {
            dependencies { api("io.ygdrasil:wgpu4k-native:<library version>) }
        }
        ...
        
    }
    ...
}
