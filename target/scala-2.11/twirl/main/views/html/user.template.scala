
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
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

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.User,List[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, taskList: List[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/main("Mitarbeiter")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<h1>Detailansicht Mitarbeiter: """),_display_(/*4.37*/user/*4.41*/.getLastname),format.raw/*4.53*/("""</h1>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>Vorname</th>
                <th>Nachname</th>
                <th>E-Mail</th>
                <th>Geschlecht</th>
                <th>Projekte</th>
                <th>Bearbeiten</th>
                <th>Löschen</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>"""),_display_(/*20.22*/user/*20.26*/.getFirstname),format.raw/*20.39*/("""</td>
                <td>"""),_display_(/*21.22*/user/*21.26*/.getLastname),format.raw/*21.38*/("""</td>
                <td>"""),_display_(/*22.22*/user/*22.26*/.getEmail),format.raw/*22.35*/("""</td>
                <td>"""),_display_(/*23.22*/user/*23.26*/.getGender),format.raw/*23.36*/("""</td>
                <td>
                """),_display_(/*25.18*/for(tmpGroup <- user.getGroupList()) yield /*25.54*/ {_display_(Seq[Any](format.raw/*25.56*/("""
                    """),format.raw/*26.21*/("""<li><a href="/projekt/"""),_display_(/*26.44*/tmpGroup/*26.52*/.getId),format.raw/*26.58*/("""">"""),_display_(/*26.61*/tmpGroup/*26.69*/.getProjektName()),format.raw/*26.86*/("""</a></li>
                """)))}),format.raw/*27.18*/("""
                """),format.raw/*28.17*/("""</td>

                <td><a href="/edituser/"""),_display_(/*30.41*/user/*30.45*/.getId),format.raw/*30.51*/("""" class="btn btn-default"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </a></td>
                <td><a href="/deleteuser/"""),_display_(/*31.43*/user/*31.47*/.getId()),format.raw/*31.55*/("""" class="btn btn-danger" onclick="return confirm('Mitarbeiter samt zugehöriger Tasks wird gelöscht!');"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a></td>
            </tr>

        </tbody>
    </table>

    """),_display_(/*37.6*/if(user.getTaskList.isEmpty)/*37.34*/ {_display_(Seq[Any](format.raw/*37.36*/("""
        """),format.raw/*38.9*/("""<h2>Dem Mitarbeiter sind keine Projekte oder Tasks zugeordnet</h2>
    """)))}/*39.7*/else/*39.12*/{_display_(Seq[Any](format.raw/*39.13*/("""
        """),format.raw/*40.9*/("""<h2>Aufstellung beteiliger Projekte/Tasks/Arbeitszeiten:</h2>

        <div class="row">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Taskname</th>
                        <th>Task Dauer (Minuten)</th>
                        <th>zu Projekt</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*52.18*/for(task <- user.getTaskList) yield /*52.47*/ {_display_(Seq[Any](format.raw/*52.49*/("""
                    """),format.raw/*53.21*/("""<tr>
                        <td><a href="/task/"""),_display_(/*54.45*/task/*54.49*/.getId),format.raw/*54.55*/("""">"""),_display_(/*54.58*/task/*54.62*/.getTaskName),format.raw/*54.74*/("""</a></td>
                        <td>"""),_display_(/*55.30*/task/*55.34*/.getDuration),format.raw/*55.46*/("""</td>
                        <td><a href="projekt/"""),_display_(/*56.47*/task/*56.51*/.getProjekt.getId),format.raw/*56.68*/("""">"""),_display_(/*56.71*/task/*56.75*/.getProjekt.getProjektName),format.raw/*56.101*/("""</a></td>
                    </tr>
                """)))}),format.raw/*58.18*/("""

                """),format.raw/*60.17*/("""</tbody>
            </table>


            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Projekt</th>
                        <th>Anzahl Tasks</th>
                        <th>Arbeitszeit in Projekt gesamt</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*73.18*/for(projekt <- user.getGroupList) yield /*73.51*/ {_display_(Seq[Any](format.raw/*73.53*/("""
                    """),format.raw/*74.21*/("""<tr>
                        <td><a href="projekt/"""),_display_(/*75.47*/projekt/*75.54*/.getId),format.raw/*75.60*/("""">"""),_display_(/*75.63*/projekt/*75.70*/.getProjektName),format.raw/*75.85*/("""</a></td>
                        <td>"""),_display_(/*76.30*/user/*76.34*/.getAmountOfTasksRelatedToOneProjekt(projekt)),format.raw/*76.79*/("""</td>
                        <td>"""),_display_(/*77.30*/user/*77.34*/.getDurationOfTasksRelatedToOneProjekt(projekt)),format.raw/*77.81*/("""</td>

                    </tr>
                """)))}),format.raw/*80.18*/("""

                """),format.raw/*82.17*/("""</tbody>
            </table>

            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Anzahl der zugeteilten Projekten</th>
                        <th>Anzahl aller Tasks</th>
                        <th>Dauer aller Tasks</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>"""),_display_(/*95.30*/user/*95.34*/.getGroupList.size()),format.raw/*95.54*/("""</td>
                        <td>"""),_display_(/*96.30*/user/*96.34*/.getTaskList.size()),format.raw/*96.53*/("""</td>
                        <td>"""),_display_(/*97.30*/user/*97.34*/.getDurationOfAllRelatedTasks),format.raw/*97.63*/("""</td>
                    </tr>
                </tbody>
            </table>

        </div>

    """)))}),format.raw/*104.6*/("""
""")))}))
      }
    }
  }

  def render(user:models.User,taskList:List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(user,taskList)

  def f:((models.User,List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (user,taskList) => apply(user,taskList)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Tue May 30 22:33:01 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/user.scala.html
                  HASH: af83473c2771eb15bc1853c237d736b0977c0a70
                  MATRIX: 759->1|895->42|925->47|952->66|991->68|1023->74|1081->106|1093->110|1125->122|1575->545|1588->549|1622->562|1677->590|1690->594|1723->606|1778->634|1791->638|1821->647|1876->675|1889->679|1920->689|1993->735|2045->771|2085->773|2135->795|2185->818|2202->826|2229->832|2259->835|2276->843|2314->860|2373->888|2419->906|2495->955|2508->959|2535->965|2709->1112|2722->1116|2751->1124|3020->1367|3057->1395|3097->1397|3134->1407|3225->1481|3238->1486|3277->1487|3314->1497|3771->1927|3816->1956|3856->1958|3906->1980|3983->2030|3996->2034|4023->2040|4053->2043|4066->2047|4099->2059|4166->2099|4179->2103|4212->2115|4292->2168|4305->2172|4343->2189|4373->2192|4386->2196|4434->2222|4520->2277|4568->2297|4979->2681|5028->2714|5068->2716|5118->2738|5197->2790|5213->2797|5240->2803|5270->2806|5286->2813|5322->2828|5389->2868|5402->2872|5468->2917|5531->2953|5544->2957|5612->3004|5696->3057|5744->3077|6210->3516|6223->3520|6264->3540|6327->3576|6340->3580|6380->3599|6443->3635|6456->3639|6506->3668|6644->3775
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|59->28|61->30|61->30|61->30|62->31|62->31|62->31|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|83->52|83->52|83->52|84->53|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|89->58|91->60|104->73|104->73|104->73|105->74|106->75|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|111->80|113->82|126->95|126->95|126->95|127->96|127->96|127->96|128->97|128->97|128->97|135->104
                  -- GENERATED --
              */
          