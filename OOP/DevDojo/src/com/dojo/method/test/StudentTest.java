package com.dojo.method.test;

import com.dojo.method.domain.Student;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student();
        Student student01 = new Student();

        student.name = "Alexandre";
        student.age = 19;
        student.sex = 'M';

        student01.name = "Fernanda";
        student01.age = 22;
        student01.sex = 'F';

        student.print();
        student01.print();

//        System.out.println(student.name);
//        System.out.println(student.age);
//        System.out.println(student.sex);
//
//        System.out.println("------------------------");
//
//        System.out.println(student01.name);
//        System.out.println(student01.age);
//        System.out.println(student01.sex);


    }
}
