package com.subs.pluto.services.impl;

import com.subs.pluto.entity.CompanyService;
import com.subs.pluto.repository.CompanyServisesRepository;
import com.subs.pluto.services.CompanyServiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class CompanyServiceServiceImpl implements CompanyServiceService{
    @Autowired
    private CompanyServisesRepository companyServiceRepository;

    public CompanyServiceServiceImpl(CompanyServisesRepository companyServiceRepository) {
        this.companyServiceRepository = companyServiceRepository;
    }

    @Override
    public CompanyService add(CompanyService companyServise) {
        companyServiceRepository.save(companyServise);
        return companyServise;
    }
}