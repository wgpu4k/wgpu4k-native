plugins {
    id(libs.plugins.kotlin.multiplatform.get().pluginId)
}

kotlin {

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
                    entryPoint = "main"
                }
            }
        }
    }

    jvm {
        withJava()
    }

    sourceSets {

        commonMain {
            dependencies {
                implementation(projects.demo.common)
            }
        }

        nativeMain {
            dependencies {
                implementation(libs.ygdrasil.glfw.native)
            }
        }

        jvmMain {
            dependencies {
                api(libs.rococoa)
                api(libs.jnaPlatform)
                val lwjglVersion = "3.3.3"
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
    mainClass = "MainKt"
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