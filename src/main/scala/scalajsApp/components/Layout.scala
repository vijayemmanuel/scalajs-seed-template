package scalajsApp.components

import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.{Resolution, RouterCtl}
import japgolly.scalajs.react.vdom.html_<^._
import scalajsApp.config.Config
import scalajsApp.external.{AppBar, ToolBar, Typography}
import scalajsApp.router.AppRouter.Page



object Layout {


  case class Props( ctl: RouterCtl[Page],
                    r: Resolution[Page])

  class Backend(bs: BackendScope[Props, Unit]) {
    val host: String = Config.AppConfig.apiHost


    def render(props: Props): VdomElement = <.div(
      <.div(
        ^.cls := "container",
         AppBar(position = AppBar.Position.Static)(
            ToolBar()(
              Typography(variant = Typography.Variant.H6,color = Typography.Color.Inherit)(
                "Hello World"
              )
            )

        ),
        props.r.render()
      )
    )
  }

  val Component = ScalaComponent.builder[Props]("Layout")
    .renderBackend[Backend]
    .build

  def apply(props: Props) = Component(props).vdomElement
}
