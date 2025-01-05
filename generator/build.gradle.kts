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
	implementation(libs.kotlin.multiplatform)
	implementation(libs.kaml)
}
