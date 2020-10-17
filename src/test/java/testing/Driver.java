package testing;

import static com.jayway.restassured.RestAssured.given;

import org.hamcrest.Matcher;
import org.json.simple.JSONObject;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.matcher.ResponseAwareMatcher;
import com.jayway.restassured.response.ResponseBody;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.equalTo;

import java.util.Map;
import java.util.Random;

public class Driver{
	private String uri;
	private ValidatableResponse response;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void sendRequest(String reqestMethod) {
		 if("GET".equalsIgnoreCase(reqestMethod)) {
			 response = given().when().get(uri).then();
		 }
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void testCustomerRegister() {
		RestAssured.baseURI = "http://localhost:8081/api/v1/customers/registrations";
		
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.body(customerData());
 		request.post("/registerUser").then().statusCode(200).body("message", new ResponseAwareMatcher() {
            public Matcher matcher(ResponseBody response) throws Exception {
				return equalTo("Customer registered");
			}
       });
	}
	
	@SuppressWarnings(value = "unchecked")
	private String customerData() {
		Random random = new Random();
		
		JSONObject requestParams = new JSONObject();
		requestParams.put("firstName", "Virender"); 
		requestParams.put("lastName", "Singh");	 
		requestParams.put("phoneNumber", "simpleuser001");
		requestParams.put("emailId",  String.valueOf(random.nextInt()).concat("@gmail.com"));
		requestParams.put("password", "password1");
		return requestParams.toJSONString();
	}

	public void createURI(String serviceName) {
		uri = "http://testingautomation.us-e2.cloudhub.io/";
	}

	public void addEndpoint(String endpoint) {
		uri = uri.concat(endpoint);
	}

	public void expectedResponse(int responseCode) {
		response.statusCode(responseCode);
	}

	public void validateResponse(Map<String, String> validateData) {
		for(Map.Entry<String, String> entrySet: validateData.entrySet()) {
			String key = entrySet.getKey();
			final String value = entrySet.getValue();
			response.body(key, new ResponseAwareMatcher() {
	             public Matcher matcher(ResponseBody response) throws Exception {
					return equalTo(value);
				}
	        });
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void makeSureThatGoogleIsUpBackup() {
		 given().when().get("http://testingautomation.us-e2.cloudhub.io/test").then().
		 statusCode(200).body("givenName", new ResponseAwareMatcher() {
             public Matcher matcher(ResponseBody response) throws Exception {
				return equalTo("vikas");
			}
        });
	}
}
