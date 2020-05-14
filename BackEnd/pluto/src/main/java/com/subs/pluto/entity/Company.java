package com.subs.pluto.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="pl_companies")
public class Company {
    @Id
    @GeneratedValue
    @Column(name="company_id")
    private BigDecimal id;

    @Column(name="company_name")
    private String name;

    @Column(name="company_legal_address")
    private String legalAddress;

    @Column(name="company_web_site")
    private String webSite;

    @Column(name="company_info")
    private String info;

    @Column(name="company_email")
    private String email;

    @Column(name="company_verification_status")
    private String verificationStatus;

    @Column(name="company_image_path")
    private String imagePath;

    @OneToMany(mappedBy="company")
    private List<CompanyService> companyServices;

}
