
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object navigation_Scope0 {
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

class navigation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<div class="row">
    <div class="col-xs-12">
        <h5>Anzeigen</h5>
        <ul>
            <li><a href="/user">Alle Mitarbeiter</a></li>
            <li><a href="/projekt">Alle Projekte</a></li>
            <li><a href="/task">Alle Tasks</a></li>
            <li><a href="/customer">Alle Kunden</a></li>

        </ul>
    </div>
</div>
<div class="row">
    <div class="col-xs-12">
        <h5>Anlegen</h5>
        <ul>
            <li><a href="/adduser">Neuer Mitarbeiter</a></li>
            <li><a href="/addprojekt">Neues Projekt</a></li>
            <li><a href="/addtask">Neuer Task</a></li>
            <li><a href="/addcustomer">Neuer Kunde</a></li>

        </ul>
    </div>
</div>

<div class="row">
    <div class="col-xs-12">

        <ul>
            <li><a href="/search">Projekt suchen</a></li>
        </ul>
    </div>
</div>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object navigation extends navigation_Scope0.navigation
              /*
                  -- GENERATED --
                  DATE: Tue May 30 23:10:32 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/navigation.scala.html
                  HASH: 9a8034d2fb4e109dac62c32168bfc13c16685a2f
                  MATRIX: 748->1|844->3|872->5
                  LINES: 27->1|32->1|33->2
                  -- GENERATED --
              */
          