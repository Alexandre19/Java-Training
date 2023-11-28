package com.dojo.polymorphism.domain;

public class Computer extends Product {
    public static final double TAX_PERCENT = 0.21;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("calculating tax from computer");
        return this.value * TAX_PERCENT;
    }


}
