plugins {
    id(libs.plugins.kotlin.multiplatform.get().pluginId)
    id("publish")
}

kotlin {
    jvm()
}