package com.seleniumexpress.ioc;

public class Student {
    private int id;
    private String studentName;

    public Student(int id) {
        this.id = id;
    }

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }

    public void displayStudentInfo() {
        System.out.println("Student name is " + studentName + " and the id is " + id);
    }
}