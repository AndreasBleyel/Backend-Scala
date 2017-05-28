
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
    <ul>
    """),_display_(/*6.6*/for(task <- taskList) yield /*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
        """),format.raw/*7.9*/("""<li>
        """),_display_(/*8.10*/task/*8.14*/.toString()),format.raw/*8.25*/("""
        """),format.raw/*9.9*/("""</li>
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""</ul>

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
                  DATE: Sun May 28 17:19:11 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/tasklist.scala.html
                  HASH: 9d4ea7a570dfa0a1b866a657859e81be628c621e
                  MATRIX: 755->1|872->23|900->26|926->44|964->45|995->50|1054->84|1090->105|1128->106|1163->115|1203->129|1215->133|1246->144|1281->153|1322->164|1354->169
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|42->11
                  -- GENERATED --
              */
          