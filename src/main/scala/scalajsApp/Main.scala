package scalajsApp

import japgolly.scalajs.react.{React, ReactDOM}
import org.scalajs.dom

import scalajs.js
import scalajs.js.annotation._
import japgolly.scalajs.react.vdom.html_<^._
import scalajsApp.router.AppRouter

object ReactApp  {
  @JSImport("@material-ui/styles", JSImport.Namespace)
  @js.native
  object CSStyles extends js.Any


  def require(): Unit = {
    CSStyles
  }

  //@JSExport
  def main(args: Array[String]): Unit = {
    require()
    val target = dom.document.getElementById("target")
    AppRouter.router().renderIntoDOM(target)
  }
}
