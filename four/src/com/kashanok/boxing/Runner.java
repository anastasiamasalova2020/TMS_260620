package com.kashanok.boxing;

public class Runner {

    static double baseKoeff;  //0.0
    static Double baseKoeff2; // null
    /*
    * int -> Integer
    * double -> Double
    * char -> Character
    * byte -> Byte
    * long -> Long
    * */

    public static void main(String[] args) {

        long vasyaSalary = 4000;
        Long vasyaPremiya = 1000L; // 1 -> long 1000L 2 -> long 1000L + 4000 3-> Long result;

        Long result = vasyaPremiya + vasyaSalary;
        long result2 = vasyaPremiya + vasyaSalary;

        double vasyaToPayResult = calculateSalary(vasyaSalary, baseKoeff2);

        System.out.println("Васина зарплата: " + vasyaToPayResult);


    }


    private static double calculateSalary(long salary, double koefficient) {
        double result = salary * koefficient;
        return result;
    }

}
