package RestfulBooker.convertResponseToPojo;

import RestfulBooker.PojoExamples.nestedJsonObjects.Address;
import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

public class Address_JsonObject_ResponseToPojo {
    public static void main(String[] args) {
        Employee_With_Address_Pojo employee=RestAssured
        .get("https://mocki.io/v1/4ffb3c23-5eae-420a-ae63-1ad3331be2d3")
                .as(Employee_With_Address_Pojo.class);

       String firstName =employee.getFirstName();
        System.out.println("firstnname..."+firstName);

        //print Address jsonobject data
//Address is a list → iterate through it
        List<Address_Pojo> addresses = employee.getAddress();
        for (Address_Pojo addr : addresses) {
            System.out.println("House No: " + addr.getHouseNo());
            System.out.println("Street: " + addr.getStreetName());
            System.out.println("City: " + addr.getCity());
            System.out.println("State: " + addr.getState());
            System.out.println("Country: " + addr.getCountry());
        }
    }
}
//Ouput
//firstnname...mallesh
//        House No: 14-67
//        Street: GaneshNagar colony
//        City: Hyderabad
//        State: Telangana
//        Country: India
