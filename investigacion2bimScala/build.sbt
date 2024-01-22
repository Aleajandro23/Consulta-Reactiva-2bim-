ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.0"

lazy val root = (project in file("."))
  .settings(
    name := "investigacion2bim",
    libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.6.17"
  )
