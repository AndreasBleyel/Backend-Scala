
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Search],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(searchForm: Form[models.Search]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("Suche")/*3.15*/{_display_(Seq[Any](format.raw/*3.16*/("""
    """),format.raw/*4.5*/("""<h1>Projektsuche</h1>

    <div class="row">
        <div class="col-xs-12" id="form">
        """),_display_(/*8.10*/helper/*8.16*/.form(action = routes.SearchController.search())/*8.64*/{_display_(Seq[Any](format.raw/*8.65*/("""
            """),_display_(/*9.14*/helper/*9.20*/.inputText(searchForm("suchbegriff"), 'id -> "suchbegriff", '_label -> "Suchbegriff", 'class -> "form-control")),format.raw/*9.131*/("""

            """),format.raw/*11.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-search" aria-hidden="true"></span> Suchen </button>
        """)))}),format.raw/*12.10*/("""
        """),format.raw/*13.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(searchForm:Form[models.Search]): play.twirl.api.HtmlFormat.Appendable = apply(searchForm)

  def f:((Form[models.Search]) => play.twirl.api.HtmlFormat.Appendable) = (searchForm) => apply(searchForm)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Tue May 30 23:10:32 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/search.scala.html
                  HASH: d647292af5283ac3bc0e0f225035a48acc225f49
                  MATRIX: 760->1|888->34|916->37|937->50|975->51|1006->56|1128->152|1142->158|1198->206|1236->207|1276->221|1290->227|1422->338|1464->352|1652->509|1688->518
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|39->8|40->9|40->9|40->9|42->11|43->12|44->13
                  -- GENERATED --
              */
          