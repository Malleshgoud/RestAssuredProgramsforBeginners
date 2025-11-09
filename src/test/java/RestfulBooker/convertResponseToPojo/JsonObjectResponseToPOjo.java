package RestfulBooker.convertResponseToPojo;

import RestfulBooker.PojoExamples.nestedJsonObjects.Employee_JsonObject_Pojo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class JsonObjectResponseToPOjo {
    public static void main(String[] args) {
        Employee_Pojo employee=RestAssured
        .get("https://mocki.io/v1/4ffb3c23-5eae-420a-ae63-1ad3331be2d3")
                .as(Employee_Pojo.class);

       String firstName =employee.getFirstName();
        System.out.println("firstnname..."+firstName);
    }
}
