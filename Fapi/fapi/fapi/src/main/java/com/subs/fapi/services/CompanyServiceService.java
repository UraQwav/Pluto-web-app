package com.subs.fapi.services;

import java.math.BigDecimal;

import com.subs.fapi.model.CompanyService;

public interface CompanyServiceService {
    CompanyService add(CompanyService companyService); 
    CompanyService[] getall();
    CompanyService getById(String id);
}