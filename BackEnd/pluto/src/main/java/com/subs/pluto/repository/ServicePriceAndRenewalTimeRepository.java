package com.subs.pluto.repository;

import com.subs.pluto.entity.ServicePriceAndRenewalTime;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServicePriceAndRenewalTimeRepository extends CrudRepository<ServicePriceAndRenewalTime, Long> {
    
}