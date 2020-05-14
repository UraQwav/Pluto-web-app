package com.subs.pluto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="pl_subscriptions")
public class Subscription {
    @Id
    @GeneratedValue
    @Column(name="subscription_id")
    private BigDecimal id;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    @Column(name="subscription_buying_time")
    private Date subscriptionBuyingTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "company_service_id")
    private CompanyService companyService;
}
