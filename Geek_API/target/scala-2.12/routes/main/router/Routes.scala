// @GENERATOR:play-routes-compiler
// @SOURCE:/home/intelle/Desktop/qrios/conf/routes
// @DATE:Tue Jun 12 13:20:35 WAT 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:9
  QController_2: controllers.QController,
  // @LINE:35
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:9
    QController_2: controllers.QController,
    // @LINE:35
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, QController_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, QController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """QTest""", """controllers.QController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """QTest/XMLOutput""", """controllers.QController.index2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """QTest/GetXML/""" + "$" + """msg<[^/]+>""", """controllers.QController.callRetXML(msg:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """QTest/GetGeekId/""" + "$" + """gk<[^/]+>""", """controllers.QController.GetGkId(gk:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """QTest/Get1Result/""" + "$" + """param1<[^/]+>/""" + "$" + """table<[^/]+>/""" + "$" + """searchCrit<[^/]+>/""" + "$" + """input<[^/]+>""", """controllers.QController.GetOneParam(param1:String, table:String, searchCrit:String, input:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """QTest/""" + "$" + """accNo<[^/]+>/bankname/""" + "$" + """bankname<[^/]+>""", """controllers.QController.addCust(accNo:String, bankname:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """GeekReg/""" + "$" + """msisdn<[^/]+>/crit/""" + "$" + """psw<[^/]+>""", """controllers.QController.savP(msisdn:String, psw:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """QT/Wateva/""" + "$" + """geek<[^/]+>/enroller/""" + "$" + """el<[^/]+>/dsc/""" + "$" + """dsc<[^/]+>""", """controllers.QController.SaveSession(geek:String, el:String, dsc:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Enrol/""" + "$" + """gk<[^/]+>/enrl/""" + "$" + """el<[^/]+>""", """controllers.QController.Enroll(gk:String, el:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_QController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("QTest")))
  )
  private[this] lazy val controllers_QController_index1_invoker = createInvoker(
    QController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QController",
      "index",
      Nil,
      "GET",
      this.prefix + """QTest""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_QController_index22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("QTest/XMLOutput")))
  )
  private[this] lazy val controllers_QController_index22_invoker = createInvoker(
    QController_2.index2,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QController",
      "index2",
      Nil,
      "GET",
      this.prefix + """QTest/XMLOutput""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_QController_callRetXML3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("QTest/GetXML/"), DynamicPart("msg", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QController_callRetXML3_invoker = createInvoker(
    QController_2.callRetXML(fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QController",
      "callRetXML",
      Seq(classOf[Int]),
      "GET",
      this.prefix + """QTest/GetXML/""" + "$" + """msg<[^/]+>""",
      """ To print a message based on the parameter""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_QController_GetGkId4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("QTest/GetGeekId/"), DynamicPart("gk", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QController_GetGkId4_invoker = createInvoker(
    QController_2.GetGkId(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QController",
      "GetGkId",
      Seq(classOf[String]),
      "GET",
      this.prefix + """QTest/GetGeekId/""" + "$" + """gk<[^/]+>""",
      """ To check if a geek is enrolled""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_QController_GetOneParam5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("QTest/Get1Result/"), DynamicPart("param1", """[^/]+""",true), StaticPart("/"), DynamicPart("table", """[^/]+""",true), StaticPart("/"), DynamicPart("searchCrit", """[^/]+""",true), StaticPart("/"), DynamicPart("input", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QController_GetOneParam5_invoker = createInvoker(
    QController_2.GetOneParam(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QController",
      "GetOneParam",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """QTest/Get1Result/""" + "$" + """param1<[^/]+>/""" + "$" + """table<[^/]+>/""" + "$" + """searchCrit<[^/]+>/""" + "$" + """input<[^/]+>""",
      """ To one result from a table eg QTest/Get1Result/geek_id/ENROL_GEEK/GEEK_MSISDN/08132331337""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_QController_addCust6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("QTest/"), DynamicPart("accNo", """[^/]+""",true), StaticPart("/bankname/"), DynamicPart("bankname", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QController_addCust6_invoker = createInvoker(
    QController_2.addCust(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QController",
      "addCust",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """QTest/""" + "$" + """accNo<[^/]+>/bankname/""" + "$" + """bankname<[^/]+>""",
      """ To register account number and bank name""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_QController_savP7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("GeekReg/"), DynamicPart("msisdn", """[^/]+""",true), StaticPart("/crit/"), DynamicPart("psw", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QController_savP7_invoker = createInvoker(
    QController_2.savP(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QController",
      "savP",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """GeekReg/""" + "$" + """msisdn<[^/]+>/crit/""" + "$" + """psw<[^/]+>""",
      """ To save password for geek""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_QController_SaveSession8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("QT/Wateva/"), DynamicPart("geek", """[^/]+""",true), StaticPart("/enroller/"), DynamicPart("el", """[^/]+""",true), StaticPart("/dsc/"), DynamicPart("dsc", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QController_SaveSession8_invoker = createInvoker(
    QController_2.SaveSession(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QController",
      "SaveSession",
      Seq(classOf[String], classOf[String], classOf[String]),
      "POST",
      this.prefix + """QT/Wateva/""" + "$" + """geek<[^/]+>/enroller/""" + "$" + """el<[^/]+>/dsc/""" + "$" + """dsc<[^/]+>""",
      """ To save a customer session to SESSION_BASE""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_QController_Enroll9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Enrol/"), DynamicPart("gk", """[^/]+""",true), StaticPart("/enrl/"), DynamicPart("el", """[^/]+""",true)))
  )
  private[this] lazy val controllers_QController_Enroll9_invoker = createInvoker(
    QController_2.Enroll(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.QController",
      "Enroll",
      Seq(classOf[String], classOf[String]),
      "POST",
      this.prefix + """Enrol/""" + "$" + """gk<[^/]+>/enrl/""" + "$" + """el<[^/]+>""",
      """ To save a customer into enrol_base""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:9
    case controllers_QController_index1_route(params@_) =>
      call { 
        controllers_QController_index1_invoker.call(QController_2.index)
      }
  
    // @LINE:11
    case controllers_QController_index22_route(params@_) =>
      call { 
        controllers_QController_index22_invoker.call(QController_2.index2)
      }
  
    // @LINE:14
    case controllers_QController_callRetXML3_route(params@_) =>
      call(params.fromPath[Int]("msg", None)) { (msg) =>
        controllers_QController_callRetXML3_invoker.call(QController_2.callRetXML(msg))
      }
  
    // @LINE:17
    case controllers_QController_GetGkId4_route(params@_) =>
      call(params.fromPath[String]("gk", None)) { (gk) =>
        controllers_QController_GetGkId4_invoker.call(QController_2.GetGkId(gk))
      }
  
    // @LINE:20
    case controllers_QController_GetOneParam5_route(params@_) =>
      call(params.fromPath[String]("param1", None), params.fromPath[String]("table", None), params.fromPath[String]("searchCrit", None), params.fromPath[String]("input", None)) { (param1, table, searchCrit, input) =>
        controllers_QController_GetOneParam5_invoker.call(QController_2.GetOneParam(param1, table, searchCrit, input))
      }
  
    // @LINE:23
    case controllers_QController_addCust6_route(params@_) =>
      call(params.fromPath[String]("accNo", None), params.fromPath[String]("bankname", None)) { (accNo, bankname) =>
        controllers_QController_addCust6_invoker.call(QController_2.addCust(accNo, bankname))
      }
  
    // @LINE:26
    case controllers_QController_savP7_route(params@_) =>
      call(params.fromPath[String]("msisdn", None), params.fromPath[String]("psw", None)) { (msisdn, psw) =>
        controllers_QController_savP7_invoker.call(QController_2.savP(msisdn, psw))
      }
  
    // @LINE:29
    case controllers_QController_SaveSession8_route(params@_) =>
      call(params.fromPath[String]("geek", None), params.fromPath[String]("el", None), params.fromPath[String]("dsc", None)) { (geek, el, dsc) =>
        controllers_QController_SaveSession8_invoker.call(QController_2.SaveSession(geek, el, dsc))
      }
  
    // @LINE:32
    case controllers_QController_Enroll9_route(params@_) =>
      call(params.fromPath[String]("gk", None), params.fromPath[String]("el", None)) { (gk, el) =>
        controllers_QController_Enroll9_invoker.call(QController_2.Enroll(gk, el))
      }
  
    // @LINE:35
    case controllers_Assets_versioned10_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
