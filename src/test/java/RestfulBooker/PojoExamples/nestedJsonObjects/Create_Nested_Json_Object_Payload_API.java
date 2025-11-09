package RestfulBooker.PojoExamples.nestedJsonObjects;

import io.restassured.RestAssured;

public class Create_Nested_Json_Object_Payload_API {
    public static void main(String[] args) {
        Employee_JsonObject_Pojo emp=new Employee_JsonObject_Pojo();
        emp.setFirstName("mallesh");
        emp.setLastName("Goud");
        emp.setProfession("Software Engineer");

        Address address=new Address();
        address.setHouseNo("14-67");
        address.setCity("Hyderabad");
        address.setStreetName("GaneshNagar colony");
        address.setState("Telangana");
        address.setCountry("India");

        emp.setAddress(address);

        RestAssured.given().log().all()
                .body(emp).post();
    }
}

//Output
// {
//  "firstName": "mallesh",
//  "lastName": "Goud",
//  "profession": "Software Engineer",
//  "address": {
//    "houseNo": "14-67",
//    "streetName": "GaneshNagar colony",
//    "city": "Hyderabad",
//    "state": "Telangana",
//    "country": "India"
//  }
//}