package com.tms.superthis;

import java.util.Arrays;

public class InheritanceRunner {
    public static void main(String[] args) {
//
//
//        Vehicle parent = new Vehicle();
//        System.out.println(parent);
//
//
//        Vehicle parent2 = new Vehicle(10);
//        System.out.println(parent2);
//
//
//        Vehicle parent3 = new Vehicle("Vasya");
//        System.out.println(parent3);
//
//
//        Vehicle parent4 = new Vehicle(7, "Petya");
//        System.out.println(parent4);

        Car mazda = new Car("Red", new Engine(), 4, "MAZDA");
//        System.out.println(mazda);
        Car opel = new Car("Green", new Engine(), 4, "Opel");
//        System.out.println(mazda);
        Car dodge = new Car("Gray", new Engine(), 4, "Dodge");
//        System.out.println(mazda);

        Bycicle bycicle = new Bycicle(BycicleType.MOUNTAIN, "Dzin-Dzin", 2, "KROSS");
//        System.out.println(bycicle);

        Vehicle[] garage = new Vehicle[4];
        garage[0] = mazda;
        garage[1] = opel;
        garage[2] = dodge;
        garage[3] = bycicle;


        for (int i = 0; i < garage.length; i++) {
            System.out.println(garage[i].getBrand());
        }

        for (int i = 0; i < garage.length; i++) {
            if(garage[i] instanceof Car) {
                System.out.println(((Car)garage[i]).getColor());
            }
        }


        Vehicle car = new Car("black", null, 8, "УАЗИК");
        System.out.println(car);

    }
}
