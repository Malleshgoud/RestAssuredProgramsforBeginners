package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DefaultValuesStatic_API_13 {

	@BeforeTest
	public void setUp()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/";
		RestAssured.basePath="booking";
		System.out.println("this is Setup method");
	}
@Test
	public void createBooking1()
{
	RestAssured.
			given()
			.log().all()

			//.baseUri("https://restful-booker.herokuapp.com/")
			//.basePath("/booking")
			.body("{\r\n"
					+ "    \"firstname\": \"mallesh666\",\r\n"
					+ "    \"lastname\": \"goud678\",\r\n"
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
			.when()
			.post()
			//Valdate response
			.then()
			.log().all().statusCode(200);
}
	@Test
	public void createBooking2()
	{
		RestAssured.
				given()
				.log().all()

				//.baseUri("https://restful-booker.herokuapp.com/")
				//.basePath("/booking")
				.body("{\r\n"
						+ "    \"firstname\": \"mallesh7777\",\r\n"
						+ "    \"lastname\": \"goud7777\",\r\n"
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
				.when()
				.post()
				//Valdate response
				.then()
				.log().all().statusCode(200);
	}


}
