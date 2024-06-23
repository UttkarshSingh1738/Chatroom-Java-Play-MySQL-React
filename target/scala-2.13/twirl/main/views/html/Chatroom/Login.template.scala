
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

object Login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[People],java.util.List[People],Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(userForm : Form[People])(users : java.util.List[People])(implicit request: Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.116*/("""
"""),_display_(/*5.2*/layout("Login Page")/*5.22*/{_display_(Seq[Any](format.raw/*5.23*/("""
        """),format.raw/*6.9*/("""<div class="container">
            <div class="text-center mt-5 mb-4">
                <h1 class="display-4">Login</h1>
            </div>
            """),_display_(/*10.14*/form(action = routes.HomeController.authenticate(), 'class -> "form-horizontal pb-4")/*10.99*/ {_display_(Seq[Any](format.raw/*10.101*/("""
                """),format.raw/*11.17*/("""<div class="form-group">
                """),_display_(/*12.18*/inputText(userForm("username"), '_label -> "Username", 'class -> "form-control")),format.raw/*12.98*/("""
                """),format.raw/*13.17*/("""</div>
                <div class="form-group">
                """),_display_(/*15.18*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*15.102*/("""
                """),format.raw/*16.17*/("""</div>
                <div class="form-group">
                    <input type="submit" value="Login" class="btn btn-primary">
                </div>
            """)))}),format.raw/*20.14*/("""

            """),format.raw/*22.13*/("""<h2>Registered Users</h2>
            <ul class="list-group">
            """),_display_(/*24.14*/for(user <- users) yield /*24.32*/ {_display_(Seq[Any](format.raw/*24.34*/("""
                """),format.raw/*25.17*/("""<li class="list-group-item">"""),_display_(/*25.46*/user/*25.50*/.username),format.raw/*25.59*/("""</li>
            """)))}),format.raw/*26.14*/("""
            """),format.raw/*27.13*/("""</ul>

            <p>Don't have an account? <a href=""""),_display_(/*29.49*/routes/*29.55*/.HomeController.register()),format.raw/*29.81*/("""">Register here</a>.</p>
        </div>""")))}/*30.16*/("")),format.raw/*30.20*/("""
"""))
      }
    }
  }

  def render(userForm:Form[People],users:java.util.List[People],request:Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(users)(request,messages)

  def f:((Form[People]) => (java.util.List[People]) => (Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (users) => (request,messages) => apply(userForm)(users)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Chatroom/Login.scala.html
                  HASH: 5416bb7fd610b46ba3b5fc6d541fc43ad687160e
                  MATRIX: 619->1|642->19|1031->52|1241->166|1269->169|1297->189|1335->190|1371->200|1555->357|1649->442|1690->444|1736->462|1806->505|1907->585|1953->603|2047->670|2153->754|2199->772|2398->940|2442->956|2546->1033|2580->1051|2620->1053|2666->1071|2722->1100|2735->1104|2765->1113|2816->1133|2858->1147|2942->1204|2957->1210|3004->1236|3064->1277|3089->1281
                  LINES: 23->1|24->2|29->4|34->4|35->5|35->5|35->5|36->6|40->10|40->10|40->10|41->11|42->12|42->12|43->13|45->15|45->15|46->16|50->20|52->22|54->24|54->24|54->24|55->25|55->25|55->25|55->25|56->26|57->27|59->29|59->29|59->29|60->30|60->30
                  -- GENERATED --
              */
          