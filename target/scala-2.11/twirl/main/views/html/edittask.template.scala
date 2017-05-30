
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object edittask_Scope0 {
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

class edittask extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[Task],List[User],List[Projekt],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taskForm: Form[Task], userList: List[User], projektList: List[Projekt], id: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.84*/("""

"""),_display_(/*3.2*/main("Task bearbeiten")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Task bearbeiten</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.TaskController.update(id))/*12.64*/{_display_(Seq[Any](format.raw/*12.65*/("""
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

            """),format.raw/*30.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
            <button type="reset" class="btn btn-danger" value="Reset" ><span class="glyphicon glyphicon-repeat" aria-hidden="true"></span> Zurücksetzen </button>
        """)))}),format.raw/*32.10*/("""
        """),format.raw/*33.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(taskForm:Form[Task],userList:List[User],projektList:List[Projekt],id:Long): play.twirl.api.HtmlFormat.Appendable = apply(taskForm,userList,projektList,id)

  def f:((Form[Task],List[User],List[Projekt],Long) => play.twirl.api.HtmlFormat.Appendable) = (taskForm,userList,projektList,id) => apply(taskForm,userList,projektList,id)

  def ref: this.type = this

}


}

/**/
object edittask extends edittask_Scope0.edittask
              /*
                  -- GENERATED --
                  DATE: Tue May 30 21:37:47 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/edittask.scala.html
                  HASH: 64d242118d737d93590ab2f77e101b12346a8376
                  MATRIX: 785->1|962->83|990->86|1021->109|1059->110|1090->115|1294->292|1309->298|1366->346|1405->347|1446->361|1461->367|1583->467|1624->481|1639->487|1794->620|1836->635|1851->641|2135->904|2177->919|2192->925|2486->1198|2528->1212|2884->1537|2920->1546
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|47->16|52->21|54->23|54->23|59->28|61->30|63->32|64->33
                  -- GENERATED --
              */
          