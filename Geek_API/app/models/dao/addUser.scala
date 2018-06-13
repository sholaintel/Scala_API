package models.dao

import play.api.Play.current
//import play.libs.db._
import java.sql.{Connection, DriverManager, Statement}
// import anorm._
// import anorm.SqlParser._
import play.api.libs.json._

import models.addCustomer

object addUser {


	//val url = "jdbc:mysql://localhost:3306/dummyTest"
    //val driver = "com.mysql.jdbc.Driver"
    val username = "root"
    val password = "Olamilekan"
    var connection:Connection = null
    var statement:Statement = null
    var gkId:String = "empty"
    var oneParam:String = "empty"

    def setUpDb() : Unit = {
        classOf[org.postgresql.Driver]
        val con_st = "jdbc:postgresql://localhost:5432/dummytest?user=postgres&password=Olamilekan"
    	try {
        //Class.forName(driver)
        //connection = DriverManager.getConnection(url, username, password)
        connection = DriverManager.getConnection(con_st)
        statement = connection.createStatement
        // val rs = statement.executeQuery("SELECT host, user FROM user")
        // while (rs.next) {
        //     val host = rs.getString("host")
        //     val user = rs.getString("user")
        //     println("host = %s, user = %s".format(host,user))
        // }
    } catch {
    	case e: Exception => e.printStackTrace
    }
    

    }

	def create(bank : addCustomer) =  {

    setUpDb()

    connection.close

	}

	/// My Own functions

	def enrol(gk: String, el: String): Int = {
	   var res = 0
        setUpDb()
        try {
    	   res = statement.executeUpdate("INSERT INTO ENROL_BASE(geek_msisdn,enroled_msisdn,STAMP,STAMPM) VALUES('" + gk + "', '" + el + "', CURRENT_DATE, CURRENT_TIME)")
        }
        catch{
    	case e: Exception => {

    	}
       }
        connection.close

        res
	}

    def savePasswordForGeek(gk: String, psw: String): Int = {
        var res = 0
        val b: String = GetGeekId(gk)
        println(b)
        if(b != "empty") {
            setUpDb()
        try {
            val sql: String = "INSERT INTO geekusers(usern, psw) VALUES('" + gk + "', '" + psw + "')"
            println(sql)
           res = statement.executeUpdate(sql)
           gkId = "empty"
        }
        catch{
        case e: Exception => {
            //println(e)
            res = -1
        }
       }
   }
       else res = -3

        connection.close

        res
    }

    def saveDetailsIntoSessionBase(gk: String, el: String, descr: String) : Int = {
        var res = 0
        setUpDb()
        res = statement.executeUpdate("INSERT INTO SESSION_BASE(geek_msisdn, enroled_msisdn ,descr) VALUES('" + gk + "', '" + el + "', '" + descr + "')")
        connection.close
        res
    }

    def GetGeekId(msisdn: String) : String = {
        setUpDb()
        val rs = statement.executeQuery("SELECT geek_id FROM ENROL_GEEK WHERE geek_msisdn = '" + msisdn + "' AND flag = '1'")
        if (rs.next) {
            gkId = rs.getString("geek_id")
            //println("host = %s, user = %s".format(host,user))
        }
        connection.close
        gkId
    }

    def GetOneParamFromGeek(param1: String, table: String, searchCrit: String, input: String) : String = {
        setUpDb()
        val rs = statement.executeQuery("SELECT " + param1 + " FROM " + table + " WHERE " + searchCrit + " = '" + input + "'")
        if (rs.next) {
            oneParam = rs.getString(param1)
            //println("host = %s, user = %s".format(host,user))
        }
        connection.close
        oneParam
    }

/////   Not used
    def saveDetailsIntoEnrolBase(gk: String, el: String) : Int = {
        var res = 0
        setUpDb()
        res = statement.executeUpdate("INSERT INTO ENROL_BASE (geek_msisdn,enroled_msisdn,STAMP,STAMPM) VALUES('" + gk + "', '" + el + "', CURRENT_DATE, CURRENT_TIME)")
        connection.close
        res
    }
}