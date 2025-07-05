package RestfulBooker;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateBooking_PUT_API_7 {

	public static void main(String[] args) {
		
		
		RestAssured.
		given()
			.log().all()
			
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("/booking/1")
		.header("Content-Type","application/json")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.body("{\r\n"
				+ "    \"firstname\": \"Specflow111\",\r\n"
				+ "    \"lastname\": \"Selenium453 C#\",\r\n"
				+ "    \"totalprice\": 111,\r\n"
				+ "    \"depositpaid\": true,\r\n"
				+ "    \"bookingdates\": {\r\n"
				+ "        \"checkin\": \"2018-01-01\",\r\n"
				+ "        \"checkout\": \"2019-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\": \"super bowls\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		//Hit method tyoe
		.when()
		    .put()
		//Valdate response
	     .then()
	        .log().all().statusCode(200);

		}
}