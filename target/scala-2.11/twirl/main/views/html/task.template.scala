
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object task_Scope0 {
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

class task extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Task,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(task: models.Task):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/main("Task")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""

    """),format.raw/*5.5*/("""<h1>Task """),_display_(/*5.15*/task/*5.19*/.getTaskName),format.raw/*5.31*/(""" """),format.raw/*5.32*/("""Details</h1>

    <table class="table table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Mitarbeiter</th>
                <th>Projekt</th>
                <th>Bearbeiten</th>
                <th>Löschen</th>
            </tr>
        </thead>
        <tbody>

            <tr>
                <td>"""),_display_(/*21.22*/task/*21.26*/.getId),format.raw/*21.32*/("""</td>
                <td>"""),_display_(/*22.22*/task/*22.26*/.getTaskName),format.raw/*22.38*/("""</td>
                <td><a href="/user/"""),_display_(/*23.37*/task/*23.41*/.getUser.getId),format.raw/*23.55*/("""">"""),_display_(/*23.58*/task/*23.62*/.getUser),format.raw/*23.70*/("""</a></td>
                <td>Projekt</td>
                <td><a href="/task/"""),_display_(/*25.37*/task/*25.41*/.getId()),format.raw/*25.49*/("""" class="details-button"><span class="glyphicon glyphicon-pencil"></span></a></td>
                <td><a href="/deletetask/"""),_display_(/*26.43*/task/*26.47*/.getId()),format.raw/*26.55*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a>
                </td>
            </tr>

        </tbody>
    </table>

""")))}))
      }
    }
  }

  def render(task:models.Task): play.twirl.api.HtmlFormat.Appendable = apply(task)

  def f:((models.Task) => play.twirl.api.HtmlFormat.Appendable) = (task) => apply(task)

  def ref: this.type = this

}


}

/**/
object task extends task_Scope0.task
              /*
                  -- GENERATED --
                  DATE: Sun May 28 21:47:46 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/task.scala.html
                  HASH: 9b3ea588019d851ca43ae38dd661191f2f5080f0
                  MATRIX: 748->1|862->20|890->23|910->35|949->37|981->43|1017->53|1029->57|1061->69|1089->70|1490->444|1503->448|1530->454|1584->481|1597->485|1630->497|1699->539|1712->543|1747->557|1777->560|1790->564|1819->572|1925->651|1938->655|1967->663|2119->788|2132->792|2161->800
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|36->5|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|56->25|56->25|56->25|57->26|57->26|57->26
                  -- GENERATED --
              */
          