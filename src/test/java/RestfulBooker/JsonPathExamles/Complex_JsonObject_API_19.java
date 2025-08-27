package RestfulBooker.JsonPathExamles;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import java.util.*;

public class Complex_JsonObject_API_19 {

    public static void main(String[] args) {


        //Generate Fial payload
        List<Map<String, Object>> finalPayload = new ArrayList<Map<String, Object>>();

        //to represent json object we use Map or List or Pojo

        Map<String, Object> firstJsonObject = new HashMap<String, Object>();
        firstJsonObject.put("id", 1);
        firstJsonObject.put("email", "malleshgoud1@gmail.com");
        firstJsonObject.put("firstname", "Mallesh1");
        firstJsonObject.put("lastname", "Goud1");
        firstJsonObject.put("gender", "Male");

        //Mobile Json array

//        List mobileNumbes=new ArrayList();
//        mobileNumbes.add("83483453544");
//        mobileNumbes.add("9939533333");

        List mobileNumbes = Arrays.asList("9383845344", "756345344");

        firstJsonObject.put("Mobile", mobileNumbes);

        //Json Object
        Map<String, Object> skillset = new HashMap<String, Object>();
        skillset.put("name", "testing");
        skillset.put("proficiency", "medium");

        firstJsonObject.put("skills", skillset);



       // RestAssured.given().contentType(ContentType.JSON).log().all().body(finalPayload).get();

        //to represent json object we use Map or List or Pojo

        Map<String, Object> secondJsonObject = new HashMap<String, Object>();
        secondJsonObject.put("id", 2);
        secondJsonObject.put("email", "malleshgoud2@gmail.com");
        secondJsonObject.put("firstname", "Mallesh2");
        secondJsonObject.put("lastname", "Goud2");
        secondJsonObject.put("gender", "Male");

        List mobileNumbes2 = Arrays.asList("222344333", "455454444");
        secondJsonObject.put("Mobile", mobileNumbes2);

        //Json Object
        Map<String, Object> skillset2 = new HashMap<String, Object>();
        skillset2.put("name", "Developer");
        skillset2.put("proficiency", "high");

        List certficates =Arrays.asList("ISQTB","OCJP 14");
        skillset2.put("certifications",certficates);
        secondJsonObject.put("skills", skillset2);

        finalPayload.add(firstJsonObject);
        finalPayload.add(secondJsonObject);

        RestAssured.given().log().all().body(finalPayload).get();
    }
}
