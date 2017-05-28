
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newuser_Scope0 {
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

class newuser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.User],List[Projekt],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: play.data.Form[models.User], groups: List[Projekt]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""

"""),_display_(/*3.2*/main("New User")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neuer Benutzer</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.UserController.create())/*12.62*/{_display_(Seq[Any](format.raw/*12.63*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(userForm("firstname"), 'id -> "firstname", '_label -> "Vorname", 'class -> "form-control")),format.raw/*13.121*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(userForm("lastname"), '_label -> "Nachname", 'class -> "form-control")),format.raw/*14.101*/("""
            """),_display_(/*15.14*/helper/*15.20*/.select(userForm("gender"),
                helper.options(Seq("männlich", "weiblich")),
                '_label -> "Geschlecht",
                '_default -> "-- bitte Geschlecht wählen --",
                'class -> "form-control"
            )),format.raw/*20.14*/("""
            """),_display_(/*21.14*/helper/*21.20*/.inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*21.95*/("""
            """),_display_(/*22.14*/helper/*22.20*/.inputPassword(userForm("password"), '_label -> "Passwort", 'class -> "form-control")),format.raw/*22.105*/("""
            """),_display_(/*23.14*/helper/*23.20*/.select(
                field = userForm("groupsholder"),
                options = (groups.map(group => group.getId().toString() -> group.getProjektName())),
                '_label -> "Gruppe",
                'class -> "form-control",
                'multiple -> "Multiple"
            )),format.raw/*29.14*/("""

            """),format.raw/*31.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(userForm:play.data.Form[models.User],groups:List[Projekt]): play.twirl.api.HtmlFormat.Appendable = apply(userForm,groups)

  def f:((play.data.Form[models.User],List[Projekt]) => play.twirl.api.HtmlFormat.Appendable) = (userForm,groups) => apply(userForm,groups)

  def ref: this.type = this

}


}

/**/
object newuser extends newuser_Scope0.newuser
              /*
                  -- GENERATED --
                  DATE: Sun May 28 17:19:11 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/newuser.scala.html
                  HASH: acb755134bc21a5d4e51fa59d5588f7464635846
                  MATRIX: 784->1|941->63|971->68|995->84|1033->85|1065->91|1276->275|1291->281|1346->327|1385->328|1427->343|1442->349|1565->450|1607->465|1622->471|1725->552|1767->567|1782->573|2054->824|2096->839|2111->845|2207->920|2249->935|2264->941|2371->1026|2413->1041|2428->1047|2747->1345|2791->1361|2986->1525|3023->1535
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|60->29|62->31|63->32|64->33
                  -- GENERATED --
              */
          