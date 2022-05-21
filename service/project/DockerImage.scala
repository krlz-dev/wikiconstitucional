import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._
import com.typesafe.sbt.packager.linux.LinuxPlugin.autoImport.defaultLinuxInstallLocation
import sbt.Def
import sbt.Keys.{isSnapshot, name, version}

object DockerImage {

  lazy val publishToRegistry: Seq[Def.Setting[_ >: Map[String, String] with Option[String] with Boolean with String with Seq[String]]] = Seq(
    dockerBaseImage := "openjdk:11",
    Docker / defaultLinuxInstallLocation := "/opt/" + name.value,
    dockerUpdateLatest := true,
    dockerRepository := Some("registry.heroku.com/econstitucional-service/web"),
    Docker / version := {
      if (isSnapshot.value) s"${version.value}-$timestamp" else version.value
    },
    dockerLabels := Map(
      "maintainer" -> "korry y valravnx",
      "description" -> "Remaster of econstitucional 2013"
    ),
    dockerBuildOptions += "--no-cache"
  )

  private def timestamp: String =
    DateTimeFormatter.ofPattern("yyyyMMdd.HHmmss").format(LocalDateTime.now())
}
