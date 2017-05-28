
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object tasklist_Scope0 {
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

class tasklist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(taskList: List[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.24*/("""

"""),_display_(/*3.2*/main("Alle Tasks")/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h1>Alle Tasks</h1>
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
        """),_display_(/*16.10*/for(task <- taskList) yield /*16.31*/ {_display_(Seq[Any](format.raw/*16.33*/("""
            """),format.raw/*17.13*/("""<tr>
                <td>"""),_display_(/*18.22*/task/*18.26*/.getId),format.raw/*18.32*/("""</td>
                <td>"""),_display_(/*19.22*/task/*19.26*/.getTaskName),format.raw/*19.38*/("""</td>
                <td><a href="/task/"""),_display_(/*20.37*/task/*20.41*/.getId()),format.raw/*20.49*/("""" class="details-button"><span class="glyphicon glyphicon-plus"></span></a></td>
                <td><a href="/deletetask/"""),_display_(/*21.43*/task/*21.47*/.getId()),format.raw/*21.55*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a>
                </td>
            </tr>
        """)))}),format.raw/*24.10*/("""
        """),format.raw/*25.9*/("""</tbody>
    </table>

""")))}))
      }
    }
  }

  def render(taskList:List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(taskList)

  def f:((List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (taskList) => apply(taskList)

  def ref: this.type = this

}


}

/**/
object tasklist extends tasklist_Scope0.tasklist
              /*
                  -- GENERATED --
                  DATE: Sun May 28 21:45:38 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/tasklist.scala.html
                  HASH: 60a2839491538ed3bc12aaec5f181e7ae381067a
                  MATRIX: 755->1|872->23|900->26|926->44|964->45|995->50|1300->328|1337->349|1377->351|1418->364|1471->390|1484->394|1511->400|1565->427|1578->431|1611->443|1680->485|1693->489|1722->497|1872->620|1885->624|1914->632|2092->779|2128->788
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|55->24|56->25
                  -- GENERATED --
              */
          