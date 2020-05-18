package com.subs.pluto.controller;

import com.subs.pluto.entity.CompanyService;
import com.subs.pluto.services.CompanyServiceService;

import org.springframework.beans.factory.annotation.Autowired;
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
    CompanyService add(@RequestBody CompanyService companyServise){
        return companyServiceService.add(companyServise);
    }
}