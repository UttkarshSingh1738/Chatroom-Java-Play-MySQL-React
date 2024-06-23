
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

object UserMessages extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,java.util.List[Chat],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(username: String)(messages: java.util.List[Chat]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*4.2*/layout("My Messages")/*4.23*/{_display_(Seq[Any](format.raw/*4.24*/("""
        """),format.raw/*5.9*/("""<div class="container mt-5">
            <div class="text-center mb-4">
                <h1 class="display-4">My Messages</h1>
            </div>
            <div class="chat-container">
                <div class="chat-box card p-3 mb-4" id="chat-box">
                """),_display_(/*11.18*/for(message <- messages) yield /*11.42*/ {_display_(Seq[Any](format.raw/*11.44*/("""
                    """),_display_(/*12.22*/defining(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault()))/*12.115*/ { formatter =>_display_(Seq[Any](format.raw/*12.130*/("""
                        """),format.raw/*13.25*/("""<div class="chat-message mb-2" id="message-"""),_display_(/*13.69*/message/*13.76*/.id),format.raw/*13.79*/("""">
                            <strong>"""),_display_(/*14.38*/message/*14.45*/.user.username),format.raw/*14.59*/("""</strong>: <span class="message-text">"""),_display_(/*14.98*/message/*14.105*/.message),format.raw/*14.113*/("""</span> <em>"""),_display_(/*14.126*/formatter/*14.135*/.format(message.updatedTime)),format.raw/*14.163*/("""</em>
                            <div class="actions">
                                <button class="btn btn-sm btn-warning" onclick="editMessage("""),_display_(/*16.94*/message/*16.101*/.id),format.raw/*16.104*/(""")">Edit</button>
                                <button class="btn btn-sm btn-danger" onclick="deleteMessage("""),_display_(/*17.95*/message/*17.102*/.id),format.raw/*17.105*/(""")">Delete</button>
                            </div>
                        </div>
                    """)))}),format.raw/*20.22*/("""
                """)))}),format.raw/*21.18*/("""
                """),format.raw/*22.17*/("""</div>
                <div class="text-center mt-4">
                    <a href=""""),_display_(/*24.31*/routes/*24.37*/.ChatroomController.index()),format.raw/*24.64*/("""" class="btn btn-secondary">Back to Chatroom</a>
                </div>
            </div>
        </div>""")))}/*27.16*/(username)))
      }
    }
  }

  def render(username:String,messages:java.util.List[Chat]): play.twirl.api.HtmlFormat.Appendable = apply(username)(messages)

  def f:((String) => (java.util.List[Chat]) => play.twirl.api.HtmlFormat.Appendable) = (username) => (messages) => apply(username)(messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Chatroom/UserMessages.scala.html
                  HASH: 85a91f761370765c5384ff5ed60cbd3efd988205
                  MATRIX: 619->1|650->26|1024->69|1168->121|1197->142|1235->143|1270->152|1568->423|1608->447|1648->449|1697->471|1800->564|1854->579|1907->604|1978->648|1994->655|2018->658|2085->698|2101->705|2136->719|2202->758|2219->765|2249->773|2290->786|2309->795|2359->823|2535->972|2552->979|2577->982|2715->1093|2732->1100|2757->1103|2894->1209|2943->1227|2988->1244|3099->1328|3114->1334|3162->1361|3287->1467
                  LINES: 23->1|24->2|29->3|34->4|34->4|34->4|35->5|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|43->13|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|44->14|46->16|46->16|46->16|47->17|47->17|47->17|50->20|51->21|52->22|54->24|54->24|54->24|57->27
                  -- GENERATED --
              */
          