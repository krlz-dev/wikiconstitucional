lazy val root = Project(id = "wikiconstitucional", base = file("."))
  .enablePlugins(JavaServerAppPackaging)
  .settings(DockerImage.publishToRegistry)
  .settings(
    organization := "eu.portavita",
    scalaVersion := "2.12.13",
    libraryDependencies ++= Dependencies.allDependencies
  )

