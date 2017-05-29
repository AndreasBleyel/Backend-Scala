
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
                """),_display_(/*26.18*/for(tmpGroup <- user.getGroupList()) yield /*26.54*/ {_display_(Seq[Any](format.raw/*26.56*/("""
                    """),format.raw/*27.21*/("""<li><a href="/projekt/"""),_display_(/*27.44*/tmpGroup/*27.52*/.getId),format.raw/*27.58*/("""">"""),_display_(/*27.61*/tmpGroup/*27.69*/.getProjektName()),format.raw/*27.86*/("""</a></li>
                """)))}),format.raw/*28.18*/("""
                """),format.raw/*29.17*/("""</td>
                <td>
                """),_display_(/*31.18*/for(tmpTask <- taskList) yield /*31.42*/ {_display_(Seq[Any](format.raw/*31.44*/("""
                    """),format.raw/*32.21*/("""<li><a href="/task/"""),_display_(/*32.41*/tmpTask/*32.48*/.getId),format.raw/*32.54*/("""">"""),_display_(/*32.57*/tmpTask),format.raw/*32.64*/("""</a></li>
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""</td>
                <td><a href="/edituser/"""),_display_(/*35.41*/user/*35.45*/.getId),format.raw/*35.51*/("""" class="btn btn-default"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </a></td>
                <td><a href="/deleteuser/"""),_display_(/*36.43*/user/*36.47*/.getId()),format.raw/*36.55*/("""" class="btn btn-danger" onclick="return confirm('Mitarbeiter samt zugehöriger Tasks wird gelöscht!');"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a></td>
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
                  DATE: Mon May 29 19:47:04 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/user.scala.html
                  HASH: 41f9bb06841af920349be612808e7db00fdb0553
                  MATRIX: 759->1|895->42|925->47|952->66|991->68|1023->74|1062->87|1074->91|1106->103|1591->561|1604->565|1638->578|1693->606|1706->610|1739->622|1794->650|1807->654|1837->663|1892->691|1905->695|1936->705|2009->751|2061->787|2101->789|2151->811|2201->834|2218->842|2245->848|2275->851|2292->859|2330->876|2389->904|2435->922|2508->968|2548->992|2588->994|2638->1016|2685->1036|2701->1043|2728->1049|2758->1052|2786->1059|2845->1087|2891->1105|2965->1152|2978->1156|3005->1162|3179->1309|3192->1313|3221->1321
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|60->29|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36
                  -- GENERATED --
              */
          