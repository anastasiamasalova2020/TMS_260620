package com.tms.superthis;

public class Engine {
    private double capacity;
    private FuelType type;

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public FuelType getType() {
        return type;
    }

    public void setType(FuelType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
