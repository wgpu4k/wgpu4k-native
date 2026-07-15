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
	implementation("com.vanniktech:gradle-maven-publish-plugin:${libs.versions.maven.publish.get()}")

	implementation(libs.gson)

	implementation(libs.plugins.kotlin.multiplatform.asLibrary())

}
