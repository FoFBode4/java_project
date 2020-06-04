package com.application;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

abstract class Seminar {
    private String seminarName;
    private String topics;
    private String homeTask;
    private LocalDate currentDate;

    public Seminar(String seminarName, String topics, String homeTask, LocalDate currentDate) {
        this.seminarName = seminarName;
        this.topics = topics;
        this.homeTask = homeTask;
        this.currentDate = currentDate;
    }

    public String getSeminarName() {
        return seminarName;
    }

    public String getTopics() {
        return topics;
    }

    public String getHomeTask() {
        return homeTask;
    }


    public LocalDate getCurrentDate() {
        return currentDate;
    }
}
