package com.dojo.inheritance.test;

import com.dojo.inheritance.domain.Address;
import com.dojo.inheritance.domain.Employee;
import com.dojo.inheritance.domain.Person;

public class InheritanceTest {
    public static void main(String[] args) {

        Address address = new Address();
        address.setStreet("Street 21");
        address.setZipCode("23456-90");

        Person person = new Person();
        person.setName("Alexandre");
        person.setCpf("56672345");
        person.setAddress(address);
        person.print();
        System.out.println("___________________");

        Employee employee = new Employee();
        employee.setName("Clovis");
        employee.setCpf("678992333");
        employee.setAddress(address);
        employee.setSalary(2500);
        employee.print();
    }
}
