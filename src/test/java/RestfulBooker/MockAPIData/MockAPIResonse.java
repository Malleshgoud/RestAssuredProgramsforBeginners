package RestfulBooker.MockAPIData;

import io.restassured.RestAssured;

public class MockAPIResonse {
    public static void main(String[] args) {

        RestAssured
                .given()
                .log()
                .all()
                .get("https://mocki.io/v1/35ff3410-0d94-48d6-a81a-c8135a0a8695")
                .then()
                .log()
                .all();
    }
}
