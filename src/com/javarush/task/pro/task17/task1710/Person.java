package com.javarush.task.pro.task17.task1710;

/* 
От абстракции к реальности
*/

public class Person {
    private String name;
    private int age;

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public abstract void setAge(int age);
}
