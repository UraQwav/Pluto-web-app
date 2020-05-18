package com.subs.fapi.controller;
import com.subs.fapi.model.Company;
import com.subs.fapi.services.CompanyService;
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
    @ResponseBody Company addCompany(@RequestBody Company company){
        return companyService.add(company);
    }

    @GetMapping("/getall")
    public @ResponseBody Company[] getAll() {
        return companyService.getall();
    }

}
    
