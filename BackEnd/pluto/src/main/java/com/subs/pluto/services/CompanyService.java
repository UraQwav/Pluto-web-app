package com.subs.pluto.services;
import java.math.BigDecimal;

import com.subs.pluto.entity.Company;

public interface CompanyService {
    Company add(Company company);
    Iterable<Company> getall();
}