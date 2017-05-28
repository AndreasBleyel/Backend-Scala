
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

"""),_display_(/*3.2*/main("Mitarbeiter")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<h1>Details """),_display_(/*4.18*/user/*4.22*/.getLastname),format.raw/*4.34*/("""</h1>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>Vorname</th>
                <th>Nachname</th>
                <th>E-Mail</th>
                <th>Geschlecht</th>
                <th>Projekte</th>
                <th>Aufgaben</th>
                <th>Bearbeiten</th>
                <th>Löschen</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>"""),_display_(/*21.22*/user/*21.26*/.getFirstname),format.raw/*21.39*/("""</td>
                <td>"""),_display_(/*22.22*/user/*22.26*/.getLastname),format.raw/*22.38*/("""</td>
                <td>"""),_display_(/*23.22*/user/*23.26*/.getEmail),format.raw/*23.35*/("""</td>
                <td>"""),_display_(/*24.22*/user/*24.26*/.getGender),format.raw/*24.36*/("""</td>
                <td>
                    """),_display_(/*26.22*/for(tmpGroup <- user.getGroupList()) yield /*26.58*/ {_display_(Seq[Any](format.raw/*26.60*/("""
                        """),format.raw/*27.25*/("""<li><a href="/projekt/"""),_display_(/*27.48*/tmpGroup/*27.56*/.getId),format.raw/*27.62*/("""">"""),_display_(/*27.65*/tmpGroup/*27.73*/.getProjektName()),format.raw/*27.90*/("""</a></li>
                    """)))}),format.raw/*28.22*/("""
                """),format.raw/*29.17*/("""</td>
                <td>
                    """),_display_(/*31.22*/for(tmpTask <- taskList) yield /*31.46*/{_display_(Seq[Any](format.raw/*31.47*/("""
                        """),format.raw/*32.25*/("""<li><a href="/task/"""),_display_(/*32.45*/tmpTask/*32.52*/.getId),format.raw/*32.58*/("""">"""),_display_(/*32.61*/tmpTask),format.raw/*32.68*/("""</a></li>
                    """)))}),format.raw/*33.22*/("""
                """),format.raw/*34.17*/("""</td>
                <td><a href="/edituser/"""),_display_(/*35.41*/user/*35.45*/.getId),format.raw/*35.51*/("""" class="btn btn-default"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </a>
                <td><a href="/deleteuser/"""),_display_(/*36.43*/user/*36.47*/.getId()),format.raw/*36.55*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a>
                </td>
            </tr>

        </tbody>
    </table>
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
                  DATE: Sun May 28 22:25:17 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/user.scala.html
                  HASH: 12b17f68dfcb36b405ca7e182ac662e414a0ef7c
                  MATRIX: 759->1|895->42|925->47|952->66|990->67|1022->73|1061->86|1073->90|1105->102|1590->560|1603->564|1637->577|1692->605|1705->609|1738->621|1793->649|1806->653|1836->662|1891->690|1904->694|1935->704|2012->754|2064->790|2104->792|2158->818|2208->841|2225->849|2252->855|2282->858|2299->866|2337->883|2400->915|2446->933|2523->983|2563->1007|2602->1008|2656->1034|2703->1054|2719->1061|2746->1067|2776->1070|2804->1077|2867->1109|2913->1127|2987->1174|3000->1178|3027->1184|3196->1326|3209->1330|3238->1338
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|60->29|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36
                  -- GENERATED --
              */
          