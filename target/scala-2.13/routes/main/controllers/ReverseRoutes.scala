// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:5
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/save")
    }
  
    // @LINE:11
    def authenticate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/authenticate")
    }
  
    // @LINE:7
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:13
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/logout")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseChatroomController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def destroy(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/chatroom/delete")
    }
  
    // @LINE:23
    def userMessages(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/chatroom/userMessages")
    }
  
    // @LINE:17
    def send(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/chatroom/send")
    }
  
    // @LINE:19
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/chatroom/update")
    }
  
    // @LINE:15
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/chatroom")
    }
  
  }

  // @LINE:26
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
