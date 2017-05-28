
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object userlist_Scope0 {
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

class userlist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userList: List[models.User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("Userlist")/*3.18*/{_display_(Seq[Any](format.raw/*3.19*/("""
    """),format.raw/*4.5*/("""<h1>Alle Benutzer</h1>
    <ul>
        """),_display_(/*6.10*/for(user <- userList) yield /*6.31*/{_display_(Seq[Any](format.raw/*6.32*/("""
            """),format.raw/*7.13*/("""<li>
                <a href="/user/"""),_display_(/*8.33*/user/*8.37*/.getId()),format.raw/*8.45*/("""">
                """),_display_(/*9.18*/user/*9.22*/.toString()),format.raw/*9.33*/("""
                """),format.raw/*10.17*/("""</a>
                <a href="/deleteuser/"""),_display_(/*11.39*/user/*11.43*/.getId()),format.raw/*11.51*/("""" class="btn btn-danger"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> </a>
                <ul>
                    """),_display_(/*13.22*/for(tmpgroup <- user.getGroupList()) yield /*13.58*/{_display_(Seq[Any](format.raw/*13.59*/("""
                    """),format.raw/*14.21*/("""<li>"""),_display_(/*14.26*/tmpgroup/*14.34*/.getProjektName()),format.raw/*14.51*/("""</li>
                """)))}),format.raw/*15.18*/("""
                """),format.raw/*16.17*/("""</ul>
            </li>
        """)))}),format.raw/*18.10*/("""
    """),format.raw/*19.5*/("""</ul>



""")))}))
      }
    }
  }

  def render(userList:List[models.User]): play.twirl.api.HtmlFormat.Appendable = apply(userList)

  def f:((List[models.User]) => play.twirl.api.HtmlFormat.Appendable) = (userList) => apply(userList)

  def ref: this.type = this

}


}

/**/
object userlist extends userlist_Scope0.userlist
              /*
                  -- GENERATED --
                  DATE: Sun May 28 17:19:11 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/userlist.scala.html
                  HASH: dfb0610144cc9162613fee25f1576583de7daba8
                  MATRIX: 762->1|886->30|916->35|940->51|978->52|1010->58|1079->101|1115->122|1153->123|1194->137|1258->175|1270->179|1298->187|1345->208|1357->212|1388->223|1434->241|1505->285|1518->289|1547->297|1716->439|1768->475|1807->476|1857->498|1889->503|1906->511|1944->528|1999->552|2045->570|2111->605|2144->611
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|37->6|37->6|37->6|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|42->11|42->11|42->11|44->13|44->13|44->13|45->14|45->14|45->14|45->14|46->15|47->16|49->18|50->19
                  -- GENERATED --
              */
          