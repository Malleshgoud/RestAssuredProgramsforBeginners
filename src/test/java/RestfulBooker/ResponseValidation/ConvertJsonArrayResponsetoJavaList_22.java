package RestfulBooker.ResponseValidation;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertJsonArrayResponsetoJavaList_22 {

    public static void main(String[] args) {

        //List<Object>> allemployedetails=RestAssured
        List<Map<String,Object>> allemployedetails=RestAssured
                .get("https://mocki.io/v1/6c0efd5c-be0a-43a9-ae77-41656bec81c7")
                //.as(List.class);
       // .as(List<Map<String,Object>>.class); this is not possible
               .as(new TypeRef<List<Map<String,Object>>>(){});


        System.out.println(allemployedetails.size());

        Map<String,Object> emp1=allemployedetails.get(0);
        System.out.println(emp1.get("firstname"));

      //  Map<String,Object> emp1_details=(Map<String,Object>) allemployedetails.get(0);
        //System.out.println(emp1_details.get("firstname"));

    }

}
