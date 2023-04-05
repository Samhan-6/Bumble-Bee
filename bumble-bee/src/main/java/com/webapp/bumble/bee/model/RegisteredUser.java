package com.webapp.bumble.bee.model;

import java.time.LocalDate;

public class RegisteredUser {
    
    private int userId;
    private String fullName;
    private LocalDate dateOfBirth;
    private String emailAddress;
    private String phoneNumber;
    private String address;
    
    public RegisteredUser(){
        this.userId = 0;
        this.fullName = "";
        this.dateOfBirth = LocalDate.now();
        this.emailAddress = "";
        this.phoneNumber = "";
        this.address = "";
    }

    public RegisteredUser(int userId, String fullName, LocalDate dateOfBirth, String emailAddress, String phoneNumber, String address) {
        this.userId = userId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
