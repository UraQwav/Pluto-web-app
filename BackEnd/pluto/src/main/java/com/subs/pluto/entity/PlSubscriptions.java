package com.subs.pluto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class PlSubscriptions {
    @Id
    @GeneratedValue
    private BigDecimal id;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date subscriptionBuyingTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private PlUsers plUsers;

    @ManyToOne
    @JoinColumn(name = "company_service_id")
    private PlCompanyServices plCompanyServices;
}
