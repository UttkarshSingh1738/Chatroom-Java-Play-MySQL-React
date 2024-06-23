// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_5: controllers.HomeController,
  // @LINE:18
  ChatroomController_2: controllers.ChatroomController,
  // @LINE:40
  FrontendController_0: controllers.FrontendController,
  // @LINE:59
  CountController_1: controllers.CountController,
  // @LINE:61
  AsyncController_4: controllers.AsyncController,
  // @LINE:63
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_5: controllers.HomeController,
    // @LINE:18
    ChatroomController_2: controllers.ChatroomController,
    // @LINE:40
    FrontendController_0: controllers.FrontendController,
    // @LINE:59
    CountController_1: controllers.CountController,
    // @LINE:61
    AsyncController_4: controllers.AsyncController,
    // @LINE:63
    Assets_3: controllers.Assets
  ) = this(errorHandler, HomeController_5, ChatroomController_2, FrontendController_0, CountController_1, AsyncController_4, Assets_3, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_5, ChatroomController_2, FrontendController_0, CountController_1, AsyncController_4, Assets_3, prefix)
  }

  private val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """save""", """controllers.HomeController.save(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.HomeController.authenticate(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chatroom""", """controllers.ChatroomController.index(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chatroom/send""", """controllers.ChatroomController.send(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chatroom/update/""", """controllers.ChatroomController.update(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chatroom/delete/""", """controllers.ChatroomController.destroy(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """chatroom/userMessages""", """controllers.ChatroomController.userMessages(request:Request)"""),
    ("""GET""", this.prefix, """controllers.FrontendController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/summary""", """controllers.HomeController.appSummary"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """""" + "$" + """file<.+>""", """controllers.FrontendController.assetOrDefault(file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:6
  private lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private lazy val controllers_HomeController_index0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """ Login Page""",
      Seq()
    )
  )

  // @LINE:8
  private lazy val controllers_HomeController_register1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private lazy val controllers_HomeController_register1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.register(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """register""",
      """ Register Page""",
      Seq()
    )
  )

  // @LINE:11
  private lazy val controllers_HomeController_save2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("save")))
  )
  private lazy val controllers_HomeController_save2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """save""",
      """ Save User""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:14
  private lazy val controllers_HomeController_authenticate3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private lazy val controllers_HomeController_authenticate3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_5.authenticate(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "authenticate",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """auth""",
      """ Authenticate User""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:16
  private lazy val controllers_HomeController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private lazy val controllers_HomeController_logout4_invoker = createInvoker(
    HomeController_5.logout(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """ Logout""",
      Seq()
    )
  )

  // @LINE:18
  private lazy val controllers_ChatroomController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chatroom")))
  )
  private lazy val controllers_ChatroomController_index5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_2.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """chatroom""",
      """ Chatroom""",
      Seq()
    )
  )

  // @LINE:21
  private lazy val controllers_ChatroomController_send6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chatroom/send")))
  )
  private lazy val controllers_ChatroomController_send6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_2.send(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "send",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """chatroom/send""",
      """ Sent Chat""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:24
  private lazy val controllers_ChatroomController_update7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chatroom/update/")))
  )
  private lazy val controllers_ChatroomController_update7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_2.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """chatroom/update/""",
      """ Update Chat""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:27
  private lazy val controllers_ChatroomController_destroy8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chatroom/delete/")))
  )
  private lazy val controllers_ChatroomController_destroy8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_2.destroy(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "destroy",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """chatroom/delete/""",
      """ Destroy Chat""",
      Seq("""nocsrf""")
    )
  )

  // @LINE:29
  private lazy val controllers_ChatroomController_userMessages9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("chatroom/userMessages")))
  )
  private lazy val controllers_ChatroomController_userMessages9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_2.userMessages(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "userMessages",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """chatroom/userMessages""",
      """ User Messages""",
      Seq()
    )
  )

  // @LINE:40
  private lazy val controllers_FrontendController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private lazy val controllers_FrontendController_index10_invoker = createInvoker(
    FrontendController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrontendController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Serve index page from public directory""",
      Seq()
    )
  )

  // @LINE:43
  private lazy val controllers_HomeController_appSummary11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/summary")))
  )
  private lazy val controllers_HomeController_appSummary11_invoker = createInvoker(
    HomeController_5.appSummary,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "appSummary",
      Nil,
      "GET",
      this.prefix + """api/summary""",
      """ An example route (Prefix all API routes with apiPrefix defined in application.conf)""",
      Seq()
    )
  )

  // @LINE:46
  private lazy val controllers_FrontendController_assetOrDefault12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), DynamicPart("file", """.+""", encodeable=false)))
  )
  private lazy val controllers_FrontendController_assetOrDefault12_invoker = createInvoker(
    FrontendController_0.assetOrDefault(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FrontendController",
      "assetOrDefault",
      Seq(classOf[String]),
      "GET",
      this.prefix + """""" + "$" + """file<.+>""",
      """ Serve static assets under public directory""",
      Seq()
    )
  )

  // @LINE:59
  private lazy val controllers_CountController_count13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private lazy val controllers_CountController_count13_invoker = createInvoker(
    CountController_1.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:61
  private lazy val controllers_AsyncController_message14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private lazy val controllers_AsyncController_message14_invoker = createInvoker(
    AsyncController_4.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:63
  private lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""", encodeable=false)))
  )
  private lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(
          req => HomeController_5.index(req))
      }
  
    // @LINE:8
    case controllers_HomeController_register1_route(params@_) =>
      call { 
        controllers_HomeController_register1_invoker.call(
          req => HomeController_5.register(req))
      }
  
    // @LINE:11
    case controllers_HomeController_save2_route(params@_) =>
      call { 
        controllers_HomeController_save2_invoker.call(
          req => HomeController_5.save(req))
      }
  
    // @LINE:14
    case controllers_HomeController_authenticate3_route(params@_) =>
      call { 
        controllers_HomeController_authenticate3_invoker.call(
          req => HomeController_5.authenticate(req))
      }
  
    // @LINE:16
    case controllers_HomeController_logout4_route(params@_) =>
      call { 
        controllers_HomeController_logout4_invoker.call(HomeController_5.logout())
      }
  
    // @LINE:18
    case controllers_ChatroomController_index5_route(params@_) =>
      call { 
        controllers_ChatroomController_index5_invoker.call(
          req => ChatroomController_2.index(req))
      }
  
    // @LINE:21
    case controllers_ChatroomController_send6_route(params@_) =>
      call { 
        controllers_ChatroomController_send6_invoker.call(
          req => ChatroomController_2.send(req))
      }
  
    // @LINE:24
    case controllers_ChatroomController_update7_route(params@_) =>
      call { 
        controllers_ChatroomController_update7_invoker.call(
          req => ChatroomController_2.update(req))
      }
  
    // @LINE:27
    case controllers_ChatroomController_destroy8_route(params@_) =>
      call { 
        controllers_ChatroomController_destroy8_invoker.call(
          req => ChatroomController_2.destroy(req))
      }
  
    // @LINE:29
    case controllers_ChatroomController_userMessages9_route(params@_) =>
      call { 
        controllers_ChatroomController_userMessages9_invoker.call(
          req => ChatroomController_2.userMessages(req))
      }
  
    // @LINE:40
    case controllers_FrontendController_index10_route(params@_) =>
      call { 
        controllers_FrontendController_index10_invoker.call(FrontendController_0.index())
      }
  
    // @LINE:43
    case controllers_HomeController_appSummary11_route(params@_) =>
      call { 
        controllers_HomeController_appSummary11_invoker.call(HomeController_5.appSummary)
      }
  
    // @LINE:46
    case controllers_FrontendController_assetOrDefault12_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_FrontendController_assetOrDefault12_invoker.call(FrontendController_0.assetOrDefault(file))
      }
  
    // @LINE:59
    case controllers_CountController_count13_route(params@_) =>
      call { 
        controllers_CountController_count13_invoker.call(CountController_1.count)
      }
  
    // @LINE:61
    case controllers_AsyncController_message14_route(params@_) =>
      call { 
        controllers_AsyncController_message14_invoker.call(AsyncController_4.message)
      }
  
    // @LINE:63
    case controllers_Assets_versioned15_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned15_invoker.call(Assets_3.versioned(file))
      }
  }
}
