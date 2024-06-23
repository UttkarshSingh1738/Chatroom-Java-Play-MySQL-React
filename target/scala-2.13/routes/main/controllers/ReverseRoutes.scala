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

  
    // @LINE:7
    def save(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/save")
    }
  
    // @LINE:8
    def authenticate(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/authenticate")
    }
  
    // @LINE:6
    def register(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "register")
    }
  
    // @LINE:9
    def logout(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/logout")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:10
  class ReverseChatroomController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def destroy(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/chatroom/delete")
    }
  
    // @LINE:14
    def userMessages(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/chatroom/userMessages")
    }
  
    // @LINE:11
    def send(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/chatroom/send")
    }
  
    // @LINE:12
    def update(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "api/chatroom/update")
    }
  
    // @LINE:10
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "api/chatroom")
    }
  
  }

  // @LINE:17
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def versioned(file:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
