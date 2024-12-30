plugins {
	`kotlin-dsl`
	kotlin("plugin.serialization") version "2.1.0"
}


repositories {
	gradlePluginPortal()
	google()
	mavenCentral()
}

dependencies {
	implementation(libs.download)
	implementation(libs.kotlin.multiplatform)
	implementation(libs.jreleaser.plugin)
	implementation(libs.android.library)

	implementation(libs.gson)
	implementation(libs.zip4j)
	implementation(libs.okhttp)
	implementation(libs.commons.io)

	implementation(libs.kaml)

}
