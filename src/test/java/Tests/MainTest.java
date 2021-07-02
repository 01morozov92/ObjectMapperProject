package Tests;

import ApiModel.RandomUserMain;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

public class MainTest {

    @Test
    public void test() {
        RestAssured.useRelaxedHTTPSValidation();
        String url = "https://randomuser.me/api/";
        Response response = RestAssured.given()
                .given()
                .when()
                .get(url);



        ObjectMapper objectMapper = new ObjectMapper();

        JSONObject jsonObject = new JSONObject(response.asString());

        RandomUserMain randomUserMain = objectMapper.convertValue(jsonObject, RandomUserMain.class);

        System.out.println(response.asString());

    }
}
