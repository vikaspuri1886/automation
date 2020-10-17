package stepDefinition;

import java.util.Map;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import testing.Driver;

public class RegisterCustomerStepDefinition {
	private Driver driver = new Driver();
	
	@Given("^I create a new request with (.*) service$")
    public void createNewRequest(String serviceName) {
    	driver.createURI(serviceName);
    }

    @Given("^I add the (.*) endpoint to the service$")
    public void addEndpoint(String endpoint) {
    	driver.addEndpoint(endpoint);
    }
//
//
//
//    @Given("^I add the (.*) query parameter with value (.*) to the request URL$")
//
//    public void addRequestURLParameters(String key, String value) throws UnsupportedEncodingException{
//
//       driver.addQueryParams(key, value);
//
//    }
//
//    
//
//    @Given("^I add the following urlEncoded parameters to the request$")
//
//    public void addUrlEncodedParameters(Map<String, String> parametersData) throws Throwable {
//
//       driver.addURLEncodedParameters(parametersData);;
//
//    }


//
//    @Given("^I add the following headers to the request$")
//
//    public void addHeadersToRequest(Map<String, String> headersData) throws Throwable {
//
//       driver.addheaders(headersData);;
//
//    }

    
//
//    @Given("^I add the (.*) json file (.*) following fields$")
//
//    public void addUpdatedPayloadToRequest(String fileName, String action, Map<String, String> updatedValues) throws Throwable {
//
//    	driver.addPayload(fileName, action, updatedValues);
//
//    }
//
//
//
//    @Given("^I add the (.*) json file to the request$")
//
//    public void addPayloadToRequest(String jsonFileName) throws Throwable {
//
//        driver.addPayload(jsonFileName);
//
//    }

    @When("^I send the (.*) request to the service$")
    public void sendRequest(String method) throws Throwable {
        driver.sendRequest(method);
    }

    @Then("^I get the (\\d+) response code$")
    public void responseCodeValidation(int responseCode) throws Throwable {
    	driver.expectedResponse(responseCode);
    }

    @Then("^I assert the following values in the response body$")
    public void responseAttributeValidation(Map<String, String> validateData) throws Throwable {
        driver.validateResponse(validateData);
    }
}
