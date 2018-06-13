// @GENERATOR:play-routes-compiler
// @SOURCE:/home/intelle/Desktop/qrios/conf/routes
// @DATE:Tue Jun 12 13:20:35 WAT 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:9
  class ReverseQController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def savP: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QController.savP",
      """
        function(msisdn0,psw1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "GeekReg/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("msisdn", msisdn0)) + "/crit/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("psw", psw1))})
        }
      """
    )
  
    // @LINE:20
    def GetOneParam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QController.GetOneParam",
      """
        function(param10,table1,searchCrit2,input3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "QTest/Get1Result/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("param1", param10)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("table", table1)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("searchCrit", searchCrit2)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("input", input3))})
        }
      """
    )
  
    // @LINE:11
    def index2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QController.index2",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "QTest/XMLOutput"})
        }
      """
    )
  
    // @LINE:23
    def addCust: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QController.addCust",
      """
        function(accNo0,bankname1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "QTest/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("accNo", accNo0)) + "/bankname/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("bankname", bankname1))})
        }
      """
    )
  
    // @LINE:32
    def Enroll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QController.Enroll",
      """
        function(gk0,el1) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "Enrol/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("gk", gk0)) + "/enrl/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("el", el1))})
        }
      """
    )
  
    // @LINE:14
    def callRetXML: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QController.callRetXML",
      """
        function(msg0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "QTest/GetXML/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("msg", msg0))})
        }
      """
    )
  
    // @LINE:17
    def GetGkId: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QController.GetGkId",
      """
        function(gk0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "QTest/GetGeekId/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("gk", gk0))})
        }
      """
    )
  
    // @LINE:29
    def SaveSession: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QController.SaveSession",
      """
        function(geek0,el1,dsc2) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "QT/Wateva/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("geek", geek0)) + "/enroller/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("el", el1)) + "/dsc/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("dsc", dsc2))})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.QController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "QTest"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:35
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
