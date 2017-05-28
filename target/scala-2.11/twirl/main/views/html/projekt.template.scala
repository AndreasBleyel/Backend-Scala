
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

"""),_display_(/*3.2*/main("Projekt")/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""

    """),format.raw/*5.5*/("""<h1>Projekt</h1>

    <div><b>Projektname:</b></div>

    <div>"""),_display_(/*9.11*/projekt/*9.18*/.getProjektName()),format.raw/*9.35*/("""</div>

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
                  DATE: Sun May 28 17:19:11 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/projekt.scala.html
                  HASH: 578049d505c061d688684a5d4a8492926eddaa2c
                  MATRIX: 757->1|877->26|905->29|928->44|966->45|998->51|1088->115|1103->122|1140->139
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|40->9|40->9|40->9
                  -- GENERATED --
              */
          