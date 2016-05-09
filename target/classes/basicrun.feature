#Auther:jkoracle23@gmail.com
Feature: This is a test feature to prepare backbone for soap webservices testing

Background:
Given The WSDL project name "src/test/resources/Project-1-soapui-project.xml" and Testsuite name "WeathersoapRegression"


Scenario: Validating response for request with some input

Given The testcasename "GetCityForecastByZip" and TestStepname "simplegetCityForecastByZip" 
And The request Endpoint is "http://wsf.cdyne.com/WeatherWS/Weather.asmx"
When Input data with node <>
     |ZIP|
     |98004|
     |92304|
     |92314|
 When Expected xpath of nodes are    
   
   #This table will contain all the xpath of nodes with teststep name and format as shown 
   #${<teststep name>#Response#<node xpath>}
   
     |${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}|
     |${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}|
     |${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}|
     |${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}|
     |${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}|
     

When Expected result represented by table 
  #This table will contain expected response value
  #Each row corresponds to xpath node table row
  #Each column corresponds to run based on input data i.e it will be inputdata row-1      
     
     |Bellevue|Amboy|Big Bear City|
     |Bellevue|Amboy|Big Bear City|
     |Bellevue|Amboy|Big Bear City|
     |Bellevue|Amboy|Big Bear City|
     |Bellevue dummy value|Amboy dummy value|Big Bear City dummy value|
    
     
    
Then Run the step and validate the result

Scenario: Validating response for request with some input a second case

Given The testcasename "GetCityForecastByZip" and TestStepname "FullCountryInfo" 
And The request Endpoint is "http://www.oorsprong.org/websamples.countryinfo/CountryInfoService.wso"
When Input data with node <>
     |sCountryISOCode|
     |IND|
     |GB|
     |USA|
 When Expected xpath of nodes are    
   
   #This table will contain all the xpath of nodes with teststep name and format as shown 
   #${<teststep name>#Response#<node xpath>}
   
     |${FullCountryInfo#Response#//m:FullCountryInfoResult/m:sISOCode}|
     |${FullCountryInfo#Response#//m:FullCountryInfoResult/m:sName}|
     |${FullCountryInfo#Response#//m:FullCountryInfoResult/m:sCapitalCity}|
     |${FullCountryInfo#Response#//m:FullCountryInfoResult/m:sPhoneCode}|
     |${FullCountryInfo#Response#//m:tLanguage/m:sName}|
     

When Expected result represented by table 
  #This table will contain expected response value
  #Each row corresponds to xpath node table row
  #Each column corresponds to run based on input data i.e it will be inputdata row-1      
     
     |IN|GB|US|
     |India|United Kingdom|United States|
     |New Delhi|London|Washington|
     |91|44|1|
     |Hindi|English|English|
    
     
    
Then Run the step and validate the result
