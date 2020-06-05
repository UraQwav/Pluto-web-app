package com.subs.pluto.controller;
import com.subs.pluto.entity.PlCompanies;
import com.subs.pluto.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @PostMapping("/add")
    PlCompanies addCompany(@RequestBody PlCompanies PLCompanies){
        PLCompanies = companyService.add(PLCompanies);
        return PLCompanies;
    }
    @GetMapping("/getall")
    public Iterable<PlCompanies> getAll(){
        return companyService.getall();
    }
   
}
