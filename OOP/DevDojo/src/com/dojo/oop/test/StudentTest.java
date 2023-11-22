package com.dojo.oop.test;

import com.dojo.oop.domain.Student;

public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student();

        student.age = 19;
        student.sexo = 'M';
        student.nome = "Alexandre";

        System.out.println(student.sexo);
    }
}
