
name := "one"

organization := "com.morpheyesh"

version := "0.1"

scalaVersion := "2.11.4"


publishMavenStyle := true

libraryDependencies ++= Seq(
  "com.tactix4" %% "t4xmlrpc" % "2.0.2",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2",
  "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2",
  "org.scalacheck" %% "scalacheck" % "1.11.4" % "test",
  "org.scalatest" %% "scalatest" % "2.2.0" % "test",
  "ch.qos.logback" % "logback-classic" % "1.0.9" % "test"
)
