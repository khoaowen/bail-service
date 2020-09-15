package com.khoaowen.autosendmail.bailservice.domain;

import lombok.Data;

import javax.validation.constraints.Email;

@Data
public class Tenant {
    private final Civility civility;
    private final String firstName;
    private final String lastName;
    @Email
    private final String email;
    private final String phoneNumber;
}
