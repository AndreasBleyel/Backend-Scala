
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customerlist_Scope0 {
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

class customerlist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerList: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/("""

"""),_display_(/*3.2*/main("Alle Kunden")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<h1>Alle Kunden</h1>


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
        """),_display_(/*18.10*/for(customer <- customerList) yield /*18.39*/ {_display_(Seq[Any](format.raw/*18.41*/("""
            """),format.raw/*19.13*/("""<tr>
                <td>"""),_display_(/*20.22*/customer/*20.30*/.getFirstname),format.raw/*20.43*/("""</td>
                <td>"""),_display_(/*21.22*/customer/*21.30*/.getLastname),format.raw/*21.42*/("""</td>
                <td>"""),_display_(/*22.22*/customer/*22.30*/.getEmail),format.raw/*22.39*/("""</td>

                <td><a href="/customer/"""),_display_(/*24.41*/customer/*24.49*/.getId()),format.raw/*24.57*/("""" class="details-button"><span class="glyphicon glyphicon-plus"></span></a></td>
                <td><a href="/deletecustomer/"""),_display_(/*25.47*/customer/*25.55*/.getId()),format.raw/*25.63*/("""" class="btn btn-danger" onclick="return confirm('Kunde wird gelöscht!');"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></a></td>
            </tr>
        """)))}),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""</tbody>
    </table>
""")))}),format.raw/*30.2*/("""

"""))
      }
    }
  }

  def render(customerList:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerList)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerList) => apply(customerList)

  def ref: this.type = this

}


}

/**/
object customerlist extends customerlist_Scope0.customerlist
              /*
                  -- GENERATED --
                  DATE: Mon May 29 21:09:20 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/customerlist.scala.html
                  HASH: c15e12b7769acd2bcdf7bf1a281968e8fbb59528
                  MATRIX: 774->1|906->38|934->41|961->60|1000->62|1031->67|1379->388|1424->417|1464->419|1505->432|1558->458|1575->466|1609->479|1663->506|1680->514|1713->526|1767->553|1784->561|1814->570|1888->617|1905->625|1934->633|2088->760|2105->768|2134->776|2344->955|2380->964|2433->987
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|56->25|56->25|56->25|58->27|59->28|61->30
                  -- GENERATED --
              */
          