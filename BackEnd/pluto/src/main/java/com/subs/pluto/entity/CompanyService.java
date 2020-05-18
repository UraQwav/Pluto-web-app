package com.subs.pluto.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="pl_company_services")
public class CompanyService {
    @Id
    @GeneratedValue
    @JsonFormat(pattern = "")
    @Column(name="company_service_id")
    private BigDecimal id;

    @ManyToOne
    @JsonFormat(pattern = "")
    @JoinColumn(name = "company_id")
    private Company company;

    @JsonFormat(pattern = "")
    @Column(name="company_service_name")
    private String name;

    @JsonFormat(pattern = "")
    @Column(name="company_service_info")
    private String info;

    @JsonFormat(pattern = "")
    @Column(name="company_service_image_path")
    private String imagePath;

    @JsonFormat(pattern = "")
    @ManyToOne
    @JoinColumn(name = "service_price_and_renewal_time_id")
    private ServicePriceAndRenewalTime servicePriceAndRenewalTime;

    @JsonIgnore
    @OneToMany(mappedBy="companyService")
    private List<Subscription> subscriptions;
//    @ManyToOne
//    @JoinColumn(name = "Company_ID")
//    private CommentsServices commentsServices
}
