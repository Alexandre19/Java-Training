package com.dojo.polymorphism.domain;

public class Dvd extends Product{
    public static final double TAX_PERCENT = 0.15;

    public Dvd(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("calculating DVD tax");
        return this.value * TAX_PERCENT;
    }


}
