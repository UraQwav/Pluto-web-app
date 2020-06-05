package com.subs.pluto.services;

import com.subs.pluto.entity.PlCompanies;

public interface CompanyService {
    PlCompanies add(PlCompanies PLCompanies);
    Iterable<PlCompanies> getall();
}