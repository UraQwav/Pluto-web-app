package com.subs.pluto.controller;
import com.subs.pluto.entity.Company;
import com.subs.pluto.services.CompanyService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @PostMapping("/add")
    Company addCompany(@RequestBody Company company){
        company = companyService.add(company);
        return company;
    }
    @GetMapping("/getall")
    public Iterable<Company> getAll(){
        return companyService.getall();
    }

}
