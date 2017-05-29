
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editcustomer_Scope0 {
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

class editcustomer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[play.data.Form[models.Customer],List[Projekt],Long,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: play.data.Form[models.Customer], projektList: List[Projekt], customerid: Long):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""

"""),_display_(/*3.2*/main("Kunde bearbeiten")/*3.26*/{_display_(Seq[Any](format.raw/*3.27*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Kunde bearbeiten</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.CustomerController.update(customerid))/*12.76*/{_display_(Seq[Any](format.raw/*12.77*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(customerForm("firstname"), 'id -> "firstname", '_label -> "Vorname", 'class -> "form-control")),format.raw/*13.125*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(customerForm("lastname"), '_label -> "Nachname", 'class -> "form-control")),format.raw/*14.105*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(customerForm("email"), '_label -> "Email", 'class -> "form-control required")),format.raw/*15.108*/("""
            """),_display_(/*16.14*/helper/*16.20*/.select(
                field = customerForm("projektListholder"),
                options = (projektList.map(projekt => projekt.getId().toString() -> projekt.getProjektName())),
                '_label -> "Gruppe",
                'class -> "form-control",
                'multiple -> "Multiple"
            )),format.raw/*22.14*/("""

            """),format.raw/*24.13*/("""<button type="submit" class="btn btn-success" value="Aendern" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Ändern </button>
            <button type="reset" class="btn btn-danger" value="Reset" ><span class="glyphicon glyphicon-repeat" aria-hidden="true"></span> Zurücksetzen </button>

        """)))}),format.raw/*27.10*/("""
        """),format.raw/*28.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(customerForm:play.data.Form[models.Customer],projektList:List[Projekt],customerid:Long): play.twirl.api.HtmlFormat.Appendable = apply(customerForm,projektList,customerid)

  def f:((play.data.Form[models.Customer],List[Projekt],Long) => play.twirl.api.HtmlFormat.Appendable) = (customerForm,projektList,customerid) => apply(customerForm,projektList,customerid)

  def ref: this.type = this

}


}

/**/
object editcustomer extends editcustomer_Scope0.editcustomer
              /*
                  -- GENERATED --
                  DATE: Mon May 29 21:09:20 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/editcustomer.scala.html
                  HASH: 4712a78312cd6644a65434d938f6a016c5b1b9c0
                  MATRIX: 803->1|991->94|1019->97|1051->121|1089->122|1120->127|1325->305|1340->311|1409->371|1448->372|1489->386|1504->392|1631->497|1672->511|1687->517|1794->602|1835->616|1850->622|1960->710|2001->724|2016->730|2349->1042|2391->1056|2747->1381|2783->1390
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|53->22|55->24|58->27|59->28
                  -- GENERATED --
              */
          