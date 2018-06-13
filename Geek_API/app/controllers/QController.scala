package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import models.addCustomer // Needed for dao

import models.dao.addUser // needed to unset var
import play.api.libs.json._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class QController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.showMessage())
  }

  def index2() = Action { implicit request: Request[AnyContent] =>
    Ok(<customers><customer accNo = "3046836235"><bank name = "firstbank"/></customer><customer accNo = "2067549049"><bank name = "firstbank"/></customer></customers>)
  }

  def addCust(accNo : String, bankname : String) = Action { implicit request: Request[AnyContent] =>
    //Ok(???)
    val user = addCustomer.addUsers(accNo, bankname)

    Ok(Json.obj("result" -> user)).enableCors
  }

  def Enroll(geek : String, enroled : String) = Action { implicit request: Request[AnyContent] =>
    //Ok(???)
    val ans = addCustomer.addEnrollCustomer(geek, enroled)

    Ok(Json.obj("result" -> ans)).enableCors
  }

  def savP(gek : String, enr : String) = Action { implicit request: Request[AnyContent] =>
    //Ok(???)
    val ans = addCustomer.savPass(gek, enr)

    Ok(Json.obj("result" -> ans, "msisdn" -> gek)).enableCors
  }

  def SaveSession(geek : String, enroled : String, descr : String) = Action { implicit request: Request[AnyContent] =>
    //Ok(???)
    val ans = addCustomer.saveAnyIntoSession(geek, enroled, descr)
    var rest : String = null
    //if(ans == 1) rest = s"<?xml version='1.0' encoding='UTF-8'?><note>$msg</note>"
    Ok(Json.obj("result" -> ans)).enableCors
  }

//saveAnyIntoEnrol(gk: String, el: String)
  def retXML(msg : String) = Action { implicit request: Request[AnyContent] =>
    Ok(s"<?xml version='1.0' encoding='UTF-8'?><note>$msg</note>").enableCors
  }

  def retXMLBlaBla(msg : String) : String =  { 
    val k = "<?xml version='1.0' encoding='UTF-8'?><note>" + msg + "</note>"
    //var b = scala.xml.XML.loadString(k)
    //b
    k
  }

  def callRetXML(msgCode : Int) = Action { implicit request: Request[AnyContent] =>
    var k: String = ""
    if(msgCode == 1) k = retXMLBlaBla("Number Already exist")
     else if(msgCode == 2) k = retXMLBlaBla("Number previously updated")
      else if(msgCode == 3) k = retXMLBlaBla("Update successful")
        else if(msgCode == 4) k = retXMLBlaBla("Update failed")
          else if(msgCode == 5) k = retXMLBlaBla("Number doesn't exist on platform")
            else if(msgCode == 6) k = retXMLBlaBla("You are not enrolled for this service")
              else k = "Invalid bla bla bla"
    Ok(k).enableCors
  }

  def GetGkId(geek : String) = Action { implicit request: Request[AnyContent] =>
    //Ok(???)
    val ans = addCustomer.getGeek(geek)
    addUser.gkId = "empty"
    Ok(Json.obj("result" -> ans)).enableCors
  }

  def GetOneParam(param1: String, table: String, searchCrit: String, input: String) = Action { implicit request: Request[AnyContent] =>
    //Ok(???)
    val ans = addCustomer.get1Param(param1, table, searchCrit, input)
    addUser.oneParam = "empty"
    Ok(Json.obj("result" -> ans)).enableCors
  }
  
implicit class RichResult (result: Result) {
  def enableCors =  result.withHeaders(
    "Access-Control-Allow-Origin" -> "*"
    , "Access-Control-Allow-Methods" -> "OPTIONS, GET, POST, PUT, DELETE, HEAD"   // OPTIONS for pre-flight
    , "Access-Control-Allow-Headers" -> "Accept, Content-Type, Origin, X-Json, X-Prototype-Version, X-Requested-With" //, "X-My-NonStd-Option"
    , "Access-Control-Allow-Credentials" -> "true"
  )
}

}
