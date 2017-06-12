
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object header_Scope0 {
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

class header extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<nav class="navbar navbar-default">
    <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/main">Super Tool</a>
        </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Mitarbeiter<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/user">Alle Mitarbeiter</a></li>
                        <li><a href="/adduser">Neuer Mitarbeiter</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Projekte<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/projekt">Alle Projekte</a></li>
                        <li><a href="/addprojekt">Neues Projekt</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Kunden<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/customer">Alle Kunden</a></li>
                        <li><a href="/addcustomer">Neuer Kunde</a></li>
                    </ul>
                </li>

                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Tasks<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/task">Alle Tasks</a></li>
                        <li><a href="/addtask">Neuer Task</a></li>
                    </ul>
                </li>

                <li><a href="/search">Projekt suchen</a></li>

                <li><a href="/login">Logout</a></li>


            </ul>



        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object header extends header_Scope0.header
              /*
                  -- GENERATED --
                  DATE: Mon Jun 12 16:44:32 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/header.scala.html
                  HASH: 0545dbadb62b79ec08d8be209f3a5595fca160e7
                  MATRIX: 829->0
                  LINES: 32->1
                  -- GENERATED --
              */
          