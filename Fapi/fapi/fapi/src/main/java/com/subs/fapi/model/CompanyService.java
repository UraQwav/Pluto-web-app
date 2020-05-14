package com.subs.fapi.model;

import java.math.BigDecimal;
import java.util.List;

public class CompanyService {
    private BigDecimal id;

    private Company company;

    private String name;

    private String info;

    private String imagePath;

    private ServicePriceAndRenewalTime servicePriceAndRenewalTime;

    private List<Subscription> subscriptions;
}
