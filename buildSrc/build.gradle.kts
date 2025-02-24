plugins {
	`kotlin-dsl`
}


repositories {
	gradlePluginPortal()
	google()
	mavenCentral()
}

fun PluginDependency.asLibrary(): Any = "$pluginId:$pluginId.gradle.plugin:$version"
fun Provider<PluginDependency>.asLibrary(): Provider<Any> = map { it.asLibrary() }

dependencies {
	implementation(libs.download)
	implementation(libs.bundles.dokka)
	implementation(libs.android.library)

	implementation(libs.gson)
	implementation(libs.zip4j)
	implementation(libs.okhttp)
	implementation(libs.commons.io)

	implementation(libs.plugins.binary.compatibility.validator.asLibrary())
	implementation(libs.plugins.kotlin.multiplatform.asLibrary())

}
