package com.subs.pluto.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="pl_companies")
public class Company {
    @Id
    @GeneratedValue
    @Column(name="company_id")
    @JsonFormat(pattern = "")
    private BigDecimal id;

    @JsonFormat(pattern = "")
    @Column(name="company_name")
    private String name;

    @JsonFormat(pattern = "")
    @Column(name="company_legal_address")
    private String legalAddress;

    @JsonFormat(pattern = "")
    @Column(name="company_web_site")
    private String webSite;

    @JsonFormat(pattern = "")
    @Column(name="company_info")
    private String info;

    @JsonFormat(pattern = "")
    @Column(name="company_email")
    private String email;

    @JsonFormat(pattern = "")
    @Column(name="company_verification_status")
    private String verificationStatus;

    @JsonFormat(pattern = "")
    @Column(name="company_image_path")
    private String imagePath;

    @JsonIgnore
    @OneToMany(mappedBy="company")
    private List<CompanyService> companyServices;

}
