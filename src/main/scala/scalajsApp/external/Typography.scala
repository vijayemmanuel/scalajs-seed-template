package scalajsApp.external

import japgolly.scalajs.react._
import scalajs.js
import scalajs.js.annotation.JSImport

import japgolly.scalajs.react.vdom.html_<^._

object Typography {

  sealed trait Align{ val value: String }

  object Align {
    case object Center extends Align { val value: String = "center" }
    case object Left extends Align { val value: String = "left" }
    case object Justify extends Align { val value: String = "justify" }
    case object Right extends Align { val value: String = "right" }
    case object Inherit extends Align { val value: String = "inherit" }
  }

  sealed trait Color{ val value: String }

  object Color {
    case object Secondary extends Color { val value: String = "secondary" }
    case object TextPrimary extends Color { val value: String = "textPrimary" }
    case object Primary extends Color { val value: String = "primary" }
    case object Default extends Color { val value: String = "default" }
    case object Error extends Color { val value: String = "error" }
    case object Inherit extends Color { val value: String = "inherit" }
    case object TextSecondary extends Color { val value: String = "textSecondary" }
  }

  sealed trait Variant{ val value: String }

  object Variant {
    case object H5 extends Variant { val value: String = "h5" }
    case object SrOnly extends Variant { val value: String = "srOnly" }
    case object Button extends Variant { val value: String = "button" }
    case object H2 extends Variant { val value: String = "h2" }
    case object Display2 extends Variant { val value: String = "display2" }
    case object H6 extends Variant { val value: String = "h6" }
    case object Display3 extends Variant { val value: String = "display3" }
    case object Display1 extends Variant { val value: String = "display1" }
    case object Title extends Variant { val value: String = "title" }
    case object Inherit extends Variant { val value: String = "inherit" }
    case object H1 extends Variant { val value: String = "h1" }
    case object Subtitle1 extends Variant { val value: String = "subtitle1" }
    case object Body1 extends Variant { val value: String = "body1" }
    case object Subheading extends Variant { val value: String = "subheading" }
    case object Headline extends Variant { val value: String = "headline" }
    case object Display4 extends Variant { val value: String = "display4" }
    case object Subtitle2 extends Variant { val value: String = "subtitle2" }
    case object Body2 extends Variant { val value: String = "body2" }
    case object H3 extends Variant { val value: String = "h3" }
    case object Caption extends Variant { val value: String = "caption" }
    case object Overline extends Variant { val value: String = "overline" }
    case object H4 extends Variant { val value: String = "h4" }
  }

  @js.native
  trait Props extends js.Object {
    var align: js.UndefOr[String] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.UndefOr[js.Object] = js.native
    var color: js.UndefOr[String] = js.native
    var component: js.UndefOr[js.Any] = js.native
    var gutterBottom: js.UndefOr[Boolean] = js.native
    var headlineMapping: js.UndefOr[js.Object] = js.native
    var internalDeprecatedVariant: js.UndefOr[Boolean] = js.native
    var key: js.UndefOr[String] = js.native
    var noWrap: js.UndefOr[Boolean] = js.native
    var paragraph: js.UndefOr[Boolean] = js.native
    var style: js.UndefOr[js.Object] = js.native
    var variant: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core/Typography", JSImport.Default)
  @js.native
  object TypographyJS extends js.Object

  val jsComponent = JsComponent[Props, Children.Varargs,Null](TypographyJS)

  /**
   *
   * @param align
   *        Set the text-align on the component.
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
   *        By default, it maps the variant to a good default headline component.
   * @param gutterBottom
   *        If `true`, the text will have a bottom margin.
   * @param headlineMapping
   *        We are empirically mapping the variant property to a range of different DOM element types.
   *        For instance, subtitle1 to `&lt;h6&gt;`.
   *        If you wish to change that mapping, you can provide your own.
   *        Alternatively, you can use the `component` property.
   *        The default mapping is the following:
   * @param internalDeprecatedVariant
   *        A deprecated variant is used from an internal component. Users don't need
   *        a deprecation warning here if they switched to the v2 theme. They already
   *        get the mapping that will be applied in the next major release.
   *        internal
   * @param key
   *        React key
   * @param noWrap
   *        If `true`, the text will not wrap, but instead will truncate with an ellipsis.
   * @param paragraph
   *        If `true`, the text will have a bottom margin.
   * @param style
   *        React element CSS style
   * @param variant
   *        Applies the theme typography styles.
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
             align: js.UndefOr[Align] = js.undefined,
             className: js.UndefOr[String] = js.undefined,
             classes: js.UndefOr[js.Object] = js.undefined,
             color: js.UndefOr[Color] = js.undefined,
             component: js.UndefOr[js.Any] = js.undefined,
             gutterBottom: js.UndefOr[Boolean] = js.undefined,
             headlineMapping: js.UndefOr[js.Object] = js.undefined,
             internalDeprecatedVariant: js.UndefOr[Boolean] = js.undefined,
             key: js.UndefOr[String] = js.undefined,
             noWrap: js.UndefOr[Boolean] = js.undefined,
             paragraph: js.UndefOr[Boolean] = js.undefined,
             style: js.UndefOr[Style] = js.undefined,
             variant: js.UndefOr[Variant] = js.undefined,
             additionalProps: js.UndefOr[js.Object] = js.undefined
           )(children: VdomNode *) = {

    val p = (new js.Object).asInstanceOf[Props]
    if (align.isDefined) {p.align = align.map(v => v.value)}
    if (className.isDefined) {p.className = className}
    if (classes.isDefined) {p.classes = classes}
    if (color.isDefined) {p.color = color.map(v => v.value)}
    if (component.isDefined) {p.component = component}
    if (gutterBottom.isDefined) {p.gutterBottom = gutterBottom}
    if (headlineMapping.isDefined) {p.headlineMapping = headlineMapping}
    if (internalDeprecatedVariant.isDefined) {p.internalDeprecatedVariant = internalDeprecatedVariant}
    if (key.isDefined) {p.key = key}
    if (noWrap.isDefined) {p.noWrap = noWrap}
    if (paragraph.isDefined) {p.paragraph = paragraph}
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
