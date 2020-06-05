package com.subs.pluto.repository;

import com.subs.pluto.entity.PlServicesPriceAndRenewalTime;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicePriceAndRenewalTimeRepository extends CrudRepository<PlServicesPriceAndRenewalTime, Long> {
    
}