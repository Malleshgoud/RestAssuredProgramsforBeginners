package RestfulBooker.PojoExamples;

import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

public class DummyAPiFormatPojoUsingJsonArray {
    public static void main(String[] args) {
        StudentPojoExample obj=new StudentPojoExample();
        obj.setId(10);
        obj.setEmail("malleshtest@gmail.com");
        obj.setUsername("Mallesh");

        StudentPojoExample obj1=new StudentPojoExample();
        obj1.setId(20);
        obj1.setEmail("ashok@gmail.com");
        obj1.setUsername("Ashok");

        List<StudentPojoExample> list=new ArrayList<>();
        list.add(obj);
        list.add(obj1);
        RestAssured.
                given().log().all().
                body(list).
                when().get();




    }
}
