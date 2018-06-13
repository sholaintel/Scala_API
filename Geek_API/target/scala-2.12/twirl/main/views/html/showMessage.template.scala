
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object showMessage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*4.62*/("""
        """),format.raw/*5.9*/("""<title>I can do it in JSON</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*7.59*/routes/*7.65*/.Assets.versioned("images/favicon.png")),format.raw/*7.104*/("""">

    </head>
    <body>
        """),format.raw/*12.32*/("""
        """),format.raw/*13.9*/("""["""),format.raw/*13.10*/("""{"""),format.raw/*13.11*/(""""request" : "done""""),format.raw/*13.29*/("""}"""),format.raw/*13.30*/("""]

      <script src=""""),_display_(/*15.21*/routes/*15.27*/.Assets.versioned("javascripts/main.js")),format.raw/*15.67*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri May 25 10:52:49 WAT 2018
                  SOURCE: /home/intelle/Desktop/qrios/app/views/showMessage.scala.html
                  HASH: bb27b47991d5aa93c3f315e909173d64f88d63bf
                  MATRIX: 817->0|896->105|931->114|1045->202|1059->208|1121->249|1208->310|1222->316|1282->355|1345->480|1381->489|1410->490|1439->491|1485->509|1514->510|1564->533|1579->539|1640->579
                  LINES: 26->1|29->4|30->5|31->6|31->6|31->6|32->7|32->7|32->7|36->12|37->13|37->13|37->13|37->13|37->13|39->15|39->15|39->15
                  -- GENERATED --
              */
          