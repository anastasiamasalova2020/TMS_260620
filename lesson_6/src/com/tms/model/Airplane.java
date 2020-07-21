package com.tms.model;

public class Airplane {

    private int capacity;
    private String name;
    private AirplaneType type;

    public AirplaneType getType() {
        return type;
    }

    public void setType(AirplaneType type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity == 0 ? type.getDefaultCapacity() : capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "capacity=" + getCapacity() +
                ", name='" + name + '\'' +
                '}';
    }
}
