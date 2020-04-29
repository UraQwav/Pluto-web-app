package com.subs.pluto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class ServicesPriceAndRenewalTime {
    @Id
    @GeneratedValue
    private Long servicePriceAndRenewalTimeId;
    private String price;
    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date renewalTime;
    @OneToMany(mappedBy="servicesPriceAndRenewalTime")
    private List<CompanyServices> companyServices;
    public Long getServicePriceAndRenewalTimeId() {
        return servicePriceAndRenewalTimeId;
    }

    public void setServicePriceAndRenewalTimeId(Long servicePriceAndRenewalTimeId) {
        this.servicePriceAndRenewalTimeId = servicePriceAndRenewalTimeId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getRenewalTime() {
        return renewalTime;
    }

    public void setRenewalTime(Date renewalTime) {
        this.renewalTime = renewalTime;
    }
}
