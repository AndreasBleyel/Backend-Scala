
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object projekt_Scope0 {
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

class projekt extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Projekt,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projekt: models.Projekt):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.27*/("""

"""),_display_(/*3.2*/main("Projekt")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""

    """),format.raw/*5.5*/("""<h1>Detailansicht Projekt: """),_display_(/*5.33*/projekt/*5.40*/.getProjektName),format.raw/*5.55*/("""</h1>
    <div class="row">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Kunde</th>
                    <th>Mitarbeiter</th>
                    <th>Bearbeiten</th>
                    <th>Löschen</th>
                </tr>
            </thead>
            <tbody>

                <tr>
                    <td>"""),_display_(/*21.26*/projekt/*21.33*/.getId),format.raw/*21.39*/("""</td>
                    <td>"""),_display_(/*22.26*/projekt/*22.33*/.getProjektName),format.raw/*22.48*/("""</td>

                    <td>
                    """),_display_(/*25.22*/if(projekt.getCustomer == null)/*25.53*/ {_display_(Seq[Any](format.raw/*25.55*/("""
                        """),format.raw/*26.25*/("""Kein Kunde zugeteilt
                    """)))}/*27.23*/else/*27.28*/{_display_(Seq[Any](format.raw/*27.29*/("""
                        """),format.raw/*28.25*/("""<a href="/customer/"""),_display_(/*28.45*/projekt/*28.52*/.getCustomer.getId),format.raw/*28.70*/("""">"""),_display_(/*28.73*/projekt/*28.80*/.getCustomer),format.raw/*28.92*/("""</a></td>
                    """)))}),format.raw/*29.22*/("""<td>
                """),_display_(/*30.18*/if(projekt.getUserList().isEmpty)/*30.51*/ {_display_(Seq[Any](format.raw/*30.53*/("""
                    """),format.raw/*31.21*/("""Kein Mitarbeiter zugeteilt
                """)))}/*32.19*/else/*32.24*/{_display_(Seq[Any](format.raw/*32.25*/("""
                    """),_display_(/*33.22*/for(mitarbeiter <- projekt.getUserList()) yield /*33.63*/ {_display_(Seq[Any](format.raw/*33.65*/("""
                        """),format.raw/*34.25*/("""<li><a href="/user/"""),_display_(/*34.45*/mitarbeiter/*34.56*/.getId),format.raw/*34.62*/("""">"""),_display_(/*34.65*/mitarbeiter/*34.76*/.getLastname),format.raw/*34.88*/("""</a></li>
                    """)))}),format.raw/*35.22*/("""
                """)))}),format.raw/*36.18*/("""
                """),format.raw/*37.17*/("""</td>
                    <td><a href="/editprojekt/"""),_display_(/*38.48*/projekt/*38.55*/.getId()),format.raw/*38.63*/("""" class="details-button"><span class="glyphicon glyphicon-pencil"></span></a></td>
                    <td><a href="/deleteprojekt/"""),_display_(/*39.50*/projekt/*39.57*/.getId()),format.raw/*39.65*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a>
                    </td>
                </tr>

            </tbody>
        </table>
    </div>

    """),_display_(/*47.6*/if(projekt.getTaskList.isEmpty)/*47.37*/ {_display_(Seq[Any](format.raw/*47.39*/("""
        """),format.raw/*48.9*/("""<h2>Dem Projekt sind keine Tasks zugeordnet</h2>
    """)))}/*49.7*/else/*49.12*/{_display_(Seq[Any](format.raw/*49.13*/("""
        """),format.raw/*50.9*/("""<h2>zugehörige Tasks</h2>

        <div class="row">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Taskname</th>
                        <th>Task Dauer (Minuten)</th>
                        <th>Bearbeiter</th>
                    </tr>
                </thead>
                <tbody>
                    """),_display_(/*62.22*/for(task <- projekt.getTaskList) yield /*62.54*/ {_display_(Seq[Any](format.raw/*62.56*/("""
                        """),format.raw/*63.25*/("""<tr>
                            <td><a href="/task/"""),_display_(/*64.49*/task/*64.53*/.getId),format.raw/*64.59*/("""">"""),_display_(/*64.62*/task/*64.66*/.getTaskName),format.raw/*64.78*/("""</a></td>
                            <td>"""),_display_(/*65.34*/task/*65.38*/.getDuration),format.raw/*65.50*/("""</td>
                            <td><a href="/user/"""),_display_(/*66.49*/task/*66.53*/.getUser.getId),format.raw/*66.67*/("""">"""),_display_(/*66.70*/task/*66.74*/.getUser),format.raw/*66.82*/("""</a></td>
                        </tr>
                    """)))}),format.raw/*68.22*/("""

                """),format.raw/*70.17*/("""</tbody>
            </table>

            <p>Summe aller Tasks: """),_display_(/*73.36*/projekt/*73.43*/.getTaskList.size()),format.raw/*73.62*/("""</p>
            <p>Dauer aller Tasks: """),_display_(/*74.36*/projekt/*74.43*/.getDurationOfAllRelatedTasks),format.raw/*74.72*/(""" """),format.raw/*74.73*/("""Stunden</p>
        </div>

    """)))}),format.raw/*77.6*/("""
""")))}))
      }
    }
  }

  def render(projekt:models.Projekt): play.twirl.api.HtmlFormat.Appendable = apply(projekt)

  def f:((models.Projekt) => play.twirl.api.HtmlFormat.Appendable) = (projekt) => apply(projekt)

  def ref: this.type = this

}


}

/**/
object projekt extends projekt_Scope0.projekt
              /*
                  -- GENERATED --
                  DATE: Tue May 30 22:15:40 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/projekt.scala.html
                  HASH: 7287ff6d0df68287e177bce3d630b451c1307d8a
                  MATRIX: 757->1|877->26|905->29|928->44|967->46|999->52|1053->80|1068->87|1103->102|1572->544|1588->551|1615->557|1673->588|1689->595|1725->610|1805->663|1845->694|1885->696|1938->721|1999->764|2012->769|2051->770|2104->795|2151->815|2167->822|2206->840|2236->843|2252->850|2285->862|2347->893|2396->915|2438->948|2478->950|2527->971|2590->1016|2603->1021|2642->1022|2691->1044|2748->1085|2788->1087|2841->1112|2888->1132|2908->1143|2935->1149|2965->1152|2985->1163|3018->1175|3080->1206|3129->1224|3174->1241|3254->1294|3270->1301|3299->1309|3458->1441|3474->1448|3503->1456|3731->1658|3771->1689|3811->1691|3847->1700|3919->1755|3932->1760|3971->1761|4007->1770|4420->2156|4468->2188|4508->2190|4561->2215|4641->2268|4654->2272|4681->2278|4711->2281|4724->2285|4757->2297|4827->2340|4840->2344|4873->2356|4954->2410|4967->2414|5002->2428|5032->2431|5045->2435|5074->2443|5166->2504|5212->2522|5305->2588|5321->2595|5361->2614|5428->2654|5444->2661|5494->2690|5523->2691|5586->2724
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|65->34|65->34|66->35|67->36|68->37|69->38|69->38|69->38|70->39|70->39|70->39|78->47|78->47|78->47|79->48|80->49|80->49|80->49|81->50|93->62|93->62|93->62|94->63|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|99->68|101->70|104->73|104->73|104->73|105->74|105->74|105->74|105->74|108->77
                  -- GENERATED --
              */
          