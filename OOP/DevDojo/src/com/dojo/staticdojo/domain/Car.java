package com.dojo.staticdojo.domain;

public class Car {

    private String name;
    private double maxSpeed;
    private static double speedLimit = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;

    }

    public void print(){
        System.out.println("------------");
        System.out.println("Name: " + this.name);
        System.out.println("Maximum speed: " + this.maxSpeed);
        System.out.println("Limit speed: " + this.speedLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }
}
