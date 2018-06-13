// @GENERATOR:play-routes-compiler
// @SOURCE:/home/intelle/Desktop/qrios/conf/routes
// @DATE:Tue Jun 12 13:20:35 WAT 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:9
  class ReverseQController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def savP(msisdn:String, psw:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "GeekReg/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("msisdn", msisdn)) + "/crit/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("psw", psw)))
    }
  
    // @LINE:20
    def GetOneParam(param1:String, table:String, searchCrit:String, input:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "QTest/Get1Result/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("param1", param1)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("table", table)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("searchCrit", searchCrit)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("input", input)))
    }
  
    // @LINE:11
    def index2(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "QTest/XMLOutput")
    }
  
    // @LINE:23
    def addCust(accNo:String, bankname:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "QTest/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("accNo", accNo)) + "/bankname/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("bankname", bankname)))
    }
  
    // @LINE:32
    def Enroll(gk:String, el:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "Enrol/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("gk", gk)) + "/enrl/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("el", el)))
    }
  
    // @LINE:14
    def callRetXML(msg:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "QTest/GetXML/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("msg", msg)))
    }
  
    // @LINE:17
    def GetGkId(gk:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "QTest/GetGeekId/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("gk", gk)))
    }
  
    // @LINE:29
    def SaveSession(geek:String, el:String, dsc:String): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "QT/Wateva/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("geek", geek)) + "/enroller/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("el", el)) + "/dsc/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("dsc", dsc)))
    }
  
    // @LINE:9
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "QTest")
    }
  
  }

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:35
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
