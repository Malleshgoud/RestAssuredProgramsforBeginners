package RestfulBooker.JsonPathExamles;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

public class Nested_JsonObjects_example_18 {

   @Test
   public void nestedJsonobjectdemo()
   {
       String myjsonObject="{\n" +
               "    \"firstname\" : \"Jim\",\n" +
               "    \"lastname\" : \"Brown\",\n" +
               "    \"totalprice\" : 111,\n" +
               "    \"depositpaid\" : true,\n" +
               "    \"bookingdates\" : {\n" +
               "        \"checkin\" : \"2018-01-01\",\n" +
               "        \"checkout\" : \"2019-01-01\"\n" +
               "    },\n" +
               "    \"additionalneeds\" : \"Breakfast\"\n" +
               "}";

       JsonPath jsonPath=new JsonPath(myjsonObject);
       //String fname=json.getString("firstname");
       //System.out.println("firstname is.."+fname);
       System.out.println((Object) (jsonPath.get("$")));
       System.out.println((Object) (jsonPath.getString("$")));
       System.out.println((Object) (jsonPath.get()));
       System.out.println((Object) (jsonPath.getString("")));

       String bookingdates_checking=jsonPath.getString("bookingdates.checkin");
       System.out.println(bookingdates_checking);

       Object obj=jsonPath.get("bookingdates");
       System.out.println(obj);



       }
}