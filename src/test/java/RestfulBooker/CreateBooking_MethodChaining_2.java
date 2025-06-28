package RestfulBooker;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking_MethodChaining_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Build Request
		
		RestAssured.given().
		log().all()
		
	.baseUri("https://restful-booker.herokuapp.com/")
	.basePath("/booking")
	.body("{\r\n"
			+ "    \"firstname\": \"mallesh00021\",\r\n"
			+ "    \"lastname\": \"goud\",\r\n"
			+ "    \"totalprice\": \"1000\",\r\n"
			+ "    \"depositpaid\": true,\r\n"
			+ "    \"bookingdates\": {\r\n"
			+ "        \"checkin\": \"2018-01-01\",\r\n"
			+ "        \"checkout\": \"2019-01-01\"\r\n"
			+ "    },\r\n"
			+ "    \"additionalneeds\": \"super bowls\"\r\n"
			+ "}")
	.contentType(ContentType.JSON)
	//Hit method tyoe
	.post().
	//Valdate response
then().log().all().statusCode(200);
	
	
	//Assert.assertEquals(statuscode, "200");
	

	
		

	}


}
