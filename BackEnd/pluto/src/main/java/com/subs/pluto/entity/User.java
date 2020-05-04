package com.subs.pluto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="pl_users")
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private Long id;

    @JsonFormat(pattern = "")
    @Column(name="user_email")
    private String email;

    @JsonFormat(pattern = "")
    @Column(name="user_phone")
    private String phone;

    @JsonFormat(pattern = "")
    @Column(name="user_password")
    private String password;

    @JsonFormat(pattern = "")
    @Column(name="user_first_name")
    private String firstName;

    @JsonFormat(pattern = "")
    @Column(name="user_last_name")
    private String lastName;

    @JsonFormat(pattern = "")
    @Column(name="user_gender")
    private String gender;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    @Column(name="user_date_of_birthday")
    private Date dateOfBirthday;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    @Column(name="user_registration_date")
    private Date registrationDate;

    @JsonFormat(pattern = "")
    @Column(name="user_image_path", columnDefinition = "varchar2(255) default 'http://localhost:8080' ")
    private String imagePath = "http://localhost:8080";

    @ManyToOne
    @JsonFormat(pattern = "")
    @JoinColumn(name = "user_type_id", columnDefinition = "number(19,0) default 1")
    private UserType userType;

    @OneToMany(mappedBy = "user")
    private List<Subscription> subscription;

    @OneToMany(mappedBy = "user")
    private List<UserCard> usersCards;

    @OneToMany(mappedBy = "user")
    private List<UserNotification> usersNotifications;


    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
