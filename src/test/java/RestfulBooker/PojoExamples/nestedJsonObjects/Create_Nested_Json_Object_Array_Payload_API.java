package RestfulBooker.PojoExamples.nestedJsonObjects;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

public class Create_Nested_Json_Object_Array_Payload_API {
    public static void main(String[] args) {
        Employee_JsonArrayObject_Pojo emp=new Employee_JsonArrayObject_Pojo();
        emp.setFirstName("mallesh");
        emp.setLastName("Goud");
        emp.setProfession("Software Engineer");

        Address address=new Address();
        address.setHouseNo("14-67");
        address.setCity("Hyderabad");
        address.setStreetName("GaneshNagar colony");
        address.setState("Telangana");
        address.setCountry("India");

        Address address2=new Address();
        address2.setHouseNo("2-67");
        address2.setCity("Hyderabad");
        address2.setStreetName("RN Reddy colony");
        address2.setState("Telangana");
        address2.setCountry("India");

        //emp.setAddress(address);
        List<Address> alladdresslist=new ArrayList<Address>();
        alladdresslist.add(address);
        alladdresslist.add(address2);

        emp.setAddress(alladdresslist);

        RestAssured.given().log().all()
                .body(emp).post();
    }
}

//Output
// {
//  "firstName": "mallesh",
//  "lastName": "Goud",
//  "profession": "Software Engineer",
//  "address": [
//    {
//      "houseNo": "14-67",
//      "streetName": "GaneshNagar colony",
//      "city": "Hyderabad",
//      "state": "Telangana",
//      "country": "India"
//    },
//    {
//      "houseNo": "2-67",
//      "streetName": "RN Reddy colony",
//      "city": "Hyderabad",
//      "state": "Telangana",
//      "country": "India"
//    }
//  ]
//}