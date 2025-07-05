package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteBooking_DELETE_API_10 {

	public static void main(String[] args) {
		
		//Build Request
		
		RestAssured.
	given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/{booking_id}").
		pathParam("booking_id", 5)
		
		.header("Authorization","Basic YWRtaW46cGFzc3dvcmQxMjM=")
		.contentType(ContentType.JSON).
		
		//perform http acrion
	when()
		.delete()
		//validate response
	.then()
		.log().
		all().
		assertThat().
		statusCode(201);
		
		
		

		}
}