import org.jetbrains.kotlin.gradle.plugin.mpp.apple.XCFramework

plugins {
    `kotlin-multiplatform`
    `binary-compatibility-validator` apply false
}

kotlin {

    val xcframeworkName = "WgpuApp"
    val xcf = XCFramework(xcframeworkName)

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

    val hostOs = System.getProperty("os.name")
    val isArm64 = System.getProperty("os.arch") == "aarch64"

    println("host is $hostOs")
    val nativeTarget = when {
        // No toolchain on this architecture
        hostOs == "Linux" && isArm64 -> null.also { println("Linux native Arm64 not yet supported") }
        hostOs == "Linux" && !isArm64 -> linuxX64()
        hostOs == "Mac OS X" && isArm64 -> macosArm64()
        hostOs == "Mac OS X" && !isArm64 -> macosX64()
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
        withJava()
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
    // TODO: find why the app is crashing sometimes
    isIgnoreExitValue = true
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
    classpath = sourceSets["main"].runtimeClasspath
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(22))
    }
}