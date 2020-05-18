package com.subs.fapi.services.impl;

import com.subs.fapi.model.CompanyService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.subs.fapi.services.CompanyServiceService;

@Service
public class CompanyServiceServiceImpl implements CompanyServiceService{
    private final RestTemplate restTemplate;

    public CompanyServiceServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public CompanyService add(CompanyService companyService) {
        return this.restTemplate.postForObject(backendServerUrl + "company-service/add", companyService, CompanyService.class);
    }

}