package RestfulBooker;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking_1 {

	public static void main(String[] args) {
		
		
		//Build Request
		
		RequestSpecification reqspec=RestAssured.given();
		reqspec.log().all();
		
	reqspec.baseUri("https://restful-booker.herokuapp.com/");
	reqspec.basePath("/booking");
	reqspec.body("{\r\n"
			+ "    \"firstname\": \"mallesh00021\",\r\n"
			+ "    \"lastname\": \"goud\",\r\n"
			+ "    \"totalprice\": \"1000\",\r\n"
			+ "    \"depositpaid\": true,\r\n"
			+ "    \"bookingdates\": {\r\n"
			+ "        \"checkin\": \"2018-01-01\",\r\n"
			+ "        \"checkout\": \"2019-01-01\"\r\n"
			+ "    },\r\n"
			+ "    \"additionalneeds\": \"super bowls\"\r\n"
			+ "}");
	reqspec.contentType(ContentType.JSON);
	
	//http request and get resp
	Response resp=reqspec.post();
	
	int statuscode=resp.statusCode();
	
	//validate response
	
	ValidatableResponse valiresp=resp.then().log().all();
	valiresp.statusCode(200);
	
	
	

	
		

	}

}
