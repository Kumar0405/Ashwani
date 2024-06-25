package com.Company.Tests;

import com.Company.DataProviders.CreateDp;
import com.Company.Endpoints.LoginEndpoints;
import com.Company.Enums.LoginEnum;
import com.Company.Helper.CreateServiceHelper;
import com.Company.Pojos.CreateUserPojo;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateTest {

    CreateServiceHelper createServiceHelper = new CreateServiceHelper();


    @Test(dataProviderClass = CreateDp.class,
            dataProvider = "createDp",
            description = "create user")
    public void createUserTest(LoginEnum loginEnum, int code) {

        CreateUserPojo createUserPojo = CreateUserPojo
                .builder()
                .job("morpheus")
                .name("leader")
                .build();

        Response response = createServiceHelper
                .createPost(LoginEndpoints.CREATE, createUserPojo, loginEnum);

        Assert.assertEquals(response.statusCode(), code);

    }
}
