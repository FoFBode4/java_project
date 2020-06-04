package com.application;

import java.util.GregorianCalendar;

public class Mentor extends com.application.User {

private String course;

    public Mentor(String nameAndSurname, String email, Long phoneNumber, GregorianCalendar dateOfBirth) {
        super(nameAndSurname, email, phoneNumber, dateOfBirth);
    }

}
