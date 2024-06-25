package com.Company.Base;

import com.Company.Endpoints.CommonEndpoint;
import com.Company.Endpoints.LoginEndpoints;
import com.Company.Enums.LoginEnum;
import com.Company.Pojos.LoginPojo;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class LoginManager {
    private LoginManager() {
    }

    public static String getToken(LoginEnum loginEnum) {

        LoginPojo loginBody = LoginPojo
                .builder()
                .email(loginEnum.getUsername())
                .password(loginEnum.getPassword())
                .build();

        Response response = given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .baseUri(CommonEndpoint.BASE_URI)
                .body(loginBody)
                .when()
                .post(LoginEndpoints.LOGIN);

        response.then().log().all();


        JsonPath path = new JsonPath(response.asPrettyString());
        System.out.println("token => " + path.get("token"));
        return path.get("token");
    }
}
