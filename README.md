This Scala Project is written by Onibokun Sola in April 2018.

It is his first Scala Project..

It is written to test his knowledge about API endpoints.

Feel free to clone the repo and extract the folder "Geek_API"

######################### How to set up the environment ######################

1.  Download and install the latest version of jdk. Visit here to download it http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

2.  After you've installed the jdk, then install Scala compiler. Visit here https://www.scala-lang.org/download/

3.  Verify both installations by executing the following commands at the terminal :

    java -version
    
    scala -version
    
4.  From the terminal, navigate to the Geek_API directory and execute the following command :

    sbt run
    
###############################################################################

##########################  How to test the URI endpoints ################################

 To print a XML message based on the parameter. The parameter should be an integer from 1 to 7 as descried inside the response_code table
 
  GET     /QTest/GetXML/@msg


 To check if a geek is enrolled. If geek is enrolled, result is 1, 0 otherwise.
 
  GET     /QTest/GetGeekId/@gk_phonenumber


 To one result from any table eg QTest/Get1Result/geek_id/ENROL_GEEK/geek_msisdn/081XXXXXXX {will fetch @geek_id FROM @ENROL_GEEK table WHERE @geek_msisdn = @081XXXXXXXX}
 
  GET     /QTest/Get1Result/@param_to_select/@table_to_select_from/@search_criteria_field/@search_criteria_data


 To register account number and bank name
 
  POST     /QTest/@accNo/bankname/@bankname


 To save a customer session to SESSION_BASE
 
  POST     /QT/Wateva/@geek/enroller/@enroller/dsc/@msg_dsc_eg_201_202_203......


 To save a customer into enrol_base
 
  POST     /Enrol/@geek/enrl/@enroller

############################################################################################

Any difficulty ?

Send an email to :: solaonibokun@gmail.com

Best Regards.
