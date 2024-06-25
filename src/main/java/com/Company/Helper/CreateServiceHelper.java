package com.Company.Helper;

import com.Company.Base.BaseImpl;
import com.Company.Enums.LoginEnum;
import io.restassured.response.Response;

public class CreateServiceHelper extends BaseImpl {

    public Response createPost(String endpoint, Object body, LoginEnum loginEnum){
        return post(endpoint, body, loginEnum);
    }
}
