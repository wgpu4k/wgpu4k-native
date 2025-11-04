import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform

plugins {
    id(libs.plugins.kotlin.multiplatform.get().pluginId)
    `binary-compatibility-validator` apply false
    id("com.android.library")
}

val os = DefaultNativePlatform.getCurrentOperatingSystem()

kotlin {

    jvm()

    if (os.isMacOsX) {
        macosArm64()
        macosX64()
        iosX64()
        iosArm64()
        iosSimulatorArm64()
    }
    linuxArm64()
    linuxX64()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    mingwX64()
    androidTarget()

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

android {
    namespace = "io.ygdrasil.wgpu4k"
    compileSdk = 36

    defaultConfig {
        minSdk = 28
    }

}
