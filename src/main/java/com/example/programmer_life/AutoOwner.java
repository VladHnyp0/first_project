package com.example.programmer_life;

public class AutoOwner extends Employee{

    int car = 0;

    public AutoOwner() {}

    public AutoOwner(String name, int age, String home, int job, int car) {
        super(name, age, home, job);
        this.car = car;
    }


    public String choice_car() {
        String[] car = new String[5];
        car[0] = "Bicucle \nfuel 0 \nstrangth 30 \nconsumption: 0\n";
        car[1] = "BMW \nfuel: 100 \nstrength: 100 \nconsumption: 6\n";
        car[2] = "Opel \nfuel: 55 \nstrength: 40 \nconsumption: 10\n";
        car[3] = "Volvo \nfuel: 70 \nstrength: 150 \nconsumption: 8\n";
        car[4] = "Banderamobil \nfuel: 100000, \nstrength: 1010000, \nconsumption: -10\n";

        return car[this.car];
    }

    public void auto_owner_say() {
        System.out.println("\nName: " + name + "\nAge: " + age + "\nHome: " + home + "\n-------------------" + "\nJob of " + name + " is: " + choice_job() + "\nCar of " + name + " is: " + choice_car());

    }
    public void get_car(){
        System.out.println("Your car is: " + choice_car());
    }


}
