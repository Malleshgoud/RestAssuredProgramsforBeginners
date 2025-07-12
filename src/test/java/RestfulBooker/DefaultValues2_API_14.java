package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DefaultValues2_API_14 {



	@Test
	public void createBooking2()
	{
		RestAssured.
				given()
				.log().all()


				.basePath("auth")
				.body("{\n" +
						"    \"username\" : \"admin\",\n" +
						"    \"password\" : \"password123\"\n" +
						"}")
				.contentType(ContentType.JSON)
				//Hit method tyoe
				.when()
				.post()
				//Valdate response
				.then()
				.log().all().statusCode(200);
	}


}
