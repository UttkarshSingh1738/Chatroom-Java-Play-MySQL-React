// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:63
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }

  // @LINE:59
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "save"})
        }
      """
    )
  
    // @LINE:8
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.register",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "register"})
        }
      """
    )
  
    // @LINE:14
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
        }
      """
    )
  
    // @LINE:43
    def appSummary: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.appSummary",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/summary"})
        }
      """
    )
  
    // @LINE:16
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:61
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseChatroomController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def destroy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChatroomController.destroy",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chatroom/delete/"})
        }
      """
    )
  
    // @LINE:29
    def userMessages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChatroomController.userMessages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chatroom/userMessages"})
        }
      """
    )
  
    // @LINE:21
    def send: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChatroomController.send",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chatroom/send"})
        }
      """
    )
  
    // @LINE:24
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChatroomController.update",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "chatroom/update/"})
        }
      """
    )
  
    // @LINE:18
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ChatroomController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chatroom"})
        }
      """
    )
  
  }

  // @LINE:40
  class ReverseFrontendController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FrontendController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:46
    def assetOrDefault: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FrontendController.assetOrDefault",
      """
        function(file0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file0)})
        }
      """
    )
  
  }


}
