import com.android.build.gradle.tasks.MergeSourceSetFolders
import org.jetbrains.dokka.base.DokkaBase
import org.jetbrains.dokka.base.DokkaBaseConfiguration
import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.CInteropProcess
import java.nio.file.Files

plugins {
    `kotlin-multiplatform`
    publish
    com.android.library
    alias(libs.plugins.kotest)
    alias(libs.plugins.ksp)
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
        mingwX64(),
        androidNativeArm64(),
        androidNativeX64(),
    )

    androidTarget {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_17
        }

        android {
            namespace = "io.ygdrasil.wgpu"
            compileSdk = 36

            defaultConfig {
                minSdk = 28
            }

            sourceSets {
                getByName("main") {
                    jniLibs.srcDirs(jniBasePath().absolutePath)
                }

            }
        }
        publishLibraryVariants("release", "debug")
    }

    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_24
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
        allWarningsAsErrors = true
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
        extract("include/webgpu/wgpu.h", buildNativeResourcesDirectory.resolve("wgpu.h")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("include").resolve("webgpu").resolve("wgpu.h").toPath(),
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
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("android-x64").resolve("libWGPU.a"))
    }
    download("wgpu-android-aarch64-release.zip") {
        extract("lib/libwgpu_native.so", buildNativeResourcesDirectory.resolve("libs").resolve("arm64-v8a").resolve("libwgpu4k.so")).doLast {
            Files.move(
                buildNativeResourcesDirectory.resolve("libs").resolve("arm64-v8a").resolve("lib").resolve("libwgpu4k.so").toPath(),
                buildNativeResourcesDirectory.resolve("libs").resolve("arm64-v8a").resolve("libwgpu4k.so").toPath()
            )
            buildNativeResourcesDirectory.resolve("libs").resolve("arm64-v8a").resolve("lib").deleteRecursively()
        }
        extract("lib/libwgpu_native.a", buildNativeResourcesDirectory.resolve("android-aarch64").resolve("libWGPU.a"))
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}

fun jniBasePath() = buildNativeResourcesDirectory.resolve("libs")

tasks.withType<Test> {
    failOnNoDiscoveredTests = false
}

tasks.named<Test>("jvmTest") {
    useJUnitPlatform()
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

tasks.register<Copy>("copyDocsToRoot") {
    dependsOn("dokkaGfm", "dokkaHtml")
    from(project.layout.buildDirectory.dir("dokka"))
    into(rootDir.resolve("doc"))
}

tasks.register<Task>("generateDocs") {
    group = "documentation"
    description = "Generates the documentation in HTML and Markdown formats, then copies the files into the 'doc' folder."
    dependsOn("copyDocsToRoot")
}
