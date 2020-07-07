package com.tms;

import java.util.Scanner;

public class CharExmple {

    public static void main(String[] args) {
        
//        Scanner sc = new Scanner(System.in);
//
//        int character = sc.nextInt();
//
//        char eq = (char) character;


//        byte b = 5;
//        short s = 5;
//        int i = 5;
//        long l = 5L;
//
//        byte res1 = b;
//        short res2 = b;
//        short res3 = s;
//
//        byte t = (byte) l;
//
//
//
//        float f = 5.0F;
//        double d = 5.0;
//
//
//        char c = 'c';
//        char a = 'a';
//
//        int c1 = c;
//        int a1 = a;
//
//        System.out.println(c);
//        System.out.println(c1);
//        System.out.println(a);
//        System.out.println(a1);
//
//
//
//        String str = "test";
//
//        String str2 = "Моя первая строка в java";


//        String s1 = "test";
//        String s2 = "test";
//
//        String s3 = new String("test");
//
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);
//
//        s1 = "test1";
//
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);


//        String s = new String(new byte[]{97, 98, 99, 100, 101, 102, 103});
//        String s2 = new String("abcdefg");
//        String s3 = s;
//
//        System.out.println(s);
//        System.out.println(s2);
//        System.out.println(s == s2);
//        System.out.println(s == s3);


        //1. Сздает новую строку в heap
        //2. Помещает эту строку в stack
        //3. Говорит переменной, куда ей ссылаться что получения этой строки


//        String s4 = new String("intern string");
//        String s5 = "intern string";
//
//        String s6 = "intern string";
//
//        System.out.println(s4 == s5); //false
//        System.out.println(s4 == s6); //false
//        System.out.println(s5 == s6); //true


        String s4 = new String("intern string");
        String s5 = "intern string";
        String s6 = "intern string";
        String s7 = s4.intern();

        System.out.println(s4 == s5); //false -- ??
        System.out.println(s4 == s6); //false
        System.out.println(s4 == s7); //false
        System.out.println(s5 == s7); //true
        System.out.println(s5 == s6); //true
        System.out.println(s6 == s7); //true

        System.out.println(s4.equals(s5)); //true
        System.out.println(s4.equals(s6)); //true
        System.out.println(s4.equals(s7)); //true
        System.out.println(s5.equals(s6)); //true
        System.out.println(s5.equals(s7)); //true
        System.out.println(s6.equals(s7)); //true


        String str = null;

        System.out.println(str.equals(s5));


        str = "intern string";


    }

}
