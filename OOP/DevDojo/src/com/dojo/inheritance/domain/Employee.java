package com.dojo.inheritance.domain;

public class Employee extends Person{

    private double salary;

    public void print(){
        super.print();
        System.out.println(this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
