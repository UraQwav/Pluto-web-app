package com.subs.fapi.services.impl;

import com.subs.fapi.model.Company;
import com.subs.fapi.services.CompanyService;
import com.subs.fapi.services.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompanyServiceImpl implements CompanyService{
    private final RestTemplate restTemplate;

    public CompanyServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public Company add(Company company) {
        return this.restTemplate.postForObject(backendServerUrl + "company/add", company, Company.class);
    }

    @Override
    public Company[] getall() {
        return this.restTemplate.getForObject(backendServerUrl + "/company/getall", Company[].class);
    }
}