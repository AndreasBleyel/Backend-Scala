
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

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

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
                        <td><a href="/projekt/"""),_display_(/*56.48*/task/*56.52*/.getProjekt.getId),format.raw/*56.69*/("""">"""),_display_(/*56.72*/task/*56.76*/.getProjekt.getProjektName),format.raw/*56.102*/("""</a></td>
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

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Tue May 30 22:50:16 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/user.scala.html
                  HASH: d81cfd38a4b8d99ced11793b5c4178f47303afd5
                  MATRIX: 748->1|862->20|892->25|919->44|958->46|990->52|1048->84|1060->88|1092->100|1542->523|1555->527|1589->540|1644->568|1657->572|1690->584|1745->612|1758->616|1788->625|1843->653|1856->657|1887->667|1960->713|2012->749|2052->751|2102->773|2152->796|2169->804|2196->810|2226->813|2243->821|2281->838|2340->866|2386->884|2462->933|2475->937|2502->943|2676->1090|2689->1094|2718->1102|2987->1345|3024->1373|3064->1375|3101->1385|3192->1459|3205->1464|3244->1465|3281->1475|3738->1905|3783->1934|3823->1936|3873->1958|3950->2008|3963->2012|3990->2018|4020->2021|4033->2025|4066->2037|4133->2077|4146->2081|4179->2093|4260->2147|4273->2151|4311->2168|4341->2171|4354->2175|4402->2201|4488->2256|4536->2276|4947->2660|4996->2693|5036->2695|5086->2717|5165->2769|5181->2776|5208->2782|5238->2785|5254->2792|5290->2807|5357->2847|5370->2851|5436->2896|5499->2932|5512->2936|5580->2983|5664->3036|5712->3056|6178->3495|6191->3499|6232->3519|6295->3555|6308->3559|6348->3578|6411->3614|6424->3618|6474->3647|6612->3754
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|59->28|61->30|61->30|61->30|62->31|62->31|62->31|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|83->52|83->52|83->52|84->53|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|89->58|91->60|104->73|104->73|104->73|105->74|106->75|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|111->80|113->82|126->95|126->95|126->95|127->96|127->96|127->96|128->97|128->97|128->97|135->104
                  -- GENERATED --
              */
          