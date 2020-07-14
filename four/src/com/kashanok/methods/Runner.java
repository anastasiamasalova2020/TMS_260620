package com.kashanok.methods;

public class Runner {
    public static void main(String[] args) {

        CustomArraysUtils arraysUtils = new CustomArraysUtils();

        int [] testArray = {1,4,7,3,5,7,7,5,4,6,8,4,3,6,5,3,5,6,4,4,7,7,4,4,6,7,4,5,2,7,8,5,8,7,5};

        System.out.println(arraysUtils.countArrayLength(testArray, "zero"));

    }
}
