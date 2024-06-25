package com.Company.Pojos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateUserPojo {
    String name;
    String job;
}
