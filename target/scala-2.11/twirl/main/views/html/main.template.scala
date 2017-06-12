
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.versioned("lib/bootstrap/css/bootstrap.min.css")),format.raw/*14.116*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*16.59*/routes/*16.65*/.Assets.versioned("images/favicon.png")),format.raw/*16.104*/("""">
    </head>
    <body>
        """),format.raw/*20.32*/("""

        """),format.raw/*22.9*/("""<div class="container">

            <div class="row">
                    """),_display_(/*25.22*/header()),format.raw/*25.30*/("""
            """),format.raw/*26.13*/("""</div>
            <div class="row">
                    """),_display_(/*28.22*/content),format.raw/*28.29*/("""
            """),format.raw/*29.13*/("""</div>


        </div>


        <script src=""""),_display_(/*35.23*/routes/*35.29*/.Assets.versioned("lib/jquery/jquery.min.js")),format.raw/*35.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*36.23*/routes/*36.29*/.Assets.versioned("lib/bootstrap/js/bootstrap.min.js")),format.raw/*36.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*37.23*/routes/*37.29*/.Assets.versioned("javascripts/main.js")),format.raw/*37.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 16:51:00 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/main.scala.html
                  HASH: 00947fb52cdb205ace4f48c79bb33cb92417042a
                  MATRIX: 1002->260|1127->290|1155->292|1235->397|1271->406|1306->414|1332->419|1421->481|1436->487|1514->543|1597->599|1612->605|1675->646|1763->707|1778->713|1839->752|1901->876|1938->886|2041->962|2070->970|2111->983|2196->1041|2224->1048|2265->1061|2340->1109|2355->1115|2421->1160|2505->1217|2520->1223|2595->1277|2679->1334|2694->1340|2755->1380
                  LINES: 32->7|37->7|39->9|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|49->20|51->22|54->25|54->25|55->26|57->28|57->28|58->29|64->35|64->35|64->35|65->36|65->36|65->36|66->37|66->37|66->37
                  -- GENERATED --
              */
          