package com.subs.pluto.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Companies {
    @Id
    @GeneratedValue
    private Long companyId;
    private String companyName;
    private String companyLegalAdress;
    private String companyWebSite;
    private String companyInfo;
    private String companyEmail;
    private String companyVerificationStatus;
    @Column(columnDefinition = "varchar2(255) default 'http://localhost:8080' ")
    private String companyImagePath="http://localhost:8080";
    @OneToMany(mappedBy="companies")
    private List<CompanyServices> companyServices;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLegalAdress() {
        return companyLegalAdress;
    }

    public void setCompanyLegalAdress(String companyLegalAdress) {
        this.companyLegalAdress = companyLegalAdress;
    }

    public String getCompanyWebSite() {
        return companyWebSite;
    }

    public void setCompanyWebSite(String companyWebSite) {
        this.companyWebSite = companyWebSite;
    }

    public String getCompanyInfo() {
        return companyInfo;
    }

    public void setCompanyInfo(String companyInfo) {
        this.companyInfo = companyInfo;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getCompanyVerificationStatus() {
        return companyVerificationStatus;
    }

    public void setCompanyVerificationStatus(String companyVerificationStatus) {
        this.companyVerificationStatus = companyVerificationStatus;
    }

    public String getCompanyImagePath() {
        return companyImagePath;
    }

    public void setCompanyImagePath(String companyImagePath) {
        this.companyImagePath = companyImagePath;
    }


}
