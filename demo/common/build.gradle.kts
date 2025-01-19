import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    id(libs.plugins.kotlin.multiplatform.get().pluginId)
    id("com.android.library")
}

kotlin {



    jvm()

    macosArm64()
    macosX64()
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
        languageVersion.set(JavaLanguageVersion.of(22))
    }
}

android {
    namespace = "io.ygdrasil.wgpu4k"
    compileSdk = 35

    defaultConfig {
        minSdk = 28
    }

}
