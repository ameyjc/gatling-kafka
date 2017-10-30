name := "gatling-kafka"

organization := "com.github.mnogu"

version := "0.1.2-SNAPSHOT"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "io.gatling" % "gatling-core" % "2.2.3" % "provided",
  ("org.apache.kafka" % "kafka-clients" % "0.10.1.1")
    // Gatling contains slf4j-api
    .exclude("org.slf4j", "slf4j-api")
)
libraryDependencies += "org.scala-lang" % "scala-compiler" % scalaVersion.value

dependencyOverrides += "org.scala-lang" % "scala-compiler" % scalaVersion.value

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

dependencyOverrides += "org.scala-lang" % "scala-reflect" % scalaVersion.value

// Gatling contains scala-library
assemblyOption in assembly := (assemblyOption in assembly).value
  .copy(includeScala = false)
