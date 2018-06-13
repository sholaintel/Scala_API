name := """qrios"""
organization := "qrios.net"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies += guice

libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.+"

libraryDependencies += "org.postgresql" % "postgresql" % "9.3-1102-jdbc41"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "qrios.net.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "qrios.net.binders._"
