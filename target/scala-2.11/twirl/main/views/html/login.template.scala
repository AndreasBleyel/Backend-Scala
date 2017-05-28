
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[models.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: play.data.Form[models.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*6.62*/("""
        """),format.raw/*7.9*/("""<title>Login</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("lib/bootstrap/css/bootstrap.min.css")),format.raw/*8.116*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*9.54*/routes/*9.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*10.59*/routes/*10.65*/.Assets.versioned("images/favicon.png")),format.raw/*10.104*/("""">
    </head>
    <body>
        """),format.raw/*14.31*/("""
        """),format.raw/*15.9*/("""<div class="container">
            <div class="row" >


                <div class="col-xs-12">

                    <h1>Login</h1><br>
                    <p>Enter your e-Mail and Password to login</p>

                    """),_display_(/*24.22*/helper/*24.28*/.form(action = routes.LoginController.authenticate())/*24.81*/ {_display_(Seq[Any](format.raw/*24.83*/("""
                        """),_display_(/*25.26*/helper/*25.32*/.inputText(loginForm("email"), 'id -> "email", '_label -> "E-Mail", 'class -> "form-control")),format.raw/*25.125*/("""
                        """),_display_(/*26.26*/helper/*26.32*/.inputPassword(loginForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*26.118*/("""

                        """),format.raw/*28.25*/("""<button type="submit" value="Login" ><span aria-hidden="true"></span> Login </button>
                    """)))}),format.raw/*29.22*/("""
                """),format.raw/*30.17*/("""</div>
            </div>
        </div>

        <script src=""""),_display_(/*34.23*/routes/*34.29*/.Assets.versioned("lib/jquery/jquery.min.js")),format.raw/*34.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*35.23*/routes/*35.29*/.Assets.versioned("lib/bootstrap/js/bootstrap.min.js")),format.raw/*35.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*36.23*/routes/*36.29*/.Assets.versioned("javascripts/main.js")),format.raw/*36.69*/("""" type="text/javascript"></script>
    </body>
</html>"""))
      }
    }
  }

  def render(loginForm:play.data.Form[models.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((play.data.Form[models.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun May 28 18:13:03 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/login.scala.html
                  HASH: d4e0a6699f9abd1e243203fc8a0aa1776632e3bf
                  MATRIX: 767->1|903->42|931->44|1010->149|1045->158|1145->232|1159->238|1236->294|1318->350|1332->356|1394->397|1482->458|1497->464|1558->503|1620->626|1656->635|1909->861|1924->867|1986->920|2026->922|2079->948|2094->954|2209->1047|2262->1073|2277->1079|2385->1165|2439->1191|2577->1298|2622->1315|2713->1379|2728->1385|2794->1430|2878->1487|2893->1493|2968->1547|3052->1604|3067->1610|3128->1650
                  LINES: 27->1|32->1|34->3|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|44->14|45->15|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|56->26|58->28|59->29|60->30|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36
                  -- GENERATED --
              */
          