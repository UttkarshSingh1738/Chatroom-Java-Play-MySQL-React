// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:63
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:63
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:59
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:59
    def count: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "save")
    }
  
    // @LINE:8
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:14
    def authenticate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:43
    def appSummary: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/summary")
    }
  
    // @LINE:16
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:61
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def message: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }

  // @LINE:18
  class ReverseChatroomController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def destroy(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "chatroom/delete/")
    }
  
    // @LINE:29
    def userMessages(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chatroom/userMessages")
    }
  
    // @LINE:21
    def send(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "chatroom/send")
    }
  
    // @LINE:24
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "chatroom/update/")
    }
  
    // @LINE:18
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "chatroom")
    }
  
  }

  // @LINE:40
  class ReverseFrontendController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:40
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:46
    def assetOrDefault(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
