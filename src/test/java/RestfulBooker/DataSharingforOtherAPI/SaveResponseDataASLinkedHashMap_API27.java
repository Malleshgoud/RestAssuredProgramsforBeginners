package RestfulBooker.DataSharingforOtherAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class SaveResponseDataASLinkedHashMap_API27 {

    @Test(priority = 1)

    public  void createAndRetriveBokking() {
         int id =RestAssured.
                given()
                .log().all()

                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("/booking")
                .body("{\r\n"
                        + "    \"firstname\": \"mallesh9999\",\r\n"
                        + "    \"lastname\": \"goud0099\",\r\n"
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

        // SaveTestGlobalsAsMap.setValue("bookingid",id);
        SaveTestGlobalsAsMap.setValue(Constants.BOOKING_ID,id);



    }
    @Test(priority = 2)

    public void retrieveBookingDetails()
    {
        //int id= (int) SaveTestGlobalsAsMap.getValue("bookingid");
        int id= (int) SaveTestGlobalsAsMap.getValue(Constants.BOOKING_ID);
        RestAssured.given().log().all().get("https://restful-booker.herokuapp.com/booking/"+id)
                .then().log().all().extract().response();
    }
}
