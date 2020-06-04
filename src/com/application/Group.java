package com.application;

import com.application.Student;

abstract class Group  {
    String groupName;
    String courseName;


    public void Group(String groupName, String courseName){
        this.groupName = groupName;
        this.courseName = courseName;
    }
}
