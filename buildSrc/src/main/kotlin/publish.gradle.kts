import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinMultiplatform
import com.vanniktech.maven.publish.SourcesJar
import org.gradle.api.publish.maven.tasks.PublishToMavenRepository

plugins {
    id("com.vanniktech.maven.publish")
    id("org.jetbrains.dokka")
}

val libraryDescription = "wgpu4k kotlin native binding."
val dokkaHtml = tasks.named("dokkaGeneratePublicationHtml")

mavenPublishing {
    publishToMavenCentral()
    signAllPublications()

    configure(
        KotlinMultiplatform(
            javadocJar = JavadocJar.Dokka(dokkaHtml),
            sourcesJar = SourcesJar.Sources(),
            androidVariantsToPublish = listOf("debug", "release"),
        ),
    )

    coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set(project.name)
        description.set(libraryDescription)
        url.set("https://github.com/wgpu4k/wgpu4k-native")
        inceptionYear.set("2024")
        licenses {
            license {
                name.set("MIT")
                url.set("https://opensource.org/license/MIT")
            }
        }
        developers {
            developer {
                id.set("amommers")
                name.set("Alexandre Mommers")
            }
        }
        scm {
            connection.set("scm:git:https://github.com/wgpu4k/wgpu4k-native.git")
            developerConnection.set("scm:git:https://github.com/wgpu4k/wgpu4k-native.git")
            url.set("https://github.com/wgpu4k/wgpu4k-native")
        }
    }
}

val publicationVerificationRepository = publishing.repositories.maven {
    name = "PublicationVerification"
    url = rootProject.layout.buildDirectory
        .dir("publication-verification/repository")
        .get()
        .asFile
        .toURI()
}

tasks.withType<PublishToMavenRepository>().configureEach {
    if (repository == publicationVerificationRepository) {
        dependsOn(rootProject.tasks.named("cleanPublicationVerificationRepository"))
    }
}
