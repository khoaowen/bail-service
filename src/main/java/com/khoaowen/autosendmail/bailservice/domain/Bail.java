package com.khoaowen.autosendmail.bailservice.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Bail {
    private final Tenant tenant;
    private final Apartment apartment;
    private final Date startDate;
    private final int rentAmount;
    private final int rentChargesAmount;
}
