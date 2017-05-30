
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editprojekt_Scope0 {
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

class editprojekt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Projekt],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projektForm: Form[Projekt], id: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.40*/("""

"""),_display_(/*3.2*/main("Projekt bearbeiten")/*3.28*/{_display_(Seq[Any](format.raw/*3.29*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Projekt bearbeiten</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.ProjektController.update(id))/*12.67*/{_display_(Seq[Any](format.raw/*12.68*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(projektForm("projektName"), 'id -> "projektName", '_label -> "Projektname", 'class -> "form-control")),format.raw/*13.132*/("""
            """),format.raw/*14.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Ändern </button>
            <button type="reset" class="btn btn-danger" value="Reset" ><span class="glyphicon glyphicon-repeat" aria-hidden="true"></span> Zurücksetzen </button>

        """)))}),format.raw/*17.10*/("""
        """),format.raw/*18.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(projektForm:Form[Projekt],id:Long): play.twirl.api.HtmlFormat.Appendable = apply(projektForm,id)

  def f:((Form[Projekt],Long) => play.twirl.api.HtmlFormat.Appendable) = (projektForm,id) => apply(projektForm,id)

  def ref: this.type = this

}


}

/**/
object editprojekt extends editprojekt_Scope0.editprojekt
              /*
                  -- GENERATED --
                  DATE: Tue May 30 21:00:23 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/editprojekt.scala.html
                  HASH: e35be4982b7f57057b12538aa6da007d7444daf5
                  MATRIX: 769->1|902->39|930->42|964->68|1002->69|1033->74|1240->254|1255->260|1315->311|1354->312|1395->326|1410->332|1544->444|1585->457|1941->782|1977->791
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|48->17|49->18
                  -- GENERATED --
              */
          