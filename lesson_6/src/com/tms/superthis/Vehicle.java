package com.tms.superthis;

public class Vehicle {

    private Integer wheels;
    private String brand;

    public Vehicle() {
        this.wheels = 2;
        this.brand = "undefined";
    }

    public Vehicle(Integer wheels, String brand) {
        this.wheels = wheels;
        this.brand = brand;
    }

    public Integer getWheels() {
        return wheels;
    }

    public void setWheels(Integer wheels) {
        this.wheels = wheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "wheels=" + wheels +
                ", brand='" + brand;
    }
}
