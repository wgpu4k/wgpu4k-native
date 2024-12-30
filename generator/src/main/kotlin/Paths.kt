import java.io.File

object Paths {

    val base = File(".")
    val sourceBasePath = base
        .resolve("wgpu4k-native")
        .resolve("src")
    val commonMainBasePath = sourceBasePath
        .resolve("commonMain")
        .resolve("kotlin")
    val androidMainBasePath = sourceBasePath
        .resolve("androidMain")
        .resolve("kotlin")
    val jvmMainBasePath = sourceBasePath
        .resolve("jvmMain")
        .resolve("kotlin")
    val nativeMainBasePath = sourceBasePath
        .resolve("nativeMain")
        .resolve("kotlin")

    val specs = base.resolve("wgpu4k-native-specs")
        .resolve("src")
        .resolve("jvmMain")
        .resolve("resources")
}