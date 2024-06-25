
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


Seq[Any](format.raw/*5.1*/("""
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
                  HASH: 264d48bbbe2413fea79bf8345b8a57352ed35621
                  MATRIX: 619->1|650->26|1020->70|1165->122|1192->124|1225->149|1263->150|1294->155|1447->282|1475->290|1637->425|1677->449|1717->451|1762->469|1865->562|1919->577|1968->598|2039->642|2055->649|2079->652|2142->688|2158->695|2193->709|2259->748|2276->755|2306->763|2347->776|2366->785|2416->813|2511->881|2551->883|2608->912|2750->1027|2767->1034|2792->1037|2930->1148|2947->1155|2972->1158|3095->1237|3144->1258|3199->1282|3244->1296|3285->1309|3729->1726|3744->1732|3799->1766|3998->1938|4013->1944|4058->1968|4209->2101
                  LINES: 23->1|24->2|29->4|34->5|35->6|35->6|35->6|36->7|38->9|38->9|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|44->15|45->16|45->16|45->16|45->16|45->16|45->16|45->16|45->16|45->16|46->17|46->17|47->18|48->19|48->19|48->19|49->20|49->20|49->20|51->22|52->23|53->24|54->25|55->26|64->35|64->35|64->35|68->39|68->39|68->39|72->43
                  -- GENERATED --
              */
          