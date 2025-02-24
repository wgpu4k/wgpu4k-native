plugins {
    `kotlin-multiplatform`
    `binary-compatibility-validator` apply false
    publish
}

kotlin {
    jvm()
}