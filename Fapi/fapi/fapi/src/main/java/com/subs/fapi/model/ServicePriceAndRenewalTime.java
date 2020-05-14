package com.subs.fapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class ServicePriceAndRenewalTime {
    private BigDecimal id;

    private String price;

    private Date renewalTime;

    private List<CompanyService> companyServices;
}
