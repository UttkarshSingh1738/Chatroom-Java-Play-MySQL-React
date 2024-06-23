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
  // @LINE:5
  HomeController_0: controllers.HomeController,
  // @LINE:10
  ChatroomController_1: controllers.ChatroomController,
  // @LINE:17
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HomeController_0: controllers.HomeController,
    // @LINE:10
    ChatroomController_1: controllers.ChatroomController,
    // @LINE:17
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, ChatroomController_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, ChatroomController_1, Assets_2, prefix)
  }

  private val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.HomeController.register()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/save""", """controllers.HomeController.save(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/authenticate""", """controllers.HomeController.authenticate(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/logout""", """controllers.HomeController.logout(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/chatroom""", """controllers.ChatroomController.index(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/chatroom/send""", """controllers.ChatroomController.send(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/chatroom/update""", """controllers.ChatroomController.update(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/chatroom/delete""", """controllers.ChatroomController.destroy(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/chatroom/userMessages""", """controllers.ChatroomController.userMessages(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(file:String)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:5
  private lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private lazy val controllers_HomeController_register1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private lazy val controllers_HomeController_register1_invoker = createInvoker(
    HomeController_0.register(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private lazy val controllers_HomeController_save2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/save")))
  )
  private lazy val controllers_HomeController_save2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/save""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private lazy val controllers_HomeController_authenticate3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/authenticate")))
  )
  private lazy val controllers_HomeController_authenticate3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.authenticate(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "authenticate",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/authenticate""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private lazy val controllers_HomeController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/logout")))
  )
  private lazy val controllers_HomeController_logout4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.logout(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/logout""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private lazy val controllers_ChatroomController_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/chatroom")))
  )
  private lazy val controllers_ChatroomController_index5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_1.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """api/chatroom""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private lazy val controllers_ChatroomController_send6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/chatroom/send")))
  )
  private lazy val controllers_ChatroomController_send6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_1.send(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "send",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/chatroom/send""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private lazy val controllers_ChatroomController_update7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/chatroom/update")))
  )
  private lazy val controllers_ChatroomController_update7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_1.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/chatroom/update""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private lazy val controllers_ChatroomController_destroy8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/chatroom/delete")))
  )
  private lazy val controllers_ChatroomController_destroy8_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_1.destroy(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "destroy",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/chatroom/delete""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private lazy val controllers_ChatroomController_userMessages9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/chatroom/userMessages")))
  )
  private lazy val controllers_ChatroomController_userMessages9_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      ChatroomController_1.userMessages(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ChatroomController",
      "userMessages",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """api/chatroom/userMessages""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""", encodeable=false)))
  )
  private lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String]),
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
  
    // @LINE:5
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:6
    case controllers_HomeController_register1_route(params@_) =>
      call { 
        controllers_HomeController_register1_invoker.call(HomeController_0.register())
      }
  
    // @LINE:7
    case controllers_HomeController_save2_route(params@_) =>
      call { 
        controllers_HomeController_save2_invoker.call(
          req => HomeController_0.save(req))
      }
  
    // @LINE:8
    case controllers_HomeController_authenticate3_route(params@_) =>
      call { 
        controllers_HomeController_authenticate3_invoker.call(
          req => HomeController_0.authenticate(req))
      }
  
    // @LINE:9
    case controllers_HomeController_logout4_route(params@_) =>
      call { 
        controllers_HomeController_logout4_invoker.call(
          req => HomeController_0.logout(req))
      }
  
    // @LINE:10
    case controllers_ChatroomController_index5_route(params@_) =>
      call { 
        controllers_ChatroomController_index5_invoker.call(
          req => ChatroomController_1.index(req))
      }
  
    // @LINE:11
    case controllers_ChatroomController_send6_route(params@_) =>
      call { 
        controllers_ChatroomController_send6_invoker.call(
          req => ChatroomController_1.send(req))
      }
  
    // @LINE:12
    case controllers_ChatroomController_update7_route(params@_) =>
      call { 
        controllers_ChatroomController_update7_invoker.call(
          req => ChatroomController_1.update(req))
      }
  
    // @LINE:13
    case controllers_ChatroomController_destroy8_route(params@_) =>
      call { 
        controllers_ChatroomController_destroy8_invoker.call(
          req => ChatroomController_1.destroy(req))
      }
  
    // @LINE:14
    case controllers_ChatroomController_userMessages9_route(params@_) =>
      call { 
        controllers_ChatroomController_userMessages9_invoker.call(
          req => ChatroomController_1.userMessages(req))
      }
  
    // @LINE:17
    case controllers_Assets_versioned10_route(params@_) =>
      call(params.fromPath[String]("file", None)) { (file) =>
        controllers_Assets_versioned10_invoker.call(Assets_2.versioned(file))
      }
  }
}
