package com.khoaowen.autosendmail.bailservice.domain;

import lombok.Data;

@Data
public class Apartment {
    private final String addressLine1;
    private final String addressLine2;
    private final String postalCode;
    private final String cityName;

}
