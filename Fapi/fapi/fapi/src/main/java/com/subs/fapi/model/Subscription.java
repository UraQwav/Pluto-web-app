package com.subs.fapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Subscription {
    private Long id;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date subscriptionBuyingTime;

    private User user;

    private CompanyService companyService;
}
