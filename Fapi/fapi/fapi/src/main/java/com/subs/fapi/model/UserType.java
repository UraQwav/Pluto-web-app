package com.subs.fapi.model;

import java.util.List;

public class UserType {
    private Long id;

    private String type;

    private List<User> user;

    public UserType(){}
    public UserType(Long userTypeId){
        this.id = userTypeId;
    }
}
