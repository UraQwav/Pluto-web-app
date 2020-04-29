package com.subs.pluto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Subscriptions {
    @Id
    @GeneratedValue
    private Long subscriptionsId;
    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date subscriptionBuyingTime;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private Users users;
    @ManyToOne
    @JoinColumn(name = "COMPANY_SERVICE_ID")
    private CompanyServices companyServices;


    public Long getSubscriptionsId() {
        return subscriptionsId;
    }

    public void setSubscriptionsId(Long subscriptionsId) {
        this.subscriptionsId = subscriptionsId;
    }

    public Date getSubscriptionBuyingTime() {
        return subscriptionBuyingTime;
    }

    public void setSubscriptionBuyingTime(Date subscriptionBuyingTime) {
        this.subscriptionBuyingTime = subscriptionBuyingTime;
    }
}
