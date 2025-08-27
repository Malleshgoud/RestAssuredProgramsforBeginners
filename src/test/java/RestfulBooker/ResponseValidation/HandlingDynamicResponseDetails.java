package RestfulBooker.ResponseValidation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class HandlingDynamicResponseDetails {

    public static void main(String[] args) {

        //Exception in thread "main" java.lang.RuntimeException:
        // com.fasterxml.jackson.databind.exc.MismatchedInputException:
        // Cannot deserialize value of type `java.util.LinkedHashMap<java.lang.Object,java.lang.Object>`
        // from Array value (token `JsonToken.START_ARRAY`)
       Response response= RestAssured.get("https://mocki.io/v1/6c0efd5c-be0a-43a9-ae77-41656bec81c7");
       Map responseMap=response.as(Map.class);
      System.out.println(responseMap.keySet());

//        Response response1= RestAssured.get("https://mocki.io/v1/6c0efd5c-be0a-43a9-ae77-41656bec81c7");
//        List responselist=response1.as(List.class);
//        System.out.println(responselist.size());


    }
}
