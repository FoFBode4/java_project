package com.application;

import java.util.GregorianCalendar;

public class Student extends com.application.User {
 private String course;
 private int ResultTest;

    public Student(String nameAndSurname, String email, Long phoneNumber, GregorianCalendar dateOfBirth) {
        super(nameAndSurname, email, phoneNumber, dateOfBirth);
    }
    public String getCourse() {
        return course;
    }
    public int getResultTest() {
        return ResultTest;
    }


}
