plugins {
    `kotlin-multiplatform`
    publish
}

kotlin {
    jvm()
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}