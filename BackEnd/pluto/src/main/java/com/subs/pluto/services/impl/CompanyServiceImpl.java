package com.subs.pluto.services.impl;

import com.subs.pluto.entity.PlCompanies;
import com.subs.pluto.repository.CompanyRepository;
import com.subs.pluto.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CompanyServiceImpl implements CompanyService {
    @Autowired
    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public PlCompanies add(PlCompanies PLCompanies) {
        companyRepository.save(PLCompanies);
        return PLCompanies;
    }

    @Override
    public Iterable<PlCompanies> getall() {
        return companyRepository.findAll();
    }
}