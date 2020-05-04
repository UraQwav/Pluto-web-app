package com.subs.pluto.entity;

import javax.persistence.*;

@Entity
@Table(name="pl_user_notifications")
public class UserNotification {
    @Id
    @GeneratedValue
    @Column(name="user_notifications_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name="user_notification_text")
    private String text;
}
