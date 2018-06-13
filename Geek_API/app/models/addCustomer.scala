package models

import play.api.libs.json._
import play.api.libs.functional.syntax._

import controllers.QController
import models.dao.addUser

object addCustomer {
	implicit val addCustomerWrites : Writes[addCustomer] = (
		(JsPath \ "accNo").write[String] and
		(JsPath \ "bankname").write[String]
	)(unlift(addCustomer.unapply))

def addUsers(accNo: String, bankname: String): addCustomer = {
	val user = addCustomer(accNo, bankname)

	addUser.create(user)

	user
}


def addEnrollCustomer(geek: String, enroled: String) = {
	addUser.enrol(geek, enroled)
}

def savPass(gk: String, psw: String) = {
	addUser.savePasswordForGeek(gk, psw)
}

def saveAnyIntoSession(gk: String, el: String, descr: String) = {
	addUser.saveDetailsIntoSessionBase(gk, el, descr)
}

////// Not used
def saveAnyIntoEnrol(gk: String, el: String) = {
	addUser.saveDetailsIntoEnrolBase(gk, el)
}
/////////

def getGeek(gk: String) = {
	addUser.GetGeekId(gk)
}

def get1Param(param1: String, table: String, searchCrit: String, input: String) = {
	addUser.GetOneParamFromGeek(param1, table, searchCrit, input)
}
//saveDetailsIntoEnrolBase(gk: String, el: String)

}

case class addCustomer(accNo : String, bankname : String)