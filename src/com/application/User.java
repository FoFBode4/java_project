package com.application;

import java.time.LocalDate;

import java.util.Objects;

public class User {
    private String nameAndSurname;
    private String email;
    private Long phoneNumber;
    private LocalDate dateOfBirth;

    @Override
    public String toString() {
        return "User{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getNameAndSurname().equals(user.getNameAndSurname()) &&
                getEmail().equals(user.getEmail()) &&
                getPhoneNumber().equals(user.getPhoneNumber()) &&
                getDateOfBirth().equals(user.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameAndSurname(), getEmail(), getPhoneNumber(), getDateOfBirth());
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public User() {
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }


}