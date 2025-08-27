package RestfulBooker.JsonPathExamles;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class JSONPATH_API_16 {

	@Test
	public void jsonpathdemo()
	{
		String myjson="{\n" +
				"    \"firstname\": \"mallesh00021\",\n" +
				"    \"lastname\": \"goud\",\n" +
				"    \"totalprice\": \"1000\",\n" +
				"    \"depositpaid\": true,\n" +
				"    \"bookingdates\": {\n" +
				"        \"checkin\": \"2018-01-01\",\n" +
				"        \"checkout\": \"2019-01-01\"\n" +
				"    },\n" +
				"    \"additionalneeds\": \"super bowls\"\n" +
				"}";

		JsonPath json=new JsonPath(myjson);
		String fname=json.getString("firstname");
		System.out.println("firstname is.."+fname);

		}
}