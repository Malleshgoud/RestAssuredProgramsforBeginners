package RestfulBooker.PojoExamples;

import io.restassured.RestAssured;

public class DummyAPiFormatPojo {
    public static void main(String[] args) {
        StudentPojoExample obj=new StudentPojoExample();
        obj.setId(10);
        obj.setEmail("malleshtest@gmail.com");
        obj.setUsername("Mallesh");

        RestAssured.
                given().log().all().
                body(obj).
                when().get();




    }
}
