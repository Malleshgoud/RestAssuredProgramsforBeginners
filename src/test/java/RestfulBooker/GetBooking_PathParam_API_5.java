package RestfulBooker;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking_PathParam_API_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Build Request

		RestAssured.
		given()
		        .log().all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("/{booking}/{id}")
				.pathParam("booking", "booking")
				.pathParam("id", 1)
				.contentType(ContentType.JSON)
				// Hit method tyoe
		.when()
		        .get()
		       // .get("https://restful-booker.herokuapp.com/{booking}/{id}","booking",1)
				// Valdate response
		.then()
		        .log().all().statusCode(200);

		// Assert.assertEquals(statuscode, "200");

	}

}
