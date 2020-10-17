$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("registerCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Testing the API\u0027s",
  "description": "",
  "id": "testing-the-api\u0027s",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Register Customer",
  "description": "",
  "id": "testing-the-api\u0027s;register-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I create a new request with registerCustomer service",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add the test endpoint to the service",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I send the GET request to the service",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I get the 200 response code",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I assert the following values in the response body",
  "rows": [
    {
      "cells": [
        "givenName",
        "vikas"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "registerCustomer",
      "offset": 28
    }
  ],
  "location": "RegisterCustomerStepDefinition.createNewRequest(String)"
});
formatter.result({
  "duration": 1784446553,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 10
    }
  ],
  "location": "RegisterCustomerStepDefinition.addEndpoint(String)"
});
formatter.result({
  "duration": 180142,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GET",
      "offset": 11
    }
  ],
  "location": "RegisterCustomerStepDefinition.sendRequest(String)"
});
formatter.result({
  "duration": 15551029525,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 10
    }
  ],
  "location": "RegisterCustomerStepDefinition.responseCodeValidation(int)"
});
formatter.result({
  "duration": 643234233,
  "status": "passed"
});
formatter.match({
  "location": "RegisterCustomerStepDefinition.responseAttributeValidation(String,String\u003e)"
});
formatter.result({
  "duration": 4699622509,
  "status": "passed"
});
});