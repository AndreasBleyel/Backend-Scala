
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
                <th>Auftraggeber</th>
                <th>Mitarbeiter</th>
                <th>Bearbeiten</th>
                <th>Löschen</th>
            </tr>
        </thead>
        <tbody>

            <tr>
                <td>"""),_display_(/*20.22*/projekt/*20.29*/.getId),format.raw/*20.35*/("""</td>
                <td>"""),_display_(/*21.22*/projekt/*21.29*/.getProjektName),format.raw/*21.44*/("""</td>

                <td>Auftraggeber</td>
                <td>
                    """),_display_(/*25.22*/for(mitarbeiter <- projekt.getUserList()) yield /*25.63*/{_display_(Seq[Any](format.raw/*25.64*/("""
                        """),format.raw/*26.25*/("""<li>"""),_display_(/*26.30*/mitarbeiter),format.raw/*26.41*/("""</li>
                    """)))}),format.raw/*27.22*/("""
                """),format.raw/*28.17*/("""</td>
                <td><a href="#" class="details-button"><span class="glyphicon glyphicon-pencil"></span></a></td>
                <td><a href="/deleteprojekt/"""),_display_(/*30.46*/projekt/*30.53*/.getId()),format.raw/*30.61*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a>
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
                  DATE: Sun May 28 21:47:20 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/projekt.scala.html
                  HASH: cf2a1614f1265836e1034104d108ecf57f017b30
                  MATRIX: 757->1|877->26|905->29|928->44|967->46|999->52|1038->65|1053->72|1088->87|1486->458|1502->465|1529->471|1583->498|1599->505|1635->520|1749->607|1806->648|1845->649|1898->674|1930->679|1962->690|2020->717|2065->734|2256->898|2272->905|2301->913
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|51->20|51->20|51->20|52->21|52->21|52->21|56->25|56->25|56->25|57->26|57->26|57->26|58->27|59->28|61->30|61->30|61->30
                  -- GENERATED --
              */
          