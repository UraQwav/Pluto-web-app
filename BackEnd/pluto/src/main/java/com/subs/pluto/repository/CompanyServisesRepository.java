package com.subs.pluto.repository;

import com.subs.pluto.entity.PlCompanyServices;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyServisesRepository extends CrudRepository<PlCompanyServices, Long>{
    
}