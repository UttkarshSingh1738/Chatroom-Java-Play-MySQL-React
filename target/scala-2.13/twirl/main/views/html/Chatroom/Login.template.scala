
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


Seq[Any](_display_(/*5.2*/layout("Login Page")/*5.22*/{_display_(Seq[Any](format.raw/*5.23*/("""
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
                  HASH: c421f975e49516bd7533c83324a5c380af04bef5
                  MATRIX: 619->1|642->18|1031->49|1239->165|1267->185|1305->186|1340->195|1520->348|1614->433|1655->435|1700->452|1769->494|1870->574|1915->591|2007->656|2113->740|2158->757|2353->921|2395->935|2497->1010|2531->1028|2571->1030|2616->1047|2672->1076|2685->1080|2715->1089|2765->1108|2806->1121|2888->1176|2903->1182|2950->1208|3009->1248|3034->1252
                  LINES: 23->1|24->2|29->4|34->5|34->5|34->5|35->6|39->10|39->10|39->10|40->11|41->12|41->12|42->13|44->15|44->15|45->16|49->20|51->22|53->24|53->24|53->24|54->25|54->25|54->25|54->25|55->26|56->27|58->29|58->29|58->29|59->30|59->30
                  -- GENERATED --
              */
          