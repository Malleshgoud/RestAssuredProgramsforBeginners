package RestfulBooker.JsonPathExamles;

import io.restassured.RestAssured;

import java.util.*;

public class Complex_JsonObject_API_20 {

    public static void main(String[] args) {

//        {
//            "firstname": "mallesh00021",
//                "lastname": "goud",
//                "totalprice": "1000",
//                "depositpaid": true,
//                "bookingdates": {
//            "checkin": "2018-01-01",
//                    "checkout": "2019-01-01"
//        }
//
//        }

        Map<String,Object> firstjsonobject=new HashMap<String,Object>();

        firstjsonobject.put("firstname","Mallesh");
        firstjsonobject.put("lastname","Goud");
        firstjsonobject.put("totalprice","1000");

        Map<String,Object> bookingDates=new HashMap<String,Object>();
        bookingDates.put("checkin","12-11-2025");
        bookingDates.put("checkout","16-11-2025");

        firstjsonobject.put("bookingdates",bookingDates);

        RestAssured.given().log().all().body(firstjsonobject).get();



    }
}
