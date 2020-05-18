package com.subs.pluto.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="pl_users")
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id")
    private BigDecimal id;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    public UserType getUserType() {
        return userType;
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

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Subscription> subscription;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<UserCard> usersCards;

    @JsonIgnore
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
