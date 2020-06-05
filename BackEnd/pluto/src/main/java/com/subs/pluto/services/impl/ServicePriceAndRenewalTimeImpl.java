package com.subs.pluto.services.impl;

import com.subs.pluto.entity.PlServicesPriceAndRenewalTime;
import com.subs.pluto.repository.ServicePriceAndRenewalTimeRepository;
import com.subs.pluto.services.ServicePriceAndRenwalTimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ServicePriceAndRenewalTimeImpl  implements ServicePriceAndRenwalTimeService {

     @Autowired
    private ServicePriceAndRenewalTimeRepository servicePriceAndRenewalTimeRepository;

    public ServicePriceAndRenewalTimeImpl(ServicePriceAndRenewalTimeRepository servicePriceAndRenewalTimeRepository) {
        this.servicePriceAndRenewalTimeRepository = servicePriceAndRenewalTimeRepository;
    }

    @Override
    public Iterable<PlServicesPriceAndRenewalTime> getall() {
        return servicePriceAndRenewalTimeRepository.findAll();
    }
}