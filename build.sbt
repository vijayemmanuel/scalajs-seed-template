enablePlugins(ScalaJSPlugin)
//enablePlugins(WorkbenchPlugin)
enablePlugins(ScalaJSBundlerPlugin)

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file ("."))
  .settings(
    name := "scalajs-seed-template",
    libraryDependencies ++= Seq("org.scala-js" %%% "scalajs-dom" % "2.1.0",
      "com.github.japgolly.scalajs-react" %%% "core" % "2.1.1",
      "com.github.japgolly.scalajs-react" %%% "extra" % "2.1.1",
      "com.github.japgolly.scalajs-react" %%% "test" % "2.1.1"),
    Compile / npmDependencies ++= Seq(
      "react" -> "17.0.2",
      "react-dom" -> "17.0.2",
      "@material-ui/core" -> "4.12.4",
      "@material-ui/styles" -> "4.11.5"),
    webpackEmitSourceMaps := false,
    webpackCliVersion := "4.10.0",
    startWebpackDevServer / version := "4.5.0",
    // This is an application with a main method
    scalaJSUseMainModuleInitializer := true
)
