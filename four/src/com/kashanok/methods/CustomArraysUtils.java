package com.kashanok.methods;

public class CustomArraysUtils {

    // <модификатор доступа (public)> <возвращаемое значение (void)> <имя (setCapacity)> (аргументы метода) {
    //
    //  <тело метода>;
    //
    // }

    int a = 10;

    public String countArrayLength(int[]array, String ... s) {
        int length = array.length;
        String result = "В текущем массиве [" + length + "] элементов";
        if(s.length >= 2) {
            result += " " + s[2];
        }
        for (int i = 0; i < a; i++) {
            System.out.println("test");
        }
        return result;
    }

}
