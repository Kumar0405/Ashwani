package com.Company.Base;

import com.Company.Endpoints.CommonEndpoint;
import com.Company.Enums.LoginEnum;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseMethods {

    RequestSpecification specs = new RequestSpecBuilder()
            .log(LogDetail.ALL)
            .setContentType(ContentType.JSON)
            .setAccept(ContentType.JSON)
            .setBaseUri(CommonEndpoint.BASE_URI)
            .build();

    public Response post (String endpoint, Object body, LoginEnum loginEnum){
        return given()
                .spec(specs)
                .body(body)
                .headers("authorisation" , "Bearer " + LoginManager.getToken(loginEnum))
                .when()
                .post(endpoint);
    }
}
