package com.subs.fapi.services.impl;

import com.subs.fapi.model.ServicePriceAndRenewalTime;
import com.subs.fapi.services.ServicePriceAndRenwalTimeService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicePriceAndRenewalTimeImpl  implements ServicePriceAndRenwalTimeService {

    private final RestTemplate restTemplate;

    public ServicePriceAndRenewalTimeImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Value("${backend.server.url}")
    private String backendServerUrl;


    @Override
    public ServicePriceAndRenewalTime[] getall() {
        return this.restTemplate.getForObject(backendServerUrl + "/service-price-and-renewal-time/getall", ServicePriceAndRenewalTime[].class);
    }
}