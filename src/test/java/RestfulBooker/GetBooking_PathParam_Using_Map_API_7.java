package RestfulBooker;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking_PathParam_Using_Map_API_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Map<String, Object> params=new HashMap<String, Object>();
		params.put("booking", "booking");
		params.put("bookingId", 1);

		// Build Request
		RestAssured.
		given()
		        .log().all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("/{booking}/{bookingId}")
				//.pathParam("booking", "booking")
				//.pathParam("bookingId", 1)
				.pathParams(params)
				.contentType(ContentType.JSON)
				// Hit method tyoe
		.when()
		        .get()
		     
				// Valdate response
		.then()
		        .log().all().statusCode(200);

		

	}

}
