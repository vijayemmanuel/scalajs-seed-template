package scalajsApp.router

import japgolly.scalajs.react.extra.router._
import japgolly.scalajs.react.vdom.html_<^._
import scalajsApp.components.Layout


object AppRouter {
  sealed trait Page
  case object HomeRoute extends Page

  //val connection = AppCircuit.connect(_.state)

  val routerConfig = RouterConfigDsl[Page].buildConfig { dsl =>
    import dsl._
    (trimSlashes
      | staticRoute(root, HomeRoute) ~> render(<.div(
      <.br(),
      <.br(),
      <.br(),
        <.h1("Welcome")
    ))
    )
      .notFound(redirectToPage(HomeRoute)(SetRouteVia.HistoryReplace))
      .renderWith(layout)
  }

  def layout (c: RouterCtl[Page], r: Resolution[Page]) = Layout(Layout.Props(c,r))

  val baseUrl = BaseUrl.fromWindowOrigin_/

  val router = Router(baseUrl, routerConfig.logToConsole)
}
