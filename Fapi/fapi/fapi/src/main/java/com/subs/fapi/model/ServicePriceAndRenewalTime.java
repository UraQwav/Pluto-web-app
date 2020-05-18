package com.subs.fapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ServicePriceAndRenewalTime {
    @JsonFormat(pattern = "")
    private BigDecimal id;

    @JsonFormat(pattern = "")
    private String price;

    @JsonFormat(pattern = "")
    private Date renewalTime;

    @JsonIgnore
    private List<CompanyService> companyServices;
}
