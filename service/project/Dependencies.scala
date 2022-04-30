import sbt._

object Dependencies {
  lazy val allDependencies: Seq[ModuleID] =
    akkaDependencies ++
      routeDependencies ++
      json4sDependencies ++
      slickDependencies ++
      dbDependencies ++
      testDependencies ++
      logbackDependencies

  private lazy val akkaHttpVersion = "10.2.9"
  private lazy val akkaVersion = "2.6.19"
  private lazy val scaldiVersion = "0.5.8"
  private lazy val akkaHttpCorsVersion = "1.1.3"
  private lazy val json4sVersion = "4.0.5"
  private lazy val slickVersion: String = "3.3.3"
  private lazy val postgresVersion: String = "42.3.4"
  private lazy val scalamockVersion: String = "5.2.0"
  private lazy val scalatestVersion: String = "3.2.11"
  private lazy val scalaMockitoVersion = "1.17.5"
  private lazy val logbackVersion: String = "1.2.11"

  val akkaDependencies: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
    "org.scaldi" %% "scaldi-akka" % scaldiVersion
  )

  val routeDependencies: Seq[ModuleID] = Seq(
    "ch.megard" %% "akka-http-cors" % akkaHttpCorsVersion
  )

  val json4sDependencies: Seq[ModuleID] = Seq(
    "org.json4s" %% "json4s-jackson" % json4sVersion,
    "org.json4s" %% "json4s-ext" % json4sVersion,
    "org.json4s" %% "json4s-native" % json4sVersion
  )

  val slickDependencies: Seq[ModuleID] = Seq(
    "com.typesafe.slick" %% "slick" % slickVersion,
    "com.typesafe.slick" %% "slick-hikaricp" % slickVersion
  )

  val dbDependencies: Seq[ModuleID] = Seq(
    "org.postgresql" % "postgresql" % postgresVersion
  )

  val testDependencies: Seq[ModuleID] = Seq(
    "org.scalamock" %% "scalamock" % scalamockVersion % "test",
    "org.scalatest" %% "scalatest" % scalatestVersion % "test",
    "org.mockito" %% "mockito-scala" % scalaMockitoVersion
  )

  val logbackDependencies: Seq[ModuleID] = Seq(
    "ch.qos.logback" % "logback-core" % logbackVersion,
    "ch.qos.logback" % "logback-classic" % logbackVersion
  )
}

