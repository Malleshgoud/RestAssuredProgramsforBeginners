package RestfulBooker.DataSharingforOtherAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class ShareDataAPI_25 {

    @Test


    public  void createAndRetriveBokking() {
        int booking_id=RestAssured.
                given()
                .log().all()

                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/booking")
                .body("{\r\n"
                        + "    \"firstname\": \"mallesh00021\",\r\n"
                        + "    \"lastname\": \"goud\",\r\n"
                        + "    \"totalprice\": \"1000\",\r\n"
                        + "    \"depositpaid\": true,\r\n"
                        + "    \"bookingdates\": {\r\n"
                        + "        \"checkin\": \"2018-01-01\",\r\n"
                        + "        \"checkout\": \"2019-01-01\"\r\n"
                        + "    },\r\n"
                        + "    \"additionalneeds\": \"super bowls\"\r\n"
                        + "}")
                .contentType(ContentType.JSON)
                //Hit method tyoe
                .when()
                .post()
                //Valdate response
                .then()
                .log().all()
                .extract()
                .jsonPath()
                .getInt("bookingid");

        RestAssured.given().log().all().get("https://restful-booker.herokuapp.com/booking/"+booking_id)
                .then().log().all().extract().response();

    }
}
