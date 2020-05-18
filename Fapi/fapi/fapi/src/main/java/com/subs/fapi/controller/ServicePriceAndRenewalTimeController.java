package com.subs.fapi.controller;

import com.subs.fapi.model.ServicePriceAndRenewalTime;
import com.subs.fapi.services.ServicePriceAndRenwalTimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service-price-and-renewal-time")
public class ServicePriceAndRenewalTimeController {
    private final ServicePriceAndRenwalTimeService servicePriceAndRenewalTimeService;

    @Autowired
    public ServicePriceAndRenewalTimeController(ServicePriceAndRenwalTimeService servicePriceAndRenewalTimeService) {
        this.servicePriceAndRenewalTimeService = servicePriceAndRenewalTimeService;
    }
    @GetMapping("/getall")
    public @ResponseBody ServicePriceAndRenewalTime[] getAll() {
        return servicePriceAndRenewalTimeService.getall();
    }
}