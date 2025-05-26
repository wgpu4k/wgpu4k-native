plugins {
	`kotlin-dsl`
	kotlin("plugin.serialization") version "2.1.21"
}


repositories {
	gradlePluginPortal()
	google()
	mavenCentral()
}

fun PluginDependency.asLibrary(): Any = "$pluginId:$pluginId.gradle.plugin:$version"
fun Provider<PluginDependency>.asLibrary(): Provider<Any> = map { it.asLibrary() }

dependencies {
	implementation(libs.plugins.kotlin.multiplatform.asLibrary())
	implementation(libs.kaml)
}
