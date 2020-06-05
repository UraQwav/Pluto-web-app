package com.subs.pluto.services;

import java.math.BigDecimal;

import com.subs.pluto.entity.PlCompanyServices;

public interface CompanyServiceService {
    PlCompanyServices add(PlCompanyServices plcompanyservices);
    Iterable<PlCompanyServices> getall();
    Iterable<PlCompanyServices> getCompanyServiceByID(BigDecimal id);
}