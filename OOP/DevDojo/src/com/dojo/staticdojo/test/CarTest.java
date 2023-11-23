package com.dojo.staticdojo.test;

import com.dojo.staticdojo.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car01 = new Car("BMW", 280);
        Car car02 = new Car("Mercedes", 250);
        Car car03 = new Car("Tesla", 220);

        car01.print();
        car02.print();
        car03.print();
    }
}
