
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object projektlist_Scope0 {
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

class projektlist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Projekt],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(projektList: List[Projekt]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),_display_(/*3.2*/main("Alle Projekte")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h1>Alle Projekte</h1>
    <table class="table table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Details</th>
                <th>Löschen</th>
            </tr>
        </thead>
        <tbody>
        """),_display_(/*15.10*/for(projekt <- projektList) yield /*15.37*/ {_display_(Seq[Any](format.raw/*15.39*/("""
            """),format.raw/*16.13*/("""<tr>
                <td>"""),_display_(/*17.22*/projekt/*17.29*/.getId),format.raw/*17.35*/("""</td>
                <td>"""),_display_(/*18.22*/projekt/*18.29*/.getProjektName),format.raw/*18.44*/("""</td>

                <td><a href="/projekt/"""),_display_(/*20.40*/projekt/*20.47*/.getId()),format.raw/*20.55*/("""" class="details-button"><span class="glyphicon glyphicon-plus"></span></a></td>
                <td><a href="/deleteprojekt/"""),_display_(/*21.46*/projekt/*21.53*/.getId()),format.raw/*21.61*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a>
                </td>
            </tr>
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""</tbody>
    </table>

""")))}))
      }
    }
  }

  def render(projektList:List[Projekt]): play.twirl.api.HtmlFormat.Appendable = apply(projektList)

  def f:((List[Projekt]) => play.twirl.api.HtmlFormat.Appendable) = (projektList) => apply(projektList)

  def ref: this.type = this

}


}

/**/
object projektlist extends projektlist_Scope0.projektlist
              /*
                  -- GENERATED --
                  DATE: Sun May 28 21:46:58 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/projektlist.scala.html
                  HASH: d9e9f0bddf2cd5aa54fd625b3b342d499f6f3a2a
                  MATRIX: 764->1|887->29|917->34|946->55|984->56|1016->62|1334->353|1377->380|1417->382|1459->396|1513->423|1529->430|1556->436|1611->464|1627->471|1663->486|1738->534|1754->541|1783->549|1937->676|1953->683|1982->691|2163->841|2200->851
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|51->20|51->20|51->20|52->21|52->21|52->21|55->24|56->25
                  -- GENERATED --
              */
          