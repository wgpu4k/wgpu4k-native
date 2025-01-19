tasks.register("generateBinding") {
    group = "build"
    doLast {
        Paths(
            project(":wgpu4k-native").projectDir,
            project(":wgpu4k-native-specs").projectDir
        ).let { generate(it) }
    }
}