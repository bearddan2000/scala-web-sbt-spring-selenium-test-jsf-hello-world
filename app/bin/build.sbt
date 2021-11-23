lazy val root = (project in file("."))
  .settings(
    name := "spring-boot-scala-web",

    version := "1.0",

    scalaVersion := "2.13.1",

    libraryDependencies ++= Seq(
      "org.springframework.boot" % "spring-boot-starter-web" % "2.4.2",
      // https://mvnrepository.com/artifact/javax.enterprise/cdi-api
      "org.joinfaces" % "primefaces-spring-boot-starter" % "4.3.12",
      "javax.enterprise" % "cdi-api" % "1.2" % "provided"
     ),

    mainClass := Some("example.MyApp")
)
