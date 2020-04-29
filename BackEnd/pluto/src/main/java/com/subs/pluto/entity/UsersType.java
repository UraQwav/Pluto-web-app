package com.subs.pluto.entity;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class UsersType {
    @Id
    @GeneratedValue
    private Long userTypeId;
    private String userType;
    @OneToMany(mappedBy="userType")
    private List<Users> users;
    public Long getUserTypeId() { return userTypeId; }
    public void setUserTypeId(Long userTypeId) { this.userTypeId = userTypeId; }
    public String getUserType() { return userType; }
    public void setUserType(String userType) { this.userType = userType; }
    public List<com.subs.pluto.entity.Users> getUsers() { return users; }
    public void setUsers(List<com.subs.pluto.entity.Users> users) { this.users = users; }
}
