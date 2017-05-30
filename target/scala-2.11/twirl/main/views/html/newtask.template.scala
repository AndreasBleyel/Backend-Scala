
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newtask_Scope0 {
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

class newtask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Task],List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taskForm: Form[Task], userList: List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.46*/("""

"""),_display_(/*3.2*/main("Neues Task")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neues Task</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.TaskController.create())/*12.62*/{_display_(Seq[Any](format.raw/*12.63*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(taskForm("taskName"), 'id -> "taskName", '_label -> "Taskname", 'class -> "form-control")),format.raw/*13.120*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(taskForm("duration"), 'id -> "duration", '_label -> "Dauer der Aufgabe (in Minuten ohne Komma)", 'class -> "form-control")),format.raw/*14.153*/("""

            """),format.raw/*16.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>

    """),_display_(/*18.6*/helper/*18.12*/.select(
        field = taskForm("tempUser"),
        options = (userList.map(user => user.getId().toString -> user.userVorNachname())),
        '_label -> "zugeteilt zu Mitarbeiter",
        'class -> "form-control"
    )),format.raw/*23.6*/("""
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(taskForm:Form[Task],userList:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(taskForm,userList)

  def f:((Form[Task],List[User]) => play.twirl.api.HtmlFormat.Appendable) = (taskForm,userList) => apply(taskForm,userList)

  def ref: this.type = this

}


}

/**/
object newtask extends newtask_Scope0.newtask
              /*
                  -- GENERATED --
                  DATE: Tue May 30 21:08:08 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/newtask.scala.html
                  HASH: 165d70482c3a79376c8b10a2247ee9c3840f879c
                  MATRIX: 764->1|903->45|931->48|957->66|995->67|1026->72|1225->244|1240->250|1295->296|1334->297|1375->311|1390->317|1512->417|1553->431|1568->437|1723->570|1765->584|1951->744|1966->750|2209->973|2250->983|2286->992
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|49->18|49->18|54->23|55->24|56->25
                  -- GENERATED --
              */
          