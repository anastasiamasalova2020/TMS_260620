package com.tms.superthis;

public class Bycicle extends Vehicle{

    private BycicleType type;
    private String ring;

    public Bycicle(String ring) {
        super();
        this.type = BycicleType.CITY;
        this.ring = ring;
    }

    public Bycicle(BycicleType type, String ring, Integer wheels, String brand) {
        super(wheels, brand);
        this.type = type;
        this.ring = ring;
    }

    public BycicleType getType() {
        return type;
    }

    public void setType(BycicleType type) {
        this.type = type;
    }

    public String getRing() {
        return ring;
    }

    public void setRing(String ring) {
        this.ring = ring;
    }

    @Override
    public String toString() {
        return "Bycicle{" +
                "type='" + type + '\'' +
                ", ring=" + ring + ", " +
                super.toString() +
                '}';
    }
}
