package com.webapp.bumble.bee.model;

import java.time.LocalDate;


public class Customer {
    
    private int customerId;
    private String fullName;
    private LocalDate dateOfBirth;
    private String emailAddress;
    private String phoneNumber;
    private String address;
    private double loanBalance;
    private double usedAmount;
    private String installmentPlan;
    
    public Customer(){
        this.customerId = 0;
        this.fullName = "";
        this.dateOfBirth = LocalDate.now();
        this.emailAddress = "";
        this.phoneNumber = "";
        this.address = "";
        this.loanBalance = 0.0;
        this.usedAmount = 0.0;
        this.installmentPlan = "";
    }

    public Customer(int customerId, String fullName, LocalDate dateOfBirth, String emailAddress, String phoneNumber, String address, double loanBalance, double usedAmount, String installmentPlan) {
        this.customerId = customerId;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.loanBalance = loanBalance;
        this.usedAmount = usedAmount;
        this.installmentPlan = installmentPlan;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public double getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(double loanBalance) {
        this.loanBalance = loanBalance;
    }

    public double getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(double usedAmount) {
        this.usedAmount = usedAmount;
    }

    public String getInstallmentPlan() {
        return installmentPlan;
    }

    public void setInstallmentPlan(String installmentPlan) {
        this.installmentPlan = installmentPlan;
    }
    
    
    
}
