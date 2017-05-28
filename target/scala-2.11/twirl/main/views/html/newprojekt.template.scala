
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newprojekt_Scope0 {
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

class newprojekt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Projekt],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projektForm: Form[Projekt]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Neues Projekt")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neues Projekt</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.ProjektController.create())/*12.65*/{_display_(Seq[Any](format.raw/*12.66*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(projektForm("projektName"), 'id -> "projektName", '_label -> "Projektname", 'class -> "form-control")),format.raw/*13.132*/("""
            """),format.raw/*14.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*15.10*/("""
        """),format.raw/*16.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(projektForm:Form[Projekt]): play.twirl.api.HtmlFormat.Appendable = apply(projektForm)

  def f:((Form[Projekt]) => play.twirl.api.HtmlFormat.Appendable) = (projektForm) => apply(projektForm)

  def ref: this.type = this

}


}

/**/
object newprojekt extends newprojekt_Scope0.newprojekt
              /*
                  -- GENERATED --
                  DATE: Sun May 28 17:19:11 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/newprojekt.scala.html
                  HASH: bdac647092bfd16b6fae0c9ba2aa8a05701ddb90
                  MATRIX: 762->1|885->29|915->34|944->55|982->56|1014->62|1224->245|1239->251|1297->300|1336->301|1378->316|1393->322|1527->434|1569->448|1764->612|1801->622
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|46->15|47->16
                  -- GENERATED --
              */
          