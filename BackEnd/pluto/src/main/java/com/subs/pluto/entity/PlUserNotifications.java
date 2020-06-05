package com.subs.pluto.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class PlUserNotifications {
    @Id
    @GeneratedValue
    private BigDecimal id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private PlUsers plUsers;

    private String text;
}
