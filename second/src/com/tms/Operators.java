package com.tms;

public class Operators {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 3;
//
//        int result = a + b;
//
//        System.out.println(result);
//        a+=b; // a = a + b;
//
//        System.out.println(a);
//
//        a++; // a = a + 1;
//        System.out.println(a);      //9
//
//        System.out.println(a++);    //9
//        System.out.println(a);      //10
//
//        System.out.println(++a);    //11
//        System.out.println(a);      //11
//
//
//        a*=2;
//        System.out.println(a);      //22


//        int c = 100;
//
//        double result = c/3;
//
//        System.out.println(result);
//
//        int result2 = c % 30;
//
//        System.out.println(result2);

//        boolean result = 8 > 7 & 4 < 6;
//        System.out.println(result);
//
//        result &= 8<3;
//
//        System.out.println(result);


        // | - полное ИЛИ
        // || - сокращенное ИЛИ
        // & - полное И
        // && - сокращенное И
        int a = 3;
        int b = 5;

        // Если пользователь мужчина и старше 18ти, предложить пива
        // Если младше 18ти - предложить молока
        // Если женщина - предложить шампанского вне зависимости от возраста
        //
        if(isUserMan("Vasya")) {
            if(isAdult(17)) {
                System.out.println("Бахни пивка, дружище!");
            } else {
                System.out.println("Попей молока.... Ну или кефирчика...");
            }
        } else {
            System.out.println("Может по шампусику?");
        }

        if(a > 5) {
            System.out.println("a > 5");
        } else if(a >= 3) {
            System.out.println("a > 3");
        } else if(a == 1) {
            System.out.println("a == 1");
        } else {
            System.out.println("Чему же равно а? А а = " + a);
        }


        System.out.println(100 % 10000000);








    }

    private static boolean isAdult(int age) {
        System.out.println("inside isAdult ******* 1");
        return age > 18;
    }

    private static boolean isUserMan(String name) {
            System.out.println("inside isUserMan ******* 1");
            return name.equals("Vasya");
        }

        private static boolean method2() {
            System.out.println("inside method2 ******* 2");
            return false;
        }
}
