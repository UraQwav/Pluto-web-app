package com.subs.pluto.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class PlCompanyServices {
    @Id
    @GeneratedValue
    @JsonFormat(pattern = "")
    private BigDecimal id;

    @ManyToOne
    @JsonFormat(pattern = "")
    @JoinColumn(name = "company_id")
    private PlCompanies plCompanies;

    @JsonFormat(pattern = "")
    private String name;

    @JsonFormat(pattern = "")
    private String info;

    @JsonFormat(pattern = "")
    private String imagePath;

    @JsonFormat(pattern = "")
    @ManyToOne
    @JoinColumn(name = "service_price_and_renewal_time_id")
    private PlServicesPriceAndRenewalTime plServicePriceAndRenewalTime;

    @JsonIgnore
    @OneToMany(mappedBy="plCompanyServices")
    private List<PlSubscriptions> plSubscriptions;

    public BigDecimal getID() {
        return id;
    }

    public void setID(BigDecimal companyServiceId) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getInfo() {
        return info;
    }

    public void setInfo(String companyServiceInfo) {
        this.info = info;
    }
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    
    public void setCompanyID(BigDecimal id) {
        plCompanies.setID(id);
    }
    
    public void setPriceID(BigDecimal id) {
        plServicePriceAndRenewalTime.setID(id);
    }


//    @ManyToOne
//    @JoinColumn(name = "Company_ID")
//    private CommentsServices commentsServices
}
