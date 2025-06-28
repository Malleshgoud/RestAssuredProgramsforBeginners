package RestfulBooker;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking_API_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Build Request

		RestAssured.
		given()
		        .log().all()
				.baseUri("https://restful-booker.herokuapp.com/").basePath("/booking/{id}").pathParam("id", 1676)
				.contentType(ContentType.JSON)
				// Hit method tyoe
		.when()
		        .get()
				// Valdate response
		.then()
		        .log().all().statusCode(200);

		// Assert.assertEquals(statuscode, "200");

	}

}
