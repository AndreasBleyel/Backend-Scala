
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userlist_Scope0 {
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

class userlist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userList: List[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

    """),_display_(/*3.6*/main("Alle Mitarbeiter")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
        """),format.raw/*4.9*/("""<h1>Alle Mitarbeiter</h1>


        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Vorname</th>
                    <th>Nachname</th>
                    <th>E-Mail</th>
                    <th>Details</th>
                    <th>Löschen</th>
                </tr>
            </thead>
            <tbody>
            """),_display_(/*18.14*/for(user <- userList) yield /*18.35*/ {_display_(Seq[Any](format.raw/*18.37*/("""
                """),format.raw/*19.17*/("""<tr>
                    <td>"""),_display_(/*20.26*/user/*20.30*/.getFirstname),format.raw/*20.43*/("""</td>
                    <td>"""),_display_(/*21.26*/user/*21.30*/.getLastname),format.raw/*21.42*/("""</td>
                    <td>"""),_display_(/*22.26*/user/*22.30*/.getEmail),format.raw/*22.39*/("""</td>

                    <td><a href="/user/"""),_display_(/*24.41*/user/*24.45*/.getId()),format.raw/*24.53*/("""" class="details-button"><span class="glyphicon glyphicon-plus"></span></a></td>
                    <td><a href="/deleteuser/"""),_display_(/*25.47*/user/*25.51*/.getId()),format.raw/*25.59*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a>
                    </td>
                </tr>
            """)))}),format.raw/*28.14*/("""
            """),format.raw/*29.13*/("""</tbody>
        </table>
    """)))}),format.raw/*31.6*/("""

"""))
      }
    }
  }

  def render(userList:List[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(userList)

  def f:((List[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (userList) => apply(userList)

  def ref: this.type = this

}


}

/**/
object userlist extends userlist_Scope0.userlist
              /*
                  -- GENERATED --
                  DATE: Sun May 28 21:20:12 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/userlist.scala.html
                  HASH: 578199f30337c0168163f0dcd54486ca4083df01
                  MATRIX: 762->1|886->30|920->39|952->63|991->65|1027->75|1442->463|1479->484|1519->486|1565->504|1623->535|1636->539|1670->552|1729->584|1742->588|1775->600|1834->632|1847->636|1877->645|1953->694|1966->698|1995->706|2150->834|2163->838|2192->846|2385->1008|2427->1022|2490->1055
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|59->28|60->29|62->31
                  -- GENERATED --
              */
          