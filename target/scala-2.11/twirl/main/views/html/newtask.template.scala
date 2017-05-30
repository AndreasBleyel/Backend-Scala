
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

class newtask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Task],List[User],List[Projekt],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taskForm: Form[Task], userList: List[User], projektList: List[Projekt]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.74*/("""

"""),_display_(/*3.2*/main("Neuer Task")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neuer Task</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.TaskController.create())/*12.62*/ {_display_(Seq[Any](format.raw/*12.64*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(taskForm("taskName"), 'id -> "taskName", '_label -> "Taskname", 'class -> "form-control")),format.raw/*13.120*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(taskForm("duration"), 'id -> "duration", '_label -> "Dauer der Aufgabe (in Minuten ohne Komma)", 'class -> "form-control")),format.raw/*14.153*/("""

            """),_display_(/*16.14*/helper/*16.20*/.select(
                field = taskForm("tempUser"),
                options = (userList.map(user => user.getId().toString -> user.userVorNachname())),
                '_label -> "zugeteilt zu Mitarbeiter",
                'class -> "form-control"
            )),format.raw/*21.14*/("""

            """),_display_(/*23.14*/helper/*23.20*/.select(
                field = taskForm("tempProjekt"),
                options = (projektList.map(projekt => projekt.getId().toString -> projekt.getProjektName())),
                '_label -> "zugeteilt zu Projekt",
                'class -> "form-control"
            )),format.raw/*28.14*/("""

            """),format.raw/*30.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>
                Anlegen </button>
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(taskForm:Form[Task],userList:List[User],projektList:List[Projekt]): play.twirl.api.HtmlFormat.Appendable = apply(taskForm,userList,projektList)

  def f:((Form[Task],List[User],List[Projekt]) => play.twirl.api.HtmlFormat.Appendable) = (taskForm,userList,projektList) => apply(taskForm,userList,projektList)

  def ref: this.type = this

}


}

/**/
object newtask extends newtask_Scope0.newtask
              /*
                  -- GENERATED --
                  DATE: Tue May 30 21:37:47 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/newtask.scala.html
                  HASH: f75d1e74033c10ff9cb80a920eff8f561728bded
                  MATRIX: 778->1|945->73|973->76|999->94|1038->96|1069->101|1268->273|1283->279|1338->325|1378->327|1419->341|1434->347|1556->447|1597->461|1612->467|1767->600|1809->615|1824->621|2108->884|2150->899|2165->905|2459->1178|2501->1192|2711->1371|2747->1380
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|47->16|52->21|54->23|54->23|59->28|61->30|63->32|64->33
                  -- GENERATED --
              */
          