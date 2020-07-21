package com.tms.inheritance;

public class Cat extends Animal {

    private String name;

    public Cat(int age, String name) {
        super(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Meowwww");
    }

    public void jump(){
        System.out.println("Jumping");
    }
    public void jump(String barrier){
        System.out.println("Jumping over " + barrier);
    }
    public void jump(String barrier, int count){
        System.out.println("Jumping over " + barrier + " " + count + " times");
        voice();
    }
}
