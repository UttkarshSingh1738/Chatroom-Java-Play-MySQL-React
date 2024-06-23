
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
/*1.2*/import java.time.ZoneId
/*2.2*/import java.time.format.DateTimeFormatter

object Chatroom extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,java.util.List[Chat],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(username: String)(messages : java.util.List[Chat]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.53*/("""

"""),_display_(/*6.2*/layout("Simple Chatroom")/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<div class="container mt-5">
        <div class="text-center mb-4">
            <h1 class="display-4">Welcome to the Chatroom """),_display_(/*9.60*/username),format.raw/*9.68*/("""!</h1>
        </div>
        <div class="chat-container">
            <div class="chat-box card p-3 mb-4" id="chat-box">
            """),_display_(/*13.14*/for(message <- messages) yield /*13.38*/ {_display_(Seq[Any](format.raw/*13.40*/("""
                """),_display_(/*14.18*/defining(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault()))/*14.111*/ { formatter =>_display_(Seq[Any](format.raw/*14.126*/("""
                    """),format.raw/*15.21*/("""<div class="chat-message mb-2" id="message-"""),_display_(/*15.65*/message/*15.72*/.id),format.raw/*15.75*/("""">
                        <strong>"""),_display_(/*16.34*/message/*16.41*/.user.username),format.raw/*16.55*/("""</strong>: <span class="message-text">"""),_display_(/*16.94*/message/*16.101*/.message),format.raw/*16.109*/("""</span> <em>"""),_display_(/*16.122*/formatter/*16.131*/.format(message.updatedTime)),format.raw/*16.159*/("""</em>
                        """),_display_(if(message.user.username == username)/*17.63*/ {_display_(Seq[Any](format.raw/*17.65*/("""
                            """),format.raw/*18.29*/("""<div class="actions">
                                <button class="btn btn-sm btn-warning" onclick="editMessage("""),_display_(/*19.94*/message/*19.101*/.id),format.raw/*19.104*/(""")">Edit</button>
                                <button class="btn btn-sm btn-danger" onclick="deleteMessage("""),_display_(/*20.95*/message/*20.102*/.id),format.raw/*20.105*/(""")">Delete</button>
                            </div>
                        """)))} else {null} ),format.raw/*22.26*/("""
                    """),format.raw/*23.21*/("""</div>
                """)))}),format.raw/*24.18*/("""
            """)))}),format.raw/*25.14*/("""
            """),format.raw/*26.13*/("""</div>
            <div class="input-group mb-4">
                <input type="text" class="form-control" id="chat-input" placeholder="Type a message...">
                <div class="input-group-append">
                    <button class="btn btn-primary" onclick="sendMessage()">Send</button>
                </div>
            </div>
        </div>
        <div class="text-center mt-4">
            <form action=""""),_display_(/*35.28*/routes/*35.34*/.ChatroomController.userMessages()),format.raw/*35.68*/("""" method="GET" class="mt-4">
                <button type="submit" class="btn btn-info">View My Messages</button>
            </form>
        </div>
        <form action=""""),_display_(/*39.24*/routes/*39.30*/.HomeController.logout()),format.raw/*39.54*/("""" method="GET" class="mt-4">
            <button type="submit" class="btn btn-secondary">Logout</button>
        </form>
    </div>
""")))}/*43.2*/(username)))
      }
    }
  }

  def render(username:String,messages:java.util.List[Chat]): play.twirl.api.HtmlFormat.Appendable = apply(username)(messages)

  def f:((String) => (java.util.List[Chat]) => play.twirl.api.HtmlFormat.Appendable) = (username) => (messages) => apply(username)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Chatroom/Chatroom.scala.html
                  HASH: e255573157fe7c9e2ae171bcd7443c354740e052
                  MATRIX: 619->1|650->27|1020->73|1166->124|1196->129|1229->154|1267->155|1299->161|1454->290|1482->298|1648->437|1688->461|1728->463|1774->482|1877->575|1931->590|1981->612|2052->656|2068->663|2092->666|2156->703|2172->710|2207->724|2273->763|2290->770|2320->778|2361->791|2380->800|2430->828|2526->897|2566->899|2624->929|2767->1045|2784->1052|2809->1055|2948->1167|2965->1174|2990->1177|3115->1258|3165->1280|3221->1305|3267->1320|3309->1334|3762->1760|3777->1766|3832->1800|4035->1976|4050->1982|4095->2006|4250->2143
                  LINES: 23->1|24->2|29->4|34->4|36->6|36->6|36->6|37->7|39->9|39->9|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|45->15|46->16|46->16|46->16|46->16|46->16|46->16|46->16|46->16|46->16|47->17|47->17|48->18|49->19|49->19|49->19|50->20|50->20|50->20|52->22|53->23|54->24|55->25|56->26|65->35|65->35|65->35|69->39|69->39|69->39|73->43
                  -- GENERATED --
              */
          