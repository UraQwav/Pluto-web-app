package com.subs.pluto.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private Long userId;
    private String userEmail;
    private String userPhone;
    private String userPassword;
    private String userFirstName;
    private String userLastName;
    private String userGender;
    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date userDateOfBirthday;
    @JsonFormat(pattern = "yyyy-mm-dd")
    @Temporal(TemporalType.DATE)
    private Date userRegistrationDate;
//    private String userVerificationCode;
    @Column(columnDefinition = "varchar2(255) default 'http://localhost:8080' ")
    private String userImagePath="http://localhost:8080";
    @ManyToOne
    @JoinColumn(name = "USER_TYPE_ID", columnDefinition = "number(19,0) default 1")
    private UsersType userType;
    @OneToMany(mappedBy="users")
    private List<Subscriptions> subscriptions;
    @OneToMany(mappedBy="users")
    private List<UsersCards> usersCards;
    @OneToMany(mappedBy="users")
    private List<UsersNotifications> usersNotifications;
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public UsersType getUserType() {
        return userType;
    }
    public void setUserType(UsersType userType) {
        this.userType = userType;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserPhone() { return userPhone; }
    public void setUserPhone(String userPhone) { this.userPhone = userPhone; }
    public String getUserFirstName() { return userFirstName; }
    public void setFirstName(String userFirstName) { this.userFirstName = userFirstName; }
    public String getUserLastName() { return userLastName; }
    public void setUserLastName(String userLastName) { this.userLastName = userLastName; }
    public Date getDateOfBirthday() { return userDateOfBirthday; }
    public void setDateOfBirthday(Date userDateOfBirthday) { this.userDateOfBirthday = userDateOfBirthday; }
    public Date getRegistrationDate() { return userRegistrationDate; }
    public void setRegistrationDate(Date userRegistrationDate) { this.userRegistrationDate = userRegistrationDate; }
//    public String getVerificationCode() { return userVerificationCode; }
//    public void setVerificationCode(String userVerificationCode) { this.userVerificationCode = userVerificationCode; }
    public String getImagePath() { return userImagePath; }
    public void setUserImagePath(String userImagePath) { this.userImagePath = userImagePath; }
    public String getUserGender() { return userGender; }
    public void setUserGender(String userGender) { this.userGender = userGender; }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Users(){

    }
}
