package com.dojo.exercise.domain;

public class Employee {

    public String name;
    public int age;
    public double[] salarys;


    public void print(){
        System.out.println(this.name);
        System.out.println(this.age);

        for(double salary : salarys) {
            System.out.print(salary + " ");
        }
    }

    public void averageSalarys() {
        double average = 0;
        for (double salary : salarys){
            average += salary;
        }

        average /= salarys.length;
        System.out.println("\naverage wage: " + average);
    }


}
