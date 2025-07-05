package RestfulBooker;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PartialUpdateBooking_PATCH_API_8 {

	public static void main(String[] args) {
		
		//Build Request
		RestAssured.
		given()
			.log().all()
			
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("/booking/1")
		.header("Content-Type","application/json")
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.body("{\r\n"
				+ "    \"firstname\": \"Mallesh\"\r\n"
				+ "}")
		.contentType(ContentType.JSON)
		//Hit method tyoe
		.when()
		    .patch()
		//Valdate response
	     .then()
	        .log().
	        all().
	        assertThat().
	        statusCode(200);

		}
}