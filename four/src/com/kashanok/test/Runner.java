package com.kashanok.test;

public class Runner {
    public static void main(String[] args) {
        System.out.println("From Runner");
    }


    public void printClassName() {
        System.out.println(this.getClass().getName());
    }
}
