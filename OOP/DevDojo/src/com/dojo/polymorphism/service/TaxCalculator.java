package com.dojo.polymorphism.service;

import com.dojo.polymorphism.domain.Computer;

public class TaxCalculator {

    public void TaxCalculatorComputer(Computer computer) {
        System.out.println("Computer tax report");
        double tax = computer.calculateTax();
        System.out.println("Computer " + computer.getName());
        System.out.println("Value " + computer.getValue());
        System.out.println("Tax " + tax);
    }

}
