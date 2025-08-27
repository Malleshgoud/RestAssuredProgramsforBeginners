package RestfulBooker.JsonPathExamles;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import java.util.Optional;

 class JsonPath_example_17 {

	@Test
	public void jsonpathdemo()
	{
		String myjson="{\n" +
				"    \"firstname\": \"mallesh00021\",\n" +
				"    \"lastname\": \"goud\",\n" +

				"}";

		JsonPath jsonPath=new JsonPath(myjson);
		//String fname=json.getString("firstname");
		//System.out.println("firstname is.."+fname);
		System.out.println((Object) (jsonPath.get("$")));
		System.out.println((Object) (jsonPath.getString("$")));
		System.out.println((Object) (jsonPath.get()));
		System.out.println((Object) (jsonPath.getString("")));

		}
}