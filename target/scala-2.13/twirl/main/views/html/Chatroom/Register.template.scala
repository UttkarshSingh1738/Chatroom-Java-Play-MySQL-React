
package views.html.Chatroom

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._
/*1.2*/import helper._
/*2.2*/import play.mvc.Http.Request

object Register extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[People],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(userForm : Form[People])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.84*/("""

"""),_display_(/*6.2*/layout("Register")/*6.20*/{_display_(Seq[Any](format.raw/*6.21*/("""
        """),format.raw/*7.9*/("""<div class="container">
            <div class="text-center mt-5 mb-4">
                <h1 class="display-4">Register</h1>
            </div>
            """),_display_(/*11.14*/form(action = routes.HomeController.save(), 'class -> "form-horizontal pb-4")/*11.91*/ {_display_(Seq[Any](format.raw/*11.93*/("""
                """),format.raw/*12.17*/("""<div class="form-group">
                """),_display_(/*13.18*/inputText(userForm("username"), '_label -> "Username", 'class -> "form-control")),format.raw/*13.98*/("""
                """),format.raw/*14.17*/("""</div>
                <div class="form-group">
                """),_display_(/*16.18*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*16.98*/("""
                """),format.raw/*17.17*/("""</div>
                <div class="form-group">
                    <input type="submit" value="Register" class="btn btn-primary">
                </div>
            """)))}),format.raw/*21.14*/("""
            """),format.raw/*22.13*/("""<p>Already have an account? <a href=""""),_display_(/*22.51*/routes/*22.57*/.HomeController.index()),format.raw/*22.80*/("""">Login here</a>.</p>
        </div>
""")))}/*24.2*/("")))
      }
    }
  }

  def render(userForm:Form[People],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(request,messages)

  def f:((Form[People]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (request,messages) => apply(userForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Chatroom/Register.scala.html
                  HASH: 808028c74e7b08d876b4778eee1b4d538d872635
                  MATRIX: 619->1|642->19|1011->52|1188->134|1218->139|1244->157|1282->158|1318->168|1505->328|1591->405|1631->407|1677->425|1747->468|1848->548|1894->566|1988->633|2089->713|2135->731|2337->902|2379->916|2444->954|2459->960|2503->983|2561->1023
                  LINES: 23->1|24->2|29->4|34->4|36->6|36->6|36->6|37->7|41->11|41->11|41->11|42->12|43->13|43->13|44->14|46->16|46->16|47->17|51->21|52->22|52->22|52->22|52->22|54->24
                  -- GENERATED --
              */
          