package com.subs.pluto.controller;

import com.subs.pluto.entity.ServicePriceAndRenewalTime;
import com.subs.pluto.entity.User;
import com.subs.pluto.entity.UserType;
import com.subs.pluto.services.ServicePriceAndRenwalTimeService;
import com.subs.pluto.services.UserService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/service-price-and-renewal-time")
public class ServicePriceAndRenewalTimeController {
    private final ServicePriceAndRenwalTimeService servicePriceAndRenewalTimeService;

    @Autowired
    public ServicePriceAndRenewalTimeController(ServicePriceAndRenwalTimeService servicePriceAndRenewalTimeService) {
        this.servicePriceAndRenewalTimeService = servicePriceAndRenewalTimeService;
    }
    @GetMapping("/getall")
    public Iterable<ServicePriceAndRenewalTime> getAll(){
        return servicePriceAndRenewalTimeService.getall();
    }
}