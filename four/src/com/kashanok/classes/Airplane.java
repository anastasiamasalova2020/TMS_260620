package com.kashanok.classes;

public class Airplane {

    public int capacity;
    public int maxDistance;
    public double maxWeight;
    public boolean isBombsOnABoard;
    public String type;

    public Airplane(){
        maxWeight = 5.5;
        isBombsOnABoard = false;
        maxDistance = 1000;
    }

    public Airplane(int capacity, double maxWeight) {
        this();
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    public Airplane(int capacity, int maxDistance, double maxWeight, boolean isBombsOnABoard, String type) {
        this.capacity = capacity;
        this.maxDistance = maxDistance;
        this.maxWeight = maxWeight;
        this.isBombsOnABoard = isBombsOnABoard;
        this.type = type;
    }





    public void setCapacity(int newCapacity) {
        capacity = newCapacity;
    }












    @Override
    public String toString() {
        return "Airplane{" +
                "capacity=" + capacity +
                ", maxDistance=" + maxDistance +
                ", maxWeight=" + maxWeight +
                ", isBombsOnABoard=" + isBombsOnABoard +
                ", type='" + type + '\'' +
                '}';
    }
}
