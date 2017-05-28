
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edituser_Scope0 {
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

class edituser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.User],List[Projekt],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.User], groups: List[Projekt], userid: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.78*/("""

"""),_display_(/*3.2*/main("Mitarbeiter bearbeiten")/*3.32*/{_display_(Seq[Any](format.raw/*3.33*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Mitarbeiter bearbeiten</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.UserController.update(userid))/*12.68*/{_display_(Seq[Any](format.raw/*12.69*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(userForm("firstname"), 'id -> "firstname", '_label -> "Vorname", 'class -> "form-control")),format.raw/*13.121*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(userForm("lastname"), '_label -> "Nachname", 'class -> "form-control")),format.raw/*14.101*/("""
            """),_display_(/*15.14*/helper/*15.20*/.select(userForm("gender"),
                helper.options(Seq("männlich", "weiblich")),
                '_label -> "Geschlecht",
                '_default -> "-- bitte Geschlecht wählen --",
                'class -> "form-control"
            )),format.raw/*20.14*/("""
            """),_display_(/*21.14*/helper/*21.20*/.inputText(userForm("email"), '_label -> "Email", 'class -> "form-control required")),format.raw/*21.104*/("""
            """),_display_(/*22.14*/helper/*22.20*/.inputPassword(userForm("password"), '_label -> "Passwort", 'class -> "form-control")),format.raw/*22.105*/("""
            """),_display_(/*23.14*/helper/*23.20*/.select(
                field = userForm("groupsholder"),
                options = (groups.map(group => group.getId().toString() -> group.getProjektName())),
                '_label -> "Gruppe",
                'class -> "form-control",
                'multiple -> "Multiple"
            )),format.raw/*29.14*/("""

            """),format.raw/*31.13*/("""<button type="submit" class="btn btn-success" value="Aendern" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Ändern </button>
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(userForm:play.data.Form[models.User],groups:List[Projekt],userid:Long): play.twirl.api.HtmlFormat.Appendable = apply(userForm,groups,userid)

  def f:((play.data.Form[models.User],List[Projekt],Long) => play.twirl.api.HtmlFormat.Appendable) = (userForm,groups,userid) => apply(userForm,groups,userid)

  def ref: this.type = this

}


}

/**/
object edituser extends edituser_Scope0.edituser
              /*
                  -- GENERATED --
                  DATE: Sun May 28 23:23:57 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/edituser.scala.html
                  HASH: af932ceecdd972c112b35bf6469d338cd07c5e08
                  MATRIX: 791->1|962->77|990->80|1028->110|1066->111|1097->116|1308->300|1323->306|1384->358|1423->359|1464->373|1479->379|1602->480|1643->494|1658->500|1761->581|1802->595|1817->601|2084->847|2125->861|2140->867|2246->951|2287->965|2302->971|2409->1056|2450->1070|2465->1076|2778->1368|2820->1382|3013->1544|3049->1553
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|60->29|62->31|63->32|64->33
                  -- GENERATED --
              */
          