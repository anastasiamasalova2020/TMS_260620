package com.tms.inheritance;

public class Animal {

    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public void voice(){
        System.out.println("DEFAULT VOICE");
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
