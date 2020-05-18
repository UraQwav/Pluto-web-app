package com.subs.pluto.services.impl;

import com.subs.pluto.entity.Company;
import com.subs.pluto.entity.ServicePriceAndRenewalTime;
import com.subs.pluto.repository.CompanyRepository;
import com.subs.pluto.repository.ServicePriceAndRenewalTimeRepository;
import com.subs.pluto.services.CompanyService;
import com.subs.pluto.services.ServicePriceAndRenwalTimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.*;

@Service
@Component
public class ServicePriceAndRenewalTimeImpl  implements ServicePriceAndRenwalTimeService {

     @Autowired
    private ServicePriceAndRenewalTimeRepository servicePriceAndRenewalTimeRepository;

    public ServicePriceAndRenewalTimeImpl(ServicePriceAndRenewalTimeRepository servicePriceAndRenewalTimeRepository) {
        this.servicePriceAndRenewalTimeRepository = servicePriceAndRenewalTimeRepository;
    }

    @Override
    public Iterable<ServicePriceAndRenewalTime> getall() {
        return servicePriceAndRenewalTimeRepository.findAll();
    }
}