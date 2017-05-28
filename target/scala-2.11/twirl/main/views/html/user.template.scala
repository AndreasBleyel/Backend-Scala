
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
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

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.User,List[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User, taskList: List[Task]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/main("User")/*3.14*/{_display_(Seq[Any](format.raw/*3.15*/("""
    """),format.raw/*4.5*/("""<h1>Benutzer</h1>
    <div><b>Name:</b></div>
    <div>"""),_display_(/*6.11*/user/*6.15*/.getFirstname()),format.raw/*6.30*/(""" """),_display_(/*6.32*/user/*6.36*/.getLastname()),format.raw/*6.50*/("""</div>

    <br/>

    <div><b>Email:</b></div>
    <div>"""),_display_(/*11.11*/user/*11.15*/.getEmail()),format.raw/*11.26*/("""</div>

    <ul>
        """),_display_(/*14.10*/for(task <- taskList) yield /*14.31*/{_display_(Seq[Any](format.raw/*14.32*/("""
            """),format.raw/*15.13*/("""<li>
                """),_display_(/*16.18*/task),format.raw/*16.22*/("""
            """),format.raw/*17.13*/("""</li>
        """)))}),format.raw/*18.10*/("""

    """),format.raw/*20.5*/("""</ul>
""")))}))
      }
    }
  }

  def render(user:models.User,taskList:List[Task]): play.twirl.api.HtmlFormat.Appendable = apply(user,taskList)

  def f:((models.User,List[Task]) => play.twirl.api.HtmlFormat.Appendable) = (user,taskList) => apply(user,taskList)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Sun May 28 17:19:11 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/user.scala.html
                  HASH: 54fa73d6af0feeef41e542cfa164ee3c9fa17d9e
                  MATRIX: 759->1|895->42|925->47|945->59|983->60|1015->66|1099->124|1111->128|1146->143|1174->145|1186->149|1220->163|1310->226|1323->230|1355->241|1411->270|1448->291|1487->292|1529->306|1579->329|1604->333|1646->347|1693->363|1728->371
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|37->6|37->6|37->6|42->11|42->11|42->11|45->14|45->14|45->14|46->15|47->16|47->16|48->17|49->18|51->20
                  -- GENERATED --
              */
          