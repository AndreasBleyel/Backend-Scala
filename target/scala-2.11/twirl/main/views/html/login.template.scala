
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

                    """),_display_(/*23.22*/helper/*23.28*/.form(action = routes.LoginController.authenticate())/*23.81*/ {_display_(Seq[Any](format.raw/*23.83*/("""
                        """),_display_(/*24.26*/helper/*24.32*/.inputText(loginForm("email"), 'id -> "email", '_label -> "E-Mail", 'class -> "form-control")),format.raw/*24.125*/("""
                        """),_display_(/*25.26*/helper/*25.32*/.inputPassword(loginForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*25.118*/("""

                        """),format.raw/*27.25*/("""<button type="submit" value="Login" ><span aria-hidden="true"></span> Login </button>
                    """)))}),format.raw/*28.22*/("""
                """),format.raw/*29.17*/("""</div>
            </div>
        </div>

        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.versioned("lib/jquery/jquery.min.js")),format.raw/*33.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*34.23*/routes/*34.29*/.Assets.versioned("lib/bootstrap/js/bootstrap.min.js")),format.raw/*34.83*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*35.23*/routes/*35.29*/.Assets.versioned("javascripts/main.js")),format.raw/*35.69*/("""" type="text/javascript"></script>
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
                  DATE: Mon May 29 22:16:38 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/login.scala.html
                  HASH: b95269b1bdf17bb77c4c9bf62c6e9cc02e267add
                  MATRIX: 767->1|903->42|931->44|1010->149|1045->158|1145->232|1159->238|1236->294|1318->350|1332->356|1394->397|1482->458|1497->464|1558->503|1620->626|1656->635|1842->794|1857->800|1919->853|1959->855|2012->881|2027->887|2142->980|2195->1006|2210->1012|2318->1098|2372->1124|2510->1231|2555->1248|2646->1312|2661->1318|2727->1363|2811->1420|2826->1426|2901->1480|2985->1537|3000->1543|3061->1583
                  LINES: 27->1|32->1|34->3|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|44->14|45->15|53->23|53->23|53->23|53->23|54->24|54->24|54->24|55->25|55->25|55->25|57->27|58->28|59->29|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35
                  -- GENERATED --
              */
          