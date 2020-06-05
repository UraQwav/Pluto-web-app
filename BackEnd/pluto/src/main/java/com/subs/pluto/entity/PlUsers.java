package com.subs.pluto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class PlUsers {
    @Id
    @GeneratedValue
    private BigDecimal userId;

    public BigDecimal getId() {
        return userId;
    }

    public void setId(BigDecimal id) {
        this.userId = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public PlUsersType getPlUsersType() {
        return plUsersType;
    }
//
//    public List<Subscription> getSubscription() {
//        return subscription;
//    }
//
//    public void setSubscription(List<Subscription> subscription) {
//        this.subscription = subscription;
//    }
//
//    public List<UserCard> getUsersCards() {
//        return usersCards;
//    }
//
//    public void setUsersCards(List<UserCard> usersCards) {
//        this.usersCards = usersCards;
//    }

//    public List<UserNotification> getUsersNotifications() {
//        return usersNotifications;
//    }
//
//    public void setUsersNotifications(List<UserNotification> usersNotifications) {
//        this.usersNotifications = usersNotifications;
//    }

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
    @Temporal(TemporalType.DATE)
    private Date dateOfBirthday;

    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    @JsonFormat(pattern = "")
    @Column( columnDefinition = "varchar2(255) default 'http://localhost:8080' ")
    private String imagePath = "http://localhost:8080";

    @ManyToOne
    @JsonFormat(pattern = "")
    @JoinColumn(name = "user_type_id", columnDefinition = "number(19,0) default 1")
    private PlUsersType plUsersType;

    @JsonIgnore
    @OneToMany(mappedBy = "plUsers")
    private List<PlSubscriptions> plSubscriptions;

    @JsonIgnore
    @OneToMany(mappedBy = "plUsers")
    private List<PlUsersCards> usersCards;

    @JsonIgnore
    @OneToMany(mappedBy = "plUsers")
    private List<PlUserNotifications> usersNotifications;


    public void setPlUsersType(PlUsersType plUsersType) {
        this.plUsersType = plUsersType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
