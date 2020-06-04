package com.application;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Manager manager = new Manager();
        manager.Scanner();

//        List<com.application.Student> collect = manager.getUserList().stream()
//                .filter(s -> s.getTestResult() > 50)
//                .map(u -> new com.application.Student())
//                .collect(Collectors.toList());


    }
}