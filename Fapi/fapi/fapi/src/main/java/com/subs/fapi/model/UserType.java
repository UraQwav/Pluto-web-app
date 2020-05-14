package com.subs.fapi.model;

import java.math.BigDecimal;
import java.util.List;

public class UserType {
    public BigDecimal id;
    public String type;
    public UserType(){}
    public UserType(BigDecimal userTypeId){
        this.id = userTypeId;
    }
}
