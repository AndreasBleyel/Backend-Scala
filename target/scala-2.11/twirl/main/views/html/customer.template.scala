
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object customer_Scope0 {
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

class customer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),_display_(/*3.2*/main("Kunde")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
    """),format.raw/*4.5*/("""<h1>Details """),_display_(/*4.18*/customer/*4.26*/.getLastname),format.raw/*4.38*/("""</h1>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>Vorname</th>
                <th>Nachname</th>
                <th>E-Mail</th>
                <th>Projekte</th>
                <th>Bearbeiten</th>
                <th>Löschen</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>"""),_display_(/*19.22*/customer/*19.30*/.getFirstname),format.raw/*19.43*/("""</td>
                <td>"""),_display_(/*20.22*/customer/*20.30*/.getLastname),format.raw/*20.42*/("""</td>
                <td>"""),_display_(/*21.22*/customer/*21.30*/.getEmail),format.raw/*21.39*/("""</td>
                <td>
                """),_display_(/*23.18*/for(tmpProjekt <- customer.getProjektList) yield /*23.60*/ {_display_(Seq[Any](format.raw/*23.62*/("""
                    """),format.raw/*24.21*/("""<li><a href="/projekt/"""),_display_(/*24.44*/tmpProjekt/*24.54*/.getId),format.raw/*24.60*/("""">"""),_display_(/*24.63*/tmpProjekt/*24.73*/.getProjektName()),format.raw/*24.90*/("""</a></li>
                """)))}),format.raw/*25.18*/("""
                """),format.raw/*26.17*/("""</td>
                <td><a href="/editcustomer/"""),_display_(/*27.45*/customer/*27.53*/.getId),format.raw/*27.59*/("""" class="btn btn-default"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> </a></td>
                <td><a href="/deletecustomer/"""),_display_(/*28.47*/customer/*28.55*/.getId()),format.raw/*28.63*/("""" class="btn btn-danger" onclick="return confirm('Kunde wird gelöscht!');"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a></td>
            </tr>

        </tbody>
    </table>

""")))}))
      }
    }
  }

  def render(customer:models.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


}

/**/
object customer extends customer_Scope0.customer
              /*
                  -- GENERATED --
                  DATE: Mon May 29 21:09:20 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/customer.scala.html
                  HASH: e78c2ee6d824527c0b82cabeeadc77a84eed7bb1
                  MATRIX: 760->1|882->28|910->31|931->44|970->46|1001->51|1040->64|1056->72|1088->84|1486->455|1503->463|1537->476|1591->503|1608->511|1641->523|1695->550|1712->558|1742->567|1813->611|1871->653|1911->655|1960->676|2010->699|2029->709|2056->715|2086->718|2105->728|2143->745|2201->772|2246->789|2323->839|2340->847|2367->853|2544->1003|2561->1011|2590->1019
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|54->23|54->23|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28
                  -- GENERATED --
              */
          