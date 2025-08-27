package RestfulBooker.ResponseValidation;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

import java.util.Map;

public class ConvertJsonObjectResponsetoJavaMapwithGenericAPI_21 {

    public static void main(String[] args) {

//TypeRef is abstract class and dsnt have any abstarct methods
        Map<String,Object> jsonResponseAsMap = RestAssured.get("https://mocki.io/v1/0725fcb7-e3eb-4692-8d46-61112df7fd69").
                as(new TypeRef<Map<String,Object>>(){});

        String firstName = (String) jsonResponseAsMap.get("firstname");
        System.out.println(firstName);

      jsonResponseAsMap.keySet().forEach(k-> System.out.println(k));

    }

}
