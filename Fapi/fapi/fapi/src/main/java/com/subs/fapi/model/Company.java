package com.subs.fapi.model;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Company {
    @JsonFormat(pattern = "")
    private BigDecimal id;

    @JsonFormat(pattern = "")
    private String name;

    @JsonFormat(pattern = "")
    private String legalAddress;

    @JsonFormat(pattern = "")
    private String webSite;

    @JsonFormat(pattern = "")
    private String info;

    @JsonFormat(pattern = "")
    private String email;

    @JsonFormat(pattern = "")
    private String verificationStatus;

    @JsonFormat(pattern = "")
    private String imagePath;

    @JsonIgnore
    private List<CompanyService> companyServices;

}
