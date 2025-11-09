package RestfulBooker.DataShareUsingITestContext;

import RestfulBooker.DataSharingforOtherAPI.Constants;
import RestfulBooker.DataSharingforOtherAPI.SaveTestGlobalsAsMap;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DatashareusingITestContextCreateBookingAPI {

    @Test(priority = 0)

    public void createBooking(ITestContext context) {
        int id = RestAssured.
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
        //context.setAttribute("bookingID", id);

        //ifu want run diffrent  Test tag in testNG.xml u can use below code

        context.getSuite().setAttribute("bookingID", id);
    }
}

