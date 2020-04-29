package com.subs.pluto.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class CompanyServices {
    @Id
    @GeneratedValue
    private Long companyServiceId;
    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Companies companies;
    private String companyServiceName;
    private String companyServiceInfo;
    private String companyServiceImagePath;
    @ManyToOne
    @JoinColumn(name = "SERVICE_PRICE_AND_RENEWAL_TIME_ID")
    private ServicesPriceAndRenewalTime servicesPriceAndRenewalTime;
    @OneToMany(mappedBy="companyServices")
    private List<Subscriptions> subscriptions;
//    @ManyToOne
//    @JoinColumn(name = "Company_ID")
//    private CommentsServices commentsServices
    public Long getCompanyServiceId() {
        return companyServiceId;
    }

    public void setCompanyServiceId(Long companyServiceId) {
        this.companyServiceId = companyServiceId;
    }

    public Companies getCompanies() {
        return companies;
    }

    public void setCompanies(Companies companies) {
        this.companies = companies;
    }

    public String getCompanyServiceName() {
        return companyServiceName;
    }

    public void setCompanyServiceName(String companyServiceName) {
        this.companyServiceName = companyServiceName;
    }

    public String getCompanyServiceInfo() {
        return companyServiceInfo;
    }

    public void setCompanyServiceInfo(String companyServiceInfo) {
        this.companyServiceInfo = companyServiceInfo;
    }

    public String getCompanyServiceImagePath() {
        return companyServiceImagePath;
    }

    public void setCompanyServiceImagePath(String companyServiceImagePath) {
        this.companyServiceImagePath = companyServiceImagePath;
    }

    public ServicesPriceAndRenewalTime getServicesPriceAndRenewalTime() {
        return servicesPriceAndRenewalTime;
    }

    public void setServicesPriceAndRenewalTime(ServicesPriceAndRenewalTime servicesPriceAndRenewalTime) {
        this.servicesPriceAndRenewalTime = servicesPriceAndRenewalTime;
    }


}
