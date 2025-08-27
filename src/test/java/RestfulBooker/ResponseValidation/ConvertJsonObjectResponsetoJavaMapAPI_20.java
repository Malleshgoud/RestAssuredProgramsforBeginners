package RestfulBooker.ResponseValidation;

import io.restassured.RestAssured;

import java.util.Map;

public class ConvertJsonObjectResponsetoJavaMapAPI_20 {

    public static void main(String[] args) {


        Map jsonResponseAsMap = RestAssured.get("https://mocki.io/v1/0725fcb7-e3eb-4692-8d46-61112df7fd69").
                as(Map.class);
        String firstName = (String) jsonResponseAsMap.get("firstname");
        System.out.println(firstName);

        Map<String,String> skillmap=(Map<String,String>)jsonResponseAsMap.get("skills");
        System.out.println(skillmap.get("name"));
        System.out.println(skillmap.get("proficiency"));

    }

}
