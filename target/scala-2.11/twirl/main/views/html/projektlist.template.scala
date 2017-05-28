
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
    <ul>
    """),_display_(/*6.6*/for(projekt <- projektList) yield /*6.33*/{_display_(Seq[Any](format.raw/*6.34*/("""
        """),format.raw/*7.9*/("""<li>
            """),_display_(/*8.14*/projekt/*8.21*/.toString()),format.raw/*8.32*/("""
        """),format.raw/*9.9*/("""</li>
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""</ul>

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
                  DATE: Sun May 28 17:19:11 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/projektlist.scala.html
                  HASH: 156056512dca285a3d41c3b6fd596547c92fe6de
                  MATRIX: 764->1|887->29|917->34|946->55|984->56|1016->62|1080->101|1122->128|1160->129|1196->139|1241->158|1256->165|1287->176|1323->186|1365->198|1398->204
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|41->10|42->11
                  -- GENERATED --
              */
          