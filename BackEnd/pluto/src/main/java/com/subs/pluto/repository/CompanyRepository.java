package com.subs.pluto.repository;

import com.subs.pluto.entity.PlCompanies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<PlCompanies, Long> {
}