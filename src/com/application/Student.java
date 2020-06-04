package com.application;

import java.util.GregorianCalendar;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Student{" +
                "course='" + course + '\'' +
                ", ResultTest=" + ResultTest +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getResultTest() == student.getResultTest() &&
                getCourse().equals(student.getCourse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourse(), getResultTest());
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setResultTest(int resultTest) {
        ResultTest = resultTest;
    }
}
