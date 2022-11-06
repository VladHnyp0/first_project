package com.example.programmer_life;

public class Human {
    String name = "Human";
    int age = 1;
    String home = "None";

    public Human() {}

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Human(String name, int age, String home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public void human_say() {
        System.out.println("\nName: " + name + "\nAge: " + age + "\nHome: " + home + "\nCar: None");
    }




}
