package com.subs.pluto.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class UsersCards {
    @Id
    @GeneratedValue
    private Long userCardId;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private Users users;
    private String userCardName;
    private String userCardNumber;
    private Date userCardDateOff;
    private String userCardMoney;

//    public Users getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Users userId) {
//        this.userId = userId;
//    }

    public String getUserCardName() {
        return userCardName;
    }

    public void setUserCardName(String userCardName) {
        this.userCardName = userCardName;
    }

    public String getUserCardNumber() {
        return userCardNumber;
    }

    public void setUserCardNumber(String userCardNumber) {
        this.userCardNumber = userCardNumber;
    }

    public Date getUserCardDateOff() {
        return userCardDateOff;
    }

    public void setUserCardDateOff(Date userCardDateOff) {
        this.userCardDateOff = userCardDateOff;
    }

    public Long getUserCardId() {
        return userCardId;
    }

    public void setUserCardId(Long userCardId) {
        this.userCardId = userCardId;
    }

    public String getUserCardMoney() {
        return userCardMoney;
    }

    public void setUserCardMoney(String userCardMoney) {
        this.userCardMoney = userCardMoney;
    }
}
