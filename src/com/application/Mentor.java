package com.application;

import java.util.GregorianCalendar;
import java.util.Objects;

public class Mentor extends com.application.User {
    @Override
    public String toString() {
        return "Mentor{" +
                "course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mentor)) return false;
        Mentor mentor = (Mentor) o;
        return getCourse().equals(mentor.getCourse());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourse());
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    private String course;

    public Mentor(String nameAndSurname, String email, Long phoneNumber, GregorianCalendar dateOfBirth) {
        super(nameAndSurname, email, phoneNumber, dateOfBirth);
    }

}
