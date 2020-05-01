name := "№5.1"

version := "0.1"

scalaVersion := "2.13.2"

//libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"

//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

//libraryDependencies += "org.scalatest" % "scalatest_2.10" % "2.0" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")