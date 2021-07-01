package Tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

public class MainTest {

    @Test
    public void test() {
        RestAssured.useRelaxedHTTPSValidation();
        String url = "https://randomuser.me/api/";
        String cartUrl = String.format("%s/developer/cart/clear/", url);
        Response response = RestAssured.given()
                .given()
                .when()
                .get(url);

        System.out.println(response.asString());

    }
}
