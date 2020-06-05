package com.subs.pluto.controller;

import com.subs.pluto.entity.PlServicesPriceAndRenewalTime;
import com.subs.pluto.services.ServicePriceAndRenwalTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/service-price-and-renewal-time")
public class ServicePriceAndRenewalTimeController {
    private final ServicePriceAndRenwalTimeService servicePriceAndRenewalTimeService;

    @Autowired
    public ServicePriceAndRenewalTimeController(ServicePriceAndRenwalTimeService servicePriceAndRenewalTimeService) {
        this.servicePriceAndRenewalTimeService = servicePriceAndRenewalTimeService;
    }
    @GetMapping("/getall")
    public Iterable<PlServicesPriceAndRenewalTime> getAll(){
        return servicePriceAndRenewalTimeService.getall();
    }
}