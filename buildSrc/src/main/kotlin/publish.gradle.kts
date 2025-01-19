import org.jreleaser.model.api.deploy.maven.MavenCentralMavenDeployer.Stage
import org.jreleaser.model.Active
import publish.centralPortalPublish
import publish.PublishingType

plugins {
    `maven-publish`
    id("org.jreleaser")
    signing
    id("org.jetbrains.dokka")
}


val libraryDescription = "wgpu4k kotlin native binding."


jreleaser {
    gitRootSearch = true

    project {
        description = libraryDescription
        copyright = "MIT"
    }

    signing {
        active = Active.ALWAYS
        armored = true
        artifacts = true
    }

    deploy {
        active = Active.ALWAYS
        maven {

            pomchecker {
                failOnError = false
                failOnWarning = false
            }

            active = Active.ALWAYS
            mavenCentral {
                active = Active.ALWAYS
                create("sonatype") {
                    stage = Stage.UPLOAD
                    active = Active.ALWAYS
                    url = "https://central.sonatype.com/api/v1/publisher"
                    stagingRepository("build/staging-deploy")
                }
            }
        }
    }

    release {
        github {
            skipRelease = true
            skipTag = true
            overwrite = false
            token = "none"
        }
    }
}

val signingKey = System.getenv("JRELEASER_GPG_SECRET_KEY")
val signingPassword = System.getenv("JRELEASER_GPG_PASSPHRASE")

if (!isSnapshot()) {
    signing {
        useInMemoryPgpKeys(signingKey, signingPassword)
        sign(publishing.publications)
    }
}

project.centralPortalPublish {
    username = System.getenv("JRELEASER_MAVENCENTRAL_USERNAME")
    password = System.getenv("JRELEASER_MAVENCENTRAL_PASSWORD")
    publishingType = PublishingType.USER_MANAGED
    url = layout.buildDirectory.dir("staging-deploy").get().asFile.toURI()
}

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
    from(tasks.findByName("dokkaHtml"))
}

publishing {
    publications {
        withType<MavenPublication> {
            artifact(javadocJar)
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
    }


    repositories {
        maven {
            if (isSnapshot()) {
                logger.info("publishing is configure as snapshot")
                name = "GitLab"
                url = uri("https://gitlab.com/api/v4/projects/25805863/packages/maven")
                credentials(HttpHeaderCredentials::class) {
                    name = "Authorization"
                    value = "Bearer ${System.getenv("GITLAB_TOKEN")}"
                }
                authentication {
                    create<HttpHeaderAuthentication>("header")
                }
            } else {
                name = "Local"
                logger.info("publishing is configure as release")
                url = layout.buildDirectory.dir("staging-deploy").get().asFile.toURI()
                logger.info("publishing path is ${url.path}")
            }
        }
    }
}

if (!isSnapshot()) {
    val signingTasks = tasks.withType<Sign>()
    tasks.withType<AbstractPublishToMaven>().configureEach {
        dependsOn(signingTasks)
    }
}