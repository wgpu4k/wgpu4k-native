import org.jreleaser.model.api.deploy.maven.MavenCentralMavenDeployer.Stage
import org.jreleaser.model.Active

plugins {
    `maven-publish`
    id("org.jreleaser")
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


publishing {
    publications {
        create<MavenPublication>("maven") {
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
