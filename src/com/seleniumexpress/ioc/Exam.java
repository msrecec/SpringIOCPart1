package com.seleniumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student abhi = context.getBean("student", Student.class);
        abhi.displayStudentInfo();

        Student dilip = context.getBean("dilip", Student.class);
        dilip.displayStudentInfo();

    }
}
