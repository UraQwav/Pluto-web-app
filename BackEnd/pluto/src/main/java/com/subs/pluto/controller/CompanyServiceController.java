package com.subs.pluto.controller;

import java.math.BigDecimal;

import com.subs.pluto.entity.PlCompanyServices;
import com.subs.pluto.services.CompanyServiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company-service")
public class CompanyServiceController {
    private final CompanyServiceService companyServiceService;

    @Autowired
    public CompanyServiceController(CompanyServiceService companyServiceService) {
        this.companyServiceService = companyServiceService;
    }
    @PostMapping("/add")
    PlCompanyServices add(@RequestBody PlCompanyServices companyServise){
        return companyServiceService.add(companyServise);
    }
    @GetMapping("/getall")
    public Iterable<PlCompanyServices> getAll(){
        return companyServiceService.getall();
    }
    @GetMapping("/getById/{id}")
    Iterable<PlCompanyServices> getById(@PathVariable BigDecimal id){
        Iterable<PlCompanyServices> ccc = companyServiceService.getCompanyServiceByID(id);
        return companyServiceService.getCompanyServiceByID(id);
    }
}