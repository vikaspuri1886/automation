Feature: Testing the API's

Scenario: Register Customer

Given I create a new request with registerCustomer service
And I add the test endpoint to the service
And I send the GET request to the service
Then I get the 200 response code
Then I assert the following values in the response body
| givenName | vikas |