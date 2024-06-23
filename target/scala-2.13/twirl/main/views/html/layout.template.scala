
package views.html

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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(body: Html)(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*4.1*/("""<html lang="en">
    <head>
        <title>"""),_display_(/*6.17*/title),format.raw/*6.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*7.110*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/style.css")),format.raw/*8.102*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <script src=""""),_display_(/*10.23*/routes/*10.29*/.Assets.versioned("javascripts/jquery-3.7.1.min.js")),format.raw/*10.81*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.versioned("javascripts/bootstrap.min.js")),format.raw/*11.78*/("""" type="text/javascript"></script>
        <style>
                .chat-message strong """),format.raw/*13.38*/("""{"""),format.raw/*13.39*/("""
                    """),format.raw/*14.21*/("""padding-right: 10px; /* Add a little horizontal padding after the username */
                    color: #0dcaf0;
                """),format.raw/*16.17*/("""}"""),format.raw/*16.18*/("""
                """),format.raw/*17.17*/(""".chat-message em """),format.raw/*17.34*/("""{"""),format.raw/*17.35*/("""
                    """),format.raw/*18.21*/("""display: block;
                    text-align: right; /* Right-aligning the date */
                    padding-top: 5px; /* Add a lot of padding after the message */
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/("""
                """),format.raw/*22.17*/(""".chat-message .actions """),format.raw/*22.40*/("""{"""),format.raw/*22.41*/("""
                    """),format.raw/*23.21*/("""margin-top: 5px;
                """),format.raw/*24.17*/("""}"""),format.raw/*24.18*/("""
                """),format.raw/*25.17*/(""".chat-message .btn """),format.raw/*25.36*/("""{"""),format.raw/*25.37*/("""
                    """),format.raw/*26.21*/("""display: none; /* Initially hide buttons */
                """),format.raw/*27.17*/("""}"""),format.raw/*27.18*/("""
                """),format.raw/*28.17*/(""".chat-message:hover .btn """),format.raw/*28.42*/("""{"""),format.raw/*28.43*/("""
                    """),format.raw/*29.21*/("""display: inline-block; /* Show buttons on hover */
                """),format.raw/*30.17*/("""}"""),format.raw/*30.18*/("""
        """),format.raw/*31.9*/("""</style>
    </head>
    <body>
        """),_display_(/*34.10*/body),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""<script>
                function sendMessage() """),format.raw/*36.40*/("""{"""),format.raw/*36.41*/("""
                    """),format.raw/*37.21*/("""const chatInput = document.getElementById('chat-input');
                    const message = chatInput.value;
                    if (message.trim() !== "") """),format.raw/*39.48*/("""{"""),format.raw/*39.49*/("""
                        """),format.raw/*40.25*/("""$.post(""""),_display_(/*40.34*/routes/*40.40*/.ChatroomController.send()),format.raw/*40.66*/("""", """),format.raw/*40.69*/("""{"""),format.raw/*40.70*/(""" """),format.raw/*40.71*/("""username: """"),_display_(/*40.83*/username),format.raw/*40.91*/("""", message: message """),format.raw/*40.111*/("""}"""),format.raw/*40.112*/(""")
                                .done(function() """),format.raw/*41.50*/("""{"""),format.raw/*41.51*/("""
                                    """),format.raw/*42.37*/("""const chatBox = document.getElementById('chat-box');
                                    const messageElement = document.createElement('div');
                                    messageElement.className = 'chat-message mb-2';
                                    messageElement.innerHTML = '<strong>"""),_display_(/*45.74*/username),format.raw/*45.82*/("""</strong>: ' + message + ' <em>just now</em>';
                                    chatBox.appendChild(messageElement);
                                    chatInput.value = "";
                                    chatBox.scrollTop = chatBox.scrollHeight; // Auto-scroll to the bottom
                                    location.reload();
                                """),format.raw/*50.33*/("""}"""),format.raw/*50.34*/(""");
                    """),format.raw/*51.21*/("""}"""),format.raw/*51.22*/("""
                """),format.raw/*52.17*/("""}"""),format.raw/*52.18*/("""
                """),format.raw/*53.17*/("""function editMessage(messageId) """),format.raw/*53.49*/("""{"""),format.raw/*53.50*/("""
                    """),format.raw/*54.21*/("""const messageElement = document.getElementById('message-' + messageId);
                    const messageTextElement = messageElement.querySelector('.message-text');
                    const messageText = messageTextElement.innerText;
                    const newMessage = prompt("Edit your message:", messageText);
                    $.post(""""),_display_(/*58.30*/routes/*58.36*/.ChatroomController.update()),format.raw/*58.64*/("""", """),format.raw/*58.67*/("""{"""),format.raw/*58.68*/(""" """),format.raw/*58.69*/("""username: """"),_display_(/*58.81*/username),format.raw/*58.89*/("""", message: newMessage, id: messageId """),format.raw/*58.127*/("""}"""),format.raw/*58.128*/(""")
                            .done(function() """),format.raw/*59.46*/("""{"""),format.raw/*59.47*/("""
                                """),format.raw/*60.33*/("""messageTextElement.innerText = newMessage;
                                location.reload();
                            """),format.raw/*62.29*/("""}"""),format.raw/*62.30*/(""");
                """),format.raw/*63.17*/("""}"""),format.raw/*63.18*/("""
                """),format.raw/*64.17*/("""function deleteMessage(messageId) """),format.raw/*64.51*/("""{"""),format.raw/*64.52*/("""
                    """),format.raw/*65.21*/("""if (confirm("Are you sure you want to delete this message?")) """),format.raw/*65.83*/("""{"""),format.raw/*65.84*/("""
                        """),format.raw/*66.25*/("""$.post(""""),_display_(/*66.34*/routes/*66.40*/.ChatroomController.destroy()),format.raw/*66.69*/("""", """),format.raw/*66.72*/("""{"""),format.raw/*66.73*/("""id: messageId """),format.raw/*66.87*/("""}"""),format.raw/*66.88*/(""")
                                .done(function() """),format.raw/*67.50*/("""{"""),format.raw/*67.51*/("""
                                    """),format.raw/*68.37*/("""const messageElement = document.getElementById('message-' + messageId);
                                    messageElement.remove();
                                    location.reload();
                                """),format.raw/*71.33*/("""}"""),format.raw/*71.34*/(""");
                    """),format.raw/*72.21*/("""}"""),format.raw/*72.22*/("""
                """),format.raw/*73.17*/("""}"""),format.raw/*73.18*/("""
        """),format.raw/*74.9*/("""</script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,body:Html,username:String): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)(username)

  def f:((String) => (Html) => (String) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => (username) => apply(title)(body)(username)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/layout.scala.html
                  HASH: ca89d442d97bca8abde43daefbd9fd8387910eae
                  MATRIX: 920->1|1059->47|1087->49|1157->93|1182->98|1270->160|1284->166|1355->216|1437->272|1451->278|1514->320|1601->381|1615->387|1675->426|1727->451|1742->457|1815->509|1899->566|1914->572|1984->621|2100->709|2129->710|2178->731|2336->861|2365->862|2410->879|2455->896|2484->897|2533->918|2745->1102|2774->1103|2819->1120|2870->1143|2899->1144|2948->1165|3009->1198|3038->1199|3083->1216|3130->1235|3159->1236|3208->1257|3296->1317|3325->1318|3370->1335|3423->1360|3452->1361|3501->1382|3596->1449|3625->1450|3661->1459|3729->1500|3754->1504|3790->1513|3866->1561|3895->1562|3944->1583|4129->1740|4158->1741|4211->1766|4247->1775|4262->1781|4309->1807|4340->1810|4369->1811|4398->1812|4437->1824|4466->1832|4515->1852|4545->1853|4624->1904|4653->1905|4718->1942|5045->2242|5074->2250|5474->2622|5503->2623|5554->2646|5583->2647|5628->2664|5657->2665|5702->2682|5762->2714|5791->2715|5840->2736|6214->3083|6229->3089|6278->3117|6309->3120|6338->3121|6367->3122|6406->3134|6435->3142|6502->3180|6532->3181|6607->3228|6636->3229|6697->3262|6847->3384|6876->3385|6923->3404|6952->3405|6997->3422|7059->3456|7088->3457|7137->3478|7227->3540|7256->3541|7309->3566|7345->3575|7360->3581|7410->3610|7441->3613|7470->3614|7512->3628|7541->3629|7620->3680|7649->3681|7714->3718|7962->3938|7991->3939|8042->3962|8071->3963|8116->3980|8145->3981|8181->3990
                  LINES: 27->1|32->2|34->4|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|43->13|43->13|44->14|46->16|46->16|47->17|47->17|47->17|48->18|51->21|51->21|52->22|52->22|52->22|53->23|54->24|54->24|55->25|55->25|55->25|56->26|57->27|57->27|58->28|58->28|58->28|59->29|60->30|60->30|61->31|64->34|64->34|65->35|66->36|66->36|67->37|69->39|69->39|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|71->41|71->41|72->42|75->45|75->45|80->50|80->50|81->51|81->51|82->52|82->52|83->53|83->53|83->53|84->54|88->58|88->58|88->58|88->58|88->58|88->58|88->58|88->58|88->58|88->58|89->59|89->59|90->60|92->62|92->62|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|96->66|96->66|96->66|96->66|96->66|97->67|97->67|98->68|101->71|101->71|102->72|102->72|103->73|103->73|104->74
                  -- GENERATED --
              */
          