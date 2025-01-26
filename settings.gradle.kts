rootProject.name = "wgpu4k-native-root"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
	includeBuild("generator")
	repositories {
		gradlePluginPortal()
		google()
		mavenCentral()
	}
}

dependencyResolutionManagement {
	repositories {
		google()
		mavenCentral()
	}
}

val hostOs = System.getProperty("os.name")

include("wgpu4k-native")
include("wgpu4k-native-specs")
include("demo:common")
include("demo:desktop-and-ios")
include("demo:android")
