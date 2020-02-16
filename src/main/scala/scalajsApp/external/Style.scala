package scalajsApp.external

import scala.scalajs.js

case class Style(o: js.Object) extends AnyVal

object Style {
  def apply(fields: (String, String)*): Style = Style(js.Dictionary(fields: _*).asInstanceOf[js.Object])
}
