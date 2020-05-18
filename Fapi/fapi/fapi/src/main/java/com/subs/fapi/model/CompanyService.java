package com.subs.fapi.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class CompanyService {
    
    @JsonFormat(pattern = "")
    private BigDecimal id;

    @JsonFormat(pattern = "")
    private Company company;

    @JsonFormat(pattern = "")
    private String name;

    @JsonFormat(pattern = "")
    private String info;

    @JsonFormat(pattern = "")
    private String imagePath;

    @JsonFormat(pattern = "")
    private ServicePriceAndRenewalTime servicePriceAndRenewalTime;

    @JsonIgnore
    private List<Subscription> subscriptions;
}
