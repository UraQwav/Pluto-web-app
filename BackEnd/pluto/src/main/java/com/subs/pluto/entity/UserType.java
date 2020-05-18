package com.subs.pluto.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @JsonIgnore
    @OneToMany(mappedBy="userType")
    private List<User> user;

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
