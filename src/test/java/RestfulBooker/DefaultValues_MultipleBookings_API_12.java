package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DefaultValues_MultipleBookings_API_12 {

	RequestSpecification requestSpec;

	@BeforeClass

	public void setupCommonRequestSpecifications() {
		requestSpec = RestAssured.given();
		requestSpec.log().all().baseUri("https://restful-booker.herokuapp.com/").contentType(ContentType.JSON);
	}

	@Test
	public void createBooking() {
		RestAssured.given()
		.spec(requestSpec)
		.basePath("/booking")
				.body("{\r\n" + "    \"firstname\": \"mallesh00021\",\r\n" + "    \"lastname\": \"goud\",\r\n"
						+ "    \"totalprice\": \"1000\",\r\n" + "    \"depositpaid\": true,\r\n"
						+ "    \"bookingdates\": {\r\n" + "        \"checkin\": \"2018-01-01\",\r\n"
						+ "        \"checkout\": \"2019-01-01\"\r\n" + "    },\r\n"
						+ "    \"additionalneeds\": \"super bowls\"\r\n" + "}")
				// Hit method tyoe
				.when().post()
				// Valdate response
				.then().log().all().statusCode(200);
	}

	@Test
	public void updateBooking() {
		RestAssured.given()
		.spec(requestSpec)
				.basePath("/booking/1")
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.body("{\r\n" + "    \"firstname\": \"Specflow111\",\r\n" + "    \"lastname\": \"Selenium453 C#\",\r\n"
						+ "    \"totalprice\": 111,\r\n" + "    \"depositpaid\": true,\r\n"
						+ "    \"bookingdates\": {\r\n" + "        \"checkin\": \"2018-01-01\",\r\n"
						+ "        \"checkout\": \"2019-01-01\"\r\n" + "    },\r\n"
						+ "    \"additionalneeds\": \"super bowls\"\r\n" + "}")
				// Hit method tyoe
				.when().put()
				// Valdate response
				.then().log().all().statusCode(200);
	}

}
