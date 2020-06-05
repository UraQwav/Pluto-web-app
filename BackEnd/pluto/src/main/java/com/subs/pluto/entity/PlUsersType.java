package com.subs.pluto.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class PlUsersType {
    @Id
    @GeneratedValue
    private BigDecimal id;

    private String type;

    @JsonIgnore
    @OneToMany(mappedBy="plUsersType")
    private List<PlUsers> plUsers;

    public PlUsersType(){}
    public PlUsersType(BigDecimal id){
        this.id = id;
    }


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }
}
