name := "playtest"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "net.vz.mongodb.jackson" %% "play-mongo-jackson-mapper" % "1.1.0",
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
