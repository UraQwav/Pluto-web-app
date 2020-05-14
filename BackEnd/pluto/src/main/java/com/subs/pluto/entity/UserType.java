package com.subs.pluto.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name="pl_users_type")
public class UserType {
    @Id
    @GeneratedValue
    @Column(name="user_type_id")
    private BigDecimal id;

    @Column(name="user_type")
    private String type;


    public UserType(){}
    public UserType(BigDecimal userTypeId){
        this.id = userTypeId;
    }


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }
}
