package com.subs.fapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class User {

    @JsonFormat(pattern = "")
    private BigDecimal id;

    @JsonFormat(pattern = "")
    private String email;

    @JsonFormat(pattern = "")
    private String phone;

    @JsonFormat(pattern = "")
    private String password;

    @JsonFormat(pattern = "")
    private String firstName;

    @JsonFormat(pattern = "")
    private String lastName;

    @JsonFormat(pattern = "")
    private String gender;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateOfBirthday;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date registrationDate;

    @JsonFormat(pattern = "")
    private String imagePath = "http://localhost:8080";


    @JsonFormat(pattern = "")
    private UserType userType;
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
