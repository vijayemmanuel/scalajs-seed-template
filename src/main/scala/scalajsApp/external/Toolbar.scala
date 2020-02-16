package scalajsApp.external

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object ToolBar {

  sealed trait Variant{ val value: String }

  object Variant {
    case object Regular extends Variant { val value: String = "regular" }
    case object Dense extends Variant { val value: String = "dense" }
  }

  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Object] = js.native
    var disableGutters: js.UndefOr[Boolean] = js.native
    var key: js.UndefOr[String] = js.native
    var style: js.UndefOr[js.Object] = js.native
    var variant: js.UndefOr[String] = js.native
  }

  // works with MUI 3.1.2
  //@JSImport("@material-ui/core", "Toolbar")
  @JSImport("@material-ui/core", "Toolbar")
  @js.native
  private object ToolbarJS extends js.Object

  val jsComponent = JsFnComponent[Props, Children.Varargs](ToolbarJS)

  /**
   *
   * @param children
   *        Toolbar children, usually a mixture of `IconButton`, `Button` and `Typography`.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param disableGutters
   *        If `true`, disables gutter padding.
   * @param key
   *        React key
   * @param style
   *        React element CSS style
   * @param variant
   *        The variant to use.
   * @param additionalProps
   *        Optional parameter - if specified, this must be a js.Object containing additional props
   *        to pass to the underlying JS component. Each field of additionalProps will be added to the
   *        JS props object, if a field with the same name is not already present (from one of the other
   *        parameters of this function). This functions like `...additionalProps` at the beginning of the
   *        component in JS. Used for e.g. Downshift integration, where Downshift will provide properties
   *        in this format to be added to rendered components.
   *        Since this is untyped, use with care - e.g. make sure props are in the correct format for JS components
   */
  def apply(
             className: js.UndefOr[String] = js.undefined,
             classes: js.UndefOr[js.Object] = js.undefined,
             disableGutters: js.UndefOr[Boolean] = js.undefined,
             key: js.UndefOr[String] = js.undefined,
             style: js.UndefOr[Style] = js.undefined,
             variant: js.UndefOr[Variant] = js.undefined,
             additionalProps: js.UndefOr[js.Object] = js.undefined
           )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (disableGutters.isDefined) {p.disableGutters = disableGutters}
    if (key.isDefined) {p.key = key}
    if (style.isDefined) {p.style = style.map(v => v.o)}
    if (variant.isDefined) {p.variant = variant.map(v => v.value)}

    additionalProps.foreach {
      a => {
        val dict = a.asInstanceOf[js.Dictionary[js.Any]]
        val pDict = p.asInstanceOf[js.Dictionary[js.Any]]
        for ((prop, value) <- dict) {
          if (!p.hasOwnProperty(prop)) pDict(prop) = value
        }
      }
    }

    jsComponent(p)(children: _*)
  }

}
