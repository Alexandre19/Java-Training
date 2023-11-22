package com.dojo.exercise.test;

import com.dojo.exercise.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.name = "Alexandre";
        employee.age = 19;
        employee.salarys = new double[]{2500, 2700, 2900};

        employee.print();
        employee.averageSalarys();
    }
}
