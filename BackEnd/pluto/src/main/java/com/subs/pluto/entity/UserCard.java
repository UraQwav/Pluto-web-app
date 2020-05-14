package com.subs.pluto.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="pl_users_cards")
public class UserCard {
    @Id
    @GeneratedValue
    @Column(name="user_card_id")
    private BigDecimal id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name="user_card_name")
    private String name;

    @Column(name="user_card_number")
    private String number;

    @Column(name="user_card_date_off")
    private Date userCardDateOff;

    @Column(name="user_card_money")
    private String userCardMoney;
}
