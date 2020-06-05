package com.subs.pluto.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;

@Entity
public class PlCompanies {
    @Id
    @GeneratedValue
    @JsonFormat(pattern = "")
    private BigDecimal id;

    @JsonFormat(pattern = "")
    private String name;

    @JsonFormat(pattern = "")
    private String legalAddress;

    @JsonFormat(pattern = "")
    private String webSite;

    @JsonFormat(pattern = "")
    private String info;

    @JsonFormat(pattern = "")
    private String email;

    @JsonFormat(pattern = "")
    private String verificationStatus;

    @JsonFormat(pattern = "")
    @Column(name="company_image_path")
    private String imagePath;

    @JsonIgnore
    @OneToMany(mappedBy="plCompanies")
    private List<PlCompanyServices> plCompanyServices;
        public BigDecimal getID() {
        return id;
    }

    public void setID(BigDecimal id) {
        this.id = id;
    }
}
