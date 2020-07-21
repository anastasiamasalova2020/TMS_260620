package com.tms.model;

public enum AirplaneType {
    PASSENGER("Passenger", 700),
    WEIGHT_PASSENGER("Weight passengeer", 1300),
    MILITARY("Military", 2500);

    private String description;
    private int defaultCapacity;

    AirplaneType(String description, int defaultCapacity) {
        this.description = description;
        this.defaultCapacity = defaultCapacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDefaultCapacity() {
        return defaultCapacity;
    }

    public void setDefaultCapacity(int defaultCapacity) {
        this.defaultCapacity = defaultCapacity;
    }

    @Override
    public String toString() {
        return "AirplaneType{" +
                "description='" + description + '\'' +
                ", defaultCapacity=" + defaultCapacity +
                '}';
    }
}





