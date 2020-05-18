package com.subs.fapi.services;

import com.subs.fapi.model.Company;

public interface CompanyService {
    Company add(Company company);  
    Company[] getall();
}