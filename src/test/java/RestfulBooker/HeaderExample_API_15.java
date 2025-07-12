package RestfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HeaderExample_API_15 {

    @Test
    public void passheader1()
    {

        RestAssured.given().log().all()
                .header("Header key1","Header value1")
                .header("Header key2","Header value2")
                .get();
    }

    @Test
    public void passheader2()
    {
        Header headerdetails=new Header("key1","value1");
        RestAssured.given().log().all()
                .header(headerdetails)
                .get();
    }

    @Test
    public void passheader3()
    {
        RestAssured.given().log().all()
                .headers("k1","v1","k2","v2","k3","v3")

                .get();
    }

    @Test
    public void passheaderUsingMap4()
    {
        Map<String,Object> headerdetails=new HashMap<String,Object>();
        headerdetails.put("mykey1","myvalue1");
        headerdetails.put("mykey2","myvalue2");
        headerdetails.put("mykey3","myvalue3");
        headerdetails.put("mykey4","myvalue4");
        RestAssured.given().log().all()
                .headers(headerdetails)
                .get();
    }


}
