import java.io.File

class Paths(
    library: File,
    specifications: File
) {


    val sourceBasePath = library
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

    val specs = specifications
        .resolve("src")
        .resolve("jvmMain")
        .resolve("resources")
}