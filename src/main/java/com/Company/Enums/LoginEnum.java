package com.Company.Enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum LoginEnum {
    Admin("eve.holt@reqres.in", "cityslicka"),
    Driver("TestAdmin", "test@Test.com");

    private final String username;
    private final String password;
}
