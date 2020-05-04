package com.subs.pluto.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="pl_users_type")
public class UserType {
    @Id
    @GeneratedValue
    @Column(name="user_type_id")
    private Long id;

    @Column(name="user_type")
    private String type;

    @OneToMany(mappedBy="userType")
    private List<User> user;

    public UserType(){}
    public UserType(Long userTypeId){
        this.id = userTypeId;
    }
}
