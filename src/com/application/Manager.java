package com.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Manager {

//    public  final String USER_LIST_CSV = "UserList.csv";
//    public  final char DELIMITER = ';';
//    List<User> userList;
//
//    public void readFileUser(){
//        userList = new LinkedList<>();
//        BufferedReader reader;
//        try {
//            reader = new BufferedReader(new FileReader(
//                    USER_LIST_CSV));
//            String line = reader.readLine();
//            while (line != null) {
//                line = reader.readLine();
//                createUserFromString(line);
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void createUserFromString(String line) {
//        User user = new User();
//
//        int positionOfDelimiter = line.indexOf(DELIMITER);
//        String name = line.substring(0, positionOfDelimiter);
//        user.getNameAndSurname();
//        String email = line.substring(positionOfDelimiter + 1);
//        user.getEmail();
//
//        userList.add(user);
//    }
public void readFileUser(){
    String csvFile = "UserList.csv";
    String line = "";
    String cvsSplitBy = ";";

    try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

        while ((line = br.readLine()) != null) {

            String[]users = line.split(cvsSplitBy);

            System.out.println( users[0]+ " " + users[1] + " " + users[2]+ " " + users[3]);

        }

    } catch (IOException e) {
        e.printStackTrace();
    }
}


    public void Scanner() {
        String userInput;
        Scanner sn = new Scanner(System.in);

        while (true) {
            System.out.println("\n-- Виберіть одну з доступних дій. --");
            System.out.println("\n* Натисніть '1', щоб вивести список Користувачів.");
            System.out.println("* Натисніть '2', щоб вивести список Студентів.");
            System.out.println("* Натисніть '3', щоб вивести список Менторів.");
            System.out.println("* Натисніть '4', щоб вивести список Груп.");
            System.out.println("* Натисніть '5', щоб вивести список Семінарів.");
            System.out.println("\n-- Введіть ваш вибір і натисніть 'Enter'. --");

            userInput = sn.next();

            switch (userInput) {
                case "1":
                    readFileUser();

                    break;
                case "2":
                    System.out.println("дякую, ви вивели список Студентів.");
                    break;
                case "3":
                    System.out.println("Дякую, ви вивели список список Менторів.");
                    break;
                case "4":
                    System.out.println("Дякую, ви вивели список список Груп.");
                    break;
                case "5":
                    System.out.println("Дякую, ви вивели список список Семінарів.");
                    break;
                default:
                    System.out.println("Вибрана вами дія недоступна, будь ласка виберіть іншу доступну дію:");
            }
        }
    }

    //    public void setEmails(List<User> userList) {
//        this.userList = userList;
//    }
//
//    public List<User> getUserList() {
//        return userList;
//    }
//
//    private List<User> userList; // Список користувачів
//
//
//
//
//

//    public List<com.application.Mentor> mentors() { // Створюємо 2х менторів
//        List<com.application.Mentor> mentorList = new ArrayList<>();
//        mentorList.add(new com.application.Mentor("Mr Dark", "mrdark@gmail.com", "09949898943", "25/11/80", "Java"));
//        mentorList.add(new com.application.Mentor("Mr White", "mrwhite90@gmail.com", "0508766743", "24/10/90", "Python"));
//        return mentorList;
//    }
//
//    public List<JavaSeminar> JavaSeminar() { // список тем для групи Джавістів
//        List<JavaSeminar> javaSeminarList = new ArrayList<>();
//        javaSeminarList.add(new JavaSeminar("Java", "Topic 1", "Learn topic 1", LocalDate.of(2020, 5, 22)));
//        javaSeminarList.add(new JavaSeminar("Java", "Topic 2", "Learn topic 2", LocalDate.of(2020, 5, 25)));
//        javaSeminarList.add(new JavaSeminar("Java", "Topic 3", "Learn topic 3", LocalDate.of(2020, 6, 10)));
//        javaSeminarList.add(new JavaSeminar("Java", "Topic 4", "Learn topic 4", LocalDate.of(2020, 6, 12)));
//        javaSeminarList.add(new JavaSeminar("Java", "Topic 5", "Learn topic 5", LocalDate.of(2020, 6, 22)));
//        return javaSeminarList;
//    }
//
//    public List<PythonSeminar> PythonSeminar() {
//        List<PythonSeminar> pythonSeminarList = new ArrayList<>();
//        pythonSeminarList.add(new PythonSeminar("Python", "Topic 1", "Learn topic 1", LocalDate.of(2020, 5, 22)));
//        pythonSeminarList.add(new PythonSeminar("Python", "Topic 2", "Learn topic 2", LocalDate.of(2020, 5, 22)));
//        pythonSeminarList.add(new PythonSeminar("Python", "Topic 3", "Learn topic 3", LocalDate.of(2020, 5, 22)));
//        pythonSeminarList.add(new PythonSeminar("Python", "Topic 4", "Learn topic 4", LocalDate.of(2020, 5, 22)));
//        pythonSeminarList.add(new PythonSeminar("Python", "Topic 5", "Learn topic 5", LocalDate.of(2020, 5, 22)));
//        return pythonSeminarList;
//    }
//
//
//    public List<com.application.Student> UserToStudent() { //Перетворення "Користувачів" в "Студентів" по принципу, хто набрав на тесті більше 75 балів.
//        List<User> users = users();
//        List<com.application.Student> students = users.stream()
//                .filter(x -> x.getTestResult() > 75)
//                .map(x -> new com.application.Student( //перетворюэ квадратив круги
//                        x.getNameAndSurname(),
//                        x.getEmail(),
//                        x.getPhoneNumber(),
//                        x.getDateOfBirth(),
//                        x.getCourse(),
//                        x.getTestResult()))
//                .collect(Collectors.toList());//перетворює колекцію в щось
//
//        // students.forEach(x -> System.out.println(x.getNameAndSurname()));
//        return students;
//    }
//
//    public List<FirstJavaGroup> createJavaGroup() { //створюємо групу Джава
//        List<com.application.Student> students = UserToStudent();
//        List<FirstJavaGroup> GroupOfJavaStudents = students.stream()
//                .filter(x -> x.getCourse().equals("Java"))
//                .map(x -> new FirstJavaGroup(
//                        x.getNameAndSurname(),
//                        x.getEmail(),
//                        x.getPhoneNumber(),
//                        x.getDateOfBirth(),
//                        x.getCourse(),
//                        x.getTestResult()))
//                .collect(Collectors.toList());
//        //GroupOfJavaStudents.forEach(x -> System.out.println(x.getNameAndSurname()));
//        return GroupOfJavaStudents;
//    }
//
//    public void createPythonGroup() { // створюємо групу Пітон
//        List<com.application.Student> students = UserToStudent();
//        List<FirstPythonGroup> GroupOfPythonStudents = students.stream()
//                .filter(x -> x.getCourse().equals("Python"))
//                .map(x -> new FirstPythonGroup(
//                        x.getNameAndSurname(),
//                        x.getEmail(),
//                        x.getPhoneNumber(),
//                        x.getDateOfBirth(),
//                        x.getCourse(),
//                        x.getTestResult()))
//                .collect(Collectors.toList());
//        //GroupOfPythonStudents.forEach(x -> System.out.println(x.getCourse() + " " + x.getNameAndSurname()));
//    }
//
//    public void checkCurrentDate() {  // Перевіряємо, чи сьогоднішня дата співпадає з датою проведення заняття, якщо співпадає, це означає, що запуститься метод в якому перевіряємо і записуємо відвідуваність студентів
//        ListIterator<JavaSeminar> iterator = JavaSeminar().listIterator();
//        LocalDate todaysDate = LocalDate.now();
//
//        while (iterator.hasNext()) {
//            if (todaysDate.isEqual(iterator.next().getCurrentDate())) {
//                presenceOfStudents();
//            }
//        }
//
//    }
//
//    public void presenceOfStudents() { // перевіряємо і записуємо відвідуваність
//
//    }
}


