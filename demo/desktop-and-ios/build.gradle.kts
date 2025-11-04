import org.gradle.nativeplatform.platform.internal.DefaultNativePlatform
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    `kotlin-multiplatform`
}

val os = DefaultNativePlatform.getCurrentOperatingSystem()

kotlin {

    val xcframeworkName = "WgpuApp"
    val xcf = XCFramework(xcframeworkName)

    if (os.isMacOsX) {
        listOf(
            iosX64(),
            iosArm64(),
            iosSimulatorArm64()
        ).forEach { iosTarget ->
            iosTarget.binaries.framework {
                baseName = "WgpuApp"
                isStatic = true
                xcf.add(this)
                binaryOption("bundleId", "io.ygdrasil.webgpu.$xcframeworkName")
            }
        }
    }


    val isArm64 = System.getProperty("os.arch") == "aarch64"
    val nativeTarget = when {
        // No toolchain on this architecture
        os.isLinux && isArm64 -> null.also { println("Linux native Arm64 not yet supported") }
        os.isLinux && !isArm64 -> linuxX64()
        os.isMacOsX && isArm64 -> macosArm64()
        os.isMacOsX && !isArm64 -> macosX64()
        // Disable native on windows until linking issues are note solved
        //hostOs.startsWith("Windows") -> mingwX64()
        else -> null // Not supported
    }

    if (nativeTarget != null) {
        with(nativeTarget) {

            binaries {
                executable {
                    entryPoint = "io.ygdrasil.wgpu.main"
                }
            }
        }
    }

    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_24
        }
    }

    applyDefaultHierarchyTemplate()

    sourceSets {

        commonMain {
            dependencies {
                implementation(projects.demo.common)
            }
        }

        val desktopMain by creating {
            dependencies {
                implementation(libs.ygdrasil.glfw.native)
            }
        }

        macosMain {
            dependsOn(desktopMain)
        }

        linuxMain {
            dependsOn(desktopMain)
        }

        jvmMain {
            dependencies {
                api(libs.rococoa)
                api(libs.jnaPlatform)
                val lwjglVersion = "3.3.6"
                api("org.lwjgl:lwjgl:$lwjglVersion")
                api("org.lwjgl:lwjgl-glfw:$lwjglVersion")
                listOf(
                    "natives-windows",
                    "natives-macos",
                    "natives-macos-arm64",
                    "natives-linux",
                    "natives-linux-arm64"
                ).forEach { dependencyType ->
                    runtimeOnly("org.lwjgl:lwjgl:$lwjglVersion:$dependencyType")
                    runtimeOnly("org.lwjgl:lwjgl-glfw:$lwjglVersion:$dependencyType")
                }
            }
        }
    }
}

tasks.register<JavaExec>("runJvm") {
    group = "run"
    mainClass = "io.ygdrasil.wgpu.MainKt"
    jvmArgs(
        if (Platform.os == Os.MacOs) {
            listOf(
                "-XstartOnFirstThread",
                "--add-opens=java.base/java.lang=ALL-UNNAMED",
                "--enable-native-access=ALL-UNNAMED"
            )
        } else {
            listOf(
                "--add-opens=java.base/java.lang=ALL-UNNAMED",
                "--enable-native-access=ALL-UNNAMED"
            )
        }
    )
    classpath = sourceSets["jvmMain"].runtimeClasspath
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(24)
    }
}