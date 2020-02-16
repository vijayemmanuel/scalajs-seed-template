enablePlugins(ScalaJSPlugin)
//enablePlugins(WorkbenchPlugin)
enablePlugins(ScalaJSBundlerPlugin)


name := "scalajs-seed-template"
scalaVersion := "2.12.4"

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
scalaJSModuleKind := ModuleKind.CommonJSModule

emitSourceMaps := false


libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.8"
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % "1.6.0"
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "extra" % "1.6.0"
libraryDependencies += "com.github.japgolly.scalajs-react" %%% "test" % "1.6.0"

npmDependencies in Compile ++= Seq(
  "react" -> "16.8.0",
  "react-dom" -> "16.8.0",
  "@material-ui/core" -> "3.9.3"

)
