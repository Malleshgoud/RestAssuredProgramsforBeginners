package RestfulBooker.ResponseValidation;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class HandlingDynamicResponseUsingInstanceOf {

    public static void main(String[] args) {


       Response response= RestAssured.get("https://mocki.io/v1/6c0efd5c-be0a-43a9-ae77-41656bec81c7");

       Object responseAsOject=response.as(Object.class);

       if(responseAsOject instanceof List)
       {
           List responseasList=(List)responseAsOject;
           System.out.println(responseasList.size());
       }
       else if(responseAsOject instanceof Map)
       {
           Map responseasMap=(Map) responseAsOject;
           System.out.println((Map)responseasMap.keySet());
       }


    }
}
