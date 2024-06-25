package com.Company.Pojos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginPojo {
    String email;
    String password;
}
