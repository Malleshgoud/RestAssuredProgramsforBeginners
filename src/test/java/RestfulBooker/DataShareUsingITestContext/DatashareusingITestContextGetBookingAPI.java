package RestfulBooker.DataShareUsingITestContext;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DatashareusingITestContextGetBookingAPI {


   @Test

    public void retrieveBookingDetails(ITestContext context) {
        //int id= (int) SaveTestGlobalsAsMap.getValue("bookingid");

        RestAssured.
                given()
                .log()
                .all()
                .get("https://restful-booker.herokuapp.com/booking/" + context.getSuite().getAttribute("bookingID"))
                .then()
                .log().all().extract().response();
    }
}
