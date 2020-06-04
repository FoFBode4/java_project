package com.application;

import java.util.GregorianCalendar;

public class User {
    private String nameAndSurname;
    private String email;
    private Long phoneNumber;
    private GregorianCalendar dateOfBirth;


    public User(String nameAndSurname, String email, Long phoneNumber, GregorianCalendar dateOfBirth) {
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

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }


}