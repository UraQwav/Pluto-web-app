package com.subs.pluto.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class PlUsersCards {
    @Id
    @GeneratedValue
    private BigDecimal id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private PlUsers plUsers;

    private String name;

    private String number;

    private Date userCardDateOff;

    private String userCardMoney;
}
