package publish

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.artifacts.repositories.MavenArtifactRepository
import org.gradle.api.publish.PublishingExtension
import java.net.URI

@Suppress("unused")
class CentralPortalPlusPlugin :
    BaseCentralPortalPlusExtension(),
    Plugin<Project> {
    override var url: URI? = null
    override var username: String? = null
    override var password: String? = null
    override var publishingType: PublishingType? = null

    override fun apply(target: Project) {
        val portalConf =
            target.extensions.create(
                "centralPortalPlus",
                BaseCentralPortalPlusExtension::class.java,
            )

        target.afterEvaluate {
            if (portalConf.url == null) {
                val publishConf =
                    project.extensions.findByType(PublishingExtension::class.java)
                if (publishConf is PublishingExtension) {
                    val localMavenRepo =
                        publishConf.repositories.find { it is MavenArtifactRepository }
                    if (localMavenRepo is MavenArtifactRepository) {
                        this@CentralPortalPlusPlugin.url = localMavenRepo.url
                    }
                }
            } else {
                this@CentralPortalPlusPlugin.url = portalConf.url
            }
            this@CentralPortalPlusPlugin.username = portalConf.username
            this@CentralPortalPlusPlugin.password = portalConf.password
            this@CentralPortalPlusPlugin.publishingType = portalConf.publishingType
            val tasks = project.tasks

            val defaultPublishTask = tasks.findByName("publish")
            if (defaultPublishTask != null) {
                val publishToCentralPortalTask =
                    tasks.register("publishToCentralPortal", BasePublishingTask::class.java)
                publishToCentralPortalTask.configure {
                    dependsOn(
                        defaultPublishTask,
                    )
                }
            } else {
                target.logger.error("missing default publish task!")
            }
        }
    }
}
