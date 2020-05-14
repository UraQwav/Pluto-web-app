package com.subs.pluto.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="pl_user_notifications")
public class UserNotification {
    @Id
    @GeneratedValue
    @Column(name="user_notifications_id")
    private BigDecimal id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name="user_notification_text")
    private String text;
}
