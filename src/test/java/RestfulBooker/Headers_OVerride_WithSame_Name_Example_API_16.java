package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.Header;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Headers_OVerride_WithSame_Name_Example_API_16 {

    @Test
    public void passheader1()
    {

        RestAssured.given().log().all()
                .config(RestAssuredConfig.config().headerConfig(HeaderConfig.headerConfig().overwriteHeadersWithName("Headerkey1","Headerkey2")))
                .header("Headerkey1","Header value1")
                .header("Headerkey1","Header value1_1")
                .header("Headerkey2","Header value2")
                .header("Headerkey2","Header value2_overwirite")
                .header("Headerkey3","Header value3")
                .header("Headerkey3","Header value4")
                .get();
    }



}
