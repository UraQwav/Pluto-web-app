package com.subs.pluto.entity;

import javax.persistence.*;

@Entity
public class UsersNotifications {
    @Id
    @GeneratedValue
    private Long usersNotificationsId;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private Users users;
    private String userNotificationText;

    public Long getUsersNotificationsId() {
        return usersNotificationsId;
    }

    public void setUsersNotificationsId(Long usersNotificationsId) {
        this.usersNotificationsId = usersNotificationsId;
    }

    public String getUserNotificationText() {
        return userNotificationText;
    }

    public void setUserNotificationText(String userNotificationText) {
        this.userNotificationText = userNotificationText;
    }
}
