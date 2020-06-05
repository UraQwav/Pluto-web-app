package com.subs.pluto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class PlServicesPriceAndRenewalTime {
    @Id
    @GeneratedValue
    @JsonFormat(pattern = "")
    private BigDecimal id;

    @JsonFormat(pattern = "")
    private String price;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date renewalTime;

    @JsonIgnore
    @OneToMany(mappedBy="plServicePriceAndRenewalTime")
    private List<PlCompanyServices> plCompanyServices;

    public BigDecimal getID() {
        return id;
    }
    public void setID(BigDecimal id) {
        this.id = id;
    }
}
