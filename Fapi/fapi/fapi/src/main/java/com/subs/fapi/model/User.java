package com.subs.fapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class User {

    @JsonFormat(pattern = "")
    private Long id;

    @JsonFormat(pattern = "")
    private String email;

    @JsonFormat(pattern = "")
    private String phone;

    @JsonFormat(pattern = "")
    private String password;

    @JsonFormat(pattern = "")
    private String firstName;

    @JsonFormat(pattern = "")
    private String lastName;

    @JsonFormat(pattern = "")
    private String gender;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date dateOfBirthday;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date registrationDate;

    @JsonFormat(pattern = "")
    private String imagePath = "http://localhost:8080";

    @JsonFormat(pattern = "")
    private UserType userType;

    private List<Subscription> subscription;

    private List<UserCard> usersCards;

    private List<UserNotification> usersNotifications;
}
