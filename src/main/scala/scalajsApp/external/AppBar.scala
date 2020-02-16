package scalajsApp.external

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._


object AppBar {

  sealed trait Color{ val value: String }

  object Color {
    case object Inherit extends Color { val value: String = "inherit" }
    case object Primary extends Color { val value: String = "primary" }
    case object Secondary extends Color { val value: String = "secondary" }
    case object Default extends Color { val value: String = "default" }
  }

  sealed trait Position{ val value: String }

  object Position {
    case object Relative extends Position { val value: String = "relative" }
    case object Absolute extends Position { val value: String = "absolute" }
    case object Fixed extends Position { val value: String = "fixed" }
    case object Sticky extends Position { val value: String = "sticky" }
    case object Static extends Position { val value: String = "static" }
  }

  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Object] = js.native
    var color: js.UndefOr[String] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var elevation: js.UndefOr[Double] = js.native
    var key: js.UndefOr[String] = js.native
    var position: js.UndefOr[String] = js.native
    var square: js.UndefOr[Boolean] = js.native
    var style: js.UndefOr[js.Object] = js.native
  }

  @JSImport("@material-ui/core", "AppBar")
  @js.native
  private object AppBarJS extends js.Object

  val jsComponent = JsFnComponent[Props, Children.Varargs](AppBarJS)


  /**
   *
   * @param children
   *        The content of the component.
   * @param className
   *        Property spread to root element
   * @param classes
   *        Override or extend the styles applied to the component.
   *        See [CSS API](#css-api) below for more details.
   * @param color
   *        The color of the component. It supports those theme colors that make sense for this component.
   * @param component
   *        The component used for the root node.
   *        Either a string to use a DOM element or a component.
   *        Passed to Paper
   * @param elevation
   *        Shadow depth, corresponds to `dp` in the spec.
   *        It's accepting values between 0 and 24 inclusive.
   *        Passed to Paper
   * @param key
   *        React key
   * @param position
   *        The positioning type. The behavior of the different options is described
   *        [here](https://developer.mozilla.org/en-US/docs/Learn/CSS/CSS_layout/Positioning).
   *        Note: `sticky` is not universally supported and will fall back to `static` when unavailable.
   * @param square
   *        If `true`, rounded corners are disabled.
   *        Passed to Paper
   * @param style
   *        React element CSS style
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
             color: js.UndefOr[Color] = js.undefined,
             component: js.UndefOr[js.Any] = js.undefined,
             elevation: js.UndefOr[Double] = js.undefined,
             key: js.UndefOr[String] = js.undefined,
             position: js.UndefOr[Position] = js.undefined,
             square: js.UndefOr[Boolean] = js.undefined,
             style: js.UndefOr[Style] = js.undefined,
             additionalProps: js.UndefOr[js.Object] = js.undefined
           )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (color.isDefined) {p.color = color.map(v => v.value)}
    if (component.isDefined) {p.component = component}
    if (elevation.isDefined) {p.elevation = elevation}
    if (key.isDefined) {p.key = key}
    if (position.isDefined) {p.position = position.map(v => v.value)}
    if (square.isDefined) {p.square = square}
    if (style.isDefined) {p.style = style.map(v => v.o)}

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
