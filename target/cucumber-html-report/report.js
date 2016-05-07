$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("basicrun.feature");
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
  "duration": 6224836000,
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
  "duration": 7147522,
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
  "duration": 60100034,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.input_data_with_node(DataTable)"
});
formatter.result({
  "duration": 994885,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.expected_xpath_of_nodes_are(DataTable)"
});
formatter.result({
  "duration": 61637,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.expected_result_represented_by_table(DataTable)"
});
formatter.result({
  "duration": 59661,
  "status": "passed"
});
formatter.match({
  "location": "basicrunStepDef.run_the_step_and_validate_the_result()"
});
formatter.result({
  "duration": 1529173863,
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
  "duration": 35955,
  "status": "passed"
});
formatter.match({
  "location": "stepDef1.this_is_the_data_step()"
});
formatter.result({
  "duration": 13829,
  "status": "passed"
});
formatter.match({
  "location": "stepDef1.set_the_data_properties()"
});
formatter.result({
  "duration": 14619,
  "status": "passed"
});
formatter.match({
  "location": "stepDef1.run_the_request_test_step()"
});
formatter.result({
  "duration": 109937900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef1.validate_the_response_with_the_this_data()"
});
formatter.result({
  "duration": 14224,
  "status": "passed"
});
});