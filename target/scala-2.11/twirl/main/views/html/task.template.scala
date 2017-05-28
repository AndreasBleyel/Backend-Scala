
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

"""),_display_(/*3.2*/main("Task")/*3.14*/{_display_(Seq[Any](format.raw/*3.15*/("""

    """),format.raw/*5.5*/("""<h1>Task</h1>

    <div><b>Taskname:</b></div>

    <div>"""),_display_(/*9.11*/task/*9.15*/.getTaskName()),format.raw/*9.29*/("""</div>

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
                  DATE: Sun May 28 17:19:11 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/task.scala.html
                  HASH: 830bc49e9d4a712fac55573790169bf68801f628
                  MATRIX: 748->1|862->20|890->23|910->35|948->36|980->42|1064->100|1076->104|1110->118
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9
                  -- GENERATED --
              */
          