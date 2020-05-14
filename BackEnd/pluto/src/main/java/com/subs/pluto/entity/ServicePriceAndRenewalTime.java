package com.subs.pluto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="pl_services_price_and_renewal_time")
public class ServicePriceAndRenewalTime {
    @Id
    @GeneratedValue
    @Column(name="service_price_and_renewal_time_id")
    private BigDecimal id;

    @Column(name="service_price")
    private String price;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    @Column(name="service_renewal_time")
    private Date renewalTime;

    @OneToMany(mappedBy="servicePriceAndRenewalTime")
    private List<CompanyService> companyServices;
}
