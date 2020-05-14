package com.subs.pluto.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="pl_company_services")
public class CompanyService {
    @Id
    @GeneratedValue
    @Column(name="company_service_id")
    private BigDecimal id;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @Column(name="company_service_name")
    private String name;

    @Column(name="company_service_info")
    private String info;

    @Column(name="company_service_image_path")
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "service_price_and_renewal_time_id")
    private ServicePriceAndRenewalTime servicePriceAndRenewalTime;

    @OneToMany(mappedBy="companyService")
    private List<Subscription> subscriptions;
//    @ManyToOne
//    @JoinColumn(name = "Company_ID")
//    private CommentsServices commentsServices
}
