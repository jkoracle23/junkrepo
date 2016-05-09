$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1_aaaa_project_setup.feature");
formatter.feature({
  "line": 1,
  "name": "Initial project setup",
  "description": "",
  "id": "initial-project-setup",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Setup the excel file and fileinput stream",
  "description": "",
  "id": "initial-project-setup;setup-the-excel-file-and-fileinput-stream",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Do all the excel file setup",
  "keyword": "Given "
});
formatter.match({
  "location": "basicrunStepDef.do_all_the_excel_file_setup()"
});
formatter.result({
  "duration": 725756305,
  "status": "passed"
});
formatter.uri("basicrun.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Auther:jkoracle23@gmail.com"
    }
  ],
  "line": 2,
  "name": "This is a test feature to prepare backbone for soap webservices testing",
  "description": "",
  "id": "this-is-a-test-feature-to-prepare-backbone-for-soap-webservices-testing",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The WSDL project name \"src/test/resources/Project-1-soapui-project.xml\" and Testsuite name \"WeathersoapRegression\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "src/test/resources/Project-1-soapui-project.xml",
      "offset": 23
    },
    {
      "val": "WeathersoapRegression",
      "offset": 92
    }
  ],
  "location": "basicrunStepDef.the_WSDL_project_name_and_Testsuite_name(String,String)"
});
formatter.result({
  "duration": 5955648397,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Validating response for request with some input",
  "description": "",
  "id": "this-is-a-test-feature-to-prepare-backbone-for-soap-webservices-testing;validating-response-for-request-with-some-input",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "The testcasename \"GetCityForecastByZip\" and TestStepname \"simplegetCityForecastByZip\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "The request Endpoint is \"http://wsf.cdyne.com/WeatherWS/Weather.asmx\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Input data with node \u003c\u003e",
  "rows": [
    {
      "cells": [
        "ZIP"
      ],
      "line": 13
    },
    {
      "cells": [
        "98004"
      ],
      "line": 14
    },
    {
      "cells": [
        "92304"
      ],
      "line": 15
    },
    {
      "cells": [
        "92314"
      ],
      "line": 16
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Expected xpath of nodes are",
  "rows": [
    {
      "comments": [
        {
          "line": 19,
          "value": "#This table will contain all the xpath of nodes with teststep name and format as shown"
        },
        {
          "line": 20,
          "value": "#${\u003cteststep name\u003e#Response#\u003cnode xpath\u003e}"
        }
      ],
      "cells": [
        "${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}"
      ],
      "line": 22
    },
    {
      "cells": [
        "${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}"
      ],
      "line": 23
    },
    {
      "cells": [
        "${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}"
      ],
      "line": 24
    },
    {
      "cells": [
        "${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}"
      ],
      "line": 25
    },
    {
      "cells": [
        "${simplegetCityForecastByZip#Response#//ns1:GetCityForecastByZIPResult/ns1:City}"
      ],
      "line": 26
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Expected result represented by table",
  "rows": [
    {
      "comments": [
        {
          "line": 30,
          "value": "#This table will contain expected response value"
        },
        {
          "line": 31,
          "value": "#Each row corresponds to xpath node table row"
        },
        {
          "line": 32,
          "value": "#Each column corresponds to run based on input data i.e it will be inputdata row-1"
        }
      ],
      "cells": [
        "Bellevue",
        "Amboy",
        "Big Bear City"
      ],
      "line": 34
    },
    {
      "cells": [
        "Bellevue",
        "Amboy",
        "Big Bear City"
      ],
      "line": 35
    },
    {
      "cells": [
        "Bellevue",
        "Amboy",
        "Big Bear City"
      ],
      "line": 36
    },
    {
      "cells": [
        "Bellevue",
        "Amboy",
        "Big Bear City"
      ],
      "line": 37
    },
    {
      "cells": [
        "Bellevue dummy value",
        "Amboy dummy value",
        "Big Bear City dummy value"
      ],
      "line": 38
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "Run the step and validate the result",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "GetCityForecastByZip",
      "offset": 18
    },
    {
      "val": "simplegetCityForecastByZip",
      "offset": 58
    }
  ],
  "location": "basicrunStepDef.the_testcasename_and_TestStepname(String,String)"
});
formatter.result({
  "duration": 6572218,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://wsf.cdyne.com/WeatherWS/Weather.asmx",
      "offset": 25
    }
  ],
  "location": "basicrunStepDef.the_request_Endpoint_is(String)"
});
formatter.result({
  "duration": 55023061,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.input_data_with_node(DataTable)"
});
formatter.result({
  "duration": 1140676,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.expected_xpath_of_nodes_are(DataTable)"
});
formatter.result({
  "duration": 69539,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.expected_result_represented_by_table(DataTable)"
});
formatter.result({
  "duration": 60452,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.run_the_step_and_validate_the_result()"
});
formatter.result({
  "duration": 1700144254,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "The WSDL project name \"src/test/resources/Project-1-soapui-project.xml\" and Testsuite name \"WeathersoapRegression\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "src/test/resources/Project-1-soapui-project.xml",
      "offset": 23
    },
    {
      "val": "WeathersoapRegression",
      "offset": 92
    }
  ],
  "location": "basicrunStepDef.the_WSDL_project_name_and_Testsuite_name(String,String)"
});
formatter.result({
  "duration": 13182366,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "Validating response for request with some input a second case",
  "description": "",
  "id": "this-is-a-test-feature-to-prepare-backbone-for-soap-webservices-testing;validating-response-for-request-with-some-input-a-second-case",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 46,
  "name": "The testcasename \"GetCityForecastByZip\" and TestStepname \"FullCountryInfo\"",
  "keyword": "Given "
});
formatter.step({
  "line": 47,
  "name": "The request Endpoint is \"http://www.oorsprong.org/websamples.countryinfo/CountryInfoService.wso\"",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Input data with node \u003c\u003e",
  "rows": [
    {
      "cells": [
        "sCountryISOCode"
      ],
      "line": 49
    },
    {
      "cells": [
        "IND"
      ],
      "line": 50
    },
    {
      "cells": [
        "GB"
      ],
      "line": 51
    },
    {
      "cells": [
        "USA"
      ],
      "line": 52
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "Expected xpath of nodes are",
  "rows": [
    {
      "comments": [
        {
          "line": 55,
          "value": "#This table will contain all the xpath of nodes with teststep name and format as shown"
        },
        {
          "line": 56,
          "value": "#${\u003cteststep name\u003e#Response#\u003cnode xpath\u003e}"
        }
      ],
      "cells": [
        "${FullCountryInfo#Response#//m:FullCountryInfoResult/m:sISOCode}"
      ],
      "line": 58
    },
    {
      "cells": [
        "${FullCountryInfo#Response#//m:FullCountryInfoResult/m:sName}"
      ],
      "line": 59
    },
    {
      "cells": [
        "${FullCountryInfo#Response#//m:FullCountryInfoResult/m:sCapitalCity}"
      ],
      "line": 60
    },
    {
      "cells": [
        "${FullCountryInfo#Response#//m:FullCountryInfoResult/m:sPhoneCode}"
      ],
      "line": 61
    },
    {
      "cells": [
        "${FullCountryInfo#Response#//m:tLanguage/m:sName}"
      ],
      "line": 62
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "Expected result represented by table",
  "rows": [
    {
      "comments": [
        {
          "line": 66,
          "value": "#This table will contain expected response value"
        },
        {
          "line": 67,
          "value": "#Each row corresponds to xpath node table row"
        },
        {
          "line": 68,
          "value": "#Each column corresponds to run based on input data i.e it will be inputdata row-1"
        }
      ],
      "cells": [
        "IN",
        "GB",
        "US"
      ],
      "line": 70
    },
    {
      "cells": [
        "India",
        "United Kingdom",
        "United States"
      ],
      "line": 71
    },
    {
      "cells": [
        "New Delhi",
        "London",
        "Washington"
      ],
      "line": 72
    },
    {
      "cells": [
        "91",
        "44",
        "1"
      ],
      "line": 73
    },
    {
      "cells": [
        "Hindi",
        "English",
        "English"
      ],
      "line": 74
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 78,
  "name": "Run the step and validate the result",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "GetCityForecastByZip",
      "offset": 18
    },
    {
      "val": "FullCountryInfo",
      "offset": 58
    }
  ],
  "location": "basicrunStepDef.the_testcasename_and_TestStepname(String,String)"
});
formatter.result({
  "duration": 126039,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.oorsprong.org/websamples.countryinfo/CountryInfoService.wso",
      "offset": 25
    }
  ],
  "location": "basicrunStepDef.the_request_Endpoint_is(String)"
});
formatter.result({
  "duration": 116161,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.input_data_with_node(DataTable)"
});
formatter.result({
  "duration": 65588,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.expected_xpath_of_nodes_are(DataTable)"
});
formatter.result({
  "duration": 58081,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.expected_result_represented_by_table(DataTable)"
});
formatter.result({
  "duration": 57291,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.run_the_step_and_validate_the_result()"
});
formatter.result({
  "duration": 274017298,
  "status": "passed"
});
formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "This will test soapui api",
  "description": "",
  "id": "this-will-test-soapui-api",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To get zip code",
  "description": "",
  "id": "this-will-test-soapui-api;to-get-zip-code",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "get endpoints",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "this is the data step",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "set the data/properties",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "run the request test step",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Validate the response with the this data",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef1.get_endpoints()"
});
formatter.result({
  "duration": 123669,
  "status": "passed"
});
formatter.match({
  "location": "stepDef1.this_is_the_data_step()"
});
formatter.result({
  "duration": 16595,
  "status": "passed"
});
formatter.match({
  "location": "stepDef1.set_the_data_properties()"
});
formatter.result({
  "duration": 13039,
  "status": "passed"
});
formatter.match({
  "location": "stepDef1.run_the_request_test_step()"
});
formatter.result({
  "duration": 121078312,
  "status": "passed"
});
formatter.match({
  "location": "stepDef1.validate_the_response_with_the_this_data()"
});
formatter.result({
  "duration": 18965,
  "status": "passed"
});
formatter.uri("zzzz_ZZZZ_Project_Teardown.feature");
formatter.feature({
  "line": 1,
  "name": "This is tear down definition file",
  "description": "",
  "id": "this-is-tear-down-definition-file",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Close excel report file",
  "description": "",
  "id": "this-is-tear-down-definition-file;close-excel-report-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Write to report excel file and close the file",
  "keyword": "Given "
});
formatter.match({
  "location": "basicrunStepDef.write_to_report_excel_file_and_close_the_file()"
});
formatter.result({
  "duration": 101715280,
  "status": "passed"
});
});