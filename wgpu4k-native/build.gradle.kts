import com.android.build.gradle.internal.tasks.factory.dependsOn
import com.android.build.gradle.tasks.MergeSourceSetFolders
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.CInteropProcess
import java.nio.file.Files

plugins {
    id(libs.plugins.kotlin.multiplatform.get().pluginId)
    id("publish")
    id("com.android.library")
    alias(libs.plugins.kotest)
    id("generator")
}

val buildNativeResourcesDirectory = project.file("build").resolve("native")
val jvmLibResourcesDirectory = project.file("build").resolve("generated").resolve("resources")

kotlin {


    val nativeTargets = listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64(),
        macosArm64(),
        macosX64(),
        linuxArm64(),
        linuxX64(),
        mingwX64()
    )

    androidTarget {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_22
        }

        publishAllLibraryVariants()
    }

    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_22
        }
    }

    nativeTargets.forEach { target ->
        val main by target.compilations.getting {
            cinterops.create("webgpu") {
                packageName = "webgpu.native"
                header(buildNativeResourcesDirectory.resolve("wgpu.h"))
            }
        }
    }

    compilerOptions {
        //allWarningsAsErrors = true
        freeCompilerArgs.add("-Xexpect-actual-classes")
    }

    sourceSets {
        androidMain {
            dependencies {
                val jna = libs.jna.get()
                api("${jna.module.group}:${jna.module.name}:${jna.versionConstraint}:@aar")
            }
        }

        commonTest {
            dependencies {
                implementation(libs.bundles.kotest)
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        jvmMain {
            sourceSets {
                resources.srcDirs(jvmLibResourcesDirectory.absolutePath)
            }
        }

        jvmTest {
            dependencies {
                implementation(libs.kotest.runner.junit5)
                implementation(libs.kotlin.reflect)
            }
        }

        androidUnitTest {
            dependencies {
                implementation(libs.kotest.runner.junit5)
            }
        }
    }
}

android {
    namespace = "io.ygdrasil.nativeWgpu4k"
    compileSdk = 35

    defaultConfig {
        minSdk = 28
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_22
    }

    sourceSets {
        getByName("main") {
            jniLibs.srcDirs(jniBasePath().absolutePath)
        }
    }

    /*testOptions {
        unitTests.all {
            it.useJUnitPlatform()

        }
    }*/

}

configureDownloadTasks {
    baseUrl = "${project.properties["wgpu.base.url"]}${libs.versions.wgpu.get()}/"

    /*** Macos ***/
    download("wgpu-macos-aarch64-release.zip") {
        extract("wgpu-native-meta/webgpu.yml", buildNativeResourcesDirectory.resolve("webgpu.yml")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("wgpu-native-meta").resolve("webgpu.yml").toPath(),
                buildNativeResourcesDirectory.resolve("webgpu.yml").toPath()
            )
            buildNativeResourcesDirectory.resolve("wgpu-native-meta").deleteRecursively()
        }
        extract("include/webgpu/webgpu.h", buildNativeResourcesDirectory.resolve("webgpu.h")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("include").resolve("webgpu").resolve("webgpu.h").toPath(),
                buildNativeResourcesDirectory.resolve("webgpu.h").toPath()
            )
            buildNativeResourcesDirectory.resolve("include").deleteRecursively()
        }
        extract("include/wgpu/wgpu.h", buildNativeResourcesDirectory.resolve("wgpu.h")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("include").resolve("wgpu").resolve("wgpu.h").toPath(),
                buildNativeResourcesDirectory.resolve("wgpu.h").toPath()
            )
            buildNativeResourcesDirectory.resolve("include").deleteRecursively()
        }
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("darwin-aarch64").resolve("libWGPU.a"))
        extract("lib/libwgpu_native.dylib", jvmLibResourcesDirectory.resolve("darwin-aarch64").resolve("libWGPU.dylib")).doLast {
            val basePath = jvmLibResourcesDirectory.resolve("darwin-aarch64")
            Files.move(
                basePath.resolve("lib").resolve("libWGPU.dylib").toPath(),
                basePath.resolve("libWGPU.dylib").toPath()
            )
            basePath.resolve("lib").deleteRecursively()
        }
    }
    download("wgpu-macos-x86_64-release.zip") {
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("darwin-x64").resolve("libWGPU.a"))
        extract("lib/libwgpu_native.dylib", jvmLibResourcesDirectory.resolve("darwin-x86-64").resolve("libWGPU.dylib")).doLast {
            val basePath = jvmLibResourcesDirectory.resolve("darwin-x86-64")
            Files.move(
                basePath.resolve("lib").resolve("libWGPU.dylib").toPath(),
                basePath.resolve("libWGPU.dylib").toPath()
            )
            basePath.resolve("lib").deleteRecursively()
        }
    }

    /*** Windows ***/
    download("wgpu-windows-x86_64-gnu-release.zip") {
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("windows-x64").resolve("wgpu.a"))
    }
    download("wgpu-windows-x86_64-msvc-release.zip") {
        extract("lib/wgpu_native.lib", buildNativeResourcesDirectory.resolve("windows-x64").resolve("wgpu.lib"))
        extract("lib/wgpu_native.dll", jvmLibResourcesDirectory.resolve("win32-x86-64").resolve("WGPU.dll")).doLast {
            val basePath = jvmLibResourcesDirectory.resolve("win32-x86-64")
            Files.move(
                basePath.resolve("lib").resolve("WGPU.dll").toPath(),
                basePath.resolve("WGPU.dll").toPath()
            )
            basePath.resolve("lib").deleteRecursively()
        }
    }

    /*** Linux ***/
    download("wgpu-linux-x86_64-release.zip") {
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("linux-x64").resolve("libWGPU.a"))
        extract("lib/libwgpu_native.so", jvmLibResourcesDirectory.resolve("linux-x86-64").resolve("libWGPU.so")).doLast {
            val basePath = jvmLibResourcesDirectory.resolve("linux-x86-64")
            Files.move(
                basePath.resolve("lib").resolve("libWGPU.so").toPath(),
                basePath.resolve("libWGPU.so").toPath()
            )
            basePath.resolve("lib").deleteRecursively()
        }
    }
    download("wgpu-linux-aarch64-release.zip") {
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("linux-aarch64").resolve("libWGPU.a"))
        extract("lib/libwgpu_native.so", jvmLibResourcesDirectory.resolve("linux-aarch64").resolve("libWGPU.so")).doLast {
            val basePath = jvmLibResourcesDirectory.resolve("linux-aarch64")
            Files.move(
                basePath.resolve("lib").resolve("libWGPU.so").toPath(),
                basePath.resolve("libWGPU.so").toPath()
            )
            basePath.resolve("lib").deleteRecursively()
        }
    }

    /*** iOS ***/
    download("wgpu-ios-x86_64-simulator-release.zip") {
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("ios-simulator-x64").resolve("libWGPU.a"))
    }
    download("wgpu-ios-aarch64-simulator-release.zip") {
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("ios-simulator-aarch64").resolve("libWGPU.a"))
    }
    download("wgpu-ios-aarch64-release.zip") {
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("ios-aarch64").resolve("libWGPU.a"))
    }

    /*** Android ***/
    /**** Release ****/
    download("wgpu-android-x86_64-release.zip") {
        extract("lib/libwgpu_native.so", buildNativeResourcesDirectory.resolve("libs").resolve("x86_64").resolve("libwgpu4k.so")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("libs").resolve("x86_64").resolve("lib").resolve("libwgpu4k.so").toPath(),
                buildNativeResourcesDirectory.resolve("libs").resolve("x86_64").resolve("libwgpu4k.so").toPath()
            )
            buildNativeResourcesDirectory.resolve("libs").resolve("x86_64").resolve("lib").deleteRecursively()
        }
    }
    download("wgpu-android-aarch64-release.zip") {
        extract("lib/libwgpu_native.so", buildNativeResourcesDirectory.resolve("libs").resolve("arm64-v8a").resolve("libwgpu4k.so")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("libs").resolve("arm64-v8a").resolve("lib").resolve("libwgpu4k.so").toPath(),
                buildNativeResourcesDirectory.resolve("libs").resolve("arm64-v8a").resolve("libwgpu4k.so").toPath()
            )
            buildNativeResourcesDirectory.resolve("libs").resolve("arm64-v8a").resolve("lib").deleteRecursively()
        }
    }
    /**** Debug ****/
    download("wgpu-android-x86_64-debug.zip") {
        extract("lib/libwgpu_native.so", buildNativeResourcesDirectory.resolve("libsDebug").resolve("x86_64").resolve("libwgpu4k.so")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("libsDebug").resolve("x86_64").resolve("lib").resolve("libwgpu4k.so").toPath(),
                buildNativeResourcesDirectory.resolve("libsDebug").resolve("x86_64").resolve("libwgpu4k.so").toPath()
            )
            buildNativeResourcesDirectory.resolve("libsDebug").resolve("x86_64").resolve("lib").deleteRecursively()
        }
    }
    download("wgpu-android-aarch64-debug.zip") {
        extract("lib/libwgpu_native.so", buildNativeResourcesDirectory.resolve("libsDebug").resolve("arm64-v8a").resolve("libwgpu4k.so")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("libsDebug").resolve("arm64-v8a").resolve("lib").resolve("libwgpu4k.so").toPath(),
                buildNativeResourcesDirectory.resolve("libsDebug").resolve("arm64-v8a").resolve("libwgpu4k.so").toPath()
            )
            buildNativeResourcesDirectory.resolve("libsDebug").resolve("arm64-v8a").resolve("lib").deleteRecursively()
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(22)
    }
}

fun jniBasePath() = buildNativeResourcesDirectory.resolve("libsDebug")

/*if (Platform.os == Os.MacOs) {
    tasks.findByName("linkDebugTestMingwX64")?.apply { enabled = false }
    tasks.findByName("mingwX64Test")?.apply { enabled = false }
}*/

tasks.named<Test>("jvmTest") {
    useJUnitPlatform()
    filter {
        isFailOnNoMatchingTests = false
    }
    testLogging {
        showExceptions = true
        showStandardStreams = true
        events = setOf(
            org.gradle.api.tasks.testing.logging.TestLogEvent.FAILED,
            org.gradle.api.tasks.testing.logging.TestLogEvent.PASSED
        )
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
}

tasks.withType(MergeSourceSetFolders::class.java).configureEach {
    dependsOn("fetch-native-dependencies")
}
tasks.withType(CInteropProcess::class.java).configureEach {
    dependsOn("fetch-native-dependencies")
}
