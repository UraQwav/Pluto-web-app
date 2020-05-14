package com.subs.fapi.model;

import java.math.BigDecimal;
import java.util.List;

public class Company {
    private BigDecimal id;

    private String name;

    private String legalAddress;

    private String webSite;

    private String info;

    private String email;

    private String verificationStatus;

    private String imagePath;

    private List<CompanyService> companyServices;

}
