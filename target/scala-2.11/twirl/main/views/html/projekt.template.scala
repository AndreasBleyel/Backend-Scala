
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

    """),format.raw/*5.5*/("""<h1>Projekt """),_display_(/*5.18*/projekt/*5.25*/.getProjektName),format.raw/*5.40*/("""</h1>
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
                <td>"""),_display_(/*20.22*/projekt/*20.29*/.getId),format.raw/*20.35*/("""</td>
                <td>"""),_display_(/*21.22*/projekt/*21.29*/.getProjektName),format.raw/*21.44*/("""</td>

                <td>
                """),_display_(/*24.18*/if(projekt.getCustomer == null)/*24.49*/ {_display_(Seq[Any](format.raw/*24.51*/("""
                    """),format.raw/*25.21*/("""Kein Kunde zugeteilt
                """)))}/*26.19*/else/*26.24*/{_display_(Seq[Any](format.raw/*26.25*/("""
                    """),_display_(/*27.22*/projekt/*27.29*/.getCustomer),format.raw/*27.41*/("""</td>
                """)))}),format.raw/*28.18*/("""<td>
            """),_display_(/*29.14*/if(projekt.getUserList().isEmpty)/*29.47*/ {_display_(Seq[Any](format.raw/*29.49*/("""
                """),format.raw/*30.17*/("""Kein Mitarbeiter zugeteilt
            """)))}/*31.15*/else/*31.20*/{_display_(Seq[Any](format.raw/*31.21*/("""
                """),_display_(/*32.18*/for(mitarbeiter <- projekt.getUserList()) yield /*32.59*/ {_display_(Seq[Any](format.raw/*32.61*/("""
                    """),format.raw/*33.21*/("""<li>"""),_display_(/*33.26*/mitarbeiter),format.raw/*33.37*/("""</li>
                """)))}),format.raw/*34.18*/("""
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""</td>
                <td><a href="/editprojekt/"""),_display_(/*37.44*/projekt/*37.51*/.getId()),format.raw/*37.59*/("""" class="details-button"><span class="glyphicon glyphicon-pencil"></span></a></td>
                <td><a href="/deleteprojekt/"""),_display_(/*38.46*/projekt/*38.53*/.getId()),format.raw/*38.61*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a>
                </td>
            </tr>

        </tbody>
    </table>

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
                  DATE: Mon May 29 21:59:44 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/projekt.scala.html
                  HASH: 0e95a855f766517fc6c8c3b0424231d8edead6f0
                  MATRIX: 757->1|877->26|905->29|928->44|967->46|999->52|1038->65|1053->72|1088->87|1479->451|1495->458|1522->464|1576->491|1592->498|1628->513|1700->558|1740->589|1780->591|1829->612|1886->651|1899->656|1938->657|1987->679|2003->686|2036->698|2090->721|2135->739|2177->772|2217->774|2262->791|2321->832|2334->837|2373->838|2418->856|2475->897|2515->899|2564->920|2596->925|2628->936|2682->959|2727->973|2768->986|2844->1035|2860->1042|2889->1050|3044->1178|3060->1185|3089->1193
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|51->20|51->20|51->20|52->21|52->21|52->21|55->24|55->24|55->24|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38
                  -- GENERATED --
              */
          