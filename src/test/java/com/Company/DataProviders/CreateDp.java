package com.Company.DataProviders;


import com.Company.Enums.LoginEnum;
import org.testng.annotations.DataProvider;


public class CreateDp {

    @DataProvider(name = "createDp")
    public Object[][] createDP() {
        return new Object[][]{
                {LoginEnum.Admin, 201},
                {LoginEnum.Admin, 200},
                {LoginEnum.Driver, 400}
        };
    }
}
