
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/lab6/conf/routes
// @DATE:Thu Mar 15 20:12:08 GMT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:14
package controllers.security.javascript {

  // @LINE:14
  class ReverseLoginCtrl(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def loginSubmit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.loginSubmit",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:16
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:14
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.security.LoginCtrl.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
