package com.tms.superthis;

import java.util.Date;

public class Car extends Vehicle{

    private String color;
    private Engine engine;
    private Date manufactureDate;

    public Car(String color, Engine engine, Integer wheels, String brand) {
        super(wheels, brand);
        this.color = color;
        this.engine = engine;
        this.manufactureDate = new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void signal() {
        System.out.println("Я - " + getBrand());
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", manufactureDate=" + manufactureDate + ", " +
                super.toString() +
                '}';
    }
}
