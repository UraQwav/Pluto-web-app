package com.subs.pluto.repository;

import com.subs.pluto.entity.CompanyService;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyServisesRepository extends CrudRepository<CompanyService, Long>{
    
}