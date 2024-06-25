package com.Company.Base;

import com.Company.Enums.LoginEnum;
import io.restassured.response.Response;

import java.util.Map;

public class BaseImpl extends BaseMethods {
    public Response post(String endpoint, Object body, LoginEnum loginEnum) {
        return super.post(endpoint, body, loginEnum);
    }

    public Response post(String endpoint, Map<String, String> body, LoginEnum loginEnum) {
        return super.post(endpoint, body, loginEnum);
    }
}
