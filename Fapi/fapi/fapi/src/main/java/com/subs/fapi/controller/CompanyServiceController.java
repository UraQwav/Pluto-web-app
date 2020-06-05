package com.subs.fapi.controller;

import java.math.BigDecimal;

import javax.websocket.server.PathParam;

import com.subs.fapi.model.CompanyService;
import com.subs.fapi.services.CompanyServiceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    @ResponseBody CompanyService addCompany(@RequestBody CompanyService companyService){
        return companyServiceService.add(companyService);
    }
    @GetMapping("/getall")
    public @ResponseBody CompanyService[] getAll() {
        return companyServiceService.getall();
    }
    @GetMapping("/getById/{id}")
    public @ResponseBody CompanyService getById(@PathVariable String id) {
        return companyServiceService.getById(id);
    }
}