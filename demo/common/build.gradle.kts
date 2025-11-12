import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-multiplatform`
    id("com.android.library")
}

val os = DefaultNativePlatform.getCurrentOperatingSystem()

kotlin {

    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_24
        }
    }

    if (os.isMacOsX) {
        macosArm64()
        macosX64()
        iosX64()
        iosArm64()
        iosSimulatorArm64()
    }
    linuxArm64()
    linuxX64()
    mingwX64()

    listOf(
        androidNativeArm64() to "arm64-v8a",
        androidNativeX64() to "x86_64"
    ).forEach { (target, androidArch) ->
        target.binaries {
            sharedLib {
                baseName = "wgpu4k-demo"
            }
        }

        target.binaries.all {
            linkTaskProvider.configure {
                doLast {
                    val sourceFile = outputFile.get()
                    val destDir = project.layout.buildDirectory.dir("androidJniLibs/$androidArch").get().asFile
                    destDir.mkdirs()
                    val destFile = File(destDir, sourceFile.name)
                    sourceFile.copyTo(destFile, overwrite = true)
                }
            }
        }
    }

    androidTarget {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_17
        }

        android {
            namespace = "io.ygdrasil.wgpu.app.common"
            compileSdk = 36

            defaultConfig {
                minSdk = 28
            }

        }
    }

    sourceSets {

        all {
            languageSettings.optIn("kotlin.ExperimentalStdlibApi")
            languageSettings.optIn("kotlin.ExperimentalUnsignedTypes")
            languageSettings.optIn("kotlin.js.ExperimentalJsExport")
        }

        val commonMain by getting {
            dependencies {
                api(projects.wgpu4kNative)
            }
        }

    }

    @OptIn(ExperimentalKotlinGradlePluginApi::class)
    compilerOptions {
        allWarningsAsErrors = true
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

