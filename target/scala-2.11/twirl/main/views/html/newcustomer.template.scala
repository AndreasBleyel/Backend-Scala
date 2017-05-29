
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newcustomer_Scope0 {
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

class newcustomer extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[play.data.Form[models.Customer],List[Projekt],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: play.data.Form[models.Customer], projektList: List[Projekt]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.77*/("""

"""),_display_(/*3.2*/main("New Customer")/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<div class="row">
        <div class="col-xs-12">
            <h1>Neuer Kunde</h1>
        </div>
    </div>

    <div class="row">
        <div class="col-xs-12" id="form">
        """),_display_(/*12.10*/helper/*12.16*/.form(action = routes.CustomerController.create())/*12.66*/{_display_(Seq[Any](format.raw/*12.67*/("""
            """),_display_(/*13.14*/helper/*13.20*/.inputText(customerForm("firstname"), 'id -> "firstname", '_label -> "Vorname", 'class -> "form-control")),format.raw/*13.125*/("""
            """),_display_(/*14.14*/helper/*14.20*/.inputText(customerForm("lastname"), '_label -> "Nachname", 'class -> "form-control")),format.raw/*14.105*/("""
            """),_display_(/*15.14*/helper/*15.20*/.inputText(customerForm("email"), '_label -> "Email", 'class -> "form-control required")),format.raw/*15.108*/("""
            
            """),_display_(/*17.14*/helper/*17.20*/.select(
                field = customerForm("projektListholder"),
                options = (projektList.map(projekt => projekt.getId().toString() -> projekt.getProjektName())),
                '_label -> "Gruppe",
                'class -> "form-control",
                'multiple -> "Multiple"
            )),format.raw/*23.14*/("""

            """),format.raw/*25.13*/("""<button type="submit" class="btn btn-success" value="Anlegen" ><span class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span> Anlegen </button>
        """)))}),format.raw/*26.10*/("""
        """),format.raw/*27.9*/("""</div>
    </div>
""")))}))
      }
    }
  }

  def render(customerForm:play.data.Form[models.Customer],projektList:List[Projekt]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm,projektList)

  def f:((play.data.Form[models.Customer],List[Projekt]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm,projektList) => apply(customerForm,projektList)

  def ref: this.type = this

}


}

/**/
object newcustomer extends newcustomer_Scope0.newcustomer
              /*
                  -- GENERATED --
                  DATE: Mon May 29 21:09:20 CEST 2017
                  SOURCE: /home/andi/Desktop/relationManyToMany-2/app/views/newcustomer.scala.html
                  HASH: 9be899cdb2c8a89e9b35e6fe3756fd02d01f98be
                  MATRIX: 796->1|966->76|994->79|1022->99|1060->100|1091->105|1301->288|1316->294|1375->344|1414->345|1455->359|1470->365|1597->470|1638->484|1653->490|1760->575|1801->589|1816->595|1926->683|1980->710|1995->716|2328->1028|2370->1042|2564->1205|2600->1214
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|43->12|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|48->17|48->17|54->23|56->25|57->26|58->27
                  -- GENERATED --
              */
          