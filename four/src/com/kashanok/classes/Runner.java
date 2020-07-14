package com.kashanok.classes;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {

//        Airplane airplane = new Airplane();

//        Airplane myCustomBoeing = new Airplane(750, 12531, 25.2, false, "myCustom boeing super type air jet");

//        Airplane halfFilledPlane = new Airplane(12345, 999.99);






        int [] arr = new int [] {7,3,5,2,12,8,3,6,8,9,4,67,87};


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println();
        Arrays.sort(arr);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }




//        System.out.println("Airplane airplane: " + airplane);
//        System.out.println("**********");
//        System.out.println("Airplane myCustomBoeing: " + myCustomBoeing);
//        System.out.println("**********");
//        System.out.println("Airplane halfFilledPlane: " + halfFilledPlane);


//        myCustomBoeing.setCapacity(1111);
//
//        System.out.println("Airplane myCustomBoeing: " + myCustomBoeing);

    }
}
